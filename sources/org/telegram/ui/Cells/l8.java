package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class l8 extends l61 {
    public static final /* synthetic */ int a = 0;

    static {
        l61.setup(new l8());
    }

    @Override // org.telegram.ui.Components.l61
    public final void attachedView(mm0 mm0Var, View view, m61 m61Var) {
        m8 m8Var = (m8) view;
        boolean z10 = false;
        m8Var.b(m61Var != null && m61Var.e, true);
        if ((mm0Var instanceof i71) && ((i71) mm0Var).a3) {
            z10 = true;
        }
        m8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.l61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        int i10 = a71Var.f;
        m8 m8Var = (m8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) m61Var.G;
        boolean z11 = false;
        m8Var.d(tL_messages_stickerSet, z10, false);
        m8Var.b(m61Var.e, false);
        m8Var.c(i71Var.a3);
        m8Var.setOnOptionsClick(m61Var.D);
        m8Var.y.setOnClickListener(m61Var.E);
        m8Var.E.setOnClickListener(m61Var.E);
        m8Var.F.setOnClickListener(m61Var.E);
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

    @Override // org.telegram.ui.Components.l61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        final m8 m8Var = new m8(context, 1);
        if (mm0Var instanceof i71) {
            final i71 i71Var = (i71) mm0Var;
            m8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.k8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    i71 i71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (i71Var2 = i71.this).X2) == null) {
                        return false;
                    }
                    yVar.r(i71Var2.T(m8Var));
                    return false;
                }
            });
        }
        return m8Var;
    }
}
