// default package

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Status;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;
import org.scilab.forge.jlatexmath.TeXSymbolParser;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.a;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.OpusDred;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class l65 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ l65(int i, int[] iArr, tg5 tg5Var) {
        this.a = (byte) 4;
        this.b = i;
        this.c = iArr;
        this.d = tg5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x0348 A[Catch: Exception -> 0x0425, TryCatch #2 {Exception -> 0x0425, blocks: (B:84:0x0232, B:92:0x0256, B:94:0x025e, B:96:0x0285, B:98:0x029b, B:100:0x02a5, B:108:0x02b6, B:115:0x02c1, B:117:0x0301, B:119:0x0307, B:121:0x0333, B:123:0x0348, B:124:0x035f, B:126:0x0367, B:130:0x037b, B:128:0x0385, B:138:0x0388, B:140:0x038e, B:141:0x03a5, B:143:0x03ad, B:147:0x03c1, B:145:0x03ca, B:149:0x03cd, B:151:0x03d3, B:152:0x03ea, B:154:0x03f2, B:158:0x0406), top: B:83:0x0232 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0388 A[Catch: Exception -> 0x0425, TryCatch #2 {Exception -> 0x0425, blocks: (B:84:0x0232, B:92:0x0256, B:94:0x025e, B:96:0x0285, B:98:0x029b, B:100:0x02a5, B:108:0x02b6, B:115:0x02c1, B:117:0x0301, B:119:0x0307, B:121:0x0333, B:123:0x0348, B:124:0x035f, B:126:0x0367, B:130:0x037b, B:128:0x0385, B:138:0x0388, B:140:0x038e, B:141:0x03a5, B:143:0x03ad, B:147:0x03c1, B:145:0x03ca, B:149:0x03cd, B:151:0x03d3, B:152:0x03ea, B:154:0x03f2, B:158:0x0406), top: B:83:0x0232 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        int i;
        TLRPC.Message message;
        long j;
        int i2;
        long j2;
        zh6 zh6Var;
        boolean z;
        SQLiteCursor queryFinalized;
        uc7 uc7Var;
        int i3;
        TLRPC.Peer peer;
        int i4;
        String str;
        boolean z2;
        uc7 uc7Var2;
        l65 l65Var = this;
        uc7 uc7Var3 = (uc7) l65Var.c;
        TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) l65Var.d;
        boolean z3 = true;
        try {
            i = 0;
            uc7Var3.getUserConfig().y(0, uc7Var3.getUserConfig().m(0) + messages_dialogs.dialogs.size());
            message = null;
            int i5 = 0;
            while (true) {
                j = 1000;
                if (i5 >= messages_dialogs.messages.size()) {
                    break;
                }
                TLRPC.Message message2 = messages_dialogs.messages.get(i5);
                if (f11.a) {
                    cc4.b("search migrate id " + message2.id + " date " + ob6.D0().y0().format(message2.date * 1000));
                }
                if (message == null || message2.date < message.date) {
                    message = message2;
                }
                i5++;
            }
            if (f11.a) {
                cc4.b("migrate step with id " + message.id + " date " + ob6.D0().y0().format(message.date * 1000));
            }
            if (messages_dialogs.dialogs.size() >= 100) {
                i2 = message.id;
            } else {
                if (f11.a) {
                    cc4.b("migrate stop due to not 100 dialogs");
                }
                int i6 = 0;
                for (int i7 = 2; i6 < i7; i7 = 2) {
                    uc7Var3.getUserConfig().w(i6, ConnectionsManager.DEFAULT_DATACENTER_ID, uc7Var3.getUserConfig().L, uc7Var3.getUserConfig().M, uc7Var3.getUserConfig().N, uc7Var3.getUserConfig().O, uc7Var3.getUserConfig().P);
                    i6++;
                    j = j;
                }
                i2 = -1;
            }
            j2 = j;
            StringBuilder sb = new StringBuilder(messages_dialogs.dialogs.size() * 12);
            zh6Var = new zh6();
            for (int i8 = 0; i8 < messages_dialogs.dialogs.size(); i8++) {
                TLRPC.Dialog dialog = messages_dialogs.dialogs.get(i8);
                wf3.w(dialog);
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(dialog.id);
                zh6Var.k(dialog.id, dialog);
            }
            SQLiteDatabase sQLiteDatabase = uc7Var3.getMessagesStorage().b;
            Locale locale = Locale.US;
            try {
                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT did, folder_id FROM dialogs WHERE did IN (" + sb.toString() + ")", new Object[0]);
                while (queryFinalized2.next()) {
                    long longValue = queryFinalized2.longValue(0);
                    int intValue = queryFinalized2.intValue(1);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) zh6Var.f(longValue);
                    if (dialog2 != null) {
                        if (dialog2.folder_id == intValue) {
                            messages_dialogs.dialogs.remove(dialog2);
                            int i9 = 0;
                            while (true) {
                                if (i9 >= messages_dialogs.messages.size()) {
                                    break;
                                }
                                TLRPC.Message message3 = messages_dialogs.messages.get(i9);
                                if (r47.B0(message3) == longValue) {
                                    messages_dialogs.messages.remove(i9);
                                    i9--;
                                    if (message3.id == dialog2.top_message) {
                                        dialog2.top_message = 0;
                                        break;
                                    }
                                }
                                i9++;
                            }
                        }
                    }
                    zh6Var.l(longValue);
                }
                queryFinalized2.dispose();
                if (f11.a) {
                    cc4.b("migrate found missing dialogs " + messages_dialogs.dialogs.size());
                }
                queryFinalized = uc7Var3.getMessagesStorage().b.queryFinalized("SELECT min(date) FROM dialogs WHERE date != 0 AND did >> 32 NOT IN (536870912, 1073741824)", new Object[0]);
            } catch (Exception e) {
                e = e;
                z = true;
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            if (queryFinalized.next()) {
                int max = Math.max(1441062000, queryFinalized.intValue(0));
                int i10 = 0;
                while (true) {
                    int size = messages_dialogs.messages.size();
                    i4 = l65Var.b;
                    str = "migrate stop due to reached loaded dialogs ";
                    if (i10 >= size) {
                        break;
                    }
                    TLRPC.Message message4 = messages_dialogs.messages.get(i10);
                    if (message4.date < max) {
                        if (i4 != -1) {
                            int i11 = i;
                            while (i11 < 2) {
                                int i12 = i11;
                                z = z3;
                                uc7 uc7Var4 = uc7Var3;
                                try {
                                    uc7Var3.getUserConfig().w(i12, uc7Var3.getUserConfig().K, uc7Var3.getUserConfig().L, uc7Var3.getUserConfig().M, uc7Var3.getUserConfig().N, uc7Var4.getUserConfig().O, uc7Var4.getUserConfig().P);
                                    i11 = i12 + 1;
                                    uc7Var3 = uc7Var4;
                                    z3 = z;
                                } catch (Exception e3) {
                                    e = e3;
                                    uc7Var3 = uc7Var4;
                                    z3 = z;
                                    cc4.g(e, z3);
                                    hl.c3(new pa7(uc7Var3, (byte) 8));
                                    return;
                                }
                            }
                            z2 = z3;
                            uc7Var2 = uc7Var3;
                            if (f11.a) {
                                cc4.b("migrate stop due to reached loaded dialogs " + ob6.D0().y0().format(max * j2));
                            }
                            i2 = -1;
                        } else {
                            z2 = z3;
                            uc7Var2 = uc7Var3;
                        }
                        messages_dialogs.messages.remove(i10);
                        i10--;
                        long B0 = r47.B0(message4);
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) zh6Var.f(B0);
                        zh6Var.l(B0);
                        if (dialog3 != null) {
                            messages_dialogs.dialogs.remove(dialog3);
                        }
                    } else {
                        z2 = z3;
                        uc7Var2 = uc7Var3;
                    }
                    i10++;
                    l65Var = this;
                    uc7Var3 = uc7Var2;
                    z3 = z2;
                    i = 0;
                }
                z = z3;
                uc7Var = uc7Var3;
                if (message != null && message.date < max && i4 != -1) {
                    int i13 = 0;
                    while (i13 < 2) {
                        int i14 = i13;
                        uc7Var.getUserConfig().w(i14, uc7Var.getUserConfig().K, uc7Var.getUserConfig().L, uc7Var.getUserConfig().M, uc7Var.getUserConfig().N, uc7Var.getUserConfig().O, uc7Var.getUserConfig().P);
                        i13 = i14 + 1;
                        str = str;
                    }
                    String str2 = str;
                    if (f11.a) {
                        cc4.b(str2 + ob6.D0().y0().format(max * j2));
                    }
                    i3 = -1;
                    queryFinalized.dispose();
                    uc7Var.getUserConfig().L = message.date;
                    peer = message.peer_id;
                    if (peer.channel_id == 0) {
                        uc7Var.getUserConfig().O = message.peer_id.channel_id;
                        uc7Var.getUserConfig().N = 0L;
                        uc7Var.getUserConfig().M = 0L;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= messages_dialogs.chats.size()) {
                                break;
                            }
                            TLRPC.Chat chat = messages_dialogs.chats.get(i15);
                            if (chat.id == uc7Var.getUserConfig().O) {
                                uc7Var.getUserConfig().P = chat.access_hash;
                                break;
                            }
                            i15++;
                        }
                    } else if (peer.chat_id != 0) {
                        uc7Var.getUserConfig().N = message.peer_id.chat_id;
                        uc7Var.getUserConfig().O = 0L;
                        uc7Var.getUserConfig().M = 0L;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= messages_dialogs.chats.size()) {
                                break;
                            }
                            TLRPC.Chat chat2 = messages_dialogs.chats.get(i16);
                            if (chat2.id == uc7Var.getUserConfig().N) {
                                uc7Var.getUserConfig().P = chat2.access_hash;
                                break;
                            }
                            i16++;
                        }
                    } else if (peer.user_id != 0) {
                        uc7Var.getUserConfig().M = message.peer_id.user_id;
                        uc7Var.getUserConfig().N = 0L;
                        uc7Var.getUserConfig().O = 0L;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= messages_dialogs.users.size()) {
                                break;
                            }
                            TLRPC.User user = messages_dialogs.users.get(i17);
                            if (user.id == uc7Var.getUserConfig().M) {
                                uc7Var.getUserConfig().P = user.access_hash;
                                break;
                            }
                            i17++;
                        }
                    }
                    uc7Var3 = uc7Var;
                    uc7Var3.T3(messages_dialogs, null, null, 0, i3, 0, 0, false, true, false);
                    return;
                }
            } else {
                z = true;
                uc7Var = uc7Var3;
            }
            uc7Var3.T3(messages_dialogs, null, null, 0, i3, 0, 0, false, true, false);
            return;
        } catch (Exception e4) {
            e = e4;
            z3 = z;
            cc4.g(e, z3);
            hl.c3(new pa7(uc7Var3, (byte) 8));
            return;
        }
        i3 = i2;
        queryFinalized.dispose();
        uc7Var.getUserConfig().L = message.date;
        peer = message.peer_id;
        if (peer.channel_id == 0) {
        }
        uc7Var3 = uc7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x05d3, code lost:
    
        if (r8 == null) goto L195;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        long j = 0;
        SQLiteCursor sQLiteCursor = null;
        int i = 0;
        i = 0;
        char c = 1;
        switch (this.a) {
            case 0:
                j95 j95Var = (j95) this.c;
                id[] idVarArr = (id[]) this.d;
                int i2 = this.b;
                id idVar = idVarArr[0];
                if (idVar != null) {
                    idVar.setOnCancelListener(new gt0(j95Var, i2, (byte) 6));
                    idVarArr[0].show();
                    return;
                }
                return;
            case 1:
                rd5 rd5Var = (rd5) this.c;
                int i3 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                sv9 sv9Var = rd5Var.d;
                sd5 sd5Var = rd5Var.x;
                if (i3 == rd5Var.n) {
                    rd5Var.h = false;
                    TLRPC.Chat chat = sd5Var.P1;
                    z2b z2bVar = sd5Var.t1;
                    if (!xc2.T(chat)) {
                        zh6 zh6Var = sv9Var.h;
                        ArrayList arrayList2 = sv9Var.g;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        int size = arrayList.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            TLObject tLObject = (TLObject) arrayList.get(i4);
                            if (tLObject instanceof TLRPC.ChatParticipant) {
                                zh6Var.k(((TLRPC.ChatParticipant) tLObject).user_id, tLObject);
                            } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                                zh6Var.k(r47.B1(((TLRPC.ChannelParticipant) tLObject).peer), tLObject);
                            }
                        }
                        sv9Var.i();
                    }
                    int i5 = rd5Var.f - 1;
                    boolean z = z2bVar.getVisibility() == 0;
                    rd5Var.f();
                    if (rd5Var.f > i5) {
                        sd5Var.K0(i5);
                    }
                    if (rd5Var.h || sv9Var.e() || !sd5Var.n1.T0()) {
                        return;
                    }
                    z2bVar.e(false, z);
                    return;
                }
                return;
            case 2:
                ef5 ef5Var = (ef5) this.c;
                int i6 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList3 = ef5Var.R;
                int i7 = ef5Var.Q;
                if (i6 == ef5Var.W) {
                    String str3 = (ef5Var.e0[0] ? "$" : "#") + ef5Var.b0;
                    q5b q5bVar = ef5Var.T;
                    if (q5bVar == null || !TextUtils.equals(q5bVar.C, str3)) {
                        ef5Var.T = new q5b(i7, null, str3);
                    }
                    if (ef5Var.T.i.size() <= 0) {
                        ef5Var.T.p(4, true);
                    }
                    ef5Var.S = true;
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= 1;
                    ef5Var.b0 = str2;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 10;
                    if (arrayList3.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        r47 r47Var = (r47) c00.g(1, arrayList3);
                        tL_channels_searchPosts.offset_rate = ef5Var.c0;
                        tL_channels_searchPosts.offset_peer = uc7.s1(i7).m1(r47Var.k.peer_id);
                    }
                    ef5Var.X = ConnectionsManager.getInstance(i7).sendRequest(tL_channels_searchPosts, new hb7((Object) ef5Var, i6, (Object) str3, (byte) 8));
                    return;
                }
                return;
            case 3:
                wy5 wy5Var = (wy5) this.c;
                u01 u01Var = (u01) this.d;
                int i8 = this.b;
                if (wy5Var.G0.getCurrentBrush() instanceof u01) {
                    wy5Var.U0 = true;
                }
                wy5Var.s(u01Var);
                rv7 rv7Var = wy5Var.d1;
                int i9 = rv7Var.d + 1;
                rv7Var.a(i9);
                hl.L3(rv7Var.a[i9], i8);
                rv7Var.e = true;
                return;
            case 4:
                int i10 = this.b;
                int[] iArr = (int[]) this.c;
                tg5 tg5Var = (tg5) this.d;
                String str4 = LaunchActivity.C1;
                ConnectionsManager.getInstance(i10).cancelRequest(iArr[0], true);
                if (tg5Var != null) {
                    tg5Var.run();
                    return;
                }
                return;
            case 5:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i11 = this.b;
                b86 b86Var = (b86) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    d86 d86Var = (d86) it.next();
                    if (!d86Var.d) {
                        if (i11 != -1) {
                            d86Var.b.b(i11);
                        }
                        d86Var.c = true;
                        b86Var.invoke(d86Var.a);
                    }
                }
                return;
            case 6:
                ls6 ls6Var = (ls6) this.c;
                int i12 = this.b;
                pcc pccVar = (pcc) this.d;
                ArrayList arrayList4 = new ArrayList();
                try {
                    sQLiteCursor = ls6Var.getMessagesStorage().b.queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i12 + 1), new Object[0]);
                    if (sQLiteCursor.next()) {
                        NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                        if (byteBufferValue != null) {
                            int readInt32 = byteBufferValue.readInt32(false);
                            for (int i13 = 0; i13 < readInt32; i13++) {
                                arrayList4.add(TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false));
                            }
                            byteBufferValue.reuse();
                        }
                        i = sQLiteCursor.intValue(1);
                        j = ls6.s(arrayList4);
                    }
                } catch (Throwable th) {
                    try {
                        cc4.g(th, true);
                        break;
                    } catch (Throwable th2) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th2;
                    }
                }
                sQLiteCursor.dispose();
                ls6Var.A1(i12, arrayList4, true, i, j, new xq3(pccVar, arrayList4, (byte) 1));
                return;
            case 7:
                ls6 ls6Var2 = (ls6) this.c;
                TLRPC.TL_help_premiumPromo tL_help_premiumPromo = (TLRPC.TL_help_premiumPromo) this.d;
                int i14 = this.b;
                try {
                    if (tL_help_premiumPromo != null) {
                        ls6Var2.getMessagesStorage().b.executeFast("DELETE FROM premium_promo").stepThis().dispose();
                        SQLitePreparedStatement executeFast = ls6Var2.getMessagesStorage().b.executeFast("REPLACE INTO premium_promo VALUES(?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_help_premiumPromo.getObjectSize());
                        tL_help_premiumPromo.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindInteger(2, i14);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = ls6Var2.getMessagesStorage().b.executeFast("UPDATE premium_promo SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i14);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 8:
                fs6 fs6Var = (fs6) this.c;
                fs6 fs6Var2 = (fs6) this.d;
                int i15 = this.b;
                SparseArray sparseArray = fs6Var.w.getMessagesStorage().h;
                ArrayList arrayList5 = (ArrayList) sparseArray.get(i15);
                if (arrayList5 != null) {
                    arrayList5.remove(fs6Var2);
                    if (arrayList5.isEmpty()) {
                        sparseArray.remove(i15);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                op1 op1Var = (op1) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i16 = this.b;
                if (tLObject2 instanceof TLRPC.User) {
                    op1Var.a = (TLRPC.User) tLObject2;
                    uc7.s1(i16).i4(op1Var.a, false, false);
                }
                tk4 tk4Var = op1Var.c;
                p66 p66Var = op1Var.b;
                op1Var.setEnabled(op1Var.a != null);
                TLRPC.User user = op1Var.a;
                if (user != null) {
                    p66Var.setText(hl.N2(ob6.a0(null, null, 2131748353, lbc.r(user)), -1, 2, new kt((Object) op1Var, user.id, (byte) 20), null));
                }
                p66Var.animate().alpha(1.0f).setDuration(220L).start();
                tk4Var.animate().alpha(0.0f).setDuration(220L).setListener(new gf4(tk4Var)).start();
                return;
            case 10:
                uc7 uc7Var = (uc7) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i17 = this.b;
                if (tLObject3 != null) {
                    uc7Var.k2--;
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = (TLRPC.TL_peerNotifySettings) tLObject3;
                    SharedPreferences.Editor edit = uc7Var.X3.edit();
                    int i18 = tL_peerNotifySettings.flags & 1;
                    if (i17 == 0) {
                        if (i18 != 0) {
                            edit.putBoolean("EnablePreviewGroup", tL_peerNotifySettings.show_previews);
                        }
                        if ((tL_peerNotifySettings.flags & 4) != 0) {
                            edit.putInt("EnableGroup2", tL_peerNotifySettings.mute_until);
                        }
                    } else if (i17 == 1) {
                        if (i18 != 0) {
                            edit.putBoolean("EnablePreviewAll", tL_peerNotifySettings.show_previews);
                        }
                        if ((tL_peerNotifySettings.flags & 64) != 0) {
                            edit.putBoolean("EnableAllStories", !tL_peerNotifySettings.stories_muted);
                        }
                        if ((tL_peerNotifySettings.flags & 128) != 0) {
                            edit.putBoolean("EnableHideStoriesSenders", tL_peerNotifySettings.stories_hide_sender);
                        }
                        if ((tL_peerNotifySettings.flags & 4) != 0) {
                            edit.putInt("EnableAll2", tL_peerNotifySettings.mute_until);
                        }
                        if ((tL_peerNotifySettings.flags & 64) != 0) {
                            edit.putBoolean("EnableAllStories", !tL_peerNotifySettings.stories_muted);
                        }
                    } else {
                        if (i18 != 0) {
                            edit.putBoolean("EnablePreviewChannel", tL_peerNotifySettings.show_previews);
                        }
                        if ((tL_peerNotifySettings.flags & 4) != 0) {
                            edit.putInt("EnableChannel2", tL_peerNotifySettings.mute_until);
                        }
                    }
                    uc7Var.getNotificationsController().h0.a(tL_peerNotifySettings.android_sound, edit, 0L, 0L, i17);
                    edit.apply();
                    if (uc7Var.k2 == 0) {
                        uc7Var.getUserConfig().T = true;
                        uc7Var.getUserConfig().u(false);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                a();
                return;
            case 12:
                uc7 uc7Var2 = (uc7) this.c;
                int i19 = this.b;
                e eVar = (e) this.d;
                uc7Var2.getConnectionsManager().cancelRequest(i19, true);
                eVar.setVisibleDialog(null);
                return;
            case 13:
                dc7 dc7Var = (dc7) this.c;
                int i20 = this.b;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList6 = dc7Var.b;
                arrayList6.clear();
                dc7Var.f = -1;
                dc7Var.g = -1;
                for (int i21 = 0; i21 < i20; i21++) {
                    arrayList6.add(null);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    arrayList6.set(((Integer) entry.getKey()).intValue(), (TLRPC.Photo) entry.getValue());
                }
                dc7Var.h.getNotificationCenter().k(203, dc7Var);
                dc7Var.a(0, 80);
                return;
            case 14:
                ((kf7) this.c).getNotificationCenter().k(jn7.r1, (Long) this.d, Integer.valueOf(this.b), Boolean.TRUE);
                return;
            case 15:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                return;
            case 16:
                ((jn7) this.c).k(this.b, (Object[]) this.d);
                return;
            case 17:
                ip7 ip7Var = (ip7) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                int i22 = this.b;
                ip7Var.w.addAll(0, arrayList7);
                if (a.x || !a.w) {
                    if (i22 == 3 || ((i22 == 1 && a.w) || (i22 == 2 && !a.w))) {
                        Intent intent = new Intent(a.b, (Class<?>) PopupNotificationActivity.class);
                        intent.setFlags(268763140);
                        try {
                            a.b.startActivity(intent);
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
            case 18:
                lt7 lt7Var = (lt7) this.c;
                a35 a35Var = (a35) this.d;
                int i23 = this.b;
                lt7Var.run();
                hl.c3(new om0(hl.S2(ob6.a0(null, null, 2131749528, it7.l(a35Var.b), ob6.x(i23, true))), c == true ? 1 : 0));
                return;
            case 19:
                OpusDred.lambda$download$7((TLObject) this.c, (TLRPC.TL_error) this.d, this.b);
                return;
            case 20:
                dx7 dx7Var = (dx7) this.c;
                u01 u01Var2 = (u01) this.d;
                int i24 = this.b;
                if (dx7Var.y0.getCurrentBrush() instanceof u01) {
                    dx7Var.M0 = true;
                }
                dx7Var.s(u01Var2);
                rv7 rv7Var2 = dx7Var.U0;
                int i25 = rv7Var2.d + 1;
                rv7Var2.a(i25);
                hl.L3(rv7Var2.a[i25], i24);
                rv7Var2.e = true;
                return;
            case 21:
                nx7 nx7Var = (nx7) this.c;
                nx7Var.e((uca) this.d, this.b, nx7Var.h);
                nx7Var.h = null;
                return;
            case 22:
                p pVar = (p) this.c;
                int i26 = this.b;
                Intent intent2 = (Intent) this.d;
                if (i26 == -1) {
                    Parcelable.Creator<u18> creator = u18.CREATOR;
                    byte[] byteArrayExtra = intent2.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                    u18 u18Var = (u18) (byteArrayExtra != null ? dye.a(byteArrayExtra, creator) : null);
                    if (u18Var == null || (str = u18Var.h) == null) {
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                        JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                        jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                        String string = jSONObject2.getString("token");
                        if (pVar.L0 == null && pVar.N0 == null) {
                            ko9 a = i0f.a(string);
                            pVar.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a.c, (String) a.b);
                            zc1 zc1Var = (zc1) a.d;
                            pVar.y0 = zc1Var.c() + " *" + zc1Var.d();
                        } else {
                            TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay = new TLRPC.TL_inputPaymentCredentialsGooglePay();
                            pVar.K0 = tL_inputPaymentCredentialsGooglePay;
                            tL_inputPaymentCredentialsGooglePay.payment_token = new TLRPC.TL_dataJSON();
                            pVar.K0.payment_token.data = jSONObject2.toString();
                            String optString = jSONObject.optString("description");
                            if (TextUtils.isEmpty(optString)) {
                                pVar.y0 = "Android Pay";
                            } else {
                                pVar.y0 = optString;
                            }
                        }
                        pVar.h0();
                    } catch (JSONException e2) {
                        cc4.g(e2, true);
                    }
                } else if (i26 == 1) {
                    int i27 = n70.b;
                    Status status = intent2 != null ? (Status) intent2.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status") : null;
                    StringBuilder sb = new StringBuilder("android pay error ");
                    sb.append(status != null ? status.b : "");
                    cc4.d(sb.toString());
                }
                pVar.N0(true, false);
                pVar.J0(false);
                FrameLayout frameLayout = pVar.Q;
                if (frameLayout != null) {
                    frameLayout.setClickable(true);
                    return;
                }
                return;
            case 23:
                zc8 zc8Var = (zc8) this.c;
                Uri uri = (Uri) this.d;
                int i28 = this.b;
                zc8Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i29 = yac.t0;
                    Point point = hl.q;
                    lm lmVar = new lm(file, true, 0L, 0, null, null, null, 0L, i29, false, point.x, point.y, null, 0, true);
                    Bitmap q = lmVar.q(0L, false);
                    lmVar.u();
                    hl.c3(new l65((Object) zc8Var, i28, (Object) q, (byte) 24));
                    return;
                } catch (Throwable th3) {
                    cc4.g(th3, true);
                    hl.c3(new x38(zc8Var, (byte) 18));
                    return;
                }
            case 24:
                zc8 zc8Var2 = (zc8) this.c;
                int i30 = this.b;
                Bitmap bitmap = (Bitmap) this.d;
                if (i30 == zc8Var2.a) {
                    zc8Var2.setImageBitmap(bitmap);
                    zc8Var2.c = true;
                    zc8Var2.b = false;
                    return;
                }
                return;
            case 25:
                ji8 ji8Var = (ji8) this.c;
                gl1 gl1Var = (gl1) this.d;
                int i31 = this.b;
                zu1 zu1Var = gl1Var.b;
                int i32 = zu1.Ad;
                zu1Var.Ua(i31);
                ji8Var.b(i31 == 1 || i31 == 13);
                return;
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                String str5 = (String) this.d;
                int i33 = this.b;
                RectF rectF = ProfileActivity.Z6;
                hl.g(str5);
                if (i33 == profileActivity.X2) {
                    d31.b0(profileActivity).i(ob6.M0(2131753714, null)).j();
                    return;
                } else {
                    d31.b0(profileActivity).i(ob6.M0(2131743847, null)).j();
                    return;
                }
            case 27:
                wr8 wr8Var = (wr8) this.c;
                f89 f89Var = (f89) this.d;
                int i34 = this.b;
                if (f89Var.b() == i34 && wr8Var.e.V2 == i34 && f89Var.f == 2) {
                    wr8Var.t(f89Var, i34);
                    return;
                }
                return;
            case 28:
                cga cgaVar = (cga) this.c;
                int i35 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                zwa zwaVar = cgaVar.e;
                if (i35 != -1) {
                    int i36 = tL_starGiftCollection.collection_id;
                    int i37 = zwaVar.a;
                    int f = zwaVar.f(i36);
                    if (f != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) zwaVar.e.remove(f);
                        zwaVar.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = uc7.s1(i37).j1(zwaVar.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i37).sendRequest(deletestargiftcollection, null);
                    }
                    cgaVar.f(true);
                    uic uicVar = cgaVar.n;
                    if (i35 < zwaVar.d().size()) {
                        i35++;
                    }
                    uicVar.e(-1, i35);
                    cgaVar.o();
                    return;
                }
                return;
            default:
                jz8.p((e) this.c, this.b + 1, (hz8) this.d);
                return;
        }
    }

    public /* synthetic */ l65(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ l65(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
