// default package

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class hb1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ qb1 b;

    public /* synthetic */ hb1(qb1 qb1Var, byte b) {
        this.a = b;
        this.b = qb1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        qb1 qb1Var = this.b;
        switch (b) {
            case 0:
                qb1Var.t();
                break;
            default:
                boolean z = qb1Var.m0;
                FrameLayout frameLayout = qb1Var.K;
                nb1 nb1Var = qb1Var.r;
                kb1 kb1Var = qb1Var.f;
                if (qb1Var.p0 != z) {
                    qb1Var.p0 = z;
                    ValueAnimator valueAnimator = qb1Var.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        qb1Var.q0 = null;
                    }
                    pcc pccVar = qb1Var.k0;
                    if (pccVar != null) {
                        pccVar.a(Boolean.valueOf(z));
                    }
                    qb1Var.d(z);
                    if (z) {
                        mb1 mb1Var = qb1Var.N;
                        if (mb1Var != null) {
                            mb1Var.setVisibility(0);
                        }
                        nb1Var.setVisibility(0);
                    } else {
                        kb1Var.getEditText().scrollBy(0, -kb1Var.getEditText().getScrollY());
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(qb1Var.o0, z ? 1.0f : 0.0f);
                    qb1Var.q0 = ofFloat;
                    ofFloat.addUpdateListener(new g0(qb1Var, (byte) 25));
                    if (!z) {
                        kb1Var.getEditText().setAllowDrawCursor(false);
                    }
                    qb1Var.q0.addListener(new z7((byte) 11, (Object) qb1Var, z));
                    ValueAnimator valueAnimator2 = qb1Var.q0;
                    if (z) {
                        valueAnimator2.setInterpolator(hb.w);
                        qb1Var.q0.setDuration(250L);
                    } else {
                        valueAnimator2.setInterpolator(new x84());
                        qb1Var.q0.setDuration(420L);
                    }
                    qb1Var.q0.start();
                    xt3 editText = kb1Var.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = qb1Var.g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        kb1Var.setSelection(z ? kb1Var.a.length() : 0);
                        kb1Var.getEditText().setForceCursorEnd(false);
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
                        qb1Var.g0 = ofInt;
                        ofInt.setDuration(360L);
                        qb1Var.g0.setInterpolator(k43.h);
                        qb1Var.g0.start();
                    }
                    kb1Var.setSuggestionsEnabled(z);
                    if (!z) {
                        kb1Var.getEditText().j(false, true);
                        break;
                    } else if (xea.o() >= 1 && !i86.f()) {
                        Bitmap bitmap = qb1Var.r0;
                        if (bitmap == null) {
                            bitmap = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                            qb1Var.r0 = bitmap;
                        }
                        qb1Var.y0 = true;
                        qb1Var.i(bitmap);
                        qb1Var.y0 = false;
                        Bitmap bitmap2 = qb1Var.r0;
                        if (bitmap2 != null && !bitmap2.isRecycled()) {
                            Bitmap bitmap3 = qb1Var.r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            qb1Var.s0 = new BitmapShader(bitmap3, tileMode, tileMode);
                            Matrix matrix = qb1Var.t0;
                            if (matrix == null) {
                                qb1Var.t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            qb1Var.s0.setLocalMatrix(qb1Var.t0);
                            if (qb1Var.u0 == null) {
                                Paint paint = new Paint(3);
                                qb1Var.u0 = paint;
                                paint.setColor(-1);
                            }
                            qb1Var.u0.setShader(qb1Var.s0);
                            break;
                        } else {
                            qb1Var.r0 = null;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
