package mi;

import java.util.ArrayList;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.tk;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q1 implements tk, ki {
    public final /* synthetic */ c2 a;
    public final /* synthetic */ bi b;

    public /* synthetic */ q1(c2 c2Var, bi biVar) {
        this.a = c2Var;
        this.b = biVar;
    }

    @Override // org.telegram.ui.Components.tk
    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        c2 c2Var = this.a;
        c2Var.getClass();
        bi biVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            biVar.a(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        c2Var.Q.V1(pageblockmap);
        biVar.a(true);
    }

    @Override // org.telegram.ui.Components.ki
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.Q.e2((zi) arrayList.get(0));
        }
        this.b.a(true);
    }
}
