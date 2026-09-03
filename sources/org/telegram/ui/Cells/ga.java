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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga implements jl0, kf.o, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, lp, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ga(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.lp
    public void a() {
        switch (this.a) {
            case 4:
                m4 m4Var = (m4) this.b;
                float progress = 1.0f - (m4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.p9 p9Var = m4Var.a;
                p9Var.setScaleX(progress);
                p9Var.setScaleY(progress);
                m4Var.invalidate();
                break;
            default:
                d7 d7Var = (d7) this.b;
                float progress2 = 1.0f - (d7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.p9 p9Var2 = d7Var.a;
                p9Var2.setScaleX(progress2);
                p9Var2.setScaleY(progress2);
                d7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jl0
    public boolean d(int i10, View view) {
        ka kaVar = (ka) this.b;
        kaVar.getClass();
        kaVar.y1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
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
                                t0Var.l1(v0Var, v0Var.w1, videoSize);
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
                q7 q7Var = (q7) this.b;
                ImageReceiver imageReceiver2 = q7Var.d;
                ImageReceiver imageReceiver3 = q7Var.c;
                if (z4 && !z10 && (messageObject = q7Var.n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z4 && !z10 && q7Var.t0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    q7Var.a = dominantColor;
                    CheckBoxBase checkBoxBase = q7Var.M;
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

    @Override // kf.o
    public void e(long j10) {
        ((l) this.b).b(j10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return (CharSequence) ((yh) this.b).run((Integer) obj2);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        TLRPC.Message message;
        j4 j4Var;
        s1 s1Var = (s1) this.b;
        MessageObject messageObject = s1Var.v7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((j4Var = s1Var.C7) != null && j4Var.i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || s1Var.v7.isVoiceOnce() || s1Var.v7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
