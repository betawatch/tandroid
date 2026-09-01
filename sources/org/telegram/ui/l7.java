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

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class l7 extends h7 {
    public final ArrayList f;
    public final /* synthetic */ u7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(u7 u7Var) {
        super(0);
        this.h = u7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.sl0
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override // org.telegram.ui.h7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        u7 u7Var = this.h;
        if (u7Var.f != null) {
            for (int i10 = 0; i10 < u7Var.f.b.size(); i10++) {
                u6 u6Var = (u6) u7Var.f.b.get(i10);
                o7 o7Var = new o7(1, true);
                o7Var.c = u6Var;
                arrayList2.add(o7Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        String dialogPhotoTitle;
        if (m1Var.f != 1) {
            return;
        }
        a7 a7Var = (a7) m1Var.a;
        ArrayList arrayList = this.e;
        u6 u6Var = ((o7) arrayList.get(i10)).c;
        u7 u7Var = this.h;
        TLObject userOrChat = u7Var.d.getMessagesController().getUserOrChat(u6Var.a);
        u6 u6Var2 = a7Var.a;
        boolean z4 = u6Var2 != null && u6Var2.a == u6Var.a;
        if (u6Var.a == Long.MAX_VALUE) {
            dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
            a7Var.getImageView().getAvatarDrawable().g(14);
            a7Var.getImageView().e(null, a7Var.getImageView().getAvatarDrawable());
        } else {
            dialogPhotoTitle = DialogObject.setDialogPhotoTitle(a7Var.getImageView(), userOrChat);
        }
        a7Var.a = u6Var;
        a7Var.getImageView().setRoundRadius(AndroidUtilities.dp(((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) ? 12.0f : 19.0f));
        String formatFileSize = AndroidUtilities.formatFileSize(u6Var.c);
        boolean z10 = i10 < arrayList.size() - 1;
        org.telegram.ui.Components.k6 k6Var = a7Var.d;
        TextView textView = a7Var.c;
        textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
        if (formatFileSize != null) {
            k6Var.c(formatFileSize, false, true);
            k6Var.setVisibility(0);
        } else {
            k6Var.setVisibility(4);
        }
        a7Var.f = z10;
        a7Var.setWillNotDraw(!z10);
        a7Var.requestLayout();
        boolean contains = u7Var.f.l.contains(Long.valueOf(u6Var.a));
        org.telegram.ui.Components.np npVar = a7Var.n;
        if (npVar != null || contains) {
            if (npVar == null) {
                org.telegram.ui.Components.np npVar2 = new org.telegram.ui.Components.np(a7Var.getContext(), 21, a7Var.b);
                a7Var.n = npVar2;
                npVar2.b(-1, org.telegram.ui.ActionBar.k6.d6, org.telegram.ui.ActionBar.k6.k7);
                a7Var.n.setDrawUnchecked(false);
                a7Var.n.setDrawBackgroundAsArc(3);
                a7Var.addView(a7Var.n, k7.c6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            a7Var.n.a(contains, z4);
        }
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        a7 a7Var = null;
        if (i10 == 1) {
            a7 a7Var2 = new a7(this.h.getContext(), null);
            a7Var2.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.d6, false));
            a7Var = a7Var2;
        }
        return new org.telegram.ui.Components.fl0(a7Var);
    }
}
