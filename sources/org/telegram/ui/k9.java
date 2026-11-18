package org.telegram.ui;

import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class k9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k9(int i7, Object obj, Object obj2) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:228:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0503  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        org.telegram.ui.Components.z41 z41Var;
        org.telegram.ui.Components.mz0 mz0Var;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage;
        int i7 = this.a;
        int i10 = -1;
        int i11 = 3;
        org.telegram.messenger.fj fjVar = null;
        int i12 = 0;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i7) {
            case 0:
                t9 t9Var = (t9) obj2;
                String str = (String) obj;
                s9 s9Var = t9Var.N;
                if (s9Var != null) {
                    s9Var.J(str);
                }
                if (t9Var.X != 3) {
                    t9Var.finishFragment();
                    break;
                }
                break;
            case 1:
                t9 t9Var2 = (t9) obj2;
                org.telegram.messenger.ur urVar = (org.telegram.messenger.ur) obj;
                t9Var2.h.setText(urVar.p);
                t9Var2.h.animate().setDuration(200L).alpha(1.0f).setInterpolator(org.telegram.ui.Components.lr.f).start();
                s9 s9Var2 = t9Var2.N;
                if (s9Var2 != null) {
                    s9Var2.S0(urVar);
                }
                org.telegram.messenger.g0.h3(new j9(t9Var2, 3), 1200L);
                break;
            case 2:
                t9 t9Var3 = (t9) obj2;
                h6.m mVar = (h6.m) obj;
                RectF rectF = (RectF) mVar.c;
                PointF[] pointFArr = (PointF[]) mVar.d;
                RectF rectF2 = t9Var3.K;
                PointF[] pointFArr2 = t9Var3.G;
                RectF rectF3 = t9Var3.L;
                PointF[] pointFArr3 = t9Var3.H;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = t9Var3.M;
                if (j3 == 0) {
                    t9Var3.M = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        t9.i0(rectF, pointFArr2);
                        t9.i0(rectF, pointFArr3);
                    } else {
                        for (int i13 = 0; i13 < 4; i13++) {
                            PointF pointF = pointFArr2[i13];
                            PointF pointF2 = pointFArr[i13];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i13];
                            PointF pointF4 = pointFArr[i13];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j10 = elapsedRealtime - j3;
                        if (j10 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j10 / 75.0f));
                            org.telegram.messenger.g0.Z1(rectF2, rectF3, min, rectF2);
                            for (int i14 = 0; i14 < 4; i14++) {
                                PointF pointF5 = pointFArr2[i14];
                                pointF5.set(org.telegram.messenger.g0.T1(pointF5.x, pointFArr3[i14].x, min), org.telegram.messenger.g0.T1(pointFArr2[i14].y, pointFArr3[i14].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                t9.i0(rectF3, pointFArr3);
                            } else {
                                for (int i15 = 0; i15 < 4; i15++) {
                                    PointF pointF6 = pointFArr3[i15];
                                    PointF pointF7 = pointFArr[i15];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            t9Var3.M = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i16 = 0; i16 < 4; i16++) {
                        PointF pointF8 = pointFArr2[i16];
                        PointF pointF9 = pointFArr3[i16];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    t9Var3.M = elapsedRealtime;
                }
                t9Var3.fragmentView.invalidate();
                break;
            case 3:
                la.b0((la) obj2, (String) obj);
                break;
            case 4:
                lb lbVar = (lb) obj2;
                org.telegram.ui.Components.lc.b0(lbVar).Q(R.raw.ic_ban, 36, org.telegram.messenger.g0.W2(org.telegram.messenger.gd.a0(null, null, 2131745862, org.telegram.messenger.o10.k((TLRPC.User) obj, true)))).k(false);
                lbVar.a1();
                break;
            case 5:
                lb lbVar2 = (lb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.f3.n(null, 2131752455, org.telegram.ui.Components.lc.b0(lbVar2), R.raw.msg_antispam, 36);
                    break;
                } else {
                    org.telegram.messenger.f3.n(null, 2131743642, tLObject instanceof TLRPC.TL_boolFalse ? org.telegram.ui.Components.lc.b0(lbVar2) : org.telegram.ui.Components.lc.b0(lbVar2), R.raw.error, 36);
                    break;
                }
            case 6:
                sb sbVar = (sb) obj2;
                sbVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                sbVar.I.animate().cancel();
                sbVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.Cells.y9(sbVar, i11));
                sbVar.d(true);
                sbVar.c(null);
                break;
            case 7:
                qc qcVar = (qc) obj2;
                qcVar.getClass();
                qcVar.presentFragment(c51.g0((TLRPC.Chat) obj, true));
                break;
            case 8:
                List list = (List) obj;
                oc ocVar = ((nc) obj2).b;
                int i17 = ocVar.a;
                f61 f61Var = ocVar.d;
                ArrayList arrayList = ocVar.c;
                if (list != null && !list.isEmpty()) {
                    ocVar.n = true;
                    arrayList.clear();
                    arrayList.add(0, new org.telegram.ui.Components.kp((org.telegram.ui.ActionBar.t3) list.get(0)));
                    if (ocVar.w != null && ocVar.f) {
                        arrayList.add(0, new org.telegram.ui.Components.kp(org.telegram.ui.ActionBar.t3.a(i17)));
                    }
                    org.telegram.ui.ActionBar.i6 i6Var = ocVar.b;
                    int d = i6Var != null ? i6Var.d() : org.telegram.ui.ActionBar.n6.I.q();
                    for (int i18 = 1; i18 < list.size(); i18++) {
                        org.telegram.ui.ActionBar.t3 t3Var = (org.telegram.ui.ActionBar.t3) list.get(i18);
                        org.telegram.ui.Components.kp kpVar = new org.telegram.ui.Components.kp(t3Var);
                        t3Var.m(i17);
                        kpVar.c = d;
                        arrayList.add(kpVar);
                    }
                    for (int i19 = 0; i19 < arrayList.size(); i19++) {
                        org.telegram.ui.Components.kp kpVar2 = (org.telegram.ui.Components.kp) arrayList.get(i19);
                        boolean z10 = TextUtils.equals(ocVar.s, kpVar2.a()) || (TextUtils.isEmpty(ocVar.s) && kpVar2.a.a);
                        kpVar2.d = z10;
                        if (z10) {
                            i10 = i19;
                        }
                    }
                    mc mcVar = ocVar.h;
                    if (mcVar != null) {
                        mcVar.f();
                    }
                    f61Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.wz wzVar = ocVar.e;
                    if (ocVar.n) {
                        org.telegram.messenger.g0.X3(wzVar, false, 1.0f, true, true);
                    } else {
                        org.telegram.messenger.g0.X3(wzVar, true, 1.0f, true, true);
                    }
                    if (i10 >= 0 && (f61Var.getLayoutManager() instanceof v4.c0)) {
                        ((v4.c0) f61Var.getLayoutManager()).h1(i10, (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 9:
                ad adVar = (ad) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    adVar.getClass();
                    if (tL_error.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH")) {
                        r12 = false;
                    }
                }
                adVar.l0 = r12;
                break;
            case 10:
                ad.b0((ad) obj2, (String) obj);
                break;
            case 11:
                ad adVar2 = (ad) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList2 = adVar2.h0;
                adVar2.f0 = false;
                if (tLObject2 != null && adVar2.getParentActivity() != null) {
                    for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                        adVar2.M.removeView((View) arrayList2.get(i20));
                    }
                    arrayList2.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i21 = 0;
                    while (i21 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(adVar2.getParentActivity(), new tc(adVar2, i12), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i21), i21 == tL_messages_chats.chats.size() - 1);
                        arrayList2.add(nVar);
                        adVar2.N.addView(nVar, c8.ma.o(-1, 72));
                        i21++;
                    }
                    adVar2.n0();
                    break;
                }
                break;
            case 12:
                xd xdVar = (xd) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                xdVar.r0 = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    xdVar.s0 = tL_premium_boostsStatus.level;
                }
                org.telegram.ui.Components.e51 e51Var = xdVar.Y0;
                if (e51Var != null && (z41Var = e51Var.g3) != null) {
                    z41Var.O(true);
                    break;
                }
                break;
            case 13:
                ((xd) obj2).D((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 14:
                bn bnVar = (bn) obj2;
                org.telegram.ui.Components.mz0[] mz0VarArr = (org.telegram.ui.Components.mz0[]) obj;
                if (!bnVar.Ob && (mz0Var = mz0VarArr[0]) != null) {
                    mz0VarArr[0] = null;
                    if (bnVar.y0 == mz0Var) {
                        bnVar.y0 = null;
                    }
                    org.telegram.messenger.g0.E2(mz0Var);
                    break;
                }
                break;
            case 15:
                bn.b0((bn) obj2, (org.telegram.ui.Components.y60) obj);
                break;
            case 16:
                bn bnVar2 = (bn) obj2;
                bnVar2.getClass();
                bnVar2.presentFragment(ProfileActivity.D4(((TLRPC.User[]) obj)[0].id));
                break;
            case 17:
                ((di.m2) obj2).a((TLRPC.User) obj);
                break;
            case 18:
                bn bnVar3 = (bn) obj2;
                org.telegram.ui.Cells.r1 r1Var = (org.telegram.ui.Cells.r1) obj;
                r1Var.getLocationInWindow(new int[2]);
                bnVar3.O1.setTranslationY(r1Var.getTimeY() + ((r1[1] - r2.getTop()) - org.telegram.messenger.g0.L(120.0f)));
                bnVar3.O1.p(0.0f, ((((-org.telegram.messenger.g0.L(16.0f)) + r1[0]) + r1Var.C9) + r1Var.A9) - (r1Var.D9 / 2.0f));
                bnVar3.O1.x();
                break;
            case 19:
                bn.v1((bn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 20:
                bn bnVar4 = (bn) obj2;
                int[] iArr = (int[]) obj;
                bnVar4.getClass();
                if (iArr[0] != 0) {
                    bnVar4.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 21:
                ((bn) obj2).y8((ig) obj);
                break;
            case 22:
                bn bnVar5 = (bn) obj2;
                vf.c.q(bnVar5.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), bnVar5.x8 == 0, false);
                break;
            case 23:
                ((bn) obj2).Na((TLRPC.Chat) obj);
                break;
            case 24:
                bn.W0((bn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            case 25:
                bn bnVar6 = (bn) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tL_error2.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.M0(2131745107, null), bnVar6);
                    break;
                } else if (tL_error2.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.b5.t0(org.telegram.messenger.gd.M0(2131753953, null), bnVar6);
                    break;
                } else {
                    org.telegram.ui.Components.b5.t0(tL_error2.text, bnVar6);
                    break;
                }
            case 26:
                a0.h hVar = (a0.h) obj2;
                m6 m6Var = (m6) obj;
                if (hVar.m() == 1 && hVar.n(0) != null && ((ArrayList) hVar.n(0)).size() == 1) {
                    fjVar = (org.telegram.messenger.fj) ((ArrayList) hVar.n(0)).get(0);
                }
                if (fjVar != null && (message = fjVar.k) != null && (messageMedia = message.media) != null && (webPage = messageMedia.webpage) != null && webPage.attributes != null) {
                    for (int i22 = 0; i22 < fjVar.k.media.webpage.attributes.size(); i22++) {
                        TLRPC.WebPageAttribute webPageAttribute = fjVar.k.media.webpage.attributes.get(i22);
                        if ((webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) && ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem != null) {
                            org.telegram.messenger.g0.g3(new k9(27, m6Var, fjVar.k.media.webpage));
                            break;
                        }
                    }
                }
                org.telegram.messenger.g0.g3(new bh(m6Var, i12));
                break;
            case 27:
                ((m6) obj2).a(Boolean.TRUE, (TLRPC.WebPage) obj);
                break;
            case 28:
                bn bnVar7 = (bn) obj2;
                View view = (View) obj;
                if (bnVar7.getParentActivity() != null) {
                    bnVar7.Z0.setPadding(org.telegram.messenger.g0.L(7.33f), 0, org.telegram.messenger.g0.L(7.33f), 0);
                    bnVar7.Z0.l(bnVar7.L);
                    bnVar7.Z0.s(16.0f);
                    bnVar7.Z0.r(true);
                    bnVar7.Z0.v(org.telegram.messenger.gd.M0(2131753100, null));
                    bnVar7.Z0.o(0.0f, 96.0f);
                    bnVar7.Z0.setTranslationY(org.telegram.messenger.g0.L(10.0f) + ((view.getTop() - bnVar7.Xa) - bnVar7.m1.getHeight()));
                    bnVar7.m1.addView(bnVar7.Z0, c8.ma.e(-1, 100, 87));
                    hi.m3 m3Var = bnVar7.Z0;
                    m3Var.r0 = new zd(bnVar7, i11);
                    m3Var.x();
                    org.telegram.ui.Components.k30.x.b();
                    break;
                }
                break;
            default:
                ((bn) obj2).m1.removeView((org.telegram.ui.Components.vi0) obj);
                break;
        }
    }
}
