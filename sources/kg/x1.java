package kg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.v5;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x1 extends View {
    public final /* synthetic */ y1 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(y1 y1Var, Context context) {
        super(context);
        this.a = y1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0051  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        boolean z10;
        boolean z11;
        super.draw(canvas);
        y1 y1Var = this.a;
        b1 b1Var = y1Var.w;
        ImageReceiver imageReceiver2 = y1Var.c;
        ImageReceiver imageReceiver3 = y1Var.d;
        if (y1Var.s) {
            imageReceiver2.q0(ic.b(y1Var.r), null, v5.f(y1Var.r, t6.a7, 0.5f, null), "webp", null, 1);
            if (jj.X3(y1Var.r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.t0(ic.d(jj.G1(y1Var.r), y1Var.r), "140_140", null, null, "tgs", null, 1);
                if (!y1Var.e) {
                    if (y1Var.h == 0.0f) {
                        y1Var.h = 1.0f;
                        if (imageReceiver.B() != null) {
                            imageReceiver.B().N(0, false, false);
                        }
                    }
                    if (imageReceiver.B() != null) {
                        imageReceiver.B().start();
                    }
                    if (imageReceiver.B() != null && imageReceiver.B().A() && b1Var.u3) {
                        org.telegram.messenger.i0.r(b1Var.l3);
                        org.telegram.messenger.i0.h3(b1Var.l3, 0L);
                    }
                } else if (imageReceiver.B() != null) {
                    imageReceiver.B().stop();
                }
                if (y1Var.f) {
                    if (imageReceiver2.B() != null) {
                        imageReceiver2.B().stop();
                    }
                } else if (imageReceiver2.B() != null) {
                    imageReceiver2.B().start();
                }
                z10 = y1Var.f;
                if (z10) {
                    float f7 = y1Var.n;
                    if (f7 != 1.0f) {
                        y1Var.n = f7 + 0.10666667f;
                        invalidate();
                        y1Var.n = Utilities.i(y1Var.n, 1.0f, 0.0f);
                        z11 = y1Var.e;
                        if (z11) {
                            float f10 = y1Var.h;
                            if (f10 != 1.0f) {
                                y1Var.h = f10 + 0.10666667f;
                                invalidate();
                                y1Var.h = Utilities.i(y1Var.h, 1.0f, 0.0f);
                                float f11 = b1Var.r3 * 0.45f;
                                float f12 = 1.499267f * f11;
                                float measuredWidth = getMeasuredWidth() - f12;
                                float measuredHeight = (getMeasuredHeight() - f12) / 2.0f;
                                float f13 = f12 - f11;
                                imageReceiver2.y0((f13 - (0.02f * f12)) + measuredWidth, (f13 / 2.0f) + measuredHeight, f11, f11);
                                imageReceiver2.setAlpha((y1Var.n * 0.7f) + 0.3f);
                                imageReceiver2.h(canvas, null);
                                if (y1Var.h == 0.0f) {
                                    imageReceiver.y0(measuredWidth, measuredHeight, f12, f12);
                                    imageReceiver.setAlpha(y1Var.h);
                                    imageReceiver.h(canvas, null);
                                    return;
                                }
                                return;
                            }
                        }
                        if (!z11) {
                            float f14 = y1Var.h;
                            if (f14 != 0.0f) {
                                y1Var.h = f14 - 0.10666667f;
                                invalidate();
                            }
                        }
                        y1Var.h = Utilities.i(y1Var.h, 1.0f, 0.0f);
                        float f112 = b1Var.r3 * 0.45f;
                        float f122 = 1.499267f * f112;
                        float measuredWidth2 = getMeasuredWidth() - f122;
                        float measuredHeight2 = (getMeasuredHeight() - f122) / 2.0f;
                        float f132 = f122 - f112;
                        imageReceiver2.y0((f132 - (0.02f * f122)) + measuredWidth2, (f132 / 2.0f) + measuredHeight2, f112, f112);
                        imageReceiver2.setAlpha((y1Var.n * 0.7f) + 0.3f);
                        imageReceiver2.h(canvas, null);
                        if (y1Var.h == 0.0f) {
                        }
                    }
                }
                if (!z10) {
                    float f15 = y1Var.n;
                    if (f15 != 0.0f) {
                        y1Var.n = f15 - 0.10666667f;
                        invalidate();
                    }
                }
                y1Var.n = Utilities.i(y1Var.n, 1.0f, 0.0f);
                z11 = y1Var.e;
                if (z11) {
                }
                if (!z11) {
                }
                y1Var.h = Utilities.i(y1Var.h, 1.0f, 0.0f);
                float f1122 = b1Var.r3 * 0.45f;
                float f1222 = 1.499267f * f1122;
                float measuredWidth22 = getMeasuredWidth() - f1222;
                float measuredHeight22 = (getMeasuredHeight() - f1222) / 2.0f;
                float f1322 = f1222 - f1122;
                imageReceiver2.y0((f1322 - (0.02f * f1222)) + measuredWidth22, (f1322 / 2.0f) + measuredHeight22, f1122, f1122);
                imageReceiver2.setAlpha((y1Var.n * 0.7f) + 0.3f);
                imageReceiver2.h(canvas, null);
                if (y1Var.h == 0.0f) {
                }
            }
        }
        imageReceiver = imageReceiver3;
        if (!y1Var.e) {
        }
        if (y1Var.f) {
        }
        z10 = y1Var.f;
        if (z10) {
        }
        if (!z10) {
        }
        y1Var.n = Utilities.i(y1Var.n, 1.0f, 0.0f);
        z11 = y1Var.e;
        if (z11) {
        }
        if (!z11) {
        }
        y1Var.h = Utilities.i(y1Var.h, 1.0f, 0.0f);
        float f11222 = b1Var.r3 * 0.45f;
        float f12222 = 1.499267f * f11222;
        float measuredWidth222 = getMeasuredWidth() - f12222;
        float measuredHeight222 = (getMeasuredHeight() - f12222) / 2.0f;
        float f13222 = f12222 - f11222;
        imageReceiver2.y0((f13222 - (0.02f * f12222)) + measuredWidth222, (f13222 / 2.0f) + measuredHeight222, f11222, f11222);
        imageReceiver2.setAlpha((y1Var.n * 0.7f) + 0.3f);
        imageReceiver2.h(canvas, null);
        if (y1Var.h == 0.0f) {
        }
    }
}
