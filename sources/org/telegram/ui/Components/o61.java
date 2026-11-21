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

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class o61 extends View implements org.telegram.messenger.fs {
    public String E;
    public int F;
    public final TextPaint G;
    public BitmapShader H;
    public final RectF I;
    public final Paint J;
    public final Paint K;
    public final RectF L;
    public final Matrix M;
    public final org.telegram.ui.qn0 N;
    public org.telegram.ui.dq0 O;
    public double P;
    public boolean Q;
    public final ImageReceiver R;
    public int S;
    public int T;
    public int U;
    public int V;
    public final Path W;
    public boolean a;
    public long a0;
    public c6 b;
    public long b0;
    public long c;
    public int c0;
    public Uri d;
    public int d0;
    public Runnable e;
    public ArrayList e0;
    public m61 f;
    public TLRPC.Document f0;
    public String g0;
    public float h;
    public int h0;
    public int n;
    public int r;
    public boolean s;
    public Bitmap w;
    public Bitmap x;
    public final Drawable y;

    public o61(Context context, org.telegram.ui.qn0 qn0Var) {
        super(context);
        this.n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.G = textPaint;
        this.I = new RectF();
        this.J = new Paint(2);
        this.K = new Paint(2);
        this.L = new RectF();
        this.M = new Matrix();
        this.W = new Path();
        this.h0 = -1;
        setVisibility(4);
        this.y = context.getResources().getDrawable(R.drawable.videopreview);
        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
        textPaint.setColor(-1);
        this.N = qn0Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.R = imageReceiver;
        imageReceiver.H0(this);
        imageReceiver.h1 = new ky(this, 26);
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
        c6 c6Var = this.b;
        if (c6Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = c6Var.v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (c6Var.e0 != null) {
                c6Var.e0.h();
            }
        }
        Utilities.e.c(new l61(this, 0));
        setVisibility(4);
        this.x = null;
        this.H = null;
        invalidate();
        this.n = -1;
        this.d = null;
        this.s = false;
        this.a = false;
        if (this.a0 != 0) {
            this.a0 = 0L;
            this.g0 = null;
            this.f0 = null;
            this.e0 = null;
            b(-1);
        }
    }

    public final void b(int i7) {
        int i10 = this.h0;
        if (i10 == i7) {
            return;
        }
        int i11 = org.telegram.messenger.ks.Z1;
        int i12 = org.telegram.messenger.ks.Y1;
        if (i7 == -1) {
            org.telegram.messenger.ks.f(i10).n(this, i12);
            org.telegram.messenger.ks.f(this.h0).n(this, i11);
        } else {
            org.telegram.messenger.ks.f(i7).c(this, i12);
            org.telegram.messenger.ks.f(i7).c(this, i11);
        }
        this.h0 = i7;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(org.telegram.messenger.fj fjVar, i61 i61Var) {
        TLRPC.Document document;
        long j3;
        if (i61Var == null) {
            return;
        }
        if (i61Var.Y() > 0) {
            h61 h61Var = null;
            for (int i7 = 0; i7 < i61Var.Y(); i7++) {
                ArrayList arrayList = i61Var.Z(i7).d;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    h61 h61Var2 = (h61) obj;
                    if (h61Var == null || ((!h61Var.b() && h61Var2.b()) || (h61Var.b() == h61Var2.b() && h61Var2.i * h61Var2.j < h61Var.i * h61Var.j))) {
                        h61Var = h61Var2;
                    }
                }
            }
            if (h61Var != null && !h61Var.b()) {
                int T = i61Var.T();
                f61 Z = (T < 0 || T >= i61Var.Y()) ? null : i61Var.Z(T);
                if (Z != null) {
                    h61Var = Z.a();
                }
            }
            if (h61Var != null && !h61Var.b()) {
                a();
                return;
            }
            if (h61Var != null) {
                h61Var.b();
            }
            if (h61Var != null && !h61Var.d.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = h61Var.d;
                org.telegram.messenger.q5 q5Var = Utilities.e;
                es0 es0Var = new es0((org.telegram.ui.kp0) this, h61Var, fjVar, 8);
                this.e = es0Var;
                q5Var.c(es0Var);
            }
        } else {
            Uri uri = i61Var.G;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
            }
            if (uri != null && !uri.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = uri;
                org.telegram.messenger.q5 q5Var2 = Utilities.e;
                es0 es0Var2 = new es0((org.telegram.ui.kp0) this, uri, fjVar, 7);
                this.e = es0Var2;
                q5Var2.c(es0Var2);
            }
        }
        TLRPC.MessageMedia m12 = org.telegram.messenger.fj.m1(fjVar);
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
            if (this.a0 == j3) {
                this.a0 = j3;
                this.e0 = null;
                if (document == null) {
                    this.g0 = null;
                    this.f0 = null;
                    b(-1);
                    this.e0 = null;
                    return;
                }
                org.telegram.messenger.w7.G(fjVar.K1);
                File I = org.telegram.messenger.w7.I(document);
                if (I == null || !I.exists()) {
                    this.g0 = org.telegram.messenger.w7.r(null, document);
                    this.f0 = document;
                    b(fjVar.K1);
                    org.telegram.messenger.w7.G(fjVar.K1).W(document, fjVar, 2, 0);
                    return;
                }
                this.g0 = null;
                this.f0 = null;
                b(-1);
                d(I);
                return;
            }
            return;
        }
        document = null;
        if (document != null) {
        }
        if (this.a0 == j3) {
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
                    Collections.sort(arrayList, Comparator$-CC.comparingDouble(new di.w0(3)));
                    this.b0 = j3;
                    this.c0 = i7;
                    this.d0 = i10;
                    this.e0 = arrayList;
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
                        arrayList.add(new n61(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                    }
                }
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            this.e0 = null;
        }
    }

    @Override // org.telegram.messenger.fs
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 != org.telegram.messenger.ks.Y1) {
            if (i7 == org.telegram.messenger.ks.Z1 && ((String) objArr[0]).equals(this.g0)) {
                this.g0 = null;
                this.f0 = null;
                b(-1);
                return;
            }
            return;
        }
        if (((String) objArr[0]).equals(this.g0)) {
            org.telegram.messenger.w7.G(i10);
            File I = org.telegram.messenger.w7.I(this.f0);
            if (I != null && I.exists()) {
                d(I);
            }
            this.g0 = null;
            this.f0 = null;
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
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Runnable, org.telegram.ui.Components.m61] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(org.telegram.messenger.fj fjVar, final float f10, int i7) {
        boolean z10;
        TLRPC.Document document;
        this.O = null;
        if (this.e0 != null) {
            long j3 = this.b0;
            TLRPC.MessageMedia m12 = org.telegram.messenger.fj.m1(fjVar);
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
                    this.P = (this.c * f10) / 1000.0d;
                    this.R.q0(org.telegram.messenger.fc.b(document), null, null, null, fjVar, 0);
                    z10 = true;
                    this.Q = z10;
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
                    this.E = org.telegram.messenger.g0.g0((int) (j10 / 1000), false, false);
                    this.F = (int) Math.ceil(this.G.measureText(r2));
                    invalidate();
                    if (this.f != null) {
                        Utilities.e.a(this.f);
                    }
                    if (z10) {
                        c6 c6Var = this.b;
                        if (c6Var != null) {
                            AnimatedFileDrawableStream animatedFileDrawableStream = c6Var.v0;
                            if (animatedFileDrawableStream != null) {
                                animatedFileDrawableStream.b(true);
                            }
                            if (c6Var.e0 != null) {
                                c6Var.e0.e();
                            }
                        }
                        org.telegram.messenger.q5 q5Var = Utilities.e;
                        ?? r32 = new Runnable() { // from class: org.telegram.ui.Components.m61
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i12;
                                o61 o61Var = o61.this;
                                RectF rectF = o61Var.I;
                                if (o61Var.b == null) {
                                    o61Var.h = f10;
                                    return;
                                }
                                int max = Math.max(org.telegram.messenger.ks.e3, org.telegram.messenger.g0.L(100.0f));
                                Bitmap q10 = o61Var.b.q(j10, false);
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
                                        Bitmap c10 = org.telegram.messenger.vr.c(max, i12);
                                        rectF.set(0.0f, 0.0f, max, i12);
                                        Canvas canvas = new Canvas(c10);
                                        canvas.drawBitmap(q10, (Rect) null, rectF, o61Var.J);
                                        canvas.setBitmap(null);
                                        q10 = c10;
                                    } catch (Throwable unused) {
                                        q10 = null;
                                    }
                                }
                                org.telegram.messenger.g0.g3(new fm0(24, o61Var, q10));
                            }
                        };
                        this.f = r32;
                        q5Var.c(r32);
                        return;
                    }
                    return;
                }
                this.R.w0(null);
            }
            document = null;
            if (document == null) {
            }
        } else {
            this.R.w0(null);
        }
        z10 = false;
        this.Q = z10;
        if (i7 != 0) {
        }
        final long j102 = (long) (this.c * f10);
        this.E = org.telegram.messenger.g0.g0((int) (j102 / 1000), false, false);
        this.F = (int) Math.ceil(this.G.measureText(r2));
        invalidate();
        if (this.f != null) {
        }
        if (z10) {
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R.R();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            bitmap.recycle();
            this.w = null;
        }
        boolean z10 = this.Q;
        TextPaint textPaint = this.G;
        Drawable drawable = this.y;
        if (!z10) {
            if (this.x == null || this.H == null) {
                return;
            }
            Matrix matrix = this.M;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.x.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            float measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            RectF rectF = this.L;
            rectF.set(0.0f, 0.0f, measuredWidth2, measuredHeight);
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), this.K);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.E, (getMeasuredWidth() - this.F) / 2.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), textPaint);
            return;
        }
        canvas.save();
        Path path = this.W;
        path.rewind();
        RectF rectF2 = org.telegram.messenger.g0.P;
        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        path.addRoundRect(rectF2, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.scale(getWidth() / this.U, getHeight() / this.V);
        canvas.translate(-this.S, -this.T);
        ImageReceiver imageReceiver = this.R;
        imageReceiver.y0(0.0f, 0.0f, imageReceiver.q(), imageReceiver.o());
        imageReceiver.h(canvas, null);
        canvas.restore();
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        canvas.drawText(this.E, (getMeasuredWidth() - this.F) / 2.0f, getMeasuredHeight() - org.telegram.messenger.g0.L(9.0f), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        setPivotY(getMeasuredHeight());
    }
}
