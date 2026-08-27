package lh;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.widget.FrameLayout;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.lt;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ m b;

    public /* synthetic */ e(m mVar, int i10) {
        this.a = i10;
        this.b = mVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        m mVar = this.b;
        switch (i10) {
            case 0:
                mVar.t();
                break;
            default:
                boolean z10 = mVar.i0;
                FrameLayout frameLayout = mVar.F;
                j jVar = mVar.r;
                g gVar = mVar.f;
                if (mVar.l0 != z10) {
                    mVar.l0 = z10;
                    ValueAnimator valueAnimator = mVar.m0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.m0 = null;
                    }
                    Utilities.Callback callback = mVar.g0;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z10));
                    }
                    mVar.d(z10);
                    if (z10) {
                        i iVar = mVar.I;
                        if (iVar != null) {
                            iVar.setVisibility(0);
                        }
                        jVar.setVisibility(0);
                    } else {
                        gVar.getEditText().scrollBy(0, -gVar.getEditText().getScrollY());
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.k0, z10 ? 1.0f : 0.0f);
                    mVar.m0 = ofFloat;
                    ofFloat.addUpdateListener(new ag.u(mVar, 28));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.m0.addListener(new ag.x(10, mVar, z10));
                    if (z10) {
                        mVar.m0.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                        mVar.m0.setDuration(250L);
                    } else {
                        mVar.m0.setInterpolator(new u1.a());
                        mVar.m0.setDuration(420L);
                    }
                    mVar.m0.start();
                    lt editText = gVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = mVar.c0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        gVar.setSelection(z10 ? gVar.a.length() : 0);
                        gVar.getEditText().setForceCursorEnd(false);
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z10 ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
                        mVar.c0 = ofInt;
                        ofInt.setDuration(360L);
                        mVar.c0.setInterpolator(er.h);
                        mVar.c0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z10 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
                        if (mVar.n0 == null) {
                            mVar.n0 = Bitmap.createBitmap((int) (frameLayout.getWidth() / 12.0f), (int) (frameLayout.getHeight() / 12.0f), Bitmap.Config.ARGB_8888);
                        }
                        mVar.u0 = true;
                        mVar.i(mVar.n0);
                        mVar.u0 = false;
                        Bitmap bitmap = mVar.n0;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            Bitmap bitmap2 = mVar.n0;
                            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                            mVar.o0 = new BitmapShader(bitmap2, tileMode, tileMode);
                            Matrix matrix = mVar.p0;
                            if (matrix == null) {
                                mVar.p0 = new Matrix();
                            } else {
                                matrix.reset();
                            }
                            mVar.o0.setLocalMatrix(mVar.p0);
                            if (mVar.q0 == null) {
                                Paint paint = new Paint(3);
                                mVar.q0 = paint;
                                paint.setColor(-1);
                            }
                            mVar.q0.setShader(mVar.o0);
                            break;
                        } else {
                            mVar.n0 = null;
                            break;
                        }
                    }
                }
                break;
        }
    }
}
