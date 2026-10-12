package ad;

import android.content.SharedPreferences;
import android.os.Bundle;
import c3.b0;
import c3.g0;
import c3.i0;
import c3.p;
import c3.q;
import com.google.android.gms.tasks.OnFailureListener;
import e2.m0;
import g6.o;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c21;
import org.telegram.ui.rg1;
import v7.u6;
import v7.z8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class d implements p, q, OnFailureListener, l2.i, bp {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ d(long j10, Object obj, int i10) {
        this.a = i10;
        this.b = j10;
        this.c = obj;
    }

    public int A(int i10) {
        d dVar = (d) this.c;
        if (dVar == null) {
            return i10 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.b) + dVar.A(i10 - 64);
    }

    public void B() {
        if (((d) this.c) == null) {
            this.c = new d(7);
        }
    }

    public void C(a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    @Override // c3.q
    public void D() {
        ((q) this.c).D();
    }

    public boolean E(int i10) {
        if (i10 < 64) {
            return (this.b & (1 << i10)) != 0;
        }
        B();
        return ((d) this.c).E(i10 - 64);
    }

    public void F(int i10, boolean z10) {
        if (i10 >= 64) {
            B();
            ((d) this.c).F(i10 - 64, z10);
            return;
        }
        long j10 = this.b;
        boolean z11 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i10) - 1;
        this.b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            I(i10);
        } else {
            z(i10);
        }
        if (z11 || ((d) this.c) != null) {
            B();
            ((d) this.c).F(0, z11);
        }
    }

    public boolean G(int i10) {
        if (i10 >= 64) {
            B();
            return ((d) this.c).G(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.b;
        boolean z10 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.b = j12;
        long j13 = j10 - 1;
        this.b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        d dVar = (d) this.c;
        if (dVar != null) {
            if (dVar.E(0)) {
                I(63);
            }
            ((d) this.c).G(0);
        }
        return z10;
    }

    public void H() {
        this.b = 0L;
        d dVar = (d) this.c;
        if (dVar != null) {
            dVar.H();
        }
    }

    public void I(int i10) {
        if (i10 < 64) {
            this.b |= 1 << i10;
        } else {
            B();
            ((d) this.c).I(i10 - 64);
        }
    }

    @Override // c3.q
    public void K(b0 b0Var) {
        ((q) this.c).K(new g0(this, b0Var, b0Var));
    }

    @Override // c3.p
    public void a(int i10, int i11, byte[] bArr) {
        ((p) this.c).a(i10, i11, bArr);
    }

    @Override // c3.q
    public i0 a0(int i10, int i11) {
        return ((q) this.c).a0(i10, i11);
    }

    @Override // l2.i
    public long b(long j10) {
        return ((c3.j) this.c).e[(int) j10] - this.b;
    }

    @Override // l2.i
    public long c(long j10, long j11) {
        return ((c3.j) this.c).d[(int) j10];
    }

    @Override // c3.p
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.c).d(bArr, 0, i11, z10);
    }

    @Override // l2.i
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override // c3.p
    public int f(int i10, int i11, byte[] bArr) {
        return ((p) this.c).f(i10, i11, bArr);
    }

    @Override // c3.p
    public boolean g(int i10, boolean z10) {
        return ((p) this.c).g(i10, true);
    }

    @Override // c3.p
    public long getLength() {
        return ((p) this.c).getLength() - this.b;
    }

    @Override // c3.p
    public long getPosition() {
        return ((p) this.c).getPosition() - this.b;
    }

    @Override // l2.i
    public long h(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // l2.i
    public m2.j i(long j10) {
        return new m2.j(((c3.j) this.c).c[(int) j10], r1.b[r7], null);
    }

    @Override // c3.p
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.c).j(bArr, i10, i11, z10);
    }

    @Override // c3.p
    public long k() {
        return ((p) this.c).k() - this.b;
    }

    @Override // c3.p
    public void l(int i10) {
        ((p) this.c).l(i10);
    }

    @Override // org.telegram.ui.Components.bp
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        rg1 rg1Var = new rg1(bundle);
        rg1Var.d = new ArrayList();
        rg1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        rg1Var.e = profileActivity.h5;
        profileActivity.presentFragment(rg1Var);
    }

    @Override // org.telegram.ui.Components.bp
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.g1, z10);
        if (profileActivity.fragmentView != null) {
            zc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // l2.i
    public long o(long j10, long j11) {
        c3.j jVar = (c3.j) this.c;
        return m0.f(jVar.e, j10 + this.b, true);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 3:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j10 = this.b;
                Iterator it = ((e6.h) ((androidx.biometric.e) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).b(j10, statusCode, null);
                }
                break;
            case 8:
                ((z8) this.c).b.set(this.b);
                break;
            case 9:
                ((z8) this.c).b.set(this.b);
                break;
            default:
                ((AtomicLong) ((n6.o) this.c).c).set(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.bp
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j10 = this.b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new c21(bundle, profileActivity.z0));
        }
    }

    @Override // c3.p
    public void q() {
        ((p) this.c).q();
    }

    @Override // c3.p
    public void r(int i10) {
        ((p) this.c).r(i10);
    }

    @Override // b2.p
    public int read(byte[] bArr, int i10, int i11) {
        return ((p) this.c).read(bArr, i10, i11);
    }

    @Override // c3.p
    public void readFully(byte[] bArr, int i10, int i11) {
        ((p) this.c).readFully(bArr, i10, i11);
    }

    @Override // org.telegram.ui.Components.bp
    public void s() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((m2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.q.j(j10, profileActivity.g1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.q.j(j10, profileActivity.g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (zc.a(profileActivity)) {
            zc.S(z10 ? 1 : 0, profileActivity, profileActivity.z0).j();
        }
    }

    @Override // c3.p
    public int skip(int i10) {
        return ((p) this.c).skip(i10);
    }

    @Override // l2.i
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 7:
                if (((d) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((d) this.c).toString() + "xx" + Long.toBinaryString(this.b);
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
        return ((p) this.c).v(i10, true);
    }

    @Override // l2.i
    public long w(long j10) {
        return ((c3.j) this.c).a;
    }

    @Override // l2.i
    public long x(long j10, long j11) {
        return ((c3.j) this.c).a;
    }

    @Override // org.telegram.ui.Components.bp
    public void y(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1)) {
                n();
            }
            if (zc.a(profileActivity)) {
                zc.z(profileActivity, 4, i10, profileActivity.z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.b, profileActivity.g1, i10);
        if (zc.a(profileActivity)) {
            zc.z(profileActivity, 5, i10, profileActivity.z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public void z(int i10) {
        if (i10 < 64) {
            this.b &= ~(1 << i10);
            return;
        }
        d dVar = (d) this.c;
        if (dVar != null) {
            dVar.z(i10 - 64);
        }
    }

    public /* synthetic */ d(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    public d(p pVar, long j10) {
        this.a = 1;
        this.c = pVar;
        u6.g(pVar.getPosition() >= j10);
        this.b = j10;
    }

    public d(int i10) {
        this.a = i10;
        switch (i10) {
            case 7:
                this.b = 0L;
                break;
            default:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
        }
    }

    @Override // org.telegram.ui.Components.bp
    public /* synthetic */ void dismiss() {
    }
}
