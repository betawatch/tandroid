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

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class i2 extends ChatActivityEnterView {
    public ValueAnimator o7;
    public int p7;
    public int q7;
    public int r7;
    public final /* synthetic */ z3 s7;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(z3 z3Var, Activity activity, z3 z3Var2, g2 g2Var) {
        super(activity, z3Var2, null, true, g2Var);
        this.s7 = z3Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void F1(float f10, float f11, float f12, boolean z10) {
        LinearLayout linearLayout = this.s7.Q1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.F1(f10, f11, f12, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F2() {
        boolean z10;
        de deVar;
        z3 z3Var = this.s7;
        boolean z11 = z3Var.q2;
        if (!z3Var.L1.R0()) {
            i2 i2Var = z3Var.L1;
            if ((i2Var.Y2 || i2Var.d5 <= 0.0f) && ((deVar = this.f1) == null || deVar.getVisibility() != 0)) {
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
    public final boolean R1(Runnable runnable) {
        this.s7.l0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void S0() {
        F2();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void Z0(int i7, int i10) {
        z3 z3Var = this.s7;
        if (z3Var.L1 != null) {
            this.b4 = true;
            this.q7 = this.F0.getMeasuredHeight();
            this.r7 = this.F0.getScrollY();
            invalidate();
            z3Var.invalidate();
            this.p7 = z3Var.L1.getBackgroundTop();
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
        z3 z3Var = this.s7;
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
        if (this.s7.y1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        z3 z3Var = this.s7;
        if (!z3Var.y1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = z3Var.getMessageMinPrice();
        return Math.max(messageMinPrice, z3Var.v3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void o2(int i7, boolean z10) {
        super.o2(i7, z10);
        F2();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean r1() {
        long messageMinPrice;
        int i7;
        if (this.o2.getAlpha() < 0.5f) {
            e1();
            return false;
        }
        z3 z3Var = this.s7;
        if (!z3Var.y1.f) {
            return super.r1();
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
                i7 = ((org.telegram.ui.Components.x5[]) spannable.getSpans(0, j02.length(), org.telegram.ui.Components.x5.class)).length + ((org.telegram.messenger.g6[]) spannable.getSpans(0, j02.length(), org.telegram.messenger.g6.class)).length;
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
    public final boolean s1(boolean z10, int i7, int i10, long j3, boolean z11) {
        z3 z3Var = this.s7;
        if (!mp.u1(z3Var.m2).A2()) {
            return super.s1(z10, i7, i10, j3, z11);
        }
        org.telegram.ui.b.b(z3Var.m2);
        return false;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void t2(boolean z10) {
        z3 z3Var = this.s7;
        u2(z3Var.p1 || z3Var.q1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean x() {
        return this.s7.B0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void y0(Menu menu) {
        bn.C8(menu, null, false, !this.s7.y1.f, true, true);
    }
}
