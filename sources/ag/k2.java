package ag;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k5;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public class k2 extends ImageView {
    public static final /* synthetic */ int H = 0;
    public ImageReceiver A;
    public k5 B;
    public float C;
    public boolean D;
    public boolean E;
    public org.telegram.ui.Components.voip.h F;
    public Integer G;
    public final int a;
    public final float[] b;
    public final j3 c;
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

    public k2(Context context, int i10, c6 c6Var) {
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
            j3 j3Var = new j3(5);
            this.c = j3Var;
            j3Var.g();
            j3Var.M = false;
            j3Var.s = 4;
            j3Var.t = 4;
            j3Var.r = 2;
            j3Var.o = 0.1f;
            j3Var.c();
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
        int d = i0.b.d(0.5f, HSVToColor, g6.v0(i11, c6Var));
        int d10 = i0.b.d(0.4f, HSVToColor, g6.v0(i11, c6Var));
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
        jh.y2 y2Var;
        if (this.D) {
            ImageReceiver imageReceiver = this.A;
            if (imageReceiver == null || imageReceiver.getBitmap() == null) {
                k5 k5Var = this.B;
                if (k5Var != null) {
                    SparseArray sparseArray = k5.q;
                    long i10 = k5Var.i();
                    if (i10 != 0) {
                        if (k5.w == null) {
                            k5.w = new HashMap();
                        }
                        Integer num = (Integer) k5.w.get(Long.valueOf(i10));
                        if (num == null && (y2Var = k5Var.k) != null && y2Var.getBitmap() != null) {
                            HashMap hashMap = k5.w;
                            Long valueOf = Long.valueOf(i10);
                            Integer valueOf2 = Integer.valueOf(AndroidUtilities.getDominantColor(k5Var.k.getBitmap()));
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
                    j2.d().f(-AndroidUtilities.dp(24.0f), 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    canvas.drawPath(path, j2.d().e());
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
                float f10 = this.C;
                if (f10 != 1.0f) {
                    this.x.setAlpha((int) (f10 * 255.0f));
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.y);
                    canvas.drawCircle(measuredWidth2, measuredHeight, measuredWidth2, this.x);
                    float f11 = this.C + 0.10666667f;
                    this.C = f11;
                    if (f11 > 1.0f) {
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
        float f12 = this.f;
        boolean z10 = f12 != 1.0f;
        if (z10) {
            canvas.save();
            canvas.scale(f12, f12, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
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
        j3 j3Var = this.c;
        j3Var.a.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        j3Var.a.inset(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
    }

    public void setAnimatedEmojiDrawable(k5 k5Var) {
        this.B = k5Var;
        if (k5Var != null) {
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
