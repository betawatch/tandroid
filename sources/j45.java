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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class j45 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ j45(int i, int[] iArr, hb5 hb5Var) {
        this.a = (byte) 4;
        this.b = i;
        this.c = iArr;
        this.d = hb5Var;
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
        vf6 vf6Var;
        boolean z;
        SQLiteCursor queryFinalized;
        na7 na7Var;
        int i3;
        TLRPC.Peer peer;
        int i4;
        String str;
        boolean z2;
        na7 na7Var2;
        j45 j45Var = this;
        na7 na7Var3 = (na7) j45Var.c;
        TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) j45Var.d;
        boolean z3 = true;
        try {
            i = 0;
            na7Var3.getUserConfig().y(0, na7Var3.getUserConfig().m(0) + messages_dialogs.dialogs.size());
            message = null;
            int i5 = 0;
            while (true) {
                j = 1000;
                if (i5 >= messages_dialogs.messages.size()) {
                    break;
                }
                TLRPC.Message message2 = messages_dialogs.messages.get(i5);
                if (w01.a) {
                    fa4.b("search migrate id " + message2.id + " date " + k96.D0().y0().format(message2.date * 1000));
                }
                if (message == null || message2.date < message.date) {
                    message = message2;
                }
                i5++;
            }
            if (w01.a) {
                fa4.b("migrate step with id " + message.id + " date " + k96.D0().y0().format(message.date * 1000));
            }
            if (messages_dialogs.dialogs.size() >= 100) {
                i2 = message.id;
            } else {
                if (w01.a) {
                    fa4.b("migrate stop due to not 100 dialogs");
                }
                int i6 = 0;
                for (int i7 = 2; i6 < i7; i7 = 2) {
                    na7Var3.getUserConfig().w(i6, ConnectionsManager.DEFAULT_DATACENTER_ID, na7Var3.getUserConfig().L, na7Var3.getUserConfig().M, na7Var3.getUserConfig().N, na7Var3.getUserConfig().O, na7Var3.getUserConfig().P);
                    i6++;
                    j = j;
                }
                i2 = -1;
            }
            j2 = j;
            StringBuilder sb = new StringBuilder(messages_dialogs.dialogs.size() * 12);
            vf6Var = new vf6();
            for (int i8 = 0; i8 < messages_dialogs.dialogs.size(); i8++) {
                TLRPC.Dialog dialog = messages_dialogs.dialogs.get(i8);
                cf3.w(dialog);
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(dialog.id);
                vf6Var.k(dialog, dialog.id);
            }
            SQLiteDatabase sQLiteDatabase = na7Var3.getMessagesStorage().b;
            Locale locale = Locale.US;
            try {
                SQLiteCursor queryFinalized2 = sQLiteDatabase.queryFinalized("SELECT did, folder_id FROM dialogs WHERE did IN (" + sb.toString() + ")", new Object[0]);
                while (queryFinalized2.next()) {
                    long longValue = queryFinalized2.longValue(0);
                    int intValue = queryFinalized2.intValue(1);
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) vf6Var.f(longValue);
                    if (dialog2 != null) {
                        if (dialog2.folder_id == intValue) {
                            messages_dialogs.dialogs.remove(dialog2);
                            int i9 = 0;
                            while (true) {
                                if (i9 >= messages_dialogs.messages.size()) {
                                    break;
                                }
                                TLRPC.Message message3 = messages_dialogs.messages.get(i9);
                                if (k27.B0(message3) == longValue) {
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
                    vf6Var.l(longValue);
                }
                queryFinalized2.dispose();
                if (w01.a) {
                    fa4.b("migrate found missing dialogs " + messages_dialogs.dialogs.size());
                }
                queryFinalized = na7Var3.getMessagesStorage().b.queryFinalized("SELECT min(date) FROM dialogs WHERE date != 0 AND did >> 32 NOT IN (536870912, 1073741824)", new Object[0]);
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
                    i4 = j45Var.b;
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
                                na7 na7Var4 = na7Var3;
                                try {
                                    na7Var3.getUserConfig().w(i12, na7Var3.getUserConfig().K, na7Var3.getUserConfig().L, na7Var3.getUserConfig().M, na7Var3.getUserConfig().N, na7Var4.getUserConfig().O, na7Var4.getUserConfig().P);
                                    i11 = i12 + 1;
                                    na7Var3 = na7Var4;
                                    z3 = z;
                                } catch (Exception e3) {
                                    e = e3;
                                    na7Var3 = na7Var4;
                                    z3 = z;
                                    fa4.g(e, z3);
                                    gl.c3(new c87(na7Var3, (byte) 9));
                                    return;
                                }
                            }
                            z2 = z3;
                            na7Var2 = na7Var3;
                            if (w01.a) {
                                fa4.b("migrate stop due to reached loaded dialogs " + k96.D0().y0().format(max * j2));
                            }
                            i2 = -1;
                        } else {
                            z2 = z3;
                            na7Var2 = na7Var3;
                        }
                        messages_dialogs.messages.remove(i10);
                        i10--;
                        long B0 = k27.B0(message4);
                        TLRPC.Dialog dialog3 = (TLRPC.Dialog) vf6Var.f(B0);
                        vf6Var.l(B0);
                        if (dialog3 != null) {
                            messages_dialogs.dialogs.remove(dialog3);
                        }
                    } else {
                        z2 = z3;
                        na7Var2 = na7Var3;
                    }
                    i10++;
                    j45Var = this;
                    na7Var3 = na7Var2;
                    z3 = z2;
                    i = 0;
                }
                z = z3;
                na7Var = na7Var3;
                if (message != null && message.date < max && i4 != -1) {
                    int i13 = 0;
                    while (i13 < 2) {
                        int i14 = i13;
                        na7Var.getUserConfig().w(i14, na7Var.getUserConfig().K, na7Var.getUserConfig().L, na7Var.getUserConfig().M, na7Var.getUserConfig().N, na7Var.getUserConfig().O, na7Var.getUserConfig().P);
                        i13 = i14 + 1;
                        str = str;
                    }
                    String str2 = str;
                    if (w01.a) {
                        fa4.b(str2 + k96.D0().y0().format(max * j2));
                    }
                    i3 = -1;
                    queryFinalized.dispose();
                    na7Var.getUserConfig().L = message.date;
                    peer = message.peer_id;
                    if (peer.channel_id == 0) {
                        na7Var.getUserConfig().O = message.peer_id.channel_id;
                        na7Var.getUserConfig().N = 0L;
                        na7Var.getUserConfig().M = 0L;
                        int i15 = 0;
                        while (true) {
                            if (i15 >= messages_dialogs.chats.size()) {
                                break;
                            }
                            TLRPC.Chat chat = messages_dialogs.chats.get(i15);
                            if (chat.id == na7Var.getUserConfig().O) {
                                na7Var.getUserConfig().P = chat.access_hash;
                                break;
                            }
                            i15++;
                        }
                    } else if (peer.chat_id != 0) {
                        na7Var.getUserConfig().N = message.peer_id.chat_id;
                        na7Var.getUserConfig().O = 0L;
                        na7Var.getUserConfig().M = 0L;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= messages_dialogs.chats.size()) {
                                break;
                            }
                            TLRPC.Chat chat2 = messages_dialogs.chats.get(i16);
                            if (chat2.id == na7Var.getUserConfig().N) {
                                na7Var.getUserConfig().P = chat2.access_hash;
                                break;
                            }
                            i16++;
                        }
                    } else if (peer.user_id != 0) {
                        na7Var.getUserConfig().M = message.peer_id.user_id;
                        na7Var.getUserConfig().N = 0L;
                        na7Var.getUserConfig().O = 0L;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= messages_dialogs.users.size()) {
                                break;
                            }
                            TLRPC.User user = messages_dialogs.users.get(i17);
                            if (user.id == na7Var.getUserConfig().M) {
                                na7Var.getUserConfig().P = user.access_hash;
                                break;
                            }
                            i17++;
                        }
                    }
                    na7Var3 = na7Var;
                    na7Var3.M3(messages_dialogs, null, null, 0, i3, 0, 0, false, true, false);
                    return;
                }
            } else {
                z = true;
                na7Var = na7Var3;
            }
            na7Var3.M3(messages_dialogs, null, null, 0, i3, 0, 0, false, true, false);
            return;
        } catch (Exception e4) {
            e = e4;
            z3 = z;
            fa4.g(e, z3);
            gl.c3(new c87(na7Var3, (byte) 9));
            return;
        }
        i3 = i2;
        queryFinalized.dispose();
        na7Var.getUserConfig().L = message.date;
        peer = message.peer_id;
        if (peer.channel_id == 0) {
        }
        na7Var3 = na7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0191  */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ?? r8;
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
        long j = 0;
        int i6 = 0;
        byte b2 = 1;
        switch (this.a) {
            case 0:
                h75 h75Var = (h75) this.c;
                hd[] hdVarArr = (hd[]) this.d;
                int i7 = this.b;
                hd hdVar = hdVarArr[0];
                if (hdVar != null) {
                    hdVar.setOnCancelListener(new xs0(h75Var, i7, (byte) 6));
                    hdVarArr[0].show();
                    return;
                }
                return;
            case 1:
                qb5 qb5Var = (qb5) this.c;
                int i8 = this.b;
                ArrayList arrayList = (ArrayList) this.d;
                zr9 zr9Var = qb5Var.d;
                rb5 rb5Var = qb5Var.x;
                if (i8 == qb5Var.n) {
                    qb5Var.h = false;
                    TLRPC.Chat chat = rb5Var.P1;
                    zya zyaVar = rb5Var.t1;
                    if (!hc2.T(chat)) {
                        vf6 vf6Var = zr9Var.h;
                        ArrayList arrayList2 = zr9Var.g;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        int size4 = arrayList.size();
                        for (int i9 = 0; i9 < size4; i9++) {
                            TLObject tLObject = (TLObject) arrayList.get(i9);
                            if (tLObject instanceof TLRPC.ChatParticipant) {
                                vf6Var.k(tLObject, ((TLRPC.ChatParticipant) tLObject).user_id);
                            } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                                vf6Var.k(tLObject, k27.B1(((TLRPC.ChannelParticipant) tLObject).peer));
                            }
                        }
                        zr9Var.i();
                    }
                    int i10 = qb5Var.f - 1;
                    boolean z3 = zyaVar.getVisibility() == 0;
                    qb5Var.f();
                    if (qb5Var.f > i10) {
                        rb5Var.J0(i10);
                    }
                    if (qb5Var.h || zr9Var.e() || !rb5Var.n1.S0()) {
                        return;
                    }
                    zyaVar.e(false, z3);
                    return;
                }
                return;
            case 2:
                dd5 dd5Var = (dd5) this.c;
                int i11 = this.b;
                String str2 = (String) this.d;
                ArrayList arrayList3 = dd5Var.R;
                int i12 = dd5Var.Q;
                if (i11 == dd5Var.W) {
                    String str3 = (dd5Var.e0[0] ? "$" : "#") + dd5Var.b0;
                    t1b t1bVar = dd5Var.T;
                    if (t1bVar == null || !TextUtils.equals(t1bVar.C, str3)) {
                        dd5Var.T = new t1b(i12, null, str3);
                    }
                    if (dd5Var.T.i.size() <= 0) {
                        r8 = 1;
                        dd5Var.T.p(4, true);
                    } else {
                        r8 = 1;
                    }
                    dd5Var.S = r8;
                    TLRPC.TL_channels_searchPosts tL_channels_searchPosts = new TLRPC.TL_channels_searchPosts();
                    tL_channels_searchPosts.flags |= r8;
                    dd5Var.b0 = str2;
                    tL_channels_searchPosts.hashtag = str2;
                    tL_channels_searchPosts.limit = 10;
                    if (arrayList3.isEmpty()) {
                        tL_channels_searchPosts.offset_peer = new TLRPC.TL_inputPeerEmpty();
                    } else {
                        k27 k27Var = (k27) b00.f(r8, arrayList3);
                        tL_channels_searchPosts.offset_rate = dd5Var.c0;
                        tL_channels_searchPosts.offset_peer = na7.q1(i12).k1(k27Var.k.peer_id);
                    }
                    dd5Var.X = ConnectionsManager.getInstance(i12).sendRequest(tL_channels_searchPosts, new b97(dd5Var, i11, str3, (byte) 7));
                    return;
                }
                return;
            case 3:
                rw5 rw5Var = (rw5) this.c;
                l01 l01Var = (l01) this.d;
                int i13 = this.b;
                if (rw5Var.M0.getCurrentBrush() instanceof l01) {
                    rw5Var.a1 = true;
                }
                rw5Var.s(l01Var);
                ks7 ks7Var = rw5Var.j1;
                int i14 = ks7Var.d + 1;
                ks7Var.a(i14);
                gl.L3(ks7Var.a[i14], i13);
                ks7Var.e = true;
                return;
            case 4:
                int i15 = this.b;
                int[] iArr = (int[]) this.c;
                hb5 hb5Var = (hb5) this.d;
                String str4 = LaunchActivity.C1;
                ConnectionsManager.getInstance(i15).cancelRequest(iArr[0], true);
                if (hb5Var != null) {
                    hb5Var.run();
                    return;
                }
                return;
            case 5:
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) this.c;
                int i16 = this.b;
                x56 x56Var = (x56) this.d;
                Iterator it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    z56 z56Var = (z56) it.next();
                    if (!z56Var.d) {
                        if (i16 != -1) {
                            z56Var.b.b(i16);
                        }
                        z56Var.c = true;
                        x56Var.invoke(z56Var.a);
                    }
                }
                return;
            case 6:
                hq6 hq6Var = (hq6) this.c;
                int i17 = this.b;
                p8c p8cVar = (p8c) this.d;
                ArrayList arrayList4 = new ArrayList();
                try {
                    boolean z4 = false;
                    sQLiteCursor = hq6Var.getMessagesStorage().b.queryFinalized("SELECT data, date, hash FROM stickers_v2 WHERE id = " + (i17 + 1), new Object[0]);
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
                                j = hq6.s(arrayList4);
                            } catch (Throwable th) {
                                th = th;
                                z = true;
                                try {
                                    fa4.g(th, z);
                                    b = z;
                                    if (sQLiteCursor != null) {
                                    }
                                    hq6Var.A1(i17, arrayList4, true, i, j, new hq3(p8cVar, arrayList4, b));
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
                        fa4.g(th, z);
                        b = z;
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                            b = z;
                        }
                        hq6Var.A1(i17, arrayList4, true, i, j, new hq3(p8cVar, arrayList4, b));
                        return;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLiteCursor = null;
                }
                hq6Var.A1(i17, arrayList4, true, i, j, new hq3(p8cVar, arrayList4, b));
                return;
            case 7:
                hq6 hq6Var2 = (hq6) this.c;
                TLRPC.TL_help_premiumPromo tL_help_premiumPromo = (TLRPC.TL_help_premiumPromo) this.d;
                int i19 = this.b;
                try {
                    if (tL_help_premiumPromo != null) {
                        hq6Var2.getMessagesStorage().b.executeFast("DELETE FROM premium_promo").stepThis().dispose();
                        SQLitePreparedStatement executeFast = hq6Var2.getMessagesStorage().b.executeFast("REPLACE INTO premium_promo VALUES(?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(tL_help_premiumPromo.getObjectSize());
                        tL_help_premiumPromo.serializeToStream(nativeByteBuffer);
                        executeFast.bindByteBuffer(1, nativeByteBuffer);
                        executeFast.bindInteger(2, i19);
                        executeFast.step();
                        nativeByteBuffer.reuse();
                        executeFast.dispose();
                    } else {
                        SQLitePreparedStatement executeFast2 = hq6Var2.getMessagesStorage().b.executeFast("UPDATE premium_promo SET date = ?");
                        executeFast2.requery();
                        executeFast2.bindInteger(1, i19);
                        executeFast2.step();
                        executeFast2.dispose();
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 8:
                bq6 bq6Var = (bq6) this.c;
                bq6 bq6Var2 = (bq6) this.d;
                int i20 = this.b;
                SparseArray sparseArray = bq6Var.w.getMessagesStorage().h;
                ArrayList arrayList5 = (ArrayList) sparseArray.get(i20);
                if (arrayList5 != null) {
                    arrayList5.remove(bq6Var2);
                    if (arrayList5.isEmpty()) {
                        sparseArray.remove(i20);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ap1 ap1Var = (ap1) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                int i21 = this.b;
                if (tLObject2 instanceof TLRPC.User) {
                    ap1Var.a = (TLRPC.User) tLObject2;
                    na7.q1(i21).a4(ap1Var.a, false, false);
                }
                pi4 pi4Var = ap1Var.c;
                l46 l46Var = ap1Var.b;
                ap1Var.setEnabled(ap1Var.a != null);
                TLRPC.User user = ap1Var.a;
                if (user != null) {
                    l46Var.setText(gl.N2(k96.a0(null, null, 2131748407, l7c.r(user)), -1, 2, new et((Object) ap1Var, user.id, (byte) 20), null));
                }
                l46Var.animate().alpha(1.0f).setDuration(220L).start();
                pi4Var.animate().alpha(0.0f).setDuration(220L).setListener(new id4(pi4Var)).start();
                return;
            case 10:
                na7 na7Var = (na7) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                int i22 = this.b;
                if (tLObject3 != null) {
                    na7Var.k2--;
                    TLRPC.TL_peerNotifySettings tL_peerNotifySettings = (TLRPC.TL_peerNotifySettings) tLObject3;
                    SharedPreferences.Editor edit = na7Var.W3.edit();
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
                    na7Var.getNotificationsController().h0.a(tL_peerNotifySettings.android_sound, edit, 0L, 0L, i22);
                    edit.apply();
                    if (na7Var.k2 == 0) {
                        na7Var.getUserConfig().T = true;
                        na7Var.getUserConfig().u(false);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                a();
                return;
            case 12:
                na7 na7Var2 = (na7) this.c;
                int i24 = this.b;
                d dVar = (d) this.d;
                na7Var2.getConnectionsManager().cancelRequest(i24, true);
                dVar.setVisibleDialog(null);
                return;
            case 13:
                w97 w97Var = (w97) this.c;
                int i25 = this.b;
                HashMap hashMap = (HashMap) this.d;
                ArrayList arrayList6 = w97Var.b;
                arrayList6.clear();
                w97Var.f = -1;
                w97Var.g = -1;
                for (int i26 = 0; i26 < i25; i26++) {
                    arrayList6.add(null);
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    arrayList6.set(((Integer) entry.getKey()).intValue(), (TLRPC.Photo) entry.getValue());
                }
                w97Var.h.getNotificationCenter().k(kk7.f3, w97Var);
                w97Var.a(0, 80);
                return;
            case 14:
                ((ad7) this.c).getNotificationCenter().k(kk7.q1, (Long) this.d, Integer.valueOf(this.b), Boolean.TRUE);
                return;
            case 15:
                ((NativeInstance) this.c).lambda$onEmitJoinPayload$3(this.b, (String) this.d);
                return;
            case 16:
                ((kk7) this.c).k(this.b, (Object[]) this.d);
                return;
            case 17:
                im7 im7Var = (im7) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                int i27 = this.b;
                im7Var.w.addAll(0, arrayList7);
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
                fq7 fq7Var = (fq7) this.c;
                w05 w05Var = (w05) this.d;
                int i28 = this.b;
                fq7Var.run();
                gl.c3(new rm0(gl.S2(k96.a0(null, null, 2131749567, cq7.k(w05Var.b), k96.x(i28, true))), b2));
                return;
            case 19:
                wt7 wt7Var = (wt7) this.c;
                l01 l01Var2 = (l01) this.d;
                int i29 = this.b;
                if (wt7Var.E0.getCurrentBrush() instanceof l01) {
                    wt7Var.S0 = true;
                }
                wt7Var.s(l01Var2);
                ks7 ks7Var2 = wt7Var.a1;
                int i30 = ks7Var2.d + 1;
                ks7Var2.a(i30);
                gl.L3(ks7Var2.a[i30], i29);
                ks7Var2.e = true;
                return;
            case 20:
                gu7 gu7Var = (gu7) this.c;
                gu7Var.e((d9a) this.d, this.b, gu7Var.h);
                gu7Var.h = null;
                return;
            case 21:
                p pVar = (p) this.c;
                int i31 = this.b;
                Intent intent2 = (Intent) this.d;
                if (i31 != -1) {
                    z2 = true;
                    if (i31 == 1) {
                        int i32 = l70.b;
                        Status status = intent2 == null ? null : (Status) intent2.getParcelableExtra("com.google.android.gms.common.api.AutoResolveHelper.status");
                        StringBuilder sb = new StringBuilder("android pay error ");
                        sb.append(status != null ? status.b : "");
                        fa4.d(sb.toString());
                    }
                    pVar.M0(z2, false);
                    pVar.I0(false);
                    frameLayout = pVar.Q;
                    if (frameLayout == null) {
                        frameLayout.setClickable(z2);
                        return;
                    }
                    return;
                }
                Parcelable.Creator<oy7> creator = oy7.CREATOR;
                byte[] byteArrayExtra = intent2.getByteArrayExtra("com.google.android.gms.wallet.PaymentData");
                oy7 oy7Var = (oy7) (byteArrayExtra == null ? null : kte.a(byteArrayExtra, creator));
                if (oy7Var == null || (str = oy7Var.h) == null) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject(str).getJSONObject("paymentMethodData");
                    JSONObject jSONObject2 = jSONObject.getJSONObject("tokenizationData");
                    jSONObject2.getString(TeXSymbolParser.TYPE_ATTR);
                    String string = jSONObject2.getString("token");
                    if (pVar.L0 == null && pVar.N0 == null) {
                        vk9 a = qve.a(string);
                        pVar.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) a.c, (String) a.b);
                        rc1 rc1Var = (rc1) a.d;
                        pVar.y0 = rc1Var.c() + " *" + rc1Var.d();
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
                    z2 = true;
                    fa4.g(e2, true);
                }
                z2 = true;
                pVar.M0(z2, false);
                pVar.I0(false);
                frameLayout = pVar.Q;
                if (frameLayout == null) {
                }
                break;
            case 22:
                j98 j98Var = (j98) this.c;
                Uri uri = (Uri) this.d;
                int i33 = this.b;
                j98Var.getClass();
                try {
                    File file = new File(uri.getPath());
                    int i34 = y6c.t0;
                    Point point = gl.q;
                    km kmVar = new km(file, true, 0L, 0, null, null, null, 0L, i34, false, point.x, point.y, null, 0, true);
                    Bitmap q = kmVar.q(0L, false);
                    kmVar.u();
                    gl.c3(new j45((Object) j98Var, i33, (Object) q, (byte) 23));
                    return;
                } catch (Throwable th5) {
                    fa4.g(th5, true);
                    gl.c3(new w88(j98Var, (byte) 3));
                    return;
                }
            case 23:
                j98 j98Var2 = (j98) this.c;
                int i35 = this.b;
                Bitmap bitmap = (Bitmap) this.d;
                if (i35 == j98Var2.a) {
                    j98Var2.setImageBitmap(bitmap);
                    j98Var2.c = true;
                    j98Var2.b = false;
                    return;
                }
                return;
            case 24:
                ve8 ve8Var = (ve8) this.c;
                hl1 hl1Var = (hl1) this.d;
                int i36 = this.b;
                mu1 mu1Var = hl1Var.b;
                int i37 = mu1.nd;
                mu1Var.Ja(i36);
                ve8Var.b(i36 == 1 || i36 == 13);
                return;
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) this.c;
                String str5 = (String) this.d;
                int i38 = this.b;
                RectF rectF = ProfileActivity.Z6;
                gl.g(str5);
                if (i38 == profileActivity.X2) {
                    u21.b0(profileActivity).i(k96.M0(2131753718, null)).j();
                    return;
                } else {
                    u21.b0(profileActivity).i(k96.M0(2131743953, null)).j();
                    return;
                }
            case 26:
                ko8 ko8Var = (ko8) this.c;
                s49 s49Var = (s49) this.d;
                int i39 = this.b;
                if (s49Var.b() == i39 && ko8Var.e.V2 == i39 && s49Var.f == 2) {
                    ko8Var.t(s49Var, i39);
                    return;
                }
                return;
            case 27:
                lca lcaVar = (lca) this.c;
                int i40 = this.b;
                TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
                wsa wsaVar = lcaVar.e;
                if (i40 != -1) {
                    int i41 = tL_starGiftCollection.collection_id;
                    int i42 = wsaVar.a;
                    int f2 = wsaVar.f(i41);
                    if (f2 != -1) {
                        TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) wsaVar.e.remove(f2);
                        wsaVar.h.remove(Integer.valueOf(tL_starGiftCollection2.collection_id));
                        TL_stars.deleteStarGiftCollection deletestargiftcollection = new TL_stars.deleteStarGiftCollection();
                        deletestargiftcollection.peer = na7.q1(i42).h1(wsaVar.b);
                        deletestargiftcollection.collection_id = tL_starGiftCollection2.collection_id;
                        ConnectionsManager.getInstance(i42).sendRequest(deletestargiftcollection, null);
                    }
                    lcaVar.f(true);
                    vec vecVar = lcaVar.n;
                    if (i40 < wsaVar.d().size()) {
                        i40++;
                    }
                    vecVar.e(-1, i40);
                    lcaVar.o();
                    return;
                }
                return;
            case 28:
                yv8.p((d) this.c, this.b + 1, (wv8) this.d);
                return;
            default:
                oz8 oz8Var = (oz8) this.c;
                int i43 = this.b;
                TLRPC.TL_messages_messageReactionsList tL_messages_messageReactionsList = (TLRPC.TL_messages_messageReactionsList) this.d;
                int i44 = oz8Var.f;
                TextView textView = oz8Var.b;
                k27 k27Var2 = oz8Var.s;
                ImageView imageView = oz8Var.d;
                be0 be0Var = oz8Var.e;
                ArrayList arrayList8 = oz8Var.r;
                ArrayList arrayList9 = oz8Var.n;
                if (arrayList9.isEmpty() || arrayList9.size() < i43) {
                    G = k96.G(i43, "ReactionsCount", new Object[0]);
                } else {
                    G = String.format(k96.J0(i43, "Reacted"), i43 == arrayList9.size() ? String.valueOf(i43) : i43 + "/" + arrayList9.size());
                }
                if (oz8Var.getMeasuredWidth() > 0) {
                    oz8Var.w = oz8Var.getMeasuredWidth();
                }
                textView.setText(G);
                TLRPC.TL_messageReactions tL_messageReactions = k27Var2.k.reactions;
                if (tL_messageReactions != null && tL_messageReactions.results.size() == 1 && !tL_messages_messageReactionsList.reactions.isEmpty()) {
                    ArrayList arrayList10 = hq6.d0(i44).h;
                    int size5 = arrayList10.size();
                    int i45 = 0;
                    while (i45 < size5) {
                        Object obj = arrayList10.get(i45);
                        i45++;
                        TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) obj;
                        if (tL_availableReaction.reaction.equals(tL_messages_messageReactionsList.reactions.get(0).reaction)) {
                            be0Var.n(gl5.b(tL_availableReaction.center_icon), "40_40_lastreactframe", "webp", null, tL_availableReaction);
                            be0Var.setVisibility(0);
                            be0Var.setAlpha(0.0f);
                            be0Var.animate().alpha(1.0f).start();
                            imageView.setVisibility(8);
                            ArrayList<TLRPC.User> arrayList11 = tL_messages_messageReactionsList.users;
                            size = arrayList11.size();
                            i2 = 0;
                            while (i2 < size) {
                                TLRPC.User user2 = arrayList11.get(i2);
                                int i46 = i2 + 1;
                                TLRPC.User user3 = user2;
                                TLRPC.Peer peer = k27Var2.k.from_id;
                                if (peer == null || user3.id == peer.user_id) {
                                    i5 = i46;
                                } else {
                                    int i47 = 0;
                                    while (true) {
                                        if (i47 < arrayList8.size()) {
                                            i5 = i46;
                                            if (((nz8) arrayList8.get(i47)).b != user3.id) {
                                                i47++;
                                                i46 = i5;
                                            }
                                        } else {
                                            i5 = i46;
                                            arrayList8.add(new nz8(0, user3));
                                        }
                                    }
                                }
                                i2 = i5;
                            }
                            ArrayList<TLRPC.Chat> arrayList12 = tL_messages_messageReactionsList.chats;
                            size2 = arrayList12.size();
                            i3 = 0;
                            while (i3 < size2) {
                                TLRPC.Chat chat2 = arrayList12.get(i3);
                                i3++;
                                TLRPC.Chat chat3 = chat2;
                                TLRPC.Peer peer2 = k27Var2.k.from_id;
                                if (peer2 != null && chat3.id != peer2.user_id) {
                                    int i48 = i6;
                                    while (true) {
                                        if (i48 >= arrayList8.size()) {
                                            arrayList8.add(new nz8(0, chat3));
                                        } else if (((nz8) arrayList8.get(i48)).b != (-chat3.id)) {
                                            i48++;
                                        }
                                    }
                                }
                                i6 = 0;
                            }
                            pi4 pi4Var2 = oz8Var.a;
                            hc0 hc0Var = oz8Var.c;
                            oz8Var.setEnabled(arrayList8.size() <= 0);
                            for (i4 = 0; i4 < 3; i4++) {
                                if (i4 < arrayList8.size()) {
                                    hc0Var.b(i4, i44, ((nz8) arrayList8.get(i4)).a);
                                } else {
                                    hc0Var.b(i4, i44, null);
                                }
                            }
                            size3 = arrayList8.size();
                            if (size3 != 1) {
                                L = gl.L(24.0f);
                            } else {
                                if (size3 != 2) {
                                    f = 0.0f;
                                    if (k96.a0) {
                                        f = gl.L(12.0f);
                                    }
                                    hc0Var.setTranslationX(f);
                                    hc0Var.a(false);
                                    textView.animate().alpha(1.0f).setDuration(220L).start();
                                    hc0Var.animate().alpha(1.0f).setDuration(220L).start();
                                    pi4Var2.animate().alpha(0.0f).setDuration(220L).setListener(new id4(pi4Var2)).start();
                                    return;
                                }
                                L = gl.L(12.0f);
                            }
                            f = L;
                            if (k96.a0) {
                            }
                            hc0Var.setTranslationX(f);
                            hc0Var.a(false);
                            textView.animate().alpha(1.0f).setDuration(220L).start();
                            hc0Var.animate().alpha(1.0f).setDuration(220L).start();
                            pi4Var2.animate().alpha(0.0f).setDuration(220L).setListener(new id4(pi4Var2)).start();
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
                pi4 pi4Var22 = oz8Var.a;
                hc0 hc0Var2 = oz8Var.c;
                oz8Var.setEnabled(arrayList8.size() <= 0);
                while (i4 < 3) {
                }
                size3 = arrayList8.size();
                if (size3 != 1) {
                }
                f = L;
                if (k96.a0) {
                }
                hc0Var2.setTranslationX(f);
                hc0Var2.a(false);
                textView.animate().alpha(1.0f).setDuration(220L).start();
                hc0Var2.animate().alpha(1.0f).setDuration(220L).start();
                pi4Var22.animate().alpha(0.0f).setDuration(220L).setListener(new id4(pi4Var22)).start();
                return;
        }
    }

    public /* synthetic */ j45(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ j45(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
