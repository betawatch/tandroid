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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class fj7 extends View implements vlb {
    public float E;
    public final ln F;
    public final ln G;
    public final ylb a;
    public final ImageReceiver b;
    public final Paint c;
    public final Paint d;
    public final ho e;
    public boolean f;
    public boolean h;
    public View.OnClickListener n;
    public final u51 r;
    public int s;
    public String w;
    public float x;
    public float y;

    public fj7(Context context, ylb ylbVar) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        ho hoVar = new ho(false, false, false);
        this.e = hoVar;
        this.r = new u51(this);
        this.s = -1;
        d53 d53Var = d53.h;
        this.F = new ln(this, 0L, 320L, d53Var);
        this.G = new ln(this, 0L, 320L, d53Var);
        hoVar.setCallback(this);
        hoVar.u(-1);
        hoVar.b = 17;
        hoVar.w(gm.L(16.0f));
        hoVar.x(gm.n1("fonts/num.otf"));
        hoVar.N = gm.q.x;
        hoVar.n(0.65f, 480L, d53Var);
        hoVar.B = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.a = ylbVar;
        paint2.setColor(cmb.v0(cmb.Ei, ylbVar));
        imageReceiver.q0(gm.L(6.0f));
        rve.a(this);
    }

    public final void a(int i, int i2, final g6b g6bVar) {
        String str;
        if (this.s != i) {
            this.w = null;
            this.b.f();
            this.s = i;
        }
        final byte b = 1;
        final byte b2 = 0;
        this.e.t(Integer.toString(i2 + 1), false, true);
        File file = g6bVar.O0;
        if (file != null) {
            if (TextUtils.equals(this.w, file.getPath())) {
                return;
            }
            this.w = g6bVar.O0.getPath();
            Utilities.g.c(new Runnable(this) { // from class: cj7
                public final /* synthetic */ fj7 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    g6b g6bVar2 = g6bVar;
                    final fj7 fj7Var = this.b;
                    final byte b4 = 0;
                    final byte b5 = 1;
                    switch (b3) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(g6bVar2.O0.getPath(), options);
                            g6b.B(options, gm.L(94.0f));
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(g6bVar2.O0.getPath(), options);
                            gm.c3(new Runnable() { // from class: dj7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b5;
                                    Bitmap bitmap = decodeFile;
                                    fj7 fj7Var2 = fj7Var;
                                    switch (b6) {
                                        case 0:
                                            fj7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            fj7Var2.b.f0(bitmap);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(g6bVar2.L.getPath(), options2);
                            g6b.B(options2, gm.L(94.0f));
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(g6bVar2.L.getPath(), options2);
                            gm.c3(new Runnable() { // from class: dj7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b4;
                                    Bitmap bitmap = decodeFile2;
                                    fj7 fj7Var2 = fj7Var;
                                    switch (b6) {
                                        case 0:
                                            fj7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            fj7Var2.b.f0(bitmap);
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
        if (!g6bVar.K) {
            File file2 = g6bVar.L;
            if (file2 == null || TextUtils.equals(this.w, file2.getPath())) {
                return;
            }
            this.w = g6bVar.L.getPath();
            Utilities.g.c(new Runnable(this) { // from class: cj7
                public final /* synthetic */ fj7 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    g6b g6bVar2 = g6bVar;
                    final fj7 fj7Var = this.b;
                    final byte b4 = 0;
                    final byte b5 = 1;
                    switch (b3) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(g6bVar2.O0.getPath(), options);
                            g6b.B(options, gm.L(94.0f));
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(g6bVar2.O0.getPath(), options);
                            gm.c3(new Runnable() { // from class: dj7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b5;
                                    Bitmap bitmap = decodeFile;
                                    fj7 fj7Var2 = fj7Var;
                                    switch (b6) {
                                        case 0:
                                            fj7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            fj7Var2.b.f0(bitmap);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(g6bVar2.L.getPath(), options2);
                            g6b.B(options2, gm.L(94.0f));
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(g6bVar2.L.getPath(), options2);
                            gm.c3(new Runnable() { // from class: dj7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b4;
                                    Bitmap bitmap = decodeFile2;
                                    fj7 fj7Var2 = fj7Var;
                                    switch (b6) {
                                        case 0:
                                            fj7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            fj7Var2.b.f0(bitmap);
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
        Bitmap bitmap = g6bVar.M0;
        if (bitmap == null) {
            bitmap = null;
        }
        if (bitmap == null && (str = g6bVar.N) != null && str.startsWith("vthumb://")) {
            if (TextUtils.equals(this.w, g6bVar.N)) {
                return;
            }
            String str2 = g6bVar.N;
            this.w = str2;
            long parseLong = Long.parseLong(str2.substring(9));
            if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    bitmap = getContext().getContentResolver().loadThumbnail(g6bVar.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong), new Size(gm.L(94.0f), gm.L(112.0f)), null);
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
        float L = gm.L(2.0f);
        float L2 = gm.L(4.0f);
        float L3 = gm.L(94.0f);
        float L4 = gm.L(112.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(L, L2, L3, L4);
        imageReceiver.h(canvas, null);
        float L5 = gm.L(1.5f);
        Paint paint = this.c;
        paint.setStrokeWidth(L5);
        float d = this.F.d(this.f);
        if (d > 0.0f) {
            RectF rectF = gm.P;
            rectF.set(gm.L(2.0f), gm.L(4.0f), gm.L(96.0f), gm.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, gm.L(6.0f), gm.L(6.0f), paint);
        }
        this.x = (getWidth() - gm.L(17.163f)) - gm.L(3.0f);
        this.y = gm.L(3.0f) + gm.L(17.833f);
        this.E = gm.L(12.833f);
        float d2 = this.G.d(this.h);
        float a = this.r.a(0.075f);
        canvas.save();
        canvas.scale(a, a, this.x, this.y);
        if (d2 > 0.0f) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (d2 * 255.0f));
            canvas.drawCircle(this.x, this.y, this.E, paint2);
        }
        paint.setAlpha(nm7.d4);
        canvas.drawCircle(this.x, this.y, this.E - gm.L(1.0f), paint);
        if (d2 > 0.0f) {
            float f = this.x;
            float f2 = this.E;
            float f3 = this.y;
            ho hoVar = this.e;
            hoVar.o(f - f2, f3, f + f2, f3);
            hoVar.C = (int) (d2 * 255.0f);
            hoVar.draw(canvas);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.L(98.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(120.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z = motionEvent.getX() >= this.x - ((float) gm.L(14.0f)) && motionEvent.getX() <= this.x + ((float) gm.L(14.0f)) && motionEvent.getY() >= this.y - ((float) gm.L(14.0f)) && motionEvent.getY() <= this.y + ((float) gm.L(14.0f));
        int action = motionEvent.getAction();
        u51 u51Var = this.r;
        if (action == 0) {
            u51Var.c(z);
        } else if (motionEvent.getAction() == 1) {
            if (u51Var.i && z && (onClickListener = this.n) != null) {
                onClickListener.onClick(this);
            }
            u51Var.c(false);
        } else if (motionEvent.getAction() == 3) {
            u51Var.c(false);
        }
        return u51Var.i || super.onTouchEvent(motionEvent);
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void setPosition(int i) {
        this.e.t(i < 0 ? "" : Integer.toString(i + 1), true, true);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.d.setColor(cmb.v0(cmb.Ei, this.a));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
