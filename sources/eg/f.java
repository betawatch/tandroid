package eg;

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
import bi.h1;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.t6;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends FrameLayout {
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
    public e w;

    public f(Context context) {
        super(context);
        this.r = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        Paint paint = new Paint();
        this.a = paint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(-1);
        paint.setAlpha(zs.e4);
        final int i10 = 1;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(zs.e4);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        imageView.setBackgroundDrawable(t6.h0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        final int i11 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: eg.d
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        f fVar = this.b;
                        e eVar = fVar.w;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        e eVar2 = this.b.w;
                        if (eVar2 != null) {
                            eVar2.b();
                            break;
                        }
                        break;
                    default:
                        f fVar2 = this.b;
                        e eVar3 = fVar2.w;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView.setOnLongClickListener(new h1(this, 3));
        imageView.setContentDescription(cd.L0(2131754840, null));
        addView(imageView, b6.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setImageResource(R.drawable.msg_photo_cropfix);
        imageView2.setBackgroundDrawable(t6.h0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: eg.d
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        f fVar = this.b;
                        e eVar = fVar.w;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        e eVar2 = this.b.w;
                        if (eVar2 != null) {
                            eVar2.b();
                            break;
                        }
                        break;
                    default:
                        f fVar2 = this.b;
                        e eVar3 = fVar2.w;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView2.setVisibility(8);
        imageView2.setContentDescription(cd.L0(2131754922, null));
        addView(imageView2, b6.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_rotate);
        imageView3.setBackgroundDrawable(t6.h0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        final int i12 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: eg.d
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        f fVar = this.b;
                        e eVar = fVar.w;
                        if (eVar != null) {
                            fVar.setMirrored(eVar.a());
                            break;
                        }
                        break;
                    case 1:
                        e eVar2 = this.b.w;
                        if (eVar2 != null) {
                            eVar2.b();
                            break;
                        }
                        break;
                    default:
                        f fVar2 = this.b;
                        e eVar3 = fVar2.w;
                        if (eVar3 != null) {
                            fVar2.setRotated(eVar3.d());
                            break;
                        }
                        break;
                }
            }
        });
        imageView3.setContentDescription(cd.L0(2131754783, null));
        addView(imageView3, b6.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(i0.L(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i10, float f7, int i11, int i12, boolean z10, Paint paint) {
        int L = (int) ((i11 / 2.0f) - i0.L(70.0f));
        int cos = (i11 / 2) + ((int) (Math.cos(Math.toRadians(90.0f - ((i10 * 5) + f7))) * L));
        float abs = Math.abs(r8) / L;
        int min = Math.min(zs.e4, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z10) {
            paint = this.b;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        int i13 = z10 ? 4 : 2;
        int L2 = i0.L(z10 ? 16.0f : 12.0f);
        int i14 = i13 / 2;
        canvas.drawRect(cos - i14, (i12 - L2) / 2, cos + i14, (i12 + L2) / 2, paint2);
    }

    public final void b(float f7) {
        this.n = f7;
        if (Math.abs(f7) < 0.099d) {
            f7 = Math.abs(f7);
        }
        this.f = String.format("%.1fº", Float.valueOf(f7));
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
        float f7 = ((-this.n) * 2.0f) % 5.0f;
        int floor = (int) Math.floor(r0 / 5.0f);
        int i10 = 0;
        while (true) {
            Paint paint = this.b;
            if (i10 >= 16) {
                Canvas canvas2 = canvas;
                paint.setAlpha(zs.e4);
                float L = (width - i0.L(2.5f)) / 2;
                RectF rectF = this.r;
                rectF.left = L;
                rectF.top = z20.y(22.0f, height, 2);
                rectF.right = (i0.L(2.5f) + width) / 2;
                rectF.bottom = (i0.L(22.0f) + height) / 2;
                canvas2.drawRoundRect(rectF, i0.L(2.0f), i0.L(2.0f), paint);
                String str = this.f;
                TextPaint textPaint = this.h;
                canvas2.drawText(this.f, (width - textPaint.measureText(str)) / 2.0f, i0.L(14.0f), textPaint);
                return;
            }
            Paint paint2 = this.a;
            Canvas canvas3 = canvas;
            a(canvas3, i10, f7, width, height, i10 == floor || (i10 == 0 && floor == -1), (i10 < floor || (i10 == 0 && f7 < 0.0f)) ? paint : paint2);
            int i11 = i10;
            if (i11 != 0) {
                int i12 = -i11;
                a(canvas3, i12, f7, width, height, i12 == floor + 1, i12 > floor ? paint : paint2);
            }
            i10 = i11 + 1;
            canvas = canvas3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), i0.L(400.0f)), TLObject.FLAG_30), i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x10 = motionEvent.getX();
        if (actionMasked == 0) {
            this.s = x10;
            e eVar = this.w;
            if (eVar != null) {
                eVar.e();
                return true;
            }
        } else {
            if (actionMasked == 1 || actionMasked == 3) {
                e eVar2 = this.w;
                if (eVar2 != null) {
                    eVar2.c();
                }
                i0.i2(String.format("%.1f°", Float.valueOf(this.n)));
                return true;
            }
            if (actionMasked == 2) {
                float z10 = z20.z(this.n, (float) ((((this.s - x10) / i0.p) / 3.141592653589793d) / 1.649999976158142d), 45.0f, -45.0f);
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(z10 - 45.0f) < 0.001f && Math.abs(this.n - 45.0f) >= 0.001f) || (Math.abs(z10 - (-45.0f)) < 0.001f && Math.abs(this.n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.n / 2.5f) != Math.floor(z10 / 2.5f)) {
                            i0.b4(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(z10 - this.n) > 0.001d) {
                    if (Math.abs(z10) < 0.05d) {
                        z10 = 0.0f;
                    }
                    b(z10);
                    e eVar3 = this.w;
                    if (eVar3 != null) {
                        eVar3.f(this.n);
                    }
                    this.s = x10;
                }
            }
        }
        return true;
    }

    public void setAspectLock(boolean z10) {
        this.c.setColorFilter(z10 ? new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setListener(e eVar) {
        this.w = eVar;
    }

    public void setMirrored(boolean z10) {
        this.e.setColorFilter(z10 ? new PorterDuffColorFilter(t6.x0(null, t6.ng, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setRotated(boolean z10) {
        this.d.setColorFilter(z10 ? new PorterDuffColorFilter(t6.x0(null, t6.ng, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setFreeform(boolean z10) {
    }
}
