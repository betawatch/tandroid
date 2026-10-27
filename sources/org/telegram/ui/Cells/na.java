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
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.yj0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class na implements cm0, ag.s, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, bq, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ na(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.bq
    public void a() {
        switch (this.a) {
            case 4:
                r4 r4Var = (r4) this.b;
                float progress = 1.0f - (r4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.y9 y9Var = r4Var.a;
                y9Var.setScaleX(progress);
                y9Var.setScaleY(progress);
                r4Var.invalidate();
                break;
            default:
                k7 k7Var = (k7) this.b;
                float progress2 = 1.0f - (k7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.y9 y9Var2 = k7Var.a;
                y9Var2.setScaleX(progress2);
                y9Var2.setScaleY(progress2);
                k7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.cm0
    public boolean c(int i10, View view) {
        ra raVar = (ra) this.b;
        raVar.getClass();
        raVar.F1(((ThemesHorizontalListCell$InnerThemeView) view).b);
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
                                s0Var.G(v0Var, v0Var.H1, videoSize);
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
                w7 w7Var = (w7) this.b;
                ImageReceiver imageReceiver2 = w7Var.d;
                ImageReceiver imageReceiver3 = w7Var.c;
                if (z10 && !z11 && (messageObject = w7Var.n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && w7Var.w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    w7Var.a = dominantColor;
                    CheckBoxBase checkBoxBase = w7Var.P;
                    if (checkBoxBase != null && checkBoxBase.x != (v = org.telegram.ui.ActionBar.y6.v(dominantColor, org.telegram.ui.ActionBar.y6.o1(0.25f, -1)))) {
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
        org.telegram.messenger.p5.a(this, i10, str, drawable);
    }

    @Override // ag.s
    public void f(long j10) {
        ((l) this.b).b(j10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.p5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return (CharSequence) ((ai.d0) this.b).run((Integer) obj2);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        TLRPC.Message message;
        o4 o4Var;
        s1 s1Var = (s1) this.b;
        MessageObject messageObject = s1Var.y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((o4Var = s1Var.F7) != null && o4Var.i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || s1Var.y7.isVoiceOnce() || s1Var.y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
