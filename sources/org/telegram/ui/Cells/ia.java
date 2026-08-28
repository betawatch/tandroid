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
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia implements ok0, ff.p, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, ep, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ia(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.ok0
    public boolean a(int i9, View view) {
        ma maVar = (ma) this.b;
        maVar.getClass();
        maVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
    }

    @Override // org.telegram.ui.Components.ep
    public void b() {
        switch (this.a) {
            case 4:
                n4 n4Var = (n4) this.b;
                float progress = 1.0f - (n4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.o9 o9Var = n4Var.a;
                o9Var.setScaleX(progress);
                o9Var.setScaleY(progress);
                n4Var.invalidate();
                break;
            default:
                e7 e7Var = (e7) this.b;
                float progress2 = 1.0f - (e7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.o9 o9Var2 = e7Var.a;
                o9Var2.setScaleX(progress2);
                o9Var2.setScaleY(progress2);
                e7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        mi0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.a) {
            case 2:
                w0 w0Var = (w0) this.b;
                if (z10 && (lottieAnimation = w0Var.E.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = w0Var.D0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.L(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || w0Var.z1) {
                            messageObject2.wasUnread = false;
                            w0Var.z1 = false;
                            try {
                                w0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (w0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) w0Var.getContext()).t0.c(false);
                            }
                            TLRPC.VideoSize videoSize = w0Var.w1;
                            if (videoSize != null && (t0Var = w0Var.T0) != null) {
                                t0Var.V0(w0Var, w0Var.v1, videoSize);
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
                r7 r7Var = (r7) this.b;
                ImageReceiver imageReceiver2 = r7Var.d;
                ImageReceiver imageReceiver3 = r7Var.c;
                if (z10 && !z11 && (messageObject = r7Var.n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && r7Var.s0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    r7Var.a = dominantColor;
                    CheckBoxBase checkBoxBase = r7Var.L;
                    if (checkBoxBase != null && checkBoxBase.x != (v = org.telegram.ui.ActionBar.f6.v(dominantColor, org.telegram.ui.ActionBar.f6.l1(0.25f, -1)))) {
                        checkBoxBase.x = v;
                        checkBoxBase.b();
                        break;
                    }
                }
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i9, String str, Drawable drawable) {
        int i10 = this.a;
        org.telegram.messenger.g5.a(this, i9, str, drawable);
    }

    @Override // ff.p
    public void h(long j10) {
        ((l) this.b).b(j10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i9 = this.a;
        org.telegram.messenger.g5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return (CharSequence) ((mh.c) this.b).run((Integer) obj2);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        TLRPC.Message message;
        k4 k4Var;
        t1 t1Var = (t1) this.b;
        MessageObject messageObject = t1Var.u7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((k4Var = t1Var.B7) != null && k4Var.i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || t1Var.u7.isVoiceOnce() || t1Var.u7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
