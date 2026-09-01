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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.bd1;
import org.telegram.ui.ed1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class k5 extends org.telegram.ui.Components.p9 implements DownloadController.FileDownloadProgressListener {
    public RectF D;
    public RadialProgress2 E;
    public TLRPC.TL_wallPaper F;
    public int G;
    public LinearGradient H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public Paint N;
    public fc0 O;
    public int P;
    public bd1 Q;
    public int R;

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.P;
    }

    @Override // org.telegram.ui.Components.p9, android.view.View
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
    @Override // org.telegram.ui.Components.p9, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i10;
        int i11;
        ed1 ed1Var;
        int i12;
        int i13;
        ed1 ed1Var2;
        int i14;
        int i15;
        ed1 ed1Var3;
        int i16;
        fc0 fc0Var;
        BlendMode blendMode;
        RadialProgress2 radialProgress2 = this.E;
        RectF rectF = this.D;
        Paint paint = this.N;
        bd1 bd1Var = this.Q;
        float f10 = bd1Var.a.d.i1;
        this.a.setBlendMode(null);
        ed1 ed1Var4 = bd1Var.a.d;
        if (ed1Var4.b == 2) {
            i10 = ed1Var4.W0;
        } else {
            int B0 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Nd);
            i10 = (int) ed1Var4.s.j;
            if (i10 == 0) {
                i11 = B0;
                ed1Var = bd1Var.a.d;
                if (ed1Var.b != 2) {
                    i12 = ed1Var.Y0;
                } else {
                    int B02 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Od);
                    i12 = (int) ed1Var.s.k;
                    if (i12 == 0) {
                        i13 = B02;
                        ed1Var2 = bd1Var.a.d;
                        if (ed1Var2.b == 2) {
                            i14 = ed1Var2.Z0;
                        } else {
                            int B03 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Pd);
                            i14 = (int) ed1Var2.s.l;
                            if (i14 == 0) {
                                i15 = B03;
                                ed1Var3 = bd1Var.a.d;
                                if (ed1Var3.b != 2) {
                                    i16 = ed1Var3.a1;
                                } else {
                                    int B04 = org.telegram.ui.ActionBar.k6.B0(org.telegram.ui.ActionBar.k6.Qd);
                                    i16 = (int) ed1Var3.s.m;
                                    if (i16 == 0) {
                                        i16 = B04;
                                    }
                                }
                                ed1 ed1Var5 = bd1Var.a.d;
                                int i17 = ed1Var5.b != 2 ? ed1Var5.e1 : ed1Var5.s.n;
                                int i18 = ed1Var5.h1;
                                if (i13 != 0) {
                                    this.H = null;
                                    this.O = null;
                                    this.a.setGradientBitmap(null);
                                } else if (this.H == null || i11 != this.I || i13 != this.J || i15 != this.K || i16 != this.L || i17 != this.M) {
                                    this.I = i11;
                                    this.J = i13;
                                    this.K = i15;
                                    this.L = i16;
                                    this.M = i17;
                                    if (i15 != 0) {
                                        this.H = null;
                                        fc0 fc0Var2 = this.O;
                                        if (fc0Var2 != null) {
                                            fc0Var2.o(i11, i13, i15, i16, 0, false);
                                        } else {
                                            int i19 = i11;
                                            fc0 fc0Var3 = new fc0(true, i19, i13, i15, i16);
                                            i11 = i19;
                                            this.O = fc0Var3;
                                            fc0Var3.w(AndroidUtilities.dp(6.0f));
                                            this.O.r(this);
                                        }
                                        if (f10 < 0.0f) {
                                            this.a.setGradientBitmap(this.O.k);
                                        } else {
                                            this.a.setGradientBitmap(null);
                                            if (Build.VERSION.SDK_INT >= 29) {
                                                ImageReceiver imageReceiver = this.a;
                                                blendMode = BlendMode.SOFT_LIGHT;
                                                imageReceiver.setBlendMode(blendMode);
                                            } else {
                                                this.a.setColorFilter(new PorterDuffColorFilter(bd1Var.a.d.g1, PorterDuff.Mode.SRC_IN));
                                            }
                                        }
                                    } else {
                                        Rect e6 = org.telegram.ui.Components.o9.e(org.telegram.ui.Components.o9.d(i17), getMeasuredWidth(), getMeasuredHeight());
                                        this.H = new LinearGradient(e6.left, e6.top, e6.right, e6.bottom, new int[]{i11, i13}, (float[]) null, Shader.TileMode.CLAMP);
                                        this.O = null;
                                        this.a.setGradientBitmap(null);
                                    }
                                }
                                fc0Var = this.O;
                                if (fc0Var == null) {
                                    fc0Var.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                                    this.O.draw(canvas);
                                } else {
                                    paint.setShader(this.H);
                                    if (this.H == null) {
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
                        ed1Var3 = bd1Var.a.d;
                        if (ed1Var3.b != 2) {
                        }
                        ed1 ed1Var52 = bd1Var.a.d;
                        if (ed1Var52.b != 2) {
                        }
                        int i182 = ed1Var52.h1;
                        if (i13 != 0) {
                        }
                        fc0Var = this.O;
                        if (fc0Var == null) {
                        }
                        super.onDraw(canvas);
                        if (radialProgress2.i.q == 4) {
                        }
                    }
                }
                i13 = i12;
                ed1Var2 = bd1Var.a.d;
                if (ed1Var2.b == 2) {
                }
                i15 = i14;
                ed1Var3 = bd1Var.a.d;
                if (ed1Var3.b != 2) {
                }
                ed1 ed1Var522 = bd1Var.a.d;
                if (ed1Var522.b != 2) {
                }
                int i1822 = ed1Var522.h1;
                if (i13 != 0) {
                }
                fc0Var = this.O;
                if (fc0Var == null) {
                }
                super.onDraw(canvas);
                if (radialProgress2.i.q == 4) {
                }
            }
        }
        i11 = i10;
        ed1Var = bd1Var.a.d;
        if (ed1Var.b != 2) {
        }
        i13 = i12;
        ed1Var2 = bd1Var.a.d;
        if (ed1Var2.b == 2) {
        }
        i15 = i14;
        ed1Var3 = bd1Var.a.d;
        if (ed1Var3.b != 2) {
        }
        ed1 ed1Var5222 = bd1Var.a.d;
        if (ed1Var5222.b != 2) {
        }
        int i18222 = ed1Var5222.h1;
        if (i13 != 0) {
        }
        fc0Var = this.O;
        if (fc0Var == null) {
        }
        super.onDraw(canvas);
        if (radialProgress2.i.q == 4) {
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z4) {
        TLRPC.TL_wallPaper tL_wallPaper = this.Q.a.d.T0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.F;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        if (z4) {
            this.E.setIcon(4, false, true);
        } else {
            t(tL_wallPaper2, true, z4);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(100.0f), AndroidUtilities.dp(100.0f));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        RadialProgress2 radialProgress2 = this.E;
        radialProgress2.o(Math.min(1.0f, j10 / j11), true);
        TLRPC.TL_wallPaper tL_wallPaper = this.Q.a.d.T0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.F;
        if ((!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) || radialProgress2.i.q == 10) {
            return;
        }
        t(tL_wallPaper2, false, true);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.E.o(1.0f, true);
        TLRPC.TL_wallPaper tL_wallPaper = this.Q.a.d.T0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.F;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            return;
        }
        t(tL_wallPaper2, false, true);
    }

    public void setPattern(TLRPC.TL_wallPaper tL_wallPaper) {
        this.F = tL_wallPaper;
        if (tL_wallPaper != null) {
            k(ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(tL_wallPaper.document.thumbs, AndroidUtilities.dp(100.0f)), tL_wallPaper.document), "100_100", null, null, 0L, "png", tL_wallPaper, 1);
        } else {
            setImageDrawable(null);
        }
        u(false);
    }

    public final void t(Object obj, boolean z4, boolean z10) {
        File httpFilePath;
        String name;
        int i10 = this.G;
        RadialProgress2 radialProgress2 = this.E;
        boolean z11 = obj instanceof TLRPC.TL_wallPaper;
        if (!z11 && !(obj instanceof MediaController.SearchImage)) {
            radialProgress2.setIcon(6, z4, z10);
            return;
        }
        if (z11) {
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
                TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photo.sizes, this.R, true);
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
            radialProgress2.o(1.0f, z10);
            radialProgress2.setIcon(6, z4, z10);
            return;
        }
        DownloadController.getInstance(i10).addLoadingFileObserver(name, null, this);
        FileLoader.getInstance(i10).isLoadingFile(name);
        Float fileProgress = ImageLoader.getInstance().getFileProgress(name);
        if (fileProgress != null) {
            radialProgress2.o(fileProgress.floatValue(), z10);
        } else {
            radialProgress2.o(0.0f, z10);
        }
        radialProgress2.setIcon(10, z4, z10);
    }

    public final void u(boolean z4) {
        TLRPC.TL_wallPaper tL_wallPaper = this.Q.a.d.T0;
        TLRPC.TL_wallPaper tL_wallPaper2 = this.F;
        if (!(tL_wallPaper2 == null && tL_wallPaper == null) && (tL_wallPaper == null || tL_wallPaper2 == null || tL_wallPaper2.id != tL_wallPaper.id)) {
            this.E.setIcon(4, false, z4);
        } else {
            t(tL_wallPaper, false, z4);
        }
        super.invalidate();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z4) {
    }
}
