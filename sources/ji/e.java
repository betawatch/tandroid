package ji;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.dj;
import org.telegram.ui.Components.vi;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements bl, dj {
    public final /* synthetic */ r a;
    public final /* synthetic */ vi b;

    public /* synthetic */ e(r rVar, vi viVar) {
        this.a = rVar;
        this.b = viVar;
    }

    @Override // org.telegram.ui.Components.bl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
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
        rVar.r.Q1(pageblockmap);
        rVar.V(true);
        viVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.dj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.r.a2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
