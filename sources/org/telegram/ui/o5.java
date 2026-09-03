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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class o5 implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;
    public final /* synthetic */ CountDownLatch c;
    public final /* synthetic */ Runnable d;

    public /* synthetic */ o5(a6 a6Var, CountDownLatch countDownLatch, Runnable runnable, int i10) {
        this.a = i10;
        this.b = a6Var;
        this.c = countDownLatch;
        this.d = runnable;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final a6 a6Var = this.b;
                final CountDownLatch countDownLatch = this.c;
                final Runnable runnable = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.p5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                a6 a6Var2 = a6Var;
                                ArrayList arrayList = a6Var2.S;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    a6Var2.g0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z4 = false;
                                    MessagesController.getInstance(a6Var2.N).putUsers(tL_premium_boostsList.users, false);
                                    a6Var2.f0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = 1;
                                        if (i12 >= size) {
                                            a6Var2.W = Math.max(0, tL_premium_boostsList.count - i11);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && a6Var2.W > 0) {
                                                z4 = true;
                                            }
                                            a6Var2.V = z4;
                                            a6Var2.i0 = tL_premium_boostsList.count;
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
                                a6 a6Var3 = a6Var;
                                ArrayList arrayList2 = a6Var3.R;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    a6Var3.h0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z10 = false;
                                    MessagesController.getInstance(a6Var3.N).putUsers(tL_premium_boostsList2.users, false);
                                    a6Var3.e0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i15 = 0;
                                    int i16 = 0;
                                    while (true) {
                                        int i17 = 1;
                                        if (i16 >= size2) {
                                            a6Var3.U = Math.max(0, tL_premium_boostsList2.count - i15);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && a6Var3.U > 0) {
                                                z10 = true;
                                            }
                                            a6Var3.T = z10;
                                            a6Var3.j0 = tL_premium_boostsList2.count;
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
                final a6 a6Var2 = this.b;
                final CountDownLatch countDownLatch2 = this.c;
                final Runnable runnable2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.p5
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                a6 a6Var22 = a6Var2;
                                ArrayList arrayList = a6Var22.S;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    a6Var22.g0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z4 = false;
                                    MessagesController.getInstance(a6Var22.N).putUsers(tL_premium_boostsList.users, false);
                                    a6Var22.f0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i112 = 0;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = 1;
                                        if (i12 >= size) {
                                            a6Var22.W = Math.max(0, tL_premium_boostsList.count - i112);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && a6Var22.W > 0) {
                                                z4 = true;
                                            }
                                            a6Var22.V = z4;
                                            a6Var22.i0 = tL_premium_boostsList.count;
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
                                a6 a6Var3 = a6Var2;
                                ArrayList arrayList2 = a6Var3.R;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    a6Var3.h0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z10 = false;
                                    MessagesController.getInstance(a6Var3.N).putUsers(tL_premium_boostsList2.users, false);
                                    a6Var3.e0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i15 = 0;
                                    int i16 = 0;
                                    while (true) {
                                        int i17 = 1;
                                        if (i16 >= size2) {
                                            a6Var3.U = Math.max(0, tL_premium_boostsList2.count - i15);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && a6Var3.U > 0) {
                                                z10 = true;
                                            }
                                            a6Var3.T = z10;
                                            a6Var3.j0 = tL_premium_boostsList2.count;
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
