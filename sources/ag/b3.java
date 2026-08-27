package ag;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class b3 extends View {
    public final /* synthetic */ c3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(c3 c3Var, Context context) {
        super(context);
        this.a = c3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0050  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        ImageReceiver imageReceiver;
        boolean z10;
        boolean z11;
        super.draw(canvas);
        c3 c3Var = this.a;
        w1 w1Var = c3Var.v;
        ImageReceiver imageReceiver2 = c3Var.c;
        ImageReceiver imageReceiver3 = c3Var.d;
        if (c3Var.s) {
            imageReceiver2.setImage(ImageLocation.getForDocument(c3Var.r), null, DocumentObject.getSvgThumb(c3Var.r, g6.a7, 0.5f), "webp", null, 1);
            if (MessageObject.isPremiumSticker(c3Var.r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(c3Var.r), c3Var.r), "140_140", (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
                if (!c3Var.e) {
                    if (c3Var.h == 0.0f) {
                        c3Var.h = 1.0f;
                        if (imageReceiver.getLottieAnimation() != null) {
                            imageReceiver.getLottieAnimation().L(0, false, false);
                        }
                    }
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().start();
                    }
                    if (imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().y() && w1Var.j3) {
                        AndroidUtilities.cancelRunOnUIThread(w1Var.a3);
                        AndroidUtilities.runOnUIThread(w1Var.a3, 0L);
                    }
                } else if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().stop();
                }
                if (c3Var.f) {
                    if (imageReceiver2.getLottieAnimation() != null) {
                        imageReceiver2.getLottieAnimation().stop();
                    }
                } else if (imageReceiver2.getLottieAnimation() != null) {
                    imageReceiver2.getLottieAnimation().start();
                }
                z10 = c3Var.f;
                if (z10) {
                    float f10 = c3Var.n;
                    if (f10 != 1.0f) {
                        c3Var.n = f10 + 0.10666667f;
                        invalidate();
                        c3Var.n = Utilities.clamp(c3Var.n, 1.0f, 0.0f);
                        z11 = c3Var.e;
                        if (z11) {
                            float f11 = c3Var.h;
                            if (f11 != 1.0f) {
                                c3Var.h = f11 + 0.10666667f;
                                invalidate();
                                c3Var.h = Utilities.clamp(c3Var.h, 1.0f, 0.0f);
                                float f12 = w1Var.g3 * 0.45f;
                                float f13 = 1.499267f * f12;
                                float measuredWidth = getMeasuredWidth() - f13;
                                float measuredHeight = (getMeasuredHeight() - f13) / 2.0f;
                                float f14 = f13 - f12;
                                imageReceiver2.setImageCoords((f14 - (0.02f * f13)) + measuredWidth, (f14 / 2.0f) + measuredHeight, f12, f12);
                                imageReceiver2.setAlpha((c3Var.n * 0.7f) + 0.3f);
                                imageReceiver2.draw(canvas);
                                if (c3Var.h == 0.0f) {
                                    imageReceiver.setImageCoords(measuredWidth, measuredHeight, f13, f13);
                                    imageReceiver.setAlpha(c3Var.h);
                                    imageReceiver.draw(canvas);
                                    return;
                                }
                                return;
                            }
                        }
                        if (!z11) {
                            float f15 = c3Var.h;
                            if (f15 != 0.0f) {
                                c3Var.h = f15 - 0.10666667f;
                                invalidate();
                            }
                        }
                        c3Var.h = Utilities.clamp(c3Var.h, 1.0f, 0.0f);
                        float f122 = w1Var.g3 * 0.45f;
                        float f132 = 1.499267f * f122;
                        float measuredWidth2 = getMeasuredWidth() - f132;
                        float measuredHeight2 = (getMeasuredHeight() - f132) / 2.0f;
                        float f142 = f132 - f122;
                        imageReceiver2.setImageCoords((f142 - (0.02f * f132)) + measuredWidth2, (f142 / 2.0f) + measuredHeight2, f122, f122);
                        imageReceiver2.setAlpha((c3Var.n * 0.7f) + 0.3f);
                        imageReceiver2.draw(canvas);
                        if (c3Var.h == 0.0f) {
                        }
                    }
                }
                if (!z10) {
                    float f16 = c3Var.n;
                    if (f16 != 0.0f) {
                        c3Var.n = f16 - 0.10666667f;
                        invalidate();
                    }
                }
                c3Var.n = Utilities.clamp(c3Var.n, 1.0f, 0.0f);
                z11 = c3Var.e;
                if (z11) {
                }
                if (!z11) {
                }
                c3Var.h = Utilities.clamp(c3Var.h, 1.0f, 0.0f);
                float f1222 = w1Var.g3 * 0.45f;
                float f1322 = 1.499267f * f1222;
                float measuredWidth22 = getMeasuredWidth() - f1322;
                float measuredHeight22 = (getMeasuredHeight() - f1322) / 2.0f;
                float f1422 = f1322 - f1222;
                imageReceiver2.setImageCoords((f1422 - (0.02f * f1322)) + measuredWidth22, (f1422 / 2.0f) + measuredHeight22, f1222, f1222);
                imageReceiver2.setAlpha((c3Var.n * 0.7f) + 0.3f);
                imageReceiver2.draw(canvas);
                if (c3Var.h == 0.0f) {
                }
            }
        }
        imageReceiver = imageReceiver3;
        if (!c3Var.e) {
        }
        if (c3Var.f) {
        }
        z10 = c3Var.f;
        if (z10) {
        }
        if (!z10) {
        }
        c3Var.n = Utilities.clamp(c3Var.n, 1.0f, 0.0f);
        z11 = c3Var.e;
        if (z11) {
        }
        if (!z11) {
        }
        c3Var.h = Utilities.clamp(c3Var.h, 1.0f, 0.0f);
        float f12222 = w1Var.g3 * 0.45f;
        float f13222 = 1.499267f * f12222;
        float measuredWidth222 = getMeasuredWidth() - f13222;
        float measuredHeight222 = (getMeasuredHeight() - f13222) / 2.0f;
        float f14222 = f13222 - f12222;
        imageReceiver2.setImageCoords((f14222 - (0.02f * f13222)) + measuredWidth222, (f14222 / 2.0f) + measuredHeight222, f12222, f12222);
        imageReceiver2.setAlpha((c3Var.n * 0.7f) + 0.3f);
        imageReceiver2.draw(canvas);
        if (c3Var.h == 0.0f) {
        }
    }
}
