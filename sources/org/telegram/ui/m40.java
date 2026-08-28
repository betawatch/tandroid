package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m40 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m40(Object obj, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, int i9) {
        this.a = i9;
        this.d = obj;
        this.b = c2Var;
        this.c = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((r40) this.d).b.s1(null, this.b, this.c, true);
                break;
            default:
                ((n40) this.d).n.b.s1(null, this.b, this.c, true);
                break;
        }
    }
}
