package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class k1 extends f2.p0 {
    public final /* synthetic */ n1 c;

    public k1(n1 n1Var) {
        this.c = n1Var;
    }

    @Override // f2.p0
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        n1 n1Var2 = this.c;
        m1 m1Var = n1Var2.v;
        ArrayList<TL_iv.PageBlock> arrayList = n1Var2.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = n1Var.f;
        View view = n1Var.a;
        if (i11 == 0) {
            g2 g2Var = (g2) view;
            g2Var.N = (MessageObject.GroupedMessagePosition) m1Var.b.get(pageBlock);
            g2Var.a((TL_iv.pageBlockPhoto) pageBlock, n1Var2.w.A.cached_page, false, true);
        } else {
            b3 b3Var = (b3) view;
            b3Var.P = (MessageObject.GroupedMessagePosition) m1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            b3Var.b(pageblockvideo, (c3) n1Var2.x.y.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = this.c;
        return new org.telegram.ui.Components.vk0(i10 != 0 ? new b3(n1Var.getContext(), n1Var.x, n1Var.w, 2) : new g2(n1Var.getContext(), n1Var.x, n1Var.w, 2));
    }
}
