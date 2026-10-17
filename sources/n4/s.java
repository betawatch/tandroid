package n4;

import ab.c0;
import ah.h0;
import ai.s2;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b2.a2;
import b2.r0;
import b2.w0;
import c5.f0;
import c6.e0;
import ci.aa;
import ci.h4;
import ci.q4;
import ci.z9;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.TaskCompletionSource;
import e2.k0;
import e2.m0;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.ReferenceQueue;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ki.c6;
import ki.h1;
import ki.j3;
import ki.j4;
import ki.t1;
import ki.u3;
import ki.v3;
import l.a0;
import m.s3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.ti;
import p4.u0;
import r0.i0;
import r0.l0;
import v7.q8;
import v7.s6;
import v7.u6;
import w7.b9;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class s implements ee.b, f0, com.google.android.gms.common.api.internal.r, d9.k, g6.n, ef.b, z3.m, c3.i, u3, e2.d, n5.b {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public /* synthetic */ s(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    public static void i(s sVar, i2.c cVar) {
        sVar.getClass();
        for (Map.Entry entry : new HashMap((HashMap) sVar.b).entrySet()) {
            if (entry.getKey() != null) {
                throw new ClassCastException();
            }
            List list = (List) entry.getValue();
            if (!k(cVar, list).equals(k((i2.c) sVar.c, list))) {
                throw null;
            }
        }
        sVar.c = cVar;
    }

    public static i2.c k(i2.c cVar, List list) {
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

    public synchronized Map A() {
        try {
            if (((Map) this.c) == null) {
                this.c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.c;
    }

    public void B(k.a aVar) {
        qi.e eVar = (qi.e) this.b;
        ((ActionMode.Callback) eVar.a).onDestroyActionMode(eVar.n(aVar));
        g.r rVar = (g.r) this.c;
        if (rVar.E != null) {
            rVar.f.getDecorView().removeCallbacks(rVar.F);
        }
        if (rVar.y != null) {
            l0 l0Var = rVar.G;
            if (l0Var != null) {
                l0Var.b();
            }
            l0 a2 = i0.a(rVar.y);
            a2.a(0.0f);
            rVar.G = a2;
            a2.d(new g.i(this, 2));
        }
        rVar.x = null;
        ViewGroup viewGroup = rVar.J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        rVar.y();
    }

    @Override // ki.u3
    public i80 C(View view) {
        ki.q qVar = (ki.q) this.c;
        i80 i80Var = new i80(qVar, (d6) this.b, view, false, false, true);
        qVar.H = i80Var;
        return i80Var;
    }

    public boolean D(k.a aVar, Menu menu) {
        ViewGroup viewGroup = ((g.r) this.c).J;
        WeakHashMap weakHashMap = i0.a;
        r0.y.c(viewGroup);
        qi.e eVar = (qi.e) this.b;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.a;
        k.e n10 = eVar.n(aVar);
        a0.l lVar = (a0.l) eVar.d;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) eVar.b, (l.k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onPrepareActionMode(n10, menu2);
    }

    @Override // ki.u3
    public void E() {
        ki.q qVar = (ki.q) this.c;
        qVar.a0();
        qVar.b0();
    }

    public void F(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.b;
        h4 h4Var = (h4) this.c;
        aa aaVar = h4Var.e;
        aa.B1 = f7;
        z9 z9Var = aaVar.z0;
        if (z9Var != null) {
            z9Var.setSpeed(f7);
        }
        q4.a0(h4Var.l, z10);
        if (!z11 || actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() == null) {
            return;
        }
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
    }

    public void G(Object obj) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a3.i0(this, obj, SystemClock.elapsedRealtime(), 0));
        }
    }

    @Override // ki.u3
    public void H(v3 v3Var, View view) {
        ki.q qVar = (ki.q) this.c;
        i80 i80Var = new i80(qVar, (d6) this.b, view, false, false, true);
        i80Var.Q = true;
        n2 n2Var = qVar.b.f0;
        qVar.getContext();
        qVar.H = j4.b(i80Var, n2Var, v3Var, true);
    }

    public void I(l lVar, Handler handler) {
        n nVar = (n) this.b;
        synchronized (nVar.d) {
            nVar.l = lVar;
            nVar.a.setCallback(lVar.b, handler);
            lVar.C(nVar, handler);
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.AbstractCollection, java.util.List] */
    public void J(y yVar) {
        n nVar = (n) this.b;
        nVar.g = yVar;
        synchronized (nVar.d) {
            for (int beginBroadcast = nVar.f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                try {
                    ((b) nVar.f.getBroadcastItem(beginBroadcast)).t(yVar);
                } catch (RemoteException | SecurityException e) {
                    e2.a.d("MediaSessionCompat", "Dead object in setPlaybackState.", e);
                }
            }
            nVar.f.finishBroadcast();
        }
        MediaSession mediaSession = nVar.a;
        if (yVar.w == null) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(yVar.a, yVar.b, yVar.d, yVar.n);
            builder.setBufferedPosition(yVar.c);
            builder.setActions(yVar.e);
            builder.setErrorMessage(yVar.h);
            for (x xVar : yVar.r) {
                xVar.getClass();
                PlaybackState.CustomAction.Builder builder2 = new PlaybackState.CustomAction.Builder(xVar.a, xVar.b, xVar.c);
                builder2.setExtras(xVar.d);
                PlaybackState.CustomAction build = builder2.build();
                if (build != null) {
                    builder.addCustomAction(build);
                }
            }
            builder.setActiveQueueItemId(yVar.s);
            builder.setExtras(yVar.v);
            yVar.w = builder.build();
        }
        mediaSession.setPlaybackState(yVar.w);
    }

    public void K(c5.o oVar) {
        this.b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().d;
            if (str != null) {
                this.c = str;
            }
        }
    }

    public void L(ArrayList arrayList) {
        f2.t tVar;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((f2.s) arrayList.get(i10)).a == 1) {
                try {
                    tVar = new f2.t((f2.s) arrayList.get(i10));
                } catch (f2.r unused) {
                    tVar = null;
                }
                this.c = tVar;
            }
        }
    }

    public void M(a2 a2Var) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a1.f(4, this, a2Var));
        }
    }

    public void N(g3 g3Var) {
        try {
            U(g3Var, (p3) this.b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void O(g3 g3Var, int i10, long j10) {
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.b = p3Var;
            if (j10 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j10);
                p3Var = (p3) o3Var2.a();
            }
            U(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void P(g3 g3Var, long j10, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var = (o3) ((p3) this.b).g();
                o3Var.c();
                p3.r((p3) o3Var.b, j10);
                p3Var = (p3) o3Var.a();
            }
            U(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Q(g3 g3Var, int i10, long j10, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.b).g();
            o3Var.c();
            p3.p((p3) o3Var.b, i10);
            this.b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            com.google.android.gms.internal.play_billing.v3.n((com.google.android.gms.internal.play_billing.v3) t3Var.b, z10);
            f3Var.c();
            g3.r((g3) f3Var.b, (com.google.android.gms.internal.play_billing.v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                p3Var = (p3) this.b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.b, j10);
                p3Var = (p3) o3Var2.a();
            }
            U(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void R(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.p((x3) t10.b, l3Var);
            ((b2.t) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void S(a4 a4Var) {
        try {
            b2.t tVar = (b2.t) this.c;
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.r((x3) t10.b, a4Var);
            tVar.i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void T(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.b);
            t10.c();
            x3.s((x3) t10.b, b4Var);
            ((b2.t) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void U(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.b, g3Var);
            ((b2.t) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void V(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.b, i3Var);
            ((b2.t) this.c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override // z3.m
    public /* synthetic */ z3.d a(int i10, int i11, byte[] bArr) {
        return r.c.a(this, bArr, i11);
    }

    @Override // com.google.android.gms.common.api.internal.r
    public void accept(Object obj, Object obj2) {
        e0 e0Var = (e0) this.b;
        String str = (String) this.c;
        g6.w wVar = (g6.w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        n6.l.j("Not connected to device", e0Var.F == 2);
        g6.f fVar = (g6.f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        fVar.S0(N0, 5);
        synchronized (e0Var.s) {
            try {
                if (e0Var.p != null) {
                    taskCompletionSource.setException(n6.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // d9.k
    public Object apply(Object obj) {
        return ((d9.k) ((ag.b) this.b).b).apply(obj);
    }

    @Override // c3.i
    public c3.h b(c3.p pVar, long j10) {
        long position = pVar.getPosition();
        int min = (int) Math.min(20000L, pVar.getLength() - position);
        e2.x xVar = (e2.x) this.c;
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
                long c10 = j4.x.c(xVar);
                if (c10 != -9223372036854775807L) {
                    long b10 = ((k0) this.b).b(c10);
                    if (b10 > j10) {
                        return j11 == -9223372036854775807L ? new c3.h(-1, b10, position) : new c3.h(0, -9223372036854775807L, position + i11);
                    }
                    if (b10 + 100000 > j10) {
                        return new c3.h(0, -9223372036854775807L, position + xVar.b);
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
        return j11 != -9223372036854775807L ? new c3.h(-2, j11, position + i10) : c3.h.d;
    }

    @Override // z3.m
    public int c() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0023 A[RETURN] */
    @Override // ki.u3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean d(float f7) {
        boolean z10;
        ki.b4 b4Var = ((ki.q) this.c).s;
        if (b4Var != null) {
            FrameLayout frameLayout = b4Var.H;
            if (frameLayout != null) {
                frameLayout.getLocationOnScreen(new int[2]);
                if (f7 >= r4[1]) {
                    z10 = true;
                    b4Var.e(z10, true);
                    if (!z10) {
                        return true;
                    }
                }
            }
            z10 = false;
            b4Var.e(z10, true);
            if (!z10) {
            }
        }
        return false;
    }

    @Override // e2.d
    public j9.y e(r0 r0Var) {
        j9.y e = ((e2.d) this.b).e(r0Var);
        if (e == null) {
            return null;
        }
        return q8.c(e, new j5.b(this, 17));
    }

    @Override // c3.i
    public void f() {
        e2.x xVar = (e2.x) this.c;
        byte[] bArr = m0.b;
        xVar.getClass();
        xVar.L(bArr.length, bArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:195:0x03ae, code lost:
    
        r0.addAll(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x0117, code lost:
    
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
    public void g(byte[] bArr, int i10, int i11, z3.l lVar, e2.j jVar) {
        i4.c cVar;
        String str;
        ?? r12;
        String sb2;
        int i12;
        char c10;
        s sVar = this;
        e2.x xVar = (e2.x) sVar.b;
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
                            b9.b(new androidx.biometric.e(arrayList2), lVar, jVar);
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
                                i4.a aVar = (i4.a) sVar.c;
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
                                                    String str3 = m0.a;
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
                                                        u6.g(length <= split.length ? r92 : z10 ? 1 : 0);
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
                                                                            bVar.e = s6.c(sb2);
                                                                        } else if (!"font-weight".equals(a2)) {
                                                                            i12 = 1;
                                                                            if ("font-style".equals(a2)) {
                                                                                if ("italic".equals(sb2)) {
                                                                                    bVar.m = 1;
                                                                                }
                                                                            } else if ("font-size".equals(a2)) {
                                                                                ?? matcher2 = i4.a.d.matcher(s6.c(sb2));
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
                            sVar = this;
                        }
                    }
                }
            }
        } catch (w0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // hd.a
    public Object get() {
        return new m5.d((Context) ((k0.b) this.b).b, (m.g3) ((t1) this.c).get());
    }

    @Override // ki.u3
    public void h(ki.a aVar) {
        ki.q qVar = (ki.q) this.c;
        ti tiVar = qVar.b;
        n2 n2Var = tiVar.f0;
        if (n2Var != null && aVar != null && (aVar.b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(n2Var)) {
            ti tiVar2 = new ti(qVar.getContext(), tiVar.f0, false, false, false, null);
            tiVar2.c2 = new t7.u(11);
            tiVar2.P = true;
            tiVar2.A1.setVisibility(8);
            tiVar2.w2 = new s2(qVar, aVar, tiVar2, 11);
            tiVar2.t1();
            tiVar2.show();
        }
    }

    public c5.e j() {
        if (((c5.o) this.b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override // ki.u3
    public void l(int i10) {
        ki.q.R((ki.q) this.c, 74, i10);
    }

    @Override // ki.u3
    public void m(ki.t3 t3Var, View view) {
        ki.q qVar = (ki.q) this.c;
        i80 i80Var = new i80(qVar, (d6) this.b, view, false, false, true);
        i80Var.Q = true;
        qVar.H = j4.c(i80Var, qVar.b.f0, qVar.getContext(), (d6) this.b, t3Var, true);
    }

    @Override // ki.u3
    public void n(h1 h1Var, boolean z10) {
        ((ki.q) this.c).b.w1(h1Var, z10);
    }

    @Override // ki.u3
    public void o() {
        ki.q qVar = (ki.q) this.c;
        ki.w3 w3Var = qVar.r;
        ki.b4 b4Var = qVar.s;
        if (b4Var != null) {
            j3 j3Var = w3Var.l3;
            int i10 = (j3Var != null && j3Var.x() && w3Var.D4()) ? 1 : 0;
            if (b4Var.a0 == 2) {
                b4Var.b0 = i10;
            } else {
                b4Var.f(i10, true);
            }
            if (i10 != 0) {
                qVar.Z();
            }
        }
        qVar.c0();
    }

    @Override // ki.u3
    public void onContentChanged() {
        ki.q qVar = (ki.q) this.c;
        ki.b4 b4Var = qVar.s;
        if (b4Var != null) {
            b4Var.setSendLoading(qVar.r.n3());
        }
        qVar.Y(true);
        qVar.b0();
        ki.d dVar = qVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override // g6.n
    public void p(String str, long j10, long j11, long j12) {
        g6.n nVar = (g6.n) this.b;
        if (nVar != null) {
            nVar.p(str, j10, j11, j12);
        }
    }

    @Override // ki.u3
    public void q() {
        ki.b4 b4Var = ((ki.q) this.c).s;
        if (b4Var != null) {
            int i10 = b4Var.a0;
            if (i10 == 2) {
                i10 = 0;
            }
            b4Var.b0 = i10;
            b4Var.e(false, false);
            b4Var.f(2, true);
        }
    }

    @Override // ee.b
    public Object r(ee.c cVar, md.c cVar2) {
        Object r10 = ((qf.b) this.b).r(new ab.a0(cVar, (c0) this.c), cVar2);
        return r10 == ld.a.a ? r10 : id.i.a;
    }

    public void s(i2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new a3.k0(this, dVar, 1));
        }
    }

    @Override // g6.n
    public void t(String str, long j10, int i10, Object obj, long j11, long j12) {
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
            ((g6.n) this.b).t(str, j10, i11, obj, j11, j12);
        }
    }

    public String toString() {
        switch (this.a) {
            case 15:
                try {
                    if (((ec.b) this.c) == null) {
                        this.c = ((ec.e) this.b).a();
                    }
                    return ((ec.b) this.c).toString();
                } catch (dc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    @Override // ki.u3
    public void u() {
        ki.q qVar = (ki.q) this.c;
        if (qVar.getCurrentItemTop() != qVar.I) {
            qVar.b.b2(qVar, 0);
        }
        qVar.d0();
        ki.q.N(qVar);
    }

    @Override // e2.d
    public j9.y v(byte[] bArr) {
        return q8.c(((e2.d) this.b).v(bArr), new j5.b(this, 17));
    }

    @Override // ki.u3
    public void w(int i10) {
        ki.q qVar = (ki.q) this.c;
        qVar.b.b2(qVar, i10);
        qVar.d0();
        ki.q.N(qVar);
    }

    @Override // ki.u3
    public void x(c6 c6Var, String str) {
        ki.q qVar = (ki.q) this.c;
        if (qVar.v == null) {
            d6 d6Var = (d6) this.b;
            qVar.v = new s3(new h0(21, this, d6Var), d6Var);
        }
        qVar.v.f(c6Var, str);
    }

    @Override // ef.b
    public ef.a y(qf.b bVar) {
        List list = (List) this.c;
        List list2 = (List) bVar.b;
        int size = list2 != null ? list2.size() : 0;
        if (size > 0) {
            ArrayList arrayList = new ArrayList(list.size() + size);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new gd.i(bVar, (List) this.b, list);
    }

    @Override // ki.u3
    public void z() {
        ki.b4 b4Var = ((ki.q) this.c).s;
        if (b4Var != null) {
            b4Var.e(false, true);
            int i10 = b4Var.b0;
            b4Var.f(i10 != 2 ? i10 : 0, true);
        }
    }

    public /* synthetic */ s(int i10, Object obj, boolean z10) {
        this.a = i10;
        this.b = obj;
    }

    public /* synthetic */ s(int i10, boolean z10) {
        this.a = i10;
    }

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = null;
    }

    public /* synthetic */ s(Object obj, Object obj2, boolean z10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    public s(Context context, p3 p3Var) {
        this.a = 10;
        b2.t tVar = new b2.t(1);
        try {
            l5.t.b(context);
            tVar.c = l5.t.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new sb.a(4));
        } catch (Throwable unused) {
            tVar.b = true;
        }
        this.c = tVar;
        this.b = p3Var;
    }

    public s(IBinder iBinder) {
        this.a = 25;
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

    public s(m6.a aVar) {
        this.a = 17;
        this.b = aVar == null ? null : aVar.b;
    }

    @Override // z3.m
    public /* synthetic */ void reset() {
    }

    public s(k0 k0Var) {
        this.a = 24;
        this.b = k0Var;
        this.c = new e2.x();
    }

    public s(int i10) {
        this.a = i10;
        switch (i10) {
            case 14:
                this.b = new ConcurrentHashMap(16, 0.75f, 10);
                this.c = new ReferenceQueue();
                break;
            case 19:
                this.b = new HashMap();
                break;
            case 22:
                this.b = new HashMap();
                this.c = i2.c.b;
                break;
            case 23:
                this.b = new e2.x();
                this.c = new i4.a();
                break;
            default:
                this.b = ByteBuffer.allocateDirect(500);
                break;
        }
    }

    public s(Handler handler, a3.m0 m0Var) {
        this.a = 2;
        if (m0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = m0Var;
    }

    public s(Animator animator) {
        this.a = 6;
        this.b = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.c = animatorSet;
        animatorSet.play(animator);
    }

    public s(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this.a = 0;
        if (!TextUtils.isEmpty(str)) {
            if (componentName == null) {
                int i10 = u0.b;
                Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                intent.setPackage(context.getPackageName());
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
                if (queryBroadcastReceivers.size() == 1) {
                    ActivityInfo activityInfo = queryBroadcastReceivers.get(0).activityInfo;
                    componentName = new ComponentName(activityInfo.packageName, activityInfo.name);
                } else {
                    if (queryBroadcastReceivers.size() > 1) {
                        e2.a.l("MediaButtonReceiver", "More than one BroadcastReceiver that handles android.intent.action.MEDIA_BUTTON was found, returning null.");
                    }
                    componentName = null;
                }
                if (componentName == null) {
                    e2.a.g("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
                }
            }
            if (componentName != null && pendingIntent == null) {
                Intent intent2 = new Intent("android.intent.action.MEDIA_BUTTON");
                intent2.setComponent(componentName);
                pendingIntent = PendingIntent.getBroadcast(context, 0, intent2, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                this.b = new p(context, str, bundle);
            } else if (i11 >= 28) {
                this.b = new o(context, str, bundle);
            } else {
                this.b = new n(context, str, bundle);
            }
            Looper myLooper = Looper.myLooper();
            I(new j(), new Handler(myLooper == null ? Looper.getMainLooper() : myLooper));
            ((n) this.b).a.setMediaButtonReceiver(pendingIntent);
            r rVar = ((n) this.b).c;
            w wVar = new w();
            DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                wVar.a = new g(context, rVar);
            } else {
                wVar.a = new f(context, rVar);
            }
            this.c = wVar;
            return;
        }
        throw new IllegalArgumentException("tag must not be null or empty");
    }
}
