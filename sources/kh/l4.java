package kh;

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
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class l4 extends View {
    public final org.telegram.ui.Components.y5 A;
    public final ImageReceiver a;
    public final Paint b;
    public final Paint c;
    public final org.telegram.ui.Components.i6 d;
    public boolean e;
    public boolean f;
    public View.OnClickListener h;
    public final org.telegram.ui.Components.pc n;
    public int r;
    public String s;
    public float v;
    public float w;
    public float x;
    public final org.telegram.ui.Components.y5 y;

    public l4(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false, false);
        this.d = i6Var;
        this.n = new org.telegram.ui.Components.pc(this);
        this.r = -1;
        gr grVar = gr.h;
        this.y = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        this.A = new org.telegram.ui.Components.y5(this, 0L, 320L, grVar);
        i6Var.setCallback(this);
        i6Var.r(-1);
        i6Var.b = 17;
        i6Var.t(AndroidUtilities.dp(16.0f));
        i6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        i6Var.G = AndroidUtilities.displaySize.x;
        i6Var.k(0.65f, 480L, grVar);
        i6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        g7.g6.a(this);
    }

    public final void a(int i9, int i10, final a8 a8Var) {
        String str;
        if (this.r != i9) {
            this.s = null;
            this.a.clearImage();
            this.r = i9;
        }
        this.d.q(Integer.toString(i10 + 1), false, true);
        File file = a8Var.O0;
        if (file != null) {
            if (TextUtils.equals(this.s, file.getPath())) {
                return;
            }
            this.s = a8Var.O0.getPath();
            final int i11 = 0;
            Utilities.searchQueue.postRunnable(new Runnable(this) { // from class: kh.i4
                public final /* synthetic */ l4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
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
                            final int i12 = 1;
                            final l4 l4Var = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.j4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            l4Var.a.setImageBitmap(decodeFile);
                                            break;
                                        default:
                                            l4Var.a.setImageBitmap(decodeFile);
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
                            final int i13 = 0;
                            final l4 l4Var2 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.j4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            l4Var2.a.setImageBitmap(decodeFile2);
                                            break;
                                        default:
                                            l4Var2.a.setImageBitmap(decodeFile2);
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
            if (file2 == null || TextUtils.equals(this.s, file2.getPath())) {
                return;
            }
            this.s = a8Var.L.getPath();
            final int i12 = 1;
            Utilities.searchQueue.postRunnable(new Runnable(this) { // from class: kh.i4
                public final /* synthetic */ l4 b;

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
                            final int i122 = 1;
                            final l4 l4Var = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.j4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i122) {
                                        case 0:
                                            l4Var.a.setImageBitmap(decodeFile);
                                            break;
                                        default:
                                            l4Var.a.setImageBitmap(decodeFile);
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
                            final int i13 = 0;
                            final l4 l4Var2 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: kh.j4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            l4Var2.a.setImageBitmap(decodeFile2);
                                            break;
                                        default:
                                            l4Var2.a.setImageBitmap(decodeFile2);
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
            if (TextUtils.equals(this.s, a8Var.N)) {
                return;
            }
            String str2 = a8Var.N;
            this.s = str2;
            long parseLong = Long.parseLong(str2.substring(9));
            if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    bitmap = getContext().getContentResolver().loadThumbnail(a8Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong), new Size(AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f)), null);
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
            float f10 = this.v;
            float f11 = this.x;
            float f12 = f10 - f11;
            float f13 = this.w;
            float f14 = f10 + f11;
            org.telegram.ui.Components.i6 i6Var = this.d;
            i6Var.l(f12, f13, f14, f13);
            i6Var.w = (int) (e11 * 255.0f);
            i6Var.draw(canvas);
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
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z10 = motionEvent.getX() >= this.v - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getX() <= this.v + ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() >= this.w - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() <= this.w + ((float) AndroidUtilities.dp(14.0f));
        int action = motionEvent.getAction();
        org.telegram.ui.Components.pc pcVar = this.n;
        if (action == 0) {
            pcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (pcVar.h && z10 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            pcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            pcVar.c(false);
        }
        return pcVar.h || super.onTouchEvent(motionEvent);
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public void setPosition(int i9) {
        this.d.q(i9 < 0 ? "" : Integer.toString(i9 + 1), true, true);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
