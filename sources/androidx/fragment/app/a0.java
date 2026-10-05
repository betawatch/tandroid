package androidx.fragment.app;

import ai.q5;
import ai.s1;
import ai.u8;
import ai.v1;
import ai.y3;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.view.Surface;
import android.view.ViewGroup;
import ci.aa;
import ci.ba;
import ci.bb;
import ci.d2;
import ci.e2;
import ci.e4;
import ci.f1;
import ci.fb;
import ci.i2;
import ci.i7;
import ci.j7;
import ci.jb;
import ci.jc;
import ci.kc;
import ci.l2;
import ci.mb;
import ci.nb;
import ci.nc;
import ci.o2;
import ci.p1;
import ci.p2;
import ci.pc;
import ci.r3;
import ci.s2;
import ci.tc;
import ci.v3;
import ci.w1;
import ci.y5;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.xi;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import rg.y0;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class a0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a0(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        int i11;
        int i12;
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        long j3;
        short s10;
        switch (this.a) {
            case 0:
                Iterator it = ((k0) this.b).n.iterator();
                if (it.hasNext()) {
                    throw a4.a.k(it);
                }
                return;
            case 1:
                androidx.lifecycle.e0 e0Var = (androidx.lifecycle.e0) this.b;
                androidx.lifecycle.v vVar = e0Var.f;
                if (e0Var.b == 0) {
                    e0Var.c = true;
                    vVar.e(androidx.lifecycle.m.ON_PAUSE);
                }
                if (e0Var.a == 0 && e0Var.c) {
                    vVar.e(androidx.lifecycle.m.ON_STOP);
                    e0Var.d = true;
                    return;
                }
                return;
            case 2:
                ((xi) this.b).hide();
                return;
            case 3:
                bi.u uVar = (bi.u) this.b;
                es0 es0Var = uVar.W;
                u8 u8Var = uVar.a;
                es0Var.a(u8Var == null ? "" : u8Var.E);
                return;
            case 4:
                ((c1.e) this.b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 5:
                ((ci.h) this.b).c.W = false;
                return;
            case 6:
                ((ci.l) this.b).invalidateSelf();
                return;
            case 7:
                ((ci.d0) this.b).g = -1L;
                return;
            case 8:
                ci.m0 m0Var = (ci.m0) this.b;
                qg.i iVar = m0Var.b.H;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.b.k();
                return;
            case 9:
                ((ci.v0) this.b).a(false);
                return;
            case 10:
                y5 y5Var = (y5) this.b;
                rc.e();
                y0 y0Var = new y0((n2) new y3(y5Var), 14, false);
                y0Var.setOnDismissListener(new f1(0));
                y0Var.show();
                return;
            case 11:
                ((w1) this.b).G();
                return;
            case 12:
                d2 d2Var = (d2) this.b;
                ArrayList arrayList = d2Var.v;
                ArrayList arrayList2 = d2Var.s;
                e2 e2Var = d2Var.N;
                s2 s2Var = e2Var.s;
                i10 = ((f3) s2Var).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str = d2Var.H;
                if ("premium".equalsIgnoreCase(str)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    d2Var.x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    d2Var.y.clear();
                    d2Var.n.clear();
                    d2Var.x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    d2Var.x = recentStickers.size() + d2Var.x;
                    d2Var.I = d2Var.H;
                    d2Var.l();
                    p1.x1(e2Var.b, 0, 0);
                    e2Var.f.c(false);
                    e2Var.e.n(false);
                    return;
                }
                if (e2Var.a == 1 && Emoji.fullyConsistsOfEmojis(d2Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = d2Var.H;
                    tL_messages_getStickers.hash = 0L;
                    i12 = ((f3) s2Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new v1(5, d2Var, str));
                    return;
                }
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = d2Var.J;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    i11 = ((f3) s2Var).currentAccount;
                    MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                d2Var.J = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, d2Var.H, false, new q5(d2Var, str, mediaDataController, 4), null, false, false, false, true, 50, false);
                return;
            case 13:
                l2 l2Var = (l2) ((i2) this.b).b;
                if (l2Var.h) {
                    return;
                }
                l2Var.n.setVisibility(8);
                return;
            case 14:
                p2 p2Var = (p2) ((o2) this.b).b;
                ArrayList arrayList3 = p2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                p2Var.l.d(0.0f, true);
                int i13 = p2Var.k + 1;
                p2Var.k = i13;
                if (i13 > arrayList3.size() - 1) {
                    p2Var.k = 0;
                }
                zg.d0 d0Var = p2Var.j;
                d0Var.e((zg.m0) arrayList3.get(p2Var.k));
                p2Var.j = p2Var.i;
                p2Var.i = d0Var;
                p2Var.p.invalidate();
                return;
            case 15:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 16:
                ((r3) this.b).b(null);
                return;
            case 17:
                ((v3) this.b).E();
                return;
            case 18:
                bb bbVar = (bb) this.b;
                if (bbVar.I) {
                    bbVar.I = false;
                    bbVar.invalidate();
                    return;
                }
                return;
            case 19:
                j7 j7Var = ((i7) this.b).p;
                j7Var.Q = System.currentTimeMillis();
                j7Var.R = 0L;
                j7Var.r0 = true;
                ((fb) j7Var.a).a.J0.a(0L, true);
                j7Var.invalidate();
                return;
            case 20:
                ci.p pVar = (ci.p) this.b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 21:
                ci.d dVar = (ci.d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 22:
                ((ba) ((aa) this.b).n).fullScroll(130);
                return;
            case 23:
                jc jcVar = (jc) this.b;
                jcVar.x0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                jcVar.w0.G(AndroidUtilities.emptyMotionEvent());
                return;
            case 24:
                kc kcVar = ((jb) this.b).k0;
                kcVar.v(true);
                kcVar.A0.setCameraThumb(kcVar.A());
                return;
            case 25:
                ((mb) this.b).A2.p1.setVisibility(8);
                return;
            case 26:
                nb nbVar = (nb) this.b;
                kc kcVar2 = nbVar.b0;
                if (kcVar2.Q1 || kcVar2.P1 || kcVar2.B0 == null || kcVar2.f0 != 0 || kcVar2.m1 == null) {
                    return;
                }
                String string = LocaleController.getString(nbVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                e4 e4Var = kcVar2.m1;
                e4Var.h = e4.a(string, e4Var.getTextPaint());
                kcVar2.m1.s(string);
                kcVar2.m1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 27:
                ((w9) this.b).setVisibility(8);
                return;
            case 28:
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
                    short[] sArr = new short[32];
                    boolean z11 = false;
                    int i14 = -1;
                    int i15 = 0;
                    int i16 = 0;
                    int i17 = 0;
                    short s11 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = ncVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                j3 = 2500;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                z10 = true;
                            } else {
                                z10 = z11;
                                j3 = 2500;
                                bufferInfo = bufferInfo2;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, ncVar.f.getSampleTime(), 0);
                                ncVar.f.advance();
                            }
                        } else {
                            bufferInfo = bufferInfo2;
                            z10 = z11;
                            j3 = 2500;
                        }
                        if (i14 >= 0) {
                            createDecoderByType.getOutputBuffer(i14).position(0);
                        }
                        MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                        i14 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, j3);
                        while (i14 != -1 && !z10) {
                            if (i14 >= 0) {
                                ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i14);
                                if (outputBuffer != null && bufferInfo3.size > 0) {
                                    int i18 = i17;
                                    while (outputBuffer.remaining() > 0) {
                                        short s12 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                        if (i18 >= round) {
                                            sArr[i15 - i16] = s11;
                                            i15++;
                                            int i19 = i15 - i16;
                                            if (i19 >= sArr.length || i15 >= ncVar.b) {
                                                short[] sArr2 = new short[sArr.length];
                                                AndroidUtilities.runOnUIThread(new s1(ncVar, sArr, i19, 7));
                                                sArr = sArr2;
                                                i16 = i15;
                                            }
                                            if (i15 >= ncVar.d.length) {
                                                i17 = 0;
                                                s11 = 0;
                                            } else {
                                                i18 = 0;
                                                s10 = 0;
                                            }
                                        } else {
                                            s10 = s11;
                                        }
                                        s11 = s10 < s12 ? s12 : s10;
                                        i18++;
                                        if (outputBuffer.remaining() < 8) {
                                            i17 = i18;
                                        } else {
                                            outputBuffer.position(outputBuffer.position() + 8);
                                        }
                                    }
                                    i17 = i18;
                                }
                                createDecoderByType.releaseOutputBuffer(i14, false);
                                if ((bufferInfo3.flags & 4) != 0) {
                                    z11 = true;
                                    synchronized (ncVar.i) {
                                        try {
                                            if (!ncVar.j) {
                                                if (!z11 && i15 < ncVar.b) {
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else if (i14 == -3) {
                                createDecoderByType.getOutputBuffers();
                            }
                            i14 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, 2500L);
                        }
                        z11 = z10;
                        synchronized (ncVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    ncVar.f.release();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                pc pcVar = (pc) this.b;
                tc tcVar = pcVar.c;
                if (tcVar != null) {
                    long j10 = tcVar.a;
                    if (j10 > 0) {
                        pcVar.e = j10;
                        pcVar.l.q();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
