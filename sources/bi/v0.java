package bi;

import android.view.View;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
