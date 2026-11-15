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
import org.telegram.messenger.gj;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.ud;
import org.telegram.ui.an;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class k2 extends ChatActivityEnterView {
    public ValueAnimator O6;
    public int P6;
    public int Q6;
    public int R6;
    public final /* synthetic */ b4 S6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(b4 b4Var, Activity activity, b4 b4Var2, i2 i2Var) {
        super(activity, b4Var2, null, true, i2Var);
        this.S6 = b4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean J1(Runnable runnable) {
        this.S6.l0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void K0() {
        v2();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void R0(int i7, int i10) {
        b4 b4Var = this.S6;
        if (b4Var.L1 != null) {
            this.V3 = true;
            this.Q6 = this.F0.getMeasuredHeight();
            this.R6 = this.F0.getScrollY();
            invalidate();
            b4Var.invalidate();
            this.P6 = b4Var.L1.getBackgroundTop();
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
        b4 b4Var = this.S6;
        rectF.set(0.0f, 0.0f, width + (b4Var.S1 != null ? this.E * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = b4Var.S1) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = b4Var.S1;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    b4.f0(b4Var);
                }
                b4Var.S1.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = b4Var.S1) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = b4Var.S1;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void f2(int i7, boolean z10) {
        super.f2(i7, z10);
        v2();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.S6.y1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        b4 b4Var = this.S6;
        if (!b4Var.y1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = b4Var.getMessageMinPrice();
        return Math.max(messageMinPrice, b4Var.v3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean j1() {
        long messageMinPrice;
        int i7;
        if (this.i2.getAlpha() < 0.5f) {
            W0();
            return false;
        }
        b4 b4Var = this.S6;
        if (!b4Var.y1.f) {
            return super.j1();
        }
        long j3 = b4Var.v3;
        messageMinPrice = b4Var.getMessageMinPrice();
        long max = Math.max(j3, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence j02 = gj.j0(textWithEntities, false, false, new TextPaint());
        int length = j02.length();
        int[] iArr = np.s1(b4Var.m2).Y6;
        if (length > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                org.telegram.messenger.g0.F3(3.5f, numberTextView, null);
                try {
                    this.c0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            return false;
        }
        if (!b4Var.B0(true)) {
            if (j02 instanceof Spannable) {
                Spannable spannable = (Spannable) j02;
                i7 = ((org.telegram.ui.Components.p5[]) spannable.getSpans(0, j02.length(), org.telegram.ui.Components.p5.class)).length + ((org.telegram.messenger.g6[]) spannable.getSpans(0, j02.length(), org.telegram.messenger.g6.class)).length;
            } else {
                i7 = 0;
            }
            int i10 = (int) max;
            if (i7 > t.b(b4Var.m2, i10, 2) || j02.length() > t.b(b4Var.m2, i10, 1)) {
                b4Var.M0();
                return false;
            }
        }
        b4Var.v0.o(textWithEntities, max);
        this.F0.setText("");
        org.telegram.messenger.g0.v1(this);
        b4Var.v3 = 0L;
        b4Var.p0(true);
        N(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void j2(boolean z10) {
        b4 b4Var = this.S6;
        k2(b4Var.p1 || b4Var.q1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean k1(boolean z10, int i7, int i10, long j3, boolean z11) {
        b4 b4Var = this.S6;
        if (!np.s1(b4Var.m2).v2()) {
            return super.k1(z10, i7, i10, j3, z11);
        }
        org.telegram.ui.b.b(b4Var.m2);
        return false;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void q0(Menu menu) {
        an.C8(menu, null, false, !this.S6.y1.f, true, true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean v() {
        return this.S6.B0(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v2() {
        boolean z10;
        ud udVar;
        b4 b4Var = this.S6;
        boolean z11 = b4Var.q2;
        if (!b4Var.L1.J0()) {
            k2 k2Var = b4Var.L1;
            if ((k2Var.S2 || k2Var.X4 <= 0.0f) && ((udVar = this.f1) == null || udVar.getVisibility() != 0)) {
                z10 = false;
                b4Var.q2 = z10;
                if (z11 == z10) {
                    if (b4Var.u1) {
                        i9 i9Var = ((z8) b4Var.A1).d;
                        i9Var.I0 = z10;
                        i9Var.V();
                    }
                    invalidate();
                    b4Var.M0.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = true;
        b4Var.q2 = z10;
        if (z11 == z10) {
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void x1(float f10, float f11, float f12, boolean z10) {
        LinearLayout linearLayout = this.S6.Q1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.x1(f10, f11, f12, z10);
    }
}
