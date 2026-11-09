package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.y31;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f8 extends x31 {
    public static final /* synthetic */ int b = 0;

    static {
        x31.h(new f8());
    }

    @Override // org.telegram.ui.Components.x31
    public final void a(qj0 qj0Var, View view, y31 y31Var) {
        g8 g8Var = (g8) view;
        boolean z9 = false;
        g8Var.b(y31Var != null && y31Var.e, true);
        if ((qj0Var instanceof r41) && ((r41) qj0Var).j3) {
            z9 = true;
        }
        g8Var.c(z9);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // org.telegram.ui.Components.x31
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, y31 y31Var, boolean z9, m41 m41Var, r41 r41Var) {
        int i7 = m41Var.f;
        g8 g8Var = (g8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) y31Var.G;
        boolean z10 = false;
        g8Var.d(tL_messages_stickerSet, z9, false);
        g8Var.b(y31Var.e, false);
        g8Var.c(r41Var.j3);
        g8Var.setOnOptionsClick(y31Var.D);
        g8Var.D.setOnClickListener(y31Var.E);
        g8Var.E.setOnClickListener(y31Var.E);
        g8Var.F.setOnClickListener(y31Var.E);
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
                if (ij.m3(tL_messages_stickerSet.documents.get(i11))) {
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

    @Override // org.telegram.ui.Components.x31
    public final View d(Context context, qj0 qj0Var, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        final g8 g8Var = new g8(context, 1);
        if (qj0Var instanceof r41) {
            final r41 r41Var = (r41) qj0Var;
            g8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.e8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    r41 r41Var2;
                    v4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (r41Var2 = r41.this).g3) == null) {
                        return false;
                    }
                    yVar.t(r41Var2.T(g8Var));
                    return false;
                }
            });
        }
        return g8Var;
    }
}
