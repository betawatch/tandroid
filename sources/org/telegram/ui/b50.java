package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b50 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.a2 b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b50(Object obj, org.telegram.ui.ActionBar.a2 a2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = a2Var;
        this.c = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((g50) this.d).b.s1(null, this.b, this.c, true);
                break;
            default:
                ((c50) this.d).n.b.s1(null, this.b, this.c, true);
                break;
        }
    }
}
