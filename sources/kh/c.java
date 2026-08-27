package kh;

import ag.g2;
import ag.l0;
import ag.r2;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import android.view.ViewGroup;
import cg.g0;
import hh.z9;
import ig.h0;
import ig.q0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import jh.b6;
import lh.ac;
import lh.d0;
import lh.e1;
import lh.e2;
import lh.h2;
import lh.i2;
import lh.k7;
import lh.ka;
import lh.l2;
import lh.l3;
import lh.m0;
import lh.n9;
import lh.o1;
import lh.o3;
import lh.o5;
import lh.oa;
import lh.rb;
import lh.s1;
import lh.sa;
import lh.sb;
import lh.v0;
import lh.va;
import lh.vb;
import lh.w3;
import lh.wa;
import lh.x6;
import lh.xb;
import lh.y1;
import lh.y6;
import lh.z1;
import nh.e0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.gi;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x026f A[EXC_TOP_SPLITTER, SYNTHETIC] */
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
        long j10;
        short s10;
        switch (this.a) {
            case 0:
                ((gi) this.b).hide();
                return;
            case 1:
                r rVar = (r) this.b;
                vq0 vq0Var = rVar.S;
                b6 b6Var = rVar.a;
                vq0Var.a(b6Var == null ? "" : b6Var.E);
                return;
            case 2:
                ((lh.h) this.b).c.S = false;
                return;
            case 3:
                ((lh.l) this.b).invalidateSelf();
                return;
            case 4:
                ((d0) this.b).g = -1L;
                return;
            case 5:
                m0 m0Var = (m0) this.b;
                zf.i iVar = m0Var.b.D;
                if (iVar != null) {
                    iVar.b();
                }
                m0Var.b.k();
                return;
            case 6:
                ((v0) this.b).a(false);
                return;
            case 7:
                o5 o5Var = (o5) this.b;
                ec.e();
                g2 g2Var = new g2((n2) new r2(o5Var), 14, false);
                g2Var.setOnDismissListener(new e1(0));
                g2Var.show();
                return;
            case 8:
                ((s1) this.b).G();
                return;
            case 9:
                y1 y1Var = (y1) this.b;
                ArrayList arrayList = y1Var.v;
                ArrayList arrayList2 = y1Var.s;
                z1 z1Var = y1Var.J;
                l2 l2Var = z1Var.s;
                i10 = ((e3) l2Var).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i10);
                String str = y1Var.D;
                if ("premium".equalsIgnoreCase(str)) {
                    ArrayList<TLRPC.Document> recentStickers = mediaDataController.getRecentStickers(7);
                    y1Var.x = 0;
                    arrayList2.clear();
                    arrayList.clear();
                    y1Var.y.clear();
                    y1Var.n.clear();
                    y1Var.x++;
                    arrayList2.add(null);
                    arrayList.add(0L);
                    arrayList2.addAll(recentStickers);
                    y1Var.x = recentStickers.size() + y1Var.x;
                    y1Var.E = y1Var.D;
                    y1Var.l();
                    o1.w1(z1Var.b, 0, 0);
                    z1Var.f.c(false);
                    z1Var.e.n(false);
                    return;
                }
                if (z1Var.a == 1 && Emoji.fullyConsistsOfEmojis(y1Var.D)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = y1Var.D;
                    tL_messages_getStickers.hash = 0L;
                    i12 = ((e3) l2Var).currentAccount;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_messages_getStickers, new g0(15, y1Var, str));
                    return;
                }
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = y1Var.F;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    i11 = ((e3) l2Var).currentAccount;
                    MediaDataController.getInstance(i11).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                y1Var.F = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, y1Var.D, false, new l0(y1Var, str, mediaDataController, 11), null, false, false, false, true, 50, false);
                return;
            case 10:
                e2 e2Var = (e2) ((ch.e) this.b).b;
                if (e2Var.h) {
                    return;
                }
                e2Var.n.setVisibility(8);
                return;
            case 11:
                i2 i2Var = (i2) ((h2) this.b).b;
                ArrayList arrayList3 = i2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                i2Var.l.d(0.0f, true);
                int i13 = i2Var.k + 1;
                i2Var.k = i13;
                if (i13 > arrayList3.size() - 1) {
                    i2Var.k = 0;
                }
                h0 h0Var = i2Var.j;
                h0Var.e((q0) arrayList3.get(i2Var.k));
                i2Var.j = i2Var.i;
                i2Var.i = h0Var;
                i2Var.p.invalidate();
                return;
            case 12:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 13:
                ((l3) this.b).b(null);
                return;
            case 14:
                ((o3) this.b).E();
                return;
            case 15:
                ka kaVar = (ka) this.b;
                if (kaVar.E) {
                    kaVar.E = false;
                    kaVar.invalidate();
                    return;
                }
                return;
            case 16:
                y6 y6Var = ((x6) this.b).p;
                y6Var.M = System.currentTimeMillis();
                y6Var.N = 0L;
                y6Var.n0 = true;
                ((oa) y6Var.a).a.F0.a(0L, true);
                y6Var.invalidate();
                return;
            case 17:
                lh.q qVar = (lh.q) this.b;
                if (qVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qVar.getParent()).removeView(qVar);
                    return;
                }
                return;
            case 18:
                lh.d dVar = (lh.d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 19:
                ((n9) ((gg.k) this.b).n).fullScroll(130);
                return;
            case 20:
                rb rbVar = (rb) this.b;
                rbVar.t0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                rbVar.s0.P(AndroidUtilities.emptyMotionEvent());
                return;
            case 21:
                sb sbVar = ((sa) this.b).g0;
                sbVar.v(true);
                sbVar.w0.setCameraThumb(sbVar.A());
                return;
            case 22:
                ((va) this.b).w2.l1.setVisibility(8);
                return;
            case 23:
                wa waVar = (wa) this.b;
                sb sbVar2 = waVar.U;
                if (sbVar2.M1 || sbVar2.L1 || sbVar2.x0 == null || sbVar2.b0 != 0 || sbVar2.i1 == null) {
                    return;
                }
                String string = LocaleController.getString(waVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                w3 w3Var = sbVar2.i1;
                w3Var.h = w3.a(string, w3Var.getTextPaint());
                sbVar2.i1.t(string);
                sbVar2.i1.v();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 24:
                ((org.telegram.ui.Components.n9) this.b).setVisibility(8);
                return;
            case 25:
                vb vbVar = (vb) this.b;
                try {
                    int round = Math.round(((vbVar.h * vbVar.g.getInteger("sample-rate")) / vbVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(vbVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(vbVar.g, (Surface) null, (MediaCrypto) null, 0);
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
                            int readSampleData = vbVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                j10 = 2500;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                z10 = true;
                            } else {
                                z10 = z11;
                                j10 = 2500;
                                bufferInfo = bufferInfo2;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, vbVar.f.getSampleTime(), 0);
                                vbVar.f.advance();
                            }
                        } else {
                            bufferInfo = bufferInfo2;
                            z10 = z11;
                            j10 = 2500;
                        }
                        if (i14 >= 0) {
                            createDecoderByType.getOutputBuffer(i14).position(0);
                        }
                        MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                        i14 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, j10);
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
                                            if (i19 >= sArr.length || i15 >= vbVar.b) {
                                                short[] sArr2 = new short[sArr.length];
                                                AndroidUtilities.runOnUIThread(new d5.i(vbVar, sArr, i19, 15));
                                                sArr = sArr2;
                                                i16 = i15;
                                            }
                                            if (i15 >= vbVar.d.length) {
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
                                    synchronized (vbVar.i) {
                                        try {
                                            if (!vbVar.j) {
                                                if (!z11 && i15 < vbVar.b) {
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
                        synchronized (vbVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    vbVar.f.release();
                    return;
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
            case 26:
                xb xbVar = (xb) this.b;
                ac acVar = xbVar.c;
                if (acVar != null) {
                    long j11 = acVar.a;
                    if (j11 > 0) {
                        xbVar.e = j11;
                        xbVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 27:
                ac acVar2 = (ac) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = acVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                Bitmap bitmap = null;
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(acVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(acVar2.f, acVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(acVar2.f / bitmap.getWidth(), acVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.recaptcha.internal.a.w(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.recaptcha.internal.a.w(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.recaptcha.internal.a.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.recaptcha.internal.a.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (acVar2.h) {
                            if (acVar2.m == null) {
                                acVar2.m = new Path();
                            }
                            acVar2.m.rewind();
                            acVar2.m.addCircle(acVar2.f / 2.0f, acVar2.g / 2.0f, Math.min(acVar2.f, acVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(acVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, acVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
                AndroidUtilities.runOnUIThread(new k7(7, acVar2, bitmap));
                return;
            case 28:
                z9 z9Var = (z9) this.b;
                z9Var.getClass();
                try {
                    zk0 currentListView = ((mh.g) z9Var.I0).N.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            default:
                ((e0) this.b).invalidateSelf();
                return;
        }
    }
}
