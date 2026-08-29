package org.telegram.ui.Cells;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.text.TextUtils;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.nc1;
import org.telegram.ui.qc1;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i5 extends org.telegram.ui.Components.t9 implements DownloadController.FileDownloadProgressListener {
    public RectF C;
    public RadialProgress2 D;
    public TLRPC.TL_wallPaper E;
    public int F;
    public LinearGradient G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public Paint M;
    public yb0 N;
    public int O;
    public nc1 P;
    public int Q;

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.O;
    }

    @Override // org.telegram.ui.Components.t9, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003c  */
    @Override // org.telegram.ui.Components.t9, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        qc1 qc1Var;
        int i12;
        int i13;
        qc1 qc1Var2;
        int i14;
        int i15;
        qc1 qc1Var3;
        int i16;
        yb0 yb0Var;
        BlendMode blendMode;
        RadialProgress2 radialProgress2 = this.D;
        RectF rectF = this.C;
        Paint paint = this.M;
        nc1 nc1Var = this.P;
        float f9 = nc1Var.a.d.h1;
        this.a.setBlendMode(null);
        qc1 qc1Var4 = nc1Var.a.d;
        if (qc1Var4.b == 2) {
            i10 = qc1Var4.V0;
        } else {
            int B0 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Nd);
            i10 = (int) qc1Var4.s.j;
            if (i10 == 0) {
                i11 = B0;
                qc1Var = nc1Var.a.d;
                if (qc1Var.b != 2) {
                    i12 = qc1Var.X0;
                } else {
                    int B02 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Od);
                    i12 = (int) qc1Var.s.k;
                    if (i12 == 0) {
                        i13 = B02;
                        qc1Var2 = nc1Var.a.d;
                        if (qc1Var2.b == 2) {
                            i14 = qc1Var2.Y0;
                        } else {
                            int B03 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Pd);
                            i14 = (int) qc1Var2.s.l;
                            if (i14 == 0) {
                                i15 = B03;
                                qc1Var3 = nc1Var.a.d;
                                if (qc1Var3.b != 2) {
                                    i16 = qc1Var3.Z0;
                                } else {
                                    int B04 = org.telegram.ui.ActionBar.g6.B0(org.telegram.ui.ActionBar.g6.Qd);
                                    i16 = (int) qc1Var3.s.m;
                                    if (i16 == 0) {
                                        i16 = B04;
                                    }
                                }
                                qc1 qc1Var5 = nc1Var.a.d;
                                int i17 = qc1Var5.b != 2 ? qc1Var5.d1 : qc1Var5.s.n;
                                int i18 = qc1Var5.g1;
                                if (i13 != 0) {
                                    this.G = null;
                                    this.N = null;
                                    this.a.setGradientBitmap(null);
                                } else if (this.G == null || i11 != this.H || i13 != this.I || i15 != this.J || i16 != this.K || i17 != this.L) {
                                    this.H = i11;
                                    this.I = i13;
                                    this.J = i15;
                                    this.K = i16;
                                    this.L = i17;
                                    if (i15 != 0) {
                                        this.G = null;
                                        yb0 yb0Var2 = this.N;
                                        if (yb0Var2 != null) {
                                            yb0Var2.o(i11, i13, i15, i16, 0, false);
                                        } else {
                                            int i19 = i11;
                                            yb0 yb0Var3 = new yb0(true, i19, i13, i15, i16);
                                            i11 = i19;
                                            this.N = yb0Var3;
                                            yb0Var3.w(AndroidUtilities.dp(6.0f));
                                            this.N.r(this);
                                        }
                                        if (f9 < 0.0f) {
                                            this.a.setGradientBitmap(this.N.k);
                                        } else {
                                            this.a.setGradientBitmap(null);
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                ImageReceiver imageReceiver = this.a;
                                                blendMode = BlendMode.SOFT_LIGHT;
                                                imageReceiver.setBlendMode(blendMode);
                                            } else {
                                                this.a.setColorFilter(new PorterDuffColorFilter(nc1Var.a.d.f1, PorterDuff.Mode.SRC_IN));
                                            }
                                        }
                                    } else {
                                        Rect e10 = org.telegram.ui.Components.s9.e(org.telegram.ui.Components.s9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                                        this.G = new LinearGradient(e10.left, e10.top, e10.right, e10.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                                        this.N = null;
                                        this.a.setGradientBitmap(null);
                                    }
                                }
                                yb0Var = this.N;
                                if (yb0Var == null) {
                                    yb0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                                    this.N.draw(canvas);
                                } else {
                                    paint.setShader(this.G);
                                    if (this.G == null) {
                                        paint.setColor(i11);
                                    }
                                    rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                                }
                                super.onDraw(canvas);
                                if (radialProgress2.i.q == 4) {
                                    radialProgress2.setColors(i18, i18, -1, -1);
                                    radialProgress2.draw(canvas);
                                    return;
                                }
                                return;
                            }
                        }
                        i15 = i14;
                        qc1Var3 = nc1Var.a.d;
                        if (qc1Var3.b != 2) {
                        }
                        qc1 qc1Var52 = nc1Var.a.d;
                        if (qc1Var52.b != 2) {
                        }
                        int i182 = qc1Var52.g1;
                        if (i13 != 0) {
                        }
                        yb0Var = this.N;
                        if (yb0Var == null) {
                        }
                        super.onDraw(canvas);
                        if (radialProgress2.i.q == 4) {
                        }
                    }
                }
                i13 = i12;
                qc1Var2 = nc1Var.a.d;
                if (qc1Var2.b == 2) {
                }
                i15 = i14;
                qc1Var3 = nc1Var.a.d;
                if (qc1Var3.b != 2) {
                }
                qc1 qc1Var522 = nc1Var.a.d;
                if (qc1Var522.b != 2) {
                }
                int i1822 = qc1Var522.g1;
                if (i13 != 0) {
                }
                yb0Var = this.N;
                if (yb0Var == null) {
                }
                super.onDraw(canvas);
                if (radialProgress2.i.q == 4) {
                }
            }
        }
        i11 = i10;
        qc1Var = nc1Var.a.d;
        if (qc1Var.b != 2) {
        }
        i13 = i12;
        qc1Var2 = nc1Var.a.d;
        if (qc1Var2.b == 2) {
        }
        i15 = i14;
        qc1Var3 = nc1Var.a.d;
        if (qc1Var3.b != 2) {
        }
        qc1 qc1Var5222 = nc1Var.a.d;
        if (qc1Var5222.b != 2) {
        }
        int i18222 = qc1Var5222.g1;
        if (i13 != 0) {
        }
        yb0Var = this.N;
        if (yb0Var == null) {
        }
        super.onDraw(canvas);
        if (radialProgress2.i.q == 4) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.P.a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        if (z10) {
            this.D.setIcon(4, false, true);
        } else {
            t(tL_wallPaper2, true, z10);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        RadialProgress2 radialProgress2 = this.D;
        radialProgress2.o(Math.min(1.0f, j10 / j11), true);
        TLRPC.TL_wallPaper tL_wallPaper = this.P.a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if ((!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) || radialProgress2.i.q == 10) {
            return;
        }
        t(tL_wallPaper2, false, true);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.D.o(1.0f, true);
        TLRPC.TL_wallPaper tL_wallPaper = this.P.a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        t(tL_wallPaper2, false, true);
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.E = tL_wallPaper;
        if (tL_wallPaper != null) {
            k(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100.0f)), tL_wallPaper.document), "100_100", null, null, 0L, "png", tL_wallPaper, 1);
        } else {
            setImageDrawable(null);
        }
        u(false);
    }

    public final void t(Object obj, boolean z10, boolean z11) {
        File httpFilePath;
        String name;
        int i10 = this.F;
        RadialProgress2 radialProgress2 = this.D;
        boolean z12 = obj instanceof TLRPC.TL_wallPaper;
        if (!z12 && !(obj instanceof MediaController.SearchImage)) {
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        if (z12) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            name = FileLoader.getAttachFileName(tL_wallPaper.document);
            if (TextUtils.isEmpty(name)) {
                return;
            } else {
                httpFilePath = FileLoader.getInstance(i10).getPathToAttach(tL_wallPaper.document, true);
            }
        } else {
            MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
            TLRPC.Photo photo = searchImage.photo;
            if (photo != null) {
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.Q, true);
                File pathToAttach = FileLoader.getInstance(i10).getPathToAttach(closestPhotoSizeWithSize, true);
                name = FileLoader.getAttachFileName(closestPhotoSizeWithSize);
                httpFilePath = pathToAttach;
            } else {
                httpFilePath = ImageLoader.getHttpFilePath(searchImage.imageUrl, "jpg");
                name = httpFilePath.getName();
            }
            if (TextUtils.isEmpty(name)) {
                return;
            }
        }
        if (httpFilePath.exists()) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            radialProgress2.o(1.0f, z11);
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        DownloadController.getInstance(i10).addLoadingFileObserver(name, null, this);
        FileLoader.getInstance(i10).isLoadingFile(name);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(name);
        if (fileProgress != null) {
            radialProgress2.o(fileProgress.floatValue(), z11);
        } else {
            radialProgress2.o(0.0f, z11);
        }
        radialProgress2.setIcon(10, z10, z11);
    }

    public final void u(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.P.a.d.S0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.E;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            this.D.setIcon(4, false, z10);
        } else {
            t(tL_wallPaper, false, z10);
        }
        super.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
