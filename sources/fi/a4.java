package fi;

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
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class a4 extends View implements org.telegram.ui.ActionBar.a6 {
    public float D;
    public final org.telegram.ui.Components.w5 E;
    public final org.telegram.ui.Components.w5 F;
    public final org.telegram.ui.ActionBar.f6 a;
    public final ImageReceiver b;
    public final Paint c;
    public final Paint d;
    public final org.telegram.ui.Components.i6 e;
    public boolean f;
    public boolean h;
    public View.OnClickListener n;
    public final ic r;
    public int s;
    public String w;
    public float x;
    public float y;

    public a4(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, false, false);
        this.e = i6Var;
        this.r = new ic(this);
        this.s = -1;
        xq xqVar = xq.h;
        this.E = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        this.F = new org.telegram.ui.Components.w5(this, 0L, 320L, xqVar);
        i6Var.setCallback(this);
        i6Var.u(-1);
        i6Var.b = 17;
        i6Var.w(org.telegram.messenger.g0.L(16.0f));
        i6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        i6Var.M = org.telegram.messenger.g0.q.x;
        i6Var.n(0.65f, 480L, xqVar);
        i6Var.A = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.a = f6Var;
        paint2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, f6Var));
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        c8.ka.a(this);
    }

    public final void a(int i7, int i10, final e7 e7Var) {
        String str;
        if (this.s != i7) {
            this.w = null;
            this.b.f();
            this.s = i7;
        }
        this.e.t(Integer.toString(i10 + 1), false, true);
        File file = e7Var.O0;
        if (file != null) {
            if (TextUtils.equals(this.w, file.getPath())) {
                return;
            }
            this.w = e7Var.O0.getPath();
            final int i11 = 0;
            Utilities.g.c(new Runnable(this) { // from class: fi.x3
                public final /* synthetic */ a4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            e7 e7Var2 = e7Var;
                            BitmapFactory.decodeFile(e7Var2.O0.getPath(), options);
                            int L = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            e7.C(options, L);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(e7Var2.O0.getPath(), options);
                            final int i12 = 1;
                            final a4 a4Var = this.b;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            a4Var.b.v0(decodeFile);
                                            break;
                                        default:
                                            a4Var.b.v0(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            e7 e7Var3 = e7Var;
                            BitmapFactory.decodeFile(e7Var3.L.getPath(), options2);
                            int L2 = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            e7.C(options2, L2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(e7Var3.L.getPath(), options2);
                            final int i13 = 0;
                            final a4 a4Var2 = this.b;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            a4Var2.b.v0(decodeFile2);
                                            break;
                                        default:
                                            a4Var2.b.v0(decodeFile2);
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
        if (!e7Var.K) {
            File file2 = e7Var.L;
            if (file2 == null || TextUtils.equals(this.w, file2.getPath())) {
                return;
            }
            this.w = e7Var.L.getPath();
            final int i12 = 1;
            Utilities.g.c(new Runnable(this) { // from class: fi.x3
                public final /* synthetic */ a4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            e7 e7Var2 = e7Var;
                            BitmapFactory.decodeFile(e7Var2.O0.getPath(), options);
                            int L = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            e7.C(options, L);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(e7Var2.O0.getPath(), options);
                            final int i122 = 1;
                            final a4 a4Var = this.b;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i122) {
                                        case 0:
                                            a4Var.b.v0(decodeFile);
                                            break;
                                        default:
                                            a4Var.b.v0(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            e7 e7Var3 = e7Var;
                            BitmapFactory.decodeFile(e7Var3.L.getPath(), options2);
                            int L2 = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            e7.C(options2, L2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(e7Var3.L.getPath(), options2);
                            final int i13 = 0;
                            final a4 a4Var2 = this.b;
                            org.telegram.messenger.g0.h3(new Runnable() { // from class: fi.y3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            a4Var2.b.v0(decodeFile2);
                                            break;
                                        default:
                                            a4Var2.b.v0(decodeFile2);
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
        Bitmap bitmap = e7Var.M0;
        if (bitmap == null) {
            bitmap = null;
        }
        if (bitmap == null && (str = e7Var.N) != null && str.startsWith("vthumb://")) {
            if (TextUtils.equals(this.w, e7Var.N)) {
                return;
            }
            String str2 = e7Var.N;
            this.w = str2;
            long parseLong = Long.parseLong(str2.substring(9));
            if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    bitmap = getContext().getContentResolver().loadThumbnail(e7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong), new Size(org.telegram.messenger.g0.L(94.0f), org.telegram.messenger.g0.L(112.0f)), null);
                } catch (Exception unused) {
                }
            }
        }
        this.b.v0(bitmap);
    }

    public final void b(boolean z9, boolean z10) {
        if (this.f == z9) {
            return;
        }
        this.f = z9;
        if (!z10) {
            this.E.a(z9);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float L = org.telegram.messenger.g0.L(2.0f);
        float L2 = org.telegram.messenger.g0.L(4.0f);
        float L3 = org.telegram.messenger.g0.L(94.0f);
        float L4 = org.telegram.messenger.g0.L(112.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.y0(L, L2, L3, L4);
        imageReceiver.h(canvas, null);
        float L5 = org.telegram.messenger.g0.L(1.5f);
        Paint paint = this.c;
        paint.setStrokeWidth(L5);
        float d = this.E.d(this.f);
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        }
        this.x = (getWidth() - org.telegram.messenger.g0.L(17.163f)) - org.telegram.messenger.g0.L(3.0f);
        this.y = org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(17.833f);
        this.D = org.telegram.messenger.g0.L(12.833f);
        float d2 = this.F.d(this.h);
        float a10 = this.r.a(0.075f);
        canvas.save();
        canvas.scale(a10, a10, this.x, this.y);
        if (d2 > 0.0f) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (d2 * 255.0f));
            canvas.drawCircle(this.x, this.y, this.D, paint2);
        }
        paint.setAlpha(qs.e4);
        canvas.drawCircle(this.x, this.y, this.D - org.telegram.messenger.g0.L(1.0f), paint);
        if (d2 > 0.0f) {
            float f10 = this.x;
            float f11 = this.D;
            float f12 = f10 - f11;
            float f13 = this.y;
            float f14 = f10 + f11;
            org.telegram.ui.Components.i6 i6Var = this.e;
            i6Var.o(f12, f13, f14, f13);
            i6Var.B = (int) (d2 * 255.0f);
            i6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.P();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(98.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(120.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z9 = motionEvent.getX() >= this.x - ((float) org.telegram.messenger.g0.L(14.0f)) && motionEvent.getX() <= this.x + ((float) org.telegram.messenger.g0.L(14.0f)) && motionEvent.getY() >= this.y - ((float) org.telegram.messenger.g0.L(14.0f)) && motionEvent.getY() <= this.y + ((float) org.telegram.messenger.g0.L(14.0f));
        int action = motionEvent.getAction();
        ic icVar = this.r;
        if (action == 0) {
            icVar.c(z9);
        } else if (motionEvent.getAction() == 1) {
            if (icVar.i && z9 && (onClickListener = this.n) != null) {
                onClickListener.onClick(this);
            }
            icVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            icVar.c(false);
        }
        return icVar.i || super.onTouchEvent(motionEvent);
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void setPosition(int i7) {
        this.e.t(i7 < 0 ? "" : Integer.toString(i7 + 1), true, true);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.a));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
