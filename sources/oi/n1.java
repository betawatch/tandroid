package oi;

import java.util.ArrayList;
import org.telegram.messenger.gj;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.si;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements cl, si {
    public final /* synthetic */ z1 a;
    public final /* synthetic */ ki b;

    public /* synthetic */ n1(z1 z1Var, ki kiVar) {
        this.a = z1Var;
        this.b = kiVar;
    }

    @Override // org.telegram.ui.Components.cl
    public void d(TLRPC.MessageMedia messageMedia, int i7, boolean z10, int i10, long j3) {
        z1 z1Var = this.a;
        z1Var.getClass();
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
        z1Var.Q.V1(pageblockmap);
        kiVar.a(true);
    }

    @Override // org.telegram.ui.Components.si
    public void k(ArrayList arrayList, CharSequence charSequence, boolean z10, int i7, int i10, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.Q.e2((gj) arrayList.get(0));
        }
        this.b.a(true);
    }
}
