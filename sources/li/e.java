package li;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cj;
import org.telegram.ui.Components.nl;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements nl, cj {
    public final /* synthetic */ q a;
    public final /* synthetic */ ti b;

    public /* synthetic */ e(q qVar, ti tiVar) {
        this.a = qVar;
        this.b = tiVar;
    }

    @Override // org.telegram.ui.Components.nl
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        q qVar = this.a;
        qVar.getClass();
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
        qVar.r.X1(pageblockmap);
        qVar.Y(true);
        tiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.cj
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.r.h2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
