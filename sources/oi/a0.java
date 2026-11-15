package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.du;
import org.telegram.messenger.iv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class a0 extends View {
    public final du a;
    public final int b;
    public boolean c;
    public boolean d;
    public final ai.w0 e;
    public final /* synthetic */ d0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, Context context, TL_keyboard.PageButton pageButton, int i7) {
        super(context);
        this.f = d0Var;
        this.b = i7;
        int i10 = d0Var.n;
        int d = i5.c.d(32.0f, org.telegram.messenger.g0.q.x, org.telegram.messenger.g0.L(240.0f));
        e6 e6Var = d0Var.r;
        kg.j1 j1Var = new kg.j1(this, 23);
        iv ivVar = new iv(i10, d, e6Var);
        SpannableStringBuilder l10 = ivVar.l(pageButton.text, iv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        du duVar = new du(ivVar, d, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, j1Var);
        this.a = duVar;
        this.e = new ai.w0(this, i7, 16);
        duVar.e = duVar.h();
        setContentDescription(a6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a.i(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        org.telegram.messenger.g0.r(this.e);
        this.a.a.f(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        du duVar = this.a;
        canvas.translate(0.0f, (height - duVar.c()) / 2.0f);
        duVar.a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        du duVar = this.a;
        setMeasuredDimension(duVar.e, org.telegram.messenger.g0.L(8.0f) + duVar.c());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        d0 d0Var;
        b0 b0Var;
        a aVar;
        int actionMasked = motionEvent.getActionMasked();
        ai.w0 w0Var = this.e;
        du duVar = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            duVar.m(true);
            org.telegram.messenger.g0.i3(w0Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z10 = this.c && !this.d;
            this.c = false;
            duVar.m(false);
            org.telegram.messenger.g0.r(w0Var);
            if (z10 && (b0Var = (d0Var = this.f).F) != null && (aVar = d0Var.a) != null) {
                q3 q3Var = ((i3) b0Var).a;
                TL_iv.PageBlock pageBlock = aVar.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i7 = this.b;
                    if (i7 >= 0 && i7 < pageblockbuttonrow.buttons.size()) {
                        d2 d2Var = q3Var.R3;
                        if (d2Var != null) {
                            d2Var.d();
                        }
                        TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i7);
                        if (pageButton != null) {
                            TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                            char c10 = (richButtonStyle == null || !richButtonStyle.bg_primary) ? (richButtonStyle == null || !richButtonStyle.bg_danger) ? (richButtonStyle == null || !richButtonStyle.bg_success) ? (char) 1 : (char) 0 : (char) 3 : (char) 2;
                            if (richButtonStyle == null) {
                                richButtonStyle = new TL_keyboard.RichButtonStyle();
                            }
                            richButtonStyle.flags = 0;
                            richButtonStyle.bg_primary = c10 == 1;
                            richButtonStyle.bg_danger = c10 == 2;
                            richButtonStyle.bg_success = c10 == 3;
                            richButtonStyle.link = false;
                            pageButton.style = richButtonStyle;
                        }
                        q3Var.g3.O(false);
                        d2 d2Var2 = q3Var.R3;
                        if (d2Var2 != null) {
                            d2Var2.h();
                        }
                        q3Var.p3.onContentChanged();
                    }
                }
            }
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                this.c = false;
                duVar.m(false);
                org.telegram.messenger.g0.r(w0Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                duVar.m(false);
                org.telegram.messenger.g0.r(w0Var);
                return true;
            }
        }
        return true;
    }
}
