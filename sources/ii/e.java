package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.fj;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements dl, fj {
    public final /* synthetic */ r a;
    public final /* synthetic */ wi b;

    public /* synthetic */ e(r rVar, wi wiVar) {
        this.a = rVar;
        this.b = wiVar;
    }

    @Override // org.telegram.ui.Components.dl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        r rVar = this.a;
        rVar.getClass();
        wi wiVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            wiVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        rVar.r.R1(pageblockmap);
        rVar.V(true);
        wiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.fj
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.r.b2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
