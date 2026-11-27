// default package

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class g85 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ id b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ g85(Object obj, id idVar, EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.d = obj;
        this.b = idVar;
        this.c = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.c;
        id idVar = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((m85) obj).b.l1(null, idVar, editTextBoldCursor, true);
                break;
            default:
                ((h85) obj).r1.b.l1(null, idVar, editTextBoldCursor, true);
                break;
        }
    }
}
