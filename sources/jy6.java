// default package

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_fragment;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.AnimatedFileNative;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PrivacyControlActivity;
import org.telegram.ui.PrivacySettingsActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class jy6 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ jy6(wo7 wo7Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = (byte) 13;
        this.b = wo7Var;
        this.d = arrayList;
        this.e = arrayList2;
        this.c = arrayList3;
    }

    private final void a() {
        oc7 oc7Var = (oc7) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        TLRPC.updates_Difference updates_difference = (TLRPC.updates_Difference) this.c;
        vh6 vh6Var = (vh6) this.e;
        if (!arrayList.isEmpty()) {
            gm.c3(new fp6((Object) oc7Var, (Object) arrayList, (Object) updates_difference, (byte) 24));
        }
        oc7Var.getMessagesStorage().g1(updates_difference.new_messages, true, false, false, oc7Var.getDownloadController().l(), false, 0, 0L);
        for (int i = 0; i < vh6Var.m(); i++) {
            long j = vh6Var.j(i);
            ArrayList arrayList2 = (ArrayList) vh6Var.n(i);
            oc7Var.getMediaDataController().Y0(arrayList2, j, 0, 0L, new m77(oc7Var, j, arrayList2, (byte) 4), 0, null);
        }
    }

    private final void b() {
        ArrayList arrayList;
        hs6 hs6Var;
        ArrayList arrayList2;
        oc7 oc7Var = (oc7) this.b;
        TLRPC.messages_Dialogs messages_dialogs = (TLRPC.messages_Dialogs) this.c;
        vh6 vh6Var = (vh6) this.d;
        vh6 vh6Var2 = (vh6) this.e;
        SparseBooleanArray sparseBooleanArray = oc7Var.V1;
        SparseBooleanArray sparseBooleanArray2 = oc7Var.U1;
        vh6 vh6Var3 = oc7Var.T;
        SparseArray sparseArray = oc7Var.V;
        vh6 vh6Var4 = oc7Var.S;
        vh6 vh6Var5 = oc7Var.R;
        ArrayList arrayList3 = oc7Var.y;
        oc7Var.e2 = false;
        oc7Var.n(messages_dialogs.dialogs);
        hs6 mediaDataController = oc7Var.getMediaDataController();
        mediaDataController.G(false);
        mediaDataController.L0();
        oc7Var.d4(messages_dialogs.users, false);
        oc7Var.X3(messages_dialogs.chats, false);
        int i = 0;
        while (i < arrayList3.size()) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList3.get(i);
            if (!pg3.B(dialog.id)) {
                vh6Var5.l(dialog.id);
                ArrayList arrayList4 = (ArrayList) vh6Var4.f(dialog.id);
                vh6Var4.l(dialog.id);
                if (arrayList4 != null) {
                    int i2 = 0;
                    while (i2 < arrayList4.size()) {
                        k47 k47Var = (k47) arrayList4.get(i2);
                        if (k47Var != null) {
                            hs6Var = mediaDataController;
                            arrayList2 = arrayList4;
                            if (k47Var.k.peer_id.channel_id == 0) {
                                sparseArray.remove(k47Var.e1());
                            }
                            long j = k47Var.k.random_id;
                            if (j != 0) {
                                vh6Var3.l(j);
                            }
                        } else {
                            hs6Var = mediaDataController;
                            arrayList2 = arrayList4;
                        }
                        i2++;
                        mediaDataController = hs6Var;
                        arrayList4 = arrayList2;
                    }
                }
            }
            i++;
            mediaDataController = mediaDataController;
        }
        int i3 = 0;
        while (true) {
            hs6 hs6Var2 = mediaDataController;
            if (i3 >= vh6Var.m()) {
                break;
            }
            long j2 = vh6Var.j(i3);
            TLRPC.Dialog dialog2 = (TLRPC.Dialog) vh6Var.n(i3);
            long j3 = dialog2.id;
            int i4 = i3;
            TLRPC.DraftMessage draftMessage = dialog2.draft;
            mediaDataController = hs6Var2;
            mediaDataController.B1(j3, 0L, draftMessage);
            TLRPC.DraftMessage draftMessage2 = dialog2.draft;
            if (draftMessage2 instanceof TLRPC.TL_draftMessage) {
                mediaDataController.U1(dialog2.id, 0L, draftMessage2, null, false);
            }
            vh6Var5.k(dialog2, j2);
            ArrayList arrayList5 = (ArrayList) vh6Var2.f(dialog2.id);
            vh6Var4.k(arrayList5, j2);
            if (arrayList5 != null) {
                int i5 = 0;
                while (i5 < arrayList5.size()) {
                    k47 k47Var2 = (k47) arrayList5.get(i5);
                    vh6 vh6Var6 = vh6Var2;
                    if (k47Var2 != null) {
                        arrayList = arrayList5;
                        if (k47Var2.k.peer_id.channel_id == 0) {
                            sparseArray.put(k47Var2.e1(), k47Var2);
                            oc7Var.O = Math.min(oc7Var.O, k47Var2.k.date);
                            long j4 = k47Var2.k.random_id;
                            if (j4 != 0) {
                                vh6Var3.k(k47Var2, j4);
                            }
                        }
                    } else {
                        arrayList = arrayList5;
                    }
                    i5++;
                    vh6Var2 = vh6Var6;
                    arrayList5 = arrayList;
                }
            }
            oc7Var.i4.c(j2);
            i3 = i4 + 1;
            vh6Var2 = vh6Var2;
        }
        arrayList3.clear();
        int m = vh6Var5.m();
        for (int i6 = 0; i6 < m; i6++) {
            TLRPC.Dialog dialog3 = (TLRPC.Dialog) vh6Var5.n(i6);
            if (oc7Var.u0.h(dialog3.id) < 0) {
                arrayList3.add(dialog3);
            }
        }
        oc7Var.b5(null);
        sparseBooleanArray2.put(0, true);
        sparseBooleanArray.put(0, false);
        sparseBooleanArray2.put(1, true);
        sparseBooleanArray.put(1, false);
        int m2 = oc7Var.getUserConfig().m(0);
        long[] g = oc7Var.getUserConfig().g(0);
        if (m2 < 400) {
            long j5 = g[0];
            if (j5 != -1 && j5 != 2147483647L) {
                oc7Var.Z2(0, 0, 100, false, null);
            }
        }
        oc7Var.getNotificationCenter().k(nm7.r, new Object[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x010f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement executeFast;
        cf7 cf7Var = (cf7) this.b;
        LongSparseIntArray longSparseIntArray = (LongSparseIntArray) this.c;
        LongSparseIntArray longSparseIntArray2 = (LongSparseIntArray) this.d;
        SparseIntArray sparseIntArray = (SparseIntArray) this.e;
        cf7Var.getClass();
        try {
            if (!cf7.q0(longSparseIntArray)) {
                executeFast = cf7Var.b.executeFast("DELETE FROM unread_push_messages WHERE uid = ? AND mid <= ?");
                for (int i = 0; i < longSparseIntArray.size(); i++) {
                    try {
                        long keyAt = longSparseIntArray.keyAt(i);
                        int i2 = longSparseIntArray.get(keyAt);
                        SQLiteDatabase sQLiteDatabase = cf7Var.b;
                        Locale locale = Locale.US;
                        sQLiteDatabase.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = " + keyAt + " AND mid > 0 AND mid <= " + i2 + " AND read_state IN(0,2) AND out = 0").stepThis().dispose();
                        executeFast.requery();
                        executeFast.bindLong(1, keyAt);
                        executeFast.bindInteger(2, i2);
                        executeFast.step();
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = executeFast;
                        try {
                            cf7Var.n(e, true);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast;
                        if (sQLitePreparedStatement != null) {
                        }
                        throw th;
                    }
                }
                executeFast.dispose();
            }
            if (!cf7.q0(longSparseIntArray2)) {
                for (int i3 = 0; i3 < longSparseIntArray2.size(); i3++) {
                    long keyAt2 = longSparseIntArray2.keyAt(i3);
                    int i4 = longSparseIntArray2.get(keyAt2);
                    SQLiteDatabase sQLiteDatabase2 = cf7Var.b;
                    Locale locale2 = Locale.US;
                    sQLiteDatabase2.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = " + keyAt2 + " AND mid > 0 AND mid <= " + i4 + " AND read_state IN(0,2) AND out = 1").stepThis().dispose();
                }
            }
            if (sparseIntArray != null) {
                if (sparseIntArray.size() == 0) {
                    return;
                }
                for (int i5 = 0; i5 < sparseIntArray.size(); i5++) {
                    long E = pg3.E(sparseIntArray.keyAt(i5));
                    int valueAt = sparseIntArray.valueAt(i5);
                    executeFast = cf7Var.b.executeFast("UPDATE messages_v2 SET read_state = read_state | 1 WHERE uid = ? AND date <= ? AND read_state IN(0,2) AND out = 1");
                    executeFast.requery();
                    executeFast.bindLong(1, E);
                    executeFast.bindInteger(2, valueAt);
                    executeFast.step();
                    executeFast.dispose();
                }
            }
        } catch (Exception e2) {
            e = e2;
            sQLitePreparedStatement = null;
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x001b, code lost:
    
        if (r6.length < 16) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void d() {
        SQLitePreparedStatement sQLitePreparedStatement;
        int length;
        SQLitePreparedStatement executeFast;
        cf7 cf7Var = (cf7) this.b;
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) this.c;
        TLRPC.User user = (TLRPC.User) this.d;
        TLRPC.TL_dialog tL_dialog = (TLRPC.TL_dialog) this.e;
        boolean z = true;
        try {
            try {
                byte[] bArr = encryptedChat.key_hash;
                if (bArr != null) {
                    try {
                    } catch (Exception e) {
                        e = e;
                        sQLitePreparedStatement = null;
                        try {
                            cf7Var.n(e, z);
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            if (sQLitePreparedStatement != null) {
                                sQLitePreparedStatement.dispose();
                            }
                            throw th;
                        }
                    }
                }
                byte[] bArr2 = encryptedChat.auth_key;
                if (bArr2 != null) {
                    Typeface typeface = gm.a;
                    byte[] bArr3 = new byte[16];
                    System.arraycopy(Utilities.n(bArr2), 0, bArr3, 0, 16);
                    encryptedChat.key_hash = bArr3;
                }
                SQLitePreparedStatement executeFast2 = cf7Var.b.executeFast("REPLACE INTO enc_chats VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                try {
                    try {
                        NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedChat.getObjectSize());
                        byte[] bArr4 = encryptedChat.a_or_b;
                        if (bArr4 != null) {
                            try {
                                length = bArr4.length;
                            } catch (Exception e2) {
                                e = e2;
                                sQLitePreparedStatement = executeFast2;
                                cf7Var.n(e, z);
                                if (sQLitePreparedStatement != null) {
                                }
                            }
                        } else {
                            length = 1;
                        }
                        NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length);
                        byte[] bArr5 = encryptedChat.auth_key;
                        NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(bArr5 != null ? bArr5.length : 1);
                        byte[] bArr6 = encryptedChat.future_auth_key;
                        NativeByteBuffer nativeByteBuffer4 = new NativeByteBuffer(bArr6 != null ? bArr6.length : 1);
                        byte[] bArr7 = encryptedChat.key_hash;
                        NativeByteBuffer nativeByteBuffer5 = new NativeByteBuffer(bArr7 != null ? bArr7.length : 1);
                        encryptedChat.serializeToStream(nativeByteBuffer);
                        executeFast2.bindInteger(1, encryptedChat.id);
                        executeFast2.bindLong(2, user.id);
                        executeFast2.bindString(3, cf7.J(user));
                        executeFast2.bindByteBuffer(4, nativeByteBuffer);
                        byte[] bArr8 = encryptedChat.a_or_b;
                        if (bArr8 != null) {
                            nativeByteBuffer2.writeBytes(bArr8);
                        }
                        byte[] bArr9 = encryptedChat.auth_key;
                        if (bArr9 != null) {
                            nativeByteBuffer3.writeBytes(bArr9);
                        }
                        byte[] bArr10 = encryptedChat.future_auth_key;
                        if (bArr10 != null) {
                            nativeByteBuffer4.writeBytes(bArr10);
                        }
                        byte[] bArr11 = encryptedChat.key_hash;
                        if (bArr11 != null) {
                            nativeByteBuffer5.writeBytes(bArr11);
                        }
                        executeFast2.bindByteBuffer(5, nativeByteBuffer2);
                        executeFast2.bindByteBuffer(6, nativeByteBuffer3);
                        executeFast2.bindInteger(7, encryptedChat.ttl);
                        executeFast2.bindInteger(8, encryptedChat.layer);
                        executeFast2.bindInteger(9, encryptedChat.seq_in);
                        executeFast2.bindInteger(10, encryptedChat.seq_out);
                        executeFast2.bindInteger(11, (encryptedChat.key_use_count_in << 16) | encryptedChat.key_use_count_out);
                        executeFast2.bindLong(12, encryptedChat.exchange_id);
                        executeFast2.bindInteger(13, encryptedChat.key_create_date);
                        executeFast2.bindLong(14, encryptedChat.future_key_fingerprint);
                        executeFast2.bindByteBuffer(15, nativeByteBuffer4);
                        executeFast2.bindByteBuffer(16, nativeByteBuffer5);
                        executeFast2.bindInteger(17, encryptedChat.in_seq_no);
                        executeFast2.bindLong(18, encryptedChat.admin_id);
                        executeFast2.bindInteger(19, encryptedChat.mtproto_seq);
                        executeFast2.step();
                        executeFast2.dispose();
                        nativeByteBuffer.reuse();
                        nativeByteBuffer2.reuse();
                        nativeByteBuffer3.reuse();
                        nativeByteBuffer4.reuse();
                        nativeByteBuffer5.reuse();
                        executeFast = cf7Var.b.executeFast("REPLACE INTO dialogs VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = executeFast2;
                    }
                } catch (Exception e3) {
                    e = e3;
                    sQLitePreparedStatement = executeFast2;
                }
            } catch (Exception e4) {
                e = e4;
                z = true;
            }
        } catch (Throwable th3) {
            th = th3;
            sQLitePreparedStatement = null;
        }
        try {
            executeFast.bindLong(1, tL_dialog.id);
            executeFast.bindInteger(2, tL_dialog.last_message_date);
            executeFast.bindInteger(3, tL_dialog.unread_count);
            executeFast.bindInteger(4, tL_dialog.top_message);
            executeFast.bindInteger(5, tL_dialog.read_inbox_max_id);
            executeFast.bindInteger(6, tL_dialog.read_outbox_max_id);
            executeFast.bindInteger(7, 0);
            executeFast.bindInteger(8, tL_dialog.unread_mentions_count);
            executeFast.bindInteger(9, tL_dialog.pts);
            executeFast.bindInteger(10, 0);
            executeFast.bindInteger(11, tL_dialog.pinnedNum);
            executeFast.bindInteger(12, tL_dialog.flags);
            executeFast.bindInteger(13, tL_dialog.folder_id);
            executeFast.bindNull(14);
            executeFast.bindInteger(15, tL_dialog.unread_reactions_count);
            executeFast.bindInteger(16, 0);
            executeFast.bindInteger(17, tL_dialog.ttl_period);
            executeFast.bindInteger(18, tL_dialog.unread_poll_votes_count);
            executeFast.step();
            executeFast.dispose();
        } catch (Exception e5) {
            e = e5;
            sQLitePreparedStatement = executeFast;
            z = true;
            cf7Var.n(e, z);
            if (sQLitePreparedStatement != null) {
            }
        } catch (Throwable th4) {
            th = th4;
            sQLitePreparedStatement = executeFast;
            if (sQLitePreparedStatement != null) {
            }
            throw th;
        }
    }

    private final void e() {
        SQLitePreparedStatement executeFast;
        cf7 cf7Var = (cf7) this.b;
        TLRPC.Document document = (TLRPC.Document) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        SQLitePreparedStatement sQLitePreparedStatement = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                if (document != null) {
                    executeFast = sQLiteDatabase.executeFast("UPDATE web_recent_v3 SET document = ? WHERE image_url = ?");
                    executeFast.requery();
                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(document.getObjectSize());
                    document.serializeToStream(nativeByteBuffer);
                    executeFast.bindByteBuffer(1, nativeByteBuffer);
                    executeFast.bindString(2, str);
                    executeFast.step();
                    executeFast.dispose();
                    nativeByteBuffer.reuse();
                } else {
                    executeFast = sQLiteDatabase.executeFast("UPDATE web_recent_v3 SET local_url = ? WHERE image_url = ?");
                    executeFast.requery();
                    executeFast.bindString(1, str2);
                    executeFast.bindString(2, str);
                    executeFast.step();
                    executeFast.dispose();
                }
                executeFast.dispose();
            } catch (Exception e) {
                cf7Var.n(e, true);
                if (0 != 0) {
                    sQLitePreparedStatement.dispose();
                }
            }
        } catch (Throwable th) {
            if (0 != 0) {
                sQLitePreparedStatement.dispose();
            }
            throw th;
        }
    }

    private final void f() {
        ((NativeInstance) this.b).lambda$onAudioLevelsUpdated$1((int[]) this.c, (float[]) this.d, (boolean[]) this.e);
    }

    private final void g() {
        wo7 wo7Var = (wo7) this.b;
        ArrayList arrayList = (ArrayList) this.d;
        ArrayList arrayList2 = (ArrayList) this.e;
        ArrayList arrayList3 = (ArrayList) this.c;
        bu9 bu9Var = wo7Var.h;
        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = wo7Var.n;
        if (notificationsCustomSettingsActivity.f) {
            wo7Var.f = null;
            wo7Var.d = arrayList;
            wo7Var.e = arrayList2;
            bu9Var.f(arrayList3, null);
            if (notificationsCustomSettingsActivity.f && !bu9Var.e()) {
                notificationsCustomSettingsActivity.c.c();
            }
            wo7Var.f();
        }
    }

    private final void h() {
        String str;
        TLRPC.Chat L0;
        String M0;
        boolean z;
        String a0;
        u31 I;
        w18 w18Var;
        w18 w18Var2;
        p pVar = (p) this.b;
        tk5 tk5Var = (tk5) this.c;
        Activity activity = (Activity) this.d;
        TLRPC.Message message = (TLRPC.Message) this.e;
        pVar.b1 = true;
        pVar.g1 = 1;
        pVar.B0(tk5Var, activity);
        TLRPC.InputInvoice inputInvoice = pVar.c1;
        boolean z2 = inputInvoice instanceof TLRPC.TL_inputInvoiceStars;
        boolean z3 = z2 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGift);
        boolean z4 = z2 && (((TLRPC.TL_inputInvoiceStars) inputInvoice).purpose instanceof TLRPC.TL_inputStorePaymentStarsGiveaway);
        if (!z2 && (w18Var2 = pVar.a1) != null) {
            w18Var2.c(pVar.g1);
        }
        pVar.i0();
        if (z2 && (w18Var = pVar.a1) != null) {
            w18Var.c(pVar.g1);
        }
        long f0 = pVar.f0();
        if (f0 > 0) {
            str = m9c.l(pVar.getMessagesController().W1(Long.valueOf(f0)));
        } else {
            str = "";
            if (f0 < 0 && (L0 = pVar.getMessagesController().L0(Long.valueOf(-f0))) != null) {
                str = L0.title;
            }
        }
        long e0 = pVar.e0();
        int i = z2 ? (z3 || z4) ? R.raw.stars_send : R.raw.stars_topup : R.raw.payment_success;
        if (z2) {
            M0 = jb6.M0(z4 ? 2131744781 : z3 ? 2131744789 : 2131744848, null);
        } else {
            M0 = null;
        }
        byte b = 2;
        if (!z2) {
            z = false;
            a0 = jb6.a0(null, null, 2131747134, pVar.S0[0], pVar.r0);
        } else if (z4) {
            a0 = jb6.H(',', "StarsGiveawaySentPopupInfo", (int) e0);
            z = false;
        } else {
            z = false;
            a0 = jb6.K(z3 ? "StarsGiftSentPopupInfo" : "StarsAcquiredInfo", (int) e0, ',', str);
        }
        SpannableStringBuilder S2 = gm.S2(a0);
        d S = LaunchActivity.S();
        if (S == null) {
            return;
        }
        c41 b0 = c41.b0(S);
        if (f0 == 0 || M0 == null || z4) {
            String str2 = M0;
            I = str2 != null ? b0.I(i, str2, S2) : b0.Q(i, 36, S2);
        } else {
            I = b0.L(i, M0, S2, jb6.M0(2131743236, null), new pz6(b, f0));
        }
        u31 u31Var = I;
        u31Var.s = z;
        u31Var.j = 5000;
        if (message != null) {
            x73 x73Var = new x73(pVar, u31Var, z3, message, (byte) 3);
            y21 y21Var = u31Var.e;
            if (y21Var != null) {
                y21Var.setOnClickListener(x73Var);
            }
        }
        u31Var.k(z4);
    }

    private final void i() {
        ((p) this.b).l0((TLObject) this.c, (TLRPC.TL_error) this.d, (TL_account.getTmpPassword) this.e);
    }

    private final void j() {
        v48 v48Var = (v48) this.b;
        TLObject tLObject = (TLObject) this.c;
        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) this.d;
        qac qacVar = (qac) this.e;
        a58 a58Var = v48Var.x;
        if (tLObject instanceof TL_stories.TL_stories_stories) {
            TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
            oc7.r1(a58Var.s2).d4(tL_stories_stories.users, false);
            oc7.r1(a58Var.s2).X3(tL_stories_stories.chats, false);
            for (int i = 0; i < tL_stories_stories.stories.size(); i++) {
                if (tL_stories_stories.stories.get(i).id == storyItem.id) {
                    qacVar.a(tL_stories_stories.stories.get(i).media.document);
                    return;
                }
            }
        }
        qacVar.a(null);
    }

    private final void k() {
        byte b;
        g6b g6bVar;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        nab nabVar;
        v48 v48Var = (v48) this.b;
        Activity activity = (Activity) this.c;
        oab oabVar = (oab) this.d;
        y48 y48Var = (y48) this.e;
        v9b C = v9b.C(activity, v48Var.x.s2);
        c40 c40Var = v48Var.x.C2;
        long j = (c40Var == null || (nabVar = (nab) c40Var.c) == null) ? 0L : nabVar.currentPosition;
        tr3 tr3Var = oc7.r1(v48Var.x.s2).N1().w;
        TL_stories.StoryItem storyItem2 = v48Var.x.E1.a;
        long j2 = storyItem2.dialogId;
        ArrayList arrayList2 = tr3Var.b;
        int size = arrayList2.size();
        int i = 0;
        while (true) {
            b = 1;
            if (i >= size) {
                g6bVar = null;
                break;
            }
            Object obj = arrayList2.get(i);
            i++;
            g6bVar = (g6b) obj;
            if (g6bVar.g && storyItem2.id == g6bVar.f && j2 == g6bVar.e) {
                TLRPC.MessageMedia messageMedia = storyItem2.media;
                TLRPC.Document document = messageMedia.document;
                arrayList = arrayList2;
                storyItem = storyItem2;
                if ((document == null || document.id == g6bVar.H) && ((photo = messageMedia.photo) == null || photo.id == g6bVar.I)) {
                    break;
                }
            } else {
                arrayList = arrayList2;
                storyItem = storyItem2;
            }
            storyItem2 = storyItem;
            arrayList2 = arrayList;
        }
        g6bVar.h = true;
        if (g6bVar == null || g6bVar.u || (file = g6bVar.L) == null || !file.exists()) {
            g6bVar = g6b.n(v48Var.x.E1.f(), v48Var.x.E1.a);
            g6bVar.e = v48Var.x.r1;
        }
        g6b g = g6bVar.g();
        if (v48Var.x.A0()) {
            a58 a58Var = v48Var.x;
            g.J0 = a58Var.r1;
            g.L0 = oc7.h5(a58Var.E1.a.media);
            z3b z3bVar = oabVar.O0;
            if (z3bVar instanceof t3b) {
                g.K0 = ((t3b) z3bVar).E;
            }
        }
        C.R(q9b.d(oabVar), g, j);
        C.R = new p48(v48Var, (byte) 3);
        C.S = new r48(v48Var, y48Var, b);
    }

    private final void l() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        jo6 jo6Var = (jo6) this.c;
        jo6 jo6Var2 = (jo6) this.d;
        String str = (String) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        Bitmap decodeFile = BitmapFactory.decodeFile(jo6Var.I);
        if (decodeFile == null) {
            gm.c3(new n88(photoViewer, (byte) 5));
            return;
        }
        int[] iArr = new int[11];
        AnimatedFileNative.d(jo6Var2.I, iArr, 0L);
        int max = Math.max(iArr[1], jo6Var2.F);
        int max2 = Math.max(iArr[2], jo6Var2.G);
        if ((iArr[8] / 90) % 2 == 1) {
            max2 = max;
            max = max2;
        }
        float f = max;
        float f2 = max2;
        float max3 = Math.max(decodeFile.getWidth() / f, decodeFile.getHeight() / f2);
        int i = (int) (f * max3);
        int i2 = (int) (f2 * max3);
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, config);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        canvas.translate(createBitmap.getWidth() / 2, createBitmap.getHeight() / 2);
        float max4 = Math.max(createBitmap.getWidth() / decodeFile.getWidth(), createBitmap.getHeight() / decodeFile.getHeight());
        canvas.scale(max4, max4);
        canvas.drawBitmap(decodeFile, (-decodeFile.getWidth()) / 2, (-decodeFile.getHeight()) / 2, paint);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
            fileOutputStream.close();
            Bitmap createBitmap2 = Bitmap.createBitmap(gm.L(26.0f), gm.L(26.0f), config);
            Canvas canvas2 = new Canvas(createBitmap2);
            canvas2.translate(createBitmap2.getWidth() / 2.0f, createBitmap2.getHeight() / 2.0f);
            float max5 = Math.max(createBitmap2.getWidth() / createBitmap.getWidth(), createBitmap2.getHeight() / createBitmap.getHeight());
            canvas2.scale(max5, max5);
            canvas2.drawBitmap(createBitmap, (-createBitmap.getWidth()) / 2.0f, (-createBitmap.getHeight()) / 2.0f, paint);
            gm.c3(new jy6(photoViewer, jo6Var2, str, createBitmap2, (byte) 20));
        } catch (Exception e) {
            fc4.g(e, true);
            gm.c3(new n88(photoViewer, (byte) 6));
        }
    }

    private final void m() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        Bitmap bitmap = (Bitmap) this.c;
        boolean[] zArr = (boolean[]) this.d;
        j88 j88Var = (j88) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        ImageView imageView = photoViewer.x3;
        if (imageView != null) {
            imageView.setImageBitmap(bitmap);
            photoViewer.x3.setVisibility(0);
            SurfaceView surfaceView = photoViewer.D2;
            if (surfaceView != null) {
                surfaceView.setVisibility(4);
            }
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            j88Var.run();
        }
    }

    private final void n() {
        PhotoViewer photoViewer = (PhotoViewer) this.b;
        jo6 jo6Var = (jo6) this.c;
        String str = (String) this.d;
        Bitmap bitmap = (Bitmap) this.e;
        Drawable[] drawableArr = PhotoViewer.d9;
        if (jo6Var.g != null) {
            try {
                new File(jo6Var.g).delete();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        jo6Var.d = -1L;
        jo6Var.g = str;
        jo6Var.e = null;
        jo6Var.f = null;
        photoViewer.p5.b.setLoading(false);
        pb8 pb8Var = photoViewer.d;
        if (pb8Var != null) {
            pb8Var.Y(photoViewer.O4);
        }
        y98 y98Var = photoViewer.h1;
        if (y98Var != null) {
            y98Var.setImage(bitmap);
        }
        photoViewer.o2(0);
        CheckBox checkBox = photoViewer.O0;
        if (checkBox.y) {
            return;
        }
        checkBox.callOnClick();
    }

    private final void o() {
        r98 r98Var = (r98) this.b;
        TLObject tLObject = (TLObject) this.c;
        z8c z8cVar = (z8c) this.d;
        TLRPC.Photo photo = (TLRPC.Photo) this.e;
        PhotoViewer photoViewer = r98Var.b;
        if (tLObject instanceof TLRPC.TL_photos_photo) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            int i = photoViewer.U;
            ArrayList arrayList = photoViewer.e7;
            oc7.r1(i).d4(tL_photos_photo.users, false);
            TLRPC.User W1 = oc7.r1(photoViewer.U).W1(Long.valueOf(z8cVar.n));
            if (tL_photos_photo.photo instanceof TLRPC.TL_photo) {
                int indexOf = arrayList.indexOf(photo);
                if (indexOf >= 0) {
                    arrayList.set(indexOf, tL_photos_photo.photo);
                }
                if (W1 != null) {
                    W1.photo.photo_id = tL_photos_photo.photo.id;
                    z8cVar.v(W1);
                    z8cVar.u(true);
                }
            }
        }
    }

    private final void p() {
        ((wh8) this.b).c0((TLRPC.TL_error) this.c, (TLObject) this.d, (TL_stars.updatePaidMessagesPrice) this.e);
    }

    private final void q() {
        cl8 cl8Var = (cl8) this.b;
        Bitmap[] bitmapArr = (Bitmap[]) this.c;
        g6b g6bVar = (g6b) this.d;
        boolean[] zArr = (boolean[]) this.e;
        sm0 sm0Var = cl8Var.H;
        Bitmap bitmap = cl8Var.a;
        if (bitmap != null && !bitmap.isRecycled()) {
            cl8Var.a.recycle();
        }
        Bitmap bitmap2 = bitmapArr[0];
        cl8Var.a = bitmap2;
        if (g6bVar != null && !g6bVar.c && g6bVar.K && bitmap2 != null) {
            g6bVar.k0 = bitmap2.getWidth();
            g6bVar.l0 = cl8Var.a.getHeight();
            g6bVar.z();
        }
        if (zArr[0] && g6bVar != null && sm0Var != null && cl8Var.a != null) {
            sm0Var.e();
            sm0Var.f(g6bVar.b(0.2f, cl8Var.a), false);
            f8b f8bVar = cl8Var.w;
            if (f8bVar != null) {
                f8bVar.run();
            }
        }
        cl8Var.r();
        cl8Var.invalidate();
    }

    private final void r() {
        ((PrivacyControlActivity) this.b).D0((TLRPC.TL_error) this.c, (TLObject) this.d, (boolean[]) this.e);
    }

    private final void s() {
        PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
        he heVar = (he) this.c;
        TLObject tLObject = (TLObject) this.d;
        TL_account.setAccountTTL setaccountttl = (TL_account.setAccountTTL) this.e;
        privacySettingsActivity.getClass();
        try {
            heVar.dismiss();
        } catch (Exception e) {
            fc4.g(e, true);
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            privacySettingsActivity.R = true;
            privacySettingsActivity.getContactsController().I = setaccountttl.ttl.days;
            privacySettingsActivity.a.f();
        }
    }

    private final void t() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        int[] iArr = (int[]) this.e;
        RectF rectF = ProfileActivity.e7;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            profileActivity.getClass();
            c41.b0(profileActivity).g0(tL_error, false);
        }
        if (profileActivity.w4 == iArr[0]) {
            profileActivity.w4 = 0;
        }
    }

    private final void u() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        TLObject tLObject = (TLObject) this.c;
        TLRPC.TL_username tL_username = (TLRPC.TL_username) this.d;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
        RectF rectF = ProfileActivity.e7;
        if (tLObject instanceof TL_fragment.TL_collectibleInfo) {
            yq4.a(profileActivity.getParentActivity(), 0, tL_username.username, profileActivity.e1 != 0 ? profileActivity.getMessagesController().W1(Long.valueOf(profileActivity.e1)) : profileActivity.getMessagesController().L0(Long.valueOf(profileActivity.f1)), (TL_fragment.TL_collectibleInfo) tLObject, profileActivity.A0);
        } else {
            c41.e0(tL_error);
        }
    }

    private final void v() {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        String[] strArr = (String[]) this.c;
        String str = (String) this.d;
        String str2 = (String) this.e;
        RectF rectF = ProfileActivity.e7;
        if (gm.C1(profileActivity.getParentActivity())) {
            s1c.Q0(profileActivity.getParentActivity(), profileActivity, strArr[0], str, str2, new k22(profileActivity, (byte) 6), null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Can't wrap try/catch for region: R(41:50|(6:51|52|(2:309|310)|54|(1:56)(1:308)|57)|(1:307)(2:60|(36:62|(1:64)(1:302)|(1:301)(2:67|(32:69|(1:71)(1:298)|(1:297)(2:74|(28:76|(1:78)(1:294)|(1:293)(2:81|(24:83|84|(6:222|223|(2:225|(12:227|228|229|230|231|232|(1:282)(5:236|237|238|239|240)|241|242|(1:276)(5:246|247|248|249|250)|251|(3:267|268|260)(6:255|256|257|258|259|260)))|288|268|260)(1:86)|87|(8:89|90|(1:92)(1:109)|93|94|95|(2:97|98)(2:100|101)|99)|111|112|(1:221)(1:118)|119|120|(2:(2:146|(1:148))(1:124)|125)(2:(7:154|155|(1:157)(6:209|210|211|212|213|214)|158|(5:162|(2:164|(1:165))|169|(1:171)(1:207)|(3:173|174|(2:176|177)))|208|(0))(1:152)|153)|(1:127)|128|(1:130)|(1:132)|133|(1:135)|(1:137)|138|139|140|141|107|108))|(1:292)|84|(0)(0)|87|(0)|111|112|(1:114)|221|119|120|(0)(0)|(0)|128|(0)|(0)|133|(0)|(0)|138|139|140|141|107|108))|(1:296)|(0)(0)|(0)|293|(0)|84|(0)(0)|87|(0)|111|112|(0)|221|119|120|(0)(0)|(0)|128|(0)|(0)|133|(0)|(0)|138|139|140|141|107|108))|(1:300)|(0)(0)|(0)|297|(0)|(0)(0)|(0)|293|(0)|84|(0)(0)|87|(0)|111|112|(0)|221|119|120|(0)(0)|(0)|128|(0)|(0)|133|(0)|(0)|138|139|140|141|107|108))|(1:304)(1:306)|305|(0)(0)|(0)|301|(0)|(0)(0)|(0)|297|(0)|(0)(0)|(0)|293|(0)|84|(0)(0)|87|(0)|111|112|(0)|221|119|120|(0)(0)|(0)|128|(0)|(0)|133|(0)|(0)|138|139|140|141|107|108) */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0621, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0623, code lost:
    
        fc4.g(r0, true);
        r27 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x0635, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0322 A[Catch: all -> 0x0638, TryCatch #17 {all -> 0x0638, blocks: (B:95:0x02f8, B:99:0x0304, B:112:0x0313, B:114:0x0322, B:116:0x032a, B:118:0x0332, B:124:0x033e, B:125:0x036b, B:146:0x0344, B:148:0x035b, B:150:0x0384), top: B:94:0x02f8 }] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x049b A[Catch: all -> 0x0635, TryCatch #15 {all -> 0x0635, blocks: (B:127:0x049b, B:128:0x04b8, B:130:0x04d5, B:132:0x04f3, B:133:0x0518, B:135:0x0598, B:137:0x05ba, B:138:0x05e3, B:145:0x0623, B:177:0x046e, B:181:0x0474, B:192:0x0495, B:199:0x062b, B:205:0x0634, B:204:0x0631, B:140:0x060a, B:186:0x0488, B:189:0x048d), top: B:120:0x0338, inners: #1, #3, #6, #10, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04d5 A[Catch: all -> 0x0635, TryCatch #15 {all -> 0x0635, blocks: (B:127:0x049b, B:128:0x04b8, B:130:0x04d5, B:132:0x04f3, B:133:0x0518, B:135:0x0598, B:137:0x05ba, B:138:0x05e3, B:145:0x0623, B:177:0x046e, B:181:0x0474, B:192:0x0495, B:199:0x062b, B:205:0x0634, B:204:0x0631, B:140:0x060a, B:186:0x0488, B:189:0x048d), top: B:120:0x0338, inners: #1, #3, #6, #10, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x04f3 A[Catch: all -> 0x0635, TryCatch #15 {all -> 0x0635, blocks: (B:127:0x049b, B:128:0x04b8, B:130:0x04d5, B:132:0x04f3, B:133:0x0518, B:135:0x0598, B:137:0x05ba, B:138:0x05e3, B:145:0x0623, B:177:0x046e, B:181:0x0474, B:192:0x0495, B:199:0x062b, B:205:0x0634, B:204:0x0631, B:140:0x060a, B:186:0x0488, B:189:0x048d), top: B:120:0x0338, inners: #1, #3, #6, #10, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0598 A[Catch: all -> 0x0635, TryCatch #15 {all -> 0x0635, blocks: (B:127:0x049b, B:128:0x04b8, B:130:0x04d5, B:132:0x04f3, B:133:0x0518, B:135:0x0598, B:137:0x05ba, B:138:0x05e3, B:145:0x0623, B:177:0x046e, B:181:0x0474, B:192:0x0495, B:199:0x062b, B:205:0x0634, B:204:0x0631, B:140:0x060a, B:186:0x0488, B:189:0x048d), top: B:120:0x0338, inners: #1, #3, #6, #10, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x05ba A[Catch: all -> 0x0635, TryCatch #15 {all -> 0x0635, blocks: (B:127:0x049b, B:128:0x04b8, B:130:0x04d5, B:132:0x04f3, B:133:0x0518, B:135:0x0598, B:137:0x05ba, B:138:0x05e3, B:145:0x0623, B:177:0x046e, B:181:0x0474, B:192:0x0495, B:199:0x062b, B:205:0x0634, B:204:0x0631, B:140:0x060a, B:186:0x0488, B:189:0x048d), top: B:120:0x0338, inners: #1, #3, #6, #10, #24 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x046e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x048d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:222:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x07c5  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x07da  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:389:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:395:0x091f  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x0922  */
    /* JADX WARN: Removed duplicated region for block: B:400:0x085c  */
    /* JADX WARN: Removed duplicated region for block: B:454:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0803  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x081e  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:463:0x07bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013d A[Catch: all -> 0x063e, TryCatch #23 {all -> 0x063e, blocks: (B:52:0x0090, B:54:0x00ad, B:56:0x0112, B:60:0x0126, B:64:0x013d, B:67:0x014b, B:71:0x015e, B:74:0x0168, B:78:0x017b, B:81:0x0185, B:84:0x0194, B:223:0x019c, B:225:0x01aa, B:229:0x01b7, B:232:0x01c9, B:234:0x01d3, B:236:0x01de, B:239:0x01eb, B:242:0x01fa, B:244:0x0202, B:246:0x020e, B:249:0x021e, B:251:0x022b, B:253:0x0233, B:255:0x023f, B:258:0x024e, B:87:0x028e, B:89:0x02e6, B:265:0x027a), top: B:51:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015e A[Catch: all -> 0x063e, TryCatch #23 {all -> 0x063e, blocks: (B:52:0x0090, B:54:0x00ad, B:56:0x0112, B:60:0x0126, B:64:0x013d, B:67:0x014b, B:71:0x015e, B:74:0x0168, B:78:0x017b, B:81:0x0185, B:84:0x0194, B:223:0x019c, B:225:0x01aa, B:229:0x01b7, B:232:0x01c9, B:234:0x01d3, B:236:0x01de, B:239:0x01eb, B:242:0x01fa, B:244:0x0202, B:246:0x020e, B:249:0x021e, B:251:0x022b, B:253:0x0233, B:255:0x023f, B:258:0x024e, B:87:0x028e, B:89:0x02e6, B:265:0x027a), top: B:51:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017b A[Catch: all -> 0x063e, TryCatch #23 {all -> 0x063e, blocks: (B:52:0x0090, B:54:0x00ad, B:56:0x0112, B:60:0x0126, B:64:0x013d, B:67:0x014b, B:71:0x015e, B:74:0x0168, B:78:0x017b, B:81:0x0185, B:84:0x0194, B:223:0x019c, B:225:0x01aa, B:229:0x01b7, B:232:0x01c9, B:234:0x01d3, B:236:0x01de, B:239:0x01eb, B:242:0x01fa, B:244:0x0202, B:246:0x020e, B:249:0x021e, B:251:0x022b, B:253:0x0233, B:255:0x023f, B:258:0x024e, B:87:0x028e, B:89:0x02e6, B:265:0x027a), top: B:51:0x0090 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02e6 A[Catch: all -> 0x063e, TRY_LEAVE, TryCatch #23 {all -> 0x063e, blocks: (B:52:0x0090, B:54:0x00ad, B:56:0x0112, B:60:0x0126, B:64:0x013d, B:67:0x014b, B:71:0x015e, B:74:0x0168, B:78:0x017b, B:81:0x0185, B:84:0x0194, B:223:0x019c, B:225:0x01aa, B:229:0x01b7, B:232:0x01c9, B:234:0x01d3, B:236:0x01de, B:239:0x01eb, B:242:0x01fa, B:244:0x0202, B:246:0x020e, B:249:0x021e, B:251:0x022b, B:253:0x0233, B:255:0x023f, B:258:0x024e, B:87:0x028e, B:89:0x02e6, B:265:0x027a), top: B:51:0x0090 }] */
    /* JADX WARN: Type inference failed for: r0v80, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r0v84, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r27v10 */
    /* JADX WARN: Type inference failed for: r27v11 */
    /* JADX WARN: Type inference failed for: r27v12 */
    /* JADX WARN: Type inference failed for: r27v13 */
    /* JADX WARN: Type inference failed for: r27v14 */
    /* JADX WARN: Type inference failed for: r27v15 */
    /* JADX WARN: Type inference failed for: r27v16 */
    /* JADX WARN: Type inference failed for: r27v17 */
    /* JADX WARN: Type inference failed for: r27v18 */
    /* JADX WARN: Type inference failed for: r27v19 */
    /* JADX WARN: Type inference failed for: r27v20 */
    /* JADX WARN: Type inference failed for: r27v21 */
    /* JADX WARN: Type inference failed for: r27v26 */
    /* JADX WARN: Type inference failed for: r27v27 */
    /* JADX WARN: Type inference failed for: r27v28 */
    /* JADX WARN: Type inference failed for: r27v29 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4 */
    /* JADX WARN: Type inference failed for: r27v5 */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r27v9 */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r28v2 */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r32v3 */
    /* JADX WARN: Type inference failed for: r32v7, types: [int] */
    /* JADX WARN: Type inference failed for: r32v9 */
    /* JADX WARN: Type inference failed for: r5v16, types: [int] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v45 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bitmap bitmap;
        Bundle bundle;
        mo5 mo5Var;
        boolean z;
        boolean z2;
        ArrayList arrayList;
        ArrayList arrayList2;
        CharSequence charSequence;
        char c;
        CharSequence charSequence2;
        int i;
        oc7 oc7Var;
        amb ambVar;
        Serializable serializable;
        String str;
        ?? r27;
        boolean z3;
        SparseIntArray R0;
        int i2;
        Bitmap a;
        Canvas canvas;
        Paint paint;
        int G0;
        int G02;
        int G03;
        int G04;
        int G05;
        int G06;
        int i3;
        ?? r5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        amb ambVar2;
        amb ambVar3;
        ?? r32;
        int i18;
        String queryParameter;
        int i19;
        amb ambVar4;
        int parseInt;
        SparseIntArray sparseIntArray;
        Drawable mutate;
        Drawable mutate2;
        Drawable mutate3;
        Drawable mutate4;
        int i20;
        int i21;
        FileInputStream fileInputStream;
        int i22;
        File file;
        boolean z4;
        int i23;
        Bitmap decodeStream;
        int i24;
        Drawable drawable;
        osc d;
        byte b = 5;
        switch (this.a) {
            case 0:
                Bitmap bitmap2 = null;
                trc trcVar = (trc) this.b;
                AtomicInteger atomicInteger = (AtomicInteger) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                if (atomicInteger.incrementAndGet() == arrayList3.size()) {
                    ArrayList arrayList5 = new ArrayList();
                    int i25 = 0;
                    while (i25 < arrayList4.size()) {
                        t76 t76Var = (t76) arrayList4.get(i25);
                        if (t76Var != null) {
                            try {
                                bitmap = (Bitmap) kke.a(t76Var);
                            } catch (CancellationException | ExecutionException e) {
                                synchronized (ncd.a) {
                                    Log.d("MediaSessionLegacyStub", ncd.a("Failed to get bitmap", e));
                                }
                            }
                            bt6 bt6Var = (bt6) arrayList3.get(i25);
                            int i26 = j26.a;
                            ?? r28 = !bt6Var.a.equals("") ? bitmap2 : bt6Var.a;
                            jt6 jt6Var = bt6Var.d;
                            Bitmap bitmap3 = bitmap == null ? bitmap : bitmap2;
                            bundle = jt6Var.K;
                            CharSequence charSequence3 = jt6Var.a;
                            CharSequence charSequence4 = jt6Var.g;
                            CharSequence charSequence5 = jt6Var.f;
                            mo5Var = jt6Var.L;
                            Integer num = jt6Var.J;
                            Integer num2 = jt6Var.q;
                            if (bundle != null) {
                                bundle = new Bundle(bundle);
                            }
                            z = num2 == null && num2.intValue() != -1;
                            z2 = num == null;
                            if (!z || z2) {
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                if (z) {
                                    arrayList = arrayList3;
                                    arrayList2 = arrayList4;
                                } else {
                                    num2.getClass();
                                    arrayList = arrayList3;
                                    arrayList2 = arrayList4;
                                    bundle.putLong("android.media.extra.BT_FOLDER_TYPE", j26.a(num2.intValue()));
                                }
                                if (z2) {
                                    num.getClass();
                                    bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
                                }
                            } else {
                                arrayList = arrayList3;
                                arrayList2 = arrayList4;
                            }
                            if (!mo5Var.isEmpty()) {
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(mo5Var));
                            }
                            charSequence = jt6Var.e;
                            if (charSequence == null) {
                                if (bundle == null) {
                                    bundle = new Bundle();
                                }
                                bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence3);
                            } else {
                                CharSequence[] charSequenceArr = new CharSequence[3];
                                int i27 = 0;
                                int i28 = 0;
                                while (i27 < 3) {
                                    String[] strArr = lt6.d;
                                    if (i28 < strArr.length) {
                                        int i29 = i28 + 1;
                                        String str2 = strArr[i28];
                                        str2.getClass();
                                        switch (str2.hashCode()) {
                                            case -1853648227:
                                                if (str2.equals("android.media.metadata.ARTIST")) {
                                                    c = 0;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1850878751:
                                                if (str2.equals("android.media.metadata.AUTHOR")) {
                                                    c = 1;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case -1224124471:
                                                if (str2.equals("android.media.metadata.WRITER")) {
                                                    c = 2;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 194702059:
                                                if (str2.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                                    c = 3;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1058837545:
                                                if (str2.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                                    c = 4;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1684534006:
                                                if (str2.equals("android.media.metadata.COMPOSER")) {
                                                    c = 5;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1879671865:
                                                if (str2.equals("android.media.metadata.ALBUM")) {
                                                    c = 6;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1897146402:
                                                if (str2.equals("android.media.metadata.TITLE")) {
                                                    c = 7;
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            case 1965214221:
                                                if (str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                    c = '\b';
                                                    break;
                                                }
                                                c = 65535;
                                                break;
                                            default:
                                                c = 65535;
                                                break;
                                        }
                                        switch (c) {
                                            case 0:
                                                charSequence2 = jt6Var.b;
                                                break;
                                            case 1:
                                            default:
                                                charSequence2 = null;
                                                break;
                                            case 2:
                                                charSequence2 = jt6Var.A;
                                                break;
                                            case 3:
                                                charSequence2 = charSequence5;
                                                break;
                                            case 4:
                                                charSequence2 = charSequence4;
                                                break;
                                            case 5:
                                                charSequence2 = jt6Var.B;
                                                break;
                                            case 6:
                                                charSequence2 = jt6Var.c;
                                                break;
                                            case 7:
                                                charSequence2 = charSequence3;
                                                break;
                                            case '\b':
                                                charSequence2 = jt6Var.d;
                                                break;
                                        }
                                        if (!TextUtils.isEmpty(charSequence2)) {
                                            charSequenceArr[i27] = charSequence2;
                                            i27++;
                                        }
                                        i28 = i29;
                                    } else {
                                        charSequence = charSequenceArr[0];
                                        charSequence5 = charSequenceArr[1];
                                        charSequence4 = charSequenceArr[2];
                                    }
                                }
                                charSequence = charSequenceArr[0];
                                charSequence5 = charSequenceArr[1];
                                charSequence4 = charSequenceArr[2];
                            }
                            arrayList5.add(new jx6(new ks6(r28, charSequence, charSequence5, charSequence4, bitmap3, jt6Var.n, bundle, bt6Var.f.a), i25 != -1 ? -1L : i25));
                            i25++;
                            arrayList4 = arrayList2;
                            arrayList3 = arrayList;
                            bitmap2 = null;
                        }
                        bitmap = bitmap2;
                        bt6 bt6Var2 = (bt6) arrayList3.get(i25);
                        int i262 = j26.a;
                        if (!bt6Var2.a.equals("")) {
                        }
                        jt6 jt6Var2 = bt6Var2.d;
                        if (bitmap == null) {
                        }
                        bundle = jt6Var2.K;
                        CharSequence charSequence32 = jt6Var2.a;
                        CharSequence charSequence42 = jt6Var2.g;
                        CharSequence charSequence52 = jt6Var2.f;
                        mo5Var = jt6Var2.L;
                        Integer num3 = jt6Var2.J;
                        Integer num22 = jt6Var2.q;
                        if (bundle != null) {
                        }
                        if (num22 == null) {
                        }
                        if (num3 == null) {
                        }
                        if (z) {
                        }
                        if (bundle == null) {
                        }
                        if (z) {
                        }
                        if (z2) {
                        }
                        if (!mo5Var.isEmpty()) {
                        }
                        charSequence = jt6Var2.e;
                        if (charSequence == null) {
                        }
                        arrayList5.add(new jx6(new ks6(r28, charSequence, charSequence52, charSequence42, bitmap3, jt6Var2.n, bundle, bt6Var2.f.a), i25 != -1 ? -1L : i25));
                        i25++;
                        arrayList4 = arrayList2;
                        arrayList3 = arrayList;
                        bitmap2 = null;
                    }
                    ((ly6) trcVar.e).p.Q(arrayList5);
                    return;
                }
                return;
            case 1:
                tx6 tx6Var = (tx6) this.b;
                jz6 jz6Var = (jz6) this.c;
                sw6 sw6Var = (sw6) this.d;
                List list = (List) this.e;
                if (tx6Var.i()) {
                    return;
                }
                tx6Var.t();
                jz6Var.a(tx6Var.t, sw6Var, list);
                return;
            case 2:
                oz6 oz6Var = (oz6) this.b;
                tx6 tx6Var2 = (tx6) this.c;
                sw6 sw6Var2 = (sw6) this.d;
                dk5 dk5Var = (dk5) this.e;
                if (tx6Var2.i()) {
                    oz6Var.c.remove(sw6Var2);
                    zve.a(dk5Var);
                    return;
                }
                t76 l = tx6Var2.l(sw6Var2);
                e7a e7aVar = new e7a();
                e7aVar.d = oz6Var;
                e7aVar.a = sw6Var2;
                e7aVar.b = tx6Var2;
                e7aVar.c = dk5Var;
                l.b(new us4((Object) l, (Object) e7aVar, (byte) 0), new rf2(oz6Var, b));
                return;
            case 3:
                tx6 tx6Var3 = (tx6) this.b;
                q9a q9aVar = (q9a) this.c;
                fu2 fu2Var = (fu2) this.d;
                t76 t76Var2 = (t76) this.e;
                if (tx6Var3.i()) {
                    q9aVar.l(null);
                    return;
                }
                try {
                    fu2Var.accept(t76Var2);
                    q9aVar.l(null);
                    return;
                } catch (Throwable th) {
                    q9aVar.m(th);
                    return;
                }
            case 4:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                b61 b61Var = (b61) this.c;
                p71 p71Var = (p71) this.d;
                Runnable runnable = (Runnable) this.e;
                if (tL_error != null) {
                    c41.Y().g0(tL_error, false);
                    return;
                }
                b61Var.setLoading(false);
                p71Var.dismiss();
                ts2.u(null, 2131746778, c41.Y(), R.raw.chats_infotip, 36);
                runnable.run();
                return;
            case 5:
                q67 q67Var = (q67) this.b;
                nl1 nl1Var = (nl1) this.c;
                String str3 = (String) this.d;
                wza wzaVar = (wza) this.e;
                t67 t67Var = q67Var.w.d;
                if (nl1Var != null) {
                    t67Var.w.l(str3, nl1Var);
                    if (!wzaVar.b && (i = wzaVar.a) >= 0) {
                        View m = t67Var.h.m(i);
                        if (m instanceof gza) {
                            q67Var.r.e = nl1Var;
                            gza gzaVar = (gza) m;
                            gzaVar.b.u0.d(false, false);
                            gzaVar.g(false);
                        }
                    }
                }
                q67Var.f();
                return;
            case 6:
                oc7 oc7Var2 = (oc7) this.b;
                String str4 = (String) this.c;
                amb ambVar5 = (amb) this.d;
                bmb bmbVar = (bmb) this.e;
                int i30 = cmb.a;
                try {
                    String[] strArr2 = new String[1];
                    R0 = cmb.R0(new File(str4), null, strArr2);
                    if (ambVar5 != null) {
                        try {
                            cmb.G(R0, ambVar5.b);
                        } catch (Throwable th2) {
                            th = th2;
                            oc7Var = oc7Var2;
                            r27 = str4;
                            ambVar = ambVar5;
                            z3 = true;
                            fc4.g(th, z3);
                            Serializable serializable2 = r27;
                            str = null;
                            serializable = serializable2;
                            gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                            return;
                        }
                    }
                    i2 = cmb.jm.get(cmb.f5, -1);
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    a = ld1.a(560, 678);
                    canvas = new Canvas(a);
                    paint = new Paint();
                    G0 = cmb.G0(R0, cmb.r8);
                    G02 = cmb.G0(R0, cmb.u8);
                    G03 = cmb.G0(R0, cmb.Ie);
                    G04 = cmb.G0(R0, cmb.Ne);
                    G05 = cmb.G0(R0, cmb.qa);
                    G06 = cmb.G0(R0, cmb.qb);
                    R0.get(cmb.tb);
                    i3 = R0.get(cmb.De);
                    r5 = R0.get(cmb.Ee);
                    i4 = R0.get(cmb.Fe);
                    int i31 = R0.get(cmb.Ge);
                    if (ambVar5 != null) {
                        i5 = i31;
                        r27 = strArr2;
                        i6 = (int) ambVar5.j;
                    } else {
                        i5 = i31;
                        r27 = strArr2;
                        i6 = 0;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    oc7Var = oc7Var2;
                }
                if (i6 != 0 || ambVar5 == null) {
                    i7 = i6;
                } else {
                    i7 = i6;
                    if (ambVar5.j != 0) {
                        i8 = 0;
                        if (ambVar5 == null) {
                            i9 = i8;
                            i10 = (int) ambVar5.k;
                        } else {
                            i9 = i8;
                            i10 = 0;
                        }
                        if (i10 == 0 || ambVar5 == null) {
                            i11 = i10;
                        } else {
                            i11 = i10;
                            if (ambVar5.k != 0) {
                                r5 = 0;
                                i12 = ambVar5 != null ? (int) ambVar5.l : 0;
                                if (i12 == 0 || ambVar5 == null) {
                                    i13 = i12;
                                } else {
                                    i13 = i12;
                                    if (ambVar5.l != 0) {
                                        i13 = 0;
                                        i14 = ambVar5 == null ? (int) ambVar5.m : 0;
                                        if (i14 == 0 || ambVar5 == null) {
                                            i15 = i14;
                                        } else {
                                            i15 = i14;
                                            if (ambVar5.m != 0) {
                                                i15 = 0;
                                                if (TextUtils.isEmpty(r27[0])) {
                                                    ambVar = r5 == true ? 1 : 0;
                                                    i16 = i2;
                                                    i17 = i9;
                                                    i18 = i15;
                                                    r32 = ambVar;
                                                } else {
                                                    try {
                                                        queryParameter = Uri.parse(r27[0]).getQueryParameter("bg_color");
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        i16 = i2;
                                                        i17 = i9;
                                                        ambVar2 = r5;
                                                    }
                                                    if (ambVar5 != null) {
                                                        if (!TextUtils.isEmpty(queryParameter)) {
                                                            ambVar = r5 == true ? 1 : 0;
                                                            i19 = i15;
                                                            try {
                                                                parseInt = Integer.parseInt(queryParameter.substring(0, 6), 16) | (-16777216);
                                                                i16 = i2;
                                                                try {
                                                                    ambVar5.j = parseInt;
                                                                    if (queryParameter.length() < 13 || !gm.Q1(queryParameter.charAt(6))) {
                                                                        sparseIntArray = R0;
                                                                    } else {
                                                                        int parseInt2 = Integer.parseInt(queryParameter.substring(7, 13), 16) | (-16777216);
                                                                        sparseIntArray = R0;
                                                                        try {
                                                                            ambVar5.k = parseInt2 == true ? 1L : 0L;
                                                                            ambVar = parseInt2 == true ? 1 : 0;
                                                                        } catch (Exception e3) {
                                                                            e = e3;
                                                                            i17 = parseInt;
                                                                            ambVar4 = parseInt2 == true ? 1 : 0;
                                                                            R0 = sparseIntArray;
                                                                            i15 = i19;
                                                                            ambVar2 = ambVar4;
                                                                            fc4.g(e, true);
                                                                            ambVar3 = ambVar2;
                                                                            r32 = ambVar3;
                                                                            i18 = i15;
                                                                            mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                            cmb.A1(G02, mutate);
                                                                            mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                            cmb.A1(G02, mutate2);
                                                                            mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                            cmb.A1(G04, mutate3);
                                                                            mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                            cmb.A1(G04, mutate4);
                                                                            SparseIntArray sparseIntArray2 = R0;
                                                                            m37[] m37VarArr = new m37[2];
                                                                            i21 = 0;
                                                                            for (i20 = 2; i21 < i20; i20 = 2) {
                                                                            }
                                                                            m37[] m37VarArr2 = m37VarArr;
                                                                            Bitmap bitmap4 = a;
                                                                            oc7Var = oc7Var2;
                                                                            SparseIntArray sparseIntArray3 = sparseIntArray2;
                                                                            RectF rectF = new RectF();
                                                                            if (ambVar5 != null) {
                                                                            }
                                                                            if (i17 == 0) {
                                                                            }
                                                                            if (!z4) {
                                                                            }
                                                                            paint.setColor(G0);
                                                                            canvas.drawRect(0.0f, 0.0f, bitmap4.getWidth(), 120.0f, paint);
                                                                            if (mutate != null) {
                                                                            }
                                                                            if (mutate2 != null) {
                                                                            }
                                                                            m37VarArr2[1].setBounds(nm7.q2, nm7.s3, bitmap4.getWidth() - 20, nm7.e5);
                                                                            m37VarArr2[1].o(0, 560, 522);
                                                                            m37VarArr2[1].draw(canvas);
                                                                            m37VarArr2[1].setBounds(nm7.q2, 430, bitmap4.getWidth() - 20, 522);
                                                                            m37VarArr2[1].o(430, 560, 522);
                                                                            m37VarArr2[1].draw(canvas);
                                                                            m37VarArr2[0].setBounds(20, nm7.t5, 399, 415);
                                                                            m37VarArr2[0].o(nm7.t5, 560, 522);
                                                                            m37VarArr2[0].draw(canvas);
                                                                            paint.setColor(G03);
                                                                            canvas.drawRect(0.0f, bitmap4.getHeight() - nm7.E1, bitmap4.getWidth(), bitmap4.getHeight(), paint);
                                                                            if (mutate3 != null) {
                                                                            }
                                                                            if (mutate4 != null) {
                                                                            }
                                                                            canvas.setBitmap(null);
                                                                            File file2 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".jpg");
                                                                            bitmap4.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2));
                                                                            gda.x();
                                                                            str = file2.getAbsolutePath();
                                                                            serializable = r27;
                                                                            gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                                                                            return;
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (queryParameter.length() < 20 || !gm.Q1(queryParameter.charAt(13))) {
                                                                            R0 = sparseIntArray;
                                                                        } else {
                                                                            int parseInt3 = Integer.parseInt(queryParameter.substring(14, 20), 16) | (-16777216);
                                                                            R0 = sparseIntArray;
                                                                            try {
                                                                                ambVar5.l = parseInt3;
                                                                                i13 = parseInt3;
                                                                            } catch (Exception e4) {
                                                                                e = e4;
                                                                                i13 = parseInt3;
                                                                                i17 = parseInt;
                                                                                ambVar4 = ambVar;
                                                                                i15 = i19;
                                                                                ambVar2 = ambVar4;
                                                                                fc4.g(e, true);
                                                                                ambVar3 = ambVar2;
                                                                                r32 = ambVar3;
                                                                                i18 = i15;
                                                                                mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                                cmb.A1(G02, mutate);
                                                                                mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                                cmb.A1(G02, mutate2);
                                                                                mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                                cmb.A1(G04, mutate3);
                                                                                mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                                cmb.A1(G04, mutate4);
                                                                                SparseIntArray sparseIntArray22 = R0;
                                                                                m37[] m37VarArr3 = new m37[2];
                                                                                i21 = 0;
                                                                                while (i21 < i20) {
                                                                                }
                                                                                m37[] m37VarArr22 = m37VarArr3;
                                                                                Bitmap bitmap42 = a;
                                                                                oc7Var = oc7Var2;
                                                                                SparseIntArray sparseIntArray32 = sparseIntArray22;
                                                                                RectF rectF2 = new RectF();
                                                                                if (ambVar5 != null) {
                                                                                }
                                                                                if (i17 == 0) {
                                                                                }
                                                                                if (!z4) {
                                                                                }
                                                                                paint.setColor(G0);
                                                                                canvas.drawRect(0.0f, 0.0f, bitmap42.getWidth(), 120.0f, paint);
                                                                                if (mutate != null) {
                                                                                }
                                                                                if (mutate2 != null) {
                                                                                }
                                                                                m37VarArr22[1].setBounds(nm7.q2, nm7.s3, bitmap42.getWidth() - 20, nm7.e5);
                                                                                m37VarArr22[1].o(0, 560, 522);
                                                                                m37VarArr22[1].draw(canvas);
                                                                                m37VarArr22[1].setBounds(nm7.q2, 430, bitmap42.getWidth() - 20, 522);
                                                                                m37VarArr22[1].o(430, 560, 522);
                                                                                m37VarArr22[1].draw(canvas);
                                                                                m37VarArr22[0].setBounds(20, nm7.t5, 399, 415);
                                                                                m37VarArr22[0].o(nm7.t5, 560, 522);
                                                                                m37VarArr22[0].draw(canvas);
                                                                                paint.setColor(G03);
                                                                                canvas.drawRect(0.0f, bitmap42.getHeight() - nm7.E1, bitmap42.getWidth(), bitmap42.getHeight(), paint);
                                                                                if (mutate3 != null) {
                                                                                }
                                                                                if (mutate4 != null) {
                                                                                }
                                                                                canvas.setBitmap(null);
                                                                                File file22 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".jpg");
                                                                                bitmap42.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file22));
                                                                                gda.x();
                                                                                str = file22.getAbsolutePath();
                                                                                serializable = r27;
                                                                                gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                                                                                return;
                                                                            }
                                                                        }
                                                                    } catch (Exception e5) {
                                                                        e = e5;
                                                                        R0 = sparseIntArray;
                                                                    }
                                                                } catch (Exception e6) {
                                                                    e = e6;
                                                                }
                                                            } catch (Exception e7) {
                                                                e = e7;
                                                                i16 = i2;
                                                                i17 = i9;
                                                            }
                                                            if (queryParameter.length() == 27 && gm.Q1(queryParameter.charAt(20))) {
                                                                i15 = Integer.parseInt(queryParameter.substring(21), 16) | (-16777216);
                                                                try {
                                                                    ambVar5.m = i15;
                                                                    i17 = parseInt;
                                                                    ambVar3 = ambVar;
                                                                } catch (Exception e8) {
                                                                    e = e8;
                                                                    i17 = parseInt;
                                                                    ambVar2 = ambVar;
                                                                    fc4.g(e, true);
                                                                    ambVar3 = ambVar2;
                                                                    r32 = ambVar3;
                                                                    i18 = i15;
                                                                    mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                                    cmb.A1(G02, mutate);
                                                                    mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                                    cmb.A1(G02, mutate2);
                                                                    mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                                    cmb.A1(G04, mutate3);
                                                                    mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                                    cmb.A1(G04, mutate4);
                                                                    SparseIntArray sparseIntArray222 = R0;
                                                                    m37[] m37VarArr32 = new m37[2];
                                                                    i21 = 0;
                                                                    while (i21 < i20) {
                                                                    }
                                                                    m37[] m37VarArr222 = m37VarArr32;
                                                                    Bitmap bitmap422 = a;
                                                                    oc7Var = oc7Var2;
                                                                    SparseIntArray sparseIntArray322 = sparseIntArray222;
                                                                    RectF rectF22 = new RectF();
                                                                    if (ambVar5 != null) {
                                                                    }
                                                                    if (i17 == 0) {
                                                                    }
                                                                    if (!z4) {
                                                                    }
                                                                    paint.setColor(G0);
                                                                    canvas.drawRect(0.0f, 0.0f, bitmap422.getWidth(), 120.0f, paint);
                                                                    if (mutate != null) {
                                                                    }
                                                                    if (mutate2 != null) {
                                                                    }
                                                                    m37VarArr222[1].setBounds(nm7.q2, nm7.s3, bitmap422.getWidth() - 20, nm7.e5);
                                                                    m37VarArr222[1].o(0, 560, 522);
                                                                    m37VarArr222[1].draw(canvas);
                                                                    m37VarArr222[1].setBounds(nm7.q2, 430, bitmap422.getWidth() - 20, 522);
                                                                    m37VarArr222[1].o(430, 560, 522);
                                                                    m37VarArr222[1].draw(canvas);
                                                                    m37VarArr222[0].setBounds(20, nm7.t5, 399, 415);
                                                                    m37VarArr222[0].o(nm7.t5, 560, 522);
                                                                    m37VarArr222[0].draw(canvas);
                                                                    paint.setColor(G03);
                                                                    canvas.drawRect(0.0f, bitmap422.getHeight() - nm7.E1, bitmap422.getWidth(), bitmap422.getHeight(), paint);
                                                                    if (mutate3 != null) {
                                                                    }
                                                                    if (mutate4 != null) {
                                                                    }
                                                                    canvas.setBitmap(null);
                                                                    File file222 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".jpg");
                                                                    bitmap422.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file222));
                                                                    gda.x();
                                                                    str = file222.getAbsolutePath();
                                                                    serializable = r27;
                                                                    gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                                                                    return;
                                                                }
                                                                r32 = ambVar3;
                                                                i18 = i15;
                                                            } else {
                                                                i17 = parseInt;
                                                                ambVar3 = ambVar;
                                                                i15 = i19;
                                                                r32 = ambVar3;
                                                                i18 = i15;
                                                            }
                                                        }
                                                    }
                                                    ambVar = r5 == true ? 1 : 0;
                                                    i19 = i15;
                                                    i16 = i2;
                                                    i17 = i9;
                                                    ambVar3 = ambVar;
                                                    i15 = i19;
                                                    r32 = ambVar3;
                                                    i18 = i15;
                                                }
                                                mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                                cmb.A1(G02, mutate);
                                                mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                                cmb.A1(G02, mutate2);
                                                mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                                cmb.A1(G04, mutate3);
                                                mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                                cmb.A1(G04, mutate4);
                                                SparseIntArray sparseIntArray2222 = R0;
                                                m37[] m37VarArr322 = new m37[2];
                                                i21 = 0;
                                                while (i21 < i20) {
                                                    m37[] m37VarArr4 = m37VarArr322;
                                                    Bitmap bitmap5 = a;
                                                    oc7Var = oc7Var2;
                                                    SparseIntArray sparseIntArray4 = sparseIntArray2222;
                                                    try {
                                                        plb plbVar = new plb(i21 == 1, sparseIntArray4, (byte) 0);
                                                        m37VarArr4[i21] = plbVar;
                                                        cmb.A1(i21 == 0 ? G05 : G06, plbVar);
                                                        i21++;
                                                        sparseIntArray2222 = sparseIntArray4;
                                                        m37VarArr322 = m37VarArr4;
                                                        oc7Var2 = oc7Var;
                                                        a = bitmap5;
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        r27 = str4;
                                                        ambVar = ambVar5;
                                                        z3 = true;
                                                        fc4.g(th, z3);
                                                        Serializable serializable22 = r27;
                                                        str = null;
                                                        serializable = serializable22;
                                                        gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                                                        return;
                                                    }
                                                }
                                                m37[] m37VarArr2222 = m37VarArr322;
                                                Bitmap bitmap4222 = a;
                                                oc7Var = oc7Var2;
                                                SparseIntArray sparseIntArray3222 = sparseIntArray2222;
                                                RectF rectF222 = new RectF();
                                                Bitmap bitmap6 = (ambVar5 != null || TextUtils.isEmpty(ambVar5.o) || (d = btc.d(ambVar5.o)) == null) ? null : d.a;
                                                if (i17 == 0) {
                                                    if (r32 == 0 && bitmap6 == null) {
                                                        drawable = new ColorDrawable(i17);
                                                    } else {
                                                        sparseIntArray3222.get(cmb.He, -1);
                                                        ah7 ah7Var = new ah7(i17, r32, i13, i18, true, false);
                                                        drawable = ah7Var;
                                                        if (bitmap6 != null) {
                                                            ah7Var.r((int) (ambVar5.p * 100.0f), bitmap6);
                                                            ah7Var.s(ah7Var.f());
                                                            drawable = ah7Var;
                                                        }
                                                    }
                                                    drawable.setBounds(0, nm7.E1, bitmap4222.getWidth(), bitmap4222.getHeight() - nm7.E1);
                                                    drawable.draw(canvas);
                                                    r27 = str4;
                                                    ambVar = ambVar5;
                                                    z4 = true;
                                                } else {
                                                    if (i16 >= 0 || !TextUtils.isEmpty(r27[0])) {
                                                        try {
                                                            BitmapFactory.Options options = new BitmapFactory.Options();
                                                            options.inJustDecodeBounds = true;
                                                            if (TextUtils.isEmpty(r27[0])) {
                                                                fileInputStream = new FileInputStream(str4);
                                                                try {
                                                                    r27 = str4;
                                                                    ambVar = ambVar5;
                                                                    i22 = i16;
                                                                    try {
                                                                        fileInputStream.getChannel().position(i22);
                                                                        BitmapFactory.decodeStream(fileInputStream, null, options);
                                                                        file = null;
                                                                        r27 = r27;
                                                                    } catch (Throwable th5) {
                                                                        th = th5;
                                                                        z3 = true;
                                                                        try {
                                                                            fc4.g(th, true);
                                                                            r27 = r27;
                                                                            if (fileInputStream != null) {
                                                                                try {
                                                                                    fileInputStream.close();
                                                                                    r27 = r27;
                                                                                } catch (Exception e9) {
                                                                                    fc4.g(e9, true);
                                                                                    r27 = r27;
                                                                                } catch (Throwable th6) {
                                                                                    th = th6;
                                                                                    fc4.g(th, z3);
                                                                                    Serializable serializable222 = r27;
                                                                                    str = null;
                                                                                    serializable = serializable222;
                                                                                    gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                                                                                    return;
                                                                                }
                                                                            }
                                                                            z4 = false;
                                                                            if (!z4) {
                                                                            }
                                                                            paint.setColor(G0);
                                                                            canvas.drawRect(0.0f, 0.0f, bitmap4222.getWidth(), 120.0f, paint);
                                                                            if (mutate != null) {
                                                                            }
                                                                            if (mutate2 != null) {
                                                                            }
                                                                            m37VarArr2222[1].setBounds(nm7.q2, nm7.s3, bitmap4222.getWidth() - 20, nm7.e5);
                                                                            m37VarArr2222[1].o(0, 560, 522);
                                                                            m37VarArr2222[1].draw(canvas);
                                                                            m37VarArr2222[1].setBounds(nm7.q2, 430, bitmap4222.getWidth() - 20, 522);
                                                                            m37VarArr2222[1].o(430, 560, 522);
                                                                            m37VarArr2222[1].draw(canvas);
                                                                            m37VarArr2222[0].setBounds(20, nm7.t5, 399, 415);
                                                                            m37VarArr2222[0].o(nm7.t5, 560, 522);
                                                                            m37VarArr2222[0].draw(canvas);
                                                                            paint.setColor(G03);
                                                                            canvas.drawRect(0.0f, bitmap4222.getHeight() - nm7.E1, bitmap4222.getWidth(), bitmap4222.getHeight(), paint);
                                                                            if (mutate3 != null) {
                                                                            }
                                                                            if (mutate4 != null) {
                                                                            }
                                                                            canvas.setBitmap(null);
                                                                            File file2222 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".jpg");
                                                                            bitmap4222.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2222));
                                                                            gda.x();
                                                                            str = file2222.getAbsolutePath();
                                                                            serializable = r27;
                                                                            gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                                                                            return;
                                                                        } finally {
                                                                        }
                                                                    }
                                                                } catch (Throwable th7) {
                                                                    th = th7;
                                                                    r27 = str4;
                                                                    ambVar = ambVar5;
                                                                    z3 = true;
                                                                    fc4.g(th, true);
                                                                    r27 = r27;
                                                                    if (fileInputStream != null) {
                                                                    }
                                                                    z4 = false;
                                                                    if (!z4) {
                                                                    }
                                                                    paint.setColor(G0);
                                                                    canvas.drawRect(0.0f, 0.0f, bitmap4222.getWidth(), 120.0f, paint);
                                                                    if (mutate != null) {
                                                                    }
                                                                    if (mutate2 != null) {
                                                                    }
                                                                    m37VarArr2222[1].setBounds(nm7.q2, nm7.s3, bitmap4222.getWidth() - 20, nm7.e5);
                                                                    m37VarArr2222[1].o(0, 560, 522);
                                                                    m37VarArr2222[1].draw(canvas);
                                                                    m37VarArr2222[1].setBounds(nm7.q2, 430, bitmap4222.getWidth() - 20, 522);
                                                                    m37VarArr2222[1].o(430, 560, 522);
                                                                    m37VarArr2222[1].draw(canvas);
                                                                    m37VarArr2222[0].setBounds(20, nm7.t5, 399, 415);
                                                                    m37VarArr2222[0].o(nm7.t5, 560, 522);
                                                                    m37VarArr2222[0].draw(canvas);
                                                                    paint.setColor(G03);
                                                                    canvas.drawRect(0.0f, bitmap4222.getHeight() - nm7.E1, bitmap4222.getWidth(), bitmap4222.getHeight(), paint);
                                                                    if (mutate3 != null) {
                                                                    }
                                                                    if (mutate4 != null) {
                                                                    }
                                                                    canvas.setBitmap(null);
                                                                    File file22222 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".jpg");
                                                                    bitmap4222.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file22222));
                                                                    gda.x();
                                                                    str = file22222.getAbsolutePath();
                                                                    serializable = r27;
                                                                    gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                                                                    return;
                                                                }
                                                            } else {
                                                                File d2 = usc.d(r27[0]);
                                                                BitmapFactory.decodeFile(d2.getAbsolutePath(), options);
                                                                file = d2;
                                                                r27 = str4;
                                                                ambVar = ambVar5;
                                                                i22 = i16;
                                                                fileInputStream = null;
                                                            }
                                                            int i32 = options.outWidth;
                                                            if (i32 > 0 && (i23 = options.outHeight) > 0) {
                                                                float min = Math.min(i32 / 560.0f, i23 / 560.0f);
                                                                options.inSampleSize = 1;
                                                                if (min > 1.0f) {
                                                                    do {
                                                                        i24 = options.inSampleSize << 1;
                                                                        options.inSampleSize = i24;
                                                                    } while (i24 < min);
                                                                }
                                                                options.inJustDecodeBounds = false;
                                                                if (file != null) {
                                                                    decodeStream = BitmapFactory.decodeFile(file.getAbsolutePath(), options);
                                                                } else {
                                                                    fileInputStream.getChannel().position(i22);
                                                                    decodeStream = BitmapFactory.decodeStream(fileInputStream, null, options);
                                                                }
                                                                if (decodeStream != null) {
                                                                    Paint paint2 = new Paint();
                                                                    paint2.setFilterBitmap(true);
                                                                    float min2 = Math.min(decodeStream.getWidth() / 560.0f, decodeStream.getHeight() / 560.0f);
                                                                    rectF222.set(0.0f, 0.0f, decodeStream.getWidth() / min2, decodeStream.getHeight() / min2);
                                                                    rectF222.offset((bitmap4222.getWidth() - rectF222.width()) / 2.0f, (bitmap4222.getHeight() - rectF222.height()) / 2.0f);
                                                                    canvas.drawBitmap(decodeStream, (Rect) null, rectF222, paint2);
                                                                    z4 = true;
                                                                    if (fileInputStream != null) {
                                                                        try {
                                                                            fileInputStream.close();
                                                                        } catch (Exception e10) {
                                                                            fc4.g(e10, true);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            z4 = false;
                                                            if (fileInputStream != null) {
                                                            }
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            r27 = str4;
                                                            ambVar = ambVar5;
                                                            fileInputStream = null;
                                                        }
                                                    } else {
                                                        r27 = str4;
                                                        ambVar = ambVar5;
                                                    }
                                                    z4 = false;
                                                }
                                                if (!z4) {
                                                    ah7 R = cmb.R(bitmap4222.getWidth(), bitmap4222.getHeight() - nm7.E1);
                                                    R.setBounds(0, nm7.E1, bitmap4222.getWidth(), bitmap4222.getHeight() - nm7.E1);
                                                    R.draw(canvas);
                                                }
                                                paint.setColor(G0);
                                                canvas.drawRect(0.0f, 0.0f, bitmap4222.getWidth(), 120.0f, paint);
                                                if (mutate != null) {
                                                    int intrinsicHeight = (120 - mutate.getIntrinsicHeight()) / 2;
                                                    mutate.setBounds(13, intrinsicHeight, mutate.getIntrinsicWidth() + 13, mutate.getIntrinsicHeight() + intrinsicHeight);
                                                    mutate.draw(canvas);
                                                }
                                                if (mutate2 != null) {
                                                    int width = (bitmap4222.getWidth() - mutate2.getIntrinsicWidth()) - 10;
                                                    int intrinsicHeight2 = (120 - mutate2.getIntrinsicHeight()) / 2;
                                                    mutate2.setBounds(width, intrinsicHeight2, mutate2.getIntrinsicWidth() + width, mutate2.getIntrinsicHeight() + intrinsicHeight2);
                                                    mutate2.draw(canvas);
                                                }
                                                m37VarArr2222[1].setBounds(nm7.q2, nm7.s3, bitmap4222.getWidth() - 20, nm7.e5);
                                                m37VarArr2222[1].o(0, 560, 522);
                                                m37VarArr2222[1].draw(canvas);
                                                m37VarArr2222[1].setBounds(nm7.q2, 430, bitmap4222.getWidth() - 20, 522);
                                                m37VarArr2222[1].o(430, 560, 522);
                                                m37VarArr2222[1].draw(canvas);
                                                m37VarArr2222[0].setBounds(20, nm7.t5, 399, 415);
                                                m37VarArr2222[0].o(nm7.t5, 560, 522);
                                                m37VarArr2222[0].draw(canvas);
                                                paint.setColor(G03);
                                                canvas.drawRect(0.0f, bitmap4222.getHeight() - nm7.E1, bitmap4222.getWidth(), bitmap4222.getHeight(), paint);
                                                if (mutate3 != null) {
                                                    int height = (bitmap4222.getHeight() - nm7.E1) + ((120 - mutate3.getIntrinsicHeight()) / 2);
                                                    mutate3.setBounds(22, height, mutate3.getIntrinsicWidth() + 22, mutate3.getIntrinsicHeight() + height);
                                                    mutate3.draw(canvas);
                                                }
                                                if (mutate4 != null) {
                                                    int width2 = (bitmap4222.getWidth() - mutate4.getIntrinsicWidth()) - 22;
                                                    int height2 = (bitmap4222.getHeight() - nm7.E1) + ((nm7.E1 - mutate4.getIntrinsicHeight()) / 2);
                                                    mutate4.setBounds(width2, height2, mutate4.getIntrinsicWidth() + width2, mutate4.getIntrinsicHeight() + height2);
                                                    mutate4.draw(canvas);
                                                }
                                                canvas.setBitmap(null);
                                                File file222222 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".jpg");
                                                bitmap4222.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file222222));
                                                gda.x();
                                                str = file222222.getAbsolutePath();
                                                serializable = r27;
                                                gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                                                return;
                                            }
                                        }
                                        if (i15 == 0) {
                                            i15 = i5;
                                        }
                                        if (TextUtils.isEmpty(r27[0])) {
                                        }
                                        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                        cmb.A1(G02, mutate);
                                        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                        cmb.A1(G02, mutate2);
                                        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                        cmb.A1(G04, mutate3);
                                        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                        cmb.A1(G04, mutate4);
                                        SparseIntArray sparseIntArray22222 = R0;
                                        m37[] m37VarArr3222 = new m37[2];
                                        i21 = 0;
                                        while (i21 < i20) {
                                        }
                                        m37[] m37VarArr22222 = m37VarArr3222;
                                        Bitmap bitmap42222 = a;
                                        oc7Var = oc7Var2;
                                        SparseIntArray sparseIntArray32222 = sparseIntArray22222;
                                        RectF rectF2222 = new RectF();
                                        if (ambVar5 != null) {
                                        }
                                        if (i17 == 0) {
                                        }
                                        if (!z4) {
                                        }
                                        paint.setColor(G0);
                                        canvas.drawRect(0.0f, 0.0f, bitmap42222.getWidth(), 120.0f, paint);
                                        if (mutate != null) {
                                        }
                                        if (mutate2 != null) {
                                        }
                                        m37VarArr22222[1].setBounds(nm7.q2, nm7.s3, bitmap42222.getWidth() - 20, nm7.e5);
                                        m37VarArr22222[1].o(0, 560, 522);
                                        m37VarArr22222[1].draw(canvas);
                                        m37VarArr22222[1].setBounds(nm7.q2, 430, bitmap42222.getWidth() - 20, 522);
                                        m37VarArr22222[1].o(430, 560, 522);
                                        m37VarArr22222[1].draw(canvas);
                                        m37VarArr22222[0].setBounds(20, nm7.t5, 399, 415);
                                        m37VarArr22222[0].o(nm7.t5, 560, 522);
                                        m37VarArr22222[0].draw(canvas);
                                        paint.setColor(G03);
                                        canvas.drawRect(0.0f, bitmap42222.getHeight() - nm7.E1, bitmap42222.getWidth(), bitmap42222.getHeight(), paint);
                                        if (mutate3 != null) {
                                        }
                                        if (mutate4 != null) {
                                        }
                                        canvas.setBitmap(null);
                                        File file2222222 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".jpg");
                                        bitmap42222.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2222222));
                                        gda.x();
                                        str = file2222222.getAbsolutePath();
                                        serializable = r27;
                                        gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                                        return;
                                    }
                                }
                                if (i13 == 0) {
                                    i13 = i4;
                                }
                                if (ambVar5 == null) {
                                }
                                if (i14 == 0) {
                                }
                                i15 = i14;
                                if (i15 == 0) {
                                }
                                if (TextUtils.isEmpty(r27[0])) {
                                }
                                mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                                cmb.A1(G02, mutate);
                                mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                                cmb.A1(G02, mutate2);
                                mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                                cmb.A1(G04, mutate3);
                                mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                                cmb.A1(G04, mutate4);
                                SparseIntArray sparseIntArray222222 = R0;
                                m37[] m37VarArr32222 = new m37[2];
                                i21 = 0;
                                while (i21 < i20) {
                                }
                                m37[] m37VarArr222222 = m37VarArr32222;
                                Bitmap bitmap422222 = a;
                                oc7Var = oc7Var2;
                                SparseIntArray sparseIntArray322222 = sparseIntArray222222;
                                RectF rectF22222 = new RectF();
                                if (ambVar5 != null) {
                                }
                                if (i17 == 0) {
                                }
                                if (!z4) {
                                }
                                paint.setColor(G0);
                                canvas.drawRect(0.0f, 0.0f, bitmap422222.getWidth(), 120.0f, paint);
                                if (mutate != null) {
                                }
                                if (mutate2 != null) {
                                }
                                m37VarArr222222[1].setBounds(nm7.q2, nm7.s3, bitmap422222.getWidth() - 20, nm7.e5);
                                m37VarArr222222[1].o(0, 560, 522);
                                m37VarArr222222[1].draw(canvas);
                                m37VarArr222222[1].setBounds(nm7.q2, 430, bitmap422222.getWidth() - 20, 522);
                                m37VarArr222222[1].o(430, 560, 522);
                                m37VarArr222222[1].draw(canvas);
                                m37VarArr222222[0].setBounds(20, nm7.t5, 399, 415);
                                m37VarArr222222[0].o(nm7.t5, 560, 522);
                                m37VarArr222222[0].draw(canvas);
                                paint.setColor(G03);
                                canvas.drawRect(0.0f, bitmap422222.getHeight() - nm7.E1, bitmap422222.getWidth(), bitmap422222.getHeight(), paint);
                                if (mutate3 != null) {
                                }
                                if (mutate4 != null) {
                                }
                                canvas.setBitmap(null);
                                File file22222222 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".jpg");
                                bitmap422222.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file22222222));
                                gda.x();
                                str = file22222222.getAbsolutePath();
                                serializable = r27;
                                gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                                return;
                            }
                        }
                        if (i11 != 0) {
                            r5 = i11;
                        }
                        if (ambVar5 != null) {
                        }
                        if (i12 == 0) {
                        }
                        i13 = i12;
                        if (i13 == 0) {
                        }
                        if (ambVar5 == null) {
                        }
                        if (i14 == 0) {
                        }
                        i15 = i14;
                        if (i15 == 0) {
                        }
                        if (TextUtils.isEmpty(r27[0])) {
                        }
                        mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                        cmb.A1(G02, mutate);
                        mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                        cmb.A1(G02, mutate2);
                        mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                        cmb.A1(G04, mutate3);
                        mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                        cmb.A1(G04, mutate4);
                        SparseIntArray sparseIntArray2222222 = R0;
                        m37[] m37VarArr322222 = new m37[2];
                        i21 = 0;
                        while (i21 < i20) {
                        }
                        m37[] m37VarArr2222222 = m37VarArr322222;
                        Bitmap bitmap4222222 = a;
                        oc7Var = oc7Var2;
                        SparseIntArray sparseIntArray3222222 = sparseIntArray2222222;
                        RectF rectF222222 = new RectF();
                        if (ambVar5 != null) {
                        }
                        if (i17 == 0) {
                        }
                        if (!z4) {
                        }
                        paint.setColor(G0);
                        canvas.drawRect(0.0f, 0.0f, bitmap4222222.getWidth(), 120.0f, paint);
                        if (mutate != null) {
                        }
                        if (mutate2 != null) {
                        }
                        m37VarArr2222222[1].setBounds(nm7.q2, nm7.s3, bitmap4222222.getWidth() - 20, nm7.e5);
                        m37VarArr2222222[1].o(0, 560, 522);
                        m37VarArr2222222[1].draw(canvas);
                        m37VarArr2222222[1].setBounds(nm7.q2, 430, bitmap4222222.getWidth() - 20, 522);
                        m37VarArr2222222[1].o(430, 560, 522);
                        m37VarArr2222222[1].draw(canvas);
                        m37VarArr2222222[0].setBounds(20, nm7.t5, 399, 415);
                        m37VarArr2222222[0].o(nm7.t5, 560, 522);
                        m37VarArr2222222[0].draw(canvas);
                        paint.setColor(G03);
                        canvas.drawRect(0.0f, bitmap4222222.getHeight() - nm7.E1, bitmap4222222.getWidth(), bitmap4222222.getHeight(), paint);
                        if (mutate3 != null) {
                        }
                        if (mutate4 != null) {
                        }
                        canvas.setBitmap(null);
                        File file222222222 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".jpg");
                        bitmap4222222.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file222222222));
                        gda.x();
                        str = file222222222.getAbsolutePath();
                        serializable = r27;
                        gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                        return;
                    }
                }
                i8 = i7 != 0 ? i7 : i3;
                if (ambVar5 == null) {
                }
                if (i10 == 0) {
                }
                i11 = i10;
                if (i11 != 0) {
                }
                if (ambVar5 != null) {
                }
                if (i12 == 0) {
                }
                i13 = i12;
                if (i13 == 0) {
                }
                if (ambVar5 == null) {
                }
                if (i14 == 0) {
                }
                i15 = i14;
                if (i15 == 0) {
                }
                if (TextUtils.isEmpty(r27[0])) {
                }
                mutate = a.b.getResources().getDrawable(R.drawable.preview_back).mutate();
                cmb.A1(G02, mutate);
                mutate2 = a.b.getResources().getDrawable(R.drawable.preview_dots).mutate();
                cmb.A1(G02, mutate2);
                mutate3 = a.b.getResources().getDrawable(R.drawable.preview_smile).mutate();
                cmb.A1(G04, mutate3);
                mutate4 = a.b.getResources().getDrawable(R.drawable.preview_mic).mutate();
                cmb.A1(G04, mutate4);
                SparseIntArray sparseIntArray22222222 = R0;
                m37[] m37VarArr3222222 = new m37[2];
                i21 = 0;
                while (i21 < i20) {
                }
                m37[] m37VarArr22222222 = m37VarArr3222222;
                Bitmap bitmap42222222 = a;
                oc7Var = oc7Var2;
                SparseIntArray sparseIntArray32222222 = sparseIntArray22222222;
                RectF rectF2222222 = new RectF();
                if (ambVar5 != null) {
                }
                if (i17 == 0) {
                }
                if (!z4) {
                }
                paint.setColor(G0);
                canvas.drawRect(0.0f, 0.0f, bitmap42222222.getWidth(), 120.0f, paint);
                if (mutate != null) {
                }
                if (mutate2 != null) {
                }
                m37VarArr22222222[1].setBounds(nm7.q2, nm7.s3, bitmap42222222.getWidth() - 20, nm7.e5);
                m37VarArr22222222[1].o(0, 560, 522);
                m37VarArr22222222[1].draw(canvas);
                m37VarArr22222222[1].setBounds(nm7.q2, 430, bitmap42222222.getWidth() - 20, 522);
                m37VarArr22222222[1].o(430, 560, 522);
                m37VarArr22222222[1].draw(canvas);
                m37VarArr22222222[0].setBounds(20, nm7.t5, 399, 415);
                m37VarArr22222222[0].o(nm7.t5, 560, 522);
                m37VarArr22222222[0].draw(canvas);
                paint.setColor(G03);
                canvas.drawRect(0.0f, bitmap42222222.getHeight() - nm7.E1, bitmap42222222.getWidth(), bitmap42222222.getHeight(), paint);
                if (mutate3 != null) {
                }
                if (mutate4 != null) {
                }
                canvas.setBitmap(null);
                File file2222222222 = new File(bc4.z(4), "-2147483648_" + gda.p() + ".jpg");
                bitmap42222222.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file2222222222));
                gda.x();
                str = file2222222222.getAbsolutePath();
                serializable = r27;
                gm.c3(new v15((Object) oc7Var, str, serializable, (Object) ambVar, (Object) bmbVar, (byte) 23));
                return;
            case 7:
                a();
                return;
            case 8:
                b();
                return;
            case 9:
                c();
                return;
            case 10:
                d();
                return;
            case 11:
                e();
                return;
            case 12:
                f();
                return;
            case 13:
                g();
                return;
            case 14:
                h();
                return;
            case 15:
                i();
                return;
            case 16:
                j();
                return;
            case 17:
                k();
                return;
            case 18:
                l();
                return;
            case 19:
                m();
                return;
            case 20:
                n();
                return;
            case 21:
                o();
                return;
            case 22:
                p();
                return;
            case 23:
                q();
                return;
            case 24:
                r();
                return;
            case 25:
                s();
                return;
            case 26:
                t();
                return;
            case 27:
                u();
                return;
            case 28:
                v();
                return;
            default:
                ProfileActivity profileActivity = (ProfileActivity) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                String str5 = (String) this.e;
                RectF rectF3 = ProfileActivity.e7;
                profileActivity.D2(tL_error2, tLObject, str5);
                return;
        }
    }

    public /* synthetic */ jy6(oc7 oc7Var, ArrayList arrayList, TLRPC.updates_Difference updates_difference, vh6 vh6Var) {
        this.a = (byte) 7;
        this.b = oc7Var;
        this.d = arrayList;
        this.c = updates_difference;
        this.e = vh6Var;
    }

    public /* synthetic */ jy6(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
