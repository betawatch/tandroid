package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class xk0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ el0 b;

    public /* synthetic */ xk0(el0 el0Var, int i7) {
        this.a = i7;
        this.b = el0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        el0 el0Var = this.b;
        switch (i7) {
            case 0:
                el0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 1:
                el0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 2:
                el0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 3:
                el0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                el0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
