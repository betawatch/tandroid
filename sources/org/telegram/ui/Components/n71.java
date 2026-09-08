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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public abstract class n71 extends View implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final TextPaint F;
    public BitmapShader G;
    public final RectF H;
    public final Paint I;
    public final Paint J;
    public final RectF K;
    public final Matrix L;
    public final org.telegram.ui.qr0 M;
    public org.telegram.ui.hu0 N;
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
    public d6 b;
    public int b0;
    public long c;
    public int c0;
    public Uri d;
    public ArrayList d0;
    public Runnable e;
    public TLRPC.Document e0;
    public l71 f;
    public String f0;
    public int g0;
    public float h;
    public int n;
    public int r;
    public boolean s;
    public Bitmap v;
    public Bitmap w;
    public final Drawable x;
    public String y;

    public n71(Context context, org.telegram.ui.qr0 qr0Var) {
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
        this.x = context.getResources().getDrawable(R.drawable.videopreview);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        this.M = qr0Var;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.Q = imageReceiver;
        imageReceiver.setParentView(this);
        imageReceiver.setDelegate(new kv(this, 29));
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
        d6 d6Var = this.b;
        if (d6Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = d6Var.u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (d6Var.d0 != null) {
                d6Var.d0.h();
            }
        }
        Utilities.globalQueue.postRunnable(new j71(this, 0));
        setVisibility(4);
        this.w = null;
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
        if (i10 == -1) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.g0).removeObserver(this, NotificationCenter.fileLoadFailed);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
        this.g0 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(g71 g71Var, MessageObject messageObject) {
        TLRPC.Document document;
        long j3;
        if (g71Var == null) {
            return;
        }
        if (g71Var.t() > 0) {
            e71 e71Var = null;
            for (int i10 = 0; i10 < g71Var.t(); i10++) {
                ArrayList arrayList = g71Var.u(i10).d;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    e71 e71Var2 = (e71) obj;
                    if (e71Var == null || ((!e71Var.b() && e71Var2.b()) || (e71Var.b() == e71Var2.b() && e71Var2.i * e71Var2.j < e71Var.i * e71Var.j))) {
                        e71Var = e71Var2;
                    }
                }
            }
            if (e71Var != null && !e71Var.b()) {
                int o9 = g71Var.o();
                c71 u10 = (o9 < 0 || o9 >= g71Var.t()) ? null : g71Var.u(o9);
                if (u10 != null) {
                    e71Var = u10.a();
                }
            }
            if (e71Var != null && !e71Var.b()) {
                a();
                return;
            }
            if (e71Var != null) {
                e71Var.b();
            }
            if (e71Var != null && !e71Var.d.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = e71Var.d;
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                er0 er0Var = new er0((org.telegram.ui.lt0) this, e71Var, messageObject, 13);
                this.e = er0Var;
                dispatchQueue.postRunnable(er0Var);
            }
        } else {
            Uri uri = g71Var.F;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
            }
            if (uri != null && !uri.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = uri;
                DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                er0 er0Var2 = new er0((org.telegram.ui.lt0) this, uri, messageObject, 12);
                this.e = er0Var2;
                dispatchQueue2.postRunnable(er0Var2);
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
                File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document);
                if (pathToAttach == null || !pathToAttach.exists()) {
                    this.f0 = FileLoader.getAttachFileName(document);
                    this.e0 = document;
                    b(messageObject.currentAccount);
                    FileLoader.getInstance(messageObject.currentAccount).loadFile(document, messageObject, 2, 0);
                    return;
                }
                this.f0 = null;
                this.e0 = null;
                b(-1);
                d(pathToAttach);
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
            int i10 = 0;
            int i11 = 0;
            while (true) {
                String readLine = randomAccessFile.readLine();
                if (readLine == null) {
                    Collections.sort(arrayList, Comparator$-CC.comparingDouble(new k71(0)));
                    this.a0 = j3;
                    this.b0 = i10;
                    this.c0 = i11;
                    this.d0 = arrayList;
                    return;
                }
                if (readLine.startsWith("file=mtproto:")) {
                    j3 = Long.parseLong(readLine.substring(13));
                } else if (readLine.startsWith("frame_width=")) {
                    i10 = Integer.parseInt(readLine.substring(12));
                } else if (readLine.startsWith("frame_height=")) {
                    i11 = Integer.parseInt(readLine.substring(13));
                } else {
                    String[] split = readLine.split(",");
                    if (split.length == 3) {
                        arrayList.add(new m71(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                    }
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
            this.d0 = null;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.fileLoaded) {
            if (i10 == NotificationCenter.fileLoadFailed && ((String) objArr[0]).equals(this.f0)) {
                this.f0 = null;
                this.e0 = null;
                b(-1);
                return;
            }
            return;
        }
        if (((String) objArr[0]).equals(this.f0)) {
            File pathToAttach = FileLoader.getInstance(i11).getPathToAttach(this.e0);
            if (pathToAttach != null && pathToAttach.exists()) {
                d(pathToAttach);
            }
            this.f0 = null;
            this.e0 = null;
            b(-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Runnable, org.telegram.ui.Components.l71] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MessageObject messageObject, final float f7, int i10) {
        TLRPC.Document document;
        this.N = null;
        boolean z10 = false;
        if (this.d0 != null) {
            long j3 = this.a0;
            TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
            if (media != null) {
                document = media.document;
                if (document == null || document.id != j3) {
                    ArrayList<TLRPC.Document> arrayList = media.alt_documents;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        TLRPC.Document document2 = arrayList.get(i11);
                        i11++;
                        TLRPC.Document document3 = document2;
                        if (document3.id == j3) {
                            document = document3;
                            break;
                        }
                    }
                }
                if (document == null) {
                    this.O = (this.c * f7) / 1000.0d;
                    this.Q.setImage(ImageLocation.getForDocument(document), null, null, null, messageObject, 0);
                    z10 = true;
                } else {
                    this.Q.setImageBitmap((Drawable) null);
                }
            }
            document = null;
            if (document == null) {
            }
        } else {
            this.Q.setImageBitmap((Drawable) null);
        }
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
        final long j10 = (long) (this.c * f7);
        this.y = AndroidUtilities.formatShortDuration((int) (j10 / 1000));
        this.E = (int) Math.ceil(this.F.measureText(r4));
        invalidate();
        if (this.f != null) {
            Utilities.globalQueue.cancelRunnable(this.f);
        }
        if (z10) {
            return;
        }
        d6 d6Var = this.b;
        if (d6Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = d6Var.u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (d6Var.d0 != null) {
                d6Var.d0.e();
            }
        }
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.l71
            @Override // java.lang.Runnable
            public final void run() {
                int i13;
                n71 n71Var = n71.this;
                RectF rectF = n71Var.H;
                if (n71Var.b == null) {
                    n71Var.h = f7;
                    return;
                }
                int max = Math.max(200, AndroidUtilities.dp(100.0f));
                Bitmap q6 = n71Var.b.q(j10, false);
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
                        canvas.drawBitmap(q6, (Rect) null, rectF, n71Var.I);
                        canvas.setBitmap(null);
                        q6 = createBitmap;
                    } catch (Throwable unused) {
                        q6 = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new jn0(24, n71Var, q6));
            }
        };
        this.f = r52;
        dispatchQueue.postRunnable(r52);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.Q.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.v;
        if (bitmap != null) {
            bitmap.recycle();
            this.v = null;
        }
        boolean z10 = this.P;
        TextPaint textPaint = this.F;
        Drawable drawable = this.x;
        if (!z10) {
            if (this.w == null || this.G == null) {
                return;
            }
            Matrix matrix = this.L;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.w.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            float measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            RectF rectF = this.K;
            rectF.set(0.0f, 0.0f, measuredWidth2, measuredHeight);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.J);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.y, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
            return;
        }
        canvas.save();
        Path path = this.V;
        path.rewind();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        path.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.scale(getWidth() / this.T, getHeight() / this.U);
        canvas.translate(-this.R, -this.S);
        ImageReceiver imageReceiver = this.Q;
        imageReceiver.setImageCoords(0.0f, 0.0f, imageReceiver.getBitmapWidth(), imageReceiver.getBitmapHeight());
        imageReceiver.draw(canvas);
        canvas.restore();
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        canvas.drawText(this.y, (getMeasuredWidth() - this.E) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotY(getMeasuredHeight());
    }
}
