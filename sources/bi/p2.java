package bi;

import android.view.View;
import org.telegram.messenger.z10;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p2 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ z10 b;
    public final /* synthetic */ int c;

    public /* synthetic */ p2(z10 z10Var, int i7, int i10) {
        this.a = i10;
        this.b = z10Var;
        this.c = i7;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                z10 z10Var = this.b;
                if (z10Var != null) {
                    z10Var.a(Integer.valueOf(this.c));
                    break;
                }
                break;
            default:
                this.b.a(Integer.valueOf(this.c));
                break;
        }
    }
}
