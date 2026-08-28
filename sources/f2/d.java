package f2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import f7.d9;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.oc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.df1;
import org.telegram.ui.s01;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d implements OnFailureListener, m4.h, eo, m3.l, m3.m, r4.f {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ d(long j10, Object obj, int i9) {
        this.a = i9;
        this.b = j10;
        this.c = obj;
    }

    @Override // org.telegram.ui.Components.eo
    public void A(int i9) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i9 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.c1)) {
                p();
            }
            if (oc.a(profileActivity)) {
                oc.z(profileActivity, 4, i9, profileActivity.v0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.b, profileActivity.c1, i9);
        if (oc.a(profileActivity)) {
            oc.z(profileActivity, 5, i9, profileActivity.v0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // m3.m
    public void B() {
        ((m3.m) this.c).B();
    }

    @Override // m4.h
    public long C(long j10, long j11) {
        return ((m3.f) this.c).a;
    }

    public void D(int i9) {
        if (i9 < 64) {
            this.b &= ~(1 << i9);
            return;
        }
        d dVar = (d) this.c;
        if (dVar != null) {
            dVar.D(i9 - 64);
        }
    }

    public int E(int i9) {
        d dVar = (d) this.c;
        if (dVar == null) {
            return i9 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i9) - 1));
        }
        if (i9 < 64) {
            return Long.bitCount(this.b & ((1 << i9) - 1));
        }
        return Long.bitCount(this.b) + dVar.E(i9 - 64);
    }

    public void F() {
        if (((d) this.c) == null) {
            this.c = new d(0);
        }
    }

    public void G(gc.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    public boolean H(int i9) {
        if (i9 < 64) {
            return (this.b & (1 << i9)) != 0;
        }
        F();
        return ((d) this.c).H(i9 - 64);
    }

    @Override // m3.m
    public m3.w I(int i9, int i10) {
        return ((m3.m) this.c).I(i9, i10);
    }

    public void J(int i9, boolean z10) {
        if (i9 >= 64) {
            F();
            ((d) this.c).J(i9 - 64, z10);
            return;
        }
        long j10 = this.b;
        boolean z11 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i9) - 1;
        this.b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            M(i9);
        } else {
            D(i9);
        }
        if (z11 || ((d) this.c) != null) {
            F();
            ((d) this.c).J(0, z11);
        }
    }

    public boolean K(int i9) {
        if (i9 >= 64) {
            F();
            return ((d) this.c).K(i9 - 64);
        }
        long j10 = 1 << i9;
        long j11 = this.b;
        boolean z10 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.b = j12;
        long j13 = j10 - 1;
        this.b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        d dVar = (d) this.c;
        if (dVar != null) {
            if (dVar.H(0)) {
                M(63);
            }
            ((d) this.c).K(0);
        }
        return z10;
    }

    public void L() {
        this.b = 0L;
        d dVar = (d) this.c;
        if (dVar != null) {
            dVar.L();
        }
    }

    public void M(int i9) {
        if (i9 < 64) {
            this.b |= 1 << i9;
        } else {
            F();
            ((d) this.c).M(i9 - 64);
        }
    }

    public void N(Exception exc) {
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

    @Override // m4.h
    public long a(long j10) {
        return ((m3.f) this.c).e[(int) j10] - this.b;
    }

    @Override // r4.f
    public int b(long j10) {
        return this.b > j10 ? 0 : -1;
    }

    @Override // m3.l
    public void c(int i9, int i10, byte[] bArr) {
        ((m3.l) this.c).c(i9, i10, bArr);
    }

    @Override // m3.l
    public boolean d(byte[] bArr, int i9, int i10, boolean z10) {
        return ((m3.l) this.c).d(bArr, 0, i10, z10);
    }

    @Override // m3.l
    public int e(int i9, int i10, byte[] bArr) {
        return ((m3.l) this.c).e(i9, i10, bArr);
    }

    @Override // m4.h
    public long f(long j10, long j11) {
        return ((m3.f) this.c).d[(int) j10];
    }

    @Override // m3.l
    public boolean g(byte[] bArr, int i9, int i10, boolean z10) {
        return ((m3.l) this.c).g(bArr, i9, i10, z10);
    }

    @Override // m3.l
    public long getLength() {
        return ((m3.l) this.c).getLength() - this.b;
    }

    @Override // m3.l
    public long getPosition() {
        return ((m3.l) this.c).getPosition() - this.b;
    }

    @Override // r4.f
    public long h(int i9) {
        d5.a.f(i9 == 0);
        return this.b;
    }

    @Override // m4.h
    public long i(long j10, long j11) {
        return 0L;
    }

    @Override // m4.h
    public long j(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // m3.l
    public long k() {
        return ((m3.l) this.c).k() - this.b;
    }

    @Override // m4.h
    public n4.j l(long j10) {
        return new n4.j(((m3.f) this.c).c[(int) j10], r1.b[r8], null);
    }

    @Override // r4.f
    public List m(long j10) {
        if (j10 >= this.b) {
            return (o8.z) this.c;
        }
        o8.x xVar = o8.z.b;
        return o8.l0.e;
    }

    @Override // m3.l
    public void n(int i9) {
        ((m3.l) this.c).n(i9);
    }

    @Override // org.telegram.ui.Components.eo
    public void o() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        df1 df1Var = new df1(bundle);
        df1Var.d = new ArrayList();
        df1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        df1Var.e = profileActivity.d5;
        profileActivity.presentFragment(df1Var);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 1:
                ((d9) this.c).b.set(this.b);
                break;
            case 2:
            case 4:
            default:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j10 = this.b;
                Iterator it = ((o5.h) ((j4.c) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((q5.p) it.next()).b(j10, statusCode, null);
                }
                break;
            case 3:
                ((d9) this.c).b.set(this.b);
                break;
            case 5:
                ((d9) this.c).b.set(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.eo
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.c1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.c1, z10);
        if (profileActivity.fragmentView != null) {
            oc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // m4.h
    public long q(long j10, long j11) {
        m3.f fVar = (m3.f) this.c;
        return d5.f0.e(fVar.e, j10 + this.b, true);
    }

    @Override // r4.f
    public int r() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public int read(byte[] bArr, int i9, int i10) {
        return ((m3.l) this.c).read(bArr, i9, i10);
    }

    @Override // m3.l
    public void readFully(byte[] bArr, int i9, int i10) {
        ((m3.l) this.c).readFully(bArr, i9, i10);
    }

    @Override // org.telegram.ui.Components.eo
    public void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j10 = this.b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.c1);
            profileActivity.presentFragment(new s01(bundle, profileActivity.v0));
        }
    }

    @Override // m3.l
    public int skip(int i9) {
        return ((m3.l) this.c).skip(i9);
    }

    @Override // m3.l
    public void t() {
        ((m3.l) this.c).t();
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((d) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((d) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // m3.l
    public void u(int i9) {
        ((m3.l) this.c).u(i9);
    }

    @Override // m4.h
    public boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.eo
    public void w() {
        int i9;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i9 = ((o2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i9);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.b;
        boolean z10 = notificationsSettings.getBoolean(org.telegram.messenger.l0.i(j10, profileActivity.c1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(org.telegram.messenger.l0.i(j10, profileActivity.c1, new StringBuilder("sound_enabled_")), z11).apply();
        if (oc.a(profileActivity)) {
            oc.S(z10 ? 1 : 0, profileActivity, profileActivity.v0).j();
        }
    }

    @Override // m4.h
    public long x() {
        return 0L;
    }

    @Override // m3.m
    public void y(m3.t tVar) {
        ((m3.m) this.c).y(new r3.c(this, tVar));
    }

    @Override // m4.h
    public long z(long j10) {
        return ((m3.f) this.c).a;
    }

    public /* synthetic */ d(Object obj, long j10, int i9) {
        this.a = i9;
        this.c = obj;
        this.b = j10;
    }

    public d(m3.l lVar, long j10) {
        this.a = 10;
        this.c = lVar;
        d5.a.f(lVar.getPosition() >= j10);
        this.b = j10;
    }

    public d(int i9) {
        this.a = i9;
        switch (i9) {
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

    @Override // org.telegram.ui.Components.eo
    public /* synthetic */ void dismiss() {
    }
}
