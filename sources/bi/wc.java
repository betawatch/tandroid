package bi;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class wc implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wc(com.google.firebase.messaging.k kVar, Intent intent) {
        this.a = 9;
        this.b = intent;
    }

    private final void a() {
        u6 u6Var = (u6) this.b;
        synchronized (((ArrayDeque) u6Var.d)) {
            SharedPreferences.Editor edit = ((SharedPreferences) u6Var.a).edit();
            String str = (String) u6Var.b;
            StringBuilder sb2 = new StringBuilder();
            Iterator it = ((ArrayDeque) u6Var.d).iterator();
            while (it.hasNext()) {
                sb2.append((String) it.next());
                sb2.append((String) u6Var.c);
            }
            edit.putString(str, sb2.toString()).commit();
        }
    }

    private final void b() {
        String c10;
        TelephonyManager telephonyManager;
        e2.t tVar = (e2.t) this.b;
        y2.e eVar = (y2.e) tVar.a.get();
        if (eVar != null) {
            int b10 = tVar.c.b();
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
                                    String str = e2.d0.a;
                                    if (context != null && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
                                        String networkCountryIso = telephonyManager.getNetworkCountryIso();
                                        if (!TextUtils.isEmpty(networkCountryIso)) {
                                            c10 = v7.r6.c(networkCountryIso);
                                            fVar.o = c10;
                                        }
                                    }
                                    c10 = v7.r6.c(Locale.getDefault().getCountry());
                                    fVar.o = c10;
                                }
                                fVar.l = fVar.a(b10);
                                fVar.d.getClass();
                                long elapsedRealtime = SystemClock.elapsedRealtime();
                                fVar.c(fVar.g > 0 ? (int) (elapsedRealtime - fVar.h) : 0, fVar.i, fVar.l);
                                fVar.h = elapsedRealtime;
                                fVar.i = 0L;
                                fVar.k = 0L;
                                fVar.j = 0L;
                                y2.s sVar = fVar.f;
                                sVar.a.clear();
                                sVar.c = -1;
                                sVar.d = 0;
                                sVar.e = 0;
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x0381 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        long j3;
        short s10;
        switch (this.a) {
            case 0:
                ce ceVar = ((xc) this.b).k0;
                ceVar.v(true);
                ceVar.A0.setCameraThumb(ceVar.A());
                return;
            case 1:
                ((ad) this.b).A2.p1.setVisibility(8);
                return;
            case 2:
                bd bdVar = (bd) this.b;
                ce ceVar2 = bdVar.b0;
                if (ceVar2.Q1 || ceVar2.P1 || ceVar2.B0 == null || ceVar2.f0 != 0 || ceVar2.m1 == null) {
                    return;
                }
                String string = LocaleController.getString(bdVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                x4 x4Var = ceVar2.m1;
                x4Var.h = x4.a(string, x4Var.getTextPaint());
                ceVar2.m1.s(string);
                ceVar2.m1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 3:
                ((org.telegram.ui.Components.w9) this.b).setVisibility(8);
                return;
            case 4:
                fe feVar = (fe) this.b;
                try {
                    int round = Math.round(((feVar.h * feVar.g.getInteger("sample-rate")) / feVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(feVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(feVar.g, (Surface) null, (MediaCrypto) null, 0);
                    createDecoderByType.start();
                    createDecoderByType.getInputBuffers();
                    createDecoderByType.getOutputBuffers();
                    short[] sArr = new short[32];
                    boolean z11 = false;
                    int i10 = -1;
                    int i11 = 0;
                    int i12 = 0;
                    int i13 = 0;
                    short s11 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            int readSampleData = feVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                j3 = 2500;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                z10 = true;
                            } else {
                                z10 = z11;
                                j3 = 2500;
                                bufferInfo = bufferInfo2;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, feVar.f.getSampleTime(), 0);
                                feVar.f.advance();
                            }
                        } else {
                            bufferInfo = bufferInfo2;
                            z10 = z11;
                            j3 = 2500;
                        }
                        if (i10 >= 0) {
                            createDecoderByType.getOutputBuffer(i10).position(0);
                        }
                        MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                        i10 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, j3);
                        while (i10 != -1 && !z10) {
                            if (i10 >= 0) {
                                ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i10);
                                if (outputBuffer != null && bufferInfo3.size > 0) {
                                    int i14 = i13;
                                    while (outputBuffer.remaining() > 0) {
                                        short s12 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                        if (i14 >= round) {
                                            sArr[i11 - i12] = s11;
                                            i11++;
                                            int i15 = i11 - i12;
                                            if (i15 >= sArr.length || i11 >= feVar.b) {
                                                short[] sArr2 = new short[sArr.length];
                                                AndroidUtilities.runOnUIThread(new g3(feVar, sArr, i15, 4));
                                                sArr = sArr2;
                                                i12 = i11;
                                            }
                                            if (i11 >= feVar.d.length) {
                                                i13 = 0;
                                                s11 = 0;
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
                                            i13 = i14;
                                        } else {
                                            outputBuffer.position(outputBuffer.position() + 8);
                                        }
                                    }
                                    i13 = i14;
                                }
                                createDecoderByType.releaseOutputBuffer(i10, false);
                                if ((bufferInfo3.flags & 4) != 0) {
                                    z11 = true;
                                    synchronized (feVar.i) {
                                        try {
                                            if (!feVar.j) {
                                                if (!z11 && i11 < feVar.b) {
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else if (i10 == -3) {
                                createDecoderByType.getOutputBuffers();
                            }
                            i10 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, 2500L);
                        }
                        z11 = z10;
                        synchronized (feVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    feVar.f.release();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 5:
                he heVar = (he) this.b;
                ke keVar = heVar.c;
                if (keVar != null) {
                    long j10 = keVar.a;
                    if (j10 > 0) {
                        heVar.e = j10;
                        heVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ke keVar2 = (ke) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = keVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                Bitmap bitmap = null;
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(keVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(keVar2.f, keVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(keVar2.f / bitmap.getWidth(), keVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.gms.internal.vision.e2.v(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.v(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.gms.internal.vision.e2.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (keVar2.h) {
                            if (keVar2.m == null) {
                                keVar2.m = new Path();
                            }
                            keVar2.m.rewind();
                            keVar2.m.addCircle(keVar2.f / 2.0f, keVar2.g / 2.0f, Math.min(keVar2.f, keVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(keVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, keVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                AndroidUtilities.runOnUIThread(new a1.e(29, keVar2, bitmap));
                return;
            case 7:
                ((c1.e) this.b).e().onError(new w0.h("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", 2));
                return;
            case 8:
                ci.f fVar = (ci.f) this.b;
                fVar.getClass();
                try {
                    vl0 currentListView = ((ci.j) fVar.M0).R.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 9:
                com.google.firebase.messaging.k.a((Intent) this.b);
                return;
            case 10:
                a();
                return;
            case 11:
                com.google.firebase.messaging.e0 e0Var = (com.google.firebase.messaging.e0) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + e0Var.a.getAction() + " finishing.");
                e0Var.b.trySetResult(null);
                return;
            case 12:
                ((di.k0) this.b).invalidateSelf();
                return;
            case 13:
                ((di.l0) this.b).invalidateSelf();
                return;
            case 14:
                ((di.n0) this.b).d();
                return;
            case 15:
                ((di.a1) this.b).c();
                return;
            case 16:
                ((di.a1) this.b).c();
                return;
            case 17:
                ((di.b1) this.b).a();
                return;
            case 18:
                ((di.c1) this.b).a();
                return;
            case 19:
                ((di.m3) this.b).invalidate();
                return;
            case 20:
                ((AnimationNotificationsLocker) this.b).unlock();
                return;
            case 21:
                di.t4 t4Var = (di.t4) this.b;
                t4Var.Q = t4Var.r;
                return;
            case 22:
                b();
                return;
            case 23:
                zh.u4 u4Var = ((fg.p1) this.b).y;
                if (u4Var != null) {
                    u4Var.p(3, true);
                    return;
                }
                return;
            case 24:
                gg.c cVar = (gg.c) this.b;
                cVar.c.Y2.N(true);
                cVar.V(true);
                return;
            case 25:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                org.telegram.ui.Components.wc.a0(LaunchActivity.R()).k(false).j();
                return;
            case 26:
                gg.p0 p0Var = (gg.p0) this.b;
                j61 j61Var = p0Var.d0;
                if (j61Var != null) {
                    j61Var.N(true);
                }
                p0Var.T(true);
                return;
            case 27:
                gg.y0 y0Var = (gg.y0) ((xa.c) this.b).b;
                y0Var.c.Y2.N(true);
                y0Var.b0();
                return;
            case 28:
                gg.a1 a1Var = (gg.a1) this.b;
                a1Var.c.Y2.N(true);
                a1Var.V(true);
                return;
            default:
                gg.m1 m1Var = (gg.m1) this.b;
                m1Var.a.Y2.N(true);
                m1Var.Y(true);
                return;
        }
    }

    public /* synthetic */ wc(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
