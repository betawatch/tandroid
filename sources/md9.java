// default package

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class md9 extends View {
    public final ri9 a;
    public final int b;
    public boolean c;
    public boolean d;
    public final ge7 e;
    public final /* synthetic */ pd9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md9(pd9 pd9Var, Context context, TL_keyboard.PageButton pageButton, int i) {
        super(context);
        this.f = pd9Var;
        this.b = i;
        int i2 = pd9Var.n;
        int c = b10.c(32.0f, gm.q.x, gm.L(240.0f));
        ylb ylbVar = pd9Var.r;
        pp8 pp8Var = new pp8(this, (byte) 27);
        uj9 uj9Var = new uj9(i2, c, ylbVar);
        SpannableStringBuilder l = uj9Var.l(pageButton.text, uj9.Q(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        ri9 ri9Var = new ri9(uj9Var, c, l, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, pp8Var);
        this.a = ri9Var;
        this.e = new ge7(this, i, (byte) 13);
        ri9Var.e = ri9Var.i();
        setContentDescription(zk9.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.a(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        gm.r(this.e);
        this.a.a.f(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        ri9 ri9Var = this.a;
        canvas.translate(0.0f, (height - ri9Var.d()) / 2.0f);
        ri9Var.b(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        ri9 ri9Var = this.a;
        setMeasuredDimension(ri9Var.e, gm.L(8.0f) + ri9Var.d());
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
        pd9 pd9Var;
        nd9 nd9Var;
        ll0 ll0Var;
        char c;
        int actionMasked = motionEvent.getActionMasked();
        ge7 ge7Var = this.e;
        ri9 ri9Var = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            ri9Var.n(true);
            gm.d3(ge7Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z = this.c && !this.d;
            this.c = false;
            ri9Var.n(false);
            gm.r(ge7Var);
            if (z && (nd9Var = (pd9Var = this.f).F) != null && (ll0Var = pd9Var.a) != null) {
                ch9 ch9Var = ((ug9) nd9Var).a;
                TL_iv.PageBlock pageBlock = ll0Var.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i = this.b;
                    if (i >= 0 && i < pageblockbuttonrow.buttons.size()) {
                        of9 of9Var = ch9Var.R3;
                        if (of9Var != null) {
                            of9Var.d();
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
                        ch9Var.g3.O(false);
                        of9 of9Var2 = ch9Var.R3;
                        if (of9Var2 != null) {
                            of9Var2.h();
                        }
                        ch9Var.p3.onContentChanged();
                    }
                }
            }
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                this.c = false;
                ri9Var.n(false);
                gm.r(ge7Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                ri9Var.n(false);
                gm.r(ge7Var);
                return true;
            }
        }
        return true;
    }
}
