package fi;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.c20;
import org.telegram.messenger.iz;
import org.telegram.messenger.rc;
import org.telegram.ui.Components.xq;
import org.telegram.ui.Components.ys;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ e(m mVar, int i7) {
        this.a = i7;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        m mVar = this.b;
        switch (i7) {
            case 0:
                mVar.t();
                break;
            default:
                boolean z9 = mVar.l0;
                FrameLayout frameLayout = mVar.J;
                j jVar = mVar.r;
                g gVar = mVar.f;
                if (mVar.o0 != z9) {
                    mVar.o0 = z9;
                    ValueAnimator valueAnimator = mVar.p0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.p0 = null;
                    }
                    c20 c20Var = mVar.j0;
                    if (c20Var != null) {
                        c20Var.a(Boolean.valueOf(z9));
                    }
                    mVar.d(z9);
                    if (z9) {
                        i iVar = mVar.M;
                        if (iVar != null) {
                            iVar.setVisibility(0);
                        }
                        jVar.setVisibility(0);
                    } else {
                        gVar.getEditText().scrollBy(0, -gVar.getEditText().getScrollY());
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.n0, z9 ? 1.0f : 0.0f);
                    mVar.p0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.h(mVar, 25));
                    if (!z9) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.p0.addListener(new ch.y(7, mVar, z9));
                    if (z9) {
                        mVar.p0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        mVar.p0.setDuration(250L);
                    } else {
                        mVar.p0.setInterpolator(new x1.a());
                        mVar.p0.setDuration(420L);
                    }
                    mVar.p0.start();
                    ys editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.f0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        gVar.setSelection(z9 ? gVar.a.length() : 0);
                        gVar.getEditText().setForceCursorEnd(false);
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z9 ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
                        mVar.f0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.f0.setInterpolator(xq.h);
                        mVar.f0.start();
                    }
                    gVar.setSuggestionsEnabled(z9);
                    if (!z9) {
                        gVar.getEditText().j(false, true);
                    }
                    if (z9 && iz.o() >= 1 && !rc.f()) {
                        if (mVar.q0 == null) {
                            mVar.q0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.x0 = true;
                        mVar.i(mVar.q0);
                        mVar.x0 = false;
                        Bitmap bitmap = mVar.q0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.q0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.r0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.s0;
                            if (matrix == null) {
                                mVar.s0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.r0.setLocalMatrix(mVar.s0);
                            if (mVar.t0 == null) {
                                Paint paint = new Paint(3);
                                mVar.t0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.t0.setShader(mVar.r0);
                            break;
                        } else {
                            mVar.q0 = null;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
