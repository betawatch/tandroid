package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class m8 extends v51 {
    public static final /* synthetic */ int a = 0;

    static {
        v51.setup(new m8());
    }

    @Override // org.telegram.ui.Components.v51
    public final void attachedView(vl0 vl0Var, View view, w51 w51Var) {
        n8 n8Var = (n8) view;
        n8Var.b(w51Var.e, true);
        n8Var.c(vl0Var instanceof s61 ? ((s61) vl0Var).c3 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.v51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        int i10 = k61Var.f;
        n8 n8Var = (n8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) w51Var.G;
        boolean z11 = false;
        n8Var.d(tL_messages_stickerSet, z10, false);
        n8Var.b(w51Var.e, false);
        n8Var.c(s61Var.c3);
        n8Var.setOnOptionsClick(w51Var.D);
        n8Var.y.setOnClickListener(w51Var.E);
        n8Var.E.setOnClickListener(w51Var.E);
        n8Var.F.setOnClickListener(w51Var.E);
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

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final n8 n8Var = new n8(context, 1);
        if (vl0Var instanceof s61) {
            final s61 s61Var = (s61) vl0Var;
            n8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.l8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    s61 s61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (s61Var2 = s61.this).Z2) == null) {
                        return false;
                    }
                    yVar.r(s61Var2.U(n8Var));
                    return false;
                }
            });
        }
        return n8Var;
    }
}
