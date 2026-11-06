package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ rk0 b;

    public /* synthetic */ kk0(rk0 rk0Var, int i7) {
        this.a = i7;
        this.b = rk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        rk0 rk0Var = this.b;
        switch (i7) {
            case 0:
                rk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 1:
                rk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 2:
                rk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 3:
                rk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                rk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
