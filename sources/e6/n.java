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
import org.telegram.messenger.l0;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lg1;
import org.telegram.ui.w11;
import v7.a9;
import x7.d7;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final /* synthetic */ class n implements OnFailureListener, c3.p, c3.q, l2.h, oo {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ n(long j3, Object obj, int i10) {
        this.a = i10;
        this.b = j3;
        this.c = obj;
    }

    public void A() {
        if (((n) this.c) == null) {
            this.c = new n(6);
        }
    }

    public void B(yc.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    public boolean C(int i10) {
        if (i10 < 64) {
            return (this.b & (1 << i10)) != 0;
        }
        A();
        return ((n) this.c).C(i10 - 64);
    }

    public void D(int i10, boolean z10) {
        if (i10 >= 64) {
            A();
            ((n) this.c).D(i10 - 64, z10);
            return;
        }
        long j3 = this.b;
        boolean z11 = (Long.MIN_VALUE & j3) != 0;
        long j10 = (1 << i10) - 1;
        this.b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            H(i10);
        } else {
            x(i10);
        }
        if (z11 || ((n) this.c) != null) {
            A();
            ((n) this.c).D(0, z11);
        }
    }

    @Override // l2.h
    public long E(long j3, long j10) {
        return ((c3.j) this.c).a;
    }

    public boolean F(int i10) {
        if (i10 >= 64) {
            A();
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
            if (nVar.C(0)) {
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
            A();
            ((n) this.c).H(i10 - 64);
        }
    }

    @Override // c3.q
    public void X1(b0 b0Var) {
        ((c3.q) this.c).X1(new k3.d(this, b0Var, b0Var));
    }

    @Override // c3.q
    public h0 Z1(int i10, int i11) {
        return ((c3.q) this.c).Z1(i10, i11);
    }

    @Override // c3.p
    public void a(int i10, int i11, byte[] bArr) {
        ((c3.p) this.c).a(i10, i11, bArr);
    }

    @Override // l2.h
    public long b(long j3) {
        return ((c3.j) this.c).e[(int) j3] - this.b;
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

    @Override // c3.p
    public int f(int i10, int i11, byte[] bArr) {
        return ((c3.p) this.c).f(i10, i11, bArr);
    }

    @Override // c3.q
    public void f1() {
        ((c3.q) this.c).f1();
    }

    @Override // l2.h
    public long g(long j3, long j10) {
        return -9223372036854775807L;
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
    public boolean h(int i10, boolean z10) {
        return ((c3.p) this.c).h(i10, true);
    }

    @Override // c3.p
    public boolean i(byte[] bArr, int i10, int i11, boolean z10) {
        return ((c3.p) this.c).i(bArr, i10, i11, z10);
    }

    @Override // c3.p
    public long j() {
        return ((c3.p) this.c).j() - this.b;
    }

    @Override // l2.h
    public m2.j k(long j3) {
        return new m2.j(((c3.j) this.c).c[(int) j3], r1.b[r8], null);
    }

    @Override // c3.p
    public void l(int i10) {
        ((c3.p) this.c).l(i10);
    }

    @Override // org.telegram.ui.Components.oo
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

    @Override // org.telegram.ui.Components.oo
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.g1, z10);
        if (profileActivity.fragmentView != null) {
            xc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // org.telegram.ui.Components.oo
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j3 = this.b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new w11(bundle, profileActivity.z0));
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
                ((a9) this.c).b.set(this.b);
                break;
            case 8:
                ((AtomicLong) ((d7) this.c).b).set(this.b);
                break;
            default:
                ((a9) this.c).b.set(this.b);
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

    @Override // org.telegram.ui.Components.oo
    public void r() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((n2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.b;
        boolean z10 = notificationsSettings.getBoolean(l0.h(j3, profileActivity.g1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(l0.h(j3, profileActivity.g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (xc.a(profileActivity)) {
            xc.S(z10 ? 1 : 0, profileActivity, profileActivity.z0).j();
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

    @Override // l2.h
    public long s(long j3, long j10) {
        c3.j jVar = (c3.j) this.c;
        return d0.e(jVar.e, j3 + this.b, true);
    }

    @Override // c3.p
    public int skip(int i10) {
        return ((c3.p) this.c).skip(i10);
    }

    @Override // c3.p
    public boolean t(int i10, boolean z10) {
        return ((c3.p) this.c).t(i10, true);
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

    @Override // org.telegram.ui.Components.oo
    public void u(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1)) {
                n();
            }
            if (xc.a(profileActivity)) {
                xc.z(profileActivity, 4, i10, profileActivity.z0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.b, profileActivity.g1, i10);
        if (xc.a(profileActivity)) {
            xc.z(profileActivity, 5, i10, profileActivity.z0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // l2.h
    public boolean v() {
        return true;
    }

    @Override // l2.h
    public long w() {
        return 0L;
    }

    public void x(int i10) {
        if (i10 < 64) {
            this.b &= ~(1 << i10);
            return;
        }
        n nVar = (n) this.c;
        if (nVar != null) {
            nVar.x(i10 - 64);
        }
    }

    public int y(int i10) {
        n nVar = (n) this.c;
        if (nVar == null) {
            return i10 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.b) + nVar.y(i10 - 64);
    }

    @Override // l2.h
    public long z(long j3) {
        return ((c3.j) this.c).a;
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

    @Override // org.telegram.ui.Components.oo
    public /* synthetic */ void dismiss() {
    }
}
