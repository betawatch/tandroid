package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class l8 extends g51 {
    public static final /* synthetic */ int a = 0;

    static {
        g51.setup(new l8());
    }

    @Override // org.telegram.ui.Components.g51
    public final void attachedView(ll0 ll0Var, View view, h51 h51Var) {
        m8 m8Var = (m8) view;
        m8Var.b(h51Var.e, true);
        m8Var.c(ll0Var instanceof d61 ? ((d61) ll0Var).c3 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.g51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        int i10 = v51Var.f;
        m8 m8Var = (m8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) h51Var.G;
        boolean z11 = false;
        m8Var.d(tL_messages_stickerSet, z10, false);
        m8Var.b(h51Var.e, false);
        m8Var.c(d61Var.c3);
        m8Var.setOnOptionsClick(h51Var.D);
        m8Var.y.setOnClickListener(h51Var.E);
        m8Var.E.setOnClickListener(h51Var.E);
        m8Var.F.setOnClickListener(h51Var.E);
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

    @Override // org.telegram.ui.Components.g51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final m8 m8Var = new m8(context, 1);
        if (ll0Var instanceof d61) {
            final d61 d61Var = (d61) ll0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.k8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    d61 d61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (d61Var2 = d61.this).Z2) == null) {
                        return false;
                    }
                    yVar.r(d61Var2.T(m8Var));
                    return false;
                }
            });
        }
        return m8Var;
    }
}
