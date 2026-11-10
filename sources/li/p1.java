package li;

import java.util.ArrayList;
import org.telegram.messenger.ij;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.uk;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements uk, ji {
    public final /* synthetic */ b2 a;
    public final /* synthetic */ ci b;

    public /* synthetic */ p1(b2 b2Var, ci ciVar) {
        this.a = b2Var;
        this.b = ciVar;
    }

    @Override // org.telegram.ui.Components.uk
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z9, int i10, long j3) {
        b2 b2Var = this.a;
        b2Var.getClass();
        ci ciVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            ciVar.a(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        b2Var.P.V1(pageblockmap);
        ciVar.a(true);
    }

    @Override // org.telegram.ui.Components.ji
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z9, int i7, int i10, long j3, boolean z10, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.P.e2((ij) arrayList.get(0));
        }
        this.b.a(true);
    }
}
