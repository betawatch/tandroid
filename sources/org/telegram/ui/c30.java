package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class c30 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.t1 b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ c30(Object obj, org.telegram.ui.ActionBar.t1 t1Var, EditTextBoldCursor editTextBoldCursor, int i7) {
        this.a = i7;
        this.d = obj;
        this.b = t1Var;
        this.c = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((h30) this.d).b.v1(null, this.b, this.c, true);
                break;
            default:
                ((d30) this.d).s1.b.v1(null, this.b, this.c, true);
                break;
        }
    }
}
