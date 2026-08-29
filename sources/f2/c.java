package f2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import h7.b9;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.x3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.tc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ff1;
import org.telegram.ui.t01;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class c implements OnFailureListener, o4.i, io, o3.l, o3.m, t4.f {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ c(long j10, Object obj, int i10) {
        this.a = i10;
        this.b = j10;
        this.c = obj;
    }

    public int A(int i10) {
        c cVar = (c) this.c;
        if (cVar == null) {
            return i10 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.b) + cVar.A(i10 - 64);
    }

    public void B() {
        if (((c) this.c) == null) {
            this.c = new c(0);
        }
    }

    public void C(ic.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    public boolean D(int i10) {
        if (i10 < 64) {
            return (this.b & (1 << i10)) != 0;
        }
        B();
        return ((c) this.c).D(i10 - 64);
    }

    @Override // o3.m
    public void D1(o3.t tVar) {
        ((o3.m) this.c).D1(new t3.c(this, tVar));
    }

    public void E(int i10, boolean z10) {
        if (i10 >= 64) {
            B();
            ((c) this.c).E(i10 - 64, z10);
            return;
        }
        long j10 = this.b;
        boolean z11 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i10) - 1;
        this.b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            J(i10);
        } else {
            x(i10);
        }
        if (z11 || ((c) this.c) != null) {
            B();
            ((c) this.c).E(0, z11);
        }
    }

    @Override // o4.i
    public long F(long j10) {
        return ((o3.f) this.c).a;
    }

    public boolean G(int i10) {
        if (i10 >= 64) {
            B();
            return ((c) this.c).G(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.b;
        boolean z10 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.b = j12;
        long j13 = j10 - 1;
        this.b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        c cVar = (c) this.c;
        if (cVar != null) {
            if (cVar.D(0)) {
                J(63);
            }
            ((c) this.c).G(0);
        }
        return z10;
    }

    @Override // o4.i
    public long H(long j10, long j11) {
        return ((o3.f) this.c).a;
    }

    public void I() {
        this.b = 0L;
        c cVar = (c) this.c;
        if (cVar != null) {
            cVar.I();
        }
    }

    public void J(int i10) {
        if (i10 < 64) {
            this.b |= 1 << i10;
        } else {
            B();
            ((c) this.c).J(i10 - 64);
        }
    }

    public void K(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.c) == null) {
            this.c = exc;
            this.b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.b) {
            Exception exc2 = (Exception) this.c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.c;
            this.c = null;
            throw exc3;
        }
    }

    @Override // o3.m
    public o3.w Z1(int i10, int i11) {
        return ((o3.m) this.c).Z1(i10, i11);
    }

    @Override // o3.l
    public void a(int i10, int i11, byte[] bArr) {
        ((o3.l) this.c).a(i10, i11, bArr);
    }

    @Override // o4.i
    public long b(long j10) {
        return ((o3.f) this.c).e[(int) j10] - this.b;
    }

    @Override // o3.l
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return ((o3.l) this.c).c(bArr, 0, i11, z10);
    }

    @Override // o3.l
    public int d(int i10, int i11, byte[] bArr) {
        return ((o3.l) this.c).d(i10, i11, bArr);
    }

    @Override // t4.f
    public int e(long j10) {
        return this.b > j10 ? 0 : -1;
    }

    @Override // o3.m
    public void e1() {
        ((o3.m) this.c).e1();
    }

    @Override // o3.l
    public boolean f(byte[] bArr, int i10, int i11, boolean z10) {
        return ((o3.l) this.c).f(bArr, i10, i11, z10);
    }

    @Override // o4.i
    public long g(long j10, long j11) {
        return ((o3.f) this.c).d[(int) j10];
    }

    @Override // o3.l
    public long getLength() {
        return ((o3.l) this.c).getLength() - this.b;
    }

    @Override // o3.l
    public long getPosition() {
        return ((o3.l) this.c).getPosition() - this.b;
    }

    @Override // o3.l
    public long h() {
        return ((o3.l) this.c).h() - this.b;
    }

    @Override // o3.l
    public void i(int i10) {
        ((o3.l) this.c).i(i10);
    }

    @Override // org.telegram.ui.Components.io
    public void j() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        ff1 ff1Var = new ff1(bundle);
        ff1Var.d = new ArrayList();
        ff1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        ff1Var.e = profileActivity.d5;
        profileActivity.presentFragment(ff1Var);
    }

    @Override // org.telegram.ui.Components.io
    public void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.c1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.c1, z10);
        if (profileActivity.fragmentView != null) {
            tc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // org.telegram.ui.Components.io
    public void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j10 = this.b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.c1);
            profileActivity.presentFragment(new t01(bundle, profileActivity.v0));
        }
    }

    @Override // t4.f
    public long m(int i10) {
        f5.a.f(i10 == 0);
        return this.b;
    }

    @Override // o4.i
    public long n(long j10, long j11) {
        return 0L;
    }

    @Override // o4.i
    public long o(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 1:
                ((b9) this.c).b.set(this.b);
                break;
            case 2:
            case 4:
            default:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j10 = this.b;
                Iterator it = ((q5.h) ((l3.g0) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((s5.p) it.next()).b(j10, statusCode, null);
                }
                break;
            case 3:
                ((b9) this.c).b.set(this.b);
                break;
            case 5:
                ((b9) this.c).b.set(this.b);
                break;
        }
    }

    @Override // o4.i
    public p4.j p(long j10) {
        return new p4.j(((o3.f) this.c).c[(int) j10], r1.b[r8], null);
    }

    @Override // t4.f
    public List q(long j10) {
        if (j10 >= this.b) {
            return (q8.z) this.c;
        }
        q8.x xVar = q8.z.b;
        return q8.l0.e;
    }

    @Override // o4.i
    public long r(long j10, long j11) {
        o3.f fVar = (o3.f) this.c;
        return f5.d0.e(fVar.e, j10 + this.b, true);
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public int read(byte[] bArr, int i10, int i11) {
        return ((o3.l) this.c).read(bArr, i10, i11);
    }

    @Override // o3.l
    public void readFully(byte[] bArr, int i10, int i11) {
        ((o3.l) this.c).readFully(bArr, i10, i11);
    }

    @Override // o3.l
    public void s() {
        ((o3.l) this.c).s();
    }

    @Override // o3.l
    public int skip(int i10) {
        return ((o3.l) this.c).skip(i10);
    }

    @Override // o3.l
    public void t(int i10) {
        ((o3.l) this.c).t(i10);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((c) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((c) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.Components.io
    public void u() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((o2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.b;
        boolean z10 = notificationsSettings.getBoolean(x3.j(j10, profileActivity.c1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(x3.j(j10, profileActivity.c1, new StringBuilder("sound_enabled_")), z11).apply();
        if (tc.a(profileActivity)) {
            tc.S(z10 ? 1 : 0, profileActivity, profileActivity.v0).j();
        }
    }

    @Override // t4.f
    public int v() {
        return 1;
    }

    @Override // org.telegram.ui.Components.io
    public void w(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.c1)) {
                k();
            }
            if (tc.a(profileActivity)) {
                tc.z(profileActivity, 4, i10, profileActivity.v0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.b, profileActivity.c1, i10);
        if (tc.a(profileActivity)) {
            tc.z(profileActivity, 5, i10, profileActivity.v0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public void x(int i10) {
        if (i10 < 64) {
            this.b &= ~(1 << i10);
            return;
        }
        c cVar = (c) this.c;
        if (cVar != null) {
            cVar.x(i10 - 64);
        }
    }

    @Override // o4.i
    public boolean y() {
        return true;
    }

    @Override // o4.i
    public long z() {
        return 0L;
    }

    public /* synthetic */ c(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    public c(o3.l lVar, long j10) {
        this.a = 10;
        this.c = lVar;
        f5.a.f(lVar.getPosition() >= j10);
        this.b = j10;
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            case 3:
            default:
                this.b = 0L;
                break;
            case 4:
                break;
        }
    }

    @Override // org.telegram.ui.Components.io
    public /* synthetic */ void dismiss() {
    }
}
