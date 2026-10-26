package a8;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.ap;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.gf1;
import org.telegram.ui.h11;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class lg implements OnFailureListener, c3.p, c3.q, l2.h, ap {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ lg(long j10, Object obj, int i10) {
        this.a = i10;
        this.b = j10;
        this.c = obj;
    }

    public void A(int i10, boolean z10) {
        if (i10 >= 64) {
            x();
            ((lg) this.c).A(i10 - 64, z10);
            return;
        }
        long j10 = this.b;
        boolean z11 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i10) - 1;
        this.b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            D(i10);
        } else {
            v(i10);
        }
        if (z11 || ((lg) this.c) != null) {
            x();
            ((lg) this.c).A(0, z11);
        }
    }

    public boolean B(int i10) {
        if (i10 >= 64) {
            x();
            return ((lg) this.c).B(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.b;
        boolean z10 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.b = j12;
        long j13 = j10 - 1;
        this.b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        lg lgVar = (lg) this.c;
        if (lgVar != null) {
            if (lgVar.z(0)) {
                D(63);
            }
            ((lg) this.c).B(0);
        }
        return z10;
    }

    public void C() {
        this.b = 0L;
        lg lgVar = (lg) this.c;
        if (lgVar != null) {
            lgVar.C();
        }
    }

    public void D(int i10) {
        if (i10 < 64) {
            this.b |= 1 << i10;
        } else {
            x();
            ((lg) this.c).D(i10 - 64);
        }
    }

    @Override // c3.q
    public void D1(c3.b0 b0Var) {
        ((c3.q) this.c).D1(new c3.g0(this, b0Var, b0Var));
    }

    @Override // c3.q
    public c3.j0 F1(int i10, int i11) {
        return ((c3.q) this.c).F1(i10, i11);
    }

    @Override // l2.h
    public boolean N() {
        return true;
    }

    @Override // c3.q
    public void Q0() {
        ((c3.q) this.c).Q0();
    }

    @Override // l2.h
    public long R() {
        return 0L;
    }

    @Override // l2.h
    public long V(long j10) {
        return ((c3.j) this.c).a;
    }

    @Override // l2.h
    public long W(long j10, long j11) {
        return ((c3.j) this.c).a;
    }

    @Override // l2.h
    public long a(long j10) {
        return ((c3.j) this.c).e[(int) j10] - this.b;
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

    @Override // l2.h
    public long e(long j10, long j11) {
        return ((c3.j) this.c).d[(int) j10];
    }

    @Override // c3.p
    public boolean f(int i10, boolean z10) {
        return ((c3.p) this.c).f(i10, true);
    }

    @Override // l2.h
    public long g(long j10, long j11) {
        return 0L;
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

    @Override // c3.p
    public long i() {
        return ((c3.p) this.c).i() - this.b;
    }

    @Override // c3.p
    public void j(int i10) {
        ((c3.p) this.c).j(i10);
    }

    @Override // l2.h
    public long k(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // l2.h
    public m2.j l(long j10) {
        return new m2.j(((c3.j) this.c).c[(int) j10], r1.b[r7], null);
    }

    @Override // org.telegram.ui.Components.ap
    public void m() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        gf1 gf1Var = new gf1(bundle);
        gf1Var.d = new ArrayList();
        gf1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        gf1Var.e = profileActivity.n5;
        profileActivity.presentFragment(gf1Var);
    }

    @Override // org.telegram.ui.Components.ap
    public void n() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.g1, z10);
        if (profileActivity.fragmentView != null) {
            org.telegram.ui.Components.wc.A(profileActivity, z10, null).j();
        }
        profileActivity.m5();
        profileActivity.r5(true);
    }

    @Override // org.telegram.ui.Components.ap
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j10 = this.b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new h11(bundle, profileActivity.z0));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                ((mg) this.c).b.set(this.b);
                break;
            case 4:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j10 = this.b;
                Iterator it = ((f6.h) ((h0) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((h6.o) it.next()).b(j10, statusCode, null);
                }
                break;
            case 9:
                ((AtomicLong) ((m4.w1) this.c).c).set(this.b);
                break;
            default:
                ((mg) this.c).b.set(this.b);
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

    @Override // org.telegram.ui.Components.ap
    public void r() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((org.telegram.ui.ActionBar.r2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.t.j(j10, profileActivity.g1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.t.j(j10, profileActivity.g1, new StringBuilder("sound_enabled_")), z11).apply();
        if (org.telegram.ui.Components.wc.a(profileActivity)) {
            org.telegram.ui.Components.wc.T(z10 ? 1 : 0, profileActivity, profileActivity.z0).j();
        }
    }

    @Override // b2.p
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

    @Override // l2.h
    public long t(long j10, long j11) {
        c3.j jVar = (c3.j) this.c;
        return e2.n0.f(jVar.e, j10 + this.b, true);
    }

    public String toString() {
        switch (this.a) {
            case 8:
                if (((lg) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((lg) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.Components.ap
    public void u(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.g1)) {
                n();
            }
            if (org.telegram.ui.Components.wc.a(profileActivity)) {
                org.telegram.ui.Components.wc.z(profileActivity, 4, i10, profileActivity.z0).j();
                return;
            }
            return;
        }
        int i11 = ProfileActivity.R6;
        profileActivity.getNotificationsController().muteUntil(this.b, profileActivity.g1, i10);
        if (org.telegram.ui.Components.wc.a(profileActivity)) {
            org.telegram.ui.Components.wc.z(profileActivity, 5, i10, profileActivity.z0).j();
        }
        profileActivity.m5();
        profileActivity.r5(true);
    }

    public void v(int i10) {
        if (i10 < 64) {
            this.b &= ~(1 << i10);
            return;
        }
        lg lgVar = (lg) this.c;
        if (lgVar != null) {
            lgVar.v(i10 - 64);
        }
    }

    public int w(int i10) {
        lg lgVar = (lg) this.c;
        if (lgVar == null) {
            return i10 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.b) + lgVar.w(i10 - 64);
    }

    public void x() {
        if (((lg) this.c) == null) {
            this.c = new lg(8);
        }
    }

    public void y(bd.a aVar) {
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
        return ((lg) this.c).z(i10 - 64);
    }

    public /* synthetic */ lg(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    public lg(c3.p pVar, long j10) {
        this.a = 2;
        this.c = pVar;
        yb.g(pVar.getPosition() >= j10);
        this.b = j10;
    }

    public lg(int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.b = 0L;
                break;
            default:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
        }
    }

    @Override // org.telegram.ui.Components.ap
    public /* synthetic */ void dismiss() {
    }
}
