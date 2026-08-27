package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class g8 extends m41 {
    public static final /* synthetic */ int a = 0;

    static {
        m41.setup(new g8());
    }

    @Override // org.telegram.ui.Components.m41
    public final void attachedView(zk0 zk0Var, View view, n41 n41Var) {
        h8 h8Var = (h8) view;
        h8Var.b(n41Var.e, true);
        h8Var.c(zk0Var instanceof k51 ? ((k51) zk0Var).Y2 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.m41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        int i10 = b51Var.f;
        h8 h8Var = (h8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) n41Var.G;
        boolean z11 = false;
        h8Var.d(tL_messages_stickerSet, z10, false);
        h8Var.b(n41Var.e, false);
        h8Var.c(k51Var.Y2);
        h8Var.setOnOptionsClick(n41Var.D);
        h8Var.y.setOnClickListener(n41Var.E);
        h8Var.A.setOnClickListener(n41Var.E);
        h8Var.B.setOnClickListener(n41Var.E);
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
            h8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
        }
        z11 = z12;
        h8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
    }

    @Override // org.telegram.ui.Components.m41
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        final h8 h8Var = new h8(context, 1);
        if (zk0Var instanceof k51) {
            final k51 k51Var = (k51) zk0Var;
            h8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.f8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    k51 k51Var2;
                    f2.f0 f0Var;
                    if (motionEvent.getAction() != 0 || (f0Var = (k51Var2 = k51.this).V2) == null) {
                        return false;
                    }
                    f0Var.r(k51Var2.T(h8Var));
                    return false;
                }
            });
        }
        return h8Var;
    }
}
