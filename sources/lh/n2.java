package lh;

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
import org.telegram.ui.Components.de;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class n2 extends ChatActivityEnterView {
    public ValueAnimator j5;
    public int k5;
    public int l5;
    public int m5;
    public final /* synthetic */ d4 n5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(d4 d4Var, Activity activity, d4 d4Var2, l2 l2Var) {
        super(activity, d4Var2, null, true, l2Var);
        this.n5 = d4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        d4 d4Var = this.n5;
        if (d4Var.X1 != null) {
            this.i3 = true;
            this.l5 = this.A0.getMeasuredHeight();
            this.m5 = this.A0.getScrollY();
            invalidate();
            d4Var.invalidate();
            this.k5 = d4Var.X1.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void L1(int i10, boolean z10) {
        super.L1(i10, z10);
        T1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void P1(boolean z10) {
        d4 d4Var = this.n5;
        Q1(d4Var.B1 || d4Var.C1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean S0() {
        long messageMinPrice;
        int i10;
        if (this.v1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        d4 d4Var = this.n5;
        if (!d4Var.K1.f) {
            return super.S0();
        }
        long j10 = d4Var.H3;
        messageMinPrice = d4Var.getMessageMinPrice();
        long max = Math.max(j10, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        int length = formatTextWithEntities.length();
        int[] iArr = MessagesController.getInstance(d4Var.y2).starsGroupcallMessageLimits;
        if (length > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
            NumberTextView numberTextView = this.U;
            if (numberTextView != null) {
                AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                try {
                    this.U.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            return false;
        }
        if (!d4Var.D0(true)) {
            if (formatTextWithEntities instanceof Spannable) {
                Spannable spannable = (Spannable) formatTextWithEntities;
                i10 = ((org.telegram.ui.Components.y5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.y5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
            } else {
                i10 = 0;
            }
            int i11 = (int) max;
            if (i10 > s.b(d4Var.y2, i11, 2) || formatTextWithEntities.length() > s.b(d4Var.y2, i11, 1)) {
                d4Var.O0();
                return false;
            }
        }
        d4Var.H0.o(textWithEntities, max);
        this.A0.setText("");
        AndroidUtilities.hideKeyboard(this);
        d4Var.H3 = 0L;
        d4Var.r0(true);
        J(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean T0(int i10, boolean z10, int i11, boolean z11, long j10) {
        d4 d4Var = this.n5;
        if (!MessagesController.getInstance(d4Var.y2).isFrozen()) {
            return super.T0(i10, z10, i11, z11, j10);
        }
        org.telegram.ui.c.b(d4Var.y2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1() {
        boolean z10;
        de deVar;
        d4 d4Var = this.n5;
        boolean z11 = d4Var.C2;
        if (!d4Var.X1.w0()) {
            n2 n2Var = d4Var.X1;
            if ((n2Var.f2 || n2Var.k4 <= 0.0f) && ((deVar = this.a1) == null || deVar.getVisibility() != 0)) {
                z10 = false;
                d4Var.C2 = z10;
                if (z11 == z10) {
                    if (d4Var.G1) {
                        i9 i9Var = ((z8) d4Var.M1).d;
                        i9Var.E0 = z10;
                        i9Var.P();
                    }
                    invalidate();
                    d4Var.Y0.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = true;
        d4Var.C2 = z10;
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
        d4 d4Var = this.n5;
        rectF.set(0.0f, 0.0f, width + (d4Var.e2 != null ? this.y * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = d4Var.e2) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = d4Var.e2;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    d4.h0(d4Var);
                }
                d4Var.e2.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = d4Var.e2) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = d4Var.e2;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.n5.K1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        d4 d4Var = this.n5;
        if (!d4Var.K1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = d4Var.getMessageMinPrice();
        return Math.max(messageMinPrice, d4Var.H3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h0(Menu menu) {
        tn.k8(menu, null, false, !this.n5.K1.f, true, true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h1(float f9, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.n5.c2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f9);
        }
        super.h1(f9, f10, f11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean r1(Runnable runnable) {
        this.n5.n0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean t() {
        return this.n5.D0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void x0() {
        T1();
    }
}
