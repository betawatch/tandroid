package hi;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.Surface;
import android.view.ViewGroup;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.ri;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class k implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x02d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0275  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i7;
        MediaCodec.BufferInfo bufferInfo;
        long j3;
        int i10;
        int i11;
        short s5;
        int i12 = 18;
        Bitmap bitmap = null;
        int i13 = 8;
        boolean z11 = true;
        int i14 = 0;
        switch (this.a) {
            case 0:
                ((m) this.b).invalidateSelf();
                return;
            case 1:
                ((e0) this.b).g = -1L;
                return;
            case 2:
                n0 n0Var = (n0) this.b;
                tg.i iVar = n0Var.b.I;
                if (iVar != null) {
                    iVar.b();
                }
                n0Var.b.k();
                return;
            case 3:
                ((w0) this.b).a(false);
                return;
            case 4:
                z4 z4Var = (z4) this.b;
                gc.e();
                ug.z0 z0Var = new ug.z0((org.telegram.ui.ActionBar.h2) new bi.y8(z4Var), 14, false);
                z0Var.setOnDismissListener(new f1(i14));
                z0Var.show();
                return;
            case 5:
                ((s1) this.b).G();
                return;
            case 6:
                y1 y1Var = (y1) this.b;
                ArrayList arrayList = y1Var.w;
                ArrayList arrayList2 = y1Var.s;
                z1 z1Var = y1Var.O;
                j2 j2Var = z1Var.s;
                int i15 = j2.C1;
                ri d02 = ri.d0(j2Var.a);
                String str = y1Var.I;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (z1Var.a == 1 && org.telegram.messenger.j6.d(y1Var.I)) {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = y1Var.I;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(j2Var.a).sendRequest(tL_messages_getStickers, new bi.k1(15, y1Var, str));
                        return;
                    }
                    String[] G0 = org.telegram.messenger.g0.G0();
                    String[] strArr = y1Var.K;
                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                        ri.d0(j2Var.a).O(G0, false);
                    }
                    y1Var.K = G0;
                    d02.X(G0, y1Var.I, false, new a3.h(y1Var, str, d02, 10), false, false, false, true, 50);
                    return;
                }
                ArrayList k02 = d02.k0(7, false);
                y1Var.y = 0;
                arrayList2.clear();
                arrayList.clear();
                y1Var.E.clear();
                y1Var.n.clear();
                y1Var.y++;
                arrayList2.add(null);
                arrayList.add(0L);
                arrayList2.addAll(k02);
                y1Var.y = k02.size() + y1Var.y;
                y1Var.J = y1Var.I;
                y1Var.f();
                o1.z1(z1Var.b, 0, 0);
                z1Var.f.c(false);
                z1Var.e.n(false);
                return;
            case 7:
                e2 e2Var = (e2) ((ah.j) this.b).b;
                if (e2Var.n) {
                    return;
                }
                e2Var.r.setVisibility(8);
                return;
            case 8:
                h2 h2Var = (h2) ((h6.r) this.b).b;
                ArrayList arrayList3 = h2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                h2Var.l.e(true, 0.0f);
                int i16 = h2Var.k + 1;
                h2Var.k = i16;
                if (i16 > arrayList3.size() - 1) {
                    h2Var.k = 0;
                }
                ch.g0 g0Var = h2Var.j;
                g0Var.e((ch.p0) arrayList3.get(h2Var.k));
                h2Var.j = h2Var.i;
                h2Var.i = g0Var;
                h2Var.p.invalidate();
                return;
            case 9:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 10:
                ((a3) this.b).b(null);
                return;
            case 11:
                ((d3) this.b).E();
                return;
            case 12:
                m9 m9Var = (m9) this.b;
                if (m9Var.J) {
                    m9Var.J = false;
                    m9Var.invalidate();
                    return;
                }
                return;
            case 13:
                e6 e6Var = (e6) ((d6) this.b).q;
                e6Var.R = System.currentTimeMillis();
                e6Var.S = 0L;
                e6Var.s0 = true;
                ((q9) e6Var.a).a.K0.a(0L, true);
                e6Var.invalidate();
                return;
            case 14:
                q qVar = (q) this.b;
                if (qVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qVar.getParent()).removeView(qVar);
                    return;
                }
                return;
            case 15:
                d dVar = (d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 16:
                ((n8) ((ah.n) this.b).n).fullScroll(ks.O1);
                return;
            case 17:
                sa saVar = (sa) this.b;
                saVar.h0.onTouchEvent(org.telegram.messenger.g0.R());
                saVar.g0.w0(org.telegram.messenger.g0.R());
                return;
            case 18:
                ta taVar = (ta) ((h3) this.b).m0;
                taVar.u(true);
                taVar.B0.setCameraThumb(taVar.z());
                return;
            case 19:
                ((v9) this.b).k2.q1.setVisibility(8);
                return;
            case 20:
                w9 w9Var = (w9) this.b;
                ta taVar2 = w9Var.c0;
                if (taVar2.R1 || taVar2.Q1 || taVar2.C0 == null || taVar2.g0 != 0 || taVar2.n1 == null) {
                    return;
                }
                String M0 = gd.M0(w9Var.isFrontface() ? 2131744475 : 2131744474, null);
                m3 m3Var = taVar2.n1;
                m3Var.h = m3.a(M0, m3Var.getTextPaint());
                taVar2.n1.v(M0);
                taVar2.n1.x();
                mp.g1().edit().putInt("storysvddualhint", mp.g1().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 21:
                ((org.telegram.ui.Components.q9) this.b).setVisibility(8);
                return;
            case 22:
                wa waVar = (wa) this.b;
                try {
                    int round = Math.round(((waVar.h * waVar.g.getInteger("sample-rate")) / waVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(waVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(waVar.g, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    createDecoderByType.getInputBuffers();
                    createDecoderByType.getOutputBuffers();
                    short[] sArr = new short[32];
                    int i17 = -1;
                    boolean z12 = false;
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    short s9 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int i21 = i17;
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = waVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                z10 = z11;
                                bufferInfo = bufferInfo2;
                                j3 = 2500;
                                try {
                                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                    i7 = i13;
                                    i10 = i21;
                                    z12 = z10;
                                } catch (Exception e10) {
                                    e = e10;
                                    org.telegram.messenger.a8.g(e, z10);
                                    return;
                                }
                            } else {
                                z10 = z11;
                                bufferInfo = bufferInfo2;
                                j3 = 2500;
                                i7 = i13;
                                i10 = i21;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, waVar.f.getSampleTime(), 0);
                                waVar.f.advance();
                            }
                        } else {
                            i7 = i13;
                            z10 = z11;
                            bufferInfo = bufferInfo2;
                            j3 = 2500;
                            i10 = i21;
                        }
                        if (i10 >= 0) {
                            createDecoderByType.getOutputBuffer(i10).position(0);
                        }
                        i17 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j3);
                        while (i17 != -1 && !z12) {
                            if (i17 >= 0) {
                                ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i17);
                                if (outputBuffer == null || bufferInfo.size <= 0) {
                                    i11 = 18;
                                } else {
                                    int i22 = i20;
                                    while (true) {
                                        if (outputBuffer.remaining() > 0) {
                                            short s10 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                            if (i22 >= round) {
                                                sArr[i18 - i19] = s9;
                                                int i23 = i18 + 1;
                                                int i24 = i23 - i19;
                                                if (i24 < sArr.length && i23 < waVar.b) {
                                                    i11 = 18;
                                                    if (i23 < waVar.d.length) {
                                                        i20 = 0;
                                                        s9 = 0;
                                                        i18 = i23;
                                                    } else {
                                                        s5 = 0;
                                                        i18 = i23;
                                                        i22 = 0;
                                                    }
                                                }
                                                short[] sArr2 = new short[sArr.length];
                                                i11 = 18;
                                                org.telegram.messenger.g0.g3(new ai.a1(waVar, sArr, i24, i11));
                                                sArr = sArr2;
                                                i19 = i23;
                                                if (i23 < waVar.d.length) {
                                                }
                                            } else {
                                                i11 = 18;
                                                s5 = s9;
                                            }
                                            s9 = s5 < s10 ? s10 : s5;
                                            i22++;
                                            int i25 = i7;
                                            if (outputBuffer.remaining() >= i25) {
                                                outputBuffer.position(outputBuffer.position() + i25);
                                                i7 = 8;
                                            }
                                        } else {
                                            i11 = 18;
                                        }
                                    }
                                    i20 = i22;
                                }
                                createDecoderByType.releaseOutputBuffer(i17, false);
                                if ((bufferInfo.flags & 4) != 0) {
                                    z12 = z10;
                                    int i26 = i18;
                                    synchronized (waVar.i) {
                                        try {
                                            if (!waVar.j) {
                                                if (!z12 && i26 < waVar.b) {
                                                    i18 = i26;
                                                    z11 = z10;
                                                    i13 = 8;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else if (i17 == -3) {
                                createDecoderByType.getOutputBuffers();
                            }
                            i17 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                            i7 = 8;
                        }
                        i11 = 18;
                        int i262 = i18;
                        synchronized (waVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    waVar.f.release();
                    return;
                } catch (Exception e11) {
                    e = e11;
                    z10 = z11;
                }
                break;
            case 23:
                ya yaVar = (ya) this.b;
                bb bbVar = yaVar.c;
                if (bbVar != null) {
                    long j10 = bbVar.a;
                    if (j10 > 0) {
                        yaVar.e = j10;
                        yaVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                bb bbVar2 = (bb) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = bbVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(bbVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(bbVar2.f, bbVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(bbVar2.f / bitmap.getWidth(), bbVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.w(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.w(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (bbVar2.h) {
                            if (bbVar2.m == null) {
                                bbVar2.m = new Path();
                            }
                            bbVar2.m.rewind();
                            bbVar2.m.addCircle(bbVar2.f / 2.0f, bbVar2.g / 2.0f, Math.min(bbVar2.f, bbVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(bbVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, bbVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                org.telegram.messenger.g0.g3(new r1(i12, bbVar2, bitmap));
                return;
            case 25:
                ii.t tVar = (ii.t) this.b;
                qt0 qt0Var = tVar.V;
                if (qt0Var == null || tVar.b0 == -1) {
                    return;
                }
                qt0Var.a();
                return;
            case 26:
                fi.b6 b6Var = ((jg.l1) this.b).E;
                if (b6Var != null) {
                    b6Var.p(3, true);
                    return;
                }
                return;
            case 27:
                ji.p pVar = (ji.p) this.b;
                if (pVar.p0) {
                    return;
                }
                pVar.setVisibility(8);
                pVar.s();
                ji.p pVar2 = pVar.a.h;
                if (pVar2 != null) {
                    org.telegram.messenger.g0.E2(pVar2);
                    Log.d("VoiceLive", "overlay removed");
                    return;
                }
                return;
            case 28:
                kg.c cVar = (kg.c) this.b;
                cVar.b.g3.O(true);
                cVar.a0(true);
                return;
            default:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) this.b).link);
                lc.b0(LaunchActivity.Q()).k(false).j();
                return;
        }
    }
}
