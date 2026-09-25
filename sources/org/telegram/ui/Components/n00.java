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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class n00 extends vl0 {
    public final Context c;
    public final /* synthetic */ o00 d;

    public n00(o00 o00Var, Activity activity) {
        this.d = o00Var;
        this.c = activity;
    }

    @Override // org.telegram.ui.Components.vl0
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override // s4.h0
    public final int h() {
        int size = this.d.s.size();
        return size < 10 ? size + 1 : size;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.d6 d6Var;
        int i12;
        org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) c1Var.a;
        o00 o00Var = this.d;
        ArrayList arrayList = o00Var.v;
        ArrayList arrayList2 = o00Var.s;
        if (i10 >= arrayList2.size()) {
            x2Var.getImageView().setColorFilter((ColorFilter) null);
            Context context = this.c;
            Drawable drawable = context.getResources().getDrawable(R.drawable.poll_add_circle);
            Drawable drawable2 = context.getResources().getDrawable(R.drawable.poll_add_plus);
            int w02 = org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.N6, false);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            drawable.setColorFilter(new PorterDuffColorFilter(w02, mode));
            drawable2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.k7, false), mode));
            qq qqVar = new qq(drawable, drawable2);
            x2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.q6, false));
            x2Var.a(LocaleController.getString(R.string.CreateNewFilter), 0, qqVar, false);
            return;
        }
        x2Var.getImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.J5, false), PorterDuff.Mode.MULTIPLY));
        MessagesController.DialogFilter dialogFilter = (MessagesController.DialogFilter) arrayList2.get(i10);
        x2Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.j5, false));
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
        x2Var.a(MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(dialogFilter.name, x2Var.getTextView().getPaint().getFontMetricsInt(), false), dialogFilter.entities, x2Var.getTextView().getPaint().getFontMetricsInt()), 0, new e10(o00Var.getContext(), i11, dialogFilter.color), false);
        y5 textView = x2Var.getTextView();
        int i15 = org.telegram.ui.ActionBar.h6.Oh;
        d6Var = ((org.telegram.ui.ActionBar.e3) o00Var).resourcesProvider;
        textView.setEmojiColor(org.telegram.ui.ActionBar.h6.v0(i15, d6Var));
        boolean z10 = true;
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            long longValue = ((Long) arrayList.get(i16)).longValue();
            i12 = ((org.telegram.ui.ActionBar.e3) o00Var).currentAccount;
            if (!dialogFilter.includesDialog(AccountInstance.getInstance(i12), longValue)) {
                z10 = false;
            }
        }
        x2Var.setChecked(z10);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.ActionBar.x2 x2Var = new org.telegram.ui.ActionBar.x2(this.c, 0, null);
        x2Var.setBackground(null);
        x2Var.setLayoutParams(new s4.p0(-1, -2));
        return new gl0(x2Var);
    }
}
