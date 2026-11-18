package ii;

import ai.v1;
import android.os.SystemClock;
import android.text.TextUtils;
import bi.k1;
import bi.l4;
import bi.r3;
import bi.s4;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.r1;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.g21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.TwoStepVerificationActivity;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements r1 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ h(long j3, v1 v1Var, int i7, long j10, s4 s4Var) {
        this.c = j3;
        this.e = v1Var;
        this.b = i7;
        this.d = j10;
        this.f = s4Var;
    }

    public void a(String str, int[] iArr, boolean z10) {
        Integer num = (Integer) this.e;
        fj fjVar = (fj) this.f;
        if (z10) {
            g21.S.remove(num);
            g21.R.remove(num);
        }
        if (str == null) {
            g21.m(fjVar);
            return;
        }
        TLRPC.Message message = fjVar.k;
        int i7 = this.b;
        if (z10) {
            g0.h3(new l4(fjVar, message, str, iArr, i7, this.c), Math.max(0L, 350 - (SystemClock.elapsedRealtime() - this.d)));
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
        g21.o(fjVar);
        ks.f(i7).k(ks.A1, fjVar, null, null, Boolean.TRUE, Boolean.FALSE);
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void h(u1 u1Var, int i7) {
        switch (this.a) {
            case 0:
                v1 v1Var = (v1) this.e;
                s4 s4Var = (s4) this.f;
                h2 T = LaunchActivity.T();
                if (T != null) {
                    TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                    j jVar = new j(T, this.c, twoStepVerificationActivity, v1Var, this.b, this.d, s4Var);
                    twoStepVerificationActivity.a0 = 1;
                    twoStepVerificationActivity.c0 = jVar;
                    twoStepVerificationActivity.x0(new b(T, twoStepVerificationActivity, 1));
                    break;
                }
                break;
            default:
                boolean[] zArr = (boolean[]) this.e;
                r3 r3Var = (r3) this.f;
                if (!zArr[0]) {
                    zArr[0] = true;
                    TL_bots.setCustomVerification setcustomverification = new TL_bots.setCustomVerification();
                    setcustomverification.enabled = false;
                    setcustomverification.flags |= 1;
                    int i10 = this.b;
                    setcustomverification.bot = mp.u1(i10).q1(this.c);
                    setcustomverification.peer = mp.u1(i10).l1(this.d);
                    ConnectionsManager.getInstance(i10).sendRequest(setcustomverification, new k1(24, zArr, r3Var));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ h(Integer num, fj fjVar, int i7, long j3, long j10) {
        this.e = num;
        this.f = fjVar;
        this.b = i7;
        this.c = j3;
        this.d = j10;
    }

    public /* synthetic */ h(boolean[] zArr, int i7, long j3, long j10, r3 r3Var) {
        this.e = zArr;
        this.b = i7;
        this.c = j3;
        this.d = j10;
        this.f = r3Var;
    }
}
