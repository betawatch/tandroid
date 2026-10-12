package androidx.car.app.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import b2.c1;
import b2.p0;
import b2.s0;
import bi.c5;
import bi.e5;
import bi.f8;
import bi.h5;
import bi.i8;
import bi.n5;
import bi.o8;
import bi.p5;
import bi.p8;
import bi.q5;
import bi.rb;
import bi.sb;
import bi.x8;
import bi.z4;
import com.google.android.gms.common.api.internal.v;
import di.a1;
import di.a7;
import di.fc;
import di.ga;
import di.k8;
import di.kc;
import fi.f4;
import fi.u1;
import ig.a2;
import ig.b2;
import j9.e0;
import j9.y;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import ji.r;
import li.n0;
import li.u;
import li.v0;
import m4.e1;
import m4.f0;
import m4.g1;
import m4.j1;
import m4.k;
import m4.l;
import m4.l1;
import m4.m;
import m4.n1;
import m4.o;
import m4.o0;
import m4.q0;
import m4.q1;
import m4.v1;
import m4.w;
import n4.n;
import n4.q;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
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
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import v7.q8;
import w7.x;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(k8 k8Var, String str, int[][] iArr, Utilities.Callback callback) {
        this.a = 6;
        this.b = k8Var;
        this.d = str;
        this.c = iArr;
        this.e = callback;
    }

    private final void a() {
        b2 b2Var = (b2) this.b;
        ArrayList<Integer> arrayList = (ArrayList) this.c;
        a2 a2Var = (a2) this.d;
        TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
        int i10 = b2Var.a;
        if (arrayList.isEmpty() || arrayList.size() < a2Var.a()) {
            TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
            tL_messages_getQuickReplyMessages.shortcut_id = a2Var.a;
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_getQuickReplyMessages, new e5(b2Var, arrayList, tL_messages_sendQuickReplyMessages, 6));
        } else {
            tL_messages_sendQuickReplyMessages.id = arrayList;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                tL_messages_sendQuickReplyMessages.random_id.add(Long.valueOf(Utilities.random.nextLong()));
            }
            ConnectionsManager.getInstance(i10).sendRequest(tL_messages_sendQuickReplyMessages, null);
        }
    }

    private final void b() {
        int a2;
        u uVar = (u) this.b;
        n0 n0Var = (n0) this.c;
        n0 n0Var2 = (n0) this.d;
        Handler handler = (Handler) this.e;
        if (uVar.r0 && uVar.W == 0 && uVar.T) {
            uVar.N.g(uVar.L, uVar.D, false);
            uVar.U = false;
            uVar.V = false;
            uVar.c0 = 0.0f;
            uVar.W = 1;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            uVar.X = elapsedRealtimeNanos;
            uVar.Y = elapsedRealtimeNanos;
            uVar.d0 = n0Var;
            uVar.e0 = n0Var2;
            String[] strArr = v0.a;
            synchronized (v0.class) {
                v0.b();
                if (n0Var == n0Var2) {
                    throw new IllegalArgumentException("Camera switch direction must change");
                }
                a2 = v0.a(n0Var == n0.b ? 0 : 1);
            }
            uVar.b0 = a2;
            uVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
            uVar.a0 = (r4 - r5) * 1000000;
            uVar.i.b("synthetic camera switch started: from=" + n0Var + ", to=" + n0Var2 + ", expectedWaitMs=" + uVar.b0 + ", targetBlurRadiusPx=" + (((uVar.N.a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((uVar.Z + uVar.a0) / 1000000));
            uVar.Q = -1L;
            handler.removeCallbacks(uVar.x0);
            handler.post(uVar.x0);
        }
    }

    private final void c() {
        qi.e eVar = (qi.e) this.b;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        m4.i iVar = (m4.i) this.d;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
        synchronized (eVar.a) {
            try {
                if (atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                } else {
                    eVar.i(iVar);
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
    private final void d() {
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
        o0 o0Var = (o0) this.b;
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        ArrayList arrayList3 = (ArrayList) this.d;
        if (atomicInteger.incrementAndGet() == arrayList3.size()) {
            ArrayList arrayList4 = new ArrayList();
            int i10 = 0;
            for (ArrayList arrayList5 = (ArrayList) this.e; i10 < arrayList5.size(); arrayList5 = arrayList2) {
                y yVar = (y) arrayList5.get(i10);
                if (yVar != null) {
                    try {
                        bitmap = (Bitmap) q8.a(yVar);
                    } catch (CancellationException | ExecutionException e) {
                        synchronized (e2.a.b) {
                            Log.d("MediaSessionLegacyStub", e2.a.a("Failed to get bitmap", e));
                        }
                    }
                    p0 p0Var = (p0) arrayList3.get(i10);
                    int i11 = o.a;
                    String str = !p0Var.a.equals("") ? null : p0Var.a;
                    s0 s0Var = p0Var.d;
                    Bitmap bitmap2 = bitmap == null ? bitmap : null;
                    bundle = s0Var.J;
                    CharSequence charSequence3 = s0Var.a;
                    CharSequence charSequence4 = s0Var.g;
                    CharSequence charSequence5 = s0Var.f;
                    n0Var = s0Var.K;
                    Integer num = s0Var.I;
                    Integer num2 = s0Var.q;
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
                            bundle4.putLong("android.media.extra.BT_FOLDER_TYPE", o.a(num2.intValue()));
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
                    charSequence = s0Var.e;
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
                                            charSequence2 = s0Var.b;
                                            break;
                                        case 1:
                                        default:
                                            charSequence2 = null;
                                            break;
                                        case 2:
                                            charSequence2 = s0Var.A;
                                            break;
                                        case 3:
                                            charSequence2 = charSequence5;
                                            break;
                                        case 4:
                                            charSequence2 = charSequence4;
                                            break;
                                        case 5:
                                            charSequence2 = s0Var.B;
                                            break;
                                        case 6:
                                            charSequence2 = s0Var.c;
                                            break;
                                        case 7:
                                            charSequence2 = charSequence3;
                                            break;
                                        case '\b':
                                            charSequence2 = s0Var.d;
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
                    arrayList4.add(new q(new n4.h(str, charSequence, charSequence5, charSequence4, bitmap2, s0Var.n, bundle3, p0Var.f.a), i10 != -1 ? -1L : i10));
                    i10++;
                    arrayList3 = arrayList;
                }
                bitmap = null;
                p0 p0Var2 = (p0) arrayList3.get(i10);
                int i112 = o.a;
                if (!p0Var2.a.equals("")) {
                }
                s0 s0Var2 = p0Var2.d;
                if (bitmap == null) {
                }
                bundle = s0Var2.J;
                CharSequence charSequence32 = s0Var2.a;
                CharSequence charSequence42 = s0Var2.g;
                CharSequence charSequence52 = s0Var2.f;
                n0Var = s0Var2.K;
                Integer num3 = s0Var2.I;
                Integer num22 = s0Var2.q;
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
                charSequence = s0Var2.e;
                if (charSequence == null) {
                }
                arrayList4.add(new q(new n4.h(str, charSequence, charSequence52, charSequence42, bitmap2, s0Var2.n, bundle3, p0Var2.f.a), i10 != -1 ? -1L : i10));
                i10++;
                arrayList3 = arrayList;
            }
            q0.D(((q0) o0Var.e).m, arrayList4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void f() {
        j1 j1Var = (j1) this.b;
        w wVar = (w) this.c;
        f0 f0Var = (f0) this.d;
        m mVar = (m) this.e;
        qi.e eVar = j1Var.b;
        boolean z10 = false;
        try {
            j1Var.c.remove(wVar);
            if (f0Var.j()) {
                x.a(mVar);
                return;
            }
            e1 e1Var = (e1) wVar.d;
            e1Var.getClass();
            IBinder asBinder = e1Var.a.asBinder();
            m4.u m10 = f0Var.m(wVar);
            if (eVar.t(wVar)) {
                e2.a.l("MediaSessionStub", "Controller " + wVar + " has sent connection request multiple times");
            }
            eVar.a(asBinder, wVar, m10.a, m10.b);
            v q6 = eVar.q(wVar);
            if (q6 == null) {
                e2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                x.a(mVar);
                return;
            }
            n1 n1Var = f0Var.t;
            l1 l1Var = f0Var.s;
            c1 c1Var = m10.b;
            l1 Y0 = j1Var.Y0(l1Var);
            MediaSession.Token token = ((n) f0Var.h.m.b).c.b;
            e9.n0 n0Var = m10.c;
            if (n0Var == null) {
                n0Var = f0Var.y;
            }
            e9.n0 n0Var2 = m10.d;
            if (n0Var2 == null) {
                n0Var2 = f0Var.z;
            }
            e9.n0 n0Var3 = f0Var.r;
            q1 q1Var = m10.a;
            c1 s10 = n1Var.s();
            v1 v1Var = f0Var.j.a;
            v1Var.getClass();
            k kVar = new k(j1Var, n0Var, n0Var2, n0Var3, q1Var, c1Var, s10, new Bundle(v1Var.g), f0Var.A, Y0, token);
            if (f0Var.j()) {
                x.a(mVar);
                return;
            }
            try {
                ((l) mVar).F0(q6.e(), kVar.a(wVar.c));
                z10 = true;
            } catch (RemoteException unused) {
            }
            if (z10 && (!f0Var.x || !f0.k(wVar))) {
                f0Var.e.getClass();
            }
        } finally {
            if (0 == 0) {
                x.a(mVar);
            }
        }
    }

    private final void g() {
        f0 f0Var = (f0) this.b;
        e0 e0Var = (e0) this.c;
        e2.j jVar = (e2.j) this.d;
        y yVar = (y) this.e;
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

    private final void h() {
        f0 f0Var = (f0) this.b;
        g1 g1Var = (g1) this.c;
        w wVar = (w) this.d;
        List list = (List) this.e;
        if (f0Var.j()) {
            return;
        }
        g1Var.a(f0Var.t, wVar, list);
    }

    private final void i() {
        CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
    }

    private final void j() {
        CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
    }

    private final void k() {
        ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (m80) this.e);
    }

    private final void l() {
        ((Utilities.Callback) this.b).run(g6.R0((File) this.c, (String) this.d, (String[]) this.e));
    }

    /* JADX WARN: Code restructure failed: missing block: B:347:0x08ca, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new bi.j8(r2, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x08d3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:355:0x08c7, code lost:
    
        if (r6 != null) goto L315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x017f, code lost:
    
        if (r11 == null) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:417:0x09fe  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        k8 k8Var;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        rb rbVar;
        char c10;
        m2 U;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i10;
        float f7;
        int i11;
        long j10;
        float f10;
        int[][] iArr;
        long j11;
        long j12;
        ArrayList arrayList2;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings;
        char c11 = 2;
        r11 = null;
        SQLiteCursor sQLiteCursor = null;
        int i12 = 0;
        switch (this.a) {
            case 0:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.b;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str = (String) this.d;
                c cVar = (c) this.e;
                if (oVar != null && ((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                    i.b(iOnDoneCallback, str, cVar);
                    return;
                }
                i.f(iOnDoneCallback, str, new IllegalStateException("Lifecycle is not at least created when dispatching " + cVar));
                return;
            case 1:
                h5 h5Var = (h5) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                q5 q5Var = h5Var.l;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    MessagesController.getInstance(q5Var.C2).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(q5Var.C2).putChats(tL_stories_stories.chats, false);
                    for (int i13 = 0; i13 < tL_stories_stories.stories.size(); i13++) {
                        if (tL_stories_stories.stories.get(i13).id == storyItem2.id) {
                            callback.run(tL_stories_stories.stories.get(i13).media.document);
                            return;
                        }
                    }
                }
                callback.run(null);
                return;
            case 2:
                h5 h5Var2 = (h5) this.b;
                Activity activity = (Activity) this.c;
                sb sbVar = (sb) this.d;
                n5 n5Var = (n5) this.e;
                kc D = kc.D(activity, h5Var2.l.C2);
                p5 p5Var = h5Var2.l.M2;
                long j13 = (p5Var == null || (rbVar = (rb) p5Var.c) == null) ? 0L : rbVar.currentPosition;
                a1 a1Var = MessagesController.getInstance(h5Var2.l.C2).getStoriesController().w;
                TL_stories.StoryItem storyItem3 = h5Var2.l.O1.a;
                long j14 = storyItem3.dialogId;
                ArrayList arrayList3 = a1Var.b;
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList3.get(i14);
                    i14++;
                    k8 k8Var2 = (k8) obj;
                    if (k8Var2.g && storyItem3.id == k8Var2.f && j14 == k8Var2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList3;
                        storyItem = storyItem3;
                        if ((document == null || document.id == k8Var2.H) && ((photo = messageMedia.photo) == null || photo.id == k8Var2.I)) {
                            k8Var2.h = true;
                            k8Var = k8Var2;
                            if (k8Var != null || k8Var.u || (file = k8Var.L) == null || !file.exists()) {
                                k8Var = k8.n(h5Var2.l.O1.h(), h5Var2.l.O1.a);
                                k8Var.e = h5Var2.l.B1;
                            }
                            k8 g10 = k8Var.g();
                            if (h5Var2.l.I0()) {
                                q5 q5Var2 = h5Var2.l;
                                g10.J0 = q5Var2.B1;
                                g10.L0 = MessagesController.toInputMedia(q5Var2.O1.a.media);
                                o8 o8Var = sbVar.O0;
                                if (o8Var instanceof f8) {
                                    g10.K0 = ((f8) o8Var).E;
                                }
                            }
                            D.R(fc.d(sbVar), g10, j13);
                            D.Q = new z4(h5Var2, 3);
                            D.R = new c5(h5Var2, n5Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList3;
                        storyItem = storyItem3;
                    }
                    storyItem3 = storyItem;
                    arrayList3 = arrayList;
                }
                k8Var = null;
                if (k8Var != null) {
                }
                k8Var = k8.n(h5Var2.l.O1.h(), h5Var2.l.O1.a);
                k8Var.e = h5Var2.l.B1;
                k8 g102 = k8Var.g();
                if (h5Var2.l.I0()) {
                }
                D.R(fc.d(sbVar), g102, j13);
                D.Q = new z4(h5Var2, 3);
                D.R = new c5(h5Var2, n5Var, 1);
                return;
            case 3:
                i8 i8Var = (i8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                i8Var.i = false;
                if (tLObject2 instanceof TL_stories.TL_storyAlbum) {
                    p8 a2 = p8.a((TL_stories.TL_storyAlbum) tLObject2);
                    i8Var.h.add(a2);
                    i8Var.f(true);
                    if (callback2 != null) {
                        callback2.run(a2);
                        return;
                    }
                    return;
                }
                if (tL_error == null || (U = LaunchActivity.U()) == null) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    zc.a0(U).f0(tL_error, false);
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(i8Var.a);
                int i15 = NotificationCenter.storyAlbumsCollectionsUpdate;
                Object[] objArr = new Object[2];
                objArr[c10] = Long.valueOf(i8Var.b);
                objArr[1] = i8Var;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, objArr);
                return;
            case 4:
                int i16 = 4;
                int i17 = 3;
                int i18 = 5;
                o8 o8Var2 = (o8) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                MessagesStorage messagesStorage = (MessagesStorage) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                int i19 = o8Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i20 = o8Var2.e;
                sb2.append(i20);
                sb2.append("{");
                long j15 = o8Var2.d;
                sb2.append(j15);
                sb2.append("} saveCache {");
                sb2.append(x8.a(arrayList4));
                i2.d.t("}", sb2);
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    sQLitePreparedStatement2 = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j15 + " AND album_id = " + i19).stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i21 = 0;
                        while (i21 < arrayList4.size()) {
                            try {
                                TL_stories.StoryItem storyItem4 = ((MessageObject) arrayList4.get(i21)).storyItem;
                                if (storyItem4 == null) {
                                    i10 = i16;
                                } else {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                    storyItem4.serializeToStream(nativeByteBuffer);
                                    sQLitePreparedStatement2.requery();
                                    sQLitePreparedStatement2.bindLong(1, j15);
                                    sQLitePreparedStatement2.bindInteger(2, storyItem4.id);
                                    sQLitePreparedStatement2.bindByteBuffer(i17, nativeByteBuffer);
                                    sQLitePreparedStatement2.bindInteger(i16, i20);
                                    sQLitePreparedStatement2.bindInteger(i18, o8Var2.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                    sQLitePreparedStatement2.bindInteger(6, arrayList5.indexOf(Integer.valueOf(storyItem4.id)) + 1);
                                    sQLitePreparedStatement2.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindLong(1, j15);
                                    i18 = 5;
                                    sQLitePreparedStatement.bindInteger(2, i19);
                                    sQLitePreparedStatement.bindInteger(3, storyItem4.id);
                                    i10 = 4;
                                    sQLitePreparedStatement.bindInteger(4, i21);
                                    sQLitePreparedStatement.step();
                                }
                                i21++;
                                i16 = i10;
                                i17 = 3;
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
            case 5:
                a7 a7Var = (a7) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                k8 k8Var3 = (k8) this.d;
                boolean[] zArr = (boolean[]) this.e;
                la laVar = a7Var.G;
                Bitmap bitmap = a7Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    a7Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                a7Var.a = bitmap2;
                if (k8Var3 != null && !k8Var3.c && k8Var3.K && bitmap2 != null) {
                    k8Var3.k0 = bitmap2.getWidth();
                    k8Var3.l0 = a7Var.a.getHeight();
                    k8Var3.A();
                }
                if (zArr[0] && k8Var3 != null && laVar != null && a7Var.a != null) {
                    laVar.e();
                    laVar.f(k8Var3.b(a7Var.a, 0.2f), false);
                    ga gaVar = a7Var.v;
                    if (gaVar != null) {
                        gaVar.run();
                    }
                }
                a7Var.r();
                a7Var.invalidate();
                return;
            case 6:
                k8 k8Var4 = (k8) this.b;
                String str2 = (String) this.d;
                int[][] iArr2 = (int[][]) this.c;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                k8Var4.getClass();
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                videoEditedInfo.isStory = true;
                videoEditedInfo.fromCamera = k8Var4.c1;
                videoEditedInfo.originalWidth = k8Var4.k0;
                videoEditedInfo.originalHeight = k8Var4.l0;
                videoEditedInfo.resultWidth = k8Var4.i0;
                videoEditedInfo.resultHeight = k8Var4.j0;
                File file2 = k8Var4.P0;
                videoEditedInfo.paintPath = file2 == null ? null : file2.getPath();
                File file3 = k8Var4.W0;
                videoEditedInfo.messagePath = file3 == null ? null : file3.getPath();
                File file4 = k8Var4.X0;
                videoEditedInfo.messageVideoMaskPath = file4 == null ? null : file4.getPath();
                File file5 = k8Var4.Y0;
                videoEditedInfo.backgroundPath = file5 == null ? null : file5.getPath();
                int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
                float f11 = 8.0f;
                if (!k8Var4.K || str2 == null || k8Var4.v()) {
                    File file6 = k8Var4.Z0;
                    if (file6 != null) {
                        videoEditedInfo.originalPath = file6.getAbsolutePath();
                    } else {
                        videoEditedInfo.originalPath = str2;
                    }
                    videoEditedInfo.isPhoto = true;
                    videoEditedInfo.collage = k8Var4.S;
                    if (k8Var4.v()) {
                        int i22 = 0;
                        boolean z11 = false;
                        while (i22 < k8Var4.T.size()) {
                            k8 k8Var5 = (k8) k8Var4.T.get(i22);
                            if (k8Var5.K) {
                                k8Var5.k0 = Math.max(k8Var5.k0, iArr2[i22][1]);
                                k8Var5.l0 = Math.max(k8Var5.l0, iArr2[i22][c11]);
                                f10 = f11;
                                iArr = iArr2;
                                k8Var5.h0 = Math.max(k8Var5.h0, iArr2[i22][4]);
                                z11 = true;
                            } else {
                                f10 = f11;
                                iArr = iArr2;
                            }
                            i22++;
                            f11 = f10;
                            iArr2 = iArr;
                            c11 = 2;
                            z11 = z11;
                        }
                        f7 = f11;
                        ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(k8Var4);
                        videoEditedInfo.collageParts = parts;
                        if (z11) {
                            int size2 = parts.size();
                            VideoEditedInfo.Part part = null;
                            int i23 = 0;
                            long j16 = 0;
                            while (i23 < size2) {
                                VideoEditedInfo.Part part2 = parts.get(i23);
                                i23++;
                                VideoEditedInfo.Part part3 = part2;
                                int i24 = i12;
                                long j17 = j16;
                                if (part3.isVideo) {
                                    long j18 = part3.duration;
                                    if (j18 > j17) {
                                        j16 = j18;
                                        part = part3;
                                        i12 = i24;
                                    }
                                }
                                j16 = j17;
                                i12 = i24;
                            }
                            i11 = i12;
                            if (part != null) {
                                float f12 = part.duration;
                                float f13 = part.right;
                                float f14 = part.left;
                                long j19 = (long) ((f13 - f14) * f12);
                                k8Var4.h0 = j19;
                                videoEditedInfo.originalDuration = j19;
                                videoEditedInfo.estimatedDuration = j19;
                                j10 = -(part.offset + ((long) (f14 * f12)));
                                part.offset = j10;
                                ArrayList<VideoEditedInfo.Part> arrayList6 = videoEditedInfo.collageParts;
                                int size3 = arrayList6.size();
                                int i25 = i11;
                                while (i25 < size3) {
                                    VideoEditedInfo.Part part4 = arrayList6.get(i25);
                                    i25++;
                                    VideoEditedInfo.Part part5 = part4;
                                    if (part5.isVideo && part5 != part) {
                                        part5.offset += j10;
                                    }
                                }
                                videoEditedInfo.startTime = -1L;
                                videoEditedInfo.endTime = -1L;
                                videoEditedInfo.muted = true;
                                videoEditedInfo.originalBitrate = -1;
                                videoEditedInfo.volume = 1.0f;
                                videoEditedInfo.bitrate = -1;
                                videoEditedInfo.framerate = 30;
                                videoEditedInfo.estimatedSize = (long) (((k8Var4.h0 / 1000.0f) * extractRealEncoderBitrate) / f7);
                                videoEditedInfo.filterState = null;
                            }
                        } else {
                            long j20 = k8Var4.S0;
                            k8Var4.h0 = j20;
                            videoEditedInfo.originalDuration = j20;
                            videoEditedInfo.estimatedDuration = j20;
                            i11 = 0;
                        }
                    } else {
                        f7 = 8.0f;
                        i11 = 0;
                        if (k8Var4.o0 != null) {
                            long j21 = (long) ((k8Var4.t0 - k8Var4.s0) * k8Var4.q0);
                            k8Var4.h0 = j21;
                            videoEditedInfo.originalDuration = j21;
                            videoEditedInfo.estimatedDuration = j21;
                        } else if (k8Var4.y != null) {
                            long j22 = (long) ((k8Var4.F - k8Var4.E) * k8Var4.C);
                            k8Var4.h0 = j22;
                            videoEditedInfo.originalDuration = j22;
                            videoEditedInfo.estimatedDuration = j22;
                        } else {
                            long j23 = k8Var4.S0;
                            k8Var4.h0 = j23;
                            videoEditedInfo.originalDuration = j23;
                            videoEditedInfo.estimatedDuration = j23;
                        }
                    }
                    j10 = 0;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                    videoEditedInfo.muted = true;
                    videoEditedInfo.originalBitrate = -1;
                    videoEditedInfo.volume = 1.0f;
                    videoEditedInfo.bitrate = -1;
                    videoEditedInfo.framerate = 30;
                    videoEditedInfo.estimatedSize = (long) (((k8Var4.h0 / 1000.0f) * extractRealEncoderBitrate) / f7);
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
                    if (videoBitrate >= 1000000 || (arrayList2 = k8Var4.T0) == null || arrayList2.isEmpty()) {
                        int i26 = videoEditedInfo.originalBitrate;
                        if (i26 < 500000) {
                            videoEditedInfo.bitrate = 2500000;
                            videoEditedInfo.originalBitrate = -1;
                        } else {
                            videoEditedInfo.bitrate = Utilities.clamp(i26, 3000000, 500000);
                        }
                    } else {
                        videoEditedInfo.bitrate = 2000000;
                        videoEditedInfo.originalBitrate = -1;
                    }
                    StringBuilder sb3 = new StringBuilder("story bitrate, original = ");
                    sb3.append(videoEditedInfo.originalBitrate);
                    sb3.append(" => ");
                    org.telegram.messenger.q.p(videoEditedInfo.bitrate, sb3);
                    int i27 = iArr2[0][4];
                    long j24 = i27;
                    k8Var4.h0 = j24;
                    videoEditedInfo.originalDuration = j24 * 1000;
                    float f15 = j24;
                    long j25 = ((long) (k8Var4.Z * f15)) * 1000;
                    videoEditedInfo.startTime = j25;
                    long j26 = ((long) (k8Var4.a0 * f15)) * 1000;
                    videoEditedInfo.endTime = j26;
                    videoEditedInfo.estimatedDuration = j26 - j25;
                    videoEditedInfo.volume = k8Var4.P;
                    videoEditedInfo.muted = k8Var4.Y;
                    videoEditedInfo.estimatedSize = (long) a1.g.B(i27 / 1000.0f, extractRealEncoderBitrate, 8.0f, r7[5]);
                    videoEditedInfo.estimatedSize = Math.max(k8Var4.L.length(), videoEditedInfo.estimatedSize);
                    videoEditedInfo.filterState = k8Var4.a1;
                    File file7 = k8Var4.Q0;
                    videoEditedInfo.blurPath = file7 != null ? file7.getPath() : null;
                    i11 = 0;
                    j10 = 0;
                }
                videoEditedInfo.account = k8Var4.a;
                videoEditedInfo.wallpaperPeerId = k8Var4.z0;
                videoEditedInfo.isDark = k8Var4.y0;
                videoEditedInfo.avatarStartTime = -1L;
                MediaController.CropState cropState = k8Var4.m0;
                if (cropState != null) {
                    videoEditedInfo.cropState = cropState.clone();
                } else {
                    videoEditedInfo.cropState = new MediaController.CropState();
                }
                videoEditedInfo.cropState.useMatrix = new Matrix();
                videoEditedInfo.cropState.useMatrix.set(k8Var4.n0);
                videoEditedInfo.mediaEntities = k8Var4.T0;
                videoEditedInfo.gradientTopColor = Integer.valueOf(k8Var4.A0);
                videoEditedInfo.gradientBottomColor = Integer.valueOf(k8Var4.B0);
                videoEditedInfo.forceFragmenting = true;
                videoEditedInfo.hdrInfo = k8Var4.d1;
                videoEditedInfo.mixedSoundInfos.clear();
                if (k8Var4.v() && !k8Var4.Y) {
                    ArrayList<VideoEditedInfo.Part> arrayList7 = videoEditedInfo.collageParts;
                    int size4 = arrayList7.size();
                    int i28 = i11;
                    while (i28 < size4) {
                        VideoEditedInfo.Part part6 = arrayList7.get(i28);
                        i28++;
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
                File file8 = k8Var4.o0;
                if (file8 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file8.getAbsolutePath());
                    mixedSoundInfo2.volume = k8Var4.u0;
                    float f18 = k8Var4.s0;
                    float f19 = k8Var4.q0;
                    long j27 = ((long) (f18 * f19)) * 1000;
                    mixedSoundInfo2.audioOffset = j27;
                    if (k8Var4.K) {
                        mixedSoundInfo2.startTime = ((long) (k8Var4.r0 - (k8Var4.Z * k8Var4.h0))) * 1000;
                        j12 = 0;
                    } else {
                        j12 = 0;
                        mixedSoundInfo2.startTime = 0L;
                    }
                    long j28 = mixedSoundInfo2.startTime + j10;
                    mixedSoundInfo2.startTime = j28;
                    if (j28 < j12) {
                        mixedSoundInfo2.audioOffset = j27 - j28;
                        mixedSoundInfo2.startTime = j12;
                    }
                    mixedSoundInfo2.duration = ((long) ((k8Var4.t0 - f18) * f19)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
                }
                String str3 = k8Var4.y;
                if (str3 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str3);
                    mixedSoundInfo3.volume = k8Var4.G;
                    float f20 = k8Var4.E;
                    float f21 = k8Var4.C;
                    long j29 = ((long) (f20 * f21)) * 1000;
                    mixedSoundInfo3.audioOffset = j29;
                    if (k8Var4.K) {
                        mixedSoundInfo3.startTime = ((long) (k8Var4.D - (k8Var4.Z * k8Var4.h0))) * 1000;
                        j11 = 0;
                    } else {
                        j11 = 0;
                        mixedSoundInfo3.startTime = 0L;
                    }
                    long j30 = mixedSoundInfo3.startTime + j10;
                    mixedSoundInfo3.startTime = j30;
                    if (j30 < j11) {
                        mixedSoundInfo3.audioOffset = j29 - j30;
                        mixedSoundInfo3.startTime = j11;
                    }
                    mixedSoundInfo3.duration = ((long) ((k8Var4.F - f20) * f21)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
                }
                callback3.run(videoEditedInfo);
                return;
            case 7:
                di.d dVar = (di.d) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                e3 e3Var = (e3) this.d;
                u1 u1Var = (u1) this.e;
                dVar.setLoading(false);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    e3Var.dismiss();
                    u1Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 8:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                e3 e3Var2 = (e3) this.c;
                c6 c6Var = (c6) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new zc(e3Var2.topBulletinContainer, c6Var).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, fi.l.H0(connectedbotstarref.commission_permille), UserObject.getUserName(user))), R.raw.copy).j();
                return;
            case 9:
                f4.y0((f4) this.b, (Context) this.c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.e);
                return;
            case 10:
                TLObject tLObject4 = (TLObject) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                org.telegram.ui.web.q qVar = (org.telegram.ui.web.q) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (!(tLObject4 instanceof TLRPC.TL_boolTrue)) {
                    if (zArr2[0]) {
                        return;
                    }
                    zArr2[0] = true;
                    qVar.run(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                qVar.run(Boolean.TRUE, "allowed");
                return;
            case 11:
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
            case 12:
                hg.c cVar3 = (hg.c) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                String str5 = (String) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                ArrayList arrayList10 = cVar3.s;
                if (tL_error2 == null) {
                    cVar3.F = 0;
                    cVar3.h = false;
                    arrayList10.clear();
                    cVar3.J = false;
                    cVar3.x = str5;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject5;
                    int size5 = messages_botresults.results.size();
                    while (i12 < size5) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i12);
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
                        i12++;
                    }
                }
                hg.b bVar = cVar3.y;
                if (bVar != null) {
                    bVar.a(arrayList10);
                }
                cVar3.l();
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new b((hg.m) this.b, (Runnable) this.d, (ArrayList) this.e, s4.o.c((hg.g) this.c, true), 14));
                return;
            case 14:
                hg.m mVar = (hg.m) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                m4.d dVar2 = (m4.d) this.e;
                if (mVar.Z) {
                    mVar.Z = false;
                    if (runnable != null) {
                        runnable.run();
                    }
                    mVar.M = arrayList11;
                    dVar2.c(mVar);
                    if (mVar.a0) {
                        mVar.a0 = false;
                        mVar.W(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                ig.y yVar = (ig.y) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                Runnable runnable2 = (Runnable) this.e;
                ArrayList arrayList12 = yVar.b;
                if (tLObject6 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject6;
                    int indexOf = arrayList12.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList12.set(indexOf, tL_businessChatLink2);
                        NotificationCenter.getInstance(yVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        yVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                b2 b2Var = (b2) this.b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                a2 a2Var = (a2) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                ArrayList arrayList13 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = messagesStorage2.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(a2Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList13.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Throwable th5) {
                        if (sQLiteCursor != null) {
                            sQLiteCursor.dispose();
                        }
                        throw th5;
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                    break;
                }
                sQLiteCursor.dispose();
                AndroidUtilities.runOnUIThread(new b(b2Var, arrayList13, a2Var, tL_messages_sendQuickReplyMessages, 17));
                return;
            case 17:
                a();
                return;
            case 18:
                r rVar = (r) this.b;
                ji.a aVar = (ji.a) this.c;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.d;
                m80 m80Var = (m80) this.e;
                rVar.r.W4(aVar, pageBlock);
                m80Var.u();
                return;
            case 19:
                b();
                return;
            case 20:
                c();
                return;
            case 21:
                d();
                return;
            case 22:
                f();
                return;
            case 23:
                g();
                return;
            case 24:
                h();
                return;
            case 25:
                i();
                return;
            case 26:
                j();
                return;
            case 27:
                k();
                return;
            case 28:
                l();
                return;
            default:
                TLObject tLObject7 = (TLObject) this.b;
                e6 e6Var = (e6) this.c;
                f6 f6Var = (f6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                g6.A--;
                if (tLObject7 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject7;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (e6Var == null || themeSettings == null) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 != null && document2.id != tL_theme.document.id) {
                            if (e6Var != null) {
                                e6Var.r = tL_theme2;
                            } else {
                                f6Var.F = tL_theme2;
                                f6Var.G = false;
                                f6Var.g0 = null;
                                f6Var.h0 = null;
                                NotificationCenter.getInstance(f6Var.E).addObserver(f6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(f6Var.E).addObserver(f6Var, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(f6Var.E);
                                TLRPC.TL_theme tL_theme3 = f6Var.F;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                        }
                    } else {
                        if (f6.a(e6Var, themeSettings)) {
                            z10 = false;
                        } else {
                            File d = e6Var.d();
                            if (d != null) {
                                d.delete();
                            }
                            f6.i(e6Var, themeSettings);
                            f6 f6Var2 = g6.I;
                            if (f6Var2 == f6Var && f6Var2.Y == e6Var.a) {
                                g6.o1(false, false);
                                g6.J(ApplicationLoader.applicationContext, false);
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                int i29 = NotificationCenter.needSetDayNightTheme;
                                f6 f6Var3 = g6.I;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i29, f6Var3, Boolean.valueOf(g6.J == f6Var3), null, -1);
                            }
                            b6.a(true);
                            z10 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        e6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        r12 = z10;
                    }
                    if (g6.A != 0) {
                        g6.B = (int) (System.currentTimeMillis() / 1000);
                        g6.t1(r12, false);
                        return;
                    }
                    return;
                }
                r12 = false;
                if (g6.A != 0) {
                }
                break;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
