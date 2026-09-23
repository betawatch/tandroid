package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class m8 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new m8());
    }

    @Override // org.telegram.ui.Components.g51
    public final void attachedView(ml0 ml0Var, View view, h51 h51Var) {
        n8 n8Var = (n8) view;
        n8Var.b(h51Var.e, true);
        n8Var.c(ml0Var instanceof d61 ? ((d61) ml0Var).c3 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.g51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        int i10 = v51Var.f;
        n8 n8Var = (n8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) h51Var.G;
        boolean z11 = false;
        n8Var.d(tL_messages_stickerSet, z10, false);
        n8Var.b(h51Var.e, false);
        n8Var.c(d61Var.c3);
        n8Var.setOnOptionsClick(h51Var.D);
        n8Var.y.setOnClickListener(h51Var.E);
        n8Var.E.setOnClickListener(h51Var.E);
        n8Var.F.setOnClickListener(h51Var.E);
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

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final n8 n8Var = new n8(context, 1);
        if (ml0Var instanceof d61) {
            final d61 d61Var = (d61) ml0Var;
            n8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.l8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    d61 d61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (d61Var2 = d61.this).Z2) == null) {
                        return false;
                    }
                    yVar.r(d61Var2.T(n8Var));
                    return false;
                }
            });
        }
        return n8Var;
    }
}
