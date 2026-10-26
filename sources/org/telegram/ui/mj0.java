package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.KeyEvent;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mj0 extends AnimatedPhoneNumberEditText {
    public final /* synthetic */ int G;
    public final /* synthetic */ Object H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj0(Object obj, Context context, int i10) {
        super(context);
        this.G = i10;
        this.H = obj;
    }

    @Override // org.telegram.ui.Components.q40, org.telegram.ui.Components.EditTextBoldCursor, org.telegram.ui.Components.lu, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.G) {
            case 1:
                this.b.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.H6, false));
                super.onDraw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.EditTextBoldCursor, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z10, int i10, Rect rect) {
        switch (this.G) {
            case 0:
                super.onFocusChanged(z10, i10, rect);
                oj0 oj0Var = (oj0) this.H;
                org.telegram.ui.Components.rd0 rd0Var = oj0Var.r;
                float f7 = (z10 || oj0Var.P.isFocused()) ? 1.0f : 0.0f;
                rd0Var.b(f7, f7, true);
                break;
            case 1:
                super.onFocusChanged(z10, i10, rect);
                oj0 oj0Var2 = (oj0) this.H;
                org.telegram.ui.Components.rd0 rd0Var2 = oj0Var2.r;
                float f10 = (z10 || oj0Var2.N.isFocused()) ? 1.0f : 0.0f;
                rd0Var2.b(f10, f10, true);
                break;
            default:
                super.onFocusChanged(z10, i10, rect);
                fg0 fg0Var = (fg0) this.H;
                org.telegram.ui.Components.rd0 rd0Var3 = fg0Var.f;
                float f11 = (z10 || fg0Var.b.isFocused()) ? 1.0f : 0.0f;
                rd0Var3.b(f11, f11, true);
                if (z10) {
                    fg0Var.a0.c.setEditText(this);
                    break;
                }
                break;
        }
    }

    @Override // android.widget.TextView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        switch (this.G) {
            case 1:
                oj0 oj0Var = (oj0) this.H;
                if (i10 == 67 && oj0Var.P.length() == 0) {
                    oj0Var.N.requestFocus();
                    mj0 mj0Var = oj0Var.N;
                    mj0Var.setSelection(mj0Var.length());
                    oj0Var.N.dispatchKeyEvent(keyEvent);
                }
                return super.onKeyDown(i10, keyEvent);
            default:
                return super.onKeyDown(i10, keyEvent);
        }
    }
}
