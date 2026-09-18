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

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class k7 extends g7 {
    public final ArrayList f;
    public final /* synthetic */ t7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k7(t7 t7Var) {
        super(0);
        this.h = t7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.g7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        t7 t7Var = this.h;
        if (t7Var.f != null) {
            for (int i10 = 0; i10 < t7Var.f.b.size(); i10++) {
                s6 s6Var = (s6) t7Var.f.b.get(i10);
                n7 n7Var = new n7(1, true);
                n7Var.c = s6Var;
                arrayList2.add(n7Var);
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
        s6 s6Var = ((n7) arrayList.get(i10)).c;
        t7 t7Var = this.h;
        TLObject userOrChat = t7Var.d.getMessagesController().getUserOrChat(s6Var.a);
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
        org.telegram.ui.Components.p6 p6Var = y6Var.d;
        TextView textView = y6Var.c;
        textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
        if (formatFileSize != null) {
            p6Var.c(formatFileSize, false, true);
            p6Var.setVisibility(0);
        } else {
            p6Var.setVisibility(4);
        }
        y6Var.f = z11;
        y6Var.setWillNotDraw(!z11);
        y6Var.requestLayout();
        boolean contains = t7Var.f.l.contains(Long.valueOf(s6Var.a));
        org.telegram.ui.Components.np npVar = y6Var.n;
        if (npVar != null || contains) {
            if (npVar == null) {
                org.telegram.ui.Components.np npVar2 = new org.telegram.ui.Components.np(y6Var.getContext(), 21, y6Var.b);
                y6Var.n = npVar2;
                npVar2.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
                y6Var.n.setDrawUnchecked(false);
                y6Var.n.setDrawBackgroundAsArc(3);
                y6Var.addView(y6Var.n, w7.y5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            y6Var.n.a(contains, z10);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.gl0(i10 == 1 ? new y6(this.h.getContext(), null) : null);
    }
}
