package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j1 extends f2.r0 {
    public final /* synthetic */ m1 c;

    public j1(m1 m1Var) {
        this.c = m1Var;
    }

    @Override // f2.r0
    public final int h() {
        TL_iv.pageBlockCollage pageblockcollage = this.c.s;
        if (pageblockcollage == null) {
            return 0;
        }
        return pageblockcollage.items.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        ArrayList<TL_iv.PageBlock> arrayList = this.c.s.items;
        return arrayList.get((arrayList.size() - i9) - 1) instanceof TL_iv.pageBlockPhoto ? 0 : 1;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        m1 m1Var = this.c;
        l1 l1Var = m1Var.v;
        ArrayList<TL_iv.PageBlock> arrayList = m1Var.s.items;
        TL_iv.PageBlock pageBlock = arrayList.get((arrayList.size() - i9) - 1);
        int i10 = q1Var.f;
        View view = q1Var.a;
        if (i10 == 0) {
            f2 f2Var = (f2) view;
            f2Var.N = (MessageObject.GroupedMessagePosition) l1Var.b.get(pageBlock);
            f2Var.a((TL_iv.pageBlockPhoto) pageBlock, m1Var.w.A.cached_page, false, true);
        } else {
            a3 a3Var = (a3) view;
            a3Var.P = (MessageObject.GroupedMessagePosition) l1Var.b.get(pageBlock);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            a3Var.b(pageblockvideo, (b3) m1Var.x.y.f(pageblockvideo.video_id), false, true);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        m1 m1Var = this.c;
        return new org.telegram.ui.Components.ik0(i9 != 0 ? new a3(m1Var.getContext(), m1Var.x, m1Var.w, 2) : new f2(m1Var.getContext(), m1Var.x, m1Var.w, 2));
    }
}
