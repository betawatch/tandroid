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
import org.telegram.messenger.np;
import org.telegram.messenger.ys;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.qo;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ea1;
import org.telegram.ui.jx0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public final /* synthetic */ class va implements OnFailureListener, f3.p, f3.q, o2.i, qo, zi.x0 {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public /* synthetic */ va(long j3, Object obj, int i7) {
        this.a = i7;
        this.b = j3;
        this.c = obj;
    }

    @Override // zi.x0
    public void A(MediaFormat mediaFormat) {
        ((zi.x) this.c).n(mediaFormat, true);
    }

    @Override // org.telegram.ui.Components.qo
    public void B(int i7) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i7 == 0) {
            if (profileActivity.getMessagesController().u2(this.b, profileActivity.g1, null)) {
                s();
            }
            if (lc.a(profileActivity)) {
                lc.z(profileActivity, 4, i7, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getNotificationsController().H(this.b, i7, profileActivity.g1);
        if (lc.a(profileActivity)) {
            lc.z(profileActivity, 5, i7, profileActivity.A0).j();
        }
        profileActivity.y5();
        profileActivity.J5(true);
    }

    public void C(int i7) {
        if (i7 < 64) {
            this.b &= ~(1 << i7);
            return;
        }
        va vaVar = (va) this.c;
        if (vaVar != null) {
            vaVar.C(i7 - 64);
        }
    }

    public int D(int i7) {
        va vaVar = (va) this.c;
        if (vaVar == null) {
            return i7 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i7) - 1));
        }
        if (i7 < 64) {
            return Long.bitCount(this.b & ((1 << i7) - 1));
        }
        return Long.bitCount(this.b) + vaVar.D(i7 - 64);
    }

    public void E() {
        if (((va) this.c) == null) {
            this.c = new va(8);
        }
    }

    public void F(yc.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    public boolean G(int i7) {
        if (i7 < 64) {
            return (this.b & (1 << i7)) != 0;
        }
        E();
        return ((va) this.c).G(i7 - 64);
    }

    public void H(int i7, boolean z10) {
        if (i7 >= 64) {
            E();
            ((va) this.c).H(i7 - 64, z10);
            return;
        }
        long j3 = this.b;
        boolean z11 = (Long.MIN_VALUE & j3) != 0;
        long j10 = (1 << i7) - 1;
        this.b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            K(i7);
        } else {
            C(i7);
        }
        if (z11 || ((va) this.c) != null) {
            E();
            ((va) this.c).H(0, z11);
        }
    }

    public boolean I(int i7) {
        if (i7 >= 64) {
            E();
            return ((va) this.c).I(i7 - 64);
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
            if (vaVar.G(0)) {
                K(63);
            }
            ((va) this.c).I(0);
        }
        return z10;
    }

    public void J() {
        this.b = 0L;
        va vaVar = (va) this.c;
        if (vaVar != null) {
            vaVar.J();
        }
    }

    public void K(int i7) {
        if (i7 < 64) {
            this.b |= 1 << i7;
        } else {
            E();
            ((va) this.c).K(i7 - 64);
        }
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
    public boolean c(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.c).c(bArr, 0, i10, z10);
    }

    @Override // f3.p
    public int d(int i7, int i10, byte[] bArr) {
        return ((f3.p) this.c).d(i7, i10, bArr);
    }

    @Override // f3.q
    public void d1() {
        ((f3.q) this.c).d1();
    }

    @Override // f3.q
    public f3.i0 d2(int i7, int i10) {
        return ((f3.q) this.c).d2(i7, i10);
    }

    @Override // o2.i
    public long e(long j3, long j10) {
        return ((f3.j) this.c).d[(int) j3];
    }

    @Override // f3.p
    public boolean f(int i7, boolean z10) {
        return ((f3.p) this.c).f(i7, true);
    }

    @Override // f3.p
    public boolean g(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.c).g(bArr, i7, i10, z10);
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
    public long h(long j3, long j10) {
        return 0L;
    }

    @Override // o2.i
    public long i(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // f3.q
    public void j(f3.b0 b0Var) {
        ((f3.q) this.c).j(new f3.g0(this, b0Var, b0Var));
    }

    @Override // o2.i
    public p2.j k(long j3) {
        return new p2.j(((f3.j) this.c).c[(int) j3], null, r1.b[r7]);
    }

    @Override // f3.p
    public long l() {
        return ((f3.p) this.c).l() - this.b;
    }

    @Override // f3.p
    public void m(int i7) {
        ((f3.p) this.c).m(i7);
    }

    @Override // f3.p
    public void n() {
        ((f3.p) this.c).n();
    }

    @Override // o2.i
    public long o(long j3, long j10) {
        f3.j jVar = (f3.j) this.c;
        return h2.l0.f(jVar.e, j3 + this.b, true);
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
                ((AtomicLong) ((tg.y) this.c).c).set(this.b);
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

    @Override // org.telegram.ui.Components.qo
    public void p() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        ea1 ea1Var = new ea1(bundle);
        ea1Var.d = new ArrayList();
        ea1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        ea1Var.e = profileActivity.n5;
        profileActivity.presentFragment(ea1Var);
    }

    @Override // zi.x0
    public void q(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((zi.x) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override // f3.p
    public void r(int i7) {
        ((f3.p) this.c).r(i7);
    }

    @Override // e2.n
    public int read(byte[] bArr, int i7, int i10) {
        return ((f3.p) this.c).read(bArr, i7, i10);
    }

    @Override // f3.p
    public void readFully(byte[] bArr, int i7, int i10) {
        ((f3.p) this.c).readFully(bArr, i7, i10);
    }

    @Override // org.telegram.ui.Components.qo
    public void s() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().u2(this.b, profileActivity.g1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.g1, z10);
        if (profileActivity.fragmentView != null) {
            lc.A(profileActivity, z10, null).j();
        }
        profileActivity.y5();
        profileActivity.J5(true);
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
                if (((va) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((va) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // org.telegram.ui.Components.qo
    public void u() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j3 = this.b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new jx0(bundle, profileActivity.A0));
        }
    }

    @Override // o2.i
    public long v() {
        return 0L;
    }

    @Override // org.telegram.ui.Components.qo
    public void w() {
        int i7;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i7 = ((org.telegram.ui.ActionBar.g2) profileActivity).currentAccount;
        SharedPreferences sharedPreferences = np.u1(i7).g7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.b;
        sb2.append(ys.v(j3, profileActivity.g1, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + ys.v(j3, profileActivity.g1, false), z11).apply();
        if (lc.a(profileActivity)) {
            lc.S(z10 ? 1 : 0, profileActivity, profileActivity.A0).j();
        }
    }

    @Override // f3.p
    public boolean x(int i7, boolean z10) {
        return ((f3.p) this.c).x(i7, true);
    }

    @Override // o2.i
    public long y(long j3) {
        return ((f3.j) this.c).a;
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
        la.f(pVar.getPosition() >= j3);
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

    @Override // org.telegram.ui.Components.qo
    public /* synthetic */ void dismiss() {
    }
}
