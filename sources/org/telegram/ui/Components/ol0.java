package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ol0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ul0 b;

    public /* synthetic */ ol0(ul0 ul0Var, int i10) {
        this.a = i10;
        this.b = ul0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        ul0 ul0Var = this.b;
        switch (i10) {
            case 0:
                ul0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 1:
                ul0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 2:
                ul0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 3:
                ul0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                ul0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
