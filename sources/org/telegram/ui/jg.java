package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jg implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                tn tnVar = (tn) this.b;
                tnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    tnVar.ta();
                    break;
                }
                break;
            case 1:
                vm0 vm0Var = (vm0) this.b;
                if (i10 != 67) {
                    vm0Var.getClass();
                    break;
                } else if (vm0Var.U[2].length() == 0) {
                    vm0Var.U[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = vm0Var.U[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    vm0Var.U[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                su0 su0Var = (su0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = su0Var.f;
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
