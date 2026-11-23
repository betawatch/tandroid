package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class zk0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ gl0 b;

    public /* synthetic */ zk0(gl0 gl0Var, int i7) {
        this.a = i7;
        this.b = gl0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        gl0 gl0Var = this.b;
        switch (i7) {
            case 0:
                gl0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 1:
                gl0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 2:
                gl0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 3:
                gl0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                gl0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
