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
import android.widget.ImageView;
import android.widget.TextView;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PopupNotificationActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class h65 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h65(int i, int[] iArr, k16 k16Var) {
        this.a = (byte) 4;
        this.b = i;
        this.c = iArr;
        this.d = k16Var;
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
        vh6 vh6Var;
        boolean z;
        SQLiteCursor queryFinalized;
        oc7 oc7Var;
        int i3;
        TLRPC.Peer peer;
        int i4;
        String str;
        boolean z2;
        oc7 oc7Var2;
        h65 h65Var = this;
        oc7 oc7Var3 = (oc7) h65Var.c;
        TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) h65Var.d;
        boolean z3 = true;
        try {
            i = 0;
            oc7Var3.getUserConfig().y(0, oc7Var3.getUserConfig().m(0) + messages_dialogs.dialogs.size());
            message = null;
            int i5 = 0;
            while (true) {
                j = 1000;
                if (i5 >= messages_dialogs.messages.size()) {
                    break;
                }
                TLRPC.Message message2 = messages_dialogs.messages.get(i5);
                if (e21.a) {
                    fc4.b("search migrate id " + message2.id + " date " + jb6.D0().y0().format(message2.date * 1000));
                }
                if (message == null || message2.date < message.date) {
                    message = message2;
                }
                i5++;
            }
            if (e21.a) {
                fc4.b("migrate step with id " + message.id + " date " + jb6.D0().y0().format(message.date * 1000));
            }
            if (messages_dialogs.dialogs.size() >= 100) {
                i2 = message.id;
            } else {
                if (e21.a) {
                    fc4.b("migrate stop due to not 100 dialogs");
                }
                int i6 = 0;
                for (int i7 = 2; i6 < i7; i7 = 2) {
                    oc7Var3.getUserConfig().w(i6, ConnectionsManager.DEFAULT_DATACENTER_ID, oc7Var3.getUserConfig().L, oc7Var3.getUserConfig().M, oc7Var3.getUserConfig().N, oc7Var3.getUserConfig().O, oc7Var3.getUserConfig().P);
                    i6++;
                    j = j;
                }
                i2 = -1;
            }
            j2 = j;
            StringBuilder sb = new StringBuilder(messages_dialogs.dialogs.size() * 12);
            vh6Var = new vh6();
            for (int i8 = 0; i8 < messages_dialogs.dialogs.size(); i8++) {
                TLRPC.Dialog dialog = messages_dialogs.dialogs.get(i8);
                pg3.w(dialog);
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(dialog.id);
                vh6Var.k(dialog, dialog.id);
            }
            SQLiteDatabase sQLiteDatabase = oc7Var3.getMessagesStorage().b;
            Locale locale = Locale.US;
            try {
                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT did, folder_id FROM dialogs WHERE did IN (" + sb.toString() + ")", new Object[0]);
                while (queryFinalized2.next()) {
                    long longValue = queryFinalized2.longValue(0);
                    int intValue = queryFinalized2.intValue(1);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) vh6Var.f(longValue);
                    if (dialog2 != null) {
                        if (dialog2.folder_id == intValue) {
                            messages_dialogs.dialogs.remove(dialog2);
                            int i9 = 0;
                            while (true) {
                                if (i9 >= messages_dialogs.messages.size()) {
                                    break;
                                }
                                TLRPC.Message message3 = messages_dialogs.messages.get(i9);
                                if (k47.B0(message3) == longValue) {
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
                    vh6Var.l(longValue);
                }
                queryFinalized2.dispose();
                if (e21.a) {
                    fc4.b("migrate found missing dialogs " + messages_dialogs.dialogs.size());
                }
                queryFinalized = oc7Var3.getMessagesStorage().b.queryFinalized("SELECT min(date) FROM dialogs WHERE date != 0 AND did >> 32 NOT IN (536870912, 1073741824)", new Object[0]);
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
                    i4 = h65Var.b;
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
                                oc7 oc7Var4 = oc7Var3;
                                try {
                                    oc7Var3.getUserConfig().w(i12, oc7Var3.getUserConfig().K, oc7Var3.getUserConfig().L, oc7Var3.getUserConfig().M, oc7Var3.getUserConfig().N, oc7Var4.getUserConfig().O, oc7Var4.getUserConfig().P);
                                    i11 = i12 + 1;
                                    oc7Var3 = oc7Var4;
                                    z3 = z;
                                } catch (Exception e3) {
                                    e = e3;
                                    oc7Var3 = oc7Var4;
                                    z3 = z;
                                    fc4.g(e, z3);
                                    gm.c3(new ba7(oc7Var3, (byte) 9));
                                    return;
                                }
                            }
                            z2 = z3;
                            oc7Var2 = oc7Var3;
                            if (e21.a) {
                                fc4.b("migrate stop due to reached loaded dialogs " + jb6.D0().y0().format(max * j2));
                            }
                            i2 = -1;
                        } else {
                            z2 = z3;
                            oc7Var2 = oc7Var3;
                        }
                        messages_dialogs.messages.remove(i10);
                        i10--;
                        long B0 = k47.B0(message4);
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) vh6Var.f(B0);
                        vh6Var.l(B0);
                        if (dialog3 != null) {
                            messages_dialogs.dialogs.remove(dialog3);
                        }
                    } else {
                        z2 = z3;
                        oc7Var2 = oc7Var3;
                    }
                    i10++;
                    h65Var = this;
                    oc7Var3 = oc7Var2;
                    z3 = z2;
                    i = 0;
                }
                z = z3;
                oc7Var = oc7Var3;
                if (message != null && message.date < max && i4 != -1) {
                    int i13 = 0;
                    while (i13 < 2) {
                        int i14 = i13;
                        oc7Var.getUserConfig().w(i14, oc7Var.getUserConfig().K, oc7Var.getUserConfig().L, oc7Var.getUserConfig().M, oc7Var.getUserConfig().N, oc7Var.getUserConfig().O, oc7Var.getUserConfig().P);
                        i13 = i14 + 1;
                        str = str;
                    }
                    String str2 = str;
                    if (e21.a) {
                        fc4.b(str2 + jb6.D0().y0().format(max * j2));
                    }
                    i3 = -1;
                    queryFinalized.dispose();
                    oc7Var.getUserConfig().L = message.date;
                    peer = message.peer_id;
                    if (peer.channel_id == 0) {
                        oc7Var.getUserConfig().O = message.peer_id.channel_id;
                        oc7Var.getUserConfig().N = 0L;
                        oc7Var.getUserConfig().M = 0L;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= messages_dialogs.chats.size()) {
                                break;
                            }
                            TLRPC.Chat chat = messages_dialogs.chats.get(i15);
                            if (chat.id == oc7Var.getUserConfig().O) {
                                oc7Var.getUserConfig().P = chat.access_hash;
                                break;
                            }
                            i15++;
                        }
                    } else if (peer.chat_id != 0) {
                        oc7Var.getUserConfig().N = message.peer_id.chat_id;
                        oc7Var.getUserConfig().O = 0L;
                        oc7Var.getUserConfig().M = 0L;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= messages_dialogs.chats.size()) {
                                break;
                            }
                            TLRPC.Chat chat2 = messages_dialogs.chats.get(i16);
                            if (chat2.id == oc7Var.getUserConfig().N) {
                                oc7Var.getUserConfig().P = chat2.access_hash;
                                break;
                            }
                            i16++;
                        }
                    } else if (peer.user_id != 0) {
                        oc7Var.getUserConfig().M = message.peer_id.user_id;
                        oc7Var.getUserConfig().N = 0L;
                        oc7Var.getUserConfig().O = 0L;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= messages_dialogs.users.size()) {
                                break;
                            }
                            TLRPC.User user = messages_dialogs.users.get(i17);
                            if (user.id == oc7Var.getUserConfig().M) {
                                oc7Var.getUserConfig().P = user.access_hash;
                                break;
                            }
                            i17++;
                        }
                    }
                    oc7Var3 = oc7Var;
                    oc7Var3.O3(messages_dialogs, null, null, 0, i3, 0, 0, false, true, false);
                    return;
                }
            } else {
                z = true;
                oc7Var = oc7Var3;
            }
            oc7Var3.O3(messages_dialogs, null, null, 0, i3, 0, 0, false, true, false);
            return;
        } catch (Exception e4) {
            e = e4;
            z3 = z;
            fc4.g(e, z3);
            gm.c3(new ba7(oc7Var3, (byte) 9));
            return;
        }
        i3 = i2;
        queryFinalized.dispose();
        oc7Var.getUserConfig().L = message.date;
        peer = message.peer_id;
        if (peer.channel_id == 0) {
        }
        oc7Var3 = oc7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018e  */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v12 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r9;
        SQLiteCursor sQLiteCursor;
        boolean z;
        int i;
        byte b;
        boolean z2;
        FrameLayout frameLayout;
        String str;
        String G;
        int size;
        int i2;
        int size2;
        int i3;
        int i4;
        int size3;
        int L;
        float f;
        int i5;
        byte b2 = 10;
        long j = 0;
        int i6 = 0;
        byte b3 = 1;
        switch (this.a) {
            case 0:
                g95 g95Var = (g95) this.c;
                he[] heVarArr = (he[]) this.d;
                int i7 = this.b;
                he heVar = heVarArr[0];
                if (heVar != null) {
                    heVar.setOnCancelListener(new fu0(g95Var, i7, (byte) 6));
                    heVarArr[0].show();
                    return;
                }
                return;
            case 1:
                od5 od5Var = (od5) this.c;
                int i8 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                bu9 bu9Var = od5Var.d;
                pd5 pd5Var = od5Var.x;
                if (i8 == od5Var.n) {
                    od5Var.h = false;
                    TLRPC.Chat chat = pd5Var.P1;
                    a1b a1bVar = pd5Var.t1;
                    if (!sd2.T(chat)) {
                        vh6 vh6Var = bu9Var.h;
                        ArrayList arrayList2 = bu9Var.g;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        int size4 = arrayList.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            TLObject tLObject = (TLObject) arrayList.get(i9);
                            if (tLObject instanceof TLRPC.ChatParticipant) {
                                vh6Var.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                            } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                                vh6Var.k(tLObject, k47.B1(((TLRPC.ChannelParticipant) tLObject).peer));
                            }
                        }
                        bu9Var.i();
                    }
                    int i10 = od5Var.f - 1;
                    boolean z3 = a1bVar.getVisibility() == 0;
                    od5Var.f();
                    if (od5Var.f > i10) {
                        pd5Var.J0(i10);
                    }
                    if (od5Var.h || bu9Var.e() || !pd5Var.n1.S0()) {
                        return;
                    }
                    a1bVar.e(false, z3);
                    return;
                }
                return;
            case 2:
                bf5 bf5Var = (bf5) this.c;
                int i11 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList3 = bf5Var.R;
                int i12 = bf5Var.Q;
                if (i11 == bf5Var.W) {
                    String str3 = (bf5Var.e0[0] ? "$" : "#") + bf5Var.b0;
                    u3b u3bVar = bf5Var.T;
                    if (u3bVar == null || !TextUtils.equals(u3bVar.C, str3)) {
                        bf5Var.T = new u3b(i12, null, str3);
                    }
                    if (bf5Var.T.i.size() <= 0) {
                        r9 = 1;
                        bf5Var.T.p(4, true);
                    } else {
                        r9 = 1;
                    }
                    bf5Var.S = r9;
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= r9;
                    bf5Var.b0 = str2;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 10;
                    if (arrayList3.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        k47 k47Var = (k47) b10.f(r9, arrayList3);
                        tL_channels_searchPosts.offset_rate = bf5Var.c0;
                        tL_channels_searchPosts.offset_peer = oc7.r1(i12).l1(k47Var.k.peer_id);
                    }
                    bf5Var.X = ConnectionsManager.getInstance(i12).sendRequest(tL_channels_searchPosts, new cb7((Object) bf5Var, i11, (Object) str3, (byte) 8));
                    return;
                }
                return;
            case 3:
                ry5 ry5Var = (ry5) this.c;
                t11 t11Var = (t11) this.d;
                int i13 = this.b;
                if (ry5Var.M0.getCurrentBrush() instanceof t11) {
                    ry5Var.a1 = true;
                }
                ry5Var.s(t11Var);
                lu7 lu7Var = ry5Var.j1;
                int i14 = lu7Var.d + 1;
                lu7Var.a(i14);
                gm.L3(lu7Var.a[i14], i13);
                lu7Var.e = true;
                return;
            case 4:
                int i15 = this.b;
                int[] iArr = (int[]) this.c;
                k16 k16Var = (k16) this.d;
                String str4 = LaunchActivity.C1;
                ConnectionsManager.getInstance(i15).cancelRequest(iArr[0], true);
                if (k16Var != null) {
                    k16Var.run();
                    return;
                }
                return;
            case 5:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i16 = this.b;
                x76 x76Var = (x76) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    z76 z76Var = (z76) it.next();
                    if (!z76Var.d) {
                        if (i16 != -1) {
                            z76Var.b.b(i16);
                        }
                        z76Var.c = true;
                        x76Var.invoke(z76Var.a);
                    }
                }
                return;
            case 6:
                hs6 hs6Var = (hs6) this.c;
                int i17 = this.b;
                qac qacVar = (qac) this.d;
                ArrayList arrayList4 = new ArrayList();
                try {
                    boolean z4 = false;
                    sQLiteCursor = hs6Var.getMessagesStorage().b.queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i17 + 1), new Object[0]);
                    try {
                        if (sQLiteCursor.next()) {
                            NativeByteBuffer byteBufferValue = sQLiteCursor.byteBufferValue(0);
                            if (byteBufferValue != null) {
                                int readInt32 = byteBufferValue.readInt32(false);
                                int i18 = 0;
                                while (i18 < readInt32) {
                                    arrayList4.add(TLRPC.messages_StickerSet.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(z4), z4));
                                    i18++;
                                    z4 = false;
                                }
                                byteBufferValue.reuse();
                            }
                            i = sQLiteCursor.intValue(1);
                            try {
                                j = hs6.s(arrayList4);
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                try {
                                    fc4.g(th, z);
                                    b = z;
                                    if (sQLiteCursor != null) {
                                    }
                                    hs6Var.A1(i17, arrayList4, true, i, j, new rr3(qacVar, arrayList4, b));
                                    return;
                                } catch (Throwable th2) {
                                    if (sQLiteCursor != null) {
                                        sQLiteCursor.dispose();
                                    }
                                    throw th2;
                                }
                            }
                        } else {
                            i = 0;
                        }
                        sQLiteCursor.dispose();
                        b = 1;
                    } catch (Throwable th3) {
                        th = th3;
                        z = true;
                        i = 0;
                        fc4.g(th, z);
                        b = z;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            b = z;
                        }
                        hs6Var.A1(i17, arrayList4, true, i, j, new rr3(qacVar, arrayList4, b));
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                hs6Var.A1(i17, arrayList4, true, i, j, new rr3(qacVar, arrayList4, b));
                return;
            case 7:
                hs6 hs6Var2 = (hs6) this.c;
                TLRPC.TL_help_premiumPromo tL_help_premiumPromo = (TLRPC.TL_help_premiumPromo) this.d;
                int i19 = this.b;
                try {
                    if (tL_help_premiumPromo != null) {
                        hs6Var2.getMessagesStorage().b.executeFast("DELETE FROM premium_promo").stepThis().dispose();
                        SQLitePreparedStatement executeFast = hs6Var2.getMessagesStorage().b.executeFast("REPLACE INTO premium_promo VALUES(?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_help_premiumPromo.getObjectSize());
                        tL_help_premiumPromo.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindInteger(2, i19);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = hs6Var2.getMessagesStorage().b.executeFast("UPDATE premium_promo SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i19);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 8:
                bs6 bs6Var = (bs6) this.c;
                bs6 bs6Var2 = (bs6) this.d;
                int i20 = this.b;
                SparseArray sparseArray = bs6Var.w.getMessagesStorage().h;
                ArrayList arrayList5 = (ArrayList) sparseArray.get(i20);
                if (arrayList5 != null) {
                    arrayList5.remove(bs6Var2);
                    if (arrayList5.isEmpty()) {
                        sparseArray.remove(i20);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                nq1 nq1Var = (nq1) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i21 = this.b;
                if (tLObject2 instanceof TLRPC.User) {
                    nq1Var.a = (TLRPC.User) tLObject2;
                    oc7.r1(i21).c4(nq1Var.a, false, false);
                }
                tk4 tk4Var = nq1Var.c;
                l66 l66Var = nq1Var.b;
                nq1Var.setEnabled(nq1Var.a != null);
                TLRPC.User user = nq1Var.a;
                if (user != null) {
                    l66Var.setText(gm.N2(jb6.a0(null, null, 2131748356, m9c.r(user)), -1, 2, new fu((Object) nq1Var, user.id, (byte) 20), null));
                }
                l66Var.animate().alpha(1.0f).setDuration(220L).start();
                tk4Var.animate().alpha(0.0f).setDuration(220L).setListener(new jf4(tk4Var)).start();
                return;
            case 10:
                oc7 oc7Var = (oc7) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i22 = this.b;
                if (tLObject3 != null) {
                    oc7Var.k2--;
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = (TLRPC.TL_peerNotifySettings) tLObject3;
                    SharedPreferences.Editor edit = oc7Var.W3.edit();
                    int i23 = tL_peerNotifySettings.flags;
                    if (i22 == 0) {
                        if ((i23 & 1) != 0) {
                            edit.putBoolean("EnablePreviewGroup", tL_peerNotifySettings.show_previews);
                        }
                        if ((tL_peerNotifySettings.flags & 4) != 0) {
                            edit.putInt("EnableGroup2", tL_peerNotifySettings.mute_until);
                        }
                    } else if (i22 == 1) {
                        if ((i23 & 1) != 0) {
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
                        if ((i23 & 1) != 0) {
                            edit.putBoolean("EnablePreviewChannel", tL_peerNotifySettings.show_previews);
                        }
                        if ((tL_peerNotifySettings.flags & 4) != 0) {
                            edit.putInt("EnableChannel2", tL_peerNotifySettings.mute_until);
                        }
                    }
                    oc7Var.getNotificationsController().h0.a(tL_peerNotifySettings.android_sound, edit, 0L, 0L, i22);
                    edit.apply();
                    if (oc7Var.k2 == 0) {
                        oc7Var.getUserConfig().T = true;
                        oc7Var.getUserConfig().u(false);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                a();
                return;
            case 12:
                oc7 oc7Var2 = (oc7) this.c;
                int i24 = this.b;
                d dVar = (d) this.d;
                oc7Var2.getConnectionsManager().cancelRequest(i24, true);
                dVar.setVisibleDialog(null);
                return;
            case 13:
                xb7 xb7Var = (xb7) this.c;
                int i25 = this.b;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList6 = xb7Var.b;
                arrayList6.clear();
                xb7Var.f = -1;
                xb7Var.g = -1;
                for (int i26 = 0; i26 < i25; i26++) {
                    arrayList6.add(null);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    arrayList6.set(((Integer) entry.getKey()).intValue(), (TLRPC.Photo) entry.getValue());
                }
                xb7Var.h.getNotificationCenter().k(203, xb7Var);
                xb7Var.a(0, 80);
                return;
            case 14:
                ((cf7) this.c).getNotificationCenter().k(nm7.r1, (Long) this.d, Integer.valueOf(this.b), Boolean.TRUE);
                return;
            case 15:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                return;
            case 16:
                ((nm7) this.c).k(this.b, (Object[]) this.d);
                return;
            case 17:
                lo7 lo7Var = (lo7) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                int i27 = this.b;
                lo7Var.w.addAll(0, arrayList7);
                if (a.x || !a.w) {
                    if (i27 == 3 || ((i27 == 1 && a.w) || (i27 == 2 && !a.w))) {
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
                is7 is7Var = (is7) this.c;
                w25 w25Var = (w25) this.d;
                int i28 = this.b;
                is7Var.run();
                gm.c3(new rn0(gm.S2(jb6.a0(null, null, 2131749516, fs7.k(w25Var.b), jb6.x(i28, true))), b3));
                return;
            case 19:
                xv7 xv7Var = (xv7) this.c;
                t11 t11Var2 = (t11) this.d;
                int i29 = this.b;
                if (xv7Var.E0.getCurrentBrush() instanceof t11) {
                    xv7Var.S0 = true;
                }
                xv7Var.s(t11Var2);
                lu7 lu7Var2 = xv7Var.a1;
                int i30 = lu7Var2.d + 1;
                lu7Var2.a(i30);
                gm.L3(lu7Var2.a[i30], i29);
                lu7Var2.e = true;
                return;
            case 20:
                hw7 hw7Var = (hw7) this.c;
                hw7Var.e((dba) this.d, this.b, hw7Var.h);
                hw7Var.h = null;
                return;
            case 21:
                p pVar = (p) this.c;
                int i31 = this.b;
                Intent intent2 = (Intent) this.d;
                if (i31 != -1) {
                    z2 = true;
                    if (i31 == 1) {
                        int i32 = l80.b;
                        Status status = intent2 == null ? null : (Status) intent2.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
                        StringBuilder sb = new StringBuilder("android pay error ");
                        sb.append(status != null ? status.b : "");
                        fc4.d(sb.toString());
                    }
                    pVar.N0(z2, false);
                    pVar.J0(false);
                    frameLayout = pVar.Q;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z2);
                        return;
                    }
                    return;
                }
                Parcelable.Creator<q08> creator = q08.CREATOR;
                byte[] byteArrayExtra = intent2.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                q08 q08Var = (q08) (byteArrayExtra == null ? null : nve.a(byteArrayExtra, creator));
                if (q08Var == null || (str = q08Var.h) == null) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                    jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                    String string = jSONObject2.getString("token");
                    if (pVar.L0 == null && pVar.N0 == null) {
                        wm9 a = sxe.a(string);
                        pVar.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a.c, (String) a.b);
                        zd1 zd1Var = (zd1) a.d;
                        pVar.y0 = zd1Var.c() + " *" + zd1Var.d();
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
                    pVar.i0();
                } catch (JSONException e2) {
                    z2 = true;
                    fc4.g(e2, true);
                }
                z2 = true;
                pVar.N0(z2, false);
                pVar.J0(false);
                frameLayout = pVar.Q;
                if (frameLayout == null) {
                }
                break;
            case 22:
                kb8 kb8Var = (kb8) this.c;
                Uri uri = (Uri) this.d;
                int i33 = this.b;
                kb8Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i34 = z8c.t0;
                    Point point = gm.q;
                    kn knVar = new kn(file, true, 0L, 0, null, null, null, 0L, i34, false, point.x, point.y, null, 0, true);
                    Bitmap q = knVar.q(0L, false);
                    knVar.u();
                    gm.c3(new h65((Object) kb8Var, i33, (Object) q, (byte) 23));
                    return;
                } catch (Throwable th5) {
                    fc4.g(th5, true);
                    gm.c3(new q78(kb8Var, b2));
                    return;
                }
            case 23:
                kb8 kb8Var2 = (kb8) this.c;
                int i35 = this.b;
                Bitmap bitmap = (Bitmap) this.d;
                if (i35 == kb8Var2.a) {
                    kb8Var2.setImageBitmap(bitmap);
                    kb8Var2.c = true;
                    kb8Var2.b = false;
                    return;
                }
                return;
            case 24:
                xg8 xg8Var = (xg8) this.c;
                qm1 qm1Var = (qm1) this.d;
                int i36 = this.b;
                yv1 yv1Var = qm1Var.b;
                int i37 = yv1.xd;
                yv1Var.Ta(i36);
                xg8Var.b(i36 == 1 || i36 == 13);
                return;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                String str5 = (String) this.d;
                int i38 = this.b;
                RectF rectF = ProfileActivity.e7;
                gm.g(str5);
                if (i38 == profileActivity.X2) {
                    c41.b0(profileActivity).i(jb6.M0(2131753686, null)).j();
                    return;
                } else {
                    c41.b0(profileActivity).i(jb6.M0(2131743879, null)).j();
                    return;
                }
            case 26:
                lq8 lq8Var = (lq8) this.c;
                u69 u69Var = (u69) this.d;
                int i39 = this.b;
                if (u69Var.b() == i39 && lq8Var.e.V2 == i39 && u69Var.f == 2) {
                    lq8Var.t(u69Var, i39);
                    return;
                }
                return;
            case 27:
                lea leaVar = (lea) this.c;
                int i40 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                yua yuaVar = leaVar.e;
                if (i40 != -1) {
                    int i41 = tL_starGiftCollection.collection_id;
                    int i42 = yuaVar.a;
                    int f2 = yuaVar.f(i41);
                    if (f2 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) yuaVar.e.remove(f2);
                        yuaVar.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = oc7.r1(i42).i1(yuaVar.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i42).sendRequest(deletestargiftcollection, null);
                    }
                    leaVar.f(true);
                    vgc vgcVar = leaVar.n;
                    if (i40 < yuaVar.d().size()) {
                        i40++;
                    }
                    vgcVar.e(-1, i40);
                    leaVar.o();
                    return;
                }
                return;
            case 28:
                zx8.p((d) this.c, this.b + 1, (xx8) this.d);
                return;
            default:
                p19 p19Var = (p19) this.c;
                int i43 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i44 = p19Var.f;
                TextView textView = p19Var.b;
                k47 k47Var2 = p19Var.s;
                ImageView imageView = p19Var.d;
                bf0 bf0Var = p19Var.e;
                ArrayList arrayList8 = p19Var.r;
                ArrayList arrayList9 = p19Var.n;
                if (arrayList9.isEmpty() || arrayList9.size() < i43) {
                    G = jb6.G(i43, "ReactionsCount", new Object[0]);
                } else {
                    G = String.format(jb6.J0(i43, "Reacted"), i43 == arrayList9.size() ? String.valueOf(i43) : i43 + "/" + arrayList9.size());
                }
                if (p19Var.getMeasuredWidth() > 0) {
                    p19Var.w = p19Var.getMeasuredWidth();
                }
                textView.setText(G);
                TLRPC.TL_messageReactions tL_messageReactions = k47Var2.k.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    ArrayList arrayList10 = hs6.d0(i44).h;
                    int size5 = arrayList10.size();
                    int i45 = 0;
                    while (i45 < size5) {
                        Object obj = arrayList10.get(i45);
                        i45++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            bf0Var.n(gn5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            bf0Var.setVisibility(0);
                            bf0Var.setAlpha(0.0f);
                            bf0Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList11 = tL_messages_messageReactionsList.users;
                            size = arrayList11.size();
                            i2 = 0;
                            while (i2 < size) {
                                TLRPC.User user2 = arrayList11.get(i2);
                                i2++;
                                TLRPC.User user3 = user2;
                                TLRPC.Peer peer = k47Var2.k.from_id;
                                if (peer != null && user3.id != peer.user_id) {
                                    int i46 = i6;
                                    while (true) {
                                        if (i46 >= arrayList8.size()) {
                                            arrayList8.add(new o19(0, user3));
                                        } else if (((o19) arrayList8.get(i46)).b != user3.id) {
                                            i46++;
                                        }
                                    }
                                }
                                i6 = 0;
                            }
                            ArrayList<TLRPC.Chat> arrayList12 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList12.size();
                            i3 = 0;
                            while (i3 < size2) {
                                TLRPC.Chat chat2 = arrayList12.get(i3);
                                i3++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = k47Var2.k.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    while (true) {
                                        if (i5 < arrayList8.size()) {
                                            i5 = ((o19) arrayList8.get(i5)).b != (-chat3.id) ? i5 + 1 : 0;
                                        } else {
                                            arrayList8.add(new o19(0, chat3));
                                        }
                                    }
                                }
                            }
                            tk4 tk4Var2 = p19Var.a;
                            hd0 hd0Var = p19Var.c;
                            p19Var.setEnabled(arrayList8.size() <= 0);
                            for (i4 = 0; i4 < 3; i4++) {
                                if (i4 < arrayList8.size()) {
                                    hd0Var.b(i4, i44, ((o19) arrayList8.get(i4)).a);
                                } else {
                                    hd0Var.b(i4, i44, null);
                                }
                            }
                            size3 = arrayList8.size();
                            if (size3 != 1) {
                                L = gm.L(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f = 0.0f;
                                    if (jb6.a0) {
                                        f = gm.L(12.0f);
                                    }
                                    hd0Var.setTranslationX(f);
                                    hd0Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    hd0Var.animate().alpha(1.0f).setDuration(220L).start();
                                    tk4Var2.animate().alpha(0.0f).setDuration(220L).setListener(new jf4(tk4Var2)).start();
                                    return;
                                }
                                L = gm.L(12.0f);
                            }
                            f = L;
                            if (jb6.a0) {
                            }
                            hd0Var.setTranslationX(f);
                            hd0Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            hd0Var.animate().alpha(1.0f).setDuration(220L).start();
                            tk4Var2.animate().alpha(0.0f).setDuration(220L).setListener(new jf4(tk4Var2)).start();
                            return;
                        }
                    }
                }
                imageView.setVisibility(0);
                imageView.setAlpha(0.0f);
                imageView.animate().alpha(1.0f).start();
                ArrayList<TLRPC.User> arrayList112 = tL_messages_messageReactionsList.users;
                size = arrayList112.size();
                i2 = 0;
                while (i2 < size) {
                }
                ArrayList<TLRPC.Chat> arrayList122 = tL_messages_messageReactionsList.chats;
                size2 = arrayList122.size();
                i3 = 0;
                while (i3 < size2) {
                }
                tk4 tk4Var22 = p19Var.a;
                hd0 hd0Var2 = p19Var.c;
                p19Var.setEnabled(arrayList8.size() <= 0);
                while (i4 < 3) {
                }
                size3 = arrayList8.size();
                if (size3 != 1) {
                }
                f = L;
                if (jb6.a0) {
                }
                hd0Var2.setTranslationX(f);
                hd0Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                hd0Var2.animate().alpha(1.0f).setDuration(220L).start();
                tk4Var22.animate().alpha(0.0f).setDuration(220L).setListener(new jf4(tk4Var22)).start();
                return;
        }
    }

    public /* synthetic */ h65(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ h65(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
