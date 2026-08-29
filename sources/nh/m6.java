package nh;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaMetadataRetriever;
import android.transition.TransitionManager;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLParseException;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.yf0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.web.HttpGetFileTask;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m6(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:186:0x0453 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        MediaCodec.BufferInfo bufferInfo;
        boolean z10;
        long j10;
        short s10;
        switch (this.a) {
            case 0:
                o6 o6Var = ((n6) this.b).p;
                o6Var.M = System.currentTimeMillis();
                o6Var.N = 0L;
                o6Var.n0 = true;
                ((ca) o6Var.a).a.F0.a(0L, true);
                o6Var.invalidate();
                return;
            case 1:
                p pVar = (p) this.b;
                if (pVar.getParent() instanceof ViewGroup) {
                    ((ViewGroup) pVar.getParent()).removeView(pVar);
                    return;
                }
                return;
            case 2:
                d dVar = (d) this.b;
                if (dVar != null) {
                    dVar.setLoading(false);
                    return;
                }
                return;
            case 3:
                ((b9) ((ig.j) this.b).n).fullScroll(130);
                return;
            case 4:
                fb fbVar = (fb) this.b;
                fbVar.t0.onTouchEvent(AndroidUtilities.emptyMotionEvent());
                fbVar.s0.r(AndroidUtilities.emptyMotionEvent());
                return;
            case 5:
                gb gbVar = ((ga) this.b).g0;
                gbVar.v(true);
                gbVar.w0.setCameraThumb(gbVar.A());
                return;
            case 6:
                ((ja) this.b).w2.l1.setVisibility(8);
                return;
            case 7:
                ka kaVar = (ka) this.b;
                gb gbVar2 = kaVar.U;
                if (gbVar2.M1 || gbVar2.L1 || gbVar2.x0 == null || gbVar2.b0 != 0 || gbVar2.i1 == null) {
                    return;
                }
                String string = LocaleController.getString(kaVar.isFrontface() ? R.string.StoryCameraSavedDualBackHint : R.string.StoryCameraSavedDualFrontHint);
                t3 t3Var = gbVar2.i1;
                t3Var.h = t3.a(string, t3Var.getTextPaint());
                gbVar2.i1.t(string);
                gbVar2.i1.v();
                MessagesController.getGlobalMainSettings().edit().putInt("storysvddualhint", MessagesController.getGlobalMainSettings().getInt("storysvddualhint", 0) + 1).apply();
                return;
            case 8:
                ((org.telegram.ui.Components.t9) this.b).setVisibility(8);
                return;
            case 9:
                jb jbVar = (jb) this.b;
                try {
                    int round = Math.round(((jbVar.h * jbVar.g.getInteger("sample-rate")) / jbVar.b) / 5.0f);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(jbVar.g.getString("mime"));
                    if (createDecoderByType == null) {
                        return;
                    }
                    createDecoderByType.configure(jbVar.g, (Surface) null, (MediaCrypto) null, 0);
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
                            int readSampleData = jbVar.f.readSampleData(createDecoderByType.getInputBuffer(dequeueInputBuffer), 0);
                            if (readSampleData < 0) {
                                j10 = 2500;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                                bufferInfo = bufferInfo2;
                                z10 = true;
                            } else {
                                z10 = z11;
                                j10 = 2500;
                                bufferInfo = bufferInfo2;
                                createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, jbVar.f.getSampleTime(), 0);
                                jbVar.f.advance();
                            }
                        } else {
                            bufferInfo = bufferInfo2;
                            z10 = z11;
                            j10 = 2500;
                        }
                        if (i10 >= 0) {
                            createDecoderByType.getOutputBuffer(i10).position(0);
                        }
                        MediaCodec.BufferInfo bufferInfo3 = bufferInfo;
                        i10 = createDecoderByType.dequeueOutputBuffer(bufferInfo3, j10);
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
                                            if (i15 >= sArr.length || i11 >= jbVar.b) {
                                                short[] sArr2 = new short[sArr.length];
                                                AndroidUtilities.runOnUIThread(new ag.v0(jbVar, sArr, i15, 17));
                                                sArr = sArr2;
                                                i12 = i11;
                                            }
                                            if (i11 >= jbVar.d.length) {
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
                                    synchronized (jbVar.i) {
                                        try {
                                            if (!jbVar.j) {
                                                if (!z11 && i11 < jbVar.b) {
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
                        synchronized (jbVar.i) {
                        }
                    }
                    createDecoderByType.stop();
                    createDecoderByType.release();
                    jbVar.f.release();
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            case 10:
                lb lbVar = (lb) this.b;
                ob obVar = lbVar.c;
                if (obVar != null) {
                    long j11 = obVar.a;
                    if (j11 > 0) {
                        lbVar.e = j11;
                        lbVar.l.q();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ob obVar2 = (ob) this.b;
                MediaMetadataRetriever mediaMetadataRetriever = obVar2.e;
                if (mediaMetadataRetriever == null) {
                    return;
                }
                Bitmap bitmap = null;
                try {
                    bitmap = mediaMetadataRetriever.getFrameAtTime(obVar2.j * 1000, 2);
                    if (bitmap != null) {
                        Bitmap createBitmap = Bitmap.createBitmap(obVar2.f, obVar2.g, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        float max = Math.max(obVar2.f / bitmap.getWidth(), obVar2.g / bitmap.getHeight());
                        Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
                        Rect rect2 = new Rect((int) com.google.android.recaptcha.internal.a.w(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.recaptcha.internal.a.w(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f), (int) com.google.android.recaptcha.internal.a.y(bitmap.getWidth(), max, createBitmap.getWidth(), 2.0f), (int) com.google.android.recaptcha.internal.a.y(bitmap.getHeight(), max, createBitmap.getHeight(), 2.0f));
                        if (obVar2.h) {
                            if (obVar2.m == null) {
                                obVar2.m = new Path();
                            }
                            obVar2.m.rewind();
                            obVar2.m.addCircle(obVar2.f / 2.0f, obVar2.g / 2.0f, Math.min(obVar2.f, obVar2.g) / 2.0f, Path.Direction.CW);
                            canvas.clipPath(obVar2.m);
                        }
                        canvas.drawBitmap(bitmap, rect, rect2, obVar2.l);
                        bitmap.recycle();
                        bitmap = createBitmap;
                    }
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
                AndroidUtilities.runOnUIThread(new b6(14, obVar2, bitmap));
                return;
            case 12:
                jh.t9 t9Var = (jh.t9) this.b;
                t9Var.getClass();
                try {
                    jl0 currentListView = ((oh.g) t9Var.I0).N.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 13:
                TLParseException.lambda$doThrowOrLog$0((TLParseException) this.b);
                return;
            case 14:
                org.telegram.ui.Components.voip.l0 l0Var = (org.telegram.ui.Components.voip.l0) this.b;
                l0Var.L0 = null;
                l0Var.setVisibleParticipant(true);
                return;
            case 15:
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.b;
                h1Var.G = false;
                h1Var.o(false);
                h1Var.S = false;
                return;
            case 16:
                org.telegram.ui.Components.voip.h1 h1Var2 = (org.telegram.ui.Components.voip.h1) ((yf0) this.b).b;
                h1Var2.e.invalidate();
                if (h1Var2.e.isInLayout()) {
                    return;
                }
                h1Var2.e.requestLayout();
                h1Var2.d.requestLayout();
                h1Var2.f.requestLayout();
                return;
            case 17:
                ((org.telegram.ui.Components.voip.g1) this.b).a.i(false);
                return;
            case 18:
                org.telegram.ui.Components.voip.j2 j2Var = (org.telegram.ui.Components.voip.j2) this.b;
                j2Var.e = false;
                HashMap hashMap = j2Var.a;
                ArrayList arrayList = j2Var.c;
                ArrayList arrayList2 = j2Var.b;
                if (arrayList2.isEmpty() && arrayList.isEmpty()) {
                    return;
                }
                if (j2Var.getParent() != null) {
                    TransitionManager.beginDelayedTransition(j2Var, j2Var.d);
                }
                int i16 = 0;
                while (i16 < arrayList2.size()) {
                    org.telegram.ui.Components.voip.i2 i2Var = (org.telegram.ui.Components.voip.i2) arrayList2.get(i16);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= arrayList.size()) {
                            break;
                        }
                        if (i2Var.a.equals(((org.telegram.ui.Components.voip.i2) arrayList.get(i17)).a)) {
                            arrayList2.remove(i16);
                            arrayList.remove(i17);
                            i16--;
                        } else {
                            i17++;
                        }
                    }
                    i16++;
                }
                for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                    j2Var.addView((View) arrayList2.get(i18), i7.f6.t(-2, -2, 1, 4, 0, 0, 4));
                }
                for (int i19 = 0; i19 < arrayList.size(); i19++) {
                    j2Var.removeView((View) arrayList.get(i19));
                }
                hashMap.clear();
                for (int i20 = 0; i20 < j2Var.getChildCount(); i20++) {
                    org.telegram.ui.Components.voip.i2 i2Var2 = (org.telegram.ui.Components.voip.i2) j2Var.getChildAt(i20);
                    hashMap.put(i2Var2.a, i2Var2);
                }
                arrayList2.clear();
                arrayList.clear();
                j2Var.e = true;
                AndroidUtilities.runOnUIThread(new m6(j2Var, 18), 700L);
                Runnable runnable = j2Var.h;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 19:
                TextView[] textViewArr = ((org.telegram.ui.Components.voip.r2) this.b).a;
                TextView textView = textViewArr[0];
                textViewArr[0] = textViewArr[1];
                textViewArr[1] = textView;
                return;
            case 20:
                TextView[] textViewArr2 = ((org.telegram.ui.Components.voip.r2) ((rs) this.b).e).a;
                TextView textView2 = textViewArr2[0];
                textViewArr2[0] = textViewArr2[1];
                textViewArr2[1] = textView2;
                return;
            case 21:
                org.telegram.ui.Components.voip.v2 v2Var = (org.telegram.ui.Components.voip.v2) this.b;
                if (v2Var.getVisibility() == 0) {
                    v2Var.a();
                    return;
                }
                return;
            case 22:
                org.telegram.ui.Components.voip.z2 z2Var = (org.telegram.ui.Components.voip.z2) this.b;
                z2Var.e = Bitmap.createBitmap(z2Var.getMeasuredWidth(), z2Var.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
                new Canvas(z2Var.e).drawText(z2Var.d, z2Var.getMeasuredWidth() / 2, (int) ((z2Var.getMeasuredHeight() / 2) - ((z2Var.a.ascent() + z2Var.a.descent()) / 2.0f)), z2Var.a);
                z2Var.postInvalidate();
                return;
            case 23:
                ((org.telegram.ui.web.l) this.b).w.U2.N(true);
                return;
            case 24:
                org.telegram.ui.web.j jVar = ((org.telegram.ui.web.o) this.b).h.e;
                if (jVar != null) {
                    jVar.d();
                    return;
                }
                return;
            case 25:
                ((st) this.b).requestFocus();
                return;
            case 26:
                ye.d.s(((org.telegram.ui.web.s0) this.b).b.e.getContext(), "https://play.google.com/store/apps/details?id=com.google.android.webview");
                return;
            case 27:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.b;
                Utilities.searchQueue.postRunnable(new yw0(c1Var, new ArrayList(c1Var.h.e), c1Var.h.n));
                return;
            case 28:
                ((HttpGetFileTask) this.b).lambda$doInBackground$1();
                return;
            default:
                ((org.telegram.ui.Cells.m1) this.b).invalidateSelf();
                return;
        }
    }
}
