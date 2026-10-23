package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class jq0 implements org.telegram.ui.Cells.r5 {
    public final /* synthetic */ kq0 a;

    public jq0(kq0 kq0Var) {
        this.a = kq0Var;
    }

    public final void a() {
        sn snVar;
        TLRPC.Chat chat;
        mq0 mq0Var = this.a.d;
        if (!mq0Var.I || (snVar = mq0Var.U) == null || (chat = snVar.e) == null || ChatObject.hasAdminRights(chat) || !chat.slowmode_enabled || mq0Var.W == 2) {
            return;
        }
        org.telegram.ui.Components.f5.u0(mq0Var, LocaleController.getString(R.string.Slowmode), LocaleController.getString(R.string.SlowmodeSelectSendError), null);
        if (mq0Var.W == 1) {
            mq0Var.W = 2;
        }
    }

    @Override // org.telegram.ui.Cells.r5
    public final void b(org.telegram.ui.Cells.s5 s5Var) {
        boolean z10;
        int intValue = ((Integer) s5Var.getTag()).intValue();
        mq0 mq0Var = this.a.d;
        MediaController.AlbumEntry albumEntry = mq0Var.J;
        int i10 = -1;
        if (albumEntry != null) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(intValue);
            boolean containsKey = mq0Var.b.containsKey(Integer.valueOf(photoEntry.imageId));
            z10 = !containsKey;
            if (!containsKey && mq0Var.H > 0 && mq0Var.b.size() >= mq0Var.H) {
                a();
                return;
            }
            if (mq0Var.e && !containsKey) {
                i10 = mq0Var.c.size();
            }
            s5Var.b(i10, z10, true);
            mq0Var.Y(intValue, photoEntry);
        } else {
            AndroidUtilities.hideKeyboard(mq0Var.getParentActivity().getCurrentFocus());
            MediaController.SearchImage searchImage = (MediaController.SearchImage) mq0Var.f.get(intValue);
            boolean containsKey2 = mq0Var.b.containsKey(searchImage.id);
            z10 = !containsKey2;
            if (!containsKey2 && mq0Var.H > 0 && mq0Var.b.size() >= mq0Var.H) {
                a();
                return;
            }
            if (mq0Var.e && !containsKey2) {
                i10 = mq0Var.c.size();
            }
            s5Var.b(i10, z10, true);
            mq0Var.Y(intValue, searchImage);
        }
        mq0Var.i0(z10 ? 1 : 2);
        mq0Var.s0.a();
    }
}
