package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.au;
import org.telegram.messenger.ev;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class b0 extends View {
    public final au a;
    public final int b;
    public boolean c;
    public boolean d;
    public final ai.y0 e;
    public final /* synthetic */ e0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(e0 e0Var, Context context, TL_keyboard.PageButton pageButton, int i7) {
        super(context);
        this.f = e0Var;
        this.b = i7;
        int i10 = e0Var.n;
        int d = i5.c.d(32.0f, org.telegram.messenger.g0.q.x, org.telegram.messenger.g0.L(240.0f));
        h6 h6Var = e0Var.r;
        kg.i0 i0Var = new kg.i0(this, 27);
        ev evVar = new ev(i10, d, h6Var);
        SpannableStringBuilder l10 = evVar.l(pageButton.text, ev.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        au auVar = new au(evVar, d, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, i0Var);
        this.a = auVar;
        this.e = new ai.y0(this, i7, 19);
        auVar.e = auVar.h();
        setContentDescription(c6.l(pageButton.text));
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
        au auVar = this.a;
        canvas.translate(0.0f, (height - auVar.c()) / 2.0f);
        auVar.a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        au auVar = this.a;
        setMeasuredDimension(auVar.e, org.telegram.messenger.g0.L(8.0f) + auVar.c());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        e0 e0Var;
        c0 c0Var;
        a aVar;
        int actionMasked = motionEvent.getActionMasked();
        ai.y0 y0Var = this.e;
        au auVar = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            auVar.m(true);
            org.telegram.messenger.g0.h3(y0Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z10 = this.c && !this.d;
            this.c = false;
            auVar.m(false);
            org.telegram.messenger.g0.r(y0Var);
            if (z10 && (c0Var = (e0Var = this.f).F) != null && (aVar = e0Var.a) != null) {
                t3 t3Var = ((l3) c0Var).a;
                TL_iv.PageBlock pageBlock = aVar.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i7 = this.b;
                    if (i7 >= 0 && i7 < pageblockbuttonrow.buttons.size()) {
                        g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
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
                        t3Var.g3.O(false);
                        g2 g2Var2 = t3Var.R3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        t3Var.p3.onContentChanged();
                    }
                }
            }
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                this.c = false;
                auVar.m(false);
                org.telegram.messenger.g0.r(y0Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                auVar.m(false);
                org.telegram.messenger.g0.r(y0Var);
                return true;
            }
        }
        return true;
    }
}
