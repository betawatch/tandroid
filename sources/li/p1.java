package li;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.vk;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements vk, ki {
    public final /* synthetic */ b2 a;
    public final /* synthetic */ di b;

    public /* synthetic */ p1(b2 b2Var, di diVar) {
        this.a = b2Var;
        this.b = diVar;
    }

    @Override // org.telegram.ui.Components.vk
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        b2 b2Var = this.a;
        b2Var.getClass();
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
        b2Var.P.V1(pageblockmap);
        diVar.a(true);
    }

    @Override // org.telegram.ui.Components.ki
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.P.e2((ij) arrayList.get(0));
        }
        this.b.a(true);
    }
}
