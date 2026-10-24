package ci;

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
import org.telegram.ui.Components.ke;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class u2 extends ChatActivityEnterView {
    public ValueAnimator s5;
    public int t5;
    public int u5;
    public int v5;
    public final /* synthetic */ p4 w5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(p4 p4Var, Activity activity, p4 p4Var2, s2 s2Var) {
        super(activity, p4Var2, null, true, s2Var);
        this.w5 = p4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(int i10, int i11) {
        p4 p4Var = this.w5;
        if (p4Var.b2 != null) {
            this.n3 = true;
            this.u5 = this.E0.getMeasuredHeight();
            this.v5 = this.E0.getScrollY();
            invalidate();
            p4Var.invalidate();
            this.t5 = p4Var.b2.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void I1(int i10, boolean z10) {
        super.I1(i10, z10);
        Q1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void M1(boolean z10) {
        p4 p4Var = this.w5;
        N1(p4Var.F1 || p4Var.G1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean Q0() {
        long messageMinPrice;
        int i10;
        if (this.A1.getAlpha() < 0.5f) {
            F0();
            return false;
        }
        p4 p4Var = this.w5;
        if (!p4Var.O1.f) {
            return super.Q0();
        }
        long j10 = p4Var.L3;
        messageMinPrice = p4Var.getMessageMinPrice();
        long max = Math.max(j10, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        int length = formatTextWithEntities.length();
        int[] iArr = MessagesController.getInstance(p4Var.C2).starsGroupcallMessageLimits;
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
        if (!p4Var.C0(true)) {
            if (formatTextWithEntities instanceof Spannable) {
                Spannable spannable = (Spannable) formatTextWithEntities;
                i10 = ((org.telegram.ui.Components.a6[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.a6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
            } else {
                i10 = 0;
            }
            int i11 = (int) max;
            if (i10 > u.b(p4Var.C2, i11, 2) || formatTextWithEntities.length() > u.b(p4Var.C2, i11, 1)) {
                p4Var.N0();
                return false;
            }
        }
        p4Var.L0.o(textWithEntities, max);
        this.E0.setText("");
        AndroidUtilities.hideKeyboard(this);
        p4Var.L3 = 0L;
        p4Var.q0(true);
        F(true);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Q1() {
        boolean z10;
        ke keVar;
        p4 p4Var = this.w5;
        boolean z11 = p4Var.G2;
        if (!p4Var.b2.t0()) {
            u2 u2Var = p4Var.b2;
            if ((u2Var.k2 || u2Var.p4 <= 0.0f) && ((keVar = this.e1) == null || keVar.getVisibility() != 0)) {
                z10 = false;
                p4Var.G2 = z10;
                if (z11 == z10) {
                    if (p4Var.K1) {
                        z9 z9Var = ((q9) p4Var.Q1).d;
                        z9Var.I0 = z10;
                        z9Var.P();
                    }
                    invalidate();
                    p4Var.c1.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = true;
        p4Var.G2 = z10;
        if (z11 == z10) {
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean R0(int i10, boolean z10, int i11, boolean z11, long j10) {
        p4 p4Var = this.w5;
        if (!MessagesController.getInstance(p4Var.C2).isFrozen()) {
            return super.R0(i10, z10, i11, z11, j10);
        }
        org.telegram.ui.b.b(p4Var.C2);
        return false;
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
        p4 p4Var = this.w5;
        rectF.set(0.0f, 0.0f, width + (p4Var.i2 != null ? this.y * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = p4Var.i2) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = p4Var.i2;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    p4.g0(p4Var);
                }
                p4Var.i2.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = p4Var.i2) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = p4Var.i2;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e0(Menu menu) {
        sn.n8(menu, null, false, !this.w5.O1.f, true, true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.w5.g2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.e1(f7, f10, f11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.w5.O1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        p4 p4Var = this.w5;
        if (!p4Var.O1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = p4Var.getMessageMinPrice();
        return Math.max(messageMinPrice, p4Var.L3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean o1(Runnable runnable) {
        this.w5.m0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean r() {
        return this.w5.C0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void u0() {
        Q1();
    }
}
