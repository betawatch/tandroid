package hi;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gj;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.yi;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class f implements gl, gj {
    public final /* synthetic */ s a;
    public final /* synthetic */ yi b;

    public /* synthetic */ f(s sVar, yi yiVar) {
        this.a = sVar;
        this.b = yiVar;
    }

    @Override // org.telegram.ui.Components.gl
    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        s sVar = this.a;
        sVar.getClass();
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
        sVar.r.Q1(pageblockmap);
        sVar.V(true);
        yiVar.dismiss(true);
    }

    @Override // org.telegram.ui.Components.gj
    public void i(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j3, boolean z11, long j10) {
        if (!arrayList.isEmpty()) {
            this.a.r.a2((MessageObject) arrayList.get(0));
        }
        this.b.dismiss(true);
    }
}
