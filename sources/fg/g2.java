package fg;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.k6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class g2 extends View {
    public final /* synthetic */ h2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(h2 h2Var, Context context) {
        super(context);
        this.a = h2Var;
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
        boolean z4;
        boolean z10;
        super.draw(canvas);
        h2 h2Var = this.a;
        f1 f1Var = h2Var.v;
        ImageReceiver imageReceiver2 = h2Var.c;
        ImageReceiver imageReceiver3 = h2Var.d;
        if (h2Var.s) {
            imageReceiver2.setImage(ImageLocation.getForDocument(h2Var.r), null, DocumentObject.getSvgThumb(h2Var.r, k6.a7, 0.5f), "webp", null, 1);
            if (MessageObject.isPremiumSticker(h2Var.r)) {
                imageReceiver = imageReceiver3;
                imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(h2Var.r), h2Var.r), "140_140", (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
                if (!h2Var.e) {
                    if (h2Var.h == 0.0f) {
                        h2Var.h = 1.0f;
                        if (imageReceiver.getLottieAnimation() != null) {
                            imageReceiver.getLottieAnimation().L(0, false, false);
                        }
                    }
                    if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().start();
                    }
                    if (imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().y() && f1Var.k3) {
                        AndroidUtilities.cancelRunOnUIThread(f1Var.b3);
                        AndroidUtilities.runOnUIThread(f1Var.b3, 0L);
                    }
                } else if (imageReceiver.getLottieAnimation() != null) {
                    imageReceiver.getLottieAnimation().stop();
                }
                if (h2Var.f) {
                    if (imageReceiver2.getLottieAnimation() != null) {
                        imageReceiver2.getLottieAnimation().stop();
                    }
                } else if (imageReceiver2.getLottieAnimation() != null) {
                    imageReceiver2.getLottieAnimation().start();
                }
                z4 = h2Var.f;
                if (z4) {
                    float f10 = h2Var.n;
                    if (f10 != 1.0f) {
                        h2Var.n = f10 + 0.10666667f;
                        invalidate();
                        h2Var.n = Utilities.clamp(h2Var.n, 1.0f, 0.0f);
                        z10 = h2Var.e;
                        if (z10) {
                            float f11 = h2Var.h;
                            if (f11 != 1.0f) {
                                h2Var.h = f11 + 0.10666667f;
                                invalidate();
                                h2Var.h = Utilities.clamp(h2Var.h, 1.0f, 0.0f);
                                float f12 = f1Var.h3 * 0.45f;
                                float f13 = 1.499267f * f12;
                                float measuredWidth = getMeasuredWidth() - f13;
                                float measuredHeight = (getMeasuredHeight() - f13) / 2.0f;
                                float f14 = f13 - f12;
                                imageReceiver2.setImageCoords((f14 - (0.02f * f13)) + measuredWidth, (f14 / 2.0f) + measuredHeight, f12, f12);
                                imageReceiver2.setAlpha((h2Var.n * 0.7f) + 0.3f);
                                imageReceiver2.draw(canvas);
                                if (h2Var.h == 0.0f) {
                                    imageReceiver.setImageCoords(measuredWidth, measuredHeight, f13, f13);
                                    imageReceiver.setAlpha(h2Var.h);
                                    imageReceiver.draw(canvas);
                                    return;
                                }
                                return;
                            }
                        }
                        if (!z10) {
                            float f15 = h2Var.h;
                            if (f15 != 0.0f) {
                                h2Var.h = f15 - 0.10666667f;
                                invalidate();
                            }
                        }
                        h2Var.h = Utilities.clamp(h2Var.h, 1.0f, 0.0f);
                        float f122 = f1Var.h3 * 0.45f;
                        float f132 = 1.499267f * f122;
                        float measuredWidth2 = getMeasuredWidth() - f132;
                        float measuredHeight2 = (getMeasuredHeight() - f132) / 2.0f;
                        float f142 = f132 - f122;
                        imageReceiver2.setImageCoords((f142 - (0.02f * f132)) + measuredWidth2, (f142 / 2.0f) + measuredHeight2, f122, f122);
                        imageReceiver2.setAlpha((h2Var.n * 0.7f) + 0.3f);
                        imageReceiver2.draw(canvas);
                        if (h2Var.h == 0.0f) {
                        }
                    }
                }
                if (!z4) {
                    float f16 = h2Var.n;
                    if (f16 != 0.0f) {
                        h2Var.n = f16 - 0.10666667f;
                        invalidate();
                    }
                }
                h2Var.n = Utilities.clamp(h2Var.n, 1.0f, 0.0f);
                z10 = h2Var.e;
                if (z10) {
                }
                if (!z10) {
                }
                h2Var.h = Utilities.clamp(h2Var.h, 1.0f, 0.0f);
                float f1222 = f1Var.h3 * 0.45f;
                float f1322 = 1.499267f * f1222;
                float measuredWidth22 = getMeasuredWidth() - f1322;
                float measuredHeight22 = (getMeasuredHeight() - f1322) / 2.0f;
                float f1422 = f1322 - f1222;
                imageReceiver2.setImageCoords((f1422 - (0.02f * f1322)) + measuredWidth22, (f1422 / 2.0f) + measuredHeight22, f1222, f1222);
                imageReceiver2.setAlpha((h2Var.n * 0.7f) + 0.3f);
                imageReceiver2.draw(canvas);
                if (h2Var.h == 0.0f) {
                }
            }
        }
        imageReceiver = imageReceiver3;
        if (!h2Var.e) {
        }
        if (h2Var.f) {
        }
        z4 = h2Var.f;
        if (z4) {
        }
        if (!z4) {
        }
        h2Var.n = Utilities.clamp(h2Var.n, 1.0f, 0.0f);
        z10 = h2Var.e;
        if (z10) {
        }
        if (!z10) {
        }
        h2Var.h = Utilities.clamp(h2Var.h, 1.0f, 0.0f);
        float f12222 = f1Var.h3 * 0.45f;
        float f13222 = 1.499267f * f12222;
        float measuredWidth222 = getMeasuredWidth() - f13222;
        float measuredHeight222 = (getMeasuredHeight() - f13222) / 2.0f;
        float f14222 = f13222 - f12222;
        imageReceiver2.setImageCoords((f14222 - (0.02f * f13222)) + measuredWidth222, (f14222 / 2.0f) + measuredHeight222, f12222, f12222);
        imageReceiver2.setAlpha((h2Var.n * 0.7f) + 0.3f);
        imageReceiver2.draw(canvas);
        if (h2Var.h == 0.0f) {
        }
    }
}
