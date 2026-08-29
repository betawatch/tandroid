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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class it0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ it0(Object obj, int i10) {
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
        nh.v vVar;
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
                yt0 yt0Var = (yt0) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) yt0Var.a.J0.getLayoutParams();
                ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                int x4 = b.x(34.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer = yt0Var.a;
                int i16 = x4 + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0);
                if (i16 != layoutParams.topMargin) {
                    layoutParams.topMargin = i16;
                    photoViewer.J0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) yt0Var.a.K0.getLayoutParams();
                int x10 = b.x(40.0f, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer2 = yt0Var.a;
                int i17 = x10 + (!photoViewer2.s ? AndroidUtilities.statusBarHeight : 0);
                if (layoutParams2.topMargin != i17) {
                    layoutParams2.topMargin = i17;
                    photoViewer2.K0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 2:
                ((ag.v0) this.b).run();
                break;
            case 3:
                n nVar = (n) this.b;
                nVar.getClass();
                nVar.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 4:
                ((AnimatorSet) this.b).start();
                break;
            case 5:
                ((g1) this.b).a(2, false);
                break;
            case 6:
                m4 m4Var = ((v0) this.b).a;
                m4Var.N0.unlock();
                Runnable runnable = m4Var.W;
                if (runnable != null) {
                    runnable.run();
                    m4Var.W = null;
                    break;
                }
                break;
            case 7:
                w1 w1Var = (w1) ((s1) this.b).b;
                m4 m4Var2 = w1Var.x;
                View view = m4Var2.K;
                if (view != null) {
                    m4Var2.L.addView(view, i7.f6.c(-1.0f, -1));
                    w1Var.x.L.setVisibility(0);
                    break;
                }
                break;
            case 8:
                ye.d.s(((t1) this.b).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ((g2) this.b).requestLayout();
                break;
            case 10:
                z3 z3Var = (z3) this.b;
                z3Var.release();
                z3Var.G.s();
                break;
            case 11:
                k4 k4Var = (k4) this.b;
                ArrayList arrayList2 = new ArrayList(k4Var.d);
                int size = arrayList2.size();
                m4 m4Var3 = k4Var.H;
                int i18 = size + (m4Var3.G == null ? 0 : 1);
                int[] iArr = new int[i18];
                int[] iArr2 = new int[i18];
                q3 q3Var = m4Var3.q0[0];
                if (q3Var != null && (vVar = q3Var.b) != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i18) {
                        boolean z10 = k4Var.D;
                        if (z10 && i19 == 0) {
                            iArr[i14] = i14;
                        } else {
                            int i21 = z10 ? i19 - 1 : i19;
                            TL_iv.PageBlock pageBlock2 = (i21 < 0 || i21 >= arrayList2.size()) ? pageBlock : (TL_iv.PageBlock) arrayList2.get(i21);
                            if (pageBlock2 == null || pageBlock2.cachedHeight == 0 || pageBlock2.cachedWidth != View.MeasureSpec.getSize(makeMeasureSpec)) {
                                f2.n1 g10 = k4Var.g(vVar, k4.I(pageBlock2));
                                View view2 = g10.a;
                                int i22 = i20;
                                TL_iv.PageBlock pageBlock3 = pageBlock2;
                                arrayList = arrayList2;
                                i10 = makeMeasureSpec2;
                                i11 = i19;
                                i12 = i22;
                                k4Var.H(g10.f, g10, pageBlock3, i21, arrayList2.size(), true);
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
                    AndroidUtilities.runOnUIThread(new ag.v0(k4Var, i20, iArr, iArr2));
                    break;
                }
                break;
            case 12:
                c5 c5Var = (c5) this.b;
                if (!c5Var.w) {
                    c5Var.w = true;
                    org.telegram.ui.Components.yl0.d(new b5(c5Var, i14));
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
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 15:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                x6.g0 = false;
                long q02 = x6.q0(5, FileLoader.checkDirectory(4));
                long q03 = x6.q0(4, FileLoader.checkDirectory(4));
                long q04 = x6.q0(0, FileLoader.checkDirectory(100)) + x6.q0(0, FileLoader.checkDirectory(0));
                long q05 = x6.q0(0, FileLoader.checkDirectory(101)) + x6.q0(0, FileLoader.checkDirectory(2));
                long q06 = x6.q0(1, FileLoader.checkDirectory(5)) + x6.q0(1, FileLoader.checkDirectory(3));
                long q07 = x6.q0(2, FileLoader.checkDirectory(5)) + x6.q0(2, FileLoader.checkDirectory(3));
                long q08 = x6.q0(3, FileLoader.checkDirectory(4)) + x6.q0(0, new File(FileLoader.checkDirectory(4), "acache"));
                long q09 = x6.q0(0, FileLoader.checkDirectory(1));
                long q010 = x6.q0(0, FileLoader.checkDirectory(6));
                long q011 = x6.q0(1, AndroidUtilities.getLogsDir());
                if (!BuildVars.DEBUG_VERSION && q011 < 268435456) {
                    q011 = 0;
                }
                long j10 = q02 + q03 + q05 + q09 + q04 + q06 + q07 + q08 + q010 + q011;
                x6.i0 = Long.valueOf(j10);
                x6.h0 = System.currentTimeMillis();
                if (!x6.g0) {
                    AndroidUtilities.runOnUIThread(new f6(j10, 0, callback));
                    break;
                }
                break;
            case 16:
                ((n6) this.b).dismiss();
                break;
            case 17:
                r9 r9Var = (r9) ((w5) this.b).b;
                try {
                    CameraView cameraView = r9Var.c;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, r9Var.c.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = r9Var.c;
                if (cameraView2 != null) {
                    r9Var.c0(cameraView2.getTextureView().getBitmap());
                    break;
                }
                break;
            case 18:
                w9 w9Var = (w9) this.b;
                v9 v9Var = w9Var.a;
                if (v9Var != null) {
                    v9Var.requestFocus();
                    AndroidUtilities.showKeyboard(w9Var.a);
                    break;
                }
                break;
            case 19:
                la laVar = (la) this.b;
                String str = laVar.r;
                if (str == null || str.length() > 0) {
                    laVar.n = true;
                    laVar.e0(laVar.v.size() <= 0);
                    laVar.n = false;
                    break;
                }
                break;
            case 20:
                eb ebVar = (eb) this.b;
                if (ebVar.W != -1) {
                    ebVar.Y.getNotificationCenter().onAnimationFinish(ebVar.W);
                    ebVar.W = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("admin logs chatItemAnimator enable notifications");
                    break;
                }
                break;
            case 21:
                ob obVar = ((nb) this.b).f;
                obVar.getNotificationCenter().onAnimationFinish(obVar.K0);
                break;
            case 22:
                org.telegram.ui.Components.tc.b0((TLRPC.TL_error) this.b);
                break;
            case 23:
                AtomicReference atomicReference = (AtomicReference) this.b;
                if (atomicReference.get() != null) {
                    ((Runnable) atomicReference.getAndSet(null)).run();
                    break;
                }
                break;
            case 24:
                ((org.telegram.ui.ActionBar.l) this.b).invalidate();
                break;
            case 25:
                ((org.telegram.ui.Components.j70) this.b).s();
                break;
            case 26:
                ((b0) this.b).run(Boolean.FALSE);
                break;
            case 27:
                ((org.telegram.ui.ActionBar.o1) this.b).dismiss();
                break;
            case 28:
                ((l6) this.b).run(Boolean.FALSE, null);
                break;
            default:
                bg.m0 m0Var = (bg.m0) this.b;
                i13 = ((org.telegram.ui.ActionBar.o2) ((tn) m0Var.e)).currentAccount;
                NotificationCenter.getInstance(i13).onAnimationFinish(m0Var.d);
                break;
        }
    }
}
