package fi;

import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ m7 b;

    public /* synthetic */ f7(m7 m7Var, int i7) {
        this.a = i7;
        this.b = m7Var;
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
