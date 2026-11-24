// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.os.Build;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class b33 extends FrameLayout {
    public final Paint a;
    public final Paint b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public String f;
    public final TextPaint h;
    public float n;
    public final RectF r;
    public float s;
    public a33 w;

    public b33(Context context) {
        super(context);
        this.r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(kk7.d4);
        final byte b = 1;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(kk7.d4);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        imageView.setBackgroundDrawable(bkb.f0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        final byte b2 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: z23
            public final /* synthetic */ b33 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                b33 b33Var = this.b;
                switch (b3) {
                    case 0:
                        a33 a33Var = b33Var.w;
                        if (a33Var != null) {
                            b33Var.setMirrored(a33Var.a());
                            break;
                        }
                        break;
                    case 1:
                        a33 a33Var2 = b33Var.w;
                        if (a33Var2 != null) {
                            a33Var2.b();
                            break;
                        }
                        break;
                    default:
                        a33 a33Var3 = b33Var.w;
                        if (a33Var3 != null) {
                            b33Var.setRotated(a33Var3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setOnLongClickListener(new zs(this, (byte) 3));
        imageView.setContentDescription(k96.M0(2131754839, null));
        addView(imageView, nme.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setImageResource(R.drawable.msg_photo_cropfix);
        imageView2.setBackgroundDrawable(bkb.f0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: z23
            public final /* synthetic */ b33 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                b33 b33Var = this.b;
                switch (b3) {
                    case 0:
                        a33 a33Var = b33Var.w;
                        if (a33Var != null) {
                            b33Var.setMirrored(a33Var.a());
                            break;
                        }
                        break;
                    case 1:
                        a33 a33Var2 = b33Var.w;
                        if (a33Var2 != null) {
                            a33Var2.b();
                            break;
                        }
                        break;
                    default:
                        a33 a33Var3 = b33Var.w;
                        if (a33Var3 != null) {
                            b33Var.setRotated(a33Var3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(k96.M0(2131754922, null));
        addView(imageView2, nme.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_rotate);
        imageView3.setBackgroundDrawable(bkb.f0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        final byte b3 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: z23
            public final /* synthetic */ b33 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                b33 b33Var = this.b;
                switch (b32) {
                    case 0:
                        a33 a33Var = b33Var.w;
                        if (a33Var != null) {
                            b33Var.setMirrored(a33Var.a());
                            break;
                        }
                        break;
                    case 1:
                        a33 a33Var2 = b33Var.w;
                        if (a33Var2 != null) {
                            a33Var2.b();
                            break;
                        }
                        break;
                    default:
                        a33 a33Var3 = b33Var.w;
                        if (a33Var3 != null) {
                            b33Var.setRotated(a33Var3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView3.setContentDescription(k96.M0(2131754782, null));
        addView(imageView3, nme.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(gl.L(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i, float f, int i2, int i3, boolean z, Paint paint) {
        int L;
        int i4;
        int L2 = (int) ((i2 / 2.0f) - gl.L(70.0f));
        int cos = (i2 / 2) + ((int) (Math.cos(Math.toRadians(90.0f - ((i * 5) + f))) * L2));
        float abs = Math.abs(r8) / L2;
        int min = Math.min(kk7.d4, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z) {
            paint = this.b;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        if (z) {
            L = gl.L(16.0f);
            i4 = 4;
        } else {
            L = gl.L(12.0f);
            i4 = 2;
        }
        int i5 = i4 / 2;
        canvas.drawRect(cos - i5, (i3 - L) / 2, cos + i5, (i3 + L) / 2, paint2);
    }

    public final void b(float f) {
        this.n = f;
        if (Math.abs(f) < 0.099d) {
            f = Math.abs(f);
        }
        this.f = String.format("%.1fº", Float.valueOf(f));
        invalidate();
    }

    @Override // android.view.View
    public float getRotation() {
        return this.n;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        float f = ((-this.n) * 2.0f) % 5.0f;
        int floor = (int) Math.floor(r0 / 5.0f);
        int i = 0;
        while (true) {
            Paint paint = this.b;
            if (i >= 16) {
                b33 b33Var = this;
                Canvas canvas2 = canvas;
                paint.setAlpha(kk7.d4);
                float L = (width - gl.L(2.5f)) / 2;
                RectF rectF = b33Var.r;
                rectF.left = L;
                rectF.top = ug8.D(22.0f, height, 2);
                rectF.right = (gl.L(2.5f) + width) / 2;
                rectF.bottom = (gl.L(22.0f) + height) / 2;
                canvas2.drawRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), paint);
                String str = b33Var.f;
                TextPaint textPaint = b33Var.h;
                canvas2.drawText(b33Var.f, (width - textPaint.measureText(str)) / 2.0f, gl.L(14.0f), textPaint);
                return;
            }
            Paint paint2 = this.a;
            b33 b33Var2 = this;
            Canvas canvas3 = canvas;
            b33Var2.a(canvas3, i, f, width, height, i == floor || (i == 0 && floor == -1), (i < floor || (i == 0 && f < 0.0f)) ? paint : paint2);
            int i2 = i;
            if (i2 != 0) {
                int i3 = -i2;
                b33Var2.a(canvas3, i3, f, width, height, i3 == floor + 1, i3 > floor ? paint : paint2);
            }
            i = i2 + 1;
            this = b33Var2;
            canvas = canvas3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i), gl.L(400.0f)), TLObject.FLAG_30), i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        if (actionMasked == 0) {
            this.s = x;
            a33 a33Var = this.w;
            if (a33Var != null) {
                a33Var.e();
                return true;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                a33 a33Var2 = this.w;
                if (a33Var2 != null) {
                    a33Var2.c();
                }
                gl.g2(String.format("%.1f°", Float.valueOf(this.n)));
                return true;
            }
            if (actionMasked == 2) {
                float f = yjb.f(this.n, (float) ((((this.s - x) / gl.p) / 3.141592653589793d) / 1.649999976158142d), 45.0f, -45.0f);
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(f - 45.0f) < 0.001f && Math.abs(this.n - 45.0f) >= 0.001f) || (Math.abs(f - (-45.0f)) < 0.001f && Math.abs(this.n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.n / 2.5f) != Math.floor(f / 2.5f)) {
                            gl.W3(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(f - this.n) > 0.001d) {
                    if (Math.abs(f) < 0.05d) {
                        f = 0.0f;
                    }
                    b(f);
                    a33 a33Var3 = this.w;
                    if (a33Var3 != null) {
                        a33Var3.f(this.n);
                    }
                    this.s = x;
                }
            }
        }
        return true;
    }

    public void setAspectLock(boolean z) {
        this.c.setColorFilter(z ? new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setListener(a33 a33Var) {
        this.w = a33Var;
    }

    public void setMirrored(boolean z) {
        this.e.setColorFilter(z ? new PorterDuffColorFilter(bkb.w0(null, bkb.pg, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setRotated(boolean z) {
        this.d.setColorFilter(z ? new PorterDuffColorFilter(bkb.w0(null, bkb.pg, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setFreeform(boolean z) {
    }
}
