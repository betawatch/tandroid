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

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final /* synthetic */ class mu0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mu0(Object obj, int i10) {
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
        ci.v vVar;
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
                cv0 cv0Var = (cv0) this.b;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) cv0Var.a.N0.getLayoutParams();
                ((WindowManager) ApplicationLoader.applicationContext.getSystemService("window")).getDefaultDisplay().getRotation();
                int A = org.telegram.messenger.wh.A(34.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer = cv0Var.a;
                int i16 = A + (!photoViewer.s ? AndroidUtilities.statusBarHeight : 0);
                if (i16 != layoutParams.topMargin) {
                    layoutParams.topMargin = i16;
                    photoViewer.N0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) cv0Var.a.O0.getLayoutParams();
                int A2 = org.telegram.messenger.wh.A(40.0f, org.telegram.ui.ActionBar.k.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer2 = cv0Var.a;
                int i17 = A2 + (!photoViewer2.s ? AndroidUtilities.statusBarHeight : 0);
                if (layoutParams2.topMargin != i17) {
                    layoutParams2.topMargin = i17;
                    photoViewer2.O0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 2:
                ((ai.s1) this.b).run();
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
                ((c1) this.b).a(2, false);
                break;
            case 6:
                h4 h4Var = ((r0) this.b).a;
                h4Var.R0.unlock();
                Runnable runnable = h4Var.a0;
                if (runnable != null) {
                    runnable.run();
                    h4Var.a0 = null;
                    break;
                }
                break;
            case 7:
                s1 s1Var = (s1) ((o1) this.b).b;
                h4 h4Var2 = s1Var.x;
                View view = h4Var2.O;
                if (view != null) {
                    h4Var2.P.addView(view, w7.y5.c(-1.0f, -1));
                    s1Var.x.P.setVisibility(0);
                    break;
                }
                break;
            case 8:
                nf.f.s(((p1) this.b).a.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                break;
            case 9:
                ((c2) this.b).requestLayout();
                break;
            case 10:
                u3 u3Var = (u3) this.b;
                u3Var.release();
                u3Var.K.s();
                break;
            case 11:
                f4 f4Var = (f4) this.b;
                ArrayList arrayList2 = new ArrayList(f4Var.d);
                int size = arrayList2.size();
                h4 h4Var3 = f4Var.L;
                int i18 = size + (h4Var3.K == null ? 0 : 1);
                int[] iArr = new int[i18];
                int[] iArr2 = new int[i18];
                l3 l3Var = h4Var3.u0[0];
                if (l3Var != null && (vVar = l3Var.b) != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, TLObject.FLAG_31);
                    int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, TLObject.FLAG_31);
                    int i19 = 0;
                    int i20 = 0;
                    while (i19 < i18) {
                        boolean z10 = f4Var.H;
                        if (z10 && i19 == 0) {
                            iArr[i14] = i14;
                        } else {
                            int i21 = z10 ? i19 - 1 : i19;
                            TL_iv.PageBlock pageBlock2 = (i21 < 0 || i21 >= arrayList2.size()) ? pageBlock : (TL_iv.PageBlock) arrayList2.get(i21);
                            if (pageBlock2 == null || pageBlock2.cachedHeight == 0 || pageBlock2.cachedWidth != View.MeasureSpec.getSize(makeMeasureSpec)) {
                                s4.c1 g10 = f4Var.g(vVar, f4.I(pageBlock2));
                                View view2 = g10.a;
                                int i22 = i20;
                                TL_iv.PageBlock pageBlock3 = pageBlock2;
                                arrayList = arrayList2;
                                i10 = makeMeasureSpec2;
                                i11 = i19;
                                i12 = i22;
                                f4Var.H(g10.f, g10, pageBlock3, i21, arrayList2.size(), true);
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
                    AndroidUtilities.runOnUIThread(new ai.s1(f4Var, i20, iArr, iArr2));
                    break;
                }
                break;
            case 12:
                c5 c5Var = (c5) this.b;
                if (!c5Var.w) {
                    c5Var.w = true;
                    org.telegram.ui.Components.nm0.d(new b5(c5Var, i14));
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
                    AndroidUtilities.runOnUIThread(new org.telegram.messenger.m0(statFs.getBlockCountLong(), statFs.getBlockSizeLong(), statFs.getAvailableBlocksLong(), b5Var));
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 15:
                Utilities.Callback callback = (Utilities.Callback) this.b;
                z6.l0 = false;
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
                z6.n0 = Long.valueOf(j3);
                z6.m0 = System.currentTimeMillis();
                if (!z6.l0) {
                    AndroidUtilities.runOnUIThread(new c6(j3, 0, callback));
                    break;
                }
                break;
            case 16:
                ((o6) this.b).dismiss();
                break;
            case 17:
                v9 v9Var = (v9) ((w5) this.b).b;
                try {
                    CameraView cameraView = v9Var.c;
                    cameraView.focusToPoint(cameraView.getWidth() / 2, v9Var.c.getHeight() / 2, false);
                } catch (Exception unused) {
                }
                CameraView cameraView2 = v9Var.c;
                if (cameraView2 != null) {
                    v9Var.c0(cameraView2.getTextureView().getBitmap());
                    break;
                }
                break;
            case 18:
                aa aaVar = (aa) this.b;
                z9 z9Var = aaVar.a;
                if (z9Var != null) {
                    z9Var.requestFocus();
                    AndroidUtilities.showKeyboard(aaVar.a);
                    break;
                }
                break;
            case 19:
                ra raVar = (ra) this.b;
                String str = raVar.r;
                if (str == null || str.length() > 0) {
                    raVar.n = true;
                    raVar.e0(raVar.v.size() <= 0);
                    raVar.n = false;
                    break;
                }
                break;
            case 20:
                lb lbVar = (lb) this.b;
                if (lbVar.W != -1) {
                    lbVar.Y.getNotificationCenter().onAnimationFinish(lbVar.W);
                    lbVar.W = -1;
                }
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("admin logs chatItemAnimator enable notifications");
                    break;
                }
                break;
            case 21:
                vb vbVar = ((ub) this.b).f;
                vbVar.getNotificationCenter().onAnimationFinish(vbVar.K0);
                break;
            case 22:
                org.telegram.ui.Components.xc.b0((TLRPC.TL_error) this.b);
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
                ((org.telegram.ui.Components.w70) this.b).s();
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
                ci.y5 y5Var = (ci.y5) this.b;
                i13 = ((org.telegram.ui.ActionBar.n2) ((zn) y5Var.e)).currentAccount;
                NotificationCenter.getInstance(i13).onAnimationFinish(y5Var.b);
                break;
        }
    }
}
