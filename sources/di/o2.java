package di;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.ij;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.td;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class o2 extends ChatActivityEnterView {
    public ValueAnimator t5;
    public int u5;
    public int v5;
    public int w5;
    public final /* synthetic */ j4 x5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(j4 j4Var, Activity activity, j4 j4Var2, m2 m2Var) {
        super(activity, j4Var2, null, true, m2Var);
        this.x5 = j4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i7, int i10) {
        j4 j4Var = this.x5;
        if (j4Var.K1 != null) {
            this.n3 = true;
            this.v5 = this.E0.getMeasuredHeight();
            this.w5 = this.E0.getScrollY();
            invalidate();
            j4Var.invalidate();
            this.u5 = j4Var.K1.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void N1(int i7, boolean z9) {
        super.N1(i7, z9);
        V1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void R1(boolean z9) {
        j4 j4Var = this.x5;
        S1(j4Var.o1 || j4Var.p1, z9);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean S0() {
        long messageMinPrice;
        int i7;
        if (this.A1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        j4 j4Var = this.x5;
        if (!j4Var.x1.f) {
            return super.S0();
        }
        long j3 = j4Var.u3;
        messageMinPrice = j4Var.getMessageMinPrice();
        long max = Math.max(j3, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence j02 = ij.j0(textWithEntities, false, false, new TextPaint());
        int length = j02.length();
        int[] iArr = qp.s1(j4Var.l2).X6;
        if (length > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
            NumberTextView numberTextView = this.b0;
            if (numberTextView != null) {
                org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                try {
                    this.b0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            return false;
        }
        if (!j4Var.B0(true)) {
            if (j02 instanceof Spannable) {
                Spannable spannable = (Spannable) j02;
                i7 = ((org.telegram.ui.Components.q5[]) spannable.getSpans(0, j02.length(), org.telegram.ui.Components.q5.class)).length + ((org.telegram.messenger.f6[]) spannable.getSpans(0, j02.length(), org.telegram.messenger.f6.class)).length;
            } else {
                i7 = 0;
            }
            int i10 = (int) max;
            if (i7 > t.b(j4Var.l2, i10, 2) || j02.length() > t.b(j4Var.l2, i10, 1)) {
                j4Var.M0();
                return false;
            }
        }
        j4Var.u0.o(textWithEntities, max);
        this.E0.setText("");
        org.telegram.messenger.g0.v1(this);
        j4Var.u3 = 0L;
        j4Var.p0(true);
        E(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean T0(boolean z9, int i7, int i10, long j3, boolean z10) {
        j4 j4Var = this.x5;
        if (!qp.s1(j4Var.l2).v2()) {
            return super.T0(z9, i7, i10, j3, z10);
        }
        org.telegram.ui.b.b(j4Var.l2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V1() {
        boolean z9;
        td tdVar;
        j4 j4Var = this.x5;
        boolean z10 = j4Var.p2;
        if (!j4Var.K1.v0()) {
            o2 o2Var = j4Var.K1;
            if ((o2Var.k2 || o2Var.p4 <= 0.0f) && ((tdVar = this.e1) == null || tdVar.getVisibility() != 0)) {
                z9 = false;
                j4Var.p2 = z9;
                if (z10 == z9) {
                    if (j4Var.t1) {
                        q9 q9Var = ((h9) j4Var.z1).d;
                        q9Var.H0 = z9;
                        q9Var.V();
                    }
                    invalidate();
                    j4Var.L0.invalidate();
                    return;
                }
                return;
            }
        }
        z9 = true;
        j4Var.p2 = z9;
        if (z10 == z9) {
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
        j4 j4Var = this.x5;
        rectF.set(0.0f, 0.0f, width + (j4Var.R1 != null ? this.D * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = j4Var.R1) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = j4Var.R1;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    j4.f0(j4Var);
                }
                j4Var.R1.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = j4Var.R1) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = j4Var.R1;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e0(Menu menu) {
        cn.B8(menu, null, false, !this.x5.x1.f, true, true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.x5.x1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        j4 j4Var = this.x5;
        if (!j4Var.x1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = j4Var.getMessageMinPrice();
        return Math.max(messageMinPrice, j4Var.u3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h1(float f10, float f11, float f12, boolean z9) {
        LinearLayout linearLayout = this.x5.P1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.h1(f10, f11, f12, z9);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean q() {
        return this.x5.B0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean r1(Runnable runnable) {
        this.x5.l0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void w0() {
        V1();
    }
}
