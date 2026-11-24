// default package

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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class ecc extends View implements gk7 {
    public String E;
    public int F;
    public final TextPaint G;
    public BitmapShader H;
    public final RectF I;
    public final Paint J;
    public final Paint K;
    public final RectF L;
    public final Matrix M;
    public final s68 N;
    public x88 O;
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
    public km b;
    public long b0;
    public long c;
    public int c0;
    public Uri d;
    public int d0;
    public Runnable e;
    public ArrayList e0;
    public ccc f;
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

    public ecc(Context context, s68 s68Var) {
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
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setColor(-1);
        this.N = s68Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.R = imageReceiver;
        imageReceiver.p0(this);
        imageReceiver.h1 = new hza(this, (byte) 28);
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
        km kmVar = this.b;
        if (kmVar != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = kmVar.v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (kmVar.e0 != null) {
                kmVar.e0.h();
            }
        }
        Utilities.e.c(new kbc(this, (byte) 3));
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

    public final void b(int i) {
        int i2 = this.h0;
        if (i2 == i) {
            return;
        }
        int i3 = kk7.Y1;
        int i4 = kk7.X1;
        if (i == -1) {
            kk7.f(i2).n(this, i4);
            kk7.f(this.h0).n(this, i3);
        } else {
            kk7.f(i).b(this, i4);
            kk7.f(i).b(this, i3);
        }
        this.h0 = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(k27 k27Var, lbc lbcVar) {
        TLRPC.Document document;
        long j;
        if (lbcVar == null) {
            return;
        }
        byte b = 2;
        if (lbcVar.Y() > 0) {
            jbc jbcVar = null;
            for (int i = 0; i < lbcVar.Y(); i++) {
                ArrayList arrayList = lbcVar.Z(i).d;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    jbc jbcVar2 = (jbc) obj;
                    if (jbcVar == null || ((!jbcVar.b() && jbcVar2.b()) || (jbcVar.b() == jbcVar2.b() && jbcVar2.i * jbcVar2.j < jbcVar.i * jbcVar.j))) {
                        jbcVar = jbcVar2;
                    }
                }
            }
            if (jbcVar != null && !jbcVar.b()) {
                int T = lbcVar.T();
                hbc Z = (T < 0 || T >= lbcVar.Y()) ? null : lbcVar.Z(T);
                if (Z != null) {
                    jbcVar = Z.a();
                }
            }
            if (jbcVar != null) {
                if (!jbcVar.b()) {
                    a();
                    return;
                }
                jbcVar.b();
                if (!jbcVar.d.equals(this.d)) {
                    if (this.a) {
                        a();
                    }
                    this.d = jbcVar.d;
                    co3 co3Var = Utilities.e;
                    wbc wbcVar = new wbc((h88) this, jbcVar, k27Var, b);
                    this.e = wbcVar;
                    co3Var.c(wbcVar);
                }
            }
        } else {
            Uri uri = lbcVar.G;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
                if (!uri.equals(this.d)) {
                    if (this.a) {
                        a();
                    }
                    this.d = uri;
                    co3 co3Var2 = Utilities.e;
                    wbc wbcVar2 = new wbc((h88) this, uri, k27Var, (byte) 1);
                    this.e = wbcVar2;
                    co3Var2.c(wbcVar2);
                }
            }
        }
        TLRPC.MessageMedia m1 = k27.m1(k27Var);
        if (m1 != null) {
            TLRPC.Document document2 = m1.document;
            if (document2 == null || !"application/x-tgstoryboardmap".equalsIgnoreCase(document2.mime_type)) {
                ArrayList<TLRPC.Document> arrayList2 = m1.alt_documents;
                int size2 = arrayList2.size();
                int i3 = 0;
                while (i3 < size2) {
                    TLRPC.Document document3 = arrayList2.get(i3);
                    i3++;
                    TLRPC.Document document4 = document3;
                    if ("application/x-tgstoryboardmap".equalsIgnoreCase(document4.mime_type)) {
                        document = document4;
                        break;
                    }
                }
            } else {
                document = m1.document;
            }
            j = document != null ? 0L : document.id;
            if (this.a0 == j) {
                this.a0 = j;
                this.e0 = null;
                if (document == null) {
                    this.g0 = null;
                    this.f0 = null;
                    b(-1);
                    this.e0 = null;
                    return;
                }
                ba4.G(k27Var.K1);
                File I = ba4.I(document);
                if (I == null || !I.exists()) {
                    this.g0 = ba4.r(null, document);
                    this.f0 = document;
                    b(k27Var.K1);
                    ba4.G(k27Var.K1).X(document, k27Var, 2, 0);
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
        if (this.a0 == j) {
        }
    }

    public final void d(File file) {
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            ArrayList arrayList = new ArrayList();
            long j = 0;
            int i = 0;
            int i2 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine == null) {
                    Collections.sort(arrayList, Comparator$-CC.comparingDouble(new mm7((byte) 6)));
                    this.b0 = j;
                    this.c0 = i;
                    this.d0 = i2;
                    this.e0 = arrayList;
                    return;
                }
                if (readLine.startsWith("file=mtproto:")) {
                    j = Long.parseLong(readLine.substring(13));
                } else if (readLine.startsWith("frame_width=")) {
                    i = Integer.parseInt(readLine.substring(12));
                } else if (readLine.startsWith("frame_height=")) {
                    i2 = Integer.parseInt(readLine.substring(13));
                } else {
                    String[] split = readLine.split(",");
                    if (split.length == 3) {
                        arrayList.add(new dcc(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                    }
                }
            }
        } catch (Exception e) {
            fa4.g(e, true);
            this.e0 = null;
        }
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != kk7.X1) {
            if (i == kk7.Y1 && ((String) objArr[0]).equals(this.g0)) {
                this.g0 = null;
                this.f0 = null;
                b(-1);
                return;
            }
            return;
        }
        if (((String) objArr[0]).equals(this.g0)) {
            ba4.G(i2);
            File I = ba4.I(this.f0);
            if (I != null && I.exists()) {
                d(I);
            }
            this.g0 = null;
            this.f0 = null;
            b(-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Type inference failed for: r3v3, types: [ccc, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(k27 k27Var, final float f, int i) {
        boolean z;
        TLRPC.Document document;
        this.O = null;
        if (this.e0 != null) {
            long j = this.b0;
            TLRPC.MessageMedia m1 = k27.m1(k27Var);
            if (m1 != null) {
                document = m1.document;
                if (document == null || document.id != j) {
                    ArrayList<TLRPC.Document> arrayList = m1.alt_documents;
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        TLRPC.Document document2 = arrayList.get(i2);
                        i2++;
                        TLRPC.Document document3 = document2;
                        if (document3.id == j) {
                            document = document3;
                            break;
                        }
                    }
                }
                if (document == null) {
                    this.P = (this.c * f) / 1000.0d;
                    this.R.d0(gl5.b(document), null, null, null, k27Var, 0);
                    z = true;
                    this.Q = z;
                    if (i != 0) {
                        this.r = i;
                        int i3 = ((int) (i * f)) / 5;
                        if (this.n == i3) {
                            return;
                        } else {
                            this.n = i3;
                        }
                    }
                    final long j2 = (long) (this.c * f);
                    this.E = gl.g0((int) (j2 / 1000), false, false);
                    this.F = (int) Math.ceil(this.G.measureText(r2));
                    invalidate();
                    if (this.f != null) {
                        Utilities.e.a(this.f);
                    }
                    if (z) {
                        km kmVar = this.b;
                        if (kmVar != null) {
                            AnimatedFileDrawableStream animatedFileDrawableStream = kmVar.v0;
                            if (animatedFileDrawableStream != null) {
                                animatedFileDrawableStream.b(true);
                            }
                            if (kmVar.e0 != null) {
                                kmVar.e0.e();
                            }
                        }
                        co3 co3Var = Utilities.e;
                        ?? r3 = new Runnable() { // from class: ccc
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i4;
                                ecc eccVar = ecc.this;
                                RectF rectF = eccVar.I;
                                if (eccVar.b == null) {
                                    eccVar.h = f;
                                    return;
                                }
                                int max = Math.max(kk7.d3, gl.L(100.0f));
                                Bitmap q = eccVar.b.q(j2, false);
                                if (q != null) {
                                    int width = q.getWidth();
                                    int height = q.getHeight();
                                    if (width > height) {
                                        i4 = (int) (height / (width / max));
                                    } else {
                                        int i5 = (int) (width / (height / max));
                                        i4 = max;
                                        max = i5;
                                    }
                                    try {
                                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                                        Bitmap a = dc1.a(max, i4);
                                        rectF.set(0.0f, 0.0f, max, i4);
                                        Canvas canvas = new Canvas(a);
                                        canvas.drawBitmap(q, (Rect) null, rectF, eccVar.J);
                                        canvas.setBitmap(null);
                                        q = a;
                                    } catch (Throwable unused) {
                                        q = null;
                                    }
                                }
                                gl.c3(new l3c(eccVar, q, (byte) 26));
                            }
                        };
                        this.f = r3;
                        co3Var.c(r3);
                        return;
                    }
                    return;
                }
                this.R.g0(null);
            }
            document = null;
            if (document == null) {
            }
        } else {
            this.R.g0(null);
        }
        z = false;
        this.Q = z;
        if (i != 0) {
        }
        final long j22 = (long) (this.c * f);
        this.E = gl.g0((int) (j22 / 1000), false, false);
        this.F = (int) Math.ceil(this.G.measureText(r2));
        invalidate();
        if (this.f != null) {
        }
        if (z) {
        }
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.R.K();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.w;
        if (bitmap != null) {
            bitmap.recycle();
            this.w = null;
        }
        boolean z = this.Q;
        TextPaint textPaint = this.G;
        Drawable drawable = this.y;
        if (!z) {
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
            canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), this.K);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.E, (getMeasuredWidth() - this.F) / 2.0f, getMeasuredHeight() - gl.L(9.0f), textPaint);
            return;
        }
        canvas.save();
        Path path = this.W;
        path.rewind();
        RectF rectF2 = gl.P;
        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        path.addRoundRect(rectF2, gl.L(6.0f), gl.L(6.0f), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.scale(getWidth() / this.U, getHeight() / this.V);
        canvas.translate(-this.S, -this.T);
        ImageReceiver imageReceiver = this.R;
        imageReceiver.i0(0.0f, 0.0f, imageReceiver.q(), imageReceiver.o());
        imageReceiver.h(canvas, null);
        canvas.restore();
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        canvas.drawText(this.E, (getMeasuredWidth() - this.F) / 2.0f, getMeasuredHeight() - gl.L(9.0f), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotY(getMeasuredHeight());
    }
}
