package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.h10;
import org.telegram.messenger.li;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class e8 extends q31 {
    public static final /* synthetic */ int b = 0;

    static {
        q31.h(new e8());
    }

    @Override // org.telegram.ui.Components.q31
    public final void a(tj0 tj0Var, View view, r31 r31Var) {
        f8 f8Var = (f8) view;
        boolean z10 = false;
        f8Var.b(r31Var != null && r31Var.e, true);
        if ((tj0Var instanceof l41) && ((l41) tj0Var).k3) {
            z10 = true;
        }
        f8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // org.telegram.ui.Components.q31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        int i3 = f41Var.f;
        f8 f8Var = (f8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) r31Var.G;
        boolean z11 = false;
        f8Var.d(tL_messages_stickerSet, z10, false);
        f8Var.b(r31Var.e, false);
        f8Var.c(l41Var.k3);
        f8Var.setOnOptionsClick(r31Var.D);
        f8Var.E.setOnClickListener(r31Var.E);
        f8Var.F.setOnClickListener(r31Var.E);
        f8Var.G.setOnClickListener(r31Var.E);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i10 = 1;
        boolean B0 = li.b0(i3).B0(tL_messages_stickerSet.set.id, true);
        boolean q10 = h10.i(i3).q();
        boolean z12 = !q10;
        if (!q10) {
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                if (zi.n3(tL_messages_stickerSet.documents.get(i11))) {
                }
            }
            if (z11) {
                i10 = B0 ? 4 : 3;
            } else if (B0 && !tL_messages_stickerSet.set.official) {
                i10 = 2;
            }
            f8Var.e(i10);
        }
        z11 = z12;
        if (z11) {
        }
        f8Var.e(i10);
    }

    @Override // org.telegram.ui.Components.q31
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        final f8 f8Var = new f8(context, 1);
        if (tj0Var instanceof l41) {
            final l41 l41Var = (l41) tj0Var;
            f8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.d8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    l41 l41Var2;
                    u4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (l41Var2 = l41.this).h3) == null) {
                        return false;
                    }
                    yVar.t(l41Var2.T(f8Var));
                    return false;
                }
            });
        }
        return f8Var;
    }
}
