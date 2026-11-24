// default package

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class he4 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ he4(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                gm.c3(new l(editTextBoldCursor, (byte) 4));
                break;
            case 1:
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                editTextBoldCursor.setSelection(0, editTextBoldCursor.length());
                break;
            case 2:
                editTextBoldCursor.requestFocus();
                gm.E3(editTextBoldCursor);
                break;
            default:
                gm.c3(new l(editTextBoldCursor, (byte) 10));
                break;
        }
    }
}
