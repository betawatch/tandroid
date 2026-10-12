package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class l8 extends k61 {
    public static final /* synthetic */ int a = 0;

    static {
        k61.setup(new l8());
    }

    @Override // org.telegram.ui.Components.k61
    public final void attachedView(mm0 mm0Var, View view, l61 l61Var) {
        m8 m8Var = (m8) view;
        boolean z10 = false;
        m8Var.b(l61Var != null && l61Var.e, true);
        if ((mm0Var instanceof h71) && ((h71) mm0Var).a3) {
            z10 = true;
        }
        m8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.k61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        int i10 = z61Var.f;
        m8 m8Var = (m8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) l61Var.G;
        boolean z11 = false;
        m8Var.d(tL_messages_stickerSet, z10, false);
        m8Var.b(l61Var.e, false);
        m8Var.c(h71Var.a3);
        m8Var.setOnOptionsClick(l61Var.D);
        m8Var.y.setOnClickListener(l61Var.E);
        m8Var.E.setOnClickListener(l61Var.E);
        m8Var.F.setOnClickListener(l61Var.E);
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

    @Override // org.telegram.ui.Components.k61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        final m8 m8Var = new m8(context, 1);
        if (mm0Var instanceof h71) {
            final h71 h71Var = (h71) mm0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.k8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    h71 h71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (h71Var2 = h71.this).X2) == null) {
                        return false;
                    }
                    yVar.r(h71Var2.T(m8Var));
                    return false;
                }
            });
        }
        return m8Var;
    }
}
