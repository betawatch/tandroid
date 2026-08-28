package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ sl0 b;

    public /* synthetic */ ml0(sl0 sl0Var, int i9) {
        this.a = i9;
        this.b = sl0Var;
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
