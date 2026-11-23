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
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.si;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z10;
        int i7;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        long j3;
        int i11;
        int i12;
        short s5;
        Bitmap bitmap = null;
        int i13 = 8;
        boolean z11 = true;
        int i14 = 0;
        switch (this.a) {
            case 0:
                ((n) this.b).invalidateSelf();
                return;
            case 1:
                ((f0) this.b).g = -1L;
                return;
            case 2:
                o0 o0Var = (o0) this.b;
                tg.i iVar = o0Var.b.I;
                if (iVar != null) {
                    iVar.b();
                }
                o0Var.b.k();
                return;
            case 3:
                ((w0) this.b).a(false);
                return;
            case 4:
                y4 y4Var = (y4) this.b;
                gc.e();
                ug.y0 y0Var = new ug.y0((org.telegram.ui.ActionBar.g2) new bi.b9(y4Var), 14, false);
                y0Var.setOnDismissListener(new f1(i14));
                y0Var.show();
                return;
            case 5:
                ((r1) this.b).G();
                return;
            case 6:
                x1 x1Var = (x1) this.b;
                ArrayList arrayList = x1Var.w;
                ArrayList arrayList2 = x1Var.s;
                y1 y1Var = x1Var.O;
                i2 i2Var = y1Var.s;
                int i15 = i2.C1;
                si d02 = si.d0(i2Var.a);
                String str = x1Var.I;
                if (!"premium".equalsIgnoreCase(str)) {
                    if (y1Var.a == 1 && org.telegram.messenger.j6.d(x1Var.I)) {
                        TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                        tL_messages_getStickers.emoticon = x1Var.I;
                        tL_messages_getStickers.hash = 0L;
                        ConnectionsManager.getInstance(i2Var.a).sendRequest(tL_messages_getStickers, new bi.o1(15, x1Var, str));
                        return;
                    }
                    String[] G0 = org.telegram.messenger.g0.G0();
                    String[] strArr = x1Var.K;
                    if (strArr == null || !Arrays.equals(G0, strArr)) {
                        si.d0(i2Var.a).O(G0, false);
                    }
                    x1Var.K = G0;
                    d02.X(G0, x1Var.I, false, new a3.h(x1Var, str, d02, 10), false, false, false, true, 50);
                    return;
                }
                ArrayList k02 = d02.k0(7, false);
                x1Var.y = 0;
                arrayList2.clear();
                arrayList.clear();
                x1Var.E.clear();
                x1Var.n.clear();
                x1Var.y++;
                arrayList2.add(null);
                arrayList.add(0L);
                arrayList2.addAll(k02);
                x1Var.y = k02.size() + x1Var.y;
                x1Var.J = x1Var.I;
                x1Var.f();
                o1.z1(y1Var.b, 0, 0);
                y1Var.f.c(false);
                y1Var.e.n(false);
                return;
            case 7:
                d2 d2Var = (d2) ((ah.j) this.b).b;
                if (d2Var.n) {
                    return;
                }
                d2Var.r.setVisibility(8);
                return;
            case 8:
                g2 g2Var = (g2) ((h6.r) this.b).b;
                ArrayList arrayList3 = g2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                g2Var.l.e(true, 0.0f);
                int i16 = g2Var.k + 1;
                g2Var.k = i16;
                if (i16 > arrayList3.size() - 1) {
                    g2Var.k = 0;
                }
                ch.g0 g0Var = g2Var.j;
                g0Var.e((ch.p0) arrayList3.get(g2Var.k));
                g2Var.j = g2Var.i;
                g2Var.i = g0Var;
                g2Var.p.invalidate();
                return;
            case 9:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 10:
                ((z2) this.b).b(null);
                return;
            case 11:
                ((c3) this.b).E();
                return;
            case 12:
                l9 l9Var = (l9) this.b;
                if (l9Var.J) {
                    l9Var.J = false;
                    l9Var.invalidate();
                    return;
                }
                return;
            case 13:
                d6 d6Var = (d6) ((c6) this.b).q;
                d6Var.R = System.currentTimeMillis();
                d6Var.S = 0L;
                d6Var.s0 = true;
                ((p9) d6Var.a).a.K0.a(0L, true);
                d6Var.invalidate();
                return;
            case 14:
                r rVar = (r) this.b;
                if (rVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) rVar.getParent()).removeView(rVar);
                    return;
                }
                return;
            case 15:
                e eVar = (e) this.b;
                if (eVar != null) {
                    eVar.setLoading(false);
                    return;
                }
                return;
            case 16:
                ((m8) ((ah.n) this.b).n).fullScroll(ls.O1);
                return;
            case 17:
                ra raVar = (ra) this.b;
                raVar.h0.onTouchEvent(org.telegram.messenger.g0.R());
                raVar.g0.w0(org.telegram.messenger.g0.R());
                return;
            case 18:
                sa saVar = (sa) ((g3) this.b).m0;
                saVar.u(true);
                saVar.B0.setCameraThumb(saVar.z());
                return;
            case 19:
                ((u9) this.b).k2.q1.setVisibility(8);
                return;
            case 20:
                v9 v9Var = (v9) this.b;
                sa saVar2 = v9Var.c0;
                if (saVar2.R1 || saVar2.Q1 || saVar2.C0 == null || saVar2.g0 != 0 || saVar2.n1 == null) {
                    return;
                }
                String N0 = hd.N0(v9Var.isFrontface() ? 2131744467 : 2131744466, null);
                l3 l3Var = saVar2.n1;
                l3Var.h = l3.a(N0, l3Var.getTextPaint());
                saVar2.n1.v(N0);
                saVar2.n1.x();
                np.g1().edit().putInt("storysvddualhint", np.g1().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 21:
                ((org.telegram.ui.Components.q9) this.b).setVisibility(8);
                return;
            case 22:
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
                            int readSampleData = vaVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                z10 = z11;
                                bufferInfo = bufferInfo2;
                                i7 = round;
                                j3 = 2500;
                                try {
                                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                    i10 = i13;
                                    i11 = i21;
                                    z12 = z10;
                                } catch (Exception e10) {
                                    e = e10;
                                    org.telegram.messenger.a8.g(e, z10);
                                    return;
                                }
                            } else {
                                i7 = round;
                                z10 = z11;
                                bufferInfo = bufferInfo2;
                                j3 = 2500;
                                i10 = i13;
                                i11 = i21;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, vaVar.f.getSampleTime(), 0);
                                vaVar.f.advance();
                            }
                        } else {
                            i7 = round;
                            i10 = i13;
                            z10 = z11;
                            bufferInfo = bufferInfo2;
                            j3 = 2500;
                            i11 = i21;
                        }
                        if (i11 >= 0) {
                            createDecoderByType.getOutputBuffer(i11).position(0);
                        }
                        i17 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j3);
                        while (i17 != -1 && !z12) {
                            if (i17 >= 0) {
                                ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i17);
                                if (outputBuffer == null || bufferInfo.size <= 0) {
                                    i12 = i7;
                                } else {
                                    int i22 = i20;
                                    while (true) {
                                        if (outputBuffer.remaining() > 0) {
                                            short s10 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                            i12 = i7;
                                            if (i22 >= i12) {
                                                sArr[i18 - i19] = s9;
                                                int i23 = i18 + 1;
                                                int i24 = i23 - i19;
                                                if (i24 >= sArr.length || i23 >= vaVar.b) {
                                                    short[] sArr2 = new short[sArr.length];
                                                    org.telegram.messenger.g0.g3(new ai.j1(vaVar, sArr, i24, 17));
                                                    sArr = sArr2;
                                                    i19 = i23;
                                                }
                                                if (i23 >= vaVar.d.length) {
                                                    i20 = 0;
                                                    s9 = 0;
                                                    i18 = i23;
                                                } else {
                                                    s5 = 0;
                                                    i18 = i23;
                                                    i22 = 0;
                                                }
                                            } else {
                                                s5 = s9;
                                            }
                                            s9 = s5 < s10 ? s10 : s5;
                                            i22++;
                                            int i25 = i10;
                                            if (outputBuffer.remaining() >= i25) {
                                                outputBuffer.position(outputBuffer.position() + i25);
                                                i7 = i12;
                                                i10 = 8;
                                            }
                                        } else {
                                            i12 = i7;
                                        }
                                    }
                                    i20 = i22;
                                }
                                createDecoderByType.releaseOutputBuffer(i17, false);
                                if ((bufferInfo.flags & 4) != 0) {
                                    z12 = z10;
                                    int i26 = i18;
                                    synchronized (vaVar.i) {
                                        try {
                                            if (!vaVar.j) {
                                                if (!z12 && i26 < vaVar.b) {
                                                    i18 = i26;
                                                    round = i12;
                                                    z11 = z10;
                                                    i13 = 8;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                i12 = i7;
                                if (i17 == -3) {
                                    createDecoderByType.getOutputBuffers();
                                }
                            }
                            i17 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                            i7 = i12;
                            i10 = 8;
                        }
                        i12 = i7;
                        int i262 = i18;
                        synchronized (vaVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    vaVar.f.release();
                    return;
                } catch (Exception e11) {
                    e = e11;
                    z10 = z11;
                }
                break;
            case 23:
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
            case 24:
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
                } catch (Exception e12) {
                    org.telegram.messenger.a8.g(e12, true);
                }
                org.telegram.messenger.g0.g3(new c(20, abVar2, bitmap));
                return;
            case 25:
                ii.t tVar = (ii.t) this.b;
                tt0 tt0Var = tVar.V;
                if (tt0Var == null || tVar.b0 == -1) {
                    return;
                }
                tt0Var.a();
                return;
            case 26:
                fi.b6 b6Var = ((jg.l1) this.b).E;
                if (b6Var != null) {
                    b6Var.p(3, true);
                    return;
                }
                return;
            case 27:
                ji.r rVar2 = (ji.r) this.b;
                if (rVar2.p0) {
                    return;
                }
                rVar2.setVisibility(8);
                rVar2.s();
                ji.r rVar3 = rVar2.a.h;
                if (rVar3 != null) {
                    org.telegram.messenger.g0.E2(rVar3);
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
