package n4;

import ai.w1;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.k0;
import com.google.android.datatransport.cct.CctBackendFactory;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import ii.h1;
import ii.i1;
import ii.l0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.i5;
import v7.u7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class y implements OnCompleteListener, ce.b, ea.a, g6.n, h1, c3.i, f6, ro0 {
    public Object a;
    public Object b;

    public y(Context context, int i10) {
        switch (i10) {
            case 26:
                n6.l.h(context);
                Resources resources = context.getResources();
                this.a = resources;
                this.b = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
                break;
            default:
                this.a = context;
                break;
        }
    }

    public static void J(Bundle bundle) {
        if (bundle != null) {
            ClassLoader classLoader = y.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
        }
    }

    public static String c0(y yVar) {
        Collection<String> collection = (Collection) yVar.b;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) yVar.a;
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

    public static boolean g(Editable editable, KeyEvent keyEvent, boolean z10) {
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

    public void A(androidx.fragment.app.s f7, Bundle bundle, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.a).y;
        if (sVar != null) {
            sVar.p().o.A(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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

    @Override // ea.a
    public StackTraceElement[] C(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ea.a[] aVarArr = (ea.a[]) this.a;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            ea.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.C(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((rb.a) this.b).C(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // ii.h1
    public void D(i1 i1Var, int i10, int i11) {
        r9 B;
        ii.k0 k0Var = (ii.k0) this.a;
        if (((l0) this.b).d || i10 == i11 || (B = k0Var.B()) == null) {
            return;
        }
        if (B.y() && B.W == k0Var.I()) {
            return;
        }
        i1Var.post(new ii.i0(this, i1Var, i11, B, k0Var, i10));
    }

    @Override // g6.n
    public void E(String str, long j3, int i10, Object obj, long j10, long j11) {
        int i11;
        g6.m mVar = (g6.m) this.b;
        if (((g6.n) this.a) != null) {
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
            ((g6.n) this.a).E(str, j3, i11, obj, j10, j11);
        }
    }

    public void F(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.a).y;
        if (sVar != null) {
            sVar.p().o.F(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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

    @Override // org.telegram.ui.ActionBar.f6
    public int F0(int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.a;
        int indexOfKey = sparseIntArray.indexOfKey(i10);
        return indexOfKey >= 0 ? sparseIntArray.valueAt(indexOfKey) : j6.w0(null, i10, false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public Paint G(String str) {
        return j6.S0(str);
    }

    public void H(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.a).y;
        if (sVar != null) {
            sVar.p().o.H(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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
        androidx.fragment.app.s sVar = ((k0) this.a).y;
        if (sVar != null) {
            sVar.p().o.I(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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
    public void K(CharSequence charSequence) {
        ((ii.k0) this.a).E(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CctBackendFactory L(String str) {
        Bundle bundle;
        Map map;
        PackageManager packageManager;
        if (((Map) this.b) == null) {
            Context context = (Context) this.a;
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
                    this.b = map;
                }
            }
            bundle = null;
            if (bundle != null) {
            }
            this.b = map;
        }
        String str4 = (String) ((Map) this.b).get(str);
        if (str4 == null) {
            return null;
        }
        try {
            return (CctBackendFactory) Class.forName(str4).asSubclass(CctBackendFactory.class).getDeclaredConstructor(null).newInstance(null);
        } catch (ClassNotFoundException e) {
            Log.w("BackendRegistry", "Class " + str4 + " is not found.", e);
            return null;
        } catch (IllegalAccessException e7) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e7);
            return null;
        } catch (InstantiationException e10) {
            Log.w("BackendRegistry", "Could not instantiate " + str4 + ".", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e11);
            return null;
        } catch (InvocationTargetException e12) {
            Log.w("BackendRegistry", "Could not instantiate ".concat(str4), e12);
            return null;
        }
    }

    public c3.o M(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.b)) {
            if (!((AtomicBoolean) this.b).get()) {
                try {
                    a2 = ((w1) this.a).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.b).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (c3.o) a2.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    public synchronized Map N() {
        try {
            if (((Map) this.b) == null) {
                this.b = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.b;
    }

    public String O(String str) {
        String str2 = (String) this.b;
        Resources resources = (Resources) this.a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public android.support.v4.media.session.l P() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.a).a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 29 ? new android.support.v4.media.session.o(transportControls) : i10 >= 24 ? new android.support.v4.media.session.n(transportControls) : i10 >= 23 ? new android.support.v4.media.session.m(transportControls) : new android.support.v4.media.session.l(transportControls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r6 >= r7) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean Q(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.n nVar) {
        boolean z10;
        if (nVar.c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.b;
            p1.a b10 = nVar.b();
            int a2 = b10.a(8);
            short s10 = a2 != 0 ? ((ByteBuffer) b10.d).getShort(a2 + b10.a) : (short) 0;
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23 || s10 <= i12) {
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
                ThreadLocal threadLocal2 = i0.c.a;
                if (Build.VERSION.SDK_INT >= 23) {
                    z10 = e0.b.n(textPaint, sb3);
                } else {
                    int length = sb3.length();
                    if (length != 1 || !Character.isWhitespace(sb3.charAt(0))) {
                        float measureText = textPaint.measureText("\udfffd");
                        float measureText2 = textPaint.measureText("m");
                        float measureText3 = textPaint.measureText(sb3);
                        float f7 = 0.0f;
                        if (measureText3 != 0.0f) {
                            if (sb3.codePointCount(0, sb3.length()) > 1) {
                                if (measureText3 <= measureText2 * 2.0f) {
                                    int i13 = 0;
                                    while (i13 < length) {
                                        int charCount = Character.charCount(sb3.codePointAt(i13)) + i13;
                                        f7 += textPaint.measureText(sb3, i13, charCount);
                                        i13 = charCount;
                                    }
                                }
                            }
                            if (measureText3 == measureText) {
                                ThreadLocal threadLocal3 = i0.c.a;
                                q0.b bVar = (q0.b) threadLocal3.get();
                                if (bVar == null) {
                                    bVar = new q0.b(new Rect(), new Rect());
                                    threadLocal3.set(bVar);
                                } else {
                                    ((Rect) bVar.a).setEmpty();
                                    ((Rect) bVar.b).setEmpty();
                                }
                                Object obj = bVar.b;
                                Rect rect = (Rect) bVar.a;
                                textPaint.getTextBounds("\udfffd", 0, 2, rect);
                                textPaint.getTextBounds(sb3, 0, length, (Rect) obj);
                                z10 = !rect.equals(obj);
                            }
                        }
                    }
                    z10 = true;
                }
                nVar.c = !z10 ? 2 : 1;
            }
            z10 = false;
            nVar.c = !z10 ? 2 : 1;
        }
        return nVar.c == 2;
    }

    public void R(k.a aVar) {
        oi.f fVar = (oi.f) this.a;
        ((ActionMode.Callback) fVar.a).onDestroyActionMode(fVar.o(aVar));
        g.s sVar = (g.s) this.b;
        if (sVar.E != null) {
            sVar.f.getDecorView().removeCallbacks(sVar.F);
        }
        if (sVar.y != null) {
            r0.l0 l0Var = sVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            r0.l0 a2 = r0.i0.a(sVar.y);
            a2.a(0.0f);
            sVar.G = a2;
            a2.d(new g.j(this, 2));
        }
        sVar.x = null;
        ViewGroup viewGroup = sVar.J;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(viewGroup);
        sVar.y();
    }

    public boolean S(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.s) this.b).J;
        WeakHashMap weakHashMap = r0.i0.a;
        r0.y.c(viewGroup);
        oi.f fVar = (oi.f) this.a;
        ActionMode.Callback callback = (ActionMode.Callback) fVar.a;
        k.e o9 = fVar.o(aVar);
        a0.m mVar = (a0.m) fVar.d;
        Menu menu2 = (Menu) mVar.get(menu);
        if (menu2 == null) {
            menu2 = new l.b0((Context) fVar.b, (l.l) menu);
            mVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(o9, menu2);
    }

    public void T(Exception exc, boolean z10) {
        this.b = null;
        HashSet hashSet = (HashSet) this.a;
        e9.i0 v = e9.i0.v(hashSet);
        hashSet.clear();
        e9.g0 listIterator = v.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            bVar.l(z10 ? 1 : 3, exc);
        }
    }

    @Override // ii.h1
    public void U(Editable editable) {
        ((l0) this.b).i();
        ((ii.k0) this.a).W();
    }

    public void V(n2.b bVar) {
        ((HashSet) this.a).add(bVar);
        if (((n2.b) this.b) != null) {
            return;
        }
        this.b = bVar;
        n2.q m10 = bVar.b.m();
        bVar.x = m10;
        android.support.v4.media.session.f fVar = bVar.r;
        String str = e2.d0.a;
        m10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.t.b.getAndIncrement(), true, SystemClock.elapsedRealtime(), m10)).sendToTarget();
    }

    public void W(androidx.mediarouter.app.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.b).add(rVar)) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        Handler handler = new Handler();
        rVar.f(handler);
        android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.a;
        hVar.a.registerCallback(rVar.a, handler);
        synchronized (hVar.b) {
            if (hVar.e.a() != null) {
                android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                hVar.d.put(rVar, gVar);
                rVar.c = gVar;
                try {
                    hVar.e.a().o(gVar);
                    rVar.e(13, null, null);
                } catch (RemoteException e) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                }
            } else {
                rVar.c = null;
                hVar.c.add(rVar);
            }
        }
    }

    @Override // org.telegram.ui.Components.ro0
    public void X(float f7, boolean z10) {
        ((TextView) this.a).setText("Alpha " + i5.e);
        i5.e = f7;
        ((i5) this.b).b.M();
    }

    @Override // ii.h1
    public /* synthetic */ boolean Y(boolean z10) {
        return false;
    }

    public void Z(p pVar, Handler handler) {
        r rVar = (r) this.a;
        synchronized (rVar.d) {
            rVar.m = pVar;
            rVar.a.setCallback(pVar.b, handler);
            pVar.C(rVar, handler);
        }
    }

    @Override // org.telegram.ui.ActionBar.f6
    public boolean a() {
        return j6.I.q();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void a0(h0 h0Var) {
        r rVar = (r) this.a;
        rVar.g = h0Var;
        synchronized (rVar.d) {
            for (int beginBroadcast = rVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((f) rVar.f.getBroadcastItem(beginBroadcast)).t(h0Var);
                } catch (RemoteException | SecurityException e) {
                    Log.e("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            rVar.f.finishBroadcast();
        }
        MediaSession mediaSession = rVar.a;
        if (h0Var.w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(h0Var.a, h0Var.b, h0Var.d, h0Var.n);
            builder.setBufferedPosition(h0Var.c);
            builder.setActions(h0Var.e);
            builder.setErrorMessage(h0Var.h);
            for (g0 g0Var : h0Var.r) {
                g0Var.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(g0Var.a, g0Var.b, g0Var.c);
                builder2.setExtras(g0Var.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(h0Var.s);
            if (Build.VERSION.SDK_INT >= 22) {
                f0.a(builder, h0Var.v);
            }
            h0Var.w = builder.build();
        }
        mediaSession.setPlaybackState(h0Var.w);
    }

    @Override // c3.i
    public c3.h b(c3.p pVar, long j3) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.v vVar = (e2.v) this.b;
        vVar.G(min);
        pVar.a(0, min, vVar.a);
        int i10 = -1;
        long j10 = -9223372036854775807L;
        int i11 = -1;
        while (vVar.a() >= 4) {
            if (h3.a.a(vVar.b, vVar.a) != 442) {
                vVar.K(1);
            } else {
                vVar.K(4);
                long c10 = j4.x.c(vVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.b0) this.a).b(c10);
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

    public void b0(androidx.mediarouter.app.r rVar) {
        if (rVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (!((Set) this.b).remove(rVar)) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            ((android.support.v4.media.session.h) this.a).b(rVar);
        } finally {
            rVar.f(null);
        }
    }

    @Override // ii.h1
    public void c(i1 i1Var) {
        ((ii.k0) this.a).c(i1Var);
    }

    @Override // c3.i
    public void d() {
        e2.v vVar = (e2.v) this.b;
        byte[] bArr = e2.d0.b;
        vVar.getClass();
        vVar.H(bArr.length, bArr);
    }

    public void e() {
        this.a = null;
        this.b = null;
    }

    @Override // ii.h1
    public boolean f() {
        return ((ii.k0) this.a).N();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int f0(int i10) {
        return F0(i10);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public int g1(int i10) {
        return ((SparseIntArray) this.a).get(i10);
    }

    @Override // org.telegram.ui.Components.ro0
    public /* synthetic */ CharSequence getContentDescription() {
        return null;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ Drawable getDrawable(String str) {
        return null;
    }

    public void h(i2.g gVar) {
        synchronized (gVar) {
        }
        Handler handler = (Handler) this.a;
        if (handler != null) {
            handler.post(new k2.g(this, gVar, 0));
        }
    }

    public void i(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.a).y;
        if (sVar != null) {
            sVar.p().o.i(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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
    public void j(int i10, int i11) {
        ((ii.k0) this.a).Q(i10, i11);
    }

    public void k(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        k0 k0Var = (k0) this.a;
        androidx.fragment.app.v vVar = k0Var.w.b;
        androidx.fragment.app.s sVar = k0Var.y;
        if (sVar != null) {
            sVar.p().o.k(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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

    public void l(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.a).y;
        if (sVar != null) {
            sVar.p().o.l(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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

    @Override // org.telegram.ui.Components.ro0
    public /* synthetic */ int l0() {
        return 0;
    }

    @Override // org.telegram.ui.ActionBar.f6
    public void m(float f7, float f10, int i10, int i11) {
        j6.q(f7, f10, i10, i11);
    }

    @Override // ii.h1
    public void n(i1 i1Var) {
        ((ii.k0) this.a).h();
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ boolean n0() {
        return false;
    }

    public void o(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.a).y;
        if (sVar != null) {
            sVar.p().o.o(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        a9.e eVar = (a9.e) this.a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        synchronized (eVar.f) {
            eVar.e.remove(taskCompletionSource);
        }
    }

    @Override // ii.h1
    public /* synthetic */ boolean p(i1 i1Var) {
        return false;
    }

    public void q(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.a).y;
        if (sVar != null) {
            sVar.p().o.q(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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

    @Override // g6.n
    public void r(String str, long j3, long j10, long j11) {
        g6.n nVar = (g6.n) this.a;
        if (nVar != null) {
            nVar.r(str, j3, j10, j11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (r2.c(r6, r7, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // ce.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object s(ce.c cVar, kd.c cVar2) {
        ce.d dVar;
        int i10;
        y yVar;
        Throwable th2;
        if (cVar2 instanceof ce.d) {
            dVar = (ce.d) cVar2;
            int i11 = dVar.b;
            if ((i11 & TLObject.FLAG_31) != 0) {
                dVar.b = i11 - TLObject.FLAG_31;
                Object obj = dVar.a;
                Object obj2 = jd.a.a;
                i10 = dVar.b;
                if (i10 != 0) {
                    u7.b(obj);
                    ce.b bVar = (ce.b) this.a;
                    dVar.d = this;
                    dVar.e = cVar;
                    dVar.b = 1;
                    obj = ce.o.a(bVar, cVar, dVar);
                    if (obj != obj2) {
                        yVar = this;
                    }
                    return obj2;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u7.b(obj);
                    return gd.i.a;
                }
                cVar = dVar.e;
                yVar = dVar.d;
                u7.b(obj);
                th2 = (Throwable) obj;
                if (th2 != null) {
                    za.w wVar = (za.w) yVar.b;
                    dVar.d = null;
                    dVar.e = null;
                    dVar.b = 2;
                }
                return gd.i.a;
            }
        }
        dVar = new ce.d(this, cVar2);
        Object obj3 = dVar.a;
        Object obj22 = jd.a.a;
        i10 = dVar.b;
        if (i10 != 0) {
        }
        th2 = (Throwable) obj3;
        if (th2 != null) {
        }
        return gd.i.a;
    }

    @Override // ii.h1
    public /* synthetic */ boolean t(i1 i1Var) {
        return false;
    }

    public void u(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.a).y;
        if (sVar != null) {
            sVar.p().o.u(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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

    public void v(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        k0 k0Var = (k0) this.a;
        androidx.fragment.app.v vVar = k0Var.w.b;
        androidx.fragment.app.s sVar = k0Var.y;
        if (sVar != null) {
            sVar.p().o.v(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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

    public void w(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.a).y;
        if (sVar != null) {
            sVar.p().o.w(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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

    @Override // org.telegram.ui.ActionBar.f6
    public ColorFilter x() {
        return j6.v3;
    }

    public void z(androidx.fragment.app.s f7, boolean z10) {
        kotlin.jvm.internal.i.e(f7, "f");
        androidx.fragment.app.s sVar = ((k0) this.a).y;
        if (sVar != null) {
            sVar.p().o.z(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
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

    public /* synthetic */ y(Object obj) {
        this.b = null;
        this.a = obj;
    }

    public /* synthetic */ y(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ y(Object obj, Object obj2, boolean z10) {
        this.a = obj2;
        this.b = obj;
    }

    public y(int i10) {
        switch (i10) {
            case 15:
                this.a = new HashMap();
                break;
            case 25:
                this.a = new HashSet();
                break;
            default:
                this.a = new ConcurrentHashMap(16, 0.75f, 10);
                this.b = new ReferenceQueue();
                break;
        }
    }

    public y(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if (interfaceDescriptor != "android.os.IMessenger" && (interfaceDescriptor == null || !interfaceDescriptor.equals("android.os.IMessenger"))) {
            if (interfaceDescriptor != "com.google.android.gms.iid.IMessengerCompat" && (interfaceDescriptor == null || !interfaceDescriptor.equals("com.google.android.gms.iid.IMessengerCompat"))) {
                Log.w("MessengerIpcClient", "Invalid interface descriptor: ".concat(String.valueOf(interfaceDescriptor)));
                throw new RemoteException();
            }
            this.b = new j6.f(iBinder);
            this.a = null;
            return;
        }
        this.a = new Messenger(iBinder);
        this.b = null;
    }

    public y(Handler handler, k2.j jVar) {
        if (jVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.a = handler;
        this.b = jVar;
    }

    @Override // org.telegram.ui.Components.ro0
    public void B() {
    }

    @Override // ii.h1
    public /* synthetic */ void y() {
    }

    public y(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        if (mediaSessionCompat$Token != null) {
            this.b = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.a = new android.support.v4.media.session.i(context, mediaSessionCompat$Token);
                return;
            } else {
                this.a = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public y(w1 w1Var) {
        this.a = w1Var;
        this.b = new AtomicBoolean(false);
    }

    @Override // org.telegram.ui.ActionBar.f6
    public /* synthetic */ void L0(int i10, int i11) {
    }
}
