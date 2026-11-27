// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class cf9 extends View {
    public final ek9 a;
    public final int b;
    public boolean c;
    public boolean d;
    public final me7 e;
    public final /* synthetic */ ff9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cf9(ff9 ff9Var, Context context, TL_keyboard.PageButton pageButton, int i) {
        super(context);
        this.f = ff9Var;
        this.b = i;
        int i2 = ff9Var.n;
        int d = c00.d(32.0f, hl.q.x, hl.L(240.0f));
        vnb vnbVar = ff9Var.r;
        v59 v59Var = new v59(this, (byte) 5);
        hl9 hl9Var = new hl9(i2, d, vnbVar);
        SpannableStringBuilder l = hl9Var.l(pageButton.text, hl9.Q(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        ek9 ek9Var = new ek9(hl9Var, d, l, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, v59Var);
        this.a = ek9Var;
        this.e = new me7(this, i, (byte) 14);
        ek9Var.e = ek9Var.h();
        setContentDescription(mm9.l(pageButton.text));
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
        hl.r(this.e);
        this.a.a.f(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        ek9 ek9Var = this.a;
        canvas.translate(0.0f, (height - ek9Var.c()) / 2.0f);
        ek9Var.a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ek9 ek9Var = this.a;
        setMeasuredDimension(ek9Var.e, hl.L(8.0f) + ek9Var.c());
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ff9 ff9Var;
        df9 df9Var;
        mk0 mk0Var;
        char c;
        int actionMasked = motionEvent.getActionMasked();
        me7 me7Var = this.e;
        ek9 ek9Var = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            ek9Var.m(true);
            hl.d3(me7Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z = this.c && !this.d;
            this.c = false;
            ek9Var.m(false);
            hl.r(me7Var);
            if (z && (df9Var = (ff9Var = this.f).F) != null && (mk0Var = ff9Var.a) != null) {
                pi9 pi9Var = ((hi9) df9Var).a;
                TL_iv.PageBlock pageBlock = mk0Var.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i = this.b;
                    if (i >= 0 && i < pageblockbuttonrow.buttons.size()) {
                        ch9 ch9Var = pi9Var.R3;
                        if (ch9Var != null) {
                            ch9Var.d();
                        }
                        TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i);
                        if (pageButton != null) {
                            TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                            if (richButtonStyle != null) {
                                if (richButtonStyle.bg_primary) {
                                    c = 2;
                                } else if (richButtonStyle.bg_danger) {
                                    c = 3;
                                } else if (richButtonStyle.bg_success) {
                                    c = 0;
                                }
                                if (richButtonStyle == null) {
                                    richButtonStyle = new TL_keyboard.RichButtonStyle();
                                }
                                richButtonStyle.flags = 0;
                                richButtonStyle.bg_primary = c != 1;
                                richButtonStyle.bg_danger = c != 2;
                                richButtonStyle.bg_success = c != 3;
                                richButtonStyle.link = false;
                                pageButton.style = richButtonStyle;
                            }
                            c = 1;
                            if (richButtonStyle == null) {
                            }
                            richButtonStyle.flags = 0;
                            richButtonStyle.bg_primary = c != 1;
                            richButtonStyle.bg_danger = c != 2;
                            richButtonStyle.bg_success = c != 3;
                            richButtonStyle.link = false;
                            pageButton.style = richButtonStyle;
                        }
                        pi9Var.g3.O(false);
                        ch9 ch9Var2 = pi9Var.R3;
                        if (ch9Var2 != null) {
                            ch9Var2.h();
                        }
                        pi9Var.p3.onContentChanged();
                    }
                }
            }
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                this.c = false;
                ek9Var.m(false);
                hl.r(me7Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                ek9Var.m(false);
                hl.r(me7Var);
                return true;
            }
        }
        return true;
    }
}
