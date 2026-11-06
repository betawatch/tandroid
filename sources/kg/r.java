package kg;

import android.content.DialogInterface;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ r(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.a = i7;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                s sVar = (s) this.b;
                sVar.requestFocus();
                org.telegram.messenger.g0.K3(sVar);
                break;
            case 1:
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                break;
            case 2:
                z5 z5Var = (z5) this.b;
                z5Var.requestFocus();
                org.telegram.messenger.g0.K3(z5Var);
                break;
            default:
                zh.o1 o1Var = (zh.o1) this.b;
                o1Var.requestFocus();
                org.telegram.messenger.g0.K3(o1Var);
                break;
        }
    }
}
