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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public abstract class r71 extends View implements NotificationCenter.NotificationCenterDelegate {
    public int B;
    public final TextPaint C;
    public BitmapShader D;
    public final RectF E;
    public final Paint F;
    public final Paint G;
    public final RectF H;
    public final Matrix I;
    public final org.telegram.ui.wq0 J;
    public org.telegram.ui.pt0 K;
    public double L;
    public boolean M;
    public final ImageReceiver N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public final Path S;
    public long T;
    public long U;
    public int V;
    public int W;
    public boolean a;
    public ArrayList a0;
    public y5 b;
    public TLRPC.Document b0;
    public long c;
    public String c0;
    public Uri d;
    public int d0;
    public Runnable e;
    public p71 f;
    public float h;
    public int n;
    public int r;
    public boolean s;
    public Bitmap v;
    public Bitmap w;
    public final Drawable x;
    public String y;

    public r71(Context context, org.telegram.ui.wq0 wq0Var) {
        super(context);
        this.n = -1;
        TextPaint textPaint = new TextPaint(1);
        this.C = textPaint;
        this.E = new RectF();
        this.F = new Paint(2);
        this.G = new Paint(2);
        this.H = new RectF();
        this.I = new Matrix();
        this.S = new Path();
        this.d0 = -1;
        setVisibility(4);
        this.x = context.getResources().getDrawable(R.drawable.videopreview);
        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
        textPaint.setColor(-1);
        this.J = wq0Var;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.N = imageReceiver;
        imageReceiver.setParentView(this);
        imageReceiver.setDelegate(new hv(this, 29));
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
        y5 y5Var = this.b;
        if (y5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = y5Var.r0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (y5Var.a0 != null) {
                y5Var.a0.h();
            }
        }
        Utilities.globalQueue.postRunnable(new n71(this, 0));
        setVisibility(4);
        this.w = null;
        this.D = null;
        invalidate();
        this.n = -1;
        this.d = null;
        this.s = false;
        this.a = false;
        if (this.T != 0) {
            this.T = 0L;
            this.c0 = null;
            this.b0 = null;
            this.a0 = null;
            b(-1);
        }
    }

    public final void b(int i10) {
        int i11 = this.d0;
        if (i11 == i10) {
            return;
        }
        if (i10 == -1) {
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(this.d0).removeObserver(this, NotificationCenter.fileLoadFailed);
        } else {
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.fileLoadFailed);
        }
        this.d0 = i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(k71 k71Var, MessageObject messageObject) {
        TLRPC.Document document;
        long j10;
        if (k71Var == null) {
            return;
        }
        if (k71Var.t() > 0) {
            i71 i71Var = null;
            for (int i10 = 0; i10 < k71Var.t(); i10++) {
                ArrayList arrayList = k71Var.u(i10).d;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    i71 i71Var2 = (i71) obj;
                    if (i71Var == null || ((!i71Var.b() && i71Var2.b()) || (i71Var.b() == i71Var2.b() && i71Var2.i * i71Var2.j < i71Var.i * i71Var.j))) {
                        i71Var = i71Var2;
                    }
                }
            }
            if (i71Var != null && !i71Var.b()) {
                int o10 = k71Var.o();
                g71 u10 = (o10 < 0 || o10 >= k71Var.t()) ? null : k71Var.u(o10);
                if (u10 != null) {
                    i71Var = u10.a();
                }
            }
            if (i71Var != null && !i71Var.b()) {
                a();
                return;
            }
            if (i71Var != null) {
                i71Var.b();
            }
            if (i71Var != null && !i71Var.d.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = i71Var.d;
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                o71 o71Var = new o71((org.telegram.ui.ts0) this, i71Var, messageObject, 0);
                this.e = o71Var;
                dispatchQueue.postRunnable(o71Var);
            }
        } else {
            Uri uri = k71Var.C;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
            }
            if (uri != null && !uri.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = uri;
                DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                jp jpVar = new jp((org.telegram.ui.ts0) this, uri, messageObject, 29);
                this.e = jpVar;
                dispatchQueue2.postRunnable(jpVar);
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
            if (this.T == j10) {
                this.T = j10;
                this.a0 = null;
                if (document == null) {
                    this.c0 = null;
                    this.b0 = null;
                    b(-1);
                    this.a0 = null;
                    return;
                }
                File pathToAttach = FileLoader.getInstance(messageObject.currentAccount).getPathToAttach(document);
                if (pathToAttach == null || !pathToAttach.exists()) {
                    this.c0 = FileLoader.getAttachFileName(document);
                    this.b0 = document;
                    b(messageObject.currentAccount);
                    FileLoader.getInstance(messageObject.currentAccount).loadFile(document, messageObject, 2, 0);
                    return;
                }
                this.c0 = null;
                this.b0 = null;
                b(-1);
                d(pathToAttach);
                return;
            }
            return;
        }
        document = null;
        if (document != null) {
        }
        if (this.T == j10) {
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
                    Collections.sort(arrayList, Comparator$-CC.comparingDouble(new mh.y0(3)));
                    this.U = j10;
                    this.V = i10;
                    this.W = i11;
                    this.a0 = arrayList;
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
                        arrayList.add(new q71(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                    }
                }
            }
        } catch (Exception e6) {
            FileLog.e(e6);
            this.a0 = null;
        }
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.fileLoaded) {
            if (i10 == NotificationCenter.fileLoadFailed && ((String) objArr[0]).equals(this.c0)) {
                this.c0 = null;
                this.b0 = null;
                b(-1);
                return;
            }
            return;
        }
        if (((String) objArr[0]).equals(this.c0)) {
            File pathToAttach = FileLoader.getInstance(i11).getPathToAttach(this.b0);
            if (pathToAttach != null && pathToAttach.exists()) {
                d(pathToAttach);
            }
            this.c0 = null;
            this.b0 = null;
            b(-1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Runnable, org.telegram.ui.Components.p71] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MessageObject messageObject, final float f10, int i10) {
        TLRPC.Document document;
        this.K = null;
        boolean z4 = false;
        if (this.a0 != null) {
            long j10 = this.U;
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
                    this.L = (this.c * f10) / 1000.0d;
                    this.N.setImage(ImageLocation.getForDocument(document), null, null, null, messageObject, 0);
                    z4 = true;
                } else {
                    this.N.setImageBitmap((Drawable) null);
                }
            }
            document = null;
            if (document == null) {
            }
        } else {
            this.N.setImageBitmap((Drawable) null);
        }
        this.M = z4;
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
        this.B = (int) Math.ceil(this.C.measureText(r4));
        invalidate();
        if (this.f != null) {
            Utilities.globalQueue.cancelRunnable(this.f);
        }
        if (z4) {
            return;
        }
        y5 y5Var = this.b;
        if (y5Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = y5Var.r0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (y5Var.a0 != null) {
                y5Var.a0.e();
            }
        }
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.p71
            @Override // java.lang.Runnable
            public final void run() {
                int i13;
                r71 r71Var = r71.this;
                RectF rectF = r71Var.E;
                if (r71Var.b == null) {
                    r71Var.h = f10;
                    return;
                }
                int max = Math.max(200, AndroidUtilities.dp(100.0f));
                Bitmap q10 = r71Var.b.q(j11, false);
                if (q10 != null) {
                    int width = q10.getWidth();
                    int height = q10.getHeight();
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
                        canvas.drawBitmap(q10, (Rect) null, rectF, r71Var.F);
                        canvas.setBitmap(null);
                        q10 = createBitmap;
                    } catch (Throwable unused) {
                        q10 = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new l41(5, r71Var, q10));
            }
        };
        this.f = r52;
        dispatchQueue.postRunnable(r52);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.N.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.N.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Bitmap bitmap = this.v;
        if (bitmap != null) {
            bitmap.recycle();
            this.v = null;
        }
        boolean z4 = this.M;
        TextPaint textPaint = this.C;
        Drawable drawable = this.x;
        if (!z4) {
            if (this.w == null || this.D == null) {
                return;
            }
            Matrix matrix = this.I;
            matrix.reset();
            float measuredWidth = getMeasuredWidth() / this.w.getWidth();
            matrix.preScale(measuredWidth, measuredWidth);
            float measuredWidth2 = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            RectF rectF = this.H;
            rectF.set(0.0f, 0.0f, measuredWidth2, measuredHeight);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.G);
            drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            drawable.draw(canvas);
            canvas.drawText(this.y, (getMeasuredWidth() - this.B) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
            return;
        }
        canvas.save();
        Path path = this.S;
        path.rewind();
        RectF rectF2 = AndroidUtilities.rectTmp;
        rectF2.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        path.addRoundRect(rectF2, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), Path.Direction.CW);
        canvas.clipPath(path);
        canvas.scale(getWidth() / this.Q, getHeight() / this.R);
        canvas.translate(-this.O, -this.P);
        ImageReceiver imageReceiver = this.N;
        imageReceiver.setImageCoords(0.0f, 0.0f, imageReceiver.getBitmapWidth(), imageReceiver.getBitmapHeight());
        imageReceiver.draw(canvas);
        canvas.restore();
        drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        drawable.draw(canvas);
        canvas.drawText(this.y, (getMeasuredWidth() - this.B) / 2.0f, getMeasuredHeight() - AndroidUtilities.dp(9.0f), textPaint);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        setPivotY(getMeasuredHeight());
    }
}
