package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
