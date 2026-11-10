package bi;

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
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.wq;
import org.telegram.ui.h10;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jb implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ jb(int i7, org.telegram.ui.ActionBar.w2 w2Var, org.telegram.ui.ActionBar.h6 h6Var, LinearLayout linearLayout, long[] jArr, ub ubVar) {
        this.b = i7;
        this.c = w2Var;
        this.d = h6Var;
        this.e = linearLayout;
        this.f = jArr;
        this.h = ubVar;
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
                fi.d dVar = (fi.d) obj5;
                TL_stars.StarsSubscription starsSubscription = (TL_stars.StarsSubscription) obj4;
                org.telegram.ui.ActionBar.w2[] w2VarArr = (org.telegram.ui.ActionBar.w2[]) obj3;
                TLObject tLObject = (TLObject) obj2;
                String str = (String) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_stars.TL_changeStarsSubscription tL_changeStarsSubscription = new TL_stars.TL_changeStarsSubscription();
                    tL_changeStarsSubscription.canceled = Boolean.FALSE;
                    tL_changeStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                    tL_changeStarsSubscription.subscription_id = starsSubscription.id;
                    int i12 = this.b;
                    ConnectionsManager.getInstance(i12).sendRequest(tL_changeStarsSubscription, new bg.k0(dVar, w2VarArr, i12, tLObject, str, 2));
                    break;
                }
                break;
            case 1:
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj5;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj4;
                LinearLayout linearLayout = (LinearLayout) obj3;
                long[] jArr = (long[]) obj2;
                ub ubVar = (ub) obj;
                n0 g10 = n0.g(i11);
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
                arrayList.add(0, p10.i(i11).f());
                k60 k60Var = new k60(w2Var.b, h6Var, linearLayout, false, false, true);
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
                    k60Var.g(tLObject2, j10 == jArr[0], new d3(jArr2, j10, ubVar, 11));
                    jArr = jArr2;
                }
                k60Var.t = false;
                k60Var.s = 0;
                k60Var.V(5);
                k60Var.a0(org.telegram.messenger.g0.L(24.0f), 0.0f);
                k60Var.Z();
                break;
            case 2:
                c5.k kVar = (c5.k) obj5;
                LinearLayout linearLayout2 = (LinearLayout) obj4;
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj3;
                HorizontalScrollView horizontalScrollView = (HorizontalScrollView) obj2;
                sh0 sh0Var = (sh0) obj;
                int currentItem = kVar.getCurrentItem();
                if (i11 != currentItem) {
                    sh0 sh0Var2 = (sh0) linearLayout2.getChildAt(currentItem);
                    atomicBoolean.set(true);
                    kVar.x(i11, true);
                    float scrollX = horizontalScrollView.getScrollX();
                    float x10 = sh0Var.getX() - ((horizontalScrollView.getWidth() - sh0Var.getWidth()) / 2.0f);
                    ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(150L);
                    duration.setInterpolator(wq.f);
                    duration.addUpdateListener(new org.telegram.ui.Cells.b(horizontalScrollView, scrollX, x10, sh0Var2, sh0Var));
                    duration.start();
                    break;
                }
                break;
            case 3:
                hb0 hb0Var = (hb0) obj3;
                h9.f1 f1Var = (h9.f1) obj2;
                c20 c20Var = (c20) obj;
                TL_account.TL_birthday tL_birthday = new TL_account.TL_birthday();
                tL_birthday.day = ((hb0) obj5).getValue();
                tL_birthday.month = ((hb0) obj4).getValue() + 1;
                if (hb0Var.getValue() != i11) {
                    tL_birthday.flags |= 1;
                    tL_birthday.year = hb0Var.getValue();
                }
                ((org.telegram.ui.ActionBar.w2) f1Var.b).x0.run();
                c20Var.a(tL_birthday);
                break;
            case 4:
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, (Context) obj3, (di.b) obj2);
                String M0 = org.telegram.messenger.id.M0(2131748798, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.id.M0(2131748799, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746024, null), new bg.f0((sq) obj4, (fi.d) obj5, (TL_phone.getGroupCallStreamRtmpUrl) obj, this.b, 3));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                alertDialog$Builder.d(-1);
                alertDialog$Builder.p();
                break;
            default:
                org.telegram.ui.ActionBar.h6 h6Var2 = (org.telegram.ui.ActionBar.h6) obj4;
                TL_wallet.walletTransaction[] wallettransactionArr = (TL_wallet.walletTransaction[]) obj2;
                Context context = (Context) obj;
                k60 F = k60.F(((org.telegram.ui.Wallet.y2[]) obj5)[0].c, h6Var2, (ImageView) obj3);
                if (!TextUtils.isEmpty(wallettransactionArr[0].tx_hash)) {
                    F.c(R.drawable.msg_search, org.telegram.messenger.id.M0(2131742963, null), new h10(context, i11, wallettransactionArr, 15), false);
                }
                F.c(R.drawable.wallet_help, org.telegram.messenger.id.M0(2131742961, null), new b(i10, context, h6Var2), false);
                F.a0(0.0f, -org.telegram.messenger.g0.L(48.0f));
                F.Z();
                break;
        }
    }

    public /* synthetic */ jb(c5.k kVar, int i7, LinearLayout linearLayout, AtomicBoolean atomicBoolean, HorizontalScrollView horizontalScrollView, sh0 sh0Var) {
        this.c = kVar;
        this.b = i7;
        this.d = linearLayout;
        this.e = atomicBoolean;
        this.f = horizontalScrollView;
        this.h = sh0Var;
    }

    public /* synthetic */ jb(fi.d dVar, TL_stars.StarsSubscription starsSubscription, int i7, org.telegram.ui.ActionBar.w2[] w2VarArr, TLObject tLObject, String str) {
        this.c = dVar;
        this.d = starsSubscription;
        this.b = i7;
        this.e = w2VarArr;
        this.f = tLObject;
        this.h = str;
    }

    public /* synthetic */ jb(sq sqVar, Context context, di.b bVar, fi.d dVar, TL_phone.getGroupCallStreamRtmpUrl getgroupcallstreamrtmpurl, int i7) {
        this.d = sqVar;
        this.e = context;
        this.f = bVar;
        this.c = dVar;
        this.h = getgroupcallstreamrtmpurl;
        this.b = i7;
    }

    public /* synthetic */ jb(hb0 hb0Var, hb0 hb0Var2, hb0 hb0Var3, int i7, h9.f1 f1Var, c20 c20Var) {
        this.c = hb0Var;
        this.d = hb0Var2;
        this.e = hb0Var3;
        this.b = i7;
        this.f = f1Var;
        this.h = c20Var;
    }

    public /* synthetic */ jb(org.telegram.ui.Wallet.y2[] y2VarArr, org.telegram.ui.ActionBar.h6 h6Var, ImageView imageView, TL_wallet.walletTransaction[] wallettransactionArr, Context context, int i7) {
        this.c = y2VarArr;
        this.d = h6Var;
        this.e = imageView;
        this.f = wallettransactionArr;
        this.h = context;
        this.b = i7;
    }
}
