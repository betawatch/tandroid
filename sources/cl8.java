// default package

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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public class cl8 extends ImageView {
    public static final /* synthetic */ int M = 0;
    public Paint E;
    public ImageReceiver F;
    public wl G;
    public float H;
    public boolean I;
    public boolean J;
    public fe1 K;
    public Integer L;
    public final byte a;
    public final float[] b;
    public final dva c;
    public final vnb d;
    public boolean e;
    public final float f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public LinearGradient w;
    public final Path x;
    public Paint y;

    /* JADX WARN: Multi-variable type inference failed */
    public cl8(int i, vnb vnbVar, Context context) {
        super(context);
        this.b = new float[3];
        this.f = 1.0f;
        this.h = false;
        this.n = -1;
        this.w = null;
        this.x = new Path();
        this.y = new Paint(1);
        this.H = 1.0f;
        this.a = i;
        this.d = vnbVar;
        setImageResource(i == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i == 0) {
            dva dvaVar = new dva(5);
            this.c = dvaVar;
            dvaVar.g();
            dvaVar.L = false;
            dvaVar.s = (byte) 4;
            dvaVar.t = (byte) 4;
            dvaVar.r = (byte) 2;
            dvaVar.o = 0.1f;
            dvaVar.c();
            return;
        }
        if (i == 2) {
            this.f = 0.8f;
            this.y.setColor(aob.w0(null, aob.a7, false));
        } else if (i == 3) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_archive_hide);
        } else if (i == 4) {
            setScaleType(ImageView.ScaleType.CENTER);
            setImageResource(R.drawable.msg_limit_pin);
        }
    }

    public final void a() {
        if (!this.e || getMeasuredHeight() == 0 || getMeasuredWidth() == 0) {
            return;
        }
        int i = this.n;
        float[] fArr = this.b;
        Color.colorToHSV(i, fArr);
        fArr[1] = fArr[1] * 1.0f;
        if (fArr[2] > 0.7f) {
            fArr[2] = 0.7f;
        }
        int HSVToColor = Color.HSVToColor(fArr);
        int i2 = aob.d6;
        vnb vnbVar = this.d;
        int f = vm2.f(0.5f, HSVToColor, aob.v0(i2, vnbVar));
        int f2 = vm2.f(0.4f, HSVToColor, aob.v0(i2, vnbVar));
        if (this.w != null && this.r == f2 && this.s == f) {
            return;
        }
        if (this.J) {
            Paint paint = this.y;
            this.E = paint;
            paint.setAlpha(jn7.d4);
            this.H = 0.0f;
        }
        this.y = new Paint(1);
        float measuredHeight = getMeasuredHeight();
        this.r = f2;
        this.s = f;
        LinearGradient linearGradient = new LinearGradient(0.0f, measuredHeight, 0.0f, 0.0f, new int[]{f2, f}, (float[]) null, Shader.TileMode.CLAMP);
        this.w = linearGradient;
        this.y.setShader(linearGradient);
        invalidate();
    }

    public ImageReceiver getImageReceiver() {
        return this.F;
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
        this.J = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0078  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int i;
        nl nlVar;
        if (this.I) {
            ImageReceiver imageReceiver = this.F;
            if (imageReceiver == null || imageReceiver.n() == null) {
                wl wlVar = this.G;
                if (wlVar != null) {
                    SparseArray sparseArray = wl.r;
                    long h = wlVar.h();
                    if (h != 0) {
                        HashMap hashMap = wl.x;
                        if (hashMap == null) {
                            hashMap = new HashMap();
                            wl.x = hashMap;
                        }
                        Integer num = (Integer) hashMap.get(Long.valueOf(h));
                        if (num == null && (nlVar = wlVar.k) != null && nlVar.n() != null) {
                            HashMap hashMap2 = wl.x;
                            Long valueOf = Long.valueOf(h);
                            Integer valueOf2 = Integer.valueOf(hl.I0(wlVar.k.n()));
                            hashMap2.put(valueOf, valueOf2);
                            num = valueOf2;
                        }
                        if (num != null) {
                            i = num.intValue();
                            if (i == 0) {
                                this.I = false;
                                setColor(i);
                            } else {
                                invalidate();
                            }
                        }
                    }
                    i = 0;
                    if (i == 0) {
                    }
                } else {
                    invalidate();
                }
            } else {
                this.I = false;
                setColor(hl.I0(this.F.n()));
            }
        }
        Paint paint = this.y;
        if (paint != null) {
            byte b = this.a;
            if (b == 2) {
                float measuredWidth = getMeasuredWidth() / 2.0f;
                canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2.0f, measuredWidth, this.y);
            } else if (b == 0) {
                int i2 = this.n;
                Path path = this.x;
                if (i2 != 0) {
                    canvas.drawPath(path, paint);
                } else {
                    bl8.d().f(-hl.L(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, bl8.d().e());
                }
                fe1 fe1Var = this.K;
                if (fe1Var == null) {
                    fe1Var = new fe1();
                    this.K = fe1Var;
                }
                fe1Var.f = getMeasuredWidth() / 2;
                fe1 fe1Var2 = this.K;
                fe1Var2.k = false;
                fe1Var2.c(this);
                canvas.drawPath(path, fe1Var2.a);
                if (fe1Var2.k) {
                    canvas.drawPath(path, fe1Var2.c);
                }
                canvas.save();
                canvas.clipPath(path);
                this.c.d(canvas);
                canvas.restore();
                invalidate();
            } else {
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                if (this.E == null) {
                    this.H = 1.0f;
                }
                float f = this.H;
                Paint paint2 = this.y;
                if (f != 1.0f) {
                    paint2.setAlpha((int) (f * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.E);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                    float f2 = this.H + 0.10666667f;
                    this.H = f2;
                    if (f2 > 1.0f) {
                        this.H = 1.0f;
                        this.E = null;
                    }
                    invalidate();
                    this.y.setAlpha(jn7.d4);
                } else {
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, paint2);
                }
            }
        }
        float f3 = this.f;
        boolean z = f3 != 1.0f;
        if (z) {
            canvas.save();
            canvas.scale(f3, f3, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.onDraw(canvas);
        if (z) {
            canvas.restore();
        }
        this.J = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.a != 0) {
            a();
            return;
        }
        Path path = this.x;
        path.rewind();
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float width = rectF.width() / 2.0f;
        float centerY = rectF.centerY();
        float width2 = rectF.width() / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, centerY, width2, direction);
        rectF.set((getMeasuredWidth() / 2.0f) + hl.L(2.5f), hl.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - hl.N(0.2f), getMeasuredHeight());
        path.addRoundRect(rectF, hl.L(2.0f), hl.L(2.0f), direction);
        path.close();
        dva dvaVar = this.c;
        dvaVar.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        dvaVar.a.inset(hl.L(6.0f), hl.L(6.0f));
    }

    public void setAnimatedEmojiDrawable(wl wlVar) {
        this.G = wlVar;
        if (wlVar != null) {
            this.I = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.L = num;
    }

    public void setColor(int i) {
        this.h = true;
        Integer num = this.L;
        if (num != null) {
            i = aob.v(i, num.intValue());
        }
        if (this.n != i) {
            this.n = i;
            byte b = this.a;
            if (b == 0 || b == 2) {
                Paint paint = this.y;
                if (paint != null) {
                    paint.setColor(i);
                }
            } else {
                a();
            }
            invalidate();
        }
    }

    public void setImageReceiver(ImageReceiver imageReceiver) {
        this.F = imageReceiver;
        if (imageReceiver != null) {
            this.I = true;
            invalidate();
        }
    }

    public void setLocked(boolean z) {
        if (this.a != 0) {
            setImageResource(z ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }
}
