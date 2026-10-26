package ai;

import a8.qd;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.car.app.IOnDoneCallback;
import bi.a2;
import bi.f2;
import bi.h2;
import bi.h7;
import bi.z5;
import di.a7;
import di.d4;
import di.h4;
import di.n4;
import di.p4;
import di.q4;
import di.v6;
import di.x9;
import di.z3;
import di.z6;
import fi.nb;
import fi.o6;
import fi.p9;
import fi.sb;
import fi.w7;
import hi.y1;
import java.io.File;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import jg.b2;
import jg.c2;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.SQLite.SQLitePreparedStatement;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLoader;
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
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.s6;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.aq0;
import org.telegram.ui.un;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ e0(v6 v6Var, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.a = 12;
        this.d = v6Var;
        this.e = tLObject;
        this.c = callback;
        this.b = tL_error;
    }

    private final void a() {
        int i10;
        long j10;
        int i11;
        long j11;
        long j12;
        ArrayList arrayList;
        w7 w7Var = (w7) this.d;
        String str = (String) this.e;
        int[][] iArr = (int[][]) this.b;
        Utilities.Callback callback = (Utilities.Callback) this.c;
        w7Var.getClass();
        VideoEditedInfo videoEditedInfo = new VideoEditedInfo();
        char c10 = 1;
        videoEditedInfo.isStory = true;
        videoEditedInfo.fromCamera = w7Var.c1;
        videoEditedInfo.originalWidth = w7Var.k0;
        videoEditedInfo.originalHeight = w7Var.l0;
        videoEditedInfo.resultWidth = w7Var.i0;
        videoEditedInfo.resultHeight = w7Var.j0;
        File file = w7Var.P0;
        videoEditedInfo.paintPath = file == null ? null : file.getPath();
        File file2 = w7Var.W0;
        videoEditedInfo.messagePath = file2 == null ? null : file2.getPath();
        File file3 = w7Var.X0;
        videoEditedInfo.messageVideoMaskPath = file3 == null ? null : file3.getPath();
        File file4 = w7Var.Y0;
        videoEditedInfo.backgroundPath = file4 == null ? null : file4.getPath();
        int extractRealEncoderBitrate = MediaController.extractRealEncoderBitrate(videoEditedInfo.resultWidth, videoEditedInfo.resultHeight, videoEditedInfo.bitrate, true);
        if (!w7Var.K || str == null || w7Var.v()) {
            File file5 = w7Var.Z0;
            if (file5 != null) {
                videoEditedInfo.originalPath = file5.getAbsolutePath();
            } else {
                videoEditedInfo.originalPath = str;
            }
            videoEditedInfo.isPhoto = true;
            videoEditedInfo.collage = w7Var.S;
            if (w7Var.v()) {
                int i12 = 0;
                boolean z10 = false;
                while (i12 < w7Var.T.size()) {
                    w7 w7Var2 = (w7) w7Var.T.get(i12);
                    if (w7Var2.K) {
                        w7Var2.k0 = Math.max(w7Var2.k0, iArr[i12][c10]);
                        w7Var2.l0 = Math.max(w7Var2.l0, iArr[i12][2]);
                        i11 = extractRealEncoderBitrate;
                        w7Var2.h0 = Math.max(w7Var2.h0, iArr[i12][4]);
                        z10 = true;
                    } else {
                        i11 = extractRealEncoderBitrate;
                    }
                    i12++;
                    extractRealEncoderBitrate = i11;
                    c10 = 1;
                }
                i10 = extractRealEncoderBitrate;
                ArrayList<VideoEditedInfo.Part> parts = VideoEditedInfo.Part.toParts(w7Var);
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
                        float f7 = part.duration;
                        float f10 = part.right;
                        float f11 = part.left;
                        long j15 = (long) ((f10 - f11) * f7);
                        w7Var.h0 = j15;
                        videoEditedInfo.originalDuration = j15;
                        videoEditedInfo.estimatedDuration = j15;
                        j10 = -(part.offset + ((long) (f11 * f7)));
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
                        videoEditedInfo.estimatedSize = (long) (((w7Var.h0 / 1000.0f) * i10) / 8.0f);
                        videoEditedInfo.filterState = null;
                    }
                } else {
                    long j16 = w7Var.S0;
                    w7Var.h0 = j16;
                    videoEditedInfo.originalDuration = j16;
                    videoEditedInfo.estimatedDuration = j16;
                }
            } else {
                i10 = extractRealEncoderBitrate;
                if (w7Var.o0 != null) {
                    long j17 = (long) ((w7Var.t0 - w7Var.s0) * w7Var.q0);
                    w7Var.h0 = j17;
                    videoEditedInfo.originalDuration = j17;
                    videoEditedInfo.estimatedDuration = j17;
                } else if (w7Var.y != null) {
                    long j18 = (long) ((w7Var.F - w7Var.E) * w7Var.C);
                    w7Var.h0 = j18;
                    videoEditedInfo.originalDuration = j18;
                    videoEditedInfo.estimatedDuration = j18;
                } else {
                    long j19 = w7Var.S0;
                    w7Var.h0 = j19;
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
            videoEditedInfo.estimatedSize = (long) (((w7Var.h0 / 1000.0f) * i10) / 8.0f);
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
            if (videoBitrate >= 1000000 || (arrayList = w7Var.T0) == null || arrayList.isEmpty()) {
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
            org.telegram.messenger.t.o(videoEditedInfo.bitrate, sb2);
            int i16 = iArr[0][4];
            long j20 = i16;
            w7Var.h0 = j20;
            videoEditedInfo.originalDuration = j20 * 1000;
            float f12 = j20;
            long j21 = ((long) (w7Var.Z * f12)) * 1000;
            videoEditedInfo.startTime = j21;
            long j22 = ((long) (w7Var.a0 * f12)) * 1000;
            videoEditedInfo.endTime = j22;
            videoEditedInfo.estimatedDuration = j22 - j21;
            videoEditedInfo.volume = w7Var.P;
            videoEditedInfo.muted = w7Var.Y;
            videoEditedInfo.estimatedSize = (long) a1.g.C(i16 / 1000.0f, extractRealEncoderBitrate, 8.0f, r2[5]);
            videoEditedInfo.estimatedSize = Math.max(w7Var.L.length(), videoEditedInfo.estimatedSize);
            videoEditedInfo.filterState = w7Var.a1;
            File file6 = w7Var.Q0;
            videoEditedInfo.blurPath = file6 == null ? null : file6.getPath();
            j10 = 0;
        }
        videoEditedInfo.account = w7Var.a;
        videoEditedInfo.wallpaperPeerId = w7Var.z0;
        videoEditedInfo.isDark = w7Var.y0;
        videoEditedInfo.avatarStartTime = -1L;
        MediaController.CropState cropState = w7Var.m0;
        if (cropState != null) {
            videoEditedInfo.cropState = cropState.clone();
        } else {
            videoEditedInfo.cropState = new MediaController.CropState();
        }
        videoEditedInfo.cropState.useMatrix = new Matrix();
        videoEditedInfo.cropState.useMatrix.set(w7Var.n0);
        videoEditedInfo.mediaEntities = w7Var.T0;
        videoEditedInfo.gradientTopColor = Integer.valueOf(w7Var.A0);
        videoEditedInfo.gradientBottomColor = Integer.valueOf(w7Var.B0);
        videoEditedInfo.forceFragmenting = true;
        videoEditedInfo.hdrInfo = w7Var.d1;
        videoEditedInfo.mixedSoundInfos.clear();
        if (w7Var.v() && !w7Var.Y) {
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
        File file7 = w7Var.o0;
        if (file7 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo2 = new MediaCodecVideoConvertor.MixedSoundInfo(file7.getAbsolutePath());
            mixedSoundInfo2.volume = w7Var.u0;
            float f15 = w7Var.s0;
            float f16 = w7Var.q0;
            long j23 = ((long) (f15 * f16)) * 1000;
            mixedSoundInfo2.audioOffset = j23;
            if (w7Var.K) {
                mixedSoundInfo2.startTime = ((long) (w7Var.r0 - (w7Var.Z * w7Var.h0))) * 1000;
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
            mixedSoundInfo2.duration = ((long) ((w7Var.t0 - f15) * f16)) * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo2);
        }
        String str2 = w7Var.y;
        if (str2 != null) {
            MediaCodecVideoConvertor.MixedSoundInfo mixedSoundInfo3 = new MediaCodecVideoConvertor.MixedSoundInfo(str2);
            mixedSoundInfo3.volume = w7Var.G;
            float f17 = w7Var.E;
            float f18 = w7Var.C;
            long j25 = ((long) (f17 * f18)) * 1000;
            mixedSoundInfo3.audioOffset = j25;
            if (w7Var.K) {
                mixedSoundInfo3.startTime = ((long) (w7Var.D - (w7Var.Z * w7Var.h0))) * 1000;
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
            mixedSoundInfo3.duration = ((long) ((w7Var.F - f17) * f18)) * 1000;
            videoEditedInfo.mixedSoundInfos.add(mixedSoundInfo3);
        }
        callback.run(videoEditedInfo);
    }

    private final void b() {
        com.google.firebase.messaging.q qVar = (com.google.firebase.messaging.q) this.d;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
        m4.i iVar = (m4.i) this.b;
        AtomicBoolean atomicBoolean2 = (AtomicBoolean) this.c;
        synchronized (qVar.a) {
            try {
                if (atomicBoolean.get()) {
                    atomicBoolean2.set(true);
                } else {
                    qVar.h(iVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02d6, code lost:
    
        if (r9 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:286:0x0644, code lost:
    
        if (r6 != null) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0646, code lost:
    
        r6.dispose();
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x065c, code lost:
    
        org.telegram.messenger.AndroidUtilities.runOnUIThread(new di.w6(r2, 2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:289:0x0665, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0659, code lost:
    
        if (r6 != null) goto L271;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0115  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        int i10;
        int i11;
        w7 w7Var;
        File file;
        ArrayList arrayList;
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        x9 x9Var;
        char c10;
        r2 U;
        SQLitePreparedStatement sQLitePreparedStatement;
        SQLitePreparedStatement sQLitePreparedStatement2;
        SQLiteCursor sQLiteCursor;
        SQLiteCursor sQLiteCursor2;
        Bitmap bitmap;
        Bundle bundle;
        f9.i0 i0Var;
        Integer num;
        Integer num2;
        Integer num3;
        Object[] objArr;
        Object[] objArr2;
        CharSequence charSequence;
        CharSequence charSequence2;
        CharSequence charSequence3;
        Bundle bundle2;
        CharSequence charSequence4;
        CharSequence charSequence5;
        char c11;
        CharSequence charSequence6;
        switch (this.a) {
            case 0:
                m71 m71Var = (m71) this.d;
                o0 o0Var = (o0) this.e;
                Utilities.CallbackReturn callbackReturn = (Utilities.CallbackReturn) this.b;
                Utilities.Callback callback = (Utilities.Callback) this.c;
                if (o0.d(m71Var.getParentActivity())) {
                    o0Var.e();
                    aq0 aq0Var = new aq0(10, false, false, null);
                    aq0Var.G = 1;
                    aq0Var.H = false;
                    aq0Var.x = false;
                    aq0Var.V = new k0(callbackReturn, m71Var, callback);
                    m71Var.presentFragment(aq0Var);
                    return;
                }
                return;
            case 1:
                String str2 = (String) this.d;
                Utilities.CallbackReturn callbackReturn2 = (Utilities.CallbackReturn) this.b;
                r2 r2Var = (r2) this.e;
                Utilities.Callback callback2 = (Utilities.Callback) this.c;
                try {
                    Point realScreenSize = AndroidUtilities.getRealScreenSize();
                    Bitmap loadBitmap = ImageLoader.loadBitmap(str2, null, realScreenSize.x, realScreenSize.y, true);
                    if (loadBitmap != null) {
                        str = o0.l(loadBitmap, callbackReturn2);
                        try {
                            loadBitmap.recycle();
                        } catch (Throwable th2) {
                            th = th2;
                            FileLog.e(th);
                            AndroidUtilities.runOnUIThread(new j0(r2Var, str, callback2));
                            return;
                        }
                    } else {
                        str = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    str = null;
                }
                AndroidUtilities.runOnUIThread(new j0(r2Var, str, callback2));
                return;
            case 2:
                androidx.lifecycle.o oVar = (androidx.lifecycle.o) this.d;
                IOnDoneCallback iOnDoneCallback = (IOnDoneCallback) this.e;
                String str3 = (String) this.b;
                androidx.car.app.utils.b bVar = (androidx.car.app.utils.b) this.c;
                if (oVar != null && ((androidx.lifecycle.v) oVar).c.compareTo(androidx.lifecycle.n.c) >= 0) {
                    androidx.car.app.utils.h.b(iOnDoneCallback, str3, bVar);
                    return;
                }
                androidx.car.app.utils.h.f(iOnDoneCallback, str3, new IllegalStateException("Lifecycle is not at least created when dispatching " + bVar));
                return;
            case 3:
                bi.x xVar = (bi.x) this.d;
                TLObject tLObject = (TLObject) this.e;
                String str4 = (String) this.b;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) this.c;
                a3.d dVar = xVar.n;
                bi.y yVar = xVar.r;
                if (yVar.O) {
                    return;
                }
                xVar.e = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    i10 = ((r2) yVar).currentAccount;
                    MessagesController.getInstance(i10).putUsers(starsStatus.users, false);
                    i11 = ((r2) yVar).currentAccount;
                    MessagesController.getInstance(i11).putChats(starsStatus.chats, false);
                    boolean z10 = ((starsStatus.flags & 1) == 0 || starsStatus.next_offset == null) ? false : true;
                    if (z10 && TextUtils.equals(str4, starsStatus.next_offset)) {
                        xVar.h = true;
                    } else {
                        xVar.b.addAll(starsStatus.history);
                        xVar.d = starsStatus.next_offset;
                        xVar.f = !z10;
                    }
                } else {
                    xVar.h = true;
                    if (tL_error != null) {
                        wc.e0(tL_error);
                    }
                }
                xVar.c.g3.O(false);
                xVar.removeCallbacks(dVar);
                xVar.post(dVar);
                return;
            case 4:
                r2 r2Var2 = (r2) this.d;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) this.e;
                qf.c cVar = (qf.c) this.b;
                e2 e2Var = (e2) this.c;
                if (r2Var2 != null && tL_error2 != null) {
                    wc.b0(r2Var2).g0(tL_error2, false);
                }
                if ((r2Var2 instanceof un) && tL_error2 == null) {
                    ((un) r2Var2).kc();
                }
                cVar.b();
                e2Var.dismiss();
                return;
            case 5:
                h7.i1((h7) this.d, (boolean[]) this.e, (TL_stars.StarGiftAttribute) this.b, (yc[]) this.c);
                return;
            case 6:
                h7.S0((h7) this.d, (MessageObject) this.e, (ArrayList) this.b, (TL_stars.StarGift) this.c);
                return;
            case 7:
                h7.l1((h7) this.d, (TLObject) this.e, (a3.l0) this.b, (TLRPC.TL_error) this.c);
                return;
            case 8:
                h7 h7Var = (h7) this.d;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) this.e;
                TLObject tLObject2 = (TLObject) this.b;
                TL_stars.InputSavedStarGift inputSavedStarGift = (TL_stars.InputSavedStarGift) this.c;
                if (tL_error3 != null || !(tLObject2 instanceof TLRPC.Updates)) {
                    h7Var.getBulletinFactory().g0(tL_error3, false);
                    return;
                }
                h7Var.r0 = true;
                h7Var.s1 = null;
                h7Var.J1(inputSavedStarGift, (TLRPC.Updates) tLObject2, new a2(h7Var, 9));
                Utilities.stageQueue.postRunnable(new f2(3, h7Var, tLObject2));
                return;
            case 9:
                z5 z5Var = (z5) this.d;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.e;
                ArrayList arrayList2 = (ArrayList) this.b;
                Runnable runnable = (Runnable) this.c;
                s6 s6Var = z5Var.H;
                z5Var.h0 = false;
                if (starGift != null) {
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
                ak0 ak0Var = z5Var.l0;
                if (ak0Var != null) {
                    ak0Var.d();
                    AndroidUtilities.runOnUIThread(new ag.c(4), 750L);
                }
                z5Var.Q.animate().alpha(0.0f).start();
                z5Var.S.animate().alpha(1.0f).start();
                z5Var.G.animate().alpha(1.0f).start();
                z5Var.R.animate().alpha(0.0f).start();
                z5Var.P.animate().alpha(1.0f).start();
                z5Var.M.setText(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftFailedText", arrayList2.size(), new Object[0])));
                s6Var.setText(LocaleController.getString(R.string.GiftCraftButtonFailed));
                s6Var.setTranslationY(AndroidUtilities.dp(6.0f));
                z5Var.I.setAlpha(0.0f);
                if (z5Var.O != null) {
                    int i12 = 0;
                    while (true) {
                        zh.g1[] g1VarArr = z5Var.O;
                        if (i12 < g1VarArr.length) {
                            AndroidUtilities.removeFromParent(g1VarArr[i12]);
                            i12++;
                        } else {
                            z5Var.O = null;
                        }
                    }
                }
                z5Var.O = new zh.g1[arrayList2.size()];
                int i13 = 0;
                while (i13 < arrayList2.size()) {
                    TL_stars.StarGift starGift2 = (TL_stars.StarGift) arrayList2.get(i13);
                    zh.g1 g1Var = new zh.g1(z5Var.getContext(), z5Var.W, z5Var.a);
                    g1Var.h(starGift2, false, false, false, false, true);
                    g1Var.x.setVisibility(8);
                    g1Var.setRibbonColor(-3065286);
                    y9 y9Var = g1Var.y;
                    FrameLayout.LayoutParams i14 = gb1.i(42, 42, 17);
                    g1Var.E = i14;
                    y9Var.setLayoutParams(i14);
                    int i15 = i13 + 1;
                    boolean z11 = i15 >= arrayList2.size();
                    LinearLayout linearLayout = z5Var.N;
                    z5Var.O[i13] = g1Var;
                    linearLayout.addView(g1Var, gb1.t(74, 74, 0.0f, 51, 0, 0, z11 ? 0 : 6, 0));
                    i13 = i15;
                }
                return;
            case 10:
                h4 h4Var = (h4) this.d;
                TLObject tLObject3 = (TLObject) this.e;
                TL_stories.StoryItem storyItem2 = (TL_stories.StoryItem) this.b;
                Utilities.Callback callback3 = (Utilities.Callback) this.c;
                q4 q4Var = h4Var.l;
                if (tLObject3 instanceof TL_stories.TL_stories_stories) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    MessagesController.getInstance(q4Var.r2).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(q4Var.r2).putChats(tL_stories_stories.chats, false);
                    for (int i16 = 0; i16 < tL_stories_stories.stories.size(); i16++) {
                        if (tL_stories_stories.stories.get(i16).id == storyItem2.id) {
                            callback3.run(tL_stories_stories.stories.get(i16).media.document);
                            return;
                        }
                    }
                }
                callback3.run(null);
                return;
            case 11:
                h4 h4Var2 = (h4) this.d;
                Activity activity = (Activity) this.e;
                di.y9 y9Var2 = (di.y9) this.b;
                n4 n4Var = (n4) this.c;
                sb D = sb.D(activity, h4Var2.l.r2);
                p4 p4Var = h4Var2.l.B2;
                long j10 = (p4Var == null || (x9Var = (x9) p4Var.c) == null) ? 0L : x9Var.currentPosition;
                fi.a1 a1Var = MessagesController.getInstance(h4Var2.l.r2).getStoriesController().w;
                TL_stories.StoryItem storyItem3 = h4Var2.l.D1.a;
                long j11 = storyItem3.dialogId;
                ArrayList arrayList3 = a1Var.b;
                int size = arrayList3.size();
                int i17 = 0;
                while (i17 < size) {
                    Object obj = arrayList3.get(i17);
                    i17++;
                    w7 w7Var2 = (w7) obj;
                    if (w7Var2.g && storyItem3.id == w7Var2.f && j11 == w7Var2.e) {
                        TLRPC.MessageMedia messageMedia = storyItem3.media;
                        TLRPC.Document document = messageMedia.document;
                        arrayList = arrayList3;
                        storyItem = storyItem3;
                        if ((document == null || document.id == w7Var2.H) && ((photo = messageMedia.photo) == null || photo.id == w7Var2.I)) {
                            w7Var2.h = true;
                            w7Var = w7Var2;
                            if (w7Var != null || w7Var.u || (file = w7Var.L) == null || !file.exists()) {
                                w7Var = w7.n(h4Var2.l.D1.h(), h4Var2.l.D1.a);
                                w7Var.e = h4Var2.l.q1;
                            }
                            w7 g7 = w7Var.g();
                            if (h4Var2.l.G0()) {
                                q4 q4Var2 = h4Var2.l;
                                g7.J0 = q4Var2.q1;
                                g7.L0 = MessagesController.toInputMedia(q4Var2.D1.a.media);
                                z6 z6Var = y9Var2.O0;
                                if (z6Var instanceof di.s6) {
                                    g7.K0 = ((di.s6) z6Var).E;
                                }
                            }
                            D.R(nb.d(y9Var2), g7, j10);
                            D.Q = new z3(h4Var2, 3);
                            D.R = new d4(h4Var2, n4Var, 1);
                            return;
                        }
                    } else {
                        arrayList = arrayList3;
                        storyItem = storyItem3;
                    }
                    storyItem3 = storyItem;
                    arrayList3 = arrayList;
                }
                w7Var = null;
                if (w7Var != null) {
                }
                w7Var = w7.n(h4Var2.l.D1.h(), h4Var2.l.D1.a);
                w7Var.e = h4Var2.l.q1;
                w7 g72 = w7Var.g();
                if (h4Var2.l.G0()) {
                }
                D.R(nb.d(y9Var2), g72, j10);
                D.Q = new z3(h4Var2, 3);
                D.R = new d4(h4Var2, n4Var, 1);
                return;
            case 12:
                v6 v6Var = (v6) this.d;
                TLObject tLObject4 = (TLObject) this.e;
                Utilities.Callback callback4 = (Utilities.Callback) this.c;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) this.b;
                v6Var.i = false;
                if (tLObject4 instanceof TL_stories.TL_storyAlbum) {
                    a7 a2 = a7.a((TL_stories.TL_storyAlbum) tLObject4);
                    v6Var.h.add(a2);
                    v6Var.f(true);
                    if (callback4 != null) {
                        callback4.run(a2);
                        return;
                    }
                    return;
                }
                if (tL_error4 == null || (U = LaunchActivity.U()) == null) {
                    c10 = 0;
                } else {
                    c10 = 0;
                    wc.b0(U).g0(tL_error4, false);
                }
                NotificationCenter notificationCenter = NotificationCenter.getInstance(v6Var.a);
                int i18 = NotificationCenter.storyAlbumsCollectionsUpdate;
                Object[] objArr3 = new Object[2];
                objArr3[c10] = Long.valueOf(v6Var.b);
                objArr3[1] = v6Var;
                notificationCenter.lambda$postNotificationNameOnUIThread$1(i18, objArr3);
                return;
            case 13:
                z6 z6Var2 = (z6) this.d;
                ArrayList arrayList4 = (ArrayList) this.e;
                MessagesStorage messagesStorage = (MessagesStorage) this.b;
                ArrayList arrayList5 = (ArrayList) this.c;
                int i19 = z6Var2.f;
                StringBuilder sb2 = new StringBuilder("StoriesList ");
                int i20 = z6Var2.e;
                sb2.append(i20);
                sb2.append("{");
                long j12 = z6Var2.d;
                sb2.append(j12);
                sb2.append("} saveCache {");
                sb2.append(di.h7.a(arrayList4));
                ic.a.w("}", sb2);
                try {
                    SQLiteDatabase database = messagesStorage.getDatabase();
                    SQLitePreparedStatement executeFast = database.executeFast("REPLACE INTO profile_stories VALUES(?, ?, ?, ?, ?, ?)");
                    try {
                        Locale locale = Locale.US;
                        database.executeFast("DELETE FROM profile_stories_albums_links WHERE dialog_id = " + j12 + " AND album_id = " + i19).stepThis().dispose();
                        sQLitePreparedStatement = database.executeFast("REPLACE INTO profile_stories_albums_links VALUES(?, ?, ?, ?)");
                        for (int i21 = 0; i21 < arrayList4.size(); i21++) {
                            try {
                                TL_stories.StoryItem storyItem4 = ((MessageObject) arrayList4.get(i21)).storyItem;
                                if (storyItem4 != null) {
                                    NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(storyItem4.getObjectSize());
                                    storyItem4.serializeToStream(nativeByteBuffer);
                                    executeFast.requery();
                                    executeFast.bindLong(1, j12);
                                    executeFast.bindInteger(2, storyItem4.id);
                                    executeFast.bindByteBuffer(3, nativeByteBuffer);
                                    executeFast.bindInteger(4, i20);
                                    executeFast.bindInteger(5, z6Var2.m.contains(Integer.valueOf(storyItem4.id)) ? 1 : 0);
                                    executeFast.bindInteger(6, arrayList5.indexOf(Integer.valueOf(storyItem4.id)) + 1);
                                    executeFast.step();
                                    nativeByteBuffer.reuse();
                                    sQLitePreparedStatement.requery();
                                    sQLitePreparedStatement.bindLong(1, j12);
                                    sQLitePreparedStatement.bindInteger(2, i19);
                                    sQLitePreparedStatement.bindInteger(3, storyItem4.id);
                                    sQLitePreparedStatement.bindInteger(4, i21);
                                    sQLitePreparedStatement.step();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                sQLitePreparedStatement2 = executeFast;
                                try {
                                    messagesStorage.checkSQLException(th);
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                        break;
                                    }
                                } catch (Throwable th5) {
                                    if (sQLitePreparedStatement2 != null) {
                                        sQLitePreparedStatement2.dispose();
                                    }
                                    if (sQLitePreparedStatement != null) {
                                        sQLitePreparedStatement.dispose();
                                    }
                                    throw th5;
                                }
                            }
                        }
                        if (executeFast != null) {
                            executeFast.dispose();
                            break;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        sQLitePreparedStatement2 = executeFast;
                        sQLitePreparedStatement = null;
                    }
                } catch (Throwable th7) {
                    th = th7;
                    sQLitePreparedStatement = null;
                    sQLitePreparedStatement2 = null;
                }
                break;
            case 14:
                o6 o6Var = (o6) this.d;
                Bitmap[] bitmapArr = (Bitmap[]) this.e;
                w7 w7Var3 = (w7) this.b;
                boolean[] zArr = (boolean[]) this.c;
                la laVar = o6Var.G;
                Bitmap bitmap2 = o6Var.a;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    o6Var.a.recycle();
                }
                Bitmap bitmap3 = bitmapArr[0];
                o6Var.a = bitmap3;
                if (w7Var3 != null && !w7Var3.c && w7Var3.K && bitmap3 != null) {
                    w7Var3.k0 = bitmap3.getWidth();
                    w7Var3.l0 = o6Var.a.getHeight();
                    w7Var3.A();
                }
                if (zArr[0] && w7Var3 != null && laVar != null && o6Var.a != null) {
                    laVar.e();
                    laVar.f(w7Var3.b(o6Var.a, 0.2f), false);
                    p9 p9Var = o6Var.v;
                    if (p9Var != null) {
                        p9Var.run();
                    }
                }
                o6Var.r();
                o6Var.invalidate();
                return;
            case 15:
                a();
                return;
            case 16:
                fi.d dVar2 = (fi.d) this.d;
                TLObject tLObject5 = (TLObject) this.e;
                k3 k3Var = (k3) this.b;
                y1 y1Var = (y1) this.c;
                dVar2.setLoading(false);
                if (tLObject5 instanceof TLRPC.TL_boolTrue) {
                    k3Var.dismiss();
                    y1Var.run(Boolean.FALSE);
                    return;
                }
                return;
            case 17:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) this.d;
                k3 k3Var2 = (k3) this.e;
                u6 u6Var = (u6) this.b;
                TLRPC.User user = (TLRPC.User) this.c;
                AndroidUtilities.addToClipboard(connectedbotstarref.url);
                new wc(k3Var2.topBulletinContainer, u6Var).M(LocaleController.getString(R.string.AffiliateProgramLinkCopiedTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.AffiliateProgramLinkCopiedText, hi.k.F0(connectedbotstarref.commission_permille), UserObject.getUserName(user))), R.raw.copy).j();
                return;
            case 18:
                hi.d4.w0((hi.d4) this.d, (Context) this.e, (TLRPC.User) this.b, (TL_payments.connectedBotStarRef) this.c);
                return;
            case 19:
                TLObject tLObject6 = (TLObject) this.d;
                boolean[] zArr2 = (boolean[]) this.e;
                org.telegram.ui.web.r rVar = (org.telegram.ui.web.r) this.b;
                TLRPC.UserFull userFull = (TLRPC.UserFull) this.c;
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
            case 20:
                ig.c cVar2 = (ig.c) this.d;
                Location location = (Location) this.e;
                String str5 = (String) this.b;
                ArrayList arrayList6 = (ArrayList) this.c;
                ArrayList arrayList7 = cVar2.r;
                cVar2.n = false;
                if (location == null) {
                    cVar2.F = 0;
                    cVar2.h = false;
                    cVar2.s.clear();
                    cVar2.J = false;
                    cVar2.x = str5;
                }
                arrayList7.clear();
                arrayList7.addAll(arrayList6);
                cVar2.l();
                return;
            case 21:
                ig.c cVar3 = (ig.c) this.d;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) this.e;
                String str6 = (String) this.b;
                TLObject tLObject7 = (TLObject) this.c;
                ArrayList arrayList8 = cVar3.s;
                if (tL_error5 == null) {
                    cVar3.F = 0;
                    cVar3.h = false;
                    arrayList8.clear();
                    cVar3.J = false;
                    cVar3.x = str6;
                    TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject7;
                    int size2 = messages_botresults.results.size();
                    for (int i22 = 0; i22 < size2; i22++) {
                        TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i22);
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
                                arrayList8.add(tL_messageMediaVenue);
                            }
                        }
                    }
                }
                ig.b bVar2 = cVar3.y;
                if (bVar2 != null) {
                    bVar2.a(arrayList8);
                }
                cVar3.l();
                return;
            case 22:
                ig.n nVar = (ig.n) this.d;
                Runnable runnable2 = (Runnable) this.e;
                ArrayList arrayList9 = (ArrayList) this.b;
                m4.d dVar3 = (m4.d) this.c;
                if (nVar.Z) {
                    nVar.Z = false;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                    nVar.M = arrayList9;
                    dVar3.c(nVar);
                    if (nVar.a0) {
                        nVar.a0 = false;
                        nVar.X(runnable2);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                AndroidUtilities.runOnUIThread(new e0((ig.n) this.d, (Runnable) this.b, (ArrayList) this.c, s4.p.c((ig.h) this.e, true), 22));
                return;
            case 24:
                jg.z zVar = (jg.z) this.d;
                TLObject tLObject8 = (TLObject) this.e;
                TL_account.TL_businessChatLink tL_businessChatLink = (TL_account.TL_businessChatLink) this.b;
                Runnable runnable3 = (Runnable) this.c;
                ArrayList arrayList10 = zVar.b;
                if (tLObject8 instanceof TL_account.TL_businessChatLink) {
                    TL_account.TL_businessChatLink tL_businessChatLink2 = (TL_account.TL_businessChatLink) tLObject8;
                    int indexOf = arrayList10.indexOf(tL_businessChatLink);
                    if (indexOf != -1) {
                        arrayList10.set(indexOf, tL_businessChatLink2);
                        NotificationCenter.getInstance(zVar.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.businessLinksUpdated, new Object[0]);
                        if (runnable3 != null) {
                            runnable3.run();
                        }
                        zVar.f();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                int i23 = 0;
                c2 c2Var = (c2) this.d;
                MessagesStorage messagesStorage2 = (MessagesStorage) this.e;
                b2 b2Var = (b2) this.b;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages = (TLRPC.TL_messages_sendQuickReplyMessages) this.c;
                ArrayList arrayList11 = new ArrayList();
                try {
                    try {
                        sQLiteCursor2 = messagesStorage2.getDatabase().queryFinalized("SELECT id FROM quick_replies_messages WHERE topic_id = ?", Integer.valueOf(b2Var.a));
                        while (sQLiteCursor2.next()) {
                            try {
                                arrayList11.add(Integer.valueOf(sQLiteCursor2.intValue(i23)));
                                i23 = 0;
                            } catch (Exception e) {
                                e = e;
                                FileLog.e(e);
                                break;
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        if (0 != 0) {
                            sQLiteCursor.dispose();
                        }
                        throw th;
                    }
                } catch (Exception e10) {
                    e = e10;
                    sQLiteCursor2 = null;
                } catch (Throwable th9) {
                    th = th9;
                    sQLiteCursor = null;
                    if (0 != 0) {
                    }
                    throw th;
                }
                sQLiteCursor2.dispose();
                AndroidUtilities.runOnUIThread(new e0(c2Var, arrayList11, b2Var, tL_messages_sendQuickReplyMessages, 26));
                return;
            case 26:
                c2 c2Var2 = (c2) this.d;
                ArrayList<Integer> arrayList12 = (ArrayList) this.e;
                b2 b2Var2 = (b2) this.b;
                TLRPC.TL_messages_sendQuickReplyMessages tL_messages_sendQuickReplyMessages2 = (TLRPC.TL_messages_sendQuickReplyMessages) this.c;
                int i24 = c2Var2.a;
                if (arrayList12.isEmpty() || arrayList12.size() < b2Var2.a()) {
                    TLRPC.TL_messages_getQuickReplyMessages tL_messages_getQuickReplyMessages = new TLRPC.TL_messages_getQuickReplyMessages();
                    tL_messages_getQuickReplyMessages.shortcut_id = b2Var2.a;
                    ConnectionsManager.getInstance(i24).sendRequest(tL_messages_getQuickReplyMessages, new h2(c2Var2, arrayList12, tL_messages_sendQuickReplyMessages2, 11));
                    return;
                } else {
                    tL_messages_sendQuickReplyMessages2.id = arrayList12;
                    for (int i25 = 0; i25 < arrayList12.size(); i25++) {
                        tL_messages_sendQuickReplyMessages2.random_id.add(Long.valueOf(Utilities.random.nextLong()));
                    }
                    ConnectionsManager.getInstance(i24).sendRequest(tL_messages_sendQuickReplyMessages2, null);
                    return;
                }
            case 27:
                li.q qVar = (li.q) this.d;
                li.a aVar = (li.a) this.e;
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) this.b;
                k80 k80Var = (k80) this.c;
                qVar.r.b5(aVar, pageBlock);
                k80Var.u();
                return;
            case 28:
                b();
                return;
            default:
                m4.n0 n0Var = (m4.n0) this.d;
                AtomicInteger atomicInteger = (AtomicInteger) this.e;
                ArrayList arrayList13 = (ArrayList) this.b;
                ArrayList arrayList14 = (ArrayList) this.c;
                if (atomicInteger.incrementAndGet() == arrayList13.size()) {
                    ArrayList arrayList15 = new ArrayList();
                    int i26 = 0;
                    while (i26 < arrayList14.size()) {
                        k9.y yVar2 = (k9.y) arrayList14.get(i26);
                        if (yVar2 != null) {
                            try {
                                bitmap = (Bitmap) qd.a(yVar2);
                            } catch (CancellationException | ExecutionException e11) {
                                synchronized (e2.a.b) {
                                    Log.d("MediaSessionLegacyStub", e2.a.a("Failed to get bitmap", e11));
                                }
                            }
                            b2.p0 p0Var = (b2.p0) arrayList13.get(i26);
                            int i27 = m4.o.a;
                            String str7 = !p0Var.a.equals("") ? null : p0Var.a;
                            b2.s0 s0Var = p0Var.d;
                            Bitmap bitmap4 = bitmap == null ? bitmap : null;
                            bundle = s0Var.J;
                            CharSequence charSequence7 = s0Var.a;
                            CharSequence charSequence8 = s0Var.g;
                            CharSequence charSequence9 = s0Var.f;
                            i0Var = s0Var.K;
                            num = s0Var.I;
                            num2 = s0Var.q;
                            if (bundle != null) {
                                bundle = new Bundle(bundle);
                            }
                            if (num2 == null) {
                                num3 = num2;
                                if (num2.intValue() != -1) {
                                    objArr = true;
                                    Object[] objArr4 = num != null;
                                    if (!objArr == true || objArr4 == true) {
                                        if (bundle == null) {
                                            bundle = new Bundle();
                                        }
                                        if (objArr == true) {
                                            num3.getClass();
                                            objArr2 = objArr4;
                                            charSequence = charSequence8;
                                            bundle.putLong("android.media.extra.BT_FOLDER_TYPE", m4.o.a(num3.intValue()));
                                        } else {
                                            objArr2 = objArr4;
                                            charSequence = charSequence8;
                                        }
                                        if (objArr2 != false) {
                                            num.getClass();
                                            bundle.putLong("androidx.media3.session.EXTRAS_KEY_MEDIA_TYPE_COMPAT", num.intValue());
                                        }
                                    } else {
                                        charSequence = charSequence8;
                                    }
                                    if (!i0Var.isEmpty()) {
                                        if (bundle == null) {
                                            bundle = new Bundle();
                                        }
                                        bundle.putStringArrayList("androidx.media.utils.extras.CUSTOM_BROWSER_ACTION_ID_LIST", new ArrayList<>(i0Var));
                                    }
                                    charSequence2 = s0Var.e;
                                    if (charSequence2 != null) {
                                        if (bundle == null) {
                                            bundle = new Bundle();
                                        }
                                        bundle.putCharSequence("androidx.media3.mediadescriptioncompat.title", charSequence7);
                                        charSequence3 = charSequence;
                                        bundle2 = bundle;
                                        charSequence5 = charSequence9;
                                        charSequence4 = charSequence2;
                                    } else {
                                        CharSequence[] charSequenceArr = new CharSequence[3];
                                        int i28 = 0;
                                        int i29 = 0;
                                        for (int i30 = 3; i28 < i30; i30 = 3) {
                                            String[] strArr = n4.i.d;
                                            if (i29 < strArr.length) {
                                                int i31 = i29 + 1;
                                                String str8 = strArr[i29];
                                                str8.getClass();
                                                switch (str8.hashCode()) {
                                                    case -1853648227:
                                                        if (str8.equals("android.media.metadata.ARTIST")) {
                                                            c11 = 0;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case -1850878751:
                                                        if (str8.equals("android.media.metadata.AUTHOR")) {
                                                            c11 = 1;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case -1224124471:
                                                        if (str8.equals("android.media.metadata.WRITER")) {
                                                            c11 = 2;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 194702059:
                                                        if (str8.equals("android.media.metadata.DISPLAY_SUBTITLE")) {
                                                            c11 = 3;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 1058837545:
                                                        if (str8.equals("android.media.metadata.DISPLAY_DESCRIPTION")) {
                                                            c11 = 4;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 1684534006:
                                                        if (str8.equals("android.media.metadata.COMPOSER")) {
                                                            c11 = 5;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 1879671865:
                                                        if (str8.equals("android.media.metadata.ALBUM")) {
                                                            c11 = 6;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 1897146402:
                                                        if (str8.equals("android.media.metadata.TITLE")) {
                                                            c11 = 7;
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    case 1965214221:
                                                        if (str8.equals("android.media.metadata.ALBUM_ARTIST")) {
                                                            c11 = '\b';
                                                            break;
                                                        }
                                                        c11 = 65535;
                                                        break;
                                                    default:
                                                        c11 = 65535;
                                                        break;
                                                }
                                                switch (c11) {
                                                    case 0:
                                                        charSequence6 = s0Var.b;
                                                        break;
                                                    case 1:
                                                    default:
                                                        charSequence6 = null;
                                                        break;
                                                    case 2:
                                                        charSequence6 = s0Var.A;
                                                        break;
                                                    case 3:
                                                        charSequence6 = charSequence9;
                                                        break;
                                                    case 4:
                                                        charSequence6 = charSequence;
                                                        break;
                                                    case 5:
                                                        charSequence6 = s0Var.B;
                                                        break;
                                                    case 6:
                                                        charSequence6 = s0Var.c;
                                                        break;
                                                    case 7:
                                                        charSequence6 = charSequence7;
                                                        break;
                                                    case '\b':
                                                        charSequence6 = s0Var.d;
                                                        break;
                                                }
                                                if (!TextUtils.isEmpty(charSequence6)) {
                                                    charSequenceArr[i28] = charSequence6;
                                                    i28++;
                                                }
                                                i29 = i31;
                                            } else {
                                                CharSequence charSequence10 = charSequenceArr[0];
                                                CharSequence charSequence11 = charSequenceArr[1];
                                                charSequence3 = charSequenceArr[2];
                                                bundle2 = bundle;
                                                charSequence4 = charSequence10;
                                                charSequence5 = charSequence11;
                                            }
                                        }
                                        CharSequence charSequence102 = charSequenceArr[0];
                                        CharSequence charSequence112 = charSequenceArr[1];
                                        charSequence3 = charSequenceArr[2];
                                        bundle2 = bundle;
                                        charSequence4 = charSequence102;
                                        charSequence5 = charSequence112;
                                    }
                                    arrayList15.add(new n4.q(new n4.h(str7, charSequence4, charSequence5, charSequence3, bitmap4, s0Var.n, bundle2, p0Var.f.a), i26 == -1 ? -1L : i26));
                                    i26++;
                                }
                            } else {
                                num3 = num2;
                            }
                            objArr = false;
                            if (num != null) {
                            }
                            if (objArr == true) {
                            }
                            if (bundle == null) {
                            }
                            if (objArr == true) {
                            }
                            if (objArr2 != false) {
                            }
                            if (!i0Var.isEmpty()) {
                            }
                            charSequence2 = s0Var.e;
                            if (charSequence2 != null) {
                            }
                            arrayList15.add(new n4.q(new n4.h(str7, charSequence4, charSequence5, charSequence3, bitmap4, s0Var.n, bundle2, p0Var.f.a), i26 == -1 ? -1L : i26));
                            i26++;
                        }
                        bitmap = null;
                        b2.p0 p0Var2 = (b2.p0) arrayList13.get(i26);
                        int i272 = m4.o.a;
                        if (!p0Var2.a.equals("")) {
                        }
                        b2.s0 s0Var2 = p0Var2.d;
                        if (bitmap == null) {
                        }
                        bundle = s0Var2.J;
                        CharSequence charSequence72 = s0Var2.a;
                        CharSequence charSequence82 = s0Var2.g;
                        CharSequence charSequence92 = s0Var2.f;
                        i0Var = s0Var2.K;
                        num = s0Var2.I;
                        num2 = s0Var2.q;
                        if (bundle != null) {
                        }
                        if (num2 == null) {
                        }
                        objArr = false;
                        if (num != null) {
                        }
                        if (objArr == true) {
                        }
                        if (bundle == null) {
                        }
                        if (objArr == true) {
                        }
                        if (objArr2 != false) {
                        }
                        if (!i0Var.isEmpty()) {
                        }
                        charSequence2 = s0Var2.e;
                        if (charSequence2 != null) {
                        }
                        arrayList15.add(new n4.q(new n4.h(str7, charSequence4, charSequence5, charSequence3, bitmap4, s0Var2.n, bundle2, p0Var2.f.a), i26 == -1 ? -1L : i26));
                        i26++;
                    }
                    m4.p0.D(((m4.p0) n0Var.e).m, arrayList15);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.a = i10;
        this.d = obj;
        this.e = obj2;
        this.b = obj3;
        this.c = obj4;
    }

    public /* synthetic */ e0(String str, Utilities.CallbackReturn callbackReturn, r2 r2Var, Utilities.Callback callback) {
        this.a = 1;
        this.d = str;
        this.b = callbackReturn;
        this.e = r2Var;
        this.c = callback;
    }
}
