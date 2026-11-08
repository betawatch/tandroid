package a8;

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
import org.telegram.messenger.dt;
import org.telegram.messenger.qp;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.xn;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ca1;
import org.telegram.ui.gx0;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final /* synthetic */ class ua implements OnFailureListener, f3.p, f3.q, o2.i, xn, wi.w0 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ ua(long j3, Object obj, int i7) {
        this.a = i7;
        this.b = j3;
        this.c = obj;
    }

    public void A(int i7) {
        if (i7 < 64) {
            this.b &= ~(1 << i7);
            return;
        }
        ua uaVar = (ua) this.c;
        if (uaVar != null) {
            uaVar.A(i7 - 64);
        }
    }

    public int B(int i7) {
        ua uaVar = (ua) this.c;
        if (uaVar == null) {
            return i7 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i7) - 1));
        }
        if (i7 < 64) {
            return Long.bitCount(this.b & ((1 << i7) - 1));
        }
        return Long.bitCount(this.b) + uaVar.B(i7 - 64);
    }

    public void C() {
        if (((ua) this.c) == null) {
            this.c = new ua(8);
        }
    }

    public void D(yc.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    public boolean E(int i7) {
        if (i7 < 64) {
            return (this.b & (1 << i7)) != 0;
        }
        C();
        return ((ua) this.c).E(i7 - 64);
    }

    public void F(int i7, boolean z9) {
        if (i7 >= 64) {
            C();
            ((ua) this.c).F(i7 - 64, z9);
            return;
        }
        long j3 = this.b;
        boolean z10 = (Long.MIN_VALUE & j3) != 0;
        long j10 = (1 << i7) - 1;
        this.b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z9) {
            I(i7);
        } else {
            A(i7);
        }
        if (z10 || ((ua) this.c) != null) {
            C();
            ((ua) this.c).F(0, z10);
        }
    }

    public boolean G(int i7) {
        if (i7 >= 64) {
            C();
            return ((ua) this.c).G(i7 - 64);
        }
        long j3 = 1 << i7;
        long j10 = this.b;
        boolean z9 = (j10 & j3) != 0;
        long j11 = j10 & (~j3);
        this.b = j11;
        long j12 = j3 - 1;
        this.b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        ua uaVar = (ua) this.c;
        if (uaVar != null) {
            if (uaVar.E(0)) {
                I(63);
            }
            ((ua) this.c).G(0);
        }
        return z9;
    }

    public void H() {
        this.b = 0L;
        ua uaVar = (ua) this.c;
        if (uaVar != null) {
            uaVar.H();
        }
    }

    public void I(int i7) {
        if (i7 < 64) {
            this.b |= 1 << i7;
        } else {
            C();
            ((ua) this.c).I(i7 - 64);
        }
    }

    @Override // org.telegram.ui.Components.xn
    public void L() {
        int i7;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i7 = ((org.telegram.ui.ActionBar.f2) profileActivity).currentAccount;
        SharedPreferences sharedPreferences = qp.s1(i7).d7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.b;
        sb2.append(dt.v(j3, profileActivity.f1, false));
        boolean z9 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z10 = !z9;
        sharedPreferences.edit().putBoolean("sound_enabled_" + dt.v(j3, profileActivity.f1, false), z10).apply();
        if (hc.a(profileActivity)) {
            hc.S(z9 ? 1 : 0, profileActivity, profileActivity.z0).j();
        }
    }

    @Override // f3.q
    public f3.j0 O1(int i7, int i10) {
        return ((f3.q) this.c).O1(i7, i10);
    }

    @Override // org.telegram.ui.Components.xn
    public void R(int i7) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i7 == 0) {
            if (profileActivity.getMessagesController().r2(this.b, profileActivity.f1, null)) {
                p();
            }
            if (hc.a(profileActivity)) {
                hc.z(profileActivity, 4, i7, profileActivity.z0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.S6;
        profileActivity.getNotificationsController().H(this.b, i7, profileActivity.f1);
        if (hc.a(profileActivity)) {
            hc.z(profileActivity, 5, i7, profileActivity.z0).j();
        }
        profileActivity.v5();
        profileActivity.F5(true);
    }

    @Override // f3.q
    public void U0() {
        ((f3.q) this.c).U0();
    }

    @Override // o2.i
    public long a(long j3) {
        return ((f3.j) this.c).e[(int) j3] - this.b;
    }

    @Override // f3.p
    public void b(int i7, int i10, byte[] bArr) {
        ((f3.p) this.c).b(i7, i10, bArr);
    }

    @Override // f3.p
    public boolean c(byte[] bArr, int i7, int i10, boolean z9) {
        return ((f3.p) this.c).c(bArr, 0, i10, z9);
    }

    @Override // o2.i
    public long d(long j3, long j10) {
        return ((f3.j) this.c).d[(int) j3];
    }

    @Override // o2.i
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override // f3.q
    public void f(f3.c0 c0Var) {
        ((f3.q) this.c).f(new f3.h0(this, c0Var, c0Var));
    }

    @Override // o2.i
    public long g(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // f3.p
    public long getLength() {
        return ((f3.p) this.c).getLength() - this.b;
    }

    @Override // f3.p
    public long getPosition() {
        return ((f3.p) this.c).getPosition() - this.b;
    }

    @Override // o2.i
    public p2.j h(long j3) {
        return new p2.j(((f3.j) this.c).c[(int) j3], null, r1.b[r7]);
    }

    @Override // f3.p
    public int i(int i7, int i10, byte[] bArr) {
        return ((f3.p) this.c).i(i7, i10, bArr);
    }

    @Override // f3.p
    public boolean j(int i7, boolean z9) {
        return ((f3.p) this.c).j(i7, true);
    }

    @Override // f3.p
    public boolean k(byte[] bArr, int i7, int i10, boolean z9) {
        return ((f3.p) this.c).k(bArr, i7, i10, z9);
    }

    @Override // f3.p
    public long l() {
        return ((f3.p) this.c).l() - this.b;
    }

    @Override // f3.p
    public void m(int i7) {
        ((f3.p) this.c).m(i7);
    }

    @Override // org.telegram.ui.Components.xn
    public void n() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        ca1 ca1Var = new ca1(bundle);
        ca1Var.d = new ArrayList();
        ca1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        ca1Var.e = profileActivity.h5;
        profileActivity.presentFragment(ca1Var);
    }

    @Override // o2.i
    public long o(long j3, long j10) {
        f3.j jVar = (f3.j) this.c;
        return h2.m0.f(jVar.e, j3 + this.b, true);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                ((va) this.c).b.set(this.b);
                break;
            case 1:
                ((va) this.c).b.set(this.b);
                break;
            case 2:
            case 3:
            default:
                ((va) this.c).b.set(this.b);
                break;
            case 4:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j3 = this.b;
                Iterator it = ((h6.h) ((h6.m) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((j6.o) it.next()).b(j3, statusCode, null);
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.xn
    public void p() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z9 = !profileActivity.getMessagesController().r2(this.b, profileActivity.f1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.f1, z9);
        if (profileActivity.fragmentView != null) {
            hc.A(profileActivity, z9, null).j();
        }
        profileActivity.v5();
        profileActivity.F5(true);
    }

    @Override // f3.p
    public void q() {
        ((f3.p) this.c).q();
    }

    @Override // wi.w0
    public void r(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((wi.x) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override // e2.n
    public int read(byte[] bArr, int i7, int i10) {
        return ((f3.p) this.c).read(bArr, i7, i10);
    }

    @Override // f3.p
    public void readFully(byte[] bArr, int i7, int i10) {
        ((f3.p) this.c).readFully(bArr, i7, i10);
    }

    @Override // f3.p
    public void s(int i7) {
        ((f3.p) this.c).s(i7);
    }

    @Override // f3.p
    public int skip(int i7) {
        return ((f3.p) this.c).skip(i7);
    }

    @Override // o2.i
    public boolean t() {
        return true;
    }

    public String toString() {
        switch (this.a) {
            case 8:
                if (((ua) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((ua) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // o2.i
    public long u() {
        return 0L;
    }

    @Override // f3.p
    public boolean v(int i7, boolean z9) {
        return ((f3.p) this.c).v(i7, true);
    }

    @Override // wi.w0
    public void w(MediaFormat mediaFormat) {
        ((wi.x) this.c).n(mediaFormat, true);
    }

    @Override // o2.i
    public long x(long j3) {
        return ((f3.j) this.c).a;
    }

    @Override // org.telegram.ui.Components.xn
    public void y() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j3 = this.b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.f1);
            profileActivity.presentFragment(new gx0(bundle, profileActivity.z0));
        }
    }

    @Override // o2.i
    public long z(long j3, long j10) {
        return ((f3.j) this.c).a;
    }

    public /* synthetic */ ua(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    public ua(f3.p pVar, long j3) {
        this.a = 2;
        this.c = pVar;
        ia.f(pVar.getPosition() >= j3);
        this.b = j3;
    }

    public ua(int i7) {
        this.a = i7;
        switch (i7) {
            case 11:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    @Override // org.telegram.ui.Components.xn
    public /* synthetic */ void dismiss() {
    }
}
