package n4;

import ai.w1;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import androidx.fragment.app.k0;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.a1;
import ii.h1;
import ii.i1;
import ii.l0;
import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Cells.o9;
import p4.t0;
import r0.i0;
import v7.k8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public class x implements OnCompleteListener, com.google.android.gms.internal.clearcut.g, ea.a, f6.a, g6.n, h1, c3.i, me.f {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ x(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static void Q(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = x.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static String d0(x xVar) {
        Collection<String> collection = (Collection) xVar.c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) xVar.b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (!upperCase.matches("[A-F0-9]+")) {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
            sb2.append("/");
            sb2.append(upperCase);
        }
        if (collection != null) {
            if (collection.isEmpty()) {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
            if (str == null) {
                sb2.append("/");
            }
            sb2.append("/");
            boolean z10 = true;
            for (String str2 : collection) {
                g6.a.b(str2);
                if (!z10) {
                    sb2.append(",");
                }
                if (!g6.a.a.matcher(str2).matches()) {
                    StringBuilder sb3 = new StringBuilder(str2.length());
                    for (int i10 = 0; i10 < str2.length(); i10++) {
                        char charAt = str2.charAt(i10);
                        if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && !((charAt >= '0' && charAt <= '9') || charAt == '_' || charAt == '-' || charAt == '.' || charAt == ':'))) {
                            sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                        } else {
                            sb3.append(charAt);
                        }
                    }
                    str2 = sb3.toString();
                }
                sb2.append(str2);
                z10 = false;
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public static String q(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
    }

    public static boolean v(Editable editable, KeyEvent keyEvent, boolean z10) {
        androidx.emoji2.text.u[] uVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (uVarArr = (androidx.emoji2.text.u[]) editable.getSpans(selectionStart, selectionEnd, androidx.emoji2.text.u.class)) != null && uVarArr.length > 0) {
                for (androidx.emoji2.text.u uVar : uVarArr) {
                    int spanStart = editable.getSpanStart(uVar);
                    int spanEnd = editable.getSpanEnd(uVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        k0 k0Var = (k0) this.b;
        androidx.fragment.app.v vVar = k0Var.w.b;
        androidx.fragment.app.s sVar = k0Var.y;
        if (sVar != null) {
            sVar.p().o.A(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void B(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.b).y;
        if (sVar != null) {
            sVar.p().o.B(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void C(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.b).y;
        if (sVar != null) {
            sVar.p().o.C(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void D(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.b).y;
        if (sVar != null) {
            sVar.p().o.D(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ii.h1
    public void E(CharSequence charSequence) {
        ((ii.k0) this.b).A(charSequence);
    }

    public void F(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.b).y;
        if (sVar != null) {
            sVar.p().o.F(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void G(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        k0 k0Var = (k0) this.b;
        androidx.fragment.app.v vVar = k0Var.w.b;
        androidx.fragment.app.s sVar = k0Var.y;
        if (sVar != null) {
            sVar.p().o.G(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void H(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.b).y;
        if (sVar != null) {
            sVar.p().o.H(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void I(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.b).y;
        if (sVar != null) {
            sVar.p().o.I(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void J(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.b).y;
        if (sVar != null) {
            sVar.p().o.J(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public void K(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.b).y;
        if (sVar != null) {
            sVar.p().o.K(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ii.h1
    public void L(Editable editable) {
        ((l0) this.c).i();
        ((ii.k0) this.b).M();
    }

    public void M(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.b).y;
        if (sVar != null) {
            sVar.p().o.M(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // ii.h1
    public /* synthetic */ boolean N(boolean z10) {
        return false;
    }

    public void O(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.b).y;
        if (sVar != null) {
            sVar.p().o.O(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    public byte[] P(n3.a aVar) {
        DataOutputStream dataOutputStream = (DataOutputStream) this.c;
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.b;
        byteArrayOutputStream.reset();
        try {
            dataOutputStream.writeBytes(aVar.a);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeBytes(aVar.b);
            dataOutputStream.writeByte(0);
            dataOutputStream.writeLong(aVar.c);
            dataOutputStream.writeLong(aVar.d);
            dataOutputStream.write(aVar.e);
            dataOutputStream.flush();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory R(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.c) == null) {
            Context context = (Context) this.b;
            try {
                packageManager = context.getPackageManager();
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("BackendRegistry", "Application info not found.");
            }
            if (packageManager == null) {
                Log.w("BackendRegistry", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    Log.w("BackendRegistry", "TransportBackendDiscovery has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                    if (bundle != null) {
                        Log.w("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                        map = Collections.EMPTY_MAP;
                    } else {
                        HashMap hashMap = new HashMap();
                        for (String str2 : bundle.keySet()) {
                            Object obj = bundle.get(str2);
                            if ((obj instanceof String) && str2.startsWith("backend:")) {
                                for (String str3 : ((String) obj).split(",", -1)) {
                                    String trim = str3.trim();
                                    if (!trim.isEmpty()) {
                                        hashMap.put(trim, str2.substring(8));
                                    }
                                }
                            }
                        }
                        map = hashMap;
                    }
                    this.c = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.c = map;
        }
        String str4 = (String) ((Map) this.c).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e7) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e7);
            return null;
        } catch (IllegalAccessException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (InstantiationException e11) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e11);
            return null;
        } catch (NoSuchMethodException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        } catch (InvocationTargetException e13) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e13);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fb.n S(kb.a aVar) {
        String str;
        fb.n fVar;
        Type type = aVar.b;
        Class cls = aVar.a;
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.get(type) != null) {
            throw new ClassCastException();
        }
        if (hashMap.get(cls) != null) {
            throw new ClassCastException();
        }
        fb.n nVar = null;
        fb.n cVar = EnumSet.class.isAssignableFrom(cls) ? new pb.c(type, 18) : cls == EnumMap.class ? new xa.d(type, 17) : null;
        if (cVar != null) {
            return cVar;
        }
        fb.d.f((ArrayList) this.c);
        if (!Modifier.isAbstract(cls.getModifiers())) {
            try {
                Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                k8 k8Var = ib.c.a;
                try {
                    declaredConstructor.setAccessible(true);
                    str = null;
                } catch (Exception e7) {
                    str = "Failed making constructor '" + ib.c.b(declaredConstructor) + "' accessible; either increase its visibility or write a custom InstanceCreator or TypeAdapter for its declaring type: " + e7.getMessage() + ib.c.e(e7);
                }
                fVar = str != null ? new d9.f(str, 1) : new a4.l(declaredConstructor, 15);
            } catch (NoSuchMethodException unused) {
            }
            if (fVar == null) {
                return fVar;
            }
            if (Collection.class.isAssignableFrom(cls)) {
                int i10 = 8;
                nVar = SortedSet.class.isAssignableFrom(cls) ? new na.d(i10) : Set.class.isAssignableFrom(cls) ? new ob.a(i10) : Queue.class.isAssignableFrom(cls) ? new qb.b(i10) : new rb.a(i10);
            } else if (Map.class.isAssignableFrom(cls)) {
                if (ConcurrentNavigableMap.class.isAssignableFrom(cls)) {
                    nVar = new t7.t();
                } else {
                    int i11 = 9;
                    nVar = ConcurrentMap.class.isAssignableFrom(cls) ? new na.d(i11) : SortedMap.class.isAssignableFrom(cls) ? new ob.a(i11) : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(new kb.a(((ParameterizedType) type).getActualTypeArguments()[0]).a)) ? new rb.a(i11) : new qb.b(i11);
                }
            }
            if (nVar != null) {
                return nVar;
            }
            String q6 = q(cls);
            return q6 != null ? new f2.a(q6) : new a6.i(cls, 19);
        }
        fVar = null;
        if (fVar == null) {
        }
    }

    public c3.o T(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.c)) {
            if (!((AtomicBoolean) this.c).get()) {
                try {
                    a2 = ((w1) this.b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.c).set(true);
                } catch (Exception e7) {
                    throw new RuntimeException("Error instantiating extension", e7);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (c3.o) a2.newInstance(objArr);
        } catch (Exception e10) {
            throw new IllegalStateException("Unexpected error creating extractor", e10);
        }
    }

    public synchronized Map U() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.c;
    }

    public android.support.v4.media.session.m V() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.b).a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new android.support.v4.media.session.o(transportControls) : i10 >= 24 ? new android.support.v4.media.session.n(transportControls) : new android.support.v4.media.session.m(transportControls);
    }

    public boolean W(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.n nVar) {
        if (nVar.c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.c;
            p1.a b10 = nVar.b();
            int a2 = b10.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b10.d).getShort(a2 + b10.a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.a;
            String sb3 = sb2.toString();
            int i12 = i0.c.a;
            nVar.c = textPaint.hasGlyph(sb3) ? 2 : 1;
        }
        return nVar.c == 2;
    }

    public void X(k.a aVar) {
        oi.f fVar = (oi.f) this.b;
        ((ActionMode.Callback) fVar.a).onDestroyActionMode(fVar.o(aVar));
        g.r rVar = (g.r) this.c;
        if (rVar.E != null) {
            rVar.f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.y != null) {
            r0.l0 l0Var = rVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            r0.l0 a2 = i0.a(rVar.y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        rVar.x();
    }

    public boolean Y(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.c).J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        oi.f fVar = (oi.f) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.a;
        k.e o9 = fVar.o(aVar);
        a0.m mVar = (a0.m) fVar.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.a0((Context) fVar.b, (l.k) menu);
            mVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(o9, menu2);
    }

    public void Z(androidx.mediarouter.app.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.c).add(rVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        rVar.f(handler);
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.b;
        hVar.a.registerCallback(rVar.a, handler);
        synchronized (hVar.b) {
            if (hVar.e.a() != null) {
                android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                hVar.d.put(rVar, gVar);
                rVar.c = gVar;
                try {
                    hVar.e.a().o(gVar);
                    rVar.e(13, null, null);
                } catch (RemoteException e7) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                }
            } else {
                rVar.c = null;
                hVar.c.add(rVar);
            }
        }
    }

    @Override // me.f
    public void a() {
        ((me.k) this.b).a();
    }

    public void a0(p pVar, Handler handler) {
        r rVar = (r) this.b;
        synchronized (rVar.d) {
            rVar.l = pVar;
            rVar.a.setCallback(pVar.b, handler);
            pVar.C(rVar, handler);
        }
    }

    @Override // c3.i
    public c3.h b(c3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.v vVar = (e2.v) this.c;
        vVar.G(min);
        pVar.a(0, min, vVar.a);
        int i10 = -1;
        int i11 = -1;
        long j10 = -9223372036854775807L;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.b, vVar.a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.x.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.b).b(c10);
                    if (b10 > j3) {
                        return j10 == -9223372036854775807L ? new c3.h(-1, b10, position) : new c3.h(0, -9223372036854775807L, position + i11);
                    }
                    if (b10 + 100000 > j3) {
                        return new c3.h(0, -9223372036854775807L, position + vVar.b);
                    }
                    j10 = b10;
                    i11 = vVar.b;
                }
                int i12 = vVar.c;
                if (vVar.a() >= 10) {
                    vVar.K(9);
                    int x10 = vVar.x() & 7;
                    if (vVar.a() >= x10) {
                        vVar.K(x10);
                        if (vVar.a() >= 4) {
                            if (h3.a.a(vVar.b, vVar.a) == 443) {
                                vVar.K(4);
                                int D = vVar.D();
                                if (vVar.a() < D) {
                                    vVar.J(i12);
                                } else {
                                    vVar.K(D);
                                }
                            }
                            while (true) {
                                if (vVar.a() < 4) {
                                    break;
                                }
                                int a2 = h3.a.a(vVar.b, vVar.a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                vVar.K(4);
                                if (vVar.a() < 2) {
                                    vVar.J(i12);
                                    break;
                                }
                                vVar.J(Math.min(vVar.c, vVar.b + vVar.D()));
                            }
                        } else {
                            vVar.J(i12);
                        }
                    } else {
                        vVar.J(i12);
                    }
                } else {
                    vVar.J(i12);
                }
                i10 = vVar.b;
            }
        }
        return j10 != -9223372036854775807L ? new c3.h(-2, j10, position + i10) : c3.h.d;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void b0(f0 f0Var) {
        r rVar = (r) this.b;
        rVar.g = f0Var;
        synchronized (rVar.d) {
            for (int beginBroadcast = rVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) rVar.f.getBroadcastItem(beginBroadcast)).t(f0Var);
                } catch (RemoteException | SecurityException e7) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e7);
                }
            }
            rVar.f.finishBroadcast();
        }
        MediaSession mediaSession = rVar.a;
        if (f0Var.w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(f0Var.a, f0Var.b, f0Var.d, f0Var.n);
            builder.setBufferedPosition(f0Var.c);
            builder.setActions(f0Var.e);
            builder.setErrorMessage(f0Var.h);
            for (e0 e0Var : f0Var.r) {
                e0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(e0Var.a, e0Var.b, e0Var.c);
                builder2.setExtras(e0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(f0Var.s);
            builder.setExtras(f0Var.v);
            f0Var.w = builder.build();
        }
        mediaSession.setPlaybackState(f0Var.w);
    }

    @Override // ii.h1
    public void c(i1 i1Var) {
        ((ii.k0) this.b).c(i1Var);
    }

    public void c0(androidx.mediarouter.app.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.c).remove(rVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((android.support.v4.media.session.h) this.b).b(rVar);
        } finally {
            rVar.f(null);
        }
    }

    @Override // c3.i
    public void d() {
        e2.v vVar = (e2.v) this.c;
        byte[] bArr = e2.d0.b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    @Override // ii.h1
    public boolean f() {
        return ((ii.k0) this.b).G();
    }

    @Override // me.f
    public boolean g() {
        return false;
    }

    @Override // me.f
    public boolean h(float f7) {
        return false;
    }

    @Override // ii.h1
    public void i(int i10, int i11) {
        ((ii.k0) this.b).I(i10, i11);
    }

    @Override // ii.h1
    public void k(i1 i1Var) {
        ((ii.k0) this.b).g();
    }

    @Override // ea.a
    public StackTraceElement[] l(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ea.a[] aVarArr = (ea.a[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.l(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((rb.a) this.c).l(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // ii.h1
    public /* synthetic */ boolean m(i1 i1Var) {
        return false;
    }

    @Override // g6.n
    public void n(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.b;
        if (nVar != null) {
            nVar.n(str, j3, j10, j11);
        }
    }

    public void o(Object obj, String str) {
        ((ArrayList) this.b).add(a1.g.D(str, "=", String.valueOf(obj)));
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z10;
        d6.b bVar;
        switch (this.a) {
            case 2:
                a9.e eVar = (a9.e) this.b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.c;
                synchronized (eVar.f) {
                    eVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.b;
                d6.b bVar2 = (d6.b) this.c;
                p4.x xVar = rVar.c;
                g6.b bVar3 = com.google.android.gms.internal.cast.r.j;
                if (task.isSuccessful()) {
                    Bundle bundle = (Bundle) task.getResult();
                    boolean z11 = bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                    bVar3.b("The module-to-client output switcher flag %s", true != z11 ? "not existed" : "existed");
                    if (z11) {
                        z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                        Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
                        boolean z12 = !z10 && bVar2.x;
                        if (xVar != null || (bVar = rVar.d) == null) {
                            return;
                        }
                        boolean z13 = bVar.v;
                        boolean z14 = bVar.s;
                        p4.y yVar = new p4.y();
                        int i10 = Build.VERSION.SDK_INT;
                        if (i10 >= 30) {
                            yVar.b = z12;
                        }
                        if (i10 >= 30) {
                            yVar.d = z13;
                        }
                        if (i10 >= 30) {
                            yVar.c = z14;
                        }
                        p4.x.i(new p4.z(yVar));
                        Log.i(bVar3.a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.i), Boolean.valueOf(z12), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                        if (z13) {
                            com.google.android.gms.internal.cast.u uVar = rVar.f;
                            n6.l.h(uVar);
                            com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                            p4.x.b();
                            p4.x.c().f = qVar;
                            d2.a(d1.b0);
                            return;
                        }
                        return;
                    }
                }
                z10 = true;
                Log.i(bVar3.a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.x)));
                if (z10) {
                }
                if (xVar != null) {
                    return;
                } else {
                    return;
                }
        }
    }

    @Override // me.f
    public void p() {
        ((me.k) this.b).c((me.l) this.c);
    }

    @Override // ii.h1
    public /* synthetic */ boolean r(i1 i1Var) {
        return false;
    }

    @Override // f6.a
    public void s(Bitmap bitmap) {
        pf.b bVar = (pf.b) this.b;
        bVar.c = bitmap;
        f6.g gVar = (f6.g) this.c;
        gVar.l = bVar;
        gVar.b();
    }

    public String toString() {
        switch (this.a) {
            case 15:
                return ((HashMap) this.b).toString();
            case 29:
                StringBuilder sb2 = new StringBuilder(100);
                sb2.append(this.c.getClass().getSimpleName());
                sb2.append('{');
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    sb2.append((String) arrayList.get(i10));
                    if (i10 < size - 1) {
                        sb2.append(", ");
                    }
                }
                sb2.append('}');
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public void u() {
        this.b = null;
        this.c = null;
    }

    @Override // g6.n
    public void w(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        g6.m mVar = (g6.m) this.c;
        if (((g6.n) this.b) != null) {
            if (i10 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.i)};
                g6.b bVar = mVar.a;
                Log.w(bVar.a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((e6.h) mVar.h.b).i.iterator();
                while (it.hasNext()) {
                    ((e6.g) it.next()).o();
                }
                i11 = 2001;
            } else {
                i11 = i10;
            }
            ((g6.n) this.b).w(str, j3, i11, obj, j10, j11);
        }
    }

    @Override // ii.h1
    public void x(i1 i1Var, int i10, int i11) {
        o9 y3;
        ii.k0 k0Var = (ii.k0) this.b;
        if (((l0) this.c).d || i10 == i11 || (y3 = k0Var.y()) == null) {
            return;
        }
        if (y3.x() && y3.W == k0Var.C()) {
            return;
        }
        i1Var.post(new ii.i0(this, i1Var, i11, y3, k0Var, i10));
    }

    public void y(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new k2.g(this, gVar, 0));
        }
    }

    public void z(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.b).y;
        if (sVar != null) {
            sVar.p().o.z(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.c).iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            if (!z10) {
                throw null;
            }
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.clearcut.g
    public Object zzp() {
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.c;
        bVar.getClass();
        Map b10 = com.google.android.gms.internal.clearcut.d.e() ? ((Boolean) com.google.android.gms.internal.clearcut.d.c(new c5.i("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue() : false ? bVar.b() : bVar.e;
        if (b10 == null) {
            synchronized (bVar.d) {
                try {
                    HashMap hashMap = bVar.e;
                    b10 = hashMap;
                    if (hashMap == null) {
                        HashMap b11 = bVar.b();
                        bVar.e = b11;
                        b10 = b11;
                    }
                } finally {
                }
            }
        }
        if (b10 == null) {
            b10 = Collections.EMPTY_MAP;
        }
        return (String) b10.get(dVar.b);
    }

    public /* synthetic */ x(int i10, boolean z10) {
        this.a = i10;
    }

    public /* synthetic */ x(Object obj, int i10) {
        this.a = i10;
        this.c = null;
        this.b = obj;
    }

    public /* synthetic */ x(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.b = obj2;
        this.c = obj;
    }

    public x(IBinder iBinder) {
        this.a = 23;
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.c = new j6.f(iBinder);
            this.b = null;
            return;
        }
        this.b = new Messenger(iBinder);
        this.c = null;
    }

    public /* synthetic */ x(Object obj) {
        this.a = 29;
        this.c = obj;
        this.b = new ArrayList();
    }

    public x(k0 k0Var) {
        this.a = 5;
        this.b = k0Var;
        this.c = new CopyOnWriteArrayList();
    }

    public x(ea.a[] aVarArr) {
        this.a = 12;
        this.b = aVarArr;
        this.c = new rb.a(7);
    }

    public x(e2.b0 b0Var) {
        this.a = 22;
        this.b = b0Var;
        this.c = new e2.v();
    }

    @Override // me.f
    public void j() {
    }

    @Override // ii.h1
    public /* synthetic */ void t() {
    }

    public x(int i10) {
        this.a = i10;
        switch (i10) {
            case 28:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.b = byteArrayOutputStream;
                this.c = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    @Override // me.f
    public void e(boolean z10) {
    }

    public x(com.google.firebase.messaging.s sVar, na.d dVar, androidx.emoji2.text.d dVar2) {
        this.a = 4;
        this.b = sVar;
        this.c = dVar2;
    }

    public x(Handler handler, k2.j jVar) {
        this.a = 24;
        if (jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = jVar;
    }

    public x(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.a = 3;
        if (mediaSessionCompat$Token != null) {
            this.c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.b = new android.support.v4.media.session.i(context, mediaSessionCompat$Token);
                return;
            } else {
                this.b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public x(a3.f fVar) {
        this.a = 1;
        this.c = fVar;
    }

    public x(a1 a1Var, int[] iArr) {
        this.a = 13;
        this.b = e9.i0.v(a1Var);
        this.c = iArr;
    }

    public x(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = t0.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        Log.w("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    Log.i("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                this.b = new t(context, str, bundle);
            } else if (i11 >= 28) {
                this.b = new s(context, str, bundle);
            } else {
                this.b = new r(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            a0(new n(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((r) this.b).a.setMediaButtonReceiver(pendingIntent);
            this.c = new m2.t(context, this);
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }

    public x(w1 w1Var) {
        this.a = 6;
        this.b = w1Var;
        this.c = new AtomicBoolean(false);
    }
}
