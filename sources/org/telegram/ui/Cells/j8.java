package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class j8 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new j8());
    }

    @Override // org.telegram.ui.Components.i51
    public final void attachedView(tl0 tl0Var, View view, j51 j51Var) {
        k8 k8Var = (k8) view;
        k8Var.b(j51Var.e, true);
        k8Var.c(tl0Var instanceof i61 ? ((i61) tl0Var).Z2 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.i51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        int i10 = x51Var.f;
        k8 k8Var = (k8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) j51Var.G;
        boolean z10 = false;
        k8Var.d(tL_messages_stickerSet, z4, false);
        k8Var.b(j51Var.e, false);
        k8Var.c(i61Var.Z2);
        k8Var.setOnOptionsClick(j51Var.D);
        k8Var.y.setOnClickListener(j51Var.E);
        k8Var.B.setOnClickListener(j51Var.E);
        k8Var.C.setOnClickListener(j51Var.E);
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

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        final k8 k8Var = new k8(context, 1);
        if (tl0Var instanceof i61) {
            final i61 i61Var = (i61) tl0Var;
            k8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.i8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    i61 i61Var2;
                    f2.f0 f0Var;
                    if (motionEvent.getAction() != 0 || (f0Var = (i61Var2 = i61.this).W2) == null) {
                        return false;
                    }
                    f0Var.r(i61Var2.T(k8Var));
                    return false;
                }
            });
        }
        return k8Var;
    }
}
