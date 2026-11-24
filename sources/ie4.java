// default package

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ie4 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EditTextBoldCursor b;

    public /* synthetic */ ie4(EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.b = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.b;
        switch (b) {
            case 0:
                gm.t1(editTextBoldCursor);
                break;
            case 1:
                gm.t1(editTextBoldCursor);
                break;
            case 2:
                gm.t1(editTextBoldCursor);
                break;
            default:
                gm.t1(editTextBoldCursor);
                break;
        }
    }
}
