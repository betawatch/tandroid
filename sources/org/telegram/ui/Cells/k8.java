package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class k8 extends f61 {
    public static final /* synthetic */ int a = 0;

    static {
        f61.setup(new k8());
    }

    @Override // org.telegram.ui.Components.f61
    public final void attachedView(im0 im0Var, View view, g61 g61Var) {
        l8 l8Var = (l8) view;
        boolean z10 = false;
        l8Var.b(g61Var != null && g61Var.e, true);
        if ((im0Var instanceof b71) && ((b71) im0Var).a3) {
            z10 = true;
        }
        l8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.f61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        int i10 = t61Var.f;
        l8 l8Var = (l8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) g61Var.G;
        boolean z11 = false;
        l8Var.d(tL_messages_stickerSet, z10, false);
        l8Var.b(g61Var.e, false);
        l8Var.c(b71Var.a3);
        l8Var.setOnOptionsClick(g61Var.D);
        l8Var.y.setOnClickListener(g61Var.E);
        l8Var.E.setOnClickListener(g61Var.E);
        l8Var.F.setOnClickListener(g61Var.E);
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

    @Override // org.telegram.ui.Components.f61
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        final l8 l8Var = new l8(context, 1);
        if (im0Var instanceof b71) {
            final b71 b71Var = (b71) im0Var;
            l8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.j8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    b71 b71Var2;
                    s4.y yVar;
                    if (motionEvent.getAction() != 0 || (yVar = (b71Var2 = b71.this).X2) == null) {
                        return false;
                    }
                    yVar.r(b71Var2.T(l8Var));
                    return false;
                }
            });
        }
        return l8Var;
    }
}
