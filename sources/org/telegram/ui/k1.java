package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k1 extends f2.o0 {
    public final /* synthetic */ n1 c;

    public k1(n1 n1Var) {
        this.c = n1Var;
    }

    @Override // f2.o0
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        n1 n1Var = this.c;
        m1 m1Var = n1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = n1Var.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = l1Var.f;
        View view = l1Var.a;
        if (i11 == 0) {
            g2 g2Var = (g2) view;
            g2Var.O = (MessageObject.GroupedMessagePosition) m1Var.b.get(pageBlock);
            g2Var.a((TL_iv.pageBlockPhoto) pageBlock, n1Var.w.B.cached_page, false, true);
        } else {
            b3 b3Var = (b3) view;
            b3Var.Q = (MessageObject.GroupedMessagePosition) m1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            b3Var.b(pageblockvideo, (c3) n1Var.x.y.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        n1 n1Var = this.c;
        return new org.telegram.ui.Components.dl0(i10 != 0 ? new b3(n1Var.getContext(), n1Var.x, n1Var.w, 2) : new g2(n1Var.getContext(), n1Var.x, n1Var.w, 2));
    }
}
