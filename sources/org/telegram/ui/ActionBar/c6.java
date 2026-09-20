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
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l11;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.bb1;
import org.telegram.ui.bd;
import org.telegram.ui.dc;
import org.telegram.ui.ed;
import org.telegram.ui.fc1;
import org.telegram.ui.h9;
import org.telegram.ui.ke;
import org.telegram.ui.m9;
import org.telegram.ui.md;
import org.telegram.ui.p80;
import org.telegram.ui.ra;
import org.telegram.ui.ta;
import org.telegram.ui.u9;
import org.telegram.ui.v9;
import org.telegram.ui.vb;
import org.telegram.ui.y8;
import org.telegram.ui.yc;
import org.telegram.ui.z6;
import org.telegram.ui.zc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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

    /* JADX WARN: Code restructure failed: missing block: B:263:0x061c, code lost:
    
        r13 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x012f, code lost:
    
        if (r5.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x035b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        xc a02;
        int i11;
        int i12;
        k61 k61Var;
        l11 l11Var;
        int i13 = this.a;
        int i14 = -1;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        boolean z10 = false;
        boolean z11 = false;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                e6 e6Var = (e6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    h6 h6Var = (h6) arrayList2.get(i16);
                    File d = h6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList2.remove(i16);
                        i16--;
                        size--;
                        i16++;
                    }
                    if (!arrayList.contains(h6Var.o)) {
                        arrayList.add(h6Var.o);
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
                    ConnectionsManager.getInstance(e6Var.a).sendRequest(getmultiwallpapers, new ai.v1(20, e6Var, arrayList2));
                    break;
                }
                break;
            case 1:
                e6 e6Var2 = (e6) obj2;
                d6 d6Var = (d6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = d6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = d6Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i18 = 0; i18 < size3; i18++) {
                    h6 h6Var2 = (h6) arrayList3.get(i18);
                    if (h6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = e6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, h6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(h6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new ci.y0((Object) e6Var2, (Object) arrayList4, false, 11));
                break;
            case 2:
                i6 i6Var = (i6) obj2;
                i6Var.d((File) obj, i6Var.h0);
                AndroidUtilities.runOnUIThread(new q(i6Var, 19));
                break;
            case 3:
                ((org.telegram.ui.p) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 4:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) obj2;
                nf.e eVar = (nf.e) obj;
                org.telegram.ui.u3 u3Var = h4Var.K;
                if (u3Var != null) {
                    u3Var.dismiss(true);
                }
                if (h4Var.M0 == eVar) {
                    h4Var.M0 = null;
                    break;
                }
                break;
            case 5:
                ((org.telegram.ui.h4) obj2).R0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 6:
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.p4 p4Var = ((org.telegram.ui.m4) obj2).a;
                if (!arrayList5.isEmpty()) {
                    for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                        p4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList5.get(i19)).longValue(), p4Var.U() * 60);
                    }
                    if (p4Var.U() > 0) {
                        xc.a0(p4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(p4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size()))))).j();
                        break;
                    } else {
                        xc.a0(p4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size())))).j();
                        break;
                    }
                }
                break;
            case 7:
                org.telegram.ui.v5 v5Var = (org.telegram.ui.v5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                v5Var.R = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.P, v5Var.R, new org.telegram.ui.m5(v5Var, 0));
                }
                v5Var.f0.animate().cancel();
                v5Var.f0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.t4(v5Var, i15));
                v5Var.F0(true);
                v5Var.G0(true);
                v5Var.E0(null);
                break;
            case 8:
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
                s4.c1 L = a6Var.b.L(i10);
                if (L != null) {
                    View view = L.a;
                    p80 p80Var = new p80(a6Var.getParentActivity(), a6Var);
                    p80Var.g(true);
                    p80Var.setParentWindow(org.telegram.ui.Components.d5.Q(a6Var, p80Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    p80Var.setCallback(new org.telegram.ui.x5(a6Var, keepMediaException, i15));
                    break;
                }
                break;
            case 9:
                z6.W((z6) obj2, (b2) obj);
                break;
            case 10:
                ti0 ti0Var = new ti0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                ti0Var.m(R.raw.qr_code_logo);
                ti0Var.show();
                break;
            case 11:
                ((y8) obj2).b.j0(((TLRPC.Message) hg.k0.g(1, ((h9) obj).c)).id, 100);
                break;
            case 12:
                v9 v9Var = (v9) obj2;
                String str = (String) obj;
                u9 u9Var = v9Var.L;
                if (u9Var != null) {
                    u9Var.K(str);
                }
                if (v9Var.V != 3) {
                    v9Var.finishFragment();
                    break;
                }
                break;
            case 13:
                v9 v9Var2 = (v9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                v9Var2.f.setText(result.rawMRZ);
                v9Var2.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(qr.f).start();
                u9 u9Var2 = v9Var2.L;
                if (u9Var2 != null) {
                    u9Var2.T0(result);
                }
                AndroidUtilities.runOnUIThread(new m9(v9Var2, 3), 1200L);
                break;
            case 14:
                v9 v9Var3 = (v9) obj2;
                lf.h hVar = (lf.h) obj;
                RectF rectF = (RectF) hVar.c;
                PointF[] pointFArr = (PointF[]) hVar.d;
                RectF rectF2 = v9Var3.I;
                PointF[] pointFArr2 = v9Var3.E;
                RectF rectF3 = v9Var3.J;
                PointF[] pointFArr3 = v9Var3.F;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j3 = v9Var3.K;
                if (j3 == 0) {
                    v9Var3.K = elapsedRealtime - 75;
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
                            v9Var3.K = elapsedRealtime;
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
                    v9Var3.K = elapsedRealtime;
                }
                v9Var3.fragmentView.invalidate();
                break;
            case 15:
                ra.W((ra) obj2, (String) obj);
                break;
            case 16:
                vb vbVar = (vb) obj2;
                xc.a0(vbVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                vbVar.V0();
                break;
            case 17:
                vb vbVar2 = (vb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = xc.a0(vbVar2);
                    i11 = R.raw.msg_antispam;
                    i12 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = xc.a0(vbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                } else {
                    a02 = xc.a0(vbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                }
                org.telegram.messenger.l0.o(i12, a02, i11, 36);
                break;
            case 18:
                dc dcVar = (dc) obj2;
                dcVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                dcVar.I.animate().cancel();
                dcVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.t4(dcVar, 16));
                dcVar.d(true);
                dcVar.c(null);
                break;
            case 19:
                bd bdVar = (bd) obj2;
                bdVar.getClass();
                bdVar.presentFragment(bb1.d0((TLRPC.Chat) obj, true));
                break;
            case 20:
                List list = (List) obj;
                zc zcVar = ((yc) obj2).b;
                int i25 = zcVar.a;
                fc1 fc1Var = zcVar.d;
                ArrayList arrayList7 = zcVar.c;
                if (list != null && !list.isEmpty()) {
                    zcVar.n = true;
                    arrayList7.clear();
                    arrayList7.add(0, new lp((d4) list.get(0)));
                    if (zcVar.v != null && zcVar.f) {
                        arrayList7.add(0, new lp(d4.a(i25)));
                    }
                    f6 f6Var = zcVar.b;
                    int a2 = f6Var != null ? f6Var.a() : j6.I.q();
                    for (int i26 = 1; i26 < list.size(); i26++) {
                        d4 d4Var = (d4) list.get(i26);
                        lp lpVar = new lp(d4Var);
                        d4Var.n(i25);
                        lpVar.c = a2;
                        arrayList7.add(lpVar);
                    }
                    for (int i27 = 0; i27 < arrayList7.size(); i27++) {
                        lp lpVar2 = (lp) arrayList7.get(i27);
                        boolean z12 = TextUtils.equals(zcVar.s, lpVar2.a()) || (TextUtils.isEmpty(zcVar.s) && lpVar2.a.a);
                        lpVar2.d = z12;
                        if (z12) {
                            i14 = i27;
                        }
                    }
                    org.telegram.ui.xc xcVar = zcVar.h;
                    if (xcVar != null) {
                        xcVar.l();
                    }
                    fc1Var.animate().alpha(1.0f).setDuration(150L).start();
                    t00 t00Var = zcVar.e;
                    if (zcVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(t00Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(t00Var, true, 1.0f, true, true);
                    }
                    if (i14 >= 0 && (fc1Var.getLayoutManager() instanceof s4.c0)) {
                        ((s4.c0) fc1Var.getLayoutManager()).h1(i14, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
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
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(mdVar2.getParentActivity(), new ed(mdVar2, z11 ? 1 : 0), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i29), i29 == tL_messages_chats.chats.size() - 1);
                        arrayList8.add(nVar);
                        mdVar2.L.addView(nVar, w7.y5.n(-1, 72));
                        i29++;
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
                s61 s61Var = keVar.a1;
                if (s61Var != null && (k61Var = s61Var.Y2) != null) {
                    k61Var.N(true);
                    break;
                }
                break;
            case 25:
                ((ke) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 26:
                zn znVar = (zn) obj2;
                l11[] l11VarArr = (l11[]) obj;
                if (!znVar.jb && (l11Var = l11VarArr[0]) != null) {
                    l11VarArr[0] = null;
                    if (znVar.v0 == l11Var) {
                        znVar.v0 = null;
                    }
                    AndroidUtilities.removeFromParent(l11Var);
                    break;
                }
                break;
            case 27:
                zn znVar2 = (zn) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                u1Var.getLocationInWindow(new int[2]);
                znVar2.z1.setTranslationY(u1Var.getTimeY() + ((r1[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                znVar2.z1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r1[0]) + u1Var.rb) + u1Var.pb) - (u1Var.sb / 2.0f));
                znVar2.z1.u();
                break;
            case 28:
                zn.E0((zn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            default:
                ((ta) obj2).run((TLRPC.User) obj);
                break;
        }
    }
}
