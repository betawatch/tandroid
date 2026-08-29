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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class d71 extends View implements NotificationCenter.NotificationCenterDelegate {
    public int A;
    public final TextPaint B;
    public BitmapShader C;
    public final RectF D;
    public final Paint E;
    public final Paint F;
    public final RectF G;
    public final Matrix H;
    public final org.telegram.ui.oq0 I;
    public org.telegram.ui.et0 J;
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
    public c6 b;
    public String b0;
    public long c;
    public int c0;
    public Uri d;
    public Runnable e;
    public b71 f;
    public float h;
    public int n;
    public int r;
    public boolean s;
    public Bitmap v;
    public Bitmap w;
    public final Drawable x;
    public String y;

    public d71(Context context, org.telegram.ui.oq0 oq0Var) {
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
        this.I = oq0Var;
        ImageReceiver imageReceiver = new ImageReceiver();
        this.M = imageReceiver;
        imageReceiver.setParentView(this);
        imageReceiver.setDelegate(new cv(this, 29));
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
        c6 c6Var = this.b;
        if (c6Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = c6Var.q0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (c6Var.Z != null) {
                c6Var.Z.h();
            }
        }
        Utilities.globalQueue.postRunnable(new a71(this, 0));
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

    /* JADX WARN: Removed duplicated region for block: B:61:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(x61 x61Var, MessageObject messageObject) {
        TLRPC.Document document;
        long j10;
        if (x61Var == null) {
            return;
        }
        if (x61Var.u() > 0) {
            v61 v61Var = null;
            for (int i10 = 0; i10 < x61Var.u(); i10++) {
                ArrayList arrayList = x61Var.v(i10).d;
                int size = arrayList.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = arrayList.get(i11);
                    i11++;
                    v61 v61Var2 = (v61) obj;
                    if (v61Var == null || ((!v61Var.b() && v61Var2.b()) || (v61Var.b() == v61Var2.b() && v61Var2.i * v61Var2.j < v61Var.i * v61Var.j))) {
                        v61Var = v61Var2;
                    }
                }
            }
            if (v61Var != null && !v61Var.b()) {
                int p10 = x61Var.p();
                t61 v = (p10 < 0 || p10 >= x61Var.u()) ? null : x61Var.v(p10);
                if (v != null) {
                    v61Var = v.a();
                }
            }
            if (v61Var != null && !v61Var.b()) {
                a();
                return;
            }
            if (v61Var != null) {
                v61Var.b();
            }
            if (v61Var != null && !v61Var.d.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = v61Var.d;
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                yw0 yw0Var = new yw0((org.telegram.ui.is0) this, v61Var, messageObject, 7);
                this.e = yw0Var;
                dispatchQueue.postRunnable(yw0Var);
            }
        } else {
            Uri uri = x61Var.B;
            if (uri != null) {
                "file".equalsIgnoreCase(uri.getScheme());
            }
            if (uri != null && !uri.equals(this.d)) {
                if (this.a) {
                    a();
                }
                this.d = uri;
                DispatchQueue dispatchQueue2 = Utilities.globalQueue;
                yw0 yw0Var2 = new yw0((org.telegram.ui.is0) this, uri, messageObject, 6);
                this.e = yw0Var2;
                dispatchQueue2.postRunnable(yw0Var2);
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
                    Collections.sort(arrayList, Comparator$-CC.comparingDouble(new jh.z0(3)));
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
                        arrayList.add(new c71(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Double.parseDouble(split[0])));
                    }
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
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
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Runnable, org.telegram.ui.Components.b71] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(MessageObject messageObject, final float f9, int i10) {
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
                    this.K = (this.c * f9) / 1000.0d;
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
            int i12 = ((int) (i10 * f9)) / 5;
            if (this.n == i12) {
                return;
            } else {
                this.n = i12;
            }
        }
        final long j11 = (long) (this.c * f9);
        this.y = AndroidUtilities.formatShortDuration((int) (j11 / 1000));
        this.A = (int) Math.ceil(this.B.measureText(r4));
        invalidate();
        if (this.f != null) {
            Utilities.globalQueue.cancelRunnable(this.f);
        }
        if (z10) {
            return;
        }
        c6 c6Var = this.b;
        if (c6Var != null) {
            AnimatedFileDrawableStream animatedFileDrawableStream = c6Var.q0;
            if (animatedFileDrawableStream != null) {
                animatedFileDrawableStream.cancel(true);
            }
            if (c6Var.Z != null) {
                c6Var.Z.e();
            }
        }
        DispatchQueue dispatchQueue = Utilities.globalQueue;
        ?? r52 = new Runnable() { // from class: org.telegram.ui.Components.b71
            @Override // java.lang.Runnable
            public final void run() {
                int i13;
                d71 d71Var = d71.this;
                RectF rectF = d71Var.D;
                if (d71Var.b == null) {
                    d71Var.h = f9;
                    return;
                }
                int max = Math.max(200, AndroidUtilities.dp(100.0f));
                Bitmap q6 = d71Var.b.q(j11, false);
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
                        canvas.drawBitmap(q6, (Rect) null, rectF, d71Var.E);
                        canvas.setBitmap(null);
                        q6 = createBitmap;
                    } catch (Throwable unused) {
                        q6 = null;
                    }
                }
                AndroidUtilities.runOnUIThread(new ii0(27, d71Var, q6));
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
