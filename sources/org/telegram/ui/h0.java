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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
        org.telegram.ui.Components.b71 b71Var;
        org.telegram.ui.Components.y11 y11Var;
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
                k4 k4Var = (k4) obj2;
                pf.c cVar = (pf.c) obj;
                w3 w3Var = k4Var.K;
                if (w3Var != null) {
                    w3Var.dismiss(true);
                }
                if (k4Var.N0 == cVar) {
                    k4Var.N0 = null;
                    break;
                }
                break;
            case 1:
                ((k4) obj2).S0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 2:
                ArrayList arrayList = (ArrayList) obj;
                u4 u4Var = ((r4) obj2).a;
                if (!arrayList.isEmpty()) {
                    for (int i15 = 0; i15 < arrayList.size(); i15++) {
                        u4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList.get(i15)).longValue(), u4Var.U() * 60);
                    }
                    if (u4Var.U() > 0) {
                        org.telegram.ui.Components.xc.a0(u4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(u4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size()))))).j();
                        break;
                    } else {
                        org.telegram.ui.Components.xc.a0(u4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size())))).j();
                        break;
                    }
                }
                break;
            case 3:
                y5 y5Var = (y5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                y5Var.T = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.R, y5Var.T, new q5(y5Var, z11 ? 1 : 0));
                }
                y5Var.h0.animate().cancel();
                y5Var.h0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new m.a(y5Var, 6));
                y5Var.G0(true);
                y5Var.H0(true);
                y5Var.F0(null);
                break;
            case 4:
                d6 d6Var = (d6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList2 = d6Var.c;
                int i16 = 0;
                while (true) {
                    if (i16 >= arrayList2.size()) {
                        i10 = 0;
                    } else if (((c6) arrayList2.get(i16)).c == null || ((c6) arrayList2.get(i16)).c.dialogId != keepMediaException.dialogId) {
                        i16++;
                    } else {
                        i10 = i16;
                    }
                }
                s4.b1 K = d6Var.b.K(i10);
                if (K != null) {
                    View view = K.a;
                    c80 c80Var = new c80(d6Var.getParentActivity(), d6Var);
                    c80Var.g(true);
                    c80Var.setParentWindow(org.telegram.ui.Components.f5.Q(d6Var, c80Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    c80Var.setCallback(new a6(d6Var, keepMediaException, z13 ? 1 : 0));
                    break;
                }
                break;
            case 5:
                c7.Y((c7) obj2, (org.telegram.ui.ActionBar.c2) obj);
                break;
            case 6:
                org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                jj0Var.m(R.raw.qr_code_logo);
                jj0Var.show();
                break;
            case 7:
                ((z8) obj2).b.i0(((TLRPC.Message) i2.o1.i(1, ((i9) obj).c)).id, 100);
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
                org.telegram.messenger.v0.p(i12, a02, i11, 36);
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
                bdVar.presentFragment(u91.d0((TLRPC.Chat) obj, true));
                break;
            case 16:
                List list = (List) obj;
                zc zcVar = ((yc) obj2).b;
                int i21 = zcVar.a;
                xa1 xa1Var = zcVar.d;
                ArrayList arrayList3 = zcVar.c;
                if (list != null && !list.isEmpty()) {
                    zcVar.n = true;
                    arrayList3.clear();
                    arrayList3.add(0, new org.telegram.ui.Components.vp((org.telegram.ui.ActionBar.f4) list.get(0)));
                    if (zcVar.v != null && zcVar.f) {
                        arrayList3.add(0, new org.telegram.ui.Components.vp(org.telegram.ui.ActionBar.f4.a(i21)));
                    }
                    org.telegram.ui.ActionBar.g6 g6Var = zcVar.b;
                    int a2 = g6Var != null ? g6Var.a() : org.telegram.ui.ActionBar.k6.I.q();
                    for (int i22 = 1; i22 < list.size(); i22++) {
                        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) list.get(i22);
                        org.telegram.ui.Components.vp vpVar = new org.telegram.ui.Components.vp(f4Var);
                        f4Var.m(i21);
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
                    xa1Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.b10 b10Var = zcVar.e;
                    if (zcVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(b10Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(b10Var, true, 1.0f, true, true);
                    }
                    if (i14 >= 0 && (xa1Var.getLayoutManager() instanceof s4.b0)) {
                        ((s4.b0) xa1Var.getLayoutManager()).h1(i14, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
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
                mdVar.k0 = z10;
                break;
            case 18:
                md.W((md) obj2, (String) obj);
                break;
            case 19:
                md mdVar2 = (md) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList4 = mdVar2.g0;
                mdVar2.e0 = false;
                if (tLObject2 != null && mdVar2.getParentActivity() != null) {
                    for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                        mdVar2.L.removeView((View) arrayList4.get(i24));
                    }
                    arrayList4.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i25 = 0;
                    while (i25 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(mdVar2.getParentActivity(), new ed(mdVar2, z12 ? 1 : 0), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i25), i25 == tL_messages_chats.chats.size() - 1);
                        arrayList4.add(nVar);
                        mdVar2.M.addView(nVar, w7.z5.n(-1, 72));
                        i25++;
                    }
                    mdVar2.i0();
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
                org.telegram.ui.Components.j71 j71Var = ieVar.a1;
                if (j71Var != null && (b71Var = j71Var.Z2) != null) {
                    b71Var.N(true);
                    break;
                }
                break;
            case 21:
                ((ie) obj2).Y((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 22:
                sn snVar = (sn) obj2;
                org.telegram.ui.Components.y11[] y11VarArr = (org.telegram.ui.Components.y11[]) obj;
                if (!snVar.xb && (y11Var = y11VarArr[0]) != null) {
                    y11VarArr[0] = null;
                    if (snVar.v0 == y11Var) {
                        snVar.v0 = null;
                    }
                    AndroidUtilities.removeFromParent(y11Var);
                    break;
                }
                break;
            case 23:
                sn snVar2 = (sn) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                t1Var.getLocationInWindow(new int[2]);
                snVar2.L1.setTranslationY(t1Var.getTimeY() + ((r1[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                snVar2.L1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r1[0]) + t1Var.rb) + t1Var.pb) - (t1Var.sb / 2.0f));
                snVar2.L1.u();
                break;
            case 24:
                sn.P0((sn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 25:
                ((ai.f3) obj2).run((TLRPC.User) obj);
                break;
            case 26:
                sn snVar3 = (sn) obj2;
                int[] iArr = (int[]) obj;
                snVar3.getClass();
                if (iArr[0] != 0) {
                    snVar3.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 27:
                sn snVar4 = (sn) obj2;
                snVar4.getClass();
                snVar4.presentFragment(ProfileActivity.o4(((TLRPC.User[]) obj)[0].id));
                break;
            case 28:
                sn snVar5 = (sn) obj2;
                pf.d.o(snVar5.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), snVar5.r8 == 0, false);
                break;
            default:
                ((sn) obj2).k8((ch) obj);
                break;
        }
    }
}
