package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ kn0 b;

    public /* synthetic */ dn0(kn0 kn0Var, int i10) {
        this.a = i10;
        this.b = kn0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 1:
                this.b.f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 2:
                this.b.f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 3:
                this.b.f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                this.b.f.b(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
