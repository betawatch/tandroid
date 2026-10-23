package org.telegram.messenger;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes.dex */
final class AudioRecorderV2Controller {
    private boolean finishRequested;
    private final Listener listener;
    private boolean released;
    private final ri.o session;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Object outputLock = new Object();
    private final HashMap<Long, File> outputFiles = new HashMap<>();
    private final HashSet<Long> deliveredOutputIds = new HashSet<>();
    private ri.m previousState = ri.m.a;

    /* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
    public interface Listener {
        void onCompleted(ri.l lVar);

        void onError(Exception exc);

        void onOutputInvalidated(File file);

        void onOutputStarted(File file);

        void onPreviewReady(long j10, File file, byte[] bArr);

        void onRecordingProgress(long j10, double d);

        void onRecordingResumed();

        void onRecordingStarted();

        void onRecordingTooShort(long j10);
    }

    public AudioRecorderV2Controller(Context context, File file, final Listener listener) {
        this.listener = listener;
        ci.o4 o4Var = new ci.o4(context, 2);
        o4Var.c = file;
        ri.h hVar = (ri.h) ti.e.c.a();
        if (hVar == null) {
            throw new IllegalArgumentException("Noise suppression mode is required");
        }
        o4Var.d = hVar;
        o4Var.a = false;
        o4Var.e = new ri.f() { // from class: org.telegram.messenger.AudioRecorderV2Controller.3
            @Override // ri.f
            public void onCompleted(ri.l lVar) {
                listener.onCompleted(lVar);
            }

            @Override // ri.f
            public void onError(Exception exc) {
                listener.onError(exc);
            }

            @Override // ri.f
            public void onPreviewReady(long j10, long j11, long j12, byte[] bArr) {
                if (AudioRecorderV2Controller.this.finishRequested) {
                    AudioRecorderV2Controller.this.finishRequested = false;
                    AudioRecorderV2Controller.this.session.h();
                    return;
                }
                ri.o oVar = AudioRecorderV2Controller.this.session;
                oVar.getClass();
                ri.o.p();
                ri.i iVar = oVar.A;
                File file2 = (oVar.n != ri.m.e || iVar == null) ? null : iVar.b;
                if (file2 == null) {
                    listener.onError(new IllegalStateException("Preview file is unavailable"));
                } else {
                    listener.onPreviewReady(j10, file2, bArr);
                }
            }

            @Override // ri.f
            public void onRecordingProgress(long j10, double d) {
                listener.onRecordingProgress(j10, d);
            }

            @Override // ri.f
            public void onRecordingTooShort(long j10) {
                listener.onRecordingTooShort(j10);
            }

            @Override // ri.f
            public void onStateChanged(ri.n nVar) {
                ri.m mVar = nVar.a;
                ri.m mVar2 = AudioRecorderV2Controller.this.previousState;
                AudioRecorderV2Controller.this.previousState = mVar;
                if (mVar == ri.m.c) {
                    if (!AudioRecorderV2Controller.this.finishRequested && mVar2 == ri.m.b) {
                        listener.onRecordingStarted();
                    } else if (!AudioRecorderV2Controller.this.finishRequested && mVar2 == ri.m.f) {
                        listener.onRecordingResumed();
                    }
                    AudioRecorderV2Controller.this.completePendingFinish(mVar);
                }
            }

            @Override // ri.f
            public /* bridge */ /* synthetic */ void onMaximumDurationReached() {
            }

            @Override // ri.f
            public /* bridge */ /* synthetic */ void onPreviewPlaybackChanged(boolean z10) {
            }

            @Override // ri.f
            public /* bridge */ /* synthetic */ void onPreviewProgress(long j10, long j11) {
            }
        };
        o4Var.f = new 2(listener);
        o4Var.g = new ri.g() { // from class: org.telegram.messenger.AudioRecorderV2Controller.1
            @Override // ri.g
            public void error(String str, Throwable th2) {
                FileLog.e("AudioRecorderV2 " + str, th2);
            }

            @Override // ri.g
            public void log(String str) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("AudioRecorderV2 " + str);
                }
            }
        };
        if (((ri.f) o4Var.e) == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (((ri.k) o4Var.f) == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.session = new ri.o(o4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completePendingFinish(ri.m mVar) {
        if (this.finishRequested) {
            if (mVar == ri.m.c || mVar == ri.m.e) {
                this.finishRequested = false;
                this.session.h();
            }
        }
    }

    public void cancel() {
        this.finishRequested = false;
        this.session.b();
    }

    public boolean detachPreviewOutput() {
        ri.o oVar = this.session;
        oVar.getClass();
        ri.o.p();
        ri.l lVar = null;
        lVar = null;
        lVar = null;
        lVar = null;
        lVar = null;
        if (oVar.n == ri.m.e && oVar.A != null && oVar.s == 0 && oVar.t == oVar.j()) {
            oVar.o();
            ri.i iVar = oVar.A;
            long j10 = oVar.j();
            long length = iVar.b.length();
            oVar.a(iVar, length);
            synchronized (oVar.l) {
                if (iVar.d && !iVar.e) {
                    iVar.e = true;
                    oVar.k.execute(new ri.c(oVar, iVar, length, j10, 0));
                    File file = iVar.b;
                    byte[] bArr = oVar.C;
                    oVar.D = new ri.l(file, j10, bArr != null ? (byte[]) bArr.clone() : null);
                    oVar.r(ri.m.n);
                    oVar.c();
                    oVar.s();
                    oVar.l("detached_preview");
                    lVar = oVar.D;
                }
            }
        }
        if (lVar == null) {
            return false;
        }
        this.session.n();
        this.released = true;
        return true;
    }

    public void finishWhenReady() {
        this.finishRequested = true;
        ri.o oVar = this.session;
        oVar.getClass();
        ri.o.p();
        completePendingFinish(oVar.e().a);
    }

    public boolean isPreviewing() {
        ri.o oVar = this.session;
        oVar.getClass();
        ri.o.p();
        return oVar.e().a == ri.m.e;
    }

    public void release() {
        this.session.n();
        this.released = true;
    }

    public boolean setTrimRange(long j10, long j11) {
        ri.o oVar = this.session;
        oVar.getClass();
        ri.f fVar = oVar.f;
        ri.o.p();
        if (oVar.n != ri.m.e) {
            return false;
        }
        long j12 = oVar.j();
        long max = Math.max(0L, Math.min(j12, j10));
        long max2 = Math.max(max, Math.min(j12, j11));
        if (max2 - max < Math.min(oVar.c, j12)) {
            return false;
        }
        oVar.s = max;
        oVar.t = max2;
        i2.h0 h0Var = oVar.B;
        if (h0Var != null) {
            h0Var.Z0(5, max);
        }
        fVar.onPreviewProgress(oVar.s, j12);
        fVar.onStateChanged(oVar.e());
        return true;
    }

    public boolean start() {
        ri.o oVar = this.session;
        oVar.getClass();
        ri.o.p();
        if (oVar.n != ri.m.a) {
            return false;
        }
        File file = oVar.b;
        if ((!file.isDirectory() && !file.mkdirs()) || !file.canWrite()) {
            oVar.g(new IllegalStateException("Output directory is not writable: " + file));
            return false;
        }
        oVar.h.b("start requested");
        oVar.d();
        oVar.r(ri.m.b);
        oVar.t(0L, -1L, null);
        return true;
    }

    public boolean togglePause() {
        ri.o oVar = this.session;
        oVar.getClass();
        ri.o.p();
        ri.m mVar = oVar.e().a;
        if (mVar == ri.m.c) {
            return this.session.m();
        }
        ri.m mVar2 = ri.m.e;
        if (mVar == mVar2) {
            ri.o oVar2 = this.session;
            oVar2.getClass();
            ri.o.p();
            if (oVar2.n == mVar2) {
                oVar2.h.b("resume requested: trim=" + oVar2.s + ".." + oVar2.t + ", sourceDurationMs=" + oVar2.j());
                oVar2.o();
                oVar2.r(ri.m.f);
                ri.i iVar = oVar2.A;
                if (iVar == null) {
                    oVar2.g(new IllegalStateException("Output generation is missing"));
                    return true;
                }
                long j10 = oVar2.s;
                long j11 = oVar2.t;
                boolean z10 = j11 >= ri.o.q(oVar2.q);
                oVar2.k(ri.j.a);
                long j12 = ((j11 - j10) * 48000) / 1000;
                oVar2.q = j12;
                oVar2.s = 0L;
                oVar2.t = ri.o.q(j12);
                oVar2.d();
                oVar2.h.b("resume prefix selected: source=" + iVar.b.getName() + ", trim=" + j10 + ".." + j11);
                File file = iVar.b;
                if (z10) {
                    j11 = -1;
                }
                oVar2.t(j10, j11, file);
                return true;
            }
        }
        return false;
    }

    /* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
    public class 2 implements ri.k {
        final /* synthetic */ Listener val$listener;

        public 2(Listener listener) {
            this.val$listener = listener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onOutputInvalidated$1(long j10, Listener listener, File file) {
            if (AudioRecorderV2Controller.this.deliveredOutputIds.remove(Long.valueOf(j10))) {
                listener.onOutputInvalidated(file);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onOutputStarted$0(long j10, Listener listener, File file) {
            if (AudioRecorderV2Controller.this.released) {
                return;
            }
            AudioRecorderV2Controller.this.deliveredOutputIds.add(Long.valueOf(j10));
            listener.onOutputStarted(file);
        }

        @Override // ri.k
        public void onOutputCompleted(long j10, File file, long j11, long j12) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
        }

        @Override // ri.k
        public void onOutputInvalidated(long j10, ri.j jVar) {
            File file;
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                file = (File) AudioRecorderV2Controller.this.outputFiles.remove(Long.valueOf(j10));
            }
            if (file != null) {
                AudioRecorderV2Controller.this.mainHandler.post(new q(this, j10, this.val$listener, file, 0));
            }
        }

        @Override // ri.k
        public void onOutputStarted(long j10, File file) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
            AudioRecorderV2Controller.this.mainHandler.post(new q(this, j10, this.val$listener, file, 1));
        }

        @Override // ri.k
        public /* bridge */ /* synthetic */ void onOutputError(long j10, Exception exc) {
        }

        @Override // ri.k
        public /* bridge */ /* synthetic */ void onBytesAvailable(long j10, File file, long j11, long j12) {
        }
    }
}
