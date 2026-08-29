package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kg1 extends org.telegram.ui.Components.p51 {
    public ig1 d;
    public long e;
    public gg1 f;
    public String h;
    public org.telegram.ui.ActionBar.w0 n;
    public boolean r;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    @Override // org.telegram.ui.Components.p51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(ArrayList arrayList, org.telegram.ui.Components.k51 k51Var) {
        CharSequence charSequence;
        long j10 = this.e;
        CharSequence charSequence2 = null;
        if (TextUtils.isEmpty(this.h) && j10 != 0) {
            org.telegram.ui.Components.w41 c3 = org.telegram.ui.Components.w41.c(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide));
            c3.r = true;
            arrayList.add(c3);
            arrayList.add(org.telegram.ui.Components.w41.B(null));
        }
        if (TextUtils.isEmpty(this.h)) {
            th.p(R.string.EditProfileChannelSelect, arrayList);
        }
        ArrayList arrayList2 = this.d.e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat == null || ChatObject.isMegagroup(chat)) {
                charSequence = charSequence2;
            } else {
                i10++;
                if (!TextUtils.isEmpty(this.h)) {
                    String lowerCase = this.h.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase)) {
                        charSequence = charSequence2;
                        if (!org.telegram.messenger.x3.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.x3.w(" ", translitSafe, translitSafe2)) {
                        }
                        long j11 = chat.id;
                        org.telegram.ui.Components.w41 w41Var = new org.telegram.ui.Components.w41(11);
                        w41Var.w = true;
                        w41Var.x = -j11;
                        w41Var.K(j10 != j11);
                        arrayList.add(w41Var);
                    }
                }
                charSequence = charSequence2;
                long j112 = chat.id;
                org.telegram.ui.Components.w41 w41Var2 = new org.telegram.ui.Components.w41(11);
                w41Var2.w = true;
                w41Var2.x = -j112;
                w41Var2.K(j10 != j112);
                arrayList.add(w41Var2);
            }
            charSequence2 = charSequence;
        }
        CharSequence charSequence3 = charSequence2;
        if (TextUtils.isEmpty(this.h) && i10 == 0) {
            org.telegram.ui.Components.w41 c6 = org.telegram.ui.Components.w41.c(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew));
            c6.q = true;
            arrayList.add(c6);
        }
        arrayList.add(org.telegram.ui.Components.w41.B(charSequence3));
        org.telegram.ui.ActionBar.w0 w0Var = this.n;
        if (w0Var != null) {
            w0Var.setVisibility(i10 <= 5 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.Components.p51
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override // org.telegram.ui.Components.p51
    public final void W(org.telegram.ui.Components.w41 w41Var, View view) {
        gg1 gg1Var = this.f;
        int i10 = w41Var.d;
        if (i10 == 1) {
            gg1Var.run(null);
            finishFragment();
            return;
        }
        if (i10 != 2) {
            if (w41Var.a == 12) {
                finishFragment();
                gg1Var.run(getMessagesController().getChat(Long.valueOf(-w41Var.x)));
                return;
            }
            return;
        }
        this.r = true;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
            presentFragment(new hd(a4.w.h(0, "step")));
        } else {
            presentFragment(new i(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        }
    }

    @Override // org.telegram.ui.Components.p51
    public final boolean X(org.telegram.ui.Components.w41 w41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.p51, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c3 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c3.F();
        c3.D = new bb(this, 18);
        this.n = c3;
        c3.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.n.setContentDescription(LocaleController.getString(R.string.Search));
        this.n.setVisibility(8);
        super.createView(context);
        this.a.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        if (this.r) {
            ig1 ig1Var = this.d;
            ig1Var.c = false;
            ig1Var.f.add(new jg1(this, 0));
            this.r = false;
        }
    }
}
