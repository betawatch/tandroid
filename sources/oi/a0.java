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
import org.telegram.ui.ActionBar.i6;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class a0 extends View {
    public final au a;
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
        i6 i6Var = d0Var.r;
        kg.j0 j0Var = new kg.j0(this, 27);
        ev evVar = new ev(i10, d, i6Var);
        SpannableStringBuilder l10 = evVar.l(pageButton.text, ev.R(16, 13));
        TL_keyboard.InlineButtonType inlineButtonType = pageButton.type;
        au auVar = new au(evVar, d, l10, pageButton, inlineButtonType, pageButton.style, inlineButtonType instanceof TL_keyboard.TL_inlineButtonTypeDisabled, false, false, false, false, Boolean.FALSE, j0Var);
        this.a = auVar;
        this.e = new ai.w0(this, i7, 19);
        auVar.e = auVar.h();
        setContentDescription(b6.l(pageButton.text));
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
        d0 d0Var;
        b0 b0Var;
        a aVar;
        int actionMasked = motionEvent.getActionMasked();
        ai.w0 w0Var = this.e;
        au auVar = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            auVar.m(true);
            org.telegram.messenger.g0.h3(w0Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z10 = this.c && !this.d;
            this.c = false;
            auVar.m(false);
            org.telegram.messenger.g0.r(w0Var);
            if (z10 && (b0Var = (d0Var = this.f).F) != null && (aVar = d0Var.a) != null) {
                s3 s3Var = ((k3) b0Var).a;
                TL_iv.PageBlock pageBlock = aVar.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i7 = this.b;
                    if (i7 >= 0 && i7 < pageblockbuttonrow.buttons.size()) {
                        e2 e2Var = s3Var.R3;
                        if (e2Var != null) {
                            e2Var.d();
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
                        s3Var.g3.O(false);
                        e2 e2Var2 = s3Var.R3;
                        if (e2Var2 != null) {
                            e2Var2.h();
                        }
                        s3Var.p3.onContentChanged();
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
                org.telegram.messenger.g0.r(w0Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                auVar.m(false);
                org.telegram.messenger.g0.r(w0Var);
                return true;
            }
        }
        return true;
    }
}
