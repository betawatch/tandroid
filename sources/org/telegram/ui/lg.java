package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
                sn snVar = (sn) this.b;
                snVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    snVar.xa();
                    break;
                }
                break;
            case 1:
                an0 an0Var = (an0) this.b;
                if (i10 != 67) {
                    an0Var.getClass();
                    break;
                } else if (an0Var.Y[2].length() == 0) {
                    an0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = an0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    an0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                fv0 fv0Var = (fv0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = fv0Var.f;
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
