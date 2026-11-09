package og;

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
import c8.ha;
import fi.s4;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.l6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
        paint.setAlpha(qs.e4);
        final int i7 = 1;
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.b = paint2;
        paint2.setStyle(style);
        paint2.setColor(-11420173);
        paint2.setAlpha(qs.e4);
        paint2.setAntiAlias(true);
        ImageView imageView = new ImageView(context);
        this.e = imageView;
        imageView.setImageResource(R.drawable.msg_photo_flip);
        imageView.setBackgroundDrawable(l6.h0(1090519039, 1, -1));
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        final int i10 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: og.d
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
        imageView.setOnLongClickListener(new s4(this, 5));
        imageView.setContentDescription(id.M0(2131754840, null));
        addView(imageView, ha.e(70, 64, 19));
        ImageView imageView2 = new ImageView(context);
        this.c = imageView2;
        imageView2.setImageResource(R.drawable.msg_photo_cropfix);
        imageView2.setBackgroundDrawable(l6.h0(1090519039, 1, -1));
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new View.OnClickListener(this) { // from class: og.d
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
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
        imageView2.setContentDescription(id.M0(2131754922, null));
        addView(imageView2, ha.e(70, 64, 19));
        ImageView imageView3 = new ImageView(context);
        this.d = imageView3;
        imageView3.setImageResource(R.drawable.msg_photo_rotate);
        imageView3.setBackgroundDrawable(l6.h0(1090519039, 1, -1));
        imageView3.setScaleType(scaleType);
        final int i11 = 2;
        imageView3.setOnClickListener(new View.OnClickListener(this) { // from class: og.d
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
        imageView3.setContentDescription(id.M0(2131754783, null));
        addView(imageView3, ha.e(70, 64, 21));
        TextPaint textPaint = new TextPaint(1);
        this.h = textPaint;
        textPaint.setColor(-1);
        textPaint.setTextSize(g0.L(14.0f));
        setWillNotDraw(false);
        b(0.0f);
    }

    public final void a(Canvas canvas, int i7, float f10, int i10, int i11, boolean z9, Paint paint) {
        int L = (int) ((i10 / 2.0f) - g0.L(70.0f));
        int cos = (i10 / 2) + ((int) (Math.cos(Math.toRadians(90.0f - ((i7 * 5) + f10))) * L));
        float abs = Math.abs(r8) / L;
        int min = Math.min(qs.e4, Math.max(0, (int) ((1.0f - (abs * abs)) * 255.0f)));
        if (z9) {
            paint = this.b;
        }
        Paint paint2 = paint;
        paint2.setAlpha(min);
        int i12 = z9 ? 4 : 2;
        int L2 = g0.L(z9 ? 16.0f : 12.0f);
        int i13 = i12 / 2;
        canvas.drawRect(cos - i13, (i11 - L2) / 2, cos + i13, (i11 + L2) / 2, paint2);
    }

    public final void b(float f10) {
        this.n = f10;
        if (Math.abs(f10) < 0.099d) {
            f10 = Math.abs(f10);
        }
        this.f = String.format("%.1fº", Float.valueOf(f10));
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
        float f10 = ((-this.n) * 2.0f) % 5.0f;
        int floor = (int) Math.floor(r0 / 5.0f);
        int i7 = 0;
        while (true) {
            Paint paint = this.b;
            if (i7 >= 16) {
                Canvas canvas2 = canvas;
                paint.setAlpha(qs.e4);
                float L = (width - g0.L(2.5f)) / 2;
                RectF rectF = this.r;
                rectF.left = L;
                rectF.top = q.y(22.0f, height, 2);
                rectF.right = (g0.L(2.5f) + width) / 2;
                rectF.bottom = (g0.L(22.0f) + height) / 2;
                canvas2.drawRoundRect(rectF, g0.L(2.0f), g0.L(2.0f), paint);
                String str = this.f;
                TextPaint textPaint = this.h;
                canvas2.drawText(this.f, (width - textPaint.measureText(str)) / 2.0f, g0.L(14.0f), textPaint);
                return;
            }
            Paint paint2 = this.a;
            Canvas canvas3 = canvas;
            a(canvas3, i7, f10, width, height, i7 == floor || (i7 == 0 && floor == -1), (i7 < floor || (i7 == 0 && f10 < 0.0f)) ? paint : paint2);
            int i10 = i7;
            if (i10 != 0) {
                int i11 = -i10;
                a(canvas3, i11, f10, width, height, i11 == floor + 1, i11 > floor ? paint : paint2);
            }
            i7 = i10 + 1;
            canvas = canvas3;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i7), g0.L(400.0f)), TLObject.FLAG_30), i10);
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
                g0.i2(String.format("%.1f°", Float.valueOf(this.n)));
                return true;
            }
            if (actionMasked == 2) {
                float z9 = q.z(this.n, (float) ((((this.s - x10) / g0.p) / 3.141592653589793d) / 1.649999976158142d), 45.0f, -45.0f);
                if (Build.VERSION.SDK_INT >= 27) {
                    try {
                        if ((Math.abs(z9 - 45.0f) < 0.001f && Math.abs(this.n - 45.0f) >= 0.001f) || (Math.abs(z9 - (-45.0f)) < 0.001f && Math.abs(this.n - (-45.0f)) >= 0.001f)) {
                            performHapticFeedback(3, 1);
                        } else if (Math.floor(this.n / 2.5f) != Math.floor(z9 / 2.5f)) {
                            g0.c4(this);
                        }
                    } catch (Exception unused) {
                    }
                }
                if (Math.abs(z9 - this.n) > 0.001d) {
                    if (Math.abs(z9) < 0.05d) {
                        z9 = 0.0f;
                    }
                    b(z9);
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

    public void setAspectLock(boolean z9) {
        this.c.setColorFilter(z9 ? new PorterDuffColorFilter(-11420173, PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setListener(e eVar) {
        this.w = eVar;
    }

    public void setMirrored(boolean z9) {
        this.e.setColorFilter(z9 ? new PorterDuffColorFilter(l6.x0(null, l6.ng, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setRotated(boolean z9) {
        this.d.setColorFilter(z9 ? new PorterDuffColorFilter(l6.x0(null, l6.ng, false), PorterDuff.Mode.MULTIPLY) : null);
    }

    public void setFreeform(boolean z9) {
    }
}
