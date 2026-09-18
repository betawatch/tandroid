package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class l8 extends w51 {
    public static final /* synthetic */ int a = 0;

    static {
        w51.setup(new l8());
    }

    @Override // org.telegram.ui.Components.w51
    public final void attachedView(wl0 wl0Var, View view, x51 x51Var) {
        m8 m8Var = (m8) view;
        m8Var.b(x51Var.e, true);
        m8Var.c(wl0Var instanceof t61 ? ((t61) wl0Var).c3 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.w51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        int i10 = l61Var.f;
        m8 m8Var = (m8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) x51Var.G;
        boolean z11 = false;
        m8Var.d(tL_messages_stickerSet, z10, false);
        m8Var.b(x51Var.e, false);
        m8Var.c(t61Var.c3);
        m8Var.setOnOptionsClick(x51Var.D);
        m8Var.y.setOnClickListener(x51Var.E);
        m8Var.E.setOnClickListener(x51Var.E);
        m8Var.F.setOnClickListener(x51Var.E);
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
            m8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
        }
        z11 = z12;
        m8Var.e(!z11 ? (!isStickerPackInstalled || tL_messages_stickerSet.set.official) ? 1 : 2 : isStickerPackInstalled ? 4 : 3);
    }

    @Override // org.telegram.ui.Components.w51
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        final m8 m8Var = new m8(context, 1);
        if (wl0Var instanceof t61) {
            final t61 t61Var = (t61) wl0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.k8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    t61 t61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (t61Var2 = t61.this).Z2) == null) {
                        return false;
                    }
                    yVar.r(t61Var2.U(m8Var));
                    return false;
                }
            });
        }
        return m8Var;
    }
}
