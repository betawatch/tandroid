package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class l8 extends g61 {
    public static final /* synthetic */ int a = 0;

    static {
        g61.setup(new l8());
    }

    @Override // org.telegram.ui.Components.g61
    public final void attachedView(zl0 zl0Var, View view, h61 h61Var) {
        m8 m8Var = (m8) view;
        boolean z10 = false;
        m8Var.b(h61Var != null && h61Var.e, true);
        if ((zl0Var instanceof e71) && ((e71) zl0Var).j3) {
            z10 = true;
        }
        m8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.g61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        int i10 = w61Var.f;
        m8 m8Var = (m8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) h61Var.G;
        boolean z11 = false;
        m8Var.d(tL_messages_stickerSet, z10, false);
        m8Var.b(h61Var.e, false);
        m8Var.c(e71Var.j3);
        m8Var.setOnOptionsClick(h61Var.D);
        m8Var.y.setOnClickListener(h61Var.E);
        m8Var.E.setOnClickListener(h61Var.E);
        m8Var.F.setOnClickListener(h61Var.E);
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

    @Override // org.telegram.ui.Components.g61
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final m8 m8Var = new m8(context, 1);
        if (zl0Var instanceof e71) {
            final e71 e71Var = (e71) zl0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.k8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    e71 e71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (e71Var2 = e71.this).g3) == null) {
                        return false;
                    }
                    yVar.r(e71Var2.T(m8Var));
                    return false;
                }
            });
        }
        return m8Var;
    }
}
