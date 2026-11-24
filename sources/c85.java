// default package

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class c85 implements DialogInterface.OnShowListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c85(Object obj, he heVar, EditTextBoldCursor editTextBoldCursor, byte b) {
        this.a = b;
        this.d = obj;
        this.b = heVar;
        this.c = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        byte b = this.a;
        EditTextBoldCursor editTextBoldCursor = this.c;
        he heVar = this.b;
        Object obj = this.d;
        switch (b) {
            case 0:
                ((i85) obj).b.k1(null, heVar, editTextBoldCursor, true);
                break;
            default:
                ((d85) obj).r1.b.k1(null, heVar, editTextBoldCursor, true);
                break;
        }
    }
}
