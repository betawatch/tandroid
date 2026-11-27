// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.b0;
import org.telegram.ui.Components.c0;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class a39 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a39(int i, Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x097b  */
    /* JADX WARN: Removed duplicated region for block: B:365:0x09cb  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x0a0e  */
    /* JADX WARN: Removed duplicated region for block: B:390:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x0a39  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0a50  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x0a45  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x0a10  */
    /* JADX WARN: Type inference failed for: r1v76, types: [int] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String G;
        int size;
        int i;
        int size2;
        int i2;
        int i3;
        int size3;
        int L;
        float f;
        int i4;
        int i5;
        int i6;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        byte b = 4;
        UndoView undoView = null;
        r14 = null;
        String str = null;
        UndoView undoView2 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = null;
        int i7 = 0;
        switch (this.a) {
            case 0:
                c39 c39Var = (c39) this.c;
                int i8 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i9 = c39Var.f;
                TextView textView = c39Var.b;
                r47 r47Var = c39Var.s;
                ImageView imageView = c39Var.d;
                de0 de0Var = c39Var.e;
                ArrayList arrayList = c39Var.r;
                ArrayList arrayList2 = c39Var.n;
                if (arrayList2.isEmpty() || arrayList2.size() < i8) {
                    G = ob6.G(i8, "ReactionsCount", new Object[0]);
                } else {
                    G = String.format(ob6.J0(i8, "Reacted"), i8 == arrayList2.size() ? String.valueOf(i8) : i8 + "/" + arrayList2.size());
                }
                if (c39Var.getMeasuredWidth() > 0) {
                    c39Var.w = c39Var.getMeasuredWidth();
                }
                textView.setText(G);
                TLRPC.TL_messageReactions tL_messageReactions = r47Var.k.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    ArrayList arrayList3 = ls6.d0(i9).h;
                    int size4 = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size4) {
                        Object obj = arrayList3.get(i10);
                        i10++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            de0Var.n(jn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            de0Var.setVisibility(0);
                            de0Var.setAlpha(0.0f);
                            de0Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList4 = tL_messages_messageReactionsList.users;
                            size = arrayList4.size();
                            i = 0;
                            while (i < size) {
                                TLRPC.User user = arrayList4.get(i);
                                int i11 = i + 1;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = r47Var.k.from_id;
                                if (peer != null) {
                                    i6 = i11;
                                    if (user2.id != peer.user_id) {
                                        int i12 = i7;
                                        while (true) {
                                            if (i12 < arrayList.size()) {
                                                i5 = size;
                                                if (((b39) arrayList.get(i12)).b != user2.id) {
                                                    i12++;
                                                    size = i5;
                                                }
                                            } else {
                                                i5 = size;
                                                arrayList.add(new b39(0, user2));
                                            }
                                        }
                                    } else {
                                        i5 = size;
                                    }
                                } else {
                                    i5 = size;
                                    i6 = i11;
                                }
                                i = i6;
                                size = i5;
                                i7 = 0;
                            }
                            ArrayList<TLRPC.Chat> arrayList5 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList5.size();
                            i2 = 0;
                            while (i2 < size2) {
                                TLRPC.Chat chat = arrayList5.get(i2);
                                i2++;
                                TLRPC.Chat chat2 = chat;
                                TLRPC.Peer peer2 = r47Var.k.from_id;
                                if (peer2 != null && chat2.id != peer2.user_id) {
                                    while (true) {
                                        if (i4 < arrayList.size()) {
                                            i4 = ((b39) arrayList.get(i4)).b != (-chat2.id) ? i4 + 1 : 0;
                                        } else {
                                            arrayList.add(new b39(0, chat2));
                                        }
                                    }
                                }
                            }
                            tk4 tk4Var = c39Var.a;
                            jc0 jc0Var = c39Var.c;
                            c39Var.setEnabled(arrayList.size() <= 0);
                            for (i3 = 0; i3 < 3; i3++) {
                                if (i3 < arrayList.size()) {
                                    jc0Var.b(i3, i9, ((b39) arrayList.get(i3)).a);
                                } else {
                                    jc0Var.b(i3, i9, null);
                                }
                            }
                            size3 = arrayList.size();
                            if (size3 != 1) {
                                L = hl.L(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f = 0.0f;
                                    if (ob6.a0) {
                                        f = hl.L(12.0f);
                                    }
                                    jc0Var.setTranslationX(f);
                                    jc0Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    jc0Var.animate().alpha(1.0f).setDuration(220L).start();
                                    tk4Var.animate().alpha(0.0f).setDuration(220L).setListener(new gf4(tk4Var)).start();
                                    return;
                                }
                                L = hl.L(12.0f);
                            }
                            f = L;
                            if (ob6.a0) {
                            }
                            jc0Var.setTranslationX(f);
                            jc0Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            jc0Var.animate().alpha(1.0f).setDuration(220L).start();
                            tk4Var.animate().alpha(0.0f).setDuration(220L).setListener(new gf4(tk4Var)).start();
                            return;
                        }
                    }
                }
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).start();
                ArrayList<TLRPC.User> arrayList42 = tL_messages_messageReactionsList.users;
                size = arrayList42.size();
                i = 0;
                while (i < size) {
                }
                ArrayList<TLRPC.Chat> arrayList52 = tL_messages_messageReactionsList.chats;
                size2 = arrayList52.size();
                i2 = 0;
                while (i2 < size2) {
                }
                tk4 tk4Var2 = c39Var.a;
                jc0 jc0Var2 = c39Var.c;
                c39Var.setEnabled(arrayList.size() <= 0);
                while (i3 < 3) {
                }
                size3 = arrayList.size();
                if (size3 != 1) {
                }
                f = L;
                if (ob6.a0) {
                }
                jc0Var2.setTranslationX(f);
                jc0Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                jc0Var2.animate().alpha(1.0f).setDuration(220L).start();
                tk4Var2.animate().alpha(0.0f).setDuration(220L).setListener(new gf4(tk4Var2)).start();
                return;
            case 1:
                e eVar = (e) this.c;
                int i13 = this.b;
                en9 en9Var = (en9) this.d;
                d31.b0(eVar).c(ob6.M0(2131754481, null)).j();
                uc7.s1(i13).n0(false);
                hl.c3(en9Var);
                return;
            case 2:
                vn1 vn1Var = (vn1) this.c;
                d31 d31Var = (d31) this.d;
                int i14 = this.b;
                vn1Var.run();
                d31Var.c(ob6.M0(2131754481, null)).j();
                uc7.s1(i14).n0(false);
                return;
            case 3:
                xl9 xl9Var = (xl9) this.c;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) this.d;
                int i15 = this.b;
                am9 m = xl9Var.getGrid().m(pagetablecell);
                if (m != null) {
                    dg9 dg9Var = m.a;
                    dg9Var.O();
                    dg9Var.setSelection(Math.max(0, Math.min(i15, dg9Var.length())));
                    return;
                }
                return;
            case 4:
                wx9 wx9Var = (wx9) this.c;
                TLRPC.Message message = (TLRPC.Message) this.d;
                int i16 = this.b;
                message.send_state = 0;
                jn7 notificationCenter = wx9Var.getNotificationCenter();
                Integer valueOf = Integer.valueOf(message.id);
                Integer valueOf2 = Integer.valueOf(message.id);
                Long valueOf3 = Long.valueOf(message.dialog_id);
                Integer valueOf4 = Integer.valueOf(i16);
                Boolean bool = Boolean.FALSE;
                notificationCenter.k(21, valueOf, valueOf2, message, valueOf3, 0L, valueOf4, bool);
                wx9Var.getNotificationCenter().k(22, Integer.valueOf(message.id), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i16), bool);
                wx9Var.getSendMessagesHelper().c0(message.id);
                wx9Var.getSendMessagesHelper().h0(message.id, false);
                return;
            case 5:
                hea heaVar = (hea) this.c;
                int i17 = this.b;
                ArrayList arrayList6 = (ArrayList) this.d;
                fea feaVar = heaVar.e;
                kea keaVar = heaVar.L;
                if (i17 == heaVar.r) {
                    heaVar.b();
                    heaVar.J = false;
                    heaVar.w = i17;
                    if (heaVar.s != i17) {
                        feaVar.b();
                    }
                    mda mdaVar = keaVar.A1;
                    hea heaVar2 = keaVar.H1;
                    if (mdaVar.getAdapter() != heaVar2) {
                        keaVar.I0();
                        heaVar2.f();
                    }
                    for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                        TLObject tLObject = ((zda) arrayList6.get(i18)).b;
                        if (tLObject instanceof TLRPC.User) {
                            uc7.s1(keaVar.a).i4((TLRPC.User) tLObject, true, false);
                        } else if (tLObject instanceof TLRPC.Chat) {
                            uc7.s1(keaVar.a).a4((TLRPC.Chat) tLObject, true);
                        }
                    }
                    Object[] objArr = !heaVar.d.isEmpty() && arrayList6.isEmpty();
                    if (heaVar.d.isEmpty()) {
                        arrayList6.isEmpty();
                    }
                    if (objArr != false) {
                        keaVar.I0();
                    }
                    heaVar.d = arrayList6;
                    feaVar.f(arrayList6, null);
                    int i19 = heaVar.K;
                    if (heaVar.b() != 0 || feaVar.e() || heaVar.J) {
                        keaVar.s2.b(i19);
                    } else {
                        keaVar.L1.e(false, true);
                    }
                    heaVar.f();
                    keaVar.E0(true);
                    return;
                }
                return;
            case 6:
                eja ejaVar = (eja) this.c;
                ejaVar.L(this.b, (d79) this.d, false);
                ejaVar.N1 = null;
                return;
            case 7:
                ((eja) this.c).A0(this.b, (TL_stories.StoryItem) this.d);
                return;
            case 8:
                e eVar2 = (e) this.c;
                zh6 zh6Var = (zh6) this.d;
                int i20 = this.b;
                if (eVar2 instanceof zu1) {
                    zu1 zu1Var = (zu1) eVar2;
                    zu1Var.i6();
                    undoView = zu1Var.N3;
                } else if (eVar2 instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) eVar2).M;
                }
                if (undoView != null) {
                    if (zh6Var.m() == 1) {
                        undoView.m(((TLRPC.Dialog) zh6Var.n(0)).id, Integer.valueOf(i20), 53);
                        return;
                    } else {
                        undoView.k(0L, 53, Integer.valueOf(i20), Integer.valueOf(zh6Var.m()), null, null);
                        return;
                    }
                }
                return;
            case 9:
                qia qiaVar = (qia) this.c;
                int i21 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i21 == qiaVar.F) {
                    qiaVar.E = ConnectionsManager.getInstance(qiaVar.d).sendRequest(tL_messages_search, new b22(qiaVar, i21, b));
                    return;
                }
                return;
            case 10:
                qia qiaVar2 = (qia) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i22 = this.b;
                ArrayList arrayList7 = qiaVar2.h;
                int i23 = qiaVar2.d;
                if ((tLObject2 instanceof TLRPC.messages_Messages) && i22 == qiaVar2.F) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    uc7.s1(i23).j4(messages_messages.users, false);
                    uc7.s1(i23).c4(messages_messages.chats, false);
                    jf7.Y(i23).j1(messages_messages.users, messages_messages.chats, true, true);
                    for (int i24 = 0; i24 < messages_messages.messages.size(); i24++) {
                        r47 r47Var2 = new r47(i23, messages_messages.messages.get(i24), false, true);
                        if (r47Var2.z2()) {
                            r47Var2.S2 = true;
                        }
                        r47Var2.J5(qiaVar2.x, true);
                        arrayList7.add(r47Var2);
                    }
                    qiaVar2.w = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        qiaVar2.s = arrayList7.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        qiaVar2.s = true;
                    }
                    qiaVar2.G(false);
                    qiaVar2.r = false;
                    qiaVar2.E = -1;
                    return;
                }
                return;
            case 11:
                lna lnaVar = (lna) this.c;
                int i25 = this.b;
                wb2 wb2Var = (wb2) this.d;
                lnaVar.Z0 = false;
                if (!lnaVar.W0 && lnaVar.X0) {
                    lnaVar.x(true);
                    return;
                }
                lnaVar.n0 = lnaVar.g1[0];
                lnaVar.g();
                lq3.q(i25).v(wb2Var);
                lnaVar.D();
                lnaVar.s();
                return;
            case 12:
                vta vtaVar = (vta) this.c;
                int i26 = this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.d;
                int[] iArr = vtaVar.W;
                rta rtaVar = vtaVar.f;
                pta ptaVar = vtaVar.h;
                if (starGift != null) {
                    tta ttaVar = new tta(vtaVar.getContext());
                    ttaVar.a(starGift, false);
                    ttaVar.setRotation(180.0f);
                    ptaVar.f(i26, ttaVar);
                    ttaVar.setScaleX(0.5f);
                    ttaVar.setScaleY(0.5f);
                    ttaVar.setAlpha(0.0f);
                    ViewPropertyAnimator duration = ttaVar.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(520L);
                    k43 k43Var = k43.h;
                    ViewPropertyAnimator interpolator = duration.setInterpolator(k43Var);
                    interpolator.setUpdateListener(new ija(vtaVar, b));
                    interpolator.start();
                    ptaVar.a[i26].setVisibility(8);
                    rtaVar.setVisibility(0);
                    rtaVar.setAlpha(0.0f);
                    rtaVar.animate().alpha(0.5f).setDuration(820L).setInterpolator(k43Var).start();
                    return;
                }
                FrameLayout frameLayout = new FrameLayout(vtaVar.getContext());
                e29 e29Var = new e29(vtaVar.getContext());
                e29Var.f(R.raw.gift_broken, 32, 32, null);
                frameLayout.addView(e29Var, tre.e(32, 32, 17));
                e29Var.setScaleX(0.5f);
                e29Var.setScaleY(0.5f);
                e29Var.setAlpha(0.0f);
                e29Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                vtaVar.m0 = e29Var;
                frameLayout.setBackground(new jua(hl.L(12.0f), aob.p1(0.075f, -1)));
                ptaVar.a[i26].setVisibility(8);
                frameLayout.setRotation(180.0f);
                ptaVar.f(i26, frameLayout);
                vtaVar.G.a(iArr[2], iArr[3]);
                uta utaVar = vtaVar.b;
                int[] iArr2 = vtaVar.V;
                utaVar.a(iArr2[2], iArr2[3]);
                rtaVar.a(iArr[3], iArr[2]);
                return;
            case 13:
                ((ora) this.d).a(ob6.a0(null, null, 2131750004, cc.J0(this.b)), (mua) this.c, Boolean.FALSE);
                return;
            case 14:
                jxa jxaVar = (jxa) this.c;
                int i27 = this.b;
                TLObject tLObject3 = (TLObject) this.d;
                boolean[] zArr = jxaVar.r;
                ArrayList[] arrayListArr = jxaVar.q;
                int i28 = jxaVar.a;
                jxaVar.t[i27] = false;
                if (tLObject3 instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject3;
                    uc7.s1(i28).j4(starsStatus.users, false);
                    uc7.s1(i28).c4(starsStatus.chats, false);
                    arrayListArr[i27].addAll(starsStatus.history);
                    zArr[i27] = !arrayListArr[i27].isEmpty() || zArr[i27];
                    boolean[] zArr2 = jxaVar.u;
                    r15 = (starsStatus.flags & 1) == 0;
                    zArr2[i27] = r15;
                    jxaVar.s[i27] = r15 ? null : starsStatus.next_offset;
                    jxaVar.j0(starsStatus.balance);
                    jn7.f(i28).k(jn7.B3, new Object[0]);
                    return;
                }
                return;
            case 15:
                m01.u((Context) this.c, "https://" + uc7.s1(this.b).N2 + "/nft/" + ((String) this.d));
                return;
            case 16:
                ?? r1 = this.b;
                Integer num = (Integer) this.c;
                f fVar = (f) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = jf7.Y(r1).b;
                        if (sQLiteDatabase != null) {
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT data FROM emoji_groups WHERE type = ?", num);
                            try {
                                if (!sQLiteCursor.next() || (byteBufferValue = sQLiteCursor.byteBufferValue(0)) == null) {
                                    messages_emojigroups = null;
                                } else {
                                    messages_emojigroups = TLRPC.messages_EmojiGroups.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), true);
                                    byteBufferValue.reuse();
                                }
                                if (messages_emojigroups instanceof TLRPC.TL_messages_emojiGroups) {
                                    fVar.a(Long.valueOf(r2.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    fVar.a(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e) {
                                e = e;
                                cc4.g(e, true);
                                fVar.a(0L, null);
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                    return;
                                }
                                return;
                            }
                        }
                        if (sQLiteCursor2 != null) {
                            sQLiteCursor2.dispose();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        th = th;
                        sQLiteCursor3 = r1;
                        if (sQLiteCursor3 != null) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    sQLiteCursor = null;
                } catch (Throwable th2) {
                    th = th2;
                    if (sQLiteCursor3 != null) {
                    }
                    throw th;
                }
                break;
            case 17:
                int i29 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num2 = (Integer) this.d;
                try {
                    SQLiteDatabase sQLiteDatabase2 = jf7.Y(i29).b;
                    if (sQLiteDatabase2 != null) {
                        if (tL_messages_emojiGroups == null) {
                            sQLiteDatabase2.executeFast("DELETE FROM emoji_groups WHERE type = " + num2).stepThis().dispose();
                        } else {
                            SQLitePreparedStatement executeFast = sQLiteDatabase2.executeFast("REPLACE INTO emoji_groups VALUES(?, ?)");
                            executeFast.requery();
                            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_messages_emojiGroups.getObjectSize());
                            tL_messages_emojiGroups.serializeToStream(nativeByteBuffer);
                            executeFast.bindInteger(1, num2.intValue());
                            executeFast.bindByteBuffer(2, nativeByteBuffer);
                            executeFast.step();
                            nativeByteBuffer.reuse();
                            executeFast.dispose();
                        }
                    }
                    return;
                } catch (Exception e3) {
                    cc4.g(e3, true);
                    return;
                }
            case 18:
                g4b g4bVar = (g4b) this.c;
                zh6 zh6Var2 = (zh6) this.d;
                int i30 = this.b;
                e eVar3 = g4bVar.U2.F1;
                if (eVar3 instanceof zu1) {
                    zu1 zu1Var2 = (zu1) eVar3;
                    zu1Var2.i6();
                    undoView2 = zu1Var2.N3;
                } else if (eVar3 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) eVar3).M;
                }
                if (undoView2 != null) {
                    if (zh6Var2.m() == 1) {
                        undoView2.m(((TLRPC.Dialog) zh6Var2.n(0)).id, Integer.valueOf(i30), 53);
                        return;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i30), Integer.valueOf(zh6Var2.m()), null, null);
                        return;
                    }
                }
                return;
            case 19:
                TLObject tLObject4 = (TLObject) this.c;
                int i31 = this.b;
                zo2 zo2Var = (zo2) this.d;
                if (tLObject4 instanceof TL_stories.TL_albums) {
                    ArrayList<TL_stories.TL_storyAlbum> arrayList8 = ((TL_stories.TL_albums) tLObject4).albums;
                    int size5 = arrayList8.size();
                    while (i7 < size5) {
                        TL_stories.TL_storyAlbum tL_storyAlbum = arrayList8.get(i7);
                        i7++;
                        TL_stories.TL_storyAlbum tL_storyAlbum2 = tL_storyAlbum;
                        if (tL_storyAlbum2.album_id == i31) {
                            zo2Var.a(tL_storyAlbum2);
                            return;
                        }
                    }
                }
                zo2Var.a(null);
                return;
            case 20:
                hl.c3(new mb4(this.b, ((jf7) this.c).i0(new ArrayList((HashSet) this.d))));
                return;
            case 21:
                ccb ccbVar = (ccb) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                int i32 = this.b;
                lcb lcbVar = ccbVar.d;
                acb acbVar = lcbVar.o0;
                int i33 = lcbVar.h;
                acbVar.B0 = arrayList9;
                acbVar.z0 = i33;
                acbVar.setAdapter(null);
                acbVar.setAdapter(acbVar.A0);
                acbVar.setCurrentItem(i32);
                acbVar.D0 = true;
                return;
            case 22:
                zeb zebVar = (zeb) this.c;
                String str2 = (String) this.d;
                int i34 = this.b;
                ArrayList arrayList10 = new ArrayList(1);
                hs6 hs6Var = new hs6();
                hs6Var.a = str2;
                hs6Var.b = null;
                arrayList10.add(hs6Var);
                ls6.d0(zebVar.a).Q(arrayList10, 15, false, false, new efa((Object) zebVar, i34, (Object) str2, (Object) arrayList10, (byte) 8));
                return;
            case 23:
                dkb dkbVar = (dkb) this.c;
                jf7 jf7Var = (jf7) this.d;
                int i35 = this.b;
                ArrayList arrayList11 = new ArrayList();
                zh6 zh6Var3 = new zh6();
                zh6 zh6Var4 = new zh6();
                try {
                    ArrayList arrayList12 = new ArrayList();
                    ArrayList arrayList13 = new ArrayList();
                    SQLiteDatabase sQLiteDatabase3 = jf7Var.b;
                    Locale locale = Locale.US;
                    SQLiteCursor queryFinalized = sQLiteDatabase3.queryFinalized("SELECT DISTINCT uid FROM media_v4 WHERE uid != 0 AND mid > 0 AND type = 4", new Object[0]);
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        if (!wf3.B(longValue)) {
                            arrayList11.add(Long.valueOf(longValue));
                            if (wf3.D(longValue)) {
                                arrayList12.add(Long.valueOf(longValue));
                            } else {
                                arrayList13.add(Long.valueOf(-longValue));
                            }
                        }
                    }
                    queryFinalized.dispose();
                    if (!arrayList12.isEmpty()) {
                        ArrayList arrayList14 = new ArrayList();
                        jf7Var.k0(arrayList12, arrayList14, false);
                        int size6 = arrayList14.size();
                        int i36 = 0;
                        while (i36 < size6) {
                            Object obj2 = arrayList14.get(i36);
                            i36++;
                            TLRPC.User user3 = (TLRPC.User) obj2;
                            zh6Var3.k(user3.id, user3);
                        }
                    }
                    if (!arrayList13.isEmpty()) {
                        ArrayList arrayList15 = new ArrayList();
                        jf7Var.P(TextUtils.join(",", arrayList13), arrayList15);
                        int size7 = arrayList15.size();
                        while (i7 < size7) {
                            Object obj3 = arrayList15.get(i7);
                            i7++;
                            TLRPC.Chat chat3 = (TLRPC.Chat) obj3;
                            zh6Var4.k(chat3.id, chat3);
                        }
                    }
                } catch (Exception e4) {
                    cc4.g(e4, true);
                }
                hl.c3(new l77((Object) dkbVar, i35, (Object) arrayList11, (Object) zh6Var3, (Object) zh6Var4, (byte) 28));
                return;
            case 24:
                c0 c0Var = (c0) this.c;
                String str3 = (String) this.d;
                int i37 = this.b;
                b0 b0Var = c0Var.r.r1;
                try {
                    String lowerCase = str3.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        c0Var.d = -1;
                        hl.c3(new efa((Object) c0Var, c0Var.d, (Object) new ArrayList(), (Object) new ArrayList(), (byte) 10));
                        return;
                    }
                    String S0 = ob6.D0().S0(lowerCase, true, false);
                    if (!lowerCase.equals(S0) && S0.length() != 0) {
                        str = S0;
                    }
                    int i38 = (str != null ? 1 : 0) + 1;
                    String[] strArr = new String[i38];
                    strArr[0] = lowerCase;
                    if (str != null) {
                        strArr[1] = str;
                    }
                    ArrayList arrayList16 = new ArrayList();
                    ArrayList arrayList17 = new ArrayList();
                    int size8 = b0Var.d.size();
                    for (int i39 = 0; i39 < size8; i39++) {
                        ArrayList arrayList18 = (ArrayList) b0Var.d.get(i39);
                        String c = d0f.c(((apb) arrayList18.get(0)).e);
                        String lowerCase2 = c.toLowerCase();
                        int i40 = 0;
                        while (true) {
                            if (i40 < i38) {
                                String str4 = strArr[i40];
                                if (lowerCase2.contains(str4)) {
                                    arrayList16.add(arrayList18);
                                    arrayList17.add(c0.E(c, str4));
                                } else {
                                    i40++;
                                }
                            }
                        }
                    }
                    hl.c3(new efa((Object) c0Var, i37, (Object) arrayList16, (Object) arrayList17, (byte) 10));
                    return;
                } catch (Exception e5) {
                    cc4.g(e5, true);
                    return;
                }
            case 25:
                hl.c3(new efa(this.c, this.d, this.b, (Object) hgb.c(hl.p, R.raw.default_pattern, hl.L(120.0f), hl.L(140.0f), -16777216, 1), (byte) 11));
                return;
            case 26:
                ((dsb) this.c).b((short[]) this.d, this.b);
                return;
            case 27:
                ktb ktbVar = (ktb) this.c;
                gl1 gl1Var = (gl1) this.d;
                int i41 = this.b;
                zu1 zu1Var3 = gl1Var.b;
                int i42 = zu1.Ad;
                zu1Var3.Ua(i41);
                if (i41 != 1 && i41 != 13) {
                    r15 = false;
                }
                ktbVar.b(r15);
                return;
            case 28:
                r47 r47Var3 = (r47) this.c;
                rb2 rb2Var = (rb2) this.d;
                int i43 = this.b;
                HashMap hashMap = u2c.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(u2c.r(r47Var3)));
                }
                if (rb2Var != null) {
                    rb2Var.Y(3);
                }
                jn7.f(i43).k(jn7.A1, r47Var3);
                jn7.f(i43).k(jn7.E1, new Object[0]);
                return;
            default:
                kbc kbcVar = (kbc) this.c;
                String str5 = (String) this.d;
                int i44 = this.b;
                kbcVar.c.remove(str5);
                ConnectionsManager.getInstance(kbcVar.a).cancelRequest(i44, true);
                return;
        }
    }

    public /* synthetic */ a39(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ a39(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
