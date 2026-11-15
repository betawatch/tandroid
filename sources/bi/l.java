package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ l(EditTextBoldCursor editTextBoldCursor, int i7) {
        this.a = i7;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                u uVar = (u) this.b;
                uVar.requestFocus();
                org.telegram.messenger.g0.J3(uVar);
                break;
            case 1:
                j3 j3Var = (j3) this.b;
                j3Var.requestFocus();
                org.telegram.messenger.g0.J3(j3Var);
                break;
            case 2:
                kg.s sVar = (kg.s) this.b;
                sVar.requestFocus();
                org.telegram.messenger.g0.J3(sVar);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.J3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                break;
        }
    }
}
