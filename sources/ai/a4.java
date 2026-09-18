package ai;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ie;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class a4 extends ChatActivityEnterView {
    public ValueAnimator o5;
    public int p5;
    public int q5;
    public int r5;
    public final /* synthetic */ f6 s5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(f6 f6Var, Activity activity, f6 f6Var2, x3 x3Var) {
        super(activity, f6Var2, null, true, x3Var);
        this.s5 = f6Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void D0(int i10, int i11) {
        f6 f6Var = this.s5;
        if (f6Var.b2 != null) {
            this.m3 = true;
            this.q5 = this.E0.getMeasuredHeight();
            this.r5 = this.E0.getScrollY();
            invalidate();
            f6Var.invalidate();
            this.p5 = f6Var.b2.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void L1(int i10, boolean z10) {
        super.L1(i10, z10);
        U1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void Q1(boolean z10) {
        f6 f6Var = this.s5;
        R1(f6Var.F1 || f6Var.G1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean T0() {
        long messageMinPrice;
        int i10;
        if (this.z1.getAlpha() < 0.5f) {
            I0();
            return false;
        }
        f6 f6Var = this.s5;
        if (!f6Var.O1.f) {
            return super.T0();
        }
        long j3 = f6Var.L3;
        messageMinPrice = f6Var.getMessageMinPrice();
        long max = Math.max(j3, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        int length = formatTextWithEntities.length();
        int[] iArr = MessagesController.getInstance(f6Var.C2).starsGroupcallMessageLimits;
        if (length > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
            NumberTextView numberTextView = this.b0;
            if (numberTextView != null) {
                AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                try {
                    this.b0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            return false;
        }
        if (!f6Var.D0(true)) {
            if (formatTextWithEntities instanceof Spannable) {
                Spannable spannable = (Spannable) formatTextWithEntities;
                i10 = ((org.telegram.ui.Components.x5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.x5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
            } else {
                i10 = 0;
            }
            int i11 = (int) max;
            if (i10 > g0.b(f6Var.C2, i11, 2) || formatTextWithEntities.length() > g0.b(f6Var.C2, i11, 1)) {
                f6Var.O0();
                return false;
            }
        }
        f6Var.L0.o(textWithEntities, max);
        this.E0.setText("");
        AndroidUtilities.hideKeyboard(this);
        f6Var.L3 = 0L;
        f6Var.r0(true);
        L(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean U0(int i10, boolean z10, int i11, boolean z11, long j3) {
        f6 f6Var = this.s5;
        if (!MessagesController.getInstance(f6Var.C2).isFrozen()) {
            return super.U0(i10, z10, i11, z11, j3);
        }
        org.telegram.ui.b.b(f6Var.C2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U1() {
        boolean z10;
        ie ieVar;
        f6 f6Var = this.s5;
        boolean z11 = f6Var.G2;
        if (!f6Var.b2.x0()) {
            a4 a4Var = f6Var.b2;
            if ((a4Var.j2 || a4Var.o4 <= 0.0f) && ((ieVar = this.e1) == null || ieVar.getVisibility() != 0)) {
                z10 = false;
                f6Var.G2 = z10;
                if (z11 == z10) {
                    if (f6Var.K1) {
                        jc jcVar = ((ac) f6Var.Q1).d;
                        jcVar.I0 = z10;
                        jcVar.P();
                    }
                    invalidate();
                    f6Var.c1.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = true;
        f6Var.G2 = z10;
        if (z11 == z10) {
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TextView textView;
        TextView textView2;
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        float width = getWidth();
        f6 f6Var = this.s5;
        rectF.set(0.0f, 0.0f, width + (f6Var.i2 != null ? this.y * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = f6Var.i2) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = f6Var.i2;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    f6.h0(f6Var);
                }
                f6Var.i2.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = f6Var.i2) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = f6Var.i2;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.s5.O1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        f6 f6Var = this.s5;
        if (!f6Var.O1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = f6Var.getMessageMinPrice();
        return Math.max(messageMinPrice, f6Var.L3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.s5.g2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.h1(f7, f10, f11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void i0(Menu menu) {
        bo.k8(menu, null, false, !this.s5.O1.f, true, true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean r1(Runnable runnable) {
        this.s5.n0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean u() {
        return this.s5.D0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0() {
        U1();
    }
}
