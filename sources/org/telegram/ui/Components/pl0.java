package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
