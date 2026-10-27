package li;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.nl;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements nl, cj {
    public final /* synthetic */ b2 a;
    public final /* synthetic */ ti b;

    public /* synthetic */ p1(b2 b2Var, ti tiVar) {
        this.a = b2Var;
        this.b = tiVar;
    }

    @Override // org.telegram.ui.Components.nl
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        b2 b2Var = this.a;
        b2Var.getClass();
        ti tiVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            tiVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        b2Var.P.X1(pageblockmap);
        tiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.cj
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.P.h2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
