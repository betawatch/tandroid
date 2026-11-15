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
import org.telegram.messenger.at;
import org.telegram.messenger.np;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ho;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.aa1;
import org.telegram.ui.fx0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final /* synthetic */ class va implements OnFailureListener, f3.p, f3.q, o2.i, ho, zi.y0 {
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
            this.b |= 1 << i7;
        } else {
            r();
            ((va) this.c).A(i7 - 64);
        }
    }

    @Override // o2.i
    public long D(long j3, long j10) {
        return -9223372036854775807L;
    }

    @Override // o2.i
    public p2.j E(long j3) {
        return new p2.j(((f3.j) this.c).c[(int) j3], null, r1.b[r7]);
    }

    @Override // org.telegram.ui.Components.ho
    public void F() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j3 = this.b;
        if (j3 != 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j3);
            bundle.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new fx0(bundle, profileActivity.A0));
        }
    }

    @Override // org.telegram.ui.Components.ho
    public void J() {
        int i7;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i7 = ((org.telegram.ui.ActionBar.e2) profileActivity).currentAccount;
        SharedPreferences sharedPreferences = np.s1(i7).e7;
        StringBuilder sb2 = new StringBuilder("sound_enabled_");
        long j3 = this.b;
        sb2.append(at.v(j3, profileActivity.g1, false));
        boolean z10 = sharedPreferences.getBoolean(sb2.toString(), true);
        boolean z11 = !z10;
        sharedPreferences.edit().putBoolean("sound_enabled_" + at.v(j3, profileActivity.g1, false), z11).apply();
        if (cc.a(profileActivity)) {
            cc.S(z10 ? 1 : 0, profileActivity, profileActivity.A0).j();
        }
    }

    @Override // o2.i
    public long L(long j3, long j10) {
        f3.j jVar = (f3.j) this.c;
        return h2.l0.f(jVar.e, j3 + this.b, true);
    }

    @Override // org.telegram.ui.Components.ho
    public void R(int i7) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i7 == 0) {
            if (profileActivity.getMessagesController().r2(this.b, profileActivity.g1, null)) {
                u();
            }
            if (cc.a(profileActivity)) {
                cc.z(profileActivity, 4, i7, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.X6;
        profileActivity.getNotificationsController().H(this.b, i7, profileActivity.g1);
        if (cc.a(profileActivity)) {
            cc.z(profileActivity, 5, i7, profileActivity.A0).j();
        }
        profileActivity.x5();
        profileActivity.I5(true);
    }

    @Override // zi.y0
    public void a(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((zi.y) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override // o2.i
    public long b(long j3) {
        return ((f3.j) this.c).e[(int) j3] - this.b;
    }

    @Override // f3.p
    public void c(int i7, int i10, byte[] bArr) {
        ((f3.p) this.c).c(i7, i10, bArr);
    }

    @Override // f3.p
    public boolean d(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.c).d(bArr, 0, i10, z10);
    }

    @Override // f3.q
    public void d1() {
        ((f3.q) this.c).d1();
    }

    @Override // f3.q
    public f3.i0 d2(int i7, int i10) {
        return ((f3.q) this.c).d2(i7, i10);
    }

    @Override // f3.p
    public int e(int i7, int i10, byte[] bArr) {
        return ((f3.p) this.c).e(i7, i10, bArr);
    }

    @Override // f3.q
    public void f(f3.b0 b0Var) {
        ((f3.q) this.c).f(new f3.g0(this, b0Var, b0Var));
    }

    @Override // f3.p
    public boolean g(int i7, boolean z10) {
        return ((f3.p) this.c).g(i7, true);
    }

    @Override // o2.i
    public boolean g0() {
        return true;
    }

    @Override // f3.p
    public long getLength() {
        return ((f3.p) this.c).getLength() - this.b;
    }

    @Override // f3.p
    public long getPosition() {
        return ((f3.p) this.c).getPosition() - this.b;
    }

    @Override // f3.p
    public boolean h(byte[] bArr, int i7, int i10, boolean z10) {
        return ((f3.p) this.c).h(bArr, i7, i10, z10);
    }

    @Override // o2.i
    public long i(long j3, long j10) {
        return ((f3.j) this.c).d[(int) j3];
    }

    @Override // f3.p
    public long j() {
        return ((f3.p) this.c).j() - this.b;
    }

    @Override // f3.p
    public void k(int i7) {
        ((f3.p) this.c).k(i7);
    }

    @Override // o2.i
    public long k0() {
        return 0L;
    }

    @Override // f3.p
    public void l() {
        ((f3.p) this.c).l();
    }

    @Override // f3.p
    public void m(int i7) {
        ((f3.p) this.c).m(i7);
    }

    @Override // f3.p
    public boolean n(int i7, boolean z10) {
        return ((f3.p) this.c).n(i7, true);
    }

    @Override // zi.y0
    public void o(MediaFormat mediaFormat) {
        ((zi.y) this.c).n(mediaFormat, true);
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
                ((AtomicLong) ((tg.x) this.c).c).set(this.b);
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

    public void p(int i7) {
        if (i7 < 64) {
            this.b &= ~(1 << i7);
            return;
        }
        va vaVar = (va) this.c;
        if (vaVar != null) {
            vaVar.p(i7 - 64);
        }
    }

    public int q(int i7) {
        va vaVar = (va) this.c;
        if (vaVar == null) {
            return i7 >= 64 ? Long.bitCount(this.b) : Long.bitCount(this.b & ((1 << i7) - 1));
        }
        if (i7 < 64) {
            return Long.bitCount(this.b & ((1 << i7) - 1));
        }
        return Long.bitCount(this.b) + vaVar.q(i7 - 64);
    }

    public void r() {
        if (((va) this.c) == null) {
            this.c = new va(8);
        }
    }

    @Override // e2.n
    public int read(byte[] bArr, int i7, int i10) {
        return ((f3.p) this.c).read(bArr, i7, i10);
    }

    @Override // f3.p
    public void readFully(byte[] bArr, int i7, int i10) {
        ((f3.p) this.c).readFully(bArr, i7, i10);
    }

    public void s(yc.a aVar) {
        this.b++;
        Thread thread = new Thread(aVar);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(aVar);
        thread.start();
    }

    @Override // f3.p
    public int skip(int i7) {
        return ((f3.p) this.c).skip(i7);
    }

    @Override // org.telegram.ui.Components.ho
    public void t() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        aa1 aa1Var = new aa1(bundle);
        aa1Var.d = new ArrayList();
        aa1Var.e = new HashSet();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        aa1Var.e = profileActivity.l5;
        profileActivity.presentFragment(aa1Var);
    }

    @Override // o2.i
    public long t0(long j3) {
        return ((f3.j) this.c).a;
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

    @Override // org.telegram.ui.Components.ho
    public void u() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z10 = !profileActivity.getMessagesController().r2(this.b, profileActivity.g1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.g1, z10);
        if (profileActivity.fragmentView != null) {
            cc.A(profileActivity, z10, null).j();
        }
        profileActivity.x5();
        profileActivity.I5(true);
    }

    public boolean v(int i7) {
        if (i7 < 64) {
            return (this.b & (1 << i7)) != 0;
        }
        r();
        return ((va) this.c).v(i7 - 64);
    }

    @Override // o2.i
    public long v0(long j3, long j10) {
        return ((f3.j) this.c).a;
    }

    public void w(int i7, boolean z10) {
        if (i7 >= 64) {
            r();
            ((va) this.c).w(i7 - 64, z10);
            return;
        }
        long j3 = this.b;
        boolean z11 = (Long.MIN_VALUE & j3) != 0;
        long j10 = (1 << i7) - 1;
        this.b = ((j3 & (~j10)) << 1) | (j3 & j10);
        if (z10) {
            A(i7);
        } else {
            p(i7);
        }
        if (z11 || ((va) this.c) != null) {
            r();
            ((va) this.c).w(0, z11);
        }
    }

    public boolean x(int i7) {
        if (i7 >= 64) {
            r();
            return ((va) this.c).x(i7 - 64);
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
            if (vaVar.v(0)) {
                A(63);
            }
            ((va) this.c).x(0);
        }
        return z10;
    }

    @Override // o2.i
    public long y(long j3, long j10) {
        return 0L;
    }

    public void z() {
        this.b = 0L;
        va vaVar = (va) this.c;
        if (vaVar != null) {
            vaVar.z();
        }
    }

    public /* synthetic */ va(Object obj, long j3, int i7) {
        this.a = i7;
        this.c = obj;
        this.b = j3;
    }

    public va(f3.p pVar, long j3) {
        this.a = 2;
        this.c = pVar;
        ja.f(pVar.getPosition() >= j3);
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

    @Override // org.telegram.ui.Components.ho
    public /* synthetic */ void dismiss() {
    }
}
