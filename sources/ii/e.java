package ii;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.hj;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.yi;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements sl, hj {
    public final /* synthetic */ r a;
    public final /* synthetic */ yi b;

    public /* synthetic */ e(r rVar, yi yiVar) {
        this.a = rVar;
        this.b = yiVar;
    }

    @Override // org.telegram.ui.Components.sl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        r rVar = this.a;
        rVar.getClass();
        yi yiVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            yiVar.dismiss(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        rVar.r.S1(pageblockmap);
        rVar.Y(true);
        yiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.hj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.r.c2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
