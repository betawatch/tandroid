package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class og implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ og(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                xn xnVar = (xn) this.b;
                xnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    xnVar.ta();
                    break;
                }
                break;
            case 1:
                dn0 dn0Var = (dn0) this.b;
                if (i10 != 67) {
                    dn0Var.getClass();
                    break;
                } else if (dn0Var.V[2].length() == 0) {
                    dn0Var.V[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = dn0Var.V[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    dn0Var.V[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                cv0 cv0Var = (cv0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = cv0Var.f;
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
