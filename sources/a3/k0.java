package a3;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import androidx.car.app.IOnDoneCallback;
import bi.ce;
import bi.j4;
import bi.kb;
import bi.o4;
import bi.oc;
import bi.p2;
import bi.pb;
import bi.q2;
import bi.r0;
import bi.r9;
import bi.ra;
import bi.rb;
import bi.w1;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.e3;
import di.h4;
import di.i3;
import di.n3;
import di.y1;
import fg.f2;
import fg.h2;
import fg.l1;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import m4.r1;
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
import org.telegram.messenger.a2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.wc;
import org.telegram.ui.web.c1;
import v7.o8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ k0(Object obj, Object obj2, Object obj3, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v24, types: [android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r3v16, types: [android.graphics.Paint] */
    /* JADX WARN: Type inference failed for: r3v30, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v21, types: [android.util.Pair] */
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
        boolean z10 = true;
        int i12 = 0;
        switch (this.a) {
            case 0:
                of.b bVar = (of.b) this.b;
                b2.s sVar = (b2.s) this.c;
                i2.h hVar = (i2.h) this.d;
                l0 l0Var = (l0) bVar.c;
                String str = e2.d0.a;
                i2.e0 e0Var = ((i2.b0) l0Var).a;
                e0Var.Q = sVar;
                j2.e eVar = e0Var.s;
                j2.a p5 = eVar.p();
                eVar.q(p5, 1017, new j2.d(p5, sVar, hVar, 9));
                return;
            case 1:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                androidx.car.app.utils.c cVar = (androidx.car.app.utils.c) this.c;
                String str2 = (String) this.d;
                if (oVar != null) {
                    try {
                        if (((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) < 0) {
                            z10 = false;
                        }
                        if (z10) {
                            cVar.a();
                            return;
                        }
                    } catch (w.g e) {
                        Log.e("CarApp.Dispatch", "Serialization failure in ".concat(str2), e);
                        return;
                    }
                }
                Log.w("CarApp.Dispatch", "Lifecycle is not at least created when dispatching " + cVar);
                return;
            case 2:
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.b;
                String str3 = (String) this.c;
                try {
                    androidx.car.app.utils.i.d(str3.concat(" onSuccess"), new androidx.car.app.utils.a(iOnDoneCallback, ((androidx.car.app.utils.c) this.d).a(), str3, i12));
                    return;
                } catch (RuntimeException e7) {
                    androidx.car.app.utils.i.f(iOnDoneCallback, str3, e7);
                    throw new RuntimeException(e7);
                } catch (w.g e10) {
                    androidx.car.app.utils.i.f(iOnDoneCallback, str3, e10);
                    return;
                }
            case 3:
                androidx.biometric.s sVar2 = (androidx.biometric.s) this.b;
                v7.w wVar = (v7.w) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    androidx.emoji2.text.r a2 = v7.v.a(sVar2.a);
                    if (a2 == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    androidx.emoji2.text.q qVar = (androidx.emoji2.text.q) ((androidx.emoji2.text.k) a2.b);
                    synchronized (qVar.d) {
                        qVar.f = threadPoolExecutor;
                    }
                    ((androidx.emoji2.text.k) a2.b).a(new androidx.emoji2.text.m(wVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    wVar.a(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 4:
                p2 p2Var = (p2) this.b;
                String str4 = (String) this.c;
                TLObject tLObject = (TLObject) this.d;
                ArrayList arrayList2 = p2Var.v;
                q2 q2Var = p2Var.N;
                ArrayList arrayList3 = p2Var.s;
                if (TextUtils.equals(str4, p2Var.H)) {
                    p2Var.x = 0;
                    arrayList3.clear();
                    arrayList2.clear();
                    p2Var.y.clear();
                    p2Var.n.clear();
                    p2Var.x++;
                    arrayList3.add(null);
                    arrayList2.add(0L);
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        arrayList3.addAll(tL_messages_stickers.stickers);
                        p2Var.x = tL_messages_stickers.stickers.size() + p2Var.x;
                    }
                    p2Var.I = p2Var.H;
                    p2Var.l();
                    w1.v1(q2Var.b, 0, 0);
                    q2Var.f.c(false);
                    q2Var.e.n(false);
                    return;
                }
                return;
            case 5:
                j4 j4Var = (j4) this.b;
                Object obj = this.c;
                String str5 = (String) this.d;
                float f7 = j4Var.K;
                if (obj != null) {
                    int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
                    if (obj instanceof MediaController.PhotoEntry) {
                        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        j4Var.c(photoEntry, options);
                        r9.C(options, min);
                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options.inDither = true;
                        options.inJustDecodeBounds = false;
                        ?? c10 = j4Var.c(photoEntry, options);
                        if (c10 != 0 && c10.getHeight() / c10.getWidth() < f7) {
                            if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !c10.isRecycled()) {
                                iArr2 = r0.b(c10, true);
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
                    } else if (!(obj instanceof r9) || (file = ((r9) obj).O0) == null) {
                        iArr = null;
                    } else {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(file.getPath(), options2);
                        r9.C(options2, min);
                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                        options2.inDither = true;
                        options2.inJustDecodeBounds = false;
                        iArr2 = BitmapFactory.decodeFile(file.getPath(), options2);
                        iArr = null;
                    }
                    iArr2 = new Pair(iArr2, iArr);
                }
                AndroidUtilities.runOnUIThread(new k0(j4Var, str5, iArr2, 6));
                return;
            case 6:
                j4 j4Var2 = (j4) this.b;
                String str6 = (String) this.c;
                Pair pair = (Pair) this.d;
                Bitmap bitmap = (Bitmap) pair.first;
                int[] iArr3 = (int[]) pair.second;
                ?? r32 = j4Var2.d;
                if (bitmap == null) {
                    return;
                }
                if (str6 != null) {
                    j4.f0.put(str6, bitmap);
                    HashMap hashMap = j4.e0;
                    Integer num = (Integer) hashMap.get(str6);
                    if (num != null) {
                        hashMap.put(str6, Integer.valueOf(num.intValue() + 1));
                    } else {
                        hashMap.put(str6, 1);
                    }
                }
                if (!TextUtils.equals(str6, j4Var2.R)) {
                    j4.d(str6);
                    return;
                }
                j4Var2.a = bitmap;
                if (iArr3 == null) {
                    r32.setShader(null);
                    j4Var2.e = null;
                } else {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr3, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    j4Var2.e = linearGradient;
                    r32.setShader(linearGradient);
                }
                j4Var2.h();
                j4Var2.invalidate();
                return;
            case 7:
                o4 o4Var = (o4) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                MessagesController messagesController = (MessagesController) this.d;
                o4Var.r = true;
                o4Var.d = false;
                if (tLObject2 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject2;
                    messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                    messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                    MessagesStorage.getInstance(o4Var.w.a).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                    o4Var.E();
                    return;
                }
                return;
            case 8:
                String[] strArr = (String[]) this.b;
                int[][] iArr4 = (int[][]) this.c;
                androidx.car.app.utils.b bVar2 = (androidx.car.app.utils.b) this.d;
                while (i12 < strArr.length) {
                    String str7 = strArr[i12];
                    if (str7 != null) {
                        AnimatedFileNative.d(str7, iArr4[i12], 0L);
                    }
                    i12++;
                }
                AndroidUtilities.runOnUIThread(bVar2);
                return;
            case 9:
                String str8 = (String) this.b;
                int[][] iArr5 = (int[][]) this.c;
                androidx.car.app.utils.b bVar3 = (androidx.car.app.utils.b) this.d;
                AnimatedFileNative.d(str8, iArr5[0], 0L);
                AndroidUtilities.runOnUIThread(bVar3);
                return;
            case 10:
                kb kbVar = (kb) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                MessagesController messagesController2 = (MessagesController) this.d;
                rb rbVar = kbVar.W;
                kbVar.v.setLoading(false);
                if (tLObject3 != null) {
                    int i14 = rb.d0;
                    ArrayList h12 = rbVar.h1();
                    for (int i15 = 0; i15 < h12.size(); i15++) {
                        TLRPC.User user = (TLRPC.User) h12.get(i15);
                        if (user != null && (contains = kbVar.c.contains(Long.valueOf(user.id))) != user.close_friend) {
                            user.close_friend = contains;
                            user.flags2 = contains ? user.flags2 | 4 : user.flags2 & (-5);
                            messagesController2.putUser(user, false);
                        }
                    }
                }
                rbVar.f1();
                if (rbVar.Z) {
                    i11 = ((h3) rbVar).currentAccount;
                    rbVar.g1(new pb(1, i11, (ArrayList) null), new ra(rbVar, i12), false);
                    return;
                } else {
                    rbVar.f1();
                    rbVar.b.D(0);
                    return;
                }
            case 11:
                ce ceVar = (ce) this.b;
                ((r9) this.c).O0 = (File) this.d;
                oc ocVar = ceVar.d1;
                if (ocVar != null) {
                    ocVar.b.Y2.N(false);
                    return;
                }
                return;
            case 12:
                ce ceVar2 = (ce) this.b;
                Bitmap bitmap2 = (Bitmap) this.c;
                Runnable runnable = (Runnable) this.d;
                if (bitmap2 != null) {
                    try {
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), ceVar2.B0.getMatrix(), true);
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
                return;
            case 13:
                com.google.firebase.messaging.g gVar = (com.google.firebase.messaging.g) this.b;
                Intent intent = (Intent) this.c;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.d;
                gVar.getClass();
                try {
                    gVar.handleIntent(intent);
                    return;
                } finally {
                    taskCompletionSource.setResult(null);
                }
            case 14:
                ArrayList arrayList4 = (ArrayList) this.b;
                HashMap hashMap2 = (HashMap) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                ArrayList arrayList5 = new ArrayList();
                for (int i16 = 0; i16 < arrayList4.size(); i16++) {
                    TLRPC.User user2 = (TLRPC.User) arrayList4.get(i16);
                    Boolean bool = (Boolean) hashMap2.get(Long.valueOf(user2.id));
                    boolean z11 = bool == null || !bool.booleanValue();
                    di.t tVar = new di.t();
                    tVar.a = user2;
                    tVar.b = z11;
                    arrayList5.add(tVar);
                }
                callback.run(arrayList5);
                return;
            case 15:
                boolean[] zArr = (boolean[]) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                y1 y1Var = (y1) this.d;
                zArr[0] = false;
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    y1Var.run(Boolean.TRUE);
                    return;
                }
                return;
            case 16:
                i3 i3Var = (i3) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                n3 n3Var = i3Var.d;
                if (!(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                    new wc(n3Var.p0, n3Var.E).Y(tL_error).k(true);
                    return;
                }
                e3 e3Var = n3Var.x;
                e3Var.getClass();
                e3Var.y("emoji_status_access_requested", c1.B("cancelled", "status"));
                return;
            case 17:
                h4 h4Var = (h4) this.b;
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.c;
                TLRPC.User user3 = (TLRPC.User) this.d;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                wc.a0(h4Var).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, di.m.G0(connectedbotstarref.commission_permille), UserObject.getUserName(user3))), R.raw.copy).j();
                return;
            case 18:
                h4.A0((h4) this.b, (TLObject) this.c, (d2) this.d);
                return;
            case 19:
                i9.w wVar2 = (i9.w) this.b;
                i9.c0 c0Var = (i9.c0) this.c;
                try {
                    try {
                        c0Var.o(((i9.p) this.d).apply(o8.a(wVar2)));
                        return;
                    } catch (Throwable th3) {
                        c0Var.n(th3);
                        return;
                    }
                } catch (Error e11) {
                    e = e11;
                    c0Var.n(e);
                    return;
                } catch (CancellationException unused2) {
                    c0Var.cancel(false);
                    return;
                } catch (RuntimeException e12) {
                    e = e12;
                    c0Var.n(e);
                    return;
                } catch (ExecutionException e13) {
                    e = e13;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    c0Var.n(e);
                    return;
                }
            case 20:
                i9.c0 c0Var2 = (i9.c0) this.b;
                m4.w wVar3 = (m4.w) this.c;
                r1 r1Var = (r1) this.d;
                try {
                    if (c0Var2.a instanceof i9.a) {
                        return;
                    }
                    wVar3.run();
                    c0Var2.m(r1Var);
                    return;
                } catch (Throwable th4) {
                    c0Var2.n(th4);
                    return;
                }
            case 21:
                fg.h0 h0Var = (fg.h0) this.b;
                HashSet hashSet = (HashSet) this.c;
                fg.s sVar3 = (fg.s) this.d;
                int i17 = h0Var.s0;
                MessagesController messagesController3 = MessagesController.getInstance(i17);
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    Pair pair2 = (Pair) it.next();
                    boolean booleanValue = ((Boolean) pair2.first).booleanValue();
                    Long l4 = (Long) pair2.second;
                    (booleanValue ? messagesController3.dialogs_read_outbox_max : messagesController3.dialogs_read_inbox_max).put(l4, Integer.valueOf(MessagesStorage.getInstance(i17).getDialogReadMaxSync(booleanValue, l4.longValue())));
                }
                AndroidUtilities.runOnUIThread(sVar3);
                return;
            case 22:
                ((fg.f0) this.b).a((a0.i) this.d, (ArrayList) this.c);
                return;
            case 23:
                l1 l1Var = (l1) this.b;
                String str9 = (String) this.c;
                TLObject tLObject6 = (TLObject) this.d;
                l1Var.E0 = 0;
                if (str9.equals(l1Var.D0) && (tLObject6 instanceof TLRPC.TL_messages_stickers)) {
                    TLRPC.TL_messages_stickers tL_messages_stickers2 = (TLRPC.TL_messages_stickers) tLObject6;
                    ArrayList arrayList6 = l1Var.A0;
                    int size = arrayList6 != null ? arrayList6.size() : 0;
                    l1Var.F("sticker_search_".concat(str9), tL_messages_stickers2.stickers);
                    ArrayList arrayList7 = l1Var.A0;
                    int size2 = arrayList7 != null ? arrayList7.size() : 0;
                    if (!l1Var.o0 && (arrayList = l1Var.A0) != null && !arrayList.isEmpty()) {
                        l1Var.H();
                        l1Var.V.a(l1Var.K() > 0);
                        l1Var.o0 = true;
                    }
                    if (size != size2) {
                        l1Var.l();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                l1 l1Var2 = (l1) this.b;
                ArrayList arrayList8 = (ArrayList) this.c;
                a0.i iVar = (a0.i) this.d;
                l1Var2.p0 = null;
                l1Var2.Y(iVar, arrayList8, true);
                return;
            case 25:
                fg.d2 d2Var = (fg.d2) this.b;
                ArrayList arrayList9 = (ArrayList) this.c;
                HashMap hashMap3 = (HashMap) this.d;
                d2Var.q = arrayList9;
                d2Var.r = hashMap3;
                d2Var.s = true;
                d2Var.a.k0(arrayList9);
                return;
            case 26:
                f2 f2Var = (f2) this.b;
                TLRPC.TL_messages_searchStickerSets tL_messages_searchStickerSets = (TLRPC.TL_messages_searchStickerSets) this.c;
                TLRPC.TL_messages_foundStickerSets tL_messages_foundStickerSets = (TLRPC.TL_messages_foundStickerSets) this.d;
                String str10 = tL_messages_searchStickerSets.q;
                h2 h2Var = f2Var.a;
                String str11 = h2Var.R;
                f51 f51Var = h2Var.e;
                if (str10.equals(str11)) {
                    f2Var.a();
                    f51Var.b.h.getProgressDrawable().e = false;
                    h2Var.N = 0;
                    f51Var.b(true);
                    h2Var.E.addAll(tL_messages_foundStickerSets.sets);
                    h2Var.l();
                    return;
                }
                return;
            case 27:
                gg.c cVar2 = (gg.c) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                if (tL_error2 != null) {
                    cVar2.a.a(0.0f);
                    wc.b0(tL_error2);
                    return;
                } else if (!(tLObject7 instanceof TLRPC.TL_boolFalse)) {
                    cVar2.finishFragment();
                    return;
                } else {
                    cVar2.a.a(0.0f);
                    a2.p(R.string.UnknownError, wc.a0(cVar2), null);
                    return;
                }
            case 28:
                gg.n nVar = (gg.n) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject8 = (TLObject) this.d;
                if (tL_error3 != null) {
                    nVar.e.a(0.0f);
                    wc.b0(tL_error3);
                    return;
                } else if (tLObject8 instanceof TLRPC.TL_boolFalse) {
                    nVar.e.a(0.0f);
                    a2.p(R.string.UnknownError, wc.a0(nVar), null);
                    return;
                } else {
                    if (nVar.E != null) {
                        nVar.getMessagesController().loadFullUser(nVar.getUserConfig().getCurrentUser(), 0, true);
                    }
                    nVar.finishFragment();
                    return;
                }
            default:
                gg.b0 b0Var = (gg.b0) this.b;
                TLObject tLObject9 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                ArrayList arrayList10 = b0Var.b;
                if (!(tLObject9 instanceof TLRPC.TL_boolTrue)) {
                    FileLog.e(new RuntimeException("Unexpected response from server!"));
                    return;
                }
                if (arrayList10.contains(tL_businessChatLink)) {
                    arrayList10.remove(tL_businessChatLink);
                    NotificationCenter.getInstance(b0Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                }
                b0Var.f();
                return;
        }
    }
}
