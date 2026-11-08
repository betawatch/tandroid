package kg;

import android.content.DialogInterface;
import org.telegram.ui.Cells.z5;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                zh.n1 n1Var = (zh.n1) this.b;
                n1Var.requestFocus();
                org.telegram.messenger.g0.K3(n1Var);
                break;
        }
    }
}
