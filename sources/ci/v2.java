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

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class v2 extends ChatActivityEnterView {
    public ValueAnimator o5;
    public int p5;
    public int q5;
    public int r5;
    public final /* synthetic */ q4 s5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(q4 q4Var, Activity activity, q4 q4Var2, t2 t2Var) {
        super(activity, q4Var2, null, true, t2Var);
        this.s5 = q4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void A0(int i10, int i11) {
        q4 q4Var = this.s5;
        if (q4Var.b2 != null) {
            this.n3 = true;
            this.q5 = this.E0.getMeasuredHeight();
            this.r5 = this.E0.getScrollY();
            invalidate();
            q4Var.invalidate();
            this.p5 = q4Var.b2.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void J1(int i10, boolean z10) {
        super.J1(i10, z10);
        S1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void O1(boolean z10) {
        q4 q4Var = this.s5;
        P1(q4Var.F1 || q4Var.G1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean Q0() {
        long messageMinPrice;
        int i10;
        if (this.A1.getAlpha() < 0.5f) {
            F0();
            return false;
        }
        q4 q4Var = this.s5;
        if (!q4Var.O1.f) {
            return super.Q0();
        }
        long j10 = q4Var.L3;
        messageMinPrice = q4Var.getMessageMinPrice();
        long max = Math.max(j10, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        int length = formatTextWithEntities.length();
        int[] iArr = MessagesController.getInstance(q4Var.C2).starsGroupcallMessageLimits;
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
        if (!q4Var.D0(true)) {
            if (formatTextWithEntities instanceof Spannable) {
                Spannable spannable = (Spannable) formatTextWithEntities;
                i10 = ((org.telegram.ui.Components.a6[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.a6.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
            } else {
                i10 = 0;
            }
            int i11 = (int) max;
            if (i10 > u.b(q4Var.C2, i11, 2) || formatTextWithEntities.length() > u.b(q4Var.C2, i11, 1)) {
                q4Var.O0();
                return false;
            }
        }
        q4Var.L0.o(textWithEntities, max);
        this.E0.setText("");
        AndroidUtilities.hideKeyboard(this);
        q4Var.L3 = 0L;
        q4Var.r0(true);
        I(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean R0(int i10, boolean z10, int i11, boolean z11, long j10) {
        q4 q4Var = this.s5;
        if (!MessagesController.getInstance(q4Var.C2).isFrozen()) {
            return super.R0(i10, z10, i11, z11, j10);
        }
        org.telegram.ui.b.b(q4Var.C2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S1() {
        boolean z10;
        ke keVar;
        q4 q4Var = this.s5;
        boolean z11 = q4Var.G2;
        if (!q4Var.b2.u0()) {
            v2 v2Var = q4Var.b2;
            if ((v2Var.k2 || v2Var.p4 <= 0.0f) && ((keVar = this.e1) == null || keVar.getVisibility() != 0)) {
                z10 = false;
                q4Var.G2 = z10;
                if (z11 == z10) {
                    if (q4Var.K1) {
                        aa aaVar = ((r9) q4Var.Q1).d;
                        aaVar.I0 = z10;
                        aaVar.P();
                    }
                    invalidate();
                    q4Var.c1.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = true;
        q4Var.G2 = z10;
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
        q4 q4Var = this.s5;
        rectF.set(0.0f, 0.0f, width + (q4Var.i2 != null ? this.y * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = q4Var.i2) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = q4Var.i2;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    q4.h0(q4Var);
                }
                q4Var.i2.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = q4Var.i2) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = q4Var.i2;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.s5.g2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.e1(f7, f10, f11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void f0(Menu menu) {
        sn.n8(menu, null, false, !this.s5.O1.f, true, true);
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
        q4 q4Var = this.s5;
        if (!q4Var.O1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = q4Var.getMessageMinPrice();
        return Math.max(messageMinPrice, q4Var.L3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean p1(Runnable runnable) {
        this.s5.n0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean r() {
        return this.s5.D0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void v0() {
        S1();
    }
}
