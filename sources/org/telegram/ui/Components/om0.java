package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final /* synthetic */ class om0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vm0 b;

    public /* synthetic */ om0(vm0 vm0Var, int i10) {
        this.a = i10;
        this.b = vm0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 1:
                this.b.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 2:
                this.b.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 3:
                this.b.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                this.b.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
