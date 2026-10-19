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
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.yp;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class ia implements yl0, zf.m, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, yp, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ia(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.yl0
    public boolean a(int i10, View view) {
        ma maVar = (ma) this.b;
        maVar.getClass();
        maVar.A1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
    }

    @Override // org.telegram.ui.Components.yp
    public void b() {
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
                e7 e7Var = (e7) this.b;
                float progress2 = 1.0f - (e7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.w9 w9Var2 = e7Var.a;
                w9Var2.setScaleX(progress2);
                w9Var2.setScaleY(progress2);
                e7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        uj0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.a) {
            case 2:
                w0 w0Var = (w0) this.b;
                if (z10 && (lottieAnimation = w0Var.I.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = w0Var.P0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.N(0, false, false);
                        AndroidUtilities.runOnUIThread(new r0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || w0Var.L1) {
                            messageObject2.wasUnread = false;
                            w0Var.L1 = false;
                            try {
                                w0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (w0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) w0Var.getContext()).x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = w0Var.I1;
                            if (videoSize != null && (t0Var = w0Var.f1) != null) {
                                t0Var.c1(w0Var, w0Var.H1, videoSize);
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
                    if (checkBoxBase != null && checkBoxBase.x != (v = org.telegram.ui.ActionBar.h6.v(dominantColor, org.telegram.ui.ActionBar.h6.m1(0.25f, -1)))) {
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
        org.telegram.messenger.k5.a(this, i10, str, drawable);
    }

    @Override // zf.m
    public void i(long j10) {
        ((l) this.b).b(j10);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.k5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return (CharSequence) ((gi.c) this.b).run((Integer) obj2);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        TLRPC.Message message;
        j4 j4Var;
        u1 u1Var = (u1) this.b;
        MessageObject messageObject = u1Var.y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((j4Var = u1Var.F7) != null && j4Var.i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || u1Var.y7.isVoiceOnce() || u1Var.y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
