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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class h00 extends org.telegram.ui.ActionBar.k2 {
    public int D;
    public int E;
    public ArrayList F;
    public ArrayList G;
    public final LongSparseIntArray H;
    public xz I;
    public yz J;
    public c00 K;
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
    public e00 b;
    public org.telegram.ui.ActionBar.l5 c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final org.telegram.messenger.bp r;
    public boolean s;
    public boolean w;
    public CharSequence x;
    public boolean y;

    public h00(org.telegram.messenger.bp bpVar, ArrayList arrayList) {
        super(null);
        this.d = -1;
        this.y = true;
        this.L = new ArrayList();
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = -5.0f;
        this.r = bpVar;
        if (bpVar == null) {
            org.telegram.messenger.bp bpVar2 = new org.telegram.messenger.bp();
            this.r = bpVar2;
            bpVar2.a = 2;
            while (getMessagesController().S0.get(this.r.a) != null) {
                this.r.a++;
            }
            org.telegram.messenger.bp bpVar3 = this.r;
            bpVar3.b = "";
            bpVar3.m = (int) (Math.random() * 8.0d);
            this.s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(org.telegram.messenger.i0.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r.b);
        this.x = spannableStringBuilder;
        CharSequence m10 = org.telegram.messenger.k6.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.x = m10;
        this.x = org.telegram.messenger.kj.A5(m10, this.r.c, textPaint.getFontMetricsInt(), false);
        boolean z10 = !this.r.n;
        this.y = z10;
        org.telegram.ui.Components.f5.r(this.currentAccount, z10);
        org.telegram.messenger.bp bpVar4 = this.r;
        this.D = bpVar4.g;
        this.E = bpVar4.m;
        ArrayList arrayList2 = new ArrayList(this.r.h);
        this.F = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.G = new ArrayList(this.r.i);
        this.H = this.r.j.clone();
    }

    public static CharSequence E0(int i10, CharSequence charSequence, boolean z10) {
        Context context;
        if (i10 >= 0) {
            if (!org.telegram.messenger.wp.d1().getBoolean("n_" + i10, false) && (context = org.telegram.messenger.w0.b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z10) {
                    Drawable f7 = i0.a.f(context, R.drawable.msg_other_new_outline);
                    f7.setBounds(0, -org.telegram.messenger.i0.L(8.0f), f7.getIntrinsicWidth(), f7.getIntrinsicHeight() - org.telegram.messenger.i0.L(8.0f));
                    spannableString.setSpan(new qz(f7, 0), 0, spannableString.length(), 33);
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

    public static void Z(h00 h00Var) {
        h00Var.y = !h00Var.y;
        yz yzVar = h00Var.J;
        if (yzVar != null) {
            org.telegram.ui.Cells.y3 y3Var = yzVar.r;
            String str = null;
            if (q0(h00Var.x)) {
                str = org.telegram.messenger.dd.L0(h00Var.y ? 2131750736 : 2131750735, null);
            }
            y3Var.setText(str);
        }
        org.telegram.ui.Components.f5.r(h00Var.currentAccount, h00Var.y);
        h00Var.o0(true);
        org.telegram.ui.ActionBar.i5 i5Var = h00Var.simpleActionBar;
        if (i5Var != null) {
            if (i5Var.getTitleTextView() != null) {
                h00Var.simpleActionBar.getTitleTextView().setEmojiCacheType(h00Var.y ? 0 : 26);
            }
            if (h00Var.simpleActionBar.getTitleTextView2() != null) {
                h00Var.simpleActionBar.getTitleTextView2().setEmojiCacheType(h00Var.y ? 0 : 26);
            }
        }
    }

    public static void a0(h00 h00Var) {
        org.telegram.messenger.bp bpVar = h00Var.r;
        if (!h00Var.w) {
            h00Var.finishFragment();
            return;
        }
        h00Var.w = false;
        Paint.FontMetricsInt titleFontMetricsInt = h00Var.simpleActionBar.getTitleFontMetricsInt();
        Spannable A5 = org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(bpVar.b, titleFontMetricsInt, false, null, 0), bpVar.c, titleFontMetricsInt, false);
        org.telegram.ui.ActionBar.i5 i5Var = h00Var.simpleActionBar;
        i5Var.getClass();
        i5Var.B(A5, true, 220L, org.telegram.ui.Components.gr.h);
    }

    public static void b0(h00 h00Var) {
        org.telegram.messenger.wp messagesController = h00Var.getMessagesController();
        org.telegram.messenger.bp bpVar = h00Var.r;
        messagesController.h5(bpVar);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i10 = 0; i10 < bpVar.h.size(); i10++) {
            long longValue = ((Long) bpVar.h.get(i10)).longValue();
            if (longValue < 0 && m0(h00Var.getMessagesController().L0(Long.valueOf(-longValue)))) {
                arrayList.add(h00Var.getMessagesController().i1(longValue));
            }
        }
        if (arrayList.size() > (h00Var.getUserConfig().q() ? h00Var.getMessagesController().P4 : h00Var.getMessagesController().O4)) {
            h00Var.showDialog(new kg.q0(4, h00Var.currentAccount, h00Var.getParentActivity(), h00Var, null));
            return;
        }
        if (arrayList.isEmpty()) {
            hz hzVar = new hz(bpVar, null);
            hzVar.y = new kz(h00Var, 1);
            hzVar.x = new kz(h00Var, 2);
            h00Var.presentFragment(hzVar);
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = bpVar.a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        h00Var.getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new nz(h00Var, 1));
    }

    public static boolean m0(TLRPC.Chat chat) {
        if (org.telegram.messenger.w3.y(3, chat)) {
            return true;
        }
        return org.telegram.messenger.w3.t0(chat) && !chat.join_request;
    }

    public static boolean q0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            org.telegram.ui.Components.o5[] o5VarArr = (org.telegram.ui.Components.o5[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.o5.class);
            if (o5VarArr != null && o5VarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void v0(org.telegram.messenger.bp bpVar, int i10, String str, ArrayList arrayList, boolean z10, int i11, ArrayList arrayList2, ArrayList arrayList3, boolean z11, boolean z12, boolean z13, boolean z14, org.telegram.ui.ActionBar.k2 k2Var, Runnable runnable) {
        if (bpVar.g != i10 || z13) {
            bpVar.e = -1;
            if (z14) {
                bpVar.d = -1;
            }
        }
        bpVar.g = i10;
        bpVar.b = str;
        bpVar.c = arrayList;
        bpVar.m = i11;
        bpVar.i = arrayList3;
        bpVar.h = arrayList2;
        bpVar.n = z10;
        if (z11) {
            k2Var.getMessagesController().g(bpVar, z12);
        } else {
            k2Var.getMessagesController().t3(bpVar);
        }
        org.telegram.messenger.is messagesStorage = k2Var.getMessagesStorage();
        messagesStorage.a.c(new org.telegram.messenger.xf(messagesStorage, bpVar, z12, 9));
        if (z12) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList S0 = k2Var.getMessagesController().S0();
            int size = S0.size();
            for (int i12 = 0; i12 < size; i12 = c3.i0.j(((org.telegram.messenger.bp) S0.get(i12)).a, i12, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            k2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void x0(TLRPC.TL_error tL_error, org.telegram.ui.ActionBar.k2 k2Var, org.telegram.ui.Components.cc ccVar) {
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

    public static void z0(final org.telegram.messenger.bp bpVar, final int i10, final String str, final ArrayList arrayList, final boolean z10, final int i11, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z11, final boolean z12, final boolean z13, final boolean z14, final boolean z15, final org.telegram.ui.ActionBar.k2 k2Var, final Runnable runnable) {
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
        tL_messages_updateDialogFilter.id = bpVar.a;
        int i13 = 1;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i14 = org.telegram.messenger.wp.D8;
        tL_dialogFilter.contacts = (i10 & 1) != 0;
        tL_dialogFilter.non_contacts = (i10 & 2) != 0;
        tL_dialogFilter.groups = (i10 & 4) != 0;
        tL_dialogFilter.broadcasts = (i10 & 8) != 0;
        tL_dialogFilter.bots = (i10 & 16) != 0;
        tL_dialogFilter.exclude_muted = (i10 & 32) != 0;
        tL_dialogFilter.exclude_read = (i10 & 64) != 0;
        tL_dialogFilter.exclude_archived = (i10 & 128) != 0;
        tL_dialogFilter.id = bpVar.a;
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
        org.telegram.messenger.wp messagesController = k2Var.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i15 = 0; i15 < size; i15++) {
                long keyAt = longSparseIntArray.keyAt(i15);
                if (!org.telegram.messenger.o5.C(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new nt(longSparseIntArray, i13));
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
        k2Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() { // from class: org.telegram.ui.mz
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z16 = z15;
                final org.telegram.ui.ActionBar.x1 x1Var5 = x1Var4;
                final org.telegram.messenger.bp bpVar2 = bpVar;
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
                org.telegram.messenger.i0.g3(new Runnable() { // from class: org.telegram.ui.oz
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
                            h00.v0(bpVar2, i19, str2, arrayList7, z17, i20, arrayList8, arrayList9, z18, z19, z20, z21, k2Var2, runnable3);
                        }
                    }
                });
            }
        });
        if (z15) {
            return;
        }
        v0(bpVar, i10, str, arrayList, z10, i11, arrayList2, arrayList3, z11, z12, z13, z14, k2Var, null);
    }

    public final void A0(boolean z10) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.D, z10 ? this.F : this.G, z10);
        usersSelectActivity.F = this.r.d();
        usersSelectActivity.n = new ag.w0(10, this, z10);
        presentFragment(usersSelectActivity);
    }

    public final void B0(zz zzVar, CharSequence charSequence, Object obj, boolean z10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
        if (z10) {
            x1Var.R = org.telegram.messenger.dd.L0(2131750710, null);
            if (obj instanceof String) {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750711, charSequence);
            } else if (obj instanceof TLRPC.User) {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750709, charSequence);
            } else {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750712, charSequence);
            }
        } else {
            x1Var.R = org.telegram.messenger.dd.L0(2131750715, null);
            if (obj instanceof String) {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750716, charSequence);
            } else if (obj instanceof TLRPC.User) {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750714, charSequence);
            } else {
                x1Var.T = org.telegram.messenger.dd.a0(null, null, 2131750717, charSequence);
            }
        }
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131744873, null), new ag.v0(this, zzVar, z10, 6));
        showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
        }
    }

    public final void C0() {
        ArrayList arrayList = this.O;
        arrayList.clear();
        ArrayList arrayList2 = this.P;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        String L0 = org.telegram.messenger.dd.L0(2131750734, null);
        String L02 = q0(this.x) ? org.telegram.messenger.dd.L0(this.y ? 2131750736 : 2131750735, null) : null;
        final int i10 = 2;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: org.telegram.ui.iz
            public final /* synthetic */ h00 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i11 = i10;
                int i12 = 1;
                h00 h00Var = this.b;
                switch (i11) {
                    case 0:
                        h00Var.f = true;
                        h00Var.C0();
                        break;
                    case 1:
                        org.telegram.messenger.bp bpVar = h00Var.r;
                        if (bpVar != null && bpVar.d()) {
                            org.telegram.ui.Components.j00.g1(h00Var, bpVar.a, new kz(h00Var, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                            String L03 = org.telegram.messenger.dd.L0(2131750791, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L03;
                            x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, i12));
                            h00Var.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h00.Z(h00Var);
                        break;
                    case 3:
                        h00Var.A0(true);
                        break;
                    case 4:
                        h00Var.e = true;
                        h00Var.C0();
                        break;
                    default:
                        h00Var.A0(false);
                        break;
                }
            }
        };
        final int i11 = 0;
        zz zzVar = new zz(11, false);
        zzVar.d = L0;
        zzVar.e = L02;
        zzVar.c = onClickListener;
        arrayList2.add(zzVar);
        this.d = arrayList2.size();
        arrayList2.add(new zz(2, false));
        arrayList2.add(zz.d(null));
        String L03 = org.telegram.messenger.dd.L0(2131750774, null);
        zz zzVar2 = new zz(0, false);
        zzVar2.d = L03;
        arrayList2.add(zzVar2);
        zz b10 = zz.b(R.drawable.msg2_chats_add, org.telegram.messenger.dd.L0(2131750814, null), false);
        final int i12 = 3;
        b10.c = new View.OnClickListener(this) { // from class: org.telegram.ui.iz
            public final /* synthetic */ h00 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i112 = i12;
                int i122 = 1;
                h00 h00Var = this.b;
                switch (i112) {
                    case 0:
                        h00Var.f = true;
                        h00Var.C0();
                        break;
                    case 1:
                        org.telegram.messenger.bp bpVar = h00Var.r;
                        if (bpVar != null && bpVar.d()) {
                            org.telegram.ui.Components.j00.g1(h00Var, bpVar.a, new kz(h00Var, 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                            String L032 = org.telegram.messenger.dd.L0(2131750791, null);
                            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                            x1Var.R = L032;
                            x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                            alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, i122));
                            h00Var.showDialog(x1Var);
                            TextView textView = (TextView) x1Var.d(-1);
                            if (textView != null) {
                                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h00.Z(h00Var);
                        break;
                    case 3:
                        h00Var.A0(true);
                        break;
                    case 4:
                        h00Var.e = true;
                        h00Var.C0();
                        break;
                    default:
                        h00Var.A0(false);
                        break;
                }
            }
        };
        arrayList2.add(b10);
        int i13 = this.D;
        int i14 = org.telegram.messenger.wp.D8;
        final int i15 = 1;
        if ((i13 & 1) != 0) {
            arrayList2.add(zz.c(1, org.telegram.messenger.dd.L0(2131750792, null), "contacts", true));
        }
        if ((this.D & 2) != 0) {
            arrayList2.add(zz.c(2, org.telegram.messenger.dd.L0(2131750721, null), "non_contacts", true));
        }
        final int i16 = 4;
        if ((this.D & 4) != 0) {
            arrayList2.add(zz.c(4, org.telegram.messenger.dd.L0(2131750775, null), "groups", true));
        }
        if ((this.D & 8) != 0) {
            arrayList2.add(zz.c(8, org.telegram.messenger.dd.L0(2131750801, null), "channels", true));
        }
        if ((this.D & 16) != 0) {
            arrayList2.add(zz.c(16, org.telegram.messenger.dd.L0(2131750802, null), "bots", true));
        }
        final int i17 = 5;
        if (!this.F.isEmpty()) {
            int size = (this.e || this.F.size() < 8) ? this.F.size() : Math.min(5, this.F.size());
            for (int i18 = 0; i18 < size; i18++) {
                long longValue = ((Long) this.F.get(i18)).longValue();
                zz zzVar3 = new zz(1, false);
                zzVar3.g = true;
                zzVar3.h = longValue;
                arrayList2.add(zzVar3);
            }
            if (size != this.F.size()) {
                zz b11 = zz.b(R.drawable.arrow_more, org.telegram.messenger.dd.G(this.F.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b11.c = new View.OnClickListener(this) { // from class: org.telegram.ui.iz
                    public final /* synthetic */ h00 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i112 = i16;
                        int i122 = 1;
                        h00 h00Var = this.b;
                        switch (i112) {
                            case 0:
                                h00Var.f = true;
                                h00Var.C0();
                                break;
                            case 1:
                                org.telegram.messenger.bp bpVar = h00Var.r;
                                if (bpVar != null && bpVar.d()) {
                                    org.telegram.ui.Components.j00.g1(h00Var, bpVar.a, new kz(h00Var, 0));
                                    break;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                                    String L032 = org.telegram.messenger.dd.L0(2131750791, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                    x1Var.R = L032;
                                    x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                                    alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, i122));
                                    h00Var.showDialog(x1Var);
                                    TextView textView = (TextView) x1Var.d(-1);
                                    if (textView != null) {
                                        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                h00.Z(h00Var);
                                break;
                            case 3:
                                h00Var.A0(true);
                                break;
                            case 4:
                                h00Var.e = true;
                                h00Var.C0();
                                break;
                            default:
                                h00Var.A0(false);
                                break;
                        }
                    }
                };
                arrayList2.add(b11);
            }
        }
        arrayList2.add(zz.d(org.telegram.messenger.dd.L0(2131750773, null)));
        org.telegram.messenger.bp bpVar = this.r;
        if (!bpVar.d()) {
            String L04 = org.telegram.messenger.dd.L0(2131750779, null);
            zz zzVar4 = new zz(0, false);
            zzVar4.d = L04;
            arrayList2.add(zzVar4);
            zz b12 = zz.b(R.drawable.msg2_chats_add, org.telegram.messenger.dd.L0(2131750718, null), false);
            b12.c = new View.OnClickListener(this) { // from class: org.telegram.ui.iz
                public final /* synthetic */ h00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i17;
                    int i122 = 1;
                    h00 h00Var = this.b;
                    switch (i112) {
                        case 0:
                            h00Var.f = true;
                            h00Var.C0();
                            break;
                        case 1:
                            org.telegram.messenger.bp bpVar2 = h00Var.r;
                            if (bpVar2 != null && bpVar2.d()) {
                                org.telegram.ui.Components.j00.g1(h00Var, bpVar2.a, new kz(h00Var, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                                String L032 = org.telegram.messenger.dd.L0(2131750791, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L032;
                                x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, i122));
                                h00Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            h00.Z(h00Var);
                            break;
                        case 3:
                            h00Var.A0(true);
                            break;
                        case 4:
                            h00Var.e = true;
                            h00Var.C0();
                            break;
                        default:
                            h00Var.A0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b12);
            int i19 = this.D;
            int i20 = org.telegram.messenger.wp.D8;
            if ((i19 & 32) != 0) {
                arrayList2.add(zz.c(32, org.telegram.messenger.dd.L0(2131750737, null), "muted", false));
            }
            if ((this.D & 64) != 0) {
                arrayList2.add(zz.c(64, org.telegram.messenger.dd.L0(2131750720, null), "read", false));
            }
            if ((this.D & 128) != 0) {
                arrayList2.add(zz.c(128, org.telegram.messenger.dd.L0(2131750805, null), "archived", false));
            }
            if (!this.G.isEmpty()) {
                int size2 = (this.f || this.G.size() < 8) ? this.G.size() : Math.min(5, this.G.size());
                for (int i21 = 0; i21 < size2; i21++) {
                    long longValue2 = ((Long) this.G.get(i21)).longValue();
                    zz zzVar5 = new zz(1, false);
                    zzVar5.g = false;
                    zzVar5.h = longValue2;
                    arrayList2.add(zzVar5);
                }
                if (size2 != this.G.size()) {
                    zz b13 = zz.b(R.drawable.arrow_more, org.telegram.messenger.dd.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b13.c = new View.OnClickListener(this) { // from class: org.telegram.ui.iz
                        public final /* synthetic */ h00 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i112 = i11;
                            int i122 = 1;
                            h00 h00Var = this.b;
                            switch (i112) {
                                case 0:
                                    h00Var.f = true;
                                    h00Var.C0();
                                    break;
                                case 1:
                                    org.telegram.messenger.bp bpVar2 = h00Var.r;
                                    if (bpVar2 != null && bpVar2.d()) {
                                        org.telegram.ui.Components.j00.g1(h00Var, bpVar2.a, new kz(h00Var, 0));
                                        break;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                                        String L032 = org.telegram.messenger.dd.L0(2131750791, null);
                                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                        x1Var.R = L032;
                                        x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                                        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                        alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, i122));
                                        h00Var.showDialog(x1Var);
                                        TextView textView = (TextView) x1Var.d(-1);
                                        if (textView != null) {
                                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                            break;
                                        }
                                    }
                                    break;
                                case 2:
                                    h00.Z(h00Var);
                                    break;
                                case 3:
                                    h00Var.A0(true);
                                    break;
                                case 4:
                                    h00Var.e = true;
                                    h00Var.C0();
                                    break;
                                default:
                                    h00Var.A0(false);
                                    break;
                            }
                        }
                    };
                    arrayList2.add(b13);
                }
            }
            arrayList2.add(zz.d(org.telegram.messenger.dd.L0(2131750778, null)));
        }
        if (getMessagesController().B7 || !getUserConfig().q()) {
            arrayList2.add(new zz(9, false));
            arrayList2.add(new zz(10, false));
            arrayList2.add(zz.d(org.telegram.messenger.dd.L0(2131750622, null)));
        }
        ArrayList arrayList3 = this.L;
        if (arrayList3.isEmpty()) {
            String L05 = org.telegram.messenger.dd.L0(2131750706, null);
            zz zzVar6 = new zz(0, false);
            zzVar6.d = L05;
            zzVar6.f = true;
            arrayList2.add(zzVar6);
            arrayList2.add(zz.b(R.drawable.msg2_link2, org.telegram.messenger.dd.L0(2131750705, null), false));
            arrayList2.add(zz.d(org.telegram.messenger.dd.L0(2131750744, null)));
        } else {
            String L06 = org.telegram.messenger.dd.L0(2131750746, null);
            zz zzVar7 = new zz(0, false);
            zzVar7.d = L06;
            zzVar7.f = true;
            arrayList2.add(zzVar7);
            arrayList2.add(new zz(8, false));
            for (int i22 = 0; i22 < arrayList3.size(); i22++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList3.get(i22);
                zz zzVar8 = new zz(7, false);
                zzVar8.m = tL_exportedChatlistInvite;
                arrayList2.add(zzVar8);
            }
            arrayList2.add(zz.d(bpVar.d() ? org.telegram.messenger.dd.L0(2131750744, null) : org.telegram.messenger.dd.L0(2131750745, null)));
        }
        if (!this.s) {
            zz b14 = zz.b(0, org.telegram.messenger.dd.L0(2131750791, null), true);
            b14.c = new View.OnClickListener(this) { // from class: org.telegram.ui.iz
                public final /* synthetic */ h00 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i15;
                    int i122 = 1;
                    h00 h00Var = this.b;
                    switch (i112) {
                        case 0:
                            h00Var.f = true;
                            h00Var.C0();
                            break;
                        case 1:
                            org.telegram.messenger.bp bpVar2 = h00Var.r;
                            if (bpVar2 != null && bpVar2.d()) {
                                org.telegram.ui.Components.j00.g1(h00Var, bpVar2.a, new kz(h00Var, 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h00Var.getParentActivity());
                                String L032 = org.telegram.messenger.dd.L0(2131750791, null);
                                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.a;
                                x1Var.R = L032;
                                x1Var.T = org.telegram.messenger.dd.L0(2131750790, null);
                                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131751599, null), new jz(h00Var, i122));
                                h00Var.showDialog(x1Var);
                                TextView textView = (TextView) x1Var.d(-1);
                                if (textView != null) {
                                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.q7, null);
                                    break;
                                }
                            }
                            break;
                        case 2:
                            h00.Z(h00Var);
                            break;
                        case 3:
                            h00Var.A0(true);
                            break;
                        case 4:
                            h00Var.e = true;
                            h00Var.C0();
                            break;
                        default:
                            h00Var.A0(false);
                            break;
                    }
                }
            };
            arrayList2.add(b14);
            arrayList2.add(zz.d(null));
        }
        e00 e00Var = this.b;
        if (e00Var != null) {
            e00Var.E(arrayList, arrayList2);
        }
    }

    public final void D0() {
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
        return n0(true);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z10 = this.s;
        int i10 = 26;
        org.telegram.messenger.bp bpVar = this.r;
        int i11 = 0;
        if (z10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.dd.L0(2131750729, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(org.telegram.messenger.kj.A5(org.telegram.messenger.k6.m(bpVar.b, titleFontMetricsInt, false, null, 0), bpVar.c, titleFontMetricsInt, false));
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
        this.c = this.simpleActionBar.n(org.telegram.messenger.dd.L0(this.s ? 2131751753 : 2131745963, null));
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
        e00 e00Var = new e00(this, context);
        this.b = e00Var;
        b1Var2.setAdapter(e00Var);
        this.a.setOnItemClickListener(new g(this, 10));
        this.a.setOnItemLongClickListener(new jz(this, i11));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(org.telegram.ui.Components.gr.h);
        jVar.n(350L);
        this.a.setItemAnimator(jVar);
        this.a.setOnScrollListener(new h3(this, 11));
        o0(false);
        if (!this.N && bpVar != null && bpVar.d()) {
            this.N = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = bpVar.a;
            this.M = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new nz(this, i11));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.Components.uk0 getListViewForSimpleGlass() {
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

    public final boolean n0(boolean z10) {
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
            x1Var.R = org.telegram.messenger.dd.L0(2131750784, null);
            x1Var.T = org.telegram.messenger.dd.L0(2131750786, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131750785, null), new jz(this, 2));
        } else {
            x1Var.R = org.telegram.messenger.dd.L0(2131750783, null);
            x1Var.T = org.telegram.messenger.dd.L0(2131750787, null);
            alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131754216, null), new jz(this, 3));
        }
        alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131747596, null), new jz(this, 4));
        showDialog(x1Var);
        return false;
    }

    public final void o0(boolean z10) {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.x) && this.x.length() <= 12;
        if (z12) {
            z12 = ((this.D & org.telegram.messenger.wp.E8) == 0 && this.F.isEmpty()) ? false : true;
            if (z12 && !this.s) {
                this.h = false;
                org.telegram.messenger.bp bpVar = this.r;
                if (bpVar.h.size() != this.F.size()) {
                    this.h = true;
                }
                if (bpVar.i.size() != this.G.size()) {
                    this.h = true;
                }
                if (bpVar.m != this.E) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(bpVar.h);
                    Collections.sort(this.F);
                    if (!bpVar.h.equals(this.F)) {
                        this.h = true;
                    }
                    Collections.sort(bpVar.i);
                    Collections.sort(this.G);
                    if (!bpVar.i.equals(this.G)) {
                        this.h = true;
                    }
                }
                if (bpVar.n == (!this.y) && TextUtils.equals(bpVar.b, this.x) && bpVar.g == this.D) {
                    z11 = this.h;
                }
                z12 = z11;
            }
        }
        this.c.a(z12, z10);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Cells.h3 h3Var;
        c00 c00Var = this.K;
        if (c00Var == null || (h3Var = c00Var.b) == null || !h3Var.e) {
            return n0(z10);
        }
        if (!z10) {
            return false;
        }
        h3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean onFragmentCreate() {
        C0();
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
        c00 c00Var;
        View view = this.fragmentView;
        if (view == null || (c00Var = this.K) == null || !c00Var.b.e) {
            return;
        }
        view.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        C0();
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
            D0();
            try {
                c00 c00Var = this.K;
                if (c00Var != null && (h3Var = c00Var.b) != null && h3Var.getEditText() != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.Ci)) != this.U) {
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

    public final void p0() {
        String L0;
        if (this.s) {
            if (TextUtils.isEmpty(this.x) || !this.n) {
                int i10 = this.D;
                int i11 = org.telegram.messenger.wp.E8;
                int i12 = i10 & i11;
                if ((i12 & i11) == i11) {
                    if ((i10 & 64) != 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750731, null);
                    } else {
                        if ((i10 & 32) != 0) {
                            L0 = org.telegram.messenger.dd.L0(2131750732, null);
                        }
                        L0 = "";
                    }
                } else if ((i12 & 1) != 0) {
                    if ((i12 & (-2)) == 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750792, null);
                    }
                    L0 = "";
                } else if ((i12 & 2) != 0) {
                    if ((i12 & (-3)) == 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750721, null);
                    }
                    L0 = "";
                } else if ((i12 & 4) != 0) {
                    if ((i12 & (-5)) == 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750775, null);
                    }
                    L0 = "";
                } else if ((i12 & 16) != 0) {
                    if ((i12 & (-17)) == 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750802, null);
                    }
                    L0 = "";
                } else {
                    if ((i12 & 8) != 0 && (i12 & (-9)) == 0) {
                        L0 = org.telegram.messenger.dd.L0(2131750801, null);
                    }
                    L0 = "";
                }
                String str = (L0 == null || L0.length() <= 12) ? L0 : "";
                this.x = str;
                xz xzVar = this.I;
                if (xzVar != null) {
                    xzVar.e(org.telegram.ui.Components.o5.cloneSpans(str, -1, xzVar.s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                s4.c1 K = this.a.K(this.d);
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
                org.telegram.messenger.bp bpVar = this.r;
                int i11 = bpVar.g;
                int i12 = org.telegram.messenger.wp.D8;
                bpVar.g = i11 & (-513);
            }
            C0();
        }
    }

    public final void s0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
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
        C0();
    }

    public final void t0(int i10, boolean z10) {
        org.telegram.messenger.bp bpVar;
        if (!this.S && (bpVar = this.r) != null && bpVar.d() && bpVar.f()) {
            this.S = true;
            this.T = new i2.j0(this, z10, i10, 6);
            if (getLayoutContainer() != null) {
                this.T.run();
                this.T = null;
            }
        }
    }

    public final void u0(ArrayList arrayList, ArrayList arrayList2, boolean z10) {
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
                t0(size, false);
            }
        } else if (size > 0 && size > i10) {
            t0(size, true);
        } else if (i10 > 0) {
            t0(i10, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        ij ijVar = this.R;
        if (ijVar != null) {
            ijVar.b(true);
            this.R = null;
        }
        y0(new lz(this, 0), true);
    }

    public final void y0(Runnable runnable, boolean z10) {
        CharSequence[] charSequenceArr = {this.x};
        z0(this.r, this.D, charSequenceArr[0].toString(), getMediaDataController().W(charSequenceArr, false, true), true ^ this.y, this.E, this.F, this.G, this.H, this.s, false, this.h, true, z10, this, new org.telegram.ui.Components.voip.u(16, this, runnable));
    }
}
