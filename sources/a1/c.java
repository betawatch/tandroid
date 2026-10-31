package a1;

import a4.k;
import ag.c3;
import ag.g2;
import ag.h2;
import ag.h3;
import ag.i3;
import ag.j2;
import ag.m3;
import ag.r0;
import ag.z2;
import android.app.Activity;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import b2.d1;
import b2.u0;
import bb.e0;
import bb.f0;
import bi.a6;
import bi.c0;
import bi.d4;
import bi.k2;
import bi.k3;
import bi.l3;
import bi.n1;
import bi.n4;
import bi.q0;
import bi.q6;
import bi.r5;
import bi.s6;
import bi.y0;
import bi.z5;
import c3.u;
import com.google.android.gms.tasks.OnSuccessListener;
import e2.l0;
import e2.o;
import e9.l1;
import e9.q1;
import e9.s;
import ei.n;
import ei.r;
import h2.i;
import h2.j;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import n4.q;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.gs;
import org.telegram.messenger.hs;
import org.telegram.messenger.i0;
import org.telegram.messenger.o20;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.Cells.l5;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Cells.t8;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.z60;
import org.telegram.ui.ay;
import org.telegram.ui.pb1;
import org.telegram.ui.ux;
import v7.u7;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements OnSuccessListener, i, o20, u1, i5.e, kt, q0, ux, a6, l1, n, fe.e, c3.g, o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean G() {
        return false;
    }

    @Override // org.telegram.ui.ux
    public /* synthetic */ boolean N(ay ayVar) {
        return false;
    }

    @Override // bi.q0
    public z60 a(n1 n1Var) {
        return z60.H((k2) ((a6.i) this.b).b, n1Var);
    }

    @Override // i5.e
    public Object apply(Object obj) {
        ((k6.h) this.b).getClass();
        String v = f0.b.v((e0) obj);
        kotlin.jvm.internal.i.d(v, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(v));
        byte[] bytes = v.getBytes(rd.a.a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // h2.i
    public void b(j jVar) {
        k kVar = (k) this.b;
        a4.j jVar2 = (a4.j) jVar;
        jVar2.clear();
        kVar.b.add(jVar2);
    }

    @Override // e9.l1
    public Object c(Object obj, Object obj2) {
        return s.x((List) ((Collection) obj2), new q(((q1) this.b).f, obj));
    }

    public void d(int i10) {
        c0 c0Var = (c0) this.b;
        c0Var.c = i10;
        c0Var.e(i10);
    }

    @Override // c3.g
    public long g(long j10) {
        return l0.j((j10 * r0.e) / 1000000, 0L, ((u) this.b).j - 1);
    }

    @Override // org.telegram.ui.ActionBar.u1
    public void h(x1 x1Var, int i10) {
        int i11;
        switch (this.a) {
            case 4:
                z2 z2Var = (z2) ((ag.e) this.b).b;
                i11 = ((org.telegram.ui.ActionBar.k2) z2Var).currentAccount;
                i3 f7 = i3.f(i11);
                ArrayList arrayList = z2Var.b;
                int i12 = f7.a;
                int i13 = 0;
                while (i13 < arrayList.size()) {
                    if (f7.c(((Integer) arrayList.get(i13)).intValue()) == null) {
                        arrayList.remove(i13);
                        i13--;
                    }
                    i13++;
                }
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        h3 c10 = f7.c(((Integer) arrayList.get(i14)).intValue());
                        f7.b.remove(c10);
                        f7.a(c10.b);
                        TLRPC.TL_messages_deleteQuickReplyShortcut tL_messages_deleteQuickReplyShortcut = new TLRPC.TL_messages_deleteQuickReplyShortcut();
                        tL_messages_deleteQuickReplyShortcut.shortcut_id = c10.a;
                        ConnectionsManager.getInstance(i12).sendRequest(tL_messages_deleteQuickReplyShortcut, new c3(1));
                        if ("hello".equals(c10.b)) {
                            ConnectionsManager.getInstance(i12).sendRequest(new TL_account.updateBusinessGreetingMessage(), null);
                            TLRPC.UserFull a2 = vp.r1(i12).a2(d20.i(i12).e());
                            if (a2 != null) {
                                a2.flags2 &= -5;
                                a2.business_greeting_message = null;
                                hs.a0(i12).j2(a2, true);
                            }
                        } else if ("away".equals(c10.b)) {
                            ConnectionsManager.getInstance(i12).sendRequest(new TL_account.updateBusinessAwayMessage(), null);
                            TLRPC.UserFull a22 = vp.r1(i12).a2(d20.i(i12).e());
                            if (a22 != null) {
                                a22.flags2 &= -9;
                                a22.business_away_message = null;
                                hs.a0(i12).j2(a22, true);
                            }
                        }
                    }
                    f7.l();
                    hs a02 = hs.a0(i12);
                    a02.a.c(new r0(a02, arrayList, 1));
                    zs.f(i12).k(zs.F1, new Object[0]);
                }
                z2.b0(z2Var);
                break;
            default:
                ((n4) this.b).run();
                break;
        }
    }

    @Override // e2.o
    public void invoke(Object obj) {
        switch (this.a) {
            case 24:
                ((d1) obj).y((b2.f) this.b);
                break;
            case 25:
                ((d1) obj).w((b2.u1) this.b);
                break;
            case 26:
                ((d1) obj).A((d2.d) this.b);
                break;
            case 27:
                ((d1) obj).m(((i2.c0) this.b).a.Q);
                break;
            default:
                ((d1) obj).F((u0) this.b);
                break;
        }
    }

    @Override // ei.n
    public void j(int i10) {
        ei.b bVar = (ei.b) this.b;
        r rVar = bVar.a;
        ei.e eVar = bVar.g;
        if (Build.VERSION.SDK_INT < 31 || eVar == null) {
            return;
        }
        ArrayList arrayList = eVar.a;
        if (u7.a(i10, 4) || u7.a(i10, 2)) {
            gi.a e = rVar.e();
            ViewGroup viewGroup = bVar.l;
            if (viewGroup != null) {
                e.b(viewGroup.getY(), bVar.k.getWidth(), bVar.l.getY() + bVar.l.getHeight());
            }
            eVar.b = e.b;
            while (eVar.b > arrayList.size()) {
                arrayList.add(new ei.c(arrayList.size()));
            }
            for (int i11 = 0; i11 < eVar.b; i11++) {
                ei.c cVar = (ei.c) arrayList.get(i11);
                cVar.a.set(e.c(i11));
                cVar.b(eVar.m, eVar.n, eVar.o);
                cVar.c(eVar.k);
                int i12 = eVar.p;
                int i13 = eVar.q;
                int i14 = eVar.r;
                int i15 = eVar.s;
                cVar.u = i12;
                cVar.v = i13;
                cVar.w = i14;
                cVar.x = i15;
            }
        }
        eVar.c = bVar.m;
        eVar.d = bVar.k;
        boolean z10 = rVar.j > 0;
        boolean z11 = !z10;
        if (eVar.l != z11) {
            eVar.l = z11;
            int i16 = !z10 ? 5 : 1;
            eVar.m = i16;
            int i17 = z10 ? 1 : 10;
            eVar.n = i17;
            eVar.o = Math.max(i16, i17);
            for (int i18 = 0; i18 < eVar.b; i18++) {
                ((ei.c) arrayList.get(i18)).b(eVar.m, eVar.n, eVar.o);
            }
            eVar.f();
        }
        int i19 = rVar.k;
        int i20 = rVar.l;
        eVar.t = i19;
        eVar.u = i20;
        eVar.f();
        eVar.e();
        Runnable runnable = bVar.i;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // org.telegram.messenger.o20
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        int i10;
        int i11 = this.a;
        final int i12 = 1;
        final int i13 = 0;
        Object obj3 = this.b;
        switch (i11) {
            case 2:
                h2 h2Var = (h2) obj3;
                a51 a51Var = (a51) obj;
                View view = (View) obj2;
                float floatValue = ((Float) serializable).floatValue();
                int i14 = a51Var.d;
                if (i14 == -1) {
                    boolean z10 = !h2Var.d;
                    h2Var.d = z10;
                    ((t8) view).setChecked(z10);
                    h2Var.a.f3.O(true);
                    h2Var.c0(true);
                    break;
                } else if (i14 == -2) {
                    m3 m3Var = new m3(null);
                    m3Var.n = h2Var.n;
                    m3Var.c = new ag.e0(h2Var, view);
                    h2Var.presentFragment(m3Var);
                    break;
                } else if (a51Var.a == 5 && i14 >= 0 && i14 < h2Var.f.length) {
                    if (!cd.X ? floatValue < view.getMeasuredWidth() - i0.L(76.0f) : floatValue > i0.L(76.0f)) {
                        int i15 = (a51Var.d + 6) % 7;
                        int i16 = 0;
                        for (int i17 = 0; i17 < h2Var.f[i15].size(); i17++) {
                            if (((g2) h2Var.f[i15].get(i17)).b > i16) {
                                i16 = ((g2) h2Var.f[i15].get(i17)).b;
                            }
                        }
                        int max = Math.max(0, i16 - 1439);
                        int i18 = (a51Var.d + 1) % 7;
                        int i19 = 1440;
                        for (int i20 = 0; i20 < h2Var.f[i18].size(); i20++) {
                            if (((g2) h2Var.f[i18].get(i20)).a < i19) {
                                i19 = ((g2) h2Var.f[i18].get(i20)).a;
                            }
                        }
                        int i21 = i19 + 1439;
                        CharSequence charSequence = a51Var.l;
                        ArrayList arrayList = h2Var.f[a51Var.d];
                        int i22 = 0;
                        while (i13 < 7) {
                            ArrayList arrayList2 = h2Var.f[i13];
                            if (arrayList2 != null) {
                                i22 = Math.max(1, arrayList2.size()) + i22;
                            }
                            i13++;
                        }
                        j2 j2Var = new j2(charSequence, arrayList, max, i21, 28 - i22);
                        j2Var.f = new a3.d(h2Var, 8);
                        j2Var.h = new f(10, h2Var, a51Var);
                        h2Var.presentFragment(j2Var);
                        break;
                    } else {
                        if (h2Var.f[a51Var.d].isEmpty()) {
                            ((l5) view).setChecked(true);
                            h2Var.f[a51Var.d].add(new g2(0, 1439));
                            h2Var.b0(a51Var.d);
                        } else {
                            h2Var.f[a51Var.d].clear();
                            ((l5) view).setChecked(false);
                        }
                        ((l5) view).setValue(h2.e0(h2Var.f[a51Var.d]));
                        h2Var.c0(true);
                        break;
                    }
                }
                break;
            case 3:
                final j2 j2Var2 = (j2) obj3;
                a51 a51Var2 = (a51) obj;
                final View view2 = (View) obj2;
                int i23 = j2Var2.c;
                int i24 = j2Var2.d;
                ArrayList arrayList3 = j2Var2.b;
                int i25 = a51Var2.d;
                if (i25 == -1) {
                    j2Var2.r = !j2Var2.r;
                    arrayList3.clear();
                    if (j2Var2.r) {
                        arrayList3.add(new g2(0, 1439));
                    }
                    t8 t8Var = (t8) view2;
                    boolean z11 = j2Var2.r;
                    a51Var2.e = z11;
                    t8Var.setChecked(z11);
                    boolean z12 = j2Var2.r;
                    t8Var.b(t6.x0(null, z12 ? t6.f6 : t6.e6, false), z12);
                    j2Var2.n.f3.O(true);
                    a3.d dVar = j2Var2.f;
                    if (dVar != null) {
                        dVar.run();
                        break;
                    }
                } else if (i25 == -2) {
                    if (arrayList3.isEmpty() || j2Var2.Y()) {
                        if (j2Var2.Y()) {
                            arrayList3.clear();
                        }
                        int j10 = Utilities.j(480, i24 - 1, i23);
                        arrayList3.add(new g2(j10, Utilities.j(1200, i24, j10 + 1)));
                    } else {
                        int i26 = ((g2) i0.a.g(1, arrayList3)).b;
                        int j11 = Utilities.j(i26 + 30, i24 - 1, i23);
                        arrayList3.add(new g2(j11, Utilities.j((i26 + 1560) / 2, i24, j11 + 1)));
                    }
                    a3.d dVar2 = j2Var2.f;
                    if (dVar2 != null) {
                        dVar2.run();
                    }
                    j2Var2.n.f3.O(true);
                    break;
                } else if (a51Var2.a == 3 && (i10 = i25 / 3) >= 0 && i10 < arrayList3.size()) {
                    int i27 = i10 - 1;
                    g2 g2Var = i27 >= 0 ? (g2) arrayList3.get(i27) : null;
                    final g2 g2Var2 = (g2) arrayList3.get(i10);
                    int i28 = i10 + 1;
                    g2 g2Var3 = i28 < arrayList3.size() ? (g2) arrayList3.get(i28) : null;
                    int i29 = a51Var2.d % 3;
                    if (i29 == 0) {
                        Activity parentActivity = j2Var2.getParentActivity();
                        String L0 = cd.L0(2131752750, null);
                        int i30 = g2Var2.a;
                        if (g2Var != null) {
                            i23 = g2Var.b + 1;
                        }
                        s4.W(parentActivity, L0, i30, i23, g2Var2.b - 1, new q20() { // from class: ag.i2
                            @Override // org.telegram.messenger.q20
                            public final void a(Object obj4) {
                                Integer num = (Integer) obj4;
                                switch (i13) {
                                    case 0:
                                        j2 j2Var3 = j2Var2;
                                        boolean Z = j2Var3.Z();
                                        p8 p8Var = (p8) view2;
                                        int intValue = num.intValue();
                                        g2Var2.a = intValue;
                                        p8Var.w(g2.a(intValue), true);
                                        if (Z != j2Var3.Z()) {
                                            j2Var3.n.f3.O(true);
                                        }
                                        a3.d dVar3 = j2Var3.f;
                                        if (dVar3 != null) {
                                            dVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        j2 j2Var4 = j2Var2;
                                        boolean Z2 = j2Var4.Z();
                                        p8 p8Var2 = (p8) view2;
                                        int intValue2 = num.intValue();
                                        g2Var2.b = intValue2;
                                        p8Var2.w(g2.a(intValue2), true);
                                        if (Z2 != j2Var4.Z()) {
                                            j2Var4.n.f3.O(true);
                                        }
                                        a3.d dVar4 = j2Var4.f;
                                        if (dVar4 != null) {
                                            dVar4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i29 == 1) {
                        Activity parentActivity2 = j2Var2.getParentActivity();
                        String L02 = cd.L0(2131752756, null);
                        int i31 = g2Var2.b;
                        int i32 = g2Var2.a + 1;
                        if (g2Var3 != null) {
                            i24 = g2Var3.a - 1;
                        }
                        s4.W(parentActivity2, L02, i31, i32, i24, new q20() { // from class: ag.i2
                            @Override // org.telegram.messenger.q20
                            public final void a(Object obj4) {
                                Integer num = (Integer) obj4;
                                switch (i12) {
                                    case 0:
                                        j2 j2Var3 = j2Var2;
                                        boolean Z = j2Var3.Z();
                                        p8 p8Var = (p8) view2;
                                        int intValue = num.intValue();
                                        g2Var2.a = intValue;
                                        p8Var.w(g2.a(intValue), true);
                                        if (Z != j2Var3.Z()) {
                                            j2Var3.n.f3.O(true);
                                        }
                                        a3.d dVar3 = j2Var3.f;
                                        if (dVar3 != null) {
                                            dVar3.run();
                                            break;
                                        }
                                        break;
                                    default:
                                        j2 j2Var4 = j2Var2;
                                        boolean Z2 = j2Var4.Z();
                                        p8 p8Var2 = (p8) view2;
                                        int intValue2 = num.intValue();
                                        g2Var2.b = intValue2;
                                        p8Var2.w(g2.a(intValue2), true);
                                        if (Z2 != j2Var4.Z()) {
                                            j2Var4.n.f3.O(true);
                                        }
                                        a3.d dVar4 = j2Var4.f;
                                        if (dVar4 != null) {
                                            dVar4.run();
                                            break;
                                        }
                                        break;
                                }
                            }
                        });
                        break;
                    } else if (i29 == 2) {
                        arrayList3.remove(i10);
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(new g2(0, 1439));
                        }
                        j2Var2.n.f3.O(true);
                        a3.d dVar3 = j2Var2.f;
                        if (dVar3 != null) {
                            dVar3.run();
                            break;
                        }
                    }
                }
                break;
            case 4:
            default:
                View view3 = (View) obj2;
                if (((d4[]) obj3)[0] != null && (view3 instanceof q6)) {
                    ((q6) view3).B();
                    break;
                }
                break;
            case 5:
                m3.Y((m3) obj3, (a51) obj, (View) obj2);
                break;
        }
    }

    @Override // org.telegram.ui.Components.kt
    public void m() {
        switch (this.a) {
            case 8:
                y0 y0Var = (y0) this.b;
                n1 n1Var = y0Var.d;
                bi.a aVar = y0Var.f;
                if (aVar != null) {
                    aVar.s = true;
                    aVar.r = n1Var.k2;
                }
                if (aVar != null) {
                    TL_iv.PageBlock pageBlock = aVar.b;
                    if (pageBlock instanceof TL_iv.pageBlockDetails) {
                        ((TL_iv.pageBlockDetails) pageBlock).title = s6.f(n1Var.getText());
                    }
                }
                l3 l3Var = y0Var.h;
                if (l3Var != null && y0Var.f != null) {
                    d4.R1(l3Var.a);
                    break;
                }
                break;
            case 13:
                ((r5) this.b).g();
                break;
            default:
                z5 z5Var = (z5) this.b;
                bi.a aVar2 = z5Var.a;
                if (aVar2 != null) {
                    aVar2.s = true;
                    aVar2.r = z5Var.r.k2;
                }
                z5Var.w();
                k3 k3Var = z5Var.E;
                if (k3Var != null && z5Var.a != null) {
                    d4.R1(k3Var.a);
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                ((b) this.b).invoke(obj);
                break;
            case 16:
                ((b1.f) this.b).invoke(obj);
                break;
            case 17:
                ((b1.f) this.b).invoke(obj);
                break;
            case 18:
                ((e1.b) this.b).invoke(obj);
                break;
            default:
                ((e1.b) this.b).invoke(obj);
                break;
        }
    }

    @Override // fe.e
    public void v(int i10, float f7, float f10, fe.f fVar) {
        ((Switch) this.b).invalidate();
    }

    @Override // org.telegram.ui.ux
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        bi.s4 s4Var = (bi.s4) this.b;
        if (arrayList.isEmpty() || ((gs) arrayList.get(0)).a <= 0) {
            return false;
        }
        s4Var.run(((gs) arrayList.get(0)).a);
        ayVar.finishFragment();
        return true;
    }

    @Override // fe.e
    public /* synthetic */ void E(float f7, int i10) {
    }
}
