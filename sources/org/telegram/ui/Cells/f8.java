package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f8 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new f8());
    }

    @Override // org.telegram.ui.Components.q31
    public final void a(pj0 pj0Var, View view, r31 r31Var) {
        g8 g8Var = (g8) view;
        boolean z9 = false;
        g8Var.b(r31Var != null && r31Var.e, true);
        if ((pj0Var instanceof k41) && ((k41) pj0Var).j3) {
            z9 = true;
        }
        g8Var.c(z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // org.telegram.ui.Components.q31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        int i7 = f41Var.f;
        g8 g8Var = (g8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) r31Var.G;
        boolean z10 = false;
        g8Var.d(tL_messages_stickerSet, z9, false);
        g8Var.b(r31Var.e, false);
        g8Var.c(k41Var.j3);
        g8Var.setOnOptionsClick(r31Var.D);
        g8Var.D.setOnClickListener(r31Var.E);
        g8Var.E.setOnClickListener(r31Var.E);
        g8Var.F.setOnClickListener(r31Var.E);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i10 = 1;
        boolean B0 = ui.b0(i7).B0(tL_messages_stickerSet.set.id, true);
        boolean q10 = p10.i(i7).q();
        boolean z11 = !q10;
        if (!q10) {
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                if (ij.n3(tL_messages_stickerSet.documents.get(i11))) {
                }
            }
            if (z10) {
                i10 = B0 ? 4 : 3;
            } else if (B0 && !tL_messages_stickerSet.set.official) {
                i10 = 2;
            }
            g8Var.e(i10);
        }
        z10 = z11;
        if (z10) {
        }
        g8Var.e(i10);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        final g8 g8Var = new g8(context, 1);
        if (pj0Var instanceof k41) {
            final k41 k41Var = (k41) pj0Var;
            g8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.e8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    k41 k41Var2;
                    v4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (k41Var2 = k41.this).g3) == null) {
                        return false;
                    }
                    yVar.t(k41Var2.T(g8Var));
                    return false;
                }
            });
        }
        return g8Var;
    }
}
