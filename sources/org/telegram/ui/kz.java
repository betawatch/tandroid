package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class kz extends org.telegram.ui.ActionBar.h2 {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public final LongSparseIntArray I;
    public az J;
    public bz K;
    public fz L;
    public final ArrayList M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public float R;
    public hi.m3 S;
    public boolean T;
    public di.x7 U;
    public int V;
    public int W;
    public int X;
    public et a;
    public hz b;
    public org.telegram.ui.ActionBar.d5 c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final org.telegram.messenger.ro r;
    public boolean s;
    public boolean w;
    public CharSequence x;
    public boolean y;

    public kz(org.telegram.messenger.ro roVar, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.y = true;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = -5.0f;
        this.r = roVar;
        if (roVar == null) {
            org.telegram.messenger.ro roVar2 = new org.telegram.messenger.ro();
            this.r = roVar2;
            roVar2.a = 2;
            while (getMessagesController().T0.get(this.r.a) != null) {
                this.r.a++;
            }
            org.telegram.messenger.ro roVar3 = this.r;
            roVar3.b = "";
            roVar3.m = (int) (Math.random() * 8.0d);
            this.s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.g0.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r.b);
        this.x = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.j6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.x = m10;
        this.x = org.telegram.messenger.fj.B5(m10, this.r.c, textPaint.getFontMetricsInt(), false);
        boolean z10 = !this.r.n;
        this.y = z10;
        org.telegram.ui.Components.o5.r(this.currentAccount, z10);
        org.telegram.messenger.ro roVar4 = this.r;
        this.E = roVar4.g;
        this.F = roVar4.m;
        ArrayList arrayList2 = new ArrayList(this.r.h);
        this.G = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.H = new ArrayList(this.r.i);
        this.I = this.r.j.clone();
    }

    public static CharSequence E0(int i7, CharSequence charSequence, boolean z10) {
        Context context;
        if (i7 >= 0) {
            if (!org.telegram.messenger.mp.g1().getBoolean("n_" + i7, false) && (context = org.telegram.messenger.t0.b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable g10 = i5.c.g(context, R.drawable.msg_other_new_outline);
                    g10.setBounds(0, -org.telegram.messenger.g0.L(8.0f), g10.getIntrinsicWidth(), g10.getIntrinsicHeight() - org.telegram.messenger.g0.L(8.0f));
                    spannableString.setSpan(new uy(g10, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable g11 = i5.c.g(context, R.drawable.msg_other_new_filled);
                    Drawable g12 = i5.c.g(context, R.drawable.msg_other_new_filled_text);
                    int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ki, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    g11.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    g12.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Ji, false), mode));
                    org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(g11, g12);
                    mqVar.setBounds(0, 0, mqVar.getIntrinsicWidth(), mqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(mqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public static void Z(kz kzVar) {
        kzVar.y = !kzVar.y;
        bz bzVar = kzVar.K;
        if (bzVar != null) {
            org.telegram.ui.Cells.x3 x3Var = bzVar.r;
            String str = null;
            if (q0(kzVar.x)) {
                str = org.telegram.messenger.gd.M0(kzVar.y ? 2131750724 : 2131750723, null);
            }
            x3Var.setText(str);
        }
        org.telegram.ui.Components.o5.r(kzVar.currentAccount, kzVar.y);
        kzVar.o0(true);
        org.telegram.ui.ActionBar.a5 a5Var = kzVar.simpleActionBar;
        if (a5Var != null) {
            if (a5Var.getTitleTextView() != null) {
                kzVar.simpleActionBar.getTitleTextView().setEmojiCacheType(kzVar.y ? 0 : 26);
            }
            if (kzVar.simpleActionBar.getTitleTextView2() != null) {
                kzVar.simpleActionBar.getTitleTextView2().setEmojiCacheType(kzVar.y ? 0 : 26);
            }
        }
    }

    public static void a0(kz kzVar) {
        org.telegram.messenger.ro roVar = kzVar.r;
        if (!kzVar.w) {
            kzVar.finishFragment();
            return;
        }
        kzVar.w = false;
        Paint.FontMetricsInt titleFontMetricsInt = kzVar.simpleActionBar.getTitleFontMetricsInt();
        Spannable B5 = org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(roVar.b, titleFontMetricsInt, false, null, 0), roVar.c, titleFontMetricsInt, false);
        org.telegram.ui.ActionBar.a5 a5Var = kzVar.simpleActionBar;
        a5Var.getClass();
        a5Var.I(B5, true, 220L, org.telegram.ui.Components.lr.h);
    }

    public static void b0(kz kzVar) {
        org.telegram.messenger.mp messagesController = kzVar.getMessagesController();
        org.telegram.messenger.ro roVar = kzVar.r;
        messagesController.w5(roVar);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i7 = 0; i7 < roVar.h.size(); i7++) {
            long longValue = ((Long) roVar.h.get(i7)).longValue();
            if (longValue < 0 && m0(kzVar.getMessagesController().O0(Long.valueOf(-longValue)))) {
                arrayList.add(kzVar.getMessagesController().l1(longValue));
            }
        }
        if (arrayList.size() > (kzVar.getUserConfig().q() ? kzVar.getMessagesController().R4 : kzVar.getMessagesController().Q4)) {
            kzVar.showDialog(new ug.l0(4, kzVar.currentAccount, kzVar.getParentActivity(), kzVar, null));
            return;
        }
        if (arrayList.isEmpty()) {
            ky kyVar = new ky(roVar, null);
            kyVar.y = new oy(kzVar, 1);
            kyVar.x = new oy(kzVar, 2);
            kzVar.presentFragment(kyVar);
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = roVar.a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        kzVar.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new ry(kzVar, 1));
    }

    public static boolean m0(TLRPC.Chat chat) {
        if (org.telegram.messenger.v3.y(3, chat)) {
            return true;
        }
        return org.telegram.messenger.v3.t0(chat) && !chat.join_request;
    }

    public static boolean q0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.x5[] x5VarArr = (org.telegram.ui.Components.x5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.x5.class);
            if (x5VarArr != null && x5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void v0(org.telegram.messenger.ro roVar, int i7, String str, ArrayList arrayList, boolean z10, int i10, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.h2 h2Var, Runnable runnable) {
        if (roVar.g != i7 || z13) {
            roVar.e = -1;
            if (z14) {
                roVar.d = -1;
            }
        }
        roVar.g = i7;
        roVar.b = str;
        roVar.c = arrayList;
        roVar.m = i10;
        roVar.i = arrayList3;
        roVar.h = arrayList2;
        roVar.n = z10;
        if (z11) {
            h2Var.getMessagesController().g(roVar, z12);
        } else {
            h2Var.getMessagesController().D3(roVar);
        }
        org.telegram.messenger.tr messagesStorage = h2Var.getMessagesStorage();
        messagesStorage.a.c(new org.telegram.messenger.xf(messagesStorage, roVar, z12, 9));
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList V0 = h2Var.getMessagesController().V0();
            int size = V0.size();
            for (int i11 = 0; i11 < size; i11 = com.google.android.gms.internal.vision.e2.f(((org.telegram.messenger.ro) V0.get(i11)).a, i11, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            h2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void x0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.h2 h2Var, org.telegram.ui.Components.lc lcVar) {
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            return;
        }
        if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            new ug.l0(4, h2Var.getCurrentAccount(), h2Var.getContext(), h2Var, null).show();
            return;
        }
        if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
            org.telegram.messenger.f3.o(null, 2131750637, lcVar, null);
            return;
        }
        if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.f3.o(null, 2131750636, lcVar, null);
            return;
        }
        if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            new ug.l0(5, h2Var.getCurrentAccount(), h2Var.getContext(), h2Var, null).show();
            return;
        }
        if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
            new ug.l0(12, h2Var.getCurrentAccount(), h2Var.getContext(), h2Var, null).show();
            return;
        }
        if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            new ug.l0(13, h2Var.getCurrentAccount(), h2Var.getContext(), h2Var, null).show();
            return;
        }
        if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
            org.telegram.messenger.f3.o(null, 2131748017, lcVar, null);
            return;
        }
        if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
            new ug.l0(4, h2Var.getCurrentAccount(), h2Var.getContext(), h2Var, null).show();
        } else if (!"DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.f3.o(null, 2131743642, lcVar, null);
        } else {
            new ug.l0(3, h2Var.getCurrentAccount(), h2Var.getContext(), h2Var, null).show();
        }
    }

    public static void z0(final org.telegram.messenger.ro roVar, final int i7, final String str, final ArrayList arrayList, final boolean z10, final int i10, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.h2 h2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (h2Var == null || h2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.u1 u1Var = null;
        int i11 = 3;
        if (z15) {
            org.telegram.ui.ActionBar.u1 u1Var2 = new org.telegram.ui.ActionBar.u1(3, h2Var.getParentActivity(), null);
            u1Var2.j0 = false;
            u1Var2.show();
            u1Var = u1Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.id = roVar.a;
        int i12 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i13 = org.telegram.messenger.mp.I8;
        tL_dialogFilter.contacts = (i7 & 1) != 0;
        tL_dialogFilter.non_contacts = (i7 & 2) != 0;
        tL_dialogFilter.groups = (i7 & 4) != 0;
        tL_dialogFilter.broadcasts = (i7 & 8) != 0;
        tL_dialogFilter.bots = (i7 & 16) != 0;
        tL_dialogFilter.exclude_muted = (i7 & 32) != 0;
        tL_dialogFilter.exclude_read = (i7 & 64) != 0;
        tL_dialogFilter.exclude_archived = (i7 & 128) != 0;
        tL_dialogFilter.id = roVar.a;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z10;
        if (i10 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= TLObject.FLAG_27;
            tL_dialogFilter2.color = i10;
        }
        org.telegram.messenger.mp messagesController = h2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                long keyAt = longSparseIntArray.keyAt(i14);
                if (!org.telegram.messenger.n5.C(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new qs(longSparseIntArray, i12));
        }
        int i15 = 0;
        while (i15 < i11) {
            if (i15 == 0) {
                arrayList4 = tL_messages_updateDialogFilter.filter.include_peers;
                arrayList5 = arrayList2;
            } else if (i15 == i12) {
                arrayList4 = tL_messages_updateDialogFilter.filter.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_messages_updateDialogFilter.filter.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            int i16 = 0;
            while (i16 < size2) {
                Long l10 = (Long) arrayList5.get(i16);
                org.telegram.ui.ActionBar.u1 u1Var3 = u1Var;
                int i17 = size2;
                long longValue = l10.longValue();
                if ((i15 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !org.telegram.messenger.n5.C(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User c22 = messagesController.c2(l10);
                        if (c22 != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = c22.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j3 = -longValue;
                        TLRPC.Chat O0 = messagesController.O0(Long.valueOf(j3));
                        if (O0 != null) {
                            if (org.telegram.messenger.v3.T(O0)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j3;
                                tL_inputPeerChannel.access_hash = O0.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j3;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i16++;
                u1Var = u1Var3;
                size2 = i17;
            }
            i15++;
            i11 = 3;
            i12 = 1;
        }
        final org.telegram.ui.ActionBar.u1 u1Var4 = u1Var;
        h2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() { // from class: org.telegram.ui.qy
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.u1 u1Var5 = u1Var4;
                final org.telegram.messenger.ro roVar2 = roVar;
                final int i18 = i7;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z17 = z10;
                final int i19 = i10;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final boolean z21 = z14;
                final org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                final Runnable runnable2 = runnable;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: org.telegram.ui.my
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (!z22) {
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        } else {
                            org.telegram.ui.ActionBar.u1 u1Var6 = u1Var5;
                            if (u1Var6 != null) {
                                try {
                                    u1Var6.dismiss();
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                            }
                            kz.v0(roVar2, i18, str2, arrayList7, z17, i19, arrayList8, arrayList9, z18, z19, z20, z21, h2Var2, runnable3);
                        }
                    }
                });
            }
        });
        if (z15) {
            return;
        }
        v0(roVar, i7, str, arrayList, z10, i10, arrayList2, arrayList3, z11, z12, z13, z14, h2Var, null);
    }

    public final void A0(boolean z10) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.E, z10 ? this.G : this.H, z10);
        usersSelectActivity.G = this.r.c();
        usersSelectActivity.n = new ab.z(7, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void B0(cz czVar, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (z10) {
            u1Var.S = org.telegram.messenger.gd.M0(2131750696, null);
            if (obj instanceof String) {
                u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750697, charSequence);
            } else if (obj instanceof TLRPC.User) {
                u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750695, charSequence);
            } else {
                u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750698, charSequence);
            }
        } else {
            u1Var.S = org.telegram.messenger.gd.M0(2131750701, null);
            if (obj instanceof String) {
                u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750702, charSequence);
            } else if (obj instanceof TLRPC.User) {
                u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750700, charSequence);
            } else {
                u1Var.U = org.telegram.messenger.gd.a0(null, null, 2131750703, charSequence);
            }
        }
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131744620, null), new ab.j(this, czVar, z10, 8));
        showDialog(u1Var);
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
        }
    }

    public final void C0() {
        int i7;
        ArrayList arrayList = this.P;
        arrayList.clear();
        ArrayList arrayList2 = this.Q;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String M0 = org.telegram.messenger.gd.M0(2131750722, null);
        String M02 = q0(this.x) ? org.telegram.messenger.gd.M0(this.y ? 2131750724 : 2131750723, null) : null;
        final int i10 = 1;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.ly
            public final /* synthetic */ kz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                int i12 = 1;
                kz kzVar = this.b;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.ro roVar = kzVar.r;
                        if (roVar != null && roVar.c()) {
                            org.telegram.ui.Components.g00.h1(kzVar, roVar.a, new oy(kzVar, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                            String M03 = org.telegram.messenger.gd.M0(2131750779, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.S = M03;
                            u1Var.U = org.telegram.messenger.gd.M0(2131750778, null);
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new ny(kzVar, i12));
                            kzVar.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                break;
                            }
                        }
                        break;
                    case 1:
                        kz.Z(kzVar);
                        break;
                    case 2:
                        kzVar.A0(true);
                        break;
                    case 3:
                        kzVar.e = true;
                        kzVar.C0();
                        break;
                    case 4:
                        kzVar.A0(false);
                        break;
                    default:
                        kzVar.f = true;
                        kzVar.C0();
                        break;
                }
            }
        };
        final int i11 = 0;
        cz czVar = new cz(11, false);
        czVar.d = M0;
        czVar.e = M02;
        czVar.c = onClickListener;
        arrayList2.add(czVar);
        this.d = arrayList2.size();
        final int i12 = 2;
        arrayList2.add(new cz(2, false));
        arrayList2.add(cz.d(null));
        String M03 = org.telegram.messenger.gd.M0(2131750762, null);
        cz czVar2 = new cz(0, false);
        czVar2.d = M03;
        arrayList2.add(czVar2);
        cz b10 = cz.b(R.drawable.msg2_chats_add, org.telegram.messenger.gd.M0(2131750802, null), false);
        b10.c = new View.OnClickListener(this) { // from class: org.telegram.ui.ly
            public final /* synthetic */ kz b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                int i122 = 1;
                kz kzVar = this.b;
                switch (i112) {
                    case 0:
                        org.telegram.messenger.ro roVar = kzVar.r;
                        if (roVar != null && roVar.c()) {
                            org.telegram.ui.Components.g00.h1(kzVar, roVar.a, new oy(kzVar, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                            String M032 = org.telegram.messenger.gd.M0(2131750779, null);
                            org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                            u1Var.S = M032;
                            u1Var.U = org.telegram.messenger.gd.M0(2131750778, null);
                            alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new ny(kzVar, i122));
                            kzVar.showDialog(u1Var);
                            TextView textView = (TextView) u1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                break;
                            }
                        }
                        break;
                    case 1:
                        kz.Z(kzVar);
                        break;
                    case 2:
                        kzVar.A0(true);
                        break;
                    case 3:
                        kzVar.e = true;
                        kzVar.C0();
                        break;
                    case 4:
                        kzVar.A0(false);
                        break;
                    default:
                        kzVar.f = true;
                        kzVar.C0();
                        break;
                }
            }
        };
        arrayList2.add(b10);
        int i13 = this.E;
        int i14 = org.telegram.messenger.mp.I8;
        if ((i13 & 1) != 0) {
            arrayList2.add(cz.c(1, org.telegram.messenger.gd.M0(2131750780, null), "contacts", true));
        }
        if ((this.E & 2) != 0) {
            arrayList2.add(cz.c(2, org.telegram.messenger.gd.M0(2131750707, null), "non_contacts", true));
        }
        final int i15 = 4;
        if ((this.E & 4) != 0) {
            arrayList2.add(cz.c(4, org.telegram.messenger.gd.M0(2131750763, null), "groups", true));
        }
        if ((this.E & 8) != 0) {
            arrayList2.add(cz.c(8, org.telegram.messenger.gd.M0(2131750789, null), "channels", true));
        }
        if ((this.E & 16) != 0) {
            arrayList2.add(cz.c(16, org.telegram.messenger.gd.M0(2131750790, null), "bots", true));
        }
        int i16 = 5;
        if (this.G.isEmpty()) {
            i7 = 5;
        } else {
            int size = (this.e || this.G.size() < 8) ? this.G.size() : Math.min(5, this.G.size());
            int i17 = 0;
            while (i17 < size) {
                long longValue = ((Long) this.G.get(i17)).longValue();
                int i18 = i16;
                cz czVar3 = new cz(1, false);
                czVar3.g = true;
                czVar3.h = longValue;
                arrayList2.add(czVar3);
                i17++;
                i16 = i18;
            }
            i7 = i16;
            if (size != this.G.size()) {
                cz b11 = cz.b(R.drawable.arrow_more, org.telegram.messenger.gd.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                final int i19 = 3;
                b11.c = new View.OnClickListener(this) { // from class: org.telegram.ui.ly
                    public final /* synthetic */ kz b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112 = i19;
                        int i122 = 1;
                        kz kzVar = this.b;
                        switch (i112) {
                            case 0:
                                org.telegram.messenger.ro roVar = kzVar.r;
                                if (roVar != null && roVar.c()) {
                                    org.telegram.ui.Components.g00.h1(kzVar, roVar.a, new oy(kzVar, 0));
                                    break;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                                    String M032 = org.telegram.messenger.gd.M0(2131750779, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                    u1Var.S = M032;
                                    u1Var.U = org.telegram.messenger.gd.M0(2131750778, null);
                                    alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new ny(kzVar, i122));
                                    kzVar.showDialog(u1Var);
                                    TextView textView = (TextView) u1Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                        break;
                                    }
                                }
                                break;
                            case 1:
                                kz.Z(kzVar);
                                break;
                            case 2:
                                kzVar.A0(true);
                                break;
                            case 3:
                                kzVar.e = true;
                                kzVar.C0();
                                break;
                            case 4:
                                kzVar.A0(false);
                                break;
                            default:
                                kzVar.f = true;
                                kzVar.C0();
                                break;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(cz.d(org.telegram.messenger.gd.M0(2131750761, null)));
        org.telegram.messenger.ro roVar = this.r;
        if (!roVar.c()) {
            String M04 = org.telegram.messenger.gd.M0(2131750767, null);
            cz czVar4 = new cz(0, false);
            czVar4.d = M04;
            arrayList2.add(czVar4);
            cz b12 = cz.b(R.drawable.msg2_chats_add, org.telegram.messenger.gd.M0(2131750704, null), false);
            b12.c = new View.OnClickListener(this) { // from class: org.telegram.ui.ly
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i15;
                    int i122 = 1;
                    kz kzVar = this.b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.ro roVar2 = kzVar.r;
                            if (roVar2 != null && roVar2.c()) {
                                org.telegram.ui.Components.g00.h1(kzVar, roVar2.a, new oy(kzVar, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                                String M032 = org.telegram.messenger.gd.M0(2131750779, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = M032;
                                u1Var.U = org.telegram.messenger.gd.M0(2131750778, null);
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new ny(kzVar, i122));
                                kzVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            kz.Z(kzVar);
                            break;
                        case 2:
                            kzVar.A0(true);
                            break;
                        case 3:
                            kzVar.e = true;
                            kzVar.C0();
                            break;
                        case 4:
                            kzVar.A0(false);
                            break;
                        default:
                            kzVar.f = true;
                            kzVar.C0();
                            break;
                    }
                }
            };
            arrayList2.add(b12);
            int i20 = this.E;
            int i21 = org.telegram.messenger.mp.I8;
            if ((i20 & 32) != 0) {
                arrayList2.add(cz.c(32, org.telegram.messenger.gd.M0(2131750725, null), "muted", false));
            }
            if ((this.E & 64) != 0) {
                arrayList2.add(cz.c(64, org.telegram.messenger.gd.M0(2131750706, null), "read", false));
            }
            if ((this.E & 128) != 0) {
                arrayList2.add(cz.c(128, org.telegram.messenger.gd.M0(2131750793, null), "archived", false));
            }
            if (!this.H.isEmpty()) {
                int size2 = (this.f || this.H.size() < 8) ? this.H.size() : Math.min(i7, this.H.size());
                for (int i22 = 0; i22 < size2; i22++) {
                    long longValue2 = ((Long) this.H.get(i22)).longValue();
                    cz czVar5 = new cz(1, false);
                    czVar5.g = false;
                    czVar5.h = longValue2;
                    arrayList2.add(czVar5);
                }
                if (size2 != this.H.size()) {
                    final int i23 = 5;
                    cz b13 = cz.b(R.drawable.arrow_more, org.telegram.messenger.gd.G(this.H.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b13.c = new View.OnClickListener(this) { // from class: org.telegram.ui.ly
                        public final /* synthetic */ kz b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i112 = i23;
                            int i122 = 1;
                            kz kzVar = this.b;
                            switch (i112) {
                                case 0:
                                    org.telegram.messenger.ro roVar2 = kzVar.r;
                                    if (roVar2 != null && roVar2.c()) {
                                        org.telegram.ui.Components.g00.h1(kzVar, roVar2.a, new oy(kzVar, 0));
                                        break;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                                        String M032 = org.telegram.messenger.gd.M0(2131750779, null);
                                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                        u1Var.S = M032;
                                        u1Var.U = org.telegram.messenger.gd.M0(2131750778, null);
                                        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                        alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new ny(kzVar, i122));
                                        kzVar.showDialog(u1Var);
                                        TextView textView = (TextView) u1Var.d(-1);
                                        if (textView != null) {
                                            org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                            break;
                                        }
                                    }
                                    break;
                                case 1:
                                    kz.Z(kzVar);
                                    break;
                                case 2:
                                    kzVar.A0(true);
                                    break;
                                case 3:
                                    kzVar.e = true;
                                    kzVar.C0();
                                    break;
                                case 4:
                                    kzVar.A0(false);
                                    break;
                                default:
                                    kzVar.f = true;
                                    kzVar.C0();
                                    break;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(cz.d(org.telegram.messenger.gd.M0(2131750766, null)));
        }
        if (getMessagesController().D7 || !getUserConfig().q()) {
            arrayList2.add(new cz(9, false));
            arrayList2.add(new cz(10, false));
            arrayList2.add(cz.d(org.telegram.messenger.gd.M0(2131750605, null)));
        }
        ArrayList arrayList3 = this.M;
        if (arrayList3.isEmpty()) {
            String M05 = org.telegram.messenger.gd.M0(2131750692, null);
            cz czVar6 = new cz(0, false);
            czVar6.d = M05;
            czVar6.f = true;
            arrayList2.add(czVar6);
            arrayList2.add(cz.b(R.drawable.msg2_link2, org.telegram.messenger.gd.M0(2131750691, null), false));
            arrayList2.add(cz.d(org.telegram.messenger.gd.M0(2131750732, null)));
        } else {
            String M06 = org.telegram.messenger.gd.M0(2131750734, null);
            cz czVar7 = new cz(0, false);
            czVar7.d = M06;
            czVar7.f = true;
            arrayList2.add(czVar7);
            arrayList2.add(new cz(8, false));
            for (int i24 = 0; i24 < arrayList3.size(); i24++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i24);
                cz czVar8 = new cz(7, false);
                czVar8.m = tL_exportedChatlistInvite;
                arrayList2.add(czVar8);
            }
            arrayList2.add(cz.d(roVar.c() ? org.telegram.messenger.gd.M0(2131750732, null) : org.telegram.messenger.gd.M0(2131750733, null)));
        }
        if (!this.s) {
            cz b14 = cz.b(0, org.telegram.messenger.gd.M0(2131750779, null), true);
            b14.c = new View.OnClickListener(this) { // from class: org.telegram.ui.ly
                public final /* synthetic */ kz b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i11;
                    int i122 = 1;
                    kz kzVar = this.b;
                    switch (i112) {
                        case 0:
                            org.telegram.messenger.ro roVar2 = kzVar.r;
                            if (roVar2 != null && roVar2.c()) {
                                org.telegram.ui.Components.g00.h1(kzVar, roVar2.a, new oy(kzVar, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(kzVar.getParentActivity());
                                String M032 = org.telegram.messenger.gd.M0(2131750779, null);
                                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                                u1Var.S = M032;
                                u1Var.U = org.telegram.messenger.gd.M0(2131750778, null);
                                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131751587, null), new ny(kzVar, i122));
                                kzVar.showDialog(u1Var);
                                TextView textView = (TextView) u1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.q7, null);
                                    break;
                                }
                            }
                            break;
                        case 1:
                            kz.Z(kzVar);
                            break;
                        case 2:
                            kzVar.A0(true);
                            break;
                        case 3:
                            kzVar.e = true;
                            kzVar.C0();
                            break;
                        case 4:
                            kzVar.A0(false);
                            break;
                        default:
                            kzVar.f = true;
                            kzVar.C0();
                            break;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(cz.d(null));
        }
        hz hzVar = this.b;
        if (hzVar != null) {
            hzVar.E(arrayList, arrayList2);
        }
    }

    public final void D0() {
        try {
            if (this.a == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.y6, false);
            int x03 = org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.Zl, false);
            if (x02 == this.W && x03 == this.X) {
                return;
            }
            this.W = x02;
            this.X = x03;
            int i7 = 0;
            while (i7 < 4) {
                int childCount = i7 == 0 ? this.a.getChildCount() : i7 == 1 ? this.a.getHiddenChildCount() : i7 == 2 ? this.a.getCachedChildCount() : this.a.getAttachedScrapChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    View childAt = i7 == 0 ? this.a.getChildAt(i10) : i7 == 1 ? this.a.V(i10) : i7 == 2 ? this.a.P(i10) : this.a.O(i10);
                    if (childAt instanceof org.telegram.ui.Cells.ra) {
                        org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) childAt;
                        raVar.b0 = true;
                        raVar.R = x02;
                        raVar.S = x03;
                        if (i7 != 0) {
                            ((org.telegram.ui.Cells.ra) childAt).i(0);
                        }
                    }
                }
                i7++;
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.li));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.s8));
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean canBeginSlide() {
        return n0(true);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final View createView(Context context) {
        int i7 = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.s;
        org.telegram.messenger.ro roVar = this.r;
        int i10 = 0;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.M0(2131750717, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(org.telegram.messenger.fj.B5(org.telegram.messenger.j6.m(roVar.b, titleFontMetricsInt, false, null, 0), roVar.c, titleFontMetricsInt, false));
            org.telegram.ui.ActionBar.a5 a5Var = this.simpleActionBar;
            if (a5Var != null) {
                if (a5Var.getTitleTextView() != null) {
                    this.simpleActionBar.getTitleTextView().setEmojiCacheType(this.y ? 0 : 26);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    this.simpleActionBar.getTitleTextView2().setEmojiCacheType(this.y ? 0 : 26);
                }
            }
        }
        int i11 = 4;
        this.simpleActionBar.setActionBarMenuOnItemClick(new dv(this, i11));
        this.c = this.simpleActionBar.s(org.telegram.messenger.gd.M0(this.s ? 2131751742 : 2131745751, null));
        v8 v8Var = new v8(i11, context, this);
        this.fragmentView = v8Var;
        et etVar = new et(i7, context, this);
        this.a = etVar;
        etVar.r1();
        this.a.setLayoutManager(new v4.c0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setSectionsDrawBackground(true);
        v8Var.addView(this.a, c8.ma.c(-1.0f, -1));
        et etVar2 = this.a;
        hz hzVar = new hz(this, context);
        this.b = hzVar;
        etVar2.setAdapter(hzVar);
        this.a.setOnItemClickListener(new h(this, 10));
        this.a.setOnItemLongClickListener(new ny(this, i10));
        v4.k kVar = new v4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(org.telegram.ui.Components.lr.h);
        kVar.n(350L);
        this.a.setItemAnimator(kVar);
        this.a.setOnScrollListener(new g3(this, 11));
        o0(false);
        if (!this.O && roVar != null && roVar.c()) {
            this.O = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = roVar.a;
            this.N = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new ry(this, i10));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final org.telegram.ui.Components.ck0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f6 f6Var = new f6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 16, new Class[]{org.telegram.ui.Cells.o4.class, org.telegram.ui.Cells.n8.class, org.telegram.ui.Cells.ra.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 262144, new Class[]{org.telegram.ui.Cells.n8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.a, 0, new Class[]{org.telegram.ui.Cells.ra.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, f6Var, org.telegram.ui.ActionBar.n6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean n0(boolean z10) {
        if (!this.c.x.f) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        boolean z11 = this.s;
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        if (z11) {
            u1Var.S = org.telegram.messenger.gd.M0(2131750772, null);
            u1Var.U = org.telegram.messenger.gd.M0(2131750774, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131750773, null), new ny(this, 2));
        } else {
            u1Var.S = org.telegram.messenger.gd.M0(2131750771, null);
            u1Var.U = org.telegram.messenger.gd.M0(2131750775, null);
            alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131754214, null), new ny(this, 3));
        }
        alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131747387, null), new ny(this, 4));
        showDialog(u1Var);
        return false;
    }

    public final void o0(boolean z10) {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.x) && this.x.length() <= 12;
        if (z12) {
            z12 = ((this.E & org.telegram.messenger.mp.J8) == 0 && this.G.isEmpty()) ? false : true;
            if (z12 && !this.s) {
                this.h = false;
                org.telegram.messenger.ro roVar = this.r;
                if (roVar.h.size() != this.G.size()) {
                    this.h = true;
                }
                if (roVar.i.size() != this.H.size()) {
                    this.h = true;
                }
                if (roVar.m != this.F) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(roVar.h);
                    Collections.sort(this.G);
                    if (!roVar.h.equals(this.G)) {
                        this.h = true;
                    }
                    Collections.sort(roVar.i);
                    Collections.sort(this.H);
                    if (!roVar.i.equals(this.H)) {
                        this.h = true;
                    }
                }
                if (roVar.n == (!this.y) && TextUtils.equals(roVar.b, this.x) && roVar.g == this.E) {
                    z11 = this.h;
                }
                z12 = z11;
            }
        }
        this.c.a(z12, z10);
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.g3 g3Var;
        fz fzVar = this.L;
        if (fzVar == null || (g3Var = fzVar.b) == null || !g3Var.e) {
            return n0(z10);
        }
        if (!z10) {
            return false;
        }
        g3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean onFragmentCreate() {
        C0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.N != 0) {
            getConnectionsManager().cancelRequest(this.N, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onInsets(int i7, int i10, int i11, int i12) {
        fz fzVar;
        View view = this.fragmentView;
        if (view == null || (fzVar = this.L) == null || !fzVar.b.e) {
            return;
        }
        view.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onResume() {
        super.onResume();
        C0();
        di.x7 x7Var = this.U;
        if (x7Var != null) {
            x7Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final void onThemeColorsChanged() {
        org.telegram.ui.Cells.g3 g3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            D0();
            try {
                fz fzVar = this.L;
                if (fzVar != null && (g3Var = fzVar.b) != null && g3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.n6.Fi)) != this.V) {
                    this.V = themedColor;
                    this.L.b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    public final void p0() {
        String M0;
        if (this.s) {
            if (TextUtils.isEmpty(this.x) || !this.n) {
                int i7 = this.E;
                int i10 = org.telegram.messenger.mp.J8;
                int i11 = i7 & i10;
                if ((i11 & i10) == i10) {
                    if ((i7 & 64) != 0) {
                        M0 = org.telegram.messenger.gd.M0(2131750719, null);
                    } else {
                        if ((i7 & 32) != 0) {
                            M0 = org.telegram.messenger.gd.M0(2131750720, null);
                        }
                        M0 = "";
                    }
                } else if ((i11 & 1) != 0) {
                    if ((i11 & (-2)) == 0) {
                        M0 = org.telegram.messenger.gd.M0(2131750780, null);
                    }
                    M0 = "";
                } else if ((i11 & 2) != 0) {
                    if ((i11 & (-3)) == 0) {
                        M0 = org.telegram.messenger.gd.M0(2131750707, null);
                    }
                    M0 = "";
                } else if ((i11 & 4) != 0) {
                    if ((i11 & (-5)) == 0) {
                        M0 = org.telegram.messenger.gd.M0(2131750763, null);
                    }
                    M0 = "";
                } else if ((i11 & 16) != 0) {
                    if ((i11 & (-17)) == 0) {
                        M0 = org.telegram.messenger.gd.M0(2131750790, null);
                    }
                    M0 = "";
                } else {
                    if ((i11 & 8) != 0 && (i11 & (-9)) == 0) {
                        M0 = org.telegram.messenger.gd.M0(2131750789, null);
                    }
                    M0 = "";
                }
                String str = (M0 == null || M0.length() <= 12) ? M0 : "";
                this.x = str;
                az azVar = this.J;
                if (azVar != null) {
                    azVar.e(org.telegram.ui.Components.x5.cloneSpans(str, -1, azVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                v4.f1 K = this.a.K(this.d);
                if (K != null) {
                    this.b.y(K);
                }
            }
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            arrayList = this.M;
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i7)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 >= 0) {
            arrayList.remove(i7);
            if (arrayList.isEmpty()) {
                org.telegram.messenger.ro roVar = this.r;
                int i10 = roVar.g;
                int i11 = org.telegram.messenger.mp.I8;
                roVar.g = i10 & (-513);
            }
            C0();
        }
    }

    public final void s0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i7 = 0;
        while (true) {
            arrayList = this.M;
            if (i7 >= arrayList.size()) {
                i7 = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i7)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i7, tL_exportedChatlistInvite);
        }
        C0();
    }

    public final void t0(int i7, boolean z10) {
        org.telegram.messenger.ro roVar;
        if (!this.T && (roVar = this.r) != null && roVar.c() && roVar.e()) {
            this.T = true;
            this.U = new di.x7(this, z10, i7, 7);
            if (getLayoutContainer() != null) {
                this.U.run();
                this.U = null;
            }
        }
    }

    public final void u0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        int size;
        int i7;
        if (arrayList != null) {
            i7 = 0;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!arrayList2.contains(arrayList.get(i10))) {
                    i7++;
                }
            }
            size = 0;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                if (!arrayList.contains(arrayList2.get(i11))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            i7 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            i7 = 0;
        }
        if (!z10) {
            if (size > 0) {
                t0(size, false);
            }
        } else if (size > 0 && size > i7) {
            t0(size, true);
        } else if (i7 > 0) {
            t0(i7, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.h2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        hi.m3 m3Var = this.S;
        if (m3Var != null) {
            m3Var.f(true);
            this.S = null;
        }
        y0(new py(this, 0), true);
    }

    public final void y0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.x};
        z0(this.r, this.E, charSequenceArr[0].toString(), getMediaDataController().Y(charSequenceArr, false, true), true ^ this.y, this.F, this.G, this.H, this.I, this.s, false, this.h, true, z10, this, new vs(13, this, runnable));
    }
}
