// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class oi8 extends View {
    public final /* synthetic */ pi8 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi8(pi8 pi8Var, Context context) {
        super(context);
        this.a = pi8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        boolean z;
        boolean z2;
        super.draw(canvas);
        pi8 pi8Var = this.a;
        dh8 dh8Var = pi8Var.w;
        ImageReceiver imageReceiver2 = pi8Var.c;
        ImageReceiver imageReceiver3 = pi8Var.d;
        if (pi8Var.s) {
            imageReceiver2.d0(gl5.b(pi8Var.r), null, uo3.f(pi8Var.r, bkb.Z6, 0.5f, null), "webp", null, 1);
            if (k27.W3(pi8Var.r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.b0(gl5.d(k27.F1(pi8Var.r), pi8Var.r), "140_140", null, null, "tgs", null, 1);
                if (!pi8Var.e) {
                    if (pi8Var.h == 0.0f) {
                        pi8Var.h = 1.0f;
                        if (imageReceiver.y() != null) {
                            imageReceiver.y().I(0, false, false);
                        }
                    }
                    if (imageReceiver.y() != null) {
                        imageReceiver.y().start();
                    }
                    if (imageReceiver.y() != null && imageReceiver.y().v() && dh8Var.v3) {
                        gl.r(dh8Var.m3);
                        gl.d3(dh8Var.m3, 0L);
                    }
                } else if (imageReceiver.y() != null) {
                    imageReceiver.y().stop();
                }
                if (pi8Var.f) {
                    if (imageReceiver2.y() != null) {
                        imageReceiver2.y().stop();
                    }
                } else if (imageReceiver2.y() != null) {
                    imageReceiver2.y().start();
                }
                z = pi8Var.f;
                float f = pi8Var.n;
                if (z) {
                    if (f != 0.0f) {
                        pi8Var.n = f - 0.10666667f;
                        invalidate();
                    }
                } else if (f != 1.0f) {
                    pi8Var.n = f + 0.10666667f;
                    invalidate();
                }
                pi8Var.n = Utilities.i(pi8Var.n, 1.0f, 0.0f);
                z2 = pi8Var.e;
                float f2 = pi8Var.h;
                if (z2) {
                    if (f2 != 0.0f) {
                        pi8Var.h = f2 - 0.10666667f;
                        invalidate();
                    }
                } else if (f2 != 1.0f) {
                    pi8Var.h = f2 + 0.10666667f;
                    invalidate();
                }
                pi8Var.h = Utilities.i(pi8Var.h, 1.0f, 0.0f);
                float f3 = dh8Var.s3 * 0.45f;
                float f4 = 1.499267f * f3;
                float measuredWidth = getMeasuredWidth() - f4;
                float measuredHeight = (getMeasuredHeight() - f4) / 2.0f;
                float f5 = f4 - f3;
                imageReceiver2.i0((f5 - (0.02f * f4)) + measuredWidth, (f5 / 2.0f) + measuredHeight, f3, f3);
                imageReceiver2.setAlpha((pi8Var.n * 0.7f) + 0.3f);
                imageReceiver2.h(canvas, null);
                if (pi8Var.h == 0.0f) {
                    imageReceiver.i0(measuredWidth, measuredHeight, f4, f4);
                    imageReceiver.setAlpha(pi8Var.h);
                    imageReceiver.h(canvas, null);
                    return;
                }
                return;
            }
        }
        imageReceiver = imageReceiver3;
        if (!pi8Var.e) {
        }
        if (pi8Var.f) {
        }
        z = pi8Var.f;
        float f6 = pi8Var.n;
        if (z) {
        }
        pi8Var.n = Utilities.i(pi8Var.n, 1.0f, 0.0f);
        z2 = pi8Var.e;
        float f22 = pi8Var.h;
        if (z2) {
        }
        pi8Var.h = Utilities.i(pi8Var.h, 1.0f, 0.0f);
        float f32 = dh8Var.s3 * 0.45f;
        float f42 = 1.499267f * f32;
        float measuredWidth2 = getMeasuredWidth() - f42;
        float measuredHeight2 = (getMeasuredHeight() - f42) / 2.0f;
        float f52 = f42 - f32;
        imageReceiver2.i0((f52 - (0.02f * f42)) + measuredWidth2, (f52 / 2.0f) + measuredHeight2, f32, f32);
        imageReceiver2.setAlpha((pi8Var.n * 0.7f) + 0.3f);
        imageReceiver2.h(canvas, null);
        if (pi8Var.h == 0.0f) {
        }
    }
}
