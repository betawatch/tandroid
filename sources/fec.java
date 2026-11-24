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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class fec extends View implements jm7 {
    public String E;
    public int F;
    public final TextPaint G;
    public BitmapShader H;
    public final RectF I;
    public final Paint J;
    public final Paint K;
    public final RectF L;
    public final Matrix M;
    public final u88 N;
    public ya8 O;
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
    public kn b;
    public long b0;
    public long c;
    public int c0;
    public Uri d;
    public int d0;
    public Runnable e;
    public ArrayList e0;
    public dec f;
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

    public fec(Context context, u88 u88Var) {
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
        textPaint.setTextSize(gm.L(13.0f));
        textPaint.setColor(-1);
        this.N = u88Var;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.R = imageReceiver;
        imageReceiver.p0(this);
        imageReceiver.h1 = new lcc(this, (byte) 2);
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
        kn knVar = this.b;
        if (knVar != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = knVar.v0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.b(true);
            }
            if (knVar.e0 != null) {
                knVar.e0.h();
            }
        }
        Utilities.e.c(new f8c(this, (byte) 11));
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
        int i3 = nm7.Z1;
        int i4 = nm7.Y1;
        if (i == -1) {
            nm7.f(i2).n(this, i4);
            nm7.f(this.h0).n(this, i3);
        } else {
            nm7.f(i).b(this, i4);
            nm7.f(i).b(this, i3);
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
    public final void c(k47 k47Var, ndc ndcVar) {
        TLRPC.Document document;
        long j;
        if (ndcVar == null) {
            return;
        }
        if (ndcVar.Y() > 0) {
            mdc mdcVar = null;
            for (int i = 0; i < ndcVar.Y(); i++) {
                ArrayList arrayList = ndcVar.Z(i).d;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    mdc mdcVar2 = (mdc) obj;
                    if (mdcVar == null || ((!mdcVar.b() && mdcVar2.b()) || (mdcVar.b() == mdcVar2.b() && mdcVar2.i * mdcVar2.j < mdcVar.i * mdcVar.j))) {
                        mdcVar = mdcVar2;
                    }
                }
            }
            if (mdcVar != null && !mdcVar.b()) {
                int T = ndcVar.T();
                kdc Z = (T < 0 || T >= ndcVar.Y()) ? null : ndcVar.Z(T);
                if (Z != null) {
                    mdcVar = Z.a();
                }
            }
            if (mdcVar != null) {
                if (!mdcVar.b()) {
                    a();
                    return;
                }
                mdcVar.b();
                if (!mdcVar.d.equals(this.d)) {
                    if (this.a) {
                        a();
                    }
                    this.d = mdcVar.d;
                    mp3 mp3Var = Utilities.e;
                    gcc gccVar = new gcc((ka8) this, mdcVar, k47Var, (byte) 5);
                    this.e = gccVar;
                    mp3Var.c(gccVar);
                }
            }
        } else {
            Uri uri = ndcVar.G;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
                if (!uri.equals(this.d)) {
                    if (this.a) {
                        a();
                    }
                    this.d = uri;
                    mp3 mp3Var2 = Utilities.e;
                    gcc gccVar2 = new gcc((ka8) this, uri, k47Var, (byte) 4);
                    this.e = gccVar2;
                    mp3Var2.c(gccVar2);
                }
            }
        }
        TLRPC.MessageMedia m1 = k47.m1(k47Var);
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
                bc4.G(k47Var.K1);
                File I = bc4.I(document);
                if (I == null || !I.exists()) {
                    this.g0 = bc4.r(null, document);
                    this.f0 = document;
                    b(k47Var.K1);
                    bc4.G(k47Var.K1).X(document, k47Var, 2, 0);
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
                    Collections.sort(arrayList, Comparator$-CC.comparingDouble(new po7((byte) 6)));
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
                        arrayList.add(new eec(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
            this.e0 = null;
        }
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i != nm7.Y1) {
            if (i == nm7.Z1 && ((String) objArr[0]).equals(this.g0)) {
                this.g0 = null;
                this.f0 = null;
                b(-1);
                return;
            }
            return;
        }
        if (((String) objArr[0]).equals(this.g0)) {
            bc4.G(i2);
            File I = bc4.I(this.f0);
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
    /* JADX WARN: Type inference failed for: r3v3, types: [dec, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(k47 k47Var, final float f, int i) {
        boolean z;
        TLRPC.Document document;
        this.O = null;
        if (this.e0 != null) {
            long j = this.b0;
            TLRPC.MessageMedia m1 = k47.m1(k47Var);
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
                    this.R.d0(gn5.b(document), null, null, null, k47Var, 0);
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
                    this.E = gm.g0((int) (j2 / 1000), false, false);
                    this.F = (int) Math.ceil(this.G.measureText(r2));
                    invalidate();
                    if (this.f != null) {
                        Utilities.e.a(this.f);
                    }
                    if (z) {
                        kn knVar = this.b;
                        if (knVar != null) {
                            AnimatedFileDrawableStream animatedFileDrawableStream = knVar.v0;
                            if (animatedFileDrawableStream != null) {
                                animatedFileDrawableStream.b(true);
                            }
                            if (knVar.e0 != null) {
                                knVar.e0.e();
                            }
                        }
                        mp3 mp3Var = Utilities.e;
                        ?? r3 = new Runnable() { // from class: dec
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i4;
                                fec fecVar = fec.this;
                                RectF rectF = fecVar.I;
                                if (fecVar.b == null) {
                                    fecVar.h = f;
                                    return;
                                }
                                int max = Math.max(nm7.d3, gm.L(100.0f));
                                Bitmap q = fecVar.b.q(j2, false);
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
                                        Bitmap a = ld1.a(max, i4);
                                        rectF.set(0.0f, 0.0f, max, i4);
                                        Canvas canvas = new Canvas(a);
                                        canvas.drawBitmap(q, (Rect) null, rectF, fecVar.J);
                                        canvas.setBitmap(null);
                                        q = a;
                                    } catch (Throwable unused) {
                                        q = null;
                                    }
                                }
                                gm.c3(new x4c(fecVar, q, (byte) 28));
                            }
                        };
                        this.f = r3;
                        mp3Var.c(r3);
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
        this.E = gm.g0((int) (j22 / 1000), false, false);
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
            canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), this.K);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.E, (getMeasuredWidth() - this.F) / 2.0f, getMeasuredHeight() - gm.L(9.0f), textPaint);
            return;
        }
        canvas.save();
        Path path = this.W;
        path.rewind();
        RectF rectF2 = gm.P;
        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        path.addRoundRect(rectF2, gm.L(6.0f), gm.L(6.0f), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.scale(getWidth() / this.U, getHeight() / this.V);
        canvas.translate(-this.S, -this.T);
        ImageReceiver imageReceiver = this.R;
        imageReceiver.i0(0.0f, 0.0f, imageReceiver.q(), imageReceiver.o());
        imageReceiver.h(canvas, null);
        canvas.restore();
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        canvas.drawText(this.E, (getMeasuredWidth() - this.F) / 2.0f, getMeasuredHeight() - gm.L(9.0f), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setPivotY(getMeasuredHeight());
    }
}
