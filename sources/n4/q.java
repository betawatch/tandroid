package n4;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.support.v4.media.session.a0;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b2.s0;
import b2.w0;
import bi.a4;
import bi.b4;
import bi.c4;
import bi.d4;
import bi.i4;
import bi.n1;
import bi.q3;
import bi.q6;
import bi.t0;
import bi.t4;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.l0;
import ig.b1;
import ig.c0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j9.y;
import java.lang.ref.ReferenceQueue;
import java.lang.reflect.Constructor;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.b0;
import m.p3;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.z60;
import org.telegram.ui.er0;
import org.telegram.ui.qo0;
import r0.h0;
import r0.k0;
import v7.p8;
import v7.r6;
import v7.t6;
import w7.m9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class q implements OnCompleteListener, b4, d9.k, f6.a, fa.a, g6.n, z3.m, c3.i, b1, e2.d {
    public Object a;
    public Object b;

    public /* synthetic */ q(Object obj) {
        this.a = obj;
        this.b = null;
    }

    public static String I(q qVar) {
        Collection<String> collection = (Collection) qVar.b;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) qVar.a;
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

    public static void f(q qVar, i2.c cVar) {
        qVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) qVar.a).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!i(cVar, list).equals(i((i2.c) qVar.b, list))) {
                throw null;
            }
        }
        qVar.b = cVar;
    }

    public static i2.c i(i2.c cVar, List list) {
        cVar.getClass();
        Map map = cVar.a;
        HashMap hashMap = new HashMap(map);
        HashSet hashSet = new HashSet(list);
        for (String str : map.keySet()) {
            if (!hashSet.contains(str)) {
                hashMap.remove(str);
            }
        }
        return new i2.c(hashMap);
    }

    @Override // bi.b4
    public void A() {
        bi.t tVar = (bi.t) this.b;
        if (tVar.getCurrentItemTop() != tVar.I) {
            tVar.b.L1(tVar, 0);
        }
        tVar.d0();
        bi.t.N(tVar);
    }

    public void B(k.a aVar) {
        xa.n nVar = (xa.n) this.a;
        ((ActionMode.Callback) nVar.a).onDestroyActionMode(nVar.v(aVar));
        g.r rVar = (g.r) this.b;
        if (rVar.E != null) {
            rVar.f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.D != null) {
            k0 k0Var = rVar.G;
            if (k0Var != null) {
                k0Var.b();
            }
            k0 a2 = h0.a(rVar.D);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.y = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = h0.a;
        r0.x.c(viewGroup);
        rVar.y();
    }

    public boolean C(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.b).J;
        WeakHashMap weakHashMap = h0.a;
        r0.x.c(viewGroup);
        xa.n nVar = (xa.n) this.a;
        ActionMode.Callback callback = (ActionMode.Callback) nVar.a;
        k.e v = nVar.v(aVar);
        a0.l lVar = (a0.l) nVar.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new b0((Context) nVar.b, (l.l) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(v, menu2);
    }

    @Override // bi.b4
    public void D(q6 q6Var, String str) {
        bi.t tVar = (bi.t) this.b;
        if (tVar.w == null) {
            p6 p6Var = (p6) this.a;
            tVar.w = new p3(new ag.m(3, this, p6Var), p6Var);
        }
        tVar.w.g(q6Var, str);
    }

    @Override // bi.b4
    public void E(int i10) {
        bi.t tVar = (bi.t) this.b;
        tVar.b.L1(tVar, i10);
        tVar.d0();
        bi.t.N(tVar);
    }

    public void F(android.support.v4.media.session.s sVar, Handler handler) {
        l lVar = (l) this.a;
        synchronized (lVar.d) {
            lVar.l = sVar;
            lVar.a.setCallback((android.support.v4.media.session.r) sVar.e, handler);
            sVar.d0(lVar, handler);
        }
    }

    public void G(int i10) {
        try {
            i8.f fVar = (i8.f) this.a;
            Parcel P0 = fVar.P0();
            P0.writeInt(i10);
            fVar.T0(P0, 16);
        } catch (RemoteException e) {
            throw new ad.d(e);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void H(w wVar) {
        l lVar = (l) this.a;
        lVar.g = wVar;
        synchronized (lVar.d) {
            for (int beginBroadcast = lVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) lVar.f.getBroadcastItem(beginBroadcast)).u(wVar);
                } catch (RemoteException | SecurityException e) {
                    e2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            lVar.f.finishBroadcast();
        }
        MediaSession mediaSession = lVar.a;
        if (wVar.x == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(wVar.a, wVar.b, wVar.d, wVar.n);
            builder.setBufferedPosition(wVar.c);
            builder.setActions(wVar.e);
            builder.setErrorMessage(wVar.h);
            for (v vVar : wVar.r) {
                vVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(vVar.a, vVar.b, vVar.c);
                builder2.setExtras(vVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(wVar.s);
            builder.setExtras(wVar.w);
            wVar.x = builder.build();
        }
        mediaSession.setPlaybackState(wVar.x);
    }

    @Override // bi.b4
    public void N(c4 c4Var, View view) {
        bi.t tVar = (bi.t) this.b;
        z60 z60Var = new z60(tVar, (p6) this.a, view, false, false, true);
        z60Var.Q = true;
        k2 k2Var = tVar.b.W1;
        tVar.getContext();
        tVar.H = t4.b(z60Var, k2Var, c4Var, true);
    }

    @Override // bi.b4
    public void T() {
        i4 i4Var = ((bi.t) this.b).s;
        if (i4Var != null) {
            i4Var.e(false, true);
            int i10 = i4Var.b0;
            i4Var.g(i10 != 2 ? i10 : 0, true);
        }
    }

    @Override // bi.b4
    public z60 U(View view) {
        bi.t tVar = (bi.t) this.b;
        z60 z60Var = new z60(tVar, (p6) this.a, view, false, false, true);
        tVar.H = z60Var;
        return z60Var;
    }

    @Override // bi.b4
    public void Z() {
        bi.t tVar = (bi.t) this.b;
        tVar.a0();
        tVar.b0();
    }

    @Override // e2.d
    public y a(s0 s0Var) {
        y a2 = ((e2.d) this.a).a(s0Var);
        if (a2 == null) {
            return null;
        }
        return p8.c(a2, new c0(this, 25));
    }

    @Override // d9.k
    public Object apply(Object obj) {
        return ((d9.k) ((a4.l) this.a).b).apply(obj);
    }

    @Override // c3.i
    public c3.h b(c3.p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.x xVar = (e2.x) this.b;
        xVar.K(min);
        pVar.b(0, min, xVar.a);
        int i10 = -1;
        int i11 = -1;
        long j11 = -9223372036854775807L;
        while (xVar.a() >= 4) {
            if (h3.a.a(xVar.b, xVar.a) != 442) {
                xVar.O(1);
            } else {
                xVar.O(4);
                long c10 = j4.y.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((e2.k0) this.a).b(c10);
                    if (b10 > j10) {
                        return j11 == -9223372036854775807L ? new c3.h(b10, -1, position) : new c3.h(-9223372036854775807L, 0, position + i11);
                    }
                    if (b10 + 100000 > j10) {
                        return new c3.h(-9223372036854775807L, 0, position + xVar.b);
                    }
                    j11 = b10;
                    i11 = xVar.b;
                }
                int i12 = xVar.c;
                if (xVar.a() >= 10) {
                    xVar.O(9);
                    int A = xVar.A() & 7;
                    if (xVar.a() >= A) {
                        xVar.O(A);
                        if (xVar.a() >= 4) {
                            if (h3.a.a(xVar.b, xVar.a) == 443) {
                                xVar.O(4);
                                int H = xVar.H();
                                if (xVar.a() < H) {
                                    xVar.N(i12);
                                } else {
                                    xVar.O(H);
                                }
                            }
                            while (true) {
                                if (xVar.a() < 4) {
                                    break;
                                }
                                int a2 = h3.a.a(xVar.b, xVar.a);
                                if (a2 == 442 || a2 == 441 || (a2 >>> 8) != 1) {
                                    break;
                                }
                                xVar.O(4);
                                if (xVar.a() < 2) {
                                    xVar.N(i12);
                                    break;
                                }
                                xVar.N(Math.min(xVar.c, xVar.b + xVar.H()));
                            }
                        } else {
                            xVar.N(i12);
                        }
                    } else {
                        xVar.N(i12);
                    }
                } else {
                    xVar.N(i12);
                }
                i10 = xVar.b;
            }
        }
        return j11 != -9223372036854775807L ? new c3.h(j11, -2, position + i10) : c3.h.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // bi.b4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(float f7) {
        boolean z10;
        i4 i4Var = ((bi.t) this.b).s;
        if (i4Var != null) {
            FrameLayout frameLayout = i4Var.H;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f7 >= r4[1]) {
                    z10 = true;
                    i4Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            i4Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    @Override // ig.b1
    public void d() {
        ((qo0) this.a).run();
    }

    @Override // bi.b4
    public void d0(bi.a aVar) {
        bi.t tVar = (bi.t) this.b;
        bi biVar = tVar.b;
        k2 k2Var = biVar.W1;
        if (k2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && i0.J1(k2Var)) {
            bi biVar2 = new bi(tVar.getContext(), biVar.W1, false, false, false, null);
            biVar2.T3 = new kb.a(3);
            biVar2.G1 = true;
            biVar2.r3.setVisibility(8);
            biVar2.q4 = new androidx.car.app.utils.a(tVar, aVar, biVar2, 2);
            biVar2.d1();
            biVar2.show();
        }
    }

    @Override // c3.i
    public void e() {
        e2.x xVar = (e2.x) this.b;
        byte[] bArr = l0.b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    @Override // ig.b1
    public void g() {
        t0 t0Var = ((er0) this.b).G0;
        if (t0Var != null) {
            t0Var.invalidate();
        }
    }

    @Override // bi.b4
    public void h(n1 n1Var, boolean z10) {
        ((bi.t) this.b).b.g1(n1Var, z10);
    }

    @Override // fa.a
    public StackTraceElement[] h0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        fa.a[] aVarArr = (fa.a[]) this.a;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            fa.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.h0(stackTraceElementArr);
        }
        return stackTraceElementArr2.length > 1024 ? ((hb.a) this.b).h0(stackTraceElementArr2) : stackTraceElementArr2;
    }

    @Override // ig.b1
    public void j() {
        er0 er0Var = (er0) this.b;
        if (er0Var.T0) {
            er0Var.T0 = false;
        } else {
            er0Var.c1.b(1);
            er0Var.z((ig.h) ig.h.a.get(0));
        }
    }

    @Override // ig.b1
    public boolean k() {
        er0 er0Var = (er0) this.b;
        boolean z10 = er0Var.B0 == null;
        if (!z10) {
            er0Var.q0(null, true);
        }
        return z10;
    }

    @Override // z3.m
    public /* synthetic */ z3.d l(int i10, int i11, byte[] bArr) {
        return sc.e.a(this, bArr, i11);
    }

    public c3.o m(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.b)) {
            if (!((AtomicBoolean) this.b).get()) {
                try {
                    a2 = ((aa.a) this.a).a();
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

    @Override // ig.b1
    public void n() {
        er0 er0Var = (er0) this.b;
        er0Var.o0.a.B();
        er0Var.U0.setViewHidden(false);
    }

    @Override // z3.m
    public int o() {
        return 1;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        a9.e eVar = (a9.e) this.a;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.b;
        synchronized (eVar.f) {
            eVar.e.remove(taskCompletionSource);
        }
    }

    @Override // bi.b4
    public void onContentChanged() {
        bi.t tVar = (bi.t) this.b;
        i4 i4Var = tVar.s;
        if (i4Var != null) {
            i4Var.setSendLoading(tVar.r.p3());
        }
        tVar.Y(true);
        tVar.b0();
        bi.f fVar = tVar.P;
        i0.r(fVar);
        i0.h3(fVar, 1000L);
    }

    @Override // bi.b4
    public void p(int i10) {
        bi.t.R((bi.t) this.b, 74, i10);
    }

    @Override // f6.a
    public void q(Bitmap bitmap) {
        hf.b bVar = (hf.b) this.a;
        bVar.c = bitmap;
        f6.g gVar = (f6.g) this.b;
        gVar.l = bVar;
        gVar.b();
    }

    @Override // bi.b4
    public void r() {
        bi.t tVar = (bi.t) this.b;
        d4 d4Var = tVar.r;
        i4 i4Var = tVar.s;
        if (i4Var != null) {
            q3 q3Var = d4Var.u3;
            int i10 = (q3Var != null && q3Var.x() && d4Var.F4()) ? 1 : 0;
            if (i4Var.a0 == 2) {
                i4Var.b0 = i10;
            } else {
                i4Var.g(i10, true);
            }
            if (i10 != 0) {
                tVar.Z();
            }
        }
        tVar.c0();
    }

    @Override // g6.n
    public void s(String str, long j10, long j11, long j12) {
        g6.n nVar = (g6.n) this.a;
        if (nVar != null) {
            nVar.s(str, j10, j11, j12);
        }
    }

    @Override // ig.b1
    public void t() {
        er0 er0Var = (er0) this.b;
        if (er0Var.B0 != null) {
            er0Var.q0(null, true);
        }
        er0Var.U0.setViewHidden(true);
    }

    @Override // bi.b4
    public void u() {
        i4 i4Var = ((bi.t) this.b).s;
        if (i4Var != null) {
            int i10 = i4Var.a0;
            if (i10 == 2) {
                i10 = 0;
            }
            i4Var.b0 = i10;
            i4Var.e(false, false);
            i4Var.g(2, true);
        }
    }

    @Override // bi.b4
    public void v(a4 a4Var, View view) {
        bi.t tVar = (bi.t) this.b;
        z60 z60Var = new z60(tVar, (p6) this.a, view, false, false, true);
        z60Var.Q = true;
        tVar.H = t4.c(z60Var, tVar.b.W1, tVar.getContext(), (p6) this.a, a4Var, true);
    }

    @Override // e2.d
    public y w(byte[] bArr) {
        return p8.c(((e2.d) this.a).w(bArr), new c0(this, 25));
    }

    public synchronized Map x() {
        try {
            if (((Map) this.b) == null) {
                this.b = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.a));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.b;
    }

    @Override // g6.n
    public void y(String str, long j10, int i10, Object obj, long j11, long j12) {
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
            ((g6.n) this.a).y(str, j10, i11, obj, j11, j12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03a5, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0116, code lost:
    
        if (")".equals(i4.a.b(r11, r6)) == false) goto L37;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v11, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v34, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v51 */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.util.regex.Matcher] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    @Override // z3.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void z(byte[] bArr, int i10, int i11, z3.l lVar, e2.j jVar) {
        i4.c cVar;
        String str;
        ?? r12;
        String sb2;
        int i12;
        char c10;
        q qVar = this;
        e2.x xVar = (e2.x) qVar.a;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        ArrayList arrayList = new ArrayList();
        try {
            i4.i.d(xVar);
            while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (true) {
                boolean z10 = false;
                int i13 = -1;
                int i14 = 0;
                char c11 = 65535;
                while (true) {
                    ?? r92 = 1;
                    if (c11 == 65535) {
                        i14 = xVar.b;
                        String n10 = xVar.n(StandardCharsets.UTF_8);
                        c11 = n10 == null ? (char) 0 : "STYLE".equals(n10) ? (char) 2 : n10.startsWith("NOTE") ? (char) 1 : (char) 3;
                    } else {
                        xVar.N(i14);
                        if (c11 == 0) {
                            m9.b(new a0(arrayList2), lVar, jVar);
                            return;
                        }
                        if (c11 == 1) {
                            while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
                            }
                        } else {
                            String str2 = null;
                            if (c11 == 2) {
                                if (!arrayList2.isEmpty()) {
                                    throw new IllegalArgumentException("A style block was found after the first cue.");
                                }
                                xVar.n(StandardCharsets.UTF_8);
                                i4.a aVar = (i4.a) qVar.b;
                                e2.x xVar2 = aVar.a;
                                StringBuilder sb3 = aVar.b;
                                sb3.setLength(0);
                                int i15 = xVar.b;
                                while (!TextUtils.isEmpty(xVar.n(StandardCharsets.UTF_8))) {
                                }
                                xVar2.L(xVar.b, xVar.a);
                                xVar2.N(i15);
                                ArrayList arrayList3 = new ArrayList();
                                while (true) {
                                    i4.a.c(xVar2);
                                    if (xVar2.a() >= 5 && "::cue".equals(xVar2.y(5, StandardCharsets.UTF_8))) {
                                        int i16 = xVar2.b;
                                        String b10 = i4.a.b(xVar2, sb3);
                                        if (b10 != null) {
                                            if ("{".equals(b10)) {
                                                xVar2.N(i16);
                                                str = "";
                                            } else if ("(".equals(b10)) {
                                                int i17 = xVar2.b;
                                                int i18 = xVar2.c;
                                                boolean z11 = z10 ? 1 : 0;
                                                while (i17 < i18 && z11 == 0) {
                                                    int i19 = i17 + 1;
                                                    z11 = ((char) xVar2.a[i17]) == ')' ? r92 : z10 ? 1 : 0;
                                                    i17 = i19;
                                                }
                                                str = xVar2.y((i17 - 1) - xVar2.b, StandardCharsets.UTF_8).trim();
                                            } else {
                                                str = str2;
                                            }
                                            if (str == null && "{".equals(i4.a.b(xVar2, sb3))) {
                                                i4.b bVar = new i4.b();
                                                bVar.a = "";
                                                bVar.b = "";
                                                bVar.c = Collections.EMPTY_SET;
                                                bVar.d = "";
                                                bVar.e = str2;
                                                bVar.g = z10;
                                                bVar.i = z10;
                                                bVar.j = i13;
                                                bVar.k = i13;
                                                bVar.l = i13;
                                                bVar.m = i13;
                                                bVar.n = i13;
                                                bVar.p = i13;
                                                bVar.q = z10;
                                                if (!str.isEmpty()) {
                                                    int indexOf = str.indexOf(91);
                                                    if (indexOf != i13) {
                                                        ?? matcher = i4.a.c.matcher(str.substring(indexOf));
                                                        if (matcher.matches()) {
                                                            String group = matcher.group(r92);
                                                            group.getClass();
                                                            bVar.d = group;
                                                        }
                                                        str = str.substring(z10 ? 1 : 0, indexOf);
                                                    }
                                                    String str3 = l0.a;
                                                    String[] split = str.split("\\.", i13);
                                                    String str4 = split[z10 ? 1 : 0];
                                                    int indexOf2 = str4.indexOf(35);
                                                    if (indexOf2 != i13) {
                                                        bVar.b = str4.substring(z10 ? 1 : 0, indexOf2);
                                                        bVar.a = str4.substring(indexOf2 + 1);
                                                    } else {
                                                        bVar.b = str4;
                                                    }
                                                    if (split.length > r92) {
                                                        int length = split.length;
                                                        t6.f(length <= split.length ? r92 : z10 ? 1 : 0);
                                                        bVar.c = new HashSet(Arrays.asList((String[]) Arrays.copyOfRange(split, (int) r92, length)));
                                                    }
                                                }
                                                boolean z12 = z10 ? 1 : 0;
                                                String str5 = str2;
                                                boolean z13 = r92;
                                                while (z12 == 0) {
                                                    int i20 = xVar2.b;
                                                    str5 = i4.a.b(xVar2, sb3);
                                                    boolean z14 = (str5 == null || "}".equals(str5)) ? z13 : z10;
                                                    if (z14 == 0) {
                                                        xVar2.N(i20);
                                                        i4.a.c(xVar2);
                                                        String a2 = i4.a.a(xVar2, sb3);
                                                        if (!a2.isEmpty() && ":".equals(i4.a.b(xVar2, sb3))) {
                                                            i4.a.c(xVar2);
                                                            StringBuilder sb4 = new StringBuilder();
                                                            boolean z15 = false;
                                                            while (true) {
                                                                if (z15) {
                                                                    sb2 = sb4.toString();
                                                                } else {
                                                                    int i21 = xVar2.b;
                                                                    String b11 = i4.a.b(xVar2, sb3);
                                                                    if (b11 == null) {
                                                                        sb2 = null;
                                                                    } else if ("}".equals(b11) || ";".equals(b11)) {
                                                                        xVar2.N(i21);
                                                                        z15 = true;
                                                                    } else {
                                                                        sb4.append(b11);
                                                                    }
                                                                }
                                                            }
                                                            if (sb2 != null && !sb2.isEmpty()) {
                                                                int i22 = xVar2.b;
                                                                String b12 = i4.a.b(xVar2, sb3);
                                                                if (!";".equals(b12)) {
                                                                    if ("}".equals(b12)) {
                                                                        xVar2.N(i22);
                                                                    }
                                                                }
                                                                if ("color".equals(a2)) {
                                                                    i12 = 1;
                                                                    bVar.f = e2.h.a(sb2, true);
                                                                    bVar.g = true;
                                                                } else {
                                                                    i12 = 1;
                                                                    if ("background-color".equals(a2)) {
                                                                        bVar.h = e2.h.a(sb2, true);
                                                                        bVar.i = true;
                                                                    } else {
                                                                        if ("ruby-position".equals(a2)) {
                                                                            if ("over".equals(sb2)) {
                                                                                bVar.p = 1;
                                                                            } else if ("under".equals(sb2)) {
                                                                                bVar.p = 2;
                                                                                r12 = 1;
                                                                                z13 = r12;
                                                                                z12 = z14;
                                                                                z10 = false;
                                                                            }
                                                                        } else if ("text-combine-upright".equals(a2)) {
                                                                            bVar.q = "all".equals(sb2) || sb2.startsWith("digits");
                                                                        } else if ("text-decoration".equals(a2)) {
                                                                            if ("underline".equals(sb2)) {
                                                                                i12 = 1;
                                                                                bVar.k = 1;
                                                                            }
                                                                        } else if ("font-family".equals(a2)) {
                                                                            bVar.e = r6.c(sb2);
                                                                        } else if (!"font-weight".equals(a2)) {
                                                                            i12 = 1;
                                                                            if ("font-style".equals(a2)) {
                                                                                if ("italic".equals(sb2)) {
                                                                                    bVar.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a2)) {
                                                                                ?? matcher2 = i4.a.d.matcher(r6.c(sb2));
                                                                                if (matcher2.matches()) {
                                                                                    String group2 = matcher2.group(2);
                                                                                    group2.getClass();
                                                                                    switch (group2.hashCode()) {
                                                                                        case 37:
                                                                                            if (group2.equals("%")) {
                                                                                                c10 = 0;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3240:
                                                                                            if (group2.equals("em")) {
                                                                                                c10 = 1;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                        case 3592:
                                                                                            if (group2.equals("px")) {
                                                                                                c10 = 2;
                                                                                                break;
                                                                                            }
                                                                                            break;
                                                                                    }
                                                                                    c10 = 65535;
                                                                                    switch (c10) {
                                                                                        case 0:
                                                                                            r12 = 1;
                                                                                            bVar.n = 3;
                                                                                            break;
                                                                                        case 1:
                                                                                            r12 = 1;
                                                                                            bVar.n = 2;
                                                                                            break;
                                                                                        case 2:
                                                                                            r12 = 1;
                                                                                            bVar.n = 1;
                                                                                            break;
                                                                                        default:
                                                                                            throw new IllegalStateException();
                                                                                    }
                                                                                    String group3 = matcher2.group(r12);
                                                                                    group3.getClass();
                                                                                    bVar.o = Float.parseFloat(group3);
                                                                                    z13 = r12;
                                                                                    z12 = z14;
                                                                                    z10 = false;
                                                                                } else {
                                                                                    e2.a.l("WebvttCssParser", "Invalid font-size: '" + sb2 + "'.");
                                                                                }
                                                                            }
                                                                        } else if ("bold".equals(sb2)) {
                                                                            i12 = 1;
                                                                            bVar.l = 1;
                                                                        }
                                                                        z13 = r12;
                                                                        z12 = z14;
                                                                        z10 = false;
                                                                    }
                                                                }
                                                                r12 = i12;
                                                                z13 = r12;
                                                                z12 = z14;
                                                                z10 = false;
                                                            }
                                                            r12 = 1;
                                                            z13 = r12;
                                                            z12 = z14;
                                                            z10 = false;
                                                        }
                                                    }
                                                    r12 = z13;
                                                    z13 = r12;
                                                    z12 = z14;
                                                    z10 = false;
                                                }
                                                boolean z16 = z13;
                                                if ("}".equals(str5)) {
                                                    arrayList3.add(bVar);
                                                }
                                                r92 = z16;
                                                z10 = false;
                                                i13 = -1;
                                                str2 = null;
                                            }
                                        }
                                    }
                                    str = str2;
                                    if (str == null) {
                                    }
                                }
                            } else if (c11 == 3) {
                                Pattern pattern = i4.h.a;
                                Charset charset = StandardCharsets.UTF_8;
                                String n11 = xVar.n(charset);
                                if (n11 == null) {
                                    cVar = null;
                                } else {
                                    Pattern pattern2 = i4.h.a;
                                    Matcher matcher3 = pattern2.matcher(n11);
                                    if (matcher3.matches()) {
                                        cVar = i4.h.d(null, matcher3, xVar, arrayList);
                                    } else {
                                        cVar = null;
                                        String n12 = xVar.n(charset);
                                        if (n12 != null) {
                                            Matcher matcher4 = pattern2.matcher(n12);
                                            if (matcher4.matches()) {
                                                cVar = i4.h.d(n11.trim(), matcher4, xVar, arrayList);
                                            }
                                        }
                                    }
                                }
                                if (cVar != null) {
                                    arrayList2.add(cVar);
                                }
                            }
                            qVar = this;
                        }
                    }
                }
            }
        } catch (w0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public /* synthetic */ q(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ q(Object obj, Object obj2, boolean z10) {
        this.b = obj;
        this.a = obj2;
    }

    public q(IBinder iBinder) {
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

    public q(int i10) {
        switch (i10) {
            case 11:
                this.a = new ConcurrentHashMap(16, 0.75f, 10);
                this.b = new ReferenceQueue();
                break;
            case 19:
                this.a = new HashMap();
                break;
            case 22:
                this.a = new HashMap();
                this.b = i2.c.b;
                break;
            case 23:
                this.a = new e2.x();
                this.b = new i4.a();
                break;
        }
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    public q(Animator animator) {
        this.a = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public q(aa.a aVar) {
        this.a = aVar;
        this.b = new AtomicBoolean(false);
    }
}
