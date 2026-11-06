package hi;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import di.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.yr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.kj;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.uj;
import org.telegram.ui.Components.vj;
import org.telegram.ui.Components.w70;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final /* synthetic */ class g3 implements Runnable {
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

    public /* synthetic */ g3(fi.d dVar, TLObject tLObject, int i7, long j3, org.telegram.ui.ActionBar.v2 v2Var, TL_payments.starRefProgram starrefprogram, long j10, boolean z9, Context context, f6 f6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = dVar;
        this.d = tLObject;
        this.b = i7;
        this.f = j3;
        this.r = v2Var;
        this.s = starrefprogram;
        this.h = j10;
        this.e = z9;
        this.w = context;
        this.x = f6Var;
        this.y = user;
        this.c = tL_error;
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x0202, code lost:
    
        if (r3.getChildCount() > 1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0208, code lost:
    
        r9.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.vp(r13, (org.telegram.ui.Components.lz) r2, r1, r11));
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
        org.telegram.ui.ActionBar.f2 T;
        int i7;
        ArrayList arrayList;
        int i10 = this.a;
        Object obj = this.y;
        Object obj2 = this.x;
        long j3 = this.h;
        Object obj3 = this.w;
        Object obj4 = this.s;
        boolean z9 = this.e;
        Object obj5 = this.r;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        Object obj6 = this.n;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                f6 f6Var = (f6) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((fi.d) obj6).setLoading(false);
                if (!(tLObject instanceof TL_payments.connectedStarRefBots)) {
                    if (tL_error != null) {
                        org.telegram.ui.Cells.f1.r(v2Var.E, f6Var, tL_error, false);
                        break;
                    }
                } else {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i11 = this.b;
                    bi.n0 g10 = bi.n0.g(i11);
                    long j10 = this.f;
                    bi.k0 d = g10.d(j10);
                    int i12 = d.a;
                    qp.s1(i12).Y3(connectedstarrefbots.users, false);
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
                    qs.f(i12).k(qs.L3, Long.valueOf(d.b));
                    d.a();
                    v2Var.dismiss();
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
                    if ((j3 != j10 || z9) && (T = LaunchActivity.T()) != null && (!(T instanceof q3) || ((q3) T).R != j10)) {
                        T.presentFragment(new q3(j10));
                    }
                    if (connectedbotstarref != null) {
                        bi.l0 e10 = bi.n0.g(i11).e(j10);
                        long j11 = connectedbotstarref.bot_id;
                        ArrayList arrayList3 = e10.e;
                        int i14 = 0;
                        while (true) {
                            if (i14 < arrayList3.size()) {
                                if (((TL_payments.starRefProgram) arrayList3.get(i14)).bot_id == j11) {
                                    arrayList3.remove(i14);
                                    e10.c--;
                                    qs.f(e10.a).k(qs.K3, Long.valueOf(e10.b));
                                } else {
                                    i14++;
                                }
                            }
                        }
                        new hc(q3.K0(context, i11, connectedbotstarref, j10, f6Var).E, f6Var).V(Arrays.asList(user), hd.M0(2131754335, null), hd.M0(2131754336, null), null).j();
                        break;
                    }
                }
                break;
            default:
                uj ujVar = (uj) obj6;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = ujVar.P;
                SparseArray sparseArray = ujVar.O;
                ArrayList arrayList8 = ujVar.M;
                HashMap hashMap = ujVar.Q;
                ArrayList arrayList9 = ujVar.N;
                ArrayList arrayList10 = ujVar.L;
                vj vjVar = ujVar.X;
                f5 f5Var = vjVar.L;
                if (this.b == ujVar.T) {
                    ujVar.S = false;
                    if (tL_error == null) {
                        kj kjVar = vjVar.r;
                        f5Var.e(false, true);
                        w70 w70Var = f5Var.e;
                        xh.l lVar = f5Var.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        ujVar.G = messages_messages.next_rate;
                        int i15 = cVar.a;
                        kj kjVar2 = kjVar;
                        yr.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        qp.s1(i15).Y3(messages_messages.users, false);
                        qp.s1(i15).S3(messages_messages.chats, false);
                        if (!z9) {
                            arrayList9.clear();
                            sparseArray.clear();
                            arrayList7.clear();
                            hashMap.clear();
                        }
                        int i16 = messages_messages.count;
                        ujVar.K = str;
                        int size = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size) {
                            ij ijVar = (ij) arrayList4.get(i17);
                            String str2 = ijVar.Y;
                            ArrayList arrayList11 = (ArrayList) hashMap.get(str2);
                            ArrayList arrayList12 = arrayList4;
                            if (arrayList11 == null) {
                                arrayList = new ArrayList();
                                hashMap.put(str2, arrayList);
                                arrayList7.add(str2);
                            } else {
                                arrayList = arrayList11;
                            }
                            arrayList.add(ijVar);
                            arrayList9.add(ijVar);
                            sparseArray.put(ijVar.f1(), ijVar);
                            i17++;
                            arrayList4 = arrayList12;
                        }
                        if (arrayList9.size() > i16) {
                            i16 = arrayList9.size();
                        }
                        ujVar.V = arrayList9.size() >= i16;
                        if (arrayList9.isEmpty()) {
                            if (TextUtils.isEmpty(ujVar.K) && this.f == 0 && j3 == 0) {
                                lVar.setText(hd.M0(2131745802, null));
                                w70Var.setVisibility(0);
                                w70Var.setText(hd.M0(2131745807, null));
                            } else {
                                lVar.setText(hd.M0(2131745801, null));
                                w70Var.setVisibility(0);
                                w70Var.setText(hd.M0(2131745808, null));
                            }
                        }
                        if (!z9) {
                            arrayList10.clear();
                            if (arrayList5 != null) {
                                arrayList10.addAll(arrayList5);
                            }
                            if (str.length() >= 3 && (hd.M0(2131745902, null).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= arrayList10.size()) {
                                        arrayList10.add(0, p10.i(p10.s0).f());
                                    } else if (!(arrayList10.get(i18) instanceof TLRPC.User) || p10.i(p10.s0).f().id != ((TLRPC.User) arrayList10.get(i18)).id) {
                                        i18++;
                                    }
                                }
                            }
                            arrayList8.clear();
                            arrayList8.addAll(arrayList6);
                            ujVar.a0(arrayList10, arrayList8, TextUtils.isEmpty(ujVar.K));
                        }
                        int i19 = -1;
                        View view = null;
                        int i20 = 0;
                        while (i20 < size) {
                            kj kjVar3 = kjVar2;
                            View childAt = kjVar3.getChildAt(i20);
                            if (childAt instanceof lz) {
                                i19 = RecyclerView.R(childAt);
                                view = childAt;
                            }
                            i20++;
                            kjVar2 = kjVar3;
                        }
                        kj kjVar4 = kjVar2;
                        if (view != null) {
                            kjVar4.removeView(view);
                        }
                        if (vjVar.J.getVisibility() != 0) {
                            i7 = 1;
                            break;
                        } else {
                            i7 = 1;
                            break;
                        }
                    } else {
                        xh.l lVar2 = f5Var.d;
                        w70 w70Var2 = f5Var.e;
                        lVar2.setText(hd.M0(2131745801, null));
                        w70Var2.setVisibility(0);
                        w70Var2.setText(hd.M0(2131745808, null));
                        f5Var.e(false, true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g3(uj ujVar, int i7, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z9, String str, ArrayList arrayList, long j3, long j10, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = ujVar;
        this.b = i7;
        this.c = tL_error;
        this.d = tLObject;
        this.r = cVar;
        this.e = z9;
        this.s = str;
        this.w = arrayList;
        this.f = j3;
        this.h = j10;
        this.x = arrayList2;
        this.y = arrayList3;
    }
}
