package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class j8 extends k41 {
    public static final /* synthetic */ int a = 0;

    static {
        k41.setup(new j8());
    }

    @Override // org.telegram.ui.Components.k41
    public final void attachedView(wk0 wk0Var, View view, l41 l41Var) {
        k8 k8Var = (k8) view;
        k8Var.b(l41Var.e, true);
        k8Var.c(wk0Var instanceof i51 ? ((i51) wk0Var).Y2 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.k41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        int i9 = z41Var.f;
        k8 k8Var = (k8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) l41Var.G;
        boolean z11 = false;
        k8Var.d(tL_messages_stickerSet, z10, false);
        k8Var.b(l41Var.e, false);
        k8Var.c(i51Var.Y2);
        k8Var.setOnOptionsClick(l41Var.D);
        k8Var.y.setOnClickListener(l41Var.E);
        k8Var.A.setOnClickListener(l41Var.E);
        k8Var.B.setOnClickListener(l41Var.E);
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        if (stickerSet == null || !stickerSet.emojis) {
            return;
        }
        boolean isStickerPackInstalled = MediaDataController.getInstance(i9).isStickerPackInstalled(tL_messages_stickerSet.set.id);
        boolean isPremium = UserConfig.getInstance(i9).isPremium();
        boolean z12 = !isPremium;
        if (!isPremium) {
            for (int i10 = 0; i10 < tL_messages_stickerSet.documents.size(); i10++) {
                if (MessageObject.isFreeEmoji(tL_messages_stickerSet.documents.get(i10))) {
                }
            }
            k8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
        }
        z11 = z12;
        k8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
    }

    @Override // org.telegram.ui.Components.k41
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        final k8 k8Var = new k8(context, 1);
        if (wk0Var instanceof i51) {
            final i51 i51Var = (i51) wk0Var;
            k8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.i8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    i51 i51Var2;
                    f2.h0 h0Var;
                    if (motionEvent.getAction() != 0 || (h0Var = (i51Var2 = i51.this).V2) == null) {
                        return false;
                    }
                    h0Var.r(i51Var2.T(k8Var));
                    return false;
                }
            });
        }
        return k8Var;
    }
}
