package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.messenger.m10;
import org.telegram.messenger.si;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class e8 extends a41 {
    public static final /* synthetic */ int b = 0;

    static {
        a41.h(new e8());
    }

    @Override // org.telegram.ui.Components.a41
    public final void a(uj0 uj0Var, View view, b41 b41Var) {
        f8 f8Var = (f8) view;
        boolean z10 = false;
        f8Var.b(b41Var != null && b41Var.e, true);
        if ((uj0Var instanceof u41) && ((u41) uj0Var).k3) {
            z10 = true;
        }
        f8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    @Override // org.telegram.ui.Components.a41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        int i7 = p41Var.f;
        f8 f8Var = (f8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) b41Var.G;
        boolean z11 = false;
        f8Var.d(tL_messages_stickerSet, z10, false);
        f8Var.b(b41Var.e, false);
        f8Var.c(u41Var.k3);
        f8Var.setOnOptionsClick(b41Var.D);
        f8Var.E.setOnClickListener(b41Var.E);
        f8Var.F.setOnClickListener(b41Var.E);
        f8Var.G.setOnClickListener(b41Var.E);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        int i10 = 1;
        boolean B0 = si.b0(i7).B0(tL_messages_stickerSet.set.id, true);
        boolean q10 = m10.i(i7).q();
        boolean z12 = !q10;
        if (!q10) {
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                if (gj.m3(tL_messages_stickerSet.documents.get(i11))) {
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

    @Override // org.telegram.ui.Components.a41
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        final f8 f8Var = new f8(context, 1);
        if (uj0Var instanceof u41) {
            final u41 u41Var = (u41) uj0Var;
            f8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.d8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    u41 u41Var2;
                    v4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (u41Var2 = u41.this).h3) == null) {
                        return false;
                    }
                    yVar.t(u41Var2.T(f8Var));
                    return false;
                }
            });
        }
        return f8Var;
    }
}
