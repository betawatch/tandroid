package ki;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import fi.v4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.tr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.jk;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.kk;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.wz;
import org.telegram.ui.Components.yj;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final /* synthetic */ class y2 implements Runnable {
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

    public /* synthetic */ y2(hi.d dVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.x2 x2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z10, Context context, i6 i6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = dVar;
        this.d = tLObject;
        this.b = i7;
        this.f = j3;
        this.r = x2Var;
        this.s = starrefprogram;
        this.h = j10;
        this.e = z10;
        this.w = context;
        this.x = i6Var;
        this.y = user;
        this.c = tL_error;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0202, code lost:
    
        if (r3.getChildCount() > 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0208, code lost:
    
        r9.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.yp(r13, (org.telegram.ui.Components.wz) r2, r1, r11));
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
        org.telegram.ui.ActionBar.h2 T;
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
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                i6 i6Var = (i6) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((hi.d) obj6).setLoading(false);
                if (!(tLObject instanceof TL_payments.connectedStarRefBots)) {
                    if (tL_error != null) {
                        org.telegram.ui.Cells.c0.t(x2Var.F, i6Var, tL_error, false);
                        break;
                    }
                } else {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i11 = this.b;
                    di.e0 g10 = di.e0.g(i11);
                    long j10 = this.f;
                    di.b0 d = g10.d(j10);
                    int i12 = d.a;
                    mp.u1(i12).f4(connectedstarrefbots.users, false);
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
                    ks.f(i12).k(ks.N3, Long.valueOf(d.b));
                    d.a();
                    x2Var.dismiss();
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
                    if ((j3 != j10 || z10) && (T = LaunchActivity.T()) != null && (!(T instanceof i3) || ((i3) T).S != j10)) {
                        T.presentFragment(new i3(j10));
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
                                    ks.f(e10.a).k(ks.M3, Long.valueOf(e10.b));
                                } else {
                                    i14++;
                                }
                            }
                        }
                        new lc(i3.K0(context, i11, connectedbotstarref, j10, i6Var).F, i6Var).V(Arrays.asList(user), gd.M0(2131754333, null), gd.M0(2131754334, null), null).j();
                        break;
                    }
                }
                break;
            default:
                jk jkVar = (jk) obj6;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = jkVar.Q;
                SparseArray sparseArray = jkVar.P;
                ArrayList arrayList8 = jkVar.N;
                HashMap hashMap = jkVar.R;
                ArrayList arrayList9 = jkVar.O;
                ArrayList arrayList10 = jkVar.M;
                kk kkVar = jkVar.Y;
                v4 v4Var = kkVar.M;
                if (this.b == jkVar.U) {
                    jkVar.T = false;
                    if (tL_error == null) {
                        yj yjVar = kkVar.r;
                        v4Var.e(false, true);
                        k80 k80Var = v4Var.e;
                        xh.l lVar = v4Var.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        jkVar.H = messages_messages.next_rate;
                        int i15 = cVar.a;
                        yj yjVar2 = yjVar;
                        tr.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        mp.u1(i15).f4(messages_messages.users, false);
                        mp.u1(i15).Z3(messages_messages.chats, false);
                        if (!z10) {
                            arrayList9.clear();
                            sparseArray.clear();
                            arrayList7.clear();
                            hashMap.clear();
                        }
                        int i16 = messages_messages.count;
                        jkVar.L = str;
                        int size = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size) {
                            fj fjVar = (fj) arrayList4.get(i17);
                            String str2 = fjVar.Y;
                            ArrayList arrayList11 = (ArrayList) hashMap.get(str2);
                            ArrayList arrayList12 = arrayList4;
                            if (arrayList11 == null) {
                                arrayList = new ArrayList();
                                hashMap.put(str2, arrayList);
                                arrayList7.add(str2);
                            } else {
                                arrayList = arrayList11;
                            }
                            arrayList.add(fjVar);
                            arrayList9.add(fjVar);
                            sparseArray.put(fjVar.e1(), fjVar);
                            i17++;
                            arrayList4 = arrayList12;
                        }
                        if (arrayList9.size() > i16) {
                            i16 = arrayList9.size();
                        }
                        jkVar.W = arrayList9.size() >= i16;
                        if (arrayList9.isEmpty()) {
                            if (TextUtils.isEmpty(jkVar.L) && this.f == 0 && j3 == 0) {
                                lVar.setText(gd.M0(2131745606, null));
                                k80Var.setVisibility(0);
                                k80Var.setText(gd.M0(2131745611, null));
                            } else {
                                lVar.setText(gd.M0(2131745605, null));
                                k80Var.setVisibility(0);
                                k80Var.setText(gd.M0(2131745612, null));
                            }
                        }
                        if (!z10) {
                            arrayList10.clear();
                            if (arrayList5 != null) {
                                arrayList10.addAll(arrayList5);
                            }
                            if (str.length() >= 3 && (gd.M0(2131745706, null).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= arrayList10.size()) {
                                        arrayList10.add(0, j10.i(j10.t0).f());
                                    } else if (!(arrayList10.get(i18) instanceof TLRPC.User) || j10.i(j10.t0).f().id != ((TLRPC.User) arrayList10.get(i18)).id) {
                                        i18++;
                                    }
                                }
                            }
                            arrayList8.clear();
                            arrayList8.addAll(arrayList6);
                            jkVar.a0(arrayList10, arrayList8, TextUtils.isEmpty(jkVar.L));
                        }
                        int i19 = -1;
                        View view = null;
                        int i20 = 0;
                        while (i20 < size) {
                            yj yjVar3 = yjVar2;
                            View childAt = yjVar3.getChildAt(i20);
                            if (childAt instanceof wz) {
                                i19 = RecyclerView.R(childAt);
                                view = childAt;
                            }
                            i20++;
                            yjVar2 = yjVar3;
                        }
                        yj yjVar4 = yjVar2;
                        if (view != null) {
                            yjVar4.removeView(view);
                        }
                        if (kkVar.K.getVisibility() != 0) {
                            i7 = 1;
                            break;
                        } else {
                            i7 = 1;
                            break;
                        }
                    } else {
                        xh.l lVar2 = v4Var.d;
                        k80 k80Var2 = v4Var.e;
                        lVar2.setText(gd.M0(2131745605, null));
                        k80Var2.setVisibility(0);
                        k80Var2.setText(gd.M0(2131745612, null));
                        v4Var.e(false, true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ y2(jk jkVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = jkVar;
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
