package fg;

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
import oh.z2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.l5;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class r1 extends ImageView {
    public static final /* synthetic */ int I = 0;
    public ImageReceiver B;
    public l5 C;
    public float D;
    public boolean E;
    public boolean F;
    public org.telegram.ui.Components.voip.h G;
    public Integer H;
    public final int a;
    public final float[] b;
    public final o2 c;
    public final g6 d;
    public boolean e;
    public final float f;
    public boolean h;
    public int n;
    public int r;
    public int s;
    public LinearGradient v;
    public final Path w;
    public Paint x;
    public Paint y;

    public r1(Context context, int i10, g6 g6Var) {
        super(context);
        this.b = new float[3];
        this.f = 1.0f;
        this.h = false;
        this.n = -1;
        this.v = null;
        this.w = new Path();
        this.x = new Paint(1);
        this.D = 1.0f;
        this.a = i10;
        this.d = g6Var;
        setImageResource(i10 == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i10 == 0) {
            o2 o2Var = new o2(5);
            this.c = o2Var;
            o2Var.g();
            o2Var.M = false;
            o2Var.s = 4;
            o2Var.t = 4;
            o2Var.r = 2;
            o2Var.o = 0.1f;
            o2Var.c();
            return;
        }
        if (i10 == 2) {
            this.f = 0.8f;
            this.x.setColor(k6.w0(null, k6.a7, false));
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
        int i11 = k6.d6;
        g6 g6Var = this.d;
        int d = i0.a.d(0.5f, HSVToColor, k6.v0(i11, g6Var));
        int d10 = i0.a.d(0.4f, HSVToColor, k6.v0(i11, g6Var));
        if (this.v != null && this.r == d10 && this.s == d) {
            return;
        }
        if (this.F) {
            Paint paint = this.x;
            this.y = paint;
            paint.setAlpha(255);
            this.D = 0.0f;
        }
        this.x = new Paint(1);
        float measuredHeight = getMeasuredHeight();
        this.r = d10;
        this.s = d;
        LinearGradient linearGradient = new LinearGradient(0.0f, measuredHeight, 0.0f, 0.0f, new int[]{d10, d}, (float[]) null, Shader.TileMode.CLAMP);
        this.v = linearGradient;
        this.x.setShader(linearGradient);
        invalidate();
    }

    public ImageReceiver getImageReceiver() {
        return this.B;
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
        Paint paint = this.x;
        if (paint != null && this.a != 2) {
            paint.setShader(null);
            this.x = null;
        }
        this.v = null;
        this.F = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int intValue;
        z2 z2Var;
        if (this.E) {
            ImageReceiver imageReceiver = this.B;
            if (imageReceiver == null || imageReceiver.getBitmap() == null) {
                l5 l5Var = this.C;
                if (l5Var != null) {
                    SparseArray sparseArray = l5.q;
                    long i10 = l5Var.i();
                    if (i10 != 0) {
                        if (l5.w == null) {
                            l5.w = new HashMap();
                        }
                        Integer num = (Integer) l5.w.get(Long.valueOf(i10));
                        if (num == null && (z2Var = l5Var.k) != null && z2Var.getBitmap() != null) {
                            HashMap hashMap = l5.w;
                            Long valueOf = Long.valueOf(i10);
                            Integer valueOf2 = Integer.valueOf(AndroidUtilities.getDominantColor(l5Var.k.getBitmap()));
                            hashMap.put(valueOf, valueOf2);
                            num = valueOf2;
                        }
                        if (num != null) {
                            intValue = num.intValue();
                            if (intValue == 0) {
                                this.E = false;
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
                this.E = false;
                setColor(AndroidUtilities.getDominantColor(this.B.getBitmap()));
            }
        }
        Paint paint = this.x;
        if (paint != null) {
            int i11 = this.a;
            if (i11 == 2) {
                float measuredWidth = getMeasuredWidth() / 2.0f;
                canvas.drawCircle(measuredWidth, getMeasuredHeight() / 2.0f, measuredWidth, this.x);
            } else if (i11 == 0) {
                int i12 = this.n;
                Path path = this.w;
                if (i12 != 0) {
                    canvas.drawPath(path, paint);
                } else {
                    q1.d().f(-AndroidUtilities.dp(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, q1.d().e());
                }
                if (this.G == null) {
                    this.G = new org.telegram.ui.Components.voip.h();
                }
                this.G.f = getMeasuredWidth() / 2;
                org.telegram.ui.Components.voip.h hVar = this.G;
                hVar.k = false;
                hVar.c(this);
                canvas.drawPath(path, hVar.a);
                if (hVar.k) {
                    canvas.drawPath(path, hVar.c);
                }
                canvas.save();
                canvas.clipPath(path);
                this.c.d(canvas);
                canvas.restore();
                invalidate();
            } else {
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                float measuredHeight = getMeasuredHeight() / 2.0f;
                if (this.y == null) {
                    this.D = 1.0f;
                }
                float f10 = this.D;
                if (f10 != 1.0f) {
                    this.x.setAlpha((int) (f10 * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.x);
                    float f11 = this.D + 0.10666667f;
                    this.D = f11;
                    if (f11 > 1.0f) {
                        this.D = 1.0f;
                        this.y = null;
                    }
                    invalidate();
                    this.x.setAlpha(255);
                } else {
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.x);
                }
            }
        }
        float f12 = this.f;
        boolean z4 = f12 != 1.0f;
        if (z4) {
            canvas.save();
            canvas.scale(f12, f12, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
        }
        super.onDraw(canvas);
        if (z4) {
            canvas.restore();
        }
        this.F = true;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.a != 0) {
            a();
            return;
        }
        Path path = this.w;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        float width = rectF.width() / 2.0f;
        float centerY = rectF.centerY();
        float width2 = rectF.width() / 2.0f;
        Path.Direction direction = Path.Direction.CW;
        path.addCircle(width, centerY, width2, direction);
        rectF.set((getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(2.5f), AndroidUtilities.dpf2(5.7f) + (getMeasuredHeight() / 2.0f), getMeasuredWidth() - AndroidUtilities.dpf2(0.2f), getMeasuredHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), direction);
        path.close();
        o2 o2Var = this.c;
        o2Var.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        o2Var.a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
    }

    public void setAnimatedEmojiDrawable(l5 l5Var) {
        this.C = l5Var;
        if (l5Var != null) {
            this.E = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.H = num;
    }

    public void setColor(int i10) {
        this.h = true;
        Integer num = this.H;
        if (num != null) {
            i10 = k6.v(i10, num.intValue());
        }
        if (this.n != i10) {
            this.n = i10;
            int i11 = this.a;
            if (i11 == 0 || i11 == 2) {
                Paint paint = this.x;
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
        this.B = imageReceiver;
        if (imageReceiver != null) {
            this.E = true;
            invalidate();
        }
    }

    public void setLocked(boolean z4) {
        if (this.a != 0) {
            setImageResource(z4 ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }
}
