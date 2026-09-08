package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class h1 extends s4.h0 {
    public final /* synthetic */ k1 c;

    public h1(k1 k1Var) {
        this.c = k1Var;
    }

    @Override // s4.h0
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i10) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        k1 k1Var = this.c;
        j1 j1Var = k1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = k1Var.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i10) - 1);
        int i11 = c1Var.f;
        View view = c1Var.a;
        if (i11 == 0) {
            d2 d2Var = (d2) view;
            d2Var.R = (MessageObject.GroupedMessagePosition) j1Var.b.get(pageBlock);
            d2Var.a((TL_iv.pageBlockPhoto) pageBlock, k1Var.w.E.cached_page, false, true);
        } else {
            x2 x2Var = (x2) view;
            x2Var.T = (MessageObject.GroupedMessagePosition) j1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            x2Var.b(pageblockvideo, (y2) k1Var.x.y.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        k1 k1Var = this.c;
        return new org.telegram.ui.Components.vk0(i10 != 0 ? new x2(k1Var.getContext(), k1Var.x, k1Var.w, 2) : new d2(k1Var.getContext(), k1Var.x, k1Var.w, 2));
    }
}
