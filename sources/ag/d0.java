package ag;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class d0 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ d0(EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                f0 f0Var = (f0) this.b;
                f0Var.requestFocus();
                org.telegram.messenger.i0.J3(f0Var);
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.i0.J3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                break;
            case 2:
                ih.b bVar = (ih.b) this.b;
                bVar.requestFocus();
                org.telegram.messenger.i0.J3(bVar);
                break;
            default:
                ph.t1 t1Var = (ph.t1) this.b;
                t1Var.requestFocus();
                org.telegram.messenger.i0.J3(t1Var);
                break;
        }
    }
}
