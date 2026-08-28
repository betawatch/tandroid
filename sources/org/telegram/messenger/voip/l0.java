package org.telegram.messenger.voip;

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
import f2.q1;
import gh.u5;
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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.b4;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.in0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.ad;
import org.telegram.ui.e9;
import org.telegram.ui.id;
import org.telegram.ui.j9;
import org.telegram.ui.l4;
import org.telegram.ui.m4;
import org.telegram.ui.m5;
import org.telegram.ui.ma;
import org.telegram.ui.p4;
import org.telegram.ui.pb;
import org.telegram.ui.r9;
import org.telegram.ui.s9;
import org.telegram.ui.s91;
import org.telegram.ui.tc;
import org.telegram.ui.u70;
import org.telegram.ui.uc;
import org.telegram.ui.v8;
import org.telegram.ui.va1;
import org.telegram.ui.vc;
import org.telegram.ui.w5;
import org.telegram.ui.xb;
import org.telegram.ui.xc;
import org.telegram.ui.y3;
import org.telegram.ui.y5;
import org.telegram.ui.y6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(int i9, Object obj, Object obj2) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:233:0x0595, code lost:
    
        r13 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        if (r12.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        oc a02;
        int i10;
        int i11;
        int i12 = this.a;
        int i13 = 4;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        int i14 = -1;
        int i15 = 0;
        boolean z10 = false;
        int i16 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i12) {
            case 0:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 1:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$2((Utilities.Callback2) obj);
                break;
            case 2:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically = ((in0) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically;
                if (kVar.m1 != z11) {
                    ValueAnimator valueAnimator = kVar.o1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f10 = kVar.n1;
                    kVar.m1 = z11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, canScrollVertically ? 0.0f : 1.0f);
                    kVar.o1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, i13));
                    kVar.o1.addListener(new org.telegram.ui.ActionBar.c(kVar, z11, i16));
                    kVar.o1.setDuration(320L);
                    kVar.o1.setInterpolator(gr.h);
                    kVar.o1.start();
                    break;
                }
                break;
            case 3:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z12 = !canScrollVertically2;
                if (kVar2.m1 != z12) {
                    ValueAnimator valueAnimator2 = kVar2.o1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f11 = kVar2.n1;
                    kVar2.m1 = z12;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, canScrollVertically2 ? 0.0f : 1.0f);
                    kVar2.o1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, 3));
                    kVar2.o1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z12, 0));
                    kVar2.o1.setDuration(320L);
                    kVar2.o1.setInterpolator(gr.h);
                    kVar2.o1.start();
                    break;
                }
                break;
            case 4:
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
            case 5:
                o2 o2Var = (o2) obj2;
                o2 o2Var2 = (o2) obj;
                Drawable drawable2 = ActionBarLayout.l1;
                if (o2Var != null) {
                    o2Var.onTransitionAnimationEnd(false, false);
                }
                o2Var2.onTransitionAnimationEnd(true, false);
                o2Var2.onBecomeFullyVisible();
                break;
            case 6:
                a6 a6Var = (a6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i17 = 0;
                while (i17 < size) {
                    d6 d6Var = (d6) arrayList2.get(i17);
                    File d = d6Var.d();
                    if (d != null && d.length() > 0) {
                        arrayList2.remove(i17);
                        i17--;
                        size--;
                        i17++;
                    }
                    if (!arrayList.contains(d6Var.o)) {
                        arrayList.add(d6Var.o);
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
                    ConnectionsManager.getInstance(a6Var.a).sendRequest(getmultiwallpapers, new bg.j0(27, a6Var, arrayList2));
                    break;
                }
                break;
            case 7:
                a6 a6Var2 = (a6) obj2;
                z5 z5Var = (z5) obj;
                TLRPC.TL_wallPaper tL_wallPaper = z5Var.a;
                File pathToAttach = FileLoader.getInstance(UserConfig.selectedAccount).getPathToAttach(tL_wallPaper.document, true);
                ArrayList arrayList3 = z5Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i19 = 0; i19 < size3; i19++) {
                    d6 d6Var2 = (d6) arrayList3.get(i19);
                    if (d6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = a6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), pathToAttach, d6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(d6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                AndroidUtilities.runOnUIThread(new u5((Object) a6Var2, (Object) arrayList4, false, 8));
                break;
            case 8:
                e6 e6Var = (e6) obj2;
                e6Var.d((File) obj, e6Var.d0);
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.p(e6Var, 19));
                break;
            case 9:
                ((org.telegram.ui.p) obj2).W((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 10:
                l4 l4Var = (l4) obj2;
                ve.d dVar = (ve.d) obj;
                y3 y3Var = l4Var.G;
                if (y3Var != null) {
                    y3Var.dismiss(true);
                }
                if (l4Var.I0 == dVar) {
                    l4Var.I0 = null;
                    break;
                }
                break;
            case 11:
                ((l4) obj2).N0.lock();
                ((AnimatorSet) obj).start();
                break;
            case 12:
                ArrayList arrayList5 = (ArrayList) obj;
                p4 p4Var = ((m4) obj2).a;
                if (!arrayList5.isEmpty()) {
                    for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                        p4Var.getMessagesController().setDialogHistoryTTL(((Long) arrayList5.get(i20)).longValue(), p4Var.T() * 60);
                    }
                    if (p4Var.T() > 0) {
                        oc.a0(p4Var).Q(R.raw.fire_on, 36, AndroidUtilities.replaceTags(LocaleController.formatString("AutodeleteTimerEnabledForChats", R.string.AutodeleteTimerEnabledForChats, LocaleController.formatTTLString(p4Var.T() * 60), LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size()))))).j();
                        break;
                    } else {
                        oc.a0(p4Var).Q(R.raw.fire_off, 36, LocaleController.formatString("AutodeleteTimerDisabledForChats", R.string.AutodeleteTimerDisabledForChats, LocaleController.formatPluralString("Chats", arrayList5.size(), Integer.valueOf(arrayList5.size())))).j();
                        break;
                    }
                }
                break;
            case 13:
                org.telegram.ui.u5 u5Var = (org.telegram.ui.u5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                u5Var.N = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    u5Var.getMessagesController().getBoostsController().userCanBoostChannel(u5Var.L, u5Var.N, new m5(u5Var, 0));
                }
                u5Var.b0.animate().cancel();
                u5Var.b0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new mh.x(u5Var, 7));
                u5Var.E0(true);
                u5Var.F0(true);
                u5Var.D0(null);
                break;
            case 14:
                org.telegram.ui.z5 z5Var2 = (org.telegram.ui.z5) obj2;
                CacheByChatsController.KeepMediaException keepMediaException = (CacheByChatsController.KeepMediaException) obj;
                ArrayList arrayList6 = z5Var2.c;
                int i21 = 0;
                while (true) {
                    if (i21 >= arrayList6.size()) {
                        i9 = 0;
                    } else if (((y5) arrayList6.get(i21)).c == null || ((y5) arrayList6.get(i21)).c.dialogId != keepMediaException.dialogId) {
                        i21++;
                    } else {
                        i9 = i21;
                    }
                }
                q1 K = z5Var2.b.K(i9);
                if (K != null) {
                    View view2 = K.a;
                    u70 u70Var = new u70(z5Var2.getParentActivity(), z5Var2);
                    u70Var.g(true);
                    u70Var.setParentWindow(y4.Q(z5Var2, u70Var, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    u70Var.setCallback(new w5(z5Var2, keepMediaException, i16));
                    break;
                }
                break;
            case 15:
                y6.X((y6) obj2, (c2) obj);
                break;
            case 16:
                wh0 wh0Var = new wh0((Context) obj2, LocaleController.getString(R.string.InviteByQRCode), ((String[]) obj)[0], LocaleController.getString(R.string.QRCodeLinkGroupCall), false);
                wh0Var.m(R.raw.qr_code_logo);
                wh0Var.show();
                break;
            case 17:
                ((v8) obj2).b.i0(((TLRPC.Message) j3.r0.j(1, ((e9) obj).c)).id, 100);
                break;
            case 18:
                s9 s9Var = (s9) obj2;
                String str = (String) obj;
                r9 r9Var = s9Var.H;
                if (r9Var != null) {
                    r9Var.K(str);
                }
                if (s9Var.R != 3) {
                    s9Var.finishFragment();
                    break;
                }
                break;
            case 19:
                s9 s9Var2 = (s9) obj2;
                MrzRecognizer.Result result = (MrzRecognizer.Result) obj;
                s9Var2.f.setText(result.rawMRZ);
                s9Var2.f.animate().setDuration(200L).alpha(1.0f).setInterpolator(gr.f).start();
                r9 r9Var2 = s9Var2.H;
                if (r9Var2 != null) {
                    r9Var2.T0(result);
                }
                AndroidUtilities.runOnUIThread(new j9(s9Var2, 3), 1200L);
                break;
            case 20:
                s9 s9Var3 = (s9) obj2;
                j4.c cVar = (j4.c) obj;
                RectF rectF = (RectF) cVar.c;
                PointF[] pointFArr = (PointF[]) cVar.d;
                RectF rectF2 = s9Var3.E;
                PointF[] pointFArr2 = s9Var3.A;
                RectF rectF3 = s9Var3.F;
                PointF[] pointFArr3 = s9Var3.B;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = s9Var3.G;
                if (j10 == 0) {
                    s9Var3.G = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        s9.c0(rectF, pointFArr2);
                        s9.c0(rectF, pointFArr3);
                    } else {
                        while (i15 < 4) {
                            PointF pointF = pointFArr2[i15];
                            PointF pointF2 = pointFArr[i15];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i15];
                            PointF pointF4 = pointFArr[i15];
                            pointF3.set(pointF4.x, pointF4.y);
                            i15++;
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
                                s9.c0(rectF3, pointFArr3);
                            } else {
                                for (int i23 = 0; i23 < 4; i23++) {
                                    PointF pointF6 = pointFArr3[i23];
                                    PointF pointF7 = pointFArr[i23];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            s9Var3.G = elapsedRealtime;
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
                    s9Var3.G = elapsedRealtime;
                }
                s9Var3.fragmentView.invalidate();
                break;
            case 21:
                ma.V((ma) obj2, (String) obj);
                break;
            case 22:
                pb pbVar = (pb) obj2;
                oc.a0(pbVar).Q(R.raw.ic_ban, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.RestrictedParticipantSending, UserObject.getFirstName((TLRPC.User) obj)))).k(false);
                pbVar.W0();
                break;
            case 23:
                pb pbVar2 = (pb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    a02 = oc.a0(pbVar2);
                    i10 = R.raw.msg_antispam;
                    i11 = R.string.ChannelAntiSpamFalsePositiveReported;
                } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                    a02 = oc.a0(pbVar2);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                } else {
                    a02 = oc.a0(pbVar2);
                    i10 = R.raw.error;
                    i11 = R.string.UnknownError;
                }
                org.telegram.messenger.l0.p(i11, a02, i10, 36);
                break;
            case 24:
                xb xbVar = (xb) obj2;
                xbVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                xbVar.E.animate().cancel();
                xbVar.E.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new mh.x(xbVar, 22));
                xbVar.d(true);
                xbVar.c(null);
                break;
            case 25:
                xc xcVar = (xc) obj2;
                xcVar.getClass();
                xcVar.presentFragment(s91.c0((TLRPC.Chat) obj, true));
                break;
            case 26:
                List list = (List) obj;
                vc vcVar = ((uc) obj2).b;
                int i25 = vcVar.a;
                va1 va1Var = vcVar.d;
                ArrayList arrayList7 = vcVar.c;
                if (list != null && !list.isEmpty()) {
                    vcVar.n = true;
                    arrayList7.clear();
                    arrayList7.add(0, new bp((b4) list.get(0)));
                    if (vcVar.v != null && vcVar.f) {
                        arrayList7.add(0, new bp(b4.a(i25)));
                    }
                    b6 b6Var = vcVar.b;
                    int a2 = b6Var != null ? b6Var.a() : f6.I.q();
                    for (int i26 = 1; i26 < list.size(); i26++) {
                        b4 b4Var = (b4) list.get(i26);
                        bp bpVar = new bp(b4Var);
                        b4Var.n(i25);
                        bpVar.c = a2;
                        arrayList7.add(bpVar);
                    }
                    for (int i27 = 0; i27 < arrayList7.size(); i27++) {
                        bp bpVar2 = (bp) arrayList7.get(i27);
                        boolean z13 = TextUtils.equals(vcVar.s, bpVar2.a()) || (TextUtils.isEmpty(vcVar.s) && bpVar2.a.a);
                        bpVar2.d = z13;
                        if (z13) {
                            i14 = i27;
                        }
                    }
                    tc tcVar = vcVar.h;
                    if (tcVar != null) {
                        tcVar.l();
                    }
                    va1Var.animate().alpha(1.0f).setDuration(150L).start();
                    e00 e00Var = vcVar.e;
                    if (vcVar.n) {
                        AndroidUtilities.updateViewVisibilityAnimated(e00Var, false, 1.0f, true, true);
                    } else {
                        AndroidUtilities.updateViewVisibilityAnimated(e00Var, true, 1.0f, true, true);
                    }
                    if (i14 >= 0 && (va1Var.getLayoutManager() instanceof f2.m0)) {
                        ((f2.m0) va1Var.getLayoutManager()).h1(i14, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
                        break;
                    }
                }
                break;
            case 27:
                id idVar = (id) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    idVar.getClass();
                    break;
                }
                z10 = true;
                idVar.f0 = z10;
                break;
            case 28:
                id.V((id) obj2, (String) obj);
                break;
            default:
                id idVar2 = (id) obj2;
                TLObject tLObject2 = (TLObject) obj;
                ArrayList arrayList8 = idVar2.b0;
                idVar2.Z = false;
                if (tLObject2 != null && idVar2.getParentActivity() != null) {
                    for (int i28 = 0; i28 < arrayList8.size(); i28++) {
                        idVar2.G.removeView((View) arrayList8.get(i28));
                    }
                    arrayList8.clear();
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                    int i29 = 0;
                    while (i29 < tL_messages_chats.chats.size()) {
                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(idVar2.getParentActivity(), new ad(idVar2, i15), false, 0);
                        nVar.a(tL_messages_chats.chats.get(i29), i29 == tL_messages_chats.chats.size() - 1);
                        arrayList8.add(nVar);
                        idVar2.H.addView(nVar, g7.e6.n(-1, 72));
                        i29++;
                    }
                    idVar2.g0();
                    break;
                }
                break;
        }
    }
}
