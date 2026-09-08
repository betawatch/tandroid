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

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class j7 extends f7 {
    public final ArrayList f;
    public final /* synthetic */ s7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(s7 s7Var) {
        super(0);
        this.h = s7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.f7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        s7 s7Var = this.h;
        if (s7Var.f != null) {
            for (int i10 = 0; i10 < s7Var.f.b.size(); i10++) {
                s6 s6Var = (s6) s7Var.f.b.get(i10);
                m7 m7Var = new m7(1, true);
                m7Var.c = s6Var;
                arrayList2.add(m7Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        String dialogPhotoTitle;
        if (c1Var.f != 1) {
            return;
        }
        y6 y6Var = (y6) c1Var.a;
        ArrayList arrayList = this.e;
        s6 s6Var = ((m7) arrayList.get(i10)).c;
        s7 s7Var = this.h;
        TLObject userOrChat = s7Var.d.getMessagesController().getUserOrChat(s6Var.a);
        s6 s6Var2 = y6Var.a;
        boolean z10 = s6Var2 != null && s6Var2.a == s6Var.a;
        if (s6Var.a == Long.MAX_VALUE) {
            dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
            y6Var.getImageView().getAvatarDrawable().g(14);
            y6Var.getImageView().e(null, y6Var.getImageView().getAvatarDrawable());
        } else {
            dialogPhotoTitle = DialogObject.setDialogPhotoTitle(y6Var.getImageView(), userOrChat);
        }
        y6Var.a = s6Var;
        y6Var.getImageView().setRoundRadius(AndroidUtilities.dp(((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) ? 12.0f : 19.0f));
        String formatFileSize = AndroidUtilities.formatFileSize(s6Var.c);
        boolean z11 = i10 < arrayList.size() - 1;
        org.telegram.ui.Components.q6 q6Var = y6Var.d;
        TextView textView = y6Var.c;
        textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
        if (formatFileSize != null) {
            q6Var.c(formatFileSize, false, true);
            q6Var.setVisibility(0);
        } else {
            q6Var.setVisibility(4);
        }
        y6Var.f = z11;
        y6Var.setWillNotDraw(!z11);
        y6Var.requestLayout();
        boolean contains = s7Var.f.l.contains(Long.valueOf(s6Var.a));
        org.telegram.ui.Components.mp mpVar = y6Var.n;
        if (mpVar != null || contains) {
            if (mpVar == null) {
                org.telegram.ui.Components.mp mpVar2 = new org.telegram.ui.Components.mp(y6Var.getContext(), 21, y6Var.b);
                y6Var.n = mpVar2;
                mpVar2.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
                y6Var.n.setDrawUnchecked(false);
                y6Var.n.setDrawBackgroundAsArc(3);
                y6Var.addView(y6Var.n, w7.x5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            y6Var.n.a(contains, z10);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        y6 y6Var = null;
        if (i10 == 1) {
            y6 y6Var2 = new y6(this.h.getContext(), null);
            y6Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            y6Var = y6Var2;
        }
        return new org.telegram.ui.Components.vk0(y6Var);
    }
}
