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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class t61 extends View implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public final TextPaint B;
    public BitmapShader C;
    public final RectF D;
    public final Paint E;
    public final Paint F;
    public final RectF G;
    public final Matrix H;
    public final org.telegram.ui.pq0 I;
    public org.telegram.ui.ht0 J;
    public double K;
    public boolean L;
    public final ImageReceiver M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public final Path R;
    public long S;
    public long T;
    public int U;
    public int V;
    public ArrayList W;
    public boolean a;
    public TLRPC.Document a0;
    public x5 b;
    public String b0;
    public long c;
    public int c0;
    public Uri d;
    public Runnable e;
    public q61 f;
    public float h;
    public int n;
    public int r;
    public boolean s;
    public Bitmap v;
    public Bitmap w;
    public final Drawable x;
    public String y;

    public t61(Context context, org.telegram.ui.pq0 pq0Var) {
        super(context);
        this.n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.B = textPaint;
        this.D = new RectF();
        this.E = new Paint(2);
        this.F = new Paint(2);
        this.G = new RectF();
        this.H = new Matrix();
        this.R = new Path();
        this.c0 = -1;
        setVisibility(4);
        this.x = context.getResources().getDrawable(R.drawable.videopreview);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        this.I = pq0Var;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.M = imageReceiver;
        imageReceiver.setParentView(this);
        imageReceiver.setDelegate(new vu(this, 29));
    }

    public final void a() {
        if (this.e != null) {
            Utilities.globalQueue.cancelRunnable(this.e);
            this.e = null;
        }
        if (this.f != null) {
            Utilities.globalQueue.cancelRunnable(this.f);
            this.f = null;
        }
        x5 x5Var = this.b;
        if (x5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = x5Var.q0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (x5Var.Z != null) {
                x5Var.Z.h();
            }
        }
        Utilities.globalQueue.postRunnable(new p61(this, 0));
        setVisibility(4);
        this.w = null;
        this.C = null;
        invalidate();
        this.n = -1;
        this.d = null;
        this.s = false;
        this.a = false;
        if (this.S != 0) {
            this.S = 0L;
            this.b0 = null;
            this.a0 = null;
            this.W = null;
            b(-1);
        }
    }

    public final void b(int i10) {
        int i11 = this.c0;
        if (i11 == i10) {
            return;
        }
        if (i10 == -1) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.c0).removeObserver(this, NotificationCenter.fileLoadFailed);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
        this.c0 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(m61 m61Var, MessageObject messageObject) {
        TLRPC.Document document;
        long j10;
        if (m61Var == null) {
            return;
        }
        if (m61Var.u() > 0) {
            k61 k61Var = null;
            for (int i10 = 0; i10 < m61Var.u(); i10++) {
                ArrayList arrayList = m61Var.v(i10).d;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    k61 k61Var2 = (k61) obj;
                    if (k61Var == null || ((!k61Var.b() && k61Var2.b()) || (k61Var.b() == k61Var2.b() && k61Var2.i * k61Var2.j < k61Var.i * k61Var.j))) {
                        k61Var = k61Var2;
                    }
                }
            }
            if (k61Var != null && !k61Var.b()) {
                int p6 = m61Var.p();
                i61 v = (p6 < 0 || p6 >= m61Var.u()) ? null : m61Var.v(p6);
                if (v != null) {
                    k61Var = v.a();
                }
            }
            if (k61Var != null && !k61Var.b()) {
                a();
                return;
            }
            if (k61Var != null) {
                k61Var.b();
            }
            if (k61Var != null && !k61Var.d.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = k61Var.d;
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                gs0 gs0Var = new gs0((org.telegram.ui.ks0) this, k61Var, messageObject, 12);
                this.e = gs0Var;
                dispatchQueue.postRunnable(gs0Var);
            }
        } else {
            Uri uri = m61Var.B;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
            }
            if (uri != null && !uri.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = uri;
                DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                gs0 gs0Var2 = new gs0((org.telegram.ui.ks0) this, uri, messageObject, 11);
                this.e = gs0Var2;
                dispatchQueue2.postRunnable(gs0Var2);
            }
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (media != null) {
            TLRPC.Document document2 = media.document;
            if (document2 == null || !"application/x-tgstoryboardmap".equalsIgnoreCase(document2.mime_type)) {
                ArrayList<TLRPC.Document> arrayList2 = media.alt_documents;
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
                document = media.document;
            }
            j10 = document != null ? 0L : document.id;
            if (this.S == j10) {
                this.S = j10;
                this.W = null;
                if (document == null) {
                    this.b0 = null;
                    this.a0 = null;
                    b(-1);
                    this.W = null;
                    return;
                }
                File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document);
                if (pathToAttach == null || !pathToAttach.exists()) {
                    this.b0 = FileLoader.getAttachFileName(document);
                    this.a0 = document;
                    b(messageObject.currentAccount);
                    FileLoader.getInstance(messageObject.currentAccount).loadFile(document, messageObject, 2, 0);
                    return;
                }
                this.b0 = null;
                this.a0 = null;
                b(-1);
                d(pathToAttach);
                return;
            }
            return;
        }
        document = null;
        if (document != null) {
        }
        if (this.S == j10) {
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
                    Collections.sort(arrayList, Comparator$-CC.comparingDouble(new hh.a1(3)));
                    this.T = j10;
                    this.U = i10;
                    this.V = i11;
                    this.W = arrayList;
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
                        arrayList.add(new s61(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                    }
                }
            }
        } catch (Exception e9) {
            FileLog.e(e9);
            this.W = null;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.fileLoaded) {
            if (i10 == NotificationCenter.fileLoadFailed && ((String) objArr[0]).equals(this.b0)) {
                this.b0 = null;
                this.a0 = null;
                b(-1);
                return;
            }
            return;
        }
        if (((String) objArr[0]).equals(this.b0)) {
            File pathToAttach = FileLoader.getInstance(i11).getPathToAttach(this.a0);
            if (pathToAttach != null && pathToAttach.exists()) {
                d(pathToAttach);
            }
            this.b0 = null;
            this.a0 = null;
            b(-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Runnable, org.telegram.ui.Components.q61] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MessageObject messageObject, final float f10, int i10) {
        TLRPC.Document document;
        this.J = null;
        boolean z10 = false;
        if (this.W != null) {
            long j10 = this.T;
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (media != null) {
                document = media.document;
                if (document == null || document.id != j10) {
                    ArrayList<TLRPC.Document> arrayList = media.alt_documents;
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
                    this.K = (this.c * f10) / 1000.0d;
                    this.M.setImage(ImageLocation.getForDocument(document), null, null, null, messageObject, 0);
                    z10 = true;
                } else {
                    this.M.setImageBitmap((Drawable) null);
                }
            }
            document = null;
            if (document == null) {
            }
        } else {
            this.M.setImageBitmap((Drawable) null);
        }
        this.L = z10;
        if (i10 != 0) {
            this.r = i10;
            int i12 = ((int) (i10 * f10)) / 5;
            if (this.n == i12) {
                return;
            } else {
                this.n = i12;
            }
        }
        final long j11 = (long) (this.c * f10);
        this.y = AndroidUtilities.formatShortDuration((int) (j11 / 1000));
        this.A = (int) Math.ceil(this.B.measureText(r4));
        invalidate();
        if (this.f != null) {
            Utilities.globalQueue.cancelRunnable(this.f);
        }
        if (z10) {
            return;
        }
        x5 x5Var = this.b;
        if (x5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = x5Var.q0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (x5Var.Z != null) {
                x5Var.Z.e();
            }
        }
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.q61
            @Override // java.lang.Runnable
            public final void run() {
                int i13;
                t61 t61Var = t61.this;
                RectF rectF = t61Var.D;
                if (t61Var.b == null) {
                    t61Var.h = f10;
                    return;
                }
                int max = Math.max(200, AndroidUtilities.dp(100.0f));
                Bitmap q6 = t61Var.b.q(j11, false);
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
                        Bitmap createBitmap = Bitmaps.createBitmap(max, i13, Bitmap.Config.ARGB_8888);
                        rectF.set(0.0f, 0.0f, max, i13);
                        Canvas canvas = new Canvas(createBitmap);
                        canvas.drawBitmap(q6, (Rect) null, rectF, t61Var.E);
                        canvas.setBitmap(null);
                        q6 = createBitmap;
                    } catch (Throwable unused) {
                        q6 = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new r61(0, t61Var, q6));
            }
        };
        this.f = r52;
        dispatchQueue.postRunnable(r52);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.M.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.M.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.v;
        if (bitmap != null) {
            bitmap.recycle();
            this.v = null;
        }
        boolean z10 = this.L;
        TextPaint textPaint = this.B;
        Drawable drawable = this.x;
        if (!z10) {
            if (this.w == null || this.C == null) {
                return;
            }
            Matrix matrix = this.H;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.w.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            float measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            RectF rectF = this.G;
            rectF.set(0.0f, 0.0f, measuredWidth2, measuredHeight);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.F);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.y, (getMeasuredWidth() - this.A) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
            return;
        }
        canvas.save();
        Path path = this.R;
        path.rewind();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        path.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.scale(getWidth() / this.P, getHeight() / this.Q);
        canvas.translate(-this.N, -this.O);
        ImageReceiver imageReceiver = this.M;
        imageReceiver.setImageCoords(0.0f, 0.0f, imageReceiver.getBitmapWidth(), imageReceiver.getBitmapHeight());
        imageReceiver.draw(canvas);
        canvas.restore();
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        canvas.drawText(this.y, (getMeasuredWidth() - this.A) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotY(getMeasuredHeight());
    }
}
