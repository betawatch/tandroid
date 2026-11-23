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
import org.telegram.messenger.ks;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.kr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class f4 extends View implements org.telegram.ui.ActionBar.c6 {
    public float E;
    public final org.telegram.ui.Components.c6 F;
    public final org.telegram.ui.Components.c6 G;
    public final org.telegram.ui.ActionBar.i6 a;
    public final ImageReceiver b;
    public final Paint c;
    public final Paint d;
    public final org.telegram.ui.Components.m6 e;
    public boolean f;
    public boolean h;
    public View.OnClickListener n;
    public final org.telegram.ui.Components.lc r;
    public int s;
    public String w;
    public float x;
    public float y;

    public f4(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, false, false);
        this.e = m6Var;
        this.r = new org.telegram.ui.Components.lc(this);
        this.s = -1;
        kr krVar = kr.h;
        this.F = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        this.G = new org.telegram.ui.Components.c6(this, 0L, 320L, krVar);
        m6Var.setCallback(this);
        m6Var.u(-1);
        m6Var.b = 17;
        m6Var.w(org.telegram.messenger.g0.L(16.0f));
        m6Var.x(org.telegram.messenger.g0.o1("fonts/num.otf"));
        m6Var.N = org.telegram.messenger.g0.q.x;
        m6Var.n(0.65f, 480L, krVar);
        m6Var.B = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.a = i6Var;
        paint2.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, i6Var));
        imageReceiver.K0(org.telegram.messenger.g0.L(6.0f));
        c8.sa.a(this);
    }

    public final void a(int i7, int i10, final x7 x7Var) {
        String str;
        if (this.s != i7) {
            this.w = null;
            this.b.f();
            this.s = i7;
        }
        this.e.t(Integer.toString(i10 + 1), false, true);
        File file = x7Var.O0;
        if (file != null) {
            if (TextUtils.equals(this.w, file.getPath())) {
                return;
            }
            this.w = x7Var.O0.getPath();
            final int i11 = 0;
            Utilities.g.c(new Runnable(this) { // from class: hi.c4
                public final /* synthetic */ f4 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i11) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            x7 x7Var2 = x7Var;
                            BitmapFactory.decodeFile(x7Var2.O0.getPath(), options);
                            int L = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            x7.C(options, L);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(x7Var2.O0.getPath(), options);
                            final int i12 = 1;
                            final f4 f4Var = this.b;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            f4Var.b.w0(decodeFile);
                                            break;
                                        default:
                                            f4Var.b.w0(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            x7 x7Var3 = x7Var;
                            BitmapFactory.decodeFile(x7Var3.L.getPath(), options2);
                            int L2 = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            x7.C(options2, L2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(x7Var3.L.getPath(), options2);
                            final int i13 = 0;
                            final f4 f4Var2 = this.b;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            f4Var2.b.w0(decodeFile2);
                                            break;
                                        default:
                                            f4Var2.b.w0(decodeFile2);
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
        if (!x7Var.K) {
            File file2 = x7Var.L;
            if (file2 == null || TextUtils.equals(this.w, file2.getPath())) {
                return;
            }
            this.w = x7Var.L.getPath();
            final int i12 = 1;
            Utilities.g.c(new Runnable(this) { // from class: hi.c4
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
                            x7 x7Var2 = x7Var;
                            BitmapFactory.decodeFile(x7Var2.O0.getPath(), options);
                            int L = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            x7.C(options, L);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(x7Var2.O0.getPath(), options);
                            final int i122 = 1;
                            final f4 f4Var = this.b;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i122) {
                                        case 0:
                                            f4Var.b.w0(decodeFile);
                                            break;
                                        default:
                                            f4Var.b.w0(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            x7 x7Var3 = x7Var;
                            BitmapFactory.decodeFile(x7Var3.L.getPath(), options2);
                            int L2 = org.telegram.messenger.g0.L(94.0f);
                            org.telegram.messenger.g0.L(112.0f);
                            x7.C(options2, L2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(x7Var3.L.getPath(), options2);
                            final int i13 = 0;
                            final f4 f4Var2 = this.b;
                            org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.d4
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            f4Var2.b.w0(decodeFile2);
                                            break;
                                        default:
                                            f4Var2.b.w0(decodeFile2);
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
        Bitmap bitmap = x7Var.M0;
        if (bitmap == null) {
            bitmap = null;
        }
        if (bitmap == null && (str = x7Var.N) != null && str.startsWith("vthumb://")) {
            if (TextUtils.equals(this.w, x7Var.N)) {
                return;
            }
            String str2 = x7Var.N;
            this.w = str2;
            long parseLong = Long.parseLong(str2.substring(9));
            if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    bitmap = getContext().getContentResolver().loadThumbnail(x7Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong), new Size(org.telegram.messenger.g0.L(94.0f), org.telegram.messenger.g0.L(112.0f)), null);
                } catch (Exception unused) {
                }
            }
        }
        this.b.w0(bitmap);
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
        imageReceiver.z0(L, L2, L3, L4);
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
        paint.setAlpha(ks.e4);
        canvas.drawCircle(this.x, this.y, this.E - org.telegram.messenger.g0.L(1.0f), paint);
        if (d2 > 0.0f) {
            float f10 = this.x;
            float f11 = this.E;
            float f12 = f10 - f11;
            float f13 = this.y;
            float f14 = f10 + f11;
            org.telegram.ui.Components.m6 m6Var = this.e;
            m6Var.o(f12, f13, f14, f13);
            m6Var.C = (int) (d2 * 255.0f);
            m6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.Q();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.S();
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
        org.telegram.ui.Components.lc lcVar = this.r;
        if (action == 0) {
            lcVar.c(z10);
        } else if (motionEvent.getAction() == 1) {
            if (lcVar.i && z10 && (onClickListener = this.n) != null) {
                onClickListener.onClick(this);
            }
            lcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            lcVar.c(false);
        }
        return lcVar.i || super.onTouchEvent(motionEvent);
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void setPosition(int i7) {
        this.e.t(i7 < 0 ? "" : Integer.toString(i7 + 1), true, true);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        try {
            this.d.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.a));
            invalidate();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
