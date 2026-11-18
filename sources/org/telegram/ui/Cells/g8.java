package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.j10;
import org.telegram.messenger.ri;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g8 extends k41 {
    public static final /* synthetic */ int b = 0;

    static {
        k41.h(new g8());
    }

    @Override // org.telegram.ui.Components.k41
    public final void a(ck0 ck0Var, View view, l41 l41Var) {
        h8 h8Var = (h8) view;
        boolean z10 = false;
        h8Var.b(l41Var != null && l41Var.e, true);
        if ((ck0Var instanceof e51) && ((e51) ck0Var).k3) {
            z10 = true;
        }
        h8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // org.telegram.ui.Components.k41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        int i7 = z41Var.f;
        h8 h8Var = (h8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) l41Var.H;
        boolean z11 = false;
        h8Var.d(tL_messages_stickerSet, z10, false);
        h8Var.b(l41Var.e, false);
        h8Var.c(e51Var.k3);
        h8Var.setOnOptionsClick(l41Var.E);
        h8Var.E.setOnClickListener(l41Var.F);
        h8Var.F.setOnClickListener(l41Var.F);
        h8Var.G.setOnClickListener(l41Var.F);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i10 = 1;
        boolean E0 = ri.d0(i7).E0(tL_messages_stickerSet.set.id, true);
        boolean q10 = j10.i(i7).q();
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
            h8Var.e(i10);
        }
        z11 = z12;
        if (z11) {
        }
        h8Var.e(i10);
    }

    @Override // org.telegram.ui.Components.k41
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        final h8 h8Var = new h8(context, 1);
        if (ck0Var instanceof e51) {
            final e51 e51Var = (e51) ck0Var;
            h8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.f8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    e51 e51Var2;
                    v4.z zVar;
                    if (motionEvent.getAction() != 0 || (zVar = (e51Var2 = e51.this).h3) == null) {
                        return false;
                    }
                    zVar.t(e51Var2.T(h8Var));
                    return false;
                }
            });
        }
        return h8Var;
    }
}
