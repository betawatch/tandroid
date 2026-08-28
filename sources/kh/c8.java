package kh;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c8 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ k8 b;

    public /* synthetic */ c8(k8 k8Var, int i9) {
        this.a = i9;
        this.b = k8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.T();
                break;
            default:
                this.b.W();
                break;
        }
    }
}
