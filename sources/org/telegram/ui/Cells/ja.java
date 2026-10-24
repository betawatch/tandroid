package org.telegram.ui.Cells;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.Components.yp;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class ja implements cm0, zf.m, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, yp, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ja(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.yp
    public void a() {
        switch (this.a) {
            case 4:
                m4 m4Var = (m4) this.b;
                float progress = 1.0f - (m4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.w9 w9Var = m4Var.a;
                w9Var.setScaleX(progress);
                w9Var.setScaleY(progress);
                m4Var.invalidate();
                break;
            default:
                g7 g7Var = (g7) this.b;
                float progress2 = 1.0f - (g7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.w9 w9Var2 = g7Var.a;
                w9Var2.setScaleX(progress2);
                w9Var2.setScaleY(progress2);
                g7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean d(int i10, View view) {
        na naVar = (na) this.b;
        naVar.getClass();
        naVar.F1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        yj0 lottieAnimation;
        s0 s0Var;
        int v;
        MessageObject messageObject;
        switch (this.a) {
            case 2:
                v0 v0Var = (v0) this.b;
                if (z10 && (lottieAnimation = v0Var.I.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = v0Var.P0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.N(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || v0Var.L1) {
                            messageObject2.wasUnread = false;
                            v0Var.L1 = false;
                            try {
                                v0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (v0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) v0Var.getContext()).x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = v0Var.I1;
                            if (videoSize != null && (s0Var = v0Var.f1) != null) {
                                s0Var.c1(v0Var, v0Var.H1, videoSize);
                                break;
                            }
                        }
                    } else if (lottieAnimation.a0 < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.N(lottieAnimation.e[0] - 1, false, false);
                        break;
                    }
                }
                break;
            default:
                s7 s7Var = (s7) this.b;
                ImageReceiver imageReceiver2 = s7Var.d;
                ImageReceiver imageReceiver3 = s7Var.c;
                if (z10 && !z11 && (messageObject = s7Var.n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && s7Var.w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    s7Var.a = dominantColor;
                    CheckBoxBase checkBoxBase = s7Var.P;
                    if (checkBoxBase != null && checkBoxBase.x != (v = org.telegram.ui.ActionBar.k6.v(dominantColor, org.telegram.ui.ActionBar.k6.o1(0.25f, -1)))) {
                        checkBoxBase.x = v;
                        checkBoxBase.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        int i11 = this.a;
        org.telegram.messenger.m5.a(this, i10, str, drawable);
    }

    @Override // zf.m
    public void i(long j10) {
        ((l) this.b).b(j10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.m5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return (CharSequence) ((gi.c) this.b).run((Integer) obj2);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        TLRPC.Message message;
        j4 j4Var;
        t1 t1Var = (t1) this.b;
        MessageObject messageObject = t1Var.y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((j4Var = t1Var.F7) != null && j4Var.i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || t1Var.y7.isVoiceOnce() || t1Var.y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
