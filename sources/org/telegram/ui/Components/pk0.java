package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class pk0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ wk0 b;

    public /* synthetic */ pk0(wk0 wk0Var, int i7) {
        this.a = i7;
        this.b = wk0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i7 = this.a;
        wk0 wk0Var = this.b;
        switch (i7) {
            case 0:
                wk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 1:
                wk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 2:
                wk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            case 3:
                wk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                wk0Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
