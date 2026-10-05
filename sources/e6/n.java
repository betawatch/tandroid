package e6;

import android.content.SharedPreferences;
import android.os.Bundle;
import c3.b0;
import c3.h0;
import com.google.android.gms.tasks.OnFailureListener;
import e2.d0;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cg1;
import org.telegram.ui.p11;
import v7.z8;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements OnFailureListener, c3.p, c3.q, l2.i, ro {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ n(long j3, Object obj, int i10) {
        this.a = i10;
        this.b = j3;
        this.c = obj;
    }

    public boolean A(int i10) {
        if (i10 >= 64) {
            w();
            return ((n) this.c).A(i10 - 64);
        }
        long j3 = 1 << i10;
        long j10 = this.b;
        boolean z10 = (j10 & j3) != 0;
        long j11 = j10 & (~j3);
        this.b = j11;
        long j12 = j3 - 1;
        this.b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        n nVar = (n) this.c;
        if (nVar != null) {
            if (nVar.y(0)) {
                C(63);
            }
            ((n) this.c).A(0);
        }
        return z10;
    }

    public void B() {
        this.b = 0L;
        n nVar = (n) this.c;
        if (nVar != null) {
            nVar.B();
        }
    }

    public void C(int i10) {
        if (i10 < 64) {
            this.b |= 1 << i10;
        } else {
            w();
            ((n) this.c).C(i10 - 64);
        }
    }

    @Override // l2.i
    public long H(long j3, long j10) {
        c3.j jVar = (c3.j) this.c;
        return d0.e(jVar.e, j3 + this.b, true);
    }

    @Override // c3.q
    public void X1(b0 b0Var) {
        ((c3.q) this.c).X1(new k3.d(this, b0Var, b0Var));
    }

    @Override // c3.q
    public h0 Z1(int i10, int i11) {
        return ((c3.q) this.c).Z1(i10, i11);
    }

    @Override // l2.i
    public long a(long j3) {
        return ((c3.j) this.c).e[(int) j3] - this.b;
    }

    @Override // c3.p
    public void b(int i10, int i11, byte[] bArr) {
        ((c3.p) this.c).b(i10, i11, bArr);
    }

    @Override // c3.p
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.c).c(bArr, 0, i11, z10);
    }

    @Override // c3.p
    public int d(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.c).d(i10, i11, bArr);
    }

    @Override // c3.p
    public boolean e(int i10, boolean z10) {
        return ((c3.p) this.c).e(i10, true);
    }

    @Override // l2.i
    public boolean e0() {
        return true;
    }

    @Override // c3.q
    public void e1() {
        ((c3.q) this.c).e1();
    }

    @Override // c3.p
    public boolean f(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.c).f(bArr, i10, i11, z10);
    }

    @Override // c3.p
    public long g() {
        return ((c3.p) this.c).g() - this.b;
    }

    @Override // c3.p
    public long getLength() {
        return ((c3.p) this.c).getLength() - this.b;
    }

    @Override // c3.p
    public long getPosition() {
        return ((c3.p) this.c).getPosition() - this.b;
    }

    @Override // c3.p
    public void h(int i10) {
        ((c3.p) this.c).h(i10);
    }

    @Override // l2.i
    public long i(long j3, long j10) {
        return ((c3.j) this.c).d[(int) j3];
    }

    @Override // org.telegram.ui.Components.ro
    public void j() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        cg1 cg1Var = new cg1(bundle);
        cg1Var.d = new ArrayList();
        cg1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        cg1Var.e = profileActivity.h5;
        profileActivity.presentFragment(cg1Var);
    }

    @Override // l2.i
    public long j0() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.ro
    public void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.g1, z10);
        if (profileActivity.fragmentView != null) {
            yc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // org.telegram.ui.Components.ro
    public void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j3 = this.b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new p11(bundle, profileActivity.z0));
        }
    }

    @Override // c3.p
    public void m() {
        ((c3.p) this.c).m();
    }

    @Override // l2.i
    public long n(long j3, long j10) {
        return 0L;
    }

    @Override // c3.p
    public void o(int i10) {
        ((c3.p) this.c).o(i10);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j3 = this.b;
                Iterator it = ((h) ((aa.a) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((g6.o) it.next()).b(j3, statusCode, null);
                }
                break;
            case 7:
                ((z8) this.c).b.set(this.b);
                break;
            case 8:
                ((AtomicLong) ((o0.a) this.c).c).set(this.b);
                break;
            default:
                ((z8) this.c).b.set(this.b);
                break;
        }
    }

    @Override // l2.i
    public long p(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // l2.i
    public long p0(long j3) {
        return ((c3.j) this.c).a;
    }

    @Override // l2.i
    public m2.j q(long j3) {
        return new m2.j(((c3.j) this.c).c[(int) j3], r1.b[r8], null);
    }

    @Override // l2.i
    public long q0(long j3, long j10) {
        return ((c3.j) this.c).a;
    }

    @Override // org.telegram.ui.Components.ro
    public void r() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((n2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.i(j3, profileActivity.g1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.i(j3, profileActivity.g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (yc.a(profileActivity)) {
            yc.S(z10 ? 1 : 0, profileActivity, profileActivity.z0).j();
        }
    }

    @Override // b2.k
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.c).read(bArr, i10, i11);
    }

    @Override // c3.p
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.c).readFully(bArr, i10, i11);
    }

    @Override // c3.p
    public boolean s(int i10, boolean z10) {
        return ((c3.p) this.c).s(i10, true);
    }

    @Override // c3.p
    public int skip(int i10) {
        return ((c3.p) this.c).skip(i10);
    }

    @Override // org.telegram.ui.Components.ro
    public void t(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1)) {
                k();
            }
            if (yc.a(profileActivity)) {
                yc.z(profileActivity, 4, i10, profileActivity.z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.b, profileActivity.g1, i10);
        if (yc.a(profileActivity)) {
            yc.z(profileActivity, 5, i10, profileActivity.z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public String toString() {
        switch (this.a) {
            case 6:
                if (((n) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((n) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public void u(int i10) {
        if (i10 < 64) {
            this.b &= ~(1 << i10);
            return;
        }
        n nVar = (n) this.c;
        if (nVar != null) {
            nVar.u(i10 - 64);
        }
    }

    public int v(int i10) {
        n nVar = (n) this.c;
        if (nVar == null) {
            return i10 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.b) + nVar.v(i10 - 64);
    }

    public void w() {
        if (((n) this.c) == null) {
            this.c = new n(6);
        }
    }

    public void x(yc.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    public boolean y(int i10) {
        if (i10 < 64) {
            return (this.b & (1 << i10)) != 0;
        }
        w();
        return ((n) this.c).y(i10 - 64);
    }

    public void z(int i10, boolean z10) {
        if (i10 >= 64) {
            w();
            ((n) this.c).z(i10 - 64, z10);
            return;
        }
        long j3 = this.b;
        boolean z11 = (Long.MIN_VALUE & j3) != 0;
        long j10 = (1 << i10) - 1;
        this.b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            C(i10);
        } else {
            u(i10);
        }
        if (z11 || ((n) this.c) != null) {
            w();
            ((n) this.c).z(0, z11);
        }
    }

    public /* synthetic */ n(Object obj, long j3, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j3;
    }

    public n(c3.p pVar, long j3) {
        this.a = 2;
        this.c = pVar;
        e2.d.b(pVar.getPosition() >= j3);
        this.b = j3;
    }

    public n(int i10) {
        this.a = i10;
        switch (i10) {
            case 9:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    @Override // org.telegram.ui.Components.ro
    public /* synthetic */ void dismiss() {
    }
}
