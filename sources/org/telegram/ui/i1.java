package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class i1 extends s4.g0 {
    public final /* synthetic */ l1 c;

    public i1(l1 l1Var) {
        this.c = l1Var;
    }

    @Override // s4.g0
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        l1 l1Var = this.c;
        k1 k1Var = l1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = l1Var.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            e2 e2Var = (e2) view;
            e2Var.R = (MessageObject.GroupedMessagePosition) k1Var.b.get(pageBlock);
            e2Var.a((TL_iv.pageBlockPhoto) pageBlock, l1Var.w.E.cached_page, false, true);
        } else {
            y2 y2Var = (y2) view;
            y2Var.T = (MessageObject.GroupedMessagePosition) k1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            y2Var.b(pageblockvideo, (z2) l1Var.x.y.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        l1 l1Var = this.c;
        return new org.telegram.ui.Components.wl0(i10 != 0 ? new y2(l1Var.getContext(), l1Var.x, l1Var.w, 2) : new e2(l1Var.getContext(), l1Var.x, l1Var.w, 2));
    }
}
