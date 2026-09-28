package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final /* synthetic */ class pm0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wm0 b;

    public /* synthetic */ pm0(wm0 wm0Var, int i10) {
        this.a = i10;
        this.b = wm0Var;
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
