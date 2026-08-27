package f2;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import g7.c9;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.y1;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.mc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cf1;
import org.telegram.ui.t01;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class c implements OnFailureListener, m4.h, bo, m3.l, m3.m, r4.g {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ c(long j10, Object obj, int i10) {
        this.a = i10;
        this.b = j10;
        this.c = obj;
    }

    @Override // m3.m
    public void A() {
        ((m3.m) this.c).A();
    }

    @Override // m4.h
    public boolean B() {
        return true;
    }

    @Override // m3.m
    public m3.w C(int i10, int i11) {
        return ((m3.m) this.c).C(i10, i11);
    }

    public void D() {
        if (((c) this.c) == null) {
            this.c = new c(0);
        }
    }

    @Override // m4.h
    public long E() {
        return 0L;
    }

    @Override // m4.h
    public long F(long j10) {
        return ((m3.f) this.c).a;
    }

    @Override // m4.h
    public long G(long j10, long j11) {
        return ((m3.f) this.c).a;
    }

    public void H(hc.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    public boolean I(int i10) {
        if (i10 < 64) {
            return (this.b & (1 << i10)) != 0;
        }
        D();
        return ((c) this.c).I(i10 - 64);
    }

    public void J(int i10, boolean z10) {
        if (i10 >= 64) {
            D();
            ((c) this.c).J(i10 - 64, z10);
            return;
        }
        long j10 = this.b;
        boolean z11 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i10) - 1;
        this.b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            M(i10);
        } else {
            x(i10);
        }
        if (z11 || ((c) this.c) != null) {
            D();
            ((c) this.c).J(0, z11);
        }
    }

    public boolean K(int i10) {
        if (i10 >= 64) {
            D();
            return ((c) this.c).K(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.b;
        boolean z10 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.b = j12;
        long j13 = j10 - 1;
        this.b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        c cVar = (c) this.c;
        if (cVar != null) {
            if (cVar.I(0)) {
                M(63);
            }
            ((c) this.c).K(0);
        }
        return z10;
    }

    public void L() {
        this.b = 0L;
        c cVar = (c) this.c;
        if (cVar != null) {
            cVar.L();
        }
    }

    public void M(int i10) {
        if (i10 < 64) {
            this.b |= 1 << i10;
        } else {
            D();
            ((c) this.c).M(i10 - 64);
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

    @Override // m3.l
    public void b(int i10, int i11, byte[] bArr) {
        ((m3.l) this.c).b(i10, i11, bArr);
    }

    @Override // r4.g
    public int c(long j10) {
        return this.b > j10 ? 0 : -1;
    }

    @Override // m3.l
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((m3.l) this.c).d(bArr, 0, i11, z10);
    }

    @Override // m3.l
    public int e(int i10, int i11, byte[] bArr) {
        return ((m3.l) this.c).e(i10, i11, bArr);
    }

    @Override // r4.g
    public long f(int i10) {
        d5.a.f(i10 == 0);
        return this.b;
    }

    @Override // m3.l
    public boolean g(byte[] bArr, int i10, int i11, boolean z10) {
        return ((m3.l) this.c).g(bArr, i10, i11, z10);
    }

    @Override // m3.l
    public long getLength() {
        return ((m3.l) this.c).getLength() - this.b;
    }

    @Override // m3.l
    public long getPosition() {
        return ((m3.l) this.c).getPosition() - this.b;
    }

    @Override // r4.g
    public List h(long j10) {
        if (j10 >= this.b) {
            return (p8.z) this.c;
        }
        p8.x xVar = p8.z.b;
        return p8.l0.e;
    }

    @Override // m3.l
    public long i() {
        return ((m3.l) this.c).i() - this.b;
    }

    @Override // m3.l
    public void j(int i10) {
        ((m3.l) this.c).j(i10);
    }

    @Override // org.telegram.ui.Components.bo
    public void k() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        cf1 cf1Var = new cf1(bundle);
        cf1Var.d = new ArrayList();
        cf1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        cf1Var.e = profileActivity.d5;
        profileActivity.presentFragment(cf1Var);
    }

    @Override // m4.h
    public long l(long j10, long j11) {
        return ((m3.f) this.c).d[(int) j10];
    }

    @Override // org.telegram.ui.Components.bo
    public void m() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.c1);
        profileActivity.getNotificationsController().muteDialog(this.b, profileActivity.c1, z10);
        if (profileActivity.fragmentView != null) {
            mc.A(profileActivity, z10, null).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // m3.m
    public void n(m3.t tVar) {
        ((m3.m) this.c).n(new r3.c(this, tVar));
    }

    @Override // org.telegram.ui.Components.bo
    public void o() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j10 = this.b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.c1);
            profileActivity.presentFragment(new t01(bundle, profileActivity.v0));
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 1:
                ((c9) this.c).b.set(this.b);
                break;
            case 2:
            case 4:
            default:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j10 = this.b;
                Iterator it = ((o5.h) ((j9.a) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((r5.p) it.next()).b(j10, statusCode, null);
                }
                break;
            case 3:
                ((c9) this.c).b.set(this.b);
                break;
            case 5:
                ((c9) this.c).b.set(this.b);
                break;
        }
    }

    @Override // r4.g
    public int p() {
        return 1;
    }

    @Override // m3.l
    public void q() {
        ((m3.l) this.c).q();
    }

    @Override // m4.h
    public long r(long j10, long j11) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.upstream.j
    public int read(byte[] bArr, int i10, int i11) {
        return ((m3.l) this.c).read(bArr, i10, i11);
    }

    @Override // m3.l
    public void readFully(byte[] bArr, int i10, int i11) {
        ((m3.l) this.c).readFully(bArr, i10, i11);
    }

    @Override // m4.h
    public long s(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // m3.l
    public int skip(int i10) {
        return ((m3.l) this.c).skip(i10);
    }

    @Override // m3.l
    public void t(int i10) {
        ((m3.l) this.c).t(i10);
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

    @Override // org.telegram.ui.Components.bo
    public void u() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((n2) profileActivity).currentAccount;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.b;
        boolean z10 = notificationsSettings.getBoolean(y1.j(j10, profileActivity.c1, sb2), true);
        boolean z11 = !z10;
        notificationsSettings.edit().putBoolean(y1.j(j10, profileActivity.c1, new StringBuilder("sound_enabled_")), z11).apply();
        if (mc.a(profileActivity)) {
            mc.S(z10 ? 1 : 0, profileActivity, profileActivity.v0).j();
        }
    }

    @Override // org.telegram.ui.Components.bo
    public void v(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().isDialogMuted(this.b, profileActivity.c1)) {
                m();
            }
            if (mc.a(profileActivity)) {
                mc.z(profileActivity, 4, i10, profileActivity.v0).j();
                return;
            }
            return;
        }
        profileActivity.getNotificationsController().muteUntil(this.b, profileActivity.c1, i10);
        if (mc.a(profileActivity)) {
            mc.z(profileActivity, 5, i10, profileActivity.v0).j();
        }
        profileActivity.a5();
        profileActivity.g5(true);
    }

    @Override // m4.h
    public n4.j w(long j10) {
        return new n4.j(((m3.f) this.c).c[(int) j10], r1.b[r8], null);
    }

    public void x(int i10) {
        if (i10 < 64) {
            this.b &= ~(1 << i10);
            return;
        }
        c cVar = (c) this.c;
        if (cVar != null) {
            cVar.x(i10 - 64);
        }
    }

    @Override // m4.h
    public long y(long j10, long j11) {
        m3.f fVar = (m3.f) this.c;
        return d5.g0.e(fVar.e, j10 + this.b, true);
    }

    public int z(int i10) {
        c cVar = (c) this.c;
        if (cVar == null) {
            return i10 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.b) + cVar.z(i10 - 64);
    }

    public /* synthetic */ c(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    public c(m3.l lVar, long j10) {
        this.a = 10;
        this.c = lVar;
        d5.a.f(lVar.getPosition() >= j10);
        this.b = j10;
    }

    public c(int i10) {
        this.a = i10;
        switch (i10) {
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

    @Override // org.telegram.ui.Components.bo
    public /* synthetic */ void dismiss() {
    }
}
