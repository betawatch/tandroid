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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class j5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ u5 b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ j5(u5 u5Var, CountDownLatch countDownLatch, Runnable runnable, int i9) {
        this.a = i9;
        this.b = u5Var;
        this.c = countDownLatch;
        this.d = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i9 = 1;
                final u5 u5Var = this.b;
                final CountDownLatch countDownLatch = this.c;
                final Runnable runnable = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.k5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i9) {
                            case 0:
                                u5 u5Var2 = u5Var;
                                ArrayList arrayList = u5Var2.R;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    u5Var2.f0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(u5Var2.M).putUsers(tL_premium_boostsList.users, false);
                                    u5Var2.e0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = 1;
                                        if (i11 >= size) {
                                            u5Var2.V = Math.max(0, tL_premium_boostsList.count - i10);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && u5Var2.V > 0) {
                                                z10 = true;
                                            }
                                            u5Var2.U = z10;
                                            u5Var2.h0 = tL_premium_boostsList.count;
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
                                u5 u5Var3 = u5Var;
                                ArrayList arrayList2 = u5Var3.Q;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    u5Var3.g0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(u5Var3.M).putUsers(tL_premium_boostsList2.users, false);
                                    u5Var3.d0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = 1;
                                        if (i15 >= size2) {
                                            u5Var3.T = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && u5Var3.T > 0) {
                                                z11 = true;
                                            }
                                            u5Var3.S = z11;
                                            u5Var3.i0 = tL_premium_boostsList2.count;
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
                final u5 u5Var2 = this.b;
                final CountDownLatch countDownLatch2 = this.c;
                final Runnable runnable2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.k5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                u5 u5Var22 = u5Var2;
                                ArrayList arrayList = u5Var22.R;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    u5Var22.f0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(u5Var22.M).putUsers(tL_premium_boostsList.users, false);
                                    u5Var22.e0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i102 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = 1;
                                        if (i11 >= size) {
                                            u5Var22.V = Math.max(0, tL_premium_boostsList.count - i102);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && u5Var22.V > 0) {
                                                z10 = true;
                                            }
                                            u5Var22.U = z10;
                                            u5Var22.h0 = tL_premium_boostsList.count;
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
                                u5 u5Var3 = u5Var2;
                                ArrayList arrayList2 = u5Var3.Q;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    u5Var3.g0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(u5Var3.M).putUsers(tL_premium_boostsList2.users, false);
                                    u5Var3.d0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = 1;
                                        if (i15 >= size2) {
                                            u5Var3.T = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && u5Var3.T > 0) {
                                                z11 = true;
                                            }
                                            u5Var3.S = z11;
                                            u5Var3.i0 = tL_premium_boostsList2.count;
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
