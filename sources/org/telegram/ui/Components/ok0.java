package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ok0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ vk0 b;

    public /* synthetic */ ok0(vk0 vk0Var, int i3) {
        this.a = i3;
        this.b = vk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3 = this.a;
        vk0 vk0Var = this.b;
        switch (i3) {
            case 0:
                vk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 1:
                vk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 2:
                vk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 3:
                vk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                vk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
