package ai;

import android.view.View;
import org.telegram.messenger.u10;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class y2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u10 b;
    public final /* synthetic */ int c;

    public /* synthetic */ y2(int i3, int i10, u10 u10Var) {
        this.a = i10;
        this.b = u10Var;
        this.c = i3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                u10 u10Var = this.b;
                if (u10Var != null) {
                    u10Var.a(Integer.valueOf(this.c));
                    break;
                }
                break;
            default:
                this.b.a(Integer.valueOf(this.c));
                break;
        }
    }
}
