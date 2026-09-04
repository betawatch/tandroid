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
import org.telegram.messenger.w1;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.no;
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.kg1;
import org.telegram.ui.y11;
import v7.z8;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements OnFailureListener, c3.p, c3.q, l2.h, no {
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

    public void C(yc.a aVar) {
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

    @Override // c3.q
    public void P1(b0 b0Var) {
        ((c3.q) this.c).P1(new k3.d(this, b0Var, b0Var));
    }

    @Override // c3.q
    public h0 R1(int i10, int i11) {
        return ((c3.q) this.c).R1(i10, i11);
    }

    @Override // c3.q
    public void Z0() {
        ((c3.q) this.c).Z0();
    }

    @Override // l2.h
    public long a(long j3) {
        return ((c3.j) this.c).e[(int) j3] - this.b;
    }

    @Override // c3.p
    public void b(int i10, int i11, byte[] bArr) {
        ((c3.p) this.c).b(i10, i11, bArr);
    }

    @Override // l2.h
    public long c(long j3, long j10) {
        return ((c3.j) this.c).d[(int) j3];
    }

    @Override // c3.p
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.c).d(bArr, 0, i11, z10);
    }

    @Override // l2.h
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override // l2.h
    public long f(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // l2.h
    public m2.j g(long j3) {
        return new m2.j(((c3.j) this.c).c[(int) j3], r1.b[r8], null);
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
    public int h(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.c).h(i10, i11, bArr);
    }

    @Override // c3.p
    public boolean i(int i10, boolean z10) {
        return ((c3.p) this.c).i(i10, true);
    }

    @Override // c3.p
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.c).j(bArr, i10, i11, z10);
    }

    @Override // c3.p
    public long k() {
        return ((c3.p) this.c).k() - this.b;
    }

    @Override // c3.p
    public void l(int i10) {
        ((c3.p) this.c).l(i10);
    }

    @Override // org.telegram.ui.Components.no
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        kg1 kg1Var = new kg1(bundle);
        kg1Var.d = new ArrayList();
        kg1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        kg1Var.e = profileActivity.h5;
        profileActivity.presentFragment(kg1Var);
    }

    @Override // org.telegram.ui.Components.no
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.g1, z10);
        if (profileActivity.fragmentView != null) {
            yc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // l2.h
    public long o(long j3, long j10) {
        c3.j jVar = (c3.j) this.c;
        return d0.e(jVar.e, j3 + this.b, true);
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

    @Override // org.telegram.ui.Components.no
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j3 = this.b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new y11(bundle, profileActivity.z0));
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

    @Override // org.telegram.ui.Components.no
    public void s() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((n2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.b;
        boolean z10 = notificationsSettings.getBoolean(w1.i(j3, profileActivity.g1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(w1.i(j3, profileActivity.g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (yc.a(profileActivity)) {
            yc.S(z10 ? 1 : 0, profileActivity, profileActivity.z0).j();
        }
    }

    @Override // c3.p
    public int skip(int i10) {
        return ((c3.p) this.c).skip(i10);
    }

    @Override // l2.h
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

    @Override // l2.h
    public long u() {
        return 0L;
    }

    @Override // c3.p
    public boolean v(int i10, boolean z10) {
        return ((c3.p) this.c).v(i10, true);
    }

    @Override // l2.h
    public long w(long j3) {
        return ((c3.j) this.c).a;
    }

    @Override // org.telegram.ui.Components.no
    public void x(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1)) {
                n();
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

    @Override // l2.h
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
            case 9:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    @Override // org.telegram.ui.Components.no
    public /* synthetic */ void dismiss() {
    }
}
