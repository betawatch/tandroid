package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class lg implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.b;
                qnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    qnVar.xa();
                    break;
                }
                break;
            case 1:
                vm0 vm0Var = (vm0) this.b;
                if (i10 != 67) {
                    vm0Var.getClass();
                    break;
                } else if (vm0Var.Y[2].length() == 0) {
                    vm0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = vm0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    vm0Var.Y[1].dispatchKeyEvent(keyEvent);
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
