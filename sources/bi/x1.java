package bi;

import java.util.ArrayList;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.wk;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class x1 implements wk, ji {
    public final /* synthetic */ k2 a;
    public final /* synthetic */ bi b;

    public /* synthetic */ x1(k2 k2Var, bi biVar) {
        this.a = k2Var;
        this.b = biVar;
    }

    @Override // org.telegram.ui.Components.wk
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        k2 k2Var = this.a;
        k2Var.getClass();
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
        k2Var.P.U1(pageblockmap);
        biVar.a(true);
    }

    @Override // org.telegram.ui.Components.ji
    public void l(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.P.e2((jj) arrayList.get(0));
        }
        this.b.a(true);
    }
}
