package androidx.car.app.utils;

import a4.w;
import ag.o0;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.IOnDoneCallback;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.v;
import bg.r3;
import bg.s3;
import bg.u3;
import i7.f6;
import ih.n3;
import ih.w3;
import ih.y1;
import j7.l1;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Logger;
import jh.g2;
import jh.g4;
import jh.h5;
import jh.t1;
import jh.w2;
import l4.c0;
import l4.g0;
import l4.x;
import lh.a4;
import lh.c4;
import lh.c6;
import lh.d4;
import lh.g6;
import lh.h9;
import lh.i9;
import lh.k6;
import lh.l6;
import lh.p3;
import lh.s6;
import nh.a1;
import nh.bb;
import nh.g9;
import nh.gb;
import nh.o7;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
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
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.ga;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f8;
import org.telegram.ui.la;
import org.telegram.ui.mq0;
import org.telegram.ui.n6;
import org.telegram.ui.p6;
import org.telegram.ui.th;
import org.telegram.ui.tn;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    private final void a() {
        int i10;
        long j10;
        int i11;
        long j11;
        long j12;
        ArrayList arrayList;
        o7 o7Var = (o7) this.b;
        String str = (String) this.d;
        int[][] iArr = (int[][]) this.c;
        Utilities.Callback callback = (Utilities.Callback) this.e;
        o7Var.getClass();
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        char c3 = 1;
        videoEditedInfo.isStory = true;
        videoEditedInfo.fromCamera = o7Var.c1;
        videoEditedInfo.originalWidth = o7Var.k0;
        videoEditedInfo.originalHeight = o7Var.l0;
        videoEditedInfo.resultWidth = o7Var.i0;
        videoEditedInfo.resultHeight = o7Var.j0;
        File file = o7Var.P0;
        videoEditedInfo.paintPath = file == null ? null : file.getPath();
        File file2 = o7Var.W0;
        videoEditedInfo.messagePath = file2 == null ? null : file2.getPath();
        File file3 = o7Var.X0;
        videoEditedInfo.messageVideoMaskPath = file3 == null ? null : file3.getPath();
        File file4 = o7Var.Y0;
        videoEditedInfo.backgroundPath = file4 == null ? null : file4.getPath();
        int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
        if (!o7Var.K || str == null || o7Var.v()) {
            File file5 = o7Var.Z0;
            if (file5 != null) {
                videoEditedInfo.originalPath = file5.getAbsolutePath();
            } else {
                videoEditedInfo.originalPath = str;
            }
            videoEditedInfo.isPhoto = true;
            videoEditedInfo.collage = o7Var.S;
            if (o7Var.v()) {
                int i12 = 0;
                boolean z10 = false;
                while (i12 < o7Var.T.size()) {
                    o7 o7Var2 = (o7) o7Var.T.get(i12);
                    if (o7Var2.K) {
                        o7Var2.k0 = Math.max(o7Var2.k0, iArr[i12][c3]);
                        o7Var2.l0 = Math.max(o7Var2.l0, iArr[i12][2]);
                        i11 = extractRealEncoderBitrate;
                        o7Var2.h0 = Math.max(o7Var2.h0, iArr[i12][4]);
                        z10 = true;
                    } else {
                        i11 = extractRealEncoderBitrate;
                    }
                    i12++;
                    extractRealEncoderBitrate = i11;
                    c3 = 1;
                }
                i10 = extractRealEncoderBitrate;
                ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(o7Var);
                videoEditedInfo.collageParts = parts;
                if (z10) {
                    int size = parts.size();
                    long j13 = 0;
                    VideoEditedInfo.Part part = null;
                    int i13 = 0;
                    while (i13 < size) {
                        VideoEditedInfo.Part part2 = parts.get(i13);
                        i13++;
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
                        float f9 = part.duration;
                        float f10 = part.right;
                        float f11 = part.left;
                        long j15 = (long) ((f10 - f11) * f9);
                        o7Var.h0 = j15;
                        videoEditedInfo.originalDuration = j15;
                        videoEditedInfo.estimatedDuration = j15;
                        j10 = -(part.offset + ((long) (f11 * f9)));
                        part.offset = j10;
                        ArrayList<VideoEditedInfo.Part> arrayList2 = videoEditedInfo.collageParts;
                        int size2 = arrayList2.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            VideoEditedInfo.Part part4 = arrayList2.get(i14);
                            i14++;
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
                        videoEditedInfo.estimatedSize = (long) (((o7Var.h0 / 1000.0f) * i10) / 8.0f);
                        videoEditedInfo.filterState = null;
                    }
                } else {
                    long j16 = o7Var.S0;
                    o7Var.h0 = j16;
                    videoEditedInfo.originalDuration = j16;
                    videoEditedInfo.estimatedDuration = j16;
                }
            } else {
                i10 = extractRealEncoderBitrate;
                if (o7Var.o0 != null) {
                    long j17 = (long) ((o7Var.t0 - o7Var.s0) * o7Var.q0);
                    o7Var.h0 = j17;
                    videoEditedInfo.originalDuration = j17;
                    videoEditedInfo.estimatedDuration = j17;
                } else if (o7Var.y != null) {
                    long j18 = (long) ((o7Var.F - o7Var.E) * o7Var.C);
                    o7Var.h0 = j18;
                    videoEditedInfo.originalDuration = j18;
                    videoEditedInfo.estimatedDuration = j18;
                } else {
                    long j19 = o7Var.S0;
                    o7Var.h0 = j19;
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
            videoEditedInfo.estimatedSize = (long) (((o7Var.h0 / 1000.0f) * i10) / 8.0f);
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
            if (videoBitrate >= 1000000 || (arrayList = o7Var.T0) == null || arrayList.isEmpty()) {
                int i15 = videoEditedInfo.originalBitrate;
                if (i15 < 500000) {
                    videoEditedInfo.bitrate = 2500000;
                    videoEditedInfo.originalBitrate = -1;
                } else {
                    videoEditedInfo.bitrate = Utilities.clamp(i15, 3000000, 500000);
                }
            } else {
                videoEditedInfo.bitrate = 2000000;
                videoEditedInfo.originalBitrate = -1;
            }
            StringBuilder sb2 = new StringBuilder("story bitrate, original = ");
            sb2.append(videoEditedInfo.originalBitrate);
            sb2.append(" => ");
            l1.t(videoEditedInfo.bitrate, sb2);
            int i16 = iArr[0][4];
            long j20 = i16;
            o7Var.h0 = j20;
            videoEditedInfo.originalDuration = j20 * 1000;
            float f12 = j20;
            long j21 = ((long) (o7Var.Z * f12)) * 1000;
            videoEditedInfo.startTime = j21;
            long j22 = ((long) (o7Var.a0 * f12)) * 1000;
            videoEditedInfo.endTime = j22;
            videoEditedInfo.estimatedDuration = j22 - j21;
            videoEditedInfo.volume = o7Var.P;
            videoEditedInfo.muted = o7Var.Y;
            videoEditedInfo.estimatedSize = (long) w.d(i16 / 1000.0f, extractRealEncoderBitrate, 8.0f, r2[5]);
            videoEditedInfo.estimatedSize = Math.max(o7Var.L.length(), videoEditedInfo.estimatedSize);
            videoEditedInfo.filterState = o7Var.a1;
            File file6 = o7Var.Q0;
            videoEditedInfo.blurPath = file6 == null ? null : file6.getPath();
            j10 = 0;
        }
        videoEditedInfo.account = o7Var.a;
        videoEditedInfo.wallpaperPeerId = o7Var.z0;
        videoEditedInfo.isDark = o7Var.y0;
        videoEditedInfo.avatarStartTime = -1L;
        MediaController.CropState cropState = o7Var.m0;
        if (cropState != null) {
            videoEditedInfo.cropState = cropState.clone();
        } else {
            videoEditedInfo.cropState = new MediaController.CropState();
        }
        videoEditedInfo.cropState.useMatrix = new Matrix();
        videoEditedInfo.cropState.useMatrix.set(o7Var.n0);
        videoEditedInfo.mediaEntities = o7Var.T0;
        videoEditedInfo.gradientTopColor = Integer.valueOf(o7Var.A0);
        videoEditedInfo.gradientBottomColor = Integer.valueOf(o7Var.B0);
        videoEditedInfo.forceFragmenting = true;
        videoEditedInfo.hdrInfo = o7Var.d1;
        videoEditedInfo.mixedSoundInfos.clear();
        if (o7Var.v() && !o7Var.Y) {
            ArrayList<VideoEditedInfo.Part> arrayList3 = videoEditedInfo.collageParts;
            int size3 = arrayList3.size();
            int i17 = 0;
            while (i17 < size3) {
                VideoEditedInfo.Part part6 = arrayList3.get(i17);
                i17++;
                VideoEditedInfo.Part part7 = part6;
                if (part7.isVideo && part7.volume > 0.0f && !part7.muted) {
                    MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo = new MediaCodecVideoConvertor.MixedSoundInfo(part7.path);
                    mixedSoundInfo.volume = part7.volume;
                    float f13 = part7.left;
                    float f14 = part7.duration;
                    mixedSoundInfo.audioOffset = ((long) (f13 * f14)) * 1000;
                    mixedSoundInfo.startTime = part7.offset * 1000;
                    mixedSoundInfo.duration = ((long) ((part7.right - f13) * f14)) * 1000;
                    videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo);
                }
            }
        }
        File file7 = o7Var.o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = o7Var.u0;
            float f15 = o7Var.s0;
            float f16 = o7Var.q0;
            long j23 = ((long) (f15 * f16)) * 1000;
            mixedSoundInfo2.audioOffset = j23;
            if (o7Var.K) {
                mixedSoundInfo2.startTime = ((long) (o7Var.r0 - (o7Var.Z * o7Var.h0))) * 1000;
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
            mixedSoundInfo2.duration = ((long) ((o7Var.t0 - f15) * f16)) * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
        }
        String str2 = o7Var.y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = o7Var.G;
            float f17 = o7Var.E;
            float f18 = o7Var.C;
            long j25 = ((long) (f17 * f18)) * 1000;
            mixedSoundInfo3.audioOffset = j25;
            if (o7Var.K) {
                mixedSoundInfo3.startTime = ((long) (o7Var.D - (o7Var.Z * o7Var.h0))) * 1000;
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
            mixedSoundInfo3.duration = ((long) ((o7Var.F - f17) * f18)) * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
        }
        callback.run(videoEditedInfo);
    }

    /* JADX WARN: Code restructure failed: missing block: B:129:0x03a8, code lost:
    
        if (r7 != null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x03aa, code lost:
    
        r7.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x03c0, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new lh.h6(r4, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03c9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x03bd, code lost:
    
        if (r7 != null) goto L123;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v80, types: [java.lang.Object, l4.h0] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        o7 o7Var;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        h9 h9Var;
        char c3;
        o2 U;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        boolean z10;
        TLRPC.WallPaperSettings wallPaperSettings;
        long j10 = 0;
        TLRPC.User user = null;
        int i10 = 1;
        r10 = true;
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
                u3 u3Var = (u3) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                mq0 mq0Var = (mq0) this.d;
                r3 r3Var = (r3) this.e;
                u3Var.C = true;
                u3Var.D = (r3[]) arrayList2.toArray(new r3[0]);
                mq0Var.run(r3Var);
                return;
            case 2:
                u3 u3Var2 = (u3) this.b;
                TLObject tLObject = (TLObject) this.c;
                s3 s3Var = (s3) this.d;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.e;
                if (!(tLObject instanceof TLRPC.TL_messageMediaDocument)) {
                    u3Var2.h();
                    u3Var2.n(tL_error);
                    return;
                }
                u3Var2.getClass();
                TLRPC.TL_messageMediaDocument tL_messageMediaDocument = (TLRPC.TL_messageMediaDocument) tLObject;
                s3Var.e = MediaDataController.getInputStickerSetItem(tL_messageMediaDocument.document, s3Var.c);
                s3Var.f = tL_messageMediaDocument;
                u3Var2.a();
                return;
            case 3:
                d3.a aVar = (d3.a) this.b;
                y2.i iVar = (y2.i) this.c;
                String str2 = iVar.a;
                v2.g gVar = (v2.g) this.d;
                y2.h hVar = (y2.h) this.e;
                aVar.getClass();
                Logger logger = d3.a.f;
                try {
                    z2.e a2 = aVar.c.a(str2);
                    if (a2 == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        gVar.d(new IllegalArgumentException(str3));
                    } else {
                        ((f3.h) aVar.e).f(new a(aVar, iVar, ((w2.b) a2).a(hVar), 4));
                        gVar.d(null);
                    }
                    return;
                } catch (Exception e10) {
                    logger.warning("Error scheduling event " + e10.getMessage());
                    gVar.d(e10);
                    return;
                }
            case 4:
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                TLObject tLObject2 = (TLObject) this.d;
                Utilities.Callback callback2 = (Utilities.Callback) this.e;
                if (tL_error2 != null) {
                    callback.run(tL_error2);
                    return;
                } else {
                    if (tLObject2 instanceof TLRPC.payments_GiveawayInfo) {
                        callback2.run((TLRPC.payments_GiveawayInfo) tLObject2);
                        return;
                    }
                    return;
                }
            case 5:
                final n3 n3Var = (n3) this.b;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) this.c;
                y1 y1Var = (y1) this.d;
                final View view = (View) this.e;
                gr0 gr0Var = n3Var.a;
                if (savedStarGift.unsaved) {
                    savedStarGift.unsaved = false;
                    y1Var.h(savedStarGift, true, false);
                    TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
                    savestargift.stargift = n3Var.e.g(savedStarGift);
                    savestargift.unsave = savedStarGift.unsaved;
                    ConnectionsManager.getInstance(n3Var.b).sendRequest(savestargift, null, 64);
                }
                boolean z12 = savedStarGift.pinned_to_top;
                final boolean z13 = !z12;
                if (n3Var.e.m(savedStarGift, z13, false)) {
                    new w3(n3Var.getContext(), gr0Var.c, savedStarGift, n3Var.c, new Utilities.Callback0Return() { // from class: ih.e3
                        @Override // org.telegram.messenger.Utilities.Callback0Return
                        public final Object run() {
                            ((y1) view).c(z13, true);
                            n3 n3Var2 = n3.this;
                            n3Var2.f.u0(0);
                            return tc.a0(n3Var2.a.a);
                        }
                    }).show();
                    return;
                }
                if (z12) {
                    l1.v(R.string.Gift2Unpinned, tc.a0(gr0Var.a), R.raw.ic_unpin, 36);
                } else {
                    tc.a0(gr0Var.a).M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
                }
                ((y1) view).c(z13, true);
                n3Var.f.u0(0);
                return;
            case 6:
                o2 o2Var = (o2) this.b;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.c;
                ye.c cVar = (ye.c) this.d;
                c2 c2Var = (c2) this.e;
                if (o2Var != null && tL_error3 != null) {
                    tc.a0(o2Var).d0(tL_error3, false);
                }
                if ((o2Var instanceof tn) && tL_error3 == null) {
                    ((tn) o2Var).Yb();
                }
                cVar.b();
                c2Var.dismiss();
                return;
            case 7:
                h5.Z((h5) this.b, (boolean[]) this.c, (TL_stars.StarGiftAttribute) this.d, (vc[]) this.e);
                return;
            case 8:
                h5.R0((h5) this.b, (TLObject) this.c, (b) this.d, (TLRPC.TL_error) this.e);
                return;
            case 9:
                h5.S0((h5) this.b, (MessageObject) this.c, (ArrayList) this.d, (TL_stars.StarGift) this.e);
                return;
            case 10:
                h5 h5Var = (h5) this.b;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.c;
                TLObject tLObject3 = (TLObject) this.d;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.e;
                if (tL_error4 != null || !(tLObject3 instanceof TLRPC.Updates)) {
                    h5Var.getBulletinFactory().d0(tL_error4, false);
                    return;
                }
                h5Var.m0 = true;
                h5Var.h1 = null;
                h5Var.r1(inputSavedStarGift, (TLRPC.Updates) tLObject3, new t1(h5Var, 5));
                Utilities.stageQueue.postRunnable(new w2(0, h5Var, tLObject3));
                return;
            case 11:
                g4 g4Var = (g4) this.b;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.c;
                ArrayList arrayList3 = (ArrayList) this.d;
                Runnable runnable = (Runnable) this.e;
                o6 o6Var = g4Var.D;
                g4Var.d0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                aj0 aj0Var = g4Var.h0;
                if (aj0Var != null) {
                    aj0Var.d();
                    AndroidUtilities.runOnUIThread(new o0(9), 750L);
                }
                g4Var.M.animate().alpha(0.0f).start();
                g4Var.O.animate().alpha(1.0f).start();
                g4Var.C.animate().alpha(1.0f).start();
                g4Var.N.animate().alpha(0.0f).start();
                g4Var.L.animate().alpha(1.0f).start();
                g4Var.I.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList3.size(), new Object[0])));
                o6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                o6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                g4Var.E.setAlpha(0.0f);
                if (g4Var.K != null) {
                    int i11 = 0;
                    while (true) {
                        y1[] y1VarArr = g4Var.K;
                        if (i11 < y1VarArr.length) {
                            AndroidUtilities.removeFromParent(y1VarArr[i11]);
                            i11++;
                        } else {
                            g4Var.K = null;
                        }
                    }
                }
                g4Var.K = new y1[arrayList3.size()];
                int i12 = 0;
                while (i12 < arrayList3.size()) {
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList3.get(i12);
                    y1 y1Var2 = new y1(g4Var.getContext(), g4Var.S, g4Var.a);
                    y1Var2.g(starGift2, false, false, false, false, true);
                    y1Var2.x.setVisibility(8);
                    y1Var2.setRibbonColor(-3065286);
                    t9 t9Var = y1Var2.y;
                    FrameLayout.LayoutParams e11 = f6.e(42, 42, 17);
                    y1Var2.A = e11;
                    t9Var.setLayoutParams(e11);
                    int i13 = i12 + 1;
                    boolean z14 = i13 >= arrayList3.size();
                    LinearLayout linearLayout = g4Var.J;
                    g4Var.K[i12] = y1Var2;
                    linearLayout.addView(y1Var2, f6.p(74, 74, 0.0f, 51, 0, 0, z14 ? 0 : 6, 0));
                    i12 = i13;
                }
                return;
            case 12:
                this.c.b(((g0) this.b).a, (c0) this.d, (x) this.e);
                return;
            case 13:
                lh.w3 w3Var = (lh.w3) this.b;
                TLObject tLObject4 = (TLObject) this.c;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.d;
                Utilities.Callback callback3 = (Utilities.Callback) this.e;
                d4 d4Var = w3Var.l;
                if (tLObject4 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject4;
                    MessagesController.getInstance(d4Var.y2).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(d4Var.y2).putChats(tL_stories_stories.chats, false);
                    for (int i14 = 0; i14 < tL_stories_stories.stories.size(); i14++) {
                        if (tL_stories_stories.stories.get(i14).id == storyItem2.id) {
                            callback3.run(tL_stories_stories.stories.get(i14).media.document);
                            return;
                        }
                    }
                }
                callback3.run(null);
                return;
            case 14:
                lh.w3 w3Var2 = (lh.w3) this.b;
                Activity activity = (Activity) this.c;
                i9 i9Var = (i9) this.d;
                a4 a4Var = (a4) this.e;
                gb E = gb.E(activity, w3Var2.l.y2);
                c4 c4Var = w3Var2.l.I2;
                if (c4Var != null && (h9Var = c4Var.b) != null) {
                    j10 = h9Var.currentPosition;
                }
                a1 a1Var = MessagesController.getInstance(w3Var2.l.y2).getStoriesController().w;
                TL_stories.StoryItem storyItem3 = w3Var2.l.K1.a;
                long j11 = storyItem3.dialogId;
                ArrayList arrayList4 = a1Var.b;
                int size = arrayList4.size();
                int i15 = 0;
                while (i15 < size) {
                    Object obj = arrayList4.get(i15);
                    i15++;
                    o7 o7Var2 = (o7) obj;
                    if (o7Var2.g && storyItem3.id == o7Var2.f && j11 == o7Var2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList4;
                        storyItem = storyItem3;
                        if ((document == null || document.id == o7Var2.H) && ((photo = messageMedia.photo) == null || photo.id == o7Var2.I)) {
                            o7Var2.h = true;
                            o7Var = o7Var2;
                            if (o7Var != null || o7Var.u || (file = o7Var.L) == null || !file.exists()) {
                                o7Var = o7.n(w3Var2.l.K1.h(), w3Var2.l.K1.a);
                                o7Var.e = w3Var2.l.x1;
                            }
                            o7 g10 = o7Var.g();
                            if (w3Var2.l.I0()) {
                                d4 d4Var2 = w3Var2.l;
                                g10.J0 = d4Var2.x1;
                                g10.L0 = MessagesController.toInputMedia(d4Var2.K1.a.media);
                                k6 k6Var = i9Var.K0;
                                if (k6Var instanceof c6) {
                                    g10.K0 = ((c6) k6Var).E;
                                }
                            }
                            E.S(bb.d(i9Var), g10, j10);
                            E.M = new p3(w3Var2, 3);
                            E.N = new lh.s3(w3Var2, a4Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList4;
                        storyItem = storyItem3;
                    }
                    storyItem3 = storyItem;
                    arrayList4 = arrayList;
                }
                o7Var = null;
                if (o7Var != null) {
                }
                o7Var = o7.n(w3Var2.l.K1.h(), w3Var2.l.K1.a);
                o7Var.e = w3Var2.l.x1;
                o7 g102 = o7Var.g();
                if (w3Var2.l.I0()) {
                }
                E.S(bb.d(i9Var), g102, j10);
                E.M = new p3(w3Var2, 3);
                E.N = new lh.s3(w3Var2, a4Var, 1);
                return;
            case 15:
                g6 g6Var = (g6) this.b;
                TLObject tLObject5 = (TLObject) this.c;
                Utilities.Callback callback4 = (Utilities.Callback) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                g6Var.i = false;
                if (tLObject5 instanceof TL_stories.TL_storyAlbum) {
                    l6 a10 = l6.a((TL_stories.TL_storyAlbum) tLObject5);
                    g6Var.h.add(a10);
                    g6Var.f(true);
                    if (callback4 != null) {
                        callback4.run(a10);
                        return;
                    }
                    return;
                }
                if (tL_error5 == null || (U = LaunchActivity.U()) == null) {
                    c3 = 0;
                } else {
                    c3 = 0;
                    tc.a0(U).d0(tL_error5, false);
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(g6Var.a);
                int i16 = NotificationCenter.storyAlbumsCollectionsUpdate;
                Object[] objArr = new Object[2];
                objArr[c3] = Long.valueOf(g6Var.b);
                objArr[1] = g6Var;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i16, objArr);
                return;
            case 16:
                k6 k6Var2 = (k6) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                MessagesStorage messagesStorage = (MessagesStorage) this.d;
                ArrayList arrayList6 = (ArrayList) this.e;
                int i17 = k6Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i18 = k6Var2.e;
                sb2.append(i18);
                sb2.append("{");
                long j12 = k6Var2.d;
                sb2.append(j12);
                sb2.append("} saveCache {");
                sb2.append(s6.a(arrayList5));
                th.v("}", sb2);
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j12 + " AND album_id = " + i17).stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        int i19 = 0;
                        while (i19 < arrayList5.size()) {
                            try {
                                TL_stories.StoryItem storyItem4 = ((MessageObject) arrayList5.get(i19)).storyItem;
                                if (storyItem4 != null) {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                    storyItem4.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindLong(i10, j12);
                                    executeFast.bindInteger(2, storyItem4.id);
                                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                                    executeFast.bindInteger(4, i18);
                                    executeFast.bindInteger(5, k6Var2.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                    executeFast.bindInteger(6, arrayList6.indexOf(Integer.valueOf(storyItem4.id)) + 1);
                                    executeFast.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindLong(1, j12);
                                    sQLitePreparedStatement.bindInteger(2, i17);
                                    sQLitePreparedStatement.bindInteger(3, storyItem4.id);
                                    sQLitePreparedStatement.bindInteger(4, i19);
                                    sQLitePreparedStatement.step();
                                }
                                i19++;
                                i10 = 1;
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
            case 17:
                nh.f6 f6Var = (nh.f6) this.b;
                Bitmap[] bitmapArr = (Bitmap[]) this.c;
                o7 o7Var3 = (o7) this.d;
                boolean[] zArr = (boolean[]) this.e;
                ga gaVar = f6Var.C;
                Bitmap bitmap = f6Var.a;
                if (bitmap != null && !bitmap.isRecycled()) {
                    f6Var.a.recycle();
                }
                Bitmap bitmap2 = bitmapArr[0];
                f6Var.a = bitmap2;
                if (o7Var3 != null && !o7Var3.c && o7Var3.K && bitmap2 != null) {
                    o7Var3.k0 = bitmap2.getWidth();
                    o7Var3.l0 = f6Var.a.getHeight();
                    o7Var3.A();
                }
                if (zArr[0] && o7Var3 != null && gaVar != null && f6Var.a != null) {
                    gaVar.e();
                    gaVar.f(o7Var3.b(f6Var.a, 0.2f), false);
                    g9 g9Var = f6Var.v;
                    if (g9Var != null) {
                        g9Var.run();
                    }
                }
                f6Var.r();
                f6Var.invalidate();
                return;
            case 18:
                a();
                return;
            case 19:
                CameraController.lambda$openRound$9((CameraSession) this.b, (Runnable) this.c, (SurfaceTexture) this.d, (Runnable) this.e);
                return;
            case 20:
                CameraController.lambda$close$5((Runnable) this.b, (CameraSession) this.c, (CountDownLatch) this.d, (Runnable) this.e);
                return;
            case 21:
                ((VideoAds) this.b).lambda$show$14((Context) this.c, (TLRPC.TL_sponsoredMessage) this.d, (j70) this.e);
                return;
            case 22:
                ((Utilities.Callback) this.b).run(org.telegram.ui.ActionBar.g6.Q0((File) this.c, (String) this.d, (String[]) this.e));
                return;
            case 23:
                TLObject tLObject6 = (TLObject) this.b;
                e6 e6Var = (e6) this.c;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) this.d;
                TLRPC.TL_theme tL_theme = (TLRPC.TL_theme) this.e;
                org.telegram.ui.ActionBar.g6.A--;
                if (tLObject6 instanceof TLRPC.TL_theme) {
                    TLRPC.TL_theme tL_theme2 = (TLRPC.TL_theme) tLObject6;
                    TLRPC.ThemeSettings themeSettings = tL_theme2.settings.size() > 0 ? tL_theme2.settings.get(0) : null;
                    if (e6Var == null || themeSettings == null) {
                        TLRPC.Document document2 = tL_theme2.document;
                        if (document2 != null && document2.id != tL_theme.document.id) {
                            if (e6Var != null) {
                                e6Var.r = tL_theme2;
                            } else {
                                f6Var2.B = tL_theme2;
                                f6Var2.C = false;
                                f6Var2.c0 = null;
                                f6Var2.d0 = null;
                                NotificationCenter.getInstance(f6Var2.A).addObserver(f6Var2, NotificationCenter.fileLoaded);
                                NotificationCenter.getInstance(f6Var2.A).addObserver(f6Var2, NotificationCenter.fileLoadFailed);
                                FileLoader fileLoader = FileLoader.getInstance(f6Var2.A);
                                TLRPC.TL_theme tL_theme3 = f6Var2.B;
                                fileLoader.loadFile(tL_theme3.document, tL_theme3, 1, 1);
                            }
                        }
                    } else {
                        if (org.telegram.ui.ActionBar.f6.a(e6Var, themeSettings)) {
                            z10 = false;
                        } else {
                            File d = e6Var.d();
                            if (d != null) {
                                d.delete();
                            }
                            org.telegram.ui.ActionBar.f6.i(e6Var, themeSettings);
                            org.telegram.ui.ActionBar.f6 f6Var3 = org.telegram.ui.ActionBar.g6.I;
                            if (f6Var3 == f6Var2 && f6Var3.U == e6Var.a) {
                                org.telegram.ui.ActionBar.g6.n1(false, false);
                                org.telegram.ui.ActionBar.g6.J(ApplicationLoader.applicationContext, false);
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                int i20 = NotificationCenter.needSetDayNightTheme;
                                org.telegram.ui.ActionBar.f6 f6Var4 = org.telegram.ui.ActionBar.g6.I;
                                globalInstance.lambda$postNotificationNameOnUIThread$1(i20, f6Var4, Boolean.valueOf(org.telegram.ui.ActionBar.g6.J == f6Var4), null, -1);
                            }
                            b6.a(true);
                            z10 = true;
                        }
                        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
                        e6Var.q = (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null || !wallPaperSettings.motion) ? false : true;
                        z11 = z10;
                    }
                    if (org.telegram.ui.ActionBar.g6.A != 0) {
                        org.telegram.ui.ActionBar.g6.B = (int) (System.currentTimeMillis() / 1000);
                        org.telegram.ui.ActionBar.g6.s1(z11, false);
                        return;
                    }
                    return;
                }
                z11 = false;
                if (org.telegram.ui.ActionBar.g6.A != 0) {
                }
                break;
            case 24:
                org.telegram.ui.o6 o6Var2 = (org.telegram.ui.o6) this.b;
                p6 p6Var = (p6) this.c;
                float[] fArr = (float[]) this.d;
                boolean[] zArr2 = (boolean[]) this.e;
                o6Var2.getClass();
                p6Var.a(fArr[0]);
                if (zArr2[0]) {
                    o6Var2.d.w0(true);
                    return;
                }
                return;
            case 25:
                org.telegram.ui.o6 o6Var3 = (org.telegram.ui.o6) this.b;
                boolean[] zArr3 = (boolean[]) this.c;
                long[] jArr = (long[]) this.d;
                n6 n6Var = (n6) this.e;
                if (zArr3[0]) {
                    return;
                }
                jArr[0] = System.currentTimeMillis();
                o6Var3.d.showDialog(n6Var);
                return;
            case 26:
                f8.U((f8) this.b, (TLRPC.TL_error) this.c, (TLObject) this.d, (Calendar) this.e);
                return;
            case 27:
                la.U((la) this.b, (c2) this.c, (TLRPC.TL_error) this.d, (TL_account.updateUsername) this.e);
                return;
            case 28:
                tn tnVar = (tn) this.b;
                o2 o2Var2 = (o2) this.c;
                MessageObject messageObject = (MessageObject) this.d;
                b5 b5Var = (b5) this.e;
                if (o2Var2 instanceof NotificationCenter.NotificationCenterDelegate) {
                    tnVar.getNotificationCenter().removeObserver((NotificationCenter.NotificationCenterDelegate) o2Var2, NotificationCenter.closeChats);
                }
                tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", messageObject.messageOwner.action.channel_id);
                ((ActionBarLayout) b5Var).c(b5Var.getFragmentStack().size() - 1, new tn(bundle));
                o2Var2.finishFragment();
                return;
            default:
                tn tnVar2 = (tn) this.b;
                ye.c cVar2 = (ye.c) this.c;
                TLObject tLObject7 = (TLObject) this.d;
                g2 g2Var = (g2) this.e;
                cVar2.b();
                if (tLObject7 instanceof TLRPC.TL_contacts_resolvedPeer) {
                    TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject7;
                    tnVar2.getMessagesController().putUsers(tL_contacts_resolvedPeer.users, false);
                    tnVar2.getMessagesController().putChats(tL_contacts_resolvedPeer.chats, false);
                    long peerDialogId = DialogObject.getPeerDialogId(tL_contacts_resolvedPeer.peer);
                    if (peerDialogId >= 0) {
                        user = tnVar2.getMessagesController().getUser(Long.valueOf(peerDialogId));
                    }
                }
                g2Var.run(user);
                return;
        }
    }

    public /* synthetic */ c(o7 o7Var, String str, int[][] iArr, Utilities.Callback callback) {
        this.a = 18;
        this.b = o7Var;
        this.d = str;
        this.c = iArr;
        this.e = callback;
    }
}
