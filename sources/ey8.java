// default package

import android.app.Activity;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ey8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ey8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:173|174|175|(3:222|223|(10:225|226|(2:217|218)|179|(1:181)|182|183|184|(1:(1:187))(7:189|190|191|192|193|194|195)|188))|177|(0)|179|(0)|182|183|184|(0)(0)|188) */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x0407, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x0408, code lost:
    
        fc4.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0412  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0373 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:424:0x07b3  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        hx8 hx8Var;
        TLRPC.Message message;
        String str;
        String str2;
        InputStream openInputStream;
        Cursor query;
        TLRPC.Document document;
        TLRPC.PhotoSize w;
        TLRPC.Photo photo;
        TLRPC.Document document2;
        TLRPC.Document document3;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        r9 = null;
        r9 = null;
        String str3 = null;
        r9 = null;
        SQLitePreparedStatement sQLitePreparedStatement2 = null;
        ArrayList arrayList = null;
        sQLitePreparedStatement = null;
        char c = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                final iy8 iy8Var = (iy8) this.b;
                zx8 zx8Var = (zx8) this.c;
                if (zx8.d(iy8Var.getParentActivity())) {
                    zx8Var.e();
                    pb pbVar = new pb((byte) 9);
                    final Object[] objArr3 = objArr == true ? 1 : 0;
                    qac qacVar = new qac() { // from class: cy8
                        @Override // qac
                        public final void a(Object obj) {
                            byte b = objArr3;
                            iy8 iy8Var2 = iy8Var;
                            switch (b) {
                                case 0:
                                    String str4 = (String) obj;
                                    if (iy8Var2.getParentActivity() != null) {
                                        l11.u(iy8Var2.getParentActivity(), str4);
                                        break;
                                    }
                                    break;
                                default:
                                    wy8 wy8Var = iy8Var2.d;
                                    if (wy8Var != null && !iy8Var2.isFinished) {
                                        wy8Var.d1(R.drawable.msg_download, jb6.M0(2131746204, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    j68 j68Var = new j68(10, false, false, null);
                    j68Var.H = (byte) 1;
                    j68Var.I = false;
                    j68Var.y = false;
                    j68Var.W = new in3((Object) pbVar, (Object) iy8Var, (Object) qacVar, (byte) 25);
                    iy8Var.presentFragment(j68Var);
                    return;
                }
                return;
            case 1:
                final iy8 iy8Var2 = (iy8) this.b;
                File file = (File) this.c;
                Activity parentActivity = iy8Var2.getParentActivity();
                if (parentActivity != null) {
                    String absolutePath = file.getAbsolutePath();
                    String name = file.getName();
                    final char c2 = c == true ? 1 : 0;
                    MediaController.d0(absolutePath, parentActivity, 0, name, "image/png", new qac() { // from class: cy8
                        @Override // qac
                        public final void a(Object obj) {
                            byte b = c2;
                            iy8 iy8Var22 = iy8Var2;
                            switch (b) {
                                case 0:
                                    String str4 = (String) obj;
                                    if (iy8Var22.getParentActivity() != null) {
                                        l11.u(iy8Var22.getParentActivity(), str4);
                                        break;
                                    }
                                    break;
                                default:
                                    wy8 wy8Var = iy8Var22.d;
                                    if (wy8Var != null && !iy8Var22.isFinished) {
                                        wy8Var.d1(R.drawable.msg_download, jb6.M0(2131746204, null), null);
                                        break;
                                    }
                                    break;
                            }
                        }
                    });
                    return;
                }
                return;
            case 2:
                wy8 wy8Var = (wy8) this.b;
                hx8 hx8Var2 = (hx8) this.c;
                ix8 ix8Var = wy8Var.t0;
                if (ix8Var.q == 2 && ix8Var.o < 1.0f) {
                    ix8Var.m = hx8Var2;
                    wy8Var.invalidate();
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                wy8Var.q2 = wy8.j(wy8Var.o2, 0.03f, 0.005f);
                wy8Var.o2 = currentAnimationTimeMillis;
                hx8 hx8Var3 = ix8Var.m;
                if (hx8Var3 == null) {
                    ix8Var.m = hx8Var2;
                    ix8Var.n = null;
                    ix8Var.o = 1.0f;
                    return;
                }
                int i = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                if (ix8Var.o < 1.0f && (hx8Var = ix8Var.n) != null) {
                    hx8Var3 = hx8Var;
                }
                ix8Var.n = hx8Var3;
                ix8Var.m = hx8Var2;
                ix8Var.o = 0.0f;
                ix8Var.q = i;
                ix8Var.p = System.currentTimeMillis();
                boolean[] zArr = ix8Var.s;
                if (zArr != null) {
                    int length = zArr.length;
                    int i2 = ix8Var.n.e;
                    if (length >= i2 * i2) {
                        Arrays.fill(zArr, false);
                        ix8Var.G = i == 1;
                        return;
                    }
                }
                int i3 = ix8Var.n.e;
                ix8Var.s = new boolean[i3 * i3];
                ix8Var.G = i == 1;
                return;
            case 3:
                ((qac) this.b).a((hx8) this.c);
                return;
            case 4:
                cf7 cf7Var = (cf7) this.b;
                oz8 oz8Var = (oz8) this.c;
                try {
                    try {
                        sQLitePreparedStatement = cf7Var.b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, oz8Var.a);
                        sQLitePreparedStatement.bindString(2, oz8Var.b);
                        sQLitePreparedStatement.bindInteger(3, oz8Var.c);
                        sQLitePreparedStatement.bindInteger(4, oz8Var.f);
                        sQLitePreparedStatement.step();
                    } catch (Throwable th) {
                        if (sQLitePreparedStatement != null) {
                            sQLitePreparedStatement.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                    if (sQLitePreparedStatement == null) {
                        return;
                    }
                }
                sQLitePreparedStatement.dispose();
                return;
            case 5:
                pz8 pz8Var = (pz8) this.b;
                TLObject tLObject = (TLObject) this.c;
                ArrayList arrayList2 = pz8Var.b;
                int i4 = pz8Var.a;
                if (tLObject instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject;
                    oc7.r1(i4).d4(tL_messages_quickReplies.users, false);
                    oc7.r1(i4).X3(tL_messages_quickReplies.chats, false);
                    cf7.Y(i4).j1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i5 = 0; i5 < tL_messages_quickReplies.quick_replies.size(); i5++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i5);
                        oz8 oz8Var2 = new oz8();
                        oz8Var2.a = tL_quickReply.shortcut_id;
                        oz8Var2.b = tL_quickReply.shortcut;
                        oz8Var2.f = tL_quickReply.count;
                        oz8Var2.d = tL_quickReply.top_message;
                        oz8Var2.c = i5;
                        int i6 = 0;
                        while (true) {
                            if (i6 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i6);
                                if (message.id != tL_quickReply.top_message) {
                                    i6++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            k47 k47Var = new k47(i4, message, false, true);
                            oz8Var2.e = k47Var;
                            k47Var.r0(false);
                            oz8Var2.e.l(tL_quickReply.shortcut_id, tL_quickReply.shortcut);
                        }
                        arrayList3.add(oz8Var2);
                    }
                    arrayList = arrayList3;
                }
                pz8Var.e = false;
                if (arrayList != null) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
                pz8Var.f = true;
                pz8Var.l();
                nm7.f(i4).k(nm7.F1, new Object[0]);
                return;
            case 6:
                pz8 pz8Var2 = (pz8) this.b;
                cf7 cf7Var2 = (cf7) this.c;
                ArrayList arrayList4 = pz8Var2.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = cf7Var2.b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement2 = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        for (int i7 = 0; i7 < arrayList4.size(); i7++) {
                            oz8 oz8Var3 = (oz8) arrayList4.get(i7);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, oz8Var3.a);
                            sQLitePreparedStatement2.bindString(2, oz8Var3.b);
                            sQLitePreparedStatement2.bindInteger(3, oz8Var3.c);
                            sQLitePreparedStatement2.bindInteger(4, oz8Var3.f);
                            sQLitePreparedStatement2.step();
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Exception e2) {
                        fc4.g(e2, true);
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement2.dispose();
                    return;
                } catch (Throwable th2) {
                    if (sQLitePreparedStatement2 != null) {
                        sQLitePreparedStatement2.dispose();
                    }
                    throw th2;
                }
            case 7:
                xz8 xz8Var = (xz8) this.b;
                xz8Var.b.add((String) this.c);
                xz8Var.invalidate();
                return;
            case 8:
                RLottieNative rLottieNative = (RLottieNative) this.b;
                RLottieNative rLottieNative2 = (RLottieNative) this.c;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 9:
                p19 p19Var = (p19) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                ArrayList arrayList6 = p19Var.r;
                p19Var.n.addAll(arrayList5);
                int size = arrayList5.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList5.get(i8);
                    i8++;
                    o19 o19Var = (o19) obj;
                    int i9 = 0;
                    while (true) {
                        if (i9 < arrayList6.size()) {
                            TLObject tLObject2 = ((o19) arrayList6.get(i9)).a;
                            long j = tLObject2 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject2).id : tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : 0L;
                            TLObject tLObject3 = o19Var.a;
                            if (j != (tLObject3 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject3).id : tLObject3 instanceof TLRPC.User ? ((TLRPC.User) tLObject3).id : 0L)) {
                                i9++;
                            } else if (o19Var.c > 0) {
                                ((o19) arrayList6.get(i9)).c = o19Var.c;
                            }
                        } else {
                            arrayList6.add(o19Var);
                        }
                    }
                }
                gu2 gu2Var = p19Var.x;
                if (gu2Var != null) {
                    gu2Var.accept(arrayList5);
                }
                p19Var.a();
                return;
            case 10:
                l39 l39Var = (l39) this.b;
                i39 i39Var = (i39) this.c;
                l39Var.getClass();
                ((mk5) l39Var.w).c(i39Var.a, true, 0.0f, 0.0f);
                i39Var.X.c(false);
                l39Var.P = null;
                l39Var.Q = false;
                l39Var.R = null;
                return;
            case 11:
                e99 e99Var = (e99) this.b;
                Runnable runnable = (Runnable) this.c;
                c99 c99Var = e99Var.d;
                if (c99Var == null || !c99Var.f) {
                    return;
                }
                c99Var.a();
                runnable.run();
                return;
            case 12:
                View[] viewArr = (View[]) this.b;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.c;
                ca9 ca9Var = (ca9) viewArr[0];
                ca9Var.b = tL_channels_sponsoredMessageReportResultChooseOption;
                ca9Var.c = null;
                ca9Var.d = null;
                ca9Var.f.g3.O(false);
                return;
            case 13:
                ((ca9) ((View[]) this.b)[0]).b((TLRPC.TL_reportResultAddComment) this.c);
                return;
            case 14:
                View[] viewArr2 = (View[]) this.b;
                TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = (TLRPC.TL_reportResultChooseOption) this.c;
                ca9 ca9Var2 = (ca9) viewArr2[0];
                ca9Var2.b = null;
                ca9Var2.c = tL_reportResultChooseOption;
                ca9Var2.d = null;
                ca9Var2.f.g3.O(false);
                return;
            case 15:
                bo1 bo1Var = (bo1) this.b;
                c41 c41Var = (c41) this.c;
                bo1Var.run();
                c41Var.c(jb6.M0(2131754485, null)).j();
                return;
            case 16:
                d dVar = (d) this.b;
                il9 il9Var = (il9) this.c;
                c41.b0(dVar).c(jb6.M0(2131754485, null)).j();
                gm.c3(il9Var);
                return;
            case 17:
                ha9 ha9Var = (ha9) this.b;
                CountDownLatch countDownLatch = (CountDownLatch) this.c;
                try {
                    i3c.a().d.a(ha9Var.h.a.b(fl8.c), 1);
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 18:
                ((ir) this.b).h((Typeface) this.c);
                return;
            case 19:
                ((a33) this.b).onResult((yu4) this.c);
                return;
            case 20:
                gd9 gd9Var = (gd9) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                gd9Var.b2 = false;
                gd9Var.c2 = 0;
                b61 b61Var = gd9Var.a2;
                b61Var.setLoading(false);
                if (!(tLObject4 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    gm.A3(4.0f, b61Var, null);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject4).result;
                if (richMessage == null) {
                    gm.A3(4.0f, b61Var, null);
                    return;
                }
                gd9Var.d2 = richMessage;
                gd9Var.X1.set(richMessage);
                b61Var.i(jb6.M0(2131754026, null), true, true);
                gd9Var.Y0();
                l7c l7cVar = gd9Var.U1;
                if (l7cVar != null) {
                    l7cVar.O(true);
                    return;
                }
                return;
            case 21:
                ch9 ch9Var = (ch9) this.b;
                Uri uri = (Uri) this.c;
                try {
                    str = gm.S0(uri);
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !aq1.t(str)) {
                    try {
                        query = ch9Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e4) {
                        e = e4;
                        str2 = null;
                        fc4.g(e, true);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = ch9Var.getContext().getContentResolver().openInputStream(uri);
                        if (openInputStream == null) {
                        }
                        str = str3;
                        if (TextUtils.isEmpty(str)) {
                        }
                    }
                    if (query != null) {
                        try {
                            if (query.moveToFirst()) {
                                str2 = query.getString(0);
                                if (query != null) {
                                    try {
                                        query.close();
                                    } catch (Exception e5) {
                                        e = e5;
                                        fc4.g(e, true);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = ch9Var.getContext().getContentResolver().openInputStream(uri);
                                        if (openInputStream == null) {
                                        }
                                        str = str3;
                                        if (TextUtils.isEmpty(str)) {
                                            return;
                                        } else {
                                            return;
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = "document_" + gda.p();
                                }
                                String replace22 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = ch9Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                    try {
                                        File file2 = new File(bc4.z(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                        try {
                                            gm.D(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            String absolutePath2 = file2.getAbsolutePath();
                                            openInputStream.close();
                                            str3 = absolutePath2;
                                        } finally {
                                        }
                                    } finally {
                                    }
                                } else if (openInputStream != null) {
                                    openInputStream.close();
                                }
                                str = str3;
                            }
                        } catch (Throwable th3) {
                            try {
                                query.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    }
                    str2 = null;
                    if (query != null) {
                    }
                    if (TextUtils.isEmpty(str2)) {
                    }
                    String replace222 = str2.replace('/', '_').replace('\\', '_');
                    openInputStream = ch9Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !aq1.t(str)) {
                    return;
                }
                gm.c3(new ey8(ch9Var, str, (byte) 22));
                return;
            case 22:
                ((ch9) this.b).X1((String) this.c);
                return;
            case 23:
                ch9 ch9Var2 = (ch9) this.b;
                lf9 lf9Var = (lf9) this.c;
                long j2 = lf9Var.a;
                int i10 = lf9Var.d;
                int i11 = lf9Var.c;
                ArrayList arrayList7 = ch9Var2.t3;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList7.size()) {
                        i12 = -1;
                    } else if (((ll0) arrayList7.get(i12)).a != j2) {
                        i12++;
                    }
                }
                if (i12 >= 0) {
                    View m = ch9Var2.f3.m(i12);
                    if (m instanceof xk9) {
                        xk9 xk9Var = (xk9) m;
                        xk9Var.A();
                        ne9 editText = xk9Var.getEditText();
                        int length2 = editText.length();
                        editText.setSelection(Math.max(0, Math.min(i11, length2)), Math.max(0, Math.min(i10, length2)));
                        return;
                    }
                    if (!(m instanceof kk9)) {
                        if (m instanceof td9) {
                            ne9 captionEditText = ((td9) m).getCaptionEditText();
                            captionEditText.O();
                            int length3 = captionEditText.length();
                            captionEditText.setSelection(Math.max(0, Math.min(i11, length3)), Math.max(0, Math.min(i10, length3)));
                            return;
                        }
                        return;
                    }
                    kk9 kk9Var = (kk9) m;
                    ne9 n = kk9Var.n(lf9Var.b);
                    if (n == null) {
                        n = kk9Var.n(0);
                    }
                    if (n != null) {
                        n.O();
                        int length4 = n.length();
                        n.setSelection(Math.max(0, Math.min(i11, length4)), Math.max(0, Math.min(i10, length4)));
                        return;
                    }
                    return;
                }
                return;
            case 24:
                tg9 tg9Var = (tg9) this.b;
                ll0 ll0Var = (ll0) this.c;
                View C1 = ll0Var != null ? tg9Var.e.C1(ll0Var) : null;
                if (C1 instanceof xk9) {
                    xk9 xk9Var2 = (xk9) C1;
                    xk9Var2.A();
                    xk9Var2.getEditText().setSelection(xk9Var2.getEditText().length());
                    return;
                }
                return;
            case 25:
                fi9 fi9Var = (fi9) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                boolean z = fi9Var.e;
                boolean z2 = fi9Var.d;
                ei9 ei9Var = fi9Var.s;
                if (fi9Var.x) {
                    return;
                }
                fi9Var.E = 0;
                if (fi9Var.c || z2 || z) {
                    if ((tLObject5 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject5).document) != null) {
                        if (!z) {
                            if (z2) {
                                fi9Var.y = true;
                                fi9Var.e();
                                ei9Var.f(document);
                                return;
                            } else {
                                fi9Var.y = true;
                                fi9Var.e();
                                ei9Var.d(document);
                                return;
                            }
                        }
                        int i13 = fi9Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            fi9Var.y = true;
                            fi9Var.e();
                            ei9Var.a();
                            return;
                        }
                        fi9Var.y = true;
                        fi9Var.e();
                        if (!TextUtils.isEmpty(fi9Var.G) && k47.W2(document) && (w = bc4.w(document.thumbs, nm7.q5, false, null, false)) != null) {
                            bc4.G(i13).e0(fi9Var.G, w);
                            File file3 = new File(fi9Var.G);
                            bc4.G(i13);
                            gm.F(file3, bc4.J(w, null, true, true));
                        }
                        ei9Var.e(document);
                        return;
                    }
                } else if ((tLObject5 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject5).photo) != null) {
                    fi9Var.y = true;
                    fi9Var.e();
                    ei9Var.c(photo);
                    return;
                }
                fi9Var.y = true;
                fi9Var.e();
                ei9Var.a();
                return;
            case 26:
                fi9 fi9Var2 = (fi9) this.b;
                String str4 = (String) this.c;
                if (fi9Var2.x || fi9Var2.y) {
                    return;
                }
                fi9Var2.a(str4);
                return;
            case 27:
                nk9 m2 = ((kk9) this.b).w.m((TL_iv.pageTableCell) this.c);
                if (m2 != null) {
                    ne9 ne9Var = m2.a;
                    ne9Var.O();
                    ne9Var.setSelection(ne9Var.length());
                    return;
                }
                return;
            case 28:
                kl9 kl9Var = (kl9) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TL_account.TL_savedRingtonesNotModified) {
                        kl9Var.f(true);
                    } else if (tLObject6 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject6;
                        ArrayList<TLRPC.Document> arrayList8 = tL_savedRingtones.ringtones;
                        ArrayList arrayList9 = kl9Var.e;
                        if (!kl9Var.f) {
                            kl9Var.f(false);
                            kl9Var.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size2 = arrayList9.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj2 = arrayList9.get(i14);
                            i14++;
                            jl9 jl9Var = (jl9) obj2;
                            if (jl9Var.b != null && (document2 = jl9Var.a) != null) {
                                hashMap.put(Long.valueOf(document2.id), jl9Var.b);
                            }
                        }
                        arrayList9.clear();
                        SharedPreferences d = kl9Var.d();
                        d.edit().clear().apply();
                        SharedPreferences.Editor edit = d.edit();
                        edit.putInt("count", arrayList8.size());
                        for (int i15 = 0; i15 < arrayList8.size(); i15++) {
                            TLRPC.Document document4 = arrayList8.get(i15);
                            String str5 = (String) hashMap.get(Long.valueOf(document4.id));
                            SerializedData serializedData = new SerializedData(document4.getObjectSize());
                            document4.serializeToStream(serializedData);
                            edit.putString("tone_document" + i15, Utilities.f(serializedData.toByteArray()));
                            if (str5 != null) {
                                edit.putString("tone_local_path" + i15, str5);
                            }
                            jl9 jl9Var2 = new jl9();
                            jl9Var2.a = document4;
                            jl9Var2.b = str5;
                            int i16 = kl9Var.d;
                            kl9Var.d = i16 + 1;
                            jl9Var2.c = i16;
                            arrayList9.add(jl9Var2);
                        }
                        edit.apply();
                        nm7.f(kl9Var.c).k(nm7.i5, new Object[0]);
                        SharedPreferences.Editor edit2 = kl9Var.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        kl9.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        kl9.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    kl9Var.b();
                    return;
                }
                return;
            default:
                kl9 kl9Var2 = (kl9) this.b;
                ArrayList arrayList10 = (ArrayList) this.c;
                for (int i17 = 0; i17 < arrayList10.size(); i17++) {
                    jl9 jl9Var3 = (jl9) arrayList10.get(i17);
                    if (jl9Var3 != null && ((TextUtils.isEmpty(jl9Var3.b) || !new File(jl9Var3.b).exists()) && (document3 = jl9Var3.a) != null)) {
                        bc4.G(kl9Var2.c);
                        File I = bc4.I(document3);
                        if (I == null || !I.exists()) {
                            gm.c3(new il9(kl9Var2, document3, objArr2 == true ? 1 : 0));
                        }
                    }
                }
                return;
        }
    }
}
