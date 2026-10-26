package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
                un unVar = (un) this.b;
                unVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    unVar.Ca();
                    break;
                }
                break;
            case 1:
                in0 in0Var = (in0) this.b;
                if (i10 != 67) {
                    in0Var.getClass();
                    break;
                } else if (in0Var.Y[2].length() == 0) {
                    in0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = in0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    in0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                jv0 jv0Var = (jv0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = jv0Var.f;
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
