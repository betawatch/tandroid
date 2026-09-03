package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class i8 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new i8());
    }

    @Override // org.telegram.ui.Components.h51
    public final void attachedView(rl0 rl0Var, View view, i51 i51Var) {
        j8 j8Var = (j8) view;
        j8Var.b(i51Var.e, true);
        j8Var.c(rl0Var instanceof g61 ? ((g61) rl0Var).Z2 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.h51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        int i10 = w51Var.f;
        j8 j8Var = (j8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) i51Var.G;
        boolean z10 = false;
        j8Var.d(tL_messages_stickerSet, z4, false);
        j8Var.b(i51Var.e, false);
        j8Var.c(g61Var.Z2);
        j8Var.setOnOptionsClick(i51Var.D);
        j8Var.y.setOnClickListener(i51Var.E);
        j8Var.B.setOnClickListener(i51Var.E);
        j8Var.C.setOnClickListener(i51Var.E);
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
            j8Var.e(!z10 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
        }
        z10 = z11;
        j8Var.e(!z10 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final j8 j8Var = new j8(context, 1);
        if (rl0Var instanceof g61) {
            final g61 g61Var = (g61) rl0Var;
            j8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.h8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    g61 g61Var2;
                    f2.e0 e0Var;
                    if (motionEvent.getAction() != 0 || (e0Var = (g61Var2 = g61.this).W2) == null) {
                        return false;
                    }
                    e0Var.r(g61Var2.T(j8Var));
                    return false;
                }
            });
        }
        return j8Var;
    }
}
