package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pl0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vl0 b;

    public /* synthetic */ pl0(vl0 vl0Var, int i10) {
        this.a = i10;
        this.b = vl0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        vl0 vl0Var = this.b;
        switch (i10) {
            case 0:
                vl0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 1:
                vl0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 2:
                vl0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 3:
                vl0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                vl0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
