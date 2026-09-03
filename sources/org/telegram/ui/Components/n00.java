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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class n00 extends ql0 {
    public final Context c;
    public final /* synthetic */ o00 d;

    public n00(o00 o00Var, Activity activity) {
        this.d = o00Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override // f2.o0
    public final int h() {
        int size = this.d.s.size();
        return size < 10 ? size + 1 : size;
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        int i12;
        org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) l1Var.a;
        o00 o00Var = this.d;
        ArrayList arrayList = o00Var.v;
        ArrayList arrayList2 = o00Var.s;
        if (i10 >= arrayList2.size()) {
            z2Var.getImageView().setColorFilter((ColorFilter) null);
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.k7, false), mode));
            mq mqVar = new mq(drawable, drawable2);
            z2Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q6, false));
            z2Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, mqVar, false);
            return;
        }
        z2Var.getImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.J5, false), PorterDuff.Mode.MULTIPLY));
        MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i10);
        z2Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.j5, false));
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
        z2Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, z2Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, z2Var.getTextView().getPaint().getFontMetricsInt()), 0, new e10(o00Var.getContext(), i11, dialogFilter.color), false);
        t5 textView = z2Var.getTextView();
        int i15 = org.telegram.ui.ActionBar.j6.Oh;
        f6Var = ((org.telegram.ui.ActionBar.g3) o00Var).resourcesProvider;
        textView.setEmojiColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
        boolean z4 = true;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            long longValue = ((Long) arrayList.get(i16)).longValue();
            i12 = ((org.telegram.ui.ActionBar.g3) o00Var).currentAccount;
            if (!dialogFilter.includesDialog(AccountInstance.getInstance(i12), longValue)) {
                z4 = false;
            }
        }
        z2Var.setChecked(z4);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(this.c, 0, null);
        z2Var.setBackground(null);
        z2Var.setLayoutParams(new f2.w0(-1, -2));
        return new dl0(z2Var);
    }
}
