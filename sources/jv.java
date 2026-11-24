// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class jv extends y59 {
    public final /* synthetic */ mv c;

    public jv(mv mvVar) {
        this.c = mvVar;
    }

    @Override // y59
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // y59
    public final int d(int i) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        mv mvVar = this.c;
        lv lvVar = mvVar.w;
        ArrayList<TL_iv.PageBlock> arrayList = mvVar.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i) - 1);
        int i2 = u69Var.f;
        View view = u69Var.a;
        if (i2 == 0) {
            cw cwVar = (cw) view;
            cwVar.S = (c47) lvVar.b.get(pageBlock);
            cwVar.a((TL_iv.pageBlockPhoto) pageBlock, mvVar.x.F.cached_page, false, true);
        } else {
            xw xwVar = (xw) view;
            xwVar.U = (c47) lvVar.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            xwVar.b(pageblockvideo, (yw) mvVar.y.E.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        mv mvVar = this.c;
        ey eyVar = mvVar.x;
        o oVar = mvVar.y;
        return new b59(i != 0 ? new xw(mvVar.getContext(), oVar, eyVar, 2) : new cw(mvVar.getContext(), oVar, eyVar, 2));
    }
}
