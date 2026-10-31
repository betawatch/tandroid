package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.ru;
import org.telegram.messenger.vv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class g0 extends View {
    public final ru a;
    public final int b;
    public boolean c;
    public boolean d;
    public final ag.d3 e;
    public final /* synthetic */ j0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(j0 j0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f = j0Var;
        this.b = i10;
        int i11 = j0Var.n;
        int d = i0.a.d(32.0f, org.telegram.messenger.i0.q.x, org.telegram.messenger.i0.L(240.0f));
        org.telegram.ui.ActionBar.p6 p6Var = j0Var.r;
        a3.d dVar = new a3.d(this, 20);
        vv vvVar = new vv(i11, d, p6Var);
        SpannableStringBuilder l4 = vvVar.l(pageButton.text, vv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        ru ruVar = new ru(vvVar, d, l4, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, dVar);
        this.a = ruVar;
        this.e = new ag.d3(this, i10, 1);
        ruVar.e = ruVar.h();
        setContentDescription(s6.l(pageButton.text));
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
        org.telegram.messenger.i0.r(this.e);
        this.a.a.f(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        ru ruVar = this.a;
        canvas.translate(0.0f, (height - ruVar.c()) / 2.0f);
        ruVar.a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        ru ruVar = this.a;
        setMeasuredDimension(ruVar.e, org.telegram.messenger.i0.L(8.0f) + ruVar.c());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        j0 j0Var;
        h0 h0Var;
        a aVar;
        int actionMasked = motionEvent.getActionMasked();
        ag.d3 d3Var = this.e;
        ru ruVar = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            ruVar.m(true);
            org.telegram.messenger.i0.h3(d3Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z10 = this.c && !this.d;
            this.c = false;
            ruVar.m(false);
            org.telegram.messenger.i0.r(d3Var);
            if (z10 && (h0Var = (j0Var = this.f).E) != null && (aVar = j0Var.a) != null) {
                d4 d4Var = ((v3) h0Var).a;
                TL_iv.PageBlock pageBlock = aVar.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i10 = this.b;
                    if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                        o2 o2Var = d4Var.Q3;
                        if (o2Var != null) {
                            o2Var.d();
                        }
                        TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i10);
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
                        d4Var.f3.O(false);
                        o2 o2Var2 = d4Var.Q3;
                        if (o2Var2 != null) {
                            o2Var2.h();
                        }
                        d4Var.o3.onContentChanged();
                    }
                }
            }
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                this.c = false;
                ruVar.m(false);
                org.telegram.messenger.i0.r(d3Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                ruVar.m(false);
                org.telegram.messenger.i0.r(d3Var);
                return true;
            }
        }
        return true;
    }
}
