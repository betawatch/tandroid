package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
                fn0 fn0Var = (fn0) this.b;
                if (i10 != 67) {
                    fn0Var.getClass();
                    break;
                } else if (fn0Var.V[2].length() == 0) {
                    fn0Var.V[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = fn0Var.V[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    fn0Var.V[1].dispatchKeyEvent(keyEvent);
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
