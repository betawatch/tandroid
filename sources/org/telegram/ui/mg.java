package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
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
                un unVar = (un) this.b;
                unVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    unVar.Ia();
                    break;
                }
                break;
            case 1:
                ll0 ll0Var = (ll0) this.b;
                if (i10 != 67) {
                    ll0Var.getClass();
                    break;
                } else if (ll0Var.Y[2].length() == 0) {
                    ll0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = ll0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    ll0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                xs0 xs0Var = (xs0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = xs0Var.f;
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
