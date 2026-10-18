package ad;

import android.content.SharedPreferences;
import android.os.Bundle;
import c3.c0;
import c3.h0;
import c3.j0;
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
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.yo;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b11;
import org.telegram.ui.ze1;
import v7.u6;
import v7.z8;
import z7.qa;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes.dex */
public final class d implements p, q, OnFailureListener, l2.i, yo {
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

    public boolean D(int i10) {
        if (i10 < 64) {
            return (this.b & (1 << i10)) != 0;
        }
        B();
        return ((d) this.c).D(i10 - 64);
    }

    public void E(int i10, boolean z10) {
        if (i10 >= 64) {
            B();
            ((d) this.c).E(i10 - 64, z10);
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
            ((d) this.c).E(0, z11);
        }
    }

    public boolean F(int i10) {
        if (i10 >= 64) {
            B();
            return ((d) this.c).F(i10 - 64);
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
            if (dVar.D(0)) {
                I(63);
            }
            ((d) this.c).F(0);
        }
        return z10;
    }

    public void G() {
        this.b = 0L;
        d dVar = (d) this.c;
        if (dVar != null) {
            dVar.G();
        }
    }

    @Override // c3.q
    public void H() {
        ((q) this.c).H();
    }

    public void I(int i10) {
        if (i10 < 64) {
            this.b |= 1 << i10;
        } else {
            B();
            ((d) this.c).I(i10 - 64);
        }
    }

    @Override // l2.i
    public long a(long j10) {
        return ((c3.j) this.c).e[(int) j10] - this.b;
    }

    @Override // c3.p
    public void b(int i10, int i11, byte[] bArr) {
        ((p) this.c).b(i10, i11, bArr);
    }

    @Override // c3.p
    public boolean c(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.c).c(bArr, 0, i11, z10);
    }

    @Override // l2.i
    public long d(long j10, long j11) {
        return ((c3.j) this.c).d[(int) j10];
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

    @Override // c3.q
    public void g0(c0 c0Var) {
        ((q) this.c).g0(new h0(this, c0Var, c0Var));
    }

    @Override // c3.p
    public long getLength() {
        return ((p) this.c).getLength() - this.b;
    }

    @Override // c3.p
    public long getPosition() {
        return ((p) this.c).getPosition() - this.b;
    }

    @Override // c3.p
    public int h(int i10, int i11, byte[] bArr) {
        return ((p) this.c).h(i10, i11, bArr);
    }

    @Override // c3.p
    public boolean i(int i10, boolean z10) {
        return ((p) this.c).i(i10, true);
    }

    @Override // c3.p
    public boolean j(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.c).j(bArr, i10, i11, z10);
    }

    @Override // c3.q
    public j0 j0(int i10, int i11) {
        return ((q) this.c).j0(i10, i11);
    }

    @Override // c3.p
    public long k() {
        return ((p) this.c).k() - this.b;
    }

    @Override // c3.p
    public void l(int i10) {
        ((p) this.c).l(i10);
    }

    @Override // org.telegram.ui.Components.yo
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        ze1 ze1Var = new ze1(bundle);
        ze1Var.d = new ArrayList();
        ze1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        ze1Var.e = profileActivity.j5;
        profileActivity.presentFragment(ze1Var);
    }

    @Override // org.telegram.ui.Components.yo
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.h1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.h1, z10);
        if (profileActivity.fragmentView != null) {
            xc.A(profileActivity, z10, null).j();
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
                ((AtomicLong) ((qa) this.c).b).set(this.b);
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
            profileActivity.presentFragment(new b11(bundle, profileActivity.A0));
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

    @Override // b2.o
    public int read(byte[] bArr, int i10, int i11) {
        return ((p) this.c).read(bArr, i10, i11);
    }

    @Override // c3.p
    public void readFully(byte[] bArr, int i10, int i11) {
        ((p) this.c).readFully(bArr, i10, i11);
    }

    @Override // l2.i
    public boolean s() {
        return true;
    }

    @Override // c3.p
    public int skip(int i10) {
        return ((p) this.c).skip(i10);
    }

    @Override // org.telegram.ui.Components.yo
    public void t() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((n2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.b;
        boolean z10 = notificationsSettings.getBoolean(g0.i(j10, profileActivity.h1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(g0.i(j10, profileActivity.h1, new StringBuilder("sound_enabled_")), z11).apply();
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

    @Override // org.telegram.ui.Components.yo
    public void y(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.h1)) {
                n();
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

    @Override // org.telegram.ui.Components.yo
    public /* synthetic */ void dismiss() {
    }
}
