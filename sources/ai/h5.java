package ai;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.media.AudioTrack;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
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
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.y70;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h5(x8 x8Var, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.a = 2;
        this.b = x8Var;
        this.c = tLObject;
        this.e = callback;
        this.d = tL_error;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.b;
        k2.n nVar = (k2.n) this.c;
        Handler handler = (Handler) this.d;
        k2.k kVar = (k2.k) this.e;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, nVar, kVar));
            }
            synchronized (k2.e0.o0) {
                try {
                    int i10 = k2.e0.q0 - 1;
                    k2.e0.q0 = i10;
                    if (i10 == 0) {
                        k2.e0.p0.shutdown();
                        k2.e0.p0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, nVar, kVar));
            }
            synchronized (k2.e0.o0) {
                try {
                    int i11 = k2.e0.q0 - 1;
                    k2.e0.q0 = i11;
                    if (i11 == 0) {
                        k2.e0.p0.shutdown();
                        k2.e0.p0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015b, code lost:
    
        if (r8.equals("android.media.metadata.DISPLAY_SUBTITLE") == false) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        Bitmap bitmap;
        Bundle bundle;
        e9.i0 i0Var;
        Bundle bundle2;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        Bundle bundle3;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        m4.i0 i0Var2 = (m4.i0) this.b;
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        ArrayList arrayList3 = (ArrayList) this.d;
        if (atomicInteger.incrementAndGet() == arrayList3.size()) {
            ArrayList arrayList4 = new ArrayList();
            int i10 = 0;
            for (ArrayList arrayList5 = (ArrayList) this.e; i10 < arrayList5.size(); arrayList5 = arrayList2) {
                i9.w wVar = (i9.w) arrayList5.get(i10);
                if (wVar != null) {
                    try {
                        bitmap = (Bitmap) v7.m8.a(wVar);
                    } catch (CancellationException | ExecutionException e) {
                        synchronized (e2.a.b) {
                            Log.d("MediaSessionLegacyStub", e2.a.a("Failed to get bitmap", e));
                        }
                    }
                    b2.k0 k0Var = (b2.k0) arrayList3.get(i10);
                    int i11 = m4.k.a;
                    String str = !k0Var.a.equals("") ? null : k0Var.a;
                    b2.n0 n0Var = k0Var.d;
                    Bitmap bitmap2 = bitmap == null ? bitmap : null;
                    bundle = n0Var.I;
                    CharSequence charSequence4 = n0Var.a;
                    CharSequence charSequence5 = n0Var.f;
                    i0Var = n0Var.J;
                    Integer num = n0Var.H;
                    Integer num2 = n0Var.p;
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
                            bundle4.putLong("android.media.extra.BT_FOLDER_TYPE", m4.k.a(num2.intValue()));
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
                    if (!i0Var.isEmpty()) {
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(i0Var));
                    }
                    charSequence = n0Var.e;
                    if (charSequence == null) {
                        charSequence2 = n0Var.g;
                        if (bundle3 == null) {
                            bundle3 = new Bundle();
                        }
                        bundle3.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence4);
                    } else {
                        int i12 = 3;
                        CharSequence[] charSequenceArr = new CharSequence[3];
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            char c10 = 2;
                            if (i13 < i12) {
                                String[] strArr = n4.m.d;
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
                                        case -1224124471:
                                            if (str2.equals("android.media.metadata.WRITER")) {
                                                c10 = 1;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 194702059:
                                            break;
                                        case 1684534006:
                                            if (str2.equals("android.media.metadata.COMPOSER")) {
                                                c10 = 3;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1879671865:
                                            if (str2.equals("android.media.metadata.ALBUM")) {
                                                c10 = 4;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1897146402:
                                            if (str2.equals("android.media.metadata.TITLE")) {
                                                c10 = 5;
                                                break;
                                            }
                                            c10 = 65535;
                                            break;
                                        case 1965214221:
                                            if (str2.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                c10 = 6;
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
                                            charSequence3 = n0Var.b;
                                            break;
                                        case 1:
                                            charSequence3 = n0Var.z;
                                            break;
                                        case 2:
                                            charSequence3 = charSequence5;
                                            break;
                                        case 3:
                                            charSequence3 = n0Var.A;
                                            break;
                                        case 4:
                                            charSequence3 = n0Var.c;
                                            break;
                                        case 5:
                                            charSequence3 = charSequence4;
                                            break;
                                        case 6:
                                            charSequence3 = n0Var.d;
                                            break;
                                        default:
                                            charSequence3 = null;
                                            break;
                                    }
                                    if (!TextUtils.isEmpty(charSequence3)) {
                                        charSequenceArr[i13] = charSequence3;
                                        i13++;
                                    }
                                    i14 = i15;
                                    i12 = 3;
                                }
                            }
                        }
                        charSequence = charSequenceArr[0];
                        charSequence5 = charSequenceArr[1];
                        charSequence2 = charSequenceArr[2];
                    }
                    arrayList4.add(new n4.v(new n4.l(str, charSequence, charSequence5, charSequence2, bitmap2, n0Var.m, bundle3, k0Var.f.a), i10 != -1 ? -1L : i10));
                    i10++;
                    arrayList3 = arrayList;
                }
                bitmap = null;
                b2.k0 k0Var2 = (b2.k0) arrayList3.get(i10);
                int i112 = m4.k.a;
                if (!k0Var2.a.equals("")) {
                }
                b2.n0 n0Var2 = k0Var2.d;
                if (bitmap == null) {
                }
                bundle = n0Var2.I;
                CharSequence charSequence42 = n0Var2.a;
                CharSequence charSequence52 = n0Var2.f;
                i0Var = n0Var2.J;
                Integer num3 = n0Var2.H;
                Integer num22 = n0Var2.p;
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
                if (!i0Var.isEmpty()) {
                }
                charSequence = n0Var2.e;
                if (charSequence == null) {
                }
                arrayList4.add(new n4.v(new n4.l(str, charSequence, charSequence52, charSequence2, bitmap2, n0Var2.m, bundle3, k0Var2.f.a), i10 != -1 ? -1L : i10));
                i10++;
                arrayList3 = arrayList;
            }
            m4.k0.D(((m4.k0) i0Var2.e).k, arrayList4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        m4.a1 a1Var = (m4.a1) this.b;
        m4.r rVar = (m4.r) this.c;
        m4.a0 a0Var = (m4.a0) this.d;
        m4.i iVar = (m4.i) this.e;
        a1Var.getClass();
        oi.f fVar = a1Var.b;
        boolean z10 = false;
        try {
            a1Var.c.remove(rVar);
            if (a0Var.j()) {
                w7.v.a(iVar);
                return;
            }
            m4.w0 w0Var = (m4.w0) rVar.d;
            e2.d.h(w0Var);
            IBinder asBinder = w0Var.a.asBinder();
            m4.p m10 = a0Var.m(rVar);
            if (fVar.A(rVar)) {
                e2.a.n("MediaSessionStub", "Controller " + rVar + " has sent connection request multiple times");
            }
            fVar.b(asBinder, rVar, m10.a, m10.b);
            com.google.android.gms.common.api.internal.v x10 = fVar.x(rVar);
            if (x10 == null) {
                e2.a.n("MediaSessionStub", "Ignoring connection request from unknown controller info");
                w7.v.a(iVar);
                return;
            }
            m4.e1 e1Var = a0Var.t;
            m4.c1 c1Var = a0Var.s;
            b2.x0 x0Var = m10.b;
            m4.c1 H0 = a1Var.H0(c1Var);
            MediaSession.Token token = ((n4.r) a0Var.h.k.b).c.b;
            e9.i0 i0Var = m10.c;
            if (i0Var == null) {
                i0Var = a0Var.y;
            }
            e9.i0 i0Var2 = m10.d;
            if (i0Var2 == null) {
                i0Var2 = a0Var.z;
            }
            e9.i0 i0Var3 = a0Var.r;
            m4.h1 h1Var = m10.a;
            b2.x0 t10 = e1Var.t();
            m4.m1 m1Var = a0Var.j.a;
            m1Var.getClass();
            m4.g gVar = new m4.g(a1Var, i0Var, i0Var2, i0Var3, h1Var, x0Var, t10, new Bundle(m1Var.g), a0Var.A, H0, token);
            if (a0Var.j()) {
                w7.v.a(iVar);
                return;
            }
            try {
                ((m4.h) iVar).G0(x10.e(), gVar.a(rVar.c));
                z10 = true;
            } catch (RemoteException unused) {
            }
            if (z10 && (!a0Var.x || !m4.a0.k(rVar))) {
                a0Var.e.getClass();
            }
        } finally {
            if (0 == 0) {
                w7.v.a(iVar);
            }
        }
    }

    private final void e() {
        oi.f fVar = (oi.f) this.b;
        ((ArrayDeque) fVar.a).addLast(new oi.e((le.b) this.c, (oi.b) this.d, (RequestTimeDelegate) this.e));
        fVar.K();
    }

    private final void f() {
        CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
    }

    private final void g() {
        CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
    }

    private final void h() {
        ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (y70) this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:346:0x08d2, code lost:
    
        if (r6 != null) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x08d4, code lost:
    
        r6.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:348:0x08ea, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new ai.y8(r2, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x08f3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:357:0x08e7, code lost:
    
        if (r6 != null) goto L306;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0166, code lost:
    
        if (r10 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0a26  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ci.l8 l8Var;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        long j3;
        ic icVar;
        char c10;
        org.telegram.ui.ActionBar.m2 U;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        float f7;
        long j10;
        int[][] iArr;
        long j11;
        long j12;
        ArrayList arrayList2;
        int i10 = 6;
        char c11 = 2;
        r10 = null;
        SQLiteCursor sQLiteCursor = null;
        int i11 = 0;
        switch (this.a) {
            case 0:
                v5 v5Var = (v5) this.b;
                TLObject tLObject = (TLObject) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                e6 e6Var = v5Var.l;
                if (tLObject instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject;
                    MessagesController.getInstance(e6Var.C2).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(e6Var.C2).putChats(tL_stories_stories.chats, false);
                    for (int i12 = 0; i12 < tL_stories_stories.stories.size(); i12++) {
                        if (tL_stories_stories.stories.get(i12).id == storyItem2.id) {
                            callback.run(tL_stories_stories.stories.get(i12).media.document);
                            return;
                        }
                    }
                }
                callback.run(null);
                return;
            case 1:
                v5 v5Var2 = (v5) this.b;
                Activity activity = (Activity) this.c;
                jc jcVar = (jc) this.d;
                b6 b6Var = (b6) this.e;
                ci.lc E = ci.lc.E(activity, v5Var2.l.C2);
                d6 d6Var = v5Var2.l.M2;
                long j13 = (d6Var == null || (icVar = (ic) d6Var.c) == null) ? 0L : icVar.currentPosition;
                ci.b1 b1Var = MessagesController.getInstance(v5Var2.l.C2).getStoriesController().w;
                TL_stories.StoryItem storyItem3 = v5Var2.l.O1.a;
                long j14 = storyItem3.dialogId;
                ArrayList arrayList3 = b1Var.b;
                int size = arrayList3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList3.get(i13);
                    i13++;
                    ci.l8 l8Var2 = (ci.l8) obj;
                    if (l8Var2.g && storyItem3.id == l8Var2.f) {
                        j3 = j14;
                        if (j3 == l8Var2.e) {
                            TLRPC.MessageMedia messageMedia = storyItem3.media;
                            TLRPC.Document document = messageMedia.document;
                            if (document != null) {
                                arrayList = arrayList3;
                                storyItem = storyItem3;
                                if (document.id != l8Var2.H) {
                                    continue;
                                }
                            } else {
                                arrayList = arrayList3;
                                storyItem = storyItem3;
                            }
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo == null || photo.id == l8Var2.I) {
                                l8Var2.h = true;
                                l8Var = l8Var2;
                                if (l8Var != null || l8Var.u || (file = l8Var.L) == null || !file.exists()) {
                                    l8Var = ci.l8.n(v5Var2.l.O1.h(), v5Var2.l.O1.a);
                                    l8Var.e = v5Var2.l.B1;
                                }
                                ci.l8 g10 = l8Var.g();
                                if (v5Var2.l.I0()) {
                                    e6 e6Var2 = v5Var2.l;
                                    g10.J0 = e6Var2.B1;
                                    g10.L0 = MessagesController.toInputMedia(e6Var2.O1.a.media);
                                    d9 d9Var = jcVar.O0;
                                    if (d9Var instanceof u8) {
                                        g10.K0 = ((u8) d9Var).E;
                                    }
                                }
                                E.S(ci.gc.d(jcVar), g10, j13);
                                E.Q = new m5(v5Var2, 3);
                                E.R = new p5(v5Var2, b6Var, 1);
                                return;
                            }
                        } else {
                            arrayList = arrayList3;
                            storyItem = storyItem3;
                        }
                    } else {
                        arrayList = arrayList3;
                        storyItem = storyItem3;
                        j3 = j14;
                    }
                    storyItem3 = storyItem;
                    arrayList3 = arrayList;
                    j14 = j3;
                }
                l8Var = null;
                if (l8Var != null) {
                }
                l8Var = ci.l8.n(v5Var2.l.O1.h(), v5Var2.l.O1.a);
                l8Var.e = v5Var2.l.B1;
                ci.l8 g102 = l8Var.g();
                if (v5Var2.l.I0()) {
                }
                E.S(ci.gc.d(jcVar), g102, j13);
                E.Q = new m5(v5Var2, 3);
                E.R = new p5(v5Var2, b6Var, 1);
                return;
            case 2:
                x8 x8Var = (x8) this.b;
                TLObject tLObject2 = (TLObject) this.c;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
                x8Var.i = false;
                if (tLObject2 instanceof TL_stories.TL_storyAlbum) {
                    e9 a2 = e9.a((TL_stories.TL_storyAlbum) tLObject2);
                    x8Var.h.add(a2);
                    x8Var.f(true);
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
                    yc.a0(U).d0(tL_error, false);
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(x8Var.a);
                int i14 = NotificationCenter.storyAlbumsCollectionsUpdate;
                Object[] objArr = new Object[2];
                objArr[c10] = Long.valueOf(x8Var.b);
                objArr[1] = x8Var;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i14, objArr);
                return;
            case 3:
                d9 d9Var2 = (d9) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                MessagesStorage messagesStorage = (MessagesStorage) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                int i15 = d9Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i16 = d9Var2.e;
                sb2.append(i16);
                sb2.append("{");
                long j15 = d9Var2.d;
                sb2.append(j15);
                sb2.append("} saveCache {");
                sb2.append(l9.a(arrayList4));
                com.google.android.gms.internal.vision.e2.t("}", sb2);
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j15 + " AND album_id = " + i15).stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                            try {
                                TL_stories.StoryItem storyItem4 = ((MessageObject) arrayList4.get(i17)).storyItem;
                                if (storyItem4 != null) {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                    storyItem4.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindLong(1, j15);
                                    executeFast.bindInteger(2, storyItem4.id);
                                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                                    executeFast.bindInteger(4, i16);
                                    executeFast.bindInteger(5, d9Var2.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                    executeFast.bindInteger(6, arrayList5.indexOf(Integer.valueOf(storyItem4.id)) + 1);
                                    executeFast.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindLong(1, j15);
                                    sQLitePreparedStatement.bindInteger(2, i15);
                                    sQLitePreparedStatement.bindInteger(3, storyItem4.id);
                                    sQLitePreparedStatement.bindInteger(4, i17);
                                    sQLitePreparedStatement.step();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                sQLitePreparedStatement2 = executeFast;
                                try {
                                    messagesStorage.checkSQLException(th);
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                        break;
                                    }
                                } catch (Throwable th3) {
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th3;
                                }
                            }
                        }
                        if (executeFast != null) {
                            executeFast.dispose();
                            break;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        sQLitePreparedStatement2 = executeFast;
                        sQLitePreparedStatement = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                }
                break;
            case 4:
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
            case 5:
                ci.b7 b7Var = (ci.b7) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                ci.l8 l8Var3 = (ci.l8) this.d;
                boolean[] zArr = (boolean[]) this.e;
                org.telegram.ui.Components.ja jaVar = b7Var.G;
                Bitmap bitmap = b7Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    b7Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                b7Var.a = bitmap2;
                if (l8Var3 != null && !l8Var3.c && l8Var3.K && bitmap2 != null) {
                    l8Var3.k0 = bitmap2.getWidth();
                    l8Var3.l0 = b7Var.a.getHeight();
                    l8Var3.A();
                }
                if (zArr[0] && l8Var3 != null && jaVar != null && b7Var.a != null) {
                    jaVar.e();
                    jaVar.f(l8Var3.b(b7Var.a, 0.2f), false);
                    ci.ha haVar = b7Var.v;
                    if (haVar != null) {
                        haVar.run();
                    }
                }
                b7Var.r();
                b7Var.invalidate();
                return;
            case 6:
                ci.l8 l8Var4 = (ci.l8) this.b;
                String str2 = (String) this.c;
                int[][] iArr2 = (int[][]) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                l8Var4.getClass();
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                videoEditedInfo.isStory = true;
                videoEditedInfo.fromCamera = l8Var4.c1;
                videoEditedInfo.originalWidth = l8Var4.k0;
                videoEditedInfo.originalHeight = l8Var4.l0;
                videoEditedInfo.resultWidth = l8Var4.i0;
                videoEditedInfo.resultHeight = l8Var4.j0;
                File file2 = l8Var4.P0;
                videoEditedInfo.paintPath = file2 == null ? null : file2.getPath();
                File file3 = l8Var4.W0;
                videoEditedInfo.messagePath = file3 == null ? null : file3.getPath();
                File file4 = l8Var4.X0;
                videoEditedInfo.messageVideoMaskPath = file4 == null ? null : file4.getPath();
                File file5 = l8Var4.Y0;
                videoEditedInfo.backgroundPath = file5 == null ? null : file5.getPath();
                int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
                if (!l8Var4.K || str2 == null || l8Var4.v()) {
                    File file6 = l8Var4.Z0;
                    if (file6 != null) {
                        videoEditedInfo.originalPath = file6.getAbsolutePath();
                    } else {
                        videoEditedInfo.originalPath = str2;
                    }
                    videoEditedInfo.isPhoto = true;
                    videoEditedInfo.collage = l8Var4.S;
                    if (l8Var4.v()) {
                        int i18 = 0;
                        boolean z10 = false;
                        while (i18 < l8Var4.T.size()) {
                            ci.l8 l8Var5 = (ci.l8) l8Var4.T.get(i18);
                            if (l8Var5.K) {
                                l8Var5.k0 = Math.max(l8Var5.k0, iArr2[i18][1]);
                                l8Var5.l0 = Math.max(l8Var5.l0, iArr2[i18][c11]);
                                iArr = iArr2;
                                l8Var5.h0 = Math.max(l8Var5.h0, iArr2[i18][4]);
                                z10 = true;
                            } else {
                                iArr = iArr2;
                            }
                            i18++;
                            iArr2 = iArr;
                            c11 = 2;
                        }
                        ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(l8Var4);
                        videoEditedInfo.collageParts = parts;
                        if (z10) {
                            int size2 = parts.size();
                            VideoEditedInfo.Part part = null;
                            int i19 = 0;
                            long j16 = 0;
                            while (i19 < size2) {
                                VideoEditedInfo.Part part2 = parts.get(i19);
                                i19++;
                                VideoEditedInfo.Part part3 = part2;
                                if (part3.isVideo) {
                                    long j17 = part3.duration;
                                    if (j17 > j16) {
                                        j16 = j17;
                                        part = part3;
                                    }
                                }
                            }
                            f7 = 8.0f;
                            if (part != null) {
                                float f10 = part.duration;
                                float f11 = part.right;
                                float f12 = part.left;
                                long j18 = (long) ((f11 - f12) * f10);
                                l8Var4.h0 = j18;
                                videoEditedInfo.originalDuration = j18;
                                videoEditedInfo.estimatedDuration = j18;
                                j10 = -(part.offset + ((long) (f12 * f10)));
                                part.offset = j10;
                                ArrayList<VideoEditedInfo.Part> arrayList6 = videoEditedInfo.collageParts;
                                int size3 = arrayList6.size();
                                int i20 = 0;
                                while (i20 < size3) {
                                    VideoEditedInfo.Part part4 = arrayList6.get(i20);
                                    i20++;
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
                                videoEditedInfo.estimatedSize = (long) (((l8Var4.h0 / 1000.0f) * extractRealEncoderBitrate) / f7);
                                videoEditedInfo.filterState = null;
                            }
                        } else {
                            long j19 = l8Var4.S0;
                            l8Var4.h0 = j19;
                            videoEditedInfo.originalDuration = j19;
                            videoEditedInfo.estimatedDuration = j19;
                            f7 = 8.0f;
                        }
                    } else {
                        f7 = 8.0f;
                        if (l8Var4.o0 != null) {
                            long j20 = (long) ((l8Var4.t0 - l8Var4.s0) * l8Var4.q0);
                            l8Var4.h0 = j20;
                            videoEditedInfo.originalDuration = j20;
                            videoEditedInfo.estimatedDuration = j20;
                        } else if (l8Var4.y != null) {
                            long j21 = (long) ((l8Var4.F - l8Var4.E) * l8Var4.C);
                            l8Var4.h0 = j21;
                            videoEditedInfo.originalDuration = j21;
                            videoEditedInfo.estimatedDuration = j21;
                        } else {
                            long j22 = l8Var4.S0;
                            l8Var4.h0 = j22;
                            videoEditedInfo.originalDuration = j22;
                            videoEditedInfo.estimatedDuration = j22;
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
                    videoEditedInfo.estimatedSize = (long) (((l8Var4.h0 / 1000.0f) * extractRealEncoderBitrate) / f7);
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
                    if (videoBitrate >= 1000000 || (arrayList2 = l8Var4.T0) == null || arrayList2.isEmpty()) {
                        int i21 = videoEditedInfo.originalBitrate;
                        if (i21 < 500000) {
                            videoEditedInfo.bitrate = 2500000;
                            videoEditedInfo.originalBitrate = -1;
                        } else {
                            videoEditedInfo.bitrate = Utilities.clamp(i21, 3000000, 500000);
                        }
                    } else {
                        videoEditedInfo.bitrate = 2000000;
                        videoEditedInfo.originalBitrate = -1;
                    }
                    StringBuilder sb3 = new StringBuilder("story bitrate, original = ");
                    sb3.append(videoEditedInfo.originalBitrate);
                    sb3.append(" => ");
                    org.telegram.messenger.f0.n(videoEditedInfo.bitrate, sb3);
                    int i22 = iArr2[0][4];
                    long j23 = i22;
                    l8Var4.h0 = j23;
                    videoEditedInfo.originalDuration = j23 * 1000;
                    float f13 = j23;
                    long j24 = ((long) (l8Var4.Z * f13)) * 1000;
                    videoEditedInfo.startTime = j24;
                    long j25 = ((long) (l8Var4.a0 * f13)) * 1000;
                    videoEditedInfo.endTime = j25;
                    videoEditedInfo.estimatedDuration = j25 - j24;
                    videoEditedInfo.volume = l8Var4.P;
                    videoEditedInfo.muted = l8Var4.Y;
                    videoEditedInfo.estimatedSize = (long) a4.a.B(i22 / 1000.0f, extractRealEncoderBitrate, 8.0f, r5[5]);
                    videoEditedInfo.estimatedSize = Math.max(l8Var4.L.length(), videoEditedInfo.estimatedSize);
                    videoEditedInfo.filterState = l8Var4.a1;
                    File file7 = l8Var4.Q0;
                    videoEditedInfo.blurPath = file7 != null ? file7.getPath() : null;
                    j10 = 0;
                }
                videoEditedInfo.account = l8Var4.a;
                videoEditedInfo.wallpaperPeerId = l8Var4.z0;
                videoEditedInfo.isDark = l8Var4.y0;
                videoEditedInfo.avatarStartTime = -1L;
                MediaController.CropState cropState = l8Var4.m0;
                if (cropState != null) {
                    videoEditedInfo.cropState = cropState.clone();
                } else {
                    videoEditedInfo.cropState = new MediaController.CropState();
                }
                videoEditedInfo.cropState.useMatrix = new Matrix();
                videoEditedInfo.cropState.useMatrix.set(l8Var4.n0);
                videoEditedInfo.mediaEntities = l8Var4.T0;
                videoEditedInfo.gradientTopColor = Integer.valueOf(l8Var4.A0);
                videoEditedInfo.gradientBottomColor = Integer.valueOf(l8Var4.B0);
                videoEditedInfo.forceFragmenting = true;
                videoEditedInfo.hdrInfo = l8Var4.d1;
                videoEditedInfo.mixedSoundInfos.clear();
                if (l8Var4.v() && !l8Var4.Y) {
                    ArrayList<VideoEditedInfo.Part> arrayList7 = videoEditedInfo.collageParts;
                    int size4 = arrayList7.size();
                    int i23 = 0;
                    while (i23 < size4) {
                        VideoEditedInfo.Part part6 = arrayList7.get(i23);
                        i23++;
                        VideoEditedInfo.Part part7 = part6;
                        if (part7.isVideo && part7.volume > 0.0f && !part7.muted) {
                            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(part7.path);
                            mixedSoundInfo.volume = part7.volume;
                            float f14 = part7.left;
                            float f15 = part7.duration;
                            mixedSoundInfo.audioOffset = ((long) (f14 * f15)) * 1000;
                            mixedSoundInfo.startTime = part7.offset * 1000;
                            mixedSoundInfo.duration = ((long) ((part7.right - f14) * f15)) * 1000;
                            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo);
                        }
                    }
                }
                File file8 = l8Var4.o0;
                if (file8 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file8.getAbsolutePath());
                    mixedSoundInfo2.volume = l8Var4.u0;
                    float f16 = l8Var4.s0;
                    float f17 = l8Var4.q0;
                    long j26 = ((long) (f16 * f17)) * 1000;
                    mixedSoundInfo2.audioOffset = j26;
                    if (l8Var4.K) {
                        mixedSoundInfo2.startTime = ((long) (l8Var4.r0 - (l8Var4.Z * l8Var4.h0))) * 1000;
                        j12 = 0;
                    } else {
                        j12 = 0;
                        mixedSoundInfo2.startTime = 0L;
                    }
                    long j27 = mixedSoundInfo2.startTime + j10;
                    mixedSoundInfo2.startTime = j27;
                    if (j27 < j12) {
                        mixedSoundInfo2.audioOffset = j26 - j27;
                        mixedSoundInfo2.startTime = j12;
                    }
                    mixedSoundInfo2.duration = ((long) ((l8Var4.t0 - f16) * f17)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
                }
                String str3 = l8Var4.y;
                if (str3 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str3);
                    mixedSoundInfo3.volume = l8Var4.G;
                    float f18 = l8Var4.E;
                    float f19 = l8Var4.C;
                    long j28 = ((long) (f18 * f19)) * 1000;
                    mixedSoundInfo3.audioOffset = j28;
                    if (l8Var4.K) {
                        mixedSoundInfo3.startTime = ((long) (l8Var4.D - (l8Var4.Z * l8Var4.h0))) * 1000;
                        j11 = 0;
                    } else {
                        j11 = 0;
                        mixedSoundInfo3.startTime = 0L;
                    }
                    long j29 = mixedSoundInfo3.startTime + j10;
                    mixedSoundInfo3.startTime = j29;
                    if (j29 < j11) {
                        mixedSoundInfo3.audioOffset = j28 - j29;
                        mixedSoundInfo3.startTime = j11;
                    }
                    mixedSoundInfo3.duration = ((long) ((l8Var4.F - f18) * f19)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
                }
                callback3.run(videoEditedInfo);
                return;
            case 7:
                ci.d dVar = (ci.d) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.d;
                ei.v1 v1Var = (ei.v1) this.e;
                dVar.setLoading(false);
                if (tLObject3 instanceof TLRPC.TL_boolTrue) {
                    e3Var.dismiss();
                    v1Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 8:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.c;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new yc(e3Var2.topBulletinContainer, d6Var2).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, ei.l.G0(connectedbotstarref.commission_permille), UserObject.getUserName(user))), R.raw.copy).j();
                return;
            case 9:
                ei.e4.x0((ei.e4) this.b, (Context) this.c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.e);
                return;
            case 10:
                TLObject tLObject4 = (TLObject) this.c;
                boolean[] zArr2 = (boolean[]) this.b;
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
                gg.c cVar = (gg.c) this.b;
                Location location = (Location) this.c;
                String str4 = (String) this.d;
                ArrayList arrayList8 = (ArrayList) this.e;
                ArrayList arrayList9 = cVar.r;
                cVar.n = false;
                if (location == null) {
                    cVar.F = 0;
                    cVar.h = false;
                    cVar.s.clear();
                    cVar.J = false;
                    cVar.x = str4;
                }
                arrayList9.clear();
                arrayList9.addAll(arrayList8);
                cVar.l();
                return;
            case 12:
                gg.c cVar2 = (gg.c) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.d;
                String str5 = (String) this.e;
                TLObject tLObject5 = (TLObject) this.c;
                ArrayList arrayList10 = cVar2.s;
                if (tL_error2 == null) {
                    cVar2.F = 0;
                    cVar2.h = false;
                    arrayList10.clear();
                    cVar2.J = false;
                    cVar2.x = str5;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject5;
                    int size5 = messages_botresults.results.size();
                    while (i11 < size5) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i11);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = a4.a.t(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.id;
                                arrayList10.add(tL_messageMediaVenue);
                            }
                        }
                        i11++;
                    }
                }
                gg.b bVar = cVar2.y;
                if (bVar != null) {
                    bVar.a(arrayList10);
                }
                cVar2.l();
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new h5((gg.m) this.b, (Runnable) this.d, (ArrayList) this.e, s4.o.c((gg.g) this.c, true), 14));
                return;
            case 14:
                gg.m mVar = (gg.m) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                s4.k kVar = (s4.k) this.e;
                if (mVar.Z) {
                    mVar.Z = false;
                    if (runnable != null) {
                        runnable.run();
                    }
                    mVar.M = arrayList11;
                    kVar.b(mVar);
                    if (mVar.a0) {
                        mVar.a0 = false;
                        mVar.W(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 15:
                hg.a0 a0Var = (hg.a0) this.b;
                TLObject tLObject6 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                Runnable runnable2 = (Runnable) this.e;
                ArrayList arrayList12 = a0Var.b;
                if (tLObject6 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject6;
                    int indexOf = arrayList12.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList12.set(indexOf, tL_businessChatLink2);
                        NotificationCenter.getInstance(a0Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        a0Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 16:
                hg.c2 c2Var = (hg.c2) this.b;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.c;
                hg.b2 b2Var = (hg.b2) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                ArrayList arrayList13 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = messagesStorage2.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(b2Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList13.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        break;
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new h5(c2Var, arrayList13, b2Var, tL_messages_sendQuickReplyMessages, 17));
                    return;
                } catch (Throwable th6) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th6;
                }
            case 17:
                hg.c2 c2Var2 = (hg.c2) this.b;
                ArrayList<Integer> arrayList14 = (ArrayList) this.c;
                hg.b2 b2Var2 = (hg.b2) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                int i24 = c2Var2.a;
                if (arrayList14.isEmpty() || arrayList14.size() < b2Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = b2Var2.a;
                    ConnectionsManager.getInstance(i24).sendRequest(tL_messages_getQuickReplyMessages, new s5(c2Var2, arrayList14, tL_messages_sendQuickReplyMessages2, i10));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList14;
                    while (i11 < arrayList14.size()) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i11++;
                    }
                    ConnectionsManager.getInstance(i24).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 18:
                ii.r rVar = (ii.r) this.b;
                ii.a aVar2 = (ii.a) this.c;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.d;
                y70 y70Var = (y70) this.e;
                rVar.r.V4(aVar2, pageBlock);
                y70Var.u();
                return;
            case 19:
                a();
                return;
            case 20:
                oi.f fVar = (oi.f) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                m4.e eVar = (m4.e) this.d;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
                synchronized (fVar.a) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            fVar.m(eVar);
                        }
                    } finally {
                    }
                }
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                m4.a0 a0Var2 = (m4.a0) this.b;
                i9.c0 c0Var = (i9.c0) this.c;
                e2.h hVar = (e2.h) this.d;
                i9.w wVar = (i9.w) this.e;
                if (a0Var2.j()) {
                    c0Var.m(null);
                    return;
                }
                try {
                    hVar.accept(wVar);
                    c0Var.m(null);
                    return;
                } catch (Throwable th7) {
                    c0Var.n(th7);
                    return;
                }
            case 24:
                m4.a0 a0Var3 = (m4.a0) this.b;
                m4.y0 y0Var = (m4.y0) this.c;
                m4.r rVar2 = (m4.r) this.d;
                List list = (List) this.e;
                if (a0Var3.j()) {
                    return;
                }
                y0Var.a(a0Var3.t, rVar2, list);
                return;
            case 25:
                e();
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
                ((Utilities.Callback) this.e).run(org.telegram.ui.ActionBar.h6.Q0((File) this.b, (String) this.c, (String[]) this.d));
                return;
        }
    }

    public /* synthetic */ h5(gg.c cVar, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.a = 12;
        this.b = cVar;
        this.d = tL_error;
        this.e = str;
        this.c = tLObject;
    }

    public /* synthetic */ h5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public /* synthetic */ h5(Utilities.Callback callback, File file, String str, String[] strArr) {
        this.a = 29;
        this.e = callback;
        this.b = file;
        this.c = str;
        this.d = strArr;
    }

    public /* synthetic */ h5(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.q qVar, TLRPC.UserFull userFull) {
        this.a = 10;
        this.c = tLObject;
        this.b = zArr;
        this.d = qVar;
        this.e = userFull;
    }
}
