// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorSpace;
import android.graphics.HardwareRenderer;
import android.graphics.Paint;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.hardware.HardwareBuffer;
import android.media.Image;
import android.media.ImageReader;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class b0d extends d0d {
    public final RenderNode e;
    public Bitmap f;
    public Paint g;
    public Rect h;

    public b0d(int i, int i2, int i3, int i4, String str) {
        super(i, i2, i3, i4);
        RenderNode renderNode = new RenderNode(str);
        this.e = renderNode;
        renderNode.setPosition(i, i2, i3, i4);
    }

    @Override // d0d
    public final Canvas a() {
        return this.e.beginRecording(this.c - this.a, this.d - this.b);
    }

    @Override // d0d
    public final void b() {
        this.e.discardDisplayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0151  */
    @Override // d0d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(Canvas canvas, float f) {
        long j;
        long j2;
        Paint paint;
        Rect rect;
        Bitmap bitmap;
        HardwareRenderer hardwareRenderer;
        ImageReader imageReader;
        Image acquireNextImage;
        if (this.e.hasDisplayList()) {
            if (canvas.isHardwareAccelerated()) {
                this.e.setAlpha(f);
                canvas.drawRenderNode(this.e);
                return;
            }
            if (f > 0.0f) {
                int i = this.c;
                int i2 = this.a;
                long j3 = i - i2;
                int i3 = this.d;
                int i4 = this.b;
                long j4 = i3 - i4;
                if (j3 <= 0 || j4 <= 0 || j3 > 2147483647L || j4 > 2147483647L) {
                    return;
                }
                if (this.f == null) {
                    double d = j3;
                    double d2 = j4;
                    double min = Math.min(Math.min(1.0d, Math.sqrt(1.6777216E7d / (d * d2))), 8192.0d / Math.max(j3, j4));
                    int max = (int) Math.max(1.0d, Math.floor(d * min));
                    int max2 = (int) Math.max(1.0d, Math.floor(d2 * min));
                    RenderNode renderNode = this.e;
                    float f2 = max / j3;
                    float f3 = max2 / j4;
                    if (max <= 0 || max2 <= 0) {
                        j = j3;
                        j2 = j4;
                    } else {
                        j = j3;
                        try {
                            imageReader = ImageReader.newInstance(max, max2, 1, 1, 768L);
                            try {
                                try {
                                    hardwareRenderer = new HardwareRenderer();
                                    try {
                                        hardwareRenderer.setOpaque(false);
                                        hardwareRenderer.setSurface(imageReader.getSurface());
                                        vk1.p();
                                        j2 = j4;
                                    } catch (Throwable th) {
                                        th = th;
                                        j2 = j4;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    j2 = j4;
                                    imageReader = imageReader;
                                    hardwareRenderer = null;
                                    try {
                                        cc4.g(th, true);
                                        if (hardwareRenderer != null) {
                                            hardwareRenderer.destroy();
                                        }
                                        if (imageReader != null) {
                                            imageReader.close();
                                        }
                                        bitmap = null;
                                        this.f = bitmap;
                                        if (bitmap == null) {
                                        }
                                        paint = this.g;
                                        if (paint == null) {
                                        }
                                        paint.setAlpha(Math.round(Math.min(1.0f, f) * 255.0f));
                                        if (this.f.getWidth() != j) {
                                        }
                                        rect = this.h;
                                        if (rect == null) {
                                        }
                                        rect.set(i2, i4, i, i3);
                                        canvas.drawBitmap(this.f, (Rect) null, this.h, this.g);
                                    } catch (Throwable th3) {
                                        if (hardwareRenderer != null) {
                                            hardwareRenderer.destroy();
                                        }
                                        if (imageReader != null) {
                                            imageReader.close();
                                        }
                                        throw th3;
                                    }
                                }
                                try {
                                    RenderNode renderNode2 = new RenderNode("widget-sandbox-software");
                                    renderNode2.setPosition(0, 0, max, max2);
                                    RecordingCanvas beginRecording = renderNode2.beginRecording(max, max2);
                                    beginRecording.scale(f2, f3);
                                    beginRecording.translate(-i2, -i4);
                                    renderNode.setAlpha(1.0f);
                                    beginRecording.drawRenderNode(renderNode);
                                    renderNode2.endRecording();
                                    hardwareRenderer.setContentRoot(renderNode2);
                                    hardwareRenderer.createRenderRequest().setWaitForPresent(true).syncAndDraw();
                                    acquireNextImage = imageReader.acquireNextImage();
                                } catch (Throwable th4) {
                                    th = th4;
                                    imageReader = imageReader;
                                    cc4.g(th, true);
                                    if (hardwareRenderer != null) {
                                    }
                                    if (imageReader != null) {
                                    }
                                    bitmap = null;
                                    this.f = bitmap;
                                    if (bitmap == null) {
                                    }
                                    paint = this.g;
                                    if (paint == null) {
                                    }
                                    paint.setAlpha(Math.round(Math.min(1.0f, f) * 255.0f));
                                    if (this.f.getWidth() != j) {
                                    }
                                    rect = this.h;
                                    if (rect == null) {
                                    }
                                    rect.set(i2, i4, i, i3);
                                    canvas.drawBitmap(this.f, (Rect) null, this.h, this.g);
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                j2 = j4;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            j2 = j4;
                            hardwareRenderer = null;
                            imageReader = null;
                        }
                        if (acquireNextImage != null) {
                            try {
                                HardwareBuffer hardwareBuffer = acquireNextImage.getHardwareBuffer();
                                if (hardwareBuffer != null) {
                                    try {
                                        Bitmap wrapHardwareBuffer = Bitmap.wrapHardwareBuffer(hardwareBuffer, ColorSpace.get(ColorSpace.Named.SRGB));
                                        bitmap = wrapHardwareBuffer == null ? null : wrapHardwareBuffer.copy(Bitmap.Config.ARGB_8888, false);
                                        hardwareRenderer.destroy();
                                        imageReader.close();
                                        this.f = bitmap;
                                        if (bitmap == null) {
                                            return;
                                        }
                                    } finally {
                                        hardwareBuffer.close();
                                    }
                                }
                            } finally {
                                acquireNextImage.close();
                            }
                        }
                        hardwareRenderer.destroy();
                        imageReader.close();
                    }
                    bitmap = null;
                    this.f = bitmap;
                    if (bitmap == null) {
                    }
                } else {
                    j = j3;
                    j2 = j4;
                }
                paint = this.g;
                if (paint == null) {
                    paint = new Paint(2);
                    this.g = paint;
                }
                paint.setAlpha(Math.round(Math.min(1.0f, f) * 255.0f));
                if (this.f.getWidth() != j && this.f.getHeight() == j2) {
                    canvas.drawBitmap(this.f, i2, i4, this.g);
                    return;
                }
                rect = this.h;
                if (rect == null) {
                    rect = new Rect();
                    this.h = rect;
                }
                rect.set(i2, i4, i, i3);
                canvas.drawBitmap(this.f, (Rect) null, this.h, this.g);
            }
        }
    }

    @Override // d0d
    public final void d() {
        this.e.endRecording();
    }

    @Override // d0d
    public final boolean e() {
        return this.e.hasDisplayList();
    }

    @Override // d0d
    public final void f() {
        long j = this.c - this.a;
        long j2 = this.d - this.b;
        this.e.setUseCompositingLayer(j > 0 && j2 > 0 && j <= 4096 && j2 <= 4096 && j * j2 <= 8388608, null);
    }
}
