package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class jq0 implements org.telegram.ui.Cells.s5 {
    public final /* synthetic */ kq0 a;

    public jq0(kq0 kq0Var) {
        this.a = kq0Var;
    }

    public final void a() {
        xn xnVar;
        TLRPC.Chat chat;
        mq0 mq0Var = this.a.d;
        if (!mq0Var.F || (xnVar = mq0Var.R) == null || (chat = xnVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || mq0Var.T == 2) {
            return;
        }
        org.telegram.ui.Components.z4.u0(mq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (mq0Var.T == 1) {
            mq0Var.T = 2;
        }
    }

    @Override // org.telegram.ui.Cells.s5
    public final void b(org.telegram.ui.Cells.t5 t5Var) {
        boolean z4;
        int intValue = ((Integer) t5Var.getTag()).intValue();
        mq0 mq0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = mq0Var.G;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = mq0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z4 = !containsKey;
            if (!containsKey && mq0Var.E > 0 && mq0Var.b.size() >= mq0Var.E) {
                a();
                return;
            }
            if (mq0Var.e && !containsKey) {
                i10 = mq0Var.c.size();
            }
            t5Var.b(i10, z4, true);
            mq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(mq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) mq0Var.f.get(intValue);
            boolean containsKey2 = mq0Var.b.containsKey(searchImage.id);
            z4 = !containsKey2;
            if (!containsKey2 && mq0Var.E > 0 && mq0Var.b.size() >= mq0Var.E) {
                a();
                return;
            }
            if (mq0Var.e && !containsKey2) {
                i10 = mq0Var.c.size();
            }
            t5Var.b(i10, z4, true);
            mq0Var.Y(intValue, searchImage);
        }
        mq0Var.i0(z4 ? 1 : 2);
        mq0Var.p0.a();
    }
}
