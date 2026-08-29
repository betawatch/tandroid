package org.telegram.ui;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class h7 extends d7 {
    public final ArrayList f;
    public final /* synthetic */ q7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(q7 q7Var) {
        super(0);
        this.h = q7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // org.telegram.ui.d7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        q7 q7Var = this.h;
        if (q7Var.f != null) {
            for (int i10 = 0; i10 < q7Var.f.b.size(); i10++) {
                q6 q6Var = (q6) q7Var.f.b.get(i10);
                k7 k7Var = new k7(1, true);
                k7Var.c = q6Var;
                arrayList2.add(k7Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        String dialogPhotoTitle;
        if (n1Var.f != 1) {
            return;
        }
        w6 w6Var = (w6) n1Var.a;
        ArrayList arrayList = this.e;
        q6 q6Var = ((k7) arrayList.get(i10)).c;
        q7 q7Var = this.h;
        TLObject userOrChat = q7Var.d.getMessagesController().getUserOrChat(q6Var.a);
        q6 q6Var2 = w6Var.a;
        boolean z10 = q6Var2 != null && q6Var2.a == q6Var.a;
        if (q6Var.a == Long.MAX_VALUE) {
            dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
            w6Var.getImageView().getAvatarDrawable().g(14);
            w6Var.getImageView().e(null, w6Var.getImageView().getAvatarDrawable());
        } else {
            dialogPhotoTitle = DialogObject.setDialogPhotoTitle(w6Var.getImageView(), userOrChat);
        }
        w6Var.a = q6Var;
        w6Var.getImageView().setRoundRadius(AndroidUtilities.dp(((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) ? 12.0f : 19.0f));
        String formatFileSize = AndroidUtilities.formatFileSize(q6Var.c);
        boolean z11 = i10 < arrayList.size() - 1;
        org.telegram.ui.Components.o6 o6Var = w6Var.d;
        TextView textView = w6Var.c;
        textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
        if (formatFileSize != null) {
            o6Var.c(formatFileSize, false, true);
            o6Var.setVisibility(0);
        } else {
            o6Var.setVisibility(4);
        }
        w6Var.f = z11;
        w6Var.setWillNotDraw(!z11);
        w6Var.requestLayout();
        boolean contains = q7Var.f.l.contains(Long.valueOf(q6Var.a));
        org.telegram.ui.Components.hp hpVar = w6Var.n;
        if (hpVar != null || contains) {
            if (hpVar == null) {
                org.telegram.ui.Components.hp hpVar2 = new org.telegram.ui.Components.hp(w6Var.getContext(), 21, w6Var.b);
                w6Var.n = hpVar2;
                hpVar2.b(-1, org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.k7);
                w6Var.n.setDrawUnchecked(false);
                w6Var.n.setDrawBackgroundAsArc(3);
                w6Var.addView(w6Var.n, i7.f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            w6Var.n.a(contains, z10);
        }
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        w6 w6Var = null;
        if (i10 == 1) {
            w6 w6Var2 = new w6(this.h.getContext(), null);
            w6Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false));
            w6Var = w6Var2;
        }
        return new org.telegram.ui.Components.vk0(w6Var);
    }
}
