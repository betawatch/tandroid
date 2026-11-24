// default package

import android.view.View;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class bt9 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gt9 b;

    public /* synthetic */ bt9(gt9 gt9Var, byte b) {
        this.a = b;
        this.b = gt9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        gt9 gt9Var = this.b;
        switch (b) {
            case 0:
                gt9Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
            default:
                gt9Var.f.a(((Integer) view.getTag(R.id.index_tag)).intValue());
                break;
        }
    }
}
