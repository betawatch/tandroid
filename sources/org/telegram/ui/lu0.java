package org.telegram.ui;

import android.animation.AnimatorSet;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class lu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lu0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0316  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        di.v vVar;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        TL_iv.PageBlock pageBlock = null;
        int i14 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer.BackgroundDrawable backgroundDrawable = (PhotoViewer.BackgroundDrawable) this.b;
                int i15 = PhotoViewer.BackgroundDrawable.g;
                backgroundDrawable.a();
                break;
            case 1:
                bv0 bv0Var = (bv0) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) bv0Var.a.N0.getLayoutParams();
                ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                int y3 = org.telegram.messenger.wl.y(34.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer = bv0Var.a;
                int i16 = y3 + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0);
                if (i16 != layoutParams.topMargin) {
                    layoutParams.topMargin = i16;
                    photoViewer.N0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) bv0Var.a.O0.getLayoutParams();
                int y10 = org.telegram.messenger.wl.y(40.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer2 = bv0Var.a;
                int i17 = y10 + (!photoViewer2.s ? AndroidUtilities.statusBarHeight : 0);
                if (layoutParams2.topMargin != i17) {
                    layoutParams2.topMargin = i17;
                    photoViewer2.O0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 2:
                ((ah.p) this.b).run();
                break;
            case 3:
                l lVar = (l) this.b;
                lVar.getClass();
                lVar.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 4:
                ((AnimatorSet) this.b).start();
                break;
            case 5:
                ((d1) this.b).a(2, false);
                break;
            case 6:
                i4 i4Var = ((r0) this.b).a;
                i4Var.R0.unlock();
                Runnable runnable = i4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    i4Var.a0 = null;
                    break;
                }
                break;
            case 7:
                t1 t1Var = (t1) ((p1) this.b).b;
                i4 i4Var2 = t1Var.x;
                View view = i4Var2.O;
                if (view != null) {
                    i4Var2.P.addView(view, w7.x5.c(-1.0f, -1));
                    t1Var.x.P.setVisibility(0);
                    break;
                }
                break;
            case 8:
                of.f.s(((q1) this.b).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ((d2) this.b).requestLayout();
                break;
            case 10:
                v3 v3Var = (v3) this.b;
                v3Var.release();
                v3Var.K.s();
                break;
            case 11:
                g4 g4Var = (g4) this.b;
                ArrayList arrayList2 = new ArrayList(g4Var.d);
                int size = arrayList2.size();
                i4 i4Var3 = g4Var.L;
                int i18 = size + (i4Var3.K == null ? 0 : 1);
                int[] iArr = new int[i18];
                int[] iArr2 = new int[i18];
                m3 m3Var = i4Var3.u0[0];
                if (m3Var != null && (vVar = m3Var.b) != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i18) {
                        boolean z10 = g4Var.H;
                        if (z10 && i19 == 0) {
                            iArr[i14] = i14;
                        } else {
                            int i21 = z10 ? i19 - 1 : i19;
                            TL_iv.PageBlock pageBlock2 = (i21 < 0 || i21 >= arrayList2.size()) ? pageBlock : (TL_iv.PageBlock) arrayList2.get(i21);
                            if (pageBlock2 == null || pageBlock2.cachedHeight == 0 || pageBlock2.cachedWidth != View.MeasureSpec.getSize(makeMeasureSpec)) {
                                s4.c1 g10 = g4Var.g(vVar, g4.I(pageBlock2));
                                View view2 = g10.a;
                                int i22 = i20;
                                TL_iv.PageBlock pageBlock3 = pageBlock2;
                                arrayList = arrayList2;
                                i10 = makeMeasureSpec2;
                                i11 = i19;
                                i12 = i22;
                                g4Var.H(g10.f, g10, pageBlock3, i21, arrayList2.size(), true);
                                view2.measure(makeMeasureSpec, i10);
                                int measuredHeight = view2.getMeasuredHeight();
                                iArr[i11] = measuredHeight;
                                if (pageBlock3 != null) {
                                    pageBlock3.cachedHeight = measuredHeight;
                                    pageBlock3.cachedWidth = View.MeasureSpec.getSize(makeMeasureSpec);
                                }
                                int i23 = i11 - 1;
                                iArr2[i11] = (i23 >= 0 ? 0 : iArr2[i23]) + iArr[i11];
                                i20 = i12 + iArr[i11];
                                i19 = i11 + 1;
                                makeMeasureSpec2 = i10;
                                arrayList2 = arrayList;
                                pageBlock = null;
                                i14 = 0;
                            } else {
                                iArr[i19] = pageBlock2.cachedHeight;
                            }
                        }
                        arrayList = arrayList2;
                        i10 = makeMeasureSpec2;
                        i11 = i19;
                        i12 = i20;
                        int i232 = i11 - 1;
                        iArr2[i11] = (i232 >= 0 ? 0 : iArr2[i232]) + iArr[i11];
                        i20 = i12 + iArr[i11];
                        i19 = i11 + 1;
                        makeMeasureSpec2 = i10;
                        arrayList2 = arrayList;
                        pageBlock = null;
                        i14 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new ah.p(g4Var, i20, iArr, iArr2));
                    break;
                }
                break;
            case 12:
                c5 c5Var = (c5) this.b;
                if (!c5Var.w) {
                    c5Var.w = true;
                    org.telegram.ui.Components.am0.d(new b5(c5Var, i14));
                    break;
                }
                break;
            case 13:
                a6 a6Var = (a6) this.b;
                a6Var.d.clear();
                a6Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(a6Var.e, a6Var.d);
                a6Var.U();
                a6Var.finishFragment();
                break;
            case 14:
                b5 b5Var = (b5) this.b;
                ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                File file = rootDirs.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    int size2 = rootDirs.size();
                    while (i14 < size2) {
                        File file2 = rootDirs.get(i14);
                        if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir) && file2.canWrite()) {
                            file = file2;
                        } else {
                            i14++;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.l0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), b5Var));
                    break;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 15:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                z6.k0 = false;
                long q02 = z6.q0(5, FileLoader.checkDirectory(4));
                long q03 = z6.q0(4, FileLoader.checkDirectory(4));
                long q04 = z6.q0(0, FileLoader.checkDirectory(100)) + z6.q0(0, FileLoader.checkDirectory(0));
                long q05 = z6.q0(0, FileLoader.checkDirectory(101)) + z6.q0(0, FileLoader.checkDirectory(2));
                long q06 = z6.q0(1, FileLoader.checkDirectory(5)) + z6.q0(1, FileLoader.checkDirectory(3));
                long q07 = z6.q0(2, FileLoader.checkDirectory(5)) + z6.q0(2, FileLoader.checkDirectory(3));
                long q08 = z6.q0(3, FileLoader.checkDirectory(4)) + z6.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                long q09 = z6.q0(0, FileLoader.checkDirectory(1));
                long q010 = z6.q0(0, FileLoader.checkDirectory(6));
                long q011 = z6.q0(1, AndroidUtilities.getLogsDir());
                if (!BuildVars.DEBUG_VERSION && q011 < 268435456) {
                    q011 = 0;
                }
                long j3 = q02 + q03 + q05 + q09 + q04 + q06 + q07 + q08 + q010 + q011;
                z6.m0 = Long.valueOf(j3);
                z6.l0 = System.currentTimeMillis();
                if (!z6.k0) {
                    AndroidUtilities.runOnUIThread(new g6(j3, 0, callback));
                    break;
                }
                break;
            case 16:
                ((o6) this.b).dismiss();
                break;
            case 17:
                u9 u9Var = (u9) ((w5) this.b).b;
                try {
                    CameraView cameraView = u9Var.c;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, u9Var.c.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = u9Var.c;
                if (cameraView2 != null) {
                    u9Var.c0(cameraView2.getTextureView().getBitmap());
                    break;
                }
                break;
            case 18:
                z9 z9Var = (z9) this.b;
                y9 y9Var = z9Var.a;
                if (y9Var != null) {
                    y9Var.requestFocus();
                    AndroidUtilities.showKeyboard(z9Var.a);
                    break;
                }
                break;
            case 19:
                qa qaVar = (qa) this.b;
                String str = qaVar.r;
                if (str == null || str.length() > 0) {
                    qaVar.n = true;
                    qaVar.e0(qaVar.v.size() <= 0);
                    qaVar.n = false;
                    break;
                }
                break;
            case 20:
                kb kbVar = (kb) this.b;
                if (kbVar.W != -1) {
                    kbVar.Y.getNotificationCenter().onAnimationFinish(kbVar.W);
                    kbVar.W = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("admin logs chatItemAnimator enable notifications");
                    break;
                }
                break;
            case 21:
                ub ubVar = ((tb) this.b).f;
                ubVar.getNotificationCenter().onAnimationFinish(ubVar.O0);
                break;
            case 22:
                org.telegram.ui.Components.yc.b0((TLRPC.TL_error) this.b);
                break;
            case 23:
                AtomicReference atomicReference = (AtomicReference) this.b;
                if (atomicReference.get() != null) {
                    ((Runnable) atomicReference.getAndSet(null)).run();
                    break;
                }
                break;
            case 24:
                ((org.telegram.ui.ActionBar.k) this.b).invalidate();
                break;
            case 25:
                ((org.telegram.ui.Components.n70) this.b).s();
                break;
            case 26:
                ((y) this.b).run(Boolean.FALSE);
                break;
            case 27:
                ((org.telegram.ui.ActionBar.n1) this.b).dismiss();
                break;
            case 28:
                ((m6) this.b).run(Boolean.FALSE, null);
                break;
            default:
                di.y5 y5Var = (di.y5) this.b;
                i13 = ((org.telegram.ui.ActionBar.n2) ((co) y5Var.e)).currentAccount;
                NotificationCenter.getInstance(i13).onAnimationFinish(y5Var.b);
                break;
        }
    }
}
