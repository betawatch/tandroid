package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class m8 extends u51 {
    public static final /* synthetic */ int a = 0;

    static {
        u51.setup(new m8());
    }

    @Override // org.telegram.ui.Components.u51
    public final void attachedView(vl0 vl0Var, View view, v51 v51Var) {
        n8 n8Var = (n8) view;
        n8Var.b(v51Var.e, true);
        n8Var.c(vl0Var instanceof r61 ? ((r61) vl0Var).c3 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.u51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        int i10 = j61Var.f;
        n8 n8Var = (n8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) v51Var.G;
        boolean z11 = false;
        n8Var.d(tL_messages_stickerSet, z10, false);
        n8Var.b(v51Var.e, false);
        n8Var.c(r61Var.c3);
        n8Var.setOnOptionsClick(v51Var.D);
        n8Var.y.setOnClickListener(v51Var.E);
        n8Var.E.setOnClickListener(v51Var.E);
        n8Var.F.setOnClickListener(v51Var.E);
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

    @Override // org.telegram.ui.Components.u51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final n8 n8Var = new n8(context, 1);
        if (vl0Var instanceof r61) {
            final r61 r61Var = (r61) vl0Var;
            n8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.l8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    r61 r61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (r61Var2 = r61.this).Z2) == null) {
                        return false;
                    }
                    yVar.r(r61Var2.T(n8Var));
                    return false;
                }
            });
        }
        return n8Var;
    }
}
