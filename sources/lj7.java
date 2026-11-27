// default package

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
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class lj7 extends View implements snb {
    public float E;
    public final mm F;
    public final mm G;
    public final vnb a;
    public final ImageReceiver b;
    public final Paint c;
    public final Paint d;
    public final hn e;
    public boolean f;
    public boolean h;
    public View.OnClickListener n;
    public final v41 r;
    public int s;
    public String w;
    public float x;
    public float y;

    public lj7(Context context, vnb vnbVar) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        hn hnVar = new hn(false, false, false);
        this.e = hnVar;
        this.r = new v41(this);
        this.s = -1;
        k43 k43Var = k43.h;
        this.F = new mm(this, 0L, 320L, k43Var);
        this.G = new mm(this, 0L, 320L, k43Var);
        hnVar.setCallback(this);
        hnVar.u(-1);
        hnVar.b = 17;
        hnVar.w(hl.L(16.0f));
        hnVar.x(hl.n1("fonts/num.otf"));
        hnVar.N = hl.q.x;
        hnVar.n(0.65f, 480L, k43Var);
        hnVar.B = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.a = vnbVar;
        paint2.setColor(aob.v0(aob.Fi, vnbVar));
        imageReceiver.q0(hl.L(6.0f));
        iye.a(this);
    }

    public final void a(int i, int i2, final c8b c8bVar) {
        String str;
        if (this.s != i) {
            this.w = null;
            this.b.f();
            this.s = i;
        }
        final byte b = 1;
        final byte b2 = 0;
        this.e.t(Integer.toString(i2 + 1), false, true);
        File file = c8bVar.O0;
        if (file != null) {
            if (TextUtils.equals(this.w, file.getPath())) {
                return;
            }
            this.w = c8bVar.O0.getPath();
            Utilities.g.c(new Runnable(this) { // from class: ij7
                public final /* synthetic */ lj7 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    c8b c8bVar2 = c8bVar;
                    final lj7 lj7Var = this.b;
                    final byte b4 = 0;
                    final byte b5 = 1;
                    switch (b3) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(c8bVar2.O0.getPath(), options);
                            c8b.B(options, hl.L(94.0f));
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(c8bVar2.O0.getPath(), options);
                            hl.c3(new Runnable() { // from class: jj7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b5;
                                    Bitmap bitmap = decodeFile;
                                    lj7 lj7Var2 = lj7Var;
                                    switch (b6) {
                                        case 0:
                                            lj7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            lj7Var2.b.f0(bitmap);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(c8bVar2.L.getPath(), options2);
                            c8b.B(options2, hl.L(94.0f));
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(c8bVar2.L.getPath(), options2);
                            hl.c3(new Runnable() { // from class: jj7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b4;
                                    Bitmap bitmap = decodeFile2;
                                    lj7 lj7Var2 = lj7Var;
                                    switch (b6) {
                                        case 0:
                                            lj7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            lj7Var2.b.f0(bitmap);
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
        if (!c8bVar.K) {
            File file2 = c8bVar.L;
            if (file2 == null || TextUtils.equals(this.w, file2.getPath())) {
                return;
            }
            this.w = c8bVar.L.getPath();
            Utilities.g.c(new Runnable(this) { // from class: ij7
                public final /* synthetic */ lj7 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    c8b c8bVar2 = c8bVar;
                    final lj7 lj7Var = this.b;
                    final byte b4 = 0;
                    final byte b5 = 1;
                    switch (b3) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(c8bVar2.O0.getPath(), options);
                            c8b.B(options, hl.L(94.0f));
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(c8bVar2.O0.getPath(), options);
                            hl.c3(new Runnable() { // from class: jj7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b5;
                                    Bitmap bitmap = decodeFile;
                                    lj7 lj7Var2 = lj7Var;
                                    switch (b6) {
                                        case 0:
                                            lj7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            lj7Var2.b.f0(bitmap);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(c8bVar2.L.getPath(), options2);
                            c8b.B(options2, hl.L(94.0f));
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(c8bVar2.L.getPath(), options2);
                            hl.c3(new Runnable() { // from class: jj7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b4;
                                    Bitmap bitmap = decodeFile2;
                                    lj7 lj7Var2 = lj7Var;
                                    switch (b6) {
                                        case 0:
                                            lj7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            lj7Var2.b.f0(bitmap);
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
        Bitmap bitmap = c8bVar.M0;
        if (bitmap == null) {
            bitmap = null;
        }
        if (bitmap == null && (str = c8bVar.N) != null && str.startsWith("vthumb://")) {
            if (TextUtils.equals(this.w, c8bVar.N)) {
                return;
            }
            String str2 = c8bVar.N;
            this.w = str2;
            long parseLong = Long.parseLong(str2.substring(9));
            if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    bitmap = getContext().getContentResolver().loadThumbnail(c8bVar.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong), new Size(hl.L(94.0f), hl.L(112.0f)), null);
                } catch (Exception unused) {
                }
            }
        }
        this.b.f0(bitmap);
    }

    public final void b(boolean z, boolean z2) {
        if (this.f == z) {
            return;
        }
        this.f = z;
        if (!z2) {
            this.F.a(z);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float L = hl.L(2.0f);
        float L2 = hl.L(4.0f);
        float L3 = hl.L(94.0f);
        float L4 = hl.L(112.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(L, L2, L3, L4);
        imageReceiver.h(canvas, null);
        float L5 = hl.L(1.5f);
        Paint paint = this.c;
        paint.setStrokeWidth(L5);
        float d = this.F.d(this.f);
        if (d > 0.0f) {
            RectF rectF = hl.P;
            rectF.set(hl.L(2.0f), hl.L(4.0f), hl.L(96.0f), hl.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, hl.L(6.0f), hl.L(6.0f), paint);
        }
        this.x = (getWidth() - hl.L(17.163f)) - hl.L(3.0f);
        this.y = hl.L(3.0f) + hl.L(17.833f);
        this.E = hl.L(12.833f);
        float d2 = this.G.d(this.h);
        float a = this.r.a(0.075f);
        canvas.save();
        canvas.scale(a, a, this.x, this.y);
        if (d2 > 0.0f) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (d2 * 255.0f));
            canvas.drawCircle(this.x, this.y, this.E, paint2);
        }
        paint.setAlpha(jn7.d4);
        canvas.drawCircle(this.x, this.y, this.E - hl.L(1.0f), paint);
        if (d2 > 0.0f) {
            float f = this.x;
            float f2 = this.E;
            float f3 = this.y;
            hn hnVar = this.e;
            hnVar.o(f - f2, f3, f + f2, f3);
            hnVar.C = (int) (d2 * 255.0f);
            hnVar.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.I();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.b.K();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(hl.L(98.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(120.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z = motionEvent.getX() >= this.x - ((float) hl.L(14.0f)) && motionEvent.getX() <= this.x + ((float) hl.L(14.0f)) && motionEvent.getY() >= this.y - ((float) hl.L(14.0f)) && motionEvent.getY() <= this.y + ((float) hl.L(14.0f));
        int action = motionEvent.getAction();
        v41 v41Var = this.r;
        if (action == 0) {
            v41Var.c(z);
        } else if (motionEvent.getAction() == 1) {
            if (v41Var.i && z && (onClickListener = this.n) != null) {
                onClickListener.onClick(this);
            }
            v41Var.c(false);
        } else if (motionEvent.getAction() == 3) {
            v41Var.c(false);
        }
        return v41Var.i || super.onTouchEvent(motionEvent);
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void setPosition(int i) {
        this.e.t(i < 0 ? "" : Integer.toString(i + 1), true, true);
    }

    @Override // snb
    public final void updateColors() {
        try {
            this.d.setColor(aob.v0(aob.Fi, this.a));
            invalidate();
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
