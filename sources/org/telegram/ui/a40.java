package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class a40 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.x1 b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a40(Object obj, org.telegram.ui.ActionBar.x1 x1Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = x1Var;
        this.c = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((f40) this.d).b.u1(null, this.b, this.c, true);
                break;
            default:
                ((b40) this.d).o1.b.u1(null, this.b, this.c, true);
                break;
        }
    }
}
