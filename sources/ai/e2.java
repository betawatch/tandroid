package ai;

import android.os.Bundle;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.util.Log;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class e2 implements RecognitionListener {
    public final int a;
    public long b;
    public final /* synthetic */ f2 c;

    public e2(f2 f2Var, int i7) {
        this.c = f2Var;
        this.a = i7;
    }

    @Override // android.speech.RecognitionListener
    public final void onBeginningOfSpeech() {
        this.c.m = 0;
        Log.d("Dictation", "session " + this.a + " speech begins");
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSegmentedSession() {
        StringBuilder sb2 = new StringBuilder("session ");
        int i7 = this.a;
        sb2.append(i7);
        sb2.append(" end of segmented session");
        Log.d("Dictation", sb2.toString());
        this.c.k(i7, "");
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        Log.d("Dictation", "session " + this.a + " end of speech");
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i7) {
        this.c.j(this.a, i7);
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        String a10 = f2.a(bundle);
        if (a10 == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.b;
        f2 f2Var = this.c;
        int i7 = this.a;
        if (j3 > 400 || i7 != f2Var.k) {
            this.b = elapsedRealtime;
            StringBuilder m10 = i5.c.m(i7, "session ", " partial ");
            m10.append(l2.c(a10));
            p5.c.t(m10, i7 != f2Var.k ? " (stale)" : "", "Dictation");
        }
        f2Var.l(i7, a10);
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        f2 f2Var = this.c;
        f2Var.l = 0;
        Log.d("Dictation", "session " + this.a + " ready in " + (SystemClock.elapsedRealtime() - f2Var.o) + " ms");
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        this.c.k(this.a, f2.a(bundle));
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f10) {
        f2 f2Var = this.c;
        if (this.a == f2Var.k && !f2Var.j && f2Var.u == null) {
            f2Var.d.h(Math.max(0.0f, Math.min(1.0f, (f10 + 2.0f) / 12.0f)));
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onSegmentResults(Bundle bundle) {
        String a10 = f2.a(bundle);
        f2 f2Var = this.c;
        if (f2Var.j) {
            return;
        }
        int i7 = this.a;
        StringBuilder m10 = i5.c.m(i7, "session ", " segment ");
        m10.append(l2.c(a10));
        Log.d("Dictation", m10.toString());
        l2 l2Var = f2Var.g;
        boolean z10 = false;
        if (l2Var.h(i7)) {
            String n10 = l2Var.n();
            if (a10 != null && !a10.trim().isEmpty()) {
                l2Var.a(a10.trim(), l2Var.d);
            }
            l2Var.b = l2.i(l2Var.b, l2Var.c);
            l2Var.c = "";
            l2Var.d = false;
            z10 = !n10.equals(l2Var.n());
        } else {
            StringBuilder m11 = i5.c.m(i7, "session ", " STALE segment ignored: ");
            m11.append(l2.c(a10));
            l2Var.j(m11.toString());
        }
        if (z10) {
            f2Var.f();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i7, Bundle bundle) {
    }
}
