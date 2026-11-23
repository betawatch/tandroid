package org.telegram.ui.Components;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class h21 {
    public final /* synthetic */ Integer a;
    public final /* synthetic */ org.telegram.messenger.gj b;
    public final /* synthetic */ org.telegram.ui.Cells.m1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public h21(Integer num, org.telegram.messenger.gj gjVar, org.telegram.ui.Cells.m1 m1Var, int i7, long j3, long j10) {
        this.a = num;
        this.b = gjVar;
        this.c = m1Var;
        this.d = i7;
        this.e = j3;
        this.f = j10;
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
            org.telegram.messenger.g0.h3(new bi.p4(gjVar, message, str, iArr, this.d, this.e), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.f)));
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
        org.telegram.messenger.ls.f(this.d).k(org.telegram.messenger.ls.A1, gjVar, null, null, Boolean.TRUE, Boolean.FALSE);
    }
}
