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
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wh;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ha implements kl0, lf.o, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, mp, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ha(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.mp
    public void a() {
        switch (this.a) {
            case 4:
                n4 n4Var = (n4) this.b;
                float progress = 1.0f - (n4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.p9 p9Var = n4Var.a;
                p9Var.setScaleX(progress);
                p9Var.setScaleY(progress);
                n4Var.invalidate();
                break;
            default:
                e7 e7Var = (e7) this.b;
                float progress2 = 1.0f - (e7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.p9 p9Var2 = e7Var.a;
                p9Var2.setScaleX(progress2);
                p9Var2.setScaleY(progress2);
                e7Var.invalidate();
                break;
        }
    }

    @Override // lf.o
    public void d(long j10) {
        ((l) this.b).b(j10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        gj0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.a) {
            case 2:
                v0 v0Var = (v0) this.b;
                if (z4 && (lottieAnimation = v0Var.F.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = v0Var.E0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.L(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || v0Var.A1) {
                            messageObject2.wasUnread = false;
                            v0Var.A1 = false;
                            try {
                                v0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (v0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) v0Var.getContext()).u0.c(false);
                            }
                            TLRPC.VideoSize videoSize = v0Var.x1;
                            if (videoSize != null && (t0Var = v0Var.U0) != null) {
                                t0Var.i1(v0Var, v0Var.w1, videoSize);
                                break;
                            }
                        }
                    } else if (lottieAnimation.Y < 1) {
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
                if (z4 && !z10 && (messageObject = r7Var.n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z4 && !z10 && r7Var.t0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    r7Var.a = dominantColor;
                    CheckBoxBase checkBoxBase = r7Var.M;
                    if (checkBoxBase != null && checkBoxBase.x != (v = org.telegram.ui.ActionBar.j6.v(dominantColor, org.telegram.ui.ActionBar.j6.l1(0.25f, -1)))) {
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
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.kl0
    public boolean f(int i10, View view) {
        la laVar = (la) this.b;
        laVar.getClass();
        laVar.z1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return (CharSequence) ((wh) this.b).run((Integer) obj2);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        TLRPC.Message message;
        k4 k4Var;
        t1 t1Var = (t1) this.b;
        MessageObject messageObject = t1Var.v7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((k4Var = t1Var.C7) != null && k4Var.i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || t1Var.v7.isVoiceOnce() || t1Var.v7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
