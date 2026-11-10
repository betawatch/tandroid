package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextPaint;
import android.view.View;
import j$.util.Comparator$-CC;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class z51 extends View implements org.telegram.messenger.ls {
    public String D;
    public int E;
    public final TextPaint F;
    public BitmapShader G;
    public final RectF H;
    public final Paint I;
    public final Paint J;
    public final RectF K;
    public final Matrix L;
    public final org.telegram.ui.on0 M;
    public org.telegram.ui.fq0 N;
    public double O;
    public boolean P;
    public final ImageReceiver Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public final Path V;
    public long W;
    public boolean a;
    public long a0;
    public u5 b;
    public int b0;
    public long c;
    public int c0;
    public Uri d;
    public ArrayList d0;
    public Runnable e;
    public TLRPC.Document e0;
    public x51 f;
    public String f0;
    public int g0;
    public float h;
    public int n;
    public int r;
    public boolean s;
    public Bitmap w;
    public Bitmap x;
    public final Drawable y;

    public z51(Context context, org.telegram.ui.on0 on0Var) {
        super(context);
        this.n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.F = textPaint;
        this.H = new RectF();
        this.I = new Paint(2);
        this.J = new Paint(2);
        this.K = new RectF();
        this.L = new Matrix();
        this.V = new Path();
        this.g0 = -1;
        setVisibility(4);
        this.y = context.getResources().getDrawable(R.drawable.videopreview);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        this.M = on0Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Q = imageReceiver;
        imageReceiver.H0(this);
        imageReceiver.g1 = new ax(this, 27);
    }

    public final void a() {
        if (this.e != null) {
            Utilities.e.a(this.e);
            this.e = null;
        }
        if (this.f != null) {
            Utilities.e.a(this.f);
            this.f = null;
        }
        u5 u5Var = this.b;
        if (u5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = u5Var.u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (u5Var.d0 != null) {
                u5Var.d0.h();
            }
        }
        Utilities.e.c(new w51(this, 0));
        setVisibility(4);
        this.x = null;
        this.G = null;
        invalidate();
        this.n = -1;
        this.d = null;
        this.s = false;
        this.a = false;
        if (this.W != 0) {
            this.W = 0L;
            this.f0 = null;
            this.e0 = null;
            this.d0 = null;
            b(-1);
        }
    }

    public final void b(int i7) {
        int i10 = this.g0;
        if (i10 == i7) {
            return;
        }
        int i11 = org.telegram.messenger.qs.Z1;
        int i12 = org.telegram.messenger.qs.Y1;
        if (i7 == -1) {
            org.telegram.messenger.qs.f(i10).n(this, i12);
            org.telegram.messenger.qs.f(this.g0).n(this, i11);
        } else {
            org.telegram.messenger.qs.f(i7).c(this, i12);
            org.telegram.messenger.qs.f(i7).c(this, i11);
        }
        this.g0 = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(org.telegram.messenger.ij ijVar, t51 t51Var) {
        TLRPC.Document document;
        long j3;
        if (t51Var == null) {
            return;
        }
        if (t51Var.Y() > 0) {
            r51 r51Var = null;
            for (int i7 = 0; i7 < t51Var.Y(); i7++) {
                ArrayList arrayList = t51Var.Z(i7).d;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    r51 r51Var2 = (r51) obj;
                    if (r51Var == null || ((!r51Var.b() && r51Var2.b()) || (r51Var.b() == r51Var2.b() && r51Var2.i * r51Var2.j < r51Var.i * r51Var.j))) {
                        r51Var = r51Var2;
                    }
                }
            }
            if (r51Var != null && !r51Var.b()) {
                int T = t51Var.T();
                p51 Z = (T < 0 || T >= t51Var.Y()) ? null : t51Var.Z(T);
                if (Z != null) {
                    r51Var = Z.a();
                }
            }
            if (r51Var != null && !r51Var.b()) {
                a();
                return;
            }
            if (r51Var != null) {
                r51Var.b();
            }
            if (r51Var != null && !r51Var.d.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = r51Var.d;
                org.telegram.messenger.p5 p5Var = Utilities.e;
                r31 r31Var = new r31((org.telegram.ui.mp0) this, r51Var, ijVar, 2);
                this.e = r31Var;
                p5Var.c(r31Var);
            }
        } else {
            Uri uri = t51Var.F;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
            }
            if (uri != null && !uri.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = uri;
                org.telegram.messenger.p5 p5Var2 = Utilities.e;
                r31 r31Var2 = new r31((org.telegram.ui.mp0) this, uri, ijVar, 1);
                this.e = r31Var2;
                p5Var2.c(r31Var2);
            }
        }
        TLRPC.MessageMedia m12 = org.telegram.messenger.ij.m1(ijVar);
        if (m12 != null) {
            TLRPC.Document document2 = m12.document;
            if (document2 == null || !"application/x-tgstoryboardmap".equalsIgnoreCase(document2.mime_type)) {
                ArrayList<TLRPC.Document> arrayList2 = m12.alt_documents;
                int size2 = arrayList2.size();
                int i11 = 0;
                while (i11 < size2) {
                    TLRPC.Document document3 = arrayList2.get(i11);
                    i11++;
                    TLRPC.Document document4 = document3;
                    if ("application/x-tgstoryboardmap".equalsIgnoreCase(document4.mime_type)) {
                        document = document4;
                        break;
                    }
                }
            } else {
                document = m12.document;
            }
            j3 = document != null ? 0L : document.id;
            if (this.W == j3) {
                this.W = j3;
                this.d0 = null;
                if (document == null) {
                    this.f0 = null;
                    this.e0 = null;
                    b(-1);
                    this.d0 = null;
                    return;
                }
                org.telegram.messenger.w7.G(ijVar.I1);
                File I = org.telegram.messenger.w7.I(document);
                if (I == null || !I.exists()) {
                    this.f0 = org.telegram.messenger.w7.r(null, document);
                    this.e0 = document;
                    b(ijVar.I1);
                    org.telegram.messenger.w7.G(ijVar.I1).W(document, ijVar, 2, 0);
                    return;
                }
                this.f0 = null;
                this.e0 = null;
                b(-1);
                d(I);
                return;
            }
            return;
        }
        document = null;
        if (document != null) {
        }
        if (this.W == j3) {
        }
    }

    public final void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j3 = 0;
            int i7 = 0;
            int i10 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine == null) {
                    Collections.sort(arrayList, Comparator$-CC.comparingDouble(new bi.j1(3)));
                    this.a0 = j3;
                    this.b0 = i7;
                    this.c0 = i10;
                    this.d0 = arrayList;
                    return;
                }
                if (readLine.startsWith("file=mtproto:")) {
                    j3 = Long.parseLong(readLine.substring(13));
                } else if (readLine.startsWith("frame_width=")) {
                    i7 = Integer.parseInt(readLine.substring(12));
                } else if (readLine.startsWith("frame_height=")) {
                    i10 = Integer.parseInt(readLine.substring(13));
                } else {
                    String[] split = readLine.split(",");
                    if (split.length == 3) {
                        arrayList.add(new y51(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.d0 = null;
        }
    }

    @Override // org.telegram.messenger.ls
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.qs.Y1) {
            if (i7 == org.telegram.messenger.qs.Z1 && ((String) objArr[0]).equals(this.f0)) {
                this.f0 = null;
                this.e0 = null;
                b(-1);
                return;
            }
            return;
        }
        if (((String) objArr[0]).equals(this.f0)) {
            org.telegram.messenger.w7.G(i10);
            File I = org.telegram.messenger.w7.I(this.e0);
            if (I != null && I.exists()) {
                d(I);
            }
            this.f0 = null;
            this.e0 = null;
            b(-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Runnable, org.telegram.ui.Components.x51] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(org.telegram.messenger.ij ijVar, final float f10, int i7) {
        boolean z9;
        TLRPC.Document document;
        this.N = null;
        if (this.d0 != null) {
            long j3 = this.a0;
            TLRPC.MessageMedia m12 = org.telegram.messenger.ij.m1(ijVar);
            if (m12 != null) {
                document = m12.document;
                if (document == null || document.id != j3) {
                    ArrayList<TLRPC.Document> arrayList = m12.alt_documents;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        TLRPC.Document document2 = arrayList.get(i10);
                        i10++;
                        TLRPC.Document document3 = document2;
                        if (document3.id == j3) {
                            document = document3;
                            break;
                        }
                    }
                }
                if (document == null) {
                    this.O = (this.c * f10) / 1000.0d;
                    this.Q.q0(org.telegram.messenger.hc.b(document), null, null, null, ijVar, 0);
                    z9 = true;
                    this.P = z9;
                    if (i7 != 0) {
                        this.r = i7;
                        int i11 = ((int) (i7 * f10)) / 5;
                        if (this.n == i11) {
                            return;
                        } else {
                            this.n = i11;
                        }
                    }
                    final long j10 = (long) (this.c * f10);
                    this.D = org.telegram.messenger.g0.g0((int) (j10 / 1000), false, false);
                    this.E = (int) Math.ceil(this.F.measureText(r2));
                    invalidate();
                    if (this.f != null) {
                        Utilities.e.a(this.f);
                    }
                    if (z9) {
                        u5 u5Var = this.b;
                        if (u5Var != null) {
                            AnimatedFileDrawableStream animatedFileDrawableStream = u5Var.u0;
                            if (animatedFileDrawableStream != null) {
                                animatedFileDrawableStream.b(true);
                            }
                            if (u5Var.d0 != null) {
                                u5Var.d0.e();
                            }
                        }
                        org.telegram.messenger.p5 p5Var = Utilities.e;
                        ?? r32 = new Runnable() { // from class: org.telegram.ui.Components.x51
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i12;
                                z51 z51Var = z51.this;
                                RectF rectF = z51Var.H;
                                if (z51Var.b == null) {
                                    z51Var.h = f10;
                                    return;
                                }
                                int max = Math.max(org.telegram.messenger.qs.e3, org.telegram.messenger.g0.L(100.0f));
                                Bitmap q10 = z51Var.b.q(j10, false);
                                if (q10 != null) {
                                    int width = q10.getWidth();
                                    int height = q10.getHeight();
                                    if (width > height) {
                                        i12 = (int) (height / (width / max));
                                    } else {
                                        int i13 = (int) (width / (height / max));
                                        i12 = max;
                                        max = i13;
                                    }
                                    try {
                                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                        Bitmap c10 = org.telegram.messenger.as.c(max, i12);
                                        rectF.set(0.0f, 0.0f, max, i12);
                                        Canvas canvas = new Canvas(c10);
                                        canvas.drawBitmap(q10, (Rect) null, rectF, z51Var.I);
                                        canvas.setBitmap(null);
                                        q10 = c10;
                                    } catch (Throwable unused) {
                                        q10 = null;
                                    }
                                }
                                org.telegram.messenger.g0.h3(new h41(3, z51Var, q10));
                            }
                        };
                        this.f = r32;
                        p5Var.c(r32);
                        return;
                    }
                    return;
                }
                this.Q.w0(null);
            }
            document = null;
            if (document == null) {
            }
        } else {
            this.Q.w0(null);
        }
        z9 = false;
        this.P = z9;
        if (i7 != 0) {
        }
        final long j102 = (long) (this.c * f10);
        this.D = org.telegram.messenger.g0.g0((int) (j102 / 1000), false, false);
        this.E = (int) Math.ceil(this.F.measureText(r2));
        invalidate();
        if (this.f != null) {
        }
        if (z9) {
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            bitmap.recycle();
            this.w = null;
        }
        boolean z9 = this.P;
        TextPaint textPaint = this.F;
        Drawable drawable = this.y;
        if (!z9) {
            if (this.x == null || this.G == null) {
                return;
            }
            Matrix matrix = this.L;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.x.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            float measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            RectF rectF = this.K;
            rectF.set(0.0f, 0.0f, measuredWidth2, measuredHeight);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.J);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.D, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), textPaint);
            return;
        }
        canvas.save();
        Path path = this.V;
        path.rewind();
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        path.addRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.scale(getWidth() / this.T, getHeight() / this.U);
        canvas.translate(-this.R, -this.S);
        ImageReceiver imageReceiver = this.Q;
        imageReceiver.y0(0.0f, 0.0f, imageReceiver.q(), imageReceiver.o());
        imageReceiver.h(canvas, null);
        canvas.restore();
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        canvas.drawText(this.D, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setPivotY(getMeasuredHeight());
    }
}
