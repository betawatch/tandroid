package org.telegram.ui.Components;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class sc0 extends ik0 implements DownloadController.FileDownloadProgressListener {
    public static final Paint D;
    public static final Paint E;
    public static final TextPaint F;
    public static final TextPaint G;
    public static final TextPaint H;
    public static final TextPaint I;
    public static final TextPaint J;
    public static final TextPaint K;
    public static final DecelerateInterpolator L;
    public String A;
    public String B;
    public String C;
    public long a;
    public float b;
    public float c;
    public long d;
    public float e;
    public float f;
    public boolean h;
    public View n;
    public MessageObject r;
    public int s;
    public boolean v;
    public boolean w;
    public Drawable x;
    public String y;

    static {
        Paint paint = new Paint();
        D = paint;
        Paint paint2 = new Paint(1);
        E = paint2;
        TextPaint textPaint = new TextPaint(1);
        F = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        G = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        H = textPaint3;
        TextPaint textPaint4 = new TextPaint(1);
        I = textPaint4;
        TextPaint textPaint5 = new TextPaint(1);
        J = textPaint5;
        TextPaint textPaint6 = new TextPaint(1);
        K = textPaint6;
        L = new DecelerateInterpolator();
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-14209998);
        textPaint.setColor(-1);
        textPaint2.setColor(-1);
        textPaint3.setColor(-10327179);
        textPaint4.setColor(-10327179);
        textPaint5.setColor(-1);
        textPaint6.setColor(-1);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint4.setTypeface(AndroidUtilities.bold());
        textPaint5.setTypeface(AndroidUtilities.bold());
        textPaint6.setTypeface(AndroidUtilities.bold());
    }

    public final void a() {
        MessageObject messageObject = this.r;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message.media != null) {
                String attachFileName = ((TextUtils.isEmpty(message.attachPath) || !new File(this.r.messageOwner.attachPath).exists()) && !FileLoader.getInstance(UserConfig.selectedAccount).getPathToMessage(this.r.messageOwner).exists()) ? FileLoader.getAttachFileName(this.r.getDocument()) : null;
                this.w = false;
                if (attachFileName == null) {
                    this.h = false;
                    this.v = false;
                    this.w = true;
                    DownloadController.getInstance(this.r.currentAccount).removeLoadingFileObserver(this);
                } else {
                    DownloadController.getInstance(this.r.currentAccount).addLoadingFileObserver(attachFileName, this);
                    boolean isLoadingFile = FileLoader.getInstance(this.r.currentAccount).isLoadingFile(attachFileName);
                    this.v = isLoadingFile;
                    if (isLoadingFile) {
                        this.h = true;
                        Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                        if (fileProgress == null) {
                            fileProgress = Float.valueOf(0.0f);
                        }
                        b(fileProgress.floatValue(), false);
                    } else {
                        this.h = false;
                    }
                }
                this.n.invalidate();
            }
        }
        this.v = false;
        this.w = true;
        this.h = false;
        b(0.0f, false);
        DownloadController.getInstance(this.r.currentAccount).removeLoadingFileObserver(this);
        this.n.invalidate();
    }

    public final void b(float f9, boolean z10) {
        if (z10) {
            this.c = this.e;
        } else {
            this.e = f9;
            this.c = f9;
        }
        this.C = String.format("%d%%", Integer.valueOf((int) (100.0f * f9)));
        if (f9 != 1.0f) {
            this.f = 1.0f;
        }
        this.b = f9;
        this.d = 0L;
        this.a = System.currentTimeMillis();
        this.n.invalidate();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String upperCase;
        int dp;
        TextPaint textPaint;
        Rect bounds = getBounds();
        int width = bounds.width();
        int height = bounds.height();
        canvas.save();
        canvas.translate(bounds.left, bounds.top);
        canvas.drawRect(0.0f, 0.0f, width, height, D);
        int x4 = org.telegram.ui.b.x(240.0f, height, 2);
        int x10 = org.telegram.ui.b.x(48.0f, width, 2);
        Drawable drawable = this.x;
        drawable.setBounds(x10, x4, AndroidUtilities.dp(48.0f) + x10, AndroidUtilities.dp(48.0f) + x4);
        drawable.draw(canvas);
        canvas.drawText(this.y, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, AndroidUtilities.dp(31.0f) + x4, F);
        canvas.drawText(this.A, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, AndroidUtilities.dp(96.0f) + x4, G);
        canvas.drawText(this.B, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, AndroidUtilities.dp(125.0f) + x4, H);
        if (this.w) {
            upperCase = LocaleController.getString(R.string.OpenFile);
            textPaint = K;
            dp = 0;
        } else {
            upperCase = this.v ? LocaleController.getString(R.string.Cancel).toUpperCase() : LocaleController.getString(R.string.TapToDownload);
            dp = AndroidUtilities.dp(28.0f);
            textPaint = I;
        }
        canvas.drawText(upperCase, (width - ((int) Math.ceil(textPaint.measureText(upperCase)))) / 2, org.telegram.messenger.x3.C(235.0f, x4, dp), textPaint);
        if (this.h) {
            if (this.C != null) {
                canvas.drawText(this.C, (width - ((int) Math.ceil(r4.measureText(r3)))) / 2, AndroidUtilities.dp(210.0f) + x4, J);
            }
            int x11 = org.telegram.ui.b.x(240.0f, width, 2);
            int dp2 = AndroidUtilities.dp(232.0f) + x4;
            Paint paint = E;
            paint.setColor(-10327179);
            paint.setAlpha((int) (this.f * 255.0f));
            float f9 = dp2;
            canvas.drawRect(((int) (AndroidUtilities.dp(240.0f) * this.e)) + x11, f9, AndroidUtilities.dp(240.0f) + x11, AndroidUtilities.dp(2.0f) + dp2, paint);
            paint.setColor(-1);
            paint.setAlpha((int) (this.f * 255.0f));
            float f10 = x11;
            canvas.drawRect(f10, f9, (AndroidUtilities.dp(240.0f) * this.e) + f10, AndroidUtilities.dp(2.0f) + dp2, paint);
            long currentTimeMillis = System.currentTimeMillis();
            long j10 = currentTimeMillis - this.a;
            this.a = currentTimeMillis;
            float f11 = this.e;
            if (f11 != 1.0f) {
                float f12 = this.b;
                if (f11 != f12) {
                    float f13 = this.c;
                    float f14 = f12 - f13;
                    if (f14 > 0.0f) {
                        long j11 = this.d + j10;
                        this.d = j11;
                        if (j11 >= 300) {
                            this.e = f12;
                            this.c = f12;
                            this.d = 0L;
                        } else {
                            this.e = (L.getInterpolation(j11 / 300.0f) * f14) + f13;
                        }
                    }
                    this.n.invalidate();
                }
            }
            float f15 = this.e;
            if (f15 >= 1.0f && f15 == 1.0f) {
                float f16 = this.f;
                if (f16 != 0.0f) {
                    float f17 = f16 - (j10 / 200.0f);
                    this.f = f17;
                    if (f17 <= 0.0f) {
                        this.f = 0.0f;
                    }
                    this.n.invalidate();
                }
            }
        }
        canvas.restore();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.n.getMeasuredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.n.getMeasuredWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return this.n.getMeasuredHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return this.n.getMeasuredWidth();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final int getObserverTag() {
        return this.s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        a();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        if (!this.h) {
            a();
        }
        b(Math.min(1.0f, j10 / j11), true);
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        b(1.0f, true);
        a();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.x;
        if (drawable != null) {
            drawable.setAlpha(i10);
        }
        D.setAlpha(i10);
        F.setAlpha(i10);
        G.setAlpha(i10);
        H.setAlpha(i10);
        I.setAlpha(i10);
        J.setAlpha(i10);
        K.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
