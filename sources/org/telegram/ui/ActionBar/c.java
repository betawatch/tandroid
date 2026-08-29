package org.telegram.ui.ActionBar;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.ui.Components.fp;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.d9;
import org.telegram.ui.de;
import org.telegram.ui.hd;
import org.telegram.ui.i9;
import org.telegram.ui.la;
import org.telegram.ui.ob;
import org.telegram.ui.q9;
import org.telegram.ui.r9;
import org.telegram.ui.rc;
import org.telegram.ui.sc;
import org.telegram.ui.t91;
import org.telegram.ui.tn;
import org.telegram.ui.u8;
import org.telegram.ui.vc;
import org.telegram.ui.wa1;
import org.telegram.ui.wb;
import org.telegram.ui.x6;
import org.telegram.ui.x70;
import org.telegram.ui.zc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ c(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:257:0x05ce, code lost:
    
        r13 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
    
        if (r2.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x030d  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        tc a02;
        int i11;
        int i12;
        k51 k51Var;
        p01 p01Var;
        int i13 = this.a;
        int i14 = 3;
        int i15 = -1;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        int i16 = 0;
        boolean z10 = false;
        int i17 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                l lVar = (l) obj2;
                boolean canScrollVertically = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically;
                if (lVar.m1 != z11) {
                    ValueAnimator valueAnimator = lVar.o1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f9 = lVar.n1;
                    lVar.m1 = z11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f9, canScrollVertically ? 0.0f : 1.0f);
                    lVar.o1 = ofFloat;
                    ofFloat.addUpdateListener(new a(lVar, i14));
                    lVar.o1.addListener(new d(lVar, z11, 0));
                    lVar.o1.setDuration(320L);
                    lVar.o1.setInterpolator(jr.h);
                    lVar.o1.start();
                    break;
                }
                break;
            case 1:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.l1;
                actionBarLayout.b0((o2) obj, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.x0;
                if (view != null) {
                    view.setVisibility(8);
                    break;
                }
                break;
            case 2:
                o2 o2Var = (o2) obj2;
                o2 o2Var2 = (o2) obj;
                Drawable drawable2 = ActionBarLayout.l1;
                if (o2Var != null) {
                    o2Var.onTransitionAnimationEnd(false, false);
                }
                o2Var2.onTransitionAnimationEnd(true, false);
                o2Var2.onBecomeFullyVisible();
                break;
            case 3:
                b6 b6Var = (b6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    e6 e6Var = (e6) arrayList2.get(i18);
                    File d = e6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList2.remove(i18);
                        i18--;
                        size--;
                        i18++;
                    }
                    if (!arrayList.contains(e6Var.o)) {
                        arrayList.add(e6Var.o);
                    }
                    i18++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = arrayList.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i19);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(b6Var.a).sendRequest(getmultiwallpapers, new bg.h3(23, b6Var, arrayList2));
                    break;
                }
                break;
            case 4:
                b6 b6Var2 = (b6) obj2;
                a6 a6Var = (a6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = a6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = a6Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i20 = 0; i20 < size3; i20++) {
                    e6 e6Var2 = (e6) arrayList3.get(i20);
                    if (e6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = b6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, e6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(e6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new jh.r5((Object) b6Var2, (Object) arrayList4, false, 8));
                break;
            case 5:
                f6 f6Var = (f6) obj2;
                f6Var.d((File) obj, f6Var.d0);
                AndroidUtilities.runOnUIThread(new q(f6Var, 19));
                break;
            case 6:
                ((org.telegram.ui.r) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 7:
                org.telegram.ui.m4 m4Var = (org.telegram.ui.m4) obj2;
                ye.c cVar = (ye.c) obj;
                org.telegram.ui.z3 z3Var = m4Var.G;
                if (z3Var != null) {
                    z3Var.dismiss(true);
                }
                if (m4Var.I0 == cVar) {
                    m4Var.I0 = null;
                    break;
                }
                break;
            case 8:
                ((org.telegram.ui.m4) obj2).N0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 9:
                ArrayList arrayList5 = (ArrayList) obj;
                org.telegram.ui.q4 q4Var = ((org.telegram.ui.n4) obj2).a;
                if (!arrayList5.isEmpty()) {
                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                        q4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList5.get(i21)).longValue(), q4Var.U() * 60);
                    }
                    if (q4Var.U() > 0) {
                        tc.a0(q4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(q4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size()))))).j();
                        break;
                    } else {
                        tc.a0(q4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size())))).j();
                        break;
                    }
                }
                break;
            case 10:
                org.telegram.ui.v5 v5Var = (org.telegram.ui.v5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                v5Var.N = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    v5Var.getMessagesController().getBoostsController().userCanBoostChannel(v5Var.L, v5Var.N, new org.telegram.ui.n5(v5Var, 0));
                }
                v5Var.b0.animate().cancel();
                v5Var.b0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new nh.q5(v5Var, 9));
                v5Var.F0(true);
                v5Var.G0(true);
                v5Var.E0(null);
                break;
            case 11:
                org.telegram.ui.a6 a6Var2 = (org.telegram.ui.a6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList6 = a6Var2.c;
                int i22 = 0;
                while (true) {
                    if (i22 >= arrayList6.size()) {
                        i10 = 0;
                    } else if (((org.telegram.ui.z5) arrayList6.get(i22)).c == null || ((org.telegram.ui.z5) arrayList6.get(i22)).c.dialogId != keepMediaException.dialogId) {
                        i22++;
                    } else {
                        i10 = i22;
                    }
                }
                f2.n1 K = a6Var2.b.K(i10);
                if (K != null) {
                    View view2 = K.a;
                    x70 x70Var = new x70(a6Var2.getParentActivity(), a6Var2);
                    x70Var.g(true);
                    x70Var.setParentWindow(org.telegram.ui.Components.c5.Q(a6Var2, x70Var, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    x70Var.setCallback(new org.telegram.ui.x5(a6Var2, keepMediaException, i17));
                    break;
                }
                break;
            case 12:
                x6.Y((x6) obj2, (c2) obj);
                break;
            case 13:
                gi0 gi0Var = new gi0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                gi0Var.m(R.raw.qr_code_logo);
                gi0Var.show();
                break;
            case 14:
                ((u8) obj2).b.j0(((TLRPC.Message) j7.l1.i(1, ((d9) obj).c)).id, 100);
                break;
            case 15:
                r9 r9Var = (r9) obj2;
                String str = (String) obj;
                q9 q9Var = r9Var.H;
                if (q9Var != null) {
                    q9Var.J(str);
                }
                if (r9Var.R != 3) {
                    r9Var.finishFragment();
                    break;
                }
                break;
            case 16:
                r9 r9Var2 = (r9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                r9Var2.f.setText(result.rawMRZ);
                r9Var2.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(jr.f).start();
                q9 q9Var2 = r9Var2.H;
                if (q9Var2 != null) {
                    q9Var2.S0(result);
                }
                AndroidUtilities.runOnUIThread(new i9(r9Var2, 3), 1200L);
                break;
            case 17:
                r9 r9Var3 = (r9) obj2;
                l3.g0 g0Var = (l3.g0) obj;
                RectF rectF = (RectF) g0Var.c;
                PointF[] pointFArr = (PointF[]) g0Var.d;
                RectF rectF2 = r9Var3.E;
                PointF[] pointFArr2 = r9Var3.A;
                RectF rectF3 = r9Var3.F;
                PointF[] pointFArr3 = r9Var3.B;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = r9Var3.G;
                if (j10 == 0) {
                    r9Var3.G = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        r9.d0(rectF, pointFArr2);
                        r9.d0(rectF, pointFArr3);
                    } else {
                        while (i16 < 4) {
                            PointF pointF = pointFArr2[i16];
                            PointF pointF2 = pointFArr[i16];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i16];
                            PointF pointF4 = pointFArr[i16];
                            pointF3.set(pointF4.x, pointF4.y);
                            i16++;
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j11 = elapsedRealtime - j10;
                        if (j11 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j11 / 75.0f));
                            AndroidUtilities.lerp(rectF2, rectF3, min, rectF2);
                            for (int i23 = 0; i23 < 4; i23++) {
                                PointF pointF5 = pointFArr2[i23];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i23].x, min), AndroidUtilities.lerp(pointFArr2[i23].y, pointFArr3[i23].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                r9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i24 = 0; i24 < 4; i24++) {
                                    PointF pointF6 = pointFArr3[i24];
                                    PointF pointF7 = pointFArr[i24];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            r9Var3.G = elapsedRealtime;
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
                    r9Var3.G = elapsedRealtime;
                }
                r9Var3.fragmentView.invalidate();
                break;
            case 18:
                la.W((la) obj2, (String) obj);
                break;
            case 19:
                ob obVar = (ob) obj2;
                tc.a0(obVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                obVar.W0();
                break;
            case 20:
                ob obVar2 = (ob) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = tc.a0(obVar2);
                    i11 = R.raw.msg_antispam;
                    i12 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = tc.a0(obVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                } else {
                    a02 = tc.a0(obVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                }
                j7.l1.v(i12, a02, i11, 36);
                break;
            case 21:
                wb wbVar = (wb) obj2;
                wbVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                wbVar.E.animate().cancel();
                wbVar.E.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new nh.q5(wbVar, 24));
                wbVar.d(true);
                wbVar.c(null);
                break;
            case 22:
                vc vcVar = (vc) obj2;
                vcVar.getClass();
                vcVar.presentFragment(t91.d0((TLRPC.Chat) obj, true));
                break;
            case 23:
                List list = (List) obj;
                org.telegram.ui.tc tcVar = ((sc) obj2).b;
                int i26 = tcVar.a;
                wa1 wa1Var = tcVar.d;
                ArrayList arrayList7 = tcVar.c;
                if (list != null && !list.isEmpty()) {
                    tcVar.n = true;
                    arrayList7.clear();
                    arrayList7.add(0, new fp((b4) list.get(0)));
                    if (tcVar.v != null && tcVar.f) {
                        arrayList7.add(0, new fp(b4.a(i26)));
                    }
                    c6 c6Var = tcVar.b;
                    int a2 = c6Var != null ? c6Var.a() : g6.I.q();
                    for (int i27 = 1; i27 < list.size(); i27++) {
                        b4 b4Var = (b4) list.get(i27);
                        fp fpVar = new fp(b4Var);
                        b4Var.n(i26);
                        fpVar.c = a2;
                        arrayList7.add(fpVar);
                    }
                    for (int i28 = 0; i28 < arrayList7.size(); i28++) {
                        fp fpVar2 = (fp) arrayList7.get(i28);
                        boolean z12 = TextUtils.equals(tcVar.s, fpVar2.a()) || (TextUtils.isEmpty(tcVar.s) && fpVar2.a.a);
                        fpVar2.d = z12;
                        if (z12) {
                            i15 = i28;
                        }
                    }
                    rc rcVar = tcVar.h;
                    if (rcVar != null) {
                        rcVar.l();
                    }
                    wa1Var.animate().alpha(1.0f).setDuration(150L).start();
                    p00 p00Var = tcVar.e;
                    if (tcVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(p00Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(p00Var, true, 1.0f, true, true);
                    }
                    if (i15 >= 0 && (wa1Var.getLayoutManager() instanceof f2.j0)) {
                        ((f2.j0) wa1Var.getLayoutManager()).h1(i15, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 24:
                hd hdVar = (hd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    hdVar.getClass();
                    break;
                }
                z10 = true;
                hdVar.f0 = z10;
                break;
            case 25:
                hd.W((hd) obj2, (String) obj);
                break;
            case 26:
                hd hdVar2 = (hd) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList8 = hdVar2.b0;
                hdVar2.Z = false;
                if (tLObject2 != null && hdVar2.getParentActivity() != null) {
                    for (int i29 = 0; i29 < arrayList8.size(); i29++) {
                        hdVar2.G.removeView((View) arrayList8.get(i29));
                    }
                    arrayList8.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i30 = 0;
                    while (i30 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(hdVar2.getParentActivity(), new zc(hdVar2, i16), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i30), i30 == tL_messages_chats.chats.size() - 1);
                        arrayList8.add(nVar);
                        hdVar2.H.addView(nVar, i7.f6.n(-1, 72));
                        i30++;
                    }
                    hdVar2.h0();
                    break;
                }
                break;
            case 27:
                de deVar = (de) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = (TL_stories.TL_premium_boostsStatus) obj;
                deVar.w0 = tL_premium_boostsStatus2;
                if (tL_premium_boostsStatus2 != null) {
                    deVar.x0 = tL_premium_boostsStatus2.level;
                }
                u51 u51Var = deVar.W0;
                if (u51Var != null && (k51Var = u51Var.U2) != null) {
                    k51Var.N(true);
                    break;
                }
                break;
            case 28:
                ((de) obj2).Z((TLRPC.TL_payments_starsRevenueStats) obj);
                break;
            default:
                tn tnVar = (tn) obj2;
                p01[] p01VarArr = (p01[]) obj;
                if (!tnVar.gb && (p01Var = p01VarArr[0]) != null) {
                    p01VarArr[0] = null;
                    if (tnVar.r0 == p01Var) {
                        tnVar.r0 = null;
                    }
                    AndroidUtilities.removeFromParent(p01Var);
                    break;
                }
                break;
        }
    }
}
