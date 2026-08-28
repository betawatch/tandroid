package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kg implements View.OnKeyListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kg(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i9, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                qn qnVar = (qn) this.b;
                qnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i9 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    qnVar.ta();
                    break;
                }
                break;
            case 1:
                wm0 wm0Var = (wm0) this.b;
                if (i9 != 67) {
                    wm0Var.getClass();
                    break;
                } else if (wm0Var.U[2].length() == 0) {
                    wm0Var.U[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = wm0Var.U[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    wm0Var.U[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                uu0 uu0Var = (uu0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i9 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = uu0Var.f;
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
