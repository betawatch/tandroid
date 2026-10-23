package com.google.firebase.messaging;

import ah.i1;
import ai.a5;
import ai.u2;
import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import android.view.ViewGroup;
import com.google.android.gms.internal.cast.z5;
import e2.m0;
import ei.a2;
import ei.ac;
import ei.b2;
import ei.e1;
import ei.ec;
import ei.h2;
import ei.k2;
import ei.m3;
import ei.ma;
import ei.n2;
import ei.n9;
import ei.o1;
import ei.o5;
import ei.o9;
import ei.p3;
import ei.qa;
import ei.t1;
import ei.ua;
import ei.ub;
import ei.v0;
import ei.vb;
import ei.x3;
import ei.xa;
import ei.y6;
import ei.ya;
import ei.yb;
import ei.z6;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;
import sg.y0;
import v7.s6;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
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
                                    String str = m0.a;
                                    if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (!TextUtils.isEmpty(networkCountryIso)) {
                                            d = s6.d(networkCountryIso);
                                            fVar.o = d;
                                        }
                                    }
                                    d = s6.d(Locale.getDefault().getCountry());
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

    private final void b() {
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        long j10;
        short s10;
        yb ybVar = (yb) this.b;
        try {
            int round = Math.round(((ybVar.h * ybVar.g.getInteger("sample-rate")) / ybVar.b) / 5.0f);
            MediaCodec createDecoderByType = MediaCodec.createDecoderByType(ybVar.g.getString("mime"));
            if (createDecoderByType == null) {
                return;
            }
            createDecoderByType.configure(ybVar.g, (Surface) null, (MediaCrypto) null, 0);
            createDecoderByType.start();
            createDecoderByType.getInputBuffers();
            createDecoderByType.getOutputBuffers();
            short[] sArr = new short[32];
            boolean z11 = false;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            short s11 = 0;
            int i13 = -1;
            while (true) {
                MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                if (dequeueInputBuffer >= 0) {
                    int readSampleData = ybVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                    if (readSampleData < 0) {
                        j10 = 2500;
                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                        bufferInfo = bufferInfo2;
                        z10 = true;
                    } else {
                        z10 = z11;
                        j10 = 2500;
                        bufferInfo = bufferInfo2;
                        createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, ybVar.f.getSampleTime(), 0);
                        ybVar.f.advance();
                    }
                } else {
                    bufferInfo = bufferInfo2;
                    z10 = z11;
                    j10 = 2500;
                }
                if (i13 >= 0) {
                    createDecoderByType.getOutputBuffer(i13).position(0);
                }
                MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                i13 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, j10);
                while (i13 != -1 && !z10) {
                    if (i13 >= 0) {
                        ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i13);
                        if (outputBuffer != null && bufferInfo3.size > 0) {
                            int i14 = i12;
                            while (outputBuffer.remaining() > 0) {
                                short s12 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                if (i14 >= round) {
                                    sArr[i10 - i11] = s11;
                                    i10++;
                                    int i15 = i10 - i11;
                                    if (i15 >= sArr.length || i10 >= ybVar.b) {
                                        short[] sArr2 = new short[sArr.length];
                                        AndroidUtilities.runOnUIThread(new ah.o(ybVar, sArr, i15, 13));
                                        sArr = sArr2;
                                        i11 = i10;
                                    }
                                    if (i10 >= ybVar.d.length) {
                                        i12 = 0;
                                        s11 = 0;
                                        break;
                                    } else {
                                        i14 = 0;
                                        s10 = 0;
                                    }
                                } else {
                                    s10 = s11;
                                }
                                s11 = s10 < s12 ? s12 : s10;
                                i14++;
                                if (outputBuffer.remaining() < 8) {
                                    break;
                                } else {
                                    outputBuffer.position(outputBuffer.position() + 8);
                                }
                            }
                            i12 = i14;
                        }
                        createDecoderByType.releaseOutputBuffer(i13, false);
                        if ((bufferInfo3.flags & 4) != 0) {
                            z11 = true;
                            break;
                        }
                    } else if (i13 == -3) {
                        createDecoderByType.getOutputBuffers();
                    }
                    i13 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, 2500L);
                }
                z11 = z10;
                synchronized (ybVar.i) {
                    try {
                        if (!ybVar.j) {
                            if (z11 || i10 >= ybVar.b) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } finally {
                    }
                }
            }
            createDecoderByType.stop();
            createDecoderByType.release();
            ybVar.f.release();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10;
        int i11;
        int i12;
        switch (this.a) {
            case 0:
                z5 z5Var = (z5) this.b;
                synchronized (((ArrayDeque) z5Var.d)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) z5Var.b).edit();
                    String str = (String) z5Var.a;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) z5Var.d).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) z5Var.c);
                    }
                    edit.putString(str, sb2.toString()).commit();
                }
                return;
            case 1:
                d0 d0Var = (d0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + d0Var.a.getAction() + " finishing.");
                d0Var.b.trySetResult(null);
                return;
            case 2:
                ((ti) this.b).hide();
                return;
            case 3:
                di.r rVar = (di.r) this.b;
                ms0 ms0Var = rVar.W;
                ci.s6 s6Var = rVar.a;
                ms0Var.a(s6Var == null ? "" : s6Var.E);
                return;
            case 4:
                a();
                return;
            case 5:
                ((ei.h) this.b).c.W = false;
                return;
            case 6:
                ((ei.l) this.b).invalidateSelf();
                return;
            case 7:
                ((ei.d0) this.b).g = -1L;
                return;
            case 8:
                ei.m0 m0Var = (ei.m0) this.b;
                rg.i iVar = m0Var.b.H;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.b.k();
                return;
            case 9:
                ((v0) this.b).a(false);
                return;
            case 10:
                o5 o5Var = (o5) this.b;
                qc.e();
                y0 y0Var = new y0((o2) new a5(o5Var), 14, false);
                y0Var.setOnDismissListener(new e1(0));
                y0Var.show();
                return;
            case 11:
                ((t1) this.b).G();
                return;
            case 12:
                a2 a2Var = (a2) this.b;
                ArrayList arrayList = a2Var.v;
                ArrayList arrayList2 = a2Var.s;
                b2 b2Var = a2Var.N;
                n2 n2Var = b2Var.s;
                i10 = ((h3) n2Var).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str2 = a2Var.H;
                if ("premium".equalsIgnoreCase(str2)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    a2Var.x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    a2Var.y.clear();
                    a2Var.n.clear();
                    a2Var.x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    a2Var.x = recentStickers.size() + a2Var.x;
                    a2Var.I = a2Var.H;
                    a2Var.l();
                    o1.C1(b2Var.b, 0, 0);
                    b2Var.f.c(false);
                    b2Var.e.n(false);
                    return;
                }
                if (b2Var.a == 1 && Emoji.fullyConsistsOfEmojis(a2Var.H)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = a2Var.H;
                    tL_messages_getStickers.hash = 0L;
                    i12 = ((h3) n2Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new ai.g(12, a2Var, str2));
                    return;
                }
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = a2Var.J;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    i11 = ((h3) n2Var).currentAccount;
                    MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                a2Var.J = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, a2Var.H, false, new u2(a2Var, str2, mediaDataController, 6), null, false, false, false, true, 50, false);
                return;
            case 13:
                h2 h2Var = (h2) ((ai.u) this.b).b;
                if (h2Var.n) {
                    return;
                }
                h2Var.r.setVisibility(8);
                return;
            case 14:
                k2 k2Var = (k2) ((e6.r) this.b).b;
                ArrayList arrayList3 = k2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                k2Var.l.d(0.0f, true);
                int i13 = k2Var.k + 1;
                k2Var.k = i13;
                if (i13 > arrayList3.size() - 1) {
                    k2Var.k = 0;
                }
                ah.y0 y0Var2 = k2Var.j;
                y0Var2.e((i1) arrayList3.get(k2Var.k));
                k2Var.j = k2Var.i;
                k2Var.i = y0Var2;
                k2Var.p.invalidate();
                return;
            case 15:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 16:
                ((m3) this.b).b(null);
                return;
            case 17:
                ((p3) this.b).E();
                return;
            case 18:
                ma maVar = (ma) this.b;
                if (maVar.I) {
                    maVar.I = false;
                    maVar.invalidate();
                    return;
                }
                return;
            case 19:
                z6 z6Var = ((y6) this.b).p;
                z6Var.Q = System.currentTimeMillis();
                z6Var.R = 0L;
                z6Var.r0 = true;
                ((qa) z6Var.a).a.J0.a(0L, true);
                z6Var.invalidate();
                return;
            case 20:
                ei.p pVar = (ei.p) this.b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 21:
                ei.d dVar = (ei.d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 22:
                ((o9) ((n9) this.b).n).fullScroll(130);
                return;
            case 23:
                ub ubVar = (ub) this.b;
                ubVar.x0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                ubVar.w0.k(AndroidUtilities.emptyMotionEvent());
                return;
            case 24:
                vb vbVar = ((ua) this.b).k0;
                vbVar.u(true);
                vbVar.A0.setCameraThumb(vbVar.z());
                return;
            case 25:
                ((xa) this.b).A2.p1.setVisibility(8);
                return;
            case 26:
                ya yaVar = (ya) this.b;
                vb vbVar2 = yaVar.b0;
                if (vbVar2.Q1 || vbVar2.P1 || vbVar2.B0 == null || vbVar2.f0 != 0 || vbVar2.m1 == null) {
                    return;
                }
                String string = LocaleController.getString(yaVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                x3 x3Var = vbVar2.m1;
                x3Var.h = x3.a(string, x3Var.getTextPaint());
                vbVar2.m1.s(string);
                vbVar2.m1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 27:
                ((w9) this.b).setVisibility(8);
                return;
            case 28:
                b();
                return;
            default:
                ac acVar = (ac) this.b;
                ec ecVar = acVar.c;
                if (ecVar != null) {
                    long j10 = ecVar.a;
                    if (j10 > 0) {
                        acVar.e = j10;
                        acVar.l.q();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
