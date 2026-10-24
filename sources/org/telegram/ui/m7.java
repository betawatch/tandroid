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

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class m7 extends i7 {
    public final ArrayList f;
    public final /* synthetic */ v7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(v7 v7Var) {
        super(0);
        this.h = v7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override // org.telegram.ui.i7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        v7 v7Var = this.h;
        if (v7Var.h != null) {
            for (int i10 = 0; i10 < v7Var.h.b.size(); i10++) {
                v6 v6Var = (v6) v7Var.h.b.get(i10);
                p7 p7Var = new p7(1, true);
                p7Var.c = v6Var;
                arrayList2.add(p7Var);
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
        b7 b7Var = (b7) b1Var.a;
        ArrayList arrayList = this.e;
        v6 v6Var = ((p7) arrayList.get(i10)).c;
        v7 v7Var = this.h;
        TLObject userOrChat = v7Var.e.getMessagesController().getUserOrChat(v6Var.a);
        v6 v6Var2 = b7Var.a;
        boolean z10 = v6Var2 != null && v6Var2.a == v6Var.a;
        if (v6Var.a == Long.MAX_VALUE) {
            dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
            b7Var.getImageView().getAvatarDrawable().g(14);
            b7Var.getImageView().e(null, b7Var.getImageView().getAvatarDrawable());
        } else {
            dialogPhotoTitle = DialogObject.setDialogPhotoTitle(b7Var.getImageView(), userOrChat);
        }
        b7Var.a = v6Var;
        b7Var.getImageView().setRoundRadius(AndroidUtilities.dp(((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) ? 12.0f : 19.0f));
        String formatFileSize = AndroidUtilities.formatFileSize(v6Var.c);
        boolean z11 = i10 < arrayList.size() - 1;
        org.telegram.ui.Components.q6 q6Var = b7Var.d;
        TextView textView = b7Var.c;
        textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
        if (formatFileSize != null) {
            q6Var.c(formatFileSize, false, true);
            q6Var.setVisibility(0);
        } else {
            q6Var.setVisibility(4);
        }
        b7Var.f = z11;
        b7Var.setWillNotDraw(!z11);
        b7Var.requestLayout();
        boolean contains = v7Var.h.l.contains(Long.valueOf(v6Var.a));
        org.telegram.ui.Components.xp xpVar = b7Var.n;
        if (xpVar != null || contains) {
            if (xpVar == null) {
                org.telegram.ui.Components.xp xpVar2 = new org.telegram.ui.Components.xp(b7Var.getContext(), 21, b7Var.b);
                b7Var.n = xpVar2;
                xpVar2.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
                b7Var.n.setDrawUnchecked(false);
                b7Var.n.setDrawBackgroundAsArc(3);
                b7Var.addView(b7Var.n, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            b7Var.n.a(contains, z10);
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        b7 b7Var = null;
        if (i10 == 1) {
            b7 b7Var2 = new b7(this.h.getContext(), null);
            org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, b7Var2, null);
            b7Var = b7Var2;
        }
        return new org.telegram.ui.Components.wl0(b7Var);
    }
}
