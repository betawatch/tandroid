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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.k11;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ad;
import org.telegram.ui.bc;
import org.telegram.ui.dd;
import org.telegram.ui.g9;
import org.telegram.ui.je;
import org.telegram.ui.k80;
import org.telegram.ui.l9;
import org.telegram.ui.ld;
import org.telegram.ui.qa;
import org.telegram.ui.sa;
import org.telegram.ui.sa1;
import org.telegram.ui.t9;
import org.telegram.ui.u9;
import org.telegram.ui.ub;
import org.telegram.ui.wb1;
import org.telegram.ui.wc;
import org.telegram.ui.wn;
import org.telegram.ui.x8;
import org.telegram.ui.yc;
import org.telegram.ui.z6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class a6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a6(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0146, code lost:
    
        if (r6.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0372  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        xc a02;
        int i11;
        int i12;
        j61 j61Var;
        k11 k11Var;
        int i13 = this.a;
        int i14 = -1;
        Bitmap bitmap = null;
        boolean z10 = false;
        boolean z11 = false;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                c6 c6Var = (c6) obj2;
                b6 b6Var = (b6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = b6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList = b6Var.b;
                int size = arrayList.size();
                ArrayList arrayList2 = null;
                for (int i16 = 0; i16 < size; i16++) {
                    f6 f6Var = (f6) arrayList.get(i16);
                    if (f6Var.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = c6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, f6Var);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            arrayList2.add(f6Var);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new ci.y0((Object) c6Var, (Object) arrayList2, false, 11));
                break;
            case 1:
                g6 g6Var = (g6) obj2;
                g6Var.d((File) obj, g6Var.h0);
                AndroidUtilities.runOnUIThread(new p(g6Var, 19));
                break;
            case 2:
                ((org.telegram.ui.q) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 3:
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
            case 4:
                ((org.telegram.ui.i4) obj2).R0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 5:
                ArrayList arrayList3 = (ArrayList) obj;
                org.telegram.ui.p4 p4Var = ((org.telegram.ui.m4) obj2).a;
                if (!arrayList3.isEmpty()) {
                    for (int i17 = 0; i17 < arrayList3.size(); i17++) {
                        p4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList3.get(i17)).longValue(), p4Var.U() * 60);
                    }
                    if (p4Var.U() > 0) {
                        xc.a0(p4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(p4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList3.size(), Integer.valueOf(arrayList3.size()))))).j();
                        break;
                    } else {
                        xc.a0(p4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList3.size(), Integer.valueOf(arrayList3.size())))).j();
                        break;
                    }
                }
                break;
            case 6:
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
            case 7:
                org.telegram.ui.a6 a6Var = (org.telegram.ui.a6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList4 = a6Var.c;
                int i18 = 0;
                while (true) {
                    if (i18 >= arrayList4.size()) {
                        i10 = 0;
                    } else if (((org.telegram.ui.z5) arrayList4.get(i18)).c == null || ((org.telegram.ui.z5) arrayList4.get(i18)).c.dialogId != keepMediaException.dialogId) {
                        i18++;
                    } else {
                        i10 = i18;
                    }
                }
                s4.c1 K = a6Var.b.K(i10);
                if (K != null) {
                    View view = K.a;
                    k80 k80Var = new k80(a6Var.getParentActivity(), a6Var);
                    k80Var.g(true);
                    k80Var.setParentWindow(org.telegram.ui.Components.e5.Q(a6Var, k80Var, view, view.getMeasuredWidth() / 2.0f, view.getMeasuredHeight() / 2.0f));
                    k80Var.setCallback(new org.telegram.ui.x5(a6Var, keepMediaException, i15));
                    break;
                }
                break;
            case 8:
                z6.Y((z6) obj2, (a2) obj);
                break;
            case 9:
                ui0 ui0Var = new ui0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                ui0Var.m(R.raw.qr_code_logo);
                ui0Var.show();
                break;
            case 10:
                ((x8) obj2).b.j0(((TLRPC.Message) hg.c.g(1, ((g9) obj).c)).id, 100);
                break;
            case 11:
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
            case 12:
                u9 u9Var2 = (u9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                u9Var2.f.setText(result.rawMRZ);
                u9Var2.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(rr.f).start();
                t9 t9Var2 = u9Var2.L;
                if (t9Var2 != null) {
                    t9Var2.T0(result);
                }
                AndroidUtilities.runOnUIThread(new l9(u9Var2, 3), 1200L);
                break;
            case 13:
                u9 u9Var3 = (u9) obj2;
                la.h hVar = (la.h) obj;
                RectF rectF = (RectF) hVar.c;
                PointF[] pointFArr = (PointF[]) hVar.d;
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
                        for (int i19 = 0; i19 < 4; i19++) {
                            PointF pointF = pointFArr2[i19];
                            PointF pointF2 = pointFArr[i19];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i19];
                            PointF pointF4 = pointFArr[i19];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j10 = elapsedRealtime - j3;
                        if (j10 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j10 / 75.0f));
                            AndroidUtilities.lerp(rectF2, rectF3, min, rectF2);
                            for (int i20 = 0; i20 < 4; i20++) {
                                PointF pointF5 = pointFArr2[i20];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i20].x, min), AndroidUtilities.lerp(pointFArr2[i20].y, pointFArr3[i20].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                u9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i21 = 0; i21 < 4; i21++) {
                                    PointF pointF6 = pointFArr3[i21];
                                    PointF pointF7 = pointFArr[i21];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            u9Var3.K = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i22 = 0; i22 < 4; i22++) {
                        PointF pointF8 = pointFArr2[i22];
                        PointF pointF9 = pointFArr3[i22];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    u9Var3.K = elapsedRealtime;
                }
                u9Var3.fragmentView.invalidate();
                break;
            case 14:
                qa.W((qa) obj2, (String) obj);
                break;
            case 15:
                ub ubVar = (ub) obj2;
                xc.a0(ubVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                ubVar.V0();
                break;
            case 16:
                ub ubVar2 = (ub) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = xc.a0(ubVar2);
                    i11 = R.raw.msg_antispam;
                    i12 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = xc.a0(ubVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                } else {
                    a02 = xc.a0(ubVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                }
                org.telegram.messenger.f0.p(i12, a02, i11, 36);
                break;
            case 17:
                bc bcVar = (bc) obj2;
                bcVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                bcVar.I.animate().cancel();
                bcVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.t4(bcVar, 16));
                bcVar.d(true);
                bcVar.c(null);
                break;
            case 18:
                ad adVar = (ad) obj2;
                adVar.getClass();
                adVar.presentFragment(sa1.d0((TLRPC.Chat) obj, true));
                break;
            case 19:
                List list = (List) obj;
                yc ycVar = ((org.telegram.ui.xc) obj2).b;
                int i23 = ycVar.a;
                wb1 wb1Var = ycVar.d;
                ArrayList arrayList5 = ycVar.c;
                if (list != null && !list.isEmpty()) {
                    ycVar.n = true;
                    arrayList5.clear();
                    arrayList5.add(0, new mp((b4) list.get(0)));
                    if (ycVar.v != null && ycVar.f) {
                        arrayList5.add(0, new mp(b4.a(i23)));
                    }
                    d6 d6Var = ycVar.b;
                    int a2 = d6Var != null ? d6Var.a() : h6.I.q();
                    for (int i24 = 1; i24 < list.size(); i24++) {
                        b4 b4Var = (b4) list.get(i24);
                        mp mpVar = new mp(b4Var);
                        b4Var.n(i23);
                        mpVar.c = a2;
                        arrayList5.add(mpVar);
                    }
                    for (int i25 = 0; i25 < arrayList5.size(); i25++) {
                        mp mpVar2 = (mp) arrayList5.get(i25);
                        boolean z12 = TextUtils.equals(ycVar.s, mpVar2.a()) || (TextUtils.isEmpty(ycVar.s) && mpVar2.a.a);
                        mpVar2.d = z12;
                        if (z12) {
                            i14 = i25;
                        }
                    }
                    wc wcVar = ycVar.h;
                    if (wcVar != null) {
                        wcVar.l();
                    }
                    wb1Var.animate().alpha(1.0f).setDuration(150L).start();
                    u00 u00Var = ycVar.e;
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
            case 20:
                ld ldVar = (ld) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    ldVar.getClass();
                    break;
                }
                z10 = true;
                ldVar.j0 = z10;
                break;
            case 21:
                ld.W((ld) obj2, (String) obj);
                break;
            case 22:
                ld ldVar2 = (ld) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList6 = ldVar2.f0;
                ldVar2.d0 = false;
                if (tLObject2 != null && ldVar2.getParentActivity() != null) {
                    for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                        ldVar2.K.removeView((View) arrayList6.get(i26));
                    }
                    arrayList6.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i27 = 0;
                    while (i27 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(ldVar2.getParentActivity(), new dd(ldVar2, z11 ? 1 : 0), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i27), i27 == tL_messages_chats.chats.size() - 1);
                        arrayList6.add(nVar);
                        ldVar2.L.addView(nVar, w7.y5.n(-1, 72));
                        i27++;
                    }
                    ldVar2.h0();
                    break;
                }
                break;
            case 23:
                je jeVar = (je) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                jeVar.A0 = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    jeVar.B0 = tL_premium_boostsStatus2.level;
                }
                r61 r61Var = jeVar.a1;
                if (r61Var != null && (j61Var = r61Var.Y2) != null) {
                    j61Var.N(true);
                    break;
                }
                break;
            case 24:
                ((je) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            case 25:
                wn wnVar = (wn) obj2;
                k11[] k11VarArr = (k11[]) obj;
                if (!wnVar.jb && (k11Var = k11VarArr[0]) != null) {
                    k11VarArr[0] = null;
                    if (wnVar.v0 == k11Var) {
                        wnVar.v0 = null;
                    }
                    AndroidUtilities.removeFromParent(k11Var);
                    break;
                }
                break;
            case 26:
                wn wnVar2 = (wn) obj2;
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) obj;
                u1Var.getLocationInWindow(new int[2]);
                wnVar2.z1.setTranslationY(u1Var.getTimeY() + ((r1[1] - r3.getTop()) - AndroidUtilities.dp(120.0f)));
                wnVar2.z1.m(0.0f, ((((-AndroidUtilities.dp(16.0f)) + r1[0]) + u1Var.rb) + u1Var.pb) - (u1Var.sb / 2.0f));
                wnVar2.z1.u();
                break;
            case 27:
                wn.D0((wn) obj2, (TLRPC.TL_inlineBotWebView) obj);
                break;
            case 28:
                ((sa) obj2).run((TLRPC.User) obj);
                break;
            default:
                wn wnVar3 = (wn) obj2;
                int[] iArr = (int[]) obj;
                wnVar3.getClass();
                if (iArr[0] != 0) {
                    wnVar3.getConnectionsManager().cancelRequest(iArr[0], true);
                    iArr[0] = 0;
                    break;
                }
                break;
        }
    }
}
