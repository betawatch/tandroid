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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class ob4 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ob4(Object obj, int i, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        int O;
        tm5 tm5Var;
        gn5 gn5Var;
        TLRPC.Document document;
        xw9 xw9Var;
        vuc vucVar;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        String str;
        String str2;
        TLRPC.PhotoSize photoSize;
        byte b = this.a;
        int i = 5;
        byte b2 = 1;
        byte b3 = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                bc4 bc4Var = (bc4) obj2;
                String str3 = (String) obj;
                lb4 lb4Var = (lb4) bc4Var.w.get(str3);
                if (lb4Var != null && lb4Var.W0 != (O = bc4Var.O(b3))) {
                    lb4Var.W0 = O;
                    u30 u30Var = lb4Var.e1;
                    ((ArrayList) u30Var.d).remove(lb4Var);
                    u30Var.a(lb4Var);
                    u30Var.b(false);
                    StringBuilder p = wi8.p("update priority ", str3, " position in queue ");
                    p.append(((ArrayList) lb4Var.e1.d).indexOf(lb4Var));
                    p.append(" account=");
                    b10.p(bc4Var.currentAccount, p);
                    break;
                }
                break;
            case 1:
                ((ft8) ((pf3) obj2).c).g(b3, (Serializable) obj);
                break;
            case 2:
                fs3 fs3Var = (fs3) obj2;
                ((gs3) obj).n(fs3Var.a, fs3Var.b, b3);
                break;
            case 3:
                fn5 fn5Var = (fn5) obj2;
                ImageReceiver imageReceiver = (ImageReceiver) obj;
                int i2 = 0;
                while (i2 < 3) {
                    int A = imageReceiver.A(i2 == 0 ? 1 : i2 == 1 ? 0 : 3);
                    if (A != 0 && (tm5Var = (tm5) fn5Var.k.get(A)) != null && (gn5Var = tm5Var.i) != null) {
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = gn5Var.f;
                        if (tL_fileLocationToBeDeprecated2 != null) {
                            str = tm5Var.g;
                            document = null;
                            xw9Var = null;
                            vucVar = null;
                            tL_fileLocationToBeDeprecated = tL_fileLocationToBeDeprecated2;
                        } else {
                            TLRPC.Document document2 = gn5Var.i;
                            if (document2 != null) {
                                xw9Var = null;
                                vucVar = null;
                                tL_fileLocationToBeDeprecated = null;
                                str = 0;
                                document = document2;
                            } else {
                                xw9 xw9Var2 = gn5Var.h;
                                if (xw9Var2 != null) {
                                    document = null;
                                    vucVar = null;
                                    tL_fileLocationToBeDeprecated = null;
                                    str = 0;
                                    xw9Var = xw9Var2;
                                } else {
                                    vuc vucVar2 = gn5Var.v;
                                    if (vucVar2 != null) {
                                        vucVar = vucVar2;
                                        document = null;
                                        xw9Var = null;
                                        tL_fileLocationToBeDeprecated = null;
                                    } else {
                                        document = null;
                                        xw9Var = null;
                                        vucVar = null;
                                        tL_fileLocationToBeDeprecated = null;
                                    }
                                    str = tL_fileLocationToBeDeprecated;
                                }
                            }
                        }
                        bc4.G(tm5Var.o).h(this.b, document, xw9Var, vucVar, tL_fileLocationToBeDeprecated, str);
                    }
                    i2++;
                }
                break;
            case 4:
                fn5 fn5Var2 = (fn5) obj2;
                wm5 wm5Var = (wm5) obj;
                LinkedList linkedList = fn5Var2.B;
                HashMap hashMap = fn5Var2.C;
                if (wm5Var != null) {
                    File file = wm5Var.b;
                    fn5Var2.E--;
                    int i3 = wm5Var.h;
                    String str4 = wm5Var.a;
                    if (b3 == 1) {
                        if (wm5Var.f) {
                            wm5 wm5Var2 = new wm5(fn5Var2, wm5Var.a, file, wm5Var.c, wm5Var.h);
                            fn5Var2 = fn5Var2;
                            fd5 fd5Var = new fd5(fn5Var2, wm5Var2, (byte) 8);
                            fn5Var2.D.put(str4, fd5Var);
                            gm.d3(fd5Var, 1000L);
                        } else {
                            hashMap.remove(str4);
                            nm7.f(i3).k(nm7.S1, str4, 0);
                        }
                    } else if (b3 == 2) {
                        hashMap.remove(str4);
                        File file2 = new File(bc4.z(4), Utilities.a(str4) + "." + wm5Var.c);
                        nm7.f(i3).k(nm7.R1, str4, file.renameTo(file2) ? file2.toString() : file.toString());
                    }
                }
                while (fn5Var2.E < 2 && !linkedList.isEmpty()) {
                    ((wm5) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    fn5Var2.E++;
                }
            case 5:
                dd6 dd6Var = (dd6) obj2;
                cd6 cd6Var = (cd6) obj;
                try {
                    if (b3 == 2) {
                        dd6Var.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE 1").stepThis().dispose();
                    } else if (b3 == 1) {
                        if (cd6Var != null) {
                            dd6Var.getMessagesStorage().b.executeFast("DELETE FROM sharing_locations WHERE uid = " + cd6Var.a).stepThis().dispose();
                        }
                    } else if (cd6Var != null) {
                        SQLitePreparedStatement executeFast = dd6Var.getMessagesStorage().b.executeFast("REPLACE INTO sharing_locations VALUES(?, ?, ?, ?, ?, ?)");
                        executeFast.requery();
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(cd6Var.h.k.getObjectSize());
                        cd6Var.h.k.serializeToStream(nativeByteBuffer);
                        executeFast.bindLong(1, cd6Var.a);
                        executeFast.bindInteger(2, cd6Var.b);
                        executeFast.bindInteger(3, cd6Var.c);
                        executeFast.bindInteger(4, cd6Var.d);
                        executeFast.bindByteBuffer(5, nativeByteBuffer);
                        executeFast.bindInteger(6, cd6Var.f);
                        executeFast.step();
                        executeFast.dispose();
                        nativeByteBuffer.reuse();
                    }
                    break;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 6:
                hs6 hs6Var = (hs6) obj2;
                TL_account.TL_emojiStatuses tL_emojiStatuses = (TL_account.TL_emojiStatuses) obj;
                try {
                    hs6Var.getMessagesStorage().b.executeFast("DELETE FROM emoji_statuses WHERE type = " + ((int) b3)).stepThis().dispose();
                    SQLitePreparedStatement executeFast2 = hs6Var.getMessagesStorage().b.executeFast("INSERT INTO emoji_statuses VALUES(?, ?)");
                    executeFast2.requery();
                    NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(tL_emojiStatuses.getObjectSize());
                    tL_emojiStatuses.serializeToStream(nativeByteBuffer2);
                    executeFast2.bindByteBuffer(1, nativeByteBuffer2);
                    executeFast2.bindInteger(2, b3);
                    executeFast2.step();
                    nativeByteBuffer2.reuse();
                    executeFast2.dispose();
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
                hs6Var.I0[b3] = false;
                break;
            case 7:
                hs6 hs6Var2 = (hs6) obj2;
                TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) obj;
                hs6Var2.U.l(stickerSet.id);
                hs6Var2.c1(this.b, false, true, false, new vq6(hs6Var2, stickerSet, b2));
                break;
            case 8:
                hs6 hs6Var3 = (hs6) obj2;
                TLRPC.Document document3 = (TLRPC.Document) obj;
                if (b3 == 0) {
                    i = 3;
                } else if (b3 == 1) {
                    i = 4;
                } else if (b3 == 5) {
                    i = 7;
                }
                try {
                    hs6Var3.getMessagesStorage().b.executeFast("DELETE FROM web_recent_v3 WHERE id = '" + document3.id + "' AND type = " + i).stepThis().dispose();
                    break;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return;
                }
            case 9:
                Pair pair = (Pair) obj;
                ((b07) obj2).b.i.n(((Integer) pair.first).intValue(), (rz6) pair.second, b3);
                break;
            case 10:
                oc7 oc7Var = (oc7) obj2;
                gp2 gp2Var = (gp2) obj;
                if (gp2Var != null) {
                    gp2Var.a(Integer.valueOf(b3), null);
                }
                oc7Var.getNotificationCenter().k(2, Integer.valueOf(TLObject.FLAG_13));
                break;
            case 11:
                cf7 cf7Var = (cf7) obj2;
                cf7Var.b1((TLRPC.messages_Dialogs) obj, b3);
                try {
                    cf7Var.a.c(new xd7(cf7Var, (byte) 21));
                    break;
                } catch (Exception e4) {
                    cf7Var.n(e4, true);
                    return;
                }
            case 12:
                ArrayList arrayList = (ArrayList) obj;
                er3 downloadController = ((cf7) obj2).getDownloadController();
                HashMap hashMap2 = downloadController.f;
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = b3 == 1 ? downloadController.b : b3 == 2 ? downloadController.c : b3 == 4 ? downloadController.e : downloadController.d;
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        fr3 fr3Var = (fr3) arrayList.get(i4);
                        TLObject tLObject = fr3Var.a;
                        if (tLObject instanceof TLRPC.Document) {
                            str2 = bc4.r(null, (TLRPC.Document) tLObject);
                            photoSize = null;
                        } else if (tLObject instanceof TLRPC.Photo) {
                            TLRPC.PhotoSize w = bc4.w(((TLRPC.Photo) tLObject).sizes, gm.Y0(false), false, null, false);
                            photoSize = w;
                            str2 = bc4.r(null, w);
                        } else {
                            str2 = null;
                            photoSize = null;
                        }
                        if (str2 != null && !hashMap2.containsKey(str2)) {
                            TLObject tLObject2 = fr3Var.a;
                            if (photoSize != null) {
                                downloadController.getFileLoader().V(gn5.i(photoSize, (TLRPC.Photo) tLObject2), fr3Var.f, null, 0, fr3Var.d ? 2 : fr3Var.e ? 1 : 0);
                            } else if (tLObject2 instanceof TLRPC.Document) {
                                downloadController.getFileLoader().X((TLRPC.Document) tLObject2, fr3Var.f, 0, fr3Var.d ? 2 : 0);
                            }
                            arrayList2.add(fr3Var);
                            hashMap2.put(str2, fr3Var);
                            downloadController.h.put(new Pair(Long.valueOf(fr3Var.c), Integer.valueOf(fr3Var.b)), fr3Var);
                        }
                    }
                    break;
                }
                break;
            case 13:
                ((xz7) obj2).x1((xw9) obj, b3);
                break;
            default:
                ll0 ll0Var = (ll0) obj;
                xk9 xk9Var = ((sk9) obj2).a;
                if (xk9Var.E != null) {
                    xk9.c(ll0Var.b, "");
                    ((mg9) xk9Var.E).c(ll0Var, b3);
                    break;
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ob4(Object obj, Object obj2, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }
}
