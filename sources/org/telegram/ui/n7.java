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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class n7 extends j7 {
    public final ArrayList f;
    public final /* synthetic */ w7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(w7 w7Var) {
        super(0);
        this.h = w7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // org.telegram.ui.j7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        w7 w7Var = this.h;
        if (w7Var.f != null) {
            for (int i10 = 0; i10 < w7Var.f.b.size(); i10++) {
                w6 w6Var = (w6) w7Var.f.b.get(i10);
                q7 q7Var = new q7(1, true);
                q7Var.c = w6Var;
                arrayList2.add(q7Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        String dialogPhotoTitle;
        if (b1Var.f != 1) {
            return;
        }
        c7 c7Var = (c7) b1Var.a;
        ArrayList arrayList = this.e;
        w6 w6Var = ((q7) arrayList.get(i10)).c;
        w7 w7Var = this.h;
        TLObject userOrChat = w7Var.d.getMessagesController().getUserOrChat(w6Var.a);
        w6 w6Var2 = c7Var.a;
        boolean z10 = w6Var2 != null && w6Var2.a == w6Var.a;
        if (w6Var.a == Long.MAX_VALUE) {
            dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
            c7Var.getImageView().getAvatarDrawable().g(14);
            c7Var.getImageView().e(null, c7Var.getImageView().getAvatarDrawable());
        } else {
            dialogPhotoTitle = DialogObject.setDialogPhotoTitle(c7Var.getImageView(), userOrChat);
        }
        c7Var.a = w6Var;
        c7Var.getImageView().setRoundRadius(AndroidUtilities.dp(((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) ? 12.0f : 19.0f));
        String formatFileSize = AndroidUtilities.formatFileSize(w6Var.c);
        boolean z11 = i10 < arrayList.size() - 1;
        org.telegram.ui.Components.s6 s6Var = c7Var.d;
        TextView textView = c7Var.c;
        textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
        if (formatFileSize != null) {
            s6Var.c(formatFileSize, false, true);
            s6Var.setVisibility(0);
        } else {
            s6Var.setVisibility(4);
        }
        c7Var.f = z11;
        c7Var.setWillNotDraw(!z11);
        c7Var.requestLayout();
        boolean contains = w7Var.f.l.contains(Long.valueOf(w6Var.a));
        org.telegram.ui.Components.aq aqVar = c7Var.n;
        if (aqVar != null || contains) {
            if (aqVar == null) {
                org.telegram.ui.Components.aq aqVar2 = new org.telegram.ui.Components.aq(c7Var.getContext(), 21, c7Var.b);
                c7Var.n = aqVar2;
                aqVar2.b(-1, org.telegram.ui.ActionBar.g6.d6, org.telegram.ui.ActionBar.g6.k7);
                c7Var.n.setDrawUnchecked(false);
                c7Var.n.setDrawBackgroundAsArc(3);
                c7Var.addView(c7Var.n, w7.z5.a(24.0f, 38.0f, 25.0f, 38.0f, 0.0f, 24, (LocaleController.isRTL ? 5 : 3) | 48));
            }
            c7Var.n.a(contains, z10);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        c7 c7Var = null;
        if (i10 == 1) {
            c7 c7Var2 = new c7(this.h.getContext(), null);
            c7Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
            c7Var = c7Var2;
        }
        return new org.telegram.ui.Components.wl0(c7Var);
    }
}
