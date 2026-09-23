package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.wi;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements cl, ej {
    public final /* synthetic */ e2 a;
    public final /* synthetic */ wi b;

    public /* synthetic */ s1(e2 e2Var, wi wiVar) {
        this.a = e2Var;
        this.b = wiVar;
    }

    @Override // org.telegram.ui.Components.cl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        e2 e2Var = this.a;
        e2Var.getClass();
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
        e2Var.P.R1(pageblockmap);
        wiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ej
    public void h(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.P.b2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
