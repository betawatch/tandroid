package org.telegram.ui;

import android.animation.AnimatorSet;
import android.graphics.Point;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hq0(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        hi.w wVar;
        ArrayList arrayList;
        int i7;
        int i10;
        int i11;
        TL_iv.PageBlock pageBlock = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer.BackgroundDrawable backgroundDrawable = (PhotoViewer.BackgroundDrawable) this.b;
                int i13 = PhotoViewer.BackgroundDrawable.g;
                backgroundDrawable.a();
                break;
            case 1:
                vq0 vq0Var = (vq0) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) vq0Var.a.O0.getLayoutParams();
                ((WindowManager) org.telegram.messenger.t0.b.getSystemService("window")).getDefaultDisplay().getRotation();
                int z10 = org.telegram.messenger.n10.z(34.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer = vq0Var.a;
                int i14 = z10 + (!photoViewer.s ? org.telegram.messenger.g0.m : 0);
                if (i14 != layoutParams.topMargin) {
                    layoutParams.topMargin = i14;
                    photoViewer.O0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) vq0Var.a.P0.getLayoutParams();
                int z11 = org.telegram.messenger.n10.z(40.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer2 = vq0Var.a;
                int i15 = z11 + (!photoViewer2.s ? org.telegram.messenger.g0.m : 0);
                if (layoutParams2.topMargin != i15) {
                    layoutParams2.topMargin = i15;
                    photoViewer2.P0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 2:
                ((ai.a1) this.b).run();
                break;
            case 3:
                k kVar = (k) this.b;
                kVar.getClass();
                kVar.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 4:
                ((AnimatorSet) this.b).start();
                break;
            case 5:
                ((a1) this.b).a(2, false);
                break;
            case 6:
                g4 g4Var = ((p0) this.b).a;
                g4Var.T0.e();
                Runnable runnable = g4Var.b0;
                if (runnable != null) {
                    runnable.run();
                    g4Var.b0 = null;
                    break;
                }
                break;
            case 7:
                q1 q1Var = (q1) ((m1) this.b).b;
                g4 g4Var2 = q1Var.y;
                View view = g4Var2.P;
                if (view != null) {
                    g4Var2.Q.addView(view, c8.ma.c(-1.0f, -1));
                    q1Var.y.Q.setVisibility(0);
                    break;
                }
                break;
            case 8:
                vf.c.t(((q1) ((n1) this.b).b).getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ((a2) this.b).requestLayout();
                break;
            case 10:
                t3 t3Var = (t3) this.b;
                t3Var.release();
                t3Var.L.q();
                break;
            case 11:
                e4 e4Var = (e4) this.b;
                ArrayList arrayList2 = new ArrayList(e4Var.d);
                int size = arrayList2.size();
                g4 g4Var3 = e4Var.N;
                int i16 = size + (g4Var3.L == null ? 0 : 1);
                int[] iArr = new int[i16];
                int[] iArr2 = new int[i16];
                k3 k3Var = g4Var3.v0[0];
                if (k3Var != null && (wVar = k3Var.b) != null) {
                    Point point = org.telegram.messenger.g0.q;
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(point.x, TLObject.FLAG_31);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(point.y, TLObject.FLAG_31);
                    int i17 = 0;
                    int i18 = 0;
                    while (i17 < i16) {
                        boolean z12 = e4Var.J;
                        if (z12 && i17 == 0) {
                            iArr[i12] = i12;
                        } else {
                            int i19 = z12 ? i17 - 1 : i17;
                            TL_iv.PageBlock pageBlock2 = (i19 < 0 || i19 >= arrayList2.size()) ? pageBlock : (TL_iv.PageBlock) arrayList2.get(i19);
                            if (pageBlock2 == null || pageBlock2.cachedHeight == 0 || pageBlock2.cachedWidth != View.MeasureSpec.getSize(makeMeasureSpec)) {
                                v4.f1 a10 = e4Var.a(wVar, e4.I(pageBlock2));
                                View view2 = a10.a;
                                int i20 = i18;
                                TL_iv.PageBlock pageBlock3 = pageBlock2;
                                arrayList = arrayList2;
                                i7 = makeMeasureSpec2;
                                i10 = i17;
                                i11 = i20;
                                e4Var.H(a10.f, a10, pageBlock3, i19, arrayList2.size(), true);
                                view2.measure(makeMeasureSpec, i7);
                                int measuredHeight = view2.getMeasuredHeight();
                                iArr[i10] = measuredHeight;
                                if (pageBlock3 != null) {
                                    pageBlock3.cachedHeight = measuredHeight;
                                    pageBlock3.cachedWidth = View.MeasureSpec.getSize(makeMeasureSpec);
                                }
                                int i21 = i10 - 1;
                                iArr2[i10] = (i21 >= 0 ? 0 : iArr2[i21]) + iArr[i10];
                                i18 = i11 + iArr[i10];
                                i17 = i10 + 1;
                                makeMeasureSpec2 = i7;
                                arrayList2 = arrayList;
                                pageBlock = null;
                                i12 = 0;
                            } else {
                                iArr[i17] = pageBlock2.cachedHeight;
                            }
                        }
                        arrayList = arrayList2;
                        i7 = makeMeasureSpec2;
                        i10 = i17;
                        i11 = i18;
                        int i212 = i10 - 1;
                        iArr2[i10] = (i212 >= 0 ? 0 : iArr2[i212]) + iArr[i10];
                        i18 = i11 + iArr[i10];
                        i17 = i10 + 1;
                        makeMeasureSpec2 = i7;
                        arrayList2 = arrayList;
                        pageBlock = null;
                        i12 = 0;
                    }
                    org.telegram.messenger.g0.g3(new b0(e4Var, i18, iArr, iArr2));
                    break;
                }
                break;
            case 12:
                b5 b5Var = (b5) this.b;
                if (!b5Var.x) {
                    b5Var.x = true;
                    org.telegram.ui.Components.wk0.d(new a5(b5Var, i12));
                    break;
                }
                break;
            case 13:
                x5 x5Var = (x5) this.b;
                x5Var.d.clear();
                x5Var.getMessagesController().u7.h(x5Var.e, x5Var.d);
                x5Var.Z();
                x5Var.finishFragment();
                break;
            case 14:
                final a5 a5Var = (a5) this.b;
                ArrayList d12 = org.telegram.messenger.g0.d1();
                File file = (File) d12.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(org.telegram.messenger.bz.h0)) {
                    int size2 = d12.size();
                    while (i12 < size2) {
                        File file2 = (File) d12.get(i12);
                        if (file2.getAbsolutePath().startsWith(org.telegram.messenger.bz.h0) && file2.canWrite()) {
                            file = file2;
                        } else {
                            i12++;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    final long blockSizeLong = statFs.getBlockSizeLong();
                    final long availableBlocksLong = statFs.getAvailableBlocksLong();
                    final long blockCountLong = statFs.getBlockCountLong();
                    org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.c6
                        @Override // java.lang.Runnable
                        public final void run() {
                            long j3 = blockCountLong;
                            long j10 = blockSizeLong;
                            x6.l0 = Long.valueOf(j3 * j10);
                            Long valueOf = Long.valueOf(availableBlocksLong * j10);
                            x6.m0 = valueOf;
                            a5Var.a(x6.l0, valueOf);
                        }
                    });
                    break;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 15:
                org.telegram.messenger.x10 x10Var = (org.telegram.messenger.x10) this.b;
                x6.i0 = false;
                long s02 = x6.s0(org.telegram.messenger.w7.j(4), 5);
                long s03 = x6.s0(org.telegram.messenger.w7.j(4), 4);
                long s04 = x6.s0(org.telegram.messenger.w7.j(100), 0) + x6.s0(org.telegram.messenger.w7.j(0), 0);
                long s05 = x6.s0(org.telegram.messenger.w7.j(101), 0) + x6.s0(org.telegram.messenger.w7.j(2), 0);
                long s06 = x6.s0(org.telegram.messenger.w7.j(5), 1) + x6.s0(org.telegram.messenger.w7.j(3), 1);
                long s07 = x6.s0(org.telegram.messenger.w7.j(5), 2) + x6.s0(org.telegram.messenger.w7.j(3), 2);
                long s08 = x6.s0(org.telegram.messenger.w7.j(4), 3) + x6.s0(new File(org.telegram.messenger.w7.j(4), "acache"), 0);
                long s09 = x6.s0(org.telegram.messenger.w7.j(1), 0);
                long s010 = x6.s0(org.telegram.messenger.w7.j(6), 0);
                long s011 = x6.s0(org.telegram.messenger.g0.P0(), 1);
                boolean z13 = org.telegram.messenger.s2.a;
                long j3 = s02 + s03 + s05 + s09 + s04 + s06 + s07 + s08 + s010 + s011;
                x6.k0 = Long.valueOf(j3);
                x6.j0 = System.currentTimeMillis();
                if (!x6.i0) {
                    org.telegram.messenger.g0.g3(new a6(0, j3, x10Var));
                    break;
                }
                break;
            case 16:
                ((o6) this.b).dismiss();
                break;
            case 17:
                t9 t9Var = (t9) ((m4) this.b).b;
                try {
                    CameraView cameraView = t9Var.d;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, t9Var.d.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = t9Var.d;
                if (cameraView2 != null) {
                    t9Var.h0(cameraView2.getTextureView().getBitmap());
                    break;
                }
                break;
            case 18:
                y9 y9Var = (y9) this.b;
                x9 x9Var = y9Var.a;
                if (x9Var != null) {
                    x9Var.requestFocus();
                    org.telegram.messenger.g0.I3(y9Var.a);
                    break;
                }
                break;
            case 19:
                la laVar = (la) this.b;
                String str = laVar.r;
                if (str == null || str.length() > 0) {
                    laVar.n = true;
                    laVar.j0(laVar.w.size() <= 0);
                    laVar.n = false;
                    break;
                }
                break;
            case 20:
                cb cbVar = (cb) this.b;
                if (cbVar.W != -1) {
                    cbVar.Y.getNotificationCenter().j(cbVar.W);
                    cbVar.W = -1;
                }
                if (org.telegram.messenger.s2.a) {
                    org.telegram.messenger.a8.b("admin logs chatItemAnimator enable notifications");
                    break;
                }
                break;
            case 21:
                lb lbVar = ((kb) this.b).f;
                lbVar.getNotificationCenter().j(lbVar.L0);
                break;
            case 22:
                org.telegram.ui.Components.lc.e0((TLRPC.TL_error) this.b);
                break;
            case 23:
                ((boolean[]) this.b)[0] = true;
                break;
            case 24:
                AtomicReference atomicReference = (AtomicReference) this.b;
                if (atomicReference.get() != null) {
                    ((Runnable) atomicReference.getAndSet(null)).run();
                    break;
                }
                break;
            case 25:
                ((org.telegram.ui.ActionBar.k) this.b).invalidate();
                break;
            case 26:
                ((org.telegram.ui.ActionBar.z0) this.b).performClick();
                break;
            case 27:
                ((org.telegram.ui.Components.y60) this.b).s();
                break;
            case 28:
                ((x) this.b).a(Boolean.FALSE);
                break;
            default:
                ((org.telegram.ui.ActionBar.h1) this.b).dismiss();
                break;
        }
    }
}
