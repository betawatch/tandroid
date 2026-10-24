package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c41;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.xr;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ob implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ob(int i10, org.telegram.ui.ActionBar.h3 h3Var, org.telegram.ui.ActionBar.g6 g6Var, LinearLayout linearLayout, long[] jArr, vb vbVar) {
        this.b = i10;
        this.c = h3Var;
        this.d = g6Var;
        this.e = linearLayout;
        this.f = jArr;
        this.h = vbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j10;
        Runnable runnable;
        int i10 = this.a;
        int i11 = 2;
        int i12 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i10) {
            case 0:
                ei.d dVar = (ei.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.h3[] h3VarArr = (org.telegram.ui.ActionBar.h3[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.id;
                    int i13 = this.b;
                    ConnectionsManager.getInstance(i13).sendRequest(tL_changeStarsSubscription, new tb(dVar, h3VarArr, i13, tLObject, str, 0));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) obj5;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                vb vbVar = (vb) obj;
                k0 g10 = k0.g(i12);
                g10.n();
                g10.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g10.j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g10.l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, UserConfig.getInstance(i12).getCurrentUser());
                j80 F = j80.F(h3Var.getContainerView(), g6Var, linearLayout);
                int size = arrayList.size();
                int i14 = 0;
                while (i14 < size) {
                    Object obj6 = arrayList.get(i14);
                    i14++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (ChatObject.isChannelAndNotMegaGroup(chat)) {
                            j10 = -chat.id;
                        }
                    }
                    long j11 = j10;
                    F.g(tLObject2, j11 == jArr[0], new a3.i0(jArr, j11, vbVar, 11));
                }
                F.t = false;
                F.s = 0;
                F.V(5);
                F.a0(AndroidUtilities.dp(24.0f), 0.0f);
                F.Z();
                break;
            case 2:
                z4.h hVar = (z4.h) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                rk0 rk0Var = (rk0) obj;
                int currentItem = hVar.getCurrentItem();
                if (i12 != currentItem) {
                    rk0 rk0Var2 = (rk0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    hVar.x(i12, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = rk0Var.getX() - ((horizontalScrollView.getWidth() - rk0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(bs.f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, rk0Var2, rk0Var));
                    duration.start();
                    break;
                }
                break;
            case 3:
                qd0 qd0Var = (qd0) obj3;
                org.telegram.ui.ActionBar.b3 b3Var = (org.telegram.ui.ActionBar.b3) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((qd0) obj5).getValue();
                tL_birthday.month = ((qd0) obj4).getValue() + 1;
                if (qd0Var.getValue() != i12) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = qd0Var.getValue();
                }
                runnable = b3Var.a.dismissRunnable;
                runnable.run();
                callback.run(tL_birthday);
                break;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) obj3, 0, (ci.b) obj2);
                String string = LocaleController.getString(R.string.LiveStoryRTMPRevokeTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.a;
                c2Var.R = string;
                c2Var.T = LocaleController.getString(R.string.LiveStoryRTMPRevokeText);
                alertDialog$Builder.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.fa((xr) obj4, (ei.d) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, 2));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.g6 g6Var2 = (org.telegram.ui.ActionBar.g6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                j80 F2 = j80.F(((org.telegram.ui.Wallet.j2[]) obj5)[0].getContainer(), g6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F2.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new c41(context, i12, wallettransactionArr, 18), false);
                }
                F2.c(R.drawable.wallet_help, LocaleController.getString(R.string.WalletWhatIsGram), new b(context, i11, g6Var2), false);
                F2.a0(0.0f, -AndroidUtilities.dp(48.0f));
                F2.Z();
                break;
        }
    }

    public /* synthetic */ ob(ei.d dVar, TL_stars.StarsSubscription starsSubscription, int i10, org.telegram.ui.ActionBar.h3[] h3VarArr, TLObject tLObject, String str) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i10;
        this.e = h3VarArr;
        this.f = tLObject;
        this.h = str;
    }

    public /* synthetic */ ob(xr xrVar, Context context, ci.b bVar, ei.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i10) {
        this.d = xrVar;
        this.e = context;
        this.f = bVar;
        this.c = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.b = i10;
    }

    public /* synthetic */ ob(qd0 qd0Var, qd0 qd0Var2, qd0 qd0Var3, int i10, org.telegram.ui.ActionBar.b3 b3Var, Utilities.Callback callback) {
        this.c = qd0Var;
        this.d = qd0Var2;
        this.e = qd0Var3;
        this.b = i10;
        this.f = b3Var;
        this.h = callback;
    }

    public /* synthetic */ ob(z4.h hVar, int i10, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, rk0 rk0Var) {
        this.c = hVar;
        this.b = i10;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = rk0Var;
    }

    public /* synthetic */ ob(org.telegram.ui.Wallet.j2[] j2VarArr, org.telegram.ui.ActionBar.g6 g6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i10) {
        this.c = j2VarArr;
        this.d = g6Var;
        this.e = imageView;
        this.f = wallettransactionArr;
        this.h = context;
        this.b = i10;
    }
}
