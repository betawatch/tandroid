package ei;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class k4 extends View implements org.telegram.ui.ActionBar.b6 {
    public final org.telegram.ui.Components.f6 E;
    public final org.telegram.ui.Components.f6 F;
    public final org.telegram.ui.ActionBar.g6 a;
    public final ImageReceiver b;
    public final Paint c;
    public final Paint d;
    public final org.telegram.ui.Components.p6 e;
    public boolean f;
    public boolean h;
    public View.OnClickListener n;
    public final yc r;
    public int s;
    public String v;
    public float w;
    public float x;
    public float y;

    public k4(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(false, false, false);
        this.e = p6Var;
        this.r = new yc(this);
        this.s = -1;
        bs bsVar = bs.h;
        this.E = new org.telegram.ui.Components.f6(this, 0L, 320L, bsVar);
        this.F = new org.telegram.ui.Components.f6(this, 0L, 320L, bsVar);
        p6Var.setCallback(this);
        p6Var.u(-1);
        p6Var.b = 17;
        p6Var.w(AndroidUtilities.dp(16.0f));
        p6Var.x(AndroidUtilities.getTypeface("fonts/num.otf"));
        p6Var.M = AndroidUtilities.displaySize.x;
        p6Var.n(0.65f, 480L, bsVar);
        p6Var.A = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.a = g6Var;
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        w7.b6.a(this);
    }

    public final void a(int i10, int i11, final a8 a8Var) {
        String str;
        if (this.s != i10) {
            this.v = null;
            this.b.clearImage();
            this.s = i10;
        }
        this.e.t(Integer.toString(i11 + 1), false, true);
        File file = a8Var.O0;
        if (file != null) {
            if (TextUtils.equals(this.v, file.getPath())) {
                return;
            }
            this.v = a8Var.O0.getPath();
            final int i12 = 0;
            Utilities.searchQueue.postRunnable(new Runnable(this) { // from class: ei.h4
                public final /* synthetic */ k4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            a8 a8Var2 = a8Var;
                            BitmapFactory.decodeFile(a8Var2.O0.getPath(), options);
                            int dp = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            a8.C(options, dp);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(a8Var2.O0.getPath(), options);
                            final int i13 = 1;
                            final k4 k4Var = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ei.i4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            k4Var.b.setImageBitmap(decodeFile);
                                            break;
                                        default:
                                            k4Var.b.setImageBitmap(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            a8 a8Var3 = a8Var;
                            BitmapFactory.decodeFile(a8Var3.L.getPath(), options2);
                            int dp2 = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            a8.C(options2, dp2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(a8Var3.L.getPath(), options2);
                            final int i14 = 0;
                            final k4 k4Var2 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ei.i4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            k4Var2.b.setImageBitmap(decodeFile2);
                                            break;
                                        default:
                                            k4Var2.b.setImageBitmap(decodeFile2);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (!a8Var.K) {
            File file2 = a8Var.L;
            if (file2 == null || TextUtils.equals(this.v, file2.getPath())) {
                return;
            }
            this.v = a8Var.L.getPath();
            final int i13 = 1;
            Utilities.searchQueue.postRunnable(new Runnable(this) { // from class: ei.h4
                public final /* synthetic */ k4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            a8 a8Var2 = a8Var;
                            BitmapFactory.decodeFile(a8Var2.O0.getPath(), options);
                            int dp = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            a8.C(options, dp);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(a8Var2.O0.getPath(), options);
                            final int i132 = 1;
                            final k4 k4Var = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ei.i4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i132) {
                                        case 0:
                                            k4Var.b.setImageBitmap(decodeFile);
                                            break;
                                        default:
                                            k4Var.b.setImageBitmap(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            a8 a8Var3 = a8Var;
                            BitmapFactory.decodeFile(a8Var3.L.getPath(), options2);
                            int dp2 = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            a8.C(options2, dp2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(a8Var3.L.getPath(), options2);
                            final int i14 = 0;
                            final k4 k4Var2 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: ei.i4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            k4Var2.b.setImageBitmap(decodeFile2);
                                            break;
                                        default:
                                            k4Var2.b.setImageBitmap(decodeFile2);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        Bitmap bitmap = a8Var.M0;
        if (bitmap == null) {
            bitmap = null;
        }
        if (bitmap == null && (str = a8Var.N) != null && str.startsWith("vthumb://")) {
            if (TextUtils.equals(this.v, a8Var.N)) {
                return;
            }
            String str2 = a8Var.N;
            this.v = str2;
            long parseLong = Long.parseLong(str2.substring(9));
            if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    bitmap = getContext().getContentResolver().loadThumbnail(a8Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong), new Size(AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f)), null);
                } catch (Exception unused) {
                }
            }
        }
        this.b.setImageBitmap(bitmap);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        if (!z11) {
            this.E.a(z10);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        float dp3 = AndroidUtilities.dp(94.0f);
        float dp4 = AndroidUtilities.dp(112.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.setImageCoords(dp, dp2, dp3, dp4);
        imageReceiver.draw(canvas);
        float dp5 = AndroidUtilities.dp(1.5f);
        Paint paint = this.c;
        paint.setStrokeWidth(dp5);
        float e = this.E.e(this.f);
        if (e > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.w = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.x = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.y = AndroidUtilities.dp(12.833f);
        float e7 = this.F.e(this.h);
        float a2 = this.r.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.w, this.x);
        if (e7 > 0.0f) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (e7 * 255.0f));
            canvas.drawCircle(this.w, this.x, this.y, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.w, this.x, this.y - AndroidUtilities.dp(1.0f), paint);
        if (e7 > 0.0f) {
            float f7 = this.w;
            float f10 = this.y;
            float f11 = f7 - f10;
            float f12 = this.x;
            float f13 = f7 + f10;
            org.telegram.ui.Components.p6 p6Var = this.e;
            p6Var.o(f11, f12, f13, f12);
            p6Var.B = (int) (e7 * 255.0f);
            p6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z10 = motionEvent.getX() >= this.w - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getX() <= this.w + ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() >= this.x - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() <= this.x + ((float) AndroidUtilities.dp(14.0f));
        int action = motionEvent.getAction();
        yc ycVar = this.r;
        if (action == 0) {
            ycVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (ycVar.i && z10 && (onClickListener = this.n) != null) {
                onClickListener.onClick(this);
            }
            ycVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ycVar.c(false);
        }
        return ycVar.i || super.onTouchEvent(motionEvent);
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void setPosition(int i10) {
        this.e.t(i10 < 0 ? "" : Integer.toString(i10 + 1), true, true);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.a));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
