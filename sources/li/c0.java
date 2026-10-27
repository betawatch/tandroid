package li;

import android.content.Context;
import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class c0 extends View {
    public final RichMessageLayout.RichButton a;
    public final int b;
    public boolean c;
    public boolean d;
    public final ag.r0 e;
    public final /* synthetic */ f0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(f0 f0Var, Context context, TL_keyboard.PageButton pageButton, int i10) {
        super(context);
        this.f = f0Var;
        this.b = i10;
        RichMessageLayout.RichButton createEditorPageButton = RichMessageLayout.createEditorPageButton(f0Var.n, org.telegram.messenger.t.c(32.0f, AndroidUtilities.displaySize.x, AndroidUtilities.dp(240.0f)), f0Var.r, pageButton, new k2.c(this, 5));
        this.a = createEditorPageButton;
        this.e = new ag.r0(this, i10, 16);
        createEditorPageButton.width = createEditorPageButton.getPreferredWidth();
        setContentDescription(f6.l(pageButton.text));
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
        f0 f0Var;
        d0 d0Var;
        a aVar;
        int actionMasked = motionEvent.getActionMasked();
        ag.r0 r0Var = this.e;
        RichMessageLayout.RichButton richButton = this.a;
        if (actionMasked == 0) {
            this.c = true;
            this.d = false;
            richButton.setPressed(true);
            AndroidUtilities.runOnUIThread(r0Var, ViewConfiguration.getLongPressTimeout());
            return true;
        }
        if (actionMasked == 1) {
            boolean z10 = this.c && !this.d;
            this.c = false;
            richButton.setPressed(false);
            AndroidUtilities.cancelRunOnUIThread(r0Var);
            if (z10 && (d0Var = (f0Var = this.f).E) != null && (aVar = f0Var.a) != null) {
                v3 v3Var = ((n3) d0Var).a;
                TL_iv.PageBlock pageBlock = aVar.b;
                if (pageBlock instanceof TL_iv.pageBlockButtonRow) {
                    TL_iv.pageBlockButtonRow pageblockbuttonrow = (TL_iv.pageBlockButtonRow) pageBlock;
                    int i10 = this.b;
                    if (i10 >= 0 && i10 < pageblockbuttonrow.buttons.size()) {
                        f2 f2Var = v3Var.R3;
                        if (f2Var != null) {
                            f2Var.d();
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
                        v3Var.g3.O(false);
                        f2 f2Var2 = v3Var.R3;
                        if (f2Var2 != null) {
                            f2Var2.h();
                        }
                        v3Var.p3.onContentChanged();
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
                AndroidUtilities.cancelRunOnUIThread(r0Var);
                return true;
            }
            if (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f || motionEvent.getX() > getWidth() || motionEvent.getY() > getHeight()) {
                this.c = false;
                richButton.setPressed(false);
                AndroidUtilities.cancelRunOnUIThread(r0Var);
                return true;
            }
        }
        return true;
    }
}
