package org.telegram.messenger;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.io.File;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
final class AudioRecorderV2Controller {
    private boolean finishRequested;
    private final Listener listener;
    private boolean released;
    private final ui.o session;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Object outputLock = new Object();
    private final HashMap<Long, File> outputFiles = new HashMap<>();
    private final HashSet<Long> deliveredOutputIds = new HashSet<>();
    private ui.m previousState = ui.m.a;

    /* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
    public interface Listener {
        void onCompleted(ui.l lVar);

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
        di.p4 p4Var = new di.p4(context, 2);
        p4Var.c = file;
        ui.h hVar = (ui.h) wi.e.c.a();
        if (hVar == null) {
            throw new IllegalArgumentException("Noise suppression mode is required");
        }
        p4Var.d = hVar;
        p4Var.a = false;
        p4Var.e = new ui.f() { // from class: org.telegram.messenger.AudioRecorderV2Controller.3
            @Override // ui.f
            public void onCompleted(ui.l lVar) {
                listener.onCompleted(lVar);
            }

            @Override // ui.f
            public void onError(Exception exc) {
                listener.onError(exc);
            }

            @Override // ui.f
            public void onPreviewReady(long j10, long j11, long j12, byte[] bArr) {
                if (AudioRecorderV2Controller.this.finishRequested) {
                    AudioRecorderV2Controller.this.finishRequested = false;
                    AudioRecorderV2Controller.this.session.h();
                    return;
                }
                ui.o oVar = AudioRecorderV2Controller.this.session;
                oVar.getClass();
                ui.o.p();
                ui.i iVar = oVar.A;
                File file2 = (oVar.n != ui.m.e || iVar == null) ? null : iVar.b;
                if (file2 == null) {
                    listener.onError(new IllegalStateException("Preview file is unavailable"));
                } else {
                    listener.onPreviewReady(j10, file2, bArr);
                }
            }

            @Override // ui.f
            public void onRecordingProgress(long j10, double d) {
                listener.onRecordingProgress(j10, d);
            }

            @Override // ui.f
            public void onRecordingTooShort(long j10) {
                listener.onRecordingTooShort(j10);
            }

            @Override // ui.f
            public void onStateChanged(ui.n nVar) {
                ui.m mVar = nVar.a;
                ui.m mVar2 = AudioRecorderV2Controller.this.previousState;
                AudioRecorderV2Controller.this.previousState = mVar;
                if (mVar == ui.m.c) {
                    if (!AudioRecorderV2Controller.this.finishRequested && mVar2 == ui.m.b) {
                        listener.onRecordingStarted();
                    } else if (!AudioRecorderV2Controller.this.finishRequested && mVar2 == ui.m.f) {
                        listener.onRecordingResumed();
                    }
                    AudioRecorderV2Controller.this.completePendingFinish(mVar);
                }
            }

            @Override // ui.f
            public /* bridge */ /* synthetic */ void onMaximumDurationReached() {
            }

            @Override // ui.f
            public /* bridge */ /* synthetic */ void onPreviewPlaybackChanged(boolean z10) {
            }

            @Override // ui.f
            public /* bridge */ /* synthetic */ void onPreviewProgress(long j10, long j11) {
            }
        };
        p4Var.f = new 2(listener);
        p4Var.g = new ui.g() { // from class: org.telegram.messenger.AudioRecorderV2Controller.1
            @Override // ui.g
            public void error(String str, Throwable th2) {
                FileLog.e("AudioRecorderV2 " + str, th2);
            }

            @Override // ui.g
            public void log(String str) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("AudioRecorderV2 " + str);
                }
            }
        };
        if (((ui.f) p4Var.e) == null) {
            throw new IllegalStateException("Session listener is required");
        }
        if (((ui.k) p4Var.f) == null) {
            throw new IllegalStateException("Output listener is required");
        }
        this.session = new ui.o(p4Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void completePendingFinish(ui.m mVar) {
        if (this.finishRequested) {
            if (mVar == ui.m.c || mVar == ui.m.e) {
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
        ui.o oVar = this.session;
        oVar.getClass();
        ui.o.p();
        ui.l lVar = null;
        lVar = null;
        lVar = null;
        lVar = null;
        lVar = null;
        if (oVar.n == ui.m.e && oVar.A != null && oVar.s == 0 && oVar.t == oVar.j()) {
            oVar.o();
            ui.i iVar = oVar.A;
            long j10 = oVar.j();
            long length = iVar.b.length();
            oVar.a(iVar, length);
            synchronized (oVar.l) {
                if (iVar.d && !iVar.e) {
                    iVar.e = true;
                    oVar.k.execute(new ui.c(oVar, iVar, length, j10, 0));
                    File file = iVar.b;
                    byte[] bArr = oVar.C;
                    oVar.D = new ui.l(file, j10, bArr != null ? (byte[]) bArr.clone() : null);
                    oVar.r(ui.m.n);
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
        ui.o oVar = this.session;
        oVar.getClass();
        ui.o.p();
        completePendingFinish(oVar.e().a);
    }

    public boolean isPreviewing() {
        ui.o oVar = this.session;
        oVar.getClass();
        ui.o.p();
        return oVar.e().a == ui.m.e;
    }

    public void release() {
        this.session.n();
        this.released = true;
    }

    public boolean setTrimRange(long j10, long j11) {
        ui.o oVar = this.session;
        oVar.getClass();
        ui.f fVar = oVar.f;
        ui.o.p();
        if (oVar.n != ui.m.e) {
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
        i2.j0 j0Var = oVar.B;
        if (j0Var != null) {
            j0Var.Z0(5, max);
        }
        fVar.onPreviewProgress(oVar.s, j12);
        fVar.onStateChanged(oVar.e());
        return true;
    }

    public boolean start() {
        ui.o oVar = this.session;
        oVar.getClass();
        ui.o.p();
        if (oVar.n != ui.m.a) {
            return false;
        }
        File file = oVar.b;
        if ((!file.isDirectory() && !file.mkdirs()) || !file.canWrite()) {
            oVar.g(new IllegalStateException("Output directory is not writable: " + file));
            return false;
        }
        oVar.h.b("start requested");
        oVar.d();
        oVar.r(ui.m.b);
        oVar.t(0L, -1L, null);
        return true;
    }

    public boolean togglePause() {
        ui.o oVar = this.session;
        oVar.getClass();
        ui.o.p();
        ui.m mVar = oVar.e().a;
        if (mVar == ui.m.c) {
            return this.session.m();
        }
        ui.m mVar2 = ui.m.e;
        if (mVar == mVar2) {
            ui.o oVar2 = this.session;
            oVar2.getClass();
            ui.o.p();
            if (oVar2.n == mVar2) {
                oVar2.h.b("resume requested: trim=" + oVar2.s + ".." + oVar2.t + ", sourceDurationMs=" + oVar2.j());
                oVar2.o();
                oVar2.r(ui.m.f);
                ui.i iVar = oVar2.A;
                if (iVar == null) {
                    oVar2.g(new IllegalStateException("Output generation is missing"));
                    return true;
                }
                long j10 = oVar2.s;
                long j11 = oVar2.t;
                boolean z10 = j11 >= ui.o.q(oVar2.q);
                oVar2.k(ui.j.a);
                long j12 = ((j11 - j10) * 48000) / 1000;
                oVar2.q = j12;
                oVar2.s = 0L;
                oVar2.t = ui.o.q(j12);
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

    /* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
    public class 2 implements ui.k {
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

        @Override // ui.k
        public void onOutputCompleted(long j10, File file, long j11, long j12) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
        }

        @Override // ui.k
        public void onOutputInvalidated(long j10, ui.j jVar) {
            File file;
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                file = (File) AudioRecorderV2Controller.this.outputFiles.remove(Long.valueOf(j10));
            }
            if (file != null) {
                AudioRecorderV2Controller.this.mainHandler.post(new u(this, j10, this.val$listener, file, 0));
            }
        }

        @Override // ui.k
        public void onOutputStarted(long j10, File file) {
            synchronized (AudioRecorderV2Controller.this.outputLock) {
                AudioRecorderV2Controller.this.outputFiles.put(Long.valueOf(j10), file);
            }
            AudioRecorderV2Controller.this.mainHandler.post(new u(this, j10, this.val$listener, file, 1));
        }

        @Override // ui.k
        public /* bridge */ /* synthetic */ void onOutputError(long j10, Exception exc) {
        }

        @Override // ui.k
        public /* bridge */ /* synthetic */ void onBytesAvailable(long j10, File file, long j11, long j12) {
        }
    }
}
