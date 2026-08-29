package cg;

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
import lh.x2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.p5;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public class t1 extends ImageView {
    public static final /* synthetic */ int H = 0;
    public ImageReceiver A;
    public p5 B;
    public float C;
    public boolean D;
    public boolean E;
    public org.telegram.ui.Components.voip.h F;
    public Integer G;
    public final int a;
    public final float[] b;
    public final r2 c;
    public final c6 d;
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

    public t1(Context context, int i10, c6 c6Var) {
        super(context);
        this.b = new float[3];
        this.f = 1.0f;
        this.h = false;
        this.n = -1;
        this.v = null;
        this.w = new Path();
        this.x = new Paint(1);
        this.C = 1.0f;
        this.a = i10;
        this.d = c6Var;
        setImageResource(i10 == 0 ? R.drawable.msg_premium_lock2 : R.drawable.msg_mini_premiumlock);
        if (i10 == 0) {
            r2 r2Var = new r2(5);
            this.c = r2Var;
            r2Var.g();
            r2Var.M = false;
            r2Var.s = 4;
            r2Var.t = 4;
            r2Var.r = 2;
            r2Var.o = 0.1f;
            r2Var.c();
            return;
        }
        if (i10 == 2) {
            this.f = 0.8f;
            this.x.setColor(g6.w0(null, g6.a7, false));
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
        int i11 = g6.d6;
        c6 c6Var = this.d;
        int d = i0.a.d(0.5f, HSVToColor, g6.v0(i11, c6Var));
        int d10 = i0.a.d(0.4f, HSVToColor, g6.v0(i11, c6Var));
        if (this.v != null && this.r == d10 && this.s == d) {
            return;
        }
        if (this.E) {
            Paint paint = this.x;
            this.y = paint;
            paint.setAlpha(255);
            this.C = 0.0f;
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
        return this.A;
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
        this.E = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        int intValue;
        x2 x2Var;
        if (this.D) {
            ImageReceiver imageReceiver = this.A;
            if (imageReceiver == null || imageReceiver.getBitmap() == null) {
                p5 p5Var = this.B;
                if (p5Var != null) {
                    SparseArray sparseArray = p5.q;
                    long i10 = p5Var.i();
                    if (i10 != 0) {
                        if (p5.w == null) {
                            p5.w = new HashMap();
                        }
                        Integer num = (Integer) p5.w.get(Long.valueOf(i10));
                        if (num == null && (x2Var = p5Var.k) != null && x2Var.getBitmap() != null) {
                            HashMap hashMap = p5.w;
                            Long valueOf = Long.valueOf(i10);
                            Integer valueOf2 = Integer.valueOf(AndroidUtilities.getDominantColor(p5Var.k.getBitmap()));
                            hashMap.put(valueOf, valueOf2);
                            num = valueOf2;
                        }
                        if (num != null) {
                            intValue = num.intValue();
                            if (intValue == 0) {
                                this.D = false;
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
                this.D = false;
                setColor(AndroidUtilities.getDominantColor(this.A.getBitmap()));
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
                    s1.d().f(-AndroidUtilities.dp(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, s1.d().e());
                }
                if (this.F == null) {
                    this.F = new org.telegram.ui.Components.voip.h();
                }
                this.F.f = getMeasuredWidth() / 2;
                org.telegram.ui.Components.voip.h hVar = this.F;
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
                    this.C = 1.0f;
                }
                float f9 = this.C;
                if (f9 != 1.0f) {
                    this.x.setAlpha((int) (f9 * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.x);
                    float f10 = this.C + 0.10666667f;
                    this.C = f10;
                    if (f10 > 1.0f) {
                        this.C = 1.0f;
                        this.y = null;
                    }
                    invalidate();
                    this.x.setAlpha(255);
                } else {
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.x);
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
        this.E = true;
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
        r2 r2Var = this.c;
        r2Var.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        r2Var.a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
    }

    public void setAnimatedEmojiDrawable(p5 p5Var) {
        this.B = p5Var;
        if (p5Var != null) {
            this.D = true;
            invalidate();
        }
    }

    public void setBlendWithColor(Integer num) {
        this.G = num;
    }

    public void setColor(int i10) {
        this.h = true;
        Integer num = this.G;
        if (num != null) {
            i10 = g6.v(i10, num.intValue());
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
        this.A = imageReceiver;
        if (imageReceiver != null) {
            this.D = true;
            invalidate();
        }
    }

    public void setLocked(boolean z10) {
        if (this.a != 0) {
            setImageResource(z10 ? R.drawable.msg_mini_premiumlock : R.drawable.msg_mini_stickerstar);
        }
    }
}
