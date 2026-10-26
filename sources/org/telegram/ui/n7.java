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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class n7 extends j7 {
    public final ArrayList f;
    public final /* synthetic */ x7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(x7 x7Var) {
        super(0);
        this.h = x7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // org.telegram.ui.j7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        x7 x7Var = this.h;
        if (x7Var.h != null) {
            for (int i10 = 0; i10 < x7Var.h.b.size(); i10++) {
                w6 w6Var = (w6) x7Var.h.b.get(i10);
                q7 q7Var = new q7(1, true);
                q7Var.c = w6Var;
                arrayList2.add(q7Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        String dialogPhotoTitle;
        if (e1Var.f != 1) {
            return;
        }
        b7 b7Var = (b7) e1Var.a;
        ArrayList arrayList = this.e;
        w6 w6Var = ((q7) arrayList.get(i10)).c;
        x7 x7Var = this.h;
        TLObject userOrChat = x7Var.e.getMessagesController().getUserOrChat(w6Var.a);
        w6 w6Var2 = b7Var.a;
        boolean z10 = w6Var2 != null && w6Var2.a == w6Var.a;
        if (w6Var.a == Long.MAX_VALUE) {
            dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
            b7Var.getImageView().getAvatarDrawable().g(14);
            b7Var.getImageView().f(null, b7Var.getImageView().getAvatarDrawable());
        } else {
            dialogPhotoTitle = DialogObject.setDialogPhotoTitle(b7Var.getImageView(), userOrChat);
        }
        b7Var.a = w6Var;
        b7Var.getImageView().setRoundRadius(AndroidUtilities.dp(((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) ? 12.0f : 19.0f));
        String formatFileSize = AndroidUtilities.formatFileSize(w6Var.c);
        boolean z11 = i10 < arrayList.size() - 1;
        org.telegram.ui.Components.s6 s6Var = b7Var.d;
        TextView textView = b7Var.c;
        textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
        if (formatFileSize != null) {
            s6Var.c(formatFileSize, false, true);
            s6Var.setVisibility(0);
        } else {
            s6Var.setVisibility(4);
        }
        b7Var.f = z11;
        b7Var.setWillNotDraw(!z11);
        b7Var.requestLayout();
        boolean contains = x7Var.h.l.contains(Long.valueOf(w6Var.a));
        org.telegram.ui.Components.zp zpVar = b7Var.n;
        if (zpVar != null || contains) {
            if (zpVar == null) {
                org.telegram.ui.Components.zp zpVar2 = new org.telegram.ui.Components.zp(b7Var.getContext(), 21, b7Var.b);
                b7Var.n = zpVar2;
                zpVar2.b(-1, org.telegram.ui.ActionBar.y6.d6, org.telegram.ui.ActionBar.y6.k7);
                b7Var.n.setDrawUnchecked(false);
                b7Var.n.setDrawBackgroundAsArc(3);
                b7Var.addView(b7Var.n, org.telegram.ui.Components.gb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            b7Var.n.a(contains, z10);
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.vl0(i10 == 1 ? new b7(this.h.getContext(), null) : null);
    }
}
