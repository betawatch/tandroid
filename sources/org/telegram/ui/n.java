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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0168, code lost:
    
        if (r6.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0398  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.Components.wc a02;
        int i11;
        int i12;
        org.telegram.ui.Components.j61 j61Var;
        org.telegram.ui.Components.k11 k11Var;
        int i13 = this.a;
        int i14 = -1;
        int i15 = 0;
        boolean z10 = false;
        boolean z11 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                ((q) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 1:
                j4 j4Var = (j4) obj2;
                nf.e eVar = (nf.e) obj;
                w3 w3Var = j4Var.K;
                if (w3Var != null) {
                    w3Var.dismiss(true);
                }
                if (j4Var.M0 == eVar) {
                    j4Var.M0 = null;
                    break;
                }
                break;
            case 2:
                ((j4) obj2).R0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 3:
                ArrayList arrayList = (ArrayList) obj;
                q4 q4Var = ((n4) obj2).a;
                if (!arrayList.isEmpty()) {
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        q4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList.get(i16)).longValue(), q4Var.U() * 60);
                    }
                    if (q4Var.U() > 0) {
                        org.telegram.ui.Components.wc.a0(q4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(q4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size()))))).j();
                        break;
                    } else {
                        org.telegram.ui.Components.wc.a0(q4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size())))).j();
                        break;
                    }
                }
                break;
            case 4:
                w5 w5Var = (w5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                w5Var.R = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new m5(w5Var, 0));
                }
                w5Var.f0.animate().cancel();
                w5Var.f0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new bi.h(w5Var, 21));
                w5Var.F0(true);
                w5Var.G0(true);
                w5Var.E0(null);
                break;
            case 5:
                b6 b6Var = (b6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList2 = b6Var.c;
                int i17 = 0;
                while (true) {
                    if (i17 >= arrayList2.size()) {
                        i10 = 0;
                    } else if (((a6) arrayList2.get(i17)).c == null || ((a6) arrayList2.get(i17)).c.dialogId != keepMediaException.dialogId) {
                        i17++;
                    } else {
                        i10 = i17;
                    }
                }
                s4.c1 K = b6Var.b.K(i10);
                if (K != null) {
                    View view = K.a;
                    p80 p80Var = new p80(b6Var.getParentActivity(), b6Var);
                    p80Var.g(true);
                    p80Var.setParentWindow(org.telegram.ui.Components.d5.Q(b6Var, p80Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    p80Var.setCallback(new y5(b6Var, keepMediaException, z11 ? 1 : 0));
                    break;
                }
                break;
            case 6:
                y6.Y((y6) obj2, (org.telegram.ui.ActionBar.d2) obj);
                break;
            case 7:
                org.telegram.ui.Components.ti0 ti0Var = new org.telegram.ui.Components.ti0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                ti0Var.m(R.raw.qr_code_logo);
                ti0Var.show();
                break;
            case 8:
                ((x8) obj2).b.j0(((TLRPC.Message) hc.b.i(1, ((g9) obj).c)).id, 100);
                break;
            case 9:
                u9 u9Var = (u9) obj2;
                String str = (String) obj;
                t9 t9Var = u9Var.L;
                if (t9Var != null) {
                    t9Var.J(str);
                }
                if (u9Var.V != 3) {
                    u9Var.finishFragment();
                    break;
                }
                break;
            case 10:
                u9 u9Var2 = (u9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                u9Var2.f.setText(result.rawMRZ);
                u9Var2.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(org.telegram.ui.Components.wr.f).start();
                t9 t9Var2 = u9Var2.L;
                if (t9Var2 != null) {
                    t9Var2.T0(result);
                }
                AndroidUtilities.runOnUIThread(new l9(u9Var2, 3), 1200L);
                break;
            case 11:
                u9 u9Var3 = (u9) obj2;
                m.e3 e3Var = (m.e3) obj;
                RectF rectF = (RectF) e3Var.c;
                PointF[] pointFArr = (PointF[]) e3Var.d;
                RectF rectF2 = u9Var3.I;
                PointF[] pointFArr2 = u9Var3.E;
                RectF rectF3 = u9Var3.J;
                PointF[] pointFArr3 = u9Var3.F;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = u9Var3.K;
                if (j3 == 0) {
                    u9Var3.K = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        u9.d0(rectF, pointFArr2);
                        u9.d0(rectF, pointFArr3);
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
                            for (int i18 = 0; i18 < 4; i18++) {
                                PointF pointF5 = pointFArr2[i18];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i18].x, min), AndroidUtilities.lerp(pointFArr2[i18].y, pointFArr3[i18].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                u9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i19 = 0; i19 < 4; i19++) {
                                    PointF pointF6 = pointFArr3[i19];
                                    PointF pointF7 = pointFArr[i19];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            u9Var3.K = elapsedRealtime;
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
                    u9Var3.K = elapsedRealtime;
                }
                u9Var3.fragmentView.invalidate();
                break;
            case 12:
                ra.W((ra) obj2, (String) obj);
                break;
            case 13:
                wb wbVar = (wb) obj2;
                org.telegram.ui.Components.wc.a0(wbVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                wbVar.W0();
                break;
            case 14:
                wb wbVar2 = (wb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = org.telegram.ui.Components.wc.a0(wbVar2);
                    i11 = R.raw.msg_antispam;
                    i12 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = org.telegram.ui.Components.wc.a0(wbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                } else {
                    a02 = org.telegram.ui.Components.wc.a0(wbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                }
                org.telegram.messenger.a2.o(i12, a02, i11, 36);
                break;
            case 15:
                ec ecVar = (ec) obj2;
                ecVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                ecVar.I.animate().cancel();
                ecVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.Cells.v5(ecVar, 6));
                ecVar.d(true);
                ecVar.c(null);
                break;
            case 16:
                cd cdVar = (cd) obj2;
                cdVar.getClass();
                cdVar.presentFragment(fb1.d0((TLRPC.Chat) obj, true));
                break;
            case 17:
                List list = (List) obj;
                ad adVar = ((zc) obj2).b;
                int i21 = adVar.a;
                ic1 ic1Var = adVar.d;
                ArrayList arrayList3 = adVar.c;
                if (list != null && !list.isEmpty()) {
                    adVar.n = true;
                    arrayList3.clear();
                    arrayList3.add(0, new org.telegram.ui.Components.rp((org.telegram.ui.ActionBar.f4) list.get(0)));
                    if (adVar.v != null && adVar.f) {
                        arrayList3.add(0, new org.telegram.ui.Components.rp(org.telegram.ui.ActionBar.f4.a(i21)));
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = adVar.b;
                    int a2 = f6Var != null ? f6Var.a() : org.telegram.ui.ActionBar.j6.I.q();
                    for (int i22 = 1; i22 < list.size(); i22++) {
                        org.telegram.ui.ActionBar.f4 f4Var = (org.telegram.ui.ActionBar.f4) list.get(i22);
                        org.telegram.ui.Components.rp rpVar = new org.telegram.ui.Components.rp(f4Var);
                        f4Var.n(i21);
                        rpVar.c = a2;
                        arrayList3.add(rpVar);
                    }
                    for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                        org.telegram.ui.Components.rp rpVar2 = (org.telegram.ui.Components.rp) arrayList3.get(i23);
                        boolean z12 = TextUtils.equals(adVar.s, rpVar2.a()) || (TextUtils.isEmpty(adVar.s) && rpVar2.a.a);
                        rpVar2.d = z12;
                        if (z12) {
                            i14 = i23;
                        }
                    }
                    yc ycVar = adVar.h;
                    if (ycVar != null) {
                        ycVar.l();
                    }
                    ic1Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.a10 a10Var = adVar.e;
                    if (adVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(a10Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(a10Var, true, 1.0f, true, true);
                    }
                    if (i14 >= 0 && (ic1Var.getLayoutManager() instanceof s4.c0)) {
                        ((s4.c0) ic1Var.getLayoutManager()).h1(i14, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 18:
                nd ndVar = (nd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    ndVar.getClass();
                    break;
                }
                z10 = true;
                ndVar.j0 = z10;
                break;
            case 19:
                nd.W((nd) obj2, (String) obj);
                break;
            case 20:
                nd ndVar2 = (nd) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList4 = ndVar2.f0;
                ndVar2.d0 = false;
                if (tLObject2 != null && ndVar2.getParentActivity() != null) {
                    for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                        ndVar2.K.removeView((View) arrayList4.get(i24));
                    }
                    arrayList4.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i25 = 0;
                    while (i25 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ndVar2.getParentActivity(), new fd(ndVar2, i15), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i25), i25 == tL_messages_chats.chats.size() - 1);
                        arrayList4.add(nVar);
                        ndVar2.L.addView(nVar, w7.a6.n(-1, 72));
                        i25++;
                    }
                    ndVar2.h0();
                    break;
                }
                break;
            case 21:
                le leVar = (le) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                leVar.A0 = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    leVar.B0 = tL_premium_boostsStatus2.level;
                }
                org.telegram.ui.Components.r61 r61Var = leVar.a1;
                if (r61Var != null && (j61Var = r61Var.Y2) != null) {
                    j61Var.N(true);
                    break;
                }
                break;
            case 22:
                ((le) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 23:
                eo eoVar = (eo) obj2;
                org.telegram.ui.Components.k11[] k11VarArr = (org.telegram.ui.Components.k11[]) obj;
                if (!eoVar.kb && (k11Var = k11VarArr[0]) != null) {
                    k11VarArr[0] = null;
                    if (eoVar.v0 == k11Var) {
                        eoVar.v0 = null;
                    }
                    AndroidUtilities.removeFromParent(k11Var);
                    break;
                }
                break;
            case 24:
                ((ua) obj2).run((TLRPC.User) obj);
                break;
            case 25:
                eo eoVar2 = (eo) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                t1Var.getLocationInWindow(new int[2]);
                eoVar2.z1.setTranslationY(t1Var.getTimeY() + ((r1[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                eoVar2.z1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r1[0]) + t1Var.rb) + t1Var.pb) - (t1Var.sb / 2.0f));
                eoVar2.z1.u();
                break;
            case 26:
                eo.M0((eo) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 27:
                eo eoVar3 = (eo) obj2;
                int[] iArr = (int[]) obj;
                eoVar3.getClass();
                if (iArr[0] != 0) {
                    eoVar3.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 28:
                ((eo) obj2).h8((ih) obj);
                break;
            default:
                eo eoVar4 = (eo) obj2;
                nf.f.p(eoVar4.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), eoVar4.f8 == 0, false);
                break;
        }
    }
}
