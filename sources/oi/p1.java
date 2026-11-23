package oi;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.bj;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.ui;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p1 implements ll, bj {
    public final /* synthetic */ b2 a;
    public final /* synthetic */ ui b;

    public /* synthetic */ p1(b2 b2Var, ui uiVar) {
        this.a = b2Var;
        this.b = uiVar;
    }

    @Override // org.telegram.ui.Components.ll
    public void b(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        b2 b2Var = this.a;
        b2Var.getClass();
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
        b2Var.Q.V1(pageblockmap);
        uiVar.a(true);
    }

    @Override // org.telegram.ui.Components.bj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.Q.e2((gj) arrayList.get(0));
        }
        this.b.a(true);
    }
}
