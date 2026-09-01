package oh;

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
import org.telegram.ui.Components.ae;
import org.telegram.ui.xn;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class p2 extends ChatActivityEnterView {
    public ValueAnimator k5;
    public int l5;
    public int m5;
    public int n5;
    public final /* synthetic */ f4 o5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(f4 f4Var, Activity activity, f4 f4Var2, n2 n2Var) {
        super(activity, f4Var2, null, true, n2Var);
        this.o5 = f4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        f4 f4Var = this.o5;
        if (f4Var.Y1 != null) {
            this.j3 = true;
            this.m5 = this.B0.getMeasuredHeight();
            this.n5 = this.B0.getScrollY();
            invalidate();
            f4Var.invalidate();
            this.l5 = f4Var.Y1.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void L1(int i10, boolean z4) {
        super.L1(i10, z4);
        T1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void P1(boolean z4) {
        f4 f4Var = this.o5;
        Q1(f4Var.C1 || f4Var.D1, z4);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean S0() {
        long messageMinPrice;
        int i10;
        if (this.w1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        f4 f4Var = this.o5;
        if (!f4Var.L1.f) {
            return super.S0();
        }
        long j10 = f4Var.I3;
        messageMinPrice = f4Var.getMessageMinPrice();
        long max = Math.max(j10, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        int length = formatTextWithEntities.length();
        int[] iArr = MessagesController.getInstance(f4Var.z2).starsGroupcallMessageLimits;
        if (length > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
            NumberTextView numberTextView = this.V;
            if (numberTextView != null) {
                AndroidUtilities.shakeViewSpring(numberTextView, 3.5f);
                try {
                    this.V.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            return false;
        }
        if (!f4Var.D0(true)) {
            if (formatTextWithEntities instanceof Spannable) {
                Spannable spannable = (Spannable) formatTextWithEntities;
                i10 = ((org.telegram.ui.Components.u5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.u5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
            } else {
                i10 = 0;
            }
            int i11 = (int) max;
            if (i10 > s.b(f4Var.z2, i11, 2) || formatTextWithEntities.length() > s.b(f4Var.z2, i11, 1)) {
                f4Var.O0();
                return false;
            }
        }
        f4Var.I0.o(textWithEntities, max);
        this.B0.setText("");
        AndroidUtilities.hideKeyboard(this);
        f4Var.I3 = 0L;
        f4Var.r0(true);
        J(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean T0(int i10, boolean z4, int i11, boolean z10, long j10) {
        f4 f4Var = this.o5;
        if (!MessagesController.getInstance(f4Var.z2).isFrozen()) {
            return super.T0(i10, z4, i11, z10, j10);
        }
        org.telegram.ui.c.b(f4Var.z2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1() {
        boolean z4;
        ae aeVar;
        f4 f4Var = this.o5;
        boolean z10 = f4Var.D2;
        if (!f4Var.Y1.w0()) {
            p2 p2Var = f4Var.Y1;
            if ((p2Var.g2 || p2Var.l4 <= 0.0f) && ((aeVar = this.b1) == null || aeVar.getVisibility() != 0)) {
                z4 = false;
                f4Var.D2 = z4;
                if (z10 == z4) {
                    if (f4Var.H1) {
                        i9 i9Var = ((z8) f4Var.N1).d;
                        i9Var.F0 = z4;
                        i9Var.P();
                    }
                    invalidate();
                    f4Var.Z0.invalidate();
                    return;
                }
                return;
            }
        }
        z4 = true;
        f4Var.D2 = z4;
        if (z10 == z4) {
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
        f4 f4Var = this.o5;
        rectF.set(0.0f, 0.0f, width + (f4Var.f2 != null ? this.y * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = f4Var.f2) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = f4Var.f2;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    f4.h0(f4Var);
                }
                f4Var.f2.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = f4Var.f2) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = f4Var.f2;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.o5.L1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        f4 f4Var = this.o5;
        if (!f4Var.L1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = f4Var.getMessageMinPrice();
        return Math.max(messageMinPrice, f4Var.I3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h0(Menu menu) {
        xn.k8(menu, null, false, !this.o5.L1.f, true, true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h1(float f10, float f11, float f12, boolean z4) {
        LinearLayout linearLayout = this.o5.d2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.h1(f10, f11, f12, z4);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean r1(Runnable runnable) {
        this.o5.n0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean t() {
        return this.o5.D0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void x0() {
        T1();
    }
}
