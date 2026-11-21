package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class h21 {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ org.telegram.messenger.fj b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public h21(Integer num, org.telegram.messenger.fj fjVar, int i7, long j3, long j10) {
        this.a = num;
        this.b = fjVar;
        this.c = i7;
        this.d = j3;
        this.e = j10;
    }

    public final void a(String str, int[] iArr, boolean z10) {
        if (z10) {
            HashMap hashMap = j21.S;
            Integer num = this.a;
            hashMap.remove(num);
            j21.R.remove(num);
        }
        org.telegram.messenger.fj fjVar = this.b;
        if (str == null) {
            j21.m(fjVar);
            return;
        }
        TLRPC.Message message = fjVar.k;
        if (z10) {
            org.telegram.messenger.g0.h3(new bi.p4(fjVar, message, str, iArr, this.c, this.d), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.e)));
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        message.voiceTranscription = str;
        message.voiceTranscriptionWords = iArr;
        message.voiceTranscriptionLocal = true;
        message.voiceTranscriptionFinal = false;
        message.voiceTranscriptionOpen = true;
        j21.p(fjVar);
        org.telegram.messenger.ks.f(this.c).k(org.telegram.messenger.ks.A1, fjVar, null, null, Boolean.TRUE, Boolean.FALSE);
    }
}
