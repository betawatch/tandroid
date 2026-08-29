package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h8 extends v41 {
    public static final /* synthetic */ int a = 0;

    static {
        v41.setup(new h8());
    }

    @Override // org.telegram.ui.Components.v41
    public final void attachedView(jl0 jl0Var, View view, w41 w41Var) {
        i8 i8Var = (i8) view;
        i8Var.b(w41Var.e, true);
        i8Var.c(jl0Var instanceof u51 ? ((u51) jl0Var).Y2 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.v41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        int i10 = k51Var.f;
        i8 i8Var = (i8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) w41Var.G;
        boolean z11 = false;
        i8Var.d(tL_messages_stickerSet, z10, false);
        i8Var.b(w41Var.e, false);
        i8Var.c(u51Var.Y2);
        i8Var.setOnOptionsClick(w41Var.D);
        i8Var.y.setOnClickListener(w41Var.E);
        i8Var.A.setOnClickListener(w41Var.E);
        i8Var.B.setOnClickListener(w41Var.E);
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
            i8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
        }
        z11 = z12;
        i8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
    }

    @Override // org.telegram.ui.Components.v41
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        final i8 i8Var = new i8(context, 1);
        if (jl0Var instanceof u51) {
            final u51 u51Var = (u51) jl0Var;
            i8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.g8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    u51 u51Var2;
                    f2.e0 e0Var;
                    if (motionEvent.getAction() != 0 || (e0Var = (u51Var2 = u51.this).V2) == null) {
                        return false;
                    }
                    e0Var.r(u51Var2.T(i8Var));
                    return false;
                }
            });
        }
        return i8Var;
    }
}
