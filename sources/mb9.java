// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class mb9 extends View {
    public final og9 a;
    public final int b;
    public boolean c;
    public boolean d;
    public final on7 e;
    public final /* synthetic */ pb9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb9(pb9 pb9Var, Context context, TL_keyboard.PageButton pageButton, int i) {
        super(context);
        this.f = pb9Var;
        this.b = i;
        int i2 = pb9Var.n;
        int c = b00.c(32.0f, gl.q.x, gl.L(240.0f));
        wjb wjbVar = pb9Var.r;
        sr8 sr8Var = new sr8(this, (byte) 19);
        rh9 rh9Var = new rh9(i2, c, wjbVar);
        SpannableStringBuilder l = rh9Var.l(pageButton.text, rh9.Q(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        og9 og9Var = new og9(rh9Var, c, l, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, sr8Var);
        this.a = og9Var;
        this.e = new on7(this, i, (byte) 11);
        og9Var.e = og9Var.h();
        setContentDescription(yi9.l(pageButton.text));
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
        gl.r(this.e);
        this.a.a.f(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        og9 og9Var = this.a;
        canvas.translate(0.0f, (height - og9Var.c()) / 2.0f);
        og9Var.a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        og9 og9Var = this.a;
        setMeasuredDimension(og9Var.e, gl.L(8.0f) + og9Var.c());
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
        pb9 pb9Var;
        nb9 nb9Var;
        lk0 lk0Var;
        char c;
        int actionMasked = motionEvent.getActionMasked();
        on7 on7Var = this.e;
        og9 og9Var = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            og9Var.m(true);
            gl.e3(on7Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z = this.c && !this.d;
            this.c = false;
            og9Var.m(false);
            gl.r(on7Var);
            if (z && (nb9Var = (pb9Var = this.f).F) != null && (lk0Var = pb9Var.a) != null) {
                ye9 ye9Var = ((qe9) nb9Var).a;
                TL_iv.PageBlock pageBlock = lk0Var.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i = this.b;
                    if (i >= 0 && i < pageblockbuttonrow.buttons.size()) {
                        ld9 ld9Var = ye9Var.R3;
                        if (ld9Var != null) {
                            ld9Var.d();
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
                        ye9Var.g3.O(false);
                        ld9 ld9Var2 = ye9Var.R3;
                        if (ld9Var2 != null) {
                            ld9Var2.h();
                        }
                        ye9Var.p3.onContentChanged();
                    }
                }
            }
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                this.c = false;
                og9Var.m(false);
                gl.r(on7Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                og9Var.m(false);
                gl.r(on7Var);
                return true;
            }
        }
        return true;
    }
}
