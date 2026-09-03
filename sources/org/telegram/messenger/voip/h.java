package org.telegram.messenger.voip;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import dg.d3;
import f2.l1;
import java.io.File;
import java.util.ArrayList;
import lh.r5;
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
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.do0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.a4;
import org.telegram.ui.a6;
import org.telegram.ui.a9;
import org.telegram.ui.c6;
import org.telegram.ui.cc;
import org.telegram.ui.d7;
import org.telegram.ui.f6;
import org.telegram.ui.i80;
import org.telegram.ui.j9;
import org.telegram.ui.n4;
import org.telegram.ui.o9;
import org.telegram.ui.r4;
import org.telegram.ui.ra;
import org.telegram.ui.u4;
import org.telegram.ui.u5;
import org.telegram.ui.ub;
import org.telegram.ui.w9;
import org.telegram.ui.x9;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ h(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:145:0x040d, code lost:
    
        r14 = new java.util.ArrayList();
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        qc a02;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 4;
        int i14 = 3;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        int i15 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
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
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((l0) obj);
                break;
            case 5:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 6:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) obj);
                break;
            case 7:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically = ((do0) obj).canScrollVertically(-1);
                boolean z4 = !canScrollVertically;
                if (kVar.n1 != z4) {
                    ValueAnimator valueAnimator = kVar.p1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f10 = kVar.o1;
                    kVar.n1 = z4;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, canScrollVertically ? 0.0f : 1.0f);
                    kVar.p1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, i13));
                    kVar.p1.addListener(new org.telegram.ui.ActionBar.c(kVar, z4, i15));
                    kVar.p1.setDuration(320L);
                    kVar.p1.setInterpolator(mr.h);
                    kVar.p1.start();
                    break;
                }
                break;
            case 8:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z10 = !canScrollVertically2;
                if (kVar2.n1 != z10) {
                    ValueAnimator valueAnimator2 = kVar2.p1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f11 = kVar2.o1;
                    kVar2.n1 = z10;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, canScrollVertically2 ? 0.0f : 1.0f);
                    kVar2.p1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, i14));
                    kVar2.p1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z10, 0));
                    kVar2.p1.setDuration(320L);
                    kVar2.p1.setInterpolator(mr.h);
                    kVar2.p1.start();
                    break;
                }
                break;
            case 9:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.m1;
                actionBarLayout.b0((p2) obj, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.y0;
                if (view != null) {
                    view.setVisibility(8);
                    break;
                }
                break;
            case 10:
                p2 p2Var = (p2) obj2;
                p2 p2Var2 = (p2) obj;
                Drawable drawable2 = ActionBarLayout.m1;
                if (p2Var != null) {
                    p2Var.onTransitionAnimationEnd(false, false);
                }
                p2Var2.onTransitionAnimationEnd(true, false);
                p2Var2.onBecomeFullyVisible();
                break;
            case 11:
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
                    ConnectionsManager.getInstance(e6Var.a).sendRequest(getmultiwallpapers, new d3(20, e6Var, arrayList2));
                    break;
                }
                break;
            case 12:
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
                AndroidUtilities.runOnUIThread(new r5((Object) e6Var2, (Object) arrayList4, false, 6));
                break;
            case 13:
                i6 i6Var = (i6) obj2;
                i6Var.d((File) obj, i6Var.e0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(i6Var, 19));
                break;
            case 14:
                ((org.telegram.ui.r) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 15:
                n4 n4Var = (n4) obj2;
                ze.c cVar = (ze.c) obj;
                a4 a4Var = n4Var.H;
                if (a4Var != null) {
                    a4Var.dismiss(true);
                }
                if (n4Var.J0 == cVar) {
                    n4Var.J0 = null;
                    break;
                }
                break;
            case 16:
                ((n4) obj2).O0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 17:
                ArrayList arrayList5 = (ArrayList) obj;
                u4 u4Var = ((r4) obj2).a;
                if (!arrayList5.isEmpty()) {
                    for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                        u4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList5.get(i19)).longValue(), u4Var.U() * 60);
                    }
                    if (u4Var.U() > 0) {
                        qc.a0(u4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(u4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size()))))).j();
                        break;
                    } else {
                        qc.a0(u4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size())))).j();
                        break;
                    }
                }
                break;
            case 18:
                a6 a6Var = (a6) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                a6Var.O = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    a6Var.getMessagesController().getBoostsController().userCanBoostChannel(a6Var.M, a6Var.O, new org.telegram.ui.r5(a6Var, 0));
                }
                a6Var.c0.animate().cancel();
                a6Var.c0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new u5(a6Var, 0));
                a6Var.F0(true);
                a6Var.G0(true);
                a6Var.E0(null);
                break;
            case 19:
                f6 f6Var = (f6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList6 = f6Var.c;
                int i20 = 0;
                while (true) {
                    if (i20 >= arrayList6.size()) {
                        i20 = 0;
                    } else if (((org.telegram.ui.e6) arrayList6.get(i20)).c == null || ((org.telegram.ui.e6) arrayList6.get(i20)).c.dialogId != keepMediaException.dialogId) {
                        i20++;
                    }
                }
                l1 K = f6Var.b.K(i20);
                if (K != null) {
                    View view2 = K.a;
                    i80 i80Var = new i80(f6Var.getParentActivity(), f6Var);
                    i80Var.g(true);
                    i80Var.setParentWindow(z4.Q(f6Var, i80Var, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    i80Var.setCallback(new c6(f6Var, keepMediaException, i15));
                    break;
                }
                break;
            case 20:
                d7.Y((d7) obj2, (d2) obj);
                break;
            case 21:
                ri0 ri0Var = new ri0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                ri0Var.m(R.raw.qr_code_logo);
                ri0Var.show();
                break;
            case 22:
                ((a9) obj2).b.j0(((TLRPC.Message) kf.k0.i(1, ((j9) obj).c)).id, 100);
                break;
            case 23:
                x9 x9Var = (x9) obj2;
                String str = (String) obj;
                w9 w9Var = x9Var.I;
                if (w9Var != null) {
                    w9Var.K(str);
                }
                if (x9Var.S != 3) {
                    x9Var.finishFragment();
                    break;
                }
                break;
            case 24:
                x9 x9Var2 = (x9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                x9Var2.f.setText(result.rawMRZ);
                x9Var2.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(mr.f).start();
                w9 w9Var2 = x9Var2.I;
                if (w9Var2 != null) {
                    w9Var2.P0(result);
                }
                AndroidUtilities.runOnUIThread(new o9(x9Var2, 3), 1200L);
                break;
            case 25:
                x9 x9Var3 = (x9) obj2;
                l7.w0 w0Var = (l7.w0) obj;
                RectF rectF = (RectF) w0Var.c;
                PointF[] pointFArr = (PointF[]) w0Var.d;
                RectF rectF2 = x9Var3.F;
                PointF[] pointFArr2 = x9Var3.B;
                RectF rectF3 = x9Var3.G;
                PointF[] pointFArr3 = x9Var3.C;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = x9Var3.H;
                if (j10 == 0) {
                    x9Var3.H = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        x9.d0(rectF, pointFArr2);
                        x9.d0(rectF, pointFArr3);
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
                                x9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i23 = 0; i23 < 4; i23++) {
                                    PointF pointF6 = pointFArr3[i23];
                                    PointF pointF7 = pointFArr[i23];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            x9Var3.H = elapsedRealtime;
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
                    x9Var3.H = elapsedRealtime;
                }
                x9Var3.fragmentView.invalidate();
                break;
            case 26:
                ra.W((ra) obj2, (String) obj);
                break;
            case 27:
                ub ubVar = (ub) obj2;
                qc.a0(ubVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                ubVar.W0();
                break;
            case 28:
                ub ubVar2 = (ub) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = qc.a0(ubVar2);
                    i10 = R.raw.msg_antispam;
                    i11 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = qc.a0(ubVar2);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                } else {
                    a02 = qc.a0(ubVar2);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                kf.k0.v(i11, a02, i10, 36);
                break;
            default:
                cc ccVar = (cc) obj2;
                ccVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                ccVar.F.animate().cancel();
                ccVar.F.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new u5(ccVar, 15));
                ccVar.d(true);
                ccVar.c(null);
                break;
        }
    }
}
