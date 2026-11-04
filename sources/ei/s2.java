package ei;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.RectF;
import android.text.Spannable;
import android.text.TextPaint;
import android.view.Menu;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.sd;
import org.telegram.ui.wm;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class s2 extends ChatActivityEnterView {
    public ValueAnimator u5;
    public int v5;
    public int w5;
    public int x5;
    public final /* synthetic */ j4 y5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(j4 j4Var, Activity activity, j4 j4Var2, q2 q2Var) {
        super(activity, j4Var2, null, true, q2Var);
        this.y5 = j4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void B0(int i3, int i10) {
        j4 j4Var = this.y5;
        if (j4Var.L1 != null) {
            this.o3 = true;
            this.w5 = this.F0.getMeasuredHeight();
            this.x5 = this.F0.getScrollY();
            invalidate();
            j4Var.invalidate();
            this.v5 = j4Var.L1.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void M1(int i3, boolean z10) {
        super.M1(i3, z10);
        U1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void Q1(boolean z10) {
        j4 j4Var = this.y5;
        R1(j4Var.p1 || j4Var.q1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean R0() {
        long messageMinPrice;
        int i3;
        if (this.B1.getAlpha() < 0.5f) {
            G0();
            return false;
        }
        j4 j4Var = this.y5;
        if (!j4Var.y1.f) {
            return super.R0();
        }
        long j10 = j4Var.v3;
        messageMinPrice = j4Var.getMessageMinPrice();
        long max = Math.max(j10, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence j02 = zi.j0(textWithEntities, false, false, new TextPaint());
        int length = j02.length();
        int[] iArr = hp.s1(j4Var.m2).X6;
        if (length > ((iArr == null || iArr.length <= 2) ? 400 : iArr[2])) {
            NumberTextView numberTextView = this.c0;
            if (numberTextView != null) {
                org.telegram.messenger.g0.G3(3.5f, numberTextView, null);
                try {
                    this.c0.performHapticFeedback(3, 2);
                } catch (Exception unused) {
                }
            }
            return false;
        }
        if (!j4Var.B0(true)) {
            if (j02 instanceof Spannable) {
                Spannable spannable = (Spannable) j02;
                i3 = ((org.telegram.ui.Components.p5[]) spannable.getSpans(0, j02.length(), org.telegram.ui.Components.p5.class)).length + ((org.telegram.messenger.f6[]) spannable.getSpans(0, j02.length(), org.telegram.messenger.f6.class)).length;
            } else {
                i3 = 0;
            }
            int i10 = (int) max;
            if (i3 > u.b(j4Var.m2, i10, 2) || j02.length() > u.b(j4Var.m2, i10, 1)) {
                j4Var.M0();
                return false;
            }
        }
        j4Var.v0.o(textWithEntities, max);
        this.F0.setText("");
        org.telegram.messenger.g0.v1(this);
        j4Var.v3 = 0L;
        j4Var.p0(true);
        E(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean S0(boolean z10, int i3, int i10, long j10, boolean z11) {
        j4 j4Var = this.y5;
        if (!hp.s1(j4Var.m2).v2()) {
            return super.S0(z10, i3, i10, j10, z11);
        }
        org.telegram.ui.b.b(j4Var.m2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U1() {
        boolean z10;
        sd sdVar;
        j4 j4Var = this.y5;
        boolean z11 = j4Var.q2;
        if (!j4Var.L1.u0()) {
            s2 s2Var = j4Var.L1;
            if ((s2Var.l2 || s2Var.q4 <= 0.0f) && ((sdVar = this.f1) == null || sdVar.getVisibility() != 0)) {
                z10 = false;
                j4Var.q2 = z10;
                if (z11 == z10) {
                    if (j4Var.u1) {
                        r9 r9Var = ((i9) j4Var.A1).d;
                        r9Var.J0 = z10;
                        r9Var.d0();
                    }
                    invalidate();
                    j4Var.M0.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = true;
        j4Var.q2 = z10;
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
        RectF rectF = org.telegram.messenger.g0.P;
        float width = getWidth();
        j4 j4Var = this.y5;
        rectF.set(0.0f, 0.0f, width + (j4Var.S1 != null ? this.E * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = j4Var.S1) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = j4Var.S1;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    j4.f0(j4Var);
                }
                j4Var.S1.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = j4Var.S1) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = j4Var.S1;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void e0(Menu menu) {
        wm.A8(menu, null, false, !this.y5.y1.f, true, true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void g1(float f10, float f11, float f12, boolean z10) {
        LinearLayout linearLayout = this.y5.Q1;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.g1(f10, f11, f12, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final int getMessagesCount() {
        if (this.y5.y1.f) {
            return 1;
        }
        return super.getMessagesCount();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final long getStarsPrice() {
        long messageMinPrice;
        j4 j4Var = this.y5;
        if (!j4Var.y1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = j4Var.getMessageMinPrice();
        return Math.max(messageMinPrice, j4Var.v3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean q() {
        return this.y5.B0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean q1(Runnable runnable) {
        this.y5.l0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void v0() {
        U1();
    }
}
