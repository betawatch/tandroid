package c3;

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
import java.util.concurrent.atomic.AtomicLong;
import li.a1;
import org.telegram.messenger.ot;
import org.telegram.messenger.vp;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.fo;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.uy0;
import org.telegram.ui.vb1;
import v7.t6;
import v7.y8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class g0 implements p, q, OnFailureListener, l2.i, a1, fo {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ g0(long j10, Object obj, int i10) {
        this.a = i10;
        this.b = j10;
        this.c = obj;
    }

    @Override // l2.i
    public long A(long j10, long j11) {
        return ((j) this.c).a;
    }

    public int B(int i10) {
        g0 g0Var = (g0) this.c;
        if (g0Var == null) {
            return i10 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i10) - 1));
        }
        if (i10 < 64) {
            return Long.bitCount(this.b & ((1 << i10) - 1));
        }
        return Long.bitCount(this.b) + g0Var.B(i10 - 64);
    }

    public void C() {
        if (((g0) this.c) == null) {
            this.c = new g0(7);
        }
    }

    public void D(sc.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    @Override // org.telegram.ui.Components.fo
    public void E(int i10) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i10 == 0) {
            if (profileActivity.getMessagesController().q2(this.b, profileActivity.f1, null)) {
                v();
            }
            if (cc.a(profileActivity)) {
                cc.z(profileActivity, 4, i10, profileActivity.z0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.R6;
        profileActivity.getNotificationsController().H(this.b, i10, profileActivity.f1);
        if (cc.a(profileActivity)) {
            cc.z(profileActivity, 5, i10, profileActivity.z0).j();
        }
        profileActivity.u5();
        profileActivity.E5(true);
    }

    public boolean F(int i10) {
        if (i10 < 64) {
            return (this.b & (1 << i10)) != 0;
        }
        C();
        return ((g0) this.c).F(i10 - 64);
    }

    public void G(int i10, boolean z10) {
        if (i10 >= 64) {
            C();
            ((g0) this.c).G(i10 - 64, z10);
            return;
        }
        long j10 = this.b;
        boolean z11 = (Long.MIN_VALUE & j10) != 0;
        long j11 = (1 << i10) - 1;
        this.b = ((j10 & (~j11)) << 1) | (j10 & j11);
        if (z10) {
            J(i10);
        } else {
            w(i10);
        }
        if (z11 || ((g0) this.c) != null) {
            C();
            ((g0) this.c).G(0, z11);
        }
    }

    @Override // c3.q
    public void G1(b0 b0Var) {
        ((q) this.c).G1(new h0(this, b0Var, b0Var));
    }

    public boolean H(int i10) {
        if (i10 >= 64) {
            C();
            return ((g0) this.c).H(i10 - 64);
        }
        long j10 = 1 << i10;
        long j11 = this.b;
        boolean z10 = (j11 & j10) != 0;
        long j12 = j11 & (~j10);
        this.b = j12;
        long j13 = j10 - 1;
        this.b = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
        g0 g0Var = (g0) this.c;
        if (g0Var != null) {
            if (g0Var.F(0)) {
                J(63);
            }
            ((g0) this.c).H(0);
        }
        return z10;
    }

    public void I() {
        this.b = 0L;
        g0 g0Var = (g0) this.c;
        if (g0Var != null) {
            g0Var.I();
        }
    }

    @Override // c3.q
    public k0 I1(int i10, int i11) {
        return ((q) this.c).I1(i10, i11);
    }

    public void J(int i10) {
        if (i10 < 64) {
            this.b |= 1 << i10;
        } else {
            C();
            ((g0) this.c).J(i10 - 64);
        }
    }

    @Override // c3.q
    public void Q0() {
        ((q) this.c).Q0();
    }

    @Override // l2.i
    public long a(long j10) {
        return ((j) this.c).e[(int) j10] - this.b;
    }

    @Override // c3.p
    public void b(int i10, int i11, byte[] bArr) {
        ((p) this.c).b(i10, i11, bArr);
    }

    @Override // l2.i
    public long c(long j10, long j11) {
        return ((j) this.c).d[(int) j10];
    }

    @Override // c3.p
    public boolean d(byte[] bArr, int i10, int i11, boolean z10) {
        return ((p) this.c).d(bArr, 0, i11, z10);
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
        return new m2.j(((j) this.c).c[(int) j10], null, r1.b[r7]);
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

    @Override // c3.p
    public long k() {
        return ((p) this.c).k() - this.b;
    }

    @Override // c3.p
    public void l(int i10) {
        ((p) this.c).l(i10);
    }

    @Override // c3.p
    public void m() {
        ((p) this.c).m();
    }

    @Override // org.telegram.ui.Components.fo
    public void n() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        vb1 vb1Var = new vb1(bundle);
        vb1Var.d = new ArrayList();
        vb1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        vb1Var.e = profileActivity.h5;
        profileActivity.presentFragment(vb1Var);
    }

    @Override // l2.i
    public long o(long j10, long j11) {
        j jVar = (j) this.c;
        return e2.l0.f(jVar.e, j10 + this.b, true);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 2:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j10 = this.b;
                Iterator it = ((e6.h) ((android.support.v4.media.session.a0) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((g6.o) it.next()).b(j10, statusCode, null);
                }
                break;
            case 9:
                ((y8) this.c).b.set(this.b);
                break;
            case 10:
                ((AtomicLong) ((u9.b) this.c).c).set(this.b);
                break;
            default:
                ((y8) this.c).b.set(this.b);
                break;
        }
    }

    @Override // li.a1
    public void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((li.z) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override // c3.p
    public void q(int i10) {
        ((p) this.c).q(i10);
    }

    @Override // c3.p
    public boolean r(int i10, boolean z10) {
        return ((p) this.c).r(i10, true);
    }

    @Override // b2.p
    public int read(byte[] bArr, int i10, int i11) {
        return ((p) this.c).read(bArr, i10, i11);
    }

    @Override // c3.p
    public void readFully(byte[] bArr, int i10, int i11) {
        ((p) this.c).readFully(bArr, i10, i11);
    }

    @Override // li.a1
    public void s(MediaFormat mediaFormat) {
        ((li.z) this.c).n(mediaFormat, true);
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
                if (((g0) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((g0) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // l2.i
    public long u() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.fo
    public void v() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().q2(this.b, profileActivity.f1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.f1, z10);
        if (profileActivity.fragmentView != null) {
            cc.A(profileActivity, z10, null).j();
        }
        profileActivity.u5();
        profileActivity.E5(true);
    }

    public void w(int i10) {
        if (i10 < 64) {
            this.b &= ~(1 << i10);
            return;
        }
        g0 g0Var = (g0) this.c;
        if (g0Var != null) {
            g0Var.w(i10 - 64);
        }
    }

    @Override // org.telegram.ui.Components.fo
    public void x() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j10 = this.b;
        if (j10 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j10);
            bundle.putLong("topic_id", profileActivity.f1);
            profileActivity.presentFragment(new uy0(bundle, profileActivity.z0));
        }
    }

    @Override // org.telegram.ui.Components.fo
    public void y() {
        int i10;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i10 = ((k2) profileActivity).currentAccount;
        SharedPreferences sharedPreferences = vp.r1(i10).e7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j10 = this.b;
        sb2.append(ot.v(j10, profileActivity.f1, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + ot.v(j10, profileActivity.f1, false), z11).apply();
        if (cc.a(profileActivity)) {
            cc.S(z10 ? 1 : 0, profileActivity, profileActivity.z0).j();
        }
    }

    @Override // l2.i
    public long z(long j10) {
        return ((j) this.c).a;
    }

    public /* synthetic */ g0(Object obj, long j10, int i10) {
        this.a = i10;
        this.c = obj;
        this.b = j10;
    }

    public g0(p pVar, long j10) {
        this.a = 0;
        this.c = pVar;
        t6.f(pVar.getPosition() >= j10);
        this.b = j10;
    }

    public g0(int i10) {
        this.a = i10;
        switch (i10) {
            case 8:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    @Override // org.telegram.ui.Components.fo
    public /* synthetic */ void dismiss() {
    }
}
