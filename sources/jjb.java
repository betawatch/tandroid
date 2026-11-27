// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class jjb implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jjb(byte b, KeyEvent.Callback callback, Object obj) {
        this.a = b;
        this.c = obj;
        this.b = callback;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        am2 am2Var;
        final byte b = 1;
        final byte b2 = 0;
        int i = 0;
        switch (this.a) {
            case 0:
                nx0 nx0Var = (nx0) this.b;
                boolean[] zArr = (boolean[]) this.c;
                nx0Var.dismiss();
                if (!zArr[0]) {
                    uc7.e1().edit().putInt("showchattagsinfo", 0).apply();
                    zArr[0] = true;
                    break;
                }
                break;
            case 1:
                xqb xqbVar = (xqb) this.b;
                Context context = (Context) this.c;
                if (xqbVar.getParentActivity() != null) {
                    z8d z8dVar = new z8d(xqbVar.getParentActivity(), (vnb) null);
                    ((nx0) z8dVar.b).w0 = false;
                    LinearLayout j = uh9.j(context, 1);
                    TextView textView = new TextView(context);
                    textView.setText(ob6.M0(2131752077, null));
                    qd4.w(textView, aob.j5, null, 1, 20.0f);
                    j.addView(textView, tre.t(-1, -2, 51, 22, 12, 22, 4));
                    textView.setOnTouchListener(new vqb((byte) 0));
                    ((nx0) z8dVar.b).O = j;
                    ArrayList arrayList = new ArrayList();
                    int size = aob.F.size();
                    while (b2 < size) {
                        znb znbVar = (znb) aob.F.get(b2);
                        TLRPC.TL_theme tL_theme = znbVar.G;
                        if (tL_theme == null || tL_theme.document != null) {
                            arrayList.add(znbVar);
                        }
                        b2++;
                    }
                    pob pobVar = new pob(context, xqbVar, arrayList, new ArrayList(), z8dVar);
                    j.addView(pobVar, tre.k(0.0f, 7.0f, 0.0f, 1.0f, -1, jn7.d2));
                    pobVar.B1(xqbVar.fragmentView.getMeasuredWidth());
                    xqbVar.showDialog((nx0) z8dVar.b);
                    break;
                }
                break;
            case 2:
                n0c n0cVar = (n0c) this.b;
                cs1 cs1Var = (cs1) this.c;
                n0cVar.d();
                zu1 zu1Var = cs1Var.a;
                wxb e0 = wxb.e0(-zu1Var.l6, 0L);
                e0.E = zu1Var;
                zu1Var.presentFragment(e0);
                break;
            case 3:
                b4c b4cVar = (b4c) this.b;
                l9c l9cVar = (l9c) this.c;
                b4cVar.f2 = false;
                b4cVar.T0();
                l9cVar.O(true);
                b4cVar.E0();
                break;
            case 4:
                w3c w3cVar = (w3c) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = w3cVar.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(k43.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 5:
                as1 as1Var = (as1) this.b;
                ((n8) this.c).d(true);
                f4c.a(as1Var.getContext(), as1Var.d);
                break;
            case 6:
                c51 c51Var = (c51) this.c;
                nx0 nx0Var2 = (nx0) this.b;
                if (c51Var.J > 0) {
                    hl.A3(3.0f, c51Var, null);
                    yw0.E.a();
                    break;
                } else {
                    nx0Var2.dismiss();
                    break;
                }
            case 7:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i2 = UndoView.j0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                e eVar = undoView.s;
                tL_payments_getPaymentReceipt.peer = eVar.getMessagesController().m1(message.peer_id);
                eVar.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new yp9(undoView, (byte) 19), 2);
                break;
            case 8:
                jac jacVar = (jac) this.b;
                File file = (File) this.c;
                Activity W = hl.W(jacVar.getContext());
                if (W != null) {
                    hl.s2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                    jacVar.dismiss();
                    break;
                }
                break;
            case 9:
                sbc sbcVar = (sbc) this.b;
                ArrayList arrayList2 = (ArrayList) this.c;
                HashSet hashSet = sbcVar.b2;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj = arrayList2.get(i);
                    i++;
                    Long l = (Long) obj;
                    l.getClass();
                    hashSet.remove(l);
                    sbcVar.h2.remove(l);
                }
                sbcVar.Z0();
                sbcVar.U1.b(true, hashSet, new mbc(sbcVar, (byte) 5), null);
                sbcVar.h1(true, true);
                sbcVar.a1();
                break;
            case 10:
                final sbc sbcVar2 = (sbc) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                fu5 G = fu5.G(sbcVar2.c, sbcVar2.J0, (View) view.getParent());
                G.b(R.drawable.profile_discuss, ob6.M0(2131745329, null), new Runnable() { // from class: pbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.User user2 = user;
                        sbc sbcVar3 = sbcVar2;
                        switch (b3) {
                            case 0:
                                if (user2 != null) {
                                    e eVar2 = sbcVar3.r1;
                                    if (eVar2 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        eVar2.presentFragment(new zu1(bundle));
                                        break;
                                    } else {
                                        e S = LaunchActivity.S();
                                        bg0 bg0Var = new bg0();
                                        bg0Var.a = true;
                                        if (S != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            S.showAsSheet(new zu1(bundle2), bg0Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                if (user2 != null) {
                                    e eVar3 = sbcVar3.r1;
                                    if (eVar3 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user2.id);
                                        eVar3.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        e S2 = LaunchActivity.S();
                                        if (S2 != null) {
                                            bg0 bg0Var2 = new bg0();
                                            bg0Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user2.id);
                                            S2.showAsSheet(new ProfileActivity(bundle4, null), bg0Var2);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                G.b(R.drawable.msg_openprofile, ob6.M0(2131747513, null), new Runnable() { // from class: pbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b;
                        TLRPC.User user2 = user;
                        sbc sbcVar3 = sbcVar2;
                        switch (b3) {
                            case 0:
                                if (user2 != null) {
                                    e eVar2 = sbcVar3.r1;
                                    if (eVar2 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        eVar2.presentFragment(new zu1(bundle));
                                        break;
                                    } else {
                                        e S = LaunchActivity.S();
                                        bg0 bg0Var = new bg0();
                                        bg0Var.a = true;
                                        if (S != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            S.showAsSheet(new zu1(bundle2), bg0Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                if (user2 != null) {
                                    e eVar3 = sbcVar3.r1;
                                    if (eVar3 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user2.id);
                                        eVar3.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        e S2 = LaunchActivity.S();
                                        if (S2 != null) {
                                            bg0 bg0Var2 = new bg0();
                                            bg0Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user2.id);
                                            S2.showAsSheet(new ProfileActivity(bundle4, null), bg0Var2);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                G.a0();
                break;
            case 11:
                ((VideoAds) this.b).lambda$show$2((VideoAds.CloseDrawable) this.c, view);
                break;
            case 12:
                ((VideoAds) this.b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.c, view);
                break;
            case 13:
                mkc mkcVar = (mkc) this.b;
                Activity activity = (Activity) this.c;
                sbc sbcVar3 = mkcVar.N;
                if (sbcVar3 != null) {
                    sbcVar3.dismiss();
                    mkcVar.N = null;
                }
                sbc sbcVar4 = new sbc(activity, mkcVar.a, new w53());
                TLRPC.User user2 = mkcVar.c;
                long j2 = user2 != null ? user2.id : 0L;
                TLRPC.User user3 = mkcVar.d;
                long[] jArr = {j2, user3 != null ? user3.id : 0L};
                for (int i3 = 0; i3 < 2; i3++) {
                    sbcVar4.s2.add(Long.valueOf(jArr[i3]));
                }
                sbcVar4.g1(false, true);
                sbcVar4.t2 = new pp0((byte) 4);
                mkcVar.N = sbcVar4;
                sbcVar4.show();
                break;
            case 14:
                boolean[] zArr2 = (boolean[]) this.c;
                sg2 sg2Var = (sg2) this.b;
                boolean z = !zArr2[0];
                zArr2[0] = z;
                sg2Var.c(z, true);
                break;
            case 15:
                dlc dlcVar = (dlc) this.b;
                Context context2 = (Context) this.c;
                if (context2 instanceof LaunchActivity) {
                    if (a.x) {
                        Intent intent = new Intent(context2, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context2.startActivity(intent);
                        break;
                    } else {
                        mkc.n((Activity) context2, dlcVar.N);
                        break;
                    }
                }
                break;
            case 16:
                tpc tpcVar = (tpc) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                e S = LaunchActivity.S();
                if (S != null) {
                    tpcVar.dismiss();
                    muc mucVar = new muc();
                    mucVar.m0(nftitem);
                    S.presentFragment(mucVar);
                    break;
                }
                break;
            case 17:
                wk1 wk1Var = (wk1) this.b;
                kl7[] kl7VarArr = (kl7[]) this.c;
                wk1Var.run();
                kl7VarArr[0].dismiss();
                break;
            case 18:
                sg2 sg2Var2 = (sg2) this.b;
                TextView textView2 = (TextView) this.c;
                sg2Var2.c(!sg2Var2.b(), true);
                textView2.setVisibility(sg2Var2.b() ? 0 : 8);
                break;
            default:
                c51 c51Var2 = (c51) this.b;
                int[] iArr = (int[]) this.c;
                if (!c51Var2.R && (am2Var = nwc.d) != null) {
                    c51Var2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] r = am2Var.r();
                        qa4 qa4Var = new qa4(applicationContext, g05.c);
                        String str = (String) am2Var.e;
                        o6d o6dVar = qa4Var.i;
                        g5e g5eVar = new g5e(o6dVar, str, "/tg-wear-auth/answer", r);
                        o6dVar.b.d(0, g5eVar);
                        pgd.a(g5eVar, qf5.f).addOnSuccessListener(new o48((Object) am2Var, (Object) c51Var2, (Object) iArr, (byte) 25)).addOnFailureListener(new lwc(c51Var2, (byte) 0));
                        break;
                    } catch (Exception e) {
                        cc4.g(e, true);
                        c51Var2.setLoading(false);
                    }
                }
                break;
        }
    }

    public /* synthetic */ jjb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
