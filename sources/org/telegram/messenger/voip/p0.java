package org.telegram.messenger.voip;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.m1;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import m.h3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.yp;
import org.telegram.ui.Components.zc;
import org.telegram.ui.a9;
import org.telegram.ui.ac;
import org.telegram.ui.cd;
import org.telegram.ui.d6;
import org.telegram.ui.d7;
import org.telegram.ui.dd;
import org.telegram.ui.ed;
import org.telegram.ui.gd;
import org.telegram.ui.hb1;
import org.telegram.ui.hc;
import org.telegram.ui.j9;
import org.telegram.ui.k4;
import org.telegram.ui.kc1;
import org.telegram.ui.o9;
import org.telegram.ui.q5;
import org.telegram.ui.r4;
import org.telegram.ui.sd;
import org.telegram.ui.t80;
import org.telegram.ui.u4;
import org.telegram.ui.va;
import org.telegram.ui.x3;
import org.telegram.ui.y9;
import org.telegram.ui.z5;
import org.telegram.ui.z9;
import s4.b1;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:210:0x0512, code lost:
    
        r14 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        if (r12.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02a9 A[LOOP:4: B:118:0x02a9->B:120:0x02ac, LOOP_START, PHI: r3
      0x02a9: PHI (r3v13 int) = (r3v27 int), (r3v14 int) binds: [B:115:0x02a3, B:120:0x02ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r3v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r7v20, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zc a02;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 3;
        int i14 = 19;
        ?? r14 = 0;
        Bitmap bitmap = null;
        ?? r32 = 0;
        boolean z10 = false;
        int i15 = 0;
        int i16 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 1:
                ((AudioManager) obj2).setCommunicationDevice((AudioDeviceInfo) obj);
                break;
            case 2:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$4((Utilities.Callback2) obj);
                break;
            case 3:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically = ((ap0) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically;
                if (kVar.r1 != z11) {
                    ValueAnimator valueAnimator = kVar.t1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f7 = kVar.s1;
                    kVar.r1 = z11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, canScrollVertically ? 0.0f : 1.0f);
                    kVar.t1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, r32));
                    kVar.t1.addListener(new org.telegram.ui.ActionBar.c(kVar, z11, i16));
                    kVar.t1.setDuration(320L);
                    kVar.t1.setInterpolator(es.h);
                    kVar.t1.start();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z12 = !canScrollVertically2;
                if (kVar2.r1 != z12) {
                    ValueAnimator valueAnimator2 = kVar2.t1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f10 = kVar2.s1;
                    kVar2.r1 = z12;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, canScrollVertically2 ? 0.0f : 1.0f);
                    kVar2.t1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, 4));
                    kVar2.t1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z12, r32));
                    kVar2.t1.setDuration(320L);
                    kVar2.t1.setInterpolator(es.h);
                    kVar2.t1.start();
                    break;
                }
                break;
            case 5:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.p1;
                actionBarLayout.b0((m2) obj, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.B0;
                if (view != null) {
                    view.setVisibility(8);
                    break;
                }
                break;
            case 6:
                m2 m2Var = (m2) obj2;
                m2 m2Var2 = (m2) obj;
                Drawable drawable2 = ActionBarLayout.p1;
                if (m2Var != null) {
                    m2Var.onTransitionAnimationEnd(false, false);
                }
                m2Var2.onTransitionAnimationEnd(true, false);
                m2Var2.onBecomeFullyVisible();
                break;
            case 7:
                b6 b6Var = (b6) obj2;
                ArrayList arrayList = (ArrayList) obj;
                int size = arrayList.size();
                int i17 = 0;
                while (i17 < size) {
                    e6 e6Var = (e6) arrayList.get(i17);
                    File d = e6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList.remove(i17);
                        i17--;
                        size--;
                        i17++;
                        r14 = r14;
                    }
                    if (!r14.contains(e6Var.o)) {
                        r14.add(e6Var.o);
                    }
                    i17++;
                    r14 = r14;
                }
                if (r14 != 0) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = r14.size();
                    while (r32 < size2) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) r14.get(r32);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                        r32++;
                    }
                    ConnectionsManager.getInstance(b6Var.a).sendRequest(getmultiwallpapers, new m1(20, b6Var, arrayList));
                    break;
                }
                break;
            case 8:
                b6 b6Var2 = (b6) obj2;
                a6 a6Var = (a6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = a6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList2 = a6Var.b;
                int size3 = arrayList2.size();
                ArrayList arrayList3 = null;
                for (int i18 = 0; i18 < size3; i18++) {
                    e6 e6Var2 = (e6) arrayList2.get(i18);
                    if (e6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = b6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, e6Var2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            arrayList3.add(e6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new di.x0(b6Var2, arrayList3, (boolean) r32, 10));
                break;
            case 9:
                f6 f6Var = (f6) obj2;
                f6Var.d((File) obj, f6Var.h0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(f6Var, i14));
                break;
            case 10:
                ((org.telegram.ui.p) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 11:
                k4 k4Var = (k4) obj2;
                pf.c cVar = (pf.c) obj;
                x3 x3Var = k4Var.K;
                if (x3Var != null) {
                    x3Var.dismiss(true);
                }
                if (k4Var.M0 == cVar) {
                    k4Var.M0 = null;
                    break;
                }
                break;
            case 12:
                ((k4) obj2).R0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 13:
                ArrayList arrayList4 = (ArrayList) obj;
                u4 u4Var = ((r4) obj2).a;
                if (!arrayList4.isEmpty()) {
                    for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                        u4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList4.get(i19)).longValue(), u4Var.U() * 60);
                    }
                    if (u4Var.U() > 0) {
                        zc.a0(u4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(u4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList4.size(), Integer.valueOf(arrayList4.size()))))).j();
                        break;
                    } else {
                        zc.a0(u4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList4.size(), Integer.valueOf(arrayList4.size())))).j();
                        break;
                    }
                }
                break;
            case 14:
                z5 z5Var = (z5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                z5Var.R = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new q5(z5Var, r32));
                }
                z5Var.f0.animate().cancel();
                z5Var.f0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.u0(z5Var, 4));
                z5Var.G0(true);
                z5Var.H0(true);
                z5Var.F0(null);
                break;
            case 15:
                org.telegram.ui.e6 e6Var3 = (org.telegram.ui.e6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList5 = e6Var3.c;
                int i20 = 0;
                while (true) {
                    if (i20 < arrayList5.size()) {
                        if (((d6) arrayList5.get(i20)).c == null || ((d6) arrayList5.get(i20)).c.dialogId != keepMediaException.dialogId) {
                            i20++;
                        } else {
                            i15 = i20;
                        }
                    }
                }
                b1 K = e6Var3.b.K(i15);
                if (K != null) {
                    View view2 = K.a;
                    t80 t80Var = new t80(e6Var3.getParentActivity(), e6Var3);
                    t80Var.g(true);
                    t80Var.setParentWindow(g5.P(e6Var3, t80Var, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    t80Var.setCallback(new org.telegram.ui.b6(e6Var3, keepMediaException, i16));
                    break;
                }
                break;
            case 16:
                d7.Y((d7) obj2, (a2) obj);
                break;
            case 17:
                kj0 kj0Var = new kj0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                kj0Var.n(R.raw.qr_code_logo);
                kj0Var.show();
                break;
            case 18:
                ((a9) obj2).b.j0(((TLRPC.Message) i2.d.h(1, ((j9) obj).c)).id, 100);
                break;
            case 19:
                z9 z9Var = (z9) obj2;
                h3 h3Var = (h3) obj;
                RectF rectF = (RectF) h3Var.c;
                PointF[] pointFArr = (PointF[]) h3Var.d;
                RectF rectF2 = z9Var.J;
                PointF[] pointFArr2 = z9Var.F;
                RectF rectF3 = z9Var.K;
                PointF[] pointFArr3 = z9Var.G;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = z9Var.L;
                if (j10 == 0) {
                    z9Var.L = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        z9.d0(rectF, pointFArr2);
                        z9.d0(rectF, pointFArr3);
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
                        long j11 = elapsedRealtime - j10;
                        if (j11 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j11 / 75.0f));
                            AndroidUtilities.lerp(rectF2, rectF3, min, rectF2);
                            for (int i22 = 0; i22 < 4; i22++) {
                                PointF pointF5 = pointFArr2[i22];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i22].x, min), AndroidUtilities.lerp(pointFArr2[i22].y, pointFArr3[i22].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                z9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i23 = 0; i23 < 4; i23++) {
                                    PointF pointF6 = pointFArr3[i23];
                                    PointF pointF7 = pointFArr[i23];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            z9Var.L = elapsedRealtime;
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
                    z9Var.L = elapsedRealtime;
                }
                z9Var.fragmentView.invalidate();
                break;
            case 20:
                z9 z9Var2 = (z9) obj2;
                String str = (String) obj;
                y9 y9Var = z9Var2.M;
                if (y9Var != null) {
                    y9Var.K(str);
                }
                if (z9Var2.X != 3) {
                    z9Var2.finishFragment();
                    break;
                }
                break;
            case 21:
                z9 z9Var3 = (z9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                z9Var3.f.setText(result.rawMRZ);
                z9Var3.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(es.f).start();
                y9 y9Var2 = z9Var3.M;
                if (y9Var2 != null) {
                    y9Var2.V0(result);
                }
                AndroidUtilities.runOnUIThread(new o9(z9Var3, i13), 1200L);
                break;
            case 22:
                va.W((va) obj2, (String) obj);
                break;
            case 23:
                ac acVar = (ac) obj2;
                zc.a0(acVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                acVar.V0();
                break;
            case 24:
                ac acVar2 = (ac) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = zc.a0(acVar2);
                    i10 = R.raw.msg_antispam;
                    i11 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = zc.a0(acVar2);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                } else {
                    a02 = zc.a0(acVar2);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.g0.q(i11, a02, i10, 36);
                break;
            case 25:
                hc hcVar = (hc) obj2;
                hcVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                hcVar.I.animate().cancel();
                hcVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.u0(hcVar, i14));
                hcVar.d(true);
                hcVar.c(null);
                break;
            case 26:
                gd gdVar = (gd) obj2;
                gdVar.getClass();
                gdVar.presentFragment(hb1.d0((TLRPC.Chat) obj, true));
                break;
            case 27:
                List list = (List) obj;
                ed edVar = ((dd) obj2).b;
                int i25 = edVar.a;
                kc1 kc1Var = edVar.d;
                ArrayList arrayList6 = edVar.c;
                if (list != null && !list.isEmpty()) {
                    edVar.n = true;
                    arrayList6.clear();
                    arrayList6.add(0, new yp((b4) list.get(0)));
                    if (edVar.v != null && edVar.f) {
                        arrayList6.add(0, new yp(b4.a(i25)));
                    }
                    c6 c6Var = edVar.b;
                    ?? a2 = c6Var != null ? c6Var.a() : g6.I.q();
                    for (int i26 = 1; i26 < list.size(); i26++) {
                        b4 b4Var = (b4) list.get(i26);
                        yp ypVar = new yp(b4Var);
                        b4Var.n(i25);
                        ypVar.c = a2;
                        arrayList6.add(ypVar);
                    }
                    int i27 = -1;
                    for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                        yp ypVar2 = (yp) arrayList6.get(i28);
                        boolean z13 = TextUtils.equals(edVar.s, ypVar2.a()) || (TextUtils.isEmpty(edVar.s) && ypVar2.a.a);
                        ypVar2.d = z13;
                        if (z13) {
                            i27 = i28;
                        }
                    }
                    cd cdVar = edVar.h;
                    if (cdVar != null) {
                        cdVar.l();
                    }
                    kc1Var.animate().alpha(1.0f).setDuration(150L).start();
                    f10 f10Var = edVar.e;
                    if (edVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(f10Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(f10Var, true, 1.0f, true, true);
                    }
                    if (i27 >= 0 && (kc1Var.getLayoutManager() instanceof s4.b0)) {
                        ((s4.b0) kc1Var.getLayoutManager()).h1(i27, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 28:
                sd sdVar = (sd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    sdVar.getClass();
                    break;
                }
                z10 = true;
                sdVar.j0 = z10;
                break;
            default:
                sd.W((sd) obj2, (String) obj);
                break;
        }
    }
}
