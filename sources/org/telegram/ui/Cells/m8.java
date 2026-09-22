package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class m8 extends x51 {
    public static final /* synthetic */ int a = 0;

    static {
        x51.setup(new m8());
    }

    @Override // org.telegram.ui.Components.x51
    public final void attachedView(yl0 yl0Var, View view, y51 y51Var) {
        n8 n8Var = (n8) view;
        n8Var.b(y51Var.e, true);
        n8Var.c(yl0Var instanceof u61 ? ((u61) yl0Var).c3 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.x51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        int i10 = m61Var.f;
        n8 n8Var = (n8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) y51Var.G;
        boolean z11 = false;
        n8Var.d(tL_messages_stickerSet, z10, false);
        n8Var.b(y51Var.e, false);
        n8Var.c(u61Var.c3);
        n8Var.setOnOptionsClick(y51Var.D);
        n8Var.y.setOnClickListener(y51Var.E);
        n8Var.E.setOnClickListener(y51Var.E);
        n8Var.F.setOnClickListener(y51Var.E);
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
            n8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
        }
        z11 = z12;
        n8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
    }

    @Override // org.telegram.ui.Components.x51
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final n8 n8Var = new n8(context, 1);
        if (yl0Var instanceof u61) {
            final u61 u61Var = (u61) yl0Var;
            n8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.l8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    u61 u61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (u61Var2 = u61.this).Z2) == null) {
                        return false;
                    }
                    yVar.r(u61Var2.U(n8Var));
                    return false;
                }
            });
        }
        return n8Var;
    }
}
