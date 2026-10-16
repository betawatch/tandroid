package ji;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements ol, ej {
    public final /* synthetic */ d2 a;
    public final /* synthetic */ vi b;

    public /* synthetic */ r1(d2 d2Var, vi viVar) {
        this.a = d2Var;
        this.b = viVar;
    }

    @Override // org.telegram.ui.Components.ol
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
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

    @Override // org.telegram.ui.Components.ej
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.P.c2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
