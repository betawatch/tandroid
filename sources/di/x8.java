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
import android.os.Looper;
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
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final /* synthetic */ class x8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x8(i2.b0 b0Var, SurfaceTexture surfaceTexture) {
        this.a = 25;
        this.b = b0Var;
    }

    private final void a() {
        String d;
        TelephonyManager telephonyManager;
        e2.v vVar = (e2.v) this.b;
        y2.e eVar = (y2.e) vVar.a.get();
        if (eVar != null) {
            int b10 = vVar.c.b();
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
                                    String str = e2.m0.a;
                                    if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (!TextUtils.isEmpty(networkCountryIso)) {
                                            d = v7.s6.d(networkCountryIso);
                                            fVar.o = d;
                                        }
                                    }
                                    d = v7.s6.d(Locale.getDefault().getCountry());
                                    fVar.o = d;
                                }
                                fVar.l = fVar.a(b10);
                                fVar.d.getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                fVar.c(fVar.g > 0 ? (int) (elapsedRealtime - fVar.h) : 0, fVar.i, fVar.l);
                                fVar.h = elapsedRealtime;
                                fVar.i = 0L;
                                fVar.k = 0L;
                                fVar.j = 0L;
                                y2.q qVar = fVar.f;
                                qVar.a.clear();
                                qVar.c = -1;
                                qVar.d = 0;
                                qVar.e = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x0307 A[Catch: Exception -> 0x02da, TryCatch #0 {Exception -> 0x02da, blocks: (B:114:0x0261, B:118:0x0289, B:119:0x02a5, B:121:0x02b3, B:123:0x02bf, B:126:0x0307, B:127:0x030e, B:132:0x031a, B:134:0x0320, B:137:0x0328, B:139:0x032e, B:141:0x0340, B:143:0x034b, B:147:0x0364, B:152:0x0380, B:154:0x038f, B:160:0x0353, B:163:0x039d, B:166:0x03b7, B:195:0x03b3, B:170:0x03bf, B:171:0x03c1, B:182:0x03d9, B:177:0x03cd, B:192:0x03e6, B:198:0x02dd, B:173:0x03c2, B:186:0x03c6, B:175:0x03ca), top: B:113:0x0261, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x031a A[Catch: Exception -> 0x02da, TryCatch #0 {Exception -> 0x02da, blocks: (B:114:0x0261, B:118:0x0289, B:119:0x02a5, B:121:0x02b3, B:123:0x02bf, B:126:0x0307, B:127:0x030e, B:132:0x031a, B:134:0x0320, B:137:0x0328, B:139:0x032e, B:141:0x0340, B:143:0x034b, B:147:0x0364, B:152:0x0380, B:154:0x038f, B:160:0x0353, B:163:0x039d, B:166:0x03b7, B:195:0x03b3, B:170:0x03bf, B:171:0x03c1, B:182:0x03d9, B:177:0x03cd, B:192:0x03e6, B:198:0x02dd, B:173:0x03c2, B:186:0x03c6, B:175:0x03ca), top: B:113:0x0261, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0369 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x03b0  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        short[] sArr;
        boolean z10;
        MediaCodec.BufferInfo bufferInfo;
        long j10;
        int i10;
        int i11;
        short s10;
        Object obj;
        Bitmap bitmap = null;
        boolean z11 = true;
        int i12 = 0;
        switch (this.a) {
            case 0:
                d dVar = (d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 1:
                ((ba) ((aa) this.b).n).fullScroll(130);
                return;
            case 2:
                jc jcVar = (jc) this.b;
                jcVar.x0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                jcVar.w0.Y0(AndroidUtilities.emptyMotionEvent());
                return;
            case 3:
                kc kcVar = ((jb) this.b).k0;
                kcVar.u(true);
                kcVar.A0.setCameraThumb(kcVar.z());
                return;
            case 4:
                ((mb) this.b).A2.p1.setVisibility(8);
                return;
            case 5:
                nb nbVar = (nb) this.b;
                kc kcVar2 = nbVar.b0;
                if (kcVar2.Q1 || kcVar2.P1 || kcVar2.B0 == null || kcVar2.f0 != 0 || kcVar2.m1 == null) {
                    return;
                }
                String string = LocaleController.getString(nbVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                d4 d4Var = kcVar2.m1;
                d4Var.h = d4.a(string, d4Var.getTextPaint());
                kcVar2.m1.s(string);
                kcVar2.m1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 6:
                ((org.telegram.ui.Components.z9) this.b).setVisibility(8);
                return;
            case 7:
                nc ncVar = (nc) this.b;
                try {
                    int round = Math.round(((ncVar.h * ncVar.g.getInteger("sample-rate")) / ncVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(ncVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(ncVar.g, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    createDecoderByType.getInputBuffers();
                    createDecoderByType.getOutputBuffers();
                    short[] sArr2 = new short[32];
                    int i13 = -1;
                    boolean z12 = false;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    short s11 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int i17 = i13;
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = ncVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                z10 = z11;
                                bufferInfo = bufferInfo2;
                                sArr = sArr2;
                                j10 = 2500;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                i10 = i17;
                                z12 = z10;
                            } else {
                                sArr = sArr2;
                                z10 = z11;
                                bufferInfo = bufferInfo2;
                                j10 = 2500;
                                i10 = i17;
                                i11 = 8;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, ncVar.f.getSampleTime(), 0);
                                ncVar.f.advance();
                                if (i10 >= 0) {
                                    createDecoderByType.getOutputBuffer(i10).position(0);
                                }
                                i13 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j10);
                                while (true) {
                                    if (i13 != -1 && !z12) {
                                        if (i13 < 0) {
                                            ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i13);
                                            if (outputBuffer != null && bufferInfo.size > 0) {
                                                int i18 = i16;
                                                short[] sArr3 = sArr;
                                                while (outputBuffer.remaining() > 0) {
                                                    short s12 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                                    if (i18 >= round) {
                                                        sArr3[i14 - i15] = s11;
                                                        int i19 = i14 + 1;
                                                        int i20 = i19 - i15;
                                                        if (i20 < sArr3.length && i19 < ncVar.b) {
                                                            sArr = sArr3;
                                                            if (i19 < ncVar.d.length) {
                                                                i16 = 0;
                                                                s11 = 0;
                                                                i14 = i19;
                                                            } else {
                                                                s10 = 0;
                                                                i14 = i19;
                                                                sArr3 = sArr;
                                                                i18 = 0;
                                                            }
                                                        }
                                                        short[] sArr4 = new short[sArr3.length];
                                                        AndroidUtilities.runOnUIThread(new ah.o(ncVar, sArr3, i20, i11));
                                                        sArr = sArr4;
                                                        i15 = i19;
                                                        if (i19 < ncVar.d.length) {
                                                        }
                                                    } else {
                                                        s10 = s11;
                                                    }
                                                    s11 = s10 < s12 ? s12 : s10;
                                                    i18++;
                                                    if (outputBuffer.remaining() < 8) {
                                                        i16 = i18;
                                                        sArr = sArr3;
                                                    } else {
                                                        outputBuffer.position(outputBuffer.position() + 8);
                                                        i11 = 8;
                                                    }
                                                }
                                                i16 = i18;
                                                sArr = sArr3;
                                            }
                                            createDecoderByType.releaseOutputBuffer(i13, false);
                                            if ((bufferInfo.flags & 4) != 0) {
                                                z12 = z10;
                                            }
                                        } else if (i13 == -3) {
                                            createDecoderByType.getOutputBuffers();
                                        }
                                        i13 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                                        i11 = 8;
                                    }
                                }
                                int i21 = i14;
                                sArr2 = sArr;
                                synchronized (ncVar.i) {
                                    try {
                                        if (!ncVar.j) {
                                            if (!z12 && i21 < ncVar.b) {
                                                i14 = i21;
                                                z11 = z10;
                                            }
                                        }
                                    } finally {
                                    }
                                }
                            }
                        } else {
                            sArr = sArr2;
                            z10 = z11;
                            bufferInfo = bufferInfo2;
                            j10 = 2500;
                            i10 = i17;
                        }
                        i11 = 8;
                        if (i10 >= 0) {
                        }
                        i13 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j10);
                        while (true) {
                            if (i13 != -1) {
                                if (i13 < 0) {
                                }
                                i13 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                                i11 = 8;
                            }
                        }
                        int i212 = i14;
                        sArr2 = sArr;
                        synchronized (ncVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    ncVar.f.release();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 8:
                pc pcVar = (pc) this.b;
                sc scVar = pcVar.c;
                if (scVar != null) {
                    long j11 = scVar.a;
                    if (j11 > 0) {
                        pcVar.e = j11;
                        pcVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                sc scVar2 = (sc) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = scVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(scVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(scVar2.f, scVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(scVar2.f / bitmap.getWidth(), scVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.gms.internal.play_billing.k3.c(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.c(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.w(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.play_billing.k3.w(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (scVar2.h) {
                            if (scVar2.m == null) {
                                scVar2.m = new Path();
                            }
                            scVar2.m.rewind();
                            scVar2.m.addCircle(scVar2.f / 2.0f, scVar2.g / 2.0f, Math.min(scVar2.f, scVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(scVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, scVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                AndroidUtilities.runOnUIThread(new x6(14, scVar2, bitmap));
                return;
            case 10:
                a();
                return;
            case 11:
                ei.f fVar = (ei.f) this.b;
                fVar.getClass();
                try {
                    mm0 currentListView = ((ei.i) fVar.M0).R.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 12:
                ((fi.g0) this.b).invalidateSelf();
                return;
            case 13:
                ((fi.h0) this.b).invalidateSelf();
                return;
            case 14:
                ((fi.j0) this.b).d();
                return;
            case 15:
                ((fi.w0) this.b).c();
                return;
            case 16:
                ((fi.w0) this.b).c();
                return;
            case 17:
                ((fi.x0) this.b).a();
                return;
            case 18:
                ((fi.y0) this.b).a();
                return;
            case 19:
                ((fi.j3) this.b).invalidate();
                return;
            case 20:
                ((AnimationNotificationsLocker) this.b).unlock();
                return;
            case 21:
                fi.p4 p4Var = (fi.p4) this.b;
                p4Var.Q = p4Var.r;
                return;
            case 22:
                ((e2.j0) this.b).getClass();
                return;
            case 23:
                bi.g8 g8Var = ((hg.n1) this.b).y;
                if (g8Var != null) {
                    g8Var.p(3, true);
                    return;
                }
                return;
            case 24:
                i2.h0 h0Var = (i2.h0) this.b;
                e2.c cVar = h0Var.C;
                Context context = h0Var.e;
                String str = e2.m0.a;
                int generateAudioSessionId = c2.i.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((e2.i0) cVar.c).a.getLooper()) {
                    obj = cVar.e;
                } else {
                    v7.u6.p(myLooper == ((e2.i0) cVar.b).a.getLooper());
                    obj = cVar.f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar.f = valueOf;
                    e2.b bVar = new e2.b(cVar, valueOf, i12);
                    e2.i0 i0Var = (e2.i0) cVar.c;
                    if (i0Var.a.getLooper().getThread().isAlive()) {
                        i0Var.d(bVar);
                    }
                    h0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    h0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 25:
                i2.h0 h0Var2 = ((i2.b0) this.b).a;
                h0Var2.x1(null);
                h0Var2.q1(0, 0);
                return;
            case 26:
                try {
                    i2.r0.f((i2.n1) this.b);
                    return;
                } catch (i2.m e10) {
                    e2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
                    throw new RuntimeException(e10);
                }
            case 27:
                ig.c cVar2 = (ig.c) this.b;
                cVar2.c.W2.N(true);
                cVar2.V(true);
                return;
            case 28:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                org.telegram.ui.Components.zc.a0(LaunchActivity.R()).k(false).j();
                return;
            default:
                ig.k0 k0Var = (ig.k0) this.b;
                z61 z61Var = k0Var.d0;
                if (z61Var != null) {
                    z61Var.N(true);
                }
                k0Var.U(true);
                return;
        }
    }

    public /* synthetic */ x8(i2.r0 r0Var, i2.n1 n1Var) {
        this.a = 26;
        this.b = n1Var;
    }

    public /* synthetic */ x8(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
