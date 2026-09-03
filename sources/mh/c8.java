package mh;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3[] b;

    public /* synthetic */ c8(org.telegram.ui.ActionBar.h3[] h3VarArr, int i10) {
        this.a = i10;
        this.b = h3VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b[0].dismiss();
                break;
            case 1:
                org.telegram.ui.ActionBar.h3 h3Var = this.b[0];
                if (h3Var != null) {
                    h3Var.dismiss();
                    break;
                }
                break;
            default:
                this.b[0].dismiss();
                break;
        }
    }
}
