package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                wn wnVar = (wn) this.b;
                wnVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    wnVar.Fa();
                    break;
                }
                break;
            case 1:
                kn0 kn0Var = (kn0) this.b;
                if (i10 != 67) {
                    kn0Var.getClass();
                    break;
                } else if (kn0Var.Y[2].length() == 0) {
                    kn0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = kn0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    kn0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                lv0 lv0Var = (lv0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = lv0Var.f;
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
