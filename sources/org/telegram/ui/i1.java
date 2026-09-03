package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class i1 extends f2.p0 {
    public final /* synthetic */ l1 c;

    public i1(l1 l1Var) {
        this.c = l1Var;
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
    public final void v(f2.m1 m1Var, int i10) {
        l1 l1Var = this.c;
        k1 k1Var = l1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = l1Var.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = m1Var.f;
        View view = m1Var.a;
        if (i11 == 0) {
            e2 e2Var = (e2) view;
            e2Var.O = (MessageObject.GroupedMessagePosition) k1Var.b.get(pageBlock);
            e2Var.a((TL_iv.pageBlockPhoto) pageBlock, l1Var.w.B.cached_page, false, true);
        } else {
            z2 z2Var = (z2) view;
            z2Var.Q = (MessageObject.GroupedMessagePosition) k1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            z2Var.b(pageblockvideo, (a3) l1Var.x.y.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        l1 l1Var = this.c;
        return new org.telegram.ui.Components.el0(i10 != 0 ? new z2(l1Var.getContext(), l1Var.x, l1Var.w, 2) : new e2(l1Var.getContext(), l1Var.x, l1Var.w, 2));
    }
}
