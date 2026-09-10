package androidx.car.app.utils;

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
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import b2.k0;
import b2.n0;
import b2.x0;
import bi.e8;
import bi.r9;
import bi.tb;
import bi.wa;
import di.h4;
import di.y1;
import e9.i0;
import fg.s1;
import gg.b0;
import gg.j2;
import gg.k2;
import hi.s;
import i9.c0;
import i9.w;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import k2.e0;
import m4.d1;
import m4.f1;
import m4.h1;
import m4.j0;
import m4.j1;
import m4.k;
import m4.l0;
import m4.l1;
import m4.o1;
import m4.p;
import m4.t1;
import n4.l;
import n4.m;
import n4.v;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
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
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wc;
import org.telegram.ui.h8;
import org.telegram.ui.o6;
import org.telegram.ui.p6;
import org.telegram.ui.q6;
import org.telegram.ui.web.r;
import v7.o8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ b(r9 r9Var, String str, int[][] iArr, Utilities.Callback callback) {
        this.a = 2;
        this.b = r9Var;
        this.d = str;
        this.c = iArr;
        this.e = callback;
    }

    private final void a() {
        ki.f fVar = (ki.f) this.b;
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
            } catch (Throwable th2) {
                throw th2;
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
        i0 i0Var;
        Bundle bundle2;
        boolean z10;
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        Bundle bundle3;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        j0 j0Var = (j0) this.b;
        AtomicInteger atomicInteger = (AtomicInteger) this.c;
        ArrayList arrayList3 = (ArrayList) this.d;
        if (atomicInteger.incrementAndGet() == arrayList3.size()) {
            ArrayList arrayList4 = new ArrayList();
            int i10 = 0;
            for (ArrayList arrayList5 = (ArrayList) this.e; i10 < arrayList5.size(); arrayList5 = arrayList2) {
                w wVar = (w) arrayList5.get(i10);
                if (wVar != null) {
                    try {
                        bitmap = (Bitmap) o8.a(wVar);
                    } catch (CancellationException | ExecutionException e) {
                        synchronized (e2.a.b) {
                            Log.d("MediaSessionLegacyStub", e2.a.a("Failed to get bitmap", e));
                        }
                    }
                    k0 k0Var = (k0) arrayList3.get(i10);
                    int i11 = k.a;
                    String str = !k0Var.a.equals("") ? null : k0Var.a;
                    n0 n0Var = k0Var.d;
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
                            bundle4.putLong("android.media.extra.BT_FOLDER_TYPE", k.a(num2.intValue()));
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
                                String[] strArr = m.d;
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
                    arrayList4.add(new v(new l(str, charSequence, charSequence5, charSequence2, bitmap2, n0Var.m, bundle3, k0Var.f.a), i10 != -1 ? -1L : i10));
                    i10++;
                    arrayList3 = arrayList;
                }
                bitmap = null;
                k0 k0Var2 = (k0) arrayList3.get(i10);
                int i112 = k.a;
                if (!k0Var2.a.equals("")) {
                }
                n0 n0Var2 = k0Var2.d;
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
                arrayList4.add(new v(new l(str, charSequence, charSequence52, charSequence2, bitmap2, n0Var2.m, bundle3, k0Var2.f.a), i10 != -1 ? -1L : i10));
                i10++;
                arrayList3 = arrayList;
            }
            l0.D(((l0) j0Var.e).k, arrayList4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void c() {
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings;
        TLObject tLObject = (TLObject) this.b;
        h6 h6Var = (h6) this.c;
        i6 i6Var = (i6) this.d;
        TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
        j6.A--;
        if (tLObject instanceof TLRPC.TL_theme) {
            TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject;
            TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
            if (h6Var == null || themeSettings == null) {
                TLRPC.Document document = tL_theme2.document;
                if (document != null && document.id != tL_theme.document.id) {
                    if (h6Var != null) {
                        h6Var.r = tL_theme2;
                    } else {
                        i6Var.F = tL_theme2;
                        i6Var.G = false;
                        i6Var.g0 = null;
                        i6Var.h0 = null;
                        NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoaded);
                        NotificationCenter.getInstance(i6Var.E).addObserver(i6Var, NotificationCenter.fileLoadFailed);
                        FileLoader fileLoader = FileLoader.getInstance(i6Var.E);
                        TLRPC.TL_theme tL_theme3 = i6Var.F;
                        fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                    }
                }
            } else {
                if (i6.a(h6Var, themeSettings)) {
                    z10 = false;
                } else {
                    File d = h6Var.d();
                    if (d != null) {
                        d.delete();
                    }
                    i6.i(h6Var, themeSettings);
                    i6 i6Var2 = j6.I;
                    if (i6Var2 == i6Var && i6Var2.Y == h6Var.a) {
                        j6.n1(false, false);
                        j6.J(ApplicationLoader.applicationContext, false);
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        int i10 = NotificationCenter.needSetDayNightTheme;
                        i6 i6Var3 = j6.I;
                        globalInstance.lambda$postNotificationNameOnUIThread$1(i10, i6Var3, Boolean.valueOf(j6.J == i6Var3), null, -1);
                    }
                    e6.a(true);
                    z10 = true;
                }
                TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                h6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                r5 = z10;
            }
            if (j6.A != 0) {
                j6.B = (int) (System.currentTimeMillis() / 1000);
                j6.s1(r5, false);
                return;
            }
            return;
        }
        r5 = false;
        if (j6.A != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:169:0x0362, code lost:
    
        if (r5 == null) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01f8  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        float f7;
        long j3;
        long j10;
        long j11;
        ArrayList arrayList;
        char c10 = 2;
        int i10 = 5;
        SQLiteCursor sQLiteCursor = null;
        boolean z10 = true;
        boolean z11 = false;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str = (String) this.d;
                c cVar = (c) this.e;
                if (oVar != null && ((androidx.lifecycle.v) oVar).c.compareTo(n.c) >= 0) {
                    i.b(iOnDoneCallback, str, cVar);
                    return;
                }
                i.f(iOnDoneCallback, str, new IllegalStateException("Lifecycle is not at least created when dispatching " + cVar));
                return;
            case 1:
                e8 e8Var = (e8) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                r9 r9Var = (r9) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ia iaVar = e8Var.G;
                Bitmap bitmap = e8Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    e8Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                e8Var.a = bitmap2;
                if (r9Var != null && !r9Var.c && r9Var.K && bitmap2 != null) {
                    r9Var.k0 = bitmap2.getWidth();
                    r9Var.l0 = e8Var.a.getHeight();
                    r9Var.A();
                }
                if (zArr[0] && r9Var != null && iaVar != null && e8Var.a != null) {
                    iaVar.e();
                    iaVar.f(r9Var.b(e8Var.a, 0.2f), false);
                    tb tbVar = e8Var.v;
                    if (tbVar != null) {
                        tbVar.run();
                    }
                }
                e8Var.r();
                e8Var.invalidate();
                return;
            case 2:
                r9 r9Var2 = (r9) this.b;
                String str2 = (String) this.d;
                int[][] iArr = (int[][]) this.c;
                Utilities.Callback callback = (Utilities.Callback) this.e;
                r9Var2.getClass();
                VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
                videoEditedInfo.isStory = true;
                videoEditedInfo.fromCamera = r9Var2.c1;
                videoEditedInfo.originalWidth = r9Var2.k0;
                videoEditedInfo.originalHeight = r9Var2.l0;
                videoEditedInfo.resultWidth = r9Var2.i0;
                videoEditedInfo.resultHeight = r9Var2.j0;
                File file = r9Var2.P0;
                videoEditedInfo.paintPath = file == null ? null : file.getPath();
                File file2 = r9Var2.W0;
                videoEditedInfo.messagePath = file2 == null ? null : file2.getPath();
                File file3 = r9Var2.X0;
                videoEditedInfo.messageVideoMaskPath = file3 == null ? null : file3.getPath();
                File file4 = r9Var2.Y0;
                videoEditedInfo.backgroundPath = file4 == null ? null : file4.getPath();
                int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
                if (!r9Var2.K || str2 == null || r9Var2.v()) {
                    File file5 = r9Var2.Z0;
                    if (file5 != null) {
                        videoEditedInfo.originalPath = file5.getAbsolutePath();
                    } else {
                        videoEditedInfo.originalPath = str2;
                    }
                    videoEditedInfo.isPhoto = true;
                    videoEditedInfo.collage = r9Var2.S;
                    if (r9Var2.v()) {
                        int i11 = 0;
                        boolean z12 = false;
                        while (i11 < r9Var2.T.size()) {
                            r9 r9Var3 = (r9) r9Var2.T.get(i11);
                            if (r9Var3.K) {
                                r9Var3.k0 = Math.max(r9Var3.k0, iArr[i11][1]);
                                r9Var3.l0 = Math.max(r9Var3.l0, iArr[i11][c10]);
                                r9Var3.h0 = Math.max(r9Var3.h0, iArr[i11][4]);
                                z12 = true;
                            }
                            i11++;
                            c10 = 2;
                        }
                        f7 = 8.0f;
                        ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(r9Var2);
                        videoEditedInfo.collageParts = parts;
                        if (z12) {
                            int size = parts.size();
                            int i12 = 0;
                            VideoEditedInfo.Part part = null;
                            long j12 = 0;
                            while (i12 < size) {
                                VideoEditedInfo.Part part2 = parts.get(i12);
                                i12++;
                                VideoEditedInfo.Part part3 = part2;
                                long j13 = j12;
                                if (part3.isVideo) {
                                    long j14 = part3.duration;
                                    if (j14 > j13) {
                                        j12 = j14;
                                        part = part3;
                                    }
                                }
                                j12 = j13;
                            }
                            if (part != null) {
                                float f10 = part.duration;
                                float f11 = part.right;
                                float f12 = part.left;
                                long j15 = (long) ((f11 - f12) * f10);
                                r9Var2.h0 = j15;
                                videoEditedInfo.originalDuration = j15;
                                videoEditedInfo.estimatedDuration = j15;
                                j3 = -(part.offset + ((long) (f12 * f10)));
                                part.offset = j3;
                                ArrayList<VideoEditedInfo.Part> arrayList2 = videoEditedInfo.collageParts;
                                int size2 = arrayList2.size();
                                int i13 = 0;
                                while (i13 < size2) {
                                    VideoEditedInfo.Part part4 = arrayList2.get(i13);
                                    i13++;
                                    VideoEditedInfo.Part part5 = part4;
                                    if (part5.isVideo && part5 != part) {
                                        part5.offset += j3;
                                    }
                                }
                                videoEditedInfo.startTime = -1L;
                                videoEditedInfo.endTime = -1L;
                                videoEditedInfo.muted = true;
                                videoEditedInfo.originalBitrate = -1;
                                videoEditedInfo.volume = 1.0f;
                                videoEditedInfo.bitrate = -1;
                                videoEditedInfo.framerate = 30;
                                videoEditedInfo.estimatedSize = (long) (((r9Var2.h0 / 1000.0f) * extractRealEncoderBitrate) / f7);
                                videoEditedInfo.filterState = null;
                            }
                        } else {
                            long j16 = r9Var2.S0;
                            r9Var2.h0 = j16;
                            videoEditedInfo.originalDuration = j16;
                            videoEditedInfo.estimatedDuration = j16;
                        }
                    } else {
                        f7 = 8.0f;
                        if (r9Var2.o0 != null) {
                            long j17 = (long) ((r9Var2.t0 - r9Var2.s0) * r9Var2.q0);
                            r9Var2.h0 = j17;
                            videoEditedInfo.originalDuration = j17;
                            videoEditedInfo.estimatedDuration = j17;
                        } else if (r9Var2.y != null) {
                            long j18 = (long) ((r9Var2.F - r9Var2.E) * r9Var2.C);
                            r9Var2.h0 = j18;
                            videoEditedInfo.originalDuration = j18;
                            videoEditedInfo.estimatedDuration = j18;
                        } else {
                            long j19 = r9Var2.S0;
                            r9Var2.h0 = j19;
                            videoEditedInfo.originalDuration = j19;
                            videoEditedInfo.estimatedDuration = j19;
                        }
                    }
                    j3 = 0;
                    videoEditedInfo.startTime = -1L;
                    videoEditedInfo.endTime = -1L;
                    videoEditedInfo.muted = true;
                    videoEditedInfo.originalBitrate = -1;
                    videoEditedInfo.volume = 1.0f;
                    videoEditedInfo.bitrate = -1;
                    videoEditedInfo.framerate = 30;
                    videoEditedInfo.estimatedSize = (long) (((r9Var2.h0 / 1000.0f) * extractRealEncoderBitrate) / f7);
                    videoEditedInfo.filterState = null;
                } else {
                    videoEditedInfo.originalPath = str2;
                    videoEditedInfo.isPhoto = false;
                    videoEditedInfo.framerate = Math.min(59, iArr[0][7]);
                    int videoBitrate = MediaController.getVideoBitrate(str2);
                    if (videoBitrate == -1) {
                        videoBitrate = iArr[0][3];
                    }
                    videoEditedInfo.originalBitrate = videoBitrate;
                    if (videoBitrate >= 1000000 || (arrayList = r9Var2.T0) == null || arrayList.isEmpty()) {
                        int i14 = videoEditedInfo.originalBitrate;
                        if (i14 < 500000) {
                            videoEditedInfo.bitrate = 2500000;
                            videoEditedInfo.originalBitrate = -1;
                        } else {
                            videoEditedInfo.bitrate = Utilities.clamp(i14, 3000000, 500000);
                        }
                    } else {
                        videoEditedInfo.bitrate = 2000000;
                        videoEditedInfo.originalBitrate = -1;
                    }
                    StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
                    sb2.append(videoEditedInfo.originalBitrate);
                    sb2.append(" => ");
                    hc.b.q(videoEditedInfo.bitrate, sb2);
                    int i15 = iArr[0][4];
                    long j20 = i15;
                    r9Var2.h0 = j20;
                    videoEditedInfo.originalDuration = j20 * 1000;
                    float f13 = j20;
                    long j21 = ((long) (r9Var2.Z * f13)) * 1000;
                    videoEditedInfo.startTime = j21;
                    long j22 = ((long) (r9Var2.a0 * f13)) * 1000;
                    videoEditedInfo.endTime = j22;
                    videoEditedInfo.estimatedDuration = j22 - j21;
                    videoEditedInfo.volume = r9Var2.P;
                    videoEditedInfo.muted = r9Var2.Y;
                    videoEditedInfo.estimatedSize = (long) a4.a.A(i15 / 1000.0f, extractRealEncoderBitrate, 8.0f, r2[5]);
                    videoEditedInfo.estimatedSize = Math.max(r9Var2.L.length(), videoEditedInfo.estimatedSize);
                    videoEditedInfo.filterState = r9Var2.a1;
                    File file6 = r9Var2.Q0;
                    videoEditedInfo.blurPath = file6 == null ? null : file6.getPath();
                    j3 = 0;
                }
                videoEditedInfo.account = r9Var2.a;
                videoEditedInfo.wallpaperPeerId = r9Var2.z0;
                videoEditedInfo.isDark = r9Var2.y0;
                videoEditedInfo.avatarStartTime = -1L;
                MediaController.CropState cropState = r9Var2.m0;
                if (cropState != null) {
                    videoEditedInfo.cropState = cropState.clone();
                } else {
                    videoEditedInfo.cropState = new MediaController.CropState();
                }
                videoEditedInfo.cropState.useMatrix = new Matrix();
                videoEditedInfo.cropState.useMatrix.set(r9Var2.n0);
                videoEditedInfo.mediaEntities = r9Var2.T0;
                videoEditedInfo.gradientTopColor = Integer.valueOf(r9Var2.A0);
                videoEditedInfo.gradientBottomColor = Integer.valueOf(r9Var2.B0);
                videoEditedInfo.forceFragmenting = true;
                videoEditedInfo.hdrInfo = r9Var2.d1;
                videoEditedInfo.mixedSoundInfos.clear();
                if (r9Var2.v() && !r9Var2.Y) {
                    ArrayList<VideoEditedInfo.Part> arrayList3 = videoEditedInfo.collageParts;
                    int size3 = arrayList3.size();
                    int i16 = 0;
                    while (i16 < size3) {
                        VideoEditedInfo.Part part6 = arrayList3.get(i16);
                        i16++;
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
                File file7 = r9Var2.o0;
                if (file7 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
                    mixedSoundInfo2.volume = r9Var2.u0;
                    float f16 = r9Var2.s0;
                    float f17 = r9Var2.q0;
                    long j23 = ((long) (f16 * f17)) * 1000;
                    mixedSoundInfo2.audioOffset = j23;
                    if (r9Var2.K) {
                        mixedSoundInfo2.startTime = ((long) (r9Var2.r0 - (r9Var2.Z * r9Var2.h0))) * 1000;
                        j11 = 0;
                    } else {
                        j11 = 0;
                        mixedSoundInfo2.startTime = 0L;
                    }
                    long j24 = mixedSoundInfo2.startTime + j3;
                    mixedSoundInfo2.startTime = j24;
                    if (j24 < j11) {
                        mixedSoundInfo2.audioOffset = j23 - j24;
                        mixedSoundInfo2.startTime = j11;
                    }
                    mixedSoundInfo2.duration = ((long) ((r9Var2.t0 - f16) * f17)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
                }
                String str3 = r9Var2.y;
                if (str3 != null) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str3);
                    mixedSoundInfo3.volume = r9Var2.G;
                    float f18 = r9Var2.E;
                    float f19 = r9Var2.C;
                    long j25 = ((long) (f18 * f19)) * 1000;
                    mixedSoundInfo3.audioOffset = j25;
                    if (r9Var2.K) {
                        mixedSoundInfo3.startTime = ((long) (r9Var2.D - (r9Var2.Z * r9Var2.h0))) * 1000;
                        j10 = 0;
                    } else {
                        j10 = 0;
                        mixedSoundInfo3.startTime = 0L;
                    }
                    long j26 = mixedSoundInfo3.startTime + j3;
                    mixedSoundInfo3.startTime = j26;
                    if (j26 < j10) {
                        mixedSoundInfo3.audioOffset = j25 - j26;
                        mixedSoundInfo3.startTime = j10;
                    }
                    mixedSoundInfo3.duration = ((long) ((r9Var2.F - f18) * f19)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
                }
                callback.run(videoEditedInfo);
                return;
            case 3:
                bi.d dVar = (bi.d) this.b;
                TLObject tLObject = (TLObject) this.c;
                h3 h3Var = (h3) this.d;
                y1 y1Var = (y1) this.e;
                dVar.setLoading(false);
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    h3Var.dismiss();
                    y1Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 4:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                h3 h3Var2 = (h3) this.c;
                f6 f6Var = (f6) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new wc(h3Var2.topBulletinContainer, f6Var).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, di.m.G0(connectedbotstarref.commission_permille), UserObject.getUserName(user))), R.raw.copy).j();
                return;
            case 5:
                h4.x0((h4) this.b, (Context) this.c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.e);
                return;
            case 6:
                TLObject tLObject2 = (TLObject) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                r rVar = (r) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (!(tLObject2 instanceof TLRPC.TL_boolTrue)) {
                    if (zArr2[0]) {
                        return;
                    }
                    zArr2[0] = true;
                    rVar.run(Boolean.TRUE, "cancelled");
                    return;
                }
                userFull.bot_can_manage_emoji_status = true;
                if (zArr2[0]) {
                    return;
                }
                zArr2[0] = true;
                rVar.run(Boolean.TRUE, "allowed");
                return;
            case 7:
                fg.c cVar2 = (fg.c) this.b;
                Location location = (Location) this.c;
                String str4 = (String) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                ArrayList arrayList5 = cVar2.r;
                cVar2.n = false;
                if (location == null) {
                    cVar2.F = 0;
                    cVar2.h = false;
                    cVar2.s.clear();
                    cVar2.J = false;
                    cVar2.x = str4;
                }
                arrayList5.clear();
                arrayList5.addAll(arrayList4);
                cVar2.l();
                return;
            case 8:
                fg.c cVar3 = (fg.c) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                String str5 = (String) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                ArrayList arrayList6 = cVar3.s;
                if (tL_error == null) {
                    cVar3.F = 0;
                    cVar3.h = false;
                    arrayList6.clear();
                    cVar3.J = false;
                    cVar3.x = str5;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject3;
                    int size4 = messages_botresults.results.size();
                    for (int i17 = 0; i17 < size4; i17++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i17);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = a4.a.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.id;
                                arrayList6.add(tL_messageMediaVenue);
                            }
                        }
                    }
                }
                fg.b bVar = cVar3.y;
                if (bVar != null) {
                    bVar.a(arrayList6);
                }
                cVar3.l();
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new b((fg.m) this.b, (Runnable) this.d, (ArrayList) this.e, s4.o.c((fg.g) this.c, true), 10));
                return;
            case 10:
                fg.m mVar = (fg.m) this.b;
                Runnable runnable = (Runnable) this.c;
                ArrayList arrayList7 = (ArrayList) this.d;
                s4.k kVar = (s4.k) this.e;
                if (mVar.Z) {
                    mVar.Z = false;
                    if (runnable != null) {
                        runnable.run();
                    }
                    mVar.M = arrayList7;
                    kVar.b(mVar);
                    if (mVar.a0) {
                        mVar.a0 = false;
                        mVar.W(runnable);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                b0 b0Var = (b0) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.d;
                Runnable runnable2 = (Runnable) this.e;
                ArrayList arrayList8 = b0Var.b;
                if (tLObject4 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject4;
                    int indexOf = arrayList8.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList8.set(indexOf, tL_businessChatLink2);
                        NotificationCenter.getInstance(b0Var.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        if (runnable2 != null) {
                            runnable2.run();
                        }
                        b0Var.f();
                        return;
                    }
                    return;
                }
                return;
            case 12:
                k2 k2Var = (k2) this.b;
                MessagesStorage messagesStorage = (MessagesStorage) this.c;
                j2 j2Var = (j2) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                ArrayList arrayList9 = new ArrayList();
                try {
                    try {
                        sQLiteCursor = messagesStorage.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(j2Var.a));
                        while (sQLiteCursor.next()) {
                            arrayList9.add(Integer.valueOf(sQLiteCursor.intValue(0)));
                        }
                    } catch (Exception e) {
                        FileLog.e(e);
                        break;
                    }
                    sQLiteCursor.dispose();
                    AndroidUtilities.runOnUIThread(new b(k2Var, arrayList9, j2Var, tL_messages_sendQuickReplyMessages, 13));
                    return;
                } catch (Throwable th2) {
                    if (sQLiteCursor != null) {
                        sQLiteCursor.dispose();
                    }
                    throw th2;
                }
            case 13:
                k2 k2Var2 = (k2) this.b;
                ArrayList<Integer> arrayList10 = (ArrayList) this.c;
                j2 j2Var2 = (j2) this.d;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.e;
                int i18 = k2Var2.a;
                if (arrayList10.isEmpty() || arrayList10.size() < j2Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = j2Var2.a;
                    ConnectionsManager.getInstance(i18).sendRequest(tL_messages_getQuickReplyMessages, new wa(k2Var2, arrayList10, tL_messages_sendQuickReplyMessages2, i10));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList10;
                    for (int i19 = 0; i19 < arrayList10.size(); i19++) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(i18).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 14:
                s sVar = (s) this.b;
                hi.a aVar = (hi.a) this.c;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.d;
                w70 w70Var = (w70) this.e;
                sVar.r.U4(aVar, pageBlock);
                w70Var.u();
                return;
            case 15:
                AudioTrack audioTrack = (AudioTrack) this.b;
                k2.n nVar = (k2.n) this.c;
                Handler handler = (Handler) this.d;
                k2.k kVar2 = (k2.k) this.e;
                int i20 = 27;
                try {
                    audioTrack.flush();
                    audioTrack.release();
                    if (nVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new s1(i20, nVar, kVar2));
                    }
                    synchronized (e0.o0) {
                        try {
                            int i21 = e0.q0 - 1;
                            e0.q0 = i21;
                            if (i21 == 0) {
                                e0.p0.shutdown();
                                e0.p0 = null;
                            }
                        } finally {
                        }
                    }
                    return;
                } catch (Throwable th3) {
                    if (nVar != null && handler.getLooper().getThread().isAlive()) {
                        handler.post(new s1(i20, nVar, kVar2));
                    }
                    synchronized (e0.o0) {
                        try {
                            int i22 = e0.q0 - 1;
                            e0.q0 = i22;
                            if (i22 == 0) {
                                e0.p0.shutdown();
                                e0.p0 = null;
                            }
                            throw th3;
                        } finally {
                        }
                    }
                }
            case 16:
                ki.f fVar = (ki.f) this.b;
                ((ArrayDeque) fVar.a).addLast(new ki.e((org.telegram.tgnet.j) this.c, (ki.b) this.d, (RequestTimeDelegate) this.e));
                fVar.I();
                return;
            case 17:
                a();
                return;
            case 18:
                b();
                return;
            case 19:
                h1 h1Var = (h1) this.b;
                m4.r rVar2 = (m4.r) this.c;
                m4.b0 b0Var2 = (m4.b0) this.d;
                m4.i iVar = (m4.i) this.e;
                h1Var.getClass();
                ki.f fVar2 = h1Var.b;
                try {
                    h1Var.c.remove(rVar2);
                    if (!b0Var2.j()) {
                        d1 d1Var = (d1) rVar2.d;
                        e2.d.h(d1Var);
                        IBinder asBinder = d1Var.a.asBinder();
                        p m10 = b0Var2.m(rVar2);
                        if (fVar2.z(rVar2)) {
                            try {
                                e2.a.n("MediaSessionStub", "Controller " + rVar2 + " has sent connection request multiple times");
                            } catch (Throwable th4) {
                                th = th4;
                                if (!z11) {
                                }
                                throw th;
                            }
                        }
                        fVar2.b(asBinder, rVar2, m10.a, m10.b);
                        com.google.android.gms.common.api.internal.v w10 = fVar2.w(rVar2);
                        if (w10 == null) {
                            e2.a.n("MediaSessionStub", "Ignoring connection request from unknown controller info");
                        } else {
                            l1 l1Var = b0Var2.t;
                            j1 j1Var = b0Var2.s;
                            x0 x0Var = m10.b;
                            j1 H0 = h1Var.H0(j1Var);
                            MediaSession.Token token = ((n4.r) b0Var2.h.k.b).c.b;
                            i0 i0Var = m10.c;
                            if (i0Var == null) {
                                i0Var = b0Var2.y;
                            }
                            i0 i0Var2 = m10.d;
                            if (i0Var2 == null) {
                                i0Var2 = b0Var2.z;
                            }
                            i0 i0Var3 = b0Var2.r;
                            o1 o1Var = m10.a;
                            x0 t10 = l1Var.t();
                            t1 t1Var = b0Var2.j.a;
                            t1Var.getClass();
                            try {
                                m4.g gVar = new m4.g(h1Var, i0Var, i0Var2, i0Var3, o1Var, x0Var, t10, new Bundle(t1Var.g), b0Var2.A, H0, token);
                                if (!b0Var2.j()) {
                                    try {
                                        ((m4.h) iVar).G0(w10.e(), gVar.a(rVar2.c));
                                    } catch (RemoteException unused) {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        try {
                                            if (!b0Var2.x || !m4.b0.k(rVar2)) {
                                                b0Var2.e.getClass();
                                            }
                                        } catch (Throwable th5) {
                                            th = th5;
                                            z11 = z10;
                                            if (!z11) {
                                            }
                                            throw th;
                                        }
                                    }
                                    if (z10) {
                                        return;
                                    }
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                z11 = false;
                                if (!z11) {
                                    w7.v.a(iVar);
                                }
                                throw th;
                            }
                        }
                    }
                    w7.v.a(iVar);
                    return;
                } catch (Throwable th7) {
                    th = th7;
                }
                break;
            case 20:
                m4.b0 b0Var3 = (m4.b0) this.b;
                c0 c0Var = (c0) this.c;
                e2.h hVar = (e2.h) this.d;
                w wVar = (w) this.e;
                if (b0Var3.j()) {
                    c0Var.m(null);
                    return;
                }
                try {
                    hVar.accept(wVar);
                    c0Var.m(null);
                    return;
                } catch (Throwable th8) {
                    c0Var.n(th8);
                    return;
                }
            case 21:
                m4.b0 b0Var4 = (m4.b0) this.b;
                f1 f1Var = (f1) this.c;
                m4.r rVar3 = (m4.r) this.d;
                List list = (List) this.e;
                if (b0Var4.j()) {
                    return;
                }
                f1Var.a(b0Var4.t, rVar3, list);
                return;
            case 22:
                CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
                return;
            case 23:
                CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
                return;
            case 24:
                ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (w70) this.e);
                return;
            case 25:
                ((Utilities.Callback) this.b).run(j6.Q0((File) this.c, (String) this.d, (String[]) this.e));
                return;
            case 26:
                c();
                return;
            case 27:
                p6 p6Var = (p6) this.b;
                q6 q6Var = (q6) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr3 = (boolean[]) this.e;
                p6Var.getClass();
                q6Var.a(fArr[0]);
                if (zArr3[0]) {
                    p6Var.d.w0(true);
                    return;
                }
                return;
            case 28:
                p6 p6Var2 = (p6) this.b;
                boolean[] zArr4 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                o6 o6Var = (o6) this.e;
                if (zArr4[0]) {
                    return;
                }
                jArr[0] = System.currentTimeMillis();
                p6Var2.d.showDialog(o6Var);
                return;
            default:
                h8.U((h8) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (Calendar) this.e);
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
