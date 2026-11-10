package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e30 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.u1 b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e30(Object obj, org.telegram.ui.ActionBar.u1 u1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = u1Var;
        this.c = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((k30) this.d).b.v1(null, this.b, this.c, true);
                break;
            default:
                ((f30) this.d).r1.b.v1(null, this.b, this.c, true);
                break;
        }
    }
}
