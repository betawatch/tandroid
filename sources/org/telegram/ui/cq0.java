package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class cq0 implements org.telegram.ui.Cells.s5 {
    public final /* synthetic */ dq0 a;

    public cq0(dq0 dq0Var) {
        this.a = dq0Var;
    }

    public final void a() {
        xn xnVar;
        TLRPC.Chat chat;
        fq0 fq0Var = this.a.d;
        if (!fq0Var.F || (xnVar = fq0Var.R) == null || (chat = xnVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || fq0Var.T == 2) {
            return;
        }
        org.telegram.ui.Components.z4.u0(fq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (fq0Var.T == 1) {
            fq0Var.T = 2;
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public final void b(org.telegram.ui.Cells.t5 t5Var) {
        boolean z4;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        fq0 fq0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = fq0Var.G;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = fq0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z4 = !containsKey;
            if (!containsKey && fq0Var.E > 0 && fq0Var.b.size() >= fq0Var.E) {
                a();
                return;
            }
            if (fq0Var.e && !containsKey) {
                i10 = fq0Var.c.size();
            }
            t5Var.b(i10, z4, true);
            fq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(fq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) fq0Var.f.get(intValue);
            boolean containsKey2 = fq0Var.b.containsKey(searchImage.id);
            z4 = !containsKey2;
            if (!containsKey2 && fq0Var.E > 0 && fq0Var.b.size() >= fq0Var.E) {
                a();
                return;
            }
            if (fq0Var.e && !containsKey2) {
                i10 = fq0Var.c.size();
            }
            t5Var.b(i10, z4, true);
            fq0Var.Y(intValue, searchImage);
        }
        fq0Var.i0(z4 ? 1 : 2);
        fq0Var.p0.a();
    }
}
