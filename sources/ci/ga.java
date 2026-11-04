package ci;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.vh0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.rw;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ga implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ ga(int i3, org.telegram.ui.ActionBar.t2 t2Var, org.telegram.ui.ActionBar.e6 e6Var, LinearLayout linearLayout, long[] jArr, ai.p1 p1Var) {
        this.b = i3;
        this.c = t2Var;
        this.d = e6Var;
        this.e = linearLayout;
        this.f = jArr;
        this.h = p1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j10;
        int i3 = this.a;
        int i10 = 2;
        int i11 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i3) {
            case 0:
                gi.d dVar = (gi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.t2[] t2VarArr = (org.telegram.ui.ActionBar.t2[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.id;
                    int i12 = this.b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new cg.j0(dVar, t2VarArr, i12, tLObject, str, 2));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                ai.p1 p1Var = (ai.p1) obj;
                i0 g7 = i0.g(i11);
                g7.n();
                g7.o();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = g7.j;
                if (arrayList2 != null) {
                    arrayList.addAll(arrayList2);
                }
                ArrayList arrayList3 = g7.l;
                if (arrayList3 != null) {
                    arrayList.addAll(arrayList3);
                }
                arrayList.add(0, h10.i(i11).f());
                f60 f60Var = new f60(t2Var.b, e6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj6 = arrayList.get(i13);
                    i13++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j10 = ((TLRPC.User) tLObject2).id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (org.telegram.messenger.t3.V(chat)) {
                            j10 = -chat.id;
                        }
                    }
                    long j11 = j10;
                    long[] jArr2 = jArr;
                    f60Var.g(tLObject2, j11 == jArr[0], new ai.r1(jArr2, j11, p1Var, 12));
                    jArr = jArr2;
                }
                f60Var.t = false;
                f60Var.s = 0;
                f60Var.V(5);
                f60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                f60Var.Z();
                break;
            case 2:
                b5.l lVar = (b5.l) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                vh0 vh0Var = (vh0) obj;
                int currentItem = lVar.getCurrentItem();
                if (i11 != currentItem) {
                    vh0 vh0Var2 = (vh0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    lVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = vh0Var.getX() - ((horizontalScrollView.getWidth() - vh0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(xq.f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, vh0Var2, vh0Var));
                    duration.start();
                    break;
                }
                break;
            case 3:
                cb0 cb0Var = (cb0) obj3;
                hi.d dVar2 = (hi.d) obj2;
                u10 u10Var = (u10) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((cb0) obj5).getValue();
                tL_birthday.month = ((cb0) obj4).getValue() + 1;
                if (cb0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = cb0Var.getValue();
                }
                ((org.telegram.ui.ActionBar.t2) dVar2.b).y0.run();
                u10Var.a(tL_birthday);
                break;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, (ei.b) obj2);
                String M0 = bd.M0(2131748806, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.a;
                s1Var.S = M0;
                s1Var.U = bd.M0(2131748807, null);
                alertDialog$Builder.k(bd.M0(2131746034, null), new cg.e0((tq) obj4, (gi.d) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, 3));
                alertDialog$Builder.h(bd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                f60 F = f60.F(((org.telegram.ui.Wallet.y2[]) obj5)[0].c, e6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F.c(R.drawable.msg_search, bd.M0(2131742973, null), new rw(context, i11, wallettransactionArr, 16), false);
                }
                F.c(R.drawable.wallet_help, bd.M0(2131742971, null), new b(i10, context, e6Var2), false);
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                break;
        }
    }

    public /* synthetic */ ga(b5.l lVar, int i3, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, vh0 vh0Var) {
        this.c = lVar;
        this.b = i3;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = vh0Var;
    }

    public /* synthetic */ ga(gi.d dVar, TL_stars.StarsSubscription starsSubscription, int i3, org.telegram.ui.ActionBar.t2[] t2VarArr, TLObject tLObject, String str) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i3;
        this.e = t2VarArr;
        this.f = tLObject;
        this.h = str;
    }

    public /* synthetic */ ga(tq tqVar, Context context, ei.b bVar, gi.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i3) {
        this.d = tqVar;
        this.e = context;
        this.f = bVar;
        this.c = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.b = i3;
    }

    public /* synthetic */ ga(cb0 cb0Var, cb0 cb0Var2, cb0 cb0Var3, int i3, hi.d dVar, u10 u10Var) {
        this.c = cb0Var;
        this.d = cb0Var2;
        this.e = cb0Var3;
        this.b = i3;
        this.f = dVar;
        this.h = u10Var;
    }

    public /* synthetic */ ga(org.telegram.ui.Wallet.y2[] y2VarArr, org.telegram.ui.ActionBar.e6 e6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i3) {
        this.c = y2VarArr;
        this.d = e6Var;
        this.e = imageView;
        this.f = wallettransactionArr;
        this.h = context;
        this.b = i3;
    }
}
