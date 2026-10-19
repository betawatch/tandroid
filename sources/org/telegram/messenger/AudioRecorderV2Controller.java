package org.telegram.messenger;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.ui.yb0;
import ri.p;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
final class AudioRecorderV2Controller {
    private boolean finishRequested;
    private final Listener listener;
    private boolean released;
    private final ri.p session;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Object outputLock = new Object();
    private final HashMap<Long, File> outputFiles = new HashMap<>();
    private final HashSet<Long> deliveredOutputIds = new HashSet<>();
    private ri.n previousState = ri.n.a;

    /* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
    public interface Listener {
        void onCompleted(ri.m mVar);

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
        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l();
        lVar.c = ri.i.a;
        lVar.f = ri.p.G;
        lVar.a = context;
        lVar.b = file;
        ri.i iVar = (ri.i) ti.e.c.a();
        if (iVar == null) {
            throw new IllegalArgumentException("Noise suppression mode is required");
        }
        lVar.c = iVar;
        lVar.d = new ri.g() { // from class: org.telegram.messenger.AudioRecorderV2Controller.3
            @Override // ri.g
            public void onCompleted(ri.m mVar) {
                listener.onCompleted(mVar);
            }

            @Override // ri.g
            public void onError(Exception exc) {
                listener.onError(exc);
            }

            @Override // ri.g
            public void onPreviewReady(long j10, long j11, long j12, byte[] bArr) {
                if (AudioRecorderV2Controller.this.finishRequested) {
                    AudioRecorderV2Controller.this.finishRequested = false;
                    AudioRecorderV2Controller.this.session.h();
                    return;
                }
                ri.p pVar = AudioRecorderV2Controller.this.session;
                pVar.getClass();
                ri.p.p();
                ri.j jVar = pVar.z;
                File file2 = (pVar.m != ri.n.e || jVar == null) ? null : jVar.b;
                if (file2 == null) {
                    listener.onError(new IllegalStateException("Preview file is unavailable"));
                } else {
                    listener.onPreviewReady(j10, file2, bArr);
                }
            }

            @Override // ri.g
            public void onRecordingProgress(long j10, double d) {
                listener.onRecordingProgress(j10, d);
            }

            @Override // ri.g
            public void onRecordingTooShort(long j10) {
                listener.onRecordingTooShort(j10);
            }

            @Override // ri.g
            public void onStateChanged(ri.o oVar) {
                ri.n nVar = oVar.a;
                ri.n nVar2 = AudioRecorderV2Controller.this.previousState;
                AudioRecorderV2Controller.this.previousState = nVar;
                if (nVar == ri.n.c) {
                    if (!AudioRecorderV2Controller.this.finishRequested && nVar2 == ri.n.b) {
                        listener.onRecordingStarted();
                    } else if (!AudioRecorderV2Controller.this.finishRequested && nVar2 == ri.n.f) {
                        listener.onRecordingResumed();
                    }
                    AudioRecorderV2Controller.this.completePendingFinish(nVar);
                }
            }

            @Override // ri.g
            public /* bridge */ /* synthetic */ void onMaximumDurationReached() {
            }

            @Override // ri.g
            public /* bridge */ /* synthetic */ void onPreviewPlaybackChanged(boolean z10) {
            }

            @Override // ri.g
            public /* bridge */ /* synthetic */ void onPreviewProgress(long j10, long j11) {
            }
        };
        lVar.e = new 2(listener);
        lVar.f = new ri.h() { // from class: org.telegram.messenger.AudioRecorderV2Controller.1
            @Override // ri.h
            public void error(String str, Throwable th2) {
                FileLog.e("AudioRecorderV2 " + str, th2);
            }

            @Override // ri.h
            public void log(String str) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("AudioRecorderV2 " + str);
                }
            }
        };
        if (((ri.g) lVar.d) == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (((ri.l) lVar.e) == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.session = new ri.p(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completePendingFinish(ri.n nVar) {
        if (this.finishRequested) {
            if (nVar == ri.n.c || nVar == ri.n.e) {
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
        ri.p pVar = this.session;
        pVar.getClass();
        ri.p.p();
        ri.m mVar = null;
        mVar = null;
        mVar = null;
        mVar = null;
        mVar = null;
        if (pVar.m == ri.n.e && pVar.z != null && pVar.r == 0 && pVar.s == pVar.j()) {
            pVar.o();
            ri.j jVar = pVar.z;
            long j10 = pVar.j();
            long length = jVar.b.length();
            pVar.a(jVar, length);
            synchronized (pVar.k) {
                if (jVar.d && !jVar.e) {
                    jVar.e = true;
                    pVar.j.execute(new ri.c(pVar, jVar, length, j10, 0));
                    File file = jVar.b;
                    byte[] bArr = pVar.B;
                    pVar.C = new ri.m(file, j10, bArr != null ? (byte[]) bArr.clone() : null);
                    pVar.r(ri.n.n);
                    pVar.c();
                    pVar.s();
                    pVar.l("detached_preview");
                    mVar = pVar.C;
                }
            }
        }
        if (mVar == null) {
            return false;
        }
        this.session.n();
        this.released = true;
        return true;
    }

    public void finishWhenReady() {
        this.finishRequested = true;
        ri.p pVar = this.session;
        pVar.getClass();
        ri.p.p();
        completePendingFinish(pVar.e().a);
    }

    public boolean isPreviewing() {
        ri.p pVar = this.session;
        pVar.getClass();
        ri.p.p();
        return pVar.e().a == ri.n.e;
    }

    public void release() {
        this.session.n();
        this.released = true;
    }

    public boolean setTrimRange(long j10, long j11) {
        ri.p pVar = this.session;
        pVar.getClass();
        ri.g gVar = pVar.e;
        ri.p.p();
        if (pVar.m != ri.n.e) {
            return false;
        }
        long j12 = pVar.j();
        long max = Math.max(0L, Math.min(j12, j10));
        long max2 = Math.max(max, Math.min(j12, j11));
        if (max2 - max < Math.min(pVar.c, j12)) {
            return false;
        }
        pVar.r = max;
        pVar.s = max2;
        i2.i0 i0Var = pVar.A;
        if (i0Var != null) {
            i0Var.Z0(5, max);
        }
        gVar.onPreviewProgress(pVar.r, j12);
        gVar.onStateChanged(pVar.e());
        return true;
    }

    public boolean start() {
        ri.p pVar = this.session;
        pVar.getClass();
        ri.p.p();
        if (pVar.m != ri.n.a) {
            return false;
        }
        File file = pVar.b;
        if ((!file.isDirectory() && !file.mkdirs()) || !file.canWrite()) {
            pVar.g(new IllegalStateException("Output directory is not writable: " + file));
            return false;
        }
        pVar.g.b("start requested");
        pVar.d();
        pVar.r(ri.n.b);
        pVar.t(null);
        return true;
    }

    public boolean togglePause() {
        ri.p pVar = this.session;
        pVar.getClass();
        ri.p.p();
        ri.n nVar = pVar.e().a;
        if (nVar == ri.n.c) {
            return this.session.m();
        }
        ri.n nVar2 = ri.n.e;
        if (nVar != nVar2) {
            return false;
        }
        final ri.p pVar2 = this.session;
        pVar2.getClass();
        ri.p.p();
        if (pVar2.m != nVar2) {
            return false;
        }
        pVar2.g.b("resume requested: trim=" + pVar2.r + ".." + pVar2.s + ", sourceDurationMs=" + pVar2.j());
        pVar2.o();
        pVar2.r(ri.n.f);
        final ri.j jVar = pVar2.z;
        if (jVar == null) {
            pVar2.g(new IllegalStateException("Output generation is missing"));
            return true;
        }
        final long j10 = pVar2.r;
        final long j11 = pVar2.s;
        final long j12 = ((j11 - j10) * 48000) / 1000;
        pVar2.k(ri.k.a);
        pVar2.i.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.f
            @Override // java.lang.Runnable
            public final void run() {
                File file;
                File file2;
                long j13 = j12;
                p pVar3 = p.this;
                Handler handler = pVar3.h;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                File file3 = jVar.b;
                long j14 = j10;
                long j15 = j11;
                if (j14 <= 0) {
                    file = file3;
                    try {
                        if (j15 >= p.q(pVar3.p)) {
                            file2 = file;
                            pVar3.g.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j14 + ".." + j15 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                            handler.post(new yb0(pVar3, j13, file2, 3));
                        }
                    } catch (Throwable th2) {
                        handler.post(new ri.d(pVar3, th2, 1));
                        return;
                    }
                } else {
                    file = file3;
                }
                file2 = pVar3.f("trim");
                boolean b10 = AudioRecorderNative.b(file.getAbsolutePath(), file2.getAbsolutePath(), j14, j15);
                j15 = j15;
                if (!b10) {
                    throw new IllegalStateException("Unable to trim Opus prefix");
                }
                pVar3.g.b("resume prefix prepared: source=" + file.getName() + ", prefix=" + file2.getName() + ", trim=" + j14 + ".." + j15 + ", bytes=" + file2.length() + ", elapsedMs=" + (SystemClock.elapsedRealtime() - elapsedRealtime));
                handler.post(new yb0(pVar3, j13, file2, 3));
            }
        });
        return true;
    }

    /* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
    public class 2 implements ri.l {
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

        @Override // ri.l
        public void onOutputCompleted(long j10, File file, long j11, long j12) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
        }

        @Override // ri.l
        public void onOutputInvalidated(long j10, ri.k kVar) {
            File file;
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                file = (File) AudioRecorderV2Controller.this.outputFiles.remove(Long.valueOf(j10));
            }
            if (file != null) {
                AudioRecorderV2Controller.this.mainHandler.post(new q(this, j10, this.val$listener, file, 0));
            }
        }

        @Override // ri.l
        public void onOutputStarted(long j10, File file) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
            AudioRecorderV2Controller.this.mainHandler.post(new q(this, j10, this.val$listener, file, 1));
        }

        @Override // ri.l
        public /* bridge */ /* synthetic */ void onOutputError(long j10, Exception exc) {
        }

        @Override // ri.l
        public /* bridge */ /* synthetic */ void onBytesAvailable(long j10, File file, long j11, long j12) {
        }
    }
}
