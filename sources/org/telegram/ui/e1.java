package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class e1 extends v4.i0 {
    public final /* synthetic */ h1 c;

    public e1(h1 h1Var) {
        this.c = h1Var;
    }

    @Override // v4.i0
    public final int b() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // v4.i0
    public final int d(int i7) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i7) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        h1 h1Var = this.c;
        g1 g1Var = h1Var.w;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i7) - 1);
        int i10 = f1Var.f;
        View view = f1Var.a;
        if (i10 == 0) {
            a2 a2Var = (a2) view;
            a2Var.S = (org.telegram.messenger.xi) g1Var.b.get(pageBlock);
            a2Var.a((TL_iv.pageBlockPhoto) pageBlock, h1Var.x.F.cached_page, false, true);
        } else {
            v2 v2Var = (v2) view;
            v2Var.U = (org.telegram.messenger.xi) g1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            v2Var.b(pageblockvideo, (w2) h1Var.y.E.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        h1 h1Var = this.c;
        return new org.telegram.ui.Components.kj0(i7 != 0 ? new v2(h1Var.getContext(), h1Var.y, h1Var.x, 2) : new a2(h1Var.getContext(), h1Var.y, h1Var.x, 2));
    }
}
