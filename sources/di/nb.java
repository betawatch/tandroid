package di;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final /* synthetic */ class nb implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nb(i2.c0 c0Var, SurfaceTexture surfaceTexture) {
        this.a = 25;
        this.b = c0Var;
    }

    private final void a() {
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.b;
        y2.e eVar = (y2.e) tVar.a.get();
        if (eVar != null) {
            int b10 = tVar.c.b();
            y2.f fVar = eVar.a;
            synchronized (fVar) {
                synchronized (fVar) {
                    int i10 = fVar.n;
                    if (i10 == 0 || fVar.e) {
                        if (i10 != b10 || fVar.o == null) {
                            fVar.n = b10;
                            if (b10 != 1 && b10 != 0 && b10 != 8) {
                                if (fVar.o == null) {
                                    Context context = fVar.a;
                                    String str = e2.d0.a;
                                    if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (!TextUtils.isEmpty(networkCountryIso)) {
                                            c10 = v7.r6.c(networkCountryIso);
                                            fVar.o = c10;
                                        }
                                    }
                                    c10 = v7.r6.c(Locale.getDefault().getCountry());
                                    fVar.o = c10;
                                }
                                fVar.l = fVar.a(b10);
                                fVar.d.getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                fVar.c(fVar.g > 0 ? (int) (elapsedRealtime - fVar.h) : 0, fVar.i, fVar.l);
                                fVar.h = elapsedRealtime;
                                fVar.i = 0L;
                                fVar.k = 0L;
                                fVar.j = 0L;
                                y2.r rVar = fVar.f;
                                rVar.a.clear();
                                rVar.c = -1;
                                rVar.d = 0;
                                rVar.e = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x02f7 A[Catch: Exception -> 0x02c8, TryCatch #1 {Exception -> 0x02c8, blocks: (B:109:0x0250, B:113:0x0279, B:114:0x0295, B:116:0x02a3, B:118:0x02af, B:121:0x02f7, B:122:0x02fe, B:127:0x030b, B:129:0x0311, B:132:0x0317, B:134:0x031d, B:136:0x032f, B:138:0x033a, B:140:0x034e, B:145:0x0366, B:147:0x0373, B:153:0x033e, B:156:0x0381, B:159:0x0398, B:188:0x0394, B:163:0x03a0, B:164:0x03a2, B:175:0x03b9, B:170:0x03ae, B:185:0x03c6, B:191:0x02cb, B:166:0x03a3, B:179:0x03a7, B:168:0x03ab), top: B:108:0x0250, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x030b A[Catch: Exception -> 0x02c8, TryCatch #1 {Exception -> 0x02c8, blocks: (B:109:0x0250, B:113:0x0279, B:114:0x0295, B:116:0x02a3, B:118:0x02af, B:121:0x02f7, B:122:0x02fe, B:127:0x030b, B:129:0x0311, B:132:0x0317, B:134:0x031d, B:136:0x032f, B:138:0x033a, B:140:0x034e, B:145:0x0366, B:147:0x0373, B:153:0x033e, B:156:0x0381, B:159:0x0398, B:188:0x0394, B:163:0x03a0, B:164:0x03a2, B:175:0x03b9, B:170:0x03ae, B:185:0x03c6, B:191:0x02cb, B:166:0x03a3, B:179:0x03a7, B:168:0x03ab), top: B:108:0x0250, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0391  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MediaCodec.BufferInfo bufferInfo;
        long j3;
        int i10;
        MediaCodec.BufferInfo bufferInfo2;
        int dequeueOutputBuffer;
        short s10;
        Bitmap bitmap = null;
        int i11 = 0;
        int i12 = 1;
        switch (this.a) {
            case 0:
                pc pcVar = ((ob) this.b).k0;
                pcVar.v(true);
                pcVar.A0.setCameraThumb(pcVar.A());
                return;
            case 1:
                ((rb) this.b).A2.p1.setVisibility(8);
                return;
            case 2:
                sb sbVar = (sb) this.b;
                pc pcVar2 = sbVar.b0;
                if (pcVar2.Q1 || pcVar2.P1 || pcVar2.B0 == null || pcVar2.f0 != 0 || pcVar2.m1 == null) {
                    return;
                }
                String string = LocaleController.getString(sbVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                f4 f4Var = pcVar2.m1;
                f4Var.h = f4.a(string, f4Var.getTextPaint());
                pcVar2.m1.s(string);
                pcVar2.m1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 3:
                ((org.telegram.ui.Components.x9) this.b).setVisibility(8);
                return;
            case 4:
                sc scVar = (sc) this.b;
                try {
                    int round = Math.round(((scVar.h * scVar.g.getInteger("sample-rate")) / scVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(scVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(scVar.g, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    createDecoderByType.getInputBuffers();
                    createDecoderByType.getOutputBuffers();
                    short[] sArr = new short[32];
                    int i13 = -1;
                    boolean z10 = false;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    short s11 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo3 = new MediaCodec.BufferInfo();
                        int i17 = i13;
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = scVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                j3 = 2500;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo3;
                                i10 = i17;
                                z10 = true;
                            } else {
                                j3 = 2500;
                                i10 = i17;
                                bufferInfo = bufferInfo3;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, scVar.f.getSampleTime(), 0);
                                scVar.f.advance();
                                if (i10 >= 0) {
                                    createDecoderByType.getOutputBuffer(i10).position(0);
                                }
                                bufferInfo2 = bufferInfo;
                                dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo2, j3);
                                while (true) {
                                    if (dequeueOutputBuffer != -1 && !z10) {
                                        if (dequeueOutputBuffer < 0) {
                                            ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(dequeueOutputBuffer);
                                            if (outputBuffer != null && bufferInfo2.size > 0) {
                                                int i18 = i16;
                                                while (outputBuffer.remaining() > 0) {
                                                    short s12 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                                    if (i18 >= round) {
                                                        sArr[i14 - i15] = s11;
                                                        int i19 = i14 + 1;
                                                        int i20 = i19 - i15;
                                                        if (i20 >= sArr.length || i19 >= scVar.b) {
                                                            short[] sArr2 = new short[sArr.length];
                                                            AndroidUtilities.runOnUIThread(new ah.p(scVar, sArr, i20, 8));
                                                            sArr = sArr2;
                                                            i15 = i19;
                                                        }
                                                        i14 = i19;
                                                        if (i19 >= scVar.d.length) {
                                                            i16 = 0;
                                                            s11 = 0;
                                                        } else {
                                                            s10 = 0;
                                                            i18 = 0;
                                                        }
                                                    } else {
                                                        s10 = s11;
                                                    }
                                                    s11 = s10 < s12 ? s12 : s10;
                                                    i18++;
                                                    if (outputBuffer.remaining() < 8) {
                                                        i16 = i18;
                                                    } else {
                                                        outputBuffer.position(outputBuffer.position() + 8);
                                                    }
                                                }
                                                i16 = i18;
                                            }
                                            createDecoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                                            if ((bufferInfo2.flags & 4) != 0) {
                                                z10 = true;
                                            }
                                        } else if (dequeueOutputBuffer == -3) {
                                            createDecoderByType.getOutputBuffers();
                                        }
                                        dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo2, 2500L);
                                    }
                                }
                                int i21 = i14;
                                synchronized (scVar.i) {
                                    try {
                                        if (!scVar.j) {
                                            if (!z10 && i21 < scVar.b) {
                                                i13 = dequeueOutputBuffer;
                                                i14 = i21;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            bufferInfo = bufferInfo3;
                            j3 = 2500;
                            i10 = i17;
                        }
                        if (i10 >= 0) {
                        }
                        bufferInfo2 = bufferInfo;
                        dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo2, j3);
                        while (true) {
                            if (dequeueOutputBuffer != -1) {
                                if (dequeueOutputBuffer < 0) {
                                }
                                dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo2, 2500L);
                            }
                        }
                        int i212 = i14;
                        synchronized (scVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    scVar.f.release();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 5:
                uc ucVar = (uc) this.b;
                xc xcVar = ucVar.c;
                if (xcVar != null) {
                    long j10 = xcVar.a;
                    if (j10 > 0) {
                        ucVar.e = j10;
                        ucVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                xc xcVar2 = (xc) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = xcVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(xcVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(xcVar2.f, xcVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(xcVar2.f / bitmap.getWidth(), xcVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (xcVar2.h) {
                            if (xcVar2.m == null) {
                                xcVar2.m = new Path();
                            }
                            xcVar2.m.rewind();
                            xcVar2.m.addCircle(xcVar2.f / 2.0f, xcVar2.g / 2.0f, Math.min(xcVar2.f, xcVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(xcVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, xcVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new b7(12, xcVar2, bitmap));
                return;
            case 7:
                a();
                return;
            case 8:
                ei.f fVar = (ei.f) this.b;
                fVar.getClass();
                try {
                    ll0 currentListView = ((ei.i) fVar.M0).R.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 9:
                fg.d dVar = (fg.d) this.b;
                AndroidUtilities.runOnUIThread(new fg.c(dVar.a, dVar.b, i12), 500L);
                return;
            case 10:
                ((fi.h0) this.b).invalidateSelf();
                return;
            case 11:
                ((fi.i0) this.b).invalidateSelf();
                return;
            case 12:
                ((fi.k0) this.b).d();
                return;
            case 13:
                ((fi.x0) this.b).c();
                return;
            case 14:
                ((fi.x0) this.b).c();
                return;
            case 15:
                ((fi.y0) this.b).a();
                return;
            case 16:
                ((fi.z0) this.b).a();
                return;
            case 17:
                ((fi.j3) this.b).invalidate();
                return;
            case 18:
                ((AnimationNotificationsLocker) this.b).unlock();
                return;
            case 19:
                fi.q4 q4Var = (fi.q4) this.b;
                q4Var.Q = q4Var.r;
                return;
            case 20:
                ((e2.a0) this.b).getClass();
                return;
            case 21:
                bi.d8 d8Var = ((hg.o1) this.b).y;
                if (d8Var != null) {
                    d8Var.p(3, true);
                    return;
                }
                return;
            case 22:
                com.google.firebase.messaging.m mVar = (com.google.firebase.messaging.m) this.b;
                ((Context) mVar.b).unregisterReceiver((i2.b) mVar.c);
                return;
            case 23:
                i2.b bVar = (i2.b) this.b;
                if (bVar.c.a) {
                    bVar.a.a.y1(3, false);
                    return;
                }
                return;
            case 24:
                i2.f0 f0Var = (i2.f0) this.b;
                e2.c cVar = f0Var.E;
                Context context = f0Var.e;
                String str = e2.d0.a;
                Integer valueOf = Integer.valueOf(c2.d.e(context).generateAudioSessionId());
                cVar.f = valueOf;
                e2.b bVar2 = new e2.b(cVar, valueOf, i11);
                e2.z zVar = (e2.z) cVar.c;
                if (zVar.a.getLooper().getThread().isAlive()) {
                    zVar.c(bVar2);
                    return;
                }
                return;
            case 25:
                i2.f0 f0Var2 = ((i2.c0) this.b).a;
                f0Var2.t1(null);
                f0Var2.m1(0, 0);
                return;
            case 26:
                try {
                    i2.o0.h((i2.j1) this.b);
                    return;
                } catch (i2.o e11) {
                    e2.a.f("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
                    throw new RuntimeException(e11);
                }
            case 27:
                ig.c cVar2 = (ig.c) this.b;
                cVar2.c.Y2.N(true);
                cVar2.V(true);
                return;
            case 28:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                org.telegram.ui.Components.yc.a0(LaunchActivity.R()).k(false).j();
                return;
            default:
                ig.k0 k0Var = (ig.k0) this.b;
                v51 v51Var = k0Var.d0;
                if (v51Var != null) {
                    v51Var.N(true);
                }
                k0Var.T(true);
                return;
        }
    }

    public /* synthetic */ nb(i2.o0 o0Var, i2.j1 j1Var) {
        this.a = 26;
        this.b = j1Var;
    }

    public /* synthetic */ nb(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
