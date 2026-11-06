package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class i5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ i5(t5 t5Var, CountDownLatch countDownLatch, Runnable runnable, int i7) {
        this.a = i7;
        this.b = t5Var;
        this.c = countDownLatch;
        this.d = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final t5 t5Var = this.b;
                final CountDownLatch countDownLatch = this.c;
                final Runnable runnable = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.j5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                t5 t5Var2 = t5Var;
                                ArrayList arrayList = t5Var2.X;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    t5Var2.l0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z9 = false;
                                    org.telegram.messenger.qp.s1(t5Var2.S).Y3(tL_premium_boostsList.users, false);
                                    t5Var2.k0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = 1;
                                        if (i11 >= size) {
                                            t5Var2.b0 = Math.max(0, tL_premium_boostsList.count - i10);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && t5Var2.b0 > 0) {
                                                z9 = true;
                                            }
                                            t5Var2.a0 = z9;
                                            t5Var2.n0 = tL_premium_boostsList.count;
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                break;
                                            }
                                        } else {
                                            Object obj = arrayList.get(i11);
                                            i11++;
                                            int i13 = ((TL_stories.Boost) obj).multiplier;
                                            if (i13 > 0) {
                                                i12 = i13;
                                            }
                                            i10 += i12;
                                        }
                                    }
                                }
                                break;
                            default:
                                t5 t5Var3 = t5Var;
                                ArrayList arrayList2 = t5Var3.W;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    t5Var3.m0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z10 = false;
                                    org.telegram.messenger.qp.s1(t5Var3.S).Y3(tL_premium_boostsList2.users, false);
                                    t5Var3.j0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = 1;
                                        if (i15 >= size2) {
                                            t5Var3.Z = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && t5Var3.Z > 0) {
                                                z10 = true;
                                            }
                                            t5Var3.Y = z10;
                                            t5Var3.o0 = tL_premium_boostsList2.count;
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                break;
                                            }
                                        } else {
                                            Object obj2 = arrayList2.get(i15);
                                            i15++;
                                            int i17 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i17 > 0) {
                                                i16 = i17;
                                            }
                                            i14 += i16;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i10 = 0;
                final t5 t5Var2 = this.b;
                final CountDownLatch countDownLatch2 = this.c;
                final Runnable runnable2 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.j5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                t5 t5Var22 = t5Var2;
                                ArrayList arrayList = t5Var22.X;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    t5Var22.l0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z9 = false;
                                    org.telegram.messenger.qp.s1(t5Var22.S).Y3(tL_premium_boostsList.users, false);
                                    t5Var22.k0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i102 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = 1;
                                        if (i11 >= size) {
                                            t5Var22.b0 = Math.max(0, tL_premium_boostsList.count - i102);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && t5Var22.b0 > 0) {
                                                z9 = true;
                                            }
                                            t5Var22.a0 = z9;
                                            t5Var22.n0 = tL_premium_boostsList.count;
                                            Runnable runnable22 = runnable2;
                                            if (runnable22 != null) {
                                                runnable22.run();
                                                break;
                                            }
                                        } else {
                                            Object obj = arrayList.get(i11);
                                            i11++;
                                            int i13 = ((TL_stories.Boost) obj).multiplier;
                                            if (i13 > 0) {
                                                i12 = i13;
                                            }
                                            i102 += i12;
                                        }
                                    }
                                }
                                break;
                            default:
                                t5 t5Var3 = t5Var2;
                                ArrayList arrayList2 = t5Var3.W;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    t5Var3.m0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z10 = false;
                                    org.telegram.messenger.qp.s1(t5Var3.S).Y3(tL_premium_boostsList2.users, false);
                                    t5Var3.j0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = 1;
                                        if (i15 >= size2) {
                                            t5Var3.Z = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && t5Var3.Z > 0) {
                                                z10 = true;
                                            }
                                            t5Var3.Y = z10;
                                            t5Var3.o0 = tL_premium_boostsList2.count;
                                            Runnable runnable3 = runnable2;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                break;
                                            }
                                        } else {
                                            Object obj2 = arrayList2.get(i15);
                                            i15++;
                                            int i17 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i17 > 0) {
                                                i16 = i17;
                                            }
                                            i14 += i16;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
