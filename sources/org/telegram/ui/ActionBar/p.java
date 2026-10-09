package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
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
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.c21;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.bb1;
import org.telegram.ui.bd;
import org.telegram.ui.cc;
import org.telegram.ui.ed;
import org.telegram.ui.f9;
import org.telegram.ui.fc1;
import org.telegram.ui.k9;
import org.telegram.ui.ke;
import org.telegram.ui.md;
import org.telegram.ui.p80;
import org.telegram.ui.ra;
import org.telegram.ui.u9;
import org.telegram.ui.v9;
import org.telegram.ui.vb;
import org.telegram.ui.w8;
import org.telegram.ui.xc;
import org.telegram.ui.y6;
import org.telegram.ui.yc;
import org.telegram.ui.zc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:261:0x061a, code lost:
    
        r13 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0127, code lost:
    
        if (r5.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03a1  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        ad a02;
        int i11;
        int i12;
        c71 c71Var;
        c21 c21Var;
        int i13 = this.a;
        int i14 = -1;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                n2 n2Var = (n2) obj2;
                n2 n2Var2 = (n2) obj;
                Drawable drawable = ActionBarLayout.p1;
                if (n2Var != null) {
                    n2Var.onTransitionAnimationEnd(false, false);
                }
                n2Var2.onTransitionAnimationEnd(true, false);
                n2Var2.onBecomeFullyVisible();
                break;
            case 1:
                d6 d6Var = (d6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    g6 g6Var = (g6) arrayList2.get(i16);
                    File d = g6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList2.remove(i16);
                        i16--;
                        size--;
                        i16++;
                    }
                    if (!arrayList.contains(g6Var.o)) {
                        arrayList.add(g6Var.o);
                    }
                    i16++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = arrayList.size();
                    for (int i17 = 0; i17 < size2; i17++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i17);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(d6Var.a).sendRequest(getmultiwallpapers, new ai.v1(20, d6Var, arrayList2));
                    break;
                }
                break;
            case 2:
                d6 d6Var2 = (d6) obj2;
                c6 c6Var = (c6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = c6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = c6Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i18 = 0; i18 < size3; i18++) {
                    g6 g6Var2 = (g6) arrayList3.get(i18);
                    if (g6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = d6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, g6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(g6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new ci.x0((Object) d6Var2, (Object) arrayList4, false, 11));
                break;
            case 3:
                h6 h6Var = (h6) obj2;
                h6Var.d((File) obj, h6Var.h0);
                AndroidUtilities.runOnUIThread(new q(h6Var, 19));
                break;
            case 4:
                ((org.telegram.ui.q) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 5:
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
            case 6:
                ((org.telegram.ui.i4) obj2).R0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 7:
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.p4 p4Var = ((org.telegram.ui.m4) obj2).a;
                if (!arrayList5.isEmpty()) {
                    for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                        p4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList5.get(i19)).longValue(), p4Var.U() * 60);
                    }
                    if (p4Var.U() > 0) {
                        ad.a0(p4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(p4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size()))))).j();
                        break;
                    } else {
                        ad.a0(p4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size())))).j();
                        break;
                    }
                }
                break;
            case 8:
                org.telegram.ui.v5 v5Var = (org.telegram.ui.v5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                v5Var.R = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new org.telegram.ui.m5(v5Var, z11 ? 1 : 0));
                }
                v5Var.f0.animate().cancel();
                v5Var.f0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.t4(v5Var, i15));
                v5Var.G0(true);
                v5Var.H0(true);
                v5Var.F0(null);
                break;
            case 9:
                org.telegram.ui.a6 a6Var = (org.telegram.ui.a6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList6 = a6Var.c;
                int i20 = 0;
                while (true) {
                    if (i20 >= arrayList6.size()) {
                        i10 = 0;
                    } else if (((org.telegram.ui.z5) arrayList6.get(i20)).c == null || ((org.telegram.ui.z5) arrayList6.get(i20)).c.dialogId != keepMediaException.dialogId) {
                        i20++;
                    } else {
                        i10 = i20;
                    }
                }
                s4.d1 K = a6Var.b.K(i10);
                if (K != null) {
                    View view = K.a;
                    p80 p80Var = new p80(a6Var.getParentActivity(), a6Var);
                    p80Var.g(true);
                    p80Var.setParentWindow(org.telegram.ui.Components.g5.P(a6Var, p80Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    p80Var.setCallback(new org.telegram.ui.x5(a6Var, keepMediaException, i15));
                    break;
                }
                break;
            case 10:
                y6.Y((y6) obj2, (b2) obj);
                break;
            case 11:
                oj0 oj0Var = new oj0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                oj0Var.o(R.raw.qr_code_logo);
                oj0Var.show();
                break;
            case 12:
                ((w8) obj2).b.j0(((TLRPC.Message) hg.c.g(1, ((f9) obj).c)).id, 100);
                break;
            case 13:
                v9 v9Var = (v9) obj2;
                la.h hVar = (la.h) obj;
                RectF rectF = (RectF) hVar.c;
                PointF[] pointFArr = (PointF[]) hVar.d;
                RectF rectF2 = v9Var.J;
                PointF[] pointFArr2 = v9Var.F;
                RectF rectF3 = v9Var.K;
                PointF[] pointFArr3 = v9Var.G;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = v9Var.L;
                if (j3 == 0) {
                    v9Var.L = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        v9.d0(rectF, pointFArr2);
                        v9.d0(rectF, pointFArr3);
                    } else {
                        for (int i21 = 0; i21 < 4; i21++) {
                            PointF pointF = pointFArr2[i21];
                            PointF pointF2 = pointFArr[i21];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i21];
                            PointF pointF4 = pointFArr[i21];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j10 = elapsedRealtime - j3;
                        if (j10 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j10 / 75.0f));
                            AndroidUtilities.lerp(rectF2, rectF3, min, rectF2);
                            for (int i22 = 0; i22 < 4; i22++) {
                                PointF pointF5 = pointFArr2[i22];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i22].x, min), AndroidUtilities.lerp(pointFArr2[i22].y, pointFArr3[i22].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                v9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i23 = 0; i23 < 4; i23++) {
                                    PointF pointF6 = pointFArr3[i23];
                                    PointF pointF7 = pointFArr[i23];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            v9Var.L = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i24 = 0; i24 < 4; i24++) {
                        PointF pointF8 = pointFArr2[i24];
                        PointF pointF9 = pointFArr3[i24];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    v9Var.L = elapsedRealtime;
                }
                v9Var.fragmentView.invalidate();
                break;
            case 14:
                v9 v9Var2 = (v9) obj2;
                String str = (String) obj;
                u9 u9Var = v9Var2.M;
                if (u9Var != null) {
                    u9Var.K(str);
                }
                if (v9Var2.X != 3) {
                    v9Var2.finishFragment();
                    break;
                }
                break;
            case 15:
                v9 v9Var3 = (v9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                v9Var3.f.setText(result.rawMRZ);
                v9Var3.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(hs.f).start();
                u9 u9Var2 = v9Var3.M;
                if (u9Var2 != null) {
                    u9Var2.P0(result);
                }
                AndroidUtilities.runOnUIThread(new k9(v9Var3, 3), 1200L);
                break;
            case 16:
                ra.W((ra) obj2, (String) obj);
                break;
            case 17:
                vb vbVar = (vb) obj2;
                ad.a0(vbVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                vbVar.V0();
                break;
            case 18:
                vb vbVar2 = (vb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = ad.a0(vbVar2);
                    i11 = R.raw.msg_antispam;
                    i12 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = ad.a0(vbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                } else {
                    a02 = ad.a0(vbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                }
                org.telegram.messenger.q.q(i12, a02, i11, 36);
                break;
            case 19:
                cc ccVar = (cc) obj2;
                ccVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                ccVar.I.animate().cancel();
                ccVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.t4(ccVar, 16));
                ccVar.d(true);
                ccVar.c(null);
                break;
            case 20:
                bd bdVar = (bd) obj2;
                bdVar.getClass();
                bdVar.presentFragment(bb1.d0((TLRPC.Chat) obj, true));
                break;
            case 21:
                List list = (List) obj;
                zc zcVar = ((yc) obj2).b;
                int i25 = zcVar.a;
                fc1 fc1Var = zcVar.d;
                ArrayList arrayList7 = zcVar.c;
                if (list != null && !list.isEmpty()) {
                    zcVar.n = true;
                    arrayList7.clear();
                    arrayList7.add(0, new bq((c4) list.get(0)));
                    if (zcVar.v != null && zcVar.f) {
                        arrayList7.add(0, new bq(c4.a(i25)));
                    }
                    e6 e6Var = zcVar.b;
                    int a2 = e6Var != null ? e6Var.a() : i6.I.q();
                    for (int i26 = 1; i26 < list.size(); i26++) {
                        c4 c4Var = (c4) list.get(i26);
                        bq bqVar = new bq(c4Var);
                        c4Var.n(i25);
                        bqVar.c = a2;
                        arrayList7.add(bqVar);
                    }
                    for (int i27 = 0; i27 < arrayList7.size(); i27++) {
                        bq bqVar2 = (bq) arrayList7.get(i27);
                        boolean z13 = TextUtils.equals(zcVar.s, bqVar2.a()) || (TextUtils.isEmpty(zcVar.s) && bqVar2.a.a);
                        bqVar2.d = z13;
                        if (z13) {
                            i14 = i27;
                        }
                    }
                    xc xcVar = zcVar.h;
                    if (xcVar != null) {
                        xcVar.l();
                    }
                    fc1Var.animate().alpha(1.0f).setDuration(150L).start();
                    j10 j10Var = zcVar.e;
                    if (zcVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(j10Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(j10Var, true, 1.0f, true, true);
                    }
                    if (i14 >= 0 && (fc1Var.getLayoutManager() instanceof s4.d0)) {
                        ((s4.d0) fc1Var.getLayoutManager()).h1(i14, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 22:
                md mdVar = (md) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    mdVar.getClass();
                    break;
                }
                z10 = true;
                mdVar.j0 = z10;
                break;
            case 23:
                md.W((md) obj2, (String) obj);
                break;
            case 24:
                md mdVar2 = (md) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList8 = mdVar2.f0;
                mdVar2.d0 = false;
                if (tLObject2 != null && mdVar2.getParentActivity() != null) {
                    for (int i28 = 0; i28 < arrayList8.size(); i28++) {
                        mdVar2.K.removeView((View) arrayList8.get(i28));
                    }
                    arrayList8.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i29 = 0;
                    while (i29 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(mdVar2.getParentActivity(), new ed(mdVar2, z12 ? 1 : 0), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i29), i29 == tL_messages_chats.chats.size() - 1);
                        arrayList8.add(nVar);
                        mdVar2.L.addView(nVar, w7.x5.n(-1, 72));
                        i29++;
                    }
                    mdVar2.h0();
                    break;
                }
                break;
            case 25:
                ke keVar = (ke) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                keVar.A0 = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    keVar.B0 = tL_premium_boostsStatus2.level;
                }
                k71 k71Var = keVar.a1;
                if (k71Var != null && (c71Var = k71Var.W2) != null) {
                    c71Var.N(true);
                    break;
                }
                break;
            case 26:
                ((ke) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 27:
                zn znVar = (zn) obj2;
                c21[] c21VarArr = (c21[]) obj;
                if (!znVar.kb && (c21Var = c21VarArr[0]) != null) {
                    c21VarArr[0] = null;
                    if (znVar.v0 == c21Var) {
                        znVar.v0 = null;
                    }
                    AndroidUtilities.removeFromParent(c21Var);
                    break;
                }
                break;
            case 28:
                zn znVar2 = (zn) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                u1Var.getLocationInWindow(new int[2]);
                znVar2.z1.setTranslationY(u1Var.getTimeY() + ((r1[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                znVar2.z1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r1[0]) + u1Var.rb) + u1Var.pb) - (u1Var.sb / 2.0f));
                znVar2.z1.u();
                break;
            default:
                zn.L0((zn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
        }
    }
}
