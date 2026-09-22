package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements bl, dj {
    public final /* synthetic */ d2 a;
    public final /* synthetic */ vi b;

    public /* synthetic */ r1(d2 d2Var, vi viVar) {
        this.a = d2Var;
        this.b = viVar;
    }

    @Override // org.telegram.ui.Components.bl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        d2 d2Var = this.a;
        d2Var.getClass();
        vi viVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            viVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        d2Var.P.S1(pageblockmap);
        viVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.dj
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.P.c2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
