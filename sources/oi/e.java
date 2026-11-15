package oi;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class e implements cl, si {
    public final /* synthetic */ o a;
    public final /* synthetic */ ki b;

    public /* synthetic */ e(o oVar, ki kiVar) {
        this.a = oVar;
        this.b = kiVar;
    }

    @Override // org.telegram.ui.Components.cl
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        o oVar = this.a;
        oVar.getClass();
        ki kiVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            kiVar.a(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        oVar.r.V1(pageblockmap);
        oVar.a0(true);
        kiVar.a(true);
    }

    @Override // org.telegram.ui.Components.si
    public void k(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.r.e2((gj) arrayList.get(0));
        }
        this.b.a(true);
    }
}
