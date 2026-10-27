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
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class a91 extends View implements NotificationCenter.NotificationCenterDelegate {
    public int E;
    public final TextPaint F;
    public BitmapShader G;
    public final RectF H;
    public final Paint I;
    public final Paint J;
    public final RectF K;
    public final Matrix L;
    public final org.telegram.ui.hr0 M;
    public org.telegram.ui.xt0 N;
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
    public g6 b;
    public int b0;
    public long c;
    public int c0;
    public Uri d;
    public ArrayList d0;
    public Runnable e;
    public TLRPC.Document e0;
    public y81 f;
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

    public a91(Context context, org.telegram.ui.hr0 hr0Var) {
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
        this.M = hr0Var;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.Q = imageReceiver;
        imageReceiver.setParentView(this);
        imageReceiver.setDelegate(new x81(this));
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
        g6 g6Var = this.b;
        if (g6Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = g6Var.u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (g6Var.d0 != null) {
                g6Var.d0.h();
            }
        }
        Utilities.globalQueue.postRunnable(new w81(this, 0));
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
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.fileLoaded);
            NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.fileLoadFailed);
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
    public final void c(t81 t81Var, MessageObject messageObject) {
        TLRPC.Document document;
        long j10;
        if (t81Var == null) {
            return;
        }
        if (t81Var.t() > 0) {
            r81 r81Var = null;
            for (int i10 = 0; i10 < t81Var.t(); i10++) {
                ArrayList arrayList = t81Var.u(i10).d;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    r81 r81Var2 = (r81) obj;
                    if (r81Var == null || ((!r81Var.b() && r81Var2.b()) || (r81Var.b() == r81Var2.b() && r81Var2.i * r81Var2.j < r81Var.i * r81Var.j))) {
                        r81Var = r81Var2;
                    }
                }
            }
            if (r81Var != null && !r81Var.b()) {
                int o10 = t81Var.o();
                p81 u10 = (o10 < 0 || o10 >= t81Var.t()) ? null : t81Var.u(o10);
                if (u10 != null) {
                    r81Var = u10.a();
                }
            }
            if (r81Var != null && !r81Var.b()) {
                a();
                return;
            }
            if (r81Var != null) {
                r81Var.b();
            }
            if (r81Var != null && !r81Var.d.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = r81Var.d;
                DispatchQueue2 dispatchQueue2 = Utilities.globalQueue;
                oy0 oy0Var = new oy0((org.telegram.ui.bt0) this, r81Var, messageObject, 4);
                this.e = oy0Var;
                dispatchQueue2.postRunnable(oy0Var);
            }
        } else {
            Uri uri = t81Var.F;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
            }
            if (uri != null && !uri.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = uri;
                DispatchQueue2 dispatchQueue22 = Utilities.globalQueue;
                oy0 oy0Var2 = new oy0((org.telegram.ui.bt0) this, uri, messageObject, 3);
                this.e = oy0Var2;
                dispatchQueue22.postRunnable(oy0Var2);
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
                    Collections.sort(arrayList, Comparator$-CC.comparingDouble(new bi.m1(3)));
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
                        arrayList.add(new z81(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
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
    /* JADX WARN: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Runnable, org.telegram.ui.Components.y81] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MessageObject messageObject, final float f7, int i10) {
        TLRPC.Document document;
        this.N = null;
        boolean z10 = false;
        if (this.d0 != null) {
            long j10 = this.a0;
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
        final long j11 = (long) (this.c * f7);
        this.y = AndroidUtilities.formatShortDuration((int) (j11 / 1000));
        this.E = (int) Math.ceil(this.F.measureText(r4));
        invalidate();
        if (this.f != null) {
            Utilities.globalQueue.cancelRunnable(this.f);
        }
        if (z10) {
            return;
        }
        g6 g6Var = this.b;
        if (g6Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = g6Var.u0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (g6Var.d0 != null) {
                g6Var.d0.e();
            }
        }
        DispatchQueue2 dispatchQueue2 = Utilities.globalQueue;
        ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.y81
            @Override // java.lang.Runnable
            public final void run() {
                int i13;
                a91 a91Var = a91.this;
                RectF rectF = a91Var.H;
                if (a91Var.b == null) {
                    a91Var.h = f7;
                    return;
                }
                int max = Math.max(200, AndroidUtilities.dp(100.0f));
                Bitmap q5 = a91Var.b.q(j11, false);
                if (q5 != null) {
                    int width = q5.getWidth();
                    int height = q5.getHeight();
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
                        canvas.drawBitmap(q5, (Rect) null, rectF, a91Var.I);
                        canvas.setBitmap(null);
                        q5 = createBitmap;
                    } catch (Throwable unused) {
                        q5 = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new d71(4, a91Var, q5));
            }
        };
        this.f = r52;
        dispatchQueue2.postRunnable(r52);
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
