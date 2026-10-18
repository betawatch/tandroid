package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.location.Location;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.IOnDoneCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.sn;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final /* synthetic */ class y0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ y0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        ig.y yVar = (ig.y) this.b;
        TLObject tLObject = (TLObject) this.c;
        TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
        Runnable runnable = (Runnable) this.e;
        ArrayList arrayList = yVar.b;
        if (tLObject instanceof TL_account.TL_businessChatLink) {
            TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject;
            int indexOf = arrayList.indexOf(tL_businessChatLink);
            if (indexOf != -1) {
                arrayList.set(indexOf, tL_businessChatLink2);
                NotificationCenter.getInstance(yVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                if (runnable != null) {
                    runnable.run();
                }
                yVar.f();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        ig.a2 a2Var = (ig.a2) this.b;
        MessagesStorage messagesStorage = (MessagesStorage) this.c;
        ig.z1 z1Var = (ig.z1) this.d;
        TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
        ArrayList arrayList = new ArrayList();
        SQLiteCursor sQLiteCursor = null;
        try {
            try {
                sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(z1Var.a));
                while (sQLiteCursor.next()) {
                    arrayList.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            sQLiteCursor.dispose();
            AndroidUtilities.runOnUIThread(new y0(a2Var, arrayList, z1Var, tL_messages_sendQuickReplyMessages, 23));
        } catch (Throwable th2) {
            if (sQLiteCursor != null) {
                sQLiteCursor.dispose();
            }
            throw th2;
        }
    }

    private final void c() {
        ig.a2 a2Var = (ig.a2) this.b;
        ArrayList<Integer> arrayList = (ArrayList) this.c;
        ig.z1 z1Var = (ig.z1) this.d;
        TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
        int i10 = a2Var.a;
        if (arrayList.isEmpty() || arrayList.size() < z1Var.a()) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = z1Var.a;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getQuickReplyMessages, new k2(a2Var, arrayList, tL_messages_sendQuickReplyMessages, 11));
        } else {
            tL_messages_sendQuickReplyMessages.id = arrayList;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_sendQuickReplyMessages, null);
        }
    }

    private final void d() {
        qi.e eVar = (qi.e) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        m4.h hVar = (m4.h) this.d;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
        synchronized (eVar.a) {
            try {
                if (atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                } else {
                    eVar.l(hVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0176, code lost:
    
        if (r6.equals("android.media.metadata.WRITER") == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f() {
        Bitmap bitmap;
        Bundle bundle;
        e9.n0 n0Var;
        Bundle bundle2;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        Bundle bundle3;
        CharSequence charSequence;
        CharSequence charSequence2;
        m4.n0 n0Var2 = (m4.n0) this.b;
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        ArrayList arrayList3 = (ArrayList) this.d;
        if (atomicInteger.incrementAndGet() == arrayList3.size()) {
            ArrayList arrayList4 = new ArrayList();
            int i10 = 0;
            for (ArrayList arrayList5 = (ArrayList) this.e; i10 < arrayList5.size(); arrayList5 = arrayList2) {
                j9.y yVar = (j9.y) arrayList5.get(i10);
                if (yVar != null) {
                    try {
                        bitmap = (Bitmap) v7.q8.a(yVar);
                    } catch (CancellationException | ExecutionException e) {
                        synchronized (e2.a.b) {
                            Log.d("MediaSessionLegacyStub", e2.a.a("Failed to get bitmap", e));
                        }
                    }
                    b2.o0 o0Var = (b2.o0) arrayList3.get(i10);
                    int i11 = m4.n.a;
                    String str = !o0Var.a.equals("") ? null : o0Var.a;
                    b2.r0 r0Var = o0Var.d;
                    Bitmap bitmap2 = bitmap == null ? bitmap : null;
                    bundle = r0Var.J;
                    CharSequence charSequence3 = r0Var.a;
                    CharSequence charSequence4 = r0Var.g;
                    CharSequence charSequence5 = r0Var.f;
                    n0Var = r0Var.K;
                    Integer num = r0Var.I;
                    Integer num2 = r0Var.q;
                    if (bundle != null) {
                        bundle = new Bundle(bundle);
                    }
                    bundle2 = bundle;
                    z10 = num2 == null && num2.intValue() != -1;
                    z11 = num == null;
                    if (!z10 || z11) {
                        if (bundle2 == null) {
                            bundle2 = new Bundle();
                        }
                        Bundle bundle4 = bundle2;
                        if (z10) {
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                        } else {
                            num2.getClass();
                            arrayList = arrayList3;
                            arrayList2 = arrayList5;
                            bundle4.putLong("android.media.extra.BT_FOLDER_TYPE", m4.n.a(num2.intValue()));
                        }
                        if (z11) {
                            num.getClass();
                            bundle4.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
                        }
                        bundle3 = bundle4;
                    } else {
                        arrayList = arrayList3;
                        arrayList2 = arrayList5;
                        bundle3 = bundle2;
                    }
                    if (!n0Var.isEmpty()) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(n0Var));
                    }
                    charSequence = r0Var.e;
                    if (charSequence == null) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence3);
                    } else {
                        int i12 = 3;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            char c10 = 2;
                            if (i13 < i12) {
                                String[] strArr = n4.i.d;
                                if (i14 < strArr.length) {
                                    int i15 = i14 + 1;
                                    String str2 = strArr[i14];
                                    str2.getClass();
                                    switch (str2.hashCode()) {
                                        case -1853648227:
                                            if (str2.equals("android.media.metadata.ARTIST")) {
                                                c10 = 0;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1850878751:
                                            if (str2.equals("android.media.metadata.AUTHOR")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case -1224124471:
                                            break;
                                        case 194702059:
                                            if (str2.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1058837545:
                                            if (str2.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1684534006:
                                            if (str2.equals("android.media.metadata.COMPOSER")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1879671865:
                                            if (str2.equals("android.media.metadata.ALBUM")) {
                                                c10 = 6;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1897146402:
                                            if (str2.equals("android.media.metadata.TITLE")) {
                                                c10 = 7;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1965214221:
                                            if (str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                c10 = '\b';
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        default:
                                            c10 = 65535;
                                            break;
                                    }
                                    switch (c10) {
                                        case 0:
                                            charSequence2 = r0Var.b;
                                            break;
                                        case 1:
                                        default:
                                            charSequence2 = null;
                                            break;
                                        case 2:
                                            charSequence2 = r0Var.A;
                                            break;
                                        case 3:
                                            charSequence2 = charSequence5;
                                            break;
                                        case 4:
                                            charSequence2 = charSequence4;
                                            break;
                                        case 5:
                                            charSequence2 = r0Var.B;
                                            break;
                                        case 6:
                                            charSequence2 = r0Var.c;
                                            break;
                                        case 7:
                                            charSequence2 = charSequence3;
                                            break;
                                        case '\b':
                                            charSequence2 = r0Var.d;
                                            break;
                                    }
                                    if (!TextUtils.isEmpty(charSequence2)) {
                                        charSequenceArr[i13] = charSequence2;
                                        i13++;
                                    }
                                    i14 = i15;
                                    i12 = 3;
                                }
                            }
                        }
                        charSequence = charSequenceArr[0];
                        charSequence5 = charSequenceArr[1];
                        charSequence4 = charSequenceArr[2];
                    }
                    arrayList4.add(new n4.q(new n4.h(str, charSequence, charSequence5, charSequence4, bitmap2, r0Var.n, bundle3, o0Var.f.a), i10 != -1 ? -1L : i10));
                    i10++;
                    arrayList3 = arrayList;
                }
                bitmap = null;
                b2.o0 o0Var2 = (b2.o0) arrayList3.get(i10);
                int i112 = m4.n.a;
                if (!o0Var2.a.equals("")) {
                }
                b2.r0 r0Var2 = o0Var2.d;
                if (bitmap == null) {
                }
                bundle = r0Var2.J;
                CharSequence charSequence32 = r0Var2.a;
                CharSequence charSequence42 = r0Var2.g;
                CharSequence charSequence52 = r0Var2.f;
                n0Var = r0Var2.K;
                Integer num3 = r0Var2.I;
                Integer num22 = r0Var2.q;
                if (bundle != null) {
                }
                bundle2 = bundle;
                if (num22 == null) {
                }
                if (num3 == null) {
                }
                if (z10) {
                }
                if (bundle2 == null) {
                }
                Bundle bundle42 = bundle2;
                if (z10) {
                }
                if (z11) {
                }
                bundle3 = bundle42;
                if (!n0Var.isEmpty()) {
                }
                charSequence = r0Var2.e;
                if (charSequence == null) {
                }
                arrayList4.add(new n4.q(new n4.h(str, charSequence, charSequence52, charSequence42, bitmap2, r0Var2.n, bundle3, o0Var2.f.a), i10 != -1 ? -1L : i10));
                i10++;
                arrayList3 = arrayList;
            }
            m4.p0.D(((m4.p0) n0Var2.e).m, arrayList4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void g() {
        m4.i1 i1Var = (m4.i1) this.b;
        m4.v vVar = (m4.v) this.c;
        m4.f0 f0Var = (m4.f0) this.d;
        m4.l lVar = (m4.l) this.e;
        qi.e eVar = i1Var.b;
        boolean z10 = false;
        try {
            i1Var.c.remove(vVar);
            if (f0Var.j()) {
                w7.w.a(lVar);
                return;
            }
            m4.d1 d1Var = (m4.d1) vVar.d;
            d1Var.getClass();
            IBinder asBinder = d1Var.a.asBinder();
            m4.t m10 = f0Var.m(vVar);
            if (eVar.w(vVar)) {
                e2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
            }
            eVar.b(asBinder, vVar, m10.a, m10.b);
            com.google.android.gms.common.api.internal.u t10 = eVar.t(vVar);
            if (t10 == null) {
                e2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                w7.w.a(lVar);
                return;
            }
            m4.m1 m1Var = f0Var.t;
            m4.k1 k1Var = f0Var.s;
            b2.b1 b1Var = m10.b;
            m4.k1 Y0 = i1Var.Y0(k1Var);
            MediaSession.Token token = ((n4.n) f0Var.h.m.b).c.b;
            e9.n0 n0Var = m10.c;
            if (n0Var == null) {
                n0Var = f0Var.y;
            }
            e9.n0 n0Var2 = m10.d;
            if (n0Var2 == null) {
                n0Var2 = f0Var.z;
            }
            e9.n0 n0Var3 = f0Var.r;
            m4.p1 p1Var = m10.a;
            b2.b1 s10 = m1Var.s();
            m4.u1 u1Var = f0Var.j.a;
            u1Var.getClass();
            m4.j jVar = new m4.j(i1Var, n0Var, n0Var2, n0Var3, p1Var, b1Var, s10, new Bundle(u1Var.g), f0Var.A, Y0, token);
            if (f0Var.j()) {
                w7.w.a(lVar);
                return;
            }
            try {
                ((m4.k) lVar).F0(t10.e(), jVar.a(vVar.c));
                z10 = true;
            } catch (RemoteException unused) {
            }
            if (z10 && (!f0Var.x || !m4.f0.k(vVar))) {
                f0Var.e.getClass();
            }
        } finally {
            if (0 == 0) {
                w7.w.a(lVar);
            }
        }
    }

    private final void h() {
        m4.f0 f0Var = (m4.f0) this.b;
        j9.e0 e0Var = (j9.e0) this.c;
        e2.j jVar = (e2.j) this.d;
        j9.y yVar = (j9.y) this.e;
        if (f0Var.j()) {
            e0Var.m(null);
            return;
        }
        try {
            jVar.accept(yVar);
            e0Var.m(null);
        } catch (Throwable th2) {
            e0Var.n(th2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:273:0x0769, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new ci.w6(r3, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x0772, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0766, code lost:
    
        if (r7 != null) goto L236;
     */
    /* JADX WARN: Removed duplicated region for block: B:343:0x089e  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ei.a8 a8Var;
        File file;
        TL_stories.StoryItem storyItem;
        long j10;
        TLRPC.Photo photo;
        ci.y9 y9Var;
        char c10;
        org.telegram.ui.ActionBar.n2 U;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i10;
        int i11;
        int i12;
        float f7;
        long j11;
        int i13;
        float f10;
        int[][] iArr;
        long j12;
        long j13;
        ArrayList arrayList;
        int i14 = 1;
        switch (this.a) {
            case 0:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                pf.c cVar = (pf.c) this.d;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) this.e;
                if (n2Var != null && tL_error != null) {
                    org.telegram.ui.Components.xc.a0(n2Var).f0(tL_error, false);
                }
                if ((n2Var instanceof sn) && tL_error == null) {
                    ((sn) n2Var).cc();
                }
                cVar.b();
                b2Var.dismiss();
                return;
            case 1:
                k7.h1((k7) this.b, (boolean[]) this.c, (TL_stars.StarGiftAttribute) this.d, (org.telegram.ui.Components.zc[]) this.e);
                return;
            case 2:
                k7.q0((k7) this.b, (TLObject) this.d, (a3.l0) this.e, (TLRPC.TL_error) this.c);
                return;
            case 3:
                k7.P0((k7) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                return;
            case 4:
                k7 k7Var = (k7) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                TLObject tLObject = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error2 != null || !(tLObject instanceof TLRPC.Updates)) {
                    k7Var.getBulletinFactory().f0(tL_error2, false);
                    return;
                }
                k7Var.r0 = true;
                k7Var.s1 = null;
                k7Var.E1(inputSavedStarGift, (TLRPC.Updates) tLObject, new b2(k7Var, 9));
                Utilities.stageQueue.postRunnable(new a1.f(19, k7Var, tLObject));
                return;
            case 5:
                d6 d6Var = (d6) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                org.telegram.ui.Components.q6 q6Var = d6Var.H;
                d6Var.h0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                xj0 xj0Var = d6Var.l0;
                if (xj0Var != null) {
                    xj0Var.d();
                    AndroidUtilities.runOnUIThread(new ah.j(1), 750L);
                }
                d6Var.Q.animate().alpha(0.0f).start();
                d6Var.S.animate().alpha(1.0f).start();
                d6Var.G.animate().alpha(1.0f).start();
                d6Var.R.animate().alpha(0.0f).start();
                d6Var.P.animate().alpha(1.0f).start();
                d6Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList2.size(), new Object[0])));
                q6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                q6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                d6Var.I.setAlpha(0.0f);
                if (d6Var.O != null) {
                    int i15 = 0;
                    while (true) {
                        yh.g1[] g1VarArr = d6Var.O;
                        if (i15 < g1VarArr.length) {
                            AndroidUtilities.removeFromParent(g1VarArr[i15]);
                            i15++;
                        } else {
                            d6Var.O = null;
                        }
                    }
                }
                d6Var.O = new yh.g1[arrayList2.size()];
                int i16 = 0;
                while (i16 < arrayList2.size()) {
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList2.get(i16);
                    yh.g1 g1Var = new yh.g1(d6Var.getContext(), d6Var.W, d6Var.a);
                    g1Var.g(starGift2, false, false, false, false, true);
                    g1Var.x.setVisibility(8);
                    g1Var.setRibbonColor(-3065286);
                    org.telegram.ui.Components.w9 w9Var = g1Var.y;
                    FrameLayout.LayoutParams e = w7.z5.e(42, 42, 17);
                    g1Var.E = e;
                    w9Var.setLayoutParams(e);
                    int i17 = i16 + 1;
                    boolean z10 = i17 >= arrayList2.size();
                    LinearLayout linearLayout = d6Var.N;
                    d6Var.O[i16] = g1Var;
                    linearLayout.addView(g1Var, w7.z5.p(74, 74, 0.0f, 51, 0, 0, z10 ? 0 : 6, 0));
                    i16 = i17;
                }
                return;
            case 6:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str = (String) this.d;
                androidx.car.app.utils.a aVar = (androidx.car.app.utils.a) this.e;
                if (oVar != null && ((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                    androidx.car.app.utils.g.b(iOnDoneCallback, str, aVar);
                    return;
                }
                androidx.car.app.utils.g.f(iOnDoneCallback, str, new IllegalStateException("Lifecycle is not at least created when dispatching " + aVar));
                return;
            case 7:
                ci.g4 g4Var = (ci.g4) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                ci.p4 p4Var = g4Var.l;
                if (tLObject2 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    MessagesController.getInstance(p4Var.C2).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(p4Var.C2).putChats(tL_stories_stories.chats, false);
                    for (int i18 = 0; i18 < tL_stories_stories.stories.size(); i18++) {
                        if (tL_stories_stories.stories.get(i18).id == storyItem2.id) {
                            callback.run(tL_stories_stories.stories.get(i18).media.document);
                            return;
                        }
                    }
                }
                callback.run(null);
                return;
            case 8:
                ci.g4 g4Var2 = (ci.g4) this.b;
                Activity activity = (Activity) this.c;
                ci.z9 z9Var = (ci.z9) this.d;
                ci.m4 m4Var = (ci.m4) this.e;
                ei.vb D = ei.vb.D(activity, g4Var2.l.C2);
                ci.o4 o4Var = g4Var2.l.M2;
                long j14 = (o4Var == null || (y9Var = (ci.y9) o4Var.c) == null) ? 0L : y9Var.currentPosition;
                ei.a1 a1Var = MessagesController.getInstance(g4Var2.l.C2).getStoriesController().w;
                TL_stories.StoryItem storyItem3 = g4Var2.l.O1.a;
                long j15 = storyItem3.dialogId;
                ArrayList arrayList3 = a1Var.b;
                int size = arrayList3.size();
                int i19 = 0;
                while (i19 < size) {
                    Object obj = arrayList3.get(i19);
                    i19++;
                    ei.a8 a8Var2 = (ei.a8) obj;
                    if (a8Var2.g && storyItem3.id == a8Var2.f && j15 == a8Var2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        storyItem = storyItem3;
                        j10 = j15;
                        if ((document == null || document.id == a8Var2.H) && ((photo = messageMedia.photo) == null || photo.id == a8Var2.I)) {
                            a8Var2.h = true;
                            a8Var = a8Var2;
                            if (a8Var != null || a8Var.u || (file = a8Var.L) == null || !file.exists()) {
                                a8Var = ei.a8.n(g4Var2.l.O1.h(), g4Var2.l.O1.a);
                                a8Var.e = g4Var2.l.B1;
                            }
                            ei.a8 g10 = a8Var.g();
                            if (g4Var2.l.I0()) {
                                ci.p4 p4Var2 = g4Var2.l;
                                g10.J0 = p4Var2.B1;
                                g10.L0 = MessagesController.toInputMedia(p4Var2.O1.a.media);
                                ci.z6 z6Var = z9Var.O0;
                                if (z6Var instanceof ci.s6) {
                                    g10.K0 = ((ci.s6) z6Var).E;
                                }
                            }
                            D.R(ei.qb.d(z9Var), g10, j14);
                            D.Q = new ci.z3(g4Var2, 3);
                            D.R = new ci.c4(g4Var2, m4Var, 1);
                            return;
                        }
                    } else {
                        storyItem = storyItem3;
                        j10 = j15;
                    }
                    storyItem3 = storyItem;
                    j15 = j10;
                }
                a8Var = null;
                if (a8Var != null) {
                }
                a8Var = ei.a8.n(g4Var2.l.O1.h(), g4Var2.l.O1.a);
                a8Var.e = g4Var2.l.B1;
                ei.a8 g102 = a8Var.g();
                if (g4Var2.l.I0()) {
                }
                D.R(ei.qb.d(z9Var), g102, j14);
                D.Q = new ci.z3(g4Var2, 3);
                D.R = new ci.c4(g4Var2, m4Var, 1);
                return;
            case 9:
                ci.v6 v6Var = (ci.v6) this.b;
                TLObject tLObject3 = (TLObject) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                v6Var.i = false;
                if (tLObject3 instanceof TL_stories.TL_storyAlbum) {
                    ci.a7 a2 = ci.a7.a((TL_stories.TL_storyAlbum) tLObject3);
                    v6Var.h.add(a2);
                    v6Var.f(true);
                    if (callback2 != null) {
                        callback2.run(a2);
                        return;
                    }
                    return;
                }
                if (tL_error3 == null || (U = LaunchActivity.U()) == null) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    org.telegram.ui.Components.xc.a0(U).f0(tL_error3, false);
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(v6Var.a);
                int i20 = NotificationCenter.storyAlbumsCollectionsUpdate;
                Object[] objArr = new Object[2];
                objArr[c10] = Long.valueOf(v6Var.b);
                objArr[1] = v6Var;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i20, objArr);
                return;
            case 10:
                int i21 = 2;
                int i22 = 5;
                int i23 = 4;
                int i24 = 3;
                ci.z6 z6Var2 = (ci.z6) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                MessagesStorage messagesStorage = (MessagesStorage) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                int i25 = z6Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i26 = z6Var2.e;
                sb2.append(i26);
                sb2.append("{");
                long j16 = z6Var2.d;
                sb2.append(j16);
                sb2.append("} saveCache {");
                sb2.append(ci.h7.a(arrayList4));
                i2.d.v("}", sb2);
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    sQLitePreparedStatement2 = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j16 + " AND album_id = " + i25).stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i27 = 0;
                        while (i27 < arrayList4.size()) {
                            try {
                                TL_stories.StoryItem storyItem4 = ((MessageObject) arrayList4.get(i27)).storyItem;
                                if (storyItem4 == null) {
                                    i10 = i23;
                                } else {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                    storyItem4.serializeToStream(nativeByteBuffer);
                                    sQLitePreparedStatement2.requery();
                                    sQLitePreparedStatement2.bindLong(i14, j16);
                                    sQLitePreparedStatement2.bindInteger(i21, storyItem4.id);
                                    sQLitePreparedStatement2.bindByteBuffer(i24, nativeByteBuffer);
                                    sQLitePreparedStatement2.bindInteger(i23, i26);
                                    sQLitePreparedStatement2.bindInteger(i22, z6Var2.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                    sQLitePreparedStatement2.bindInteger(6, arrayList5.indexOf(Integer.valueOf(storyItem4.id)) + 1);
                                    sQLitePreparedStatement2.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindLong(i14, j16);
                                    sQLitePreparedStatement.bindInteger(2, i25);
                                    sQLitePreparedStatement.bindInteger(3, storyItem4.id);
                                    i10 = 4;
                                    sQLitePreparedStatement.bindInteger(4, i27);
                                    sQLitePreparedStatement.step();
                                }
                                i27++;
                                i23 = i10;
                                i14 = 1;
                                i22 = 5;
                                i24 = 3;
                                i21 = 2;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    messagesStorage.checkSQLException(th);
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                        break;
                                    }
                                } finally {
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                }
                            }
                        }
                        if (sQLitePreparedStatement2 != null) {
                            break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLitePreparedStatement = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                }
                break;
            case 11:
                ei.r6 r6Var = (ei.r6) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                ei.a8 a8Var3 = (ei.a8) this.d;
                boolean[] zArr = (boolean[]) this.e;
                org.telegram.ui.Components.ja jaVar = r6Var.G;
                Bitmap bitmap = r6Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    r6Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                r6Var.a = bitmap2;
                if (a8Var3 != null && !a8Var3.c && a8Var3.K && bitmap2 != null) {
                    a8Var3.k0 = bitmap2.getWidth();
                    a8Var3.l0 = r6Var.a.getHeight();
                    a8Var3.A();
                }
                if (zArr[0] && a8Var3 != null && jaVar != null && r6Var.a != null) {
                    jaVar.e();
                    jaVar.f(a8Var3.b(r6Var.a, 0.2f), false);
                    ei.t9 t9Var = r6Var.v;
                    if (t9Var != null) {
                        t9Var.run();
                    }
                }
                r6Var.r();
                r6Var.invalidate();
                return;
            case 12:
                ei.a8 a8Var4 = (ei.a8) this.b;
                String str2 = (String) this.c;
                int[][] iArr2 = (int[][]) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                a8Var4.getClass();
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                videoEditedInfo.isStory = true;
                videoEditedInfo.fromCamera = a8Var4.c1;
                videoEditedInfo.originalWidth = a8Var4.k0;
                videoEditedInfo.originalHeight = a8Var4.l0;
                videoEditedInfo.resultWidth = a8Var4.i0;
                videoEditedInfo.resultHeight = a8Var4.j0;
                File file2 = a8Var4.P0;
                videoEditedInfo.paintPath = file2 == null ? null : file2.getPath();
                File file3 = a8Var4.W0;
                videoEditedInfo.messagePath = file3 == null ? null : file3.getPath();
                File file4 = a8Var4.X0;
                videoEditedInfo.messageVideoMaskPath = file4 == null ? null : file4.getPath();
                File file5 = a8Var4.Y0;
                videoEditedInfo.backgroundPath = file5 == null ? null : file5.getPath();
                int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
                float f11 = 8.0f;
                if (!a8Var4.K || str2 == null || a8Var4.v()) {
                    int i28 = 0;
                    File file6 = a8Var4.Z0;
                    if (file6 != null) {
                        videoEditedInfo.originalPath = file6.getAbsolutePath();
                    } else {
                        videoEditedInfo.originalPath = str2;
                    }
                    videoEditedInfo.isPhoto = true;
                    videoEditedInfo.collage = a8Var4.S;
                    if (a8Var4.v()) {
                        int i29 = 0;
                        boolean z11 = false;
                        while (i29 < a8Var4.T.size()) {
                            ei.a8 a8Var5 = (ei.a8) a8Var4.T.get(i29);
                            if (a8Var5.K) {
                                a8Var5.k0 = Math.max(a8Var5.k0, iArr2[i29][1]);
                                a8Var5.l0 = Math.max(a8Var5.l0, iArr2[i29][2]);
                                f10 = f11;
                                i13 = i28;
                                iArr = iArr2;
                                a8Var5.h0 = Math.max(a8Var5.h0, iArr2[i29][4]);
                                z11 = true;
                            } else {
                                i13 = i28;
                                f10 = f11;
                                iArr = iArr2;
                            }
                            i29++;
                            i28 = i13;
                            f11 = f10;
                            iArr2 = iArr;
                            z11 = z11;
                        }
                        i12 = i28;
                        f7 = f11;
                        ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(a8Var4);
                        videoEditedInfo.collageParts = parts;
                        if (z11) {
                            int size2 = parts.size();
                            int i30 = i12;
                            VideoEditedInfo.Part part = null;
                            long j17 = 0;
                            while (i30 < size2) {
                                VideoEditedInfo.Part part2 = parts.get(i30);
                                i30++;
                                VideoEditedInfo.Part part3 = part2;
                                int i31 = extractRealEncoderBitrate;
                                if (part3.isVideo) {
                                    long j18 = part3.duration;
                                    if (j18 > j17) {
                                        j17 = j18;
                                        part = part3;
                                    }
                                }
                                extractRealEncoderBitrate = i31;
                            }
                            i11 = extractRealEncoderBitrate;
                            if (part != null) {
                                float f12 = part.duration;
                                float f13 = part.right;
                                float f14 = part.left;
                                long j19 = (long) ((f13 - f14) * f12);
                                a8Var4.h0 = j19;
                                videoEditedInfo.originalDuration = j19;
                                videoEditedInfo.estimatedDuration = j19;
                                j11 = -(part.offset + ((long) (f14 * f12)));
                                part.offset = j11;
                                ArrayList<VideoEditedInfo.Part> arrayList6 = videoEditedInfo.collageParts;
                                int size3 = arrayList6.size();
                                int i32 = i12;
                                while (i32 < size3) {
                                    VideoEditedInfo.Part part4 = arrayList6.get(i32);
                                    i32++;
                                    VideoEditedInfo.Part part5 = part4;
                                    if (part5.isVideo && part5 != part) {
                                        part5.offset += j11;
                                    }
                                }
                                videoEditedInfo.startTime = -1L;
                                videoEditedInfo.endTime = -1L;
                                videoEditedInfo.muted = true;
                                videoEditedInfo.originalBitrate = -1;
                                videoEditedInfo.volume = 1.0f;
                                videoEditedInfo.bitrate = -1;
                                videoEditedInfo.framerate = 30;
                                videoEditedInfo.estimatedSize = (long) (((a8Var4.h0 / 1000.0f) * i11) / f7);
                                videoEditedInfo.filterState = null;
                            }
                        } else {
                            long j20 = a8Var4.S0;
                            a8Var4.h0 = j20;
                            videoEditedInfo.originalDuration = j20;
                            videoEditedInfo.estimatedDuration = j20;
                            i11 = extractRealEncoderBitrate;
                        }
                    } else {
                        i11 = extractRealEncoderBitrate;
                        i12 = 0;
                        f7 = 8.0f;
                        if (a8Var4.o0 != null) {
                            long j21 = (long) ((a8Var4.t0 - a8Var4.s0) * a8Var4.q0);
                            a8Var4.h0 = j21;
                            videoEditedInfo.originalDuration = j21;
                            videoEditedInfo.estimatedDuration = j21;
                        } else if (a8Var4.y != null) {
                            long j22 = (long) ((a8Var4.F - a8Var4.E) * a8Var4.C);
                            a8Var4.h0 = j22;
                            videoEditedInfo.originalDuration = j22;
                            videoEditedInfo.estimatedDuration = j22;
                        } else {
                            long j23 = a8Var4.S0;
                            a8Var4.h0 = j23;
                            videoEditedInfo.originalDuration = j23;
                            videoEditedInfo.estimatedDuration = j23;
                        }
                    }
                    j11 = 0;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                    videoEditedInfo.muted = true;
                    videoEditedInfo.originalBitrate = -1;
                    videoEditedInfo.volume = 1.0f;
                    videoEditedInfo.bitrate = -1;
                    videoEditedInfo.framerate = 30;
                    videoEditedInfo.estimatedSize = (long) (((a8Var4.h0 / 1000.0f) * i11) / f7);
                    videoEditedInfo.filterState = null;
                } else {
                    videoEditedInfo.originalPath = str2;
                    videoEditedInfo.isPhoto = false;
                    videoEditedInfo.framerate = Math.min(59, iArr2[0][7]);
                    int videoBitrate = MediaController.getVideoBitrate(str2);
                    if (videoBitrate == -1) {
                        videoBitrate = iArr2[0][3];
                    }
                    videoEditedInfo.originalBitrate = videoBitrate;
                    if (videoBitrate >= 1000000 || (arrayList = a8Var4.T0) == null || arrayList.isEmpty()) {
                        int i33 = videoEditedInfo.originalBitrate;
                        if (i33 < 500000) {
                            videoEditedInfo.bitrate = 2500000;
                            videoEditedInfo.originalBitrate = -1;
                        } else {
                            videoEditedInfo.bitrate = Utilities.clamp(i33, 3000000, 500000);
                        }
                    } else {
                        videoEditedInfo.bitrate = 2000000;
                        videoEditedInfo.originalBitrate = -1;
                    }
                    StringBuilder sb3 = new StringBuilder("story bitrate, original = ");
                    sb3.append(videoEditedInfo.originalBitrate);
                    sb3.append(" => ");
                    org.telegram.messenger.g0.o(videoEditedInfo.bitrate, sb3);
                    int i34 = iArr2[0][4];
                    long j24 = i34;
                    a8Var4.h0 = j24;
                    videoEditedInfo.originalDuration = j24 * 1000;
                    float f15 = j24;
                    long j25 = ((long) (a8Var4.Z * f15)) * 1000;
                    videoEditedInfo.startTime = j25;
                    long j26 = ((long) (a8Var4.a0 * f15)) * 1000;
                    videoEditedInfo.endTime = j26;
                    videoEditedInfo.estimatedDuration = j26 - j25;
                    videoEditedInfo.volume = a8Var4.P;
                    videoEditedInfo.muted = a8Var4.Y;
                    videoEditedInfo.estimatedSize = (long) a1.g.B(i34 / 1000.0f, extractRealEncoderBitrate, 8.0f, r2[5]);
                    videoEditedInfo.estimatedSize = Math.max(a8Var4.L.length(), videoEditedInfo.estimatedSize);
                    videoEditedInfo.filterState = a8Var4.a1;
                    File file7 = a8Var4.Q0;
                    videoEditedInfo.blurPath = file7 == null ? null : file7.getPath();
                    i12 = 0;
                    j11 = 0;
                }
                videoEditedInfo.account = a8Var4.a;
                videoEditedInfo.wallpaperPeerId = a8Var4.z0;
                videoEditedInfo.isDark = a8Var4.y0;
                videoEditedInfo.avatarStartTime = -1L;
                MediaController.CropState cropState = a8Var4.m0;
                if (cropState != null) {
                    videoEditedInfo.cropState = cropState.clone();
                } else {
                    videoEditedInfo.cropState = new MediaController.CropState();
                }
                videoEditedInfo.cropState.useMatrix = new Matrix();
                videoEditedInfo.cropState.useMatrix.set(a8Var4.n0);
                videoEditedInfo.mediaEntities = a8Var4.T0;
                videoEditedInfo.gradientTopColor = Integer.valueOf(a8Var4.A0);
                videoEditedInfo.gradientBottomColor = Integer.valueOf(a8Var4.B0);
                videoEditedInfo.forceFragmenting = true;
                videoEditedInfo.hdrInfo = a8Var4.d1;
                videoEditedInfo.mixedSoundInfos.clear();
                if (a8Var4.v() && !a8Var4.Y) {
                    ArrayList<VideoEditedInfo.Part> arrayList7 = videoEditedInfo.collageParts;
                    int size4 = arrayList7.size();
                    int i35 = i12;
                    while (i35 < size4) {
                        VideoEditedInfo.Part part6 = arrayList7.get(i35);
                        i35++;
                        VideoEditedInfo.Part part7 = part6;
                        if (part7.isVideo && part7.volume > 0.0f && !part7.muted) {
                            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(part7.path);
                            mixedSoundInfo.volume = part7.volume;
                            float f16 = part7.left;
                            float f17 = part7.duration;
                            mixedSoundInfo.audioOffset = ((long) (f16 * f17)) * 1000;
                            mixedSoundInfo.startTime = part7.offset * 1000;
                            mixedSoundInfo.duration = ((long) ((part7.right - f16) * f17)) * 1000;
                            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo);
                        }
                    }
                }
                File file8 = a8Var4.o0;
                if (file8 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file8.getAbsolutePath());
                    mixedSoundInfo2.volume = a8Var4.u0;
                    float f18 = a8Var4.s0;
                    float f19 = a8Var4.q0;
                    long j27 = ((long) (f18 * f19)) * 1000;
                    mixedSoundInfo2.audioOffset = j27;
                    if (a8Var4.K) {
                        mixedSoundInfo2.startTime = ((long) (a8Var4.r0 - (a8Var4.Z * a8Var4.h0))) * 1000;
                        j13 = 0;
                    } else {
                        j13 = 0;
                        mixedSoundInfo2.startTime = 0L;
                    }
                    long j28 = mixedSoundInfo2.startTime + j11;
                    mixedSoundInfo2.startTime = j28;
                    if (j28 < j13) {
                        mixedSoundInfo2.audioOffset = j27 - j28;
                        mixedSoundInfo2.startTime = j13;
                    }
                    mixedSoundInfo2.duration = ((long) ((a8Var4.t0 - f18) * f19)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
                }
                String str3 = a8Var4.y;
                if (str3 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str3);
                    mixedSoundInfo3.volume = a8Var4.G;
                    float f20 = a8Var4.E;
                    float f21 = a8Var4.C;
                    long j29 = ((long) (f20 * f21)) * 1000;
                    mixedSoundInfo3.audioOffset = j29;
                    if (a8Var4.K) {
                        mixedSoundInfo3.startTime = ((long) (a8Var4.D - (a8Var4.Z * a8Var4.h0))) * 1000;
                        j12 = 0;
                    } else {
                        j12 = 0;
                        mixedSoundInfo3.startTime = 0L;
                    }
                    long j30 = mixedSoundInfo3.startTime + j11;
                    mixedSoundInfo3.startTime = j30;
                    if (j30 < j12) {
                        mixedSoundInfo3.audioOffset = j29 - j30;
                        mixedSoundInfo3.startTime = j12;
                    }
                    mixedSoundInfo3.duration = ((long) ((a8Var4.F - f20) * f21)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
                }
                callback3.run(videoEditedInfo);
                return;
            case 13:
                ei.d dVar = (ei.d) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.d;
                gi.r1 r1Var = (gi.r1) this.e;
                dVar.setLoading(false);
                if (tLObject4 instanceof TLRPC.TL_boolTrue) {
                    f3Var.dismiss();
                    r1Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 14:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new org.telegram.ui.Components.xc(f3Var2.topBulletinContainer, d6Var2).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, gi.l.H0(connectedbotstarref.commission_permille), UserObject.getUserName(user))), R.raw.copy).j();
                return;
            case 15:
                gi.u3.y0((gi.u3) this.b, (Context) this.c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.e);
                return;
            case 16:
                TLObject tLObject5 = (TLObject) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                org.telegram.ui.web.s sVar = (org.telegram.ui.web.s) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (!(tLObject5 instanceof TLRPC.TL_boolTrue)) {
                    if (zArr2[0]) {
                        return;
                    }
                    zArr2[0] = true;
                    sVar.run(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                sVar.run(Boolean.TRUE, "allowed");
                return;
            case 17:
                hg.c cVar2 = (hg.c) this.b;
                Location location = (Location) this.c;
                String str4 = (String) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = cVar2.r;
                cVar2.n = false;
                if (location == null) {
                    cVar2.F = 0;
                    cVar2.h = false;
                    cVar2.s.clear();
                    cVar2.J = false;
                    cVar2.x = str4;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                cVar2.l();
                return;
            case 18:
                hg.c cVar3 = (hg.c) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                String str5 = (String) this.d;
                TLObject tLObject6 = (TLObject) this.e;
                ArrayList arrayList10 = cVar3.s;
                if (tL_error4 == null) {
                    cVar3.F = 0;
                    cVar3.h = false;
                    arrayList10.clear();
                    cVar3.J = false;
                    cVar3.x = str5;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject6;
                    int size5 = messages_botresults.results.size();
                    for (int i36 = 0; i36 < size5; i36++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i36);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.id;
                                arrayList10.add(tL_messageMediaVenue);
                            }
                        }
                    }
                }
                hg.b bVar = cVar3.y;
                if (bVar != null) {
                    bVar.a(arrayList10);
                }
                cVar3.l();
                return;
            case 19:
                AndroidUtilities.runOnUIThread(new y0((hg.m) this.b, (Runnable) this.d, (ArrayList) this.e, s4.o.c((hg.g) this.c, true), 20));
                return;
            case 20:
                hg.m mVar = (hg.m) this.b;
                Runnable runnable2 = (Runnable) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                m4.c cVar4 = (m4.c) this.e;
                if (mVar.Z) {
                    mVar.Z = false;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    mVar.M = arrayList11;
                    cVar4.c(mVar);
                    if (mVar.a0) {
                        mVar.a0 = false;
                        mVar.W(runnable2);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                a();
                return;
            case 22:
                b();
                return;
            case 23:
                c();
                return;
            case 24:
                ki.q qVar = (ki.q) this.b;
                ki.a aVar2 = (ki.a) this.c;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.d;
                i80 i80Var = (i80) this.e;
                qVar.r.W4(aVar2, pageBlock);
                i80Var.u();
                return;
            case 25:
                d();
                return;
            case 26:
                f();
                return;
            case 27:
                g();
                return;
            case 28:
                h();
                return;
            default:
                m4.f0 f0Var = (m4.f0) this.b;
                m4.f1 f1Var = (m4.f1) this.c;
                m4.v vVar = (m4.v) this.d;
                List list = (List) this.e;
                if (f0Var.j()) {
                    return;
                }
                f1Var.a(f0Var.t, vVar, list);
                return;
        }
    }

    public /* synthetic */ y0(Object obj, TLObject tLObject, Object obj2, TLRPC.TL_error tL_error, int i10) {
        this.a = i10;
        this.b = obj;
        this.d = tLObject;
        this.e = obj2;
        this.c = tL_error;
    }
}
