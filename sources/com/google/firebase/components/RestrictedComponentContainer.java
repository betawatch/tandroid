package com.google.firebase.components;

import com.google.firebase.events.Publisher;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
final class RestrictedComponentContainer implements ComponentContainer {
    private final Set allowedDeferredInterfaces;
    private final Set allowedDirectInterfaces;
    private final Set allowedProviderInterfaces;
    private final Set allowedPublishedEvents;
    private final Set allowedSetDirectInterfaces;
    private final Set allowedSetProviderInterfaces;
    private final ComponentContainer delegateContainer;

    private static class RestrictedPublisher implements Publisher {
        private final Set allowedPublishedEvents;
        private final Publisher delegate;

        public RestrictedPublisher(Set set, Publisher publisher) {
            this.allowedPublishedEvents = set;
            this.delegate = publisher;
        }
    }

    RestrictedComponentContainer(Component component, ComponentContainer componentContainer) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (Dependency dependency : component.getDependencies()) {
            if (dependency.isDirectInjection()) {
                boolean isSet = dependency.isSet();
                Qualified qualified = dependency.getInterface();
                if (isSet) {
                    hashSet4.add(qualified);
                } else {
                    hashSet.add(qualified);
                }
            } else if (dependency.isDeferred()) {
                hashSet3.add(dependency.getInterface());
            } else {
                boolean isSet2 = dependency.isSet();
                Qualified qualified2 = dependency.getInterface();
                if (isSet2) {
                    hashSet5.add(qualified2);
                } else {
                    hashSet2.add(qualified2);
                }
            }
        }
        if (!component.getPublishedEvents().isEmpty()) {
            hashSet.add(Qualified.unqualified(Publisher.class));
        }
        this.allowedDirectInterfaces = Collections.unmodifiableSet(hashSet);
        this.allowedProviderInterfaces = Collections.unmodifiableSet(hashSet2);
        this.allowedDeferredInterfaces = Collections.unmodifiableSet(hashSet3);
        this.allowedSetDirectInterfaces = Collections.unmodifiableSet(hashSet4);
        this.allowedSetProviderInterfaces = Collections.unmodifiableSet(hashSet5);
        this.allowedPublishedEvents = component.getPublishedEvents();
        this.delegateContainer = componentContainer;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Object get(Qualified qualified) {
        if (this.allowedDirectInterfaces.contains(qualified)) {
            return this.delegateContainer.get(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Object get(Class cls) {
        if (!this.allowedDirectInterfaces.contains(Qualified.unqualified(cls))) {
            throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object obj = this.delegateContainer.get(cls);
        return !cls.equals(Publisher.class) ? obj : new RestrictedPublisher(this.allowedPublishedEvents, (Publisher) obj);
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Deferred getDeferred(Qualified qualified) {
        if (this.allowedDeferredInterfaces.contains(qualified)) {
            return this.delegateContainer.getDeferred(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Deferred getDeferred(Class cls) {
        return getDeferred(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider getProvider(Qualified qualified) {
        if (this.allowedProviderInterfaces.contains(qualified)) {
            return this.delegateContainer.getProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider getProvider(Class cls) {
        return getProvider(Qualified.unqualified(cls));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Set setOf(Qualified qualified) {
        if (this.allowedSetDirectInterfaces.contains(qualified)) {
            return this.delegateContainer.setOf(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", qualified));
    }

    @Override // com.google.firebase.components.ComponentContainer
    public /* synthetic */ Set setOf(Class cls) {
        Set of;
        of = setOf(Qualified.unqualified(cls));
        return of;
    }

    @Override // com.google.firebase.components.ComponentContainer
    public Provider setOfProvider(Qualified qualified) {
        if (this.allowedSetProviderInterfaces.contains(qualified)) {
            return this.delegateContainer.setOfProvider(qualified);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", qualified));
    }
}
