package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class k8 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new k8());
    }

    @Override // org.telegram.ui.Components.g61
    public final void attachedView(jm0 jm0Var, View view, h61 h61Var) {
        l8 l8Var = (l8) view;
        boolean z10 = false;
        l8Var.b(h61Var != null && h61Var.e, true);
        if ((jm0Var instanceof c71) && ((c71) jm0Var).a3) {
            z10 = true;
        }
        l8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.g61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        int i10 = u61Var.f;
        l8 l8Var = (l8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) h61Var.G;
        boolean z11 = false;
        l8Var.d(tL_messages_stickerSet, z10, false);
        l8Var.b(h61Var.e, false);
        l8Var.c(c71Var.a3);
        l8Var.setOnOptionsClick(h61Var.D);
        l8Var.y.setOnClickListener(h61Var.E);
        l8Var.E.setOnClickListener(h61Var.E);
        l8Var.F.setOnClickListener(h61Var.E);
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

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final l8 l8Var = new l8(context, 1);
        if (jm0Var instanceof c71) {
            final c71 c71Var = (c71) jm0Var;
            l8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.j8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    c71 c71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (c71Var2 = c71.this).X2) == null) {
                        return false;
                    }
                    yVar.r(c71Var2.T(l8Var));
                    return false;
                }
            });
        }
        return l8Var;
    }
}
