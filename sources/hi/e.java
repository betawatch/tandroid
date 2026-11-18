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
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ n b;

    public /* synthetic */ e(n nVar, int i7) {
        this.a = i7;
        this.b = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        n nVar = this.b;
        switch (i7) {
            case 0:
                nVar.t();
                break;
            default:
                boolean z10 = nVar.m0;
                FrameLayout frameLayout = nVar.K;
                j jVar = nVar.r;
                g gVar = nVar.f;
                if (nVar.p0 != z10) {
                    nVar.p0 = z10;
                    ValueAnimator valueAnimator = nVar.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        nVar.q0 = null;
                    }
                    x10 x10Var = nVar.k0;
                    if (x10Var != null) {
                        x10Var.a(Boolean.valueOf(z10));
                    }
                    nVar.d(z10);
                    if (z10) {
                        i iVar = nVar.N;
                        if (iVar != null) {
                            iVar.setVisibility(0);
                        }
                        jVar.setVisibility(0);
                    } else {
                        gVar.getEditText().scrollBy(0, -gVar.getEditText().getScrollY());
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(nVar.o0, z10 ? 1.0f : 0.0f);
                    nVar.q0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.g(nVar, 26));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    nVar.q0.addListener(new bi.e7(8, nVar, z10));
                    if (z10) {
                        nVar.q0.setInterpolator(org.telegram.ui.ActionBar.j1.w);
                        nVar.q0.setDuration(250L);
                    } else {
                        nVar.q0.setInterpolator(new x1.a());
                        nVar.q0.setDuration(420L);
                    }
                    nVar.q0.start();
                    mt editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = nVar.g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        gVar.setSelection(z10 ? gVar.a.length() : 0);
                        gVar.getEditText().setForceCursorEnd(false);
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z10 ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
                        nVar.g0 = ofInt;
                        ofInt.setDuration(360L);
                        nVar.g0.setInterpolator(lr.h);
                        nVar.g0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().j(false, true);
                    }
                    if (z10 && bz.o() >= 1 && !pc.f()) {
                        if (nVar.r0 == null) {
                            nVar.r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        nVar.y0 = true;
                        nVar.i(nVar.r0);
                        nVar.y0 = false;
                        Bitmap bitmap = nVar.r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = nVar.r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            nVar.s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = nVar.t0;
                            if (matrix == null) {
                                nVar.t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            nVar.s0.setLocalMatrix(nVar.t0);
                            if (nVar.u0 == null) {
                                Paint paint = new Paint(3);
                                nVar.u0 = paint;
                                paint.setColor(-1);
                            }
                            nVar.u0.setShader(nVar.s0);
                            break;
                        } else {
                            nVar.r0 = null;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
