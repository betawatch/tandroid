package org.telegram.ui;

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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class m4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m4(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x01aa, code lost:
    
        if (r6.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L80;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03d7  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03db  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        org.telegram.ui.Components.xc a02;
        int i11;
        int i12;
        org.telegram.ui.Components.v51 v51Var;
        org.telegram.ui.Components.w01 w01Var;
        int i13 = this.a;
        int i14 = -1;
        int i15 = 0;
        boolean z10 = false;
        boolean z11 = true;
        boolean z12 = true;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                q4 q4Var = ((n4) obj2).a;
                if (!arrayList.isEmpty()) {
                    for (int i16 = 0; i16 < arrayList.size(); i16++) {
                        q4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList.get(i16)).longValue(), q4Var.U() * 60);
                    }
                    if (q4Var.U() > 0) {
                        org.telegram.ui.Components.xc.a0(q4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(q4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size()))))).j();
                        break;
                    } else {
                        org.telegram.ui.Components.xc.a0(q4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList.size(), Integer.valueOf(arrayList.size())))).j();
                        break;
                    }
                }
                break;
            case 1:
                w5 w5Var = (w5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                w5Var.R = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    w5Var.getMessagesController().getBoostsController().userCanBoostChannel(w5Var.P, w5Var.R, new n5(w5Var, 0));
                }
                w5Var.f0.animate().cancel();
                w5Var.f0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new u4((Object) w5Var, (int) (z11 ? 1 : 0)));
                w5Var.F0(true);
                w5Var.G0(true);
                w5Var.E0(null);
                break;
            case 2:
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
                    m80 m80Var = new m80(b6Var.getParentActivity(), b6Var);
                    m80Var.g(true);
                    m80Var.setParentWindow(org.telegram.ui.Components.e5.Q(b6Var, m80Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    m80Var.setCallback(new y5(b6Var, keepMediaException, z12 ? 1 : 0));
                    break;
                }
                break;
            case 3:
                z6.Y((z6) obj2, (org.telegram.ui.ActionBar.b2) obj);
                break;
            case 4:
                org.telegram.ui.Components.ki0 ki0Var = new org.telegram.ui.Components.ki0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                ki0Var.m(R.raw.qr_code_logo);
                ki0Var.show();
                break;
            case 5:
                ((x8) obj2).b.j0(((TLRPC.Message) hg.c.h(1, ((g9) obj).c)).id, 100);
                break;
            case 6:
                u9 u9Var = (u9) obj2;
                String str = (String) obj;
                t9 t9Var = u9Var.L;
                if (t9Var != null) {
                    t9Var.K(str);
                }
                if (u9Var.V != 3) {
                    u9Var.finishFragment();
                    break;
                }
                break;
            case 7:
                u9 u9Var2 = (u9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                u9Var2.f.setText(result.rawMRZ);
                u9Var2.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(org.telegram.ui.Components.rr.f).start();
                t9 t9Var2 = u9Var2.L;
                if (t9Var2 != null) {
                    t9Var2.T0(result);
                }
                AndroidUtilities.runOnUIThread(new l9(u9Var2, 3), 1200L);
                break;
            case 8:
                u9 u9Var3 = (u9) obj2;
                lf.i iVar = (lf.i) obj;
                RectF rectF = (RectF) iVar.c;
                PointF[] pointFArr = (PointF[]) iVar.d;
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
            case 9:
                qa.W((qa) obj2, (String) obj);
                break;
            case 10:
                ub ubVar = (ub) obj2;
                org.telegram.ui.Components.xc.a0(ubVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                ubVar.V0();
                break;
            case 11:
                ub ubVar2 = (ub) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = org.telegram.ui.Components.xc.a0(ubVar2);
                    i11 = R.raw.msg_antispam;
                    i12 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = org.telegram.ui.Components.xc.a0(ubVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                } else {
                    a02 = org.telegram.ui.Components.xc.a0(ubVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                }
                org.telegram.messenger.z0.o(i12, a02, i11, 36);
                break;
            case 12:
                bc bcVar = (bc) obj2;
                bcVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                bcVar.I.animate().cancel();
                bcVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new u4(bcVar, 16));
                bcVar.d(true);
                bcVar.c(null);
                break;
            case 13:
                ad adVar = (ad) obj2;
                adVar.getClass();
                adVar.presentFragment(ra1.d0((TLRPC.Chat) obj, true));
                break;
            case 14:
                List list = (List) obj;
                yc ycVar = ((xc) obj2).b;
                int i21 = ycVar.a;
                wb1 wb1Var = ycVar.d;
                ArrayList arrayList3 = ycVar.c;
                if (list != null && !list.isEmpty()) {
                    ycVar.n = true;
                    arrayList3.clear();
                    arrayList3.add(0, new org.telegram.ui.Components.mp((org.telegram.ui.ActionBar.c4) list.get(0)));
                    if (ycVar.v != null && ycVar.f) {
                        arrayList3.add(0, new org.telegram.ui.Components.mp(org.telegram.ui.ActionBar.c4.a(i21)));
                    }
                    org.telegram.ui.ActionBar.d6 d6Var = ycVar.b;
                    int a2 = d6Var != null ? d6Var.a() : org.telegram.ui.ActionBar.h6.I.q();
                    for (int i22 = 1; i22 < list.size(); i22++) {
                        org.telegram.ui.ActionBar.c4 c4Var = (org.telegram.ui.ActionBar.c4) list.get(i22);
                        org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(c4Var);
                        c4Var.n(i21);
                        mpVar.c = a2;
                        arrayList3.add(mpVar);
                    }
                    for (int i23 = 0; i23 < arrayList3.size(); i23++) {
                        org.telegram.ui.Components.mp mpVar2 = (org.telegram.ui.Components.mp) arrayList3.get(i23);
                        boolean z13 = TextUtils.equals(ycVar.s, mpVar2.a()) || (TextUtils.isEmpty(ycVar.s) && mpVar2.a.a);
                        mpVar2.d = z13;
                        if (z13) {
                            i14 = i23;
                        }
                    }
                    wc wcVar = ycVar.h;
                    if (wcVar != null) {
                        wcVar.l();
                    }
                    wb1Var.animate().alpha(1.0f).setDuration(150L).start();
                    org.telegram.ui.Components.u00 u00Var = ycVar.e;
                    if (ycVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(u00Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(u00Var, true, 1.0f, true, true);
                    }
                    if (i14 >= 0 && (wb1Var.getLayoutManager() instanceof s4.c0)) {
                        ((s4.c0) wb1Var.getLayoutManager()).h1(i14, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 15:
                ld ldVar = (ld) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    ldVar.getClass();
                    break;
                }
                z10 = true;
                ldVar.j0 = z10;
                break;
            case 16:
                ld.W((ld) obj2, (String) obj);
                break;
            case 17:
                ld ldVar2 = (ld) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList4 = ldVar2.f0;
                ldVar2.d0 = false;
                if (tLObject2 != null && ldVar2.getParentActivity() != null) {
                    for (int i24 = 0; i24 < arrayList4.size(); i24++) {
                        ldVar2.K.removeView((View) arrayList4.get(i24));
                    }
                    arrayList4.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i25 = 0;
                    while (i25 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ldVar2.getParentActivity(), new dd(ldVar2, i15), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i25), i25 == tL_messages_chats.chats.size() - 1);
                        arrayList4.add(nVar);
                        ldVar2.L.addView(nVar, w7.x5.n(-1, 72));
                        i25++;
                    }
                    ldVar2.h0();
                    break;
                }
                break;
            case 18:
                je jeVar = (je) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                jeVar.A0 = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    jeVar.B0 = tL_premium_boostsStatus2.level;
                }
                org.telegram.ui.Components.d61 d61Var = jeVar.a1;
                if (d61Var != null && (v51Var = d61Var.Y2) != null) {
                    v51Var.N(true);
                    break;
                }
                break;
            case 19:
                ((je) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 20:
                xn xnVar = (xn) obj2;
                org.telegram.ui.Components.w01[] w01VarArr = (org.telegram.ui.Components.w01[]) obj;
                if (!xnVar.jb && (w01Var = w01VarArr[0]) != null) {
                    w01VarArr[0] = null;
                    if (xnVar.v0 == w01Var) {
                        xnVar.v0 = null;
                    }
                    AndroidUtilities.removeFromParent(w01Var);
                    break;
                }
                break;
            case 21:
                ((sa) obj2).run((TLRPC.User) obj);
                break;
            case 22:
                xn xnVar2 = (xn) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                t1Var.getLocationInWindow(new int[2]);
                xnVar2.z1.setTranslationY(t1Var.getTimeY() + ((r1[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                xnVar2.z1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r1[0]) + t1Var.rb) + t1Var.pb) - (t1Var.sb / 2.0f));
                xnVar2.z1.u();
                break;
            case 23:
                xn.M0((xn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 24:
                xn xnVar3 = (xn) obj2;
                int[] iArr = (int[]) obj;
                xnVar3.getClass();
                if (iArr[0] != 0) {
                    xnVar3.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
            case 25:
                ((xn) obj2).h8((fh) obj);
                break;
            case 26:
                xn xnVar4 = (xn) obj2;
                nf.f.p(xnVar4.getParentActivity(), Uri.parse(((TLRPC.TL_bankCardOpenUrl) obj).url), xnVar4.f8 == 0, false);
                break;
            case 27:
                ((xn) obj2).ka((TLRPC.Chat) obj);
                break;
            case 28:
                xn.e0((xn) obj2, (TLRPC.TL_messages_sendScheduledMessages) obj);
                break;
            default:
                xn xnVar5 = (xn) obj2;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj;
                if (tL_error2.text.startsWith("SLOWMODE_WAIT_")) {
                    org.telegram.ui.Components.e5.w0(xnVar5, LocaleController.getString(R.string.SlowmodeSendError));
                    break;
                } else if (tL_error2.text.equals("CHAT_SEND_MEDIA_FORBIDDEN")) {
                    org.telegram.ui.Components.e5.w0(xnVar5, LocaleController.getString(R.string.AttachMediaRestrictedForever));
                    break;
                } else {
                    org.telegram.ui.Components.e5.w0(xnVar5, tL_error2.text);
                    break;
                }
        }
    }
}
