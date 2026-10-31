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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class i00 extends org.telegram.ui.ActionBar.k2 {
    public int D;
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public yz I;
    public zz J;
    public d00 K;
    public final ArrayList L;
    public int M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public float Q;
    public ij R;
    public boolean S;
    public i2.j0 T;
    public int U;
    public int V;
    public int W;
    public ag.b1 a;
    public f00 b;
    public org.telegram.ui.ActionBar.l5 c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final org.telegram.messenger.ap r;
    public boolean s;
    public boolean w;
    public CharSequence x;
    public boolean y;

    public i00(org.telegram.messenger.ap apVar, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.y = true;
        this.L = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = -5.0f;
        this.r = apVar;
        if (apVar == null) {
            org.telegram.messenger.ap apVar2 = new org.telegram.messenger.ap();
            this.r = apVar2;
            apVar2.a = 2;
            while (getMessagesController().S0.get(this.r.a) != null) {
                this.r.a++;
            }
            org.telegram.messenger.ap apVar3 = this.r;
            apVar3.b = "";
            apVar3.m = (int) (Math.random() * 8.0d);
            this.s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r.b);
        this.x = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.x = m10;
        this.x = org.telegram.messenger.jj.A5(m10, this.r.c, textPaint.getFontMetricsInt(), false);
        boolean z10 = !this.r.n;
        this.y = z10;
        org.telegram.ui.Components.f5.r(this.currentAccount, z10);
        org.telegram.messenger.ap apVar4 = this.r;
        this.D = apVar4.g;
        this.E = apVar4.m;
        ArrayList arrayList2 = new ArrayList(this.r.h);
        this.F = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.G = new ArrayList(this.r.i);
        this.H = this.r.j.clone();
    }

    public static CharSequence D0(int i10, CharSequence charSequence, boolean z10) {
        Context context;
        if (i10 >= 0) {
            if (!org.telegram.messenger.vp.d1().getBoolean("n_" + i10, false) && (context = org.telegram.messenger.w0.b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable f7 = i0.a.f(context, R.drawable.msg_other_new_outline);
                    f7.setBounds(0, -org.telegram.messenger.i0.L(8.0f), f7.getIntrinsicWidth(), f7.getIntrinsicHeight() - org.telegram.messenger.i0.L(8.0f));
                    spannableString.setSpan(new rz(f7, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable f10 = i0.a.f(context, R.drawable.msg_other_new_filled);
                    Drawable f11 = i0.a.f(context, R.drawable.msg_other_new_filled_text);
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Hi, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    f10.setColorFilter(new PorterDuffColorFilter(x02, mode));
                    f11.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Gi, false), mode));
                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(f10, f11);
                    eqVar.setBounds(0, 0, eqVar.getIntrinsicWidth(), eqVar.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(eqVar, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return charSequence;
    }

    public static void Y(i00 i00Var) {
        i00Var.y = !i00Var.y;
        zz zzVar = i00Var.J;
        if (zzVar != null) {
            org.telegram.ui.Cells.y3 y3Var = zzVar.r;
            String str = null;
            if (p0(i00Var.x)) {
                str = org.telegram.messenger.cd.L0(i00Var.y ? 2131750736 : 2131750735, null);
            }
            y3Var.setText(str);
        }
        org.telegram.ui.Components.f5.r(i00Var.currentAccount, i00Var.y);
        i00Var.n0(true);
        org.telegram.ui.ActionBar.i5 i5Var = i00Var.simpleActionBar;
        if (i5Var != null) {
            if (i5Var.getTitleTextView() != null) {
                i00Var.simpleActionBar.getTitleTextView().setEmojiCacheType(i00Var.y ? 0 : 26);
            }
            if (i00Var.simpleActionBar.getTitleTextView2() != null) {
                i00Var.simpleActionBar.getTitleTextView2().setEmojiCacheType(i00Var.y ? 0 : 26);
            }
        }
    }

    public static void Z(i00 i00Var) {
        org.telegram.messenger.ap apVar = i00Var.r;
        if (!i00Var.w) {
            i00Var.finishFragment();
            return;
        }
        i00Var.w = false;
        Paint.FontMetricsInt titleFontMetricsInt = i00Var.simpleActionBar.getTitleFontMetricsInt();
        Spannable A5 = org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(apVar.b, titleFontMetricsInt, false, null, 0), apVar.c, titleFontMetricsInt, false);
        org.telegram.ui.ActionBar.i5 i5Var = i00Var.simpleActionBar;
        i5Var.getClass();
        i5Var.B(A5, true, 220L, org.telegram.ui.Components.gr.h);
    }

    public static void a0(i00 i00Var) {
        org.telegram.messenger.vp messagesController = i00Var.getMessagesController();
        org.telegram.messenger.ap apVar = i00Var.r;
        messagesController.h5(apVar);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < apVar.h.size(); i10++) {
            long longValue = ((Long) apVar.h.get(i10)).longValue();
            if (longValue < 0 && l0(i00Var.getMessagesController().L0(Long.valueOf(-longValue)))) {
                arrayList.add(i00Var.getMessagesController().i1(longValue));
            }
        }
        if (arrayList.size() > (i00Var.getUserConfig().q() ? i00Var.getMessagesController().P4 : i00Var.getMessagesController().O4)) {
            i00Var.showDialog(new kg.q0(4, i00Var.currentAccount, i00Var.getParentActivity(), i00Var, null));
            return;
        }
        if (arrayList.isEmpty()) {
            iz izVar = new iz(apVar, null);
            izVar.y = new lz(i00Var, 1);
            izVar.x = new lz(i00Var, 2);
            i00Var.presentFragment(izVar);
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = apVar.a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        i00Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new oz(i00Var, 1));
    }

    public static boolean l0(TLRPC.Chat chat) {
        if (org.telegram.messenger.w3.y(3, chat)) {
            return true;
        }
        return org.telegram.messenger.w3.t0(chat) && !chat.join_request;
    }

    public static boolean p0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.o5.class);
            if (o5VarArr != null && o5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void u0(org.telegram.messenger.ap apVar, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.k2 k2Var, Runnable runnable) {
        if (apVar.g != i10 || z13) {
            apVar.e = -1;
            if (z14) {
                apVar.d = -1;
            }
        }
        apVar.g = i10;
        apVar.b = str;
        apVar.c = arrayList;
        apVar.m = i11;
        apVar.i = arrayList3;
        apVar.h = arrayList2;
        apVar.n = z10;
        if (z11) {
            k2Var.getMessagesController().g(apVar, z12);
        } else {
            k2Var.getMessagesController().t3(apVar);
        }
        org.telegram.messenger.hs messagesStorage = k2Var.getMessagesStorage();
        messagesStorage.a.c(new org.telegram.messenger.wf(messagesStorage, apVar, z12, 9));
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList S0 = k2Var.getMessagesController().S0();
            int size = S0.size();
            for (int i12 = 0; i12 < size; i12 = c3.i0.j(((org.telegram.messenger.ap) S0.get(i12)).a, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            k2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void w0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.Components.cc ccVar) {
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            return;
        }
        if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            new kg.q0(4, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
            return;
        }
        if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
            org.telegram.messenger.m5.o(null, 2131750654, ccVar, null);
            return;
        }
        if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.m5.o(null, 2131750653, ccVar, null);
            return;
        }
        if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            new kg.q0(5, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
            return;
        }
        if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
            new kg.q0(12, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
            return;
        }
        if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            new kg.q0(13, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
            return;
        }
        if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
            org.telegram.messenger.m5.o(null, 2131748226, ccVar, null);
            return;
        }
        if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
            new kg.q0(4, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
        } else if (!"DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
            org.telegram.messenger.m5.o(null, 2131743904, ccVar, null);
        } else {
            new kg.q0(3, k2Var.getCurrentAccount(), k2Var.getContext(), k2Var, null).show();
        }
    }

    public static void y0(final org.telegram.messenger.ap apVar, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.k2 k2Var, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (k2Var == null || k2Var.getParentActivity() == null) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = null;
        int i12 = 3;
        if (z15) {
            org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, k2Var.getParentActivity(), null);
            x1Var2.i0 = false;
            x1Var2.show();
            x1Var = x1Var2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.id = apVar.a;
        int i13 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i14 = org.telegram.messenger.vp.D8;
        tL_dialogFilter.contacts = (i10 & 1) != 0;
        tL_dialogFilter.non_contacts = (i10 & 2) != 0;
        tL_dialogFilter.groups = (i10 & 4) != 0;
        tL_dialogFilter.broadcasts = (i10 & 8) != 0;
        tL_dialogFilter.bots = (i10 & 16) != 0;
        tL_dialogFilter.exclude_muted = (i10 & 32) != 0;
        tL_dialogFilter.exclude_read = (i10 & 64) != 0;
        tL_dialogFilter.exclude_archived = (i10 & 128) != 0;
        tL_dialogFilter.id = apVar.a;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z10;
        if (i11 < 0) {
            tL_dialogFilter2.flags &= -134217729;
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags |= TLObject.FLAG_27;
            tL_dialogFilter2.color = i11;
        }
        org.telegram.messenger.vp messagesController = k2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!org.telegram.messenger.o5.C(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new ot(longSparseIntArray, i13));
        }
        int i16 = 0;
        while (i16 < i12) {
            if (i16 == 0) {
                arrayList4 = tL_messages_updateDialogFilter.filter.include_peers;
                arrayList5 = arrayList2;
            } else if (i16 == i13) {
                arrayList4 = tL_messages_updateDialogFilter.filter.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_messages_updateDialogFilter.filter.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            int i17 = 0;
            while (i17 < size2) {
                Long l4 = (Long) arrayList5.get(i17);
                org.telegram.ui.ActionBar.x1 x1Var3 = x1Var;
                int i18 = size2;
                long longValue = l4.longValue();
                if ((i16 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !org.telegram.messenger.o5.C(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User Z1 = messagesController.Z1(l4);
                        if (Z1 != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = Z1.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j10 = -longValue;
                        TLRPC.Chat L0 = messagesController.L0(Long.valueOf(j10));
                        if (L0 != null) {
                            if (org.telegram.messenger.w3.T(L0)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j10;
                                tL_inputPeerChannel.access_hash = L0.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j10;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i17++;
                x1Var = x1Var3;
                size2 = i18;
            }
            i16++;
            i12 = 3;
            i13 = 1;
        }
        final org.telegram.ui.ActionBar.x1 x1Var4 = x1Var;
        k2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() { // from class: org.telegram.ui.nz
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.x1 x1Var5 = x1Var4;
                final org.telegram.messenger.ap apVar2 = apVar;
                final int i19 = i10;
                final String str2 = str;
                final ArrayList arrayList7 = arrayList;
                final boolean z17 = z10;
                final int i20 = i11;
                final ArrayList arrayList8 = arrayList2;
                final ArrayList arrayList9 = arrayList3;
                final boolean z18 = z11;
                final boolean z19 = z12;
                final boolean z20 = z13;
                final boolean z21 = z14;
                final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                final Runnable runnable2 = runnable;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.pz
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z22 = z16;
                        Runnable runnable3 = runnable2;
                        if (!z22) {
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        } else {
                            org.telegram.ui.ActionBar.x1 x1Var6 = x1Var5;
                            if (x1Var6 != null) {
                                try {
                                    x1Var6.dismiss();
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                }
                            }
                            i00.u0(apVar2, i19, str2, arrayList7, z17, i20, arrayList8, arrayList9, z18, z19, z20, z21, k2Var2, runnable3);
                        }
                    }
                });
            }
        });
        if (z15) {
            return;
        }
        u0(apVar, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, k2Var, null);
    }

    public final void A0(a00 a00Var, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        if (z10) {
            x1Var.R = org.telegram.messenger.cd.L0(2131750710, null);
            if (obj instanceof String) {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750711, charSequence);
            } else if (obj instanceof TLRPC.User) {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750709, charSequence);
            } else {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750712, charSequence);
            }
        } else {
            x1Var.R = org.telegram.messenger.cd.L0(2131750715, null);
            if (obj instanceof String) {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750716, charSequence);
            } else if (obj instanceof TLRPC.User) {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750714, charSequence);
            } else {
                x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131750717, charSequence);
            }
        }
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131744873, null), new ag.v0(this, a00Var, z10, 6));
        showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        }
    }

    public final void B0() {
        ArrayList arrayList = this.O;
        arrayList.clear();
        ArrayList arrayList2 = this.P;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String L0 = org.telegram.messenger.cd.L0(2131750734, null);
        String L02 = p0(this.x) ? org.telegram.messenger.cd.L0(this.y ? 2131750736 : 2131750735, null) : null;
        final int i10 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.jz
            public final /* synthetic */ i00 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                int i12 = 1;
                i00 i00Var = this.b;
                switch (i11) {
                    case 0:
                        i00Var.f = true;
                        i00Var.B0();
                        break;
                    case 1:
                        org.telegram.messenger.ap apVar = i00Var.r;
                        if (apVar != null && apVar.d()) {
                            org.telegram.ui.Components.j00.g1(i00Var, apVar.a, new lz(i00Var, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                            String L03 = org.telegram.messenger.cd.L0(2131750791, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L03;
                            x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, i12));
                            i00Var.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                break;
                            }
                        }
                        break;
                    case 2:
                        i00.Y(i00Var);
                        break;
                    case 3:
                        i00Var.z0(true);
                        break;
                    case 4:
                        i00Var.e = true;
                        i00Var.B0();
                        break;
                    default:
                        i00Var.z0(false);
                        break;
                }
            }
        };
        final int i11 = 0;
        a00 a00Var = new a00(11, false);
        a00Var.d = L0;
        a00Var.e = L02;
        a00Var.c = onClickListener;
        arrayList2.add(a00Var);
        this.d = arrayList2.size();
        arrayList2.add(new a00(2, false));
        arrayList2.add(a00.d(null));
        String L03 = org.telegram.messenger.cd.L0(2131750774, null);
        a00 a00Var2 = new a00(0, false);
        a00Var2.d = L03;
        arrayList2.add(a00Var2);
        a00 b10 = a00.b(R.drawable.msg2_chats_add, org.telegram.messenger.cd.L0(2131750814, null), false);
        final int i12 = 3;
        b10.c = new View.OnClickListener(this) { // from class: org.telegram.ui.jz
            public final /* synthetic */ i00 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                int i122 = 1;
                i00 i00Var = this.b;
                switch (i112) {
                    case 0:
                        i00Var.f = true;
                        i00Var.B0();
                        break;
                    case 1:
                        org.telegram.messenger.ap apVar = i00Var.r;
                        if (apVar != null && apVar.d()) {
                            org.telegram.ui.Components.j00.g1(i00Var, apVar.a, new lz(i00Var, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                            String L032 = org.telegram.messenger.cd.L0(2131750791, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L032;
                            x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, i122));
                            i00Var.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                break;
                            }
                        }
                        break;
                    case 2:
                        i00.Y(i00Var);
                        break;
                    case 3:
                        i00Var.z0(true);
                        break;
                    case 4:
                        i00Var.e = true;
                        i00Var.B0();
                        break;
                    default:
                        i00Var.z0(false);
                        break;
                }
            }
        };
        arrayList2.add(b10);
        int i13 = this.D;
        int i14 = org.telegram.messenger.vp.D8;
        final int i15 = 1;
        if ((i13 & 1) != 0) {
            arrayList2.add(a00.c(1, org.telegram.messenger.cd.L0(2131750792, null), "contacts", true));
        }
        if ((this.D & 2) != 0) {
            arrayList2.add(a00.c(2, org.telegram.messenger.cd.L0(2131750721, null), "non_contacts", true));
        }
        final int i16 = 4;
        if ((this.D & 4) != 0) {
            arrayList2.add(a00.c(4, org.telegram.messenger.cd.L0(2131750775, null), "groups", true));
        }
        if ((this.D & 8) != 0) {
            arrayList2.add(a00.c(8, org.telegram.messenger.cd.L0(2131750801, null), "channels", true));
        }
        if ((this.D & 16) != 0) {
            arrayList2.add(a00.c(16, org.telegram.messenger.cd.L0(2131750802, null), "bots", true));
        }
        final int i17 = 5;
        if (!this.F.isEmpty()) {
            int size = (this.e || this.F.size() < 8) ? this.F.size() : Math.min(5, this.F.size());
            for (int i18 = 0; i18 < size; i18++) {
                long longValue = ((Long) this.F.get(i18)).longValue();
                a00 a00Var3 = new a00(1, false);
                a00Var3.g = true;
                a00Var3.h = longValue;
                arrayList2.add(a00Var3);
            }
            if (size != this.F.size()) {
                a00 b11 = a00.b(R.drawable.arrow_more, org.telegram.messenger.cd.G(this.F.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b11.c = new View.OnClickListener(this) { // from class: org.telegram.ui.jz
                    public final /* synthetic */ i00 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112 = i16;
                        int i122 = 1;
                        i00 i00Var = this.b;
                        switch (i112) {
                            case 0:
                                i00Var.f = true;
                                i00Var.B0();
                                break;
                            case 1:
                                org.telegram.messenger.ap apVar = i00Var.r;
                                if (apVar != null && apVar.d()) {
                                    org.telegram.ui.Components.j00.g1(i00Var, apVar.a, new lz(i00Var, 0));
                                    break;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                                    String L032 = org.telegram.messenger.cd.L0(2131750791, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L032;
                                    x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, i122));
                                    i00Var.showDialog(x1Var);
                                    TextView textView = (TextView) x1Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                i00.Y(i00Var);
                                break;
                            case 3:
                                i00Var.z0(true);
                                break;
                            case 4:
                                i00Var.e = true;
                                i00Var.B0();
                                break;
                            default:
                                i00Var.z0(false);
                                break;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(a00.d(org.telegram.messenger.cd.L0(2131750773, null)));
        org.telegram.messenger.ap apVar = this.r;
        if (!apVar.d()) {
            String L04 = org.telegram.messenger.cd.L0(2131750779, null);
            a00 a00Var4 = new a00(0, false);
            a00Var4.d = L04;
            arrayList2.add(a00Var4);
            a00 b12 = a00.b(R.drawable.msg2_chats_add, org.telegram.messenger.cd.L0(2131750718, null), false);
            b12.c = new View.OnClickListener(this) { // from class: org.telegram.ui.jz
                public final /* synthetic */ i00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i17;
                    int i122 = 1;
                    i00 i00Var = this.b;
                    switch (i112) {
                        case 0:
                            i00Var.f = true;
                            i00Var.B0();
                            break;
                        case 1:
                            org.telegram.messenger.ap apVar2 = i00Var.r;
                            if (apVar2 != null && apVar2.d()) {
                                org.telegram.ui.Components.j00.g1(i00Var, apVar2.a, new lz(i00Var, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                                String L032 = org.telegram.messenger.cd.L0(2131750791, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L032;
                                x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, i122));
                                i00Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            i00.Y(i00Var);
                            break;
                        case 3:
                            i00Var.z0(true);
                            break;
                        case 4:
                            i00Var.e = true;
                            i00Var.B0();
                            break;
                        default:
                            i00Var.z0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b12);
            int i19 = this.D;
            int i20 = org.telegram.messenger.vp.D8;
            if ((i19 & 32) != 0) {
                arrayList2.add(a00.c(32, org.telegram.messenger.cd.L0(2131750737, null), "muted", false));
            }
            if ((this.D & 64) != 0) {
                arrayList2.add(a00.c(64, org.telegram.messenger.cd.L0(2131750720, null), "read", false));
            }
            if ((this.D & 128) != 0) {
                arrayList2.add(a00.c(128, org.telegram.messenger.cd.L0(2131750805, null), "archived", false));
            }
            if (!this.G.isEmpty()) {
                int size2 = (this.f || this.G.size() < 8) ? this.G.size() : Math.min(5, this.G.size());
                for (int i21 = 0; i21 < size2; i21++) {
                    long longValue2 = ((Long) this.G.get(i21)).longValue();
                    a00 a00Var5 = new a00(1, false);
                    a00Var5.g = false;
                    a00Var5.h = longValue2;
                    arrayList2.add(a00Var5);
                }
                if (size2 != this.G.size()) {
                    a00 b13 = a00.b(R.drawable.arrow_more, org.telegram.messenger.cd.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b13.c = new View.OnClickListener(this) { // from class: org.telegram.ui.jz
                        public final /* synthetic */ i00 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i112 = i11;
                            int i122 = 1;
                            i00 i00Var = this.b;
                            switch (i112) {
                                case 0:
                                    i00Var.f = true;
                                    i00Var.B0();
                                    break;
                                case 1:
                                    org.telegram.messenger.ap apVar2 = i00Var.r;
                                    if (apVar2 != null && apVar2.d()) {
                                        org.telegram.ui.Components.j00.g1(i00Var, apVar2.a, new lz(i00Var, 0));
                                        break;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                                        String L032 = org.telegram.messenger.cd.L0(2131750791, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                        x1Var.R = L032;
                                        x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, i122));
                                        i00Var.showDialog(x1Var);
                                        TextView textView = (TextView) x1Var.d(-1);
                                        if (textView != null) {
                                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    i00.Y(i00Var);
                                    break;
                                case 3:
                                    i00Var.z0(true);
                                    break;
                                case 4:
                                    i00Var.e = true;
                                    i00Var.B0();
                                    break;
                                default:
                                    i00Var.z0(false);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(a00.d(org.telegram.messenger.cd.L0(2131750778, null)));
        }
        if (getMessagesController().B7 || !getUserConfig().q()) {
            arrayList2.add(new a00(9, false));
            arrayList2.add(new a00(10, false));
            arrayList2.add(a00.d(org.telegram.messenger.cd.L0(2131750622, null)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String L05 = org.telegram.messenger.cd.L0(2131750706, null);
            a00 a00Var6 = new a00(0, false);
            a00Var6.d = L05;
            a00Var6.f = true;
            arrayList2.add(a00Var6);
            arrayList2.add(a00.b(R.drawable.msg2_link2, org.telegram.messenger.cd.L0(2131750705, null), false));
            arrayList2.add(a00.d(org.telegram.messenger.cd.L0(2131750744, null)));
        } else {
            String L06 = org.telegram.messenger.cd.L0(2131750746, null);
            a00 a00Var7 = new a00(0, false);
            a00Var7.d = L06;
            a00Var7.f = true;
            arrayList2.add(a00Var7);
            arrayList2.add(new a00(8, false));
            for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i22);
                a00 a00Var8 = new a00(7, false);
                a00Var8.m = tL_exportedChatlistInvite;
                arrayList2.add(a00Var8);
            }
            arrayList2.add(a00.d(apVar.d() ? org.telegram.messenger.cd.L0(2131750744, null) : org.telegram.messenger.cd.L0(2131750745, null)));
        }
        if (!this.s) {
            a00 b14 = a00.b(0, org.telegram.messenger.cd.L0(2131750791, null), true);
            b14.c = new View.OnClickListener(this) { // from class: org.telegram.ui.jz
                public final /* synthetic */ i00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i15;
                    int i122 = 1;
                    i00 i00Var = this.b;
                    switch (i112) {
                        case 0:
                            i00Var.f = true;
                            i00Var.B0();
                            break;
                        case 1:
                            org.telegram.messenger.ap apVar2 = i00Var.r;
                            if (apVar2 != null && apVar2.d()) {
                                org.telegram.ui.Components.j00.g1(i00Var, apVar2.a, new lz(i00Var, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i00Var.getParentActivity());
                                String L032 = org.telegram.messenger.cd.L0(2131750791, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L032;
                                x1Var.T = org.telegram.messenger.cd.L0(2131750790, null);
                                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new kz(i00Var, i122));
                                i00Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            i00.Y(i00Var);
                            break;
                        case 3:
                            i00Var.z0(true);
                            break;
                        case 4:
                            i00Var.e = true;
                            i00Var.B0();
                            break;
                        default:
                            i00Var.z0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(a00.d(null));
        }
        f00 f00Var = this.b;
        if (f00Var != null) {
            f00Var.E(arrayList, arrayList2);
        }
    }

    public final void C0() {
        try {
            if (this.a == null) {
                return;
            }
            int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.y6, false);
            int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wl, false);
            if (x02 == this.V && x03 == this.W) {
                return;
            }
            this.V = x02;
            this.W = x03;
            int i10 = 0;
            while (i10 < 4) {
                int childCount = i10 == 0 ? this.a.getChildCount() : i10 == 1 ? this.a.getHiddenChildCount() : i10 == 2 ? this.a.getCachedChildCount() : this.a.getAttachedScrapChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = i10 == 0 ? this.a.getChildAt(i11) : i10 == 1 ? this.a.V(i11) : i10 == 2 ? this.a.P(i11) : this.a.O(i11);
                    if (childAt instanceof org.telegram.ui.Cells.pa) {
                        org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) childAt;
                        paVar.a0 = true;
                        paVar.Q = x02;
                        paVar.R = x03;
                        if (i10 != 0) {
                            ((org.telegram.ui.Cells.pa) childAt).i(0);
                        }
                    }
                }
                i10++;
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.m6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ii));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.s8));
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean canBeginSlide() {
        return m0(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.s;
        int i10 = 26;
        org.telegram.messenger.ap apVar = this.r;
        int i11 = 0;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131750729, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(org.telegram.messenger.jj.A5(org.telegram.messenger.k6.m(apVar.b, titleFontMetricsInt, false, null, 0), apVar.c, titleFontMetricsInt, false));
            org.telegram.ui.ActionBar.i5 i5Var = this.simpleActionBar;
            if (i5Var != null) {
                if (i5Var.getTitleTextView() != null) {
                    this.simpleActionBar.getTitleTextView().setEmojiCacheType(this.y ? 0 : 26);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    this.simpleActionBar.getTitleTextView2().setEmojiCacheType(this.y ? 0 : 26);
                }
            }
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ar(this, 22));
        this.c = this.simpleActionBar.n(org.telegram.messenger.cd.L0(this.s ? 2131751753 : 2131745963, null));
        w8 w8Var = new w8(this, context, 4);
        this.fragmentView = w8Var;
        ag.b1 b1Var = new ag.b1(this, context, i10);
        this.a = b1Var;
        b1Var.r1();
        this.a.setLayoutManager(new s4.a0(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setSectionsDrawBackground(true);
        w8Var.addView(this.a, w7.b6.c(-1.0f, -1));
        ag.b1 b1Var2 = this.a;
        f00 f00Var = new f00(this, context);
        this.b = f00Var;
        b1Var2.setAdapter(f00Var);
        this.a.setOnItemClickListener(new g(this, 10));
        this.a.setOnItemLongClickListener(new kz(this, i11));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        this.a.setItemAnimator(jVar);
        this.a.setOnScrollListener(new h3(this, 11));
        n0(false);
        if (!this.N && apVar != null && apVar.d()) {
            this.N = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = apVar.a;
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new oz(this, i11));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        g6 g6Var = new g6(8, this);
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 16, new Class[]{org.telegram.ui.Cells.p4.class, org.telegram.ui.Cells.p8.class, org.telegram.ui.Cells.pa.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.d6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.p7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.q6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 262144, new Class[]{org.telegram.ui.Cells.p8.class}, new String[]{"ImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.N6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.a, 0, new Class[]{org.telegram.ui.Cells.pa.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean m0(boolean z10) {
        if (!this.c.x.f) {
            return true;
        }
        if (!z10) {
            return false;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        boolean z11 = this.s;
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        if (z11) {
            x1Var.R = org.telegram.messenger.cd.L0(2131750784, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131750786, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131750785, null), new kz(this, 2));
        } else {
            x1Var.R = org.telegram.messenger.cd.L0(2131750783, null);
            x1Var.T = org.telegram.messenger.cd.L0(2131750787, null);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new kz(this, 3));
        }
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747596, null), new kz(this, 4));
        showDialog(x1Var);
        return false;
    }

    public final void n0(boolean z10) {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.x) && this.x.length() <= 12;
        if (z12) {
            z12 = ((this.D & org.telegram.messenger.vp.E8) == 0 && this.F.isEmpty()) ? false : true;
            if (z12 && !this.s) {
                this.h = false;
                org.telegram.messenger.ap apVar = this.r;
                if (apVar.h.size() != this.F.size()) {
                    this.h = true;
                }
                if (apVar.i.size() != this.G.size()) {
                    this.h = true;
                }
                if (apVar.m != this.E) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(apVar.h);
                    Collections.sort(this.F);
                    if (!apVar.h.equals(this.F)) {
                        this.h = true;
                    }
                    Collections.sort(apVar.i);
                    Collections.sort(this.G);
                    if (!apVar.i.equals(this.G)) {
                        this.h = true;
                    }
                }
                if (apVar.n == (!this.y) && TextUtils.equals(apVar.b, this.x) && apVar.g == this.D) {
                    z11 = this.h;
                }
                z12 = z11;
            }
        }
        this.c.a(z12, z10);
    }

    public final void o0() {
        String L0;
        if (this.s) {
            if (TextUtils.isEmpty(this.x) || !this.n) {
                int i10 = this.D;
                int i11 = org.telegram.messenger.vp.E8;
                int i12 = i10 & i11;
                if ((i12 & i11) == i11) {
                    if ((i10 & 64) != 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750731, null);
                    } else {
                        if ((i10 & 32) != 0) {
                            L0 = org.telegram.messenger.cd.L0(2131750732, null);
                        }
                        L0 = "";
                    }
                } else if ((i12 & 1) != 0) {
                    if ((i12 & (-2)) == 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750792, null);
                    }
                    L0 = "";
                } else if ((i12 & 2) != 0) {
                    if ((i12 & (-3)) == 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750721, null);
                    }
                    L0 = "";
                } else if ((i12 & 4) != 0) {
                    if ((i12 & (-5)) == 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750775, null);
                    }
                    L0 = "";
                } else if ((i12 & 16) != 0) {
                    if ((i12 & (-17)) == 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750802, null);
                    }
                    L0 = "";
                } else {
                    if ((i12 & 8) != 0 && (i12 & (-9)) == 0) {
                        L0 = org.telegram.messenger.cd.L0(2131750801, null);
                    }
                    L0 = "";
                }
                String str = (L0 == null || L0.length() <= 12) ? L0 : "";
                this.x = str;
                yz yzVar = this.I;
                if (yzVar != null) {
                    yzVar.e(org.telegram.ui.Components.o5.cloneSpans(str, -1, yzVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s4.c1 K = this.a.K(this.d);
                if (K != null) {
                    this.b.y(K);
                }
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.h3 h3Var;
        d00 d00Var = this.K;
        if (d00Var == null || (h3Var = d00Var.b) == null || !h3Var.e) {
            return m0(z10);
        }
        if (!z10) {
            return false;
        }
        h3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        B0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.M != 0) {
            getConnectionsManager().cancelRequest(this.M, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        d00 d00Var;
        View view = this.fragmentView;
        if (view == null || (d00Var = this.K) == null || !d00Var.b.e) {
            return;
        }
        view.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        B0();
        i2.j0 j0Var = this.T;
        if (j0Var != null) {
            j0Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onThemeColorsChanged() {
        org.telegram.ui.Cells.h3 h3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            C0();
            try {
                d00 d00Var = this.K;
                if (d00Var != null && (h3Var = d00Var.b) != null && h3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Ci)) != this.U) {
                    this.U = themedColor;
                    this.K.b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    public final void q0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.L;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i10)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 >= 0) {
            arrayList.remove(i10);
            if (arrayList.isEmpty()) {
                org.telegram.messenger.ap apVar = this.r;
                int i11 = apVar.g;
                int i12 = org.telegram.messenger.vp.D8;
                apVar.g = i11 & (-513);
            }
            B0();
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            arrayList = this.L;
            if (i10 >= arrayList.size()) {
                i10 = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i10)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i10, tL_exportedChatlistInvite);
        }
        B0();
    }

    public final void s0(int i10, boolean z10) {
        org.telegram.messenger.ap apVar;
        if (!this.S && (apVar = this.r) != null && apVar.d() && apVar.f()) {
            this.S = true;
            this.T = new i2.j0(this, z10, i10, 6);
            if (getLayoutContainer() != null) {
                this.T.run();
                this.T = null;
            }
        }
    }

    public final void t0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
        int size;
        int i10;
        if (arrayList != null) {
            i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                if (!arrayList2.contains(arrayList.get(i11))) {
                    i10++;
                }
            }
            size = 0;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                if (!arrayList.contains(arrayList2.get(i12))) {
                    size++;
                }
            }
        } else if (arrayList != null) {
            i10 = arrayList.size();
            size = 0;
        } else {
            size = arrayList2.size();
            i10 = 0;
        }
        if (!z10) {
            if (size > 0) {
                s0(size, false);
            }
        } else if (size > 0 && size > i10) {
            s0(size, true);
        } else if (i10 > 0) {
            s0(i10, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void v0() {
        ij ijVar = this.R;
        if (ijVar != null) {
            ijVar.b(true);
            this.R = null;
        }
        x0(new mz(this, 0), true);
    }

    public final void x0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.x};
        y0(this.r, this.D, charSequenceArr[0].toString(), getMediaDataController().W(charSequenceArr, false, true), true ^ this.y, this.E, this.F, this.G, this.H, this.s, false, this.h, true, z10, this, new xs(15, this, runnable));
    }

    public final void z0(boolean z10) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.D, z10 ? this.F : this.G, z10);
        usersSelectActivity.F = this.r.d();
        usersSelectActivity.n = new ag.w0(10, this, z10);
        presentFragment(usersSelectActivity);
    }
}
