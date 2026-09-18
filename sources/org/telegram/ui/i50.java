package org.telegram.ui;

import android.content.DialogInterface;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i50 implements DialogInterface.OnShowListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.c2 b;
    public final /* synthetic */ EditTextBoldCursor c;
    public final /* synthetic */ Object d;

    public /* synthetic */ i50(Object obj, org.telegram.ui.ActionBar.c2 c2Var, EditTextBoldCursor editTextBoldCursor, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = c2Var;
        this.c = editTextBoldCursor;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        switch (this.a) {
            case 0:
                ((n50) this.d).b.s1(null, this.b, this.c, true);
                break;
            default:
                ((j50) this.d).n.b.s1(null, this.b, this.c, true);
                break;
        }
    }
}
