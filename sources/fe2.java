// default package

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class fe2 implements Runnable {
    public final /* synthetic */ byte a = 4;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fe2(i20 i20Var, long j, boolean z, TLRPC.Document document, Runnable runnable) {
        this.e = i20Var;
        this.c = j;
        this.d = z;
        this.f = document;
        this.b = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r3 == null) goto L21;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.ChatFull L0;
        TLRPC.UserFull userFull;
        String str;
        Exception exc;
        y05 y05Var;
        f15 s;
        TLRPC.WallPaper wallPaper = null;
        r3 = null;
        SQLiteCursor sQLiteCursor = null;
        r3 = null;
        r3 = null;
        y05 y05Var2 = null;
        switch (this.a) {
            case 0:
                je2 je2Var = (je2) this.e;
                TLObject tLObject = (TLObject) this.f;
                long j = this.c;
                boolean z = this.d;
                String str2 = (String) this.b;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    int i = je2Var.currentAccount;
                    if (j >= 0) {
                        userFull = na7.q1(i).W1(j);
                        L0 = null;
                    } else {
                        L0 = na7.q1(i).L0(-j);
                        userFull = null;
                    }
                    if (userFull != null) {
                        wallPaper = userFull.wallpaper;
                    } else if (L0 != null) {
                        wallPaper = L0.wallpaper;
                    }
                    int i2 = 0;
                    while (true) {
                        if (i2 < updates.updates.size()) {
                            if (updates.updates.get(i2) instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.MessageAction messageAction = ((TL_update.TL_updateNewMessage) updates.updates.get(i2)).message.action;
                                if (messageAction instanceof TLRPC.TL_messageActionSetChatWallPaper) {
                                    if (z) {
                                        TLRPC.TL_messageActionSetChatWallPaper tL_messageActionSetChatWallPaper = (TLRPC.TL_messageActionSetChatWallPaper) messageAction;
                                        tL_messageActionSetChatWallPaper.wallpaper.uploadingImage = str2;
                                        if (wallPaper != null && (str = wallPaper.uploadingImage) != null && str.equals(str2)) {
                                            tL_messageActionSetChatWallPaper.wallpaper.stripedThumb = wallPaper.stripedThumb;
                                        }
                                        if (userFull != null) {
                                            TLRPC.WallPaper wallPaper2 = tL_messageActionSetChatWallPaper.wallpaper;
                                            userFull.wallpaper = wallPaper2;
                                            userFull.flags |= 16777216;
                                            je2Var.p(j, wallPaper2);
                                            je2Var.getMessagesStorage().g2(userFull, false);
                                            kk7.f(je2Var.currentAccount).k(67, Long.valueOf(j), userFull);
                                        } else if (L0 != null) {
                                            TLRPC.WallPaper wallPaper3 = tL_messageActionSetChatWallPaper.wallpaper;
                                            L0.wallpaper = wallPaper3;
                                            L0.flags2 |= 128;
                                            je2Var.p(j, wallPaper3);
                                            je2Var.getMessagesStorage().K1(L0, false);
                                            kk7 f = kk7.f(je2Var.currentAccount);
                                            Boolean bool = Boolean.FALSE;
                                            f.k(30, L0, 0, bool, bool);
                                        }
                                    }
                                }
                            }
                            i2++;
                        }
                    }
                    na7.q1(je2Var.currentAccount).Q3(updates.updates, updates.users, updates.chats, false, updates.date);
                    kk7.f(je2Var.currentAccount).k(kk7.w5, new Object[0]);
                    return;
                }
                return;
            case 1:
                d01.r((Context) this.e, Uri.parse((String) this.b), this.c == 0, this.d, (c01) this.f);
                return;
            case 2:
                i20 i20Var = (i20) this.e;
                long j2 = this.c;
                boolean z2 = this.d;
                TLRPC.Document document = (TLRPC.Document) this.f;
                Runnable runnable = (Runnable) this.b;
                HashSet hashSet = na7.q1(i20Var.a).E1().b;
                if (z2) {
                    hashSet.add(Long.valueOf(j2));
                } else {
                    hashSet.remove(Long.valueOf(j2));
                }
                long e = y6c.h(i20Var.a).e();
                TLRPC.UserFull W1 = na7.q1(i20Var.a).W1(e);
                if (W1 != null) {
                    if (z2) {
                        W1.flags2 |= TLObject.FLAG_21;
                        W1.saved_music = document;
                    } else {
                        TLRPC.Document document2 = W1.saved_music;
                        if (document2 != null && document2.id == j2) {
                            W1.flags2 &= -2097153;
                            W1.saved_music = null;
                        }
                    }
                    ad7.Y(i20Var.a).g2(W1, true);
                    kk7.f(i20Var.a).k(kk7.X3, Long.valueOf(e));
                }
                runnable.run();
                return;
            case 3:
                g15 g15Var = (g15) this.e;
                long j3 = this.c;
                String str3 = (String) this.b;
                boolean z3 = this.d;
                p8c p8cVar = (p8c) this.f;
                try {
                    g15Var.f = null;
                    Object obj = g15.g;
                    synchronized (obj) {
                        g15Var.c(j3);
                        s = g15Var.s();
                    }
                    if (((LinkedHashMap) s.e).containsKey(str3)) {
                        y05Var = g15Var.h(s, str3, j3);
                        try {
                            synchronized (obj) {
                                g15Var.c(j3);
                                if (z3) {
                                    try {
                                        s.a = ConnectionsManager.getInstance(g15Var.b).getCurrentTime();
                                        if (g15Var.d.exists()) {
                                            g15Var.w(s, new LinkedHashMap());
                                        } else {
                                            if (!g15Var.r().edit().putInt("lastUsageDate", s.a).commit()) {
                                                throw new IOException("usage write");
                                            }
                                            gl.c3(new ql3((byte) 9));
                                        }
                                    } catch (Exception e2) {
                                        g15Var.m(e2);
                                    }
                                }
                            }
                            y05Var2 = y05Var;
                        } catch (Exception e3) {
                            exc = e3;
                            g15Var.m(exc);
                            if (y05Var != null) {
                                y05Var.close();
                            }
                            gl.c3(new m77(g15Var, y05Var2, p8cVar, j3));
                            return;
                        }
                    }
                } catch (Exception e4) {
                    exc = e4;
                    y05Var = null;
                }
                gl.c3(new m77(g15Var, y05Var2, p8cVar, j3));
                return;
            default:
                ad7 ad7Var = (ad7) this.e;
                boolean z4 = this.d;
                long j4 = this.c;
                Integer[] numArr = (Integer[]) this.f;
                CountDownLatch countDownLatch = (CountDownLatch) this.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = ad7Var.b;
                        if (z4) {
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT outbox_max FROM dialogs WHERE did = " + j4, new Object[0]);
                            if (sQLiteCursor.next()) {
                                numArr[0] = Integer.valueOf(sQLiteCursor.intValue(0));
                            }
                        } else {
                            sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT last_mid, inbox_max FROM dialogs WHERE did = " + j4, new Object[0]);
                            if (sQLiteCursor.next()) {
                                int intValue = sQLiteCursor.intValue(0);
                                int intValue2 = sQLiteCursor.intValue(1);
                                if (intValue2 > intValue) {
                                    numArr[0] = 0;
                                } else {
                                    numArr[0] = Integer.valueOf(intValue2);
                                }
                            }
                        }
                    } finally {
                    }
                } catch (Exception e5) {
                    ad7Var.n(e5, true);
                    break;
                }
                sQLiteCursor.dispose();
                countDownLatch.countDown();
                return;
        }
    }

    public /* synthetic */ fe2(je2 je2Var, TLObject tLObject, long j, boolean z, String str, jc jcVar) {
        this.e = je2Var;
        this.f = tLObject;
        this.c = j;
        this.d = z;
        this.b = str;
    }

    public /* synthetic */ fe2(g15 g15Var, long j, String str, boolean z, p8c p8cVar) {
        this.e = g15Var;
        this.c = j;
        this.b = str;
        this.d = z;
        this.f = p8cVar;
    }

    public /* synthetic */ fe2(ad7 ad7Var, boolean z, long j, Integer[] numArr, CountDownLatch countDownLatch) {
        this.e = ad7Var;
        this.d = z;
        this.c = j;
        this.f = numArr;
        this.b = countDownLatch;
    }

    public /* synthetic */ fe2(Context context, String str, long j, boolean z, c01 c01Var) {
        this.e = context;
        this.b = str;
        this.c = j;
        this.d = z;
        this.f = c01Var;
    }
}
