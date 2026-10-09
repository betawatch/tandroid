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
import n6.t;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.ep;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lg1;
import org.telegram.ui.v11;
import x7.ga;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements OnFailureListener, c3.p, c3.q, l2.i, ep {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ n(long j3, Object obj, int i10) {
        this.a = i10;
        this.b = j3;
        this.c = obj;
    }

    public int A(int i10) {
        n nVar = (n) this.c;
        if (nVar == null) {
            return i10 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.b) + nVar.A(i10 - 64);
    }

    public void B() {
        if (((n) this.c) == null) {
            this.c = new n(6);
        }
    }

    public void C(zc.a aVar) {
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
        return ((n) this.c).D(i10 - 64);
    }

    public void E(int i10, boolean z10) {
        if (i10 >= 64) {
            B();
            ((n) this.c).E(i10 - 64, z10);
            return;
        }
        long j3 = this.b;
        boolean z11 = (Long.MIN_VALUE & j3) != 0;
        long j10 = (1 << i10) - 1;
        this.b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            H(i10);
        } else {
            z(i10);
        }
        if (z11 || ((n) this.c) != null) {
            B();
            ((n) this.c).E(0, z11);
        }
    }

    public boolean F(int i10) {
        if (i10 >= 64) {
            B();
            return ((n) this.c).F(i10 - 64);
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
            if (nVar.D(0)) {
                H(63);
            }
            ((n) this.c).F(0);
        }
        return z10;
    }

    public void G() {
        this.b = 0L;
        n nVar = (n) this.c;
        if (nVar != null) {
            nVar.G();
        }
    }

    public void H(int i10) {
        if (i10 < 64) {
            this.b |= 1 << i10;
        } else {
            B();
            ((n) this.c).H(i10 - 64);
        }
    }

    @Override // c3.p
    public void a(int i10, int i11, byte[] bArr) {
        ((c3.p) this.c).a(i10, i11, bArr);
    }

    @Override // l2.i
    public long b(long j3) {
        return ((c3.j) this.c).e[(int) j3] - this.b;
    }

    @Override // c3.p
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.c).c(bArr, 0, i11, z10);
    }

    @Override // l2.i
    public long d(long j3, long j10) {
        return ((c3.j) this.c).d[(int) j3];
    }

    @Override // c3.q
    public void d2(b0 b0Var) {
        ((c3.q) this.c).d2(new k3.d(this, b0Var, b0Var));
    }

    @Override // c3.p
    public int e(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.c).e(i10, i11, bArr);
    }

    @Override // l2.i
    public long f(long j3, long j10) {
        return 0L;
    }

    @Override // c3.q
    public h0 f2(int i10, int i11) {
        return ((c3.q) this.c).f2(i10, i11);
    }

    @Override // c3.p
    public boolean g(int i10, boolean z10) {
        return ((c3.p) this.c).g(i10, true);
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
    public boolean h(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.c).h(bArr, i10, i11, z10);
    }

    @Override // l2.i
    public long i(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // c3.p
    public long j() {
        return ((c3.p) this.c).j() - this.b;
    }

    @Override // l2.i
    public m2.j k(long j3) {
        return new m2.j(((c3.j) this.c).c[(int) j3], r1.b[r7], null);
    }

    @Override // c3.q
    public void k1() {
        ((c3.q) this.c).k1();
    }

    @Override // c3.p
    public void l(int i10) {
        ((c3.p) this.c).l(i10);
    }

    @Override // org.telegram.ui.Components.ep
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        lg1 lg1Var = new lg1(bundle);
        lg1Var.d = new ArrayList();
        lg1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        lg1Var.e = profileActivity.h5;
        profileActivity.presentFragment(lg1Var);
    }

    @Override // l2.i
    public long n(long j3, long j10) {
        c3.j jVar = (c3.j) this.c;
        return d0.e(jVar.e, j3 + this.b, true);
    }

    @Override // org.telegram.ui.Components.ep
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.g1, z10);
        if (profileActivity.fragmentView != null) {
            ad.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
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
                ((AtomicLong) ((t) this.c).c).set(this.b);
                break;
            case 8:
                ((ga) this.c).b.set(this.b);
                break;
            default:
                ((ga) this.c).b.set(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.ep
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j3 = this.b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new v11(bundle, profileActivity.z0));
        }
    }

    @Override // c3.p
    public void q() {
        ((c3.p) this.c).q();
    }

    @Override // c3.p
    public void r(int i10) {
        ((c3.p) this.c).r(i10);
    }

    @Override // b2.k
    public int read(byte[] bArr, int i10, int i11) {
        return ((c3.p) this.c).read(bArr, i10, i11);
    }

    @Override // c3.p
    public void readFully(byte[] bArr, int i10, int i11) {
        ((c3.p) this.c).readFully(bArr, i10, i11);
    }

    @Override // org.telegram.ui.Components.ep
    public void s() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((n2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.i(j3, profileActivity.g1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.i(j3, profileActivity.g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (ad.a(profileActivity)) {
            ad.S(z10 ? 1 : 0, profileActivity, profileActivity.z0).j();
        }
    }

    @Override // c3.p
    public int skip(int i10) {
        return ((c3.p) this.c).skip(i10);
    }

    @Override // l2.i
    public boolean t() {
        return true;
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

    @Override // l2.i
    public long u() {
        return 0L;
    }

    @Override // c3.p
    public boolean v(int i10, boolean z10) {
        return ((c3.p) this.c).v(i10, true);
    }

    @Override // l2.i
    public long w(long j3) {
        return ((c3.j) this.c).a;
    }

    @Override // org.telegram.ui.Components.ep
    public void x(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1)) {
                o();
            }
            if (ad.a(profileActivity)) {
                ad.z(profileActivity, 4, i10, profileActivity.z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.b, profileActivity.g1, i10);
        if (ad.a(profileActivity)) {
            ad.z(profileActivity, 5, i10, profileActivity.z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // l2.i
    public long y(long j3, long j10) {
        return ((c3.j) this.c).a;
    }

    public void z(int i10) {
        if (i10 < 64) {
            this.b &= ~(1 << i10);
            return;
        }
        n nVar = (n) this.c;
        if (nVar != null) {
            nVar.z(i10 - 64);
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
            case 10:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    @Override // org.telegram.ui.Components.ep
    public /* synthetic */ void dismiss() {
    }
}
