package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.i10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f8 extends m41 {
    public static final /* synthetic */ int b = 0;

    static {
        m41.h(new f8());
    }

    @Override // org.telegram.ui.Components.m41
    public final void a(ek0 ek0Var, View view, n41 n41Var) {
        g8 g8Var = (g8) view;
        boolean z10 = false;
        g8Var.b(n41Var != null && n41Var.e, true);
        if ((ek0Var instanceof g51) && ((g51) ek0Var).k3) {
            z10 = true;
        }
        g8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // org.telegram.ui.Components.m41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        int i7 = b51Var.f;
        g8 g8Var = (g8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) n41Var.H;
        boolean z11 = false;
        g8Var.d(tL_messages_stickerSet, z10, false);
        g8Var.b(n41Var.e, false);
        g8Var.c(g51Var.k3);
        g8Var.setOnOptionsClick(n41Var.E);
        g8Var.E.setOnClickListener(n41Var.F);
        g8Var.F.setOnClickListener(n41Var.F);
        g8Var.G.setOnClickListener(n41Var.F);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i10 = 1;
        boolean E0 = ri.d0(i7).E0(tL_messages_stickerSet.set.id, true);
        boolean q10 = i10.i(i7).q();
        boolean z12 = !q10;
        if (!q10) {
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                if (fj.m3(tL_messages_stickerSet.documents.get(i11))) {
                }
            }
            if (z11) {
                i10 = E0 ? 4 : 3;
            } else if (E0 && !tL_messages_stickerSet.set.official) {
                i10 = 2;
            }
            g8Var.e(i10);
        }
        z11 = z12;
        if (z11) {
        }
        g8Var.e(i10);
    }

    @Override // org.telegram.ui.Components.m41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        final g8 g8Var = new g8(context, 1);
        if (ek0Var instanceof g51) {
            final g51 g51Var = (g51) ek0Var;
            g8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.e8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    g51 g51Var2;
                    v4.z zVar;
                    if (motionEvent.getAction() != 0 || (zVar = (g51Var2 = g51.this).h3) == null) {
                        return false;
                    }
                    zVar.t(g51Var2.T(g8Var));
                    return false;
                }
            });
        }
        return g8Var;
    }
}
