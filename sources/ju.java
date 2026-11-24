// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ju extends w39 {
    public final /* synthetic */ mu c;

    public ju(mu muVar) {
        this.c = muVar;
    }

    @Override // w39
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // w39
    public final int d(int i) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        mu muVar = this.c;
        lu luVar = muVar.w;
        ArrayList<TL_iv.PageBlock> arrayList = muVar.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i) - 1);
        int i2 = s49Var.f;
        View view = s49Var.a;
        if (i2 == 0) {
            cv cvVar = (cv) view;
            cvVar.S = (c27) luVar.b.get(pageBlock);
            cvVar.a((TL_iv.pageBlockPhoto) pageBlock, muVar.x.F.cached_page, false, true);
        } else {
            xv xvVar = (xv) view;
            xvVar.U = (c27) luVar.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            xvVar.b(pageblockvideo, (yv) muVar.y.E.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        mu muVar = this.c;
        dx dxVar = muVar.x;
        o oVar = muVar.y;
        return new y29(i != 0 ? new xv(muVar.getContext(), oVar, dxVar, 2) : new cv(muVar.getContext(), oVar, dxVar, 2));
    }
}
