package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cr0 implements org.telegram.ui.Cells.s5 {
    public final /* synthetic */ dr0 a;

    public cr0(dr0 dr0Var) {
        this.a = dr0Var;
    }

    public final void a() {
        fo foVar;
        TLRPC.Chat chat;
        fr0 fr0Var = this.a.d;
        if (!fr0Var.I || (foVar = fr0Var.U) == null || (chat = foVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || fr0Var.W == 2) {
            return;
        }
        org.telegram.ui.Components.g5.t0(fr0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (fr0Var.W == 1) {
            fr0Var.W = 2;
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public final void c(org.telegram.ui.Cells.t5 t5Var) {
        boolean z10;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        fr0 fr0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = fr0Var.J;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = fr0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && fr0Var.H > 0 && fr0Var.b.size() >= fr0Var.H) {
                a();
                return;
            }
            if (fr0Var.e && !containsKey) {
                i10 = fr0Var.c.size();
            }
            t5Var.b(i10, z10, true);
            fr0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(fr0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) fr0Var.f.get(intValue);
            boolean containsKey2 = fr0Var.b.containsKey(searchImage.id);
            z10 = !containsKey2;
            if (!containsKey2 && fr0Var.H > 0 && fr0Var.b.size() >= fr0Var.H) {
                a();
                return;
            }
            if (fr0Var.e && !containsKey2) {
                i10 = fr0Var.c.size();
            }
            t5Var.b(i10, z10, true);
            fr0Var.Y(intValue, searchImage);
        }
        fr0Var.i0(z10 ? 1 : 2);
        fr0Var.s0.a();
    }
}
