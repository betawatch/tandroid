package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class o8 extends t61 {
    public static final /* synthetic */ int a = 0;

    static {
        t61.setup(new o8());
    }

    @Override // org.telegram.ui.Components.t61
    public final void attachedView(nm0 nm0Var, View view, u61 u61Var) {
        p8 p8Var = (p8) view;
        boolean z10 = false;
        p8Var.b(u61Var != null && u61Var.e, true);
        if ((nm0Var instanceof s71) && ((s71) nm0Var).k3) {
            z10 = true;
        }
        p8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.t61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        int i10 = k71Var.f;
        p8 p8Var = (p8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) u61Var.G;
        boolean z11 = false;
        p8Var.d(tL_messages_stickerSet, z10, false);
        p8Var.b(u61Var.e, false);
        p8Var.c(s71Var.k3);
        p8Var.setOnOptionsClick(u61Var.D);
        p8Var.y.setOnClickListener(u61Var.E);
        p8Var.E.setOnClickListener(u61Var.E);
        p8Var.F.setOnClickListener(u61Var.E);
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
            p8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
        }
        z11 = z12;
        p8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
    }

    @Override // org.telegram.ui.Components.t61
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        final p8 p8Var = new p8(context, 1);
        if (nm0Var instanceof s71) {
            final s71 s71Var = (s71) nm0Var;
            p8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.n8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    s71 s71Var2;
                    s4.z zVar;
                    if (motionEvent.getAction() != 0 || (zVar = (s71Var2 = s71.this).h3) == null) {
                        return false;
                    }
                    zVar.t(s71Var2.T(p8Var));
                    return false;
                }
            });
        }
        return p8Var;
    }
}
