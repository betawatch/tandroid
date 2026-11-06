package li;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vk;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements vk, ki {
    public final /* synthetic */ p a;
    public final /* synthetic */ di b;

    public /* synthetic */ e(p pVar, di diVar) {
        this.a = pVar;
        this.b = diVar;
    }

    @Override // org.telegram.ui.Components.vk
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        p pVar = this.a;
        pVar.getClass();
        di diVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            diVar.a(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        pVar.r.V1(pageblockmap);
        pVar.a0(true);
        diVar.a(true);
    }

    @Override // org.telegram.ui.Components.ki
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.r.e2((ij) arrayList.get(0));
        }
        this.b.a(true);
    }
}
