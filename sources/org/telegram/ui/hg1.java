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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class hg1 extends org.telegram.ui.Components.f51 {
    public fg1 d;
    public long e;
    public dg1 f;
    public String h;
    public org.telegram.ui.ActionBar.v0 n;
    public boolean r;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    @Override // org.telegram.ui.Components.f51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(ArrayList arrayList, org.telegram.ui.Components.b51 b51Var) {
        CharSequence charSequence;
        long j10 = this.e;
        CharSequence charSequence2 = null;
        if (TextUtils.isEmpty(this.h) && j10 != 0) {
            org.telegram.ui.Components.n41 c10 = org.telegram.ui.Components.n41.c(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide));
            c10.r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.n41.B(null));
        }
        if (TextUtils.isEmpty(this.h)) {
            org.telegram.ui.Cells.pa.o(R.string.EditProfileChannelSelect, arrayList);
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
                        if (!org.telegram.messenger.y1.x(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.y1.x(" ", translitSafe, translitSafe2)) {
                        }
                        long j11 = chat.id;
                        org.telegram.ui.Components.n41 n41Var = new org.telegram.ui.Components.n41(11);
                        n41Var.w = true;
                        n41Var.x = -j11;
                        n41Var.K(j10 != j11);
                        arrayList.add(n41Var);
                    }
                }
                charSequence = charSequence2;
                long j112 = chat.id;
                org.telegram.ui.Components.n41 n41Var2 = new org.telegram.ui.Components.n41(11);
                n41Var2.w = true;
                n41Var2.x = -j112;
                n41Var2.K(j10 != j112);
                arrayList.add(n41Var2);
            }
            charSequence2 = charSequence;
        }
        CharSequence charSequence3 = charSequence2;
        if (TextUtils.isEmpty(this.h) && i10 == 0) {
            org.telegram.ui.Components.n41 c11 = org.telegram.ui.Components.n41.c(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew));
            c11.q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.n41.B(charSequence3));
        org.telegram.ui.ActionBar.v0 v0Var = this.n;
        if (v0Var != null) {
            v0Var.setVisibility(i10 <= 5 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.Components.f51
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override // org.telegram.ui.Components.f51
    public final void W(org.telegram.ui.Components.n41 n41Var, View view) {
        dg1 dg1Var = this.f;
        int i10 = n41Var.d;
        if (i10 == 1) {
            dg1Var.run(null);
            finishFragment();
            return;
        }
        if (i10 != 2) {
            if (n41Var.a == 12) {
                finishFragment();
                dg1Var.run(getMessagesController().getChat(Long.valueOf(-n41Var.x)));
                return;
            }
            return;
        }
        this.r = true;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
            presentFragment(new id(a9.p.g(0, "step")));
        } else {
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        }
    }

    @Override // org.telegram.ui.Components.f51
    public final boolean X(org.telegram.ui.Components.n41 n41Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.f51, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.D = new db(this, 18);
        this.n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.n.setContentDescription(LocaleController.getString(R.string.Search));
        this.n.setVisibility(8);
        super.createView(context);
        this.a.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        if (this.r) {
            fg1 fg1Var = this.d;
            fg1Var.c = false;
            fg1Var.f.add(new gg1(this, 0));
            this.r = false;
        }
    }
}
