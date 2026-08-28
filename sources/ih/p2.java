package ih;

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
import org.telegram.ui.qn;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class p2 extends ChatActivityEnterView {
    public ValueAnimator j5;
    public int k5;
    public int l5;
    public int m5;
    public final /* synthetic */ i4 n5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(i4 i4Var, Activity activity, i4 i4Var2, n2 n2Var) {
        super(activity, i4Var2, null, true, n2Var);
        this.n5 = i4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void B0(int i9, int i10) {
        i4 i4Var = this.n5;
        if (i4Var.X1 != null) {
            this.i3 = true;
            this.l5 = this.A0.getMeasuredHeight();
            this.m5 = this.A0.getScrollY();
            invalidate();
            i4Var.invalidate();
            this.k5 = i4Var.X1.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void L1(int i9, boolean z10) {
        super.L1(i9, z10);
        T1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void P1(boolean z10) {
        i4 i4Var = this.n5;
        Q1(i4Var.B1 || i4Var.C1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean S0() {
        long messageMinPrice;
        int i9;
        if (this.v1.getAlpha() < 0.5f) {
            G0();
            return false;
        }
        i4 i4Var = this.n5;
        if (!i4Var.K1.f) {
            return super.S0();
        }
        long j10 = i4Var.H3;
        messageMinPrice = i4Var.getMessageMinPrice();
        long max = Math.max(j10, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        int length = formatTextWithEntities.length();
        int[] iArr = MessagesController.getInstance(i4Var.y2).starsGroupcallMessageLimits;
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
        if (!i4Var.D0(true)) {
            if (formatTextWithEntities instanceof Spannable) {
                Spannable spannable = (Spannable) formatTextWithEntities;
                i9 = ((org.telegram.ui.Components.t5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.t5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
            } else {
                i9 = 0;
            }
            int i10 = (int) max;
            if (i9 > u.b(i4Var.y2, i10, 2) || formatTextWithEntities.length() > u.b(i4Var.y2, i10, 1)) {
                i4Var.O0();
                return false;
            }
        }
        i4Var.H0.o(textWithEntities, max);
        this.A0.setText("");
        AndroidUtilities.hideKeyboard(this);
        i4Var.H3 = 0L;
        i4Var.r0(true);
        J(true);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean T0(int i9, boolean z10, int i10, boolean z11, long j10) {
        i4 i4Var = this.n5;
        if (!MessagesController.getInstance(i4Var.y2).isFrozen()) {
            return super.T0(i9, z10, i10, z11, j10);
        }
        org.telegram.ui.b.b(i4Var.y2);
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T1() {
        boolean z10;
        ae aeVar;
        i4 i4Var = this.n5;
        boolean z11 = i4Var.C2;
        if (!i4Var.X1.v0()) {
            p2 p2Var = i4Var.X1;
            if ((p2Var.f2 || p2Var.k4 <= 0.0f) && ((aeVar = this.a1) == null || aeVar.getVisibility() != 0)) {
                z10 = false;
                i4Var.C2 = z10;
                if (z11 == z10) {
                    if (i4Var.G1) {
                        m9 m9Var = ((d9) i4Var.M1).d;
                        m9Var.E0 = z10;
                        m9Var.P();
                    }
                    invalidate();
                    i4Var.Y0.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = true;
        i4Var.C2 = z10;
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
        i4 i4Var = this.n5;
        rectF.set(0.0f, 0.0f, width + (i4Var.e2 != null ? this.y * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = i4Var.e2) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = i4Var.e2;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    i4.h0(i4Var);
                }
                i4Var.e2.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = i4Var.e2) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = i4Var.e2;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void g0(Menu menu) {
        qn.k8(menu, null, false, !this.n5.K1.f, true, true);
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
        i4 i4Var = this.n5;
        if (!i4Var.K1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = i4Var.getMessageMinPrice();
        return Math.max(messageMinPrice, i4Var.H3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h1(float f10, float f11, float f12, boolean z10) {
        LinearLayout linearLayout = this.n5.c2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.h1(f10, f11, f12, z10);
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
    public final void w0() {
        T1();
    }
}
