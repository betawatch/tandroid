package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class j1 extends s4.g0 {
    public final /* synthetic */ m1 c;

    public j1(m1 m1Var) {
        this.c = m1Var;
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
        m1 m1Var = this.c;
        l1 l1Var = m1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = m1Var.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = b1Var.f;
        View view = b1Var.a;
        if (i11 == 0) {
            f2 f2Var = (f2) view;
            f2Var.R = (MessageObject.GroupedMessagePosition) l1Var.b.get(pageBlock);
            f2Var.a((TL_iv.pageBlockPhoto) pageBlock, m1Var.w.E.cached_page, false, true);
        } else {
            z2 z2Var = (z2) view;
            z2Var.T = (MessageObject.GroupedMessagePosition) l1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            z2Var.b(pageblockvideo, (a3) m1Var.x.y.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        m1 m1Var = this.c;
        return new org.telegram.ui.Components.sl0(i10 != 0 ? new z2(m1Var.getContext(), m1Var.x, m1Var.w, 2) : new f2(m1Var.getContext(), m1Var.x, m1Var.w, 2));
    }
}
