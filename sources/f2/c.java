package f2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import j7.d9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.qc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k11;
import org.telegram.ui.yf1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c implements OnFailureListener, mo, r4.h, v4.f, r3.l, r3.m {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ c(long j10, Object obj, int i10) {
        this.a = i10;
        this.b = j10;
        this.c = obj;
    }

    @Override // r4.h
    public boolean A() {
        return true;
    }

    public void B(kc.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    @Override // r4.h
    public long C() {
        return 0L;
    }

    public boolean D(int i10) {
        if (i10 < 64) {
            return (this.b & (1 << i10)) != 0;
        }
        z();
        return ((c) this.c).D(i10 - 64);
    }

    public void E(int i10, boolean z4) {
        if (i10 >= 64) {
            z();
            ((c) this.c).E(i10 - 64, z4);
            return;
        }
        long j10 = this.b;
        boolean z10 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i10) - 1;
        this.b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z4) {
            J(i10);
        } else {
            w(i10);
        }
        if (z10 || ((c) this.c) != null) {
            z();
            ((c) this.c).E(0, z10);
        }
    }

    @Override // r4.h
    public long F(long j10) {
        return ((r3.f) this.c).a;
    }

    public boolean G(int i10) {
        if (i10 >= 64) {
            z();
            return ((c) this.c).G(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.b;
        boolean z4 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.b = j12;
        long j13 = j10 - 1;
        this.b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        c cVar = (c) this.c;
        if (cVar != null) {
            if (cVar.D(0)) {
                J(63);
            }
            ((c) this.c).G(0);
        }
        return z4;
    }

    public void H() {
        this.b = 0L;
        c cVar = (c) this.c;
        if (cVar != null) {
            cVar.H();
        }
    }

    @Override // r4.h
    public long I(long j10, long j11) {
        return ((r3.f) this.c).a;
    }

    public void J(int i10) {
        if (i10 < 64) {
            this.b |= 1 << i10;
        } else {
            z();
            ((c) this.c).J(i10 - 64);
        }
    }

    public void K(Exception exc) {
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

    @Override // r4.h
    public long a(long j10) {
        return ((r3.f) this.c).e[(int) j10] - this.b;
    }

    @Override // r3.l
    public void b(int i10, int i11, byte[] bArr) {
        ((r3.l) this.c).b(i10, i11, bArr);
    }

    @Override // r3.l
    public boolean c(byte[] bArr, int i10, int i11, boolean z4) {
        return ((r3.l) this.c).c(bArr, 0, i11, z4);
    }

    @Override // v4.f
    public int d(long j10) {
        return this.b > j10 ? 0 : -1;
    }

    @Override // r3.l
    public int e(int i10, int i11, byte[] bArr) {
        return ((r3.l) this.c).e(i10, i11, bArr);
    }

    @Override // r3.l
    public boolean f(byte[] bArr, int i10, int i11, boolean z4) {
        return ((r3.l) this.c).f(bArr, i10, i11, z4);
    }

    @Override // r3.l
    public long g() {
        return ((r3.l) this.c).g() - this.b;
    }

    @Override // r3.l
    public long getLength() {
        return ((r3.l) this.c).getLength() - this.b;
    }

    @Override // r3.l
    public long getPosition() {
        return ((r3.l) this.c).getPosition() - this.b;
    }

    @Override // r4.h
    public long h(long j10, long j11) {
        return ((r3.f) this.c).d[(int) j10];
    }

    @Override // r3.l
    public void i(int i10) {
        ((r3.l) this.c).i(i10);
    }

    @Override // r3.m
    public void i1() {
        ((r3.m) this.c).i1();
    }

    @Override // r3.m
    public r3.v i2(int i10, int i11) {
        return ((r3.m) this.c).i2(i10, i11);
    }

    @Override // org.telegram.ui.Components.mo
    public void j() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        yf1 yf1Var = new yf1(bundle);
        yf1Var.d = new ArrayList();
        yf1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        yf1Var.e = profileActivity.e5;
        profileActivity.presentFragment(yf1Var);
    }

    @Override // org.telegram.ui.Components.mo
    public void k() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z4 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.d1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.d1, z4);
        if (profileActivity.fragmentView != null) {
            qc.A(profileActivity, z4, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // v4.f
    public long l(int i10) {
        h5.a.f(i10 == 0);
        return this.b;
    }

    @Override // r4.h
    public long m(long j10, long j11) {
        return 0L;
    }

    @Override // r3.m
    public void m2(r3.s sVar) {
        ((r3.m) this.c).m2(new w3.c(this, sVar));
    }

    @Override // r4.h
    public long n(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // org.telegram.ui.Components.mo
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j10 = this.b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.d1);
            profileActivity.presentFragment(new k11(bundle, profileActivity.w0));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 1:
                ((d9) this.c).b.set(this.b);
                break;
            case 2:
            case 3:
            default:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j10 = this.b;
                Iterator it = ((s5.h) ((s5.m) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((u5.p) it.next()).b(j10, statusCode, null);
                }
                break;
            case 4:
                ((d9) this.c).b.set(this.b);
                break;
            case 5:
                ((d9) this.c).b.set(this.b);
                break;
        }
    }

    @Override // r4.h
    public s4.j p(long j10) {
        return new s4.j(((r3.f) this.c).c[(int) j10], r1.b[r8], null);
    }

    @Override // v4.f
    public List q(long j10) {
        if (j10 >= this.b) {
            return (s8.v) this.c;
        }
        s8.t tVar = s8.v.b;
        return s8.i0.e;
    }

    @Override // r3.l
    public void r() {
        ((r3.l) this.c).r();
    }

    @Override // g5.j
    public int read(byte[] bArr, int i10, int i11) {
        return ((r3.l) this.c).read(bArr, i10, i11);
    }

    @Override // r3.l
    public void readFully(byte[] bArr, int i10, int i11) {
        ((r3.l) this.c).readFully(bArr, i10, i11);
    }

    @Override // r3.l
    public void s(int i10) {
        ((r3.l) this.c).s(i10);
    }

    @Override // r3.l
    public int skip(int i10) {
        return ((r3.l) this.c).skip(i10);
    }

    @Override // r4.h
    public long t(long j10, long j11) {
        r3.f fVar = (r3.f) this.c;
        return h5.d0.e(fVar.e, j10 + this.b, true);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((c) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((c) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.Components.mo
    public void u() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((p2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j10 = this.b;
        boolean z4 = notificationsSettings.getBoolean(y3.i(j10, profileActivity.d1, sb), true);
        boolean z10 = !z4;
        notificationsSettings.edit().putBoolean(y3.i(j10, profileActivity.d1, new StringBuilder("sound_enabled_")), z10).apply();
        if (qc.a(profileActivity)) {
            qc.S(z4 ? 1 : 0, profileActivity, profileActivity.w0).j();
        }
    }

    @Override // org.telegram.ui.Components.mo
    public void v(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.d1)) {
                k();
            }
            if (qc.a(profileActivity)) {
                qc.z(profileActivity, 4, i10, profileActivity.w0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.b, profileActivity.d1, i10);
        if (qc.a(profileActivity)) {
            qc.z(profileActivity, 5, i10, profileActivity.w0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    public void w(int i10) {
        if (i10 < 64) {
            this.b &= ~(1 << i10);
            return;
        }
        c cVar = (c) this.c;
        if (cVar != null) {
            cVar.w(i10 - 64);
        }
    }

    @Override // v4.f
    public int x() {
        return 1;
    }

    public int y(int i10) {
        c cVar = (c) this.c;
        if (cVar == null) {
            return i10 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.b) + cVar.y(i10 - 64);
    }

    public void z() {
        if (((c) this.c) == null) {
            this.c = new c(0);
        }
    }

    public /* synthetic */ c(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    public c(r3.l lVar, long j10) {
        this.a = 11;
        this.c = lVar;
        h5.a.f(lVar.getPosition() >= j10);
        this.b = j10;
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
            case 2:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            case 3:
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    @Override // org.telegram.ui.Components.mo
    public /* synthetic */ void dismiss() {
    }
}
