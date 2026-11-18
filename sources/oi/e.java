package oi;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.zi;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements jl, zi {
    public final /* synthetic */ o a;
    public final /* synthetic */ si b;

    public /* synthetic */ e(o oVar, si siVar) {
        this.a = oVar;
        this.b = siVar;
    }

    @Override // org.telegram.ui.Components.jl
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        o oVar = this.a;
        oVar.getClass();
        si siVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            siVar.a(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        oVar.r.V1(pageblockmap);
        oVar.a0(true);
        siVar.a(true);
    }

    @Override // org.telegram.ui.Components.zi
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.r.e2((fj) arrayList.get(0));
        }
        this.b.a(true);
    }
}
