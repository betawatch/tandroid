package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ im0 b;

    public /* synthetic */ bm0(im0 im0Var, int i10) {
        this.a = i10;
        this.b = im0Var;
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
