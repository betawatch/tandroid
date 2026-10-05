package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.el;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.xi;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements el, gj {
    public final /* synthetic */ r a;
    public final /* synthetic */ xi b;

    public /* synthetic */ e(r rVar, xi xiVar) {
        this.a = rVar;
        this.b = xiVar;
    }

    @Override // org.telegram.ui.Components.el
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        r rVar = this.a;
        rVar.getClass();
        xi xiVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            xiVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        rVar.r.S1(pageblockmap);
        rVar.T(true);
        xiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.gj
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.r.c2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
