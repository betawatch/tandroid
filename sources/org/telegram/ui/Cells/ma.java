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
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.op;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final /* synthetic */ class ma implements ol0, yf.m, ImageReceiver.ImageReceiverDelegate, FlagSecureReason.FlagSecureCondition, op, Utilities.Callback2Return {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ma(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // org.telegram.ui.Components.op
    public void a() {
        switch (this.a) {
            case 4:
                o4 o4Var = (o4) this.b;
                float progress = 1.0f - (o4Var.v.getProgress() * 0.143f);
                org.telegram.ui.Components.v9 v9Var = o4Var.a;
                v9Var.setScaleX(progress);
                v9Var.setScaleY(progress);
                o4Var.invalidate();
                break;
            default:
                h7 h7Var = (h7) this.b;
                float progress2 = 1.0f - (h7Var.d.getProgress() * 0.143f);
                org.telegram.ui.Components.v9 v9Var2 = h7Var.a;
                v9Var2.setScaleX(progress2);
                v9Var2.setScaleY(progress2);
                h7Var.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.ol0
    public boolean d(int i10, View view) {
        qa qaVar = (qa) this.b;
        qaVar.getClass();
        qaVar.A1(((ThemesHorizontalListCell$InnerThemeView) view).b);
        return true;
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        kj0 lottieAnimation;
        t0 t0Var;
        int v;
        MessageObject messageObject;
        switch (this.a) {
            case 2:
                w0 w0Var = (w0) this.b;
                if (z10 && (lottieAnimation = w0Var.I.getLottieAnimation()) != null) {
                    MessageObject messageObject2 = w0Var.H0;
                    if (messageObject2 != null && !messageObject2.playedGiftAnimation) {
                        messageObject2.playedGiftAnimation = true;
                        lottieAnimation.N(0, false, false);
                        AndroidUtilities.runOnUIThread(new q0(lottieAnimation, 0));
                        if (messageObject2.wasUnread || w0Var.D1) {
                            messageObject2.wasUnread = false;
                            w0Var.D1 = false;
                            try {
                                w0Var.performHapticFeedback(3, 2);
                            } catch (Exception unused) {
                            }
                            if (w0Var.getContext() instanceof LaunchActivity) {
                                ((LaunchActivity) w0Var.getContext()).x0.c(false);
                            }
                            TLRPC.VideoSize videoSize = w0Var.A1;
                            if (videoSize != null && (t0Var = w0Var.X0) != null) {
                                t0Var.h1(w0Var, w0Var.z1, videoSize);
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
                u7 u7Var = (u7) this.b;
                ImageReceiver imageReceiver2 = u7Var.d;
                ImageReceiver imageReceiver3 = u7Var.c;
                if (z10 && !z11 && (messageObject = u7Var.n) != null && messageObject.hasMediaSpoilers() && imageReceiver3.getBitmap() != null) {
                    if (imageReceiver2.getBitmap() != null) {
                        imageReceiver2.getBitmap().recycle();
                    }
                    imageReceiver2.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver3.getBitmap()));
                }
                if (z10 && !z11 && u7Var.w0 && imageReceiver3.getBitmap() != null) {
                    int dominantColor = AndroidUtilities.getDominantColor(imageReceiver3.getBitmap());
                    u7Var.a = dominantColor;
                    CheckBoxBase checkBoxBase = u7Var.P;
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
        org.telegram.messenger.h5.a(this, i10, str, drawable);
    }

    @Override // yf.m
    public void e(long j3) {
        ((l) this.b).b(j3);
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        int i10 = this.a;
        org.telegram.messenger.h5.b(this, imageReceiver);
    }

    @Override // org.telegram.messenger.Utilities.Callback2Return
    public Object run(Object obj, Object obj2) {
        return (CharSequence) ((ei.c) this.b).run((Integer) obj2);
    }

    @Override // org.telegram.messenger.FlagSecureReason.FlagSecureCondition
    public boolean run() {
        TLRPC.Message message;
        l4 l4Var;
        u1 u1Var = (u1) this.b;
        MessageObject messageObject = u1Var.y7;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            return false;
        }
        if (messageObject.type != 29 || ((l4Var = u1Var.F7) != null && l4Var.i)) {
            return (message.noforwards && !messageObject.isEphemeral()) || u1Var.y7.isVoiceOnce() || u1Var.y7.hasRevealedExtendedMedia();
        }
        return true;
    }
}
