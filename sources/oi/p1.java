package oi;

import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.ti;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements jl, aj {
    public final /* synthetic */ b2 a;
    public final /* synthetic */ ti b;

    public /* synthetic */ p1(b2 b2Var, ti tiVar) {
        this.a = b2Var;
        this.b = tiVar;
    }

    @Override // org.telegram.ui.Components.jl
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        b2 b2Var = this.a;
        b2Var.getClass();
        ti tiVar = this.b;
        if (messageMedia == null || messageMedia.geo == null) {
            tiVar.a(true);
            return;
        }
        TL_iv.pageBlockMap pageblockmap = new TL_iv.pageBlockMap();
        pageblockmap.geo = messageMedia.geo;
        pageblockmap.zoom = 15;
        pageblockmap.w = 600;
        pageblockmap.h = 400;
        b2Var.Q.V1(pageblockmap);
        tiVar.a(true);
    }

    @Override // org.telegram.ui.Components.aj
    public void e(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.Q.e2((fj) arrayList.get(0));
        }
        this.b.a(true);
    }
}
