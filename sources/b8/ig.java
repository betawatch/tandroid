package b8;

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.hp;
import org.telegram.messenger.us;
import org.telegram.ui.Components.wn;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.s91;
import org.telegram.ui.yw0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ig implements OnFailureListener, e3.p, e3.q, n2.i, wn, wi.w0 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ ig(long j10, Object obj, int i3) {
        this.a = i3;
        this.b = j10;
        this.c = obj;
    }

    @Override // n2.i
    public boolean A() {
        return true;
    }

    public void B() {
        if (((ig) this.c) == null) {
            this.c = new ig(7);
        }
    }

    @Override // n2.i
    public long C() {
        return 0L;
    }

    public void D(vc.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    public boolean E(int i3) {
        if (i3 < 64) {
            return (this.b & (1 << i3)) != 0;
        }
        B();
        return ((ig) this.c).E(i3 - 64);
    }

    public void F(int i3, boolean z10) {
        if (i3 >= 64) {
            B();
            ((ig) this.c).F(i3 - 64, z10);
            return;
        }
        long j10 = this.b;
        boolean z11 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i3) - 1;
        this.b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            J(i3);
        } else {
            a(i3);
        }
        if (z11 || ((ig) this.c) != null) {
            B();
            ((ig) this.c).F(0, z11);
        }
    }

    public boolean G(int i3) {
        if (i3 >= 64) {
            B();
            return ((ig) this.c).G(i3 - 64);
        }
        long j10 = 1 << i3;
        long j11 = this.b;
        boolean z10 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.b = j12;
        long j13 = j10 - 1;
        this.b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        ig igVar = (ig) this.c;
        if (igVar != null) {
            if (igVar.E(0)) {
                J(63);
            }
            ((ig) this.c).G(0);
        }
        return z10;
    }

    @Override // n2.i
    public long H(long j10) {
        return ((e3.j) this.c).a;
    }

    public void I() {
        this.b = 0L;
        ig igVar = (ig) this.c;
        if (igVar != null) {
            igVar.I();
        }
    }

    public void J(int i3) {
        if (i3 < 64) {
            this.b |= 1 << i3;
        } else {
            B();
            ((ig) this.c).J(i3 - 64);
        }
    }

    @Override // n2.i
    public long K(long j10, long j11) {
        return ((e3.j) this.c).a;
    }

    @Override // e3.q
    public void L() {
        ((e3.q) this.c).L();
    }

    public void a(int i3) {
        if (i3 < 64) {
            this.b &= ~(1 << i3);
            return;
        }
        ig igVar = (ig) this.c;
        if (igVar != null) {
            igVar.a(i3 - 64);
        }
    }

    @Override // n2.i
    public long b(long j10) {
        return ((e3.j) this.c).e[(int) j10] - this.b;
    }

    @Override // e3.p
    public void c(int i3, int i10, byte[] bArr) {
        ((e3.p) this.c).c(i3, i10, bArr);
    }

    @Override // e3.p
    public boolean d(byte[] bArr, int i3, int i10, boolean z10) {
        return ((e3.p) this.c).d(bArr, 0, i10, z10);
    }

    @Override // e3.p
    public int e(int i3, int i10, byte[] bArr) {
        return ((e3.p) this.c).e(i3, i10, bArr);
    }

    @Override // e3.q
    public void f(e3.b0 b0Var) {
        ((e3.q) this.c).f(new e3.g0(this, b0Var, b0Var));
    }

    @Override // e3.p
    public boolean g(int i3, boolean z10) {
        return ((e3.p) this.c).g(i3, true);
    }

    @Override // e3.p
    public long getLength() {
        return ((e3.p) this.c).getLength() - this.b;
    }

    @Override // e3.p
    public long getPosition() {
        return ((e3.p) this.c).getPosition() - this.b;
    }

    @Override // e3.p
    public boolean h(byte[] bArr, int i3, int i10, boolean z10) {
        return ((e3.p) this.c).h(bArr, i3, i10, z10);
    }

    @Override // n2.i
    public long i(long j10, long j11) {
        return ((e3.j) this.c).d[(int) j10];
    }

    @Override // e3.q
    public e3.i0 i0(int i3, int i10) {
        return ((e3.q) this.c).i0(i3, i10);
    }

    @Override // n2.i
    public long j(long j10, long j11) {
        return 0L;
    }

    @Override // e3.p
    public long k() {
        return ((e3.p) this.c).k() - this.b;
    }

    @Override // n2.i
    public long l(long j10, long j11) {
        return -9223372036854775807L;
    }

    @Override // n2.i
    public o2.j m(long j10) {
        return new o2.j(((e3.j) this.c).c[(int) j10], null, r1.b[r7]);
    }

    @Override // e3.p
    public void n(int i3) {
        ((e3.p) this.c).n(i3);
    }

    @Override // e3.p
    public void o() {
        ((e3.p) this.c).o();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                ((jg) this.c).b.set(this.b);
                break;
            case 3:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j10 = this.b;
                Iterator it = ((g6.h) ((android.support.v4.media.session.a0) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((i6.o) it.next()).b(j10, statusCode, null);
                }
                break;
            case 10:
                ((jg) this.c).b.set(this.b);
                break;
            default:
                ((jg) this.c).b.set(this.b);
                break;
        }
    }

    @Override // org.telegram.ui.Components.wn
    public void p() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        s91 s91Var = new s91(bundle);
        s91Var.d = new ArrayList();
        s91Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        s91Var.e = profileActivity.i5;
        profileActivity.presentFragment(s91Var);
    }

    @Override // org.telegram.ui.Components.wn
    public void q() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().r2(this.b, profileActivity.g1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.g1, z10);
        if (profileActivity.fragmentView != null) {
            org.telegram.ui.Components.fc.A(profileActivity, z10, null).j();
        }
        profileActivity.v5();
        profileActivity.F5(true);
    }

    @Override // wi.w0
    public void r(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((wi.w) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override // d2.o
    public int read(byte[] bArr, int i3, int i10) {
        return ((e3.p) this.c).read(bArr, i3, i10);
    }

    @Override // e3.p
    public void readFully(byte[] bArr, int i3, int i10) {
        ((e3.p) this.c).readFully(bArr, i3, i10);
    }

    @Override // n2.i
    public long s(long j10, long j11) {
        e3.j jVar = (e3.j) this.c;
        return g2.n0.f(jVar.e, j10 + this.b, true);
    }

    @Override // e3.p
    public int skip(int i3) {
        return ((e3.p) this.c).skip(i3);
    }

    @Override // org.telegram.ui.Components.wn
    public void t() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j10 = this.b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new yw0(bundle, profileActivity.A0));
        }
    }

    public String toString() {
        switch (this.a) {
            case 7:
                if (((ig) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((ig) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // e3.p
    public void u(int i3) {
        ((e3.p) this.c).u(i3);
    }

    @Override // org.telegram.ui.Components.wn
    public void v() {
        int i3;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i3 = ((org.telegram.ui.ActionBar.d2) profileActivity).currentAccount;
        SharedPreferences sharedPreferences = hp.s1(i3).d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.b;
        sb2.append(us.v(j10, profileActivity.g1, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + us.v(j10, profileActivity.g1, false), z11).apply();
        if (org.telegram.ui.Components.fc.a(profileActivity)) {
            org.telegram.ui.Components.fc.S(z10 ? 1 : 0, profileActivity, profileActivity.A0).j();
        }
    }

    @Override // e3.p
    public boolean w(int i3, boolean z10) {
        return ((e3.p) this.c).w(i3, true);
    }

    @Override // wi.w0
    public void x(MediaFormat mediaFormat) {
        ((wi.w) this.c).n(mediaFormat, true);
    }

    public int y(int i3) {
        ig igVar = (ig) this.c;
        if (igVar == null) {
            return i3 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i3) - 1));
        }
        if (i3 < 64) {
            return Long.bitCount(this.b & ((1 << i3) - 1));
        }
        return Long.bitCount(this.b) + igVar.y(i3 - 64);
    }

    @Override // org.telegram.ui.Components.wn
    public void z(int i3) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i3 == 0) {
            if (profileActivity.getMessagesController().r2(this.b, profileActivity.g1, null)) {
                q();
            }
            if (org.telegram.ui.Components.fc.a(profileActivity)) {
                org.telegram.ui.Components.fc.z(profileActivity, 4, i3, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.T6;
        profileActivity.getNotificationsController().H(this.b, i3, profileActivity.g1);
        if (org.telegram.ui.Components.fc.a(profileActivity)) {
            org.telegram.ui.Components.fc.z(profileActivity, 5, i3, profileActivity.A0).j();
        }
        profileActivity.v5();
        profileActivity.F5(true);
    }

    public /* synthetic */ ig(Object obj, long j10, int i3) {
        this.a = i3;
        this.c = obj;
        this.b = j10;
    }

    public ig(e3.p pVar, long j10) {
        this.a = 1;
        this.c = pVar;
        zb.f(pVar.getPosition() >= j10);
        this.b = j10;
    }

    public ig(int i3) {
        this.a = i3;
        switch (i3) {
            case 8:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    @Override // org.telegram.ui.Components.wn
    public /* synthetic */ void dismiss() {
    }
}
