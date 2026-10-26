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
import bi.u7;
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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.h4;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.ActionBar.x6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.xp;
import org.telegram.ui.b6;
import org.telegram.ui.b80;
import org.telegram.ui.b9;
import org.telegram.ui.bd;
import org.telegram.ui.c6;
import org.telegram.ui.c7;
import org.telegram.ui.dc;
import org.telegram.ui.j4;
import org.telegram.ui.k9;
import org.telegram.ui.nd;
import org.telegram.ui.p5;
import org.telegram.ui.p9;
import org.telegram.ui.q4;
import org.telegram.ui.t4;
import org.telegram.ui.ta;
import org.telegram.ui.v3;
import org.telegram.ui.w91;
import org.telegram.ui.wb;
import org.telegram.ui.x5;
import org.telegram.ui.x9;
import org.telegram.ui.xc;
import org.telegram.ui.y9;
import org.telegram.ui.yc;
import org.telegram.ui.z5;
import org.telegram.ui.za1;
import org.telegram.ui.zc;
import s4.e1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m0(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x052e, code lost:
    
        r14 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
    
        if (r12.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0268  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        wc b02;
        int i12;
        int i13;
        int i14 = this.a;
        int i15 = 3;
        int i16 = 4;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        int i17 = 0;
        boolean z10 = false;
        int i18 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i14) {
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
                boolean canScrollVertically = ((gp0) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically;
                if (kVar.u1 != z11) {
                    ValueAnimator valueAnimator = kVar.w1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f7 = kVar.v1;
                    kVar.u1 = z11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f7, canScrollVertically ? 0.0f : 1.0f);
                    kVar.w1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, 0));
                    kVar.w1.addListener(new org.telegram.ui.ActionBar.c(kVar, z11, i18));
                    kVar.w1.setDuration(320L);
                    kVar.w1.setInterpolator(ds.h);
                    kVar.w1.start();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z12 = !canScrollVertically2;
                if (kVar2.u1 != z12) {
                    ValueAnimator valueAnimator2 = kVar2.w1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f10 = kVar2.v1;
                    kVar2.u1 = z12;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f10, canScrollVertically2 ? 0.0f : 1.0f);
                    kVar2.w1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, i16));
                    kVar2.w1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z12, 0));
                    kVar2.w1.setDuration(320L);
                    kVar2.w1.setInterpolator(ds.h);
                    kVar2.w1.start();
                    break;
                }
                break;
            case 5:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.v1;
                actionBarLayout.d0((r2) obj, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.H0;
                if (view != null) {
                    view.setVisibility(8);
                    break;
                }
                break;
            case 6:
                r2 r2Var = (r2) obj2;
                r2 r2Var2 = (r2) obj;
                Drawable drawable2 = ActionBarLayout.v1;
                if (r2Var != null) {
                    r2Var.onTransitionAnimationEnd(false, false);
                }
                r2Var2.onTransitionAnimationEnd(true, false);
                r2Var2.onBecomeFullyVisible();
                break;
            case 7:
                t6 t6Var = (t6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i19 = 0;
                while (i19 < size) {
                    w6 w6Var = (w6) arrayList2.get(i19);
                    File d = w6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList2.remove(i19);
                        i19--;
                        size--;
                        i19++;
                    }
                    if (!arrayList.contains(w6Var.o)) {
                        arrayList.add(w6Var.o);
                    }
                    i19++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = arrayList.size();
                    for (int i20 = 0; i20 < size2; i20++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i20);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(t6Var.a).sendRequest(getmultiwallpapers, new bi.j(28, t6Var, arrayList2));
                    break;
                }
                break;
            case 8:
                t6 t6Var2 = (t6) obj2;
                s6 s6Var = (s6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = s6Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = s6Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i21 = 0; i21 < size3; i21++) {
                    w6 w6Var2 = (w6) arrayList3.get(i21);
                    if (w6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = t6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, w6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(w6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new u7((Object) t6Var2, (Object) arrayList4, false, 13));
                break;
            case 9:
                x6 x6Var = (x6) obj2;
                x6Var.d((File) obj, x6Var.h0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.q(x6Var, 20));
                break;
            case 10:
                ((org.telegram.ui.o) obj2).Y((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 11:
                j4 j4Var = (j4) obj2;
                qf.c cVar = (qf.c) obj;
                v3 v3Var = j4Var.K;
                if (v3Var != null) {
                    v3Var.dismiss(true);
                }
                if (j4Var.N0 == cVar) {
                    j4Var.N0 = null;
                    break;
                }
                break;
            case 12:
                ((j4) obj2).S0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 13:
                ArrayList arrayList5 = (ArrayList) obj;
                t4 t4Var = ((q4) obj2).a;
                if (!arrayList5.isEmpty()) {
                    for (int i22 = 0; i22 < arrayList5.size(); i22++) {
                        t4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList5.get(i22)).longValue(), t4Var.V() * 60);
                    }
                    if (t4Var.V() > 0) {
                        wc.b0(t4Var).R(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(t4Var.V() * 60), LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size()))))).j();
                        break;
                    } else {
                        wc.b0(t4Var).R(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size())))).j();
                        break;
                    }
                }
                break;
            case 14:
                x5 x5Var = (x5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                x5Var.T = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    x5Var.getMessagesController().getBoostsController().userCanBoostChannel(x5Var.R, x5Var.T, new p5(x5Var, i17));
                }
                x5Var.h0.animate().cancel();
                x5Var.h0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new kg.e(x5Var, 8));
                x5Var.E0(true);
                x5Var.F0(true);
                x5Var.D0(null);
                break;
            case 15:
                c6 c6Var = (c6) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList6 = c6Var.c;
                int i23 = 0;
                while (true) {
                    if (i23 >= arrayList6.size()) {
                        i10 = 0;
                    } else if (((b6) arrayList6.get(i23)).c == null || ((b6) arrayList6.get(i23)).c.dialogId != keepMediaException.dialogId) {
                        i23++;
                    } else {
                        i10 = i23;
                    }
                }
                e1 K = c6Var.b.K(i10);
                if (K != null) {
                    View view2 = K.a;
                    b80 b80Var = new b80(c6Var.getParentActivity(), c6Var);
                    b80Var.h(true);
                    b80Var.setParentWindow(g5.P(c6Var, b80Var, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    b80Var.setCallback(new z5(c6Var, keepMediaException, i18));
                    break;
                }
                break;
            case 16:
                c7.Y((c7) obj2, (e2) obj);
                break;
            case 17:
                ij0 ij0Var = new ij0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                ij0Var.m(R.raw.qr_code_logo);
                ij0Var.show();
                break;
            case 18:
                ((b9) obj2).b.e0(((TLRPC.Message) ic.a.g(1, ((k9) obj).c)).id, 100);
                break;
            case 19:
                y9 y9Var = (y9) obj2;
                String str = (String) obj;
                x9 x9Var = y9Var.M;
                if (x9Var != null) {
                    x9Var.H(str);
                }
                if (y9Var.W != 3) {
                    y9Var.finishFragment();
                    break;
                }
                break;
            case 20:
                y9 y9Var2 = (y9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                y9Var2.h.setText(result.rawMRZ);
                y9Var2.h.animate().setDuration(200L).alpha(1.0f).setInterpolator(ds.f).start();
                x9 x9Var2 = y9Var2.M;
                if (x9Var2 != null) {
                    x9Var2.R0(result);
                }
                AndroidUtilities.runOnUIThread(new p9(y9Var2, i15), 1200L);
                break;
            case 21:
                y9 y9Var3 = (y9) obj2;
                k6.c cVar2 = (k6.c) obj;
                RectF rectF = (RectF) cVar2.b;
                PointF[] pointFArr = (PointF[]) cVar2.d;
                RectF rectF2 = y9Var3.J;
                PointF[] pointFArr2 = y9Var3.F;
                RectF rectF3 = y9Var3.K;
                PointF[] pointFArr3 = y9Var3.G;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = y9Var3.L;
                if (j10 == 0) {
                    y9Var3.L = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        y9.e0(rectF, pointFArr2);
                        y9.e0(rectF, pointFArr3);
                    } else {
                        for (int i24 = 0; i24 < 4; i24++) {
                            PointF pointF = pointFArr2[i24];
                            PointF pointF2 = pointFArr[i24];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i24];
                            PointF pointF4 = pointFArr[i24];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j11 = elapsedRealtime - j10;
                        if (j11 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j11 / 75.0f));
                            AndroidUtilities.lerp(rectF2, rectF3, min, rectF2);
                            int i25 = 0;
                            while (i25 < 4) {
                                PointF pointF5 = pointFArr2[i25];
                                pointF5.set(AndroidUtilities.lerp(pointF5.x, pointFArr3[i25].x, min), AndroidUtilities.lerp(pointFArr2[i25].y, pointFArr3[i25].y, min));
                                i25++;
                                i17 = i17;
                            }
                            i11 = i17;
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                y9.e0(rectF3, pointFArr3);
                            } else {
                                for (int i26 = i11; i26 < 4; i26++) {
                                    PointF pointF6 = pointFArr3[i26];
                                    PointF pointF7 = pointFArr[i26];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            y9Var3.L = elapsedRealtime;
                        }
                    }
                    i11 = 0;
                    rectF2.set(rectF3);
                    for (int i27 = 0; i27 < 4; i27++) {
                        PointF pointF8 = pointFArr2[i27];
                        PointF pointF9 = pointFArr3[i27];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    y9Var3.L = elapsedRealtime;
                }
                y9Var3.fragmentView.invalidate();
                break;
            case 22:
                ta.X((ta) obj2, (String) obj);
                break;
            case 23:
                wb wbVar = (wb) obj2;
                wc.b0(wbVar).R(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                wbVar.W0();
                break;
            case 24:
                wb wbVar2 = (wb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    b02 = wc.b0(wbVar2);
                    i12 = R.raw.msg_antispam;
                    i13 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    b02 = wc.b0(wbVar2);
                    i12 = R.raw.error;
                    i13 = R.string.UnknownError;
                } else {
                    b02 = wc.b0(wbVar2);
                    i12 = R.raw.error;
                    i13 = R.string.UnknownError;
                }
                org.telegram.messenger.t.q(i13, b02, i12, 36);
                break;
            case 25:
                dc dcVar = (dc) obj2;
                dcVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                dcVar.H.animate().cancel();
                dcVar.H.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new kg.e(dcVar, 23));
                dcVar.d(true);
                dcVar.c(null);
                break;
            case 26:
                bd bdVar = (bd) obj2;
                bdVar.getClass();
                bdVar.presentFragment(w91.c0((TLRPC.Chat) obj, true));
                break;
            case 27:
                List list = (List) obj;
                zc zcVar = ((yc) obj2).b;
                int i28 = zcVar.a;
                za1 za1Var = zcVar.d;
                ArrayList arrayList7 = zcVar.c;
                if (list != null && !list.isEmpty()) {
                    zcVar.n = true;
                    arrayList7.clear();
                    arrayList7.add(0, new xp((h4) list.get(0)));
                    if (zcVar.v != null && zcVar.f) {
                        arrayList7.add(0, new xp(h4.a(i28)));
                    }
                    u6 u6Var = zcVar.b;
                    int a2 = u6Var != null ? u6Var.a() : y6.I.q();
                    for (int i29 = 1; i29 < list.size(); i29++) {
                        h4 h4Var = (h4) list.get(i29);
                        xp xpVar = new xp(h4Var);
                        h4Var.m(i28);
                        xpVar.c = a2;
                        arrayList7.add(xpVar);
                    }
                    int i30 = -1;
                    for (int i31 = 0; i31 < arrayList7.size(); i31++) {
                        xp xpVar2 = (xp) arrayList7.get(i31);
                        boolean z13 = TextUtils.equals(zcVar.s, xpVar2.a()) || (TextUtils.isEmpty(zcVar.s) && xpVar2.a.a);
                        xpVar2.d = z13;
                        if (z13) {
                            i30 = i31;
                        }
                    }
                    xc xcVar = zcVar.h;
                    if (xcVar != null) {
                        xcVar.l();
                    }
                    za1Var.animate().alpha(1.0f).setDuration(150L).start();
                    c10 c10Var = zcVar.e;
                    if (zcVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(c10Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(c10Var, true, 1.0f, true, true);
                    }
                    if (i30 >= 0 && (za1Var.getLayoutManager() instanceof s4.c0)) {
                        ((s4.c0) za1Var.getLayoutManager()).h1(i30, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 28:
                nd ndVar = (nd) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    ndVar.getClass();
                    break;
                }
                z10 = true;
                ndVar.k0 = z10;
                break;
            default:
                nd.X((nd) obj2, (String) obj);
                break;
        }
    }
}
