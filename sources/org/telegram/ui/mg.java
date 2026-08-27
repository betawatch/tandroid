package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mg implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mg(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i10, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                rn rnVar = (rn) this.b;
                rnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    rnVar.ta();
                    break;
                }
                break;
            case 1:
                xm0 xm0Var = (xm0) this.b;
                if (i10 != 67) {
                    xm0Var.getClass();
                    break;
                } else if (xm0Var.U[2].length() == 0) {
                    xm0Var.U[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = xm0Var.U[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    xm0Var.U[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                vu0 vu0Var = (vu0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = vu0Var.f;
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
