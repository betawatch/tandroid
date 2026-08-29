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
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.ip;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.rh;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fa implements bl0, jf.o, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, ip, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fa(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ip
    public void a() {
        switch (this.a) {
            case 4:
                l4 l4Var = (l4) this.b;
                float progress = 1.0f - (l4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.t9 t9Var = l4Var.a;
                t9Var.setScaleX(progress);
                t9Var.setScaleY(progress);
                l4Var.invalidate();
                break;
            default:
                c7 c7Var = (c7) this.b;
                float progress2 = 1.0f - (c7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.t9 t9Var2 = c7Var.a;
                t9Var2.setScaleX(progress2);
                t9Var2.setScaleY(progress2);
                c7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public boolean c(int i10, View view) {
        ja jaVar = (ja) this.b;
        jaVar.getClass();
        jaVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        xi0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.a) {
            case 2:
                v0 v0Var = (v0) this.b;
                if (z10 && (lottieAnimation = v0Var.E.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = v0Var.D0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.L(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || v0Var.z1) {
                            messageObject2.wasUnread = false;
                            v0Var.z1 = false;
                            try {
                                v0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (v0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) v0Var.getContext()).t0.c(false);
                            }
                            TLRPC.VideoSize videoSize = v0Var.w1;
                            if (videoSize != null && (t0Var = v0Var.T0) != null) {
                                t0Var.g1(v0Var, v0Var.v1, videoSize);
                                break;
                            }
                        }
                    } else if (lottieAnimation.X < 1) {
                        lottieAnimation.stop();
                        lottieAnimation.L(lottieAnimation.e[0] - 1, false, false);
                        break;
                    }
                }
                break;
            default:
                p7 p7Var = (p7) this.b;
                ImageReceiver imageReceiver2 = p7Var.d;
                ImageReceiver imageReceiver3 = p7Var.c;
                if (z10 && !z11 && (messageObject = p7Var.n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && p7Var.s0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    p7Var.a = dominantColor;
                    CheckBoxBase checkBoxBase = p7Var.L;
                    if (checkBoxBase != null && checkBoxBase.x != (v = org.telegram.ui.ActionBar.g6.v(dominantColor, org.telegram.ui.ActionBar.g6.l1(0.25f, -1)))) {
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
        org.telegram.messenger.i5.a(this, i10, str, drawable);
    }

    @Override // jf.o
    public void e(long j10) {
        ((l) this.b).b(j10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.i5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return (CharSequence) ((rh) this.b).run((Integer) obj2);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        TLRPC.Message message;
        i4 i4Var;
        s1 s1Var = (s1) this.b;
        MessageObject messageObject = s1Var.u7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((i4Var = s1Var.B7) != null && i4Var.i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || s1Var.u7.isVoiceOnce() || s1Var.u7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
