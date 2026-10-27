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
import org.telegram.ui.Components.vc0;
import org.telegram.ui.sc1;
import org.telegram.ui.vc1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o5 extends org.telegram.ui.Components.y9 implements DownloadController.FileDownloadProgressListener {
    public RectF G;
    public RadialProgress2 H;
    public TLRPC.TL_wallPaper I;
    public int J;
    public LinearGradient K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public Paint Q;
    public vc0 R;
    public int S;
    public sc1 T;
    public int U;

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.S;
    }

    @Override // org.telegram.ui.Components.y9, android.view.View
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
    @Override // org.telegram.ui.Components.y9, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        vc1 vc1Var;
        int i12;
        int i13;
        vc1 vc1Var2;
        int i14;
        int i15;
        vc1 vc1Var3;
        int i16;
        vc0 vc0Var;
        BlendMode blendMode;
        RadialProgress2 radialProgress2 = this.H;
        RectF rectF = this.G;
        Paint paint = this.Q;
        sc1 sc1Var = this.T;
        float f7 = sc1Var.a.d.m1;
        this.a.setBlendMode(null);
        vc1 vc1Var4 = sc1Var.a.d;
        if (vc1Var4.b == 2) {
            i10 = vc1Var4.a1;
        } else {
            int D0 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Nd);
            i10 = (int) vc1Var4.v.j;
            if (i10 == 0) {
                i11 = D0;
                vc1Var = sc1Var.a.d;
                if (vc1Var.b != 2) {
                    i12 = vc1Var.c1;
                } else {
                    int D02 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Od);
                    i12 = (int) vc1Var.v.k;
                    if (i12 == 0) {
                        i13 = D02;
                        vc1Var2 = sc1Var.a.d;
                        if (vc1Var2.b == 2) {
                            i14 = vc1Var2.d1;
                        } else {
                            int D03 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Pd);
                            i14 = (int) vc1Var2.v.l;
                            if (i14 == 0) {
                                i15 = D03;
                                vc1Var3 = sc1Var.a.d;
                                if (vc1Var3.b != 2) {
                                    i16 = vc1Var3.e1;
                                } else {
                                    int D04 = org.telegram.ui.ActionBar.y6.D0(org.telegram.ui.ActionBar.y6.Qd);
                                    i16 = (int) vc1Var3.v.m;
                                    if (i16 == 0) {
                                        i16 = D04;
                                    }
                                }
                                vc1 vc1Var5 = sc1Var.a.d;
                                int i17 = vc1Var5.b != 2 ? vc1Var5.i1 : vc1Var5.v.n;
                                int i18 = vc1Var5.l1;
                                if (i13 != 0) {
                                    this.K = null;
                                    this.R = null;
                                    this.a.setGradientBitmap(null);
                                } else if (this.K == null || i11 != this.L || i13 != this.M || i15 != this.N || i16 != this.O || i17 != this.P) {
                                    this.L = i11;
                                    this.M = i13;
                                    this.N = i15;
                                    this.O = i16;
                                    this.P = i17;
                                    if (i15 != 0) {
                                        this.K = null;
                                        vc0 vc0Var2 = this.R;
                                        if (vc0Var2 != null) {
                                            vc0Var2.o(i11, i13, i15, i16, 0, false);
                                        } else {
                                            int i19 = i11;
                                            vc0 vc0Var3 = new vc0(true, i19, i13, i15, i16);
                                            i11 = i19;
                                            this.R = vc0Var3;
                                            vc0Var3.v(AndroidUtilities.dp(6.0f));
                                            this.R.q(this);
                                        }
                                        if (f7 < 0.0f) {
                                            this.a.setGradientBitmap(this.R.k);
                                        } else {
                                            this.a.setGradientBitmap(null);
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                ImageReceiver imageReceiver = this.a;
                                                blendMode = BlendMode.SOFT_LIGHT;
                                                imageReceiver.setBlendMode(blendMode);
                                            } else {
                                                this.a.setColorFilter(new PorterDuffColorFilter(sc1Var.a.d.k1, PorterDuff.Mode.SRC_IN));
                                            }
                                        }
                                    } else {
                                        Rect e = org.telegram.ui.Components.x9.e(org.telegram.ui.Components.x9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                                        this.K = new LinearGradient(e.left, e.top, e.right, e.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                                        this.R = null;
                                        this.a.setGradientBitmap(null);
                                    }
                                }
                                vc0Var = this.R;
                                if (vc0Var == null) {
                                    vc0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                                    this.R.draw(canvas);
                                } else {
                                    paint.setShader(this.K);
                                    if (this.K == null) {
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
                        vc1Var3 = sc1Var.a.d;
                        if (vc1Var3.b != 2) {
                        }
                        vc1 vc1Var52 = sc1Var.a.d;
                        if (vc1Var52.b != 2) {
                        }
                        int i182 = vc1Var52.l1;
                        if (i13 != 0) {
                        }
                        vc0Var = this.R;
                        if (vc0Var == null) {
                        }
                        super.onDraw(canvas);
                        if (radialProgress2.i.q == 4) {
                        }
                    }
                }
                i13 = i12;
                vc1Var2 = sc1Var.a.d;
                if (vc1Var2.b == 2) {
                }
                i15 = i14;
                vc1Var3 = sc1Var.a.d;
                if (vc1Var3.b != 2) {
                }
                vc1 vc1Var522 = sc1Var.a.d;
                if (vc1Var522.b != 2) {
                }
                int i1822 = vc1Var522.l1;
                if (i13 != 0) {
                }
                vc0Var = this.R;
                if (vc0Var == null) {
                }
                super.onDraw(canvas);
                if (radialProgress2.i.q == 4) {
                }
            }
        }
        i11 = i10;
        vc1Var = sc1Var.a.d;
        if (vc1Var.b != 2) {
        }
        i13 = i12;
        vc1Var2 = sc1Var.a.d;
        if (vc1Var2.b == 2) {
        }
        i15 = i14;
        vc1Var3 = sc1Var.a.d;
        if (vc1Var3.b != 2) {
        }
        vc1 vc1Var5222 = sc1Var.a.d;
        if (vc1Var5222.b != 2) {
        }
        int i18222 = vc1Var5222.l1;
        if (i13 != 0) {
        }
        vc0Var = this.R;
        if (vc0Var == null) {
        }
        super.onDraw(canvas);
        if (radialProgress2.i.q == 4) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        if (z10) {
            this.H.setIcon(4, false, true);
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
        RadialProgress2 radialProgress2 = this.H;
        radialProgress2.p(Math.min(1.0f, j10 / j11), true);
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if ((!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) || radialProgress2.i.q == 10) {
            return;
        }
        t(tL_wallPaper2, false, true);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.H.p(1.0f, true);
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        t(tL_wallPaper2, false, true);
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.I = tL_wallPaper;
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
        int i10 = this.J;
        RadialProgress2 radialProgress2 = this.H;
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
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.U, true);
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
            radialProgress2.p(1.0f, z11);
            radialProgress2.setIcon(6, z10, z11);
            return;
        }
        DownloadController.getInstance(i10).addLoadingFileObserver(name, null, this);
        FileLoader.getInstance(i10).isLoadingFile(name);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(name);
        if (fileProgress != null) {
            radialProgress2.p(fileProgress.floatValue(), z11);
        } else {
            radialProgress2.p(0.0f, z11);
        }
        radialProgress2.setIcon(10, z10, z11);
    }

    public final void u(boolean z10) {
        TLRPC.TL_wallPaper tL_wallPaper = this.T.a.d.X0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.I;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            this.H.setIcon(4, false, z10);
        } else {
            t(tL_wallPaper, false, z10);
        }
        super.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
