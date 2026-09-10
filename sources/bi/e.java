package bi;

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
import org.telegram.ui.Components.fu;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;

    public /* synthetic */ e(o oVar, int i10) {
        this.a = i10;
        this.b = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        o oVar = this.b;
        switch (i10) {
            case 0:
                oVar.t();
                break;
            default:
                boolean z10 = oVar.m0;
                FrameLayout frameLayout = oVar.J;
                l lVar = oVar.r;
                i iVar = oVar.f;
                if (oVar.p0 != z10) {
                    oVar.p0 = z10;
                    ValueAnimator valueAnimator = oVar.q0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        oVar.q0 = null;
                    }
                    Utilities.Callback callback = oVar.k0;
                    if (callback != null) {
                        callback.run(Boolean.valueOf(z10));
                    }
                    oVar.d(z10);
                    if (z10) {
                        k kVar = oVar.M;
                        if (kVar != null) {
                            kVar.setVisibility(0);
                        }
                        lVar.setVisibility(0);
                    } else {
                        iVar.getEditText().scrollBy(0, -iVar.getEditText().getScrollY());
                    }
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(oVar.o0, z10 ? 1.0f : 0.0f);
                    oVar.q0 = ofFloat;
                    ofFloat.addUpdateListener(new ai.a(oVar, 1));
                    if (!z10) {
                        iVar.getEditText().setAllowDrawCursor(false);
                    }
                    oVar.q0.addListener(new ai.e(3, oVar, z10));
                    if (z10) {
                        oVar.q0.setInterpolator(org.telegram.ui.ActionBar.r1.w);
                        oVar.q0.setDuration(250L);
                    } else {
                        oVar.q0.setInterpolator(new u1.a());
                        oVar.q0.setDuration(420L);
                    }
                    oVar.q0.start();
                    fu editText = iVar.getEditText();
                    if (editText != null && editText.getLayout() != null) {
                        ObjectAnimator objectAnimator = oVar.g0;
                        if (objectAnimator != null) {
                            objectAnimator.cancel();
                        }
                        int scrollY = editText.getScrollY();
                        iVar.setSelection(z10 ? iVar.a.length() : 0);
                        iVar.getEditText().setForceCursorEnd(false);
                        ObjectAnimator ofInt = ObjectAnimator.ofInt(editText, "scrollY", scrollY, z10 ? editText.getLayout().getLineTop(editText.getLineCount()) - ((editText.getHeight() - editText.getPaddingTop()) - editText.getPaddingBottom()) : 0);
                        oVar.g0 = ofInt;
                        ofInt.setDuration(360L);
                        oVar.g0.setInterpolator(wr.h);
                        oVar.g0.start();
                    }
                    iVar.setSuggestionsEnabled(z10);
                    if (!z10) {
                        iVar.getEditText().setSpoilersRevealed(false, true);
                    }
                    if (z10 && SharedConfig.getDevicePerformanceClass() >= 1 && !LiteMode.isPowerSaverApplied()) {
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
