package ii;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ei.f5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.qr;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jj;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.tj;
import org.telegram.ui.Components.uj;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
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

    public /* synthetic */ g3(gi.d dVar, TLObject tLObject, int i3, long j10, org.telegram.ui.ActionBar.t2 t2Var, TL_payments.starRefProgram starrefprogram, long j11, boolean z10, Context context, e6 e6Var, TLRPC.User user, TLRPC.TL_error tL_error) {
        this.n = dVar;
        this.d = tLObject;
        this.b = i3;
        this.f = j10;
        this.r = t2Var;
        this.s = starrefprogram;
        this.h = j11;
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
    
        r9.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.tp(r13, (org.telegram.ui.Components.iz) r2, r1, r11));
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
        org.telegram.ui.ActionBar.d2 T;
        int i3;
        ArrayList arrayList;
        int i10 = this.a;
        Object obj = this.y;
        Object obj2 = this.x;
        long j10 = this.h;
        Object obj3 = this.w;
        Object obj4 = this.s;
        boolean z10 = this.e;
        Object obj5 = this.r;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        Object obj6 = this.n;
        switch (i10) {
            case 0:
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj5;
                TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj4;
                Context context = (Context) obj3;
                e6 e6Var = (e6) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                ((gi.d) obj6).setLoading(false);
                if (!(tLObject instanceof TL_payments.connectedStarRefBots)) {
                    if (tL_error != null) {
                        org.telegram.ui.Cells.f1.v(t2Var.F, e6Var, tL_error, false);
                        break;
                    }
                } else {
                    TL_payments.connectedStarRefBots connectedstarrefbots = (TL_payments.connectedStarRefBots) tLObject;
                    int i11 = this.b;
                    ci.i0 g7 = ci.i0.g(i11);
                    long j11 = this.f;
                    ci.f0 d = g7.d(j11);
                    int i12 = d.a;
                    hp.s1(i12).Y3(connectedstarrefbots.users, false);
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
                    hs.f(i12).k(hs.L3, Long.valueOf(d.b));
                    d.a();
                    t2Var.dismiss();
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
                    if ((j10 != j11 || z10) && (T = LaunchActivity.T()) != null && (!(T instanceof q3) || ((q3) T).S != j11)) {
                        T.presentFragment(new q3(j11));
                    }
                    if (connectedbotstarref != null) {
                        ci.g0 e10 = ci.i0.g(i11).e(j11);
                        long j12 = connectedbotstarref.bot_id;
                        ArrayList arrayList3 = e10.e;
                        int i14 = 0;
                        while (true) {
                            if (i14 < arrayList3.size()) {
                                if (((TL_payments.starRefProgram) arrayList3.get(i14)).bot_id == j12) {
                                    arrayList3.remove(i14);
                                    e10.c--;
                                    hs.f(e10.a).k(hs.K3, Long.valueOf(e10.b));
                                } else {
                                    i14++;
                                }
                            }
                        }
                        new fc(q3.K0(context, i11, connectedbotstarref, j11, e6Var).F, e6Var).V(Arrays.asList(user), bd.M0(2131754335, null), bd.M0(2131754336, null), null).j();
                        break;
                    }
                }
                break;
            default:
                tj tjVar = (tj) obj6;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj5;
                String str = (String) obj4;
                ArrayList arrayList4 = (ArrayList) obj3;
                ArrayList arrayList5 = (ArrayList) obj2;
                ArrayList arrayList6 = (ArrayList) obj;
                ArrayList arrayList7 = tjVar.Q;
                SparseArray sparseArray = tjVar.P;
                ArrayList arrayList8 = tjVar.N;
                HashMap hashMap = tjVar.R;
                ArrayList arrayList9 = tjVar.O;
                ArrayList arrayList10 = tjVar.M;
                uj ujVar = tjVar.Y;
                f5 f5Var = ujVar.M;
                if (this.b == tjVar.U) {
                    tjVar.T = false;
                    if (tL_error == null) {
                        jj jjVar = ujVar.r;
                        f5Var.e(false, true);
                        s70 s70Var = f5Var.e;
                        yh.l lVar = f5Var.d;
                        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                        tjVar.H = messages_messages.next_rate;
                        int i15 = cVar.a;
                        jj jjVar2 = jjVar;
                        qr.a0(i15).m1(messages_messages.users, messages_messages.chats, true, true);
                        hp.s1(i15).Y3(messages_messages.users, false);
                        hp.s1(i15).S3(messages_messages.chats, false);
                        if (!z10) {
                            arrayList9.clear();
                            sparseArray.clear();
                            arrayList7.clear();
                            hashMap.clear();
                        }
                        int i16 = messages_messages.count;
                        tjVar.L = str;
                        int size = arrayList4.size();
                        int i17 = 0;
                        while (i17 < size) {
                            zi ziVar = (zi) arrayList4.get(i17);
                            String str2 = ziVar.Y;
                            ArrayList arrayList11 = (ArrayList) hashMap.get(str2);
                            ArrayList arrayList12 = arrayList4;
                            if (arrayList11 == null) {
                                arrayList = new ArrayList();
                                hashMap.put(str2, arrayList);
                                arrayList7.add(str2);
                            } else {
                                arrayList = arrayList11;
                            }
                            arrayList.add(ziVar);
                            arrayList9.add(ziVar);
                            sparseArray.put(ziVar.f1(), ziVar);
                            i17++;
                            arrayList4 = arrayList12;
                        }
                        if (arrayList9.size() > i16) {
                            i16 = arrayList9.size();
                        }
                        tjVar.W = arrayList9.size() >= i16;
                        if (arrayList9.isEmpty()) {
                            if (TextUtils.isEmpty(tjVar.L) && this.f == 0 && j10 == 0) {
                                lVar.setText(bd.M0(2131745811, null));
                                s70Var.setVisibility(0);
                                s70Var.setText(bd.M0(2131745816, null));
                            } else {
                                lVar.setText(bd.M0(2131745810, null));
                                s70Var.setVisibility(0);
                                s70Var.setText(bd.M0(2131745817, null));
                            }
                        }
                        if (!z10) {
                            arrayList10.clear();
                            if (arrayList5 != null) {
                                arrayList10.addAll(arrayList5);
                            }
                            if (str.length() >= 3 && (bd.M0(2131745911, null).toLowerCase().startsWith(str) || "saved messages".startsWith(str))) {
                                int i18 = 0;
                                while (true) {
                                    if (i18 >= arrayList10.size()) {
                                        arrayList10.add(0, h10.i(h10.t0).f());
                                    } else if (!(arrayList10.get(i18) instanceof TLRPC.User) || h10.i(h10.t0).f().id != ((TLRPC.User) arrayList10.get(i18)).id) {
                                        i18++;
                                    }
                                }
                            }
                            arrayList8.clear();
                            arrayList8.addAll(arrayList6);
                            tjVar.a0(arrayList10, arrayList8, TextUtils.isEmpty(tjVar.L));
                        }
                        int i19 = -1;
                        View view = null;
                        int i20 = 0;
                        while (i20 < size) {
                            jj jjVar3 = jjVar2;
                            View childAt = jjVar3.getChildAt(i20);
                            if (childAt instanceof iz) {
                                i19 = RecyclerView.R(childAt);
                                view = childAt;
                            }
                            i20++;
                            jjVar2 = jjVar3;
                        }
                        jj jjVar4 = jjVar2;
                        if (view != null) {
                            jjVar4.removeView(view);
                        }
                        if (ujVar.K.getVisibility() != 0) {
                            i3 = 1;
                            break;
                        } else {
                            i3 = 1;
                            break;
                        }
                    } else {
                        yh.l lVar2 = f5Var.d;
                        s70 s70Var2 = f5Var.e;
                        lVar2.setText(bd.M0(2131745810, null));
                        s70Var2.setVisibility(0);
                        s70Var2.setText(bd.M0(2131745817, null));
                        f5Var.e(false, true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ g3(tj tjVar, int i3, TLRPC.TL_error tL_error, TLObject tLObject, org.telegram.messenger.c cVar, boolean z10, String str, ArrayList arrayList, long j10, long j11, ArrayList arrayList2, ArrayList arrayList3) {
        this.n = tjVar;
        this.b = i3;
        this.c = tL_error;
        this.d = tLObject;
        this.r = cVar;
        this.e = z10;
        this.s = str;
        this.w = arrayList;
        this.f = j10;
        this.h = j11;
        this.x = arrayList2;
        this.y = arrayList3;
    }
}
