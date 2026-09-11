package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
