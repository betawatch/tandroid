package di;

import android.animation.ValueAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.ou;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ar;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.u11;
import org.telegram.ui.Components.wh0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class v9 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ v9(int i7, org.telegram.ui.ActionBar.u2 u2Var, org.telegram.ui.ActionBar.e6 e6Var, LinearLayout linearLayout, long[] jArr, ai.g1 g1Var) {
        this.b = i7;
        this.c = u2Var;
        this.d = e6Var;
        this.e = linearLayout;
        this.f = jArr;
        this.h = g1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        long j3;
        int i7 = this.a;
        int i10 = 2;
        int i11 = this.b;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i7) {
            case 0:
                hi.d dVar = (hi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.u2[] u2VarArr = (org.telegram.ui.ActionBar.u2[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.id;
                    int i12 = this.b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new bg.k0(dVar, u2VarArr, i12, tLObject, str, 2));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj5;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                ai.g1 g1Var = (ai.g1) obj;
                e0 g10 = e0.g(i11);
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
                arrayList.add(0, m10.i(i11).f());
                m60 m60Var = new m60(u2Var.b, e6Var, linearLayout, false, false, true);
                int size = arrayList.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj6 = arrayList.get(i13);
                    i13++;
                    TLObject tLObject2 = (TLObject) obj6;
                    if (tLObject2 instanceof TLRPC.User) {
                        j3 = ((TLRPC.User) tLObject2).id;
                    } else if (tLObject2 instanceof TLRPC.Chat) {
                        TLRPC.Chat chat = (TLRPC.Chat) tLObject2;
                        if (org.telegram.messenger.t3.V(chat)) {
                            j3 = -chat.id;
                        }
                    }
                    long j10 = j3;
                    long[] jArr2 = jArr;
                    m60Var.g(tLObject2, j10 == jArr[0], new bi.m1(jArr2, j10, g1Var, 12));
                    jArr = jArr2;
                }
                m60Var.t = false;
                m60Var.s = 0;
                m60Var.V(5);
                m60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                m60Var.Z();
                break;
            case 2:
                c5.l lVar = (c5.l) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                wh0 wh0Var = (wh0) obj;
                int currentItem = lVar.getCurrentItem();
                if (i11 != currentItem) {
                    wh0 wh0Var2 = (wh0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    lVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = wh0Var.getX() - ((horizontalScrollView.getWidth() - wh0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(er.f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, wh0Var2, wh0Var));
                    duration.start();
                    break;
                }
                break;
            case 3:
                ib0 ib0Var = (ib0) obj3;
                ou ouVar = (ou) obj2;
                z10 z10Var = (z10) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((ib0) obj5).getValue();
                tL_birthday.month = ((ib0) obj4).getValue() + 1;
                if (ib0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = ib0Var.getValue();
                }
                ((org.telegram.ui.ActionBar.u2) ouVar.b).y0.run();
                z10Var.a(tL_birthday);
                break;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, (fi.b) obj2);
                String M0 = hd.M0(2131748798, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
                t1Var.S = M0;
                t1Var.U = hd.M0(2131748799, null);
                alertDialog$Builder.k(hd.M0(2131746024, null), new bg.f0((ar) obj4, (hi.d) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, 3));
                alertDialog$Builder.h(hd.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                m60 F = m60.F(((org.telegram.ui.Wallet.x2[]) obj5)[0].c, e6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F.c(R.drawable.msg_search, hd.M0(2131742963, null), new u11(context, i11, wallettransactionArr, 18), false);
                }
                F.c(R.drawable.wallet_help, hd.M0(2131742961, null), new a(i10, context, e6Var2), false);
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                break;
        }
    }

    public /* synthetic */ v9(c5.l lVar, int i7, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, wh0 wh0Var) {
        this.c = lVar;
        this.b = i7;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = wh0Var;
    }

    public /* synthetic */ v9(hi.d dVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.u2[] u2VarArr, TLObject tLObject, String str) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i7;
        this.e = u2VarArr;
        this.f = tLObject;
        this.h = str;
    }

    public /* synthetic */ v9(ar arVar, Context context, fi.b bVar, hi.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i7) {
        this.d = arVar;
        this.e = context;
        this.f = bVar;
        this.c = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.b = i7;
    }

    public /* synthetic */ v9(ib0 ib0Var, ib0 ib0Var2, ib0 ib0Var3, int i7, ou ouVar, z10 z10Var) {
        this.c = ib0Var;
        this.d = ib0Var2;
        this.e = ib0Var3;
        this.b = i7;
        this.f = ouVar;
        this.h = z10Var;
    }

    public /* synthetic */ v9(org.telegram.ui.Wallet.x2[] x2VarArr, org.telegram.ui.ActionBar.e6 e6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i7) {
        this.c = x2VarArr;
        this.d = e6Var;
        this.e = imageView;
        this.f = wallettransactionArr;
        this.h = context;
        this.b = i7;
    }
}
