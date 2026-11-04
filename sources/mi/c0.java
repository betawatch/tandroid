package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.cv;
import org.telegram.messenger.yt;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class c0 extends View {
    public final yt a;
    public final int b;
    public boolean c;
    public boolean d;
    public final cg.l0 e;
    public final /* synthetic */ f0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, Context context, TL_keyboard.PageButton pageButton, int i3) {
        super(context);
        this.f = f0Var;
        this.b = i3;
        int i10 = f0Var.n;
        int d = k2.p1.d(32.0f, org.telegram.messenger.g0.q.x, org.telegram.messenger.g0.L(240.0f));
        org.telegram.ui.ActionBar.e6 e6Var = f0Var.r;
        lg.n nVar = new lg.n(this, 12);
        cv cvVar = new cv(i10, d, e6Var);
        SpannableStringBuilder l10 = cvVar.l(pageButton.text, cv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        yt ytVar = new yt(cvVar, d, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, nVar);
        this.a = ytVar;
        this.e = new cg.l0(this, i3, 15);
        ytVar.e = ytVar.h();
        setContentDescription(d6.l(pageButton.text));
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
        yt ytVar = this.a;
        canvas.translate(0.0f, (height - ytVar.c()) / 2.0f);
        ytVar.a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        yt ytVar = this.a;
        setMeasuredDimension(ytVar.e, org.telegram.messenger.g0.L(8.0f) + ytVar.c());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var;
        d0 d0Var;
        a aVar;
        int actionMasked = motionEvent.getActionMasked();
        cg.l0 l0Var = this.e;
        yt ytVar = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            ytVar.m(true);
            org.telegram.messenger.g0.i3(l0Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z10 = this.c && !this.d;
            this.c = false;
            ytVar.m(false);
            org.telegram.messenger.g0.r(l0Var);
            if (z10 && (d0Var = (f0Var = this.f).F) != null && (aVar = f0Var.a) != null) {
                t3 t3Var = ((l3) d0Var).a;
                TL_iv.PageBlock pageBlock = aVar.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i3 = this.b;
                    if (i3 >= 0 && i3 < pageblockbuttonrow.buttons.size()) {
                        g2 g2Var = t3Var.R3;
                        if (g2Var != null) {
                            g2Var.d();
                        }
                        TL_keyboard.PageButton pageButton = pageblockbuttonrow.buttons.get(i3);
                        if (pageButton != null) {
                            TL_keyboard.RichButtonStyle richButtonStyle = pageButton.style;
                            char c2 = (richButtonStyle == null || !richButtonStyle.bg_primary) ? (richButtonStyle == null || !richButtonStyle.bg_danger) ? (richButtonStyle == null || !richButtonStyle.bg_success) ? (char) 1 : (char) 0 : (char) 3 : (char) 2;
                            if (richButtonStyle == null) {
                                richButtonStyle = new TL_keyboard.RichButtonStyle();
                            }
                            richButtonStyle.flags = 0;
                            richButtonStyle.bg_primary = c2 == 1;
                            richButtonStyle.bg_danger = c2 == 2;
                            richButtonStyle.bg_success = c2 == 3;
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
                ytVar.m(false);
                org.telegram.messenger.g0.r(l0Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                ytVar.m(false);
                org.telegram.messenger.g0.r(l0Var);
                return true;
            }
        }
        return true;
    }
}
