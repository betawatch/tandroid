package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class h0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0161, code lost:
    
        if (r6.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L64;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0395  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.Components.p51 p51Var;
        org.telegram.ui.Components.h01 h01Var;
        int i11 = this.a;
        int i12 = -1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i11) {
            case 0:
                h4 h4Var = (h4) obj2;
                gf.e eVar = (gf.e) obj;
                u3 u3Var = h4Var.K;
                if (u3Var != null) {
                    u3Var.a(true);
                }
                if (h4Var.N0 == eVar) {
                    h4Var.N0 = null;
                    break;
                }
                break;
            case 1:
                ((h4) obj2).S0.d();
                ((AnimatorSet) obj).start();
                break;
            case 2:
                f2.a((f2) obj2, (SpannableString) obj);
                break;
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                p4 p4Var = (p4) ((m4) obj2).b;
                if (!arrayList.isEmpty()) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        p4Var.getMessagesController().F4(p4Var.Y() * 60, ((Long) arrayList.get(i14)).longValue());
                    }
                    if (p4Var.Y() > 0) {
                        org.telegram.messenger.z20.s(org.telegram.messenger.cd.a0("AutodeleteTimerEnabledForChats", null, 2131753778, org.telegram.messenger.cd.c0(p4Var.Y() * 60), org.telegram.messenger.cd.G(arrayList.size(), "Chats", Integer.valueOf(arrayList.size()))), org.telegram.ui.Components.cc.a0(p4Var), R.raw.fire_on, 36);
                        break;
                    } else {
                        org.telegram.ui.Components.cc.a0(p4Var).Q(R.raw.fire_off, 36, org.telegram.messenger.cd.a0("AutodeleteTimerDisabledForChats", null, 2131753779, org.telegram.messenger.cd.G(arrayList.size(), "Chats", Integer.valueOf(arrayList.size())))).j();
                        break;
                    }
                }
                break;
            case 4:
                t5 t5Var = (t5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                t5Var.T = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    t5Var.getMessagesController().G0().b(t5Var.R, t5Var.T, new k5(t5Var, z11 ? 1 : 0));
                }
                t5Var.h0.animate().cancel();
                t5Var.h0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new bg.e(t5Var, 28));
                t5Var.H0(true);
                t5Var.I0(true);
                t5Var.G0(null);
                break;
            case 5:
                x5 x5Var = (x5) obj2;
                org.telegram.messenger.w2 w2Var = (org.telegram.messenger.w2) obj;
                ArrayList arrayList2 = x5Var.c;
                int i15 = 0;
                while (true) {
                    if (i15 >= arrayList2.size()) {
                        i10 = 0;
                    } else if (((w5) arrayList2.get(i15)).c == null || ((w5) arrayList2.get(i15)).c.a != w2Var.a) {
                        i15++;
                    } else {
                        i10 = i15;
                    }
                }
                s4.c1 K = x5Var.b.K(i10);
                if (K != null) {
                    View view = K.a;
                    d70 d70Var = new d70(x5Var.getParentActivity(), x5Var);
                    d70Var.h(true);
                    d70Var.setParentWindow(org.telegram.ui.Components.s4.P(x5Var, d70Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    d70Var.setCallback(new u5(x5Var, w2Var, i13));
                    break;
                }
                break;
            case 6:
                y6.b0((y6) obj2, (org.telegram.ui.ActionBar.x1) obj);
                break;
            case 7:
                org.telegram.ui.Components.nh0 nh0Var = new org.telegram.ui.Components.nh0((Context) obj2, org.telegram.messenger.cd.L0(2131749180, null), ((String[]) obj)[0], org.telegram.messenger.cd.L0(2131746524, null), false);
                nh0Var.I0();
                nh0Var.show();
                break;
            case 8:
                ((x8) obj2).b.h0(((TLRPC.Message) i0.a.g(1, ((g9) obj).c)).id, 100);
                break;
            case 9:
                u9 u9Var = (u9) obj2;
                String str = (String) obj;
                t9 t9Var = u9Var.M;
                if (t9Var != null) {
                    t9Var.L(str);
                }
                if (u9Var.W != 3) {
                    u9Var.finishFragment();
                    break;
                }
                break;
            case 10:
                u9 u9Var2 = (u9) obj2;
                org.telegram.messenger.is isVar = (org.telegram.messenger.is) obj;
                u9Var2.h.setText(isVar.p);
                u9Var2.h.animate().setDuration(200L).alpha(1.0f).setInterpolator(org.telegram.ui.Components.gr.f).start();
                t9 t9Var2 = u9Var2.M;
                if (t9Var2 != null) {
                    t9Var2.X0(isVar);
                }
                org.telegram.messenger.i0.h3(new k9(u9Var2, 3), 1200L);
                break;
            case 11:
                u9 u9Var3 = (u9) obj2;
                li.k kVar = (li.k) obj;
                RectF rectF = (RectF) kVar.c;
                PointF[] pointFArr = (PointF[]) kVar.d;
                RectF rectF2 = u9Var3.J;
                PointF[] pointFArr2 = u9Var3.F;
                RectF rectF3 = u9Var3.K;
                PointF[] pointFArr3 = u9Var3.G;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = u9Var3.L;
                if (j10 == 0) {
                    u9Var3.L = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        u9.h0(rectF, pointFArr2);
                        u9.h0(rectF, pointFArr3);
                    } else {
                        for (int i16 = 0; i16 < 4; i16++) {
                            PointF pointF = pointFArr2[i16];
                            PointF pointF2 = pointFArr[i16];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i16];
                            PointF pointF4 = pointFArr[i16];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j11 = elapsedRealtime - j10;
                        if (j11 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j11 / 75.0f));
                            org.telegram.messenger.i0.Z1(rectF2, rectF3, min, rectF2);
                            for (int i17 = 0; i17 < 4; i17++) {
                                PointF pointF5 = pointFArr2[i17];
                                pointF5.set(org.telegram.messenger.i0.T1(pointF5.x, pointFArr3[i17].x, min), org.telegram.messenger.i0.T1(pointFArr2[i17].y, pointFArr3[i17].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                u9.h0(rectF3, pointFArr3);
                            } else {
                                for (int i18 = 0; i18 < 4; i18++) {
                                    PointF pointF6 = pointFArr3[i18];
                                    PointF pointF7 = pointFArr[i18];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            u9Var3.L = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i19 = 0; i19 < 4; i19++) {
                        PointF pointF8 = pointFArr2[i19];
                        PointF pointF9 = pointFArr3[i19];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    u9Var3.L = elapsedRealtime;
                }
                u9Var3.fragmentView.invalidate();
                break;
            case 12:
                oa.a0((oa) obj2, (String) obj);
                break;
            case 13:
                sb sbVar = (sb) obj2;
                org.telegram.ui.Components.cc.a0(sbVar).Q(R.raw.ic_ban, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131746074, org.telegram.messenger.h20.j((TLRPC.User) obj, true)))).k(false);
                sbVar.Z0();
                break;
            case 14:
                sb sbVar2 = (sb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.m5.n(null, 2131752466, org.telegram.ui.Components.cc.a0(sbVar2), R.raw.msg_antispam, 36);
                    break;
                } else {
                    org.telegram.messenger.m5.n(null, 2131743904, tLObject instanceof TLRPC.TL_boolFalse ? org.telegram.ui.Components.cc.a0(sbVar2) : org.telegram.ui.Components.cc.a0(sbVar2), R.raw.error, 36);
                    break;
                }
            case 15:
                zb zbVar = (zb) obj2;
                zbVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                zbVar.H.animate().cancel();
                zbVar.H.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new s9(zbVar, 13));
                zbVar.d(true);
                zbVar.c(null);
                break;
            case 16:
                zc zcVar = (zc) obj2;
                zcVar.getClass();
                zcVar.presentFragment(u61.f0((TLRPC.Chat) obj, true));
                break;
            case 17:
                List list = (List) obj;
                xc xcVar = ((wc) obj2).b;
                int i20 = xcVar.a;
                w71 w71Var = xcVar.d;
                ArrayList arrayList3 = xcVar.c;
                if (list != null && !list.isEmpty()) {
                    xcVar.n = true;
                    arrayList3.clear();
                    arrayList3.add(0, new org.telegram.ui.Components.cp((org.telegram.ui.ActionBar.y3) list.get(0)));
                    if (xcVar.w != null && xcVar.f) {
                        arrayList3.add(0, new org.telegram.ui.Components.cp(org.telegram.ui.ActionBar.y3.a(i20)));
                    }
                    org.telegram.ui.ActionBar.p6 p6Var = xcVar.b;
                    int a2 = p6Var != null ? p6Var.a() : org.telegram.ui.ActionBar.t6.I.q();
                    for (int i21 = 1; i21 < list.size(); i21++) {
                        org.telegram.ui.ActionBar.y3 y3Var = (org.telegram.ui.ActionBar.y3) list.get(i21);
                        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(y3Var);
                        y3Var.m(i20);
                        cpVar.c = a2;
                        arrayList3.add(cpVar);
                    }
                    for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                        org.telegram.ui.Components.cp cpVar2 = (org.telegram.ui.Components.cp) arrayList3.get(i22);
                        boolean z13 = TextUtils.equals(xcVar.s, cpVar2.a()) || (TextUtils.isEmpty(xcVar.s) && cpVar2.a.a);
                        cpVar2.d = z13;
                        if (z13) {
                            i12 = i22;
                        }
                    }
                    vc vcVar = xcVar.h;
                    if (vcVar != null) {
                        vcVar.f();
                    }
                    w71Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.zz zzVar = xcVar.e;
                    if (xcVar.n) {
                        org.telegram.messenger.i0.Y3(zzVar, false, 1.0f, true, true);
                    } else {
                        org.telegram.messenger.i0.Y3(zzVar, true, 1.0f, true, true);
                    }
                    if (i12 >= 0 && (w71Var.getLayoutManager() instanceof s4.a0)) {
                        ((s4.a0) w71Var.getLayoutManager()).h1(i12, (org.telegram.messenger.i0.q.x - org.telegram.messenger.i0.L(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 18:
                kd kdVar = (kd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    kdVar.getClass();
                    break;
                }
                z10 = true;
                kdVar.k0 = z10;
                break;
            case 19:
                kd.a0((kd) obj2, (String) obj);
                break;
            case 20:
                kd kdVar2 = (kd) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList4 = kdVar2.g0;
                kdVar2.e0 = false;
                if (tLObject2 != null && kdVar2.getParentActivity() != null) {
                    for (int i23 = 0; i23 < arrayList4.size(); i23++) {
                        kdVar2.L.removeView((View) arrayList4.get(i23));
                    }
                    arrayList4.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i24 = 0;
                    while (i24 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.m mVar = new org.telegram.ui.Cells.m(kdVar2.getParentActivity(), new cd(kdVar2, z12 ? 1 : 0), false, 0);
                        mVar.a(tL_messages_chats.chats.get(i24), i24 == tL_messages_chats.chats.size() - 1);
                        arrayList4.add(mVar);
                        kdVar2.M.addView(mVar, w7.b6.o(-1, 72));
                        i24++;
                    }
                    kdVar2.m0();
                    break;
                }
                break;
            case 21:
                le leVar = (le) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                leVar.q0 = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    leVar.r0 = tL_premium_boostsStatus2.level;
                }
                org.telegram.ui.Components.u51 u51Var = leVar.X0;
                if (u51Var != null && (p51Var = u51Var.f3) != null) {
                    p51Var.O(true);
                    break;
                }
                break;
            case 22:
                ((le) obj2).D((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 23:
                un unVar = (un) obj2;
                org.telegram.ui.Components.h01[] h01VarArr = (org.telegram.ui.Components.h01[]) obj;
                if (!unVar.Fb && (h01Var = h01VarArr[0]) != null) {
                    h01VarArr[0] = null;
                    if (unVar.x0 == h01Var) {
                        unVar.x0 = null;
                    }
                    org.telegram.messenger.i0.E2(h01Var);
                    break;
                }
                break;
            case 24:
                un.b0((un) obj2, (org.telegram.ui.Components.z60) obj);
                break;
            case 25:
                un unVar2 = (un) obj2;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) obj;
                q1Var.getLocationInWindow(new int[2]);
                unVar2.N1.setTranslationY(q1Var.getTimeY() + ((r1[1] - r3.getTop()) - org.telegram.messenger.i0.L(120.0f)));
                unVar2.N1.m(0.0f, ((((-org.telegram.messenger.i0.L(16.0f)) + r1[0]) + q1Var.A9) + q1Var.y9) - (q1Var.B9 / 2.0f));
                unVar2.N1.u();
                break;
            case 26:
                un.Y((un) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 27:
                ((pa) obj2).a((TLRPC.User) obj);
                break;
            case 28:
                un unVar3 = (un) obj2;
                unVar3.getClass();
                unVar3.presentFragment(ProfileActivity.z4(((TLRPC.User[]) obj)[0].id));
                break;
            default:
                un unVar4 = (un) obj2;
                int[] iArr = (int[]) obj;
                unVar4.getClass();
                if (iArr[0] != 0) {
                    unVar4.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
        }
    }
}
