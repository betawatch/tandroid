package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                un unVar = (un) this.b;
                unVar.getClass();
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor.length() == 0) {
                    unVar.Na();
                    break;
                }
                break;
            case 1:
                jl0 jl0Var = (jl0) this.b;
                if (i10 != 67) {
                    jl0Var.getClass();
                    break;
                } else if (jl0Var.Y[2].length() == 0) {
                    jl0Var.Y[1].requestFocus();
                    EditTextBoldCursor editTextBoldCursor2 = jl0Var.Y[1];
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    jl0Var.Y[1].dispatchKeyEvent(keyEvent);
                    break;
                }
                break;
            default:
                ws0 ws0Var = (ws0) this.b;
                EditTextBoldCursor editTextBoldCursor3 = (EditTextBoldCursor) view;
                if (i10 == 67 && keyEvent.getAction() == 0 && editTextBoldCursor3.length() == 0) {
                    ImageView imageView = ws0Var.f;
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
