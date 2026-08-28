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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ig1 extends org.telegram.ui.Components.d51 {
    public gg1 d;
    public long e;
    public eg1 f;
    public String h;
    public org.telegram.ui.ActionBar.w0 n;
    public boolean r;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    @Override // org.telegram.ui.Components.d51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void T(ArrayList arrayList, org.telegram.ui.Components.z41 z41Var) {
        CharSequence charSequence;
        long j10 = this.e;
        CharSequence charSequence2 = null;
        if (TextUtils.isEmpty(this.h) && j10 != 0) {
            org.telegram.ui.Components.l41 c10 = org.telegram.ui.Components.l41.c(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide));
            c10.r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.l41.B(null));
        }
        if (TextUtils.isEmpty(this.h)) {
            org.telegram.ui.Cells.j2.l(R.string.EditProfileChannelSelect, arrayList);
        }
        ArrayList arrayList2 = this.d.e;
        int size = arrayList2.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat == null || ChatObject.isMegagroup(chat)) {
                charSequence = charSequence2;
            } else {
                i9++;
                if (!TextUtils.isEmpty(this.h)) {
                    String lowerCase = this.h.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase)) {
                        charSequence = charSequence2;
                        if (!org.telegram.messenger.l0.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.l0.w(" ", translitSafe, translitSafe2)) {
                        }
                        long j11 = chat.id;
                        org.telegram.ui.Components.l41 l41Var = new org.telegram.ui.Components.l41(11);
                        l41Var.w = true;
                        l41Var.x = -j11;
                        l41Var.K(j10 != j11);
                        arrayList.add(l41Var);
                    }
                }
                charSequence = charSequence2;
                long j112 = chat.id;
                org.telegram.ui.Components.l41 l41Var2 = new org.telegram.ui.Components.l41(11);
                l41Var2.w = true;
                l41Var2.x = -j112;
                l41Var2.K(j10 != j112);
                arrayList.add(l41Var2);
            }
            charSequence2 = charSequence;
        }
        CharSequence charSequence3 = charSequence2;
        if (TextUtils.isEmpty(this.h) && i9 == 0) {
            org.telegram.ui.Components.l41 c11 = org.telegram.ui.Components.l41.c(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew));
            c11.q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.l41.B(charSequence3));
        org.telegram.ui.ActionBar.w0 w0Var = this.n;
        if (w0Var != null) {
            w0Var.setVisibility(i9 <= 5 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final CharSequence U() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override // org.telegram.ui.Components.d51
    public final void V(org.telegram.ui.Components.l41 l41Var, View view) {
        eg1 eg1Var = this.f;
        int i9 = l41Var.d;
        if (i9 == 1) {
            eg1Var.run(null);
            finishFragment();
            return;
        }
        if (i9 != 2) {
            if (l41Var.a == 12) {
                finishFragment();
                eg1Var.run(getMessagesController().getChat(Long.valueOf(-l41Var.x)));
                return;
            }
            return;
        }
        this.r = true;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
            presentFragment(new id(aa.d.h(0, "step")));
        } else {
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        }
    }

    @Override // org.telegram.ui.Components.d51
    public final boolean W(org.telegram.ui.Components.l41 l41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.d51, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.D = new cb(this, 18);
        this.n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
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
            gg1 gg1Var = this.d;
            gg1Var.c = false;
            gg1Var.f.add(new hg1(this, 0));
            this.r = false;
        }
    }
}
