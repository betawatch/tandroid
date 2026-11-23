package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class h21 {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ org.telegram.messenger.gj b;
    public final /* synthetic */ int c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;

    public h21(Integer num, org.telegram.messenger.gj gjVar, int i7, long j3, long j10) {
        this.a = num;
        this.b = gjVar;
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
        org.telegram.messenger.gj gjVar = this.b;
        if (str == null) {
            j21.n(gjVar);
            return;
        }
        TLRPC.Message message = gjVar.k;
        if (z10) {
            org.telegram.messenger.g0.h3(new bi.p4(gjVar, message, str, iArr, this.c, this.d), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.e)));
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
        j21.q(gjVar);
        org.telegram.messenger.ls.f(this.c).k(org.telegram.messenger.ls.A1, gjVar, null, null, Boolean.TRUE, Boolean.FALSE);
    }
}
