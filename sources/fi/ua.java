package fi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.os.Looper;
import android.view.Surface;
import java.nio.ByteBuffer;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ua implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ua(i2.d0 d0Var, SurfaceTexture surfaceTexture) {
        this.a = 18;
        this.b = d0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:168:0x0419 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i10;
        boolean z10;
        MediaCodec.BufferInfo bufferInfo;
        long j10;
        int i11;
        int i12;
        int i13;
        short s10;
        Object obj;
        Bitmap bitmap = null;
        int i14 = 0;
        boolean z11 = true;
        switch (this.a) {
            case 0:
                va vaVar = (va) this.b;
                sb sbVar = vaVar.b0;
                if (sbVar.Q1 || sbVar.P1 || sbVar.B0 == null || sbVar.f0 != 0 || sbVar.m1 == null) {
                    return;
                }
                String string = LocaleController.getString(vaVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                v3 v3Var = sbVar.m1;
                v3Var.h = v3.a(string, v3Var.getTextPaint());
                sbVar.m1.s(string);
                sbVar.m1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 1:
                ((org.telegram.ui.Components.y9) this.b).setVisibility(8);
                return;
            case 2:
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
                    int i15 = -1;
                    boolean z12 = false;
                    int i16 = 0;
                    int i17 = 0;
                    int i18 = 0;
                    short s11 = 0;
                    while (true) {
                        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
                        int i19 = i15;
                        int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(2500L);
                        if (dequeueInputBuffer >= 0) {
                            z10 = z11;
                            int readSampleData = vbVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                i10 = round;
                                j10 = 2500;
                                i12 = 8;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                i11 = i19;
                                z12 = z10;
                            } else {
                                i10 = round;
                                j10 = 2500;
                                i12 = 8;
                                i11 = i19;
                                bufferInfo = bufferInfo2;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, vbVar.f.getSampleTime(), 0);
                                vbVar.f.advance();
                            }
                        } else {
                            i10 = round;
                            z10 = z11;
                            bufferInfo = bufferInfo2;
                            j10 = 2500;
                            i11 = i19;
                            i12 = 8;
                        }
                        if (i11 >= 0) {
                            createDecoderByType.getOutputBuffer(i11).position(0);
                        }
                        i15 = createDecoderByType.dequeueOutputBuffer(bufferInfo, j10);
                        while (i15 != -1 && !z12) {
                            if (i15 >= 0) {
                                ByteBuffer outputBuffer = createDecoderByType.getOutputBuffer(i15);
                                if (outputBuffer == null || bufferInfo.size <= 0) {
                                    i13 = i10;
                                } else {
                                    int i20 = i18;
                                    while (true) {
                                        if (outputBuffer.remaining() > 0) {
                                            short s12 = (short) ((outputBuffer.get() & 255) | ((outputBuffer.get() & 255) << 8));
                                            i13 = i10;
                                            if (i20 >= i13) {
                                                sArr[i16 - i17] = s11;
                                                int i21 = i16 + 1;
                                                int i22 = i21 - i17;
                                                if (i22 >= sArr.length || i21 >= vbVar.b) {
                                                    short[] sArr2 = new short[sArr.length];
                                                    AndroidUtilities.runOnUIThread(new ai.h0(vbVar, sArr, i22, 14));
                                                    sArr = sArr2;
                                                    i17 = i21;
                                                }
                                                if (i21 >= vbVar.d.length) {
                                                    i18 = 0;
                                                    s11 = 0;
                                                    i16 = i21;
                                                } else {
                                                    s10 = 0;
                                                    i16 = i21;
                                                    i20 = 0;
                                                }
                                            } else {
                                                s10 = s11;
                                            }
                                            s11 = s10 < s12 ? s12 : s10;
                                            i20++;
                                            int i23 = i12;
                                            if (outputBuffer.remaining() >= i23) {
                                                outputBuffer.position(outputBuffer.position() + i23);
                                                i10 = i13;
                                                i12 = 8;
                                            }
                                        } else {
                                            i13 = i10;
                                        }
                                    }
                                    i18 = i20;
                                }
                                createDecoderByType.releaseOutputBuffer(i15, false);
                                if ((bufferInfo.flags & 4) != 0) {
                                    z12 = z10;
                                    int i24 = i16;
                                    synchronized (vbVar.i) {
                                        try {
                                            if (!vbVar.j) {
                                                if (!z12 && i24 < vbVar.b) {
                                                    i16 = i24;
                                                    round = i13;
                                                    z11 = z10;
                                                }
                                            }
                                        } finally {
                                        }
                                    }
                                }
                            } else {
                                i13 = i10;
                                if (i15 == -3) {
                                    createDecoderByType.getOutputBuffers();
                                }
                            }
                            i15 = createDecoderByType.dequeueOutputBuffer(bufferInfo, 2500L);
                            i10 = i13;
                            i12 = 8;
                        }
                        i13 = i10;
                        int i242 = i16;
                        synchronized (vbVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    vbVar.f.release();
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
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
            case 4:
                ac acVar2 = (ac) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = acVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(acVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(acVar2.f, acVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(acVar2.f / bitmap.getWidth(), acVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) c3.h0.f(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) c3.h0.f(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) c3.h0.x(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) c3.h0.x(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
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
                AndroidUtilities.runOnUIThread(new e2.q0(23, acVar2, bitmap));
                return;
            case 5:
                gi.h hVar = (gi.h) this.b;
                mw0 mw0Var = hVar.U;
                if (mw0Var == null || hVar.a0 == -1) {
                    return;
                }
                mw0Var.a();
                return;
            case 6:
                ((e2.j0) this.b).getClass();
                return;
            case 7:
                ((hi.m0) this.b).invalidateSelf();
                return;
            case 8:
                ((hi.n0) this.b).invalidateSelf();
                return;
            case 9:
                ((hi.p0) this.b).d();
                return;
            case 10:
                ((hi.c1) this.b).c();
                return;
            case 11:
                ((hi.c1) this.b).c();
                return;
            case 12:
                ((hi.d1) this.b).a();
                return;
            case 13:
                ((hi.e1) this.b).a();
                return;
            case 14:
                ((hi.l3) this.b).invalidate();
                return;
            case 15:
                ((AnimationNotificationsLocker) this.b).unlock();
                return;
            case 16:
                hi.n4 n4Var = (hi.n4) this.b;
                n4Var.Q = n4Var.r;
                return;
            case 17:
                i2.j0 j0Var = (i2.j0) this.b;
                e2.c cVar = j0Var.C;
                Context context = j0Var.e;
                String str = e2.n0.a;
                int generateAudioSessionId = c2.j.e(context).generateAudioSessionId();
                if (generateAudioSessionId == -1) {
                    generateAudioSessionId = 0;
                }
                cVar.getClass();
                Looper myLooper = Looper.myLooper();
                if (myLooper == ((e2.i0) cVar.c).a.getLooper()) {
                    obj = cVar.e;
                } else {
                    a8.yb.p(myLooper == ((e2.i0) cVar.b).a.getLooper());
                    obj = cVar.f;
                }
                if (((Integer) obj).intValue() != generateAudioSessionId) {
                    Integer valueOf = Integer.valueOf(generateAudioSessionId);
                    cVar.f = valueOf;
                    e2.b bVar = new e2.b(cVar, valueOf, i14);
                    e2.i0 i0Var = (e2.i0) cVar.c;
                    if (i0Var.a.getLooper().getThread().isAlive()) {
                        i0Var.d(bVar);
                    }
                    j0Var.t1(1, 10, Integer.valueOf(generateAudioSessionId));
                    j0Var.t1(2, 10, Integer.valueOf(generateAudioSessionId));
                    return;
                }
                return;
            case 18:
                i2.j0 j0Var2 = ((i2.d0) this.b).a;
                j0Var2.x1(null);
                j0Var2.q1(0, 0);
                return;
            case 19:
                try {
                    i2.s0.f((i2.n1) this.b);
                    return;
                } catch (i2.m e11) {
                    e2.a.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
                    throw new RuntimeException(e11);
                }
            case 20:
                di.t6 t6Var = ((ig.n1) this.b).y;
                if (t6Var != null) {
                    t6Var.p(3, true);
                    return;
                }
                return;
            case 21:
                j2.e eVar = (j2.e) this.b;
                j2.a l4 = eVar.l();
                eVar.q(l4, 1028, new ig.g(l4));
                eVar.f.d();
                return;
            case 22:
                jg.c cVar2 = (jg.c) this.b;
                cVar2.b.g3.O(true);
                cVar2.W(true);
                return;
            case 23:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) this.b).link);
                wc.b0(LaunchActivity.R()).k(false).j();
                return;
            case 24:
                jg.k0 k0Var = (jg.k0) this.b;
                k71 k71Var = k0Var.e0;
                if (k71Var != null) {
                    k71Var.O(true);
                }
                k0Var.T(true);
                return;
            case 25:
                jg.t0 t0Var = (jg.t0) ((jg.s0) this.b).b;
                t0Var.c.g3.O(true);
                t0Var.c0();
                return;
            case 26:
                jg.v0 v0Var = (jg.v0) this.b;
                v0Var.b.g3.O(true);
                v0Var.W(true);
                return;
            case 27:
                jg.h1 h1Var = (jg.h1) this.b;
                h1Var.a.g3.O(true);
                h1Var.Z(true);
                return;
            case 28:
                ((di.y2) this.b).run(Boolean.FALSE);
                return;
            default:
                NotificationCenter.getInstance(((jg.c2) this.b).a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.quickRepliesUpdated, new Object[0]);
                return;
        }
    }

    public /* synthetic */ ua(i2.s0 s0Var, i2.n1 n1Var) {
        this.a = 19;
        this.b = n1Var;
    }

    public /* synthetic */ ua(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }
}
