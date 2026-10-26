package org.telegram.ui.Cells;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class o8 extends s61 {
    public static final /* synthetic */ int a = 0;

    static {
        s61.setup(new o8());
    }

    @Override // org.telegram.ui.Components.s61
    public final void attachedView(mm0 mm0Var, View view, t61 t61Var) {
        p8 p8Var = (p8) view;
        boolean z10 = false;
        p8Var.b(t61Var != null && t61Var.e, true);
        if ((mm0Var instanceof r71) && ((r71) mm0Var).k3) {
            z10 = true;
        }
        p8Var.c(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    @Override // org.telegram.ui.Components.s61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        int i10 = j71Var.f;
        p8 p8Var = (p8) view;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) t61Var.G;
        boolean z11 = false;
        p8Var.d(tL_messages_stickerSet, z10, false);
        p8Var.b(t61Var.e, false);
        p8Var.c(r71Var.k3);
        p8Var.setOnOptionsClick(t61Var.D);
        p8Var.y.setOnClickListener(t61Var.E);
        p8Var.E.setOnClickListener(t61Var.E);
        p8Var.F.setOnClickListener(t61Var.E);
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

    @Override // org.telegram.ui.Components.s61
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        final p8 p8Var = new p8(context, 1);
        if (mm0Var instanceof r71) {
            final r71 r71Var = (r71) mm0Var;
            p8Var.setOnReorderButtonTouchListener(new View.OnTouchListener() { // from class: org.telegram.ui.Cells.n8
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    r71 r71Var2;
                    s4.z zVar;
                    if (motionEvent.getAction() != 0 || (zVar = (r71Var2 = r71.this).h3) == null) {
                        return false;
                    }
                    zVar.t(r71Var2.T(p8Var));
                    return false;
                }
            });
        }
        return p8Var;
    }
}
