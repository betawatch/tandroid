package nh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.uc;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class f4 extends View {
    public final org.telegram.ui.Components.d6 A;
    public final ImageReceiver a;
    public final Paint b;
    public final Paint c;
    public final org.telegram.ui.Components.n6 d;
    public boolean e;
    public boolean f;
    public View.OnClickListener h;
    public final uc n;
    public int r;
    public String s;
    public float v;
    public float w;
    public float x;
    public final org.telegram.ui.Components.d6 y;

    public f4(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false, false);
        this.d = n6Var;
        this.n = new uc(this);
        this.r = -1;
        jr jrVar = jr.h;
        this.y = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        this.A = new org.telegram.ui.Components.d6(this, 0L, 320L, jrVar);
        n6Var.setCallback(this);
        n6Var.r(-1);
        n6Var.b = 17;
        n6Var.t(AndroidUtilities.dp(16.0f));
        n6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        n6Var.G = AndroidUtilities.displaySize.x;
        n6Var.k(0.65f, 480L, jrVar);
        n6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, c6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        i7.h6.a(this);
    }

    public final void a(int i10, int i11, final o7 o7Var) {
        String str;
        if (this.r != i10) {
            this.s = null;
            this.a.clearImage();
            this.r = i10;
        }
        this.d.q(Integer.toString(i11 + 1), false, true);
        File file = o7Var.O0;
        if (file != null) {
            if (TextUtils.equals(this.s, file.getPath())) {
                return;
            }
            this.s = o7Var.O0.getPath();
            final int i12 = 0;
            Utilities.searchQueue.postRunnable(new Runnable(this) { // from class: nh.c4
                public final /* synthetic */ f4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            o7 o7Var2 = o7Var;
                            BitmapFactory.decodeFile(o7Var2.O0.getPath(), options);
                            int dp = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            o7.C(options, dp);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(o7Var2.O0.getPath(), options);
                            final int i13 = 1;
                            final f4 f4Var = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: nh.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            f4Var.a.setImageBitmap(decodeFile);
                                            break;
                                        default:
                                            f4Var.a.setImageBitmap(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            o7 o7Var3 = o7Var;
                            BitmapFactory.decodeFile(o7Var3.L.getPath(), options2);
                            int dp2 = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            o7.C(options2, dp2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(o7Var3.L.getPath(), options2);
                            final int i14 = 0;
                            final f4 f4Var2 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: nh.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            f4Var2.a.setImageBitmap(decodeFile2);
                                            break;
                                        default:
                                            f4Var2.a.setImageBitmap(decodeFile2);
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
        if (!o7Var.K) {
            File file2 = o7Var.L;
            if (file2 == null || TextUtils.equals(this.s, file2.getPath())) {
                return;
            }
            this.s = o7Var.L.getPath();
            final int i13 = 1;
            Utilities.searchQueue.postRunnable(new Runnable(this) { // from class: nh.c4
                public final /* synthetic */ f4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            o7 o7Var2 = o7Var;
                            BitmapFactory.decodeFile(o7Var2.O0.getPath(), options);
                            int dp = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            o7.C(options, dp);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(o7Var2.O0.getPath(), options);
                            final int i132 = 1;
                            final f4 f4Var = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: nh.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i132) {
                                        case 0:
                                            f4Var.a.setImageBitmap(decodeFile);
                                            break;
                                        default:
                                            f4Var.a.setImageBitmap(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            o7 o7Var3 = o7Var;
                            BitmapFactory.decodeFile(o7Var3.L.getPath(), options2);
                            int dp2 = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            o7.C(options2, dp2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(o7Var3.L.getPath(), options2);
                            final int i14 = 0;
                            final f4 f4Var2 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: nh.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            f4Var2.a.setImageBitmap(decodeFile2);
                                            break;
                                        default:
                                            f4Var2.a.setImageBitmap(decodeFile2);
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
        Bitmap bitmap = o7Var.M0;
        if (bitmap == null) {
            bitmap = null;
        }
        if (bitmap == null && (str = o7Var.N) != null && str.startsWith("vthumb://")) {
            if (TextUtils.equals(this.s, o7Var.N)) {
                return;
            }
            String str2 = o7Var.N;
            this.s = str2;
            long parseLong = Long.parseLong(str2.substring(9));
            if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    bitmap = getContext().getContentResolver().loadThumbnail(o7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong), new Size(AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f)), null);
                } catch (Exception unused) {
                }
            }
        }
        this.a.setImageBitmap(bitmap);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.e == z10) {
            return;
        }
        this.e = z10;
        if (!z11) {
            this.y.a(z10);
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
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(dp, dp2, dp3, dp4);
        imageReceiver.draw(canvas);
        float dp5 = AndroidUtilities.dp(1.5f);
        Paint paint = this.b;
        paint.setStrokeWidth(dp5);
        float e10 = this.y.e(this.e);
        if (e10 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e10 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.x = AndroidUtilities.dp(12.833f);
        float e11 = this.A.e(this.f);
        float a2 = this.n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.w);
        if (e11 > 0.0f) {
            Paint paint2 = this.c;
            paint2.setAlpha((int) (e11 * 255.0f));
            canvas.drawCircle(this.v, this.w, this.x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.w, this.x - AndroidUtilities.dp(1.0f), paint);
        if (e11 > 0.0f) {
            float f9 = this.v;
            float f10 = this.x;
            float f11 = f9 - f10;
            float f12 = this.w;
            float f13 = f9 + f10;
            org.telegram.ui.Components.n6 n6Var = this.d;
            n6Var.l(f11, f12, f13, f12);
            n6Var.w = (int) (e11 * 255.0f);
            n6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z10 = motionEvent.getX() >= this.v - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getX() <= this.v + ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() >= this.w - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() <= this.w + ((float) AndroidUtilities.dp(14.0f));
        int action = motionEvent.getAction();
        uc ucVar = this.n;
        if (action == 0) {
            ucVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (ucVar.h && z10 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            ucVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            ucVar.c(false);
        }
        return ucVar.h || super.onTouchEvent(motionEvent);
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public void setPosition(int i10) {
        this.d.q(i10 < 0 ? "" : Integer.toString(i10 + 1), true, true);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
