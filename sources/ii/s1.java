package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.el;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.xi;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements el, gj {
    public final /* synthetic */ e2 a;
    public final /* synthetic */ xi b;

    public /* synthetic */ s1(e2 e2Var, xi xiVar) {
        this.a = e2Var;
        this.b = xiVar;
    }

    @Override // org.telegram.ui.Components.el
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        e2 e2Var = this.a;
        e2Var.getClass();
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
        e2Var.P.S1(pageblockmap);
        xiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.gj
    public void j(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.P.c2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
