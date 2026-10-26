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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class mr extends org.telegram.ui.Components.m71 {
    public final jg1 e;
    public final long f;
    public final hg1 h;
    public String n;
    public org.telegram.ui.ActionBar.y5 r;
    public boolean s = false;

    public mr(jg1 jg1Var, long j10, hg1 hg1Var) {
        this.e = jg1Var;
        this.f = j10;
        this.h = hg1Var;
        lr lrVar = new lr(this, 0);
        if (jg1Var.c) {
            lrVar.run();
        } else {
            jg1Var.f.add(lrVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    @Override // org.telegram.ui.Components.m71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void V(ArrayList arrayList, org.telegram.ui.Components.j71 j71Var) {
        CharSequence charSequence;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        CharSequence charSequence2 = null;
        long j10 = this.f;
        if (isEmpty && j10 != 0) {
            org.telegram.ui.Components.t61 c10 = org.telegram.ui.Components.t61.c(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide));
            c10.r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.t61.C(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            ic.a.p(R.string.EditProfileChannelSelect, arrayList);
        }
        ArrayList arrayList2 = this.e.e;
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
                if (!TextUtils.isEmpty(this.n)) {
                    String lowerCase = this.n.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase)) {
                        charSequence = charSequence2;
                        if (!org.telegram.messenger.vh.u(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.vh.u(" ", translitSafe, translitSafe2)) {
                        }
                        long j11 = chat.id;
                        org.telegram.ui.Components.t61 t61Var = new org.telegram.ui.Components.t61(11);
                        t61Var.w = true;
                        t61Var.x = -j11;
                        t61Var.L(j10 != j11);
                        arrayList.add(t61Var);
                    }
                }
                charSequence = charSequence2;
                long j112 = chat.id;
                org.telegram.ui.Components.t61 t61Var2 = new org.telegram.ui.Components.t61(11);
                t61Var2.w = true;
                t61Var2.x = -j112;
                t61Var2.L(j10 != j112);
                arrayList.add(t61Var2);
            }
            charSequence2 = charSequence;
        }
        CharSequence charSequence3 = charSequence2;
        if (TextUtils.isEmpty(this.n) && i10 == 0) {
            org.telegram.ui.Components.t61 c11 = org.telegram.ui.Components.t61.c(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew));
            c11.q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.t61.C(charSequence3));
        org.telegram.ui.ActionBar.y5 y5Var = this.r;
        if (y5Var != null) {
            y5Var.setVisibility(i10 <= 5 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.Components.m71
    public final CharSequence W() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override // org.telegram.ui.Components.m71
    public final void X(org.telegram.ui.Components.t61 t61Var, View view) {
        int i10 = t61Var.d;
        hg1 hg1Var = this.h;
        if (i10 == 1) {
            hg1Var.run(null);
            finishFragment();
            return;
        }
        if (i10 != 2) {
            if (t61Var.a == 12) {
                finishFragment();
                hg1Var.run(getMessagesController().getChat(Long.valueOf(-t61Var.x)));
                return;
            }
            return;
        }
        this.s = true;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
            presentFragment(new nd(org.telegram.ui.Components.b10.g(0, "step")));
        } else {
            presentFragment(new g(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        }
    }

    @Override // org.telegram.ui.Components.m71
    public final boolean Y(org.telegram.ui.Components.t61 t61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.m71, org.telegram.ui.ActionBar.r2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.x5 j10 = this.simpleActionBar.j();
        int i10 = R.drawable.outline_header_search;
        getResourceProvider();
        org.telegram.ui.ActionBar.y5 a2 = j10.a(0, i10);
        a2.N();
        a2.z0 = new jg.e2(this, 4);
        this.r = a2;
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.r.setContentDescription(LocaleController.getString(R.string.Search));
        this.r.setVisibility(8);
        setHasOwnBackground(true);
        super.createView(context);
        this.a.u1();
        this.a.setSectionsDrawBackground(true);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final org.telegram.ui.Components.mm0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        if (this.s) {
            jg1 jg1Var = this.e;
            jg1Var.c = false;
            jg1Var.f.add(new lr(this, 1));
            this.s = false;
        }
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final boolean useSimpleActionBar() {
        return true;
    }
}
