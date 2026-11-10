package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
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
import org.telegram.messenger.id;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.m41;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v9 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v9(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    private final void a() {
        String d;
        TelephonyManager telephonyManager;
        h2.v vVar = (h2.v) this.b;
        b3.f fVar = (b3.f) vVar.a.get();
        if (fVar != null) {
            int b10 = vVar.c.b();
            b3.g gVar = fVar.a;
            synchronized (gVar) {
                synchronized (gVar) {
                    int i7 = gVar.n;
                    if (i7 == 0 || gVar.e) {
                        if (i7 != b10 || gVar.o == null) {
                            gVar.n = b10;
                            if (b10 != 1 && b10 != 0 && b10 != 8) {
                                if (gVar.o == null) {
                                    Context context = gVar.a;
                                    String str = h2.m0.a;
                                    if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (!TextUtils.isEmpty(networkCountryIso)) {
                                            d = a8.ga.d(networkCountryIso);
                                            gVar.o = d;
                                        }
                                    }
                                    d = a8.ga.d(Locale.getDefault().getCountry());
                                    gVar.o = d;
                                }
                                gVar.l = gVar.b(b10);
                                gVar.d.getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                gVar.d(gVar.i, gVar.g > 0 ? (int) (elapsedRealtime - gVar.h) : 0, gVar.l);
                                gVar.h = elapsedRealtime;
                                gVar.i = 0L;
                                gVar.k = 0L;
                                gVar.j = 0L;
                                b3.t tVar = gVar.f;
                                tVar.a.clear();
                                tVar.c = -1;
                                tVar.d = 0;
                                tVar.e = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0389 A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z9;
        short[] sArr;
        MediaCodec.BufferInfo bufferInfo;
        long j3;
        int i7;
        int i10;
        short s5;
        Object obj;
        Bitmap bitmap = null;
        int i11 = 0;
        boolean z10 = true;
        switch (this.a) {
            case 0:
                va vaVar = (va) ((i3) this.b).l0;
                vaVar.u(true);
                vaVar.A0.setCameraThumb(vaVar.z());
                return;
            case 1:
                ((x9) this.b).j2.p1.setVisibility(8);
                return;
            case 2:
                y9 y9Var = (y9) this.b;
                va vaVar2 = y9Var.b0;
                if (vaVar2.Q1 || vaVar2.P1 || vaVar2.B0 == null || vaVar2.f0 != 0 || vaVar2.m1 == null) {
                    return;
                }
                String M0 = id.M0(y9Var.isFrontface() ? 2131744710 : 2131744709, null);
                m3 m3Var = vaVar2.m1;
                m3Var.h = m3.a(M0, m3Var.getTextPaint());
                vaVar2.m1.u(M0);
                vaVar2.m1.w();
                qp.e1().edit().putInt("storysvddualhint", qp.e1().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 3:
                ((org.telegram.ui.Components.k9) this.b).setVisibility(8);
                return;
            case 4:
                ya yaVar = (ya) this.b;
                try {
                    int round = Math.round(((yaVar.h * yaVar.g.getInteger("sample-rate")) / yaVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(yaVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(yaVar.g, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    createDecoderByType.getInputBuffers();
                    createDecoderByType.getOutputBuffers();
                    short[] sArr2 = new short[32];
                    int i12 = -1;
                    boolean z11 = false;
                    int i13 = 0;
                    int i14 = 0;
                    int i15 = 0;
                    short s9 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int i16 = i12;
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = yaVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                z9 = z10;
                                bufferInfo = bufferInfo2;
                                i10 = 8;
                                sArr = sArr2;
                                j3 = 2500;
                                try {
                                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                    i7 = i16;
                                    z11 = z9;
                                } catch (Exception e10) {
                                    e = e10;
                                    org.telegram.messenger.a8.g(e, z9);
                                    return;
                                }
                            } else {
                                sArr = sArr2;
                                z9 = z10;
                                bufferInfo = bufferInfo2;
                                j3 = 2500;
                                i10 = 8;
                                i7 = i16;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, yaVar.f.getSampleTime(), 0);
                                yaVar.f.advance();
                            }
                        } else {
                            sArr = sArr2;
                            z9 = z10;
                            bufferInfo = bufferInfo2;
                            j3 = 2500;
                            i7 = i16;
                            i10 = 8;
                        }
                        if (i7 >= 0) {
                            createDecoderByType.getOutputBuffer(i7).position(0);
                        }
                        i12 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j3);
                        while (true) {
                            if (i12 != -1 && !z11) {
                                if (i12 >= 0) {
                                    ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i12);
                                    if (outputBuffer != null && bufferInfo.size > 0) {
                                        int i17 = i15;
                                        short[] sArr3 = sArr;
                                        while (outputBuffer.remaining() > 0) {
                                            short s10 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                            if (i17 >= round) {
                                                sArr3[i13 - i14] = s9;
                                                int i18 = i13 + 1;
                                                int i19 = i18 - i14;
                                                if (i19 < sArr3.length && i18 < yaVar.b) {
                                                    sArr = sArr3;
                                                    if (i18 < yaVar.d.length) {
                                                        i15 = 0;
                                                        s9 = 0;
                                                        i13 = i18;
                                                    } else {
                                                        s5 = 0;
                                                        i13 = i18;
                                                        sArr3 = sArr;
                                                        i17 = 0;
                                                    }
                                                }
                                                short[] sArr4 = new short[sArr3.length];
                                                org.telegram.messenger.g0.h3(new ai.e0(yaVar, sArr3, i19, 13));
                                                sArr = sArr4;
                                                i14 = i18;
                                                if (i18 < yaVar.d.length) {
                                                }
                                            } else {
                                                s5 = s9;
                                            }
                                            s9 = s5 < s10 ? s10 : s5;
                                            i17++;
                                            int i20 = i10;
                                            if (outputBuffer.remaining() < i20) {
                                                i15 = i17;
                                                sArr = sArr3;
                                            } else {
                                                outputBuffer.position(outputBuffer.position() + i20);
                                                i10 = 8;
                                            }
                                        }
                                        i15 = i17;
                                        sArr = sArr3;
                                    }
                                    createDecoderByType.releaseOutputBuffer(i12, false);
                                    if ((bufferInfo.flags & 4) != 0) {
                                        z11 = z9;
                                    }
                                } else if (i12 == -3) {
                                    createDecoderByType.getOutputBuffers();
                                }
                                i12 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                                i10 = 8;
                            }
                        }
                        int i21 = i13;
                        sArr2 = sArr;
                        synchronized (yaVar.i) {
                            try {
                                if (!yaVar.j) {
                                    if (!z11 && i21 < yaVar.b) {
                                        i13 = i21;
                                        z10 = z9;
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    yaVar.f.release();
                    return;
                } catch (Exception e11) {
                    e = e11;
                    z9 = z10;
                }
                break;
            case 5:
                ab abVar = (ab) this.b;
                db dbVar = abVar.c;
                if (dbVar != null) {
                    long j10 = dbVar.a;
                    if (j10 > 0) {
                        abVar.e = j10;
                        abVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                db dbVar2 = (db) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = dbVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(dbVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(dbVar2.f, dbVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(dbVar2.f / bitmap.getWidth(), dbVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.recaptcha.internal.a.w(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.recaptcha.internal.a.w(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.recaptcha.internal.a.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.recaptcha.internal.a.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (dbVar2.h) {
                            if (dbVar2.m == null) {
                                dbVar2.m = new Path();
                            }
                            dbVar2.m.rewind();
                            dbVar2.m.addCircle(dbVar2.f / 2.0f, dbVar2.g / 2.0f, Math.min(dbVar2.f, dbVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(dbVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, dbVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                org.telegram.messenger.g0.h3(new f2.h(21, dbVar2, bitmap));
                return;
            case 7:
                gi.f fVar = (gi.f) this.b;
                it0 it0Var = fVar.U;
                if (it0Var == null || fVar.a0 == -1) {
                    return;
                }
                it0Var.a();
                return;
            case 8:
                ((h2.j0) this.b).getClass();
                return;
            case 9:
                a();
                return;
            case 10:
                ((hi.c0) this.b).invalidateSelf();
                return;
            case 11:
                ((hi.d0) this.b).invalidateSelf();
                return;
            case 12:
                ((hi.f0) this.b).d();
                return;
            case 13:
                ((hi.s0) this.b).c();
                return;
            case 14:
                ((hi.s0) this.b).c();
                return;
            case 15:
                ((hi.t0) this.b).a();
                return;
            case 16:
                ((hi.u0) this.b).a();
                return;
            case 17:
                ((hi.z2) this.b).invalidate();
                return;
            case 18:
                ((h2.f) this.b).e();
                return;
            case 19:
                hi.b4 b4Var = (hi.b4) this.b;
                b4Var.Q = b4Var.r;
                return;
            case 20:
                di.l6 l6Var = ((jg.m1) this.b).D;
                if (l6Var != null) {
                    l6Var.p(3, true);
                    return;
                }
                return;
            case 21:
                kg.c cVar = (kg.c) this.b;
                cVar.b.f3.O(true);
                cVar.a0(true);
                return;
            case 22:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) this.b).link);
                gc.a0(LaunchActivity.Q()).k(false).j();
                return;
            case 23:
                kg.i0 i0Var = (kg.i0) this.b;
                m41 m41Var = i0Var.Z1;
                if (m41Var != null) {
                    m41Var.O(true);
                }
                i0Var.d1(true);
                return;
            case 24:
                kg.q0 q0Var = (kg.q0) ((gf.g) this.b).b;
                q0Var.c.f3.O(true);
                q0Var.g0();
                return;
            case 25:
                kg.s0 s0Var = (kg.s0) this.b;
                s0Var.b.f3.O(true);
                s0Var.a0(true);
                return;
            case 26:
                kg.c1 c1Var = (kg.c1) this.b;
                c1Var.a.f3.O(true);
                c1Var.d0(true);
                return;
            case 27:
                ((di.s2) this.b).a(Boolean.FALSE);
                return;
            case 28:
                qs.f(((kg.t1) this.b).a).k(qs.F1, new Object[0]);
                return;
            default:
                l2.i0 i0Var2 = (l2.i0) this.b;
                h2.c cVar2 = i0Var2.C;
                Context context = i0Var2.e;
                String str = h2.m0.a;
                int generateAudioSessionId = f2.i.d(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar2.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((h2.i0) cVar2.c).a.getLooper()) {
                    obj = cVar2.e;
                } else {
                    a8.ia.p(myLooper == ((h2.i0) cVar2.b).a.getLooper());
                    obj = cVar2.f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar2.f = valueOf;
                    h2.b bVar = new h2.b(cVar2, valueOf, i11);
                    h2.i0 i0Var3 = (h2.i0) cVar2.c;
                    if (i0Var3.a.getLooper().getThread().isAlive()) {
                        i0Var3.d(bVar);
                    }
                    i0Var2.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    i0Var2.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
        }
    }
}
