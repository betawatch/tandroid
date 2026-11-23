package hi;

import android.util.Log;
import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class h7 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Serializable h;
    public final /* synthetic */ Object n;

    public /* synthetic */ h7(r7 r7Var, long j3, long j10, int i7, Long l10, Long l11, int i10) {
        this.f = r7Var;
        this.b = j3;
        this.e = j10;
        this.c = i7;
        this.h = l10;
        this.n = l11;
        this.d = i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009f, code lost:
    
        if (r3 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a2  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        long[] jArr;
        long j3;
        float[] fArr;
        r7 r7Var;
        final long j10;
        long j11;
        final long j12;
        final long j13;
        final float[] fArr2;
        SQLiteCursor sQLiteCursor;
        int i7 = this.a;
        Object obj = this.n;
        long j14 = this.e;
        Object obj2 = this.h;
        long j15 = this.b;
        Object obj3 = this.f;
        switch (i7) {
            case 0:
                r7 r7Var2 = (r7) obj3;
                Long l10 = (Long) obj2;
                Long l11 = (Long) obj;
                long[] jArr2 = {j15};
                long j16 = j15 - 2000;
                long max = Math.max(0L, j15 - 3500);
                long j17 = j14 + 2000;
                try {
                    jArr = jArr2;
                    j3 = max;
                    try {
                        fArr = r7Var2.b(r7Var2.c, j3, j14 + 3500, jArr);
                    } catch (Throwable th2) {
                        th = th2;
                        Log.e("Dictation", "captions: can't hear the video", th);
                        fArr = null;
                        final int i10 = this.c;
                        if (fArr == null) {
                        }
                        if (fArr != null) {
                        }
                        final long j18 = j14;
                        final int i11 = this.d;
                        final r7 r7Var3 = r7Var;
                        org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.i7
                            @Override // java.lang.Runnable
                            public final void run() {
                                int i12;
                                l7 l7Var;
                                r7 r7Var4 = r7.this;
                                int i13 = i11;
                                long j19 = j10;
                                int i14 = i10;
                                float[] fArr3 = fArr2;
                                long j20 = j12;
                                long j21 = j18;
                                long j22 = j13;
                                HashMap hashMap = r7Var4.j;
                                if (r7Var4.h || i13 != r7Var4.g) {
                                    return;
                                }
                                if (j19 != Long.MAX_VALUE) {
                                    i12 = i14;
                                    r7Var4.k = Math.min(r7Var4.k, Math.max(j19, 1L));
                                } else {
                                    i12 = i14;
                                }
                                k7 k7Var = new k7();
                                r7Var4.i.put(Integer.valueOf(i12), k7Var);
                                if (fArr3 == null) {
                                    k7Var.c = true;
                                    r7Var4.p = false;
                                    if (i12 != 0 || r7Var4.k > 1 || r7Var4.q || (l7Var = r7Var4.t) == null) {
                                        r7Var4.f();
                                        return;
                                    } else {
                                        r7Var4.o = false;
                                        l7Var.p();
                                        return;
                                    }
                                }
                                hashMap.put(Integer.valueOf(i12), Long.valueOf(j20));
                                if (j21 < r7Var4.k) {
                                    hashMap.put(Integer.valueOf(i12 + 1), Long.valueOf(j21));
                                }
                                if (i12 == 0) {
                                    j20 = Long.MIN_VALUE;
                                }
                                long j23 = j21 >= r7Var4.k ? Long.MAX_VALUE : j21;
                                ai.q qVar = (ai.q) r7Var4.f.b;
                                if (r7Var4.t != null && r7Var4.x == null && !DictationAsr.C(qVar) && !DictationAsr.A(qVar)) {
                                    di.a8 a8Var = new di.a8(r7Var4, qVar, new long[2], 16);
                                    r7Var4.x = a8Var;
                                    DictationAsr.l(a8Var);
                                }
                                di.a8 a8Var2 = r7Var4.x;
                                android.support.v4.media.session.a0 a0Var = r7Var4.f;
                                j7 j7Var = new j7(r7Var4, i13, k7Var, j22, j20, j23);
                                ai.q[] qVarArr = DictationAsr.a;
                                boolean[] zArr = {false};
                                DictationAsr.i0((ai.q) a0Var.b, true, new ai.h(zArr, j7Var, fArr3, a0Var));
                                r7Var4.w = new ai.i(0, zArr);
                                if (a8Var2 == null || a8Var2 != r7Var4.x) {
                                    return;
                                }
                                a8Var2.run();
                            }
                        });
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    jArr = jArr2;
                    j3 = max;
                }
                final int i102 = this.c;
                if (fArr == null) {
                    long j19 = jArr[0];
                    long length = (fArr.length / 16) + j19;
                    long j20 = length < j14 + 2500 ? length : Long.MAX_VALUE;
                    long longValue = i102 == 0 ? j19 : l10 != null ? l10.longValue() : (r7.g(((int) (j16 - j19)) * 16, ((int) ((j15 + 2000) - j19)) * 16, fArr) / 16) + j19;
                    long longValue2 = j20 <= j17 ? j20 : l11 != null ? l11.longValue() : (r7.g(((int) ((j14 - 2000) - j19)) * 16, ((int) (j17 - j19)) * 16, fArr) / 16) + j19;
                    long max2 = Math.max(j19, Math.min(length, longValue));
                    long max3 = Math.max(max2, Math.min(length, longValue2));
                    int max4 = (int) Math.max(0L, Math.min(fArr.length, ((max2 - 1500) - j19) * 16));
                    int max5 = (int) Math.max(max4, Math.min(fArr.length, ((max3 + 1500) - j19) * 16));
                    long j21 = (max4 / 16) + j19;
                    if (max3 - max2 >= 100) {
                        fArr2 = Arrays.copyOfRange(fArr, max4, max5);
                        r7Var = r7Var2;
                        j10 = j3;
                        j12 = max2;
                    } else {
                        r7Var = r7Var2;
                        j10 = j3;
                        j12 = max2;
                        fArr2 = null;
                    }
                    j13 = j21;
                    j11 = j20;
                    j14 = max3;
                } else {
                    r7Var = r7Var2;
                    j10 = j3;
                    j11 = Long.MAX_VALUE;
                    j12 = j15;
                    j13 = j12;
                    fArr2 = null;
                }
                if (fArr != null) {
                    j10 = j11;
                }
                final long j182 = j14;
                final int i112 = this.d;
                final r7 r7Var32 = r7Var;
                org.telegram.messenger.g0.g3(new Runnable() { // from class: hi.i7
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i12;
                        l7 l7Var;
                        r7 r7Var4 = r7.this;
                        int i13 = i112;
                        long j192 = j10;
                        int i14 = i102;
                        float[] fArr3 = fArr2;
                        long j202 = j12;
                        long j212 = j182;
                        long j22 = j13;
                        HashMap hashMap = r7Var4.j;
                        if (r7Var4.h || i13 != r7Var4.g) {
                            return;
                        }
                        if (j192 != Long.MAX_VALUE) {
                            i12 = i14;
                            r7Var4.k = Math.min(r7Var4.k, Math.max(j192, 1L));
                        } else {
                            i12 = i14;
                        }
                        k7 k7Var = new k7();
                        r7Var4.i.put(Integer.valueOf(i12), k7Var);
                        if (fArr3 == null) {
                            k7Var.c = true;
                            r7Var4.p = false;
                            if (i12 != 0 || r7Var4.k > 1 || r7Var4.q || (l7Var = r7Var4.t) == null) {
                                r7Var4.f();
                                return;
                            } else {
                                r7Var4.o = false;
                                l7Var.p();
                                return;
                            }
                        }
                        hashMap.put(Integer.valueOf(i12), Long.valueOf(j202));
                        if (j212 < r7Var4.k) {
                            hashMap.put(Integer.valueOf(i12 + 1), Long.valueOf(j212));
                        }
                        if (i12 == 0) {
                            j202 = Long.MIN_VALUE;
                        }
                        long j23 = j212 >= r7Var4.k ? Long.MAX_VALUE : j212;
                        ai.q qVar = (ai.q) r7Var4.f.b;
                        if (r7Var4.t != null && r7Var4.x == null && !DictationAsr.C(qVar) && !DictationAsr.A(qVar)) {
                            di.a8 a8Var = new di.a8(r7Var4, qVar, new long[2], 16);
                            r7Var4.x = a8Var;
                            DictationAsr.l(a8Var);
                        }
                        di.a8 a8Var2 = r7Var4.x;
                        android.support.v4.media.session.a0 a0Var = r7Var4.f;
                        j7 j7Var = new j7(r7Var4, i13, k7Var, j22, j202, j23);
                        ai.q[] qVarArr = DictationAsr.a;
                        boolean[] zArr = {false};
                        DictationAsr.i0((ai.q) a0Var.b, true, new ai.h(zArr, j7Var, fArr3, a0Var));
                        r7Var4.w = new ai.i(0, zArr);
                        if (a8Var2 == null || a8Var2 != r7Var4.x) {
                            return;
                        }
                        a8Var2.run();
                    }
                });
                return;
            default:
                org.telegram.messenger.e8 e8Var = (org.telegram.messenger.e8) obj3;
                int i12 = this.c;
                int i13 = this.d;
                String[] strArr = (String[]) obj2;
                CountDownLatch countDownLatch = (CountDownLatch) obj;
                e8Var.c();
                SQLiteDatabase sQLiteDatabase = e8Var.c;
                if (sQLiteDatabase != null) {
                    try {
                        sQLiteCursor = sQLiteDatabase.queryFinalized("SELECT path FROM paths WHERE document_id = " + j15 + " AND dc_id = " + i12 + " AND type = " + i13, new Object[0]);
                        try {
                            if (sQLiteCursor.next()) {
                                strArr[0] = sQLiteCursor.stringValue(0);
                                boolean z10 = org.telegram.messenger.s2.a;
                                org.telegram.messenger.a8.b("get file path id=" + j15 + " dc=" + i12 + " type=" + i13 + " path=" + strArr[0] + " in " + (System.currentTimeMillis() - j14) + "ms");
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            try {
                                org.telegram.messenger.a8.g(th, true);
                                break;
                            } catch (Throwable th5) {
                                if (sQLiteCursor != null) {
                                    sQLiteCursor.dispose();
                                }
                                throw th5;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        sQLiteCursor = null;
                    }
                    sQLiteCursor.dispose();
                }
                countDownLatch.countDown();
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h7(org.telegram.messenger.e8 e8Var, long j3, int i7, int i10, String[] strArr, long j10, CountDownLatch countDownLatch) {
        this.f = e8Var;
        this.b = j3;
        this.c = i7;
        this.d = i10;
        this.h = strArr;
        this.e = j10;
        this.n = countDownLatch;
    }
}
