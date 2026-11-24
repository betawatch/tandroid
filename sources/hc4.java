// default package

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class hc4 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ hc4(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                gl.c3(new l(editTextBoldCursor, (byte) 4));
                break;
            case 1:
                editTextBoldCursor.requestFocus();
                gl.E3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                break;
            case 2:
                editTextBoldCursor.requestFocus();
                gl.E3(editTextBoldCursor);
                break;
            default:
                gl.c3(new l(editTextBoldCursor, (byte) 10));
                break;
        }
    }
}
