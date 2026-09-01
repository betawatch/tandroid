package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class eq0 implements org.telegram.ui.Cells.s5 {
    public final /* synthetic */ fq0 a;

    public eq0(fq0 fq0Var) {
        this.a = fq0Var;
    }

    public final void a() {
        xn xnVar;
        TLRPC.Chat chat;
        hq0 hq0Var = this.a.d;
        if (!hq0Var.F || (xnVar = hq0Var.R) == null || (chat = xnVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || hq0Var.T == 2) {
            return;
        }
        org.telegram.ui.Components.z4.u0(hq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (hq0Var.T == 1) {
            hq0Var.T = 2;
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public final void b(org.telegram.ui.Cells.t5 t5Var) {
        boolean z4;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        hq0 hq0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = hq0Var.G;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = hq0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z4 = !containsKey;
            if (!containsKey && hq0Var.E > 0 && hq0Var.b.size() >= hq0Var.E) {
                a();
                return;
            }
            if (hq0Var.e && !containsKey) {
                i10 = hq0Var.c.size();
            }
            t5Var.b(i10, z4, true);
            hq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(hq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) hq0Var.f.get(intValue);
            boolean containsKey2 = hq0Var.b.containsKey(searchImage.id);
            z4 = !containsKey2;
            if (!containsKey2 && hq0Var.E > 0 && hq0Var.b.size() >= hq0Var.E) {
                a();
                return;
            }
            if (hq0Var.e && !containsKey2) {
                i10 = hq0Var.c.size();
            }
            t5Var.b(i10, z4, true);
            hq0Var.Y(intValue, searchImage);
        }
        hq0Var.i0(z4 ? 1 : 2);
        hq0Var.p0.a();
    }
}
