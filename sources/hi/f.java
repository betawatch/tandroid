package hi;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.bz;
import org.telegram.messenger.pc;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.ot;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ f(o oVar, int i7) {
        this.a = i7;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        o oVar = this.b;
        switch (i7) {
            case 0:
                oVar.t();
                break;
            default:
                boolean z10 = oVar.m0;
                FrameLayout frameLayout = oVar.K;
                k kVar = oVar.r;
                h hVar = oVar.f;
                if (oVar.p0 != z10) {
                    oVar.p0 = z10;
                    ValueAnimator valueAnimator = oVar.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        oVar.q0 = null;
                    }
                    x10 x10Var = oVar.k0;
                    if (x10Var != null) {
                        x10Var.a(Boolean.valueOf(z10));
                    }
                    oVar.d(z10);
                    if (z10) {
                        j jVar = oVar.N;
                        if (jVar != null) {
                            jVar.setVisibility(0);
                        }
                        kVar.setVisibility(0);
                    } else {
                        hVar.getEditText().scrollBy(0, -hVar.getEditText().getScrollY());
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(oVar.o0, z10 ? 1.0f : 0.0f);
                    oVar.q0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.g(oVar, 26));
                    if (!z10) {
                        hVar.getEditText().setAllowDrawCursor(false);
                    }
                    oVar.q0.addListener(new bi.h7(8, oVar, z10));
                    if (z10) {
                        oVar.q0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        oVar.q0.setDuration(250L);
                    } else {
                        oVar.q0.setInterpolator(new x1.a());
                        oVar.q0.setDuration(420L);
                    }
                    oVar.q0.start();
                    ot editText = hVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = oVar.g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        hVar.setSelection(z10 ? hVar.a.length() : 0);
                        hVar.getEditText().setForceCursorEnd(false);
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z10 ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
                        oVar.g0 = ofInt;
                        ofInt.setDuration(360L);
                        oVar.g0.setInterpolator(nr.h);
                        oVar.g0.start();
                    }
                    hVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        hVar.getEditText().j(false, true);
                    }
                    if (z10 && bz.o() >= 1 && !pc.f()) {
                        if (oVar.r0 == null) {
                            oVar.r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        oVar.y0 = true;
                        oVar.i(oVar.r0);
                        oVar.y0 = false;
                        Bitmap bitmap = oVar.r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = oVar.r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            oVar.s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = oVar.t0;
                            if (matrix == null) {
                                oVar.t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            oVar.s0.setLocalMatrix(oVar.t0);
                            if (oVar.u0 == null) {
                                Paint paint = new Paint(3);
                                oVar.u0 = paint;
                                paint.setColor(-1);
                            }
                            oVar.u0.setShader(oVar.s0);
                            break;
                        } else {
                            oVar.r0 = null;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
