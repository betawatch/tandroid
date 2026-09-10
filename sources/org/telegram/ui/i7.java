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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class i7 extends e7 {
    public final ArrayList f;
    public final /* synthetic */ r7 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(r7 r7Var) {
        super(0);
        this.h = r7Var;
        this.f = new ArrayList();
    }

    @Override // org.telegram.ui.Components.ul0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // org.telegram.ui.e7
    public final void F() {
        ArrayList arrayList = this.f;
        arrayList.clear();
        ArrayList arrayList2 = this.e;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        r7 r7Var = this.h;
        if (r7Var.f != null) {
            for (int i10 = 0; i10 < r7Var.f.b.size(); i10++) {
                r6 r6Var = (r6) r7Var.f.b.get(i10);
                l7 l7Var = new l7(1, true);
                l7Var.c = r6Var;
                arrayList2.add(l7Var);
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
        x6 x6Var = (x6) c1Var.a;
        ArrayList arrayList = this.e;
        r6 r6Var = ((l7) arrayList.get(i10)).c;
        r7 r7Var = this.h;
        TLObject userOrChat = r7Var.d.getMessagesController().getUserOrChat(r6Var.a);
        r6 r6Var2 = x6Var.a;
        boolean z10 = r6Var2 != null && r6Var2.a == r6Var.a;
        if (r6Var.a == Long.MAX_VALUE) {
            dialogPhotoTitle = LocaleController.getString(R.string.CacheOtherChats);
            x6Var.getImageView().getAvatarDrawable().g(14);
            x6Var.getImageView().e(null, x6Var.getImageView().getAvatarDrawable());
        } else {
            dialogPhotoTitle = DialogObject.setDialogPhotoTitle(x6Var.getImageView(), userOrChat);
        }
        x6Var.a = r6Var;
        x6Var.getImageView().setRoundRadius(AndroidUtilities.dp(((userOrChat instanceof TLRPC.Chat) && ((TLRPC.Chat) userOrChat).forum) ? 12.0f : 19.0f));
        String formatFileSize = AndroidUtilities.formatFileSize(r6Var.c);
        boolean z11 = i10 < arrayList.size() - 1;
        org.telegram.ui.Components.o6 o6Var = x6Var.d;
        TextView textView = x6Var.c;
        textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
        if (formatFileSize != null) {
            o6Var.c(formatFileSize, false, true);
            o6Var.setVisibility(0);
        } else {
            o6Var.setVisibility(4);
        }
        x6Var.f = z11;
        x6Var.setWillNotDraw(!z11);
        x6Var.requestLayout();
        boolean contains = r7Var.f.l.contains(Long.valueOf(r6Var.a));
        org.telegram.ui.Components.tp tpVar = x6Var.n;
        if (tpVar != null || contains) {
            if (tpVar == null) {
                org.telegram.ui.Components.tp tpVar2 = new org.telegram.ui.Components.tp(x6Var.getContext(), 21, x6Var.b);
                x6Var.n = tpVar2;
                tpVar2.b(-1, org.telegram.ui.ActionBar.j6.d6, org.telegram.ui.ActionBar.j6.k7);
                x6Var.n.setDrawUnchecked(false);
                x6Var.n.setDrawBackgroundAsArc(3);
                x6Var.addView(x6Var.n, w7.a6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x6Var.n.a(contains, z10);
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        x6 x6Var = null;
        if (i10 == 1) {
            x6 x6Var2 = new x6(this.h.getContext(), null);
            x6Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            x6Var = x6Var2;
        }
        return new org.telegram.ui.Components.fl0(x6Var);
    }
}
