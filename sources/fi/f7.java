package fi;

import android.view.View;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
