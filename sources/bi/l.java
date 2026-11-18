package bi;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
                org.telegram.messenger.g0.I3(uVar);
                break;
            case 1:
                r5 r5Var = (r5) this.b;
                r5Var.requestFocus();
                org.telegram.messenger.g0.I3(r5Var);
                break;
            case 2:
                kg.s sVar = (kg.s) this.b;
                sVar.requestFocus();
                org.telegram.messenger.g0.I3(sVar);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.I3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                break;
        }
    }
}
