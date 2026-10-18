package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class iq0 implements org.telegram.ui.Cells.r5 {
    public final /* synthetic */ jq0 a;

    public iq0(jq0 jq0Var) {
        this.a = jq0Var;
    }

    public final void a() {
        sn snVar;
        TLRPC.Chat chat;
        lq0 lq0Var = this.a.d;
        if (!lq0Var.I || (snVar = lq0Var.U) == null || (chat = snVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || lq0Var.W == 2) {
            return;
        }
        org.telegram.ui.Components.f5.t0(lq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (lq0Var.W == 1) {
            lq0Var.W = 2;
        }
    }

    @Override // org.telegram.ui.Cells.r5
    public final void c(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        lq0 lq0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = lq0Var.J;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = lq0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && lq0Var.H > 0 && lq0Var.b.size() >= lq0Var.H) {
                a();
                return;
            }
            if (lq0Var.e && !containsKey) {
                i10 = lq0Var.c.size();
            }
            s5Var.b(i10, z10, true);
            lq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(lq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) lq0Var.f.get(intValue);
            boolean containsKey2 = lq0Var.b.containsKey(searchImage.id);
            z10 = !containsKey2;
            if (!containsKey2 && lq0Var.H > 0 && lq0Var.b.size() >= lq0Var.H) {
                a();
                return;
            }
            if (lq0Var.e && !containsKey2) {
                i10 = lq0Var.c.size();
            }
            s5Var.b(i10, z10, true);
            lq0Var.Y(intValue, searchImage);
        }
        lq0Var.i0(z10 ? 1 : 2);
        lq0Var.s0.a();
    }
}
