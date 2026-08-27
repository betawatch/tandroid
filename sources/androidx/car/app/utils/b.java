package androidx.car.app.utils;

import a9.p;
import ag.l0;
import ag.l3;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.IOnDoneCallback;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import d5.u;
import gh.b2;
import gh.c4;
import gh.t3;
import h7.z5;
import hh.g4;
import hh.i5;
import hh.v1;
import j4.c0;
import j4.g0;
import j4.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;
import jh.b4;
import jh.d4;
import jh.e4;
import jh.h9;
import jh.i9;
import jh.k6;
import jh.r3;
import jh.s6;
import jh.x3;
import lh.a1;
import lh.nb;
import lh.q6;
import lh.s9;
import lh.sb;
import lh.z7;
import nh.k;
import nh.q1;
import nh.s3;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
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
import org.telegram.messenger.y1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.z9;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h8;
import org.telegram.ui.na;
import org.telegram.ui.o6;
import org.telegram.ui.p6;
import org.telegram.ui.r6;
import org.telegram.ui.rn;
import org.telegram.ui.web.s;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        TLObject tLObject = (TLObject) this.b;
        boolean[] zArr = (boolean[]) this.c;
        s sVar = (s) this.d;
        TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (zArr[0]) {
                return;
            }
            zArr[0] = true;
            sVar.run(Boolean.TRUE, "cancelled");
            return;
        }
        userFull.bot_can_manage_emoji_status = true;
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        sVar.run(Boolean.TRUE, "allowed");
    }

    private final void b() {
        CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
    }

    private final void c() {
        CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
    }

    private final void e() {
        ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (b70) this.e);
    }

    private final void f() {
        ((Utilities.Callback) this.b).run(g6.Q0((File) this.c, (String) this.d, (String[]) this.e));
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void g() {
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
                        f6Var.B = tL_theme2;
                        f6Var.C = false;
                        f6Var.c0 = null;
                        f6Var.d0 = null;
                        NotificationCenter.getInstance(f6Var.A).addObserver(f6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(f6Var.A).addObserver(f6Var, NotificationCenter.fileLoadFailed);
                        FileLoader fileLoader = FileLoader.getInstance(f6Var.A);
                        TLRPC.TL_theme tL_theme3 = f6Var.B;
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
                    if (f6Var2 == f6Var && f6Var2.U == e6Var.a) {
                        g6.n1(false, false);
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
                g6.s1(r5, false);
                return;
            }
            return;
        }
        r5 = false;
        if (g6.A != 0) {
        }
    }

    private final void h() {
        p6 p6Var = (p6) this.b;
        r6 r6Var = (r6) this.c;
        float[] fArr = (float[]) this.d;
        boolean[] zArr = (boolean[]) this.e;
        p6Var.getClass();
        r6Var.a(fArr[0]);
        if (zArr[0]) {
            p6Var.d.w0(true);
        }
    }

    private final void i() {
        p6 p6Var = (p6) this.b;
        boolean[] zArr = (boolean[]) this.c;
        long[] jArr = (long[]) this.d;
        o6 o6Var = (o6) this.e;
        if (zArr[0]) {
            return;
        }
        jArr[0] = System.currentTimeMillis();
        p6Var.d.showDialog(o6Var);
    }

    private final void j() {
        h8.U((h8) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (Calendar) this.e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:220:0x0617, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new jh.g6(r3, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0620, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0614, code lost:
    
        if (r7 != null) goto L194;
     */
    /* JADX WARN: Removed duplicated region for block: B:290:0x074a  */
    /* JADX WARN: Type inference failed for: r2v72, types: [j4.h0, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        z7 z7Var;
        File file;
        TL_stories.StoryItem storyItem;
        long j10;
        TLRPC.Photo photo;
        h9 h9Var;
        char c10;
        n2 U;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        float f10;
        long j11;
        int[][] iArr;
        long j12;
        long j13;
        ArrayList arrayList;
        int i10 = 1;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str = (String) this.d;
                c cVar = (c) this.e;
                if (oVar != null && ((v) oVar).c.compareTo(n.c) >= 0) {
                    i.b(iOnDoneCallback, str, cVar);
                    return;
                }
                i.f(iOnDoneCallback, str, new IllegalStateException("Lifecycle is not at least created when dispatching " + cVar));
                return;
            case 1:
                b3.a aVar = (b3.a) this.b;
                w2.i iVar = (w2.i) this.c;
                String str2 = iVar.a;
                t2.g gVar = (t2.g) this.d;
                w2.h hVar = (w2.h) this.e;
                aVar.getClass();
                Logger logger = b3.a.f;
                try {
                    x2.e a2 = aVar.c.a(str2);
                    if (a2 == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        gVar.d(new IllegalArgumentException(str3));
                    } else {
                        ((d3.h) aVar.e).f(new l0(aVar, iVar, ((u2.c) a2).a(hVar), 3));
                        gVar.d(null);
                    }
                    return;
                } catch (Exception e9) {
                    logger.warning("Error scheduling event " + e9.getMessage());
                    gVar.d(e9);
                    return;
                }
            case 2:
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLObject tLObject = (TLObject) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                if (tL_error != null) {
                    callback.run(tL_error);
                    return;
                } else {
                    if (tLObject instanceof TLRPC.payments_GiveawayInfo) {
                        callback2.run((TLRPC.payments_GiveawayInfo) tLObject);
                        return;
                    }
                    return;
                }
            case 3:
                final t3 t3Var = (t3) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                b2 b2Var = (b2) this.d;
                final View view = (View) this.e;
                wq0 wq0Var = t3Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    b2Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = t3Var.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(t3Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z10 = savedStarGift.pinned_to_top;
                final boolean z11 = !z10;
                if (t3Var.e.m(savedStarGift, z11, false)) {
                    new c4(t3Var.getContext(), wq0Var.c, savedStarGift, t3Var.c, new Utilities.Callback0Return() { // from class: gh.k3
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            ((b2) view).c(z11, true);
                            t3 t3Var2 = t3.this;
                            t3Var2.f.u0(0);
                            return mc.a0(t3Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z10) {
                    y1.q(R.string.Gift2Unpinned, mc.a0(wq0Var.a), R.raw.ic_unpin, 36);
                } else {
                    mc.a0(wq0Var.a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                }
                ((b2) view).c(z11, true);
                t3Var.f.u0(0);
                return;
            case 4:
                n2 n2Var = (n2) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                we.d dVar = (we.d) this.d;
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) this.e;
                if (n2Var != null && tL_error2 != null) {
                    mc.a0(n2Var).d0(tL_error2, false);
                }
                if ((n2Var instanceof rn) && tL_error2 == null) {
                    ((rn) n2Var).Yb();
                }
                dVar.b();
                b2Var2.dismiss();
                return;
            case 5:
                i5.Z((i5) this.b, (boolean[]) this.c, (TL_stars.StarGiftAttribute) this.d, (oc[]) this.e);
                return;
            case 6:
                i5.R0((i5) this.b, (TLObject) this.c, (a) this.d, (TLRPC.TL_error) this.e);
                return;
            case 7:
                i5.S0((i5) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                return;
            case 8:
                i5 i5Var = (i5) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error3 != null || !(tLObject2 instanceof TLRPC.Updates)) {
                    i5Var.getBulletinFactory().d0(tL_error3, false);
                    return;
                }
                i5Var.m0 = true;
                i5Var.h1 = null;
                i5Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject2, new v1(i5Var, 5));
                Utilities.stageQueue.postRunnable(new u(23, i5Var, tLObject2));
                return;
            case 9:
                g4 g4Var = (g4) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                j6 j6Var = g4Var.D;
                g4Var.d0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                ri0 ri0Var = g4Var.h0;
                if (ri0Var != null) {
                    ri0Var.d();
                    AndroidUtilities.runOnUIThread(new l3(5), 750L);
                }
                g4Var.M.animate().alpha(0.0f).start();
                g4Var.O.animate().alpha(1.0f).start();
                g4Var.C.animate().alpha(1.0f).start();
                g4Var.N.animate().alpha(0.0f).start();
                g4Var.L.animate().alpha(1.0f).start();
                g4Var.I.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList2.size(), new Object[0])));
                j6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                j6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                g4Var.E.setAlpha(0.0f);
                if (g4Var.K != null) {
                    int i11 = 0;
                    while (true) {
                        b2[] b2VarArr = g4Var.K;
                        if (i11 < b2VarArr.length) {
                            AndroidUtilities.removeFromParent(b2VarArr[i11]);
                            i11++;
                        } else {
                            g4Var.K = null;
                        }
                    }
                }
                g4Var.K = new b2[arrayList2.size()];
                int i12 = 0;
                while (i12 < arrayList2.size()) {
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList2.get(i12);
                    b2 b2Var3 = new b2(g4Var.getContext(), g4Var.S, g4Var.a);
                    b2Var3.g(starGift2, false, false, false, false, true);
                    b2Var3.x.setVisibility(8);
                    b2Var3.setRibbonColor(-3065286);
                    n9 n9Var = b2Var3.y;
                    FrameLayout.LayoutParams e10 = z5.e(42, 42, 17);
                    b2Var3.A = e10;
                    n9Var.setLayoutParams(e10);
                    int i13 = i12 + 1;
                    boolean z12 = i13 >= arrayList2.size();
                    LinearLayout linearLayout = g4Var.J;
                    g4Var.K[i12] = b2Var3;
                    linearLayout.addView(b2Var3, z5.p(74, 74, 0.0f, 51, 0, 0, z12 ? 0 : 6, 0));
                    i12 = i13;
                }
                return;
            case 10:
                this.c.c(((g0) this.b).a, (c0) this.d, (x) this.e);
                return;
            case 11:
                x3 x3Var = (x3) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                e4 e4Var = x3Var.l;
                if (tLObject3 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    MessagesController.getInstance(e4Var.y2).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(e4Var.y2).putChats(tL_stories_stories.chats, false);
                    for (int i14 = 0; i14 < tL_stories_stories.stories.size(); i14++) {
                        if (tL_stories_stories.stories.get(i14).id == storyItem2.id) {
                            callback3.run(tL_stories_stories.stories.get(i14).media.document);
                            return;
                        }
                    }
                }
                callback3.run(null);
                return;
            case 12:
                x3 x3Var2 = (x3) this.b;
                Activity activity = (Activity) this.c;
                i9 i9Var = (i9) this.d;
                b4 b4Var = (b4) this.e;
                sb E = sb.E(activity, x3Var2.l.y2);
                d4 d4Var = x3Var2.l.I2;
                long j14 = (d4Var == null || (h9Var = d4Var.b) == null) ? 0L : h9Var.currentPosition;
                a1 a1Var = MessagesController.getInstance(x3Var2.l.y2).getStoriesController().w;
                TL_stories.StoryItem storyItem3 = x3Var2.l.K1.a;
                long j15 = storyItem3.dialogId;
                ArrayList arrayList3 = a1Var.b;
                int size = arrayList3.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList3.get(i15);
                    i15++;
                    z7 z7Var2 = (z7) obj;
                    if (z7Var2.g && storyItem3.id == z7Var2.f && j15 == z7Var2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        storyItem = storyItem3;
                        j10 = j15;
                        if ((document == null || document.id == z7Var2.H) && ((photo = messageMedia.photo) == null || photo.id == z7Var2.I)) {
                            z7Var2.h = true;
                            z7Var = z7Var2;
                            if (z7Var != null || z7Var.u || (file = z7Var.L) == null || !file.exists()) {
                                z7Var = z7.n(x3Var2.l.K1.h(), x3Var2.l.K1.a);
                                z7Var.e = x3Var2.l.x1;
                            }
                            z7 g10 = z7Var.g();
                            if (x3Var2.l.I0()) {
                                e4 e4Var2 = x3Var2.l;
                                g10.J0 = e4Var2.x1;
                                g10.L0 = MessagesController.toInputMedia(e4Var2.K1.a.media);
                                jh.j6 j6Var2 = i9Var.K0;
                                if (j6Var2 instanceof jh.b6) {
                                    g10.K0 = ((jh.b6) j6Var2).E;
                                }
                            }
                            E.S(nb.d(i9Var), g10, j14);
                            E.M = new r3(x3Var2, 3);
                            E.N = new jh.t3(x3Var2, b4Var, 1);
                            return;
                        }
                    } else {
                        storyItem = storyItem3;
                        j10 = j15;
                    }
                    storyItem3 = storyItem;
                    j15 = j10;
                }
                z7Var = null;
                if (z7Var != null) {
                }
                z7Var = z7.n(x3Var2.l.K1.h(), x3Var2.l.K1.a);
                z7Var.e = x3Var2.l.x1;
                z7 g102 = z7Var.g();
                if (x3Var2.l.I0()) {
                }
                E.S(nb.d(i9Var), g102, j14);
                E.M = new r3(x3Var2, 3);
                E.N = new jh.t3(x3Var2, b4Var, 1);
                return;
            case 13:
                jh.f6 f6Var = (jh.f6) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                Utilities.Callback callback4 = (Utilities.Callback) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                f6Var.i = false;
                if (tLObject4 instanceof TL_stories.TL_storyAlbum) {
                    k6 a3 = k6.a((TL_stories.TL_storyAlbum) tLObject4);
                    f6Var.h.add(a3);
                    f6Var.f(true);
                    if (callback4 != null) {
                        callback4.run(a3);
                        return;
                    }
                    return;
                }
                if (tL_error4 == null || (U = LaunchActivity.U()) == null) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    mc.a0(U).d0(tL_error4, false);
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(f6Var.a);
                int i16 = NotificationCenter.storyAlbumsCollectionsUpdate;
                Object[] objArr = new Object[2];
                objArr[c10] = Long.valueOf(f6Var.b);
                objArr[1] = f6Var;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, objArr);
                return;
            case 14:
                jh.j6 j6Var3 = (jh.j6) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                MessagesStorage messagesStorage = (MessagesStorage) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                int i17 = j6Var3.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i18 = j6Var3.e;
                sb2.append(i18);
                sb2.append("{");
                long j16 = j6Var3.d;
                sb2.append(j16);
                sb2.append("} saveCache {");
                sb2.append(s6.a(arrayList4));
                pa.v("}", sb2);
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    sQLitePreparedStatement2 = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j16 + " AND album_id = " + i17).stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i19 = 0;
                        while (i19 < arrayList4.size()) {
                            try {
                                TL_stories.StoryItem storyItem4 = ((MessageObject) arrayList4.get(i19)).storyItem;
                                if (storyItem4 != null) {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                    storyItem4.serializeToStream(nativeByteBuffer);
                                    sQLitePreparedStatement2.requery();
                                    sQLitePreparedStatement2.bindLong(i10, j16);
                                    sQLitePreparedStatement2.bindInteger(2, storyItem4.id);
                                    sQLitePreparedStatement2.bindByteBuffer(3, nativeByteBuffer);
                                    sQLitePreparedStatement2.bindInteger(4, i18);
                                    sQLitePreparedStatement2.bindInteger(5, j6Var3.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                    sQLitePreparedStatement2.bindInteger(6, arrayList5.indexOf(Integer.valueOf(storyItem4.id)) + 1);
                                    sQLitePreparedStatement2.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindLong(1, j16);
                                    sQLitePreparedStatement.bindInteger(2, i17);
                                    sQLitePreparedStatement.bindInteger(3, storyItem4.id);
                                    sQLitePreparedStatement.bindInteger(4, i19);
                                    sQLitePreparedStatement.step();
                                }
                                i19++;
                                i10 = 1;
                            } catch (Throwable th) {
                                th = th;
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
                    } catch (Throwable th2) {
                        th = th2;
                        sQLitePreparedStatement = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                }
                break;
            case 15:
                q6 q6Var = (q6) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                z7 z7Var3 = (z7) this.d;
                boolean[] zArr = (boolean[]) this.e;
                z9 z9Var = q6Var.C;
                Bitmap bitmap = q6Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    q6Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                q6Var.a = bitmap2;
                if (z7Var3 != null && !z7Var3.c && z7Var3.K && bitmap2 != null) {
                    z7Var3.k0 = bitmap2.getWidth();
                    z7Var3.l0 = q6Var.a.getHeight();
                    z7Var3.A();
                }
                if (zArr[0] && z7Var3 != null && z9Var != null && q6Var.a != null) {
                    z9Var.e();
                    z9Var.f(z7Var3.b(q6Var.a, 0.2f), false);
                    s9 s9Var = q6Var.v;
                    if (s9Var != null) {
                        s9Var.run();
                    }
                }
                q6Var.r();
                q6Var.invalidate();
                return;
            case 16:
                z7 z7Var4 = (z7) this.b;
                String str4 = (String) this.d;
                int[][] iArr2 = (int[][]) this.c;
                Utilities.Callback callback5 = (Utilities.Callback) this.e;
                z7Var4.getClass();
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                videoEditedInfo.isStory = true;
                videoEditedInfo.fromCamera = z7Var4.c1;
                videoEditedInfo.originalWidth = z7Var4.k0;
                videoEditedInfo.originalHeight = z7Var4.l0;
                videoEditedInfo.resultWidth = z7Var4.i0;
                videoEditedInfo.resultHeight = z7Var4.j0;
                File file2 = z7Var4.P0;
                videoEditedInfo.paintPath = file2 == null ? null : file2.getPath();
                File file3 = z7Var4.W0;
                videoEditedInfo.messagePath = file3 == null ? null : file3.getPath();
                File file4 = z7Var4.X0;
                videoEditedInfo.messageVideoMaskPath = file4 == null ? null : file4.getPath();
                File file5 = z7Var4.Y0;
                videoEditedInfo.backgroundPath = file5 == null ? null : file5.getPath();
                int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
                if (!z7Var4.K || str4 == null || z7Var4.v()) {
                    File file6 = z7Var4.Z0;
                    if (file6 != null) {
                        videoEditedInfo.originalPath = file6.getAbsolutePath();
                    } else {
                        videoEditedInfo.originalPath = str4;
                    }
                    videoEditedInfo.isPhoto = true;
                    videoEditedInfo.collage = z7Var4.S;
                    if (z7Var4.v()) {
                        int i20 = 0;
                        boolean z13 = false;
                        while (i20 < z7Var4.T.size()) {
                            z7 z7Var5 = (z7) z7Var4.T.get(i20);
                            if (z7Var5.K) {
                                z7Var5.k0 = Math.max(z7Var5.k0, iArr2[i20][1]);
                                z7Var5.l0 = Math.max(z7Var5.l0, iArr2[i20][2]);
                                iArr = iArr2;
                                z7Var5.h0 = Math.max(z7Var5.h0, iArr2[i20][4]);
                                z13 = true;
                            } else {
                                iArr = iArr2;
                            }
                            i20++;
                            iArr2 = iArr;
                        }
                        f10 = 8.0f;
                        ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(z7Var4);
                        videoEditedInfo.collageParts = parts;
                        if (z13) {
                            int size2 = parts.size();
                            VideoEditedInfo.Part part = null;
                            int i21 = 0;
                            long j17 = 0;
                            while (i21 < size2) {
                                VideoEditedInfo.Part part2 = parts.get(i21);
                                i21++;
                                VideoEditedInfo.Part part3 = part2;
                                int i22 = size2;
                                if (part3.isVideo) {
                                    long j18 = part3.duration;
                                    if (j18 > j17) {
                                        j17 = j18;
                                        part = part3;
                                    }
                                }
                                size2 = i22;
                            }
                            if (part != null) {
                                float f11 = part.duration;
                                float f12 = part.right;
                                float f13 = part.left;
                                long j19 = (long) ((f12 - f13) * f11);
                                z7Var4.h0 = j19;
                                videoEditedInfo.originalDuration = j19;
                                videoEditedInfo.estimatedDuration = j19;
                                j11 = -(part.offset + ((long) (f13 * f11)));
                                part.offset = j11;
                                ArrayList<VideoEditedInfo.Part> arrayList6 = videoEditedInfo.collageParts;
                                int size3 = arrayList6.size();
                                int i23 = 0;
                                while (i23 < size3) {
                                    VideoEditedInfo.Part part4 = arrayList6.get(i23);
                                    i23++;
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
                                videoEditedInfo.estimatedSize = (long) (((z7Var4.h0 / 1000.0f) * extractRealEncoderBitrate) / f10);
                                videoEditedInfo.filterState = null;
                            }
                        } else {
                            long j20 = z7Var4.S0;
                            z7Var4.h0 = j20;
                            videoEditedInfo.originalDuration = j20;
                            videoEditedInfo.estimatedDuration = j20;
                        }
                    } else {
                        f10 = 8.0f;
                        if (z7Var4.o0 != null) {
                            long j21 = (long) ((z7Var4.t0 - z7Var4.s0) * z7Var4.q0);
                            z7Var4.h0 = j21;
                            videoEditedInfo.originalDuration = j21;
                            videoEditedInfo.estimatedDuration = j21;
                        } else if (z7Var4.y != null) {
                            long j22 = (long) ((z7Var4.F - z7Var4.E) * z7Var4.C);
                            z7Var4.h0 = j22;
                            videoEditedInfo.originalDuration = j22;
                            videoEditedInfo.estimatedDuration = j22;
                        } else {
                            long j23 = z7Var4.S0;
                            z7Var4.h0 = j23;
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
                    videoEditedInfo.estimatedSize = (long) (((z7Var4.h0 / 1000.0f) * extractRealEncoderBitrate) / f10);
                    videoEditedInfo.filterState = null;
                } else {
                    videoEditedInfo.originalPath = str4;
                    videoEditedInfo.isPhoto = false;
                    videoEditedInfo.framerate = Math.min(59, iArr2[0][7]);
                    int videoBitrate = MediaController.getVideoBitrate(str4);
                    if (videoBitrate == -1) {
                        videoBitrate = iArr2[0][3];
                    }
                    videoEditedInfo.originalBitrate = videoBitrate;
                    if (videoBitrate >= 1000000 || (arrayList = z7Var4.T0) == null || arrayList.isEmpty()) {
                        int i24 = videoEditedInfo.originalBitrate;
                        if (i24 < 500000) {
                            videoEditedInfo.bitrate = 2500000;
                            videoEditedInfo.originalBitrate = -1;
                        } else {
                            videoEditedInfo.bitrate = Utilities.clamp(i24, 3000000, 500000);
                        }
                    } else {
                        videoEditedInfo.bitrate = 2000000;
                        videoEditedInfo.originalBitrate = -1;
                    }
                    StringBuilder sb3 = new StringBuilder("story bitrate, original = ");
                    sb3.append(videoEditedInfo.originalBitrate);
                    sb3.append(" => ");
                    i0.a.v(videoEditedInfo.bitrate, sb3);
                    int i25 = iArr2[0][4];
                    long j24 = i25;
                    z7Var4.h0 = j24;
                    videoEditedInfo.originalDuration = j24 * 1000;
                    float f14 = j24;
                    long j25 = ((long) (z7Var4.Z * f14)) * 1000;
                    videoEditedInfo.startTime = j25;
                    long j26 = ((long) (z7Var4.a0 * f14)) * 1000;
                    videoEditedInfo.endTime = j26;
                    videoEditedInfo.estimatedDuration = j26 - j25;
                    videoEditedInfo.volume = z7Var4.P;
                    videoEditedInfo.muted = z7Var4.Y;
                    videoEditedInfo.estimatedSize = (long) p.d(i25 / 1000.0f, extractRealEncoderBitrate, 8.0f, r2[5]);
                    videoEditedInfo.estimatedSize = Math.max(z7Var4.L.length(), videoEditedInfo.estimatedSize);
                    videoEditedInfo.filterState = z7Var4.a1;
                    File file7 = z7Var4.Q0;
                    videoEditedInfo.blurPath = file7 == null ? null : file7.getPath();
                    j11 = 0;
                }
                videoEditedInfo.account = z7Var4.a;
                videoEditedInfo.wallpaperPeerId = z7Var4.z0;
                videoEditedInfo.isDark = z7Var4.y0;
                videoEditedInfo.avatarStartTime = -1L;
                MediaController.CropState cropState = z7Var4.m0;
                if (cropState != null) {
                    videoEditedInfo.cropState = cropState.clone();
                } else {
                    videoEditedInfo.cropState = new MediaController.CropState();
                }
                videoEditedInfo.cropState.useMatrix = new Matrix();
                videoEditedInfo.cropState.useMatrix.set(z7Var4.n0);
                videoEditedInfo.mediaEntities = z7Var4.T0;
                videoEditedInfo.gradientTopColor = Integer.valueOf(z7Var4.A0);
                videoEditedInfo.gradientBottomColor = Integer.valueOf(z7Var4.B0);
                videoEditedInfo.forceFragmenting = true;
                videoEditedInfo.hdrInfo = z7Var4.d1;
                videoEditedInfo.mixedSoundInfos.clear();
                if (z7Var4.v() && !z7Var4.Y) {
                    ArrayList<VideoEditedInfo.Part> arrayList7 = videoEditedInfo.collageParts;
                    int size4 = arrayList7.size();
                    int i26 = 0;
                    while (i26 < size4) {
                        VideoEditedInfo.Part part6 = arrayList7.get(i26);
                        i26++;
                        VideoEditedInfo.Part part7 = part6;
                        if (part7.isVideo && part7.volume > 0.0f && !part7.muted) {
                            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(part7.path);
                            mixedSoundInfo.volume = part7.volume;
                            float f15 = part7.left;
                            float f16 = part7.duration;
                            mixedSoundInfo.audioOffset = ((long) (f15 * f16)) * 1000;
                            mixedSoundInfo.startTime = part7.offset * 1000;
                            mixedSoundInfo.duration = ((long) ((part7.right - f15) * f16)) * 1000;
                            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo);
                        }
                    }
                }
                File file8 = z7Var4.o0;
                if (file8 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file8.getAbsolutePath());
                    mixedSoundInfo2.volume = z7Var4.u0;
                    float f17 = z7Var4.s0;
                    float f18 = z7Var4.q0;
                    long j27 = ((long) (f17 * f18)) * 1000;
                    mixedSoundInfo2.audioOffset = j27;
                    if (z7Var4.K) {
                        mixedSoundInfo2.startTime = ((long) (z7Var4.r0 - (z7Var4.Z * z7Var4.h0))) * 1000;
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
                    mixedSoundInfo2.duration = ((long) ((z7Var4.t0 - f17) * f18)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
                }
                String str5 = z7Var4.y;
                if (str5 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str5);
                    mixedSoundInfo3.volume = z7Var4.G;
                    float f19 = z7Var4.E;
                    float f20 = z7Var4.C;
                    long j29 = ((long) (f19 * f20)) * 1000;
                    mixedSoundInfo3.audioOffset = j29;
                    if (z7Var4.K) {
                        mixedSoundInfo3.startTime = ((long) (z7Var4.D - (z7Var4.Z * z7Var4.h0))) * 1000;
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
                    mixedSoundInfo3.duration = ((long) ((z7Var4.F - f19) * f20)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
                }
                callback5.run(videoEditedInfo);
                return;
            case 17:
                lh.d dVar2 = (lh.d) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                e3 e3Var = (e3) this.d;
                q1 q1Var = (q1) this.e;
                dVar2.setLoading(false);
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    e3Var.dismiss();
                    q1Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 18:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                e3 e3Var2 = (e3) this.c;
                c6 c6Var = (c6) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new mc(e3Var2.topBulletinContainer, c6Var).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, k.G0(connectedbotstarref.commission_permille), UserObject.getUserName(user))), R.raw.copy).j();
                return;
            case 19:
                s3.x0((s3) this.b, (Context) this.c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.e);
                return;
            case 20:
                a();
                return;
            case 21:
                b();
                return;
            case 22:
                c();
                return;
            case 23:
                e();
                return;
            case 24:
                f();
                return;
            case 25:
                g();
                return;
            case 26:
                h();
                return;
            case 27:
                i();
                return;
            case 28:
                j();
                return;
            default:
                na.U((na) this.b, (org.telegram.ui.ActionBar.b2) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                return;
        }
    }

    public /* synthetic */ b(z7 z7Var, String str, int[][] iArr, Utilities.Callback callback) {
        this.a = 16;
        this.b = z7Var;
        this.d = str;
        this.c = iArr;
        this.e = callback;
    }
}
