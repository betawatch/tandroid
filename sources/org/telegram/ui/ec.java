package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ec implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ hc b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ ec(hc hcVar, CountDownLatch countDownLatch, Runnable runnable, int i10) {
        this.a = i10;
        this.b = hcVar;
        this.c = countDownLatch;
        this.d = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final hc hcVar = this.b;
                final CountDownLatch countDownLatch = this.c;
                final Runnable runnable = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cc
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                hc hcVar2 = hcVar;
                                ArrayList arrayList = hcVar2.h;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    hcVar2.N = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(hcVar2.b).putUsers(tL_premium_boostsList.users, false);
                                    hcVar2.K = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = 1;
                                        if (i12 >= size) {
                                            hcVar2.s = Math.max(0, tL_premium_boostsList.count - i11);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && hcVar2.s > 0) {
                                                z10 = true;
                                            }
                                            hcVar2.r = z10;
                                            hcVar2.P = tL_premium_boostsList.count;
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                break;
                                            }
                                        } else {
                                            Object obj = arrayList.get(i12);
                                            i12++;
                                            int i14 = ((TL_stories.Boost) obj).multiplier;
                                            if (i14 > 0) {
                                                i13 = i14;
                                            }
                                            i11 += i13;
                                        }
                                    }
                                }
                                break;
                            default:
                                hc hcVar3 = hcVar;
                                ArrayList arrayList2 = hcVar3.n;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    hcVar3.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(hcVar3.b).putUsers(tL_premium_boostsList2.users, false);
                                    hcVar3.L = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i15 = 0;
                                    int i16 = 0;
                                    while (true) {
                                        int i17 = 1;
                                        if (i16 >= size2) {
                                            hcVar3.w = Math.max(0, tL_premium_boostsList2.count - i15);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && hcVar3.w > 0) {
                                                z11 = true;
                                            }
                                            hcVar3.v = z11;
                                            hcVar3.O = tL_premium_boostsList2.count;
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                break;
                                            }
                                        } else {
                                            Object obj2 = arrayList2.get(i16);
                                            i16++;
                                            int i18 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i18 > 0) {
                                                i17 = i18;
                                            }
                                            i15 += i17;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final hc hcVar2 = this.b;
                final CountDownLatch countDownLatch2 = this.c;
                final Runnable runnable2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cc
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                hc hcVar22 = hcVar2;
                                ArrayList arrayList = hcVar22.h;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    hcVar22.N = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(hcVar22.b).putUsers(tL_premium_boostsList.users, false);
                                    hcVar22.K = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i112 = 0;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = 1;
                                        if (i12 >= size) {
                                            hcVar22.s = Math.max(0, tL_premium_boostsList.count - i112);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && hcVar22.s > 0) {
                                                z10 = true;
                                            }
                                            hcVar22.r = z10;
                                            hcVar22.P = tL_premium_boostsList.count;
                                            Runnable runnable22 = runnable2;
                                            if (runnable22 != null) {
                                                runnable22.run();
                                                break;
                                            }
                                        } else {
                                            Object obj = arrayList.get(i12);
                                            i12++;
                                            int i14 = ((TL_stories.Boost) obj).multiplier;
                                            if (i14 > 0) {
                                                i13 = i14;
                                            }
                                            i112 += i13;
                                        }
                                    }
                                }
                                break;
                            default:
                                hc hcVar3 = hcVar2;
                                ArrayList arrayList2 = hcVar3.n;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    hcVar3.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(hcVar3.b).putUsers(tL_premium_boostsList2.users, false);
                                    hcVar3.L = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i15 = 0;
                                    int i16 = 0;
                                    while (true) {
                                        int i17 = 1;
                                        if (i16 >= size2) {
                                            hcVar3.w = Math.max(0, tL_premium_boostsList2.count - i15);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && hcVar3.w > 0) {
                                                z11 = true;
                                            }
                                            hcVar3.v = z11;
                                            hcVar3.O = tL_premium_boostsList2.count;
                                            Runnable runnable3 = runnable2;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                break;
                                            }
                                        } else {
                                            Object obj2 = arrayList2.get(i16);
                                            i16++;
                                            int i18 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i18 > 0) {
                                                i17 = i18;
                                            }
                                            i15 += i17;
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
