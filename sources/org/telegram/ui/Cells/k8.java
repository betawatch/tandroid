package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class k8 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new k8());
    }

    @Override // org.telegram.ui.Components.l61
    public final void attachedView(mm0 mm0Var, View view, m61 m61Var) {
        l8 l8Var = (l8) view;
        boolean z10 = false;
        l8Var.b(m61Var != null && m61Var.e, true);
        if ((mm0Var instanceof j71) && ((j71) mm0Var).d3) {
            z10 = true;
        }
        l8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.l61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        int i10 = b71Var.f;
        l8 l8Var = (l8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) m61Var.G;
        boolean z11 = false;
        l8Var.d(tL_messages_stickerSet, z10, false);
        l8Var.b(m61Var.e, false);
        l8Var.c(j71Var.d3);
        l8Var.setOnOptionsClick(m61Var.D);
        l8Var.y.setOnClickListener(m61Var.E);
        l8Var.E.setOnClickListener(m61Var.E);
        l8Var.F.setOnClickListener(m61Var.E);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        boolean isStickerPackInstalled = MediaDataController.getInstance(i10).isStickerPackInstalled(tL_messages_stickerSet.set.id);
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        boolean z12 = !isPremium;
        if (!isPremium) {
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                if (MessageObject.isFreeEmoji(tL_messages_stickerSet.documents.get(i11))) {
                }
            }
            l8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
        }
        z11 = z12;
        l8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
    }

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        final l8 l8Var = new l8(context, 1);
        if (mm0Var instanceof j71) {
            final j71 j71Var = (j71) mm0Var;
            l8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.j8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    j71 j71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (j71Var2 = j71.this).a3) == null) {
                        return false;
                    }
                    yVar.r(j71Var2.T(l8Var));
                    return false;
                }
            });
        }
        return l8Var;
    }
}
