package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j8 extends z41 {
    public static final /* synthetic */ int b = 0;

    static {
        z41.h(new j8());
    }

    @Override // org.telegram.ui.Components.z41
    public final void a(tk0 tk0Var, View view, a51 a51Var) {
        k8 k8Var = (k8) view;
        boolean z10 = false;
        k8Var.b(a51Var != null && a51Var.e, true);
        if ((tk0Var instanceof u51) && ((u51) tk0Var).j3) {
            z10 = true;
        }
        k8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // org.telegram.ui.Components.z41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        int i10 = p51Var.f;
        k8 k8Var = (k8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) a51Var.G;
        boolean z11 = false;
        k8Var.d(tL_messages_stickerSet, z10, false);
        k8Var.b(a51Var.e, false);
        k8Var.c(u51Var.j3);
        k8Var.setOnOptionsClick(a51Var.D);
        k8Var.D.setOnClickListener(a51Var.E);
        k8Var.E.setOnClickListener(a51Var.E);
        k8Var.F.setOnClickListener(a51Var.E);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i11 = 1;
        boolean B0 = ui.b0(i10).B0(tL_messages_stickerSet.set.id, true);
        boolean q6 = d20.i(i10).q();
        boolean z12 = !q6;
        if (!q6) {
            for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                if (jj.m3(tL_messages_stickerSet.documents.get(i12))) {
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

    @Override // org.telegram.ui.Components.z41
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        final k8 k8Var = new k8(context, 1);
        if (tk0Var instanceof u51) {
            final u51 u51Var = (u51) tk0Var;
            k8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.i8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    u51 u51Var2;
                    s4.x xVar;
                    if (motionEvent.getAction() != 0 || (xVar = (u51Var2 = u51.this).g3) == null) {
                        return false;
                    }
                    xVar.t(u51Var2.T(k8Var));
                    return false;
                }
            });
        }
        return k8Var;
    }
}
