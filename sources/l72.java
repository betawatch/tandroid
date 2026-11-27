// default package

import android.text.Editable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final /* synthetic */ class l72 implements r42, u12 {
    public final /* synthetic */ v72 a;
    public final /* synthetic */ n12 b;

    public /* synthetic */ l72(v72 v72Var, n12 n12Var) {
        this.a = v72Var;
        this.b = n12Var;
    }

    @Override // r42
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        n12 n12Var = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            n12Var.a(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        v72 v72Var = this.a;
        v72Var.r.O1(pageblockmap);
        v72Var.Y(true);
        n12Var.a(true);
    }

    @Override // u12
    public final void d(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
        if (!arrayList.isEmpty()) {
            this.a.r.X1((r47) arrayList.get(0));
        }
        this.b.a(true);
    }
}
