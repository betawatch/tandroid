package com.google.firebase.components;

import android.util.Log;
import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$$ExternalSyntheticBackportWithForwarding0;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRuntime;
import com.google.firebase.dynamicloading.ComponentLoader;
import com.google.firebase.events.Publisher;
import com.google.firebase.events.Subscriber;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class ComponentRuntime implements ComponentContainer, ComponentLoader {
    private static final Provider EMPTY_PROVIDER = new Provider() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda0
        @Override // com.google.firebase.inject.Provider
        public final Object get() {
            return Collections.emptySet();
        }
    };
    private final ComponentRegistrarProcessor componentRegistrarProcessor;
    private final Map components;
    private final AtomicReference eagerComponentsInitializedWith;
    private final EventBus eventBus;
    private final Map lazyInstanceMap;
    private final Map lazySetMap;
    private Set processedCoroutineDispatcherInterfaces;
    private final List unprocessedRegistrarProviders;

    public static final class Builder {
        private final Executor defaultExecutor;
        private final List lazyRegistrars = new ArrayList();
        private final List additionalComponents = new ArrayList();
        private ComponentRegistrarProcessor componentRegistrarProcessor = ComponentRegistrarProcessor.NOOP;

        Builder(Executor executor) {
            this.defaultExecutor = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ ComponentRegistrar lambda$addComponentRegistrar$0(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public Builder addComponent(Component component) {
            this.additionalComponents.add(component);
            return this;
        }

        public Builder addComponentRegistrar(final ComponentRegistrar componentRegistrar) {
            this.lazyRegistrars.add(new Provider() { // from class: com.google.firebase.components.ComponentRuntime$Builder$$ExternalSyntheticLambda0
                @Override // com.google.firebase.inject.Provider
                public final Object get() {
                    ComponentRegistrar lambda$addComponentRegistrar$0;
                    lambda$addComponentRegistrar$0 = ComponentRuntime.Builder.lambda$addComponentRegistrar$0(ComponentRegistrar.this);
                    return lambda$addComponentRegistrar$0;
                }
            });
            return this;
        }

        public Builder addLazyComponentRegistrars(Collection collection) {
            this.lazyRegistrars.addAll(collection);
            return this;
        }

        public ComponentRuntime build() {
            return new ComponentRuntime(this.defaultExecutor, this.lazyRegistrars, this.additionalComponents, this.componentRegistrarProcessor);
        }

        public Builder setProcessor(ComponentRegistrarProcessor componentRegistrarProcessor) {
            this.componentRegistrarProcessor = componentRegistrarProcessor;
            return this;
        }
    }

    private ComponentRuntime(Executor executor, Iterable iterable, Collection collection, ComponentRegistrarProcessor componentRegistrarProcessor) {
        this.components = new HashMap();
        this.lazyInstanceMap = new HashMap();
        this.lazySetMap = new HashMap();
        this.processedCoroutineDispatcherInterfaces = new HashSet();
        this.eagerComponentsInitializedWith = new AtomicReference();
        EventBus eventBus = new EventBus(executor);
        this.eventBus = eventBus;
        this.componentRegistrarProcessor = componentRegistrarProcessor;
        ArrayList arrayList = new ArrayList();
        arrayList.add(Component.of(eventBus, EventBus.class, Subscriber.class, Publisher.class));
        arrayList.add(Component.of(this, ComponentLoader.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component != null) {
                arrayList.add(component);
            }
        }
        this.unprocessedRegistrarProviders = iterableToList(iterable);
        discoverComponents(arrayList);
    }

    public static Builder builder(Executor executor) {
        return new Builder(executor);
    }

    private void discoverComponents(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.unprocessedRegistrarProviders.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((Provider) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.componentRegistrarProcessor.processRegistrar(componentRegistrar));
                        it.remove();
                    }
                } catch (InvalidRegistrarException e) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((Component) it2.next()).getProvidedInterfaces().toArray();
                int length = array.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        Object obj = array[i];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.processedCoroutineDispatcherInterfaces.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.processedCoroutineDispatcherInterfaces.add(obj.toString());
                        }
                        i++;
                    }
                }
            }
            if (this.components.isEmpty()) {
                CycleDetector.detect(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.components.keySet());
                arrayList2.addAll(list);
                CycleDetector.detect(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final Component component = (Component) it3.next();
                this.components.put(component, new Lazy(new Provider() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda1
                    @Override // com.google.firebase.inject.Provider
                    public final Object get() {
                        Object lambda$discoverComponents$0;
                        lambda$discoverComponents$0 = ComponentRuntime.this.lambda$discoverComponents$0(component);
                        return lambda$discoverComponents$0;
                    }
                }));
            }
            arrayList.addAll(processInstanceComponents(list));
            arrayList.addAll(processSetComponents());
            processDependencies();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        maybeInitializeEagerComponents();
    }

    private void doInitializeEagerComponents(Map map, boolean z) {
        for (Map.Entry entry : map.entrySet()) {
            Component component = (Component) entry.getKey();
            Provider provider = (Provider) entry.getValue();
            if (component.isAlwaysEager() || (component.isEagerInDefaultApp() && z)) {
                provider.get();
            }
        }
        this.eventBus.enablePublishingAndFlushPending();
    }

    private static List iterableToList(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$discoverComponents$0(Component component) {
        return component.getFactory().create(new RestrictedComponentContainer(component, this));
    }

    private void maybeInitializeEagerComponents() {
        Boolean bool = (Boolean) this.eagerComponentsInitializedWith.get();
        if (bool != null) {
            doInitializeEagerComponents(this.components, bool.booleanValue());
        }
    }

    private void processDependencies() {
        Map map;
        Qualified qualified;
        Provider empty;
        for (Component component : this.components.keySet()) {
            for (Dependency dependency : component.getDependencies()) {
                if (dependency.isSet() && !this.lazySetMap.containsKey(dependency.getInterface())) {
                    map = this.lazySetMap;
                    qualified = dependency.getInterface();
                    empty = LazySet.fromCollection(Collections.emptySet());
                } else if (this.lazyInstanceMap.containsKey(dependency.getInterface())) {
                    continue;
                } else {
                    if (dependency.isRequired()) {
                        throw new MissingDependencyException(String.format("Unsatisfied dependency for component %s: %s", component, dependency.getInterface()));
                    }
                    if (!dependency.isSet()) {
                        map = this.lazyInstanceMap;
                        qualified = dependency.getInterface();
                        empty = OptionalProvider.empty();
                    }
                }
                map.put(qualified, empty);
            }
        }
    }

    private List processInstanceComponents(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Component component = (Component) it.next();
            if (component.isValue()) {
                final Provider provider = (Provider) this.components.get(component);
                for (Qualified qualified : component.getProvidedInterfaces()) {
                    if (this.lazyInstanceMap.containsKey(qualified)) {
                        final OptionalProvider optionalProvider = (OptionalProvider) ((Provider) this.lazyInstanceMap.get(qualified));
                        arrayList.add(new Runnable() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda2
                            @Override // java.lang.Runnable
                            public final void run() {
                                OptionalProvider.this.set(provider);
                            }
                        });
                    } else {
                        this.lazyInstanceMap.put(qualified, provider);
                    }
                }
            }
        }
        return arrayList;
    }

    private List processSetComponents() {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.components.entrySet()) {
            Component component = (Component) entry.getKey();
            if (!component.isValue()) {
                Provider provider = (Provider) entry.getValue();
                for (Qualified qualified : component.getProvidedInterfaces()) {
                    if (!hashMap.containsKey(qualified)) {
                        hashMap.put(qualified, new HashSet());
                    }
                    ((Set) hashMap.get(qualified)).add(provider);
                }
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (this.lazySetMap.containsKey(entry2.getKey())) {
                final LazySet lazySet = (LazySet) this.lazySetMap.get(entry2.getKey());
                for (final Provider provider2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: com.google.firebase.components.ComponentRuntime$$ExternalSyntheticLambda3
                        @Override // java.lang.Runnable
                        public final void run() {
                            LazySet.this.add(provider2);
                        }
                    });
                }
            } else {
                this.lazySetMap.put((Qualified) entry2.getKey(), LazySet.fromCollection((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Object get(Qualified qualified) {
        return ComponentContainer.-CC.$default$get(this, qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Object get(Class cls) {
        Object obj;
        obj = get(Qualified.unqualified(cls));
        return obj;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Deferred getDeferred(Qualified qualified) {
        Provider provider = getProvider(qualified);
        return provider == null ? OptionalProvider.empty() : provider instanceof OptionalProvider ? (OptionalProvider) provider : OptionalProvider.of(provider);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Deferred getDeferred(Class cls) {
        Deferred deferred;
        deferred = getDeferred(Qualified.unqualified(cls));
        return deferred;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized Provider getProvider(Qualified qualified) {
        Preconditions.checkNotNull(qualified, "Null interface requested.");
        return (Provider) this.lazyInstanceMap.get(qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Provider getProvider(Class cls) {
        Provider provider;
        provider = getProvider(Qualified.unqualified(cls));
        return provider;
    }

    public void initializeEagerComponents(boolean z) {
        HashMap hashMap;
        if (AsynchronousMediaCodecBufferEnqueuer$$ExternalSyntheticBackportWithForwarding0.m(this.eagerComponentsInitializedWith, null, Boolean.valueOf(z))) {
            synchronized (this) {
                hashMap = new HashMap(this.components);
            }
            doInitializeEagerComponents(hashMap, z);
        }
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Set setOf(Qualified qualified) {
        return ComponentContainer.-CC.$default$setOf(this, qualified);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Set setOf(Class cls) {
        Set of;
        of = setOf(Qualified.unqualified(cls));
        return of;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public synchronized Provider setOfProvider(Qualified qualified) {
        LazySet lazySet = (LazySet) this.lazySetMap.get(qualified);
        if (lazySet != null) {
            return lazySet;
        }
        return EMPTY_PROVIDER;
    }
}
