package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class l8 extends i51 {
    public static final /* synthetic */ int a = 0;

    static {
        i51.setup(new l8());
    }

    @Override // org.telegram.ui.Components.i51
    public final void attachedView(ml0 ml0Var, View view, j51 j51Var) {
        m8 m8Var = (m8) view;
        m8Var.b(j51Var.e, true);
        m8Var.c(ml0Var instanceof f61 ? ((f61) ml0Var).c3 : false);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.i51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        int i10 = x51Var.f;
        m8 m8Var = (m8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) j51Var.G;
        boolean z11 = false;
        m8Var.d(tL_messages_stickerSet, z10, false);
        m8Var.b(j51Var.e, false);
        m8Var.c(f61Var.c3);
        m8Var.setOnOptionsClick(j51Var.D);
        m8Var.y.setOnClickListener(j51Var.E);
        m8Var.E.setOnClickListener(j51Var.E);
        m8Var.F.setOnClickListener(j51Var.E);
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

    @Override // org.telegram.ui.Components.i51
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        final m8 m8Var = new m8(context, 1);
        if (ml0Var instanceof f61) {
            final f61 f61Var = (f61) ml0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.k8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    f61 f61Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (f61Var2 = f61.this).Z2) == null) {
                        return false;
                    }
                    yVar.r(f61Var2.U(m8Var));
                    return false;
                }
            });
        }
        return m8Var;
    }
}
