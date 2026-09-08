package di;

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
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.zt;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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
                boolean z10 = mVar.m0;
                FrameLayout frameLayout = mVar.J;
                j jVar = mVar.r;
                g gVar = mVar.f;
                if (mVar.p0 != z10) {
                    mVar.p0 = z10;
                    ValueAnimator valueAnimator = mVar.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        mVar.q0 = null;
                    }
                    Utilities.Callback callback = mVar.k0;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z10));
                    }
                    mVar.d(z10);
                    if (z10) {
                        i iVar = mVar.M;
                        if (iVar != null) {
                            iVar.setVisibility(0);
                        }
                        jVar.setVisibility(0);
                    } else {
                        gVar.getEditText().scrollBy(0, -gVar.getEditText().getScrollY());
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(mVar.o0, z10 ? 1.0f : 0.0f);
                    mVar.q0 = ofFloat;
                    ofFloat.addUpdateListener(new ah.d0(mVar, 16));
                    if (!z10) {
                        gVar.getEditText().setAllowDrawCursor(false);
                    }
                    mVar.q0.addListener(new ah.q0(8, mVar, z10));
                    if (z10) {
                        mVar.q0.setInterpolator(org.telegram.ui.ActionBar.p1.w);
                        mVar.q0.setDuration(250L);
                    } else {
                        mVar.q0.setInterpolator(new u1.a());
                        mVar.q0.setDuration(420L);
                    }
                    mVar.q0.start();
                    zt editText = gVar.getEditText();
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
                        mVar.g0.setInterpolator(pr.h);
                        mVar.g0.start();
                    }
                    gVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        gVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z10 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
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
