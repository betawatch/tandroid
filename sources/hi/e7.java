package hi;

import android.view.View;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class e7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ l7 b;

    public /* synthetic */ e7(l7 l7Var, int i7) {
        this.a = i7;
        this.b = l7Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.e1();
                break;
            default:
                this.b.h1();
                break;
        }
    }
}
