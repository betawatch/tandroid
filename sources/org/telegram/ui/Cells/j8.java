package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.e20;
import org.telegram.messenger.kj;
import org.telegram.messenger.vi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class j8 extends a51 {
    public static final /* synthetic */ int b = 0;

    static {
        a51.h(new j8());
    }

    @Override // org.telegram.ui.Components.a51
    public final void a(uk0 uk0Var, View view, b51 b51Var) {
        k8 k8Var = (k8) view;
        boolean z10 = false;
        k8Var.b(b51Var != null && b51Var.e, true);
        if ((uk0Var instanceof v51) && ((v51) uk0Var).j3) {
            z10 = true;
        }
        k8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // org.telegram.ui.Components.a51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        int i10 = q51Var.f;
        k8 k8Var = (k8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) b51Var.G;
        boolean z11 = false;
        k8Var.d(tL_messages_stickerSet, z10, false);
        k8Var.b(b51Var.e, false);
        k8Var.c(v51Var.j3);
        k8Var.setOnOptionsClick(b51Var.D);
        k8Var.D.setOnClickListener(b51Var.E);
        k8Var.E.setOnClickListener(b51Var.E);
        k8Var.F.setOnClickListener(b51Var.E);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i11 = 1;
        boolean B0 = vi.b0(i10).B0(tL_messages_stickerSet.set.id, true);
        boolean q6 = e20.i(i10).q();
        boolean z12 = !q6;
        if (!q6) {
            for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                if (kj.m3(tL_messages_stickerSet.documents.get(i12))) {
                }
            }
            if (z11) {
                i11 = B0 ? 4 : 3;
            } else if (B0 && !tL_messages_stickerSet.set.official) {
                i11 = 2;
            }
            k8Var.e(i11);
        }
        z11 = z12;
        if (z11) {
        }
        k8Var.e(i11);
    }

    @Override // org.telegram.ui.Components.a51
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        final k8 k8Var = new k8(context, 1);
        if (uk0Var instanceof v51) {
            final v51 v51Var = (v51) uk0Var;
            k8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.i8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    v51 v51Var2;
                    s4.x xVar;
                    if (motionEvent.getAction() != 0 || (xVar = (v51Var2 = v51.this).g3) == null) {
                        return false;
                    }
                    xVar.t(v51Var2.T(k8Var));
                    return false;
                }
            });
        }
        return k8Var;
    }
}
