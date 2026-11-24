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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public class oh8 extends ImageView {
    public static final /* synthetic */ int M = 0;
    public Paint E;
    public ImageReceiver F;
    public vl G;
    public float H;
    public boolean I;
    public boolean J;
    public wd1 K;
    public Integer L;
    public final byte a;
    public final float[] b;
    public final bra c;
    public final wjb d;
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
    public oh8(int i, wjb wjbVar, Context context) {
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
        this.d = wjbVar;
        setImageResource(i == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i == 0) {
            bra braVar = new bra(5);
            this.c = braVar;
            braVar.g();
            braVar.L = false;
            braVar.s = (byte) 4;
            braVar.t = (byte) 4;
            braVar.r = (byte) 2;
            braVar.o = 0.1f;
            braVar.c();
            return;
        }
        if (i == 2) {
            this.f = 0.8f;
            this.y.setColor(bkb.w0(null, bkb.Z6, false));
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
        int i2 = bkb.c6;
        wjb wjbVar = this.d;
        int f = bm2.f(0.5f, HSVToColor, bkb.v0(i2, wjbVar));
        int f2 = bm2.f(0.4f, HSVToColor, bkb.v0(i2, wjbVar));
        if (this.w != null && this.r == f2 && this.s == f) {
            return;
        }
        if (this.J) {
            Paint paint = this.y;
            this.E = paint;
            paint.setAlpha(kk7.d4);
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
        ml mlVar;
        if (this.I) {
            ImageReceiver imageReceiver = this.F;
            if (imageReceiver == null || imageReceiver.n() == null) {
                vl vlVar = this.G;
                if (vlVar != null) {
                    SparseArray sparseArray = vl.r;
                    long h = vlVar.h();
                    if (h != 0) {
                        HashMap hashMap = vl.x;
                        if (hashMap == null) {
                            hashMap = new HashMap();
                            vl.x = hashMap;
                        }
                        Integer num = (Integer) hashMap.get(Long.valueOf(h));
                        if (num == null && (mlVar = vlVar.k) != null && mlVar.n() != null) {
                            HashMap hashMap2 = vl.x;
                            Long valueOf = Long.valueOf(h);
                            Integer valueOf2 = Integer.valueOf(gl.I0(vlVar.k.n()));
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
                setColor(gl.I0(this.F.n()));
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
                    nh8.d().f(-gl.L(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, nh8.d().e());
                }
                wd1 wd1Var = this.K;
                if (wd1Var == null) {
                    wd1Var = new wd1();
                    this.K = wd1Var;
                }
                wd1Var.f = getMeasuredWidth() / 2;
                wd1 wd1Var2 = this.K;
                wd1Var2.k = false;
                wd1Var2.c(this);
                canvas.drawPath(path, wd1Var2.a);
                if (wd1Var2.k) {
                    canvas.drawPath(path, wd1Var2.c);
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
                    this.y.setAlpha(kk7.d4);
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
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float width = rectF.width() / 2.0f;
        float centerY = rectF.centerY();
        float width2 = rectF.width() / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, centerY, width2, direction);
        rectF.set((getMeasuredWidth() / 2.0f) + gl.L(2.5f), gl.N(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - gl.N(0.2f), getMeasuredHeight());
        path.addRoundRect(rectF, gl.L(2.0f), gl.L(2.0f), direction);
        path.close();
        bra braVar = this.c;
        braVar.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        braVar.a.inset(gl.L(6.0f), gl.L(6.0f));
    }

    public void setAnimatedEmojiDrawable(vl vlVar) {
        this.G = vlVar;
        if (vlVar != null) {
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
            i = bkb.v(i, num.intValue());
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
