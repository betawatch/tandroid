package bi;

import android.view.View;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
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
