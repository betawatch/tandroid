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
public final /* synthetic */ class qb implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ tb b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ qb(tb tbVar, CountDownLatch countDownLatch, Runnable runnable, int i7) {
        this.a = i7;
        this.b = tbVar;
        this.c = countDownLatch;
        this.d = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i7 = 1;
                final tb tbVar = this.b;
                final CountDownLatch countDownLatch = this.c;
                final Runnable runnable = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ob
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                tb tbVar2 = tbVar;
                                ArrayList arrayList = tbVar2.h;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    tbVar2.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z9 = false;
                                    org.telegram.messenger.qp.s1(tbVar2.b).Y3(tL_premium_boostsList.users, false);
                                    tbVar2.J = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = 1;
                                        if (i11 >= size) {
                                            tbVar2.s = Math.max(0, tL_premium_boostsList.count - i10);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && tbVar2.s > 0) {
                                                z9 = true;
                                            }
                                            tbVar2.r = z9;
                                            tbVar2.O = tL_premium_boostsList.count;
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
                                tb tbVar3 = tbVar;
                                ArrayList arrayList2 = tbVar3.n;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    tbVar3.L = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z10 = false;
                                    org.telegram.messenger.qp.s1(tbVar3.b).Y3(tL_premium_boostsList2.users, false);
                                    tbVar3.K = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = 1;
                                        if (i15 >= size2) {
                                            tbVar3.x = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && tbVar3.x > 0) {
                                                z10 = true;
                                            }
                                            tbVar3.w = z10;
                                            tbVar3.N = tL_premium_boostsList2.count;
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
                final tb tbVar2 = this.b;
                final CountDownLatch countDownLatch2 = this.c;
                final Runnable runnable2 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.ob
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                tb tbVar22 = tbVar2;
                                ArrayList arrayList = tbVar22.h;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    tbVar22.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z9 = false;
                                    org.telegram.messenger.qp.s1(tbVar22.b).Y3(tL_premium_boostsList.users, false);
                                    tbVar22.J = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i102 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = 1;
                                        if (i11 >= size) {
                                            tbVar22.s = Math.max(0, tL_premium_boostsList.count - i102);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && tbVar22.s > 0) {
                                                z9 = true;
                                            }
                                            tbVar22.r = z9;
                                            tbVar22.O = tL_premium_boostsList.count;
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
                                tb tbVar3 = tbVar2;
                                ArrayList arrayList2 = tbVar3.n;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    tbVar3.L = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z10 = false;
                                    org.telegram.messenger.qp.s1(tbVar3.b).Y3(tL_premium_boostsList2.users, false);
                                    tbVar3.K = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = 1;
                                        if (i15 >= size2) {
                                            tbVar3.x = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && tbVar3.x > 0) {
                                                z10 = true;
                                            }
                                            tbVar3.w = z10;
                                            tbVar3.N = tL_premium_boostsList2.count;
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
