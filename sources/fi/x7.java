package fi;

import android.view.View;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class x7 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f8 b;

    public /* synthetic */ x7(f8 f8Var, int i10) {
        this.a = i10;
        this.b = f8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.U();
                break;
            default:
                this.b.X();
                break;
        }
    }
}
