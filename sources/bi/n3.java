package bi;

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
import org.telegram.ui.co;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes4.dex */
public final class n3 extends ChatActivityEnterView {
    public ValueAnimator n5;
    public int o5;
    public int p5;
    public int q5;
    public final /* synthetic */ o5 r5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(o5 o5Var, Activity activity, o5 o5Var2, k3 k3Var) {
        super(activity, o5Var2, null, true, k3Var);
        this.r5 = o5Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        o5 o5Var = this.r5;
        if (o5Var.b2 != null) {
            this.m3 = true;
            this.p5 = this.E0.getMeasuredHeight();
            this.q5 = this.E0.getScrollY();
            invalidate();
            o5Var.invalidate();
            this.o5 = o5Var.b2.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void L1(int i10, boolean z10) {
        super.L1(i10, z10);
        T1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void P1(boolean z10) {
        o5 o5Var = this.r5;
        Q1(o5Var.F1 || o5Var.G1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean S0() {
        long messageMinPrice;
        int i10;
        if (this.z1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        o5 o5Var = this.r5;
        if (!o5Var.O1.f) {
            return super.S0();
        }
        long j3 = o5Var.L3;
        messageMinPrice = o5Var.getMessageMinPrice();
        long max = Math.max(j3, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        int length = formatTextWithEntities.length();
        int[] iArr = MessagesController.getInstance(o5Var.C2).starsGroupcallMessageLimits;
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
        if (!o5Var.D0(true)) {
            if (formatTextWithEntities instanceof Spannable) {
                Spannable spannable = (Spannable) formatTextWithEntities;
                i10 = ((org.telegram.ui.Components.z5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.z5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
            } else {
                i10 = 0;
            }
            int i11 = (int) max;
            if (i10 > z.b(o5Var.C2, i11, 2) || formatTextWithEntities.length() > z.b(o5Var.C2, i11, 1)) {
                o5Var.O0();
                return false;
            }
        }
        o5Var.L0.o(textWithEntities, max);
        this.E0.setText("");
        AndroidUtilities.hideKeyboard(this);
        o5Var.L3 = 0L;
        o5Var.r0(true);
        K(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean T0(int i10, boolean z10, int i11, boolean z11, long j3) {
        o5 o5Var = this.r5;
        if (!MessagesController.getInstance(o5Var.C2).isFrozen()) {
            return super.T0(i10, z10, i11, z11, j3);
        }
        org.telegram.ui.b.b(o5Var.C2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1() {
        boolean z10;
        ke keVar;
        o5 o5Var = this.r5;
        boolean z11 = o5Var.G2;
        if (!o5Var.b2.w0()) {
            n3 n3Var = o5Var.b2;
            if ((n3Var.j2 || n3Var.o4 <= 0.0f) && ((keVar = this.e1) == null || keVar.getVisibility() != 0)) {
                z10 = false;
                o5Var.G2 = z10;
                if (z11 == z10) {
                    if (o5Var.K1) {
                        pb pbVar = ((gb) o5Var.Q1).d;
                        pbVar.I0 = z10;
                        pbVar.P();
                    }
                    invalidate();
                    o5Var.c1.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = true;
        o5Var.G2 = z10;
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
        o5 o5Var = this.r5;
        rectF.set(0.0f, 0.0f, width + (o5Var.i2 != null ? this.y * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = o5Var.i2) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = o5Var.i2;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    o5.h0(o5Var);
                }
                o5Var.i2.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = o5Var.i2) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = o5Var.i2;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.r5.O1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        o5 o5Var = this.r5;
        if (!o5Var.O1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = o5Var.getMessageMinPrice();
        return Math.max(messageMinPrice, o5Var.L3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h0(Menu menu) {
        co.k8(menu, null, false, !this.r5.O1.f, true, true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h1(float f7, float f10, float f11, boolean z10) {
        LinearLayout linearLayout = this.r5.g2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f11) * f7);
        }
        super.h1(f7, f10, f11, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean r1(Runnable runnable) {
        this.r5.n0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean t() {
        return this.r5.D0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void x0() {
        T1();
    }
}
