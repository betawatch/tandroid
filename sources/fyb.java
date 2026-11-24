// default package

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class fyb implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fyb(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sm2 sm2Var;
        final byte b = 1;
        final byte b2 = 0;
        switch (this.a) {
            case 0:
                oyb oybVar = (oyb) this.b;
                bt1 bt1Var = (bt1) this.c;
                oybVar.d();
                yv1 yv1Var = bt1Var.a;
                wvb f0 = wvb.f0(-yv1Var.l6, 0L);
                f0.E = yv1Var;
                yv1Var.presentFragment(f0);
                break;
            case 1:
                c2c c2cVar = (c2c) this.b;
                l7c l7cVar = (l7c) this.c;
                c2cVar.f2 = false;
                c2cVar.S0();
                l7cVar.O(true);
                c2cVar.D0();
                break;
            case 2:
                x1c x1cVar = (x1c) this.b;
                View.OnClickListener onClickListener = (View.OnClickListener) this.c;
                ImageView imageView = x1cVar.s;
                imageView.animate().rotation(imageView.getRotation() + 180.0f).setDuration(380L).setInterpolator(d53.h).start();
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                    break;
                }
                break;
            case 3:
                zs1 zs1Var = (zs1) this.b;
                ((m8) this.c).d(true);
                g2c.a(zs1Var.getContext(), zs1Var.d);
                break;
            case 4:
                b61 b61Var = (b61) this.b;
                my0 my0Var = (my0) this.c;
                if (b61Var.J > 0) {
                    gm.A3(3.0f, b61Var, null);
                    xx0.E.a();
                    break;
                } else {
                    my0Var.dismiss();
                    break;
                }
            case 5:
                UndoView undoView = (UndoView) this.b;
                TLRPC.Message message = (TLRPC.Message) this.c;
                int i = UndoView.j0;
                undoView.d(1, true);
                TLRPC.TL_payments_getPaymentReceipt tL_payments_getPaymentReceipt = new TLRPC.TL_payments_getPaymentReceipt();
                tL_payments_getPaymentReceipt.msg_id = message.id;
                d dVar = undoView.s;
                tL_payments_getPaymentReceipt.peer = dVar.getMessagesController().l1(message.peer_id);
                dVar.getConnectionsManager().sendRequest(tL_payments_getPaymentReceipt, new go9(undoView, (byte) 19), 2);
                break;
            case 6:
                k8c k8cVar = (k8c) this.b;
                File file = (File) this.c;
                Activity W = gm.W(k8cVar.getContext());
                if (W != null) {
                    gm.s2(file, "Telegram.apk", "application/vnd.android.package-archive", W, null, false);
                    k8cVar.dismiss();
                    break;
                }
                break;
            case 7:
                t9c t9cVar = (t9c) this.b;
                ArrayList arrayList = (ArrayList) this.c;
                HashSet hashSet = t9cVar.b2;
                int size = arrayList.size();
                while (b2 < size) {
                    Long l = (Long) arrayList.get(b2);
                    l.getClass();
                    hashSet.remove(l);
                    t9cVar.h2.remove(l);
                    b2++;
                }
                t9cVar.Y0();
                t9cVar.U1.b(true, hashSet, new n9c(t9cVar, (byte) 5), null);
                t9cVar.g1(true, true);
                t9cVar.Z0();
                break;
            case 8:
                final t9c t9cVar2 = (t9c) this.b;
                final TLRPC.User user = (TLRPC.User) this.c;
                bu5 G = bu5.G(t9cVar2.c, t9cVar2.J0, (View) view.getParent());
                G.b(R.drawable.profile_discuss, jb6.M0(2131745335, null), new Runnable() { // from class: q9c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b2;
                        TLRPC.User user2 = user;
                        t9c t9cVar3 = t9cVar2;
                        switch (b3) {
                            case 0:
                                if (user2 != null) {
                                    d dVar2 = t9cVar3.r1;
                                    if (dVar2 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        dVar2.presentFragment(new yv1(bundle));
                                        break;
                                    } else {
                                        d S = LaunchActivity.S();
                                        bh0 bh0Var = new bh0();
                                        bh0Var.a = true;
                                        if (S != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            S.showAsSheet(new yv1(bundle2), bh0Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                if (user2 != null) {
                                    d dVar3 = t9cVar3.r1;
                                    if (dVar3 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user2.id);
                                        dVar3.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        d S2 = LaunchActivity.S();
                                        if (S2 != null) {
                                            bh0 bh0Var2 = new bh0();
                                            bh0Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user2.id);
                                            S2.showAsSheet(new ProfileActivity(bundle4, null), bh0Var2);
                                            break;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                }, false);
                G.b(R.drawable.msg_openprofile, jb6.M0(2131747519, null), new Runnable() { // from class: q9c
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b3 = b;
                        TLRPC.User user2 = user;
                        t9c t9cVar3 = t9cVar2;
                        switch (b3) {
                            case 0:
                                if (user2 != null) {
                                    d dVar2 = t9cVar3.r1;
                                    if (dVar2 != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putLong("user_id", user2.id);
                                        dVar2.presentFragment(new yv1(bundle));
                                        break;
                                    } else {
                                        d S = LaunchActivity.S();
                                        bh0 bh0Var = new bh0();
                                        bh0Var.a = true;
                                        if (S != null) {
                                            Bundle bundle2 = new Bundle();
                                            bundle2.putLong("user_id", user2.id);
                                            S.showAsSheet(new yv1(bundle2), bh0Var);
                                            break;
                                        }
                                    }
                                }
                                break;
                            default:
                                if (user2 != null) {
                                    d dVar3 = t9cVar3.r1;
                                    if (dVar3 != null) {
                                        Bundle bundle3 = new Bundle();
                                        bundle3.putLong("user_id", user2.id);
                                        dVar3.presentFragment(new ProfileActivity(bundle3, null));
                                        break;
                                    } else {
                                        d S2 = LaunchActivity.S();
                                        if (S2 != null) {
                                            bh0 bh0Var2 = new bh0();
                                            bh0Var2.a = true;
                                            Bundle bundle4 = new Bundle();
                                            bundle4.putLong("user_id", user2.id);
                                            S2.showAsSheet(new ProfileActivity(bundle4, null), bh0Var2);
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
            case 9:
                ((VideoAds) this.b).lambda$show$2((VideoAds.CloseDrawable) this.c, view);
                break;
            case 10:
                ((VideoAds) this.b).lambda$show$18((TLRPC.TL_sponsoredMessage) this.c, view);
                break;
            case 11:
                iic iicVar = (iic) this.b;
                Activity activity = (Activity) this.c;
                t9c t9cVar3 = iicVar.N;
                if (t9cVar3 != null) {
                    t9cVar3.dismiss();
                    iicVar.N = null;
                }
                t9c t9cVar4 = new t9c(activity, iicVar.a, new q63());
                TLRPC.User user2 = iicVar.c;
                long j = user2 != null ? user2.id : 0L;
                TLRPC.User user3 = iicVar.d;
                long[] jArr = {j, user3 != null ? user3.id : 0L};
                for (int i2 = 0; i2 < 2; i2++) {
                    t9cVar4.s2.add(Long.valueOf(jArr[i2]));
                }
                t9cVar4.f1(false, true);
                t9cVar4.t2 = new nq0((byte) 4);
                iicVar.N = t9cVar4;
                t9cVar4.show();
                break;
            case 12:
                boolean[] zArr = (boolean[]) this.b;
                oh2 oh2Var = (oh2) this.c;
                boolean z = !zArr[0];
                zArr[0] = z;
                oh2Var.c(z, true);
                break;
            case 13:
                yic yicVar = (yic) this.b;
                Context context = (Context) this.c;
                if (context instanceof LaunchActivity) {
                    if (a.x) {
                        Intent intent = new Intent(context, (Class<?>) LaunchActivity.class);
                        intent.setAction("voip");
                        context.startActivity(intent);
                        break;
                    } else {
                        iic.n((Activity) context, yicVar.N);
                        break;
                    }
                }
                break;
            case 14:
                fnc fncVar = (fnc) this.b;
                TL_wallet.nftItem nftitem = (TL_wallet.nftItem) this.c;
                d S = LaunchActivity.S();
                if (S != null) {
                    fncVar.dismiss();
                    asc ascVar = new asc();
                    ascVar.n0(nftitem);
                    S.presentFragment(ascVar);
                    break;
                }
                break;
            case 15:
                vl1 vl1Var = (vl1) this.b;
                el7[] el7VarArr = (el7[]) this.c;
                vl1Var.run();
                el7VarArr[0].dismiss();
                break;
            case 16:
                oh2 oh2Var2 = (oh2) this.b;
                TextView textView = (TextView) this.c;
                oh2Var2.c(!oh2Var2.b(), true);
                textView.setVisibility(oh2Var2.b() ? 0 : 8);
                break;
            default:
                b61 b61Var2 = (b61) this.b;
                int[] iArr = (int[]) this.c;
                if (!b61Var2.R && (sm2Var = auc.d) != null) {
                    b61Var2.setLoading(true);
                    Context applicationContext = view.getContext().getApplicationContext();
                    try {
                        byte[] j2 = sm2Var.j();
                        ua4 ua4Var = new ua4(applicationContext, b05.c);
                        String str = (String) sm2Var.e;
                        z3d z3dVar = ua4Var.i;
                        t2e t2eVar = new t2e(z3dVar, str, "/tg-wear-auth/answer", j2);
                        z3dVar.b.d(0, t2eVar);
                        ydd.a(t2eVar, nf5.f).addOnSuccessListener(new jq9(sm2Var, b61Var2, iArr, (byte) 16)).addOnFailureListener(new ytc(b61Var2, (byte) 0));
                        break;
                    } catch (Exception e) {
                        fc4.g(e, true);
                        b61Var2.setLoading(false);
                    }
                }
                break;
        }
    }
}
