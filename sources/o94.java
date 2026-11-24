// default package

import android.os.AsyncTask;
import android.util.Pair;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class o94 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ o94(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [ba4] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    /* JADX WARN: Type inference failed for: r16v7, types: [uu9] */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r17v5, types: [usc] */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r19v2 */
    @Override // java.lang.Runnable
    public final void run() {
        int O;
        tk5 tk5Var;
        gl5 gl5Var;
        TLRPC.Document document;
        ?? r16;
        TLObject tLObject;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2;
        ?? r19;
        ?? r17;
        String str;
        TLRPC.PhotoSize photoSize;
        byte b = this.a;
        byte b2 = 7;
        byte b3 = 1;
        byte b4 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ba4 ba4Var = (ba4) obj2;
                String str2 = (String) obj;
                l94 l94Var = (l94) ba4Var.w.get(str2);
                if (l94Var != null && l94Var.W0 != (O = ba4Var.O(b4))) {
                    l94Var.W0 = O;
                    u20 u20Var = l94Var.e1;
                    ((ArrayList) u20Var.d).remove(l94Var);
                    u20Var.a(l94Var);
                    u20Var.b(false);
                    StringBuilder p = ug8.p("update priority ", str2, " position in queue ");
                    p.append(((ArrayList) l94Var.e1.d).indexOf(l94Var));
                    p.append(" account=");
                    b00.p(ba4Var.currentAccount, p);
                    break;
                }
                break;
            case 1:
                ((cr8) ((ee3) obj2).c).f(b4, (Serializable) obj);
                break;
            case 2:
                vq3 vq3Var = (vq3) obj2;
                ((wq3) obj).n(vq3Var.a, vq3Var.b, b4);
                break;
            case 3:
                fl5 fl5Var = (fl5) obj2;
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                int i = 0;
                while (i < 3) {
                    int A = imageReceiver.A(i == 0 ? 1 : i == 1 ? 0 : 3);
                    if (A != 0 && (tk5Var = (tk5) fl5Var.k.get(A)) != null && (gl5Var = tk5Var.i) != null) {
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = gl5Var.f;
                        if (tL_fileLocationToBeDeprecated3 != null) {
                            r19 = tk5Var.g;
                            tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated3;
                            document = null;
                            r16 = null;
                            r17 = 0;
                        } else {
                            TLRPC.Document document2 = gl5Var.i;
                            if (document2 != null) {
                                document = document2;
                                r16 = null;
                            } else {
                                uu9 uu9Var = gl5Var.h;
                                if (uu9Var != null) {
                                    r16 = uu9Var;
                                    document = null;
                                    tL_fileLocationToBeDeprecated2 = null;
                                    tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated2;
                                    tLObject = tL_fileLocationToBeDeprecated2;
                                    r19 = tL_fileLocationToBeDeprecated;
                                    r17 = tLObject;
                                } else {
                                    TLObject tLObject2 = gl5Var.v;
                                    if (tLObject2 != null) {
                                        tLObject = tLObject2;
                                        document = null;
                                        r16 = null;
                                        tL_fileLocationToBeDeprecated = null;
                                        r19 = tL_fileLocationToBeDeprecated;
                                        r17 = tLObject;
                                    } else {
                                        document = null;
                                        r16 = null;
                                    }
                                }
                            }
                            tL_fileLocationToBeDeprecated2 = r16;
                            tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated2;
                            tLObject = tL_fileLocationToBeDeprecated2;
                            r19 = tL_fileLocationToBeDeprecated;
                            r17 = tLObject;
                        }
                        ba4.G(tk5Var.o).h(this.b, document, r16, r17, tL_fileLocationToBeDeprecated, r19);
                    }
                    i++;
                }
                break;
            case 4:
                fl5 fl5Var2 = (fl5) obj2;
                wk5 wk5Var = (wk5) obj;
                LinkedList linkedList = fl5Var2.B;
                HashMap hashMap = fl5Var2.C;
                if (wk5Var != null) {
                    File file = wk5Var.b;
                    fl5Var2.E--;
                    int i2 = wk5Var.h;
                    String str3 = wk5Var.a;
                    if (b4 == 1) {
                        if (wk5Var.f) {
                            wk5 wk5Var2 = new wk5(fl5Var2, wk5Var.a, file, wk5Var.c, wk5Var.h);
                            fl5Var2 = fl5Var2;
                            hb5 hb5Var = new hb5(fl5Var2, wk5Var2, b2);
                            fl5Var2.D.put(str3, hb5Var);
                            gl.d3(hb5Var, 1000L);
                        } else {
                            hashMap.remove(str3);
                            kk7.f(i2).k(kk7.R1, str3, 0);
                        }
                    } else if (b4 == 2) {
                        hashMap.remove(str3);
                        File file2 = new File(ba4.z(4), Utilities.a(str3) + "." + wk5Var.c);
                        kk7.f(i2).k(kk7.Q1, str3, file.renameTo(file2) ? file2.toString() : file.toString());
                    }
                }
                while (fl5Var2.E < 2 && !linkedList.isEmpty()) {
                    ((wk5) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    fl5Var2.E++;
                }
            case 5:
                eb6 eb6Var = (eb6) obj2;
                db6 db6Var = (db6) obj;
                try {
                    if (b4 == 2) {
                        eb6Var.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
                    } else if (b4 == 1) {
                        if (db6Var != null) {
                            eb6Var.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE uid = " + db6Var.a).stepThis().dispose();
                        }
                    } else if (db6Var != null) {
                        SQLitePreparedStatement executeFast = eb6Var.getMessagesStorage().b.executeFast("REPLACE INTO sharing_locations VALUES(?, ?, ?, ?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(db6Var.h.k.getObjectSize());
                        db6Var.h.k.serializeToStream(nativeByteBuffer);
                        executeFast.bindLong(1, db6Var.a);
                        executeFast.bindInteger(2, db6Var.b);
                        executeFast.bindInteger(3, db6Var.c);
                        executeFast.bindInteger(4, db6Var.d);
                        executeFast.bindByteBuffer(5, nativeByteBuffer);
                        executeFast.bindInteger(6, db6Var.f);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                    }
                    break;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 6:
                hq6 hq6Var = (hq6) obj2;
                TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) obj;
                try {
                    hq6Var.getMessagesStorage().b.executeFast("DELETE FROM emoji_statuses WHERE type = " + ((int) b4)).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = hq6Var.getMessagesStorage().b.executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
                    executeFast2.requery();
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
                    tL_emojiStatuses.serializeToStream(nativeByteBuffer2);
                    executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                    executeFast2.bindInteger(2, b4);
                    executeFast2.step();
                    nativeByteBuffer2.reuse();
                    executeFast2.dispose();
                } catch (Exception e2) {
                    fa4.g(e2, true);
                }
                hq6Var.I0[b4] = false;
                break;
            case 7:
                hq6 hq6Var2 = (hq6) obj2;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj;
                hq6Var2.U.l(stickerSet.id);
                hq6Var2.c1(this.b, false, true, false, new vo6(hq6Var2, stickerSet, b3));
                break;
            case 8:
                hq6 hq6Var3 = (hq6) obj2;
                TLRPC.Document document3 = (TLRPC.Document) obj;
                if (b4 == 0) {
                    b2 = 3;
                } else if (b4 == 1) {
                    b2 = 4;
                } else if (b4 != 5) {
                    b2 = 5;
                }
                try {
                    hq6Var3.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document3.id + "' AND type = " + ((int) b2)).stepThis().dispose();
                    break;
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    return;
                }
            case 9:
                Pair pair = (Pair) obj;
                ((by6) obj2).b.i.n(((Integer) pair.first).intValue(), (rx6) pair.second, b4);
                break;
            case 10:
                na7 na7Var = (na7) obj2;
                vn2 vn2Var = (vn2) obj;
                if (vn2Var != null) {
                    vn2Var.a(Integer.valueOf(b4), null);
                }
                na7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 11:
                ad7 ad7Var = (ad7) obj2;
                ad7Var.b1((TLRPC.messages_Dialogs) obj, b4);
                try {
                    ad7Var.a.c(new vb7(ad7Var, (byte) 21));
                    break;
                } catch (Exception e4) {
                    ad7Var.n(e4, true);
                    return;
                }
            case 12:
                ArrayList arrayList = (ArrayList) obj;
                up3 downloadController = ((ad7) obj2).getDownloadController();
                HashMap hashMap2 = downloadController.f;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = b4 == 1 ? downloadController.b : b4 == 2 ? downloadController.c : b4 == 4 ? downloadController.e : downloadController.d;
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        vp3 vp3Var = (vp3) arrayList.get(i3);
                        TLObject tLObject3 = vp3Var.a;
                        if (tLObject3 instanceof TLRPC.Document) {
                            str = ba4.r(null, (TLRPC.Document) tLObject3);
                            photoSize = null;
                        } else if (tLObject3 instanceof TLRPC.Photo) {
                            TLRPC.PhotoSize w = ba4.w(((TLRPC.Photo) tLObject3).sizes, gl.Y0(false), false, null, false);
                            photoSize = w;
                            str = ba4.r(null, w);
                        } else {
                            str = null;
                            photoSize = null;
                        }
                        if (str != null && !hashMap2.containsKey(str)) {
                            TLObject tLObject4 = vp3Var.a;
                            if (photoSize != null) {
                                downloadController.getFileLoader().V(gl5.i(photoSize, (TLRPC.Photo) tLObject4), vp3Var.f, null, 0, vp3Var.d ? 2 : vp3Var.e ? 1 : 0);
                            } else if (tLObject4 instanceof TLRPC.Document) {
                                downloadController.getFileLoader().X((TLRPC.Document) tLObject4, vp3Var.f, 0, vp3Var.d ? 2 : 0);
                            }
                            arrayList2.add(vp3Var);
                            hashMap2.put(str, vp3Var);
                            downloadController.h.put(new Pair(Long.valueOf(vp3Var.c), Integer.valueOf(vp3Var.b)), vp3Var);
                        }
                    }
                    break;
                }
                break;
            case 13:
                ((vx7) obj2).w1((uu9) obj, b4);
                break;
            default:
                lk0 lk0Var = (lk0) obj;
                wi9 wi9Var = ((qi9) obj2).a;
                if (wi9Var.E != null) {
                    wi9.c(lk0Var.b, "");
                    ((ie9) wi9Var.E).c(lk0Var, b4);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ o94(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
