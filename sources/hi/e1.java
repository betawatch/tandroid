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
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.xb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class e1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ed A[SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        boolean z11;
        short[] sArr;
        long j3;
        MediaCodec.BufferInfo bufferInfo;
        boolean z12;
        short s5;
        int i7 = 14;
        Bitmap bitmap = null;
        int i10 = 0;
        boolean z13 = true;
        switch (this.a) {
            case 0:
                a5 a5Var = (a5) this.b;
                xb.e();
                ug.x0 x0Var = new ug.x0((org.telegram.ui.ActionBar.e2) new bi.t6(a5Var), 14, false);
                x0Var.setOnDismissListener(new f1(0));
                x0Var.show();
                return;
            case 1:
                ((r1) this.b).G();
                return;
            case 2:
                x1 x1Var = (x1) this.b;
                ArrayList arrayList = x1Var.w;
                ArrayList arrayList2 = x1Var.s;
                y1 y1Var = x1Var.O;
                i2 i2Var = y1Var.s;
                int i11 = i2.C1;
                si b02 = si.b0(i2Var.a);
                String str = x1Var.I;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (y1Var.a == 1 && org.telegram.messenger.j6.d(x1Var.I)) {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = x1Var.I;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(i2Var.a).sendRequest(tL_messages_getStickers, new bi.v2(i7, x1Var, str));
                        return;
                    }
                    String[] G0 = org.telegram.messenger.g0.G0();
                    String[] strArr = x1Var.K;
                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                        si.b0(i2Var.a).M(G0, false);
                    }
                    x1Var.K = G0;
                    b02.V(G0, x1Var.I, false, new a3.h(x1Var, str, b02, 10), false, false, false, true, 50);
                    return;
                }
                ArrayList i02 = b02.i0(7, false);
                x1Var.y = 0;
                arrayList2.clear();
                arrayList.clear();
                x1Var.E.clear();
                x1Var.n.clear();
                x1Var.y++;
                arrayList2.add(null);
                arrayList.add(0L);
                arrayList2.addAll(i02);
                x1Var.y = i02.size() + x1Var.y;
                x1Var.J = x1Var.I;
                x1Var.f();
                o1.z1(y1Var.b, 0, 0);
                y1Var.f.c(false);
                y1Var.e.n(false);
                return;
            case 3:
                d2 d2Var = (d2) ((ah.j) this.b).b;
                if (d2Var.n) {
                    return;
                }
                d2Var.r.setVisibility(8);
                return;
            case 4:
                g2 g2Var = (g2) ((h6.r) this.b).b;
                ArrayList arrayList3 = g2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                g2Var.l.e(true, 0.0f);
                int i12 = g2Var.k + 1;
                g2Var.k = i12;
                if (i12 > arrayList3.size() - 1) {
                    g2Var.k = 0;
                }
                ch.g0 g0Var = g2Var.j;
                g0Var.e((ch.p0) arrayList3.get(g2Var.k));
                g2Var.j = g2Var.i;
                g2Var.i = g0Var;
                g2Var.p.invalidate();
                return;
            case 5:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 6:
                ((z2) this.b).b(null);
                return;
            case 7:
                ((c3) this.b).E();
                return;
            case 8:
                l9 l9Var = (l9) this.b;
                if (l9Var.J) {
                    l9Var.J = false;
                    l9Var.invalidate();
                    return;
                }
                return;
            case 9:
                f6 f6Var = (f6) ((e6) this.b).q;
                f6Var.R = System.currentTimeMillis();
                f6Var.S = 0L;
                f6Var.s0 = true;
                ((p9) f6Var.a).a.K0.a(0L, true);
                f6Var.invalidate();
                return;
            case 10:
                p pVar = (p) this.b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 11:
                d dVar = (d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 12:
                ((n8) ((ah.n) this.b).n).fullScroll(ns.O1);
                return;
            case 13:
                ra raVar = (ra) this.b;
                raVar.h0.onTouchEvent(org.telegram.messenger.g0.R());
                raVar.g0.B0(org.telegram.messenger.g0.R());
                return;
            case 14:
                sa saVar = (sa) ((g3) this.b).m0;
                saVar.u(true);
                saVar.B0.setCameraThumb(saVar.z());
                return;
            case 15:
                ((u9) this.b).k2.q1.setVisibility(8);
                return;
            case 16:
                v9 v9Var = (v9) this.b;
                sa saVar2 = v9Var.c0;
                if (saVar2.R1 || saVar2.Q1 || saVar2.C0 == null || saVar2.g0 != 0 || saVar2.n1 == null) {
                    return;
                }
                String M0 = hd.M0(v9Var.isFrontface() ? 2131744710 : 2131744709, null);
                l3 l3Var = saVar2.n1;
                l3Var.h = l3.a(M0, l3Var.getTextPaint());
                saVar2.n1.u(M0);
                saVar2.n1.w();
                np.e1().edit().putInt("storysvddualhint", np.e1().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 17:
                ((org.telegram.ui.Components.i9) this.b).setVisibility(8);
                return;
            case 18:
                va vaVar = (va) this.b;
                try {
                    int round = Math.round(((vaVar.h * vaVar.g.getInteger("sample-rate")) / vaVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(vaVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(vaVar.g, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    createDecoderByType.getInputBuffers();
                    createDecoderByType.getOutputBuffers();
                    short[] sArr2 = new short[32];
                    int i13 = -1;
                    boolean z14 = false;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    short s9 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = vaVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), i10);
                            if (readSampleData < 0) {
                                sArr = sArr2;
                                j3 = 2500;
                                try {
                                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                    z10 = z13;
                                    bufferInfo = bufferInfo2;
                                    z14 = z10;
                                } catch (Exception e10) {
                                    e = e10;
                                    z11 = z13;
                                    org.telegram.messenger.a8.g(e, z11);
                                    return;
                                }
                            } else {
                                sArr = sArr2;
                                j3 = 2500;
                                z10 = z13;
                                bufferInfo = bufferInfo2;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, vaVar.f.getSampleTime(), 0);
                                vaVar.f.advance();
                            }
                        } else {
                            sArr = sArr2;
                            z10 = z13;
                            j3 = 2500;
                            bufferInfo = bufferInfo2;
                        }
                        if (i13 >= 0) {
                            try {
                                createDecoderByType.getOutputBuffer(i13).position(i10);
                            } catch (Exception e11) {
                                e = e11;
                                z11 = z10;
                                org.telegram.messenger.a8.g(e, z11);
                                return;
                            }
                        }
                        i13 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j3);
                        while (true) {
                            if (i13 != -1 && !z14) {
                                if (i13 >= 0) {
                                    ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i13);
                                    if (outputBuffer != null && bufferInfo.size > 0) {
                                        int i17 = i16;
                                        short[] sArr3 = sArr;
                                        while (true) {
                                            if (outputBuffer.remaining() > 0) {
                                                short s10 = (short) (((outputBuffer.get() & 255) << 8) | (outputBuffer.get() & 255));
                                                if (i17 >= round) {
                                                    sArr3[i14 - i15] = s9;
                                                    int i18 = i14 + 1;
                                                    int i19 = i18 - i15;
                                                    if (i19 < sArr3.length && i18 < vaVar.b) {
                                                        sArr = sArr3;
                                                        i14 = i18;
                                                        if (i18 < vaVar.d.length) {
                                                            z12 = 0;
                                                            i16 = 0;
                                                            s9 = 0;
                                                        } else {
                                                            sArr3 = sArr;
                                                            s5 = 0;
                                                            i17 = 0;
                                                        }
                                                    }
                                                    short[] sArr4 = new short[sArr3.length];
                                                    org.telegram.messenger.g0.h3(new ai.z0(vaVar, sArr3, i19, 17));
                                                    sArr = sArr4;
                                                    i15 = i18;
                                                    i14 = i18;
                                                    if (i18 < vaVar.d.length) {
                                                    }
                                                } else {
                                                    s5 = s9;
                                                }
                                                s9 = s5 < s10 ? s10 : s5;
                                                i17++;
                                                if (outputBuffer.remaining() < 8) {
                                                    i16 = i17;
                                                    sArr = sArr3;
                                                } else {
                                                    outputBuffer.position(outputBuffer.position() + 8);
                                                    i10 = 0;
                                                }
                                            } else {
                                                z12 = i10;
                                                i16 = i17;
                                                sArr = sArr3;
                                            }
                                        }
                                        createDecoderByType.releaseOutputBuffer(i13, z12);
                                        if ((bufferInfo.flags & 4) != 0) {
                                            z14 = z10;
                                        }
                                    }
                                    z12 = 0;
                                    createDecoderByType.releaseOutputBuffer(i13, z12);
                                    if ((bufferInfo.flags & 4) != 0) {
                                    }
                                } else if (i13 == -3) {
                                    createDecoderByType.getOutputBuffers();
                                }
                                i13 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                                i10 = 0;
                            }
                        }
                        int i20 = i14;
                        sArr2 = sArr;
                        synchronized (vaVar.i) {
                            try {
                                if (!vaVar.j) {
                                    if (!z14 && i20 < vaVar.b) {
                                        i14 = i20;
                                        z13 = z10;
                                        i10 = 0;
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    vaVar.f.release();
                    return;
                } catch (Exception e12) {
                    e = e12;
                    z10 = z13;
                }
                break;
            case 19:
                xa xaVar = (xa) this.b;
                ab abVar = xaVar.c;
                if (abVar != null) {
                    long j10 = abVar.a;
                    if (j10 > 0) {
                        xaVar.e = j10;
                        xaVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ab abVar2 = (ab) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = abVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(abVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(abVar2.f, abVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(abVar2.f / bitmap.getWidth(), abVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.w(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.w(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (abVar2.h) {
                            if (abVar2.m == null) {
                                abVar2.m = new Path();
                            }
                            abVar2.m.rewind();
                            abVar2.m.addCircle(abVar2.f / 2.0f, abVar2.g / 2.0f, Math.min(abVar2.f, abVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(abVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, abVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                }
                org.telegram.messenger.g0.h3(new h4(16, abVar2, bitmap));
                return;
            case 21:
                ii.f fVar = (ii.f) this.b;
                it0 it0Var = fVar.V;
                if (it0Var == null || fVar.b0 == -1) {
                    return;
                }
                it0Var.a();
                return;
            case 22:
                fi.d6 d6Var = ((jg.l1) this.b).E;
                if (d6Var != null) {
                    d6Var.p(3, true);
                    return;
                }
                return;
            case 23:
                ji.p pVar2 = (ji.p) this.b;
                if (pVar2.n0) {
                    return;
                }
                pVar2.setVisibility(8);
                pVar2.s();
                ji.p pVar3 = pVar2.a.h;
                if (pVar3 != null) {
                    org.telegram.messenger.g0.E2(pVar3);
                    Log.d("VoiceLive", "overlay removed");
                    return;
                }
                return;
            case 24:
                kg.c cVar = (kg.c) this.b;
                cVar.b.g3.O(true);
                cVar.a0(true);
                return;
            case 25:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) this.b).link);
                cc.a0(LaunchActivity.Q()).k(false).j();
                return;
            case 26:
                kg.i0 i0Var = (kg.i0) this.b;
                p41 p41Var = i0Var.a2;
                if (p41Var != null) {
                    p41Var.O(true);
                }
                i0Var.d1(true);
                return;
            case 27:
                kg.q0 q0Var = (kg.q0) ((gc.b) this.b).b;
                q0Var.c.g3.O(true);
                q0Var.g0();
                return;
            case 28:
                kg.s0 s0Var = (kg.s0) this.b;
                s0Var.b.g3.O(true);
                s0Var.a0(true);
                return;
            default:
                kg.c1 c1Var = (kg.c1) this.b;
                c1Var.a.g3.O(true);
                c1Var.d0(true);
                return;
        }
    }
}
