// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class kz implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ylb c;

    public /* synthetic */ kz(Context context, ylb ylbVar, byte b) {
        this.a = b;
        this.b = context;
        this.c = ylbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new exa(this.b, this.c).show();
                break;
            case 1:
                new exa(this.b, this.c).show();
                break;
            case 2:
                new exa(this.b, this.c).show();
                break;
            default:
                new exa(this.b, this.c).show();
                break;
        }
    }
}
