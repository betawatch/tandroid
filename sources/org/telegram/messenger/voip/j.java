package org.telegram.messenger.voip;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bi.m1;
import java.io.File;
import java.util.ArrayList;
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
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ap0;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.zc;
import org.telegram.ui.a9;
import org.telegram.ui.ac;
import org.telegram.ui.d6;
import org.telegram.ui.d7;
import org.telegram.ui.j9;
import org.telegram.ui.k4;
import org.telegram.ui.o9;
import org.telegram.ui.q5;
import org.telegram.ui.r4;
import org.telegram.ui.t80;
import org.telegram.ui.u4;
import org.telegram.ui.va;
import org.telegram.ui.x3;
import org.telegram.ui.y9;
import org.telegram.ui.z5;
import org.telegram.ui.z9;
import s4.b1;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x03e1, code lost:
    
        r11 = new java.util.ArrayList();
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0166  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        zc a02;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 3;
        int i15 = 4;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        int i16 = 0;
        int i17 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                break;
            case 1:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                break;
            case 2:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                break;
            case 3:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                break;
            case 4:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((n0) obj);
                break;
            case 5:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 6:
                ((AudioManager) obj2).setCommunicationDevice((AudioDeviceInfo) obj);
                break;
            case 7:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$4((Utilities.Callback2) obj);
                break;
            case 8:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically = ((ap0) obj).canScrollVertically(-1);
                boolean z10 = !canScrollVertically;
                if (kVar.r1 != z10) {
                    ValueAnimator valueAnimator = kVar.t1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f7 = kVar.s1;
                    kVar.r1 = z10;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, canScrollVertically ? 0.0f : 1.0f);
                    kVar.t1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, 0));
                    kVar.t1.addListener(new org.telegram.ui.ActionBar.c(kVar, z10, i17));
                    kVar.t1.setDuration(320L);
                    kVar.t1.setInterpolator(es.h);
                    kVar.t1.start();
                    break;
                }
                break;
            case 9:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically2;
                if (kVar2.r1 != z11) {
                    ValueAnimator valueAnimator2 = kVar2.t1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f10 = kVar2.s1;
                    kVar2.r1 = z11;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, canScrollVertically2 ? 0.0f : 1.0f);
                    kVar2.t1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, i15));
                    kVar2.t1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z11, 0));
                    kVar2.t1.setDuration(320L);
                    kVar2.t1.setInterpolator(es.h);
                    kVar2.t1.start();
                    break;
                }
                break;
            case 10:
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
            case 11:
                m2 m2Var = (m2) obj2;
                m2 m2Var2 = (m2) obj;
                Drawable drawable2 = ActionBarLayout.p1;
                if (m2Var != null) {
                    m2Var.onTransitionAnimationEnd(false, false);
                }
                m2Var2.onTransitionAnimationEnd(true, false);
                m2Var2.onBecomeFullyVisible();
                break;
            case 12:
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
                    ConnectionsManager.getInstance(b6Var.a).sendRequest(getmultiwallpapers, new m1(20, b6Var, arrayList2));
                    break;
                }
                break;
            case 13:
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
                AndroidUtilities.runOnUIThread(new di.x0((Object) b6Var2, (Object) arrayList4, false, 12));
                break;
            case 14:
                f6 f6Var = (f6) obj2;
                f6Var.d((File) obj, f6Var.h0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(f6Var, 19));
                break;
            case 15:
                ((org.telegram.ui.p) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 16:
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
            case 17:
                ((k4) obj2).R0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 18:
                ArrayList arrayList5 = (ArrayList) obj;
                u4 u4Var = ((r4) obj2).a;
                if (!arrayList5.isEmpty()) {
                    for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                        u4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList5.get(i21)).longValue(), u4Var.U() * 60);
                    }
                    if (u4Var.U() > 0) {
                        zc.a0(u4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(u4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size()))))).j();
                        break;
                    } else {
                        zc.a0(u4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size())))).j();
                        break;
                    }
                }
                break;
            case 19:
                z5 z5Var = (z5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                z5Var.R = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    z5Var.getMessagesController().getBoostsController().userCanBoostChannel(z5Var.P, z5Var.R, new q5(z5Var, i16));
                }
                z5Var.f0.animate().cancel();
                z5Var.f0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new org.telegram.ui.u0(z5Var, i15));
                z5Var.G0(true);
                z5Var.H0(true);
                z5Var.F0(null);
                break;
            case 20:
                org.telegram.ui.e6 e6Var3 = (org.telegram.ui.e6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList6 = e6Var3.c;
                int i22 = 0;
                while (true) {
                    if (i22 >= arrayList6.size()) {
                        i10 = 0;
                    } else if (((d6) arrayList6.get(i22)).c == null || ((d6) arrayList6.get(i22)).c.dialogId != keepMediaException.dialogId) {
                        i22++;
                    } else {
                        i10 = i22;
                    }
                }
                b1 K = e6Var3.b.K(i10);
                if (K != null) {
                    View view2 = K.a;
                    t80 t80Var = new t80(e6Var3.getParentActivity(), e6Var3);
                    t80Var.g(true);
                    t80Var.setParentWindow(g5.P(e6Var3, t80Var, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    t80Var.setCallback(new org.telegram.ui.b6(e6Var3, keepMediaException, i17));
                    break;
                }
                break;
            case 21:
                d7.Y((d7) obj2, (a2) obj);
                break;
            case 22:
                kj0 kj0Var = new kj0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                kj0Var.n(R.raw.qr_code_logo);
                kj0Var.show();
                break;
            case 23:
                ((a9) obj2).b.j0(((TLRPC.Message) i2.d.g(1, ((j9) obj).c)).id, 100);
                break;
            case 24:
                z9 z9Var = (z9) obj2;
                li.k kVar3 = (li.k) obj;
                RectF rectF = (RectF) kVar3.c;
                PointF[] pointFArr = (PointF[]) kVar3.d;
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
                        for (int i23 = 0; i23 < 4; i23++) {
                            PointF pointF = pointFArr2[i23];
                            PointF pointF2 = pointFArr[i23];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i23];
                            PointF pointF4 = pointFArr[i23];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j11 = elapsedRealtime - j10;
                        if (j11 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j11 / 75.0f));
                            AndroidUtilities.lerp(rectF2, rectF3, min, rectF2);
                            for (int i24 = 0; i24 < 4; i24++) {
                                PointF pointF5 = pointFArr2[i24];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i24].x, min), AndroidUtilities.lerp(pointFArr2[i24].y, pointFArr3[i24].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                z9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i25 = 0; i25 < 4; i25++) {
                                    PointF pointF6 = pointFArr3[i25];
                                    PointF pointF7 = pointFArr[i25];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            z9Var.L = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i26 = 0; i26 < 4; i26++) {
                        PointF pointF8 = pointFArr2[i26];
                        PointF pointF9 = pointFArr3[i26];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    z9Var.L = elapsedRealtime;
                }
                z9Var.fragmentView.invalidate();
                break;
            case 25:
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
            case 26:
                z9 z9Var3 = (z9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                z9Var3.f.setText(result.rawMRZ);
                z9Var3.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(es.f).start();
                y9 y9Var2 = z9Var3.M;
                if (y9Var2 != null) {
                    y9Var2.W0(result);
                }
                AndroidUtilities.runOnUIThread(new o9(z9Var3, i14), 1200L);
                break;
            case 27:
                va.W((va) obj2, (String) obj);
                break;
            case 28:
                ac acVar = (ac) obj2;
                zc.a0(acVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                acVar.V0();
                break;
            default:
                ac acVar2 = (ac) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = zc.a0(acVar2);
                    i11 = R.raw.msg_antispam;
                    i12 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = zc.a0(acVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                } else {
                    a02 = zc.a0(acVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                }
                org.telegram.messenger.q.r(i12, a02, i11, 36);
                break;
        }
    }
}
