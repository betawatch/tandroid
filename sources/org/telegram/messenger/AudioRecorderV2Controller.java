package org.telegram.messenger;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import ri.q;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
final class AudioRecorderV2Controller {
    private boolean finishRequested;
    private final Listener listener;
    private boolean released;
    private final ri.q session;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Object outputLock = new Object();
    private final HashMap<Long, File> outputFiles = new HashMap<>();
    private final HashSet<Long> deliveredOutputIds = new HashSet<>();
    private ri.o previousState = ri.o.a;

    /* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
    public interface Listener {
        void onCompleted(ri.n nVar);

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
        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m();
        mVar.c = ri.j.a;
        mVar.f = ri.q.G;
        mVar.a = context;
        mVar.b = file;
        ri.j jVar = (ri.j) si.e.c.a();
        if (jVar == null) {
            throw new IllegalArgumentException("Noise suppression mode is required");
        }
        mVar.c = jVar;
        mVar.d = new ri.h() { // from class: org.telegram.messenger.AudioRecorderV2Controller.3
            @Override // ri.h
            public void onCompleted(ri.n nVar) {
                listener.onCompleted(nVar);
            }

            @Override // ri.h
            public void onError(Exception exc) {
                listener.onError(exc);
            }

            @Override // ri.h
            public void onPreviewReady(long j10, long j11, long j12, byte[] bArr) {
                if (AudioRecorderV2Controller.this.finishRequested) {
                    AudioRecorderV2Controller.this.finishRequested = false;
                    AudioRecorderV2Controller.this.session.h();
                    return;
                }
                ri.q qVar = AudioRecorderV2Controller.this.session;
                qVar.getClass();
                ri.q.p();
                ri.k kVar = qVar.z;
                File file2 = (qVar.m != ri.o.e || kVar == null) ? null : kVar.b;
                if (file2 == null) {
                    listener.onError(new IllegalStateException("Preview file is unavailable"));
                } else {
                    listener.onPreviewReady(j10, file2, bArr);
                }
            }

            @Override // ri.h
            public void onRecordingProgress(long j10, double d) {
                listener.onRecordingProgress(j10, d);
            }

            @Override // ri.h
            public void onRecordingTooShort(long j10) {
                listener.onRecordingTooShort(j10);
            }

            @Override // ri.h
            public void onStateChanged(ri.p pVar) {
                ri.o oVar = pVar.a;
                ri.o oVar2 = AudioRecorderV2Controller.this.previousState;
                AudioRecorderV2Controller.this.previousState = oVar;
                if (oVar == ri.o.c) {
                    if (!AudioRecorderV2Controller.this.finishRequested && oVar2 == ri.o.b) {
                        listener.onRecordingStarted();
                    } else if (!AudioRecorderV2Controller.this.finishRequested && oVar2 == ri.o.f) {
                        listener.onRecordingResumed();
                    }
                    AudioRecorderV2Controller.this.completePendingFinish(oVar);
                }
            }

            @Override // ri.h
            public /* bridge */ /* synthetic */ void onMaximumDurationReached() {
            }

            @Override // ri.h
            public /* bridge */ /* synthetic */ void onPreviewPlaybackChanged(boolean z10) {
            }

            @Override // ri.h
            public /* bridge */ /* synthetic */ void onPreviewProgress(long j10, long j11) {
            }
        };
        mVar.e = new 2(listener);
        mVar.f = new ri.i() { // from class: org.telegram.messenger.AudioRecorderV2Controller.1
            @Override // ri.i
            public void error(String str, Throwable th2) {
                FileLog.e("AudioRecorderV2 " + str, th2);
            }

            @Override // ri.i
            public void log(String str) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("AudioRecorderV2 " + str);
                }
            }
        };
        if (((ri.h) mVar.d) == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (((ri.m) mVar.e) == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.session = new ri.q(mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completePendingFinish(ri.o oVar) {
        if (this.finishRequested) {
            if (oVar == ri.o.c || oVar == ri.o.e) {
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
        ri.q qVar = this.session;
        qVar.getClass();
        ri.q.p();
        ri.n nVar = null;
        nVar = null;
        nVar = null;
        nVar = null;
        nVar = null;
        if (qVar.m == ri.o.e && qVar.z != null && qVar.r == 0 && qVar.s == qVar.j()) {
            qVar.o();
            ri.k kVar = qVar.z;
            long j10 = qVar.j();
            long length = kVar.b.length();
            qVar.a(kVar, length);
            synchronized (qVar.k) {
                if (kVar.d && !kVar.e) {
                    kVar.e = true;
                    qVar.j.execute(new ri.c(qVar, kVar, length, j10, 0));
                    File file = kVar.b;
                    byte[] bArr = qVar.B;
                    qVar.C = new ri.n(file, j10, bArr != null ? (byte[]) bArr.clone() : null);
                    qVar.r(ri.o.n);
                    qVar.c();
                    qVar.s();
                    qVar.l("detached_preview");
                    nVar = qVar.C;
                }
            }
        }
        if (nVar == null) {
            return false;
        }
        this.session.n();
        this.released = true;
        return true;
    }

    public void finishWhenReady() {
        this.finishRequested = true;
        ri.q qVar = this.session;
        qVar.getClass();
        ri.q.p();
        completePendingFinish(qVar.e().a);
    }

    public boolean isPreviewing() {
        ri.q qVar = this.session;
        qVar.getClass();
        ri.q.p();
        return qVar.e().a == ri.o.e;
    }

    public void release() {
        this.session.n();
        this.released = true;
    }

    public boolean setTrimRange(long j10, long j11) {
        ri.q qVar = this.session;
        qVar.getClass();
        ri.h hVar = qVar.e;
        ri.q.p();
        if (qVar.m != ri.o.e) {
            return false;
        }
        long j12 = qVar.j();
        long max = Math.max(0L, Math.min(j12, j10));
        long max2 = Math.max(max, Math.min(j12, j11));
        if (max2 - max < Math.min(qVar.c, j12)) {
            return false;
        }
        qVar.r = max;
        qVar.s = max2;
        i2.h0 h0Var = qVar.A;
        if (h0Var != null) {
            h0Var.Z0(5, max);
        }
        hVar.onPreviewProgress(qVar.r, j12);
        hVar.onStateChanged(qVar.e());
        return true;
    }

    public boolean start() {
        ri.q qVar = this.session;
        qVar.getClass();
        ri.q.p();
        if (qVar.m != ri.o.a) {
            return false;
        }
        File file = qVar.b;
        if ((!file.isDirectory() && !file.mkdirs()) || !file.canWrite()) {
            qVar.g(new IllegalStateException("Output directory is not writable: " + file));
            return false;
        }
        qVar.g.b("start requested");
        qVar.d();
        qVar.r(ri.o.b);
        qVar.t(null);
        return true;
    }

    public boolean togglePause() {
        ri.q qVar = this.session;
        qVar.getClass();
        ri.q.p();
        ri.o oVar = qVar.e().a;
        if (oVar == ri.o.c) {
            return this.session.m();
        }
        ri.o oVar2 = ri.o.e;
        if (oVar != oVar2) {
            return false;
        }
        final ri.q qVar2 = this.session;
        qVar2.getClass();
        ri.q.p();
        if (qVar2.m != oVar2) {
            return false;
        }
        qVar2.g.b("resume requested: trim=" + qVar2.r + ".." + qVar2.s + ", sourceDurationMs=" + qVar2.j());
        qVar2.o();
        qVar2.r(ri.o.f);
        final ri.k kVar = qVar2.z;
        if (kVar == null) {
            qVar2.g(new IllegalStateException("Output generation is missing"));
            return true;
        }
        final long j10 = qVar2.r;
        final long j11 = qVar2.s;
        final long j12 = ((j11 - j10) * 48000) / 1000;
        qVar2.k(ri.l.a);
        qVar2.i.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.f
            @Override // java.lang.Runnable
            public final void run() {
                File file;
                File file2;
                long j13 = j12;
                q qVar3 = q.this;
                Handler handler = qVar3.h;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                File file3 = kVar.b;
                long j14 = j10;
                long j15 = j11;
                if (j14 <= 0) {
                    file = file3;
                    try {
                        if (j15 >= q.q(qVar3.p)) {
                            file2 = file;
                            qVar3.g.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j14 + ".." + j15 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            handler.post(new ri.e(qVar3, j13, file2, 0));
                        }
                    } catch (Throwable th2) {
                        handler.post(new ri.d(qVar3, th2, 1));
                        return;
                    }
                } else {
                    file = file3;
                }
                file2 = qVar3.f("trim");
                boolean b10 = AudioRecorderNative.b(file.getAbsolutePath(), file2.getAbsolutePath(), j14, j15);
                j15 = j15;
                if (!b10) {
                    throw new IllegalStateException("Unable to trim Opus prefix");
                }
                qVar3.g.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j14 + ".." + j15 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                handler.post(new ri.e(qVar3, j13, file2, 0));
            }
        });
        return true;
    }

    /* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
    public class 2 implements ri.m {
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

        @Override // ri.m
        public void onOutputCompleted(long j10, File file, long j11, long j12) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
        }

        @Override // ri.m
        public void onOutputInvalidated(long j10, ri.l lVar) {
            File file;
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                file = (File) AudioRecorderV2Controller.this.outputFiles.remove(Long.valueOf(j10));
            }
            if (file != null) {
                AudioRecorderV2Controller.this.mainHandler.post(new s(this, j10, this.val$listener, file, 0));
            }
        }

        @Override // ri.m
        public void onOutputStarted(long j10, File file) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
            AudioRecorderV2Controller.this.mainHandler.post(new s(this, j10, this.val$listener, file, 1));
        }

        @Override // ri.m
        public /* bridge */ /* synthetic */ void onOutputError(long j10, Exception exc) {
        }

        @Override // ri.m
        public /* bridge */ /* synthetic */ void onBytesAvailable(long j10, File file, long j11, long j12) {
        }
    }
}
