// default package

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.o;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class ku extends j79 {
    public final /* synthetic */ nu c;

    public ku(nu nuVar) {
        this.c = nuVar;
    }

    @Override // j79
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // j79
    public final int d(int i) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // j79
    public final void t(f89 f89Var, int i) {
        nu nuVar = this.c;
        mu muVar = nuVar.w;
        ArrayList<TL_iv.PageBlock> arrayList = nuVar.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i) - 1);
        int i2 = f89Var.f;
        View view = f89Var.a;
        if (i2 == 0) {
            dv dvVar = (dv) view;
            dvVar.S = (j47) muVar.b.get(pageBlock);
            dvVar.a((TL_iv.pageBlockPhoto) pageBlock, nuVar.x.F.cached_page, false, true);
        } else {
            yv yvVar = (yv) view;
            yvVar.U = (j47) muVar.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            yvVar.b(pageblockvideo, (zv) nuVar.y.E.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // j79
    public final f89 x(ViewGroup viewGroup, int i) {
        nu nuVar = this.c;
        ex exVar = nuVar.x;
        o oVar = nuVar.y;
        return new n69(i != 0 ? new yv(nuVar.getContext(), oVar, exVar, 2) : new dv(nuVar.getContext(), oVar, exVar, 2));
    }
}
