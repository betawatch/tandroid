// default package

import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class nv extends pr7 {
    public final /* synthetic */ pv c;

    public nv(pv pvVar) {
        this.c = pvVar;
    }

    @Override // pr7
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.c.e;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override // pr7
    public final int c(Object obj) {
        return this.c.e.items.contains(((mv) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pr7
    public final Object e(gec gecVar, int i) {
        xv xvVar;
        pv pvVar = this.c;
        dx dxVar = pvVar.y;
        o oVar = pvVar.E;
        TL_iv.PageBlock pageBlock = pvVar.e.items.get(i);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            cv cvVar = new cv(pvVar.getContext(), oVar, dxVar, 1);
            cvVar.a((TL_iv.pageBlockPhoto) pageBlock, dxVar.F.cached_page, false, true);
            xvVar = cvVar;
        } else {
            xv xvVar2 = new xv(pvVar.getContext(), oVar, dxVar, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            xvVar2.b(pageblockvideo, (yv) oVar.E.f(pageblockvideo.video_id), false, true);
            xvVar = xvVar2;
        }
        gecVar.addView(xvVar);
        mv mvVar = new mv();
        mvVar.b = xvVar;
        mvVar.a = pageBlock;
        return mvVar;
    }
}
