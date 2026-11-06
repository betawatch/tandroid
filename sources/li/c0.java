package li;

import android.content.Context;
import android.graphics.Canvas;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.gu;
import org.telegram.messenger.kv;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class c0 extends View {
    public final gu a;
    public final int b;
    public boolean c;
    public boolean d;
    public final bg.m0 e;
    public final /* synthetic */ f0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, Context context, TL_keyboard.PageButton pageButton, int i7) {
        super(context);
        this.f = f0Var;
        this.b = i7;
        int i10 = f0Var.n;
        int e10 = jg.g.e(32.0f, org.telegram.messenger.g0.q.x, org.telegram.messenger.g0.L(240.0f));
        f6 f6Var = f0Var.r;
        l2.w wVar = new l2.w(this, 5);
        kv kvVar = new kv(i10, e10, f6Var);
        SpannableStringBuilder l10 = kvVar.l(pageButton.text, kv.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        gu guVar = new gu(kvVar, e10, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, wVar);
        this.a = guVar;
        this.e = new bg.m0(this, i7, 14);
        guVar.e = guVar.h();
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
        gu guVar = this.a;
        canvas.translate(0.0f, (height - guVar.c()) / 2.0f);
        guVar.a(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        gu guVar = this.a;
        setMeasuredDimension(guVar.e, org.telegram.messenger.g0.L(8.0f) + guVar.c());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var;
        d0 d0Var;
        a aVar;
        int actionMasked = motionEvent.getActionMasked();
        bg.m0 m0Var = this.e;
        gu guVar = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            guVar.m(true);
            org.telegram.messenger.g0.i3(m0Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z9 = this.c && !this.d;
            this.c = false;
            guVar.m(false);
            org.telegram.messenger.g0.r(m0Var);
            if (z9 && (d0Var = (f0Var = this.f).E) != null && (aVar = f0Var.a) != null) {
                t3 t3Var = ((l3) d0Var).a;
                TL_iv.PageBlock pageBlock = aVar.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i7 = this.b;
                    if (i7 >= 0 && i7 < pageblockbuttonrow.buttons.size()) {
                        f2 f2Var = t3Var.Q3;
                        if (f2Var != null) {
                            f2Var.d();
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
                        t3Var.f3.O(false);
                        f2 f2Var2 = t3Var.Q3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        t3Var.o3.onContentChanged();
                    }
                }
            }
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                this.c = false;
                guVar.m(false);
                org.telegram.messenger.g0.r(m0Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                guVar.m(false);
                org.telegram.messenger.g0.r(m0Var);
                return true;
            }
        }
        return true;
    }
}
