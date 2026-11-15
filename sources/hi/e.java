package hi;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.gz;
import org.telegram.messenger.qc;
import org.telegram.messenger.z10;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ft;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
                boolean z10 = mVar.m0;
                FrameLayout frameLayout = mVar.K;
                j jVar = mVar.r;
                g gVar = mVar.f;
                if (mVar.p0 != z10) {
                    mVar.p0 = z10;
                    ValueAnimator valueAnimator = mVar.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.q0 = null;
                    }
                    z10 z10Var = mVar.k0;
                    if (z10Var != null) {
                        z10Var.a(Boolean.valueOf(z10));
                    }
                    mVar.d(z10);
                    if (z10) {
                        i iVar = mVar.N;
                        if (iVar != null) {
                            iVar.setVisibility(0);
                        }
                        jVar.setVisibility(0);
                    } else {
                        gVar.getEditText().scrollBy(0, -gVar.getEditText().getScrollY());
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.o0, z10 ? 1.0f : 0.0f);
                    mVar.q0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.h(mVar, 26));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.q0.addListener(new bi.v4(8, mVar, z10));
                    if (z10) {
                        mVar.q0.setInterpolator(org.telegram.ui.ActionBar.i1.w);
                        mVar.q0.setDuration(250L);
                    } else {
                        mVar.q0.setInterpolator(new x1.a());
                        mVar.q0.setDuration(420L);
                    }
                    mVar.q0.start();
                    ft editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        gVar.setSelection(z10 ? gVar.a.length() : 0);
                        gVar.getEditText().setForceCursorEnd(false);
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z10 ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
                        mVar.g0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.g0.setInterpolator(er.h);
                        mVar.g0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().j(false, true);
                    }
                    if (z10 && gz.o() >= 1 && !qc.f()) {
                        if (mVar.r0 == null) {
                            mVar.r0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.y0 = true;
                        mVar.i(mVar.r0);
                        mVar.y0 = false;
                        Bitmap bitmap = mVar.r0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.r0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.s0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.t0;
                            if (matrix == null) {
                                mVar.t0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.s0.setLocalMatrix(mVar.t0);
                            if (mVar.u0 == null) {
                                Paint paint = new Paint(3);
                                mVar.u0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.u0.setShader(mVar.s0);
                            break;
                        } else {
                            mVar.r0 = null;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
