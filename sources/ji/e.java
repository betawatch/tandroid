package ji;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ej;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements pl, ej {
    public final /* synthetic */ r a;
    public final /* synthetic */ vi b;

    public /* synthetic */ e(r rVar, vi viVar) {
        this.a = rVar;
        this.b = viVar;
    }

    @Override // org.telegram.ui.Components.pl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        r rVar = this.a;
        rVar.getClass();
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
        rVar.r.S1(pageblockmap);
        rVar.Y(true);
        viVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.ej
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
        if (!arrayList.isEmpty()) {
            this.a.r.c2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
