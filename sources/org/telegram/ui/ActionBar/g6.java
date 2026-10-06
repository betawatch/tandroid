package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import java.io.File;
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
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.op;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.w11;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.yc;
import org.telegram.ui.a7;
import org.telegram.ui.ad;
import org.telegram.ui.cd;
import org.telegram.ui.dc;
import org.telegram.ui.fd;
import org.telegram.ui.fh;
import org.telegram.ui.i9;
import org.telegram.ui.me;
import org.telegram.ui.n9;
import org.telegram.ui.nd;
import org.telegram.ui.o80;
import org.telegram.ui.sa;
import org.telegram.ui.ta1;
import org.telegram.ui.ua;
import org.telegram.ui.v9;
import org.telegram.ui.w9;
import org.telegram.ui.wb;
import org.telegram.ui.xb1;
import org.telegram.ui.yn;
import org.telegram.ui.z8;
import org.telegram.ui.zc;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final /* synthetic */ class g6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ g6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x014e, code lost:
    
        if (r6.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L62;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:163:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x037f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        yc a02;
        int i11;
        int i12;
        w61 w61Var;
        w11 w11Var;
        int i13 = this.a;
        int i14 = -1;
        int i15 = 0;
        boolean z10 = false;
        int i16 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                h6 h6Var = (h6) obj2;
                h6Var.d((File) obj, h6Var.h0);
                AndroidUtilities.runOnUIThread(new q(h6Var, 19));
                break;
            case 1:
                ((org.telegram.ui.q) obj2).W((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 2:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj2;
                nf.e eVar = (nf.e) obj;
                org.telegram.ui.v3 v3Var = i4Var.K;
                if (v3Var != null) {
                    v3Var.dismiss(true);
                }
                if (i4Var.M0 == eVar) {
                    i4Var.M0 = null;
                    break;
                }
                break;
            case 3:
                ((org.telegram.ui.i4) obj2).R0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 4:
                ArrayList arrayList = (ArrayList) obj;
                org.telegram.ui.q4 q4Var = ((org.telegram.ui.n4) obj2).a;
                if (!arrayList.isEmpty()) {
                    for (int i17 = 0; i17 < arrayList.size(); i17++) {
                        q4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList.get(i17)).longValue(), q4Var.S() * 60);
                    }
                    if (q4Var.S() > 0) {
                        yc.a0(q4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(q4Var.S() * 60), LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size()))))).j();
                        break;
                    } else {
                        yc.a0(q4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size())))).j();
                        break;
                    }
                }
                break;
            case 5:
                org.telegram.ui.w5 w5Var = (org.telegram.ui.w5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                w5Var.R = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new org.telegram.ui.n5(w5Var, 0));
                }
                w5Var.f0.animate().cancel();
                w5Var.f0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.u4(w5Var, i16));
                w5Var.K0(true);
                w5Var.L0(true);
                w5Var.J0(null);
                break;
            case 6:
                org.telegram.ui.b6 b6Var = (org.telegram.ui.b6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList2 = b6Var.c;
                int i18 = 0;
                while (true) {
                    if (i18 >= arrayList2.size()) {
                        i10 = 0;
                    } else if (((org.telegram.ui.a6) arrayList2.get(i18)).c == null || ((org.telegram.ui.a6) arrayList2.get(i18)).c.dialogId != keepMediaException.dialogId) {
                        i18++;
                    } else {
                        i10 = i18;
                    }
                }
                s4.c1 K = b6Var.b.K(i10);
                if (K != null) {
                    View view = K.a;
                    o80 o80Var = new o80(b6Var.getParentActivity(), b6Var);
                    o80Var.g(true);
                    o80Var.setParentWindow(org.telegram.ui.Components.e5.Q(b6Var, o80Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    o80Var.setCallback(new org.telegram.ui.y5(b6Var, keepMediaException, i16));
                    break;
                }
                break;
            case 7:
                a7.U((a7) obj2, (b2) obj);
                break;
            case 8:
                wi0 wi0Var = new wi0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                wi0Var.m(R.raw.qr_code_logo);
                wi0Var.show();
                break;
            case 9:
                ((z8) obj2).b.d0(((TLRPC.Message) hg.c.g(1, ((i9) obj).c)).id, 100);
                break;
            case 10:
                w9 w9Var = (w9) obj2;
                String str = (String) obj;
                v9 v9Var = w9Var.L;
                if (v9Var != null) {
                    v9Var.L(str);
                }
                if (w9Var.V != 3) {
                    w9Var.finishFragment();
                    break;
                }
                break;
            case 11:
                w9 w9Var2 = (w9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                w9Var2.f.setText(result.rawMRZ);
                w9Var2.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(tr.f).start();
                v9 v9Var2 = w9Var2.L;
                if (v9Var2 != null) {
                    v9Var2.T0(result);
                }
                AndroidUtilities.runOnUIThread(new n9(w9Var2, 3), 1200L);
                break;
            case 12:
                w9 w9Var3 = (w9) obj2;
                la.h hVar = (la.h) obj;
                RectF rectF = (RectF) hVar.c;
                PointF[] pointFArr = (PointF[]) hVar.d;
                RectF rectF2 = w9Var3.I;
                PointF[] pointFArr2 = w9Var3.E;
                RectF rectF3 = w9Var3.J;
                PointF[] pointFArr3 = w9Var3.F;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = w9Var3.K;
                if (j3 == 0) {
                    w9Var3.K = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        w9.d0(rectF, pointFArr2);
                        w9.d0(rectF, pointFArr3);
                    } else {
                        while (i15 < 4) {
                            PointF pointF = pointFArr2[i15];
                            PointF pointF2 = pointFArr[i15];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i15];
                            PointF pointF4 = pointFArr[i15];
                            pointF3.set(pointF4.x, pointF4.y);
                            i15++;
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j10 = elapsedRealtime - j3;
                        if (j10 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j10 / 75.0f));
                            AndroidUtilities.lerp(rectF2, rectF3, min, rectF2);
                            for (int i19 = 0; i19 < 4; i19++) {
                                PointF pointF5 = pointFArr2[i19];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i19].x, min), AndroidUtilities.lerp(pointFArr2[i19].y, pointFArr3[i19].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                w9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i20 = 0; i20 < 4; i20++) {
                                    PointF pointF6 = pointFArr3[i20];
                                    PointF pointF7 = pointFArr[i20];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            w9Var3.K = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i21 = 0; i21 < 4; i21++) {
                        PointF pointF8 = pointFArr2[i21];
                        PointF pointF9 = pointFArr3[i21];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    w9Var3.K = elapsedRealtime;
                }
                w9Var3.fragmentView.invalidate();
                break;
            case 13:
                sa.U((sa) obj2, (String) obj);
                break;
            case 14:
                wb wbVar = (wb) obj2;
                yc.a0(wbVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                wbVar.V0();
                break;
            case 15:
                wb wbVar2 = (wb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = yc.a0(wbVar2);
                    i11 = R.raw.msg_antispam;
                    i12 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = yc.a0(wbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                } else {
                    a02 = yc.a0(wbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                }
                org.telegram.messenger.q.p(i12, a02, i11, 36);
                break;
            case 16:
                dc dcVar = (dc) obj2;
                dcVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                dcVar.H.animate().cancel();
                dcVar.H.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.u4(dcVar, 16));
                dcVar.d(true);
                dcVar.c(null);
                break;
            case 17:
                cd cdVar = (cd) obj2;
                cdVar.getClass();
                cdVar.presentFragment(ta1.b0((TLRPC.Chat) obj, true));
                break;
            case 18:
                List list = (List) obj;
                ad adVar = ((zc) obj2).b;
                int i22 = adVar.a;
                xb1 xb1Var = adVar.d;
                ArrayList arrayList3 = adVar.c;
                if (list != null && !list.isEmpty()) {
                    adVar.n = true;
                    arrayList3.clear();
                    arrayList3.add(0, new op((c4) list.get(0)));
                    if (adVar.v != null && adVar.f) {
                        arrayList3.add(0, new op(c4.a(i22)));
                    }
                    d6 d6Var = adVar.b;
                    int a2 = d6Var != null ? d6Var.a() : i6.I.q();
                    for (int i23 = 1; i23 < list.size(); i23++) {
                        c4 c4Var = (c4) list.get(i23);
                        op opVar = new op(c4Var);
                        c4Var.n(i22);
                        opVar.c = a2;
                        arrayList3.add(opVar);
                    }
                    for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                        op opVar2 = (op) arrayList3.get(i24);
                        boolean z11 = TextUtils.equals(adVar.s, opVar2.a()) || (TextUtils.isEmpty(adVar.s) && opVar2.a.a);
                        opVar2.d = z11;
                        if (z11) {
                            i14 = i24;
                        }
                    }
                    org.telegram.ui.yc ycVar = adVar.h;
                    if (ycVar != null) {
                        ycVar.l();
                    }
                    xb1Var.animate().alpha(1.0f).setDuration(150L).start();
                    w00 w00Var = adVar.e;
                    if (adVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(w00Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(w00Var, true, 1.0f, true, true);
                    }
                    if (i14 >= 0 && (xb1Var.getLayoutManager() instanceof s4.c0)) {
                        ((s4.c0) xb1Var.getLayoutManager()).h1(i14, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 19:
                nd ndVar = (nd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    ndVar.getClass();
                    break;
                }
                z10 = true;
                ndVar.j0 = z10;
                break;
            case 20:
                nd.U((nd) obj2, (String) obj);
                break;
            case 21:
                nd ndVar2 = (nd) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList4 = ndVar2.f0;
                ndVar2.d0 = false;
                if (tLObject2 != null && ndVar2.getParentActivity() != null) {
                    for (int i25 = 0; i25 < arrayList4.size(); i25++) {
                        ndVar2.K.removeView((View) arrayList4.get(i25));
                    }
                    arrayList4.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i26 = 0;
                    while (i26 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ndVar2.getParentActivity(), new fd(ndVar2, i15), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i26), i26 == tL_messages_chats.chats.size() - 1);
                        arrayList4.add(nVar);
                        ndVar2.L.addView(nVar, w7.z5.n(-1, 72));
                        i26++;
                    }
                    ndVar2.h0();
                    break;
                }
                break;
            case 22:
                me meVar = (me) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                meVar.q0 = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    meVar.r0 = tL_premium_boostsStatus2.level;
                }
                e71 e71Var = meVar.X0;
                if (e71Var != null && (w61Var = e71Var.f3) != null) {
                    w61Var.N(true);
                    break;
                }
                break;
            case 23:
                ((me) obj2).D((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 24:
                yn ynVar = (yn) obj2;
                w11[] w11VarArr = (w11[]) obj;
                if (!ynVar.hb && (w11Var = w11VarArr[0]) != null) {
                    w11VarArr[0] = null;
                    if (ynVar.t0 == w11Var) {
                        ynVar.t0 = null;
                    }
                    AndroidUtilities.removeFromParent(w11Var);
                    break;
                }
                break;
            case 25:
                ((ua) obj2).run((TLRPC.User) obj);
                break;
            case 26:
                yn ynVar2 = (yn) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                u1Var.getLocationInWindow(new int[2]);
                ynVar2.x1.setTranslationY(u1Var.getTimeY() + ((r1[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                ynVar2.x1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r1[0]) + u1Var.rb) + u1Var.pb) - (u1Var.sb / 2.0f));
                ynVar2.x1.u();
                break;
            case 27:
                yn.I0((yn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 28:
                yn ynVar3 = (yn) obj2;
                int[] iArr = (int[]) obj;
                ynVar3.getClass();
                if (iArr[0] != 0) {
                    ynVar3.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            default:
                ((yn) obj2).h8((fh) obj);
                break;
        }
    }
}
