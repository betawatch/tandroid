// default package

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class gxb extends k69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sxb b;

    public /* synthetic */ gxb(sxb sxbVar, byte b) {
        this.a = b;
        this.b = sxbVar;
    }

    @Override // k69
    public final void b(RecyclerView recyclerView, int i, int i2) {
        mr3 mr3Var;
        byte b = this.a;
        sxb sxbVar = this.b;
        switch (b) {
            case 0:
                sxbVar.z0();
                break;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (mr3Var = sxbVar.i1) != null) {
                    mr3Var.f(i, i2);
                    sxbVar.y0();
                    break;
                }
                break;
        }
    }
}
