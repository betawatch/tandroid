package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ um0 b;

    public /* synthetic */ nm0(um0 um0Var, int i10) {
        this.a = i10;
        this.b = um0Var;
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
