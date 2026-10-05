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

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class l7 extends h7 {
    public final ArrayList f;
    public final /* synthetic */ v7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(v7 v7Var) {
        super(0);
        this.h = v7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.h7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        v7 v7Var = this.h;
        if (v7Var.f != null) {
            for (int i10 = 0; i10 < v7Var.f.b.size(); i10++) {
                u6 u6Var = (u6) v7Var.f.b.get(i10);
                o7 o7Var = new o7(1, true);
                o7Var.c = u6Var;
                arrayList2.add(o7Var);
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
        z6 z6Var = (z6) c1Var.a;
        ArrayList arrayList = this.e;
        u6 u6Var = ((o7) arrayList.get(i10)).c;
        v7 v7Var = this.h;
        TLObject userOrChat = v7Var.d.getMessagesController().getUserOrChat(u6Var.a);
        u6 u6Var2 = z6Var.a;
        boolean z10 = u6Var2 != null && u6Var2.a == u6Var.a;
        if (u6Var.a == Long.MAX_VALUE) {
            dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
            z6Var.getImageView().getAvatarDrawable().g(14);
            z6Var.getImageView().e(null, z6Var.getImageView().getAvatarDrawable());
        } else {
            dialogPhotoTitle = DialogObject.setDialogPhotoTitle(z6Var.getImageView(), userOrChat);
        }
        z6Var.a = u6Var;
        z6Var.getImageView().setRoundRadius(AndroidUtilities.dp(((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) ? 12.0f : 19.0f));
        String formatFileSize = AndroidUtilities.formatFileSize(u6Var.c);
        boolean z11 = i10 < arrayList.size() - 1;
        org.telegram.ui.Components.p6 p6Var = z6Var.d;
        TextView textView = z6Var.c;
        textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
        if (formatFileSize != null) {
            p6Var.c(formatFileSize, false, true);
            p6Var.setVisibility(0);
        } else {
            p6Var.setVisibility(4);
        }
        z6Var.f = z11;
        z6Var.setWillNotDraw(!z11);
        z6Var.requestLayout();
        boolean contains = v7Var.f.l.contains(Long.valueOf(u6Var.a));
        org.telegram.ui.Components.qp qpVar = z6Var.n;
        if (qpVar != null || contains) {
            if (qpVar == null) {
                org.telegram.ui.Components.qp qpVar2 = new org.telegram.ui.Components.qp(z6Var.getContext(), 21, z6Var.b);
                z6Var.n = qpVar2;
                qpVar2.b(-1, org.telegram.ui.ActionBar.i6.d6, org.telegram.ui.ActionBar.i6.k7);
                z6Var.n.setDrawUnchecked(false);
                z6Var.n.setDrawBackgroundAsArc(3);
                z6Var.addView(z6Var.n, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            z6Var.n.a(contains, z10);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.il0(i10 == 1 ? new z6(this.h.getContext(), null) : null);
    }
}
