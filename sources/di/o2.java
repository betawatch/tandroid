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
import org.telegram.ui.Components.ud;
import org.telegram.ui.an;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class o2 extends ChatActivityEnterView {
    public ValueAnimator t5;
    public int u5;
    public int v5;
    public int w5;
    public final /* synthetic */ i4 x5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(i4 i4Var, Activity activity, i4 i4Var2, m2 m2Var) {
        super(activity, i4Var2, null, true, m2Var);
        this.x5 = i4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i7, int i10) {
        i4 i4Var = this.x5;
        if (i4Var.K1 != null) {
            this.n3 = true;
            this.v5 = this.E0.getMeasuredHeight();
            this.w5 = this.E0.getScrollY();
            invalidate();
            i4Var.invalidate();
            this.u5 = i4Var.K1.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void N1(int i7, boolean z9) {
        super.N1(i7, z9);
        V1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void R1(boolean z9) {
        i4 i4Var = this.x5;
        S1(i4Var.o1 || i4Var.p1, z9);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean S0() {
        long messageMinPrice;
        int i7;
        if (this.A1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        i4 i4Var = this.x5;
        if (!i4Var.x1.f) {
            return super.S0();
        }
        long j3 = i4Var.u3;
        messageMinPrice = i4Var.getMessageMinPrice();
        long max = Math.max(j3, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence j02 = ij.j0(textWithEntities, false, false, new TextPaint());
        int length = j02.length();
        int[] iArr = qp.s1(i4Var.l2).X6;
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
        if (!i4Var.B0(true)) {
            if (j02 instanceof Spannable) {
                Spannable spannable = (Spannable) j02;
                i7 = ((org.telegram.ui.Components.r5[]) spannable.getSpans(0, j02.length(), org.telegram.ui.Components.r5.class)).length + ((org.telegram.messenger.f6[]) spannable.getSpans(0, j02.length(), org.telegram.messenger.f6.class)).length;
            } else {
                i7 = 0;
            }
            int i10 = (int) max;
            if (i7 > t.b(i4Var.l2, i10, 2) || j02.length() > t.b(i4Var.l2, i10, 1)) {
                i4Var.M0();
                return false;
            }
        }
        i4Var.u0.o(textWithEntities, max);
        this.E0.setText("");
        org.telegram.messenger.g0.v1(this);
        i4Var.u3 = 0L;
        i4Var.p0(true);
        E(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean T0(boolean z9, int i7, int i10, long j3, boolean z10) {
        i4 i4Var = this.x5;
        if (!qp.s1(i4Var.l2).v2()) {
            return super.T0(z9, i7, i10, j3, z10);
        }
        org.telegram.ui.b.b(i4Var.l2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V1() {
        boolean z9;
        ud udVar;
        i4 i4Var = this.x5;
        boolean z10 = i4Var.p2;
        if (!i4Var.K1.v0()) {
            o2 o2Var = i4Var.K1;
            if ((o2Var.k2 || o2Var.p4 <= 0.0f) && ((udVar = this.e1) == null || udVar.getVisibility() != 0)) {
                z9 = false;
                i4Var.p2 = z9;
                if (z10 == z9) {
                    if (i4Var.t1) {
                        p9 p9Var = ((g9) i4Var.z1).d;
                        p9Var.H0 = z9;
                        p9Var.V();
                    }
                    invalidate();
                    i4Var.L0.invalidate();
                    return;
                }
                return;
            }
        }
        z9 = true;
        i4Var.p2 = z9;
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
        i4 i4Var = this.x5;
        rectF.set(0.0f, 0.0f, width + (i4Var.R1 != null ? this.D * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = i4Var.R1) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = i4Var.R1;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    i4.f0(i4Var);
                }
                i4Var.R1.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = i4Var.R1) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = i4Var.R1;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e0(Menu menu) {
        an.A8(menu, null, false, !this.x5.x1.f, true, true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void g1(float f10, float f11, float f12, boolean z9) {
        LinearLayout linearLayout = this.x5.P1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.g1(f10, f11, f12, z9);
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
        i4 i4Var = this.x5;
        if (!i4Var.x1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = i4Var.getMessageMinPrice();
        return Math.max(messageMinPrice, i4Var.u3);
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
