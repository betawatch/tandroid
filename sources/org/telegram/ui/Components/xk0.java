package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
