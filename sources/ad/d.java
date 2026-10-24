package ad;

import android.content.SharedPreferences;
import android.os.Bundle;
import c3.e0;
import c3.j0;
import c3.l0;
import c3.r;
import c3.s;
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
import org.telegram.messenger.v0;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yo;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d11;
import org.telegram.ui.ef1;
import v7.u6;
import v7.z8;
import z7.xf;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class d implements r, s, OnFailureListener, l2.i, yo {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ d(long j10, Object obj, int i10) {
        this.a = i10;
        this.b = j10;
        this.c = obj;
    }

    @Override // l2.i
    public long A(long j10) {
        return ((c3.j) this.c).a;
    }

    @Override // l2.i
    public long B(long j10, long j11) {
        return ((c3.j) this.c).a;
    }

    @Override // c3.s
    public void C() {
        ((s) this.c).C();
    }

    public void D(a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    public boolean E(int i10) {
        if (i10 < 64) {
            return (this.b & (1 << i10)) != 0;
        }
        z();
        return ((d) this.c).E(i10 - 64);
    }

    public void F(int i10, boolean z10) {
        if (i10 >= 64) {
            z();
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
            x(i10);
        }
        if (z11 || ((d) this.c) != null) {
            z();
            ((d) this.c).F(0, z11);
        }
    }

    public boolean G(int i10) {
        if (i10 >= 64) {
            z();
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
            z();
            ((d) this.c).I(i10 - 64);
        }
    }

    @Override // c3.r
    public void a(int i10, int i11, byte[] bArr) {
        ((r) this.c).a(i10, i11, bArr);
    }

    @Override // l2.i
    public long b(long j10) {
        return ((c3.j) this.c).e[(int) j10] - this.b;
    }

    @Override // l2.i
    public long c(long j10, long j11) {
        return ((c3.j) this.c).d[(int) j10];
    }

    @Override // c3.r
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((r) this.c).d(bArr, 0, i11, z10);
    }

    @Override // l2.i
    public long e(long j10, long j11) {
        return 0L;
    }

    @Override // l2.i
    public long f(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // l2.i
    public m2.j g(long j10) {
        return new m2.j(((c3.j) this.c).c[(int) j10], r1.b[r7], null);
    }

    @Override // c3.s
    public void g0(e0 e0Var) {
        ((s) this.c).g0(new j0(this, e0Var, e0Var));
    }

    @Override // c3.r
    public long getLength() {
        return ((r) this.c).getLength() - this.b;
    }

    @Override // c3.r
    public long getPosition() {
        return ((r) this.c).getPosition() - this.b;
    }

    @Override // c3.r
    public int h(int i10, int i11, byte[] bArr) {
        return ((r) this.c).h(i10, i11, bArr);
    }

    @Override // c3.r
    public boolean i(int i10, boolean z10) {
        return ((r) this.c).i(i10, true);
    }

    @Override // c3.r
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        return ((r) this.c).j(bArr, i10, i11, z10);
    }

    @Override // c3.s
    public l0 j0(int i10, int i11) {
        return ((s) this.c).j0(i10, i11);
    }

    @Override // c3.r
    public long k() {
        return ((r) this.c).k() - this.b;
    }

    @Override // c3.r
    public void l(int i10) {
        ((r) this.c).l(i10);
    }

    @Override // org.telegram.ui.Components.yo
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        ef1 ef1Var = new ef1(bundle);
        ef1Var.d = new ArrayList();
        ef1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        ef1Var.e = profileActivity.j5;
        profileActivity.presentFragment(ef1Var);
    }

    @Override // l2.i
    public long n(long j10, long j11) {
        c3.j jVar = (c3.j) this.c;
        return m0.f(jVar.e, j10 + this.b, true);
    }

    @Override // org.telegram.ui.Components.yo
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.h1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.h1, z10);
        if (profileActivity.fragmentView != null) {
            xc.A(profileActivity, z10, null).j();
        }
        profileActivity.e5();
        profileActivity.k5(true);
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
                ((AtomicLong) ((xf) this.c).b).set(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.yo
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j10 = this.b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.h1);
            profileActivity.presentFragment(new d11(bundle, profileActivity.A0));
        }
    }

    @Override // c3.r
    public void q() {
        ((r) this.c).q();
    }

    @Override // c3.r
    public void r(int i10) {
        ((r) this.c).r(i10);
    }

    @Override // b2.o
    public int read(byte[] bArr, int i10, int i11) {
        return ((r) this.c).read(bArr, i10, i11);
    }

    @Override // c3.r
    public void readFully(byte[] bArr, int i10, int i11) {
        ((r) this.c).readFully(bArr, i10, i11);
    }

    @Override // l2.i
    public boolean s() {
        return true;
    }

    @Override // c3.r
    public int skip(int i10) {
        return ((r) this.c).skip(i10);
    }

    @Override // org.telegram.ui.Components.yo
    public void t() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((o2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.b;
        boolean z10 = notificationsSettings.getBoolean(v0.i(j10, profileActivity.h1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(v0.i(j10, profileActivity.h1, new StringBuilder("sound_enabled_")), z11).apply();
        if (xc.a(profileActivity)) {
            xc.S(z10 ? 1 : 0, profileActivity, profileActivity.A0).j();
        }
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

    @Override // c3.r
    public boolean u(int i10, boolean z10) {
        return ((r) this.c).u(i10, true);
    }

    @Override // org.telegram.ui.Components.yo
    public void v(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.h1)) {
                o();
            }
            if (xc.a(profileActivity)) {
                xc.z(profileActivity, 4, i10, profileActivity.A0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.b, profileActivity.h1, i10);
        if (xc.a(profileActivity)) {
            xc.z(profileActivity, 5, i10, profileActivity.A0).j();
        }
        profileActivity.e5();
        profileActivity.k5(true);
    }

    @Override // l2.i
    public long w() {
        return 0L;
    }

    public void x(int i10) {
        if (i10 < 64) {
            this.b &= ~(1 << i10);
            return;
        }
        d dVar = (d) this.c;
        if (dVar != null) {
            dVar.x(i10 - 64);
        }
    }

    public int y(int i10) {
        d dVar = (d) this.c;
        if (dVar == null) {
            return i10 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.b) + dVar.y(i10 - 64);
    }

    public void z() {
        if (((d) this.c) == null) {
            this.c = new d(7);
        }
    }

    public /* synthetic */ d(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    public d(r rVar, long j10) {
        this.a = 1;
        this.c = rVar;
        u6.g(rVar.getPosition() >= j10);
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

    @Override // org.telegram.ui.Components.yo
    public /* synthetic */ void dismiss() {
    }
}
