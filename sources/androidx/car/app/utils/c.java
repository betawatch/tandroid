package androidx.car.app.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.location.Location;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.IOnDoneCallback;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import bg.d2;
import e5.u;
import f2.s;
import fh.f2;
import fh.i4;
import fh.y3;
import g7.e6;
import gh.k5;
import gh.v1;
import ih.b4;
import ih.f4;
import ih.f6;
import ih.h4;
import ih.l9;
import ih.m9;
import ih.n6;
import ih.o6;
import ih.u3;
import ih.v6;
import ih.x3;
import j3.r0;
import j4.d0;
import j4.h0;
import j4.y;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;
import kh.a8;
import kh.b1;
import kh.r6;
import kh.rb;
import kh.v9;
import kh.wb;
import mh.l;
import mh.r1;
import of.m;
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
import org.telegram.messenger.l0;
import org.telegram.messenger.video.MediaCodecVideoConvertor;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.qn;
import org.telegram.ui.web.r;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.a = i9;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        int i9;
        long j10;
        int i10;
        long j11;
        long j12;
        ArrayList arrayList;
        a8 a8Var = (a8) this.b;
        String str = (String) this.d;
        int[][] iArr = (int[][]) this.c;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        a8Var.getClass();
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        char c10 = 1;
        videoEditedInfo.isStory = true;
        videoEditedInfo.fromCamera = a8Var.c1;
        videoEditedInfo.originalWidth = a8Var.k0;
        videoEditedInfo.originalHeight = a8Var.l0;
        videoEditedInfo.resultWidth = a8Var.i0;
        videoEditedInfo.resultHeight = a8Var.j0;
        File file = a8Var.P0;
        videoEditedInfo.paintPath = file == null ? null : file.getPath();
        File file2 = a8Var.W0;
        videoEditedInfo.messagePath = file2 == null ? null : file2.getPath();
        File file3 = a8Var.X0;
        videoEditedInfo.messageVideoMaskPath = file3 == null ? null : file3.getPath();
        File file4 = a8Var.Y0;
        videoEditedInfo.backgroundPath = file4 == null ? null : file4.getPath();
        int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
        if (!a8Var.K || str == null || a8Var.v()) {
            File file5 = a8Var.Z0;
            if (file5 != null) {
                videoEditedInfo.originalPath = file5.getAbsolutePath();
            } else {
                videoEditedInfo.originalPath = str;
            }
            videoEditedInfo.isPhoto = true;
            videoEditedInfo.collage = a8Var.S;
            if (a8Var.v()) {
                int i11 = 0;
                boolean z10 = false;
                while (i11 < a8Var.T.size()) {
                    a8 a8Var2 = (a8) a8Var.T.get(i11);
                    if (a8Var2.K) {
                        a8Var2.k0 = Math.max(a8Var2.k0, iArr[i11][c10]);
                        a8Var2.l0 = Math.max(a8Var2.l0, iArr[i11][2]);
                        i10 = extractRealEncoderBitrate;
                        a8Var2.h0 = Math.max(a8Var2.h0, iArr[i11][4]);
                        z10 = true;
                    } else {
                        i10 = extractRealEncoderBitrate;
                    }
                    i11++;
                    extractRealEncoderBitrate = i10;
                    c10 = 1;
                }
                i9 = extractRealEncoderBitrate;
                ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(a8Var);
                videoEditedInfo.collageParts = parts;
                if (z10) {
                    int size = parts.size();
                    long j13 = 0;
                    VideoEditedInfo.Part part = null;
                    int i12 = 0;
                    while (i12 < size) {
                        VideoEditedInfo.Part part2 = parts.get(i12);
                        i12++;
                        VideoEditedInfo.Part part3 = part2;
                        if (part3.isVideo) {
                            long j14 = part3.duration;
                            if (j14 > j13) {
                                part = part3;
                                j13 = j14;
                            }
                        }
                    }
                    if (part != null) {
                        float f10 = part.duration;
                        float f11 = part.right;
                        float f12 = part.left;
                        long j15 = (long) ((f11 - f12) * f10);
                        a8Var.h0 = j15;
                        videoEditedInfo.originalDuration = j15;
                        videoEditedInfo.estimatedDuration = j15;
                        j10 = -(part.offset + ((long) (f12 * f10)));
                        part.offset = j10;
                        ArrayList<VideoEditedInfo.Part> arrayList2 = videoEditedInfo.collageParts;
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            VideoEditedInfo.Part part4 = arrayList2.get(i13);
                            i13++;
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
                        videoEditedInfo.estimatedSize = (long) (((a8Var.h0 / 1000.0f) * i9) / 8.0f);
                        videoEditedInfo.filterState = null;
                    }
                } else {
                    long j16 = a8Var.S0;
                    a8Var.h0 = j16;
                    videoEditedInfo.originalDuration = j16;
                    videoEditedInfo.estimatedDuration = j16;
                }
            } else {
                i9 = extractRealEncoderBitrate;
                if (a8Var.o0 != null) {
                    long j17 = (long) ((a8Var.t0 - a8Var.s0) * a8Var.q0);
                    a8Var.h0 = j17;
                    videoEditedInfo.originalDuration = j17;
                    videoEditedInfo.estimatedDuration = j17;
                } else if (a8Var.y != null) {
                    long j18 = (long) ((a8Var.F - a8Var.E) * a8Var.C);
                    a8Var.h0 = j18;
                    videoEditedInfo.originalDuration = j18;
                    videoEditedInfo.estimatedDuration = j18;
                } else {
                    long j19 = a8Var.S0;
                    a8Var.h0 = j19;
                    videoEditedInfo.originalDuration = j19;
                    videoEditedInfo.estimatedDuration = j19;
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
            videoEditedInfo.estimatedSize = (long) (((a8Var.h0 / 1000.0f) * i9) / 8.0f);
            videoEditedInfo.filterState = null;
        } else {
            videoEditedInfo.originalPath = str;
            videoEditedInfo.isPhoto = false;
            videoEditedInfo.framerate = Math.min(59, iArr[0][7]);
            int videoBitrate = MediaController.getVideoBitrate(str);
            if (videoBitrate == -1) {
                videoBitrate = iArr[0][3];
            }
            videoEditedInfo.originalBitrate = videoBitrate;
            if (videoBitrate >= 1000000 || (arrayList = a8Var.T0) == null || arrayList.isEmpty()) {
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
            l0.n(videoEditedInfo.bitrate, sb2);
            int i15 = iArr[0][4];
            long j20 = i15;
            a8Var.h0 = j20;
            videoEditedInfo.originalDuration = j20 * 1000;
            float f13 = j20;
            long j21 = ((long) (a8Var.Z * f13)) * 1000;
            videoEditedInfo.startTime = j21;
            long j22 = ((long) (a8Var.a0 * f13)) * 1000;
            videoEditedInfo.endTime = j22;
            videoEditedInfo.estimatedDuration = j22 - j21;
            videoEditedInfo.volume = a8Var.P;
            videoEditedInfo.muted = a8Var.Y;
            videoEditedInfo.estimatedSize = (long) aa.d.d(i15 / 1000.0f, extractRealEncoderBitrate, 8.0f, r2[5]);
            videoEditedInfo.estimatedSize = Math.max(a8Var.L.length(), videoEditedInfo.estimatedSize);
            videoEditedInfo.filterState = a8Var.a1;
            File file6 = a8Var.Q0;
            videoEditedInfo.blurPath = file6 == null ? null : file6.getPath();
            j10 = 0;
        }
        videoEditedInfo.account = a8Var.a;
        videoEditedInfo.wallpaperPeerId = a8Var.z0;
        videoEditedInfo.isDark = a8Var.y0;
        videoEditedInfo.avatarStartTime = -1L;
        MediaController.CropState cropState = a8Var.m0;
        if (cropState != null) {
            videoEditedInfo.cropState = cropState.clone();
        } else {
            videoEditedInfo.cropState = new MediaController.CropState();
        }
        videoEditedInfo.cropState.useMatrix = new Matrix();
        videoEditedInfo.cropState.useMatrix.set(a8Var.n0);
        videoEditedInfo.mediaEntities = a8Var.T0;
        videoEditedInfo.gradientTopColor = Integer.valueOf(a8Var.A0);
        videoEditedInfo.gradientBottomColor = Integer.valueOf(a8Var.B0);
        videoEditedInfo.forceFragmenting = true;
        videoEditedInfo.hdrInfo = a8Var.d1;
        videoEditedInfo.mixedSoundInfos.clear();
        if (a8Var.v() && !a8Var.Y) {
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
        File file7 = a8Var.o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = a8Var.u0;
            float f16 = a8Var.s0;
            float f17 = a8Var.q0;
            long j23 = ((long) (f16 * f17)) * 1000;
            mixedSoundInfo2.audioOffset = j23;
            if (a8Var.K) {
                mixedSoundInfo2.startTime = ((long) (a8Var.r0 - (a8Var.Z * a8Var.h0))) * 1000;
                j12 = 0;
            } else {
                j12 = 0;
                mixedSoundInfo2.startTime = 0L;
            }
            long j24 = mixedSoundInfo2.startTime + j10;
            mixedSoundInfo2.startTime = j24;
            if (j24 < j12) {
                mixedSoundInfo2.audioOffset = j23 - j24;
                mixedSoundInfo2.startTime = j12;
            }
            mixedSoundInfo2.duration = ((long) ((a8Var.t0 - f16) * f17)) * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
        }
        String str2 = a8Var.y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = a8Var.G;
            float f18 = a8Var.E;
            float f19 = a8Var.C;
            long j25 = ((long) (f18 * f19)) * 1000;
            mixedSoundInfo3.audioOffset = j25;
            if (a8Var.K) {
                mixedSoundInfo3.startTime = ((long) (a8Var.D - (a8Var.Z * a8Var.h0))) * 1000;
                j11 = 0;
            } else {
                j11 = 0;
                mixedSoundInfo3.startTime = 0L;
            }
            long j26 = mixedSoundInfo3.startTime + j10;
            mixedSoundInfo3.startTime = j26;
            if (j26 < j11) {
                mixedSoundInfo3.audioOffset = j25 - j26;
                mixedSoundInfo3.startTime = j11;
            }
            mixedSoundInfo3.duration = ((long) ((a8Var.F - f18) * f19)) * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
        }
        callback.run(videoEditedInfo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x046b, code lost:
    
        if (r5 != null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x046d, code lost:
    
        r5.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0483, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new ih.k6(r10, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x048c, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0480, code lost:
    
        if (r5 != null) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v89, types: [j4.i0, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        a8 a8Var;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        l9 l9Var;
        char c10;
        o2 U;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings;
        int i9 = 1;
        r8 = true;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                o oVar = (o) this.b;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.c;
                String str = (String) this.d;
                d dVar = (d) this.e;
                if (oVar != null && ((v) oVar).c.compareTo(n.c) >= 0) {
                    j.b(iOnDoneCallback, str, dVar);
                    return;
                }
                j.f(iOnDoneCallback, str, new IllegalStateException("Lifecycle is not at least created when dispatching " + dVar));
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
                        gVar.c(new IllegalArgumentException(str3));
                    } else {
                        ((d3.h) aVar.e).f(new a(aVar, iVar, ((u2.b) a2).a(hVar), 2));
                        gVar.c(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.c(e10);
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
                final y3 y3Var = (y3) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                f2 f2Var = (f2) this.d;
                final View view = (View) this.e;
                vq0 vq0Var = y3Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    f2Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = y3Var.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(y3Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z12 = savedStarGift.pinned_to_top;
                final boolean z13 = !z12;
                if (y3Var.e.m(savedStarGift, z13, false)) {
                    new i4(y3Var.getContext(), vq0Var.c, savedStarGift, y3Var.c, new Utilities.Callback0Return() { // from class: fh.p3
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            ((f2) view).c(z13, true);
                            y3 y3Var2 = y3.this;
                            y3Var2.f.u0(0);
                            return oc.a0(y3Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z12) {
                    l0.p(R.string.Gift2Unpinned, oc.a0(vq0Var.a), R.raw.ic_unpin, 36);
                } else {
                    oc.a0(vq0Var.a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                }
                ((f2) view).c(z13, true);
                y3Var.f.u0(0);
                return;
            case 4:
                o2 o2Var = (o2) this.b;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.c;
                ve.d dVar2 = (ve.d) this.d;
                c2 c2Var = (c2) this.e;
                if (o2Var != null && tL_error2 != null) {
                    oc.a0(o2Var).d0(tL_error2, false);
                }
                if ((o2Var instanceof qn) && tL_error2 == null) {
                    ((qn) o2Var).Yb();
                }
                dVar2.b();
                c2Var.dismiss();
                return;
            case 5:
                k5.Y((k5) this.b, (boolean[]) this.c, (TL_stars.StarGiftAttribute) this.d, (qc[]) this.e);
                return;
            case 6:
                k5.R0((k5) this.b, (TLObject) this.c, (b) this.d, (TLRPC.TL_error) this.e);
                return;
            case 7:
                k5.S0((k5) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                return;
            case 8:
                k5 k5Var = (k5) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error3 != null || !(tLObject2 instanceof TLRPC.Updates)) {
                    k5Var.getBulletinFactory().d0(tL_error3, false);
                    return;
                }
                k5Var.m0 = true;
                k5Var.h1 = null;
                k5Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject2, new v1(k5Var, 5));
                Utilities.stageQueue.postRunnable(new u(14, k5Var, tLObject2));
                return;
            case 9:
                gh.i4 i4Var = (gh.i4) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                ArrayList arrayList2 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                j6 j6Var = i4Var.D;
                i4Var.d0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                pi0 pi0Var = i4Var.h0;
                if (pi0Var != null) {
                    pi0Var.d();
                    AndroidUtilities.runOnUIThread(new d2(4), 750L);
                }
                i4Var.M.animate().alpha(0.0f).start();
                i4Var.O.animate().alpha(1.0f).start();
                i4Var.C.animate().alpha(1.0f).start();
                i4Var.N.animate().alpha(0.0f).start();
                i4Var.L.animate().alpha(1.0f).start();
                i4Var.I.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList2.size(), new Object[0])));
                j6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                j6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                i4Var.E.setAlpha(0.0f);
                if (i4Var.K != null) {
                    int i10 = 0;
                    while (true) {
                        f2[] f2VarArr = i4Var.K;
                        if (i10 < f2VarArr.length) {
                            AndroidUtilities.removeFromParent(f2VarArr[i10]);
                            i10++;
                        } else {
                            i4Var.K = null;
                        }
                    }
                }
                i4Var.K = new f2[arrayList2.size()];
                int i11 = 0;
                while (i11 < arrayList2.size()) {
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList2.get(i11);
                    f2 f2Var2 = new f2(i4Var.getContext(), i4Var.S, i4Var.a);
                    f2Var2.g(starGift2, false, false, false, false, true);
                    f2Var2.x.setVisibility(8);
                    f2Var2.setRibbonColor(-3065286);
                    o9 o9Var = f2Var2.y;
                    FrameLayout.LayoutParams e11 = e6.e(42, 42, 17);
                    f2Var2.A = e11;
                    o9Var.setLayoutParams(e11);
                    int i12 = i11 + 1;
                    boolean z14 = i12 >= arrayList2.size();
                    LinearLayout linearLayout = i4Var.J;
                    i4Var.K[i11] = f2Var2;
                    linearLayout.addView(f2Var2, e6.p(74, 74, 0.0f, 51, 0, 0, z14 ? 0 : 6, 0));
                    i11 = i12;
                }
                return;
            case 10:
                b4 b4Var = (b4) this.b;
                TLObject tLObject3 = (TLObject) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                ih.i4 i4Var2 = b4Var.l;
                if (tLObject3 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    MessagesController.getInstance(i4Var2.y2).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(i4Var2.y2).putChats(tL_stories_stories.chats, false);
                    for (int i13 = 0; i13 < tL_stories_stories.stories.size(); i13++) {
                        if (tL_stories_stories.stories.get(i13).id == storyItem2.id) {
                            callback3.run(tL_stories_stories.stories.get(i13).media.document);
                            return;
                        }
                    }
                }
                callback3.run(null);
                return;
            case 11:
                b4 b4Var2 = (b4) this.b;
                Activity activity = (Activity) this.c;
                m9 m9Var = (m9) this.d;
                f4 f4Var = (f4) this.e;
                wb E = wb.E(activity, b4Var2.l.y2);
                h4 h4Var = b4Var2.l.I2;
                long j10 = (h4Var == null || (l9Var = h4Var.b) == null) ? 0L : l9Var.currentPosition;
                b1 b1Var = MessagesController.getInstance(b4Var2.l.y2).getStoriesController().w;
                TL_stories.StoryItem storyItem3 = b4Var2.l.K1.a;
                long j11 = storyItem3.dialogId;
                ArrayList arrayList3 = b1Var.b;
                int size = arrayList3.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj = arrayList3.get(i14);
                    i14++;
                    a8 a8Var2 = (a8) obj;
                    if (a8Var2.g && storyItem3.id == a8Var2.f && j11 == a8Var2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList3;
                        storyItem = storyItem3;
                        if ((document == null || document.id == a8Var2.H) && ((photo = messageMedia.photo) == null || photo.id == a8Var2.I)) {
                            a8Var2.h = true;
                            a8Var = a8Var2;
                            if (a8Var != null || a8Var.u || (file = a8Var.L) == null || !file.exists()) {
                                a8Var = a8.n(b4Var2.l.K1.h(), b4Var2.l.K1.a);
                                a8Var.e = b4Var2.l.x1;
                            }
                            a8 g10 = a8Var.g();
                            if (b4Var2.l.I0()) {
                                ih.i4 i4Var3 = b4Var2.l;
                                g10.J0 = i4Var3.x1;
                                g10.L0 = MessagesController.toInputMedia(i4Var3.K1.a.media);
                                n6 n6Var = m9Var.K0;
                                if (n6Var instanceof f6) {
                                    g10.K0 = ((f6) n6Var).E;
                                }
                            }
                            E.S(rb.d(m9Var), g10, j10);
                            E.M = new u3(b4Var2, 3);
                            E.N = new x3(b4Var2, f4Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList3;
                        storyItem = storyItem3;
                    }
                    storyItem3 = storyItem;
                    arrayList3 = arrayList;
                }
                a8Var = null;
                if (a8Var != null) {
                }
                a8Var = a8.n(b4Var2.l.K1.h(), b4Var2.l.K1.a);
                a8Var.e = b4Var2.l.x1;
                a8 g102 = a8Var.g();
                if (b4Var2.l.I0()) {
                }
                E.S(rb.d(m9Var), g102, j10);
                E.M = new u3(b4Var2, 3);
                E.N = new x3(b4Var2, f4Var, 1);
                return;
            case 12:
                ih.j6 j6Var2 = (ih.j6) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                Utilities.Callback callback4 = (Utilities.Callback) this.d;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.e;
                j6Var2.i = false;
                if (tLObject4 instanceof TL_stories.TL_storyAlbum) {
                    o6 a3 = o6.a((TL_stories.TL_storyAlbum) tLObject4);
                    j6Var2.h.add(a3);
                    j6Var2.f(true);
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
                    oc.a0(U).d0(tL_error4, false);
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(j6Var2.a);
                int i15 = NotificationCenter.storyAlbumsCollectionsUpdate;
                Object[] objArr = new Object[2];
                objArr[c10] = Long.valueOf(j6Var2.b);
                objArr[1] = j6Var2;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i15, objArr);
                return;
            case 13:
                n6 n6Var2 = (n6) this.b;
                ArrayList arrayList4 = (ArrayList) this.c;
                MessagesStorage messagesStorage = (MessagesStorage) this.d;
                ArrayList arrayList5 = (ArrayList) this.e;
                int i16 = n6Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i17 = n6Var2.e;
                sb2.append(i17);
                sb2.append("{");
                long j12 = n6Var2.d;
                sb2.append(j12);
                sb2.append("} saveCache {");
                sb2.append(v6.a(arrayList4));
                r0.x("}", sb2);
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j12 + " AND album_id = " + i16).stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i18 = 0;
                        while (i18 < arrayList4.size()) {
                            try {
                                TL_stories.StoryItem storyItem4 = ((MessageObject) arrayList4.get(i18)).storyItem;
                                if (storyItem4 != null) {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                    storyItem4.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindLong(i9, j12);
                                    executeFast.bindInteger(2, storyItem4.id);
                                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                                    executeFast.bindInteger(4, i17);
                                    executeFast.bindInteger(5, n6Var2.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                    executeFast.bindInteger(6, arrayList5.indexOf(Integer.valueOf(storyItem4.id)) + 1);
                                    executeFast.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindLong(1, j12);
                                    sQLitePreparedStatement.bindInteger(2, i16);
                                    sQLitePreparedStatement.bindInteger(3, storyItem4.id);
                                    sQLitePreparedStatement.bindInteger(4, i18);
                                    sQLitePreparedStatement.step();
                                }
                                i18++;
                                i9 = 1;
                            } catch (Throwable th) {
                                th = th;
                                sQLitePreparedStatement2 = executeFast;
                                try {
                                    messagesStorage.checkSQLException(th);
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                        break;
                                    }
                                } catch (Throwable th2) {
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th2;
                                }
                            }
                        }
                        if (executeFast != null) {
                            executeFast.dispose();
                            break;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        sQLitePreparedStatement2 = executeFast;
                        sQLitePreparedStatement = null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                }
                break;
            case 14:
                this.c.c(((h0) this.b).a, (d0) this.d, (y) this.e);
                return;
            case 15:
                r6 r6Var = (r6) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                a8 a8Var3 = (a8) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ba baVar = r6Var.C;
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
                if (zArr[0] && a8Var3 != null && baVar != null && r6Var.a != null) {
                    baVar.e();
                    baVar.f(a8Var3.b(r6Var.a, 0.2f), false);
                    v9 v9Var = r6Var.v;
                    if (v9Var != null) {
                        v9Var.run();
                    }
                }
                r6Var.r();
                r6Var.invalidate();
                return;
            case 16:
                a();
                return;
            case 17:
                kh.d dVar3 = (kh.d) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                f3 f3Var = (f3) this.d;
                r1 r1Var = (r1) this.e;
                dVar3.setLoading(false);
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    f3Var.dismiss();
                    r1Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 18:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.b;
                f3 f3Var2 = (f3) this.c;
                b6 b6Var = (b6) this.d;
                TLRPC.User user = (TLRPC.User) this.e;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new oc(f3Var2.topBulletinContainer, b6Var).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, l.F0(connectedbotstarref.commission_permille), UserObject.getUserName(user))), R.raw.copy).j();
                return;
            case 19:
                mh.u3.w0((mh.u3) this.b, (Context) this.c, (TLRPC.User) this.d, (TL_payments.connectedBotStarRef) this.e);
                return;
            case 20:
                TLObject tLObject6 = (TLObject) this.b;
                boolean[] zArr2 = (boolean[]) this.c;
                r rVar = (r) this.d;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.e;
                if (!(tLObject6 instanceof TLRPC.TL_boolTrue)) {
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
            case 21:
                of.c cVar = (of.c) this.b;
                Location location = (Location) this.c;
                String str4 = (String) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                ArrayList arrayList7 = cVar.r;
                cVar.n = false;
                if (location == null) {
                    cVar.B = 0;
                    cVar.h = false;
                    cVar.s.clear();
                    cVar.F = false;
                    cVar.x = str4;
                }
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                cVar.l();
                return;
            case 22:
                of.c cVar2 = (of.c) this.b;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.c;
                String str5 = (String) this.d;
                TLObject tLObject7 = (TLObject) this.e;
                ArrayList arrayList8 = cVar2.s;
                if (tL_error5 == null) {
                    cVar2.B = 0;
                    cVar2.h = false;
                    arrayList8.clear();
                    cVar2.F = false;
                    cVar2.x = str5;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject7;
                    int size2 = messages_botresults.results.size();
                    for (int i19 = 0; i19 < size2; i19++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i19);
                        if ("venue".equals(botInlineResult.type)) {
                            TLRPC.BotInlineMessage botInlineMessage = botInlineResult.send_message;
                            if (botInlineMessage instanceof TLRPC.TL_botInlineMessageMediaVenue) {
                                TLRPC.TL_botInlineMessageMediaVenue tL_botInlineMessageMediaVenue = (TLRPC.TL_botInlineMessageMediaVenue) botInlineMessage;
                                TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                                tL_messageMediaVenue.geo = tL_botInlineMessageMediaVenue.geo;
                                tL_messageMediaVenue.address = tL_botInlineMessageMediaVenue.address;
                                tL_messageMediaVenue.title = tL_botInlineMessageMediaVenue.title;
                                tL_messageMediaVenue.icon = aa.d.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), tL_botInlineMessageMediaVenue.venue_type, "_64.png");
                                tL_messageMediaVenue.venue_type = tL_botInlineMessageMediaVenue.venue_type;
                                tL_messageMediaVenue.venue_id = tL_botInlineMessageMediaVenue.venue_id;
                                tL_messageMediaVenue.provider = tL_botInlineMessageMediaVenue.provider;
                                tL_messageMediaVenue.query_id = messages_botresults.query_id;
                                tL_messageMediaVenue.result_id = botInlineResult.id;
                                arrayList8.add(tL_messageMediaVenue);
                            }
                        }
                    }
                }
                of.b bVar = cVar2.y;
                if (bVar != null) {
                    bVar.a(arrayList8);
                }
                cVar2.l();
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new c((m) this.b, (Runnable) this.d, (ArrayList) this.e, s.c((of.g) this.c, true), 24));
                return;
            case 24:
                m mVar = (m) this.b;
                Runnable runnable2 = (Runnable) this.c;
                ArrayList arrayList9 = (ArrayList) this.d;
                f2.o oVar2 = (f2.o) this.e;
                if (mVar.V) {
                    mVar.V = false;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    mVar.I = arrayList9;
                    oVar2.b(mVar);
                    if (mVar.W) {
                        mVar.W = false;
                        mVar.W(runnable2);
                        return;
                    }
                    return;
                }
                return;
            case 25:
                CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
                return;
            case 26:
                CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
                return;
            case 27:
                ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (x60) this.e);
                return;
            case 28:
                ((Utilities.Callback) this.b).run(org.telegram.ui.ActionBar.f6.Q0((File) this.c, (String) this.d, (String[]) this.e));
                return;
            default:
                TLObject tLObject8 = (TLObject) this.b;
                d6 d6Var = (d6) this.c;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                org.telegram.ui.ActionBar.f6.A--;
                if (tLObject8 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject8;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (d6Var == null || themeSettings == null) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 != null && document2.id != tL_theme.document.id) {
                            if (d6Var != null) {
                                d6Var.r = tL_theme2;
                            } else {
                                e6Var.B = tL_theme2;
                                e6Var.C = false;
                                e6Var.c0 = null;
                                e6Var.d0 = null;
                                NotificationCenter.getInstance(e6Var.A).addObserver(e6Var, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(e6Var.A).addObserver(e6Var, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(e6Var.A);
                                TLRPC.TL_theme tL_theme3 = e6Var.B;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                        }
                    } else {
                        if (org.telegram.ui.ActionBar.e6.a(d6Var, themeSettings)) {
                            z10 = false;
                        } else {
                            File d = d6Var.d();
                            if (d != null) {
                                d.delete();
                            }
                            org.telegram.ui.ActionBar.e6.i(d6Var, themeSettings);
                            org.telegram.ui.ActionBar.e6 e6Var2 = org.telegram.ui.ActionBar.f6.I;
                            if (e6Var2 == e6Var && e6Var2.U == d6Var.a) {
                                org.telegram.ui.ActionBar.f6.n1(false, false);
                                org.telegram.ui.ActionBar.f6.J(ApplicationLoader.applicationContext, false);
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                int i20 = NotificationCenter.needSetDayNightTheme;
                                org.telegram.ui.ActionBar.e6 e6Var3 = org.telegram.ui.ActionBar.f6.I;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i20, e6Var3, Boolean.valueOf(org.telegram.ui.ActionBar.f6.J == e6Var3), null, -1);
                            }
                            a6.a(true);
                            z10 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        d6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z11 = z10;
                    }
                    if (org.telegram.ui.ActionBar.f6.A != 0) {
                        org.telegram.ui.ActionBar.f6.B = (int) (System.currentTimeMillis() / 1000);
                        org.telegram.ui.ActionBar.f6.s1(z11, false);
                        return;
                    }
                    return;
                }
                z11 = false;
                if (org.telegram.ui.ActionBar.f6.A != 0) {
                }
                break;
        }
    }

    public /* synthetic */ c(a8 a8Var, String str, int[][] iArr, Utilities.Callback callback) {
        this.a = 16;
        this.b = a8Var;
        this.d = str;
        this.c = iArr;
        this.e = callback;
    }
}
