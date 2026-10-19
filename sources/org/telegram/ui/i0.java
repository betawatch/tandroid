package org.telegram.ui;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class i0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x017b, code lost:
    
        if (r6.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L70;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03aa  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.Components.xc a02;
        int i11;
        int i12;
        org.telegram.ui.Components.t61 t61Var;
        org.telegram.ui.Components.u11 u11Var;
        int i13 = this.a;
        int i14 = -1;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                l4 l4Var = (l4) obj2;
                pf.c cVar = (pf.c) obj;
                x3 x3Var = l4Var.K;
                if (x3Var != null) {
                    x3Var.dismiss(true);
                }
                if (l4Var.M0 == cVar) {
                    l4Var.M0 = null;
                    break;
                }
                break;
            case 1:
                ((l4) obj2).R0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                v4 v4Var = ((s4) obj2).a;
                if (!arrayList.isEmpty()) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        v4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList.get(i15)).longValue(), v4Var.U() * 60);
                    }
                    if (v4Var.U() > 0) {
                        org.telegram.ui.Components.xc.a0(v4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(v4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size()))))).j();
                        break;
                    } else {
                        org.telegram.ui.Components.xc.a0(v4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size())))).j();
                        break;
                    }
                }
                break;
            case 3:
                z5 z5Var = (z5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                z5Var.R = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new r5(z5Var, z11 ? 1 : 0));
                }
                z5Var.f0.animate().cancel();
                z5Var.f0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new m.a(z5Var, 6));
                z5Var.G0(true);
                z5Var.H0(true);
                z5Var.F0(null);
                break;
            case 4:
                e6 e6Var = (e6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList2 = e6Var.c;
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList2.size()) {
                        i10 = 0;
                    } else if (((d6) arrayList2.get(i16)).c == null || ((d6) arrayList2.get(i16)).c.dialogId != keepMediaException.dialogId) {
                        i16++;
                    } else {
                        i10 = i16;
                    }
                }
                s4.b1 K = e6Var.b.K(i10);
                if (K != null) {
                    View view = K.a;
                    v70 v70Var = new v70(e6Var.getParentActivity(), e6Var);
                    v70Var.g(true);
                    v70Var.setParentWindow(org.telegram.ui.Components.f5.P(e6Var, v70Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    v70Var.setCallback(new b6(e6Var, keepMediaException, z13 ? 1 : 0));
                    break;
                }
                break;
            case 5:
                c7.Y((c7) obj2, (org.telegram.ui.ActionBar.b2) obj);
                break;
            case 6:
                org.telegram.ui.Components.fj0 fj0Var = new org.telegram.ui.Components.fj0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                fj0Var.n(R.raw.qr_code_logo);
                fj0Var.show();
                break;
            case 7:
                ((z8) obj2).b.j0(((TLRPC.Message) i2.e.h(1, ((i9) obj).c)).id, 100);
                break;
            case 8:
                w9 w9Var = (w9) obj2;
                String str = (String) obj;
                v9 v9Var = w9Var.M;
                if (v9Var != null) {
                    v9Var.E(str);
                }
                if (w9Var.W != 3) {
                    w9Var.finishFragment();
                    break;
                }
                break;
            case 9:
                w9 w9Var2 = (w9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                w9Var2.h.setText(result.rawMRZ);
                w9Var2.h.animate().setDuration(200L).alpha(1.0f).setInterpolator(org.telegram.ui.Components.bs.f).start();
                v9 v9Var2 = w9Var2.M;
                if (v9Var2 != null) {
                    v9Var2.F0(result);
                }
                AndroidUtilities.runOnUIThread(new n9(w9Var2, 3), 1200L);
                break;
            case 10:
                w9 w9Var3 = (w9) obj2;
                m.g3 g3Var = (m.g3) obj;
                RectF rectF = (RectF) g3Var.c;
                PointF[] pointFArr = (PointF[]) g3Var.d;
                RectF rectF2 = w9Var3.J;
                PointF[] pointFArr2 = w9Var3.F;
                RectF rectF3 = w9Var3.K;
                PointF[] pointFArr3 = w9Var3.G;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = w9Var3.L;
                if (j10 == 0) {
                    w9Var3.L = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        w9.d0(rectF, pointFArr2);
                        w9.d0(rectF, pointFArr3);
                    } else {
                        for (int i17 = 0; i17 < 4; i17++) {
                            PointF pointF = pointFArr2[i17];
                            PointF pointF2 = pointFArr[i17];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i17];
                            PointF pointF4 = pointFArr[i17];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j11 = elapsedRealtime - j10;
                        if (j11 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j11 / 75.0f));
                            AndroidUtilities.lerp(rectF2, rectF3, min, rectF2);
                            for (int i18 = 0; i18 < 4; i18++) {
                                PointF pointF5 = pointFArr2[i18];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i18].x, min), AndroidUtilities.lerp(pointFArr2[i18].y, pointFArr3[i18].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                w9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i19 = 0; i19 < 4; i19++) {
                                    PointF pointF6 = pointFArr3[i19];
                                    PointF pointF7 = pointFArr[i19];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            w9Var3.L = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i20 = 0; i20 < 4; i20++) {
                        PointF pointF8 = pointFArr2[i20];
                        PointF pointF9 = pointFArr3[i20];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    w9Var3.L = elapsedRealtime;
                }
                w9Var3.fragmentView.invalidate();
                break;
            case 11:
                sa.W((sa) obj2, (String) obj);
                break;
            case 12:
                vb vbVar = (vb) obj2;
                org.telegram.ui.Components.xc.a0(vbVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                vbVar.V0();
                break;
            case 13:
                vb vbVar2 = (vb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = org.telegram.ui.Components.xc.a0(vbVar2);
                    i11 = R.raw.msg_antispam;
                    i12 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = org.telegram.ui.Components.xc.a0(vbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                } else {
                    a02 = org.telegram.ui.Components.xc.a0(vbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                }
                org.telegram.messenger.g0.q(i12, a02, i11, 36);
                break;
            case 14:
                cc ccVar = (cc) obj2;
                ccVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                ccVar.I.animate().cancel();
                ccVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new m.a(ccVar, 21));
                ccVar.d(true);
                ccVar.c(null);
                break;
            case 15:
                bd bdVar = (bd) obj2;
                bdVar.getClass();
                bdVar.presentFragment(p91.d0((TLRPC.Chat) obj, true));
                break;
            case 16:
                List list = (List) obj;
                zc zcVar = ((yc) obj2).b;
                int i21 = zcVar.a;
                sa1 sa1Var = zcVar.d;
                ArrayList arrayList3 = zcVar.c;
                if (list != null && !list.isEmpty()) {
                    zcVar.n = true;
                    arrayList3.clear();
                    arrayList3.add(0, new org.telegram.ui.Components.vp((org.telegram.ui.ActionBar.c4) list.get(0)));
                    if (zcVar.v != null && zcVar.f) {
                        arrayList3.add(0, new org.telegram.ui.Components.vp(org.telegram.ui.ActionBar.c4.a(i21)));
                    }
                    org.telegram.ui.ActionBar.d6 d6Var = zcVar.b;
                    int a2 = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q();
                    for (int i22 = 1; i22 < list.size(); i22++) {
                        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) list.get(i22);
                        org.telegram.ui.Components.vp vpVar = new org.telegram.ui.Components.vp(c4Var);
                        c4Var.m(i21);
                        vpVar.c = a2;
                        arrayList3.add(vpVar);
                    }
                    for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                        org.telegram.ui.Components.vp vpVar2 = (org.telegram.ui.Components.vp) arrayList3.get(i23);
                        boolean z14 = TextUtils.equals(zcVar.s, vpVar2.a()) || (TextUtils.isEmpty(zcVar.s) && vpVar2.a.a);
                        vpVar2.d = z14;
                        if (z14) {
                            i14 = i23;
                        }
                    }
                    xc xcVar = zcVar.h;
                    if (xcVar != null) {
                        xcVar.l();
                    }
                    sa1Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.b10 b10Var = zcVar.e;
                    if (zcVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(b10Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(b10Var, true, 1.0f, true, true);
                    }
                    if (i14 >= 0 && (sa1Var.getLayoutManager() instanceof s4.b0)) {
                        ((s4.b0) sa1Var.getLayoutManager()).h1(i14, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 17:
                md mdVar = (md) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    mdVar.getClass();
                    break;
                }
                z10 = true;
                mdVar.j0 = z10;
                break;
            case 18:
                md.W((md) obj2, (String) obj);
                break;
            case 19:
                md mdVar2 = (md) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList4 = mdVar2.f0;
                mdVar2.d0 = false;
                if (tLObject2 != null && mdVar2.getParentActivity() != null) {
                    for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                        mdVar2.K.removeView((View) arrayList4.get(i24));
                    }
                    arrayList4.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i25 = 0;
                    while (i25 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(mdVar2.getParentActivity(), new ed(mdVar2, z12 ? 1 : 0), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i25), i25 == tL_messages_chats.chats.size() - 1);
                        arrayList4.add(nVar);
                        mdVar2.L.addView(nVar, w7.z5.n(-1, 72));
                        i25++;
                    }
                    mdVar2.h0();
                    break;
                }
                break;
            case 20:
                ie ieVar = (ie) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                ieVar.A0 = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    ieVar.B0 = tL_premium_boostsStatus2.level;
                }
                org.telegram.ui.Components.b71 b71Var = ieVar.a1;
                if (b71Var != null && (t61Var = b71Var.W2) != null) {
                    t61Var.N(true);
                    break;
                }
                break;
            case 21:
                ((ie) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 22:
                qn qnVar = (qn) obj2;
                org.telegram.ui.Components.u11[] u11VarArr = (org.telegram.ui.Components.u11[]) obj;
                if (!qnVar.kb && (u11Var = u11VarArr[0]) != null) {
                    u11VarArr[0] = null;
                    if (qnVar.v0 == u11Var) {
                        qnVar.v0 = null;
                    }
                    AndroidUtilities.removeFromParent(u11Var);
                    break;
                }
                break;
            case 23:
                qn qnVar2 = (qn) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                u1Var.getLocationInWindow(new int[2]);
                qnVar2.z1.setTranslationY(u1Var.getTimeY() + ((r1[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                qnVar2.z1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r1[0]) + u1Var.rb) + u1Var.pb) - (u1Var.sb / 2.0f));
                qnVar2.z1.u();
                break;
            case 24:
                qn.L0((qn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 25:
                qn qnVar3 = (qn) obj2;
                qnVar3.getClass();
                qnVar3.presentFragment(ProfileActivity.m4(((TLRPC.User[]) obj)[0].id));
                break;
            case 26:
                ((ai.f3) obj2).run((TLRPC.User) obj);
                break;
            case 27:
                qn qnVar4 = (qn) obj2;
                int[] iArr = (int[]) obj;
                qnVar4.getClass();
                if (iArr[0] != 0) {
                    qnVar4.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 28:
                qn qnVar5 = (qn) obj2;
                pf.d.o(qnVar5.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), qnVar5.f8 == 0, false);
                break;
            default:
                ((qn) obj2).k8((ch) obj);
                break;
        }
    }
}
