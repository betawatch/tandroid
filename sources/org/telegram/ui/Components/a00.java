package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class a00 extends yk0 {
    public final Context c;
    public final /* synthetic */ b00 d;

    public a00(b00 b00Var, Activity activity) {
        this.d = b00Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override // f2.q0
    public final int h() {
        int size = this.d.s.size();
        return size < 10 ? size + 1 : size;
    }

    @Override // f2.q0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i12;
        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) o1Var.a;
        b00 b00Var = this.d;
        ArrayList arrayList = b00Var.v;
        ArrayList arrayList2 = b00Var.s;
        if (i10 >= arrayList2.size()) {
            x2Var.getImageView().setColorFilter((ColorFilter) null);
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k7, false), mode));
            dq dqVar = new dq(drawable, drawable2);
            x2Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
            x2Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, dqVar, false);
            return;
        }
        x2Var.getImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J5, false), PorterDuff.Mode.MULTIPLY));
        MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i10);
        x2Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
        int i13 = dialogFilter.flags;
        if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i13) == (MessagesController.DIALOG_FILTER_FLAG_CONTACTS | MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS)) {
            i11 = R.drawable.msg_openprofile;
        } else {
            if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i13) != 0) {
                int i14 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                if ((i13 & i14) == i14) {
                    i11 = R.drawable.msg_markunread;
                }
            }
            i11 = (MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i13) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS ? R.drawable.msg_channel : (MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i13) == MessagesController.DIALOG_FILTER_FLAG_GROUPS ? R.drawable.msg_groups : (MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i13) == MessagesController.DIALOG_FILTER_FLAG_CONTACTS ? R.drawable.msg_contacts : (i13 & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == MessagesController.DIALOG_FILTER_FLAG_BOTS ? R.drawable.msg_bots : R.drawable.msg_folders;
        }
        x2Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, x2Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, x2Var.getTextView().getPaint().getFontMetricsInt()), 0, new r00(b00Var.getContext(), i11, dialogFilter.color), false);
        s5 textView = x2Var.getTextView();
        int i15 = org.telegram.ui.ActionBar.g6.Oh;
        c6Var = ((org.telegram.ui.ActionBar.e3) b00Var).resourcesProvider;
        textView.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
        boolean z10 = true;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            long longValue = ((Long) arrayList.get(i16)).longValue();
            i12 = ((org.telegram.ui.ActionBar.e3) b00Var).currentAccount;
            if (!dialogFilter.includesDialog(AccountInstance.getInstance(i12), longValue)) {
                z10 = false;
            }
        }
        x2Var.setChecked(z10);
    }

    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(this.c, 0, null);
        x2Var.setBackground(null);
        x2Var.setLayoutParams(new f2.y0(-1, -2));
        return new lk0(x2Var);
    }
}
