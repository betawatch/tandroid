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
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.a2;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c21;
import org.telegram.ui.og1;
import v7.z8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements OnFailureListener, c3.p, c3.q, l2.j, to {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ n(long j3, Object obj, int i10) {
        this.a = i10;
        this.b = j3;
        this.c = obj;
    }

    public void A(int i10, boolean z10) {
        if (i10 >= 64) {
            x();
            ((n) this.c).A(i10 - 64, z10);
            return;
        }
        long j3 = this.b;
        boolean z11 = (Long.MIN_VALUE & j3) != 0;
        long j10 = (1 << i10) - 1;
        this.b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            F(i10);
        } else {
            u(i10);
        }
        if (z11 || ((n) this.c) != null) {
            x();
            ((n) this.c).A(0, z11);
        }
    }

    @Override // c3.q
    public void B() {
        ((c3.q) this.c).B();
    }

    public boolean C(int i10) {
        if (i10 >= 64) {
            x();
            return ((n) this.c).C(i10 - 64);
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
            if (nVar.z(0)) {
                F(63);
            }
            ((n) this.c).C(0);
        }
        return z10;
    }

    public void D() {
        this.b = 0L;
        n nVar = (n) this.c;
        if (nVar != null) {
            nVar.D();
        }
    }

    @Override // l2.j
    public boolean E() {
        return true;
    }

    public void F(int i10) {
        if (i10 < 64) {
            this.b |= 1 << i10;
        } else {
            x();
            ((n) this.c).F(i10 - 64);
        }
    }

    @Override // c3.q
    public void G(b0 b0Var) {
        ((c3.q) this.c).G(new k3.d(this, b0Var, b0Var));
    }

    @Override // c3.q
    public h0 I(int i10, int i11) {
        return ((c3.q) this.c).I(i10, i11);
    }

    @Override // l2.j
    public long J() {
        return 0L;
    }

    @Override // l2.j
    public long K(long j3) {
        return ((c3.j) this.c).a;
    }

    @Override // l2.j
    public long M(long j3, long j10) {
        return ((c3.j) this.c).a;
    }

    @Override // l2.j
    public long a(long j3) {
        return ((c3.j) this.c).e[(int) j3] - this.b;
    }

    @Override // c3.p
    public void b(int i10, int i11, byte[] bArr) {
        ((c3.p) this.c).b(i10, i11, bArr);
    }

    @Override // l2.j
    public long c(long j3, long j10) {
        return ((c3.j) this.c).d[(int) j3];
    }

    @Override // c3.p
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.c).d(bArr, 0, i11, z10);
    }

    @Override // c3.p
    public int e(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.c).e(i10, i11, bArr);
    }

    @Override // c3.p
    public boolean f(int i10, boolean z10) {
        return ((c3.p) this.c).f(i10, true);
    }

    @Override // c3.p
    public boolean g(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.c).g(bArr, i10, i11, z10);
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
    public long h() {
        return ((c3.p) this.c).h() - this.b;
    }

    @Override // l2.j
    public long i(long j3, long j10) {
        return 0L;
    }

    @Override // c3.p
    public void j(int i10) {
        ((c3.p) this.c).j(i10);
    }

    @Override // l2.j
    public long k(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // org.telegram.ui.Components.to
    public void l() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        og1 og1Var = new og1(bundle);
        og1Var.d = new ArrayList();
        og1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        og1Var.e = profileActivity.h5;
        profileActivity.presentFragment(og1Var);
    }

    @Override // l2.j
    public m2.j m(long j3) {
        return new m2.j(((c3.j) this.c).c[(int) j3], r1.b[r8], null);
    }

    @Override // org.telegram.ui.Components.to
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.g1, z10);
        if (profileActivity.fragmentView != null) {
            wc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // org.telegram.ui.Components.to
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j3 = this.b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new c21(bundle, profileActivity.z0));
        }
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
                ((z8) this.c).b.set(this.b);
                break;
            default:
                ((z8) this.c).b.set(this.b);
                break;
        }
    }

    @Override // c3.p
    public void p() {
        ((c3.p) this.c).p();
    }

    @Override // c3.p
    public void q(int i10) {
        ((c3.p) this.c).q(i10);
    }

    @Override // org.telegram.ui.Components.to
    public void r() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((p2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.b;
        boolean z10 = notificationsSettings.getBoolean(a2.i(j3, profileActivity.g1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(a2.i(j3, profileActivity.g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (wc.a(profileActivity)) {
            wc.S(z10 ? 1 : 0, profileActivity, profileActivity.z0).j();
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

    @Override // org.telegram.ui.Components.to
    public void t(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1)) {
                n();
            }
            if (wc.a(profileActivity)) {
                wc.z(profileActivity, 4, i10, profileActivity.z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.b, profileActivity.g1, i10);
        if (wc.a(profileActivity)) {
            wc.z(profileActivity, 5, i10, profileActivity.z0).j();
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

    @Override // l2.j
    public long w(long j3, long j10) {
        c3.j jVar = (c3.j) this.c;
        return d0.e(jVar.e, j3 + this.b, true);
    }

    public void x() {
        if (((n) this.c) == null) {
            this.c = new n(6);
        }
    }

    public void y(yc.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    public boolean z(int i10) {
        if (i10 < 64) {
            return (this.b & (1 << i10)) != 0;
        }
        x();
        return ((n) this.c).z(i10 - 64);
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

    @Override // org.telegram.ui.Components.to
    public /* synthetic */ void dismiss() {
    }
}
