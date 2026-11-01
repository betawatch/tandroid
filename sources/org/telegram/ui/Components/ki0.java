package org.telegram.ui.Components;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.v91;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ki0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ki0(int i10, Object obj, Object obj2, int i11) {
        this.a = i11;
        this.b = i10;
        this.c = obj;
        this.d = obj2;
    }

    private final void a() {
        org.telegram.ui.yr0 yr0Var = (org.telegram.ui.yr0) this.c;
        Bitmap bitmap = (Bitmap) this.d;
        if (this.b == yr0Var.a) {
            yr0Var.setImageBitmap(bitmap);
            yr0Var.c = true;
            yr0Var.b = false;
        }
    }

    private final void b() {
        org.telegram.ui.jt0 jt0Var = (org.telegram.ui.jt0) this.c;
        org.telegram.ui.ze zeVar = (org.telegram.ui.ze) this.d;
        int i10 = this.b;
        zeVar.a(Integer.valueOf(i10));
        boolean z10 = true;
        if (i10 != 1 && i10 != 13) {
            z10 = false;
        }
        jt0Var.c(z10);
    }

    private final void c() {
        cc a02;
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        String str = (String) this.d;
        RectF rectF = ProfileActivity.S6;
        org.telegram.messenger.i0.g(str);
        if (this.b == profileActivity.V2) {
            a02 = cc.a0(profileActivity);
            i10 = 2131753721;
        } else {
            a02 = cc.a0(profileActivity);
            i10 = 2131744219;
        }
        org.telegram.messenger.a30.r(null, i10, a02);
    }

    private final void d() {
        org.telegram.ui.wx0 wx0Var = (org.telegram.ui.wx0) this.c;
        s4.c1 c1Var = (s4.c1) this.d;
        wx0Var.getClass();
        int b10 = c1Var.b();
        int i10 = this.b;
        if (b10 == i10 && wx0Var.e.T2 == i10 && c1Var.f == 2) {
            wx0Var.t(c1Var, i10);
        }
    }

    private final void f() {
        org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
        hi0 hi0Var = (hi0) this.d;
        cc.a0(k2Var).c(org.telegram.messenger.dd.L0(2131754488, null)).j();
        org.telegram.messenger.wp.r1(this.b).o0(false);
        org.telegram.messenger.i0.g3(hi0Var);
    }

    private final void g() {
        org.telegram.messenger.video.a aVar = (org.telegram.messenger.video.a) this.c;
        cc ccVar = (cc) this.d;
        aVar.run();
        ccVar.c(org.telegram.messenger.dd.L0(2131754488, null)).j();
        org.telegram.messenger.wp.r1(this.b).o0(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:174:0x0408, code lost:
    
        r5 = 1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:394:0x08bc  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0905  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0954  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x095e  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x0981  */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0997  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0956  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0265  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String G;
        int size;
        int i10;
        int size2;
        int i11;
        int i12;
        int size3;
        int L;
        float f7;
        ArrayList<TLRPC.Chat> arrayList;
        int i13;
        ArrayList<TLRPC.User> arrayList2;
        SQLiteCursor sQLiteCursor;
        TLRPC.messages_EmojiGroups messages_emojigroups;
        NativeByteBuffer byteBufferValue;
        int i14;
        String str;
        PackageInfo packageInfo;
        String str2;
        UndoView undoView = null;
        String str3 = null;
        r12 = null;
        String str4 = null;
        UndoView undoView2 = null;
        SQLiteCursor sQLiteCursor2 = null;
        SQLiteCursor sQLiteCursor3 = 0;
        int i15 = 0;
        switch (this.a) {
            case 0:
                mi0 mi0Var = (mi0) this.c;
                int i16 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i17 = mi0Var.f;
                TextView textView = mi0Var.b;
                org.telegram.messenger.kj kjVar = mi0Var.s;
                ImageView imageView = mi0Var.d;
                g9 g9Var = mi0Var.e;
                ArrayList arrayList3 = mi0Var.r;
                ArrayList arrayList4 = mi0Var.n;
                if (arrayList4.isEmpty() || arrayList4.size() < i16) {
                    G = org.telegram.messenger.dd.G(i16, "ReactionsCount", new Object[0]);
                } else {
                    G = String.format(org.telegram.messenger.dd.J0(i16, "Reacted"), i16 == arrayList4.size() ? String.valueOf(i16) : i16 + "/" + arrayList4.size());
                }
                if (mi0Var.getMeasuredWidth() > 0) {
                    mi0Var.w = mi0Var.getMeasuredWidth();
                }
                textView.setText(G);
                TLRPC.TL_messageReactions tL_messageReactions = kjVar.k.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    ArrayList arrayList5 = org.telegram.messenger.vi.b0(i17).h;
                    int size4 = arrayList5.size();
                    int i18 = 0;
                    while (i18 < size4) {
                        Object obj = arrayList5.get(i18);
                        i18++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            g9Var.k(org.telegram.messenger.jc.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            g9Var.setVisibility(0);
                            g9Var.setAlpha(0.0f);
                            g9Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList6 = tL_messages_messageReactionsList.users;
                            size = arrayList6.size();
                            i10 = 0;
                            while (i10 < size) {
                                TLRPC.User user = arrayList6.get(i10);
                                i10++;
                                TLRPC.User user2 = user;
                                TLRPC.Peer peer = kjVar.k.from_id;
                                if (peer != null) {
                                    arrayList2 = arrayList6;
                                    if (user2.id != peer.user_id) {
                                        int i19 = 0;
                                        while (true) {
                                            if (i19 < arrayList3.size()) {
                                                int i20 = i19;
                                                if (((li0) arrayList3.get(i19)).b == user2.id) {
                                                    break;
                                                } else {
                                                    i19 = i20 + 1;
                                                }
                                            } else {
                                                arrayList3.add(new li0(0, user2));
                                            }
                                        }
                                    }
                                } else {
                                    arrayList2 = arrayList6;
                                }
                                arrayList6 = arrayList2;
                            }
                            ArrayList<TLRPC.Chat> arrayList7 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList7.size();
                            i11 = 0;
                            while (i11 < size2) {
                                TLRPC.Chat chat = arrayList7.get(i11);
                                i11++;
                                TLRPC.Chat chat2 = chat;
                                TLRPC.Peer peer2 = kjVar.k.from_id;
                                if (peer2 == null || chat2.id == peer2.user_id) {
                                    arrayList = arrayList7;
                                    i13 = size2;
                                } else {
                                    int i21 = 0;
                                    while (true) {
                                        if (i21 < arrayList3.size()) {
                                            arrayList = arrayList7;
                                            i13 = size2;
                                            if (((li0) arrayList3.get(i21)).b == (-chat2.id)) {
                                                break;
                                            }
                                            i21++;
                                            arrayList7 = arrayList;
                                            size2 = i13;
                                        } else {
                                            arrayList = arrayList7;
                                            i13 = size2;
                                            arrayList3.add(new li0(0, chat2));
                                        }
                                    }
                                }
                                arrayList7 = arrayList;
                                size2 = i13;
                            }
                            zz zzVar = mi0Var.a;
                            u8 u8Var = mi0Var.c;
                            mi0Var.setEnabled(arrayList3.size() <= 0);
                            for (i12 = 0; i12 < 3; i12++) {
                                if (i12 < arrayList3.size()) {
                                    u8Var.b(i12, i17, ((li0) arrayList3.get(i12)).a);
                                } else {
                                    u8Var.b(i12, i17, null);
                                }
                            }
                            size3 = arrayList3.size();
                            if (size3 != 1) {
                                L = org.telegram.messenger.i0.L(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f7 = 0.0f;
                                    if (org.telegram.messenger.dd.X) {
                                        f7 = org.telegram.messenger.i0.L(12.0f);
                                    }
                                    u8Var.setTranslationX(f7);
                                    u8Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    u8Var.animate().alpha(1.0f).setDuration(220L).start();
                                    zzVar.animate().alpha(0.0f).setDuration(220L).setListener(new eg.m(zzVar)).start();
                                    return;
                                }
                                L = org.telegram.messenger.i0.L(12.0f);
                            }
                            f7 = L;
                            if (org.telegram.messenger.dd.X) {
                            }
                            u8Var.setTranslationX(f7);
                            u8Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            u8Var.animate().alpha(1.0f).setDuration(220L).start();
                            zzVar.animate().alpha(0.0f).setDuration(220L).setListener(new eg.m(zzVar)).start();
                            return;
                        }
                    }
                }
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).start();
                ArrayList<TLRPC.User> arrayList62 = tL_messages_messageReactionsList.users;
                size = arrayList62.size();
                i10 = 0;
                while (i10 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList72 = tL_messages_messageReactionsList.chats;
                size2 = arrayList72.size();
                i11 = 0;
                while (i11 < size2) {
                }
                zz zzVar2 = mi0Var.a;
                u8 u8Var2 = mi0Var.c;
                mi0Var.setEnabled(arrayList3.size() <= 0);
                while (i12 < 3) {
                }
                size3 = arrayList3.size();
                if (size3 != 1) {
                }
                f7 = L;
                if (org.telegram.messenger.dd.X) {
                }
                u8Var2.setTranslationX(f7);
                u8Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                u8Var2.animate().alpha(1.0f).setDuration(220L).start();
                zzVar2.animate().alpha(0.0f).setDuration(220L).setListener(new eg.m(zzVar2)).start();
                return;
            case 1:
                mp0 mp0Var = (mp0) this.c;
                int i22 = this.b;
                ArrayList arrayList8 = (ArrayList) this.d;
                kp0 kp0Var = mp0Var.e;
                pp0 pp0Var = mp0Var.K;
                if (i22 != mp0Var.r) {
                    return;
                }
                mp0Var.b();
                mp0Var.I = false;
                mp0Var.w = i22;
                if (mp0Var.s != i22) {
                    kp0Var.b();
                }
                po0 po0Var = pp0Var.x1;
                mp0 mp0Var2 = pp0Var.E1;
                if (po0Var.getAdapter() != mp0Var2) {
                    pp0.J0(pp0Var);
                    mp0Var2.f();
                }
                for (int i23 = 0; i23 < arrayList8.size(); i23++) {
                    TLObject tLObject = ((ep0) arrayList8.get(i23)).b;
                    if (tLObject instanceof TLRPC.User) {
                        org.telegram.messenger.wp.r1(pp0Var.a).U3((TLRPC.User) tLObject, true, false);
                    } else if (tLObject instanceof TLRPC.Chat) {
                        org.telegram.messenger.wp.r1(pp0Var.a).N3((TLRPC.Chat) tLObject, true);
                    }
                }
                boolean z10 = !mp0Var.d.isEmpty() && arrayList8.isEmpty();
                if (mp0Var.d.isEmpty()) {
                    arrayList8.isEmpty();
                }
                if (z10) {
                    pp0.J0(pp0Var);
                }
                mp0Var.d = arrayList8;
                kp0Var.f(arrayList8, null);
                int i24 = mp0Var.J;
                if (mp0Var.b() != 0 || kp0Var.e() || mp0Var.I) {
                    pp0Var.p2.b(i24);
                } else {
                    pp0Var.I1.e(false, true);
                }
                mp0Var.f();
                pp0Var.K0(true);
                return;
            case 2:
                r0.getStoriesController().c(this.b, ((au0) this.c).l1, (TL_stories.StoryItem) this.d);
                return;
            case 3:
                au0 au0Var = (au0) this.c;
                au0Var.b0(this.b, (uk0) this.d, false);
                au0Var.M1 = null;
                return;
            case 4:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.c;
                a0.h hVar = (a0.h) this.d;
                int i25 = this.b;
                if (k2Var instanceof org.telegram.ui.un) {
                    org.telegram.ui.un unVar = (org.telegram.ui.un) k2Var;
                    unVar.c8();
                    undoView = unVar.M3;
                } else if (k2Var instanceof ProfileActivity) {
                    undoView = ((ProfileActivity) k2Var).L;
                }
                if (undoView != null) {
                    if (hVar.m() == 1) {
                        undoView.m(((TLRPC.Dialog) hVar.n(0)).id, Integer.valueOf(i25), 53);
                        return;
                    } else {
                        undoView.k(0L, 53, Integer.valueOf(i25), Integer.valueOf(hVar.m()), null, null);
                        return;
                    }
                }
                return;
            case 5:
                mt0 mt0Var = (mt0) this.c;
                int i26 = this.b;
                TLRPC.TL_messages_search tL_messages_search = (TLRPC.TL_messages_search) this.d;
                if (i26 != mt0Var.E) {
                    return;
                }
                mt0Var.D = ConnectionsManager.getInstance(mt0Var.d).sendRequest(tL_messages_search, new org.telegram.messenger.voip.g0(mt0Var, i26, 1 == true ? 1 : 0));
                return;
            case 6:
                mt0 mt0Var2 = (mt0) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i27 = this.b;
                ArrayList arrayList9 = mt0Var2.h;
                int i28 = mt0Var2.d;
                if ((tLObject2 instanceof TLRPC.messages_Messages) && i27 == mt0Var2.E) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject2;
                    org.telegram.messenger.wp.r1(i28).V3(messages_messages.users, false);
                    org.telegram.messenger.wp.r1(i28).P3(messages_messages.chats, false);
                    org.telegram.messenger.is.a0(i28).m1(messages_messages.users, messages_messages.chats, true, true);
                    for (int i29 = 0; i29 < messages_messages.messages.size(); i29++) {
                        org.telegram.messenger.kj kjVar2 = new org.telegram.messenger.kj(i28, messages_messages.messages.get(i29), false, true);
                        if (kjVar2.z2()) {
                            kjVar2.N2 = true;
                        }
                        kjVar2.J5(mt0Var2.x, true);
                        arrayList9.add(kjVar2);
                    }
                    mt0Var2.w = messages_messages.count;
                    if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                        mt0Var2.s = arrayList9.size() >= messages_messages.count;
                    } else if (messages_messages instanceof TLRPC.TL_messages_messages) {
                        mt0Var2.s = true;
                    }
                    mt0Var2.G(false);
                    mt0Var2.r = false;
                    mt0Var2.D = -1;
                    return;
                }
                return;
            case 7:
                dv0 dv0Var = (dv0) this.c;
                int i30 = this.b;
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) this.d;
                dv0Var.Y0 = false;
                if (!dv0Var.V0 && dv0Var.W0) {
                    dv0Var.C(true);
                    return;
                }
                dv0Var.m0 = dv0Var.f1[0];
                dv0Var.l();
                org.telegram.messenger.b6.q(i30).v(q1Var);
                dv0Var.I();
                dv0Var.x();
                return;
            case 8:
                int i31 = this.b;
                Integer num = (Integer) this.c;
                org.telegram.messenger.z2 z2Var = (org.telegram.messenger.z2) this.d;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = org.telegram.messenger.is.a0(i31).b;
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
                                    z2Var.a(Long.valueOf(r5.hash), (TLRPC.TL_messages_emojiGroups) messages_emojigroups);
                                } else {
                                    z2Var.a(0L, null);
                                }
                                sQLiteCursor2 = sQLiteCursor;
                            } catch (Exception e) {
                                e = e;
                                org.telegram.messenger.f8.g(e, true);
                                z2Var.a(0L, null);
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
                    } catch (Throwable th2) {
                        th = th2;
                        sQLiteCursor3 = num;
                        if (sQLiteCursor3 != 0) {
                            sQLiteCursor3.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e7) {
                    e = e7;
                    sQLiteCursor = null;
                } catch (Throwable th3) {
                    th = th3;
                    if (sQLiteCursor3 != 0) {
                    }
                    throw th;
                }
                break;
            case 9:
                int i32 = this.b;
                TLRPC.TL_messages_emojiGroups tL_messages_emojiGroups = (TLRPC.TL_messages_emojiGroups) this.c;
                Integer num2 = (Integer) this.d;
                try {
                    SQLiteDatabase sQLiteDatabase2 = org.telegram.messenger.is.a0(i32).b;
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
                } catch (Exception e10) {
                    org.telegram.messenger.f8.g(e10, true);
                    return;
                }
            case 10:
                pw0 pw0Var = (pw0) this.c;
                a0.h hVar2 = (a0.h) this.d;
                int i33 = this.b;
                org.telegram.ui.ActionBar.k2 k2Var2 = pw0Var.R2.C1;
                if (k2Var2 instanceof org.telegram.ui.un) {
                    org.telegram.ui.un unVar2 = (org.telegram.ui.un) k2Var2;
                    unVar2.c8();
                    undoView2 = unVar2.M3;
                } else if (k2Var2 instanceof ProfileActivity) {
                    undoView2 = ((ProfileActivity) k2Var2).L;
                }
                if (undoView2 != null) {
                    if (hVar2.m() == 1) {
                        undoView2.m(((TLRPC.Dialog) hVar2.n(0)).id, Integer.valueOf(i33), 53);
                        return;
                    } else {
                        undoView2.k(0L, 53, Integer.valueOf(i33), Integer.valueOf(hVar2.m()), null, null);
                        return;
                    }
                }
                return;
            case 11:
                tx0 tx0Var = (tx0) this.c;
                String str5 = (String) this.d;
                int i34 = this.b;
                ArrayList arrayList10 = new ArrayList(1);
                org.telegram.messenger.ri riVar = new org.telegram.messenger.ri();
                riVar.a = str5;
                riVar.b = null;
                arrayList10.add(riVar);
                org.telegram.messenger.vi.b0(tx0Var.a).O(arrayList10, 15, false, false, new ag.g3(tx0Var, i34, str5, arrayList10));
                return;
            case 12:
                w01 w01Var = (w01) this.c;
                String str6 = (String) this.d;
                int i35 = this.b;
                v01 v01Var = w01Var.r.o1;
                try {
                    String lowerCase = str6.trim().toLowerCase();
                    if (lowerCase.length() == 0) {
                        w01Var.d = -1;
                        org.telegram.messenger.i0.g3(new ag.g3(w01Var, w01Var.d, new ArrayList(), new ArrayList(), 29));
                        return;
                    }
                    String R0 = org.telegram.messenger.dd.D0().R0(lowerCase, true, false);
                    if (!lowerCase.equals(R0) && R0.length() != 0) {
                        str4 = R0;
                        break;
                    }
                    int i36 = 0;
                    int i37 = i36 + 1;
                    String[] strArr = new String[i37];
                    strArr[0] = lowerCase;
                    if (str4 != null) {
                        strArr[1] = str4;
                    }
                    ArrayList arrayList11 = new ArrayList();
                    ArrayList arrayList12 = new ArrayList();
                    int size5 = v01Var.d.size();
                    int i38 = 0;
                    while (i38 < size5) {
                        ArrayList arrayList13 = (ArrayList) v01Var.d.get(i38);
                        String c10 = org.telegram.ui.ActionBar.d5.c(((org.telegram.ui.ActionBar.c7) arrayList13.get(i15)).e);
                        String lowerCase2 = c10.toLowerCase();
                        int i39 = i15;
                        while (true) {
                            if (i39 < i37) {
                                String str7 = strArr[i39];
                                if (lowerCase2.contains(str7)) {
                                    arrayList11.add(arrayList13);
                                    arrayList12.add(w01.E(c10, str7));
                                } else {
                                    i39++;
                                }
                            }
                        }
                        i38++;
                        i15 = 0;
                    }
                    org.telegram.messenger.i0.g3(new ag.g3(w01Var, i35, arrayList11, arrayList12, 29));
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.f8.g(e11, true);
                    return;
                }
            case 13:
                org.telegram.messenger.i0.g3(new d11((f11) this.c, (cp) this.d, this.b, org.telegram.messenger.e00.c(org.telegram.messenger.i0.p, R.raw.default_pattern, org.telegram.messenger.i0.L(120.0f), org.telegram.messenger.i0.L(140.0f), -16777216, 1), 0));
                return;
            case 14:
                org.telegram.messenger.kj kjVar3 = (org.telegram.messenger.kj) this.c;
                org.telegram.ui.Cells.l1 l1Var = (org.telegram.ui.Cells.l1) this.d;
                int i40 = this.b;
                HashMap hashMap = v21.P;
                if (hashMap != null) {
                    hashMap.remove(Integer.valueOf(v21.n(kjVar3)));
                }
                if (l1Var != null) {
                    l1Var.c0(3);
                }
                org.telegram.messenger.at.f(i40).k(org.telegram.messenger.at.A1, kjVar3);
                org.telegram.messenger.at.f(i40).k(org.telegram.messenger.at.E1, new Object[0]);
                return;
            case 15:
                org.telegram.ui.fx fxVar = (org.telegram.ui.fx) this.c;
                int i41 = this.b;
                TLRPC.Dialog dialog = (TLRPC.Dialog) this.d;
                org.telegram.ui.zx zxVar = fxVar.j0;
                ArrayList arrayList14 = zxVar.R1;
                if (arrayList14 == null || i41 < 0 || i41 >= arrayList14.size()) {
                    return;
                }
                zxVar.R1.add(i41, dialog);
                zxVar.e0[0].q(true);
                return;
            case 16:
                org.telegram.ui.xx xxVar = (org.telegram.ui.xx) this.c;
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) this.d;
                int i42 = this.b;
                org.telegram.ui.yx yxVar = xxVar.g;
                org.telegram.ui.zx zxVar2 = xxVar.h;
                zxVar2.S1 = true;
                zxVar2.getMessagesController().d(0, i42, dialog2.id);
                zxVar2.S1 = false;
                ArrayList V0 = zxVar2.getMessagesController().V0(0);
                int indexOf = V0.indexOf(dialog2);
                if (indexOf < 0) {
                    yxVar.q(false);
                    return;
                }
                ArrayList V02 = zxVar2.getMessagesController().V0(1);
                if (!V02.isEmpty() || indexOf != 1) {
                    zxVar2.M4(true, true);
                    yxVar.y.D();
                    yxVar.q(true);
                    zxVar2.z3();
                }
                if (V02.isEmpty()) {
                    V0.remove(0);
                    if (indexOf == 1) {
                        zxVar2.M4(true, true);
                        yxVar.q(true);
                        zxVar2.z3();
                        return;
                    } else {
                        if (!zxVar2.R1.isEmpty()) {
                            zxVar2.R1.remove(0);
                        }
                        yxVar.y.D();
                        yxVar.q(true);
                        return;
                    }
                }
                return;
            case 17:
                org.telegram.ui.a50 a50Var = (org.telegram.ui.a50) this.c;
                org.telegram.ui.ActionBar.x1[] x1VarArr = (org.telegram.ui.ActionBar.x1[]) this.d;
                int i43 = this.b;
                org.telegram.ui.ActionBar.x1 x1Var = x1VarArr[0];
                if (x1Var == null) {
                    return;
                }
                x1Var.setOnCancelListener(new org.telegram.ui.ba(a50Var, i43, 5));
                x1VarArr[0].show();
                return;
            case 18:
                LaunchActivity launchActivity = (LaunchActivity) this.c;
                TLRPC.TL_help_appUpdate tL_help_appUpdate = (TLRPC.TL_help_appUpdate) this.d;
                int i44 = this.b;
                Pattern pattern = LaunchActivity.D1;
                TLRPC.TL_help_appUpdate tL_help_appUpdate2 = org.telegram.messenger.uz.j1;
                if (tL_help_appUpdate2 == null || !tL_help_appUpdate2.version.equals(tL_help_appUpdate.version)) {
                    try {
                        packageInfo = org.telegram.messenger.w0.b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.b.getPackageName(), 0);
                        i14 = packageInfo.versionCode;
                    } catch (Exception e12) {
                        e = e12;
                        i14 = 0;
                    }
                    try {
                        str3 = packageInfo.versionName;
                    } catch (Exception e13) {
                        e = e13;
                        org.telegram.messenger.f8.g(e, true);
                        if (i14 == 0) {
                        }
                        if (str3 == null) {
                        }
                        str = tL_help_appUpdate.version;
                        if (str != null) {
                            return;
                        } else {
                            return;
                        }
                    }
                    if (i14 == 0) {
                        i14 = org.telegram.messenger.uz.d();
                    }
                    if (str3 == null) {
                        str3 = org.telegram.messenger.v2.c;
                    }
                    str = tL_help_appUpdate.version;
                    if (str != null || org.telegram.messenger.uz.U(str3, str)) {
                        return;
                    }
                    org.telegram.messenger.uz.j1 = tL_help_appUpdate;
                    org.telegram.messenger.uz.k1 = i14;
                    org.telegram.messenger.uz.y();
                    if (tL_help_appUpdate.can_not_skip) {
                        launchActivity.M0(i44, tL_help_appUpdate, false);
                    } else {
                        org.telegram.messenger.w0.u();
                        boolean z11 = org.telegram.messenger.v2.a;
                        org.telegram.messenger.w0.a.getClass();
                    }
                    org.telegram.messenger.at.e().k(org.telegram.messenger.at.Q4, new Object[0]);
                    return;
                }
                return;
            case 19:
                org.telegram.ui.oi oiVar = (org.telegram.ui.oi) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i45 = this.b;
                if (tLObject3 instanceof TLRPC.User) {
                    oiVar.a = (TLRPC.User) tLObject3;
                    org.telegram.messenger.wp.r1(i45).U3(oiVar.a, false, false);
                }
                zz zzVar3 = oiVar.c;
                p80 p80Var = oiVar.b;
                oiVar.setEnabled(oiVar.a != null);
                TLRPC.User user3 = oiVar.a;
                if (user3 != null) {
                    p80Var.setText(org.telegram.messenger.i0.x2(org.telegram.messenger.dd.a0(null, null, 2131748614, org.telegram.messenger.i20.p(user3)), new bi.e(oiVar, user3.id, 17)));
                }
                p80Var.animate().alpha(1.0f).setDuration(220L).start();
                zzVar3.animate().alpha(0.0f).setDuration(220L).setListener(new eg.m(zzVar3)).start();
                return;
            case 20:
                org.telegram.ui.jl0.c0((org.telegram.ui.jl0) this.c, (org.telegram.messenger.qw) this.d, this.b);
                return;
            case 21:
                org.telegram.ui.qm0 qm0Var = (org.telegram.ui.qm0) this.c;
                int i46 = this.b;
                Intent intent = (Intent) this.d;
                if (i46 == -1) {
                    Parcelable.Creator<v8.i> creator = v8.i.CREATOR;
                    byte[] byteArrayExtra = intent.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    v8.i iVar = (v8.i) (byteArrayExtra != null ? w7.i0.a(byteArrayExtra, creator) : null);
                    if (iVar == null || (str2 = iVar.h) == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str2).getJSONObject("paymentMethodData");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                        jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                        String string = jSONObject2.getString("token");
                        if (qm0Var.K0 == null && qm0Var.M0 == null) {
                            li.k a2 = w7.p6.a(string);
                            qm0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a2.c, (String) a2.b);
                            oc.a aVar = (oc.a) a2.d;
                            qm0Var.x0 = aVar.a() + " *" + aVar.b();
                            qm0Var.z0();
                        }
                        TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                        qm0Var.J0 = tL_inputPaymentCredentialsGooglePay;
                        tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                        qm0Var.J0.payment_token.data = jSONObject2.toString();
                        String optString = jSONObject.optString("description");
                        if (TextUtils.isEmpty(optString)) {
                            qm0Var.x0 = "Android Pay";
                        } else {
                            qm0Var.x0 = optString;
                        }
                        qm0Var.z0();
                    } catch (JSONException e14) {
                        org.telegram.messenger.f8.g(e14, true);
                    }
                } else if (i46 == 1) {
                    int i47 = v8.a.c;
                    Status status = intent != null ? (Status) intent.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                    StringBuilder sb2 = new StringBuilder("android pay error ");
                    sb2.append(status != null ? status.b : "");
                    org.telegram.messenger.f8.d(sb2.toString());
                }
                qm0Var.N0(true, false);
                qm0Var.J0(false);
                FrameLayout frameLayout = qm0Var.P;
                if (frameLayout != null) {
                    frameLayout.setClickable(true);
                    return;
                }
                return;
            case 22:
                org.telegram.ui.yr0 yr0Var = (org.telegram.ui.yr0) this.c;
                Uri uri = (Uri) this.d;
                int i48 = this.b;
                yr0Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i49 = org.telegram.messenger.e20.s0;
                    Point point = org.telegram.messenger.i0.q;
                    s5 s5Var = new s5(file, true, 0L, 0, null, null, null, 0L, i49, false, point.x, point.y, null, 0, true);
                    Bitmap q6 = s5Var.q(0L, false);
                    s5Var.u();
                    org.telegram.messenger.i0.g3(new ki0(yr0Var, i48, q6, 23));
                    return;
                } catch (Throwable th4) {
                    org.telegram.messenger.f8.g(th4, true);
                    org.telegram.messenger.i0.g3(new org.telegram.ui.kg0(yr0Var, 26));
                    return;
                }
            case 23:
                a();
                return;
            case 24:
                b();
                return;
            case 25:
                c();
                return;
            case 26:
                d();
                return;
            case 27:
                f();
                return;
            case 28:
                g();
                return;
            default:
                v91 v91Var = (v91) this.c;
                org.telegram.ui.ze zeVar = (org.telegram.ui.ze) this.d;
                int i50 = this.b;
                zeVar.a(Integer.valueOf(i50));
                v91Var.c(i50 == 1 || i50 == 13);
                return;
        }
    }

    public /* synthetic */ ki0(Object obj, int i10, Object obj2, int i11) {
        this.a = i11;
        this.c = obj;
        this.b = i10;
        this.d = obj2;
    }

    public /* synthetic */ ki0(Object obj, Object obj2, int i10, int i11) {
        this.a = i11;
        this.c = obj;
        this.d = obj2;
        this.b = i10;
    }
}
