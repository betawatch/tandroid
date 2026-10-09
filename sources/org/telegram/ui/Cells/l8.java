package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l8 extends o61 {
    public static final /* synthetic */ int a = 0;

    static {
        o61.setup(new l8());
    }

    @Override // org.telegram.ui.Components.o61
    public final void attachedView(qm0 qm0Var, View view, p61 p61Var) {
        m8 m8Var = (m8) view;
        boolean z10 = false;
        m8Var.b(p61Var != null && p61Var.e, true);
        if ((qm0Var instanceof k71) && ((k71) qm0Var).a3) {
            z10 = true;
        }
        m8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.o61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        int i10 = c71Var.f;
        m8 m8Var = (m8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) p61Var.G;
        boolean z11 = false;
        m8Var.d(tL_messages_stickerSet, z10, false);
        m8Var.b(p61Var.e, false);
        m8Var.c(k71Var.a3);
        m8Var.setOnOptionsClick(p61Var.D);
        m8Var.y.setOnClickListener(p61Var.E);
        m8Var.E.setOnClickListener(p61Var.E);
        m8Var.F.setOnClickListener(p61Var.E);
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

    @Override // org.telegram.ui.Components.o61
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        final m8 m8Var = new m8(context, 1);
        if (qm0Var instanceof k71) {
            final k71 k71Var = (k71) qm0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.k8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    k71 k71Var2;
                    s4.z zVar;
                    if (motionEvent.getAction() != 0 || (zVar = (k71Var2 = k71.this).X2) == null) {
                        return false;
                    }
                    zVar.r(k71Var2.T(m8Var));
                    return false;
                }
            });
        }
        return m8Var;
    }
}
