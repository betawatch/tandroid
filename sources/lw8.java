// default package

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.RLottieNative;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class lw8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lw8(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:185|(2:186|187)|(3:234|235|(10:237|238|(2:229|230)|191|(1:193)|194|195|196|(1:(1:199))(7:201|202|203|204|205|206|207)|200))|189|(0)|191|(0)|194|195|196|(0)(0)|200) */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x04d6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x04d7, code lost:
    
        fa4.g(r0, true);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0487 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0442 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0882  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        gv8 gv8Var;
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
        int i = 0;
        switch (this.a) {
            case 0:
                vw8 vw8Var = (vw8) this.c;
                gv8 gv8Var2 = (gv8) this.b;
                hv8 hv8Var = vw8Var.t0;
                if (hv8Var.q == 2 && hv8Var.o < 1.0f) {
                    hv8Var.m = gv8Var2;
                    vw8Var.invalidate();
                    return;
                }
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                vw8Var.q2 = vw8.j(vw8Var.o2, 0.03f, 0.005f);
                vw8Var.o2 = currentAnimationTimeMillis;
                gv8 gv8Var3 = hv8Var.m;
                if (gv8Var3 == null) {
                    hv8Var.m = gv8Var2;
                    hv8Var.n = null;
                    hv8Var.o = 1.0f;
                    return;
                }
                int i2 = (Build.VERSION.SDK_INT >= 29 ? 1 : 0) ^ 1;
                if (hv8Var.o < 1.0f && (gv8Var = hv8Var.n) != null) {
                    gv8Var3 = gv8Var;
                }
                hv8Var.n = gv8Var3;
                hv8Var.m = gv8Var2;
                hv8Var.o = 0.0f;
                hv8Var.q = i2;
                hv8Var.p = System.currentTimeMillis();
                boolean[] zArr = hv8Var.s;
                if (zArr != null) {
                    int length = zArr.length;
                    int i3 = hv8Var.n.e;
                    if (length >= i3 * i3) {
                        Arrays.fill(zArr, false);
                        hv8Var.G = i2 == 1;
                        return;
                    }
                }
                int i4 = hv8Var.n.e;
                hv8Var.s = new boolean[i4 * i4];
                hv8Var.G = i2 == 1;
                return;
            case 1:
                ((p8c) this.c).a((gv8) this.b);
                return;
            case 2:
                ad7 ad7Var = (ad7) this.c;
                nx8 nx8Var = (nx8) this.b;
                try {
                    try {
                        sQLitePreparedStatement = ad7Var.b.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?);");
                        sQLitePreparedStatement.requery();
                        sQLitePreparedStatement.bindInteger(1, nx8Var.a);
                        sQLitePreparedStatement.bindString(2, nx8Var.b);
                        sQLitePreparedStatement.bindInteger(3, nx8Var.c);
                        sQLitePreparedStatement.bindInteger(4, nx8Var.f);
                        sQLitePreparedStatement.step();
                    } catch (Exception e) {
                        fa4.g(e, true);
                        if (sQLitePreparedStatement == null) {
                            return;
                        }
                    }
                    sQLitePreparedStatement.dispose();
                    return;
                } catch (Throwable th) {
                    if (sQLitePreparedStatement != null) {
                        sQLitePreparedStatement.dispose();
                    }
                    throw th;
                }
            case 3:
                ox8 ox8Var = (ox8) this.c;
                TLObject tLObject = (TLObject) this.b;
                ArrayList arrayList2 = ox8Var.b;
                int i5 = ox8Var.a;
                if (tLObject instanceof TLRPC.TL_messages_quickReplies) {
                    TLRPC.TL_messages_quickReplies tL_messages_quickReplies = (TLRPC.TL_messages_quickReplies) tLObject;
                    na7.q1(i5).b4(tL_messages_quickReplies.users, false);
                    na7.q1(i5).V3(tL_messages_quickReplies.chats, false);
                    ad7.Y(i5).j1(tL_messages_quickReplies.users, tL_messages_quickReplies.chats, true, true);
                    ArrayList arrayList3 = new ArrayList();
                    for (int i6 = 0; i6 < tL_messages_quickReplies.quick_replies.size(); i6++) {
                        TLRPC.TL_quickReply tL_quickReply = tL_messages_quickReplies.quick_replies.get(i6);
                        nx8 nx8Var2 = new nx8();
                        nx8Var2.a = tL_quickReply.shortcut_id;
                        nx8Var2.b = tL_quickReply.shortcut;
                        nx8Var2.f = tL_quickReply.count;
                        nx8Var2.d = tL_quickReply.top_message;
                        nx8Var2.c = i6;
                        int i7 = 0;
                        while (true) {
                            if (i7 < tL_messages_quickReplies.messages.size()) {
                                message = tL_messages_quickReplies.messages.get(i7);
                                if (message.id != tL_quickReply.top_message) {
                                    i7++;
                                }
                            } else {
                                message = null;
                            }
                        }
                        if (message != null) {
                            k27 k27Var = new k27(i5, message, false, true);
                            nx8Var2.e = k27Var;
                            k27Var.r0(false);
                            nx8Var2.e.l(tL_quickReply.shortcut_id, tL_quickReply.shortcut);
                        }
                        arrayList3.add(nx8Var2);
                    }
                    arrayList = arrayList3;
                }
                ox8Var.e = false;
                if (arrayList != null) {
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                }
                ox8Var.f = true;
                ox8Var.l();
                kk7.f(i5).k(kk7.E1, new Object[0]);
                return;
            case 4:
                ox8 ox8Var2 = (ox8) this.c;
                ad7 ad7Var2 = (ad7) this.b;
                ArrayList arrayList4 = ox8Var2.b;
                try {
                    try {
                        SQLiteDatabase sQLiteDatabase = ad7Var2.b;
                        sQLiteDatabase.executeFast("DELETE FROM business_replies").stepThis().dispose();
                        sQLitePreparedStatement2 = sQLiteDatabase.executeFast("REPLACE INTO business_replies VALUES(?, ?, ?, ?)");
                        while (i < arrayList4.size()) {
                            nx8 nx8Var3 = (nx8) arrayList4.get(i);
                            sQLitePreparedStatement2.requery();
                            sQLitePreparedStatement2.bindInteger(1, nx8Var3.a);
                            sQLitePreparedStatement2.bindString(2, nx8Var3.b);
                            sQLitePreparedStatement2.bindInteger(3, nx8Var3.c);
                            sQLitePreparedStatement2.bindInteger(4, nx8Var3.f);
                            sQLitePreparedStatement2.step();
                            i++;
                        }
                        if (sQLitePreparedStatement2 == null) {
                            return;
                        }
                    } catch (Exception e2) {
                        fa4.g(e2, true);
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
            case 5:
                wx8 wx8Var = (wx8) this.c;
                wx8Var.b.add((String) this.b);
                wx8Var.invalidate();
                return;
            case 6:
                RLottieNative rLottieNative = (RLottieNative) this.c;
                RLottieNative rLottieNative2 = (RLottieNative) this.b;
                if (rLottieNative != null) {
                    rLottieNative.d();
                }
                if (rLottieNative2 != null) {
                    rLottieNative2.d();
                    return;
                }
                return;
            case 7:
                oz8 oz8Var = (oz8) this.c;
                ArrayList arrayList5 = (ArrayList) this.b;
                ArrayList arrayList6 = oz8Var.r;
                oz8Var.n.addAll(arrayList5);
                int size = arrayList5.size();
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList5.get(i8);
                    i8++;
                    nz8 nz8Var = (nz8) obj;
                    int i9 = 0;
                    while (true) {
                        if (i9 < arrayList6.size()) {
                            TLObject tLObject2 = ((nz8) arrayList6.get(i9)).a;
                            long j = tLObject2 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject2).id : tLObject2 instanceof TLRPC.User ? ((TLRPC.User) tLObject2).id : 0L;
                            TLObject tLObject3 = nz8Var.a;
                            if (j != (tLObject3 instanceof TLRPC.Chat ? -((TLRPC.Chat) tLObject3).id : tLObject3 instanceof TLRPC.User ? ((TLRPC.User) tLObject3).id : 0L)) {
                                i9++;
                            } else if (nz8Var.c > 0) {
                                ((nz8) arrayList6.get(i9)).c = nz8Var.c;
                            }
                        } else {
                            arrayList6.add(nz8Var);
                        }
                    }
                }
                vs2 vs2Var = oz8Var.x;
                if (vs2Var != null) {
                    vs2Var.accept(arrayList5);
                }
                oz8Var.a();
                return;
            case 8:
                i19 i19Var = (i19) this.c;
                f19 f19Var = (f19) this.b;
                i19Var.getClass();
                ((ni5) i19Var.w).c(f19Var.a, true, 0.0f, 0.0f);
                f19Var.X.c(false);
                i19Var.P = null;
                i19Var.Q = false;
                i19Var.R = null;
                return;
            case 9:
                c79 c79Var = (c79) this.c;
                Runnable runnable = (Runnable) this.b;
                a79 a79Var = c79Var.d;
                if (a79Var == null || !a79Var.f) {
                    return;
                }
                a79Var.a();
                runnable.run();
                return;
            case 10:
                View[] viewArr = (View[]) this.c;
                TLRPC.TL_channels_sponsoredMessageReportResultChooseOption tL_channels_sponsoredMessageReportResultChooseOption = (TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) this.b;
                a89 a89Var = (a89) viewArr[0];
                a89Var.b = tL_channels_sponsoredMessageReportResultChooseOption;
                a89Var.c = null;
                a89Var.d = null;
                a89Var.f.g3.O(false);
                return;
            case 11:
                ((a89) ((View[]) this.c)[0]).b((TLRPC.TL_reportResultAddComment) this.b);
                return;
            case 12:
                View[] viewArr2 = (View[]) this.c;
                TLRPC.TL_reportResultChooseOption tL_reportResultChooseOption = (TLRPC.TL_reportResultChooseOption) this.b;
                a89 a89Var2 = (a89) viewArr2[0];
                a89Var2.b = null;
                a89Var2.c = tL_reportResultChooseOption;
                a89Var2.d = null;
                a89Var2.f.g3.O(false);
                return;
            case 13:
                en1 en1Var = (en1) this.c;
                u21 u21Var = (u21) this.b;
                en1Var.run();
                u21Var.c(k96.M0(2131754485, null)).j();
                return;
            case 14:
                d dVar = (d) this.c;
                tj9 tj9Var = (tj9) this.b;
                u21.b0(dVar).c(k96.M0(2131754485, null)).j();
                gl.c3(tj9Var);
                return;
            case 15:
                f89 f89Var = (f89) this.c;
                CountDownLatch countDownLatch = (CountDownLatch) this.b;
                try {
                    i1c.a().d.a(f89Var.h.a.b(cj8.c), 1);
                } catch (Exception unused) {
                }
                countDownLatch.countDown();
                return;
            case 16:
                ((iq) this.c).h((Typeface) this.b);
                return;
            case 17:
                ((o13) this.c).onResult((xs4) this.b);
                return;
            case 18:
                gb9 gb9Var = (gb9) this.c;
                TLObject tLObject4 = (TLObject) this.b;
                gb9Var.b2 = false;
                gb9Var.c2 = 0;
                u41 u41Var = gb9Var.a2;
                u41Var.setLoading(false);
                if (!(tLObject4 instanceof TLRPC.TL_composedRichMessageWithAI)) {
                    gl.A3(4.0f, u41Var, null);
                    return;
                }
                TL_iv.RichMessage richMessage = ((TLRPC.TL_composedRichMessageWithAI) tLObject4).result;
                if (richMessage == null) {
                    gl.A3(4.0f, u41Var, null);
                    return;
                }
                gb9Var.d2 = richMessage;
                gb9Var.X1.set(richMessage);
                u41Var.i(k96.M0(2131754058, null), true, true);
                gb9Var.Y0();
                l5c l5cVar = gb9Var.U1;
                if (l5cVar != null) {
                    l5cVar.O(true);
                    return;
                }
                return;
            case 19:
                ye9 ye9Var = (ye9) this.c;
                Uri uri = (Uri) this.b;
                try {
                    str = gl.S0(uri);
                } catch (Exception e3) {
                    fa4.g(e3, true);
                    str = null;
                }
                if (TextUtils.isEmpty(str) || !oo1.t(str)) {
                    try {
                        query = ye9Var.getContext().getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                    } catch (Exception e4) {
                        e = e4;
                        str2 = null;
                        fa4.g(e, true);
                        if (TextUtils.isEmpty(str2)) {
                        }
                        String replace = str2.replace('/', '_').replace('\\', '_');
                        openInputStream = ye9Var.getContext().getContentResolver().openInputStream(uri);
                        if (openInputStream == null) {
                        }
                        str = str3;
                        if (TextUtils.isEmpty(str)) {
                            return;
                        } else {
                            return;
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
                                        fa4.g(e, true);
                                        if (TextUtils.isEmpty(str2)) {
                                        }
                                        String replace2 = str2.replace('/', '_').replace('\\', '_');
                                        openInputStream = ye9Var.getContext().getContentResolver().openInputStream(uri);
                                        if (openInputStream == null) {
                                        }
                                        str = str3;
                                        if (TextUtils.isEmpty(str)) {
                                        }
                                    }
                                }
                                if (TextUtils.isEmpty(str2)) {
                                    str2 = "document_" + gba.p();
                                }
                                String replace22 = str2.replace('/', '_').replace('\\', '_');
                                openInputStream = ye9Var.getContext().getContentResolver().openInputStream(uri);
                                if (openInputStream == null) {
                                    try {
                                        File file = new File(ba4.z(4), "rich_document_" + Math.abs(uri.hashCode()) + "_" + replace22);
                                        FileOutputStream fileOutputStream = new FileOutputStream(file);
                                        try {
                                            gl.D(openInputStream, fileOutputStream);
                                            fileOutputStream.close();
                                            String absolutePath = file.getAbsolutePath();
                                            openInputStream.close();
                                            str3 = absolutePath;
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
                    openInputStream = ye9Var.getContext().getContentResolver().openInputStream(uri);
                    if (openInputStream == null) {
                    }
                    str = str3;
                }
                if (TextUtils.isEmpty(str) || !oo1.t(str)) {
                    return;
                }
                gl.c3(new lw8(ye9Var, str, (byte) 20));
                return;
            case 20:
                ((ye9) this.c).X1((String) this.b);
                return;
            case 21:
                ye9 ye9Var2 = (ye9) this.c;
                id9 id9Var = (id9) this.b;
                long j2 = id9Var.a;
                int i10 = id9Var.d;
                int i11 = id9Var.c;
                ArrayList arrayList7 = ye9Var2.t3;
                int i12 = 0;
                while (true) {
                    if (i12 >= arrayList7.size()) {
                        i12 = -1;
                    } else if (((lk0) arrayList7.get(i12)).a != j2) {
                        i12++;
                    }
                }
                if (i12 >= 0) {
                    View m = ye9Var2.f3.m(i12);
                    if (m instanceof wi9) {
                        wi9 wi9Var = (wi9) m;
                        wi9Var.A();
                        mc9 editText = wi9Var.getEditText();
                        int length2 = editText.length();
                        editText.setSelection(Math.max(0, Math.min(i11, length2)), Math.max(0, Math.min(i10, length2)));
                        return;
                    }
                    if (!(m instanceof ii9)) {
                        if (m instanceof tb9) {
                            mc9 captionEditText = ((tb9) m).getCaptionEditText();
                            captionEditText.O();
                            int length3 = captionEditText.length();
                            captionEditText.setSelection(Math.max(0, Math.min(i11, length3)), Math.max(0, Math.min(i10, length3)));
                            return;
                        }
                        return;
                    }
                    ii9 ii9Var = (ii9) m;
                    mc9 n = ii9Var.n(id9Var.b);
                    if (n == null) {
                        n = ii9Var.n(0);
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
            case 22:
                pe9 pe9Var = (pe9) this.c;
                lk0 lk0Var = (lk0) this.b;
                View C1 = lk0Var != null ? pe9Var.e.C1(lk0Var) : null;
                if (C1 instanceof wi9) {
                    wi9 wi9Var2 = (wi9) C1;
                    wi9Var2.A();
                    wi9Var2.getEditText().setSelection(wi9Var2.getEditText().length());
                    return;
                }
                return;
            case 23:
                bg9 bg9Var = (bg9) this.c;
                TLObject tLObject5 = (TLObject) this.b;
                boolean z = bg9Var.e;
                boolean z2 = bg9Var.d;
                ag9 ag9Var = bg9Var.s;
                if (bg9Var.x) {
                    return;
                }
                bg9Var.E = 0;
                if (bg9Var.c || z2 || z) {
                    if ((tLObject5 instanceof TLRPC.TL_messageMediaDocument) && (document = ((TLRPC.TL_messageMediaDocument) tLObject5).document) != null) {
                        if (!z) {
                            if (z2) {
                                bg9Var.y = true;
                                bg9Var.e();
                                ag9Var.f(document);
                                return;
                            } else {
                                bg9Var.y = true;
                                bg9Var.e();
                                ag9Var.d(document);
                                return;
                            }
                        }
                        int i13 = bg9Var.a;
                        if (document.id == 0 || document.access_hash == 0) {
                            bg9Var.y = true;
                            bg9Var.e();
                            ag9Var.a();
                            return;
                        }
                        bg9Var.y = true;
                        bg9Var.e();
                        if (!TextUtils.isEmpty(bg9Var.G) && k27.W2(document) && (w = ba4.w(document.thumbs, kk7.q5, false, null, false)) != null) {
                            ba4.G(i13).e0(bg9Var.G, w);
                            File file2 = new File(bg9Var.G);
                            ba4.G(i13);
                            gl.F(file2, ba4.J(w, null, true, true));
                        }
                        ag9Var.e(document);
                        return;
                    }
                } else if ((tLObject5 instanceof TLRPC.TL_messageMediaPhoto) && (photo = ((TLRPC.TL_messageMediaPhoto) tLObject5).photo) != null) {
                    bg9Var.y = true;
                    bg9Var.e();
                    ag9Var.c(photo);
                    return;
                }
                bg9Var.y = true;
                bg9Var.e();
                ag9Var.a();
                return;
            case 24:
                bg9 bg9Var2 = (bg9) this.c;
                String str4 = (String) this.b;
                if (bg9Var2.x || bg9Var2.y) {
                    return;
                }
                bg9Var2.a(str4);
                return;
            case 25:
                li9 m2 = ((ii9) this.c).w.m((TL_iv.pageTableCell) this.b);
                if (m2 != null) {
                    mc9 mc9Var = m2.a;
                    mc9Var.O();
                    mc9Var.setSelection(mc9Var.length());
                    return;
                }
                return;
            case 26:
                ij9 ij9Var = (ij9) this.c;
                TLObject tLObject6 = (TLObject) this.b;
                if (tLObject6 != null) {
                    if (tLObject6 instanceof TL_account.TL_savedRingtonesNotModified) {
                        ij9Var.f(true);
                    } else if (tLObject6 instanceof TL_account.TL_savedRingtones) {
                        TL_account.TL_savedRingtones tL_savedRingtones = (TL_account.TL_savedRingtones) tLObject6;
                        ArrayList<TLRPC.Document> arrayList8 = tL_savedRingtones.ringtones;
                        ArrayList arrayList9 = ij9Var.e;
                        if (!ij9Var.f) {
                            ij9Var.f(false);
                            ij9Var.f = true;
                        }
                        HashMap hashMap = new HashMap();
                        int size2 = arrayList9.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj2 = arrayList9.get(i14);
                            i14++;
                            hj9 hj9Var = (hj9) obj2;
                            if (hj9Var.b != null && (document2 = hj9Var.a) != null) {
                                hashMap.put(Long.valueOf(document2.id), hj9Var.b);
                            }
                        }
                        arrayList9.clear();
                        SharedPreferences d = ij9Var.d();
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
                            hj9 hj9Var2 = new hj9();
                            hj9Var2.a = document4;
                            hj9Var2.b = str5;
                            int i16 = ij9Var.d;
                            ij9Var.d = i16 + 1;
                            hj9Var2.c = i16;
                            arrayList9.add(hj9Var2);
                        }
                        edit.apply();
                        kk7.f(ij9Var.c).k(kk7.g5, new Object[0]);
                        SharedPreferences.Editor edit2 = ij9Var.d().edit();
                        long j3 = tL_savedRingtones.hash;
                        ij9.g = j3;
                        SharedPreferences.Editor putLong = edit2.putLong("hash", j3);
                        long currentTimeMillis = System.currentTimeMillis();
                        ij9.h = currentTimeMillis;
                        putLong.putLong("lastReload", currentTimeMillis).apply();
                    }
                    ij9Var.b();
                    return;
                }
                return;
            case 27:
                ij9 ij9Var2 = (ij9) this.c;
                ArrayList arrayList10 = (ArrayList) this.b;
                while (i < arrayList10.size()) {
                    hj9 hj9Var3 = (hj9) arrayList10.get(i);
                    if (hj9Var3 != null && ((TextUtils.isEmpty(hj9Var3.b) || !new File(hj9Var3.b).exists()) && (document3 = hj9Var3.a) != null)) {
                        ba4.G(ij9Var2.c);
                        File I = ba4.I(document3);
                        if (I == null || !I.exists()) {
                            gl.c3(new lw8(ij9Var2, document3, (byte) 28));
                        }
                    }
                    i++;
                }
                return;
            case 28:
                ij9 ij9Var3 = (ij9) this.c;
                TLRPC.Document document5 = (TLRPC.Document) this.b;
                ba4.G(ij9Var3.c).X(document5, document5, 0, 0);
                return;
            default:
                jj9 jj9Var = (jj9) this.c;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                int i17 = jj9Var.a;
                if (tL_error.text.equals("RINGTONE_DURATION_TOO_LONG")) {
                    kk7.e().k(kk7.R4, 4, k96.a0("TooLongError", null, 2131743801, new Object[0]), k96.a0("ErrorRingtoneDurationTooLong", null, 2131751092, Integer.valueOf(na7.q1(i17).k4.S0.f())));
                    return;
                } else if (tL_error.text.equals("RINGTONE_SIZE_TOO_BIG")) {
                    kk7.e().k(kk7.R4, 4, k96.a0("TooLargeError", null, 2131743802, new Object[0]), k96.a0("ErrorRingtoneSizeTooBig", null, 2131751090, Integer.valueOf(na7.q1(i17).k4.R0.f() / 1024)));
                    return;
                } else {
                    kk7.e().k(kk7.R4, 4, k96.a0("InvalidFormatError", null, 2131748989, new Object[0]), k96.M0(2131751091, null));
                    return;
                }
        }
    }
}
