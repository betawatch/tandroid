package ai;

import android.os.Bundle;
import android.os.SystemClock;
import android.speech.RecognitionListener;
import android.util.Log;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a2 implements RecognitionListener {
    public final int a;
    public long b;
    public final /* synthetic */ b2 c;

    public a2(b2 b2Var, int i7) {
        this.c = b2Var;
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
        String a10 = b2.a(bundle);
        if (a10 == null) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.b;
        b2 b2Var = this.c;
        int i7 = this.a;
        if (j3 > 400 || i7 != b2Var.k) {
            this.b = elapsedRealtime;
            StringBuilder m10 = i5.c.m(i7, "session ", " partial \"");
            m10.append(h2.c(a10));
            m10.append("\"");
            r.b.t(m10, i7 != b2Var.k ? " (stale)" : "", "Dictation");
        }
        b2Var.k(i7, a10);
    }

    @Override // android.speech.RecognitionListener
    public final void onReadyForSpeech(Bundle bundle) {
        b2 b2Var = this.c;
        b2Var.l = 0;
        Log.d("Dictation", "session " + this.a + " ready in " + (SystemClock.elapsedRealtime() - b2Var.o) + " ms");
    }

    @Override // android.speech.RecognitionListener
    public final void onResults(Bundle bundle) {
        this.c.j(this.a, b2.a(bundle));
    }

    @Override // android.speech.RecognitionListener
    public final void onRmsChanged(float f10) {
        b2 b2Var = this.c;
        if (this.a == b2Var.k && !b2Var.j && b2Var.u == null) {
            b2Var.d.h(Math.max(0.0f, Math.min(1.0f, (f10 + 2.0f) / 12.0f)));
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onSegmentResults(Bundle bundle) {
        String a10 = b2.a(bundle);
        b2 b2Var = this.c;
        if (b2Var.j) {
            return;
        }
        int i7 = this.a;
        StringBuilder m10 = i5.c.m(i7, "session ", " segment \"");
        m10.append(h2.c(a10));
        m10.append("\"");
        Log.d("Dictation", m10.toString());
        h2 h2Var = b2Var.g;
        boolean z10 = false;
        if (h2Var.h(i7)) {
            String n10 = h2Var.n();
            if (a10 != null && !a10.trim().isEmpty()) {
                h2Var.a(a10.trim(), h2Var.d);
            }
            h2Var.b = h2.i(h2Var.b, h2Var.c);
            h2Var.c = "";
            h2Var.d = false;
            z10 = !n10.equals(h2Var.n());
        } else {
            StringBuilder m11 = i5.c.m(i7, "session ", " STALE segment ignored: ");
            m11.append(h2.c(a10));
            h2Var.j(m11.toString());
        }
        if (z10) {
            b2Var.e();
        }
    }

    @Override // android.speech.RecognitionListener
    public final void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public final void onEvent(int i7, Bundle bundle) {
    }
}
