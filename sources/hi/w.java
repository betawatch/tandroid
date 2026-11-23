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
import org.telegram.ui.Components.st0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class w implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x02c6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i7;
        boolean z11;
        MediaCodec.BufferInfo bufferInfo;
        long j3;
        int i10;
        short s5;
        int i11 = 8;
        Bitmap bitmap = null;
        boolean z12 = true;
        int i12 = 0;
        switch (this.a) {
            case 0:
                Runnable runnable = ((a0) this.b).d;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                m.o3 o3Var = (m.o3) this.b;
                o3Var.h = null;
                o3Var.f = null;
                ((Runnable) o3Var.e).run();
                return;
            case 2:
                ((m0) this.b).g = -1L;
                return;
            case 3:
                w0 w0Var = (w0) this.b;
                tg.m mVar = w0Var.b.J;
                if (mVar != null) {
                    mVar.b();
                }
                w0Var.b.k();
                return;
            case 4:
                ((e1) this.b).a(false);
                return;
            case 5:
                j5 j5Var = (j5) this.b;
                org.telegram.ui.Components.fc.e();
                ug.y0 y0Var = new ug.y0((org.telegram.ui.ActionBar.g2) new bi.e9(j5Var), 14, false);
                y0Var.setOnDismissListener(new n1(i12));
                y0Var.show();
                return;
            case 6:
                ((z1) this.b).G();
                return;
            case 7:
                f2 f2Var = (f2) this.b;
                ArrayList arrayList = f2Var.w;
                ArrayList arrayList2 = f2Var.s;
                g2 g2Var = f2Var.O;
                r2 r2Var = g2Var.s;
                int i13 = r2.D1;
                ri d02 = ri.d0(r2Var.a);
                String str = f2Var.I;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (g2Var.a == 1 && org.telegram.messenger.j6.d(f2Var.I)) {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = f2Var.I;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(r2Var.a).sendRequest(tL_messages_getStickers, new bi.o1(15, f2Var, str));
                        return;
                    }
                    String[] G0 = org.telegram.messenger.g0.G0();
                    String[] strArr = f2Var.K;
                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                        ri.d0(r2Var.a).O(G0, false);
                    }
                    f2Var.K = G0;
                    d02.X(G0, f2Var.I, false, new a3.h(f2Var, str, d02, 10), false, false, false, true, 50);
                    return;
                }
                ArrayList k02 = d02.k0(7, false);
                f2Var.y = 0;
                arrayList2.clear();
                arrayList.clear();
                f2Var.E.clear();
                f2Var.n.clear();
                f2Var.y++;
                arrayList2.add(null);
                arrayList.add(0L);
                arrayList2.addAll(k02);
                f2Var.y = k02.size() + f2Var.y;
                f2Var.J = f2Var.I;
                f2Var.f();
                w1.z1(g2Var.b, 0, 0);
                g2Var.f.c(false);
                g2Var.e.n(false);
                return;
            case 8:
                l2 l2Var = (l2) ((ah.j) this.b).b;
                if (l2Var.n) {
                    return;
                }
                l2Var.r.setVisibility(8);
                return;
            case 9:
                o2 o2Var = (o2) ((h6.s) this.b).b;
                ArrayList arrayList3 = o2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                o2Var.l.e(true, 0.0f);
                int i14 = o2Var.k + 1;
                o2Var.k = i14;
                if (i14 > arrayList3.size() - 1) {
                    o2Var.k = 0;
                }
                ch.g0 g0Var = o2Var.j;
                g0Var.e((ch.p0) arrayList3.get(o2Var.k));
                o2Var.j = o2Var.i;
                o2Var.i = g0Var;
                o2Var.p.invalidate();
                return;
            case 10:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 11:
                ((i3) this.b).b(null);
                return;
            case 12:
                ((l3) this.b).E();
                return;
            case 13:
                ga gaVar = (ga) this.b;
                if (gaVar.J) {
                    gaVar.J = false;
                    gaVar.invalidate();
                    return;
                }
                return;
            case 14:
                n6 n6Var = (n6) ((m6) this.b).q;
                n6Var.R = System.currentTimeMillis();
                n6Var.S = 0L;
                n6Var.s0 = true;
                ((ka) n6Var.a).a.K0.a(0L, true);
                n6Var.invalidate();
                return;
            case 15:
                q qVar = (q) this.b;
                if (qVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qVar.getParent()).removeView(qVar);
                    return;
                }
                return;
            case 16:
                e eVar = (e) this.b;
                if (eVar != null) {
                    eVar.setLoading(false);
                    return;
                }
                return;
            case 17:
                ((h9) ((ah.n) this.b).n).fullScroll(ks.O1);
                return;
            case 18:
                mb mbVar = (mb) this.b;
                mbVar.h0.onTouchEvent(org.telegram.messenger.g0.R());
                mbVar.g0.I2(org.telegram.messenger.g0.R());
                return;
            case 19:
                nb nbVar = (nb) ((p3) this.b).m0;
                nbVar.u(true);
                nbVar.B0.setCameraThumb(nbVar.z());
                return;
            case 20:
                qa qaVar = (qa) this.b;
                nb nbVar2 = qaVar.c0;
                if (nbVar2.R1 || nbVar2.Q1 || nbVar2.C0 == null || nbVar2.g0 != 0 || nbVar2.n1 == null) {
                    return;
                }
                String N0 = gd.N0(qaVar.isFrontface() ? 2131744469 : 2131744468, null);
                u3 u3Var = nbVar2.n1;
                u3Var.h = u3.a(N0, u3Var.getTextPaint());
                nbVar2.n1.v(N0);
                nbVar2.n1.x();
                mp.g1().edit().putInt("storysvddualhint", mp.g1().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 21:
                ((org.telegram.ui.Components.p9) this.b).setVisibility(8);
                return;
            case 22:
                qb qbVar = (qb) this.b;
                try {
                    int round = Math.round(((qbVar.h * qbVar.g.getInteger("sample-rate")) / qbVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(qbVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(qbVar.g, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    createDecoderByType.getInputBuffers();
                    createDecoderByType.getOutputBuffers();
                    short[] sArr = new short[32];
                    int i15 = -1;
                    boolean z13 = false;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    short s9 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int i19 = i15;
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = qbVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                i7 = i11;
                                z10 = z12;
                                bufferInfo = bufferInfo2;
                                j3 = 2500;
                                try {
                                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                    i10 = i19;
                                    z11 = z10;
                                } catch (Exception e10) {
                                    e = e10;
                                    org.telegram.messenger.a8.g(e, z10);
                                    return;
                                }
                            } else {
                                i7 = i11;
                                z11 = z13;
                                z10 = z12;
                                bufferInfo = bufferInfo2;
                                j3 = 2500;
                                i10 = i19;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, qbVar.f.getSampleTime(), 0);
                                qbVar.f.advance();
                            }
                        } else {
                            i7 = i11;
                            z11 = z13;
                            z10 = z12;
                            bufferInfo = bufferInfo2;
                            j3 = 2500;
                            i10 = i19;
                        }
                        if (i10 >= 0) {
                            createDecoderByType.getOutputBuffer(i10).position(0);
                        }
                        i15 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j3);
                        while (i15 != -1 && !z11) {
                            if (i15 >= 0) {
                                ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i15);
                                if (outputBuffer != null && bufferInfo.size > 0) {
                                    int i20 = i18;
                                    while (outputBuffer.remaining() > 0) {
                                        short s10 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                        if (i20 >= round) {
                                            sArr[i16 - i17] = s9;
                                            int i21 = i16 + 1;
                                            int i22 = i21 - i17;
                                            if (i22 >= sArr.length || i21 >= qbVar.b) {
                                                short[] sArr2 = new short[sArr.length];
                                                org.telegram.messenger.g0.g3(new ai.e1(qbVar, sArr, i22, 17));
                                                i17 = i21;
                                                sArr = sArr2;
                                            }
                                            if (i21 >= qbVar.d.length) {
                                                i18 = 0;
                                                s9 = 0;
                                                i16 = i21;
                                            } else {
                                                s5 = 0;
                                                i16 = i21;
                                                i20 = 0;
                                            }
                                        } else {
                                            s5 = s9;
                                        }
                                        s9 = s5 < s10 ? s10 : s5;
                                        i20++;
                                        int i23 = i7;
                                        if (outputBuffer.remaining() < i23) {
                                            i18 = i20;
                                        } else {
                                            outputBuffer.position(outputBuffer.position() + i23);
                                            i7 = 8;
                                        }
                                    }
                                    i18 = i20;
                                }
                                createDecoderByType.releaseOutputBuffer(i15, false);
                                if ((bufferInfo.flags & 4) != 0) {
                                    z13 = z10;
                                    int i24 = i16;
                                    synchronized (qbVar.i) {
                                        try {
                                            if (!qbVar.j) {
                                                if (!z13 && i24 < qbVar.b) {
                                                    i16 = i24;
                                                    z12 = z10;
                                                    i11 = 8;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else if (i15 == -3) {
                                createDecoderByType.getOutputBuffers();
                            }
                            i15 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                            i7 = 8;
                        }
                        z13 = z11;
                        int i242 = i16;
                        synchronized (qbVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    qbVar.f.release();
                    return;
                } catch (Exception e11) {
                    e = e11;
                    z10 = z12;
                }
                break;
            case 23:
                sb sbVar = (sb) this.b;
                vb vbVar = sbVar.c;
                if (vbVar != null) {
                    long j10 = vbVar.a;
                    if (j10 > 0) {
                        sbVar.e = j10;
                        sbVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                vb vbVar2 = (vb) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = vbVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(vbVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(vbVar2.f, vbVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(vbVar2.f / bitmap.getWidth(), vbVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.w(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.w(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (vbVar2.h) {
                            if (vbVar2.m == null) {
                                vbVar2.m = new Path();
                            }
                            vbVar2.m.rewind();
                            vbVar2.m.addCircle(vbVar2.f / 2.0f, vbVar2.g / 2.0f, Math.min(vbVar2.f, vbVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(vbVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, vbVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                org.telegram.messenger.g0.g3(new c(22, vbVar2, bitmap));
                return;
            case 25:
                ii.t tVar = (ii.t) this.b;
                st0 st0Var = tVar.V;
                if (st0Var == null || tVar.b0 == -1) {
                    return;
                }
                st0Var.a();
                return;
            case 26:
                fi.b6 b6Var = ((jg.l1) this.b).E;
                if (b6Var != null) {
                    b6Var.p(3, true);
                    return;
                }
                return;
            case 27:
                ji.q qVar2 = (ji.q) this.b;
                if (qVar2.p0) {
                    return;
                }
                qVar2.setVisibility(8);
                qVar2.s();
                ji.q qVar3 = qVar2.a.h;
                if (qVar3 != null) {
                    org.telegram.messenger.g0.E2(qVar3);
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
                org.telegram.ui.Components.kc.b0(LaunchActivity.Q()).k(false).j();
                return;
        }
    }
}
