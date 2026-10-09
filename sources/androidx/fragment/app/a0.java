package androidx.fragment.app;

import ai.r5;
import ai.s1;
import ai.v8;
import ai.z3;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.view.Surface;
import android.view.ViewGroup;
import ci.ba;
import ci.c2;
import ci.ca;
import ci.cb;
import ci.d2;
import ci.d4;
import ci.e1;
import ci.gb;
import ci.h2;
import ci.i7;
import ci.j7;
import ci.k2;
import ci.kb;
import ci.kc;
import ci.lc;
import ci.nb;
import ci.o1;
import ci.o2;
import ci.ob;
import ci.oc;
import ci.q3;
import ci.qc;
import ci.r2;
import ci.u3;
import ci.uc;
import ci.v1;
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
import org.telegram.ui.Components.qs0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yi;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import rg.y0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
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
                    throw a1.g.k(it);
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
                ((yi) this.b).hide();
                return;
            case 3:
                bi.u uVar = (bi.u) this.b;
                qs0 qs0Var = uVar.W;
                v8 v8Var = uVar.a;
                qs0Var.a(v8Var == null ? "" : v8Var.E);
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
                ci.l0 l0Var = (ci.l0) this.b;
                qg.i iVar = l0Var.b.H;
                if (iVar != null) {
                    iVar.b();
                }
                l0Var.b.k();
                return;
            case 9:
                ((ci.u0) this.b).a(false);
                return;
            case 10:
                y5 y5Var = (y5) this.b;
                tc.e();
                y0 y0Var = new y0((n2) new z3(y5Var), 14, false);
                y0Var.setOnDismissListener(new e1(0));
                y0Var.show();
                return;
            case 11:
                ((v1) this.b).G();
                return;
            case 12:
                c2 c2Var = (c2) this.b;
                ArrayList arrayList = c2Var.v;
                ArrayList arrayList2 = c2Var.s;
                d2 d2Var = c2Var.N;
                r2 r2Var = d2Var.s;
                i10 = ((f3) r2Var).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str = c2Var.H;
                if ("premium".equalsIgnoreCase(str)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    c2Var.x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    c2Var.y.clear();
                    c2Var.n.clear();
                    c2Var.x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    c2Var.x = recentStickers.size() + c2Var.x;
                    c2Var.I = c2Var.H;
                    c2Var.l();
                    o1.x1(d2Var.b, 0, 0);
                    d2Var.f.c(false);
                    d2Var.e.n(false);
                    return;
                }
                if (d2Var.a == 1 && Emoji.fullyConsistsOfEmojis(c2Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = c2Var.H;
                    tL_messages_getStickers.hash = 0L;
                    i12 = ((f3) r2Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new ai.v1(5, c2Var, str));
                    return;
                }
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = c2Var.J;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    i11 = ((f3) r2Var).currentAccount;
                    MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                c2Var.J = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, c2Var.H, false, new r5(c2Var, str, mediaDataController, 4), null, false, false, false, true, 50, false);
                return;
            case 13:
                k2 k2Var = (k2) ((h2) this.b).b;
                if (k2Var.h) {
                    return;
                }
                k2Var.n.setVisibility(8);
                return;
            case 14:
                o2 o2Var = (o2) ((ci.n2) this.b).b;
                ArrayList arrayList3 = o2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                o2Var.l.d(0.0f, true);
                int i13 = o2Var.k + 1;
                o2Var.k = i13;
                if (i13 > arrayList3.size() - 1) {
                    o2Var.k = 0;
                }
                zg.e0 e0Var2 = o2Var.j;
                e0Var2.e((zg.n0) arrayList3.get(o2Var.k));
                o2Var.j = o2Var.i;
                o2Var.i = e0Var2;
                o2Var.p.invalidate();
                return;
            case 15:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 16:
                ((q3) this.b).b(null);
                return;
            case 17:
                ((u3) this.b).E();
                return;
            case 18:
                cb cbVar = (cb) this.b;
                if (cbVar.I) {
                    cbVar.I = false;
                    cbVar.invalidate();
                    return;
                }
                return;
            case 19:
                j7 j7Var = ((i7) this.b).p;
                j7Var.Q = System.currentTimeMillis();
                j7Var.R = 0L;
                j7Var.r0 = true;
                ((gb) j7Var.a).a.J0.a(0L, true);
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
                ((ca) ((ba) this.b).n).fullScroll(130);
                return;
            case 23:
                kc kcVar = (kc) this.b;
                kcVar.x0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                kcVar.w0.T0(AndroidUtilities.emptyMotionEvent());
                return;
            case 24:
                lc lcVar = ((kb) this.b).k0;
                lcVar.u(true);
                lcVar.A0.setCameraThumb(lcVar.z());
                return;
            case 25:
                ((nb) this.b).A2.p1.setVisibility(8);
                return;
            case 26:
                ob obVar = (ob) this.b;
                lc lcVar2 = obVar.b0;
                if (lcVar2.Q1 || lcVar2.P1 || lcVar2.B0 == null || lcVar2.f0 != 0 || lcVar2.m1 == null) {
                    return;
                }
                String string = LocaleController.getString(obVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                d4 d4Var = lcVar2.m1;
                d4Var.h = d4.a(string, d4Var.getTextPaint());
                lcVar2.m1.s(string);
                lcVar2.m1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 27:
                ((y9) this.b).setVisibility(8);
                return;
            case 28:
                oc ocVar = (oc) this.b;
                try {
                    int round = Math.round(((ocVar.h * ocVar.g.getInteger("sample-rate")) / ocVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(ocVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(ocVar.g, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    createDecoderByType.getInputBuffers();
                    createDecoderByType.getOutputBuffers();
                    short[] sArr = new short[32];
                    boolean z11 = false;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    short s11 = 0;
                    int i17 = -1;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = ocVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                j3 = 2500;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                z10 = true;
                            } else {
                                z10 = z11;
                                j3 = 2500;
                                bufferInfo = bufferInfo2;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, ocVar.f.getSampleTime(), 0);
                                ocVar.f.advance();
                            }
                        } else {
                            bufferInfo = bufferInfo2;
                            z10 = z11;
                            j3 = 2500;
                        }
                        if (i17 >= 0) {
                            createDecoderByType.getOutputBuffer(i17).position(0);
                        }
                        MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                        i17 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, j3);
                        while (i17 != -1 && !z10) {
                            if (i17 >= 0) {
                                ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i17);
                                if (outputBuffer != null && bufferInfo3.size > 0) {
                                    int i18 = i16;
                                    while (outputBuffer.remaining() > 0) {
                                        short s12 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                        if (i18 >= round) {
                                            sArr[i14 - i15] = s11;
                                            i14++;
                                            int i19 = i14 - i15;
                                            if (i19 >= sArr.length || i14 >= ocVar.b) {
                                                short[] sArr2 = new short[sArr.length];
                                                AndroidUtilities.runOnUIThread(new s1(ocVar, sArr, i19, 7));
                                                sArr = sArr2;
                                                i15 = i14;
                                            }
                                            if (i14 >= ocVar.d.length) {
                                                i16 = 0;
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
                                            i16 = i18;
                                        } else {
                                            outputBuffer.position(outputBuffer.position() + 8);
                                        }
                                    }
                                    i16 = i18;
                                }
                                createDecoderByType.releaseOutputBuffer(i17, false);
                                if ((bufferInfo3.flags & 4) != 0) {
                                    z11 = true;
                                    synchronized (ocVar.i) {
                                        try {
                                            if (!ocVar.j) {
                                                if (!z11 && i14 < ocVar.b) {
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else if (i17 == -3) {
                                createDecoderByType.getOutputBuffers();
                            }
                            i17 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, 2500L);
                        }
                        z11 = z10;
                        synchronized (ocVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    ocVar.f.release();
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                qc qcVar = (qc) this.b;
                uc ucVar = qcVar.c;
                if (ucVar != null) {
                    long j10 = ucVar.a;
                    if (j10 > 0) {
                        qcVar.e = j10;
                        qcVar.l.q();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
