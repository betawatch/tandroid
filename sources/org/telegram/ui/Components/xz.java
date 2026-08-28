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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xz extends vk0 {
    public final Context c;
    public final /* synthetic */ yz d;

    public xz(yz yzVar, Activity activity) {
        this.d = yzVar;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override // f2.r0
    public final int h() {
        int size = this.d.s.size();
        return size < 10 ? size + 1 : size;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        org.telegram.ui.ActionBar.b6 b6Var;
        int i11;
        org.telegram.ui.ActionBar.y2 y2Var = (org.telegram.ui.ActionBar.y2) q1Var.a;
        yz yzVar = this.d;
        ArrayList arrayList = yzVar.v;
        ArrayList arrayList2 = yzVar.s;
        if (i9 >= arrayList2.size()) {
            y2Var.getImageView().setColorFilter((ColorFilter) null);
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.k7, false), mode));
            fq fqVar = new fq(drawable, drawable2);
            y2Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q6, false));
            y2Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, fqVar, false);
            return;
        }
        y2Var.getImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.J5, false), PorterDuff.Mode.MULTIPLY));
        MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i9);
        y2Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.j5, false));
        int i12 = dialogFilter.flags;
        if ((MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i12) == (MessagesController.DIALOG_FILTER_FLAG_CONTACTS | MessagesController.DIALOG_FILTER_FLAG_NON_CONTACTS)) {
            i10 = R.drawable.msg_openprofile;
        } else {
            if ((MessagesController.DIALOG_FILTER_FLAG_EXCLUDE_READ & i12) != 0) {
                int i13 = MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS;
                if ((i12 & i13) == i13) {
                    i10 = R.drawable.msg_markunread;
                }
            }
            i10 = (MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i12) == MessagesController.DIALOG_FILTER_FLAG_CHANNELS ? R.drawable.msg_channel : (MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i12) == MessagesController.DIALOG_FILTER_FLAG_GROUPS ? R.drawable.msg_groups : (MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS & i12) == MessagesController.DIALOG_FILTER_FLAG_CONTACTS ? R.drawable.msg_contacts : (i12 & MessagesController.DIALOG_FILTER_FLAG_ALL_CHATS) == MessagesController.DIALOG_FILTER_FLAG_BOTS ? R.drawable.msg_bots : R.drawable.msg_folders;
        }
        y2Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, y2Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, y2Var.getTextView().getPaint().getFontMetricsInt()), 0, new o00(yzVar.getContext(), i10, dialogFilter.color), false);
        s5 textView = y2Var.getTextView();
        int i14 = org.telegram.ui.ActionBar.f6.Oh;
        b6Var = ((org.telegram.ui.ActionBar.f3) yzVar).resourcesProvider;
        textView.setEmojiColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
        boolean z10 = true;
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            long longValue = ((Long) arrayList.get(i15)).longValue();
            i11 = ((org.telegram.ui.ActionBar.f3) yzVar).currentAccount;
            if (!dialogFilter.includesDialog(AccountInstance.getInstance(i11), longValue)) {
                z10 = false;
            }
        }
        y2Var.setChecked(z10);
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.ActionBar.y2 y2Var = new org.telegram.ui.ActionBar.y2(this.c, 0, null);
        y2Var.setBackground(null);
        y2Var.setLayoutParams(new f2.a1(-1, -2));
        return new ik0(y2Var);
    }
}
