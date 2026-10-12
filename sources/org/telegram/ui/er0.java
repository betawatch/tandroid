package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class er0 implements org.telegram.ui.Cells.s5 {
    public final /* synthetic */ fr0 a;

    public er0(fr0 fr0Var) {
        this.a = fr0Var;
    }

    public final void a() {
        fo foVar;
        TLRPC.Chat chat;
        hr0 hr0Var = this.a.d;
        if (!hr0Var.I || (foVar = hr0Var.U) == null || (chat = foVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || hr0Var.W == 2) {
            return;
        }
        org.telegram.ui.Components.g5.t0(hr0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (hr0Var.W == 1) {
            hr0Var.W = 2;
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public final void c(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        hr0 hr0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = hr0Var.J;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = hr0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && hr0Var.H > 0 && hr0Var.b.size() >= hr0Var.H) {
                a();
                return;
            }
            if (hr0Var.e && !containsKey) {
                i10 = hr0Var.c.size();
            }
            t5Var.b(i10, z10, true);
            hr0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(hr0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) hr0Var.f.get(intValue);
            boolean containsKey2 = hr0Var.b.containsKey(searchImage.id);
            z10 = !containsKey2;
            if (!containsKey2 && hr0Var.H > 0 && hr0Var.b.size() >= hr0Var.H) {
                a();
                return;
            }
            if (hr0Var.e && !containsKey2) {
                i10 = hr0Var.c.size();
            }
            t5Var.b(i10, z10, true);
            hr0Var.Y(intValue, searchImage);
        }
        hr0Var.i0(z10 ? 1 : 2);
        hr0Var.s0.a();
    }
}
