package ai;

import android.os.Bundle;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.util.Log;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class b2 implements RecognitionListener {
    public final int a;
    public long b;
    public final /* synthetic */ c2 c;

    public b2(c2 c2Var, int i7) {
        this.c = c2Var;
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
        String a10 = c2.a(bundle);
        if (a10 == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.b;
        c2 c2Var = this.c;
        int i7 = this.a;
        if (j3 > 400 || i7 != c2Var.k) {
            this.b = elapsedRealtime;
            StringBuilder m10 = i5.c.m(i7, "session ", " partial \"");
            m10.append(i2.c(a10));
            m10.append("\"");
            r.b.t(m10, i7 != c2Var.k ? " (stale)" : "", "Dictation");
        }
        c2Var.k(i7, a10);
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        c2 c2Var = this.c;
        c2Var.l = 0;
        Log.d("Dictation", "session " + this.a + " ready in " + (SystemClock.elapsedRealtime() - c2Var.o) + " ms");
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        this.c.j(this.a, c2.a(bundle));
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f10) {
        c2 c2Var = this.c;
        if (this.a == c2Var.k && !c2Var.j && c2Var.u == null) {
            c2Var.d.h(Math.max(0.0f, Math.min(1.0f, (f10 + 2.0f) / 12.0f)));
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onSegmentResults(Bundle bundle) {
        String a10 = c2.a(bundle);
        c2 c2Var = this.c;
        if (c2Var.j) {
            return;
        }
        int i7 = this.a;
        StringBuilder m10 = i5.c.m(i7, "session ", " segment \"");
        m10.append(i2.c(a10));
        m10.append("\"");
        Log.d("Dictation", m10.toString());
        i2 i2Var = c2Var.g;
        boolean z10 = false;
        if (i2Var.h(i7)) {
            String n10 = i2Var.n();
            if (a10 != null && !a10.trim().isEmpty()) {
                i2Var.a(a10.trim(), i2Var.d);
            }
            i2Var.b = i2.i(i2Var.b, i2Var.c);
            i2Var.c = "";
            i2Var.d = false;
            z10 = !n10.equals(i2Var.n());
        } else {
            StringBuilder m11 = i5.c.m(i7, "session ", " STALE segment ignored: ");
            m11.append(i2.c(a10));
            i2Var.j(m11.toString());
        }
        if (z10) {
            c2Var.e();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i7, Bundle bundle) {
    }
}
