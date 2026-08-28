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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
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
            for (int i9 = 0; i9 < r7Var.f.b.size(); i9++) {
                r6 r6Var = (r6) r7Var.f.b.get(i9);
                l7 l7Var = new l7(1, true);
                l7Var.c = r6Var;
                arrayList2.add(l7Var);
            }
        }
        E(arrayList, arrayList2);
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        String dialogPhotoTitle;
        if (q1Var.f != 1) {
            return;
        }
        x6 x6Var = (x6) q1Var.a;
        ArrayList arrayList = this.e;
        r6 r6Var = ((l7) arrayList.get(i9)).c;
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
        boolean z11 = i9 < arrayList.size() - 1;
        org.telegram.ui.Components.j6 j6Var = x6Var.d;
        TextView textView = x6Var.c;
        textView.setText(Emoji.replaceEmoji(dialogPhotoTitle, textView.getPaint().getFontMetricsInt(), false));
        if (formatFileSize != null) {
            j6Var.c(formatFileSize, false, true);
            j6Var.setVisibility(0);
        } else {
            j6Var.setVisibility(4);
        }
        x6Var.f = z11;
        x6Var.setWillNotDraw(!z11);
        x6Var.requestLayout();
        boolean contains = r7Var.f.l.contains(Long.valueOf(r6Var.a));
        org.telegram.ui.Components.dp dpVar = x6Var.n;
        if (dpVar != null || contains) {
            if (dpVar == null) {
                org.telegram.ui.Components.dp dpVar2 = new org.telegram.ui.Components.dp(x6Var.getContext(), 21, x6Var.b);
                x6Var.n = dpVar2;
                dpVar2.b(-1, org.telegram.ui.ActionBar.f6.d6, org.telegram.ui.ActionBar.f6.k7);
                x6Var.n.setDrawUnchecked(false);
                x6Var.n.setDrawBackgroundAsArc(3);
                x6Var.addView(x6Var.n, g7.e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 38.0f, 25.0f, 38.0f, 0.0f));
            }
            x6Var.n.a(contains, z10);
        }
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        x6 x6Var = null;
        if (i9 == 1) {
            x6 x6Var2 = new x6(this.h.getContext(), null);
            x6Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            x6Var = x6Var2;
        }
        return new org.telegram.ui.Components.ik0(x6Var);
    }
}
