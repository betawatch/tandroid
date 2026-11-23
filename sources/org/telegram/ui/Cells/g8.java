package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.messenger.k10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class g8 extends n41 {
    public static final /* synthetic */ int b = 0;

    static {
        n41.h(new g8());
    }

    @Override // org.telegram.ui.Components.n41
    public final void a(ek0 ek0Var, View view, o41 o41Var) {
        h8 h8Var = (h8) view;
        boolean z10 = false;
        h8Var.b(o41Var != null && o41Var.e, true);
        if ((ek0Var instanceof h51) && ((h51) ek0Var).k3) {
            z10 = true;
        }
        h8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // org.telegram.ui.Components.n41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        int i7 = c51Var.f;
        h8 h8Var = (h8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) o41Var.H;
        boolean z11 = false;
        h8Var.d(tL_messages_stickerSet, z10, false);
        h8Var.b(o41Var.e, false);
        h8Var.c(h51Var.k3);
        h8Var.setOnOptionsClick(o41Var.E);
        h8Var.E.setOnClickListener(o41Var.F);
        h8Var.F.setOnClickListener(o41Var.F);
        h8Var.G.setOnClickListener(o41Var.F);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i10 = 1;
        boolean E0 = si.d0(i7).E0(tL_messages_stickerSet.set.id, true);
        boolean q10 = k10.i(i7).q();
        boolean z12 = !q10;
        if (!q10) {
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                if (gj.m3(tL_messages_stickerSet.documents.get(i11))) {
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

    @Override // org.telegram.ui.Components.n41
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        final h8 h8Var = new h8(context, 1);
        if (ek0Var instanceof h51) {
            final h51 h51Var = (h51) ek0Var;
            h8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.f8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    h51 h51Var2;
                    v4.z zVar;
                    if (motionEvent.getAction() != 0 || (zVar = (h51Var2 = h51.this).h3) == null) {
                        return false;
                    }
                    zVar.t(h51Var2.T(h8Var));
                    return false;
                }
            });
        }
        return h8Var;
    }
}
