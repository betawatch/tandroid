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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class i00 extends il0 {
    public final Context c;
    public final /* synthetic */ j00 d;

    public i00(j00 j00Var, Activity activity) {
        this.d = j00Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override // f2.p0
    public final int h() {
        int size = this.d.s.size();
        return size < 10 ? size + 1 : size;
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.c6 c6Var;
        int i12;
        org.telegram.ui.ActionBar.y2 y2Var = (org.telegram.ui.ActionBar.y2) n1Var.a;
        j00 j00Var = this.d;
        ArrayList arrayList = j00Var.v;
        ArrayList arrayList2 = j00Var.s;
        if (i10 >= arrayList2.size()) {
            y2Var.getImageView().setColorFilter((ColorFilter) null);
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.k7, false), mode));
            jq jqVar = new jq(drawable, drawable2);
            y2Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false));
            y2Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, jqVar, false);
            return;
        }
        y2Var.getImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.J5, false), PorterDuff.Mode.MULTIPLY));
        MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i10);
        y2Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.j5, false));
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
        y2Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, y2Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, y2Var.getTextView().getPaint().getFontMetricsInt()), 0, new z00(j00Var.getContext(), i11, dialogFilter.color), false);
        x5 textView = y2Var.getTextView();
        int i15 = org.telegram.ui.ActionBar.g6.Oh;
        c6Var = ((org.telegram.ui.ActionBar.f3) j00Var).resourcesProvider;
        textView.setEmojiColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
        boolean z10 = true;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            long longValue = ((Long) arrayList.get(i16)).longValue();
            i12 = ((org.telegram.ui.ActionBar.f3) j00Var).currentAccount;
            if (!dialogFilter.includesDialog(AccountInstance.getInstance(i12), longValue)) {
                z10 = false;
            }
        }
        y2Var.setChecked(z10);
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.y2 y2Var = new org.telegram.ui.ActionBar.y2(this.c, 0, null);
        y2Var.setBackground(null);
        y2Var.setLayoutParams(new f2.x0(-1, -2));
        return new vk0(y2Var);
    }
}
