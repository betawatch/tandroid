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
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.mp;
import org.telegram.messenger.xs;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.no;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ca1;
import org.telegram.ui.hx0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final /* synthetic */ class va implements OnFailureListener, f3.p, f3.q, o2.i, no, zi.x0 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ va(long j3, Object obj, int i7) {
        this.a = i7;
        this.b = j3;
        this.c = obj;
    }

    public void A(int i7) {
        if (i7 < 64) {
            this.b &= ~(1 << i7);
            return;
        }
        va vaVar = (va) this.c;
        if (vaVar != null) {
            vaVar.A(i7 - 64);
        }
    }

    public int B(int i7) {
        va vaVar = (va) this.c;
        if (vaVar == null) {
            return i7 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i7) - 1));
        }
        if (i7 < 64) {
            return Long.bitCount(this.b & ((1 << i7) - 1));
        }
        return Long.bitCount(this.b) + vaVar.B(i7 - 64);
    }

    public void C() {
        if (((va) this.c) == null) {
            this.c = new va(8);
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
        return ((va) this.c).E(i7 - 64);
    }

    public void F(int i7, boolean z10) {
        if (i7 >= 64) {
            C();
            ((va) this.c).F(i7 - 64, z10);
            return;
        }
        long j3 = this.b;
        boolean z11 = (Long.MIN_VALUE & j3) != 0;
        long j10 = (1 << i7) - 1;
        this.b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            I(i7);
        } else {
            A(i7);
        }
        if (z11 || ((va) this.c) != null) {
            C();
            ((va) this.c).F(0, z11);
        }
    }

    public boolean G(int i7) {
        if (i7 >= 64) {
            C();
            return ((va) this.c).G(i7 - 64);
        }
        long j3 = 1 << i7;
        long j10 = this.b;
        boolean z10 = (j10 & j3) != 0;
        long j11 = j10 & (~j3);
        this.b = j11;
        long j12 = j3 - 1;
        this.b = (j11 & j12) | Long.rotateRight((~j12) & j11, 1);
        va vaVar = (va) this.c;
        if (vaVar != null) {
            if (vaVar.E(0)) {
                I(63);
            }
            ((va) this.c).G(0);
        }
        return z10;
    }

    public void H() {
        this.b = 0L;
        va vaVar = (va) this.c;
        if (vaVar != null) {
            vaVar.H();
        }
    }

    public void I(int i7) {
        if (i7 < 64) {
            this.b |= 1 << i7;
        } else {
            C();
            ((va) this.c).I(i7 - 64);
        }
    }

    @Override // org.telegram.ui.Components.no
    public void J() {
        int i7;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i7 = ((org.telegram.ui.ActionBar.g2) profileActivity).currentAccount;
        SharedPreferences sharedPreferences = mp.u1(i7).g7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.b;
        sb2.append(xs.v(j3, profileActivity.g1, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + xs.v(j3, profileActivity.g1, false), z11).apply();
        if (kc.a(profileActivity)) {
            kc.S(z10 ? 1 : 0, profileActivity, profileActivity.A0).j();
        }
    }

    @Override // org.telegram.ui.Components.no
    public void Q(int i7) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i7 == 0) {
            if (profileActivity.getMessagesController().u2(this.b, profileActivity.g1, null)) {
                v();
            }
            if (kc.a(profileActivity)) {
                kc.z(profileActivity, 4, i7, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getNotificationsController().H(this.b, i7, profileActivity.g1);
        if (kc.a(profileActivity)) {
            kc.z(profileActivity, 5, i7, profileActivity.A0).j();
        }
        profileActivity.y5();
        profileActivity.J5(true);
    }

    @Override // f3.q
    public void Z0() {
        ((f3.q) this.c).Z0();
    }

    @Override // o2.i
    public long a(long j3) {
        return ((f3.j) this.c).e[(int) j3] - this.b;
    }

    @Override // f3.p
    public void b(int i7, int i10, byte[] bArr) {
        ((f3.p) this.c).b(i7, i10, bArr);
    }

    @Override // o2.i
    public long c(long j3, long j10) {
        return ((f3.j) this.c).d[(int) j3];
    }

    @Override // f3.p
    public boolean d(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.c).d(bArr, 0, i10, z10);
    }

    @Override // f3.q
    public f3.j0 d2(int i7, int i10) {
        return ((f3.q) this.c).d2(i7, i10);
    }

    @Override // o2.i
    public long e(long j3, long j10) {
        return 0L;
    }

    @Override // o2.i
    public long f(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // o2.i
    public p2.j g(long j3) {
        return new p2.j(((f3.j) this.c).c[(int) j3], null, r1.b[r7]);
    }

    @Override // f3.p
    public long getLength() {
        return ((f3.p) this.c).getLength() - this.b;
    }

    @Override // f3.p
    public long getPosition() {
        return ((f3.p) this.c).getPosition() - this.b;
    }

    @Override // f3.q
    public void h(f3.c0 c0Var) {
        ((f3.q) this.c).h(new f3.h0(this, c0Var, c0Var));
    }

    @Override // f3.p
    public int i(int i7, int i10, byte[] bArr) {
        return ((f3.p) this.c).i(i7, i10, bArr);
    }

    @Override // f3.p
    public boolean j(int i7, boolean z10) {
        return ((f3.p) this.c).j(i7, true);
    }

    @Override // f3.p
    public boolean k(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.c).k(bArr, i7, i10, z10);
    }

    @Override // f3.p
    public long l() {
        return ((f3.p) this.c).l() - this.b;
    }

    @Override // f3.p
    public void m(int i7) {
        ((f3.p) this.c).m(i7);
    }

    @Override // o2.i
    public long n(long j3, long j10) {
        f3.j jVar = (f3.j) this.c;
        return h2.l0.f(jVar.e, j3 + this.b, true);
    }

    @Override // f3.p
    public void o() {
        ((f3.p) this.c).o();
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 0:
                ((wa) this.c).b.set(this.b);
                break;
            case 1:
                ((wa) this.c).b.set(this.b);
                break;
            case 2:
            case 3:
            default:
                ((AtomicLong) ((t1.a) this.c).c).set(this.b);
                break;
            case 4:
                int statusCode = exc instanceof com.google.android.gms.common.api.f ? ((com.google.android.gms.common.api.f) exc).getStatusCode() : 13;
                long j3 = this.b;
                Iterator it = ((h6.h) ((h6.m) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((j6.p) it.next()).b(j3, statusCode, null);
                }
                break;
        }
    }

    @Override // zi.x0
    public void p(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((zi.x) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override // f3.p
    public void q(int i7) {
        ((f3.p) this.c).q(i7);
    }

    @Override // o2.i
    public boolean r() {
        return true;
    }

    @Override // e2.n
    public int read(byte[] bArr, int i7, int i10) {
        return ((f3.p) this.c).read(bArr, i7, i10);
    }

    @Override // f3.p
    public void readFully(byte[] bArr, int i7, int i10) {
        ((f3.p) this.c).readFully(bArr, i7, i10);
    }

    @Override // o2.i
    public long s() {
        return 0L;
    }

    @Override // f3.p
    public int skip(int i7) {
        return ((f3.p) this.c).skip(i7);
    }

    @Override // f3.p
    public boolean t(int i7, boolean z10) {
        return ((f3.p) this.c).t(i7, true);
    }

    public String toString() {
        switch (this.a) {
            case 8:
                if (((va) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((va) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.Components.no
    public void u() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        ca1 ca1Var = new ca1(bundle);
        ca1Var.d = new ArrayList();
        ca1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        ca1Var.e = profileActivity.n5;
        profileActivity.presentFragment(ca1Var);
    }

    @Override // org.telegram.ui.Components.no
    public void v() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().u2(this.b, profileActivity.g1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.g1, z10);
        if (profileActivity.fragmentView != null) {
            kc.A(profileActivity, z10, null).j();
        }
        profileActivity.y5();
        profileActivity.J5(true);
    }

    @Override // zi.x0
    public void w(MediaFormat mediaFormat) {
        ((zi.x) this.c).n(mediaFormat, true);
    }

    @Override // o2.i
    public long x(long j3) {
        return ((f3.j) this.c).a;
    }

    @Override // org.telegram.ui.Components.no
    public void y() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j3 = this.b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new hx0(bundle, profileActivity.A0));
        }
    }

    @Override // o2.i
    public long z(long j3, long j10) {
        return ((f3.j) this.c).a;
    }

    public /* synthetic */ va(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    public va(f3.p pVar, long j3) {
        this.a = 2;
        this.c = pVar;
        ma.f(pVar.getPosition() >= j3);
        this.b = j3;
    }

    public va(int i7) {
        this.a = i7;
        switch (i7) {
            case 10:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    @Override // org.telegram.ui.Components.no
    public /* synthetic */ void dismiss() {
    }
}
