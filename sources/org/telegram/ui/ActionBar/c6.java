package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
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
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.ji0;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.yc;
import org.telegram.ui.bb1;
import org.telegram.ui.bd;
import org.telegram.ui.cc;
import org.telegram.ui.co;
import org.telegram.ui.ec1;
import org.telegram.ui.ed;
import org.telegram.ui.g9;
import org.telegram.ui.ke;
import org.telegram.ui.l9;
import org.telegram.ui.md;
import org.telegram.ui.p80;
import org.telegram.ui.qa;
import org.telegram.ui.t9;
import org.telegram.ui.ta;
import org.telegram.ui.u9;
import org.telegram.ui.ub;
import org.telegram.ui.x8;
import org.telegram.ui.xc;
import org.telegram.ui.z6;
import org.telegram.ui.zc;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0613, code lost:
    
        r15 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012f, code lost:
    
        if (r3.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x035d A[LOOP:6: B:159:0x035d->B:161:0x0360, LOOP_START, PHI: r7
      0x035d: PHI (r7v6 int) = (r7v13 int), (r7v7 int) binds: [B:156:0x0357, B:161:0x0360] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r8v31, types: [int] */
    /* JADX WARN: Type inference failed for: r8v53 */
    /* JADX WARN: Type inference failed for: r8v54 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        yc a02;
        int i11;
        int i12;
        v51 v51Var;
        w01 w01Var;
        int i13 = this.a;
        int i14 = 19;
        int i15 = -1;
        ?? r15 = 0;
        Bitmap bitmap = null;
        ?? r72 = 0;
        boolean z10 = false;
        int i16 = 0;
        int i17 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                e6 e6Var = (e6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i18 = 0;
                while (i18 < size) {
                    h6 h6Var = (h6) arrayList.get(i18);
                    File d = h6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList.remove(i18);
                        i18--;
                        size--;
                        i18++;
                        r15 = r15;
                    }
                    if (!r15.contains(h6Var.o)) {
                        r15.add(h6Var.o);
                    }
                    i18++;
                    r15 = r15;
                }
                if (r15 != 0) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = r15.size();
                    while (r72 < size2) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) r15.get(r72);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                        r72++;
                    }
                    ConnectionsManager.getInstance(e6Var.a).sendRequest(getmultiwallpapers, new bi.m1(20, e6Var, arrayList));
                    break;
                }
                break;
            case 1:
                e6 e6Var2 = (e6) obj2;
                d6 d6Var = (d6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = d6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList2 = d6Var.b;
                int size3 = arrayList2.size();
                ArrayList arrayList3 = null;
                for (int i19 = 0; i19 < size3; i19++) {
                    h6 h6Var2 = (h6) arrayList2.get(i19);
                    if (h6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = e6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, h6Var2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            arrayList3.add(h6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new di.y0(e6Var2, arrayList3, (boolean) r72, 10));
                break;
            case 2:
                i6 i6Var = (i6) obj2;
                i6Var.d((File) obj, i6Var.h0);
                AndroidUtilities.runOnUIThread(new q(i6Var, i14));
                break;
            case 3:
                ((org.telegram.ui.p) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 4:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) obj2;
                of.e eVar = (of.e) obj;
                org.telegram.ui.v3 v3Var = i4Var.K;
                if (v3Var != null) {
                    v3Var.dismiss(true);
                }
                if (i4Var.M0 == eVar) {
                    i4Var.M0 = null;
                    break;
                }
                break;
            case 5:
                ((org.telegram.ui.i4) obj2).R0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 6:
                ArrayList arrayList4 = (ArrayList) obj;
                org.telegram.ui.q4 q4Var = ((org.telegram.ui.n4) obj2).a;
                if (!arrayList4.isEmpty()) {
                    for (int i20 = 0; i20 < arrayList4.size(); i20++) {
                        q4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList4.get(i20)).longValue(), q4Var.U() * 60);
                    }
                    if (q4Var.U() > 0) {
                        yc.a0(q4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(q4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList4.size(), Integer.valueOf(arrayList4.size()))))).j();
                        break;
                    } else {
                        yc.a0(q4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList4.size(), Integer.valueOf(arrayList4.size())))).j();
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.v5 v5Var = (org.telegram.ui.v5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                v5Var.R = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new org.telegram.ui.m5(v5Var, r72));
                }
                v5Var.f0.animate().cancel();
                v5Var.f0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.s0(v5Var, 4));
                v5Var.F0(true);
                v5Var.G0(true);
                v5Var.E0(null);
                break;
            case 8:
                org.telegram.ui.a6 a6Var = (org.telegram.ui.a6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList5 = a6Var.c;
                int i21 = 0;
                while (true) {
                    if (i21 < arrayList5.size()) {
                        if (((org.telegram.ui.z5) arrayList5.get(i21)).c == null || ((org.telegram.ui.z5) arrayList5.get(i21)).c.dialogId != keepMediaException.dialogId) {
                            i21++;
                        } else {
                            i16 = i21;
                        }
                    }
                }
                s4.c1 K = a6Var.b.K(i16);
                if (K != null) {
                    View view = K.a;
                    p80 p80Var = new p80(a6Var.getParentActivity(), a6Var);
                    p80Var.g(true);
                    p80Var.setParentWindow(org.telegram.ui.Components.e5.Q(a6Var, p80Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    p80Var.setCallback(new org.telegram.ui.x5(a6Var, keepMediaException, i17));
                    break;
                }
                break;
            case 9:
                z6.Y((z6) obj2, (b2) obj);
                break;
            case 10:
                ji0 ji0Var = new ji0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                ji0Var.m(R.raw.qr_code_logo);
                ji0Var.show();
                break;
            case 11:
                ((x8) obj2).b.j0(((TLRPC.Message) i2.g.h(1, ((g9) obj).c)).id, 100);
                break;
            case 12:
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
            case 13:
                u9 u9Var2 = (u9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                u9Var2.f.setText(result.rawMRZ);
                u9Var2.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(pr.f).start();
                t9 t9Var2 = u9Var2.L;
                if (t9Var2 != null) {
                    t9Var2.W0(result);
                }
                AndroidUtilities.runOnUIThread(new l9(u9Var2, 3), 1200L);
                break;
            case 14:
                u9 u9Var3 = (u9) obj2;
                m2.t tVar = (m2.t) obj;
                RectF rectF = (RectF) tVar.c;
                PointF[] pointFArr = (PointF[]) tVar.d;
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
                        for (int i22 = 0; i22 < 4; i22++) {
                            PointF pointF = pointFArr2[i22];
                            PointF pointF2 = pointFArr[i22];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i22];
                            PointF pointF4 = pointFArr[i22];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j10 = elapsedRealtime - j3;
                        if (j10 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j10 / 75.0f));
                            AndroidUtilities.lerp(rectF2, rectF3, min, rectF2);
                            for (int i23 = 0; i23 < 4; i23++) {
                                PointF pointF5 = pointFArr2[i23];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i23].x, min), AndroidUtilities.lerp(pointFArr2[i23].y, pointFArr3[i23].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                u9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i24 = 0; i24 < 4; i24++) {
                                    PointF pointF6 = pointFArr3[i24];
                                    PointF pointF7 = pointFArr[i24];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            u9Var3.K = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i25 = 0; i25 < 4; i25++) {
                        PointF pointF8 = pointFArr2[i25];
                        PointF pointF9 = pointFArr3[i25];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    u9Var3.K = elapsedRealtime;
                }
                u9Var3.fragmentView.invalidate();
                break;
            case 15:
                qa.W((qa) obj2, (String) obj);
                break;
            case 16:
                ub ubVar = (ub) obj2;
                yc.a0(ubVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                ubVar.W0();
                break;
            case 17:
                ub ubVar2 = (ub) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = yc.a0(ubVar2);
                    i11 = R.raw.msg_antispam;
                    i12 = R.string.ChannelAntiSpamFalsePositiveReported;
                    i10 = 36;
                } else {
                    i10 = 36;
                    if (tLObject instanceof TLRPC.TL_boolFalse) {
                        a02 = yc.a0(ubVar2);
                        i11 = R.raw.error;
                        i12 = R.string.UnknownError;
                    } else {
                        a02 = yc.a0(ubVar2);
                        i11 = R.raw.error;
                        i12 = R.string.UnknownError;
                    }
                }
                org.telegram.messenger.w1.o(i12, a02, i11, i10);
                break;
            case 18:
                cc ccVar = (cc) obj2;
                ccVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                ccVar.I.animate().cancel();
                ccVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.s0(ccVar, i14));
                ccVar.d(true);
                ccVar.c(null);
                break;
            case 19:
                bd bdVar = (bd) obj2;
                bdVar.getClass();
                bdVar.presentFragment(bb1.d0((TLRPC.Chat) obj, true));
                break;
            case 20:
                List list = (List) obj;
                zc zcVar = ((org.telegram.ui.yc) obj2).b;
                int i26 = zcVar.a;
                ec1 ec1Var = zcVar.d;
                ArrayList arrayList6 = zcVar.c;
                if (list != null && !list.isEmpty()) {
                    zcVar.n = true;
                    arrayList6.clear();
                    arrayList6.add(0, new kp((d4) list.get(0)));
                    if (zcVar.v != null && zcVar.f) {
                        arrayList6.add(0, new kp(d4.a(i26)));
                    }
                    f6 f6Var = zcVar.b;
                    ?? a2 = f6Var != null ? f6Var.a() : j6.I.q();
                    for (int i27 = 1; i27 < list.size(); i27++) {
                        d4 d4Var = (d4) list.get(i27);
                        kp kpVar = new kp(d4Var);
                        d4Var.n(i26);
                        kpVar.c = a2;
                        arrayList6.add(kpVar);
                    }
                    for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                        kp kpVar2 = (kp) arrayList6.get(i28);
                        boolean z11 = TextUtils.equals(zcVar.s, kpVar2.a()) || (TextUtils.isEmpty(zcVar.s) && kpVar2.a.a);
                        kpVar2.d = z11;
                        if (z11) {
                            i15 = i28;
                        }
                    }
                    xc xcVar = zcVar.h;
                    if (xcVar != null) {
                        xcVar.l();
                    }
                    ec1Var.animate().alpha(1.0f).setDuration(150L).start();
                    t00 t00Var = zcVar.e;
                    if (zcVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(t00Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(t00Var, true, 1.0f, true, true);
                    }
                    if (i15 >= 0 && (ec1Var.getLayoutManager() instanceof s4.c0)) {
                        ((s4.c0) ec1Var.getLayoutManager()).h1(i15, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 21:
                md mdVar = (md) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    mdVar.getClass();
                    break;
                }
                z10 = true;
                mdVar.j0 = z10;
                break;
            case 22:
                md.W((md) obj2, (String) obj);
                break;
            case 23:
                md mdVar2 = (md) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList7 = mdVar2.f0;
                mdVar2.d0 = false;
                if (tLObject2 != null && mdVar2.getParentActivity() != null) {
                    for (int i29 = 0; i29 < arrayList7.size(); i29++) {
                        mdVar2.K.removeView((View) arrayList7.get(i29));
                    }
                    arrayList7.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i30 = 0;
                    while (i30 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(mdVar2.getParentActivity(), new ed(mdVar2, r72), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i30), i30 == tL_messages_chats.chats.size() - 1);
                        arrayList7.add(nVar);
                        mdVar2.L.addView(nVar, w7.x5.n(-1, 72));
                        i30++;
                    }
                    mdVar2.h0();
                    break;
                }
                break;
            case 24:
                ke keVar = (ke) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                keVar.A0 = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    keVar.B0 = tL_premium_boostsStatus2.level;
                }
                d61 d61Var = keVar.a1;
                if (d61Var != null && (v51Var = d61Var.Y2) != null) {
                    v51Var.N(true);
                    break;
                }
                break;
            case 25:
                ((ke) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 26:
                co coVar = (co) obj2;
                w01[] w01VarArr = (w01[]) obj;
                if (!coVar.kb && (w01Var = w01VarArr[0]) != null) {
                    w01VarArr[0] = null;
                    if (coVar.v0 == w01Var) {
                        coVar.v0 = null;
                    }
                    AndroidUtilities.removeFromParent(w01Var);
                    break;
                }
                break;
            case 27:
                ((ta) obj2).run((TLRPC.User) obj);
                break;
            case 28:
                co coVar2 = (co) obj2;
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) obj;
                t1Var.getLocationInWindow(new int[2]);
                coVar2.z1.setTranslationY(t1Var.getTimeY() + ((r1[1] - r4.getTop()) - AndroidUtilities.dp(120.0f)));
                coVar2.z1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r1[0]) + t1Var.rb) + t1Var.pb) - (t1Var.sb / 2.0f));
                coVar2.z1.u();
                break;
            default:
                co.M0((co) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
        }
    }
}
