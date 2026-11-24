// default package

import android.content.SharedPreferences;
import android.graphics.RectF;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import com.google.android.gms.tasks.OnFailureListener;
import j$.util.DesugarCollections;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class hg2 implements r53, xb2, zl9, k74, l74, OnFailureListener {
    public final /* synthetic */ byte a;
    public long b;
    public Object c;

    public hg2(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                this.c = DesugarCollections.synchronizedList(new ArrayList());
                break;
            default:
                this.b = 0L;
                break;
        }
    }

    public final void A() {
        this.b = 0L;
        hg2 hg2Var = (hg2) this.c;
        if (hg2Var != null) {
            hg2Var.A();
        }
    }

    @Override // l74
    public final void B() {
        ((l74) this.c).B();
    }

    @Override // r53
    public final long C(long j, long j2) {
        ah2 ah2Var = (ah2) this.c;
        return g8c.f(ah2Var.e, j + this.b, true);
    }

    public final void D(int i) {
        if (i < 64) {
            this.b |= 1 << i;
        } else {
            t();
            ((hg2) this.c).D(i - 64);
        }
    }

    @Override // l74
    public final wxb T(int i, int i2) {
        return ((l74) this.c).T(i, i2);
    }

    @Override // r53
    public final boolean V() {
        return true;
    }

    @Override // xb2
    public final void a() {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", this.b);
        wvb wvbVar = new wvb(bundle);
        wvbVar.d = new ArrayList();
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        wvbVar.e = profileActivity.n5;
        profileActivity.presentFragment(wvbVar);
    }

    @Override // k74
    public final void b(int i, int i2, byte[] bArr) {
        ((ja3) this.c).d(bArr, i, i2, false);
    }

    @Override // k74
    public final boolean c(byte[] bArr, int i, int i2, boolean z) {
        return ((ja3) this.c).c(bArr, 0, i2, z);
    }

    @Override // r53
    public final long c0() {
        return 0L;
    }

    @Override // k74
    public final boolean d(byte[] bArr, int i, int i2, boolean z) {
        return ((ja3) this.c).d(bArr, i, i2, z);
    }

    @Override // r53
    public final long e(long j) {
        return ((ah2) this.c).e[(int) j] - this.b;
    }

    @Override // k74
    public final long f() {
        return ((ja3) this.c).f() - this.b;
    }

    @Override // l74
    public final void f0(fv9 fv9Var) {
        ((l74) this.c).f0(new cwa(this, fv9Var, fv9Var));
    }

    @Override // k74
    public final void g(int i) {
        ((ja3) this.c).a(i, false);
    }

    @Override // r53
    public final long g0(long j) {
        return ((ah2) this.c).a;
    }

    @Override // k74
    public final long getLength() {
        return ((ja3) this.c).c - this.b;
    }

    @Override // k74
    public final long getPosition() {
        return ((ja3) this.c).d - this.b;
    }

    @Override // k74
    public final void h() {
        ((ja3) this.c).f = 0;
    }

    @Override // r53
    public final long h0(long j, long j2) {
        return ((ah2) this.c).a;
    }

    @Override // xb2
    public final void i() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        boolean z = !profileActivity.getMessagesController().n2(this.b, profileActivity.g1, null);
        profileActivity.getNotificationsController().G(this.b, profileActivity.g1, z);
        if (profileActivity.fragmentView != null) {
            u21.A(profileActivity, z, null).j();
        }
        profileActivity.O3();
        profileActivity.a4(true);
    }

    @Override // zl9
    public final void j(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo) {
        ((nk9) this.c).q(true, byteBuffer, bufferInfo, -this.b);
    }

    @Override // r53
    public final long k(long j, long j2) {
        return ((ah2) this.c).d[(int) j];
    }

    @Override // xb2
    public final void l() {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        long j = this.b;
        if (j != 0) {
            Bundle k = ls6.k(j, "dialog_id");
            k.putLong("topic_id", profileActivity.g1);
            profileActivity.presentFragment(new pr8(k, profileActivity.A0));
        }
    }

    @Override // k74
    public final void m(int i) {
        ((ja3) this.c).l(i, false);
    }

    @Override // xb2
    public final void n() {
        int i;
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        i = ((d) profileActivity).currentAccount;
        SharedPreferences sharedPreferences = na7.q1(i).W3;
        StringBuilder sb = new StringBuilder("sound_enabled_");
        long j = this.b;
        sb.append(im7.p(j, profileActivity.g1, false));
        boolean z = sharedPreferences.getBoolean(sb.toString(), true);
        boolean z2 = !z;
        sharedPreferences.edit().putBoolean("sound_enabled_" + im7.p(j, profileActivity.g1, false), z2).apply();
        if (u21.a(profileActivity)) {
            u21.S(z ? 1 : 0, profileActivity.A0, profileActivity).j();
        }
    }

    @Override // zl9
    public final void o(MediaFormat mediaFormat) {
        ((nk9) this.c).n(mediaFormat, true);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        switch (this.a) {
            case 8:
                int statusCode = exc instanceof zn ? ((zn) exc).getStatusCode() : 13;
                long j = this.b;
                Iterator it = ((i69) ((vk9) this.c).d).c.d.iterator();
                while (it.hasNext()) {
                    ((u9d) it.next()).b(j, statusCode, null);
                }
                break;
            case 9:
                ((zxe) this.c).b.set(this.b);
                break;
            case 10:
                ((zxe) this.c).b.set(this.b);
                break;
            default:
                ((AtomicLong) ((aec) this.c).c).set(this.b);
                break;
        }
    }

    @Override // xb2
    public final void p(int i) {
        ProfileActivity profileActivity = (ProfileActivity) this.c;
        if (i == 0) {
            if (profileActivity.getMessagesController().n2(this.b, profileActivity.g1, null)) {
                i();
            }
            if (u21.a(profileActivity)) {
                u21.z(profileActivity, 4, i, profileActivity.A0).j();
                return;
            }
            return;
        }
        RectF rectF = ProfileActivity.Z6;
        profileActivity.getNotificationsController().H(this.b, i, profileActivity.g1);
        if (u21.a(profileActivity)) {
            u21.z(profileActivity, 5, i, profileActivity.A0).j();
        }
        profileActivity.O3();
        profileActivity.a4(true);
    }

    public final void q(int i) {
        if (i < 64) {
            this.b &= ~(1 << i);
            return;
        }
        hg2 hg2Var = (hg2) this.c;
        if (hg2Var != null) {
            hg2Var.q(i - 64);
        }
    }

    @Override // r53
    public final long r(long j, long j2) {
        return 0L;
    }

    @Override // g63
    public final int read(byte[] bArr, int i, int i2) {
        return ((ja3) this.c).read(bArr, i, i2);
    }

    @Override // k74
    public final void readFully(byte[] bArr, int i, int i2) {
        ((ja3) this.c).c(bArr, i, i2, false);
    }

    public final int s(int i) {
        hg2 hg2Var = (hg2) this.c;
        if (hg2Var == null) {
            long j = this.b;
            return i >= 64 ? Long.bitCount(j) : Long.bitCount(j & ((1 << i) - 1));
        }
        if (i < 64) {
            return Long.bitCount(this.b & ((1 << i) - 1));
        }
        return Long.bitCount(this.b) + hg2Var.s(i - 64);
    }

    public final void t() {
        if (((hg2) this.c) == null) {
            this.c = new hg2((byte) 0);
        }
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                if (((hg2) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((hg2) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    public final void u(xh7 xh7Var) {
        this.b++;
        Thread thread = new Thread(xh7Var);
        thread.setDaemon(true);
        thread.setName("NanoHttpd Request Processor (#" + this.b + ")");
        ((List) this.c).add(xh7Var);
        thread.start();
    }

    @Override // r53
    public final long v(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // r53
    public final az8 w(long j) {
        return new az8(((ah2) this.c).c[(int) j], null, r6.b[r7]);
    }

    public final boolean x(int i) {
        if (i < 64) {
            return (this.b & (1 << i)) != 0;
        }
        t();
        return ((hg2) this.c).x(i - 64);
    }

    public final void y(int i, boolean z) {
        if (i >= 64) {
            t();
            ((hg2) this.c).y(i - 64, z);
            return;
        }
        long j = this.b;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.b = (j & j2) | ((j & (~j2)) << 1);
        if (z) {
            D(i);
        } else {
            q(i);
        }
        if (z2 || ((hg2) this.c) != null) {
            t();
            ((hg2) this.c).y(0, z2);
        }
    }

    public final boolean z(int i) {
        if (i >= 64) {
            t();
            return ((hg2) this.c).z(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight(j3 & (~j4), 1);
        hg2 hg2Var = (hg2) this.c;
        if (hg2Var != null) {
            if (hg2Var.x(0)) {
                D(63);
            }
            ((hg2) this.c).z(0);
        }
        return z;
    }

    @Override // xb2
    public final void dismiss() {
    }

    public /* synthetic */ hg2(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    public hg2(ja3 ja3Var, long j) {
        this.a = (byte) 6;
        this.c = ja3Var;
        gre.f(ja3Var.d >= j);
        this.b = j;
    }

    public /* synthetic */ hg2(long j, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
    }
}
