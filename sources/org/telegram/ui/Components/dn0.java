package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
