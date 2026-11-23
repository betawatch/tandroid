package bi;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ b1 b;
    public final /* synthetic */ Runnable c;

    public /* synthetic */ v0(b1 b1Var, Runnable runnable, int i7) {
        this.a = i7;
        this.b = b1Var;
        this.c = runnable;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.c(this.c);
                break;
            default:
                this.b.c(this.c);
                break;
        }
    }
}
