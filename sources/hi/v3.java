package hi;

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
import org.telegram.messenger.ls;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final class v3 extends View implements org.telegram.ui.ActionBar.b6 {
    public float E;
    public final org.telegram.ui.Components.d6 F;
    public final org.telegram.ui.Components.d6 G;
    public final org.telegram.ui.ActionBar.h6 a;
    public final ImageReceiver b;
    public final Paint c;
    public final Paint d;
    public final org.telegram.ui.Components.n6 e;
    public boolean f;
    public boolean h;
    public View.OnClickListener n;
    public final mc r;
    public int s;
    public String w;
    public float x;
    public float y;

    public v3(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(false, false, false);
        this.e = n6Var;
        this.r = new mc(this);
        this.s = -1;
        nr nrVar = nr.h;
        this.F = new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar);
        this.G = new org.telegram.ui.Components.d6(this, 0L, 320L, nrVar);
        n6Var.setCallback(this);
        n6Var.u(-1);
        n6Var.b = 17;
        n6Var.w(org.telegram.messenger.g0.L(16.0f));
        n6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        n6Var.N = org.telegram.messenger.g0.q.x;
        n6Var.n(0.65f, 480L, nrVar);
        n6Var.B = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.a = h6Var;
        paint2.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, h6Var));
        imageReceiver.J0(org.telegram.messenger.g0.L(6.0f));
        c8.ra.a(this);
    }

    public final void a(int i7, int i10, final c7 c7Var) {
        String str;
        if (this.s != i7) {
            this.w = null;
            this.b.f();
            this.s = i7;
        }
        this.e.t(Integer.toString(i10 + 1), false, true);
        File file = c7Var.O0;
        if (file != null) {
            if (TextUtils.equals(this.w, file.getPath())) {
                return;
            }
            this.w = c7Var.O0.getPath();
            final int i11 = 0;
            Utilities.g.c(new Runnable(this) { // from class: hi.s3
                public final /* synthetic */ v3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            c7 c7Var2 = c7Var;
                            BitmapFactory.decodeFile(c7Var2.O0.getPath(), options);
                            int L = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            c7.C(options, L);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(c7Var2.O0.getPath(), options);
                            final int i12 = 1;
                            final v3 v3Var = this.b;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.t3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            v3Var.b.v0(decodeFile);
                                            break;
                                        default:
                                            v3Var.b.v0(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            c7 c7Var3 = c7Var;
                            BitmapFactory.decodeFile(c7Var3.L.getPath(), options2);
                            int L2 = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            c7.C(options2, L2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(c7Var3.L.getPath(), options2);
                            final int i13 = 0;
                            final v3 v3Var2 = this.b;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.t3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            v3Var2.b.v0(decodeFile2);
                                            break;
                                        default:
                                            v3Var2.b.v0(decodeFile2);
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
        if (!c7Var.K) {
            File file2 = c7Var.L;
            if (file2 == null || TextUtils.equals(this.w, file2.getPath())) {
                return;
            }
            this.w = c7Var.L.getPath();
            final int i12 = 1;
            Utilities.g.c(new Runnable(this) { // from class: hi.s3
                public final /* synthetic */ v3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            c7 c7Var2 = c7Var;
                            BitmapFactory.decodeFile(c7Var2.O0.getPath(), options);
                            int L = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            c7.C(options, L);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(c7Var2.O0.getPath(), options);
                            final int i122 = 1;
                            final v3 v3Var = this.b;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.t3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i122) {
                                        case 0:
                                            v3Var.b.v0(decodeFile);
                                            break;
                                        default:
                                            v3Var.b.v0(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            c7 c7Var3 = c7Var;
                            BitmapFactory.decodeFile(c7Var3.L.getPath(), options2);
                            int L2 = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            c7.C(options2, L2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(c7Var3.L.getPath(), options2);
                            final int i13 = 0;
                            final v3 v3Var2 = this.b;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.t3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            v3Var2.b.v0(decodeFile2);
                                            break;
                                        default:
                                            v3Var2.b.v0(decodeFile2);
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
        Bitmap bitmap = c7Var.M0;
        if (bitmap == null) {
            bitmap = null;
        }
        if (bitmap == null && (str = c7Var.N) != null && str.startsWith("vthumb://")) {
            if (TextUtils.equals(this.w, c7Var.N)) {
                return;
            }
            String str2 = c7Var.N;
            this.w = str2;
            long parseLong = Long.parseLong(str2.substring(9));
            if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    bitmap = getContext().getContentResolver().loadThumbnail(c7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong), new Size(org.telegram.messenger.g0.L(94.0f), org.telegram.messenger.g0.L(112.0f)), null);
                } catch (Exception unused) {
                }
            }
        }
        this.b.v0(bitmap);
    }

    public final void b(boolean z10, boolean z11) {
        if (this.f == z10) {
            return;
        }
        this.f = z10;
        if (!z11) {
            this.F.a(z10);
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
        float d = this.F.d(this.f);
        if (d > 0.0f) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(96.0f), org.telegram.messenger.g0.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f), paint);
        }
        this.x = (getWidth() - org.telegram.messenger.g0.L(17.163f)) - org.telegram.messenger.g0.L(3.0f);
        this.y = org.telegram.messenger.g0.L(3.0f) + org.telegram.messenger.g0.L(17.833f);
        this.E = org.telegram.messenger.g0.L(12.833f);
        float d2 = this.G.d(this.h);
        float a10 = this.r.a(0.075f);
        canvas.save();
        canvas.scale(a10, a10, this.x, this.y);
        if (d2 > 0.0f) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (d2 * 255.0f));
            canvas.drawCircle(this.x, this.y, this.E, paint2);
        }
        paint.setAlpha(ls.e4);
        canvas.drawCircle(this.x, this.y, this.E - org.telegram.messenger.g0.L(1.0f), paint);
        if (d2 > 0.0f) {
            float f10 = this.x;
            float f11 = this.E;
            float f12 = f10 - f11;
            float f13 = this.y;
            float f14 = f10 + f11;
            org.telegram.ui.Components.n6 n6Var = this.e;
            n6Var.o(f12, f13, f14, f13);
            n6Var.C = (int) (d2 * 255.0f);
            n6Var.draw(canvas);
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
        boolean z10 = motionEvent.getX() >= this.x - ((float) org.telegram.messenger.g0.L(14.0f)) && motionEvent.getX() <= this.x + ((float) org.telegram.messenger.g0.L(14.0f)) && motionEvent.getY() >= this.y - ((float) org.telegram.messenger.g0.L(14.0f)) && motionEvent.getY() <= this.y + ((float) org.telegram.messenger.g0.L(14.0f));
        int action = motionEvent.getAction();
        mc mcVar = this.r;
        if (action == 0) {
            mcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (mcVar.i && z10 && (onClickListener = this.n) != null) {
                onClickListener.onClick(this);
            }
            mcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            mcVar.c(false);
        }
        return mcVar.i || super.onTouchEvent(motionEvent);
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void setPosition(int i7) {
        this.e.t(i7 < 0 ? "" : Integer.toString(i7 + 1), true, true);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, this.a));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
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
