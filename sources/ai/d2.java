package ai;

import android.os.Bundle;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.util.Log;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class d2 implements RecognitionListener {
    public final int a;
    public long b;
    public final /* synthetic */ e2 c;

    public d2(e2 e2Var, int i7) {
        this.c = e2Var;
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
        this.c.j(i7, "");
    }

    @Override // android.speech.RecognitionListener
    public final void onEndOfSpeech() {
        Log.d("Dictation", "session " + this.a + " end of speech");
    }

    @Override // android.speech.RecognitionListener
    public final void onError(int i7) {
        this.c.i(this.a, i7);
    }

    @Override // android.speech.RecognitionListener
    public final void onPartialResults(Bundle bundle) {
        String a10 = e2.a(bundle);
        if (a10 == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.b;
        e2 e2Var = this.c;
        int i7 = this.a;
        if (j3 > 400 || i7 != e2Var.k) {
            this.b = elapsedRealtime;
            StringBuilder m10 = i5.c.m(i7, "session ", " partial ");
            m10.append(k2.c(a10));
            p5.c.t(m10, i7 != e2Var.k ? " (stale)" : "", "Dictation");
        }
        e2Var.k(i7, a10);
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        e2 e2Var = this.c;
        e2Var.l = 0;
        Log.d("Dictation", "session " + this.a + " ready in " + (SystemClock.elapsedRealtime() - e2Var.o) + " ms");
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        this.c.j(this.a, e2.a(bundle));
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f10) {
        e2 e2Var = this.c;
        if (this.a == e2Var.k && !e2Var.j && e2Var.u == null) {
            e2Var.d.h(Math.max(0.0f, Math.min(1.0f, (f10 + 2.0f) / 12.0f)));
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onSegmentResults(Bundle bundle) {
        String a10 = e2.a(bundle);
        e2 e2Var = this.c;
        if (e2Var.j) {
            return;
        }
        int i7 = this.a;
        StringBuilder m10 = i5.c.m(i7, "session ", " segment ");
        m10.append(k2.c(a10));
        Log.d("Dictation", m10.toString());
        k2 k2Var = e2Var.g;
        boolean z10 = false;
        if (k2Var.h(i7)) {
            String n10 = k2Var.n();
            if (a10 != null && !a10.trim().isEmpty()) {
                k2Var.a(a10.trim(), k2Var.d);
            }
            k2Var.b = k2.i(k2Var.b, k2Var.c);
            k2Var.c = "";
            k2Var.d = false;
            z10 = !n10.equals(k2Var.n());
        } else {
            StringBuilder m11 = i5.c.m(i7, "session ", " STALE segment ignored: ");
            m11.append(k2.c(a10));
            k2Var.j(m11.toString());
        }
        if (z10) {
            e2Var.e();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i7, Bundle bundle) {
    }
}
