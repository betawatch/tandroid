package ki;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fi.x4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.vr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ck;
import org.telegram.ui.Components.dk;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.rj;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final /* synthetic */ class d3 implements Runnable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ d3(hi.d dVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.u2 u2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, e6 e6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = dVar;
        this.d = tLObject;
        this.b = i7;
        this.f = j3;
        this.r = u2Var;
        this.s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.w = context;
        this.x = e6Var;
        this.y = user;
        this.c = tL_error;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0202, code lost:
    
        if (r3.getChildCount() > 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0208, code lost:
    
        r9.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.xp(r13, (org.telegram.ui.Components.pz) r2, r1, r11));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0216, code lost:
    
        r13.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0206, code lost:
    
        if (r2 != null) goto L74;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TL_payments.connectedBotStarRef connectedbotstarref;
        org.telegram.ui.ActionBar.e2 T;
        int i7;
        ArrayList arrayList;
        int i10 = this.a;
        Object obj = this.y;
        Object obj2 = this.x;
        long j3 = this.h;
        Object obj3 = this.w;
        Object obj4 = this.s;
        boolean z10 = this.e;
        Object obj5 = this.r;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        Object obj6 = this.n;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                e6 e6Var = (e6) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((hi.d) obj6).setLoading(false);
                if (!(tLObject instanceof TL_payments.connectedStarRefBots)) {
                    if (tL_error != null) {
                        org.telegram.ui.Cells.y0.q(u2Var.F, e6Var, tL_error, false);
                        break;
                    }
                } else {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i11 = this.b;
                    di.e0 g10 = di.e0.g(i11);
                    long j10 = this.f;
                    di.b0 d = g10.d(j10);
                    int i12 = d.a;
                    np.s1(i12).Y3(connectedstarrefbots.users, false);
                    d.c = 0;
                    d.h = false;
                    d.d = false;
                    ArrayList arrayList2 = d.e;
                    arrayList2.clear();
                    if (d.i != 0) {
                        ConnectionsManager.getInstance(i12).cancelRequest(d.i, true);
                        d.i = 0;
                    }
                    d.g = false;
                    d.c = connectedstarrefbots.count;
                    arrayList2.addAll(connectedstarrefbots.connected_bots);
                    d.d = connectedstarrefbots.connected_bots.isEmpty() || arrayList2.size() >= d.c;
                    d.h = false;
                    ns.f(i12).k(ns.L3, Long.valueOf(d.b));
                    d.a();
                    u2Var.dismiss();
                    int i13 = 0;
                    while (true) {
                        if (i13 < connectedstarrefbots.connected_bots.size()) {
                            connectedbotstarref = connectedstarrefbots.connected_bots.get(i13);
                            if (connectedbotstarref.bot_id != starrefprogram.bot_id) {
                                i13++;
                            }
                        } else {
                            connectedbotstarref = null;
                        }
                    }
                    if ((j3 != j10 || z10) && (T = LaunchActivity.T()) != null && (!(T instanceof n3) || ((n3) T).S != j10)) {
                        T.presentFragment(new n3(j10));
                    }
                    if (connectedbotstarref != null) {
                        di.c0 e10 = di.e0.g(i11).e(j10);
                        long j11 = connectedbotstarref.bot_id;
                        ArrayList arrayList3 = e10.e;
                        int i14 = 0;
                        while (true) {
                            if (i14 < arrayList3.size()) {
                                if (((TL_payments.starRefProgram) arrayList3.get(i14)).bot_id == j11) {
                                    arrayList3.remove(i14);
                                    e10.c--;
                                    ns.f(e10.a).k(ns.K3, Long.valueOf(e10.b));
                                } else {
                                    i14++;
                                }
                            }
                        }
                        new cc(n3.K0(context, i11, connectedbotstarref, j10, e6Var).F, e6Var).V(Arrays.asList(user), hd.M0(2131754335, null), hd.M0(2131754336, null), null).j();
                        break;
                    }
                }
                break;
            default:
                ck ckVar = (ck) obj6;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = ckVar.Q;
                SparseArray sparseArray = ckVar.P;
                ArrayList arrayList8 = ckVar.N;
                HashMap hashMap = ckVar.R;
                ArrayList arrayList9 = ckVar.O;
                ArrayList arrayList10 = ckVar.M;
                dk dkVar = ckVar.Y;
                x4 x4Var = dkVar.M;
                if (this.b == ckVar.U) {
                    ckVar.T = false;
                    if (tL_error == null) {
                        rj rjVar = dkVar.r;
                        x4Var.e(false, true);
                        z70 z70Var = x4Var.e;
                        xh.l lVar = x4Var.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        ckVar.H = messages_messages.next_rate;
                        int i15 = cVar.a;
                        rj rjVar2 = rjVar;
                        vr.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        np.s1(i15).Y3(messages_messages.users, false);
                        np.s1(i15).S3(messages_messages.chats, false);
                        if (!z10) {
                            arrayList9.clear();
                            sparseArray.clear();
                            arrayList7.clear();
                            hashMap.clear();
                        }
                        int i16 = messages_messages.count;
                        ckVar.L = str;
                        int size = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size) {
                            gj gjVar = (gj) arrayList4.get(i17);
                            String str2 = gjVar.Y;
                            ArrayList arrayList11 = (ArrayList) hashMap.get(str2);
                            ArrayList arrayList12 = arrayList4;
                            if (arrayList11 == null) {
                                arrayList = new ArrayList();
                                hashMap.put(str2, arrayList);
                                arrayList7.add(str2);
                            } else {
                                arrayList = arrayList11;
                            }
                            arrayList.add(gjVar);
                            arrayList9.add(gjVar);
                            sparseArray.put(gjVar.e1(), gjVar);
                            i17++;
                            arrayList4 = arrayList12;
                        }
                        if (arrayList9.size() > i16) {
                            i16 = arrayList9.size();
                        }
                        ckVar.W = arrayList9.size() >= i16;
                        if (arrayList9.isEmpty()) {
                            if (TextUtils.isEmpty(ckVar.L) && this.f == 0 && j3 == 0) {
                                lVar.setText(hd.M0(2131745801, null));
                                z70Var.setVisibility(0);
                                z70Var.setText(hd.M0(2131745806, null));
                            } else {
                                lVar.setText(hd.M0(2131745800, null));
                                z70Var.setVisibility(0);
                                z70Var.setText(hd.M0(2131745807, null));
                            }
                        }
                        if (!z10) {
                            arrayList10.clear();
                            if (arrayList5 != null) {
                                arrayList10.addAll(arrayList5);
                            }
                            if (str.length() >= 3 && (hd.M0(2131745901, null).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= arrayList10.size()) {
                                        arrayList10.add(0, m10.i(m10.t0).f());
                                    } else if (!(arrayList10.get(i18) instanceof TLRPC.User) || m10.i(m10.t0).f().id != ((TLRPC.User) arrayList10.get(i18)).id) {
                                        i18++;
                                    }
                                }
                            }
                            arrayList8.clear();
                            arrayList8.addAll(arrayList6);
                            ckVar.a0(arrayList10, arrayList8, TextUtils.isEmpty(ckVar.L));
                        }
                        int i19 = -1;
                        View view = null;
                        int i20 = 0;
                        while (i20 < size) {
                            rj rjVar3 = rjVar2;
                            View childAt = rjVar3.getChildAt(i20);
                            if (childAt instanceof pz) {
                                i19 = RecyclerView.R(childAt);
                                view = childAt;
                            }
                            i20++;
                            rjVar2 = rjVar3;
                        }
                        rj rjVar4 = rjVar2;
                        if (view != null) {
                            rjVar4.removeView(view);
                        }
                        if (dkVar.K.getVisibility() != 0) {
                            i7 = 1;
                            break;
                        } else {
                            i7 = 1;
                            break;
                        }
                    } else {
                        xh.l lVar2 = x4Var.d;
                        z70 z70Var2 = x4Var.e;
                        lVar2.setText(hd.M0(2131745800, null));
                        z70Var2.setVisibility(0);
                        z70Var2.setText(hd.M0(2131745807, null));
                        x4Var.e(false, true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ d3(ck ckVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = ckVar;
        this.b = i7;
        this.c = tL_error;
        this.d = tLObject;
        this.r = cVar;
        this.e = z10;
        this.s = str;
        this.w = arrayList;
        this.f = j3;
        this.h = j10;
        this.x = arrayList2;
        this.y = arrayList3;
    }
}
