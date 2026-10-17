package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ng implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ng(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                sn snVar = (sn) this.b;
                snVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    snVar.xa();
                    break;
                }
                break;
            case 1:
                xm0 xm0Var = (xm0) this.b;
                if (i10 != 67) {
                    xm0Var.getClass();
                    break;
                } else if (xm0Var.Y[2].length() == 0) {
                    xm0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = xm0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    xm0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                ev0 ev0Var = (ev0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = ev0Var.f;
                    if (imageView != null) {
                        imageView.callOnClick();
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
