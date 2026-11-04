package org.telegram.messenger.voip;

import ai.f3;
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
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ci.v6;
import ii.v3;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import k2.p1;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.n10;
import org.telegram.messenger.rr;
import org.telegram.messenger.s2;
import org.telegram.messenger.w7;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.s1;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ad;
import org.telegram.ui.e9;
import org.telegram.ui.f2;
import org.telegram.ui.i4;
import org.telegram.ui.i9;
import org.telegram.ui.ka;
import org.telegram.ui.kb;
import org.telegram.ui.lc;
import org.telegram.ui.mc;
import org.telegram.ui.n5;
import org.telegram.ui.nc;
import org.telegram.ui.o4;
import org.telegram.ui.pc;
import org.telegram.ui.r4;
import org.telegram.ui.r41;
import org.telegram.ui.r9;
import org.telegram.ui.rb;
import org.telegram.ui.s9;
import org.telegram.ui.u3;
import org.telegram.ui.u51;
import org.telegram.ui.v5;
import org.telegram.ui.v8;
import org.telegram.ui.w5;
import org.telegram.ui.y5;
import org.telegram.ui.y50;
import org.telegram.ui.z5;
import org.telegram.ui.z6;
import u4.d1;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class l0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l0(int i3, Object obj, Object obj2) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:209:0x0527, code lost:
    
        r15 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r12.text.equals("CHANNELS_ADMIN_PUBLIC_TOO_MUCH") == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0260  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i3 = this.a;
        int i10 = 4;
        int i11 = 3;
        ArrayList arrayList = null;
        Bitmap bitmap = null;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 1;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i3) {
            case 0:
                ((VoIPService) obj2).lambda$startScreenCapture$58((TLRPC.Updates) obj);
                break;
            case 1:
                ((AudioManager) obj2).setCommunicationDevice((AudioDeviceInfo) obj);
                break;
            case 2:
                ((VoipAudioManager) obj2).lambda$isBluetoothAndSpeakerOnAsync$4((n10) obj);
                break;
            case 3:
                org.telegram.ui.ActionBar.k kVar = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically = ((km0) obj).canScrollVertically(-1);
                boolean z11 = !canScrollVertically;
                if (kVar.D1 != z11) {
                    ValueAnimator valueAnimator = kVar.F1;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    float f10 = kVar.E1;
                    kVar.D1 = z11;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, canScrollVertically ? 0.0f : 1.0f);
                    kVar.F1 = ofFloat;
                    ofFloat.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar, i10));
                    kVar.F1.addListener(new org.telegram.ui.ActionBar.c(kVar, z11, i13));
                    kVar.F1.setDuration(320L);
                    kVar.F1.setInterpolator(xq.h);
                    kVar.F1.start();
                    break;
                }
                break;
            case 4:
                org.telegram.ui.ActionBar.k kVar2 = (org.telegram.ui.ActionBar.k) obj2;
                boolean canScrollVertically2 = ((RecyclerView) obj).canScrollVertically(-1);
                boolean z12 = !canScrollVertically2;
                if (kVar2.D1 != z12) {
                    ValueAnimator valueAnimator2 = kVar2.F1;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    float f11 = kVar2.E1;
                    kVar2.D1 = z12;
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f11, canScrollVertically2 ? 0.0f : 1.0f);
                    kVar2.F1 = ofFloat2;
                    ofFloat2.addUpdateListener(new org.telegram.ui.ActionBar.a(kVar2, i11));
                    kVar2.F1.addListener(new org.telegram.ui.ActionBar.c(kVar2, z12, 0));
                    kVar2.F1.setDuration(320L);
                    kVar2.F1.setInterpolator(xq.h);
                    kVar2.F1.start();
                    break;
                }
                break;
            case 5:
                ActionBarLayout actionBarLayout = (ActionBarLayout) obj2;
                Drawable drawable = ActionBarLayout.w1;
                actionBarLayout.e0((d2) obj, false);
                actionBarLayout.setVisibility(8);
                View view = actionBarLayout.I0;
                if (view != null) {
                    view.setVisibility(8);
                    break;
                }
                break;
            case 6:
                d2 d2Var = (d2) obj2;
                d2 d2Var2 = (d2) obj;
                Drawable drawable2 = ActionBarLayout.w1;
                if (d2Var != null) {
                    d2Var.onTransitionAnimationEnd(false, false);
                }
                d2Var2.onTransitionAnimationEnd(true, false);
                d2Var2.onBecomeFullyVisible();
                break;
            case 7:
                d6 d6Var = (d6) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                int size = arrayList2.size();
                int i14 = 0;
                while (i14 < size) {
                    g6 g6Var = (g6) arrayList2.get(i14);
                    File e10 = g6Var.e();
                    if (e10 != null && e10.length() > 0) {
                        arrayList2.remove(i14);
                        i14--;
                        size--;
                        i14++;
                    }
                    if (!arrayList.contains(g6Var.o)) {
                        arrayList.add(g6Var.o);
                    }
                    i14++;
                }
                if (arrayList != null) {
                    TL_account.getMultiWallPapers getmultiwallpapers = new TL_account.getMultiWallPapers();
                    int size2 = arrayList.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                        tL_inputWallPaperSlug.slug = (String) arrayList.get(i15);
                        getmultiwallpapers.wallpapers.add(tL_inputWallPaperSlug);
                    }
                    ConnectionsManager.getInstance(d6Var.a).sendRequest(getmultiwallpapers, new f3(29, d6Var, arrayList2));
                    break;
                }
                break;
            case 8:
                d6 d6Var2 = (d6) obj2;
                c6 c6Var = (c6) obj;
                TLRPC.TL_wallPaper tL_wallPaper = c6Var.a;
                w7.G(h10.t0);
                File K = w7.K(tL_wallPaper.document, null, true, true);
                ArrayList arrayList3 = c6Var.b;
                int size3 = arrayList3.size();
                ArrayList arrayList4 = null;
                for (int i16 = 0; i16 < size3; i16++) {
                    g6 g6Var2 = (g6) arrayList3.get(i16);
                    if (g6Var2.o.equals(tL_wallPaper.slug)) {
                        Bitmap b10 = d6.b(bitmap, "application/x-tgwallpattern".equals(tL_wallPaper.document.mime_type), K, g6Var2);
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                            arrayList4.add(g6Var2);
                        }
                        bitmap = b10;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                }
                org.telegram.messenger.g0.h3(new v6((Object) d6Var2, (Object) arrayList4, false, 13));
                break;
            case 9:
                j6 j6Var = (j6) obj2;
                j6Var.d((File) obj, j6Var.i0);
                org.telegram.messenger.g0.h3(new i6(j6Var, 0));
                break;
            case 10:
                ((org.telegram.ui.o) obj2).c0((TLRPC.TL_messages_archivedStickers) obj);
                break;
            case 11:
                i4 i4Var = (i4) obj2;
                sf.b bVar = (sf.b) obj;
                u3 u3Var = i4Var.L;
                if (u3Var != null) {
                    u3Var.a(true);
                }
                if (i4Var.O0 == bVar) {
                    i4Var.O0 = null;
                    break;
                }
                break;
            case 12:
                ((i4) obj2).T0.d();
                ((AnimatorSet) obj).start();
                break;
            case 13:
                f2.a((f2) obj2, (SpannableString) obj);
                break;
            case 14:
                ArrayList arrayList5 = (ArrayList) obj;
                r4 r4Var = (r4) ((o4) obj2).b;
                if (!arrayList5.isEmpty()) {
                    for (int i17 = 0; i17 < arrayList5.size(); i17++) {
                        r4Var.getMessagesController().I4(r4Var.Z() * 60, ((Long) arrayList5.get(i17)).longValue());
                    }
                    if (r4Var.Z() > 0) {
                        org.telegram.messenger.camera.q.s(bd.a0("AutodeleteTimerEnabledForChats", null, 2131753778, bd.c0(r4Var.Z() * 60), bd.G(arrayList5.size(), "Chats", Integer.valueOf(arrayList5.size()))), fc.a0(r4Var), R.raw.fire_on, 36);
                        break;
                    } else {
                        fc.a0(r4Var).Q(R.raw.fire_off, 36, bd.a0("AutodeleteTimerDisabledForChats", null, 2131753779, bd.G(arrayList5.size(), "Chats", Integer.valueOf(arrayList5.size())))).j();
                        break;
                    }
                }
                break;
            case 15:
                v5 v5Var = (v5) obj2;
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                v5Var.U = tL_premium_boostsStatus;
                if (tL_premium_boostsStatus != null) {
                    v5Var.getMessagesController().G0().b(v5Var.S, v5Var.U, new n5(v5Var, i12));
                }
                v5Var.i0.animate().cancel();
                v5Var.i0.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new v3(v5Var, 18));
                v5Var.I0(true);
                v5Var.J0(true);
                v5Var.H0(null);
                break;
            case 16:
                z5 z5Var = (z5) obj2;
                s2 s2Var = (s2) obj;
                ArrayList arrayList6 = z5Var.c;
                while (true) {
                    if (i12 >= arrayList6.size()) {
                        i12 = 0;
                    } else if (((y5) arrayList6.get(i12)).c == null || ((y5) arrayList6.get(i12)).c.a != s2Var.a) {
                        i12++;
                    }
                }
                d1 K2 = z5Var.b.K(i12);
                if (K2 != null) {
                    View view2 = K2.a;
                    y50 y50Var = new y50(z5Var.getParentActivity(), z5Var);
                    y50Var.h(true);
                    y50Var.setParentWindow(t4.P(z5Var, y50Var, view2, view2.getMeasuredWidth() / 2.0f, view2.getMeasuredHeight() / 2.0f));
                    y50Var.setCallback(new w5(z5Var, s2Var, i13));
                    break;
                }
                break;
            case 17:
                z6.c0((z6) obj2, (s1) obj);
                break;
            case 18:
                og0 og0Var = new og0((Context) obj2, bd.M0(2131749178, null), ((String[]) obj)[0], bd.M0(2131746517, null), false);
                og0Var.I0();
                og0Var.show();
                break;
            case 19:
                ((v8) obj2).b.i0(((TLRPC.Message) p1.h(1, ((e9) obj).c)).id, 100);
                break;
            case 20:
                s9 s9Var = (s9) obj2;
                String str = (String) obj;
                r9 r9Var = s9Var.N;
                if (r9Var != null) {
                    r9Var.M(str);
                }
                if (s9Var.X != 3) {
                    s9Var.finishFragment();
                    break;
                }
                break;
            case 21:
                s9 s9Var2 = (s9) obj2;
                rr rrVar = (rr) obj;
                s9Var2.h.setText(rrVar.p);
                s9Var2.h.animate().setDuration(200L).alpha(1.0f).setInterpolator(xq.f).start();
                r9 r9Var2 = s9Var2.N;
                if (r9Var2 != null) {
                    r9Var2.V0(rrVar);
                }
                org.telegram.messenger.g0.i3(new i9(s9Var2, 3), 1200L);
                break;
            case 22:
                s9 s9Var3 = (s9) obj2;
                k4.j jVar = (k4.j) obj;
                RectF rectF = (RectF) jVar.b;
                PointF[] pointFArr = (PointF[]) jVar.c;
                RectF rectF2 = s9Var3.K;
                PointF[] pointFArr2 = s9Var3.G;
                RectF rectF3 = s9Var3.L;
                PointF[] pointFArr3 = s9Var3.H;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j10 = s9Var3.M;
                if (j10 == 0) {
                    s9Var3.M = elapsedRealtime - 75;
                    rectF3.set(rectF);
                    rectF2.set(rectF);
                    if (pointFArr == null) {
                        s9.i0(rectF, pointFArr2);
                        s9.i0(rectF, pointFArr3);
                    } else {
                        for (int i18 = 0; i18 < 4; i18++) {
                            PointF pointF = pointFArr2[i18];
                            PointF pointF2 = pointFArr[i18];
                            pointF.set(pointF2.x, pointF2.y);
                            PointF pointF3 = pointFArr3[i18];
                            PointF pointF4 = pointFArr[i18];
                            pointF3.set(pointF4.x, pointF4.y);
                        }
                    }
                } else {
                    if (rectF2 != null) {
                        long j11 = elapsedRealtime - j10;
                        if (j11 < 75) {
                            float min = Math.min(1.0f, Math.max(0.0f, j11 / 75.0f));
                            org.telegram.messenger.g0.Z1(rectF2, rectF3, min, rectF2);
                            for (int i19 = 0; i19 < 4; i19++) {
                                PointF pointF5 = pointFArr2[i19];
                                pointF5.set(org.telegram.messenger.g0.T1(pointF5.x, pointFArr3[i19].x, min), org.telegram.messenger.g0.T1(pointFArr2[i19].y, pointFArr3[i19].y, min));
                            }
                            rectF3.set(rectF);
                            if (pointFArr != null) {
                                s9.i0(rectF3, pointFArr3);
                            } else {
                                for (int i20 = 0; i20 < 4; i20++) {
                                    PointF pointF6 = pointFArr3[i20];
                                    PointF pointF7 = pointFArr[i20];
                                    pointF6.set(pointF7.x, pointF7.y);
                                }
                            }
                            s9Var3.M = elapsedRealtime;
                        }
                    }
                    rectF2.set(rectF3);
                    for (int i21 = 0; i21 < 4; i21++) {
                        PointF pointF8 = pointFArr2[i21];
                        PointF pointF9 = pointFArr3[i21];
                        pointF8.set(pointF9.x, pointF9.y);
                    }
                    rectF3.set(rectF);
                    if (pointFArr != null) {
                    }
                    s9Var3.M = elapsedRealtime;
                }
                s9Var3.fragmentView.invalidate();
                break;
            case 23:
                ka.b0((ka) obj2, (String) obj);
                break;
            case 24:
                kb kbVar = (kb) obj2;
                fc.a0(kbVar).Q(R.raw.ic_ban, 36, org.telegram.messenger.g0.X2(bd.a0(null, null, 2131746067, l10.j((TLRPC.User) obj, true)))).k(false);
                kbVar.a1();
                break;
            case 25:
                kb kbVar2 = (kb) obj2;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    k5.o(null, 2131752466, fc.a0(kbVar2), R.raw.msg_antispam, 36);
                    break;
                } else {
                    k5.o(null, 2131743889, tLObject instanceof TLRPC.TL_boolFalse ? fc.a0(kbVar2) : fc.a0(kbVar2), R.raw.error, 36);
                    break;
                }
            case 26:
                rb rbVar = (rb) obj2;
                rbVar.d = (TL_stories.TL_premium_boostsStatus) obj;
                rbVar.I.animate().cancel();
                rbVar.I.animate().alpha(0.0f).setDuration(100L).setStartDelay(0L).setListener(new w9(rbVar, i11));
                rbVar.d(true);
                rbVar.c(null);
                break;
            case 27:
                pc pcVar = (pc) obj2;
                pcVar.getClass();
                pcVar.presentFragment(r41.g0((TLRPC.Chat) obj, true));
                break;
            case 28:
                List list = (List) obj;
                nc ncVar = ((mc) obj2).b;
                int i22 = ncVar.a;
                u51 u51Var = ncVar.d;
                ArrayList arrayList7 = ncVar.c;
                if (list != null && !list.isEmpty()) {
                    ncVar.n = true;
                    arrayList7.clear();
                    arrayList7.add(0, new uo((p3) list.get(0)));
                    if (ncVar.w != null && ncVar.f) {
                        arrayList7.add(0, new uo(p3.a(i22)));
                    }
                    e6 e6Var = ncVar.b;
                    int a10 = e6Var != null ? e6Var.a() : k6.I.q();
                    for (int i23 = 1; i23 < list.size(); i23++) {
                        p3 p3Var = (p3) list.get(i23);
                        uo uoVar = new uo(p3Var);
                        p3Var.m(i22);
                        uoVar.c = a10;
                        arrayList7.add(uoVar);
                    }
                    int i24 = -1;
                    for (int i25 = 0; i25 < arrayList7.size(); i25++) {
                        uo uoVar2 = (uo) arrayList7.get(i25);
                        boolean z13 = TextUtils.equals(ncVar.s, uoVar2.a()) || (TextUtils.isEmpty(ncVar.s) && uoVar2.a.a);
                        uoVar2.d = z13;
                        if (z13) {
                            i24 = i25;
                        }
                    }
                    lc lcVar = ncVar.h;
                    if (lcVar != null) {
                        lcVar.f();
                    }
                    u51Var.animate().alpha(1.0f).setDuration(150L).start();
                    iz izVar = ncVar.e;
                    if (ncVar.n) {
                        org.telegram.messenger.g0.Z3(izVar, false, 1.0f, true, true);
                    } else {
                        org.telegram.messenger.g0.Z3(izVar, true, 1.0f, true, true);
                    }
                    if (i24 >= 0 && (u51Var.getLayoutManager() instanceof u4.b0)) {
                        ((u4.b0) u51Var.getLayoutManager()).h1(i24, (org.telegram.messenger.g0.q.x - org.telegram.messenger.g0.L(83.0f)) / 2);
                        break;
                    }
                }
                break;
            default:
                ad adVar = (ad) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null) {
                    adVar.getClass();
                    break;
                }
                z10 = true;
                adVar.l0 = z10;
                break;
        }
    }
}
