package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class j8 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new j8());
    }

    @Override // org.telegram.ui.Components.g51
    public final void attachedView(sl0 sl0Var, View view, h51 h51Var) {
        k8 k8Var = (k8) view;
        k8Var.b(h51Var.e, true);
        k8Var.c(sl0Var instanceof h61 ? ((h61) sl0Var).Z2 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.g51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        int i10 = w51Var.f;
        k8 k8Var = (k8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) h51Var.G;
        boolean z10 = false;
        k8Var.d(tL_messages_stickerSet, z4, false);
        k8Var.b(h51Var.e, false);
        k8Var.c(h61Var.Z2);
        k8Var.setOnOptionsClick(h51Var.D);
        k8Var.y.setOnClickListener(h51Var.E);
        k8Var.B.setOnClickListener(h51Var.E);
        k8Var.C.setOnClickListener(h51Var.E);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        boolean isStickerPackInstalled = MediaDataController.getInstance(i10).isStickerPackInstalled(tL_messages_stickerSet.set.id);
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        boolean z11 = !isPremium;
        if (!isPremium) {
            for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                if (MessageObject.isFreeEmoji(tL_messages_stickerSet.documents.get(i11))) {
                }
            }
            k8Var.e(!z10 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
        }
        z10 = z11;
        k8Var.e(!z10 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
    }

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        final k8 k8Var = new k8(context, 1);
        if (sl0Var instanceof h61) {
            final h61 h61Var = (h61) sl0Var;
            k8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.i8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    h61 h61Var2;
                    f2.f0 f0Var;
                    if (motionEvent.getAction() != 0 || (f0Var = (h61Var2 = h61.this).W2) == null) {
                        return false;
                    }
                    f0Var.r(h61Var2.T(k8Var));
                    return false;
                }
            });
        }
        return k8Var;
    }
}
