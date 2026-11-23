package ki;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fi.w4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.ls;
import org.telegram.messenger.np;
import org.telegram.messenger.ur;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ak;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lk;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.mk;
import org.telegram.ui.Components.yz;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class x2 implements Runnable {
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

    public /* synthetic */ x2(hi.e eVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.w2 w2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, h6 h6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = eVar;
        this.d = tLObject;
        this.b = i7;
        this.f = j3;
        this.r = w2Var;
        this.s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.w = context;
        this.x = h6Var;
        this.y = user;
        this.c = tL_error;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0202, code lost:
    
        if (r3.getChildCount() > 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0208, code lost:
    
        r9.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.yp(r13, (org.telegram.ui.Components.yz) r2, r1, r11));
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
        org.telegram.ui.ActionBar.g2 T;
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
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                h6 h6Var = (h6) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((hi.e) obj6).setLoading(false);
                if (!(tLObject instanceof TL_payments.connectedStarRefBots)) {
                    if (tL_error != null) {
                        org.telegram.ui.Cells.c0.t(w2Var.F, h6Var, tL_error, false);
                        break;
                    }
                } else {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i11 = this.b;
                    di.e0 g10 = di.e0.g(i11);
                    long j10 = this.f;
                    di.b0 d = g10.d(j10);
                    int i12 = d.a;
                    np.u1(i12).f4(connectedstarrefbots.users, false);
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
                    ls.f(i12).k(ls.O3, Long.valueOf(d.b));
                    d.a();
                    w2Var.dismiss();
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
                    if ((j3 != j10 || z10) && (T = LaunchActivity.T()) != null && (!(T instanceof h3) || ((h3) T).S != j10)) {
                        T.presentFragment(new h3(j10));
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
                                    ls.f(e10.a).k(ls.N3, Long.valueOf(e10.b));
                                } else {
                                    i14++;
                                }
                            }
                        }
                        new lc(h3.K0(context, i11, connectedbotstarref, j10, h6Var).F, h6Var).V(Arrays.asList(user), hd.N0(2131754332, null), hd.N0(2131754333, null), null).j();
                        break;
                    }
                }
                break;
            default:
                lk lkVar = (lk) obj6;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = lkVar.Q;
                SparseArray sparseArray = lkVar.P;
                ArrayList arrayList8 = lkVar.N;
                HashMap hashMap = lkVar.R;
                ArrayList arrayList9 = lkVar.O;
                ArrayList arrayList10 = lkVar.M;
                mk mkVar = lkVar.Y;
                w4 w4Var = mkVar.M;
                if (this.b == lkVar.U) {
                    lkVar.T = false;
                    if (tL_error == null) {
                        ak akVar = mkVar.r;
                        w4Var.e(false, true);
                        m80 m80Var = w4Var.e;
                        xh.l lVar = w4Var.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        lkVar.H = messages_messages.next_rate;
                        int i15 = cVar.a;
                        ak akVar2 = akVar;
                        ur.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        np.u1(i15).f4(messages_messages.users, false);
                        np.u1(i15).Z3(messages_messages.chats, false);
                        if (!z10) {
                            arrayList9.clear();
                            sparseArray.clear();
                            arrayList7.clear();
                            hashMap.clear();
                        }
                        int i16 = messages_messages.count;
                        lkVar.L = str;
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
                        lkVar.W = arrayList9.size() >= i16;
                        if (arrayList9.isEmpty()) {
                            if (TextUtils.isEmpty(lkVar.L) && this.f == 0 && j3 == 0) {
                                lVar.setText(hd.N0(2131745605, null));
                                m80Var.setVisibility(0);
                                m80Var.setText(hd.N0(2131745610, null));
                            } else {
                                lVar.setText(hd.N0(2131745604, null));
                                m80Var.setVisibility(0);
                                m80Var.setText(hd.N0(2131745611, null));
                            }
                        }
                        if (!z10) {
                            arrayList10.clear();
                            if (arrayList5 != null) {
                                arrayList10.addAll(arrayList5);
                            }
                            if (str.length() >= 3 && (hd.N0(2131745705, null).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= arrayList10.size()) {
                                        arrayList10.add(0, k10.i(k10.t0).f());
                                    } else if (!(arrayList10.get(i18) instanceof TLRPC.User) || k10.i(k10.t0).f().id != ((TLRPC.User) arrayList10.get(i18)).id) {
                                        i18++;
                                    }
                                }
                            }
                            arrayList8.clear();
                            arrayList8.addAll(arrayList6);
                            lkVar.a0(arrayList10, arrayList8, TextUtils.isEmpty(lkVar.L));
                        }
                        int i19 = -1;
                        View view = null;
                        int i20 = 0;
                        while (i20 < size) {
                            ak akVar3 = akVar2;
                            View childAt = akVar3.getChildAt(i20);
                            if (childAt instanceof yz) {
                                i19 = RecyclerView.R(childAt);
                                view = childAt;
                            }
                            i20++;
                            akVar2 = akVar3;
                        }
                        ak akVar4 = akVar2;
                        if (view != null) {
                            akVar4.removeView(view);
                        }
                        if (mkVar.K.getVisibility() != 0) {
                            i7 = 1;
                            break;
                        } else {
                            i7 = 1;
                            break;
                        }
                    } else {
                        xh.l lVar2 = w4Var.d;
                        m80 m80Var2 = w4Var.e;
                        lVar2.setText(hd.N0(2131745604, null));
                        m80Var2.setVisibility(0);
                        m80Var2.setText(hd.N0(2131745611, null));
                        w4Var.e(false, true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ x2(lk lkVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = lkVar;
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
