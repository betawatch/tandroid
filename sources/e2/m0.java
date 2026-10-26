package e2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Pair;
import b2.g1;
import b2.m1;
import di.e4;
import f9.s1;
import fi.g9;
import fi.ia;
import fi.k3;
import fi.l9;
import fi.n1;
import fi.n3;
import fi.n9;
import fi.sb;
import fi.w7;
import fi.y1;
import fi.z1;
import hi.d4;
import hi.e3;
import hi.h3;
import hi.m3;
import ig.a2;
import ig.b2;
import ig.d2;
import ig.j1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import jg.v0;
import m4.t1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.vh;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.web.a1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class m0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ m0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v14, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v10, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r3v24, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13, types: [android.util.Pair] */
    /* JADX WARN: Type inference failed for: r9v8, types: [android.graphics.Bitmap] */
    @Override // java.lang.Runnable
    public final void run() {
        int[] iArr;
        File file;
        int i10;
        int i11;
        boolean contains;
        ArrayList arrayList;
        int[] iArr2 = null;
        int i12 = 1;
        switch (this.a) {
            case 0:
                k9.e0 e0Var = (k9.e0) this.b;
                k2.e0 e0Var2 = (k2.e0) this.c;
                t1 t1Var = (t1) this.d;
                try {
                    if (e0Var.a instanceof k9.a) {
                        break;
                    } else {
                        e0Var2.run();
                        e0Var.m(t1Var);
                        break;
                    }
                } catch (Throwable th2) {
                    e0Var.n(th2);
                    return;
                }
            case 1:
                y1 y1Var = (y1) this.b;
                String str = (String) this.c;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList2 = y1Var.v;
                z1 z1Var = y1Var.N;
                ArrayList arrayList3 = y1Var.s;
                if (TextUtils.equals(str, y1Var.H)) {
                    y1Var.x = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    y1Var.y.clear();
                    y1Var.n.clear();
                    y1Var.x++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList3.addAll(tL_messages_stickers.stickers);
                        y1Var.x = tL_messages_stickers.stickers.size() + y1Var.x;
                    }
                    y1Var.I = y1Var.H;
                    y1Var.l();
                    n1.C1(z1Var.b, 0, 0);
                    z1Var.f.c(false);
                    z1Var.e.n(false);
                    break;
                }
                break;
            case 2:
                k3 k3Var = (k3) this.b;
                Object obj = this.c;
                String str2 = (String) this.d;
                float f7 = k3Var.K;
                if (obj != null) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        k3Var.c(photoEntry, options);
                        w7.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        ?? c10 = k3Var.c(photoEntry, options);
                        if (c10 != 0 && c10.getHeight() / c10.getWidth() < f7) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c10.isRecycled()) {
                                iArr2 = fi.n0.b(c10, true);
                                photoEntry.gradientTopColor = iArr2[0];
                                photoEntry.gradientBottomColor = iArr2[1];
                            } else {
                                int i13 = photoEntry.gradientTopColor;
                                if (i13 != 0 && (i10 = photoEntry.gradientBottomColor) != 0) {
                                    iArr2 = new int[]{i13, i10};
                                }
                            }
                        }
                        iArr = iArr2;
                        iArr2 = c10;
                    } else if (!(obj instanceof w7) || (file = ((w7) obj).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        w7.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        iArr2 = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    iArr2 = new Pair(iArr2, iArr);
                }
                AndroidUtilities.runOnUIThread(new m0(k3Var, str2, iArr2, 3));
                break;
            case 3:
                k3 k3Var2 = (k3) this.b;
                String str3 = (String) this.c;
                Pair pair = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr3 = (int[]) pair.second;
                ?? r32 = k3Var2.d;
                if (bitmap != null) {
                    if (str3 != null) {
                        k3.f0.put(str3, bitmap);
                        HashMap hashMap = k3.e0;
                        Integer num = (Integer) hashMap.get(str3);
                        if (num != null) {
                            hashMap.put(str3, Integer.valueOf(num.intValue() + 1));
                        } else {
                            hashMap.put(str3, 1);
                        }
                    }
                    if (TextUtils.equals(str3, k3Var2.R)) {
                        k3Var2.a = bitmap;
                        if (iArr3 == null) {
                            r32.setShader(null);
                            k3Var2.e = null;
                        } else {
                            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                            k3Var2.e = linearGradient;
                            r32.setShader(linearGradient);
                        }
                        k3Var2.h();
                        k3Var2.invalidate();
                        break;
                    } else {
                        k3.d(str3);
                        break;
                    }
                }
                break;
            case 4:
                n3 n3Var = (n3) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                n3Var.r = true;
                n3Var.d = false;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(n3Var.w.a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    n3Var.E();
                    break;
                }
                break;
            case 5:
                String[] strArr = (String[]) this.b;
                int[][] iArr4 = (int[][]) this.c;
                ai.e0 e0Var3 = (ai.e0) this.d;
                for (int i14 = 0; i14 < strArr.length; i14++) {
                    String str4 = strArr[i14];
                    if (str4 != null) {
                        AnimatedFileNative.d(str4, iArr4[i14], 0L);
                    }
                }
                AndroidUtilities.runOnUIThread(e0Var3);
                break;
            case 6:
                String str5 = (String) this.b;
                int[][] iArr5 = (int[][]) this.c;
                ai.e0 e0Var4 = (ai.e0) this.d;
                AnimatedFileNative.d(str5, iArr5[0], 0L);
                AndroidUtilities.runOnUIThread(e0Var4);
                break;
            case 7:
                g9 g9Var = (g9) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                MessagesController messagesController2 = (MessagesController) this.d;
                n9 n9Var = g9Var.W;
                g9Var.v.setLoading(false);
                if (tLObject3 != null) {
                    int i15 = n9.d0;
                    ArrayList i16 = n9Var.i1();
                    for (int i17 = 0; i17 < i16.size(); i17++) {
                        TLRPC.User user = (TLRPC.User) i16.get(i17);
                        if (user != null && (contains = g9Var.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            user.flags2 = contains ? user.flags2 | 4 : user.flags2 & (-5);
                            messagesController2.putUser(user, false);
                        }
                    }
                }
                n9Var.g1();
                if (n9Var.Z) {
                    i11 = ((org.telegram.ui.ActionBar.k3) n9Var).currentAccount;
                    n9Var.h1(new l9(1, i11, (ArrayList) null), new e4(n9Var, i12), false);
                    break;
                } else {
                    n9Var.g1();
                    n9Var.b.E(0);
                    break;
                }
                break;
            case 8:
                sb sbVar = (sb) this.b;
                ((w7) this.c).O0 = (File) this.d;
                ia iaVar = sbVar.d1;
                if (iaVar != null) {
                    iaVar.b.g3.O(false);
                    break;
                }
                break;
            case 9:
                sb sbVar2 = (sb) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Runnable runnable = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), sbVar2.B0.getMatrix(), true);
                        bitmap2.recycle();
                        ?? createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 80, (int) (createBitmap.getHeight() / (createBitmap.getWidth() / 80.0f)), true);
                        if (createScaledBitmap != null) {
                            if (createScaledBitmap != createBitmap) {
                                createBitmap.recycle();
                            }
                            Utilities.blurBitmap(createScaledBitmap, 7);
                            FileOutputStream fileOutputStream = new FileOutputStream(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg"));
                            createScaledBitmap.compress(Bitmap.CompressFormat.JPEG, 87, fileOutputStream);
                            createScaledBitmap.recycle();
                            fileOutputStream.close();
                        }
                    } catch (Throwable unused) {
                    }
                }
                AndroidUtilities.runOnUIThread(runnable);
                break;
            case 10:
                ArrayList arrayList4 = (ArrayList) this.b;
                HashMap hashMap2 = (HashMap) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                ArrayList arrayList5 = new ArrayList();
                for (int i18 = 0; i18 < arrayList4.size(); i18++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList4.get(i18);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.id));
                    boolean z10 = bool == null || !bool.booleanValue();
                    hi.x xVar = new hi.x();
                    xVar.a = user2;
                    xVar.b = z10;
                    arrayList5.add(xVar);
                }
                callback.run(arrayList5);
                break;
            case 11:
                boolean[] zArr = (boolean[]) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                hi.y1 y1Var2 = (hi.y1) this.d;
                zArr[0] = false;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    y1Var2.run(Boolean.TRUE);
                    break;
                }
                break;
            case 12:
                h3 h3Var = (h3) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                m3 m3Var = h3Var.d;
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    e3 e3Var = m3Var.y;
                    e3Var.getClass();
                    e3Var.y("emoji_status_access_requested", a1.A("cancelled", "status"));
                    break;
                } else {
                    new wc(m3Var.q0, m3Var.F).Z(tL_error).k(true);
                    break;
                }
            case 13:
                d4 d4Var = (d4) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                wc.b0(d4Var).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, hi.k.F0(connectedbotstarref.commission_permille), UserObject.getUserName(user3))), R.raw.copy).j();
                break;
            case 14:
                d4.z0((d4) this.b, (TLObject) this.c, (e2) this.d);
                break;
            case 15:
                i2.a1 a1Var = (i2.a1) this.b;
                f9.f0 f0Var = (f9.f0) this.c;
                u2.g0 g0Var = (u2.g0) this.d;
                j2.e eVar = a1Var.c;
                s1 f10 = f0Var.f();
                aa.m0 m0Var = eVar.d;
                g1 g1Var = eVar.h;
                g1Var.getClass();
                m0Var.getClass();
                m0Var.b = f9.i0.u(f10);
                if (!f10.isEmpty()) {
                    m0Var.e = (u2.g0) f10.get(0);
                    g0Var.getClass();
                    m0Var.f = g0Var;
                }
                if (((u2.g0) m0Var.d) == null) {
                    m0Var.d = aa.m0.n(g1Var, (f9.i0) m0Var.b, (u2.g0) m0Var.e, (m1) m0Var.a);
                }
                m0Var.D(g1Var.y0());
                break;
            case 16:
                i2.g1 g1Var2 = (i2.g1) this.b;
                Pair pair2 = (Pair) this.c;
                g1Var2.b.h.k(((Integer) pair2.first).intValue(), (u2.g0) pair2.second, (pa.d) this.d);
                break;
            case 17:
                i2.g1 g1Var3 = (i2.g1) this.b;
                Pair pair3 = (Pair) this.c;
                g1Var3.b.h.b(((Integer) pair3.first).intValue(), (u2.g0) pair3.second, (Exception) this.d);
                break;
            case 18:
                ((ig.g0) this.b).a((a0.h) this.d, (ArrayList) this.c);
                break;
            case 19:
                ig.i0 i0Var = (ig.i0) this.b;
                HashSet hashSet = (HashSet) this.c;
                ig.t tVar = (ig.t) this.d;
                int i19 = i0Var.s0;
                MessagesController messagesController3 = MessagesController.getInstance(i19);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Pair pair4 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair4.first).booleanValue();
                    Long l4 = (Long) pair4.second;
                    (booleanValue ? messagesController3.dialogs_read_outbox_max : messagesController3.dialogs_read_inbox_max).put(l4, Integer.valueOf(MessagesStorage.getInstance(i19).getDialogReadMaxSync(booleanValue, l4.longValue())));
                }
                AndroidUtilities.runOnUIThread(tVar);
                break;
            case 20:
                j1 j1Var = (j1) this.b;
                String str6 = (String) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                j1Var.E0 = 0;
                if (str6.equals(j1Var.D0) && (tLObject6 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject6;
                    ArrayList arrayList6 = j1Var.A0;
                    int size = arrayList6 != null ? arrayList6.size() : 0;
                    j1Var.F("sticker_search_".concat(str6), tL_messages_stickers2.stickers);
                    ArrayList arrayList7 = j1Var.A0;
                    int size2 = arrayList7 != null ? arrayList7.size() : 0;
                    if (!j1Var.o0 && (arrayList = j1Var.A0) != null && !arrayList.isEmpty()) {
                        j1Var.H();
                        j1Var.V.a(j1Var.K() > 0);
                        j1Var.o0 = true;
                    }
                    if (size != size2) {
                        j1Var.l();
                        break;
                    }
                }
                break;
            case 21:
                j1 j1Var2 = (j1) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                a0.h hVar = (a0.h) this.d;
                j1Var2.p0 = null;
                j1Var2.Y(hVar, arrayList8, true);
                break;
            case 22:
                a2 a2Var = (a2) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                HashMap hashMap3 = (HashMap) this.d;
                a2Var.q = arrayList9;
                a2Var.r = hashMap3;
                a2Var.s = true;
                a2Var.a.p0(arrayList9);
                break;
            case 23:
                b2 b2Var = (b2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str7 = tL_messages_searchStickerSets.q;
                d2 d2Var = b2Var.a;
                String str8 = d2Var.R;
                d61 d61Var = d2Var.e;
                if (str7.equals(str8)) {
                    b2Var.a();
                    d61Var.b.h.getProgressDrawable().e = false;
                    d2Var.N = 0;
                    d61Var.b(true);
                    d2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    d2Var.l();
                    break;
                }
                break;
            case 24:
                jg.c cVar = (jg.c) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error2 != null) {
                    cVar.a.b(false);
                    wc.e0(tL_error2);
                    break;
                } else if (tLObject7 instanceof TLRPC.TL_boolFalse) {
                    cVar.a.b(false);
                    vh.n(R.string.UnknownError, wc.b0(cVar), null);
                    break;
                } else {
                    cVar.finishFragment();
                    break;
                }
            case 25:
                jg.n nVar = (jg.n) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                if (tL_error3 != null) {
                    nVar.f.b(false);
                    wc.e0(tL_error3);
                    break;
                } else if (tLObject8 instanceof TLRPC.TL_boolFalse) {
                    nVar.f.b(false);
                    vh.n(R.string.UnknownError, wc.b0(nVar), null);
                    break;
                } else {
                    if (nVar.E != null) {
                        nVar.getMessagesController().loadFullUser(nVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    nVar.finishFragment();
                    break;
                }
            case 26:
                jg.z zVar = (jg.z) this.b;
                TLObject tLObject9 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList10 = zVar.b;
                if (tLObject9 instanceof TLRPC.TL_boolTrue) {
                    if (arrayList10.contains(tL_businessChatLink)) {
                        arrayList10.remove(tL_businessChatLink);
                        NotificationCenter.getInstance(zVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                    }
                    zVar.f();
                    break;
                } else {
                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                    break;
                }
            case 27:
                jg.z zVar2 = (jg.z) this.b;
                String str9 = (String) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) this.d;
                TL_account.deleteBusinessChatLink deletebusinesschatlink = new TL_account.deleteBusinessChatLink();
                deletebusinesschatlink.slug = str9;
                ConnectionsManager.getInstance(zVar2.a).sendRequest(deletebusinesschatlink, new bi.j(21, zVar2, tL_businessChatLink2));
                break;
            case 28:
                jg.k0.P((jg.k0) this.b, (TL_account.TL_connectedBot) this.c, (TL_account.TL_businessBotRecipients) this.d);
                break;
            default:
                v0 v0Var = (v0) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject10 = (TLObject) this.d;
                if (tL_error4 != null) {
                    v0Var.a.b(false);
                    wc.e0(tL_error4);
                    break;
                } else if (tLObject10 instanceof TLRPC.TL_boolFalse) {
                    v0Var.a.b(false);
                    vh.n(R.string.UnknownError, wc.b0(v0Var), null);
                    break;
                } else {
                    v0Var.finishFragment();
                    break;
                }
        }
    }
}
