package oi;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements ll, bj {
    public final /* synthetic */ o a;
    public final /* synthetic */ ui b;

    public /* synthetic */ e(o oVar, ui uiVar) {
        this.a = oVar;
        this.b = uiVar;
    }

    @Override // org.telegram.ui.Components.ll
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        o oVar = this.a;
        oVar.getClass();
        ui uiVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            uiVar.a(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        oVar.r.V1(pageblockmap);
        oVar.a0(true);
        uiVar.a(true);
    }

    @Override // org.telegram.ui.Components.bj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.r.e2((fj) arrayList.get(0));
        }
        this.b.a(true);
    }
}
