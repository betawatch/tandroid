package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class d0 extends View {
    public final RichMessageLayout.RichButton a;
    public final int b;
    public boolean c;
    public boolean d;
    public final ah.g e;
    public final /* synthetic */ g0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(g0 g0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f = g0Var;
        this.b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(g0Var.n, i2.g.f(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), g0Var.r, pageButton, new ig.t0(this, 8));
        this.a = createEditorPageButton;
        this.e = new ah.g(this, i10, 11);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(i6.l(pageButton.text));
        setClickable(true);
        setLongClickable(true);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.attach(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        AndroidUtilities.cancelRunOnUIThread(this.e);
        this.a.detach(this);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        int height = getHeight();
        RichMessageLayout.RichButton richButton = this.a;
        canvas.translate(0.0f, (height - richButton.getHeight()) / 2.0f);
        richButton.draw(canvas);
        canvas.restore();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        RichMessageLayout.RichButton richButton = this.a;
        setMeasuredDimension(richButton.width, AndroidUtilities.dp(8.0f) + richButton.getHeight());
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        g0 g0Var;
        e0 e0Var;
        a aVar;
        int actionMasked = motionEvent.getActionMasked();
        ah.g gVar = this.e;
        RichMessageLayout.RichButton richButton = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            richButton.setPressed(true);
            AndroidUtilities.runOnUIThread(gVar, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z10 = this.c && !this.d;
            this.c = false;
            richButton.setPressed(false);
            AndroidUtilities.cancelRunOnUIThread(gVar);
            if (z10 && (e0Var = (g0Var = this.f).E) != null && (aVar = g0Var.a) != null) {
                v3 v3Var = ((n3) e0Var).a;
                TL_iv.PageBlock pageBlock = aVar.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i10 = this.b;
                    if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                        g2 g2Var = v3Var.J3;
                        if (g2Var != null) {
                            g2Var.d();
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
                        v3Var.Y2.N(false);
                        g2 g2Var2 = v3Var.J3;
                        if (g2Var2 != null) {
                            g2Var2.h();
                        }
                        v3Var.h3.onContentChanged();
                    }
                }
            }
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    return super.onTouchEvent(motionEvent);
                }
                this.c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(gVar);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(gVar);
                return true;
            }
        }
        return true;
    }
}
