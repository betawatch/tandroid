package jh;

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
import org.telegram.ui.Components.wd;
import org.telegram.ui.rn;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class o2 extends ChatActivityEnterView {
    public ValueAnimator j5;
    public int k5;
    public int l5;
    public int m5;
    public final /* synthetic */ e4 n5;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(e4 e4Var, Activity activity, e4 e4Var2, m2 m2Var) {
        super(activity, e4Var2, null, true, m2Var);
        this.n5 = e4Var;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void C0(int i10, int i11) {
        e4 e4Var = this.n5;
        if (e4Var.X1 != null) {
            this.i3 = true;
            this.l5 = this.A0.getMeasuredHeight();
            this.m5 = this.A0.getScrollY();
            invalidate();
            e4Var.invalidate();
            this.k5 = e4Var.X1.getBackgroundTop();
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void K1(int i10, boolean z10) {
        super.K1(i10, z10);
        S1();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void O1(boolean z10) {
        e4 e4Var = this.n5;
        P1(e4Var.B1 || e4Var.C1, z10);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean S0() {
        long messageMinPrice;
        int i10;
        if (this.v1.getAlpha() < 0.5f) {
            H0();
            return false;
        }
        e4 e4Var = this.n5;
        if (!e4Var.K1.f) {
            return super.S0();
        }
        long j10 = e4Var.H3;
        messageMinPrice = e4Var.getMessageMinPrice();
        long max = Math.max(j10, messageMinPrice);
        TLRPC.TL_textWithEntities textWithEntities = getTextWithEntities();
        CharSequence formatTextWithEntities = MessageObject.formatTextWithEntities(textWithEntities, false, new TextPaint());
        int length = formatTextWithEntities.length();
        int[] iArr = MessagesController.getInstance(e4Var.y2).starsGroupcallMessageLimits;
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
        if (!e4Var.D0(true)) {
            if (formatTextWithEntities instanceof Spannable) {
                Spannable spannable = (Spannable) formatTextWithEntities;
                i10 = ((org.telegram.ui.Components.t5[]) spannable.getSpans(0, formatTextWithEntities.length(), org.telegram.ui.Components.t5.class)).length + ((Emoji.EmojiSpan[]) spannable.getSpans(0, formatTextWithEntities.length(), Emoji.EmojiSpan.class)).length;
            } else {
                i10 = 0;
            }
            int i11 = (int) max;
            if (i10 > s.b(e4Var.y2, i11, 2) || formatTextWithEntities.length() > s.b(e4Var.y2, i11, 1)) {
                e4Var.O0();
                return false;
            }
        }
        e4Var.H0.o(textWithEntities, max);
        this.A0.setText("");
        AndroidUtilities.hideKeyboard(this);
        e4Var.H3 = 0L;
        e4Var.r0(true);
        K(true);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S1() {
        boolean z10;
        wd wdVar;
        e4 e4Var = this.n5;
        boolean z11 = e4Var.C2;
        if (!e4Var.X1.w0()) {
            o2 o2Var = e4Var.X1;
            if ((o2Var.f2 || o2Var.k4 <= 0.0f) && ((wdVar = this.a1) == null || wdVar.getVisibility() != 0)) {
                z10 = false;
                e4Var.C2 = z10;
                if (z11 == z10) {
                    if (e4Var.G1) {
                        i9 i9Var = ((z8) e4Var.M1).d;
                        i9Var.E0 = z10;
                        i9Var.P();
                    }
                    invalidate();
                    e4Var.Y0.invalidate();
                    return;
                }
                return;
            }
        }
        z10 = true;
        e4Var.C2 = z10;
        if (z11 == z10) {
        }
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean T0(int i10, boolean z10, int i11, boolean z11, long j10) {
        e4 e4Var = this.n5;
        if (!MessagesController.getInstance(e4Var.y2).isFrozen()) {
            return super.T0(i10, z10, i11, z11, j10);
        }
        org.telegram.ui.b.b(e4Var.y2);
        return false;
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
        e4 e4Var = this.n5;
        rectF.set(0.0f, 0.0f, width + (e4Var.e2 != null ? this.y * 1.5f : 0.0f), getHeight());
        boolean contains = rectF.contains(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() == 0) {
            if (contains && (textView2 = e4Var.e2) != null) {
                textView2.setPressed(true);
            }
        } else if (motionEvent.getAction() == 1) {
            TextView textView3 = e4Var.e2;
            if (textView3 != null) {
                if (contains && textView3.isPressed()) {
                    e4.h0(e4Var);
                }
                e4Var.e2.setPressed(false);
            }
        } else if (motionEvent.getAction() == 3 && (textView = e4Var.e2) != null) {
            textView.setPressed(false);
        }
        TextView textView4 = e4Var.e2;
        return textView4 != null && textView4.isPressed();
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void g1(float f10, float f11, float f12, boolean z10) {
        LinearLayout linearLayout = this.n5.c2;
        if (linearLayout != null) {
            linearLayout.setTranslationX((1.0f - f12) * f10);
        }
        super.g1(f10, f11, f12, z10);
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
        e4 e4Var = this.n5;
        if (!e4Var.K1.f) {
            return super.getStarsPrice();
        }
        messageMinPrice = e4Var.getMessageMinPrice();
        return Math.max(messageMinPrice, e4Var.H3);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void h0(Menu menu) {
        rn.k8(menu, null, false, !this.n5.K1.f, true, true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean q1(Runnable runnable) {
        this.n5.n0(runnable);
        return true;
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final boolean u() {
        return this.n5.D0(true);
    }

    @Override // org.telegram.ui.Components.ChatActivityEnterView
    public final void x0() {
        S1();
    }
}
