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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class j5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ j5(w5 w5Var, CountDownLatch countDownLatch, Runnable runnable, int i10) {
        this.a = i10;
        this.b = w5Var;
        this.c = countDownLatch;
        this.d = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final w5 w5Var = this.b;
                final CountDownLatch countDownLatch = this.c;
                final Runnable runnable = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.k5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                w5 w5Var2 = w5Var;
                                ArrayList arrayList = w5Var2.V;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    w5Var2.j0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(w5Var2.Q).putUsers(tL_premium_boostsList.users, false);
                                    w5Var2.i0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = 1;
                                        if (i12 >= size) {
                                            w5Var2.Z = Math.max(0, tL_premium_boostsList.count - i11);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && w5Var2.Z > 0) {
                                                z10 = true;
                                            }
                                            w5Var2.Y = z10;
                                            w5Var2.l0 = tL_premium_boostsList.count;
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
                                w5 w5Var3 = w5Var;
                                ArrayList arrayList2 = w5Var3.U;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    w5Var3.k0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(w5Var3.Q).putUsers(tL_premium_boostsList2.users, false);
                                    w5Var3.h0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i15 = 0;
                                    int i16 = 0;
                                    while (true) {
                                        int i17 = 1;
                                        if (i16 >= size2) {
                                            w5Var3.X = Math.max(0, tL_premium_boostsList2.count - i15);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && w5Var3.X > 0) {
                                                z11 = true;
                                            }
                                            w5Var3.W = z11;
                                            w5Var3.m0 = tL_premium_boostsList2.count;
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
                final w5 w5Var2 = this.b;
                final CountDownLatch countDownLatch2 = this.c;
                final Runnable runnable2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.k5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                w5 w5Var22 = w5Var2;
                                ArrayList arrayList = w5Var22.V;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    w5Var22.j0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(w5Var22.Q).putUsers(tL_premium_boostsList.users, false);
                                    w5Var22.i0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i112 = 0;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = 1;
                                        if (i12 >= size) {
                                            w5Var22.Z = Math.max(0, tL_premium_boostsList.count - i112);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && w5Var22.Z > 0) {
                                                z10 = true;
                                            }
                                            w5Var22.Y = z10;
                                            w5Var22.l0 = tL_premium_boostsList.count;
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
                                w5 w5Var3 = w5Var2;
                                ArrayList arrayList2 = w5Var3.U;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    w5Var3.k0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(w5Var3.Q).putUsers(tL_premium_boostsList2.users, false);
                                    w5Var3.h0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i15 = 0;
                                    int i16 = 0;
                                    while (true) {
                                        int i17 = 1;
                                        if (i16 >= size2) {
                                            w5Var3.X = Math.max(0, tL_premium_boostsList2.count - i15);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && w5Var3.X > 0) {
                                                z11 = true;
                                            }
                                            w5Var3.W = z11;
                                            w5Var3.m0 = tL_premium_boostsList2.count;
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
