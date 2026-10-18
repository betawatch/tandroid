package ai;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class pd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ org.telegram.ui.ActionBar.d6 c;

    public /* synthetic */ pd(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = i10;
        this.b = context;
        this.c = d6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                new dd(this.b, this.c).show();
                break;
            case 1:
                new dd(this.b, this.c).show();
                break;
            default:
                new dd(this.b, this.c).show();
                break;
        }
    }
}
