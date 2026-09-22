package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class l8 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new l8());
    }

    @Override // org.telegram.ui.Components.h51
    public final void attachedView(ll0 ll0Var, View view, i51 i51Var) {
        m8 m8Var = (m8) view;
        m8Var.b(i51Var.e, true);
        m8Var.c(ll0Var instanceof e61 ? ((e61) ll0Var).c3 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.h51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, i51 i51Var, boolean z10, w51 w51Var, e61 e61Var) {
        int i10 = w51Var.f;
        m8 m8Var = (m8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) i51Var.G;
        boolean z11 = false;
        m8Var.d(tL_messages_stickerSet, z10, false);
        m8Var.b(i51Var.e, false);
        m8Var.c(e61Var.c3);
        m8Var.setOnOptionsClick(i51Var.D);
        m8Var.y.setOnClickListener(i51Var.E);
        m8Var.E.setOnClickListener(i51Var.E);
        m8Var.F.setOnClickListener(i51Var.E);
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

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        final m8 m8Var = new m8(context, 1);
        if (ll0Var instanceof e61) {
            final e61 e61Var = (e61) ll0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.k8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    e61 e61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (e61Var2 = e61.this).Z2) == null) {
                        return false;
                    }
                    yVar.r(e61Var2.T(m8Var));
                    return false;
                }
            });
        }
        return m8Var;
    }
}
