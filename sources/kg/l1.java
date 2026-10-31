package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.SparseArray;
import android.widget.ImageView;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.f5;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public class l1 extends ImageView {
    public static final /* synthetic */ int L = 0;
    public Paint D;
    public ImageReceiver E;
    public f5 F;
    public float G;
    public boolean H;
    public boolean I;
    public org.telegram.ui.Components.voip.g J;
    public Integer K;
    public final int a;
    public final float[] b;
    public final f2 c;
    public final p6 d;
    public boolean e;
    public final float f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public LinearGradient w;
    public final Path x;
    public Paint y;

    public l1(int i10, Context context, p6 p6Var) {
        super(context);
        this.b = new float[3];
        this.f = 1.0f;
        this.h = false;
        this.n = -1;
        this.w = null;
        this.x = new Path();
        this.y = new Paint(1);
        this.G = 1.0f;
        this.a = i10;
        this.d = p6Var;
        setImageResource(i10 == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i10 == 0) {
            f2 f2Var = new f2(5);
            this.c = f2Var;
            f2Var.g();
            f2Var.M = false;
            f2Var.s = 4;
            f2Var.t = 4;
            f2Var.r = 2;
            f2Var.o = 0.1f;
            f2Var.c();
            return;
        }
        if (i10 == 2) {
            this.f = 0.8f;
            this.y.setColor(t6.x0(null, t6.a7, false));
        } else if (i10 == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i10 == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (!this.e || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        int i10 = this.n;
        float[] fArr = this.b;
        Color.colorToHSV(i10, fArr);
        fArr[1] = fArr[1] * 1.0f;
        if (fArr[2] > 0.7f) {
            fArr[2] = 0.7f;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        int i11 = t6.d6;
        p6 p6Var = this.d;
        int f7 = i0.b.f(0.5f, HSVToColor, t6.w0(i11, p6Var));
        int f10 = i0.b.f(0.4f, HSVToColor, t6.w0(i11, p6Var));
        if (this.w != null && this.r == f10 && this.s == f7) {
            return;
        }
        if (this.I) {
            Paint paint = this.y;
            this.D = paint;
            paint.setAlpha(zs.e4);
            this.G = 0.0f;
        }
        this.y = new Paint(1);
        float measuredHeight = getMeasuredHeight();
        this.r = f10;
        this.s = f7;
        LinearGradient linearGradient = new LinearGradient(0.0f, measuredHeight, 0.0f, 0.0f, new int[]{f10, f7}, (float[]) null, Shader.TileMode.CLAMP);
        this.w = linearGradient;
        this.y.setShader(linearGradient);
        invalidate();
    }

    public ImageReceiver getImageReceiver() {
        return this.E;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.e = true;
        if (this.a != 0) {
            a();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e = false;
        Paint paint = this.y;
        if (paint != null && this.a != 2) {
            paint.setShader(null);
            this.y = null;
        }
        this.w = null;
        this.I = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int intValue;
        ag.c2 c2Var;
        if (this.H) {
            ImageReceiver imageReceiver = this.E;
            if (imageReceiver == null || imageReceiver.n() == null) {
                f5 f5Var = this.F;
                if (f5Var != null) {
                    SparseArray sparseArray = f5.r;
                    long h = f5Var.h();
                    if (h != 0) {
                        if (f5.x == null) {
                            f5.x = new HashMap();
                        }
                        Integer num = (Integer) f5.x.get(Long.valueOf(h));
                        if (num == null && (c2Var = f5Var.k) != null && c2Var.n() != null) {
                            HashMap hashMap = f5.x;
                            Long valueOf = Long.valueOf(h);
                            Integer valueOf2 = Integer.valueOf(org.telegram.messenger.i0.J0(f5Var.k.n()));
                            hashMap.put(valueOf, valueOf2);
                            num = valueOf2;
                        }
                        if (num != null) {
                            intValue = num.intValue();
                            if (intValue == 0) {
                                this.H = false;
                                setColor(intValue);
                            } else {
                                invalidate();
                            }
                        }
                    }
                    intValue = 0;
                    if (intValue == 0) {
                    }
                } else {
                    invalidate();
                }
            } else {
                this.H = false;
                setColor(org.telegram.messenger.i0.J0(this.E.n()));
            }
        }
        Paint paint = this.y;
        if (paint != null) {
            int i10 = this.a;
            if (i10 == 2) {
                float measuredWidth = getMeasuredWidth() / 2.0f;
                canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2.0f, measuredWidth, this.y);
            } else if (i10 == 0) {
                int i11 = this.n;
                Path path = this.x;
                if (i11 != 0) {
                    canvas.drawPath(path, paint);
                } else {
                    ea.f.d().f(-org.telegram.messenger.i0.L(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, ea.f.d().e());
                }
                if (this.J == null) {
                    this.J = new org.telegram.ui.Components.voip.g();
                }
                this.J.f = getMeasuredWidth() / 2;
                org.telegram.ui.Components.voip.g gVar = this.J;
                gVar.k = false;
                gVar.c(this);
                canvas.drawPath(path, gVar.a);
                if (gVar.k) {
                    canvas.drawPath(path, gVar.c);
                }
                canvas.save();
                canvas.clipPath(path);
                this.c.d(canvas);
                canvas.restore();
                invalidate();
            } else {
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                if (this.D == null) {
                    this.G = 1.0f;
                }
                float f7 = this.G;
                if (f7 != 1.0f) {
                    this.y.setAlpha((int) (f7 * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.D);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                    float f10 = this.G + 0.10666667f;
                    this.G = f10;
                    if (f10 > 1.0f) {
                        this.G = 1.0f;
                        this.D = null;
                    }
                    invalidate();
                    this.y.setAlpha(zs.e4);
                } else {
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                }
            }
        }
        float f11 = this.f;
        boolean z10 = f11 != 1.0f;
        if (z10) {
            canvas.save();
            canvas.scale(f11, f11, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.onDraw(canvas);
        if (z10) {
            canvas.restore();
        }
        this.I = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.a != 0) {
            a();
            return;
        }
        Path path = this.x;
        path.rewind();
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float width = rectF.width() / 2.0f;
        float centerY = rectF.centerY();
        float width2 = rectF.width() / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, centerY, width2, direction);
        rectF.set((getMeasuredWidth() / 2.0f) + org.telegram.messenger.i0.L(2.5f), org.telegram.messenger.i0.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - org.telegram.messenger.i0.N(0.2f), getMeasuredHeight());
        path.addRoundRect(rectF, org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(2.0f), direction);
        path.close();
        f2 f2Var = this.c;
        f2Var.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        f2Var.a.inset(org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
    }

    public void setAnimatedEmojiDrawable(f5 f5Var) {
        this.F = f5Var;
        if (f5Var != null) {
            this.H = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.K = num;
    }

    public void setColor(int i10) {
        this.h = true;
        Integer num = this.K;
        if (num != null) {
            i10 = t6.w(i10, num.intValue());
        }
        if (this.n != i10) {
            this.n = i10;
            int i11 = this.a;
            if (i11 == 0 || i11 == 2) {
                Paint paint = this.y;
                if (paint != null) {
                    paint.setColor(i10);
                }
            } else {
                a();
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.E = imageReceiver;
        if (imageReceiver != null) {
            this.H = true;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        if (this.a != 0) {
            setImageResource(z10 ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }
}
