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
import eg.b3;
import f2.m1;
import java.io.File;
import java.util.ArrayList;
import mh.r5;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.a6;
import org.telegram.ui.ac;
import org.telegram.ui.b7;
import org.telegram.ui.c6;
import org.telegram.ui.d6;
import org.telegram.ui.h80;
import org.telegram.ui.h9;
import org.telegram.ui.l4;
import org.telegram.ui.m9;
import org.telegram.ui.p4;
import org.telegram.ui.p5;
import org.telegram.ui.pa;
import org.telegram.ui.s4;
import org.telegram.ui.s5;
import org.telegram.ui.sb;
import org.telegram.ui.u9;
import org.telegram.ui.v9;
import org.telegram.ui.y3;
import org.telegram.ui.y5;
import org.telegram.ui.y8;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                boolean canScrollVertically = ((fo0) obj).canScrollVertically(-1);
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
                    kVar.p1.setInterpolator(pr.h);
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
                    kVar2.p1.setInterpolator(pr.h);
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
                f6 f6Var = (f6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i16 = 0;
                while (i16 < size) {
                    i6 i6Var = (i6) arrayList2.get(i16);
                    File d = i6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList2.remove(i16);
                        i16--;
                        size--;
                        i16++;
                    }
                    if (!arrayList.contains(i6Var.o)) {
                        arrayList.add(i6Var.o);
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
                    ConnectionsManager.getInstance(f6Var.a).sendRequest(getmultiwallpapers, new b3(20, f6Var, arrayList2));
                    break;
                }
                break;
            case 12:
                f6 f6Var2 = (f6) obj2;
                e6 e6Var = (e6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = e6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = e6Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i18 = 0; i18 < size3; i18++) {
                    i6 i6Var2 = (i6) arrayList3.get(i18);
                    if (i6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = f6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, i6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(i6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new r5((Object) f6Var2, (Object) arrayList4, false, 6));
                break;
            case 13:
                j6 j6Var = (j6) obj2;
                j6Var.d((File) obj, j6Var.e0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(j6Var, 19));
                break;
            case 14:
                ((org.telegram.ui.r) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 15:
                l4 l4Var = (l4) obj2;
                af.f fVar = (af.f) obj;
                y3 y3Var = l4Var.H;
                if (y3Var != null) {
                    y3Var.dismiss(true);
                }
                if (l4Var.J0 == fVar) {
                    l4Var.J0 = null;
                    break;
                }
                break;
            case 16:
                ((l4) obj2).O0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 17:
                ArrayList arrayList5 = (ArrayList) obj;
                s4 s4Var = ((p4) obj2).a;
                if (!arrayList5.isEmpty()) {
                    for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                        s4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList5.get(i19)).longValue(), s4Var.U() * 60);
                    }
                    if (s4Var.U() > 0) {
                        qc.a0(s4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(s4Var.U() * 60), LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size()))))).j();
                        break;
                    } else {
                        qc.a0(s4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size())))).j();
                        break;
                    }
                }
                break;
            case 18:
                y5 y5Var = (y5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                y5Var.O = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    y5Var.getMessagesController().getBoostsController().userCanBoostChannel(y5Var.M, y5Var.O, new p5(y5Var, 0));
                }
                y5Var.c0.animate().cancel();
                y5Var.c0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new s5(y5Var, 0));
                y5Var.F0(true);
                y5Var.G0(true);
                y5Var.E0(null);
                break;
            case 19:
                d6 d6Var = (d6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList6 = d6Var.c;
                int i20 = 0;
                while (true) {
                    if (i20 >= arrayList6.size()) {
                        i20 = 0;
                    } else if (((c6) arrayList6.get(i20)).c == null || ((c6) arrayList6.get(i20)).c.dialogId != keepMediaException.dialogId) {
                        i20++;
                    }
                }
                m1 K = d6Var.b.K(i20);
                if (K != null) {
                    View view2 = K.a;
                    h80 h80Var = new h80(d6Var.getParentActivity(), d6Var);
                    h80Var.g(true);
                    h80Var.setParentWindow(z4.Q(d6Var, h80Var, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    h80Var.setCallback(new a6(d6Var, keepMediaException, i15));
                    break;
                }
                break;
            case 20:
                b7.Y((b7) obj2, (d2) obj);
                break;
            case 21:
                si0 si0Var = new si0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                si0Var.m(R.raw.qr_code_logo);
                si0Var.show();
                break;
            case 22:
                ((y8) obj2).b.j0(((TLRPC.Message) l.d.i(1, ((h9) obj).c)).id, 100);
                break;
            case 23:
                v9 v9Var = (v9) obj2;
                String str = (String) obj;
                u9 u9Var = v9Var.I;
                if (u9Var != null) {
                    u9Var.J(str);
                }
                if (v9Var.S != 3) {
                    v9Var.finishFragment();
                    break;
                }
                break;
            case 24:
                v9 v9Var2 = (v9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                v9Var2.f.setText(result.rawMRZ);
                v9Var2.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(pr.f).start();
                u9 u9Var2 = v9Var2.I;
                if (u9Var2 != null) {
                    u9Var2.P0(result);
                }
                AndroidUtilities.runOnUIThread(new m9(v9Var2, 3), 1200L);
                break;
            case 25:
                v9 v9Var3 = (v9) obj2;
                l7.w0 w0Var = (l7.w0) obj;
                RectF rectF = (RectF) w0Var.c;
                PointF[] pointFArr = (PointF[]) w0Var.d;
                RectF rectF2 = v9Var3.F;
                PointF[] pointFArr2 = v9Var3.B;
                RectF rectF3 = v9Var3.G;
                PointF[] pointFArr3 = v9Var3.C;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = v9Var3.H;
                if (j10 == 0) {
                    v9Var3.H = elapsedRealtime - 75;
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
                                v9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i23 = 0; i23 < 4; i23++) {
                                    PointF pointF6 = pointFArr3[i23];
                                    PointF pointF7 = pointFArr[i23];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            v9Var3.H = elapsedRealtime;
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
                    v9Var3.H = elapsedRealtime;
                }
                v9Var3.fragmentView.invalidate();
                break;
            case 26:
                pa.W((pa) obj2, (String) obj);
                break;
            case 27:
                sb sbVar = (sb) obj2;
                qc.a0(sbVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                sbVar.W0();
                break;
            case 28:
                sb sbVar2 = (sb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = qc.a0(sbVar2);
                    i10 = R.raw.msg_antispam;
                    i11 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = qc.a0(sbVar2);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                } else {
                    a02 = qc.a0(sbVar2);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                l.d.v(i11, a02, i10, 36);
                break;
            default:
                ac acVar = (ac) obj2;
                acVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                acVar.F.animate().cancel();
                acVar.F.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new s5(acVar, 15));
                acVar.d(true);
                acVar.c(null);
                break;
        }
    }
}
