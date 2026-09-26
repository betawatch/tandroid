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

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ih1 extends org.telegram.ui.Components.m61 {
    public gh1 d;
    public long e;
    public eh1 f;
    public String h;
    public org.telegram.ui.ActionBar.u0 n;
    public boolean r;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    @Override // org.telegram.ui.Components.m61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(ArrayList arrayList, org.telegram.ui.Components.j61 j61Var) {
        CharSequence charSequence;
        long j3 = this.e;
        CharSequence charSequence2 = null;
        if (TextUtils.isEmpty(this.h) && j3 != 0) {
            org.telegram.ui.Components.v51 c10 = org.telegram.ui.Components.v51.c(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide));
            c10.r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.v51.B(null));
        }
        if (TextUtils.isEmpty(this.h)) {
            com.google.android.gms.internal.vision.e2.n(R.string.EditProfileChannelSelect, arrayList);
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
                        if (!org.telegram.messenger.f0.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.f0.w(" ", translitSafe, translitSafe2)) {
                        }
                        long j10 = chat.id;
                        org.telegram.ui.Components.v51 v51Var = new org.telegram.ui.Components.v51(11);
                        v51Var.w = true;
                        v51Var.x = -j10;
                        v51Var.K(j3 != j10);
                        arrayList.add(v51Var);
                    }
                }
                charSequence = charSequence2;
                long j102 = chat.id;
                org.telegram.ui.Components.v51 v51Var2 = new org.telegram.ui.Components.v51(11);
                v51Var2.w = true;
                v51Var2.x = -j102;
                v51Var2.K(j3 != j102);
                arrayList.add(v51Var2);
            }
            charSequence2 = charSequence;
        }
        CharSequence charSequence3 = charSequence2;
        if (TextUtils.isEmpty(this.h) && i10 == 0) {
            org.telegram.ui.Components.v51 c11 = org.telegram.ui.Components.v51.c(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew));
            c11.q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.v51.B(charSequence3));
        org.telegram.ui.ActionBar.u0 u0Var = this.n;
        if (u0Var != null) {
            u0Var.setVisibility(i10 <= 5 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override // org.telegram.ui.Components.m61
    public final void W(org.telegram.ui.Components.v51 v51Var, View view) {
        eh1 eh1Var = this.f;
        int i10 = v51Var.d;
        if (i10 == 1) {
            eh1Var.run(null);
            finishFragment();
            return;
        }
        if (i10 != 2) {
            if (v51Var.a == 12) {
                finishFragment();
                eh1Var.run(getMessagesController().getChat(Long.valueOf(-v51Var.x)));
                return;
            }
            return;
        }
        this.r = true;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
            presentFragment(new ld(org.telegram.ui.Cells.c1.g(0, "step")));
        } else {
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        }
    }

    @Override // org.telegram.ui.Components.m61
    public final boolean X(org.telegram.ui.Components.v51 v51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.m61, org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.e2(this, 19);
        this.n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.n.setContentDescription(LocaleController.getString(R.string.Search));
        this.n.setVisibility(8);
        super.createView(context);
        this.a.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        if (this.r) {
            gh1 gh1Var = this.d;
            gh1Var.c = false;
            gh1Var.f.add(new hh1(this, 0));
            this.r = false;
        }
    }
}
