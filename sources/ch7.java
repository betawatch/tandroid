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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class ch7 extends View implements tjb {
    public float E;
    public final lm F;
    public final lm G;
    public final wjb a;
    public final ImageReceiver b;
    public final Paint c;
    public final Paint d;
    public final gn e;
    public boolean f;
    public boolean h;
    public View.OnClickListener n;
    public final n41 r;
    public int s;
    public String w;
    public float x;
    public float y;

    public ch7(Context context, wjb wjbVar) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.b = imageReceiver;
        Paint paint = new Paint(1);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        gn gnVar = new gn(false, false, false);
        this.e = gnVar;
        this.r = new n41(this);
        this.s = -1;
        s33 s33Var = s33.h;
        this.F = new lm(this, 0L, 320L, s33Var);
        this.G = new lm(this, 0L, 320L, s33Var);
        gnVar.setCallback(this);
        gnVar.u(-1);
        gnVar.b = 17;
        gnVar.w(gl.L(16.0f));
        gnVar.x(gl.n1("fonts/num.otf"));
        gnVar.N = gl.q.x;
        gnVar.n(0.65f, 480L, s33Var);
        gnVar.B = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        this.a = wjbVar;
        paint2.setColor(bkb.v0(bkb.Ei, wjbVar));
        imageReceiver.q0(gl.L(6.0f));
        ote.a(this);
    }

    public final void a(int i, int i2, final f4b f4bVar) {
        String str;
        if (this.s != i) {
            this.w = null;
            this.b.f();
            this.s = i;
        }
        final byte b = 1;
        final byte b2 = 0;
        this.e.t(Integer.toString(i2 + 1), false, true);
        File file = f4bVar.O0;
        if (file != null) {
            if (TextUtils.equals(this.w, file.getPath())) {
                return;
            }
            this.w = f4bVar.O0.getPath();
            Utilities.g.c(new Runnable(this) { // from class: zg7
                public final /* synthetic */ ch7 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b2;
                    f4b f4bVar2 = f4bVar;
                    final ch7 ch7Var = this.b;
                    final byte b4 = 0;
                    final byte b5 = 1;
                    switch (b3) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(f4bVar2.O0.getPath(), options);
                            f4b.B(options, gl.L(94.0f));
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(f4bVar2.O0.getPath(), options);
                            gl.d3(new Runnable() { // from class: ah7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b5;
                                    Bitmap bitmap = decodeFile;
                                    ch7 ch7Var2 = ch7Var;
                                    switch (b6) {
                                        case 0:
                                            ch7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            ch7Var2.b.f0(bitmap);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(f4bVar2.L.getPath(), options2);
                            f4b.B(options2, gl.L(94.0f));
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(f4bVar2.L.getPath(), options2);
                            gl.d3(new Runnable() { // from class: ah7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b4;
                                    Bitmap bitmap = decodeFile2;
                                    ch7 ch7Var2 = ch7Var;
                                    switch (b6) {
                                        case 0:
                                            ch7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            ch7Var2.b.f0(bitmap);
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
        if (!f4bVar.K) {
            File file2 = f4bVar.L;
            if (file2 == null || TextUtils.equals(this.w, file2.getPath())) {
                return;
            }
            this.w = f4bVar.L.getPath();
            Utilities.g.c(new Runnable(this) { // from class: zg7
                public final /* synthetic */ ch7 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    byte b3 = b;
                    f4b f4bVar2 = f4bVar;
                    final ch7 ch7Var = this.b;
                    final byte b4 = 0;
                    final byte b5 = 1;
                    switch (b3) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(f4bVar2.O0.getPath(), options);
                            f4b.B(options, gl.L(94.0f));
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(f4bVar2.O0.getPath(), options);
                            gl.d3(new Runnable() { // from class: ah7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b5;
                                    Bitmap bitmap = decodeFile;
                                    ch7 ch7Var2 = ch7Var;
                                    switch (b6) {
                                        case 0:
                                            ch7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            ch7Var2.b.f0(bitmap);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            BitmapFactory.decodeFile(f4bVar2.L.getPath(), options2);
                            f4b.B(options2, gl.L(94.0f));
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(f4bVar2.L.getPath(), options2);
                            gl.d3(new Runnable() { // from class: ah7
                                @Override // java.lang.Runnable
                                public final void run() {
                                    byte b6 = b4;
                                    Bitmap bitmap = decodeFile2;
                                    ch7 ch7Var2 = ch7Var;
                                    switch (b6) {
                                        case 0:
                                            ch7Var2.b.f0(bitmap);
                                            break;
                                        default:
                                            ch7Var2.b.f0(bitmap);
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
        Bitmap bitmap = f4bVar.M0;
        if (bitmap == null) {
            bitmap = null;
        }
        if (bitmap == null && (str = f4bVar.N) != null && str.startsWith("vthumb://")) {
            if (TextUtils.equals(this.w, f4bVar.N)) {
                return;
            }
            String str2 = f4bVar.N;
            this.w = str2;
            long parseLong = Long.parseLong(str2.substring(9));
            if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    bitmap = getContext().getContentResolver().loadThumbnail(f4bVar.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong), new Size(gl.L(94.0f), gl.L(112.0f)), null);
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
        float L = gl.L(2.0f);
        float L2 = gl.L(4.0f);
        float L3 = gl.L(94.0f);
        float L4 = gl.L(112.0f);
        ImageReceiver imageReceiver = this.b;
        imageReceiver.i0(L, L2, L3, L4);
        imageReceiver.h(canvas, null);
        float L5 = gl.L(1.5f);
        Paint paint = this.c;
        paint.setStrokeWidth(L5);
        float d = this.F.d(this.f);
        if (d > 0.0f) {
            RectF rectF = gl.P;
            rectF.set(gl.L(2.0f), gl.L(4.0f), gl.L(96.0f), gl.L(116.0f));
            paint.setAlpha((int) (d * 255.0f));
            canvas.drawRoundRect(rectF, gl.L(6.0f), gl.L(6.0f), paint);
        }
        this.x = (getWidth() - gl.L(17.163f)) - gl.L(3.0f);
        this.y = gl.L(3.0f) + gl.L(17.833f);
        this.E = gl.L(12.833f);
        float d2 = this.G.d(this.h);
        float a = this.r.a(0.075f);
        canvas.save();
        canvas.scale(a, a, this.x, this.y);
        if (d2 > 0.0f) {
            Paint paint2 = this.d;
            paint2.setAlpha((int) (d2 * 255.0f));
            canvas.drawCircle(this.x, this.y, this.E, paint2);
        }
        paint.setAlpha(kk7.d4);
        canvas.drawCircle(this.x, this.y, this.E - gl.L(1.0f), paint);
        if (d2 > 0.0f) {
            float f = this.x;
            float f2 = this.E;
            float f3 = this.y;
            gn gnVar = this.e;
            gnVar.o(f - f2, f3, f + f2, f3);
            gnVar.C = (int) (d2 * 255.0f);
            gnVar.draw(canvas);
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
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(gl.L(98.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(120.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z = motionEvent.getX() >= this.x - ((float) gl.L(14.0f)) && motionEvent.getX() <= this.x + ((float) gl.L(14.0f)) && motionEvent.getY() >= this.y - ((float) gl.L(14.0f)) && motionEvent.getY() <= this.y + ((float) gl.L(14.0f));
        int action = motionEvent.getAction();
        n41 n41Var = this.r;
        if (action == 0) {
            n41Var.c(z);
        } else if (motionEvent.getAction() == 1) {
            if (n41Var.i && z && (onClickListener = this.n) != null) {
                onClickListener.onClick(this);
            }
            n41Var.c(false);
        } else if (motionEvent.getAction() == 3) {
            n41Var.c(false);
        }
        return n41Var.i || super.onTouchEvent(motionEvent);
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.n = onClickListener;
    }

    public void setPosition(int i) {
        this.e.t(i < 0 ? "" : Integer.toString(i + 1), true, true);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            this.d.setColor(bkb.v0(bkb.Ei, this.a));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.e || super.verifyDrawable(drawable);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
