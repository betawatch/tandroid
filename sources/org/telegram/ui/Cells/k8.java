package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class k8 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new k8());
    }

    @Override // org.telegram.ui.Components.e61
    public final void attachedView(im0 im0Var, View view, f61 f61Var) {
        l8 l8Var = (l8) view;
        boolean z10 = false;
        l8Var.b(f61Var != null && f61Var.e, true);
        if ((im0Var instanceof a71) && ((a71) im0Var).a3) {
            z10 = true;
        }
        l8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.e61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        int i10 = s61Var.f;
        l8 l8Var = (l8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) f61Var.G;
        boolean z11 = false;
        l8Var.d(tL_messages_stickerSet, z10, false);
        l8Var.b(f61Var.e, false);
        l8Var.c(a71Var.a3);
        l8Var.setOnOptionsClick(f61Var.D);
        l8Var.y.setOnClickListener(f61Var.E);
        l8Var.E.setOnClickListener(f61Var.E);
        l8Var.F.setOnClickListener(f61Var.E);
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

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final l8 l8Var = new l8(context, 1);
        if (im0Var instanceof a71) {
            final a71 a71Var = (a71) im0Var;
            l8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.j8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    a71 a71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (a71Var2 = a71.this).X2) == null) {
                        return false;
                    }
                    yVar.r(a71Var2.T(l8Var));
                    return false;
                }
            });
        }
        return l8Var;
    }
}
