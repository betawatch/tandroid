package androidx.car.app.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.car.app.IOnDoneCallback;
import androidx.lifecycle.o;
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
import di.a1;
import di.a7;
import di.fc;
import di.ga;
import di.k8;
import di.kc;
import e9.n0;
import fi.f4;
import hg.m;
import ig.a2;
import ig.b2;
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
import m4.d1;
import m4.e0;
import m4.f1;
import m4.i1;
import m4.k;
import m4.k1;
import m4.l;
import m4.m1;
import m4.n;
import m4.p1;
import m4.t;
import m4.u1;
import m4.v;
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
import org.telegram.messenger.g0;
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
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.t6;
import org.telegram.ui.v6;
import v7.q8;
import w7.w;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
    private final void a() {
        Bitmap bitmap;
        Bundle bundle;
        n0 n0Var;
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
                    int i11 = n.a;
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
                            bundle4.putLong("android.media.extra.BT_FOLDER_TYPE", n.a(num2.intValue()));
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
                int i112 = n.a;
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
            m4.p0.D(((m4.p0) n0Var2.e).m, arrayList4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        i1 i1Var = (i1) this.b;
        v vVar = (v) this.c;
        e0 e0Var = (e0) this.d;
        l lVar = (l) this.e;
        pi.e eVar = i1Var.b;
        boolean z10 = false;
        try {
            i1Var.c.remove(vVar);
            if (e0Var.j()) {
                w.a(lVar);
                return;
            }
            d1 d1Var = (d1) vVar.d;
            d1Var.getClass();
            IBinder asBinder = d1Var.a.asBinder();
            t m10 = e0Var.m(vVar);
            if (eVar.t(vVar)) {
                e2.a.l("MediaSessionStub", "Controller " + vVar + " has sent connection request multiple times");
            }
            eVar.a(asBinder, vVar, m10.a, m10.b);
            com.google.android.gms.common.api.internal.v q6 = eVar.q(vVar);
            if (q6 == null) {
                e2.a.l("MediaSessionStub", "Ignoring connection request from unknown controller info");
                w.a(lVar);
                return;
            }
            m1 m1Var = e0Var.t;
            k1 k1Var = e0Var.s;
            c1 c1Var = m10.b;
            k1 Y0 = i1Var.Y0(k1Var);
            MediaSession.Token token = ((n4.n) e0Var.h.m.b).c.b;
            n0 n0Var = m10.c;
            if (n0Var == null) {
                n0Var = e0Var.y;
            }
            n0 n0Var2 = m10.d;
            if (n0Var2 == null) {
                n0Var2 = e0Var.z;
            }
            n0 n0Var3 = e0Var.r;
            p1 p1Var = m10.a;
            c1 s10 = m1Var.s();
            u1 u1Var = e0Var.j.a;
            u1Var.getClass();
            m4.j jVar = new m4.j(i1Var, n0Var, n0Var2, n0Var3, p1Var, c1Var, s10, new Bundle(u1Var.g), e0Var.A, Y0, token);
            if (e0Var.j()) {
                w.a(lVar);
                return;
            }
            try {
                ((k) lVar).F0(q6.e(), jVar.a(vVar.c));
                z10 = true;
            } catch (RemoteException unused) {
            }
            if (z10 && (!e0Var.x || !e0.k(vVar))) {
                e0Var.e.getClass();
            }
        } finally {
            if (0 == 0) {
                w.a(lVar);
            }
        }
    }

    private final void c() {
        e0 e0Var = (e0) this.b;
        f1 f1Var = (f1) this.c;
        v vVar = (v) this.d;
        List list = (List) this.e;
        if (e0Var.j()) {
            return;
        }
        f1Var.a(e0Var.t, vVar, list);
    }

    private final void d() {
        CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
    }

    private final void f() {
        ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (l80) this.e);
    }

    private final void g() {
        ((Utilities.Callback) this.b).run(g6.R0((File) this.c, (String) this.d, (String[]) this.e));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void h() {
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLObject tLObject = (TLObject) this.b;
        e6 e6Var = (e6) this.c;
        f6 f6Var = (f6) this.d;
        TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
        g6.A--;
        if (tLObject instanceof TLRPC.TL_theme) {
            TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
            TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
            if (e6Var == null || themeSettings == null) {
                TLRPC.Document document = tL_theme2.document;
                if (document != null && document.id != tL_theme.document.id) {
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
                        int i10 = NotificationCenter.needSetDayNightTheme;
                        f6 f6Var3 = g6.I;
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i10, f6Var3, Boolean.valueOf(g6.J == f6Var3), null, -1);
                    }
                    b6.a(true);
                    z10 = true;
                }
                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                e6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                r5 = z10;
            }
            if (g6.A != 0) {
                g6.B = (int) (System.currentTimeMillis() / 1000);
                g6.t1(r5, false);
                return;
            }
            return;
        }
        r5 = false;
        if (g6.A != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:338:0x089a, code lost:
    
        if (r6 != null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:339:0x089c, code lost:
    
        r6.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:340:0x08b2, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new bi.j8(r2, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:341:0x08bb, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:349:0x08af, code lost:
    
        if (r6 != null) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0168, code lost:
    
        if (r10 == null) goto L72;
     */
    /* JADX WARN: Removed duplicated region for block: B:409:0x09ee  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        k8 k8Var;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        long j10;
        rb rbVar;
        char c10;
        m2 U;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        int i10;
        int i11;
        int i12;
        float f7;
        long j11;
        float f10;
        int[][] iArr;
        long j12;
        long j13;
        ArrayList arrayList2;
        int i13 = 6;
        char c11 = 2;
        r10 = null;
        SQLiteCursor sQLiteCursor = null;
        int i14 = 0;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
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
                    for (int i15 = 0; i15 < tL_stories_stories.stories.size(); i15++) {
                        if (tL_stories_stories.stories.get(i15).id == storyItem2.id) {
                            callback.run(tL_stories_stories.stories.get(i15).media.document);
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
                long j14 = (p5Var == null || (rbVar = (rb) p5Var.c) == null) ? 0L : rbVar.currentPosition;
                a1 a1Var = MessagesController.getInstance(h5Var2.l.C2).getStoriesController().w;
                TL_stories.StoryItem storyItem3 = h5Var2.l.O1.a;
                long j15 = storyItem3.dialogId;
                ArrayList arrayList3 = a1Var.b;
                int size = arrayList3.size();
                int i16 = 0;
                while (i16 < size) {
                    Object obj = arrayList3.get(i16);
                    i16++;
                    k8 k8Var2 = (k8) obj;
                    if (k8Var2.g && storyItem3.id == k8Var2.f) {
                        j10 = j15;
                        if (j10 == k8Var2.e) {
                            TLRPC.MessageMedia messageMedia = storyItem3.media;
                            TLRPC.Document document = messageMedia.document;
                            if (document != null) {
                                arrayList = arrayList3;
                                storyItem = storyItem3;
                                if (document.id != k8Var2.H) {
                                    continue;
                                }
                            } else {
                                arrayList = arrayList3;
                                storyItem = storyItem3;
                            }
                            TLRPC.Photo photo = messageMedia.photo;
                            if (photo == null || photo.id == k8Var2.I) {
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
                                D.R(fc.d(sbVar), g10, j14);
                                D.Q = new z4(h5Var2, 3);
                                D.R = new c5(h5Var2, n5Var, 1);
                                return;
                            }
                        } else {
                            arrayList = arrayList3;
                            storyItem = storyItem3;
                        }
                    } else {
                        arrayList = arrayList3;
                        storyItem = storyItem3;
                        j10 = j15;
                    }
                    storyItem3 = storyItem;
                    arrayList3 = arrayList;
                    j15 = j10;
                }
                k8Var = null;
                if (k8Var != null) {
                }
                k8Var = k8.n(h5Var2.l.O1.h(), h5Var2.l.O1.a);
                k8Var.e = h5Var2.l.B1;
                k8 g102 = k8Var.g();
                if (h5Var2.l.I0()) {
                }
                D.R(fc.d(sbVar), g102, j14);
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
                int i17 = NotificationCenter.storyAlbumsCollectionsUpdate;
                Object[] objArr = new Object[2];
                objArr[c10] = Long.valueOf(i8Var.b);
                objArr[1] = i8Var;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i17, objArr);
                return;
            case 4:
                int i18 = 5;
                int i19 = 4;
                int i20 = 3;
                o8 o8Var2 = (o8) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                MessagesStorage messagesStorage = (MessagesStorage) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                int i21 = o8Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i22 = o8Var2.e;
                sb2.append(i22);
                sb2.append("{");
                long j16 = o8Var2.d;
                sb2.append(j16);
                sb2.append("} saveCache {");
                sb2.append(x8.a(arrayList4));
                i2.d.v("}", sb2);
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j16 + " AND album_id = " + i21).stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i23 = 0;
                        while (i23 < arrayList4.size()) {
                            try {
                                TL_stories.StoryItem storyItem4 = ((MessageObject) arrayList4.get(i23)).storyItem;
                                if (storyItem4 == null) {
                                    i10 = i13;
                                    i11 = i19;
                                } else {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                    storyItem4.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindLong(1, j16);
                                    executeFast.bindInteger(2, storyItem4.id);
                                    executeFast.bindByteBuffer(i20, nativeByteBuffer);
                                    executeFast.bindInteger(i19, i22);
                                    executeFast.bindInteger(i18, o8Var2.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                    i10 = 6;
                                    executeFast.bindInteger(6, arrayList5.indexOf(Integer.valueOf(storyItem4.id)) + 1);
                                    executeFast.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindLong(1, j16);
                                    sQLitePreparedStatement.bindInteger(2, i21);
                                    i18 = 5;
                                    sQLitePreparedStatement.bindInteger(3, storyItem4.id);
                                    i11 = 4;
                                    sQLitePreparedStatement.bindInteger(4, i23);
                                    sQLitePreparedStatement.step();
                                }
                                i23++;
                                i19 = i11;
                                i13 = i10;
                                i20 = 3;
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
                    i12 = 0;
                    File file6 = k8Var4.Z0;
                    if (file6 != null) {
                        videoEditedInfo.originalPath = file6.getAbsolutePath();
                    } else {
                        videoEditedInfo.originalPath = str2;
                    }
                    videoEditedInfo.isPhoto = true;
                    videoEditedInfo.collage = k8Var4.S;
                    if (k8Var4.v()) {
                        int i24 = 0;
                        boolean z10 = false;
                        while (i24 < k8Var4.T.size()) {
                            k8 k8Var5 = (k8) k8Var4.T.get(i24);
                            if (k8Var5.K) {
                                k8Var5.k0 = Math.max(k8Var5.k0, iArr2[i24][1]);
                                k8Var5.l0 = Math.max(k8Var5.l0, iArr2[i24][c11]);
                                f10 = f11;
                                iArr = iArr2;
                                k8Var5.h0 = Math.max(k8Var5.h0, iArr2[i24][4]);
                                z10 = true;
                            } else {
                                f10 = f11;
                                iArr = iArr2;
                            }
                            i24++;
                            f11 = f10;
                            iArr2 = iArr;
                            c11 = 2;
                            z10 = z10;
                        }
                        float f12 = f11;
                        ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(k8Var4);
                        videoEditedInfo.collageParts = parts;
                        if (z10) {
                            int size2 = parts.size();
                            VideoEditedInfo.Part part = null;
                            int i25 = 0;
                            long j17 = 0;
                            while (i25 < size2) {
                                VideoEditedInfo.Part part2 = parts.get(i25);
                                i25++;
                                VideoEditedInfo.Part part3 = part2;
                                float f13 = f12;
                                if (part3.isVideo) {
                                    long j18 = part3.duration;
                                    if (j18 > j17) {
                                        j17 = j18;
                                        part = part3;
                                    }
                                }
                                f12 = f13;
                            }
                            f7 = f12;
                            if (part != null) {
                                float f14 = part.duration;
                                float f15 = part.right;
                                float f16 = part.left;
                                long j19 = (long) ((f15 - f16) * f14);
                                k8Var4.h0 = j19;
                                videoEditedInfo.originalDuration = j19;
                                videoEditedInfo.estimatedDuration = j19;
                                j11 = -(part.offset + ((long) (f16 * f14)));
                                part.offset = j11;
                                ArrayList<VideoEditedInfo.Part> arrayList6 = videoEditedInfo.collageParts;
                                int size3 = arrayList6.size();
                                int i26 = 0;
                                while (i26 < size3) {
                                    VideoEditedInfo.Part part4 = arrayList6.get(i26);
                                    i26++;
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
                                videoEditedInfo.estimatedSize = (long) (((k8Var4.h0 / 1000.0f) * extractRealEncoderBitrate) / f7);
                                videoEditedInfo.filterState = null;
                            }
                        } else {
                            long j20 = k8Var4.S0;
                            k8Var4.h0 = j20;
                            videoEditedInfo.originalDuration = j20;
                            videoEditedInfo.estimatedDuration = j20;
                            f7 = f12;
                        }
                    } else {
                        f7 = 8.0f;
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
                    j11 = 0;
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
                        int i27 = videoEditedInfo.originalBitrate;
                        if (i27 < 500000) {
                            videoEditedInfo.bitrate = 2500000;
                            videoEditedInfo.originalBitrate = -1;
                        } else {
                            videoEditedInfo.bitrate = Utilities.clamp(i27, 3000000, 500000);
                        }
                    } else {
                        videoEditedInfo.bitrate = 2000000;
                        videoEditedInfo.originalBitrate = -1;
                    }
                    StringBuilder sb3 = new StringBuilder("story bitrate, original = ");
                    sb3.append(videoEditedInfo.originalBitrate);
                    sb3.append(" => ");
                    g0.o(videoEditedInfo.bitrate, sb3);
                    int i28 = iArr2[0][4];
                    i12 = 0;
                    long j24 = i28;
                    k8Var4.h0 = j24;
                    videoEditedInfo.originalDuration = j24 * 1000;
                    float f17 = j24;
                    long j25 = ((long) (k8Var4.Z * f17)) * 1000;
                    videoEditedInfo.startTime = j25;
                    long j26 = ((long) (k8Var4.a0 * f17)) * 1000;
                    videoEditedInfo.endTime = j26;
                    videoEditedInfo.estimatedDuration = j26 - j25;
                    videoEditedInfo.volume = k8Var4.P;
                    videoEditedInfo.muted = k8Var4.Y;
                    videoEditedInfo.estimatedSize = (long) a1.g.B(i28 / 1000.0f, extractRealEncoderBitrate, 8.0f, r5[5]);
                    videoEditedInfo.estimatedSize = Math.max(k8Var4.L.length(), videoEditedInfo.estimatedSize);
                    videoEditedInfo.filterState = k8Var4.a1;
                    File file7 = k8Var4.Q0;
                    videoEditedInfo.blurPath = file7 != null ? file7.getPath() : null;
                    j11 = 0;
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
                    int i29 = i12;
                    while (i29 < size4) {
                        VideoEditedInfo.Part part6 = arrayList7.get(i29);
                        i29++;
                        VideoEditedInfo.Part part7 = part6;
                        if (part7.isVideo && part7.volume > 0.0f && !part7.muted) {
                            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(part7.path);
                            mixedSoundInfo.volume = part7.volume;
                            float f18 = part7.left;
                            float f19 = part7.duration;
                            mixedSoundInfo.audioOffset = ((long) (f18 * f19)) * 1000;
                            mixedSoundInfo.startTime = part7.offset * 1000;
                            mixedSoundInfo.duration = ((long) ((part7.right - f18) * f19)) * 1000;
                            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo);
                        }
                    }
                }
                File file8 = k8Var4.o0;
                if (file8 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file8.getAbsolutePath());
                    mixedSoundInfo2.volume = k8Var4.u0;
                    float f20 = k8Var4.s0;
                    float f21 = k8Var4.q0;
                    long j27 = ((long) (f20 * f21)) * 1000;
                    mixedSoundInfo2.audioOffset = j27;
                    if (k8Var4.K) {
                        mixedSoundInfo2.startTime = ((long) (k8Var4.r0 - (k8Var4.Z * k8Var4.h0))) * 1000;
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
                    mixedSoundInfo2.duration = ((long) ((k8Var4.t0 - f20) * f21)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
                }
                String str3 = k8Var4.y;
                if (str3 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str3);
                    mixedSoundInfo3.volume = k8Var4.G;
                    float f22 = k8Var4.E;
                    float f23 = k8Var4.C;
                    long j29 = ((long) (f22 * f23)) * 1000;
                    mixedSoundInfo3.audioOffset = j29;
                    if (k8Var4.K) {
                        mixedSoundInfo3.startTime = ((long) (k8Var4.D - (k8Var4.Z * k8Var4.h0))) * 1000;
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
                    mixedSoundInfo3.duration = ((long) ((k8Var4.F - f22) * f23)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
                }
                callback3.run(videoEditedInfo);
                return;
            case 7:
                di.d dVar = (di.d) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                e3 e3Var = (e3) this.d;
                fi.u1 u1Var = (fi.u1) this.e;
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
                    while (i14 < size5) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i14);
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
                        i14++;
                    }
                }
                hg.b bVar = cVar3.y;
                if (bVar != null) {
                    bVar.a(arrayList10);
                }
                cVar3.l();
                return;
            case 13:
                AndroidUtilities.runOnUIThread(new b((m) this.b, (Runnable) this.d, (ArrayList) this.e, s4.o.c((hg.g) this.c, true), 14));
                return;
            case 14:
                m mVar = (m) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList11 = (ArrayList) this.d;
                m4.c cVar4 = (m4.c) this.e;
                if (mVar.Z) {
                    mVar.Z = false;
                    if (runnable != null) {
                        runnable.run();
                    }
                    mVar.M = arrayList11;
                    cVar4.c(mVar);
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
                    } catch (Exception e) {
                        FileLog.e(e);
                        break;
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new b(b2Var, arrayList13, a2Var, tL_messages_sendQuickReplyMessages, 17));
                    return;
                } catch (Throwable th6) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th6;
                }
            case 17:
                b2 b2Var2 = (b2) this.b;
                ArrayList<Integer> arrayList14 = (ArrayList) this.c;
                a2 a2Var2 = (a2) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                int i30 = b2Var2.a;
                if (arrayList14.isEmpty() || arrayList14.size() < a2Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = a2Var2.a;
                    ConnectionsManager.getInstance(i30).sendRequest(tL_messages_getQuickReplyMessages, new e5(b2Var2, arrayList14, tL_messages_sendQuickReplyMessages2, i13));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList14;
                    while (i14 < arrayList14.size()) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                        i14++;
                    }
                    ConnectionsManager.getInstance(i30).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 18:
                r rVar = (r) this.b;
                ji.a aVar = (ji.a) this.c;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.d;
                l80 l80Var = (l80) this.e;
                rVar.r.W4(aVar, pageBlock);
                l80Var.u();
                return;
            case 19:
                pi.e eVar = (pi.e) this.b;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
                m4.h hVar = (m4.h) this.d;
                AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.e;
                synchronized (eVar.a) {
                    try {
                        if (atomicBoolean.get()) {
                            atomicBoolean2.set(true);
                        } else {
                            eVar.i(hVar);
                        }
                    } finally {
                    }
                }
                return;
            case 20:
                a();
                return;
            case 21:
                b();
                return;
            case 22:
                e0 e0Var = (e0) this.b;
                j9.e0 e0Var2 = (j9.e0) this.c;
                e2.j jVar = (e2.j) this.d;
                y yVar2 = (y) this.e;
                if (e0Var.j()) {
                    e0Var2.m(null);
                    return;
                }
                try {
                    jVar.accept(yVar2);
                    e0Var2.m(null);
                    return;
                } catch (Throwable th7) {
                    e0Var2.n(th7);
                    return;
                }
            case 23:
                c();
                return;
            case 24:
                CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
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
                t6 t6Var = (t6) this.b;
                v6 v6Var = (v6) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr3 = (boolean[]) this.e;
                t6Var.getClass();
                v6Var.a(fArr[0]);
                if (zArr3[0]) {
                    t6Var.d.w0(true);
                    return;
                }
                return;
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
