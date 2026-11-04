package ai;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ p(EditTextBoldCursor editTextBoldCursor, int i3) {
        this.a = i3;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                z zVar = (z) this.b;
                zVar.requestFocus();
                org.telegram.messenger.g0.K3(zVar);
                break;
            case 1:
                u3 u3Var = (u3) this.b;
                u3Var.requestFocus();
                org.telegram.messenger.g0.K3(u3Var);
                break;
            case 2:
                lg.s sVar = (lg.s) this.b;
                sVar.requestFocus();
                org.telegram.messenger.g0.K3(sVar);
                break;
            default:
                EditTextBoldCursor editTextBoldCursor = this.b;
                editTextBoldCursor.requestFocus();
                org.telegram.messenger.g0.K3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                break;
        }
    }
}
