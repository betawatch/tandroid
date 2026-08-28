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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kt0(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0316  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        kh.w wVar;
        ArrayList arrayList;
        int i9;
        int i10;
        int i11;
        int i12;
        TL_iv.PageBlock pageBlock = null;
        int i13 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer.BackgroundDrawable backgroundDrawable = (PhotoViewer.BackgroundDrawable) this.b;
                int i14 = PhotoViewer.BackgroundDrawable.g;
                backgroundDrawable.a();
                break;
            case 1:
                au0 au0Var = (au0) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) au0Var.a.J0.getLayoutParams();
                ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                int y10 = org.telegram.messenger.ll.y(34.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer = au0Var.a;
                int i15 = y10 + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0);
                if (i15 != layoutParams.topMargin) {
                    layoutParams.topMargin = i15;
                    photoViewer.J0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) au0Var.a.K0.getLayoutParams();
                int y11 = org.telegram.messenger.ll.y(40.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer2 = au0Var.a;
                int i16 = y11 + (!photoViewer2.s ? AndroidUtilities.statusBarHeight : 0);
                if (layoutParams2.topMargin != i16) {
                    layoutParams2.topMargin = i16;
                    photoViewer2.K0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 2:
                ((d5.i) this.b).run();
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
                ((f1) this.b).a(2, false);
                break;
            case 6:
                l4 l4Var = ((u0) this.b).a;
                l4Var.N0.unlock();
                Runnable runnable = l4Var.W;
                if (runnable != null) {
                    runnable.run();
                    l4Var.W = null;
                    break;
                }
                break;
            case 7:
                v1 v1Var = (v1) ((r1) this.b).b;
                l4 l4Var2 = v1Var.x;
                View view = l4Var2.K;
                if (view != null) {
                    l4Var2.L.addView(view, g7.e6.c(-1.0f, -1));
                    v1Var.x.L.setVisibility(0);
                    break;
                }
                break;
            case 8:
                ve.e.s(((s1) this.b).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ((f2) this.b).requestLayout();
                break;
            case 10:
                y3 y3Var = (y3) this.b;
                y3Var.release();
                y3Var.G.s();
                break;
            case 11:
                j4 j4Var = (j4) this.b;
                ArrayList arrayList2 = new ArrayList(j4Var.d);
                int size = arrayList2.size();
                l4 l4Var3 = j4Var.H;
                int i17 = size + (l4Var3.G == null ? 0 : 1);
                int[] iArr = new int[i17];
                int[] iArr2 = new int[i17];
                p3 p3Var = l4Var3.q0[0];
                if (p3Var != null && (wVar = p3Var.b) != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31);
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i17) {
                        boolean z10 = j4Var.D;
                        if (z10 && i18 == 0) {
                            iArr[i13] = i13;
                        } else {
                            int i20 = z10 ? i18 - 1 : i18;
                            TL_iv.PageBlock pageBlock2 = (i20 < 0 || i20 >= arrayList2.size()) ? pageBlock : (TL_iv.PageBlock) arrayList2.get(i20);
                            if (pageBlock2 == null || pageBlock2.cachedHeight == 0 || pageBlock2.cachedWidth != View.MeasureSpec.getSize(makeMeasureSpec)) {
                                f2.q1 g10 = j4Var.g(wVar, j4.I(pageBlock2));
                                View view2 = g10.a;
                                int i21 = i19;
                                TL_iv.PageBlock pageBlock3 = pageBlock2;
                                arrayList = arrayList2;
                                i9 = makeMeasureSpec2;
                                i10 = i18;
                                i11 = i21;
                                j4Var.H(g10.f, g10, pageBlock3, i20, arrayList2.size(), true);
                                view2.measure(makeMeasureSpec, i9);
                                int measuredHeight = view2.getMeasuredHeight();
                                iArr[i10] = measuredHeight;
                                if (pageBlock3 != null) {
                                    pageBlock3.cachedHeight = measuredHeight;
                                    pageBlock3.cachedWidth = View.MeasureSpec.getSize(makeMeasureSpec);
                                }
                                int i22 = i10 - 1;
                                iArr2[i10] = (i22 >= 0 ? 0 : iArr2[i22]) + iArr[i10];
                                i19 = i11 + iArr[i10];
                                i18 = i10 + 1;
                                makeMeasureSpec2 = i9;
                                arrayList2 = arrayList;
                                pageBlock = null;
                                i13 = 0;
                            } else {
                                iArr[i18] = pageBlock2.cachedHeight;
                            }
                        }
                        arrayList = arrayList2;
                        i9 = makeMeasureSpec2;
                        i10 = i18;
                        i11 = i19;
                        int i222 = i10 - 1;
                        iArr2[i10] = (i222 >= 0 ? 0 : iArr2[i222]) + iArr[i10];
                        i19 = i11 + iArr[i10];
                        i18 = i10 + 1;
                        makeMeasureSpec2 = i9;
                        arrayList2 = arrayList;
                        pageBlock = null;
                        i13 = 0;
                    }
                    AndroidUtilities.runOnUIThread(new d5.i(j4Var, i19, iArr, iArr2));
                    break;
                }
                break;
            case 12:
                b5 b5Var = (b5) this.b;
                if (!b5Var.w) {
                    b5Var.w = true;
                    org.telegram.ui.Components.ll0.d(new a5(b5Var, i13));
                    break;
                }
                break;
            case 13:
                z5 z5Var = (z5) this.b;
                z5Var.d.clear();
                z5Var.getMessagesController().getCacheByChatsController().saveKeepMediaExceptions(z5Var.e, z5Var.d);
                z5Var.T();
                z5Var.finishFragment();
                break;
            case 14:
                a5 a5Var = (a5) this.b;
                ArrayList<File> rootDirs = AndroidUtilities.getRootDirs();
                File file = rootDirs.get(0);
                file.getAbsolutePath();
                if (!TextUtils.isEmpty(SharedConfig.storageCacheDir)) {
                    int size2 = rootDirs.size();
                    while (i13 < size2) {
                        File file2 = rootDirs.get(i13);
                        if (file2.getAbsolutePath().startsWith(SharedConfig.storageCacheDir) && file2.canWrite()) {
                            file = file2;
                        } else {
                            i13++;
                        }
                    }
                }
                try {
                    StatFs statFs = new StatFs(file.getPath());
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.m0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), a5Var));
                    break;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 15:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                y6.g0 = false;
                long p02 = y6.p0(5, FileLoader.checkDirectory(4));
                long p03 = y6.p0(4, FileLoader.checkDirectory(4));
                long p04 = y6.p0(0, FileLoader.checkDirectory(100)) + y6.p0(0, FileLoader.checkDirectory(0));
                long p05 = y6.p0(0, FileLoader.checkDirectory(101)) + y6.p0(0, FileLoader.checkDirectory(2));
                long p06 = y6.p0(1, FileLoader.checkDirectory(5)) + y6.p0(1, FileLoader.checkDirectory(3));
                long p07 = y6.p0(2, FileLoader.checkDirectory(5)) + y6.p0(2, FileLoader.checkDirectory(3));
                long p08 = y6.p0(3, FileLoader.checkDirectory(4)) + y6.p0(0, new File(FileLoader.checkDirectory(4), "acache"));
                long p09 = y6.p0(0, FileLoader.checkDirectory(1));
                long p010 = y6.p0(0, FileLoader.checkDirectory(6));
                long p011 = y6.p0(1, AndroidUtilities.getLogsDir());
                if (!BuildVars.DEBUG_VERSION && p011 < 268435456) {
                    p011 = 0;
                }
                long j10 = p02 + p03 + p05 + p09 + p04 + p06 + p07 + p08 + p010 + p011;
                y6.i0 = Long.valueOf(j10);
                y6.h0 = System.currentTimeMillis();
                if (!y6.g0) {
                    AndroidUtilities.runOnUIThread(new e6(j10, 0, callback));
                    break;
                }
                break;
            case 16:
                ((n6) this.b).dismiss();
                break;
            case 17:
                s9 s9Var = (s9) ((v5) this.b).b;
                try {
                    CameraView cameraView = s9Var.c;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, s9Var.c.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = s9Var.c;
                if (cameraView2 != null) {
                    s9Var.b0(cameraView2.getTextureView().getBitmap());
                    break;
                }
                break;
            case 18:
                x9 x9Var = (x9) this.b;
                w9 w9Var = x9Var.a;
                if (w9Var != null) {
                    w9Var.requestFocus();
                    AndroidUtilities.showKeyboard(x9Var.a);
                    break;
                }
                break;
            case 19:
                ma maVar = (ma) this.b;
                String str = maVar.r;
                if (str == null || str.length() > 0) {
                    maVar.n = true;
                    maVar.d0(maVar.v.size() <= 0);
                    maVar.n = false;
                    break;
                }
                break;
            case 20:
                fb fbVar = (fb) this.b;
                if (fbVar.W != -1) {
                    fbVar.Y.getNotificationCenter().onAnimationFinish(fbVar.W);
                    fbVar.W = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("admin logs chatItemAnimator enable notifications");
                    break;
                }
                break;
            case 21:
                pb pbVar = ((ob) this.b).f;
                pbVar.getNotificationCenter().onAnimationFinish(pbVar.K0);
                break;
            case 22:
                org.telegram.ui.Components.oc.b0((TLRPC.TL_error) this.b);
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
                ((org.telegram.ui.Components.x60) this.b).s();
                break;
            case 26:
                ((a0) this.b).run(Boolean.FALSE);
                break;
            case 27:
                ((org.telegram.ui.ActionBar.o1) this.b).dismiss();
                break;
            case 28:
                ((l6) this.b).run(Boolean.FALSE, null);
                break;
            default:
                kh.o5 o5Var = (kh.o5) this.b;
                i12 = ((org.telegram.ui.ActionBar.o2) ((qn) o5Var.e)).currentAccount;
                NotificationCenter.getInstance(i12).onAnimationFinish(o5Var.b);
                break;
        }
    }
}
