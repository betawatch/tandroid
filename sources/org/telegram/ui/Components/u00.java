package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class u00 extends mm0 {
    public final Context c;
    public final /* synthetic */ v00 d;

    public u00(v00 v00Var, Activity activity) {
        this.d = v00Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        int size = this.d.v.size();
        return size < 10 ? size + 1 : size;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.u6 u6Var;
        int i12;
        org.telegram.ui.ActionBar.c3 c3Var = (org.telegram.ui.ActionBar.c3) e1Var.a;
        v00 v00Var = this.d;
        ArrayList arrayList = v00Var.w;
        ArrayList arrayList2 = v00Var.v;
        if (i10 >= arrayList2.size()) {
            c3Var.getImageView().setColorFilter((ColorFilter) null);
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            ImageView imageView = c3Var.getImageView();
            int i13 = org.telegram.ui.ActionBar.y6.N6;
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.y(imageView, drawable, i13, null, mode);
            org.telegram.ui.ActionBar.f7.y(c3Var.getImageView(), drawable2, org.telegram.ui.ActionBar.y6.k7, null, mode);
            ar arVar = new ar(drawable, drawable2);
            org.telegram.ui.ActionBar.f7.V(c3Var.getTextView(), org.telegram.ui.ActionBar.y6.q6, null);
            c3Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, arVar, false);
            return;
        }
        org.telegram.ui.ActionBar.f7.t(c3Var.getImageView(), org.telegram.ui.ActionBar.y6.J5, null, PorterDuff.Mode.MULTIPLY);
        MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i10);
        org.telegram.ui.ActionBar.f7.V(c3Var.getTextView(), org.telegram.ui.ActionBar.y6.j5, null);
        int i14 = dialogFilter.flags;
        if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i14) == (MessagesController.DIALOG_FILTER_FLAG_CONTACTS | MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS)) {
            i11 = R.drawable.msg_openprofile;
        } else {
            if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i14) != 0) {
                int i15 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                if ((i14 & i15) == i15) {
                    i11 = R.drawable.msg_markunread;
                }
            }
            i11 = (MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i14) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS ? R.drawable.msg_channel : (MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i14) == MessagesController.DIALOG_FILTER_FLAG_GROUPS ? R.drawable.msg_groups : (MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i14) == MessagesController.DIALOG_FILTER_FLAG_CONTACTS ? R.drawable.msg_contacts : (i14 & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == MessagesController.DIALOG_FILTER_FLAG_BOTS ? R.drawable.msg_bots : R.drawable.msg_folders;
        }
        c3Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, c3Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, c3Var.getTextView().getPaint().getFontMetricsInt()), 0, new o10(v00Var.getContext(), i11, dialogFilter.color), false);
        b6 textView = c3Var.getTextView();
        int i16 = org.telegram.ui.ActionBar.y6.Oh;
        u6Var = ((org.telegram.ui.ActionBar.k3) v00Var).resourcesProvider;
        textView.setEmojiColor(org.telegram.ui.ActionBar.y6.w0(i16, u6Var));
        boolean z10 = true;
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            long longValue = ((Long) arrayList.get(i17)).longValue();
            i12 = ((org.telegram.ui.ActionBar.k3) v00Var).currentAccount;
            if (!dialogFilter.includesDialog(AccountInstance.getInstance(i12), longValue)) {
                z10 = false;
            }
        }
        c3Var.setChecked(z10);
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.c3 c3Var = new org.telegram.ui.ActionBar.c3(this.c, 0, null);
        c3Var.setBackground(null);
        c3Var.setLayoutParams(new s4.q0(-1, -2));
        return new wl0(c3Var);
    }
}
