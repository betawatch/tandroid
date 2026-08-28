package kh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.view.Surface;
import android.view.ViewGroup;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Stories.recorder.FfmpegAudioWaveformLoader;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class f1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f1(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x02a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i9;
        int i10;
        int i11;
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        long j10;
        short s10;
        switch (this.a) {
            case 0:
                p5 p5Var = (p5) this.b;
                org.telegram.ui.Components.gc.e();
                zf.x0 x0Var = new zf.x0((org.telegram.ui.ActionBar.o2) new bg.i1(p5Var), 14, false);
                x0Var.setOnDismissListener(new g1(0));
                x0Var.show();
                return;
            case 1:
                ((u1) this.b).G();
                return;
            case 2:
                a2 a2Var = (a2) this.b;
                ArrayList arrayList = a2Var.v;
                ArrayList arrayList2 = a2Var.s;
                b2 b2Var = a2Var.J;
                n2 n2Var = b2Var.s;
                i9 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                MediaDataController mediaDataController = MediaDataController.getInstance(i9);
                String str = a2Var.D;
                if ("premium".equalsIgnoreCase(str)) {
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
                    a2Var.E = a2Var.D;
                    a2Var.l();
                    q1.w1(b2Var.b, 0, 0);
                    b2Var.f.c(false);
                    b2Var.e.n(false);
                    return;
                }
                if (b2Var.a == 1 && Emoji.fullyConsistsOfEmojis(a2Var.D)) {
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = a2Var.D;
                    tL_messages_getStickers.hash = 0L;
                    i11 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                    ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickers, new bg.j0(15, a2Var, str));
                    return;
                }
                String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                String[] strArr = a2Var.F;
                if (strArr == null || !Arrays.equals(currentKeyboardLanguage, strArr)) {
                    i10 = ((org.telegram.ui.ActionBar.f3) n2Var).currentAccount;
                    MediaDataController.getInstance(i10).fetchNewEmojiKeywords(currentKeyboardLanguage);
                }
                a2Var.F = currentKeyboardLanguage;
                mediaDataController.getEmojiSuggestions(currentKeyboardLanguage, a2Var.D, false, new androidx.car.app.utils.a(10, a2Var, mediaDataController, str), null, false, false, false, true, 50, false);
                return;
            case 3:
                g2 g2Var = (g2) ((bh.f) this.b).b;
                if (g2Var.h) {
                    return;
                }
                g2Var.n.setVisibility(8);
                return;
            case 4:
                k2 k2Var = (k2) ((j2) this.b).b;
                ArrayList arrayList3 = k2Var.o;
                if (arrayList3.isEmpty()) {
                    return;
                }
                k2Var.l.d(0.0f, true);
                int i12 = k2Var.k + 1;
                k2Var.k = i12;
                if (i12 > arrayList3.size() - 1) {
                    k2Var.k = 0;
                }
                hg.i0 i0Var = k2Var.j;
                i0Var.e((hg.r0) arrayList3.get(k2Var.k));
                k2Var.j = k2Var.i;
                k2Var.i = i0Var;
                k2Var.p.invalidate();
                return;
            case 5:
                ((FfmpegAudioWaveformLoader) this.b).lambda$destroy$2();
                return;
            case 6:
                ((m3) this.b).b(null);
                return;
            case 7:
                ((p3) this.b).E();
                return;
            case 8:
                na naVar = (na) this.b;
                if (naVar.E) {
                    naVar.E = false;
                    naVar.invalidate();
                    return;
                }
                return;
            case 9:
                z6 z6Var = ((y6) this.b).p;
                z6Var.M = System.currentTimeMillis();
                z6Var.N = 0L;
                z6Var.n0 = true;
                ((ra) z6Var.a).a.F0.a(0L, true);
                z6Var.invalidate();
                return;
            case 10:
                q qVar = (q) this.b;
                if (qVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) qVar.getParent()).removeView(qVar);
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
                ((q9) ((fg.l) this.b).n).fullScroll(130);
                return;
            case 13:
                vb vbVar = (vb) this.b;
                vbVar.t0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                vbVar.s0.a1(AndroidUtilities.emptyMotionEvent());
                return;
            case 14:
                wb wbVar = ((va) this.b).g0;
                wbVar.v(true);
                wbVar.w0.setCameraThumb(wbVar.A());
                return;
            case 15:
                ((ya) this.b).w2.l1.setVisibility(8);
                return;
            case 16:
                za zaVar = (za) this.b;
                wb wbVar2 = zaVar.U;
                if (wbVar2.M1 || wbVar2.L1 || wbVar2.x0 == null || wbVar2.b0 != 0 || wbVar2.i1 == null) {
                    return;
                }
                String string = LocaleController.getString(zaVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                x3 x3Var = wbVar2.i1;
                x3Var.h = x3.a(string, x3Var.getTextPaint());
                wbVar2.i1.t(string);
                wbVar2.i1.v();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 17:
                ((org.telegram.ui.Components.o9) this.b).setVisibility(8);
                return;
            case 18:
                zb zbVar = (zb) this.b;
                try {
                    int round = Math.round(((zbVar.h * zbVar.g.getInteger("sample-rate")) / zbVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(zbVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(zbVar.g, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    createDecoderByType.getInputBuffers();
                    createDecoderByType.getOutputBuffers();
                    short[] sArr = new short[32];
                    boolean z11 = false;
                    int i13 = -1;
                    int i14 = 0;
                    int i15 = 0;
                    int i16 = 0;
                    short s11 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = zbVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                j10 = 2500;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                z10 = true;
                            } else {
                                z10 = z11;
                                j10 = 2500;
                                bufferInfo = bufferInfo2;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, zbVar.f.getSampleTime(), 0);
                                zbVar.f.advance();
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
                                    int i17 = i16;
                                    while (outputBuffer.remaining() > 0) {
                                        short s12 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                        if (i17 >= round) {
                                            sArr[i14 - i15] = s11;
                                            i14++;
                                            int i18 = i14 - i15;
                                            if (i18 >= sArr.length || i14 >= zbVar.b) {
                                                short[] sArr2 = new short[sArr.length];
                                                AndroidUtilities.runOnUIThread(new d5.i(zbVar, sArr, i18, 15));
                                                sArr = sArr2;
                                                i15 = i14;
                                            }
                                            if (i14 >= zbVar.d.length) {
                                                i16 = 0;
                                                s11 = 0;
                                            } else {
                                                i17 = 0;
                                                s10 = 0;
                                            }
                                        } else {
                                            s10 = s11;
                                        }
                                        s11 = s10 < s12 ? s12 : s10;
                                        i17++;
                                        if (outputBuffer.remaining() < 8) {
                                            i16 = i17;
                                        } else {
                                            outputBuffer.position(outputBuffer.position() + 8);
                                        }
                                    }
                                    i16 = i17;
                                }
                                createDecoderByType.releaseOutputBuffer(i13, false);
                                if ((bufferInfo3.flags & 4) != 0) {
                                    z11 = true;
                                    synchronized (zbVar.i) {
                                        try {
                                            if (!zbVar.j) {
                                                if (!z11 && i14 < zbVar.b) {
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else if (i13 == -3) {
                                createDecoderByType.getOutputBuffers();
                            }
                            i13 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, 2500L);
                        }
                        z11 = z10;
                        synchronized (zbVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    zbVar.f.release();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 19:
                bc bcVar = (bc) this.b;
                ec ecVar = bcVar.c;
                if (ecVar != null) {
                    long j11 = ecVar.a;
                    if (j11 > 0) {
                        bcVar.e = j11;
                        bcVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ec ecVar2 = (ec) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = ecVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                Bitmap bitmap = null;
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(ecVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(ecVar2.f, ecVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(ecVar2.f / bitmap.getWidth(), ecVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) e2.c.d(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) e2.c.d(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) e2.c.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) e2.c.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (ecVar2.h) {
                            if (ecVar2.m == null) {
                                ecVar2.m = new Path();
                            }
                            ecVar2.m.rewind();
                            ecVar2.m.addCircle(ecVar2.f / 2.0f, ecVar2.g / 2.0f, Math.min(ecVar2.f, ecVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(ecVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, ecVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                AndroidUtilities.runOnUIThread(new o8(1, ecVar2, bitmap));
                return;
            case 21:
                gh.z9 z9Var = (gh.z9) this.b;
                z9Var.getClass();
                try {
                    wk0 currentListView = ((lh.g) z9Var.I0).N.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 22:
                ((mh.g0) this.b).invalidateSelf();
                return;
            case 23:
                ((mh.h0) this.b).invalidateSelf();
                return;
            case 24:
                ((mh.j0) this.b).d();
                return;
            case 25:
                ((mh.v0) this.b).c();
                return;
            case 26:
                ((mh.v0) this.b).c();
                return;
            case 27:
                ((mh.w0) this.b).a();
                return;
            case 28:
                ((mh.x0) this.b).a();
                return;
            default:
                ((mh.b3) this.b).invalidate();
                return;
        }
    }
}
