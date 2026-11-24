// default package

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class e65 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e65(Object obj, hd hdVar, EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.d = obj;
        this.b = hdVar;
        this.c = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.c;
        hd hdVar = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((k65) obj).b.k1(null, hdVar, editTextBoldCursor, true);
                break;
            default:
                ((f65) obj).r1.b.k1(null, hdVar, editTextBoldCursor, true);
                break;
        }
    }
}
