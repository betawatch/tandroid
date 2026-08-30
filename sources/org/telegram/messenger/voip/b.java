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
import kh.a2;
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
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qi0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.a6;
import org.telegram.ui.b7;
import org.telegram.ui.c6;
import org.telegram.ui.g80;
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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x03da, code lost:
    
        r11 = new java.util.ArrayList();
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        qc a02;
        int i11;
        int i12;
        int i13 = this.a;
        int i14 = 4;
        int i15 = 3;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        int i16 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i13) {
            case 0:
                ((ConferenceCall) obj2).lambda$processUpdates$4((TLRPC.Updates) obj);
                break;
            case 1:
                VideoCapturerDevice.lambda$checkScreenCapturerSize$1((VideoCapturerDevice) obj2, (Point) obj);
                break;
            case 2:
                ((VideoCapturerDevice) obj2).lambda$init$4((String) obj);
                break;
            case 3:
                ((VoIPService) obj2).lambda$startGroupCall$21((TL_update.TL_updateGroupCall) obj);
                break;
            case 4:
                ((VoIPService) obj2).lambda$createGroupInstance$71((String) obj);
                break;
            case 5:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$56((l0) obj);
                break;
            case 6:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 7:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) obj);
                break;
            case 8:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically = ((eo0) obj).canScrollVertically(-1);
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
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, i14));
                    kVar.p1.addListener(new org.telegram.ui.ActionBar.c(kVar, z4, i16));
                    kVar.p1.setDuration(320L);
                    kVar.p1.setInterpolator(nr.h);
                    kVar.p1.start();
                    break;
                }
                break;
            case 9:
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
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, i15));
                    kVar2.p1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z10, 0));
                    kVar2.p1.setDuration(320L);
                    kVar2.p1.setInterpolator(nr.h);
                    kVar2.p1.start();
                    break;
                }
                break;
            case 10:
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
            case 11:
                p2 p2Var = (p2) obj2;
                p2 p2Var2 = (p2) obj;
                Drawable drawable2 = ActionBarLayout.m1;
                if (p2Var != null) {
                    p2Var.onTransitionAnimationEnd(false, false);
                }
                p2Var2.onTransitionAnimationEnd(true, false);
                p2Var2.onBecomeFullyVisible();
                break;
            case 12:
                e6 e6Var = (e6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i17 = 0;
                while (i17 < size) {
                    h6 h6Var = (h6) arrayList2.get(i17);
                    File d = h6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList2.remove(i17);
                        i17--;
                        size--;
                        i17++;
                    }
                    if (!arrayList.contains(h6Var.o)) {
                        arrayList.add(h6Var.o);
                    }
                    i17++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = arrayList.size();
                    for (int i18 = 0; i18 < size2; i18++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i18);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(e6Var.a).sendRequest(getmultiwallpapers, new d3(20, e6Var, arrayList2));
                    break;
                }
                break;
            case 13:
                e6 e6Var2 = (e6) obj2;
                d6 d6Var = (d6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = d6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = d6Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i19 = 0; i19 < size3; i19++) {
                    h6 h6Var2 = (h6) arrayList3.get(i19);
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
            case 14:
                i6 i6Var = (i6) obj2;
                i6Var.d((File) obj, i6Var.e0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(i6Var, 19));
                break;
            case 15:
                ((org.telegram.ui.r) obj2).X((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 16:
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
            case 17:
                ((l4) obj2).O0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 18:
                ArrayList arrayList5 = (ArrayList) obj;
                s4 s4Var = ((p4) obj2).a;
                if (!arrayList5.isEmpty()) {
                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                        s4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList5.get(i20)).longValue(), s4Var.U() * 60);
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
            case 19:
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
            case 20:
                org.telegram.ui.d6 d6Var2 = (org.telegram.ui.d6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList6 = d6Var2.c;
                int i21 = 0;
                while (true) {
                    if (i21 >= arrayList6.size()) {
                        i10 = 0;
                    } else if (((c6) arrayList6.get(i21)).c == null || ((c6) arrayList6.get(i21)).c.dialogId != keepMediaException.dialogId) {
                        i21++;
                    } else {
                        i10 = i21;
                    }
                }
                l1 K = d6Var2.b.K(i10);
                if (K != null) {
                    View view2 = K.a;
                    g80 g80Var = new g80(d6Var2.getParentActivity(), d6Var2);
                    g80Var.g(true);
                    g80Var.setParentWindow(z4.Q(d6Var2, g80Var, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    g80Var.setCallback(new a6(d6Var2, keepMediaException, i16));
                    break;
                }
                break;
            case 21:
                b7.Y((b7) obj2, (d2) obj);
                break;
            case 22:
                qi0 qi0Var = new qi0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                qi0Var.m(R.raw.qr_code_logo);
                qi0Var.show();
                break;
            case 23:
                ((y8) obj2).b.j0(((TLRPC.Message) a2.i(1, ((h9) obj).c)).id, 100);
                break;
            case 24:
                v9 v9Var = (v9) obj2;
                String str = (String) obj;
                u9 u9Var = v9Var.I;
                if (u9Var != null) {
                    u9Var.K(str);
                }
                if (v9Var.S != 3) {
                    v9Var.finishFragment();
                    break;
                }
                break;
            case 25:
                v9 v9Var2 = (v9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                v9Var2.f.setText(result.rawMRZ);
                v9Var2.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(nr.f).start();
                u9 u9Var2 = v9Var2.I;
                if (u9Var2 != null) {
                    u9Var2.S0(result);
                }
                AndroidUtilities.runOnUIThread(new m9(v9Var2, 3), 1200L);
                break;
            case 26:
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
                                v9.d0(rectF3, pointFArr3);
                            } else {
                                for (int i24 = 0; i24 < 4; i24++) {
                                    PointF pointF6 = pointFArr3[i24];
                                    PointF pointF7 = pointFArr[i24];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            v9Var3.H = elapsedRealtime;
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
                    v9Var3.H = elapsedRealtime;
                }
                v9Var3.fragmentView.invalidate();
                break;
            case 27:
                pa.W((pa) obj2, (String) obj);
                break;
            case 28:
                sb sbVar = (sb) obj2;
                qc.a0(sbVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                sbVar.W0();
                break;
            default:
                sb sbVar2 = (sb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = qc.a0(sbVar2);
                    i11 = R.raw.msg_antispam;
                    i12 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = qc.a0(sbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                } else {
                    a02 = qc.a0(sbVar2);
                    i11 = R.raw.error;
                    i12 = R.string.UnknownError;
                }
                a2.v(i12, a02, i11, 36);
                break;
        }
    }
}
