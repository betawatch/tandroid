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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class b71 extends View implements org.telegram.messenger.us {
    public String D;
    public int E;
    public final TextPaint F;
    public BitmapShader G;
    public final RectF H;
    public final Paint I;
    public final Paint J;
    public final RectF K;
    public final Matrix L;
    public final org.telegram.ui.yo0 M;
    public org.telegram.ui.mr0 N;
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
    public s5 b;
    public int b0;
    public long c;
    public int c0;
    public Uri d;
    public ArrayList d0;
    public Runnable e;
    public TLRPC.Document e0;
    public z61 f;
    public String f0;
    public int g0;
    public float h;
    public int n;
    public int r;
    public boolean s;
    public Bitmap w;
    public Bitmap x;
    public final Drawable y;

    public b71(Context context, org.telegram.ui.yo0 yo0Var) {
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
        textPaint.setTextSize(org.telegram.messenger.i0.L(13.0f));
        textPaint.setColor(-1);
        this.M = yo0Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.Q = imageReceiver;
        imageReceiver.H0(this);
        imageReceiver.g1 = new px(this, 27);
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
        s5 s5Var = this.b;
        if (s5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = s5Var.u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (s5Var.d0 != null) {
                s5Var.d0.h();
            }
        }
        Utilities.e.c(new x61(this, 0));
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

    public final void b(int i10) {
        int i11 = this.g0;
        if (i11 == i10) {
            return;
        }
        int i12 = org.telegram.messenger.zs.Z1;
        int i13 = org.telegram.messenger.zs.Y1;
        if (i10 == -1) {
            org.telegram.messenger.zs.f(i11).n(this, i13);
            org.telegram.messenger.zs.f(this.g0).n(this, i12);
        } else {
            org.telegram.messenger.zs.f(i10).c(this, i13);
            org.telegram.messenger.zs.f(i10).c(this, i12);
        }
        this.g0 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(org.telegram.messenger.jj jjVar, u61 u61Var) {
        TLRPC.Document document;
        long j10;
        if (u61Var == null) {
            return;
        }
        if (u61Var.Y() > 0) {
            t61 t61Var = null;
            for (int i10 = 0; i10 < u61Var.Y(); i10++) {
                ArrayList arrayList = u61Var.Z(i10).d;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    t61 t61Var2 = (t61) obj;
                    if (t61Var == null || ((!t61Var.b() && t61Var2.b()) || (t61Var.b() == t61Var2.b() && t61Var2.i * t61Var2.j < t61Var.i * t61Var.j))) {
                        t61Var = t61Var2;
                    }
                }
            }
            if (t61Var != null && !t61Var.b()) {
                int T = u61Var.T();
                r61 Z = (T < 0 || T >= u61Var.Y()) ? null : u61Var.Z(T);
                if (Z != null) {
                    t61Var = Z.a();
                }
            }
            if (t61Var != null && !t61Var.b()) {
                a();
                return;
            }
            if (t61Var != null) {
                t61Var.b();
            }
            if (t61Var != null && !t61Var.d.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = t61Var.d;
                org.telegram.messenger.r5 r5Var = Utilities.e;
                u41 u41Var = new u41((org.telegram.ui.tq0) this, t61Var, jjVar, 2);
                this.e = u41Var;
                r5Var.c(u41Var);
            }
        } else {
            Uri uri = u61Var.F;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
            }
            if (uri != null && !uri.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = uri;
                org.telegram.messenger.r5 r5Var2 = Utilities.e;
                u41 u41Var2 = new u41((org.telegram.ui.tq0) this, uri, jjVar, 1);
                this.e = u41Var2;
                r5Var2.c(u41Var2);
            }
        }
        TLRPC.MessageMedia n12 = org.telegram.messenger.jj.n1(jjVar);
        if (n12 != null) {
            TLRPC.Document document2 = n12.document;
            if (document2 == null || !"application/x-tgstoryboardmap".equalsIgnoreCase(document2.mime_type)) {
                ArrayList<TLRPC.Document> arrayList2 = n12.alt_documents;
                int size2 = arrayList2.size();
                int i12 = 0;
                while (i12 < size2) {
                    TLRPC.Document document3 = arrayList2.get(i12);
                    i12++;
                    TLRPC.Document document4 = document3;
                    if ("application/x-tgstoryboardmap".equalsIgnoreCase(document4.mime_type)) {
                        document = document4;
                        break;
                    }
                }
            } else {
                document = n12.document;
            }
            j10 = document != null ? 0L : document.id;
            if (this.W == j10) {
                this.W = j10;
                this.d0 = null;
                if (document == null) {
                    this.f0 = null;
                    this.e0 = null;
                    b(-1);
                    this.d0 = null;
                    return;
                }
                org.telegram.messenger.b8.G(jjVar.I1);
                File I = org.telegram.messenger.b8.I(document);
                if (I == null || !I.exists()) {
                    this.f0 = org.telegram.messenger.b8.r(null, document);
                    this.e0 = document;
                    b(jjVar.I1);
                    org.telegram.messenger.b8.G(jjVar.I1).X(document, jjVar, 2, 0);
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
        if (this.W == j10) {
        }
    }

    public final void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j10 = 0;
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine == null) {
                    Collections.sort(arrayList, Comparator$-CC.comparingDouble(new y61(0)));
                    this.a0 = j10;
                    this.b0 = i10;
                    this.c0 = i11;
                    this.d0 = arrayList;
                    return;
                }
                if (readLine.startsWith("file=mtproto:")) {
                    j10 = Long.parseLong(readLine.substring(13));
                } else if (readLine.startsWith("frame_width=")) {
                    i10 = Integer.parseInt(readLine.substring(12));
                } else if (readLine.startsWith("frame_height=")) {
                    i11 = Integer.parseInt(readLine.substring(13));
                } else {
                    String[] split = readLine.split(",");
                    if (split.length == 3) {
                        arrayList.add(new a71(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                    }
                }
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            this.d0 = null;
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != org.telegram.messenger.zs.Y1) {
            if (i10 == org.telegram.messenger.zs.Z1 && ((String) objArr[0]).equals(this.f0)) {
                this.f0 = null;
                this.e0 = null;
                b(-1);
                return;
            }
            return;
        }
        if (((String) objArr[0]).equals(this.f0)) {
            org.telegram.messenger.b8.G(i11);
            File I = org.telegram.messenger.b8.I(this.e0);
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
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Runnable, org.telegram.ui.Components.z61] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(org.telegram.messenger.jj jjVar, final float f7, int i10) {
        boolean z10;
        TLRPC.Document document;
        this.N = null;
        if (this.d0 != null) {
            long j10 = this.a0;
            TLRPC.MessageMedia n12 = org.telegram.messenger.jj.n1(jjVar);
            if (n12 != null) {
                document = n12.document;
                if (document == null || document.id != j10) {
                    ArrayList<TLRPC.Document> arrayList = n12.alt_documents;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Document document2 = arrayList.get(i11);
                        i11++;
                        TLRPC.Document document3 = document2;
                        if (document3.id == j10) {
                            document = document3;
                            break;
                        }
                    }
                }
                if (document == null) {
                    this.O = (this.c * f7) / 1000.0d;
                    this.Q.q0(org.telegram.messenger.ic.b(document), null, null, null, jjVar, 0);
                    z10 = true;
                    this.P = z10;
                    if (i10 != 0) {
                        this.r = i10;
                        int i12 = ((int) (i10 * f7)) / 5;
                        if (this.n == i12) {
                            return;
                        } else {
                            this.n = i12;
                        }
                    }
                    final long j11 = (long) (this.c * f7);
                    this.D = org.telegram.messenger.i0.g0((int) (j11 / 1000), false, false);
                    this.E = (int) Math.ceil(this.F.measureText(r2));
                    invalidate();
                    if (this.f != null) {
                        Utilities.e.a(this.f);
                    }
                    if (z10) {
                        s5 s5Var = this.b;
                        if (s5Var != null) {
                            AnimatedFileDrawableStream animatedFileDrawableStream = s5Var.u0;
                            if (animatedFileDrawableStream != null) {
                                animatedFileDrawableStream.b(true);
                            }
                            if (s5Var.d0 != null) {
                                s5Var.d0.e();
                            }
                        }
                        org.telegram.messenger.r5 r5Var = Utilities.e;
                        ?? r32 = new Runnable() { // from class: org.telegram.ui.Components.z61
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i13;
                                b71 b71Var = b71.this;
                                RectF rectF = b71Var.H;
                                if (b71Var.b == null) {
                                    b71Var.h = f7;
                                    return;
                                }
                                int max = Math.max(org.telegram.messenger.zs.e3, org.telegram.messenger.i0.L(100.0f));
                                Bitmap q6 = b71Var.b.q(j11, false);
                                if (q6 != null) {
                                    int width = q6.getWidth();
                                    int height = q6.getHeight();
                                    if (width > height) {
                                        i13 = (int) (height / (width / max));
                                    } else {
                                        int i14 = (int) (width / (height / max));
                                        i13 = max;
                                        max = i14;
                                    }
                                    try {
                                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                        Bitmap b10 = org.telegram.messenger.js.b(max, i13);
                                        rectF.set(0.0f, 0.0f, max, i13);
                                        Canvas canvas = new Canvas(b10);
                                        canvas.drawBitmap(q6, (Rect) null, rectF, b71Var.I);
                                        canvas.setBitmap(null);
                                        q6 = b10;
                                    } catch (Throwable unused) {
                                        q6 = null;
                                    }
                                }
                                org.telegram.messenger.i0.g3(new gi0(25, b71Var, q6));
                            }
                        };
                        this.f = r32;
                        r5Var.c(r32);
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
        z10 = false;
        this.P = z10;
        if (i10 != 0) {
        }
        final long j112 = (long) (this.c * f7);
        this.D = org.telegram.messenger.i0.g0((int) (j112 / 1000), false, false);
        this.E = (int) Math.ceil(this.F.measureText(r2));
        invalidate();
        if (this.f != null) {
        }
        if (z10) {
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
        boolean z10 = this.P;
        TextPaint textPaint = this.F;
        Drawable drawable = this.y;
        if (!z10) {
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
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), this.J);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.D, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - org.telegram.messenger.i0.L(9.0f), textPaint);
            return;
        }
        canvas.save();
        Path path = this.V;
        path.rewind();
        RectF rectF2 = org.telegram.messenger.i0.P;
        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        path.addRoundRect(rectF2, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.scale(getWidth() / this.T, getHeight() / this.U);
        canvas.translate(-this.R, -this.S);
        ImageReceiver imageReceiver = this.Q;
        imageReceiver.y0(0.0f, 0.0f, imageReceiver.q(), imageReceiver.o());
        imageReceiver.h(canvas, null);
        canvas.restore();
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        canvas.drawText(this.D, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - org.telegram.messenger.i0.L(9.0f), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotY(getMeasuredHeight());
    }
}
