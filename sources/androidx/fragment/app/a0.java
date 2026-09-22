package androidx.fragment.app;

import ai.r5;
import ai.s1;
import ai.t8;
import ai.v1;
import ai.y3;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.view.Surface;
import android.view.ViewGroup;
import ci.d2;
import ci.e2;
import ci.ea;
import ci.f1;
import ci.f4;
import ci.fa;
import ci.fb;
import ci.i2;
import ci.jb;
import ci.k7;
import ci.l2;
import ci.l7;
import ci.nb;
import ci.nc;
import ci.p1;
import ci.p2;
import ci.q2;
import ci.qb;
import ci.rb;
import ci.rc;
import ci.s3;
import ci.t2;
import ci.tc;
import ci.w1;
import ci.w3;
import ci.xc;
import ci.z5;
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
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
                ((vi) this.b).hide();
                return;
            case 3:
                bi.u uVar = (bi.u) this.b;
                mr0 mr0Var = uVar.W;
                t8 t8Var = uVar.a;
                mr0Var.a(t8Var == null ? "" : t8Var.E);
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
                z5 z5Var = (z5) this.b;
                oc.e();
                rg.x0 x0Var = new rg.x0((n2) new y3(z5Var), 14, false);
                x0Var.setOnDismissListener(new f1(0));
                x0Var.show();
                return;
            case 11:
                ((w1) this.b).G();
                return;
            case 12:
                d2 d2Var = (d2) this.b;
                ArrayList arrayList = d2Var.v;
                ArrayList arrayList2 = d2Var.s;
                e2 e2Var = d2Var.N;
                t2 t2Var = e2Var.s;
                i10 = ((f3) t2Var).currentAccount;
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
                    p1.w1(e2Var.b, 0, 0);
                    e2Var.f.c(false);
                    e2Var.e.n(false);
                    return;
                }
                if (e2Var.a == 1 && Emoji.fullyConsistsOfEmojis(d2Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = d2Var.H;
                    tL_messages_getStickers.hash = 0L;
                    i12 = ((f3) t2Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new v1(5, d2Var, str));
                    return;
                }
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = d2Var.J;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    i11 = ((f3) t2Var).currentAccount;
                    MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                d2Var.J = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, d2Var.H, false, new r5(d2Var, str, mediaDataController, 4), null, false, false, false, true, 50, false);
                return;
            case 13:
                l2 l2Var = (l2) ((i2) this.b).b;
                if (l2Var.h) {
                    return;
                }
                l2Var.n.setVisibility(8);
                return;
            case 14:
                q2 q2Var = (q2) ((p2) this.b).b;
                ArrayList arrayList3 = q2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                q2Var.l.d(0.0f, true);
                int i13 = q2Var.k + 1;
                q2Var.k = i13;
                if (i13 > arrayList3.size() - 1) {
                    q2Var.k = 0;
                }
                zg.g0 g0Var = q2Var.j;
                g0Var.e((zg.p0) arrayList3.get(q2Var.k));
                q2Var.j = q2Var.i;
                q2Var.i = g0Var;
                q2Var.p.invalidate();
                return;
            case 15:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 16:
                ((s3) this.b).b(null);
                return;
            case 17:
                ((w3) this.b).E();
                return;
            case 18:
                fb fbVar = (fb) this.b;
                if (fbVar.I) {
                    fbVar.I = false;
                    fbVar.invalidate();
                    return;
                }
                return;
            case 19:
                l7 l7Var = ((k7) this.b).p;
                l7Var.Q = System.currentTimeMillis();
                l7Var.R = 0L;
                l7Var.r0 = true;
                ((jb) l7Var.a).a.J0.a(0L, true);
                l7Var.invalidate();
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
                ((fa) ((ea) this.b).n).fullScroll(130);
                return;
            case 23:
                nc ncVar = (nc) this.b;
                ncVar.x0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                ncVar.w0.y(AndroidUtilities.emptyMotionEvent());
                return;
            case 24:
                ci.oc ocVar = ((nb) this.b).k0;
                ocVar.v(true);
                ocVar.A0.setCameraThumb(ocVar.A());
                return;
            case 25:
                ((qb) this.b).A2.p1.setVisibility(8);
                return;
            case 26:
                rb rbVar = (rb) this.b;
                ci.oc ocVar2 = rbVar.b0;
                if (ocVar2.Q1 || ocVar2.P1 || ocVar2.B0 == null || ocVar2.f0 != 0 || ocVar2.m1 == null) {
                    return;
                }
                String string = LocaleController.getString(rbVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                f4 f4Var = ocVar2.m1;
                f4Var.h = f4.a(string, f4Var.getTextPaint());
                ocVar2.m1.s(string);
                ocVar2.m1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 27:
                ((u9) this.b).setVisibility(8);
                return;
            case 28:
                rc rcVar = (rc) this.b;
                try {
                    int round = Math.round(((rcVar.h * rcVar.g.getInteger("sample-rate")) / rcVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(rcVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(rcVar.g, (Surface) null, (MediaCrypto) null, 0);
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
                            int readSampleData = rcVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                j3 = 2500;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                z10 = true;
                            } else {
                                z10 = z11;
                                j3 = 2500;
                                bufferInfo = bufferInfo2;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, rcVar.f.getSampleTime(), 0);
                                rcVar.f.advance();
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
                                            if (i19 >= sArr.length || i15 >= rcVar.b) {
                                                short[] sArr2 = new short[sArr.length];
                                                AndroidUtilities.runOnUIThread(new s1(rcVar, sArr, i19, 7));
                                                sArr = sArr2;
                                                i16 = i15;
                                            }
                                            if (i15 >= rcVar.d.length) {
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
                                    synchronized (rcVar.i) {
                                        try {
                                            if (!rcVar.j) {
                                                if (!z11 && i15 < rcVar.b) {
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
                        synchronized (rcVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    rcVar.f.release();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                tc tcVar = (tc) this.b;
                xc xcVar = tcVar.c;
                if (xcVar != null) {
                    long j10 = xcVar.a;
                    if (j10 > 0) {
                        tcVar.e = j10;
                        tcVar.l.q();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
