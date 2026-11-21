package fi;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.fj;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.de;
import org.telegram.ui.bn;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class i2 extends ChatActivityEnterView {
    public ValueAnimator t7;
    public int u7;
    public int v7;
    public int w7;
    public final /* synthetic */ z3 x7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(z3 z3Var, Activity activity, z3 z3Var2, g2 g2Var) {
        super(activity, z3Var2, null, true, g2Var);
        this.x7 = z3Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(Menu menu) {
        bn.C8(menu, null, false, !this.x7.y1.f, true, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I2() {
        boolean z10;
        de deVar;
        z3 z3Var = this.x7;
        boolean z11 = z3Var.q2;
        if (!z3Var.L1.V0()) {
            i2 i2Var = z3Var.L1;
            if ((i2Var.a3 || i2Var.f5 <= 0.0f) && ((deVar = this.f1) == null || deVar.getVisibility() != 0)) {
                z10 = false;
                z3Var.q2 = z10;
                if (z11 == z10) {
                    if (z3Var.u1) {
                        f9 f9Var = ((w8) z3Var.A1).d;
                        f9Var.I0 = z10;
                        f9Var.V();
                    }
                    invalidate();
                    z3Var.M0.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = true;
        z3Var.q2 = z10;
        if (z11 == z10) {
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void J1(float f10, float f11, float f12, boolean z10) {
        LinearLayout linearLayout = this.x7.Q1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.J1(f10, f11, f12, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean V1(Runnable runnable) {
        this.x7.l0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void W0() {
        I2();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void d1(int i7, int i10) {
        z3 z3Var = this.x7;
        if (z3Var.L1 != null) {
            this.d4 = true;
            this.v7 = this.F0.getMeasuredHeight();
            this.w7 = this.F0.getScrollY();
            invalidate();
            z3Var.invalidate();
            this.u7 = z3Var.L1.getBackgroundTop();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        TextView textView;
        TextView textView2;
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        RectF rectF = org.telegram.messenger.g0.P;
        float width = getWidth();
        z3 z3Var = this.x7;
        rectF.set(0.0f, 0.0f, width + (z3Var.S1 != null ? this.E * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = z3Var.S1) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = z3Var.S1;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    z3.f0(z3Var);
                }
                z3Var.S1.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = z3Var.S1) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = z3Var.S1;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.x7.y1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        z3 z3Var = this.x7;
        if (!z3Var.y1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = z3Var.getMessageMinPrice();
        return Math.max(messageMinPrice, z3Var.v3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void s2(int i7, boolean z10) {
        super.s2(i7, z10);
        I2();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean v1() {
        long messageMinPrice;
        int i7;
        if (this.q2.getAlpha() < 0.5f) {
            i1();
            return false;
        }
        z3 z3Var = this.x7;
        if (!z3Var.y1.f) {
            return super.v1();
        }
        long j3 = z3Var.v3;
        messageMinPrice = z3Var.getMessageMinPrice();
        long max = Math.max(j3, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence j02 = fj.j0(textWithEntities, false, false, new TextPaint());
        int length = j02.length();
        int[] iArr = mp.u1(z3Var.m2).a7;
        if (length > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                org.telegram.messenger.g0.E3(3.5f, numberTextView, null);
                try {
                    this.c0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            return false;
        }
        if (!z3Var.B0(true)) {
            if (j02 instanceof Spannable) {
                Spannable spannable = (Spannable) j02;
                i7 = ((org.telegram.ui.Components.y5[]) spannable.getSpans(0, j02.length(), org.telegram.ui.Components.y5.class)).length + ((org.telegram.messenger.g6[]) spannable.getSpans(0, j02.length(), org.telegram.messenger.g6.class)).length;
            } else {
                i7 = 0;
            }
            int i10 = (int) max;
            if (i7 > t.b(z3Var.m2, i10, 2) || j02.length() > t.b(z3Var.m2, i10, 1)) {
                z3Var.M0();
                return false;
            }
        }
        z3Var.v0.o(textWithEntities, max);
        this.F0.setText("");
        org.telegram.messenger.g0.v1(this);
        z3Var.v3 = 0L;
        z3Var.p0(true);
        P(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean w1(boolean z10, int i7, int i10, long j3, boolean z11) {
        z3 z3Var = this.x7;
        if (!mp.u1(z3Var.m2).A2()) {
            return super.w1(z10, i7, i10, j3, z11);
        }
        org.telegram.ui.b.b(z3Var.m2);
        return false;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void w2(boolean z10) {
        z3 z3Var = this.x7;
        x2(z3Var.p1 || z3Var.q1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean x() {
        return this.x7.B0(true);
    }
}
