// default package

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
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_chatlists;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.UsersSelectActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class nf4 extends e {
    public int E;
    public int F;
    public ArrayList G;
    public ArrayList H;
    public final LongSparseIntArray I;
    public cf4 J;
    public df4 K;
    public if4 L;
    public final ArrayList M;
    public int N;
    public boolean O;
    public final ArrayList P;
    public final ArrayList Q;
    public float R;
    public kg5 S;
    public boolean T;
    public t64 U;
    public int V;
    public int W;
    public int X;
    public gu a;
    public kf4 b;
    public nla c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean h;
    public boolean n;
    public final ac7 r;
    public boolean s;
    public boolean w;
    public CharSequence x;
    public boolean y;

    public nf4(ac7 ac7Var, ArrayList arrayList) {
        super(null);
        ac7 ac7Var2;
        this.d = -1;
        this.y = true;
        this.M = new ArrayList();
        this.P = new ArrayList();
        this.Q = new ArrayList();
        this.R = -5.0f;
        this.r = ac7Var;
        if (ac7Var == null) {
            ac7 ac7Var3 = new ac7();
            this.r = ac7Var3;
            ac7Var3.a = 2;
            while (true) {
                Object obj = getMessagesController().J0.get(this.r.a);
                ac7Var2 = this.r;
                if (obj == null) {
                    break;
                } else {
                    ac7Var2.a++;
                }
            }
            ac7Var2.b = "";
            ac7Var2.m = (int) (Math.random() * 8.0d);
            this.s = true;
        }
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(hl.L(17.0f));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.r.b);
        this.x = spannableStringBuilder;
        CharSequence m = pv3.m(spannableStringBuilder, textPaint.getFontMetricsInt(), false, null, 0);
        this.x = m;
        this.x = r47.A5(m, this.r.c, textPaint.getFontMetricsInt(), false);
        boolean z = !this.r.n;
        this.y = z;
        wl.r(this.currentAccount, z);
        ac7 ac7Var4 = this.r;
        this.E = ac7Var4.g;
        this.F = ac7Var4.m;
        ArrayList arrayList2 = new ArrayList(this.r.h);
        this.G = arrayList2;
        if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
        this.H = new ArrayList(this.r.i);
        this.I = this.r.j.clone();
    }

    public static CharSequence E0(int i, String str, boolean z) {
        Context context;
        if (i >= 0) {
            if (!uc7.e1().getBoolean("n_" + i, false) && (context = a.b) != null) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.append((CharSequence) "  ");
                SpannableString spannableString = new SpannableString("NEW");
                if (z) {
                    Drawable e = c00.e(context, R.drawable.msg_other_new_outline);
                    e.setBounds(0, -hl.L(8.0f), e.getIntrinsicWidth(), e.getIntrinsicHeight() - hl.L(8.0f));
                    spannableString.setSpan(new ve4(e, 0), 0, spannableString.length(), 33);
                } else {
                    Drawable e2 = c00.e(context, R.drawable.msg_other_new_filled);
                    Drawable e3 = c00.e(context, R.drawable.msg_other_new_filled_text);
                    int w0 = aob.w0(null, aob.Ki, false);
                    PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                    e2.setColorFilter(new PorterDuffColorFilter(w0, mode));
                    e3.setColorFilter(new PorterDuffColorFilter(aob.w0(null, aob.Ji, false), mode));
                    zm2 zm2Var = new zm2(e2, e3);
                    zm2Var.setBounds(0, 0, zm2Var.getIntrinsicWidth(), zm2Var.getIntrinsicHeight());
                    spannableString.setSpan(new ImageSpan(zm2Var, 0), 0, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
                return spannableStringBuilder;
            }
        }
        return str;
    }

    public static boolean i0(TLRPC.Chat chat) {
        if (xc2.y(3, chat)) {
            return true;
        }
        return xc2.t0(chat) && !chat.join_request;
    }

    public static boolean m0(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            hm[] hmVarArr = (hm[]) spanned.getSpans(0, spanned.length(), hm.class);
            if (hmVarArr != null && hmVarArr.length > 0) {
                return true;
            }
        }
        return false;
    }

    public static void u0(ac7 ac7Var, int i, String str, ArrayList arrayList, boolean z, int i2, ArrayList arrayList2, ArrayList arrayList3, boolean z2, boolean z3, boolean z4, boolean z5, e eVar, Runnable runnable) {
        if (ac7Var.g != i || z4) {
            ac7Var.e = -1;
            if (z5) {
                ac7Var.d = -1;
            }
        }
        ac7Var.g = i;
        ac7Var.b = str;
        ac7Var.c = arrayList;
        ac7Var.m = i2;
        ac7Var.i = arrayList3;
        ac7Var.h = arrayList2;
        ac7Var.n = z;
        byte b = 5;
        if (z2) {
            uc7 messagesController = eVar.getMessagesController();
            HashSet hashSet = messagesController.n4;
            ArrayList arrayList4 = messagesController.G0;
            if (z3) {
                int size = arrayList4.size();
                int i3 = jn7.c4;
                for (int i4 = 0; i4 < size; i4++) {
                    i3 = Math.min(i3, ((ac7) messagesController.G0.get(i4)).f);
                }
                ac7Var.f = i3 - 1;
                boolean d = ((ac7) messagesController.G0.get(0)).d();
                ArrayList arrayList5 = messagesController.G0;
                if (d) {
                    arrayList5.add(1, ac7Var);
                } else {
                    arrayList5.add(0, ac7Var);
                }
            } else {
                int size2 = arrayList4.size();
                int i5 = 0;
                for (int i6 = 0; i6 < size2; i6++) {
                    i5 = Math.max(i5, ((ac7) messagesController.G0.get(i6)).f);
                }
                ac7Var.f = i5 + 1;
                messagesController.G0.add(ac7Var);
            }
            messagesController.J0.put(ac7Var.a, ac7Var);
            int i7 = ac7Var.a;
            if (i7 != 0 && hashSet.remove(Integer.valueOf(i7))) {
                messagesController.K4();
            }
            if (hashSet.contains(0)) {
                messagesController.h5(null);
            }
            if (messagesController.G0.size() == 1 && xea.m(messagesController.currentAccount) != 5) {
                xea.n1 = 5;
                a.b.getSharedPreferences("mainconfig", 0).edit().putInt("ChatSwipeAction", xea.n1).apply();
            }
            messagesController.q3();
        } else {
            eVar.getMessagesController().F3(ac7Var);
        }
        jf7 messagesStorage = eVar.getMessagesStorage();
        messagesStorage.a.c(new yn6(messagesStorage, ac7Var, z3, b));
        if (z3) {
            TLRPC.TL_messages_updateDialogFiltersOrder tL_messages_updateDialogFiltersOrder = new TLRPC.TL_messages_updateDialogFiltersOrder();
            ArrayList T0 = eVar.getMessagesController().T0();
            int size3 = T0.size();
            for (int i8 = 0; i8 < size3; i8 = qd4.g(((ac7) T0.get(i8)).a, i8, 1, tL_messages_updateDialogFiltersOrder.order)) {
            }
            eVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFiltersOrder, null);
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public static void x0(TLRPC.TL_error tL_error, e eVar, d31 d31Var) {
        if (tL_error == null || TextUtils.isEmpty(tL_error.text)) {
            return;
        }
        if ("INVITE_PEERS_TOO_MUCH".equals(tL_error.text)) {
            new l46(4, eVar.getCurrentAccount(), null, eVar.getContext(), eVar).show();
            return;
        }
        if ("PEERS_LIST_EMPTY".equals(tL_error.text)) {
            xnb.x(null, 2131750613, d31Var, null);
            return;
        }
        if ("USER_CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            xnb.x(null, 2131750612, d31Var, null);
            return;
        }
        if ("CHANNELS_TOO_MUCH".equals(tL_error.text)) {
            new l46(5, eVar.getCurrentAccount(), null, eVar.getContext(), eVar).show();
            return;
        }
        if ("INVITES_TOO_MUCH".equals(tL_error.text)) {
            new l46(12, eVar.getCurrentAccount(), null, eVar.getContext(), eVar).show();
            return;
        }
        if ("CHATLISTS_TOO_MUCH".equals(tL_error.text)) {
            new l46(13, eVar.getCurrentAccount(), null, eVar.getContext(), eVar).show();
            return;
        }
        if ("INVITE_SLUG_EXPIRED".equals(tL_error.text)) {
            xnb.x(null, 2131747940, d31Var, null);
            return;
        }
        if ("FILTER_INCLUDE_TOO_MUCH".equals(tL_error.text)) {
            new l46(4, eVar.getCurrentAccount(), null, eVar.getContext(), eVar).show();
        } else if (!"DIALOG_FILTERS_TOO_MUCH".equals(tL_error.text)) {
            xnb.x(null, 2131743534, d31Var, null);
        } else {
            new l46(3, eVar.getCurrentAccount(), null, eVar.getContext(), eVar).show();
        }
    }

    public static void z0(final ac7 ac7Var, final int i, final String str, final ArrayList arrayList, final boolean z, final int i2, final ArrayList arrayList2, final ArrayList arrayList3, LongSparseIntArray longSparseIntArray, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final boolean z6, final e eVar, final Runnable runnable) {
        ArrayList<TLRPC.InputPeer> arrayList4;
        ArrayList arrayList5;
        if (eVar == null || eVar.getParentActivity() == null) {
            return;
        }
        id idVar = null;
        int i3 = 3;
        int i4 = 0;
        if (z6) {
            id idVar2 = new id(3, null, eVar.getParentActivity());
            idVar2.j0 = false;
            idVar2.show();
            idVar = idVar2;
        }
        TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
        tL_messages_updateDialogFilter.id = ac7Var.a;
        tL_messages_updateDialogFilter.flags |= 1;
        TLRPC.TL_dialogFilter tL_dialogFilter = new TLRPC.TL_dialogFilter();
        tL_messages_updateDialogFilter.filter = tL_dialogFilter;
        int i5 = uc7.r5;
        tL_dialogFilter.contacts = (i & 1) != 0;
        tL_dialogFilter.non_contacts = (i & 2) != 0;
        tL_dialogFilter.groups = (i & 4) != 0;
        tL_dialogFilter.broadcasts = (i & 8) != 0;
        tL_dialogFilter.bots = (i & 16) != 0;
        tL_dialogFilter.exclude_muted = (i & 32) != 0;
        tL_dialogFilter.exclude_read = (i & 64) != 0;
        tL_dialogFilter.exclude_archived = (i & 128) != 0;
        tL_dialogFilter.id = ac7Var.a;
        tL_dialogFilter.title = new TLRPC.TL_textWithEntities();
        TLRPC.TL_dialogFilter tL_dialogFilter2 = tL_messages_updateDialogFilter.filter;
        TLRPC.TL_textWithEntities tL_textWithEntities = tL_dialogFilter2.title;
        tL_textWithEntities.text = str;
        tL_textWithEntities.entities = arrayList;
        tL_dialogFilter2.title_noanimate = z;
        int i6 = tL_dialogFilter2.flags;
        if (i2 < 0) {
            tL_dialogFilter2.flags = i6 & (-134217729);
            tL_dialogFilter2.color = 0;
        } else {
            tL_dialogFilter2.flags = i6 | TLObject.FLAG_27;
            tL_dialogFilter2.color = i2;
        }
        uc7 messagesController = eVar.getMessagesController();
        ArrayList arrayList6 = new ArrayList();
        if (longSparseIntArray.size() != 0) {
            int size = longSparseIntArray.size();
            for (int i7 = 0; i7 < size; i7++) {
                long keyAt = longSparseIntArray.keyAt(i7);
                if (!wf3.B(keyAt)) {
                    arrayList6.add(Long.valueOf(keyAt));
                }
            }
            Collections.sort(arrayList6, new le4(longSparseIntArray, (byte) 0));
        }
        int i8 = 0;
        while (i8 < i3) {
            TLRPC.TL_dialogFilter tL_dialogFilter3 = tL_messages_updateDialogFilter.filter;
            if (i8 == 0) {
                arrayList4 = tL_dialogFilter3.include_peers;
                arrayList5 = arrayList2;
            } else if (i8 == 1) {
                arrayList4 = tL_dialogFilter3.exclude_peers;
                arrayList5 = arrayList3;
            } else {
                arrayList4 = tL_dialogFilter3.pinned_peers;
                arrayList5 = arrayList6;
            }
            int size2 = arrayList5.size();
            while (i4 < size2) {
                ArrayList arrayList7 = arrayList5;
                Long l = (Long) arrayList7.get(i4);
                id idVar3 = idVar;
                int i9 = size2;
                long longValue = l.longValue();
                if ((i8 != 0 || longSparseIntArray.indexOfKey(longValue) < 0) && !wf3.B(longValue)) {
                    if (longValue > 0) {
                        TLRPC.User X1 = messagesController.X1(l);
                        if (X1 != null) {
                            TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
                            tL_inputPeerUser.user_id = longValue;
                            tL_inputPeerUser.access_hash = X1.access_hash;
                            arrayList4.add(tL_inputPeerUser);
                        }
                    } else {
                        long j = -longValue;
                        TLRPC.Chat M0 = messagesController.M0(Long.valueOf(j));
                        if (M0 != null) {
                            if (xc2.T(M0)) {
                                TLRPC.TL_inputPeerChannel tL_inputPeerChannel = new TLRPC.TL_inputPeerChannel();
                                tL_inputPeerChannel.channel_id = j;
                                tL_inputPeerChannel.access_hash = M0.access_hash;
                                arrayList4.add(tL_inputPeerChannel);
                            } else {
                                TLRPC.TL_inputPeerChat tL_inputPeerChat = new TLRPC.TL_inputPeerChat();
                                tL_inputPeerChat.chat_id = j;
                                arrayList4.add(tL_inputPeerChat);
                            }
                        }
                    }
                }
                i4++;
                idVar = idVar3;
                size2 = i9;
                arrayList5 = arrayList7;
            }
            i8++;
            i3 = 3;
            i4 = 0;
        }
        final id idVar4 = idVar;
        eVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new RequestDelegate() { // from class: me4
            @Override // org.telegram.tgnet.RequestDelegate
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                final boolean z7 = z6;
                final id idVar5 = idVar4;
                final ac7 ac7Var2 = ac7Var;
                final int i10 = i;
                final String str2 = str;
                final ArrayList arrayList8 = arrayList;
                final boolean z8 = z;
                final int i11 = i2;
                final ArrayList arrayList9 = arrayList2;
                final ArrayList arrayList10 = arrayList3;
                final boolean z9 = z2;
                final boolean z10 = z3;
                final boolean z11 = z4;
                final boolean z12 = z5;
                final e eVar2 = eVar;
                final Runnable runnable2 = runnable;
                hl.c3(new Runnable() { // from class: qe4
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean z13 = z7;
                        Runnable runnable3 = runnable2;
                        if (!z13) {
                            if (runnable3 != null) {
                                runnable3.run();
                            }
                        } else {
                            id idVar6 = idVar5;
                            if (idVar6 != null) {
                                try {
                                    idVar6.dismiss();
                                } catch (Exception e) {
                                    cc4.g(e, true);
                                }
                            }
                            nf4.u0(ac7Var2, i10, str2, arrayList8, z8, i11, arrayList9, arrayList10, z9, z10, z11, z12, eVar2, runnable3);
                        }
                    }
                });
            }
        });
        if (z6) {
            return;
        }
        u0(ac7Var, i, str, arrayList, z, i2, arrayList2, arrayList3, z2, z3, z4, z5, eVar, null);
    }

    public final void A0(boolean z) {
        UsersSelectActivity usersSelectActivity = new UsersSelectActivity(this.E, z ? this.G : this.H, z);
        usersSelectActivity.G = this.r.c();
        usersSelectActivity.n = new t41((byte) 6, this, z);
        presentFragment(usersSelectActivity);
    }

    public final void B0(ef4 ef4Var, CharSequence charSequence, Object obj, boolean z) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        id idVar = alertDialog$Builder.a;
        if (z) {
            idVar.S = ob6.M0(2131750672, null);
            if (obj instanceof String) {
                idVar.U = ob6.a0(null, null, 2131750673, charSequence);
            } else if (obj instanceof TLRPC.User) {
                idVar.U = ob6.a0(null, null, 2131750671, charSequence);
            } else {
                idVar.U = ob6.a0(null, null, 2131750674, charSequence);
            }
        } else {
            idVar.S = ob6.M0(2131750677, null);
            if (obj instanceof String) {
                idVar.U = ob6.a0(null, null, 2131750678, charSequence);
            } else if (obj instanceof TLRPC.User) {
                idVar.U = ob6.a0(null, null, 2131750676, charSequence);
            } else {
                idVar.U = ob6.a0(null, null, 2131750679, charSequence);
            }
        }
        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
        alertDialog$Builder.j(ob6.M0(2131744512, null), new bh((Object) this, (Object) ef4Var, z, (byte) 8));
        showDialog(idVar);
        TextView textView = (TextView) idVar.c(-1);
        if (textView != null) {
            yob.X(textView, aob.q7, null);
        }
    }

    public final void C0() {
        int i;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3 = this.P;
        arrayList3.clear();
        ArrayList arrayList4 = this.Q;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        String M0 = ob6.M0(2131750698, null);
        String M02 = m0(this.x) ? ob6.M0(this.y ? 2131750700 : 2131750699, null) : null;
        final byte b = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) { // from class: te4
            public final /* synthetic */ nf4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                nf4 nf4Var = this.b;
                switch (b2) {
                    case 0:
                        nf4Var.p0();
                        break;
                    case 1:
                        nf4Var.A0(true);
                        break;
                    case 2:
                        nf4Var.e = true;
                        nf4Var.C0();
                        break;
                    case 3:
                        nf4Var.A0(false);
                        break;
                    case 4:
                        nf4Var.f = true;
                        nf4Var.C0();
                        break;
                    default:
                        ac7 ac7Var = nf4Var.r;
                        if (ac7Var != null && ac7Var.c()) {
                            qn4.c1(nf4Var, ac7Var.a, new ne4(nf4Var, (byte) 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf4Var.getParentActivity());
                            String M03 = ob6.M0(2131750755, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M03;
                            idVar.U = ob6.M0(2131750754, null);
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.j(ob6.M0(2131751563, null), new ke4(nf4Var, (byte) 2));
                            nf4Var.showDialog(idVar);
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, null);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        ef4 ef4Var = new ef4(11, false);
        ef4Var.d = M0;
        ef4Var.e = M02;
        ef4Var.c = onClickListener;
        arrayList4.add(ef4Var);
        this.d = arrayList4.size();
        final byte b2 = 2;
        arrayList4.add(new ef4(2, false));
        arrayList4.add(ef4.d(null));
        String M03 = ob6.M0(2131750738, null);
        ef4 ef4Var2 = new ef4(0, false);
        ef4Var2.d = M03;
        arrayList4.add(ef4Var2);
        ef4 b3 = ef4.b(R.drawable.msg2_chats_add, ob6.M0(2131750778, null), false);
        final byte b4 = 1;
        b3.c = new View.OnClickListener(this) { // from class: te4
            public final /* synthetic */ nf4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b22 = b4;
                nf4 nf4Var = this.b;
                switch (b22) {
                    case 0:
                        nf4Var.p0();
                        break;
                    case 1:
                        nf4Var.A0(true);
                        break;
                    case 2:
                        nf4Var.e = true;
                        nf4Var.C0();
                        break;
                    case 3:
                        nf4Var.A0(false);
                        break;
                    case 4:
                        nf4Var.f = true;
                        nf4Var.C0();
                        break;
                    default:
                        ac7 ac7Var = nf4Var.r;
                        if (ac7Var != null && ac7Var.c()) {
                            qn4.c1(nf4Var, ac7Var.a, new ne4(nf4Var, (byte) 0));
                            break;
                        } else {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf4Var.getParentActivity());
                            String M032 = ob6.M0(2131750755, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M032;
                            idVar.U = ob6.M0(2131750754, null);
                            alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                            alertDialog$Builder.j(ob6.M0(2131751563, null), new ke4(nf4Var, (byte) 2));
                            nf4Var.showDialog(idVar);
                            TextView textView = (TextView) idVar.c(-1);
                            if (textView != null) {
                                yob.X(textView, aob.q7, null);
                                break;
                            }
                        }
                        break;
                }
            }
        };
        arrayList4.add(b3);
        int i2 = this.E;
        int i3 = uc7.r5;
        if ((i2 & 1) != 0) {
            arrayList4.add(ef4.c(1, ob6.M0(2131750756, null), "contacts", true));
        }
        if ((this.E & 2) != 0) {
            arrayList4.add(ef4.c(2, ob6.M0(2131750683, null), "non_contacts", true));
        }
        final byte b5 = 4;
        if ((this.E & 4) != 0) {
            arrayList4.add(ef4.c(4, ob6.M0(2131750739, null), "groups", true));
        }
        if ((this.E & 8) != 0) {
            arrayList4.add(ef4.c(8, ob6.M0(2131750765, null), "channels", true));
        }
        if ((this.E & 16) != 0) {
            arrayList4.add(ef4.c(16, ob6.M0(2131750766, null), "bots", true));
        }
        int i4 = 5;
        if (this.G.isEmpty()) {
            i = 5;
        } else {
            int size = (this.e || this.G.size() < 8) ? this.G.size() : Math.min(5, this.G.size());
            int i5 = 0;
            while (true) {
                arrayList2 = this.G;
                if (i5 >= size) {
                    break;
                }
                int i6 = i4;
                long longValue = ((Long) arrayList2.get(i5)).longValue();
                ef4 ef4Var3 = new ef4(1, false);
                ef4Var3.g = true;
                ef4Var3.h = longValue;
                arrayList4.add(ef4Var3);
                i5++;
                i4 = i6;
            }
            i = i4;
            if (size != arrayList2.size()) {
                ef4 b6 = ef4.b(R.drawable.arrow_more, ob6.G(this.G.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                b6.c = new View.OnClickListener(this) { // from class: te4
                    public final /* synthetic */ nf4 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b22 = b2;
                        nf4 nf4Var = this.b;
                        switch (b22) {
                            case 0:
                                nf4Var.p0();
                                break;
                            case 1:
                                nf4Var.A0(true);
                                break;
                            case 2:
                                nf4Var.e = true;
                                nf4Var.C0();
                                break;
                            case 3:
                                nf4Var.A0(false);
                                break;
                            case 4:
                                nf4Var.f = true;
                                nf4Var.C0();
                                break;
                            default:
                                ac7 ac7Var = nf4Var.r;
                                if (ac7Var != null && ac7Var.c()) {
                                    qn4.c1(nf4Var, ac7Var.a, new ne4(nf4Var, (byte) 0));
                                    break;
                                } else {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf4Var.getParentActivity());
                                    String M032 = ob6.M0(2131750755, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M032;
                                    idVar.U = ob6.M0(2131750754, null);
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    alertDialog$Builder.j(ob6.M0(2131751563, null), new ke4(nf4Var, (byte) 2));
                                    nf4Var.showDialog(idVar);
                                    TextView textView = (TextView) idVar.c(-1);
                                    if (textView != null) {
                                        yob.X(textView, aob.q7, null);
                                        break;
                                    }
                                }
                                break;
                        }
                    }
                };
                arrayList4.add(b6);
            }
        }
        arrayList4.add(ef4.d(ob6.M0(2131750737, null)));
        ac7 ac7Var = this.r;
        if (!ac7Var.c()) {
            String M04 = ob6.M0(2131750743, null);
            ef4 ef4Var4 = new ef4(0, false);
            ef4Var4.d = M04;
            arrayList4.add(ef4Var4);
            ef4 b7 = ef4.b(R.drawable.msg2_chats_add, ob6.M0(2131750680, null), false);
            final byte b8 = 3;
            b7.c = new View.OnClickListener(this) { // from class: te4
                public final /* synthetic */ nf4 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b22 = b8;
                    nf4 nf4Var = this.b;
                    switch (b22) {
                        case 0:
                            nf4Var.p0();
                            break;
                        case 1:
                            nf4Var.A0(true);
                            break;
                        case 2:
                            nf4Var.e = true;
                            nf4Var.C0();
                            break;
                        case 3:
                            nf4Var.A0(false);
                            break;
                        case 4:
                            nf4Var.f = true;
                            nf4Var.C0();
                            break;
                        default:
                            ac7 ac7Var2 = nf4Var.r;
                            if (ac7Var2 != null && ac7Var2.c()) {
                                qn4.c1(nf4Var, ac7Var2.a, new ne4(nf4Var, (byte) 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf4Var.getParentActivity());
                                String M032 = ob6.M0(2131750755, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M032;
                                idVar.U = ob6.M0(2131750754, null);
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                alertDialog$Builder.j(ob6.M0(2131751563, null), new ke4(nf4Var, (byte) 2));
                                nf4Var.showDialog(idVar);
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, null);
                                    break;
                                }
                            }
                            break;
                    }
                }
            };
            arrayList4.add(b7);
            int i7 = this.E;
            int i8 = uc7.r5;
            if ((i7 & 32) != 0) {
                arrayList4.add(ef4.c(32, ob6.M0(2131750701, null), "muted", false));
            }
            if ((this.E & 64) != 0) {
                arrayList4.add(ef4.c(64, ob6.M0(2131750682, null), "read", false));
            }
            if ((this.E & 128) != 0) {
                arrayList4.add(ef4.c(128, ob6.M0(2131750769, null), "archived", false));
            }
            if (!this.H.isEmpty()) {
                int size2 = (this.f || this.H.size() < 8) ? this.H.size() : Math.min(i, this.H.size());
                int i9 = 0;
                while (true) {
                    arrayList = this.H;
                    if (i9 >= size2) {
                        break;
                    }
                    long longValue2 = ((Long) arrayList.get(i9)).longValue();
                    ef4 ef4Var5 = new ef4(1, false);
                    ef4Var5.g = false;
                    ef4Var5.h = longValue2;
                    arrayList4.add(ef4Var5);
                    i9++;
                }
                if (size2 != arrayList.size()) {
                    ef4 b9 = ef4.b(R.drawable.arrow_more, ob6.G(this.H.size() - 5, "FilterShowMoreChats", new Object[0]), false);
                    b9.c = new View.OnClickListener(this) { // from class: te4
                        public final /* synthetic */ nf4 b;

                        {
                            this.b = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            byte b22 = b5;
                            nf4 nf4Var = this.b;
                            switch (b22) {
                                case 0:
                                    nf4Var.p0();
                                    break;
                                case 1:
                                    nf4Var.A0(true);
                                    break;
                                case 2:
                                    nf4Var.e = true;
                                    nf4Var.C0();
                                    break;
                                case 3:
                                    nf4Var.A0(false);
                                    break;
                                case 4:
                                    nf4Var.f = true;
                                    nf4Var.C0();
                                    break;
                                default:
                                    ac7 ac7Var2 = nf4Var.r;
                                    if (ac7Var2 != null && ac7Var2.c()) {
                                        qn4.c1(nf4Var, ac7Var2.a, new ne4(nf4Var, (byte) 0));
                                        break;
                                    } else {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf4Var.getParentActivity());
                                        String M032 = ob6.M0(2131750755, null);
                                        id idVar = alertDialog$Builder.a;
                                        idVar.S = M032;
                                        idVar.U = ob6.M0(2131750754, null);
                                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                        alertDialog$Builder.j(ob6.M0(2131751563, null), new ke4(nf4Var, (byte) 2));
                                        nf4Var.showDialog(idVar);
                                        TextView textView = (TextView) idVar.c(-1);
                                        if (textView != null) {
                                            yob.X(textView, aob.q7, null);
                                            break;
                                        }
                                    }
                                    break;
                            }
                        }
                    };
                    arrayList4.add(b9);
                }
            }
            arrayList4.add(ef4.d(ob6.M0(2131750742, null)));
        }
        if (getMessagesController().l4 || !getUserConfig().p()) {
            arrayList4.add(new ef4(9, false));
            arrayList4.add(new ef4(10, false));
            arrayList4.add(ef4.d(ob6.M0(2131750581, null)));
        }
        ArrayList arrayList5 = this.M;
        if (arrayList5.isEmpty()) {
            String M05 = ob6.M0(2131750668, null);
            ef4 ef4Var6 = new ef4(0, false);
            ef4Var6.d = M05;
            ef4Var6.f = true;
            arrayList4.add(ef4Var6);
            arrayList4.add(ef4.b(R.drawable.msg2_link2, ob6.M0(2131750667, null), false));
            arrayList4.add(ef4.d(ob6.M0(2131750708, null)));
        } else {
            String M06 = ob6.M0(2131750710, null);
            ef4 ef4Var7 = new ef4(0, false);
            ef4Var7.d = M06;
            ef4Var7.f = true;
            arrayList4.add(ef4Var7);
            arrayList4.add(new ef4(8, false));
            for (int i10 = 0; i10 < arrayList5.size(); i10++) {
                TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite = (TL_chatlists.TL_exportedChatlistInvite) arrayList5.get(i10);
                ef4 ef4Var8 = new ef4(7, false);
                ef4Var8.m = tL_exportedChatlistInvite;
                arrayList4.add(ef4Var8);
            }
            arrayList4.add(ef4.d(ac7Var.c() ? ob6.M0(2131750708, null) : ob6.M0(2131750709, null)));
        }
        if (!this.s) {
            ef4 b10 = ef4.b(0, ob6.M0(2131750755, null), true);
            final byte b11 = 5;
            b10.c = new View.OnClickListener(this) { // from class: te4
                public final /* synthetic */ nf4 b;

                {
                    this.b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    byte b22 = b11;
                    nf4 nf4Var = this.b;
                    switch (b22) {
                        case 0:
                            nf4Var.p0();
                            break;
                        case 1:
                            nf4Var.A0(true);
                            break;
                        case 2:
                            nf4Var.e = true;
                            nf4Var.C0();
                            break;
                        case 3:
                            nf4Var.A0(false);
                            break;
                        case 4:
                            nf4Var.f = true;
                            nf4Var.C0();
                            break;
                        default:
                            ac7 ac7Var2 = nf4Var.r;
                            if (ac7Var2 != null && ac7Var2.c()) {
                                qn4.c1(nf4Var, ac7Var2.a, new ne4(nf4Var, (byte) 0));
                                break;
                            } else {
                                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf4Var.getParentActivity());
                                String M032 = ob6.M0(2131750755, null);
                                id idVar = alertDialog$Builder.a;
                                idVar.S = M032;
                                idVar.U = ob6.M0(2131750754, null);
                                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                alertDialog$Builder.j(ob6.M0(2131751563, null), new ke4(nf4Var, (byte) 2));
                                nf4Var.showDialog(idVar);
                                TextView textView = (TextView) idVar.c(-1);
                                if (textView != null) {
                                    yob.X(textView, aob.q7, null);
                                    break;
                                }
                            }
                            break;
                    }
                }
            };
            arrayList4.add(b10);
            arrayList4.add(ef4.d(null));
        }
        kf4 kf4Var = this.b;
        if (kf4Var != null) {
            kf4Var.E(arrayList3, arrayList4);
        }
    }

    public final void D0() {
        int hiddenChildCount;
        View X;
        try {
            if (this.a != null) {
                int w0 = aob.w0(null, aob.y6, false);
                int w02 = aob.w0(null, aob.Zl, false);
                if (w0 == this.W && w02 == this.X) {
                    return;
                }
                this.W = w0;
                this.X = w02;
                int i = 0;
                while (i < 4) {
                    if (i == 0) {
                        hiddenChildCount = this.a.getChildCount();
                    } else {
                        gu guVar = this.a;
                        hiddenChildCount = i == 1 ? guVar.getHiddenChildCount() : i == 2 ? guVar.getCachedChildCount() : guVar.getAttachedScrapChildCount();
                    }
                    for (int i2 = 0; i2 < hiddenChildCount; i2++) {
                        if (i == 0) {
                            X = this.a.getChildAt(i2);
                        } else {
                            gu guVar2 = this.a;
                            X = i == 1 ? guVar2.X(i2) : i == 2 ? guVar2.Q(i2) : guVar2.P(i2);
                        }
                        if (X instanceof vac) {
                            vac vacVar = (vac) X;
                            vacVar.b0 = true;
                            vacVar.R = w0;
                            vacVar.S = w02;
                            if (i != 0) {
                                ((vac) X).i(0);
                            }
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.U7));
        hashSet.add(Integer.valueOf(aob.T7));
        hashSet.add(Integer.valueOf(aob.S7));
        hashSet.add(Integer.valueOf(aob.R7));
        hashSet.add(Integer.valueOf(aob.Q7));
        hashSet.add(Integer.valueOf(aob.P7));
        hashSet.add(Integer.valueOf(aob.O7));
        hashSet.add(Integer.valueOf(aob.J7));
        hashSet.add(Integer.valueOf(aob.y6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.m6));
        hashSet.add(Integer.valueOf(aob.li));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.L6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean canBeginSlide() {
        return j0(true);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final View createView(Context context) {
        byte b = 1;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        boolean z = this.s;
        jla jlaVar = this.simpleActionBar;
        ac7 ac7Var = this.r;
        byte b2 = 0;
        if (z) {
            jlaVar.setTitle(ob6.M0(2131750693, null));
        } else {
            Paint.FontMetricsInt titleFontMetricsInt = jlaVar.getTitleFontMetricsInt();
            this.simpleActionBar.setTitle(r47.A5(pv3.m(ac7Var.b, titleFontMetricsInt, false, null, 0), ac7Var.c, titleFontMetricsInt, false));
            jla jlaVar2 = this.simpleActionBar;
            if (jlaVar2 != null) {
                if (jlaVar2.getTitleTextView() != null) {
                    this.simpleActionBar.getTitleTextView().setEmojiCacheType(this.y ? 0 : 26);
                }
                if (this.simpleActionBar.getTitleTextView2() != null) {
                    this.simpleActionBar.getTitleTextView2().setEmojiCacheType(this.y ? 0 : 26);
                }
            }
        }
        byte b3 = 17;
        this.simpleActionBar.setActionBarMenuOnItemClick(new kg2(this, b3));
        this.c = this.simpleActionBar.u(ob6.M0(this.s ? 2131751718 : 2131745674, null));
        w81 w81Var = new w81((byte) 2, context, this);
        this.fragmentView = w81Var;
        gu guVar = new gu(b3, context, this);
        this.a = guVar;
        guVar.s1();
        this.a.setLayoutManager(new x46(1, false));
        this.a.setVerticalScrollBarEnabled(false);
        this.a.setSectionsDrawBackground(true);
        w81Var.addView(this.a, tre.c(-1.0f, -1));
        gu guVar2 = this.a;
        kf4 kf4Var = new kf4(this, context);
        this.b = kf4Var;
        guVar2.setAdapter(kf4Var);
        this.a.setOnItemClickListener(new u(this, (byte) 27));
        this.a.setOnItemLongClickListener(new ke4(this, b));
        zb3 zb3Var = new zb3();
        zb3Var.m = false;
        zb3Var.C = false;
        zb3Var.o(k43.h);
        zb3Var.n(350L);
        this.a.setItemAnimator(zb3Var);
        this.a.setOnScrollListener(new to2(this, (byte) 10));
        k0(false);
        if (!this.O && ac7Var != null && ac7Var.c()) {
            this.O = true;
            TL_chatlists.TL_chatlists_getExportedInvites tL_chatlists_getExportedInvites = new TL_chatlists.TL_chatlists_getExportedInvites();
            TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
            tL_chatlists_getExportedInvites.chatlist = tL_inputChatlistDialogFilter;
            tL_inputChatlistDialogFilter.filter_id = ac7Var.a;
            this.N = getConnectionsManager().sendRequest(tL_chatlists_getExportedInvites, new pe4(this, b2));
        }
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        da2 da2Var = new da2(this, (byte) 4);
        arrayList.add(new apb(this.a, 16, new Class[]{mf5.class, skb.class, vac.class}, (Paint) null, (Drawable[]) null, (zob) null, aob.d6));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.p7));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"textView"}, (Drawable[]) null, (zob) null, aob.q6));
        arrayList.add(new apb(this.a, 262144, new Class[]{skb.class}, new String[]{"ImageView"}, (Drawable[]) null, (zob) null, aob.N6));
        arrayList.add(new apb(this.a, 0, new Class[]{vac.class}, new String[]{"statusOnlineColor"}, (Drawable[]) null, da2Var, aob.n6));
        return arrayList;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final boolean j0(boolean z) {
        if (!this.c.x.f) {
            return true;
        }
        byte b = 0;
        if (z) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
            boolean z2 = this.s;
            id idVar = alertDialog$Builder.a;
            if (z2) {
                idVar.S = ob6.M0(2131750748, null);
                idVar.U = ob6.M0(2131750750, null);
                alertDialog$Builder.j(ob6.M0(2131750749, null), new ke4(this, b));
            } else {
                idVar.S = ob6.M0(2131750747, null);
                idVar.U = ob6.M0(2131750751, null);
                alertDialog$Builder.j(ob6.M0(2131754209, null), new ke4(this, (byte) 3));
            }
            alertDialog$Builder.g(ob6.M0(2131747307, null), new ke4(this, (byte) 4));
            showDialog(idVar);
        }
        return false;
    }

    public final void k0(boolean z) {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.x) && this.x.length() <= 12;
        if (z3) {
            z3 = ((this.E & uc7.s5) == 0 && this.G.isEmpty()) ? false : true;
            if (z3 && !this.s) {
                this.h = false;
                ac7 ac7Var = this.r;
                if (ac7Var.h.size() != this.G.size()) {
                    this.h = true;
                }
                if (ac7Var.i.size() != this.H.size()) {
                    this.h = true;
                }
                if (ac7Var.m != this.F) {
                    this.h = true;
                }
                if (!this.h) {
                    Collections.sort(ac7Var.h);
                    Collections.sort(this.G);
                    if (!ac7Var.h.equals(this.G)) {
                        this.h = true;
                    }
                    Collections.sort(ac7Var.i);
                    Collections.sort(this.H);
                    if (!ac7Var.i.equals(this.H)) {
                        this.h = true;
                    }
                }
                if (ac7Var.n == (!this.y) && TextUtils.equals(ac7Var.b, this.x) && ac7Var.g == this.E) {
                    z2 = this.h;
                }
                z3 = z2;
            }
        }
        this.c.a(z3, z);
    }

    public final void l0() {
        String M0;
        if (this.s) {
            if (TextUtils.isEmpty(this.x) || !this.n) {
                int i = this.E;
                int i2 = uc7.s5;
                int i3 = i & i2;
                if ((i3 & i2) == i2) {
                    if ((i & 64) != 0) {
                        M0 = ob6.M0(2131750695, null);
                    } else {
                        if ((i & 32) != 0) {
                            M0 = ob6.M0(2131750696, null);
                        }
                        M0 = "";
                    }
                } else if ((i3 & 1) != 0) {
                    if ((i3 & (-2)) == 0) {
                        M0 = ob6.M0(2131750756, null);
                    }
                    M0 = "";
                } else if ((i3 & 2) != 0) {
                    if ((i3 & (-3)) == 0) {
                        M0 = ob6.M0(2131750683, null);
                    }
                    M0 = "";
                } else if ((i3 & 4) != 0) {
                    if ((i3 & (-5)) == 0) {
                        M0 = ob6.M0(2131750739, null);
                    }
                    M0 = "";
                } else if ((i3 & 16) != 0) {
                    if ((i3 & (-17)) == 0) {
                        M0 = ob6.M0(2131750766, null);
                    }
                    M0 = "";
                } else {
                    if ((i3 & 8) != 0 && (i3 & (-9)) == 0) {
                        M0 = ob6.M0(2131750765, null);
                    }
                    M0 = "";
                }
                String str = M0.length() <= 12 ? M0 : "";
                this.x = str;
                cf4 cf4Var = this.J;
                if (cf4Var != null) {
                    cf4Var.e(hm.cloneSpans(str, -1, cf4Var.s.getPaint().getFontMetricsInt(), 0.5f), false);
                }
                f89 L = this.a.L(this.d);
                if (L != null) {
                    this.b.y(L);
                }
            }
        }
    }

    public final void n0() {
        uc7 messagesController = getMessagesController();
        ac7 ac7Var = this.r;
        messagesController.y5(ac7Var);
        ArrayList<TLRPC.InputPeer> arrayList = new ArrayList<>();
        for (int i = 0; i < ac7Var.h.size(); i++) {
            long longValue = ((Long) ac7Var.h.get(i)).longValue();
            if (longValue < 0 && i0(getMessagesController().M0(Long.valueOf(-longValue)))) {
                arrayList.add(getMessagesController().j1(longValue));
            }
        }
        if (arrayList.size() > (getUserConfig().p() ? getMessagesController().k4.k1 : getMessagesController().k4.j1).f()) {
            showDialog(new l46(4, this.currentAccount, null, getParentActivity(), this));
            return;
        }
        if (arrayList.isEmpty()) {
            je4 je4Var = new je4(ac7Var, null);
            je4Var.y = new ne4(this, (byte) 3);
            je4Var.x = new ne4(this, (byte) 4);
            presentFragment(je4Var);
            return;
        }
        TL_chatlists.TL_chatlists_exportChatlistInvite tL_chatlists_exportChatlistInvite = new TL_chatlists.TL_chatlists_exportChatlistInvite();
        TL_chatlists.TL_inputChatlistDialogFilter tL_inputChatlistDialogFilter = new TL_chatlists.TL_inputChatlistDialogFilter();
        tL_chatlists_exportChatlistInvite.chatlist = tL_inputChatlistDialogFilter;
        tL_inputChatlistDialogFilter.filter_id = ac7Var.a;
        tL_chatlists_exportChatlistInvite.peers = arrayList;
        tL_chatlists_exportChatlistInvite.title = "";
        getConnectionsManager().sendRequest(tL_chatlists_exportChatlistInvite, new pe4(this, (byte) 1));
    }

    public final void o0() {
        if (!this.w) {
            finishFragment();
            return;
        }
        this.w = false;
        Paint.FontMetricsInt titleFontMetricsInt = this.simpleActionBar.getTitleFontMetricsInt();
        ac7 ac7Var = this.r;
        Spannable A5 = r47.A5(pv3.m(ac7Var.b, titleFontMetricsInt, false, null, 0), ac7Var.c, titleFontMetricsInt, false);
        jla jlaVar = this.simpleActionBar;
        jlaVar.getClass();
        jlaVar.K(A5, true, 220L, k43.h);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onBackPressed(boolean z) {
        lt3 lt3Var;
        if4 if4Var = this.L;
        if (if4Var == null || (lt3Var = if4Var.b) == null || !lt3Var.e) {
            return j0(z);
        }
        if (!z) {
            return false;
        }
        lt3Var.k(true);
        return false;
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean onFragmentCreate() {
        C0();
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.N != 0) {
            getConnectionsManager().cancelRequest(this.N, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onInsets(int i, int i2, int i3, int i4) {
        if4 if4Var;
        View view = this.fragmentView;
        if (view == null || (if4Var = this.L) == null || !if4Var.b.e) {
            return;
        }
        view.requestLayout();
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onResume() {
        super.onResume();
        C0();
        t64 t64Var = this.U;
        if (t64Var != null) {
            t64Var.run();
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final void onThemeColorsChanged() {
        lt3 lt3Var;
        int themedColor;
        try {
            super.onThemeColorsChanged();
            D0();
            try {
                if4 if4Var = this.L;
                if (if4Var != null && (lt3Var = if4Var.b) != null && lt3Var.getEditText() != null && (themedColor = getThemedColor(aob.Fi)) != this.V) {
                    this.V = themedColor;
                    this.L.b.getEditText().setEmojiColor(Integer.valueOf(themedColor));
                }
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    public final void p0() {
        this.y = !this.y;
        df4 df4Var = this.K;
        if (df4Var != null) {
            si siVar = df4Var.r;
            String str = null;
            if (m0(this.x)) {
                str = ob6.M0(this.y ? 2131750700 : 2131750699, null);
            }
            siVar.setText(str);
        }
        wl.r(this.currentAccount, this.y);
        k0(true);
        jla jlaVar = this.simpleActionBar;
        if (jlaVar != null) {
            if (jlaVar.getTitleTextView() != null) {
                this.simpleActionBar.getTitleTextView().setEmojiCacheType(this.y ? 0 : 26);
            }
            if (this.simpleActionBar.getTitleTextView2() != null) {
                this.simpleActionBar.getTitleTextView2().setEmojiCacheType(this.y ? 0 : 26);
            }
        }
    }

    public final void q0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite != null) {
            int i = 0;
            while (true) {
                arrayList = this.M;
                if (i >= arrayList.size()) {
                    i = -1;
                    break;
                } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i)).url, tL_exportedChatlistInvite.url)) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                arrayList.remove(i);
                if (arrayList.isEmpty()) {
                    ac7 ac7Var = this.r;
                    int i2 = ac7Var.g;
                    int i3 = uc7.r5;
                    ac7Var.g = i2 & (-513);
                }
                C0();
            }
        }
    }

    public final void r0(TL_chatlists.TL_exportedChatlistInvite tL_exportedChatlistInvite) {
        ArrayList arrayList;
        if (tL_exportedChatlistInvite == null) {
            return;
        }
        int i = 0;
        while (true) {
            arrayList = this.M;
            if (i >= arrayList.size()) {
                i = -1;
                break;
            } else if (TextUtils.equals(((TL_chatlists.TL_exportedChatlistInvite) arrayList.get(i)).url, tL_exportedChatlistInvite.url)) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            arrayList.add(tL_exportedChatlistInvite);
        } else {
            arrayList.set(i, tL_exportedChatlistInvite);
        }
        C0();
    }

    public final void s0(int i, boolean z) {
        ac7 ac7Var;
        if (this.T || (ac7Var = this.r) == null || !ac7Var.c() || !ac7Var.e()) {
            return;
        }
        this.T = true;
        this.U = new t64((Object) this, z, i, (byte) 1);
        if (getLayoutContainer() != null) {
            this.U.run();
            this.U = null;
        }
    }

    public final void t0(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        int size;
        int i;
        if (arrayList != null) {
            i = 0;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!arrayList2.contains(arrayList.get(i2))) {
                    i++;
                }
            }
            size = 0;
            for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                if (!arrayList.contains(arrayList2.get(i3))) {
                    size++;
                }
            }
        } else {
            size = arrayList2.size();
            i = 0;
        }
        if (!z) {
            if (size > 0) {
                s0(size, false);
            }
        } else if (size > 0 && size > i) {
            s0(size, true);
        } else if (i > 0) {
            s0(i, false);
        }
    }

    @Override // org.telegram.ui.ActionBar.e
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        kg5 kg5Var = this.S;
        if (kg5Var != null) {
            kg5Var.f(true);
            this.S = null;
        }
        y0(new oe4(this, (byte) 0), true);
    }

    public final void y0(Runnable runnable, boolean z) {
        CharSequence[] charSequenceArr = {this.x};
        z0(this.r, this.E, charSequenceArr[0].toString(), getMediaDataController().Y(charSequenceArr, false, true), true ^ this.y, this.F, this.G, this.H, this.I, this.s, false, this.h, true, z, this, new vx3(this, runnable, (byte) 27));
    }
}
