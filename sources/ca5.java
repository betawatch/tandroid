// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class ca5 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ca5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        final byte b2 = 2;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        char c = 1;
        char c2 = 1;
        char c3 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                ha5 ha5Var = (ha5) obj;
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().stopScreenCapture();
                }
                ha5Var.O.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setDuration(180L).start();
                break;
            case 1:
                ((oa5) obj).f(false);
                break;
            case 2:
                ra5 ra5Var = (ra5) obj;
                if (VoIPService.getSharedInstance() != null) {
                    Intent action = new Intent(ra5Var.getContext(), (Class<?>) LaunchActivity.class).setAction("voip_chat");
                    action.putExtra("currentAccount", VoIPService.getSharedInstance().getAccount());
                    ra5Var.getContext().startActivity(action);
                    break;
                }
                break;
            case 3:
                d85 d85Var = (d85) obj;
                d85Var.E0(d85Var.q1);
                d85Var.dismiss();
                break;
            case 4:
                jh2 jh2Var = (jh2) obj;
                CheckBoxBase checkBoxBase = jh2Var.a;
                jh2Var.a(!checkBoxBase.q, true);
                oc7.d1().edit().putBoolean("callmiconstart", checkBoxBase.q).apply();
                break;
            case 5:
                wb5 wb5Var = (wb5) obj;
                wb5Var.d(wb5Var);
                break;
            case 6:
                ((yb5) obj).b.a1(19);
                break;
            case 7:
                oc5 oc5Var = ((mc5) obj).J;
                oc5Var.Y = null;
                oc5Var.a0.b();
                oc5Var.h.b();
                oc5Var.m0();
                oc5Var.w0();
                break;
            case 8:
                ((id5) obj).d.i0(null);
                break;
            case 9:
                ((ud5) obj).dismiss();
                break;
            case 10:
                re5 re5Var = (re5) obj;
                re5Var.a0(!re5Var.E, true);
                rc7 rc7Var = re5Var.r;
                boolean z = re5Var.E;
                ValueAnimator valueAnimator = rc7Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(rc7Var.e, z ? 1.0f : 0.0f);
                rc7Var.f = ofFloat;
                ofFloat.addUpdateListener(new af0(rc7Var, (byte) 9));
                rc7Var.f.addListener(new jf4((byte) 15, rc7Var, z));
                rc7Var.f.setDuration(320L);
                rc7Var.f.setInterpolator(d53.h);
                rc7Var.f.start();
                break;
            case 11:
                ((bp5) obj).dismiss();
                break;
            case 12:
                ((es5) obj).f0();
                break;
            case 13:
                ((jt5) obj).performClick();
                break;
            case 14:
                wv5 wv5Var = (wv5) obj;
                wv5Var.y1 = oc7.r1(wv5Var.a).i1(k47.B1(wv5Var.w1));
                wv5Var.z1 = true;
                wv5Var.dismiss();
                break;
            case 15:
                yv5 yv5Var = (yv5) obj;
                yv5Var.l1 = true;
                yv5Var.dismiss();
                break;
            case 16:
                ((ew5) obj).dismiss();
                break;
            case 17:
                ((h65) obj).run();
                break;
            case 18:
                LaunchActivity launchActivity = (LaunchActivity) obj;
                String str = LaunchActivity.C1;
                ArrayList arrayList = launchActivity.D0;
                launchActivity.G0 = null;
                launchActivity.t0(new LanguageSelectActivity());
                for (int i = 0; i < arrayList.size(); i++) {
                    if (((Dialog) arrayList.get(i)).isShowing()) {
                        ((Dialog) arrayList.get(i)).dismiss();
                    }
                }
                arrayList.clear();
                break;
            case 19:
                ((l66) obj).performClick();
                break;
            case 20:
                s56 s56Var = (s56) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s56Var.getParentActivity());
                String M0 = jb6.M0(2131745759, null);
                he heVar = alertDialog$Builder.a;
                heVar.U = M0;
                heVar.S = jb6.M0(2131745756, null);
                alertDialog$Builder.j(jb6.M0(2131745757, null), new i56(s56Var, c == true ? 1 : 0));
                alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                s56Var.showDialog(heVar);
                break;
            case 21:
                ((n38) obj).p(!r13.g0, true);
                break;
            case 22:
                ((qc6) obj).J();
                break;
            case 23:
                final sf6 sf6Var = (sf6) obj;
                mh6 mh6Var = sf6Var.E;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mh6Var.getParentActivity());
                String M02 = jb6.M0(2131745804, "RestorePasswordNoEmailTitle");
                he heVar2 = alertDialog$Builder2.a;
                heVar2.S = M02;
                heVar2.U = jb6.M0(2131745808, "RestoreEmailTroubleText");
                String M03 = jb6.M0(2131747564, null);
                final Object[] objArr3 = objArr == true ? 1 : 0;
                alertDialog$Builder2.j(M03, new ee() { // from class: rf6
                    @Override // ee
                    public final void r(he heVar3, int i2) {
                        byte b3 = objArr3;
                        sf6 sf6Var2 = sf6Var;
                        switch (b3) {
                            case 0:
                                sf6Var2.E.J1(6, true, new Bundle(), true);
                                break;
                            default:
                                sf6Var2.E.O1(sf6Var2.r, sf6Var2.s, sf6Var2.w);
                                break;
                        }
                    }
                });
                String M04 = jb6.M0(2131745850, null);
                final char c4 = c2 == true ? 1 : 0;
                alertDialog$Builder2.g(M04, new ee() { // from class: rf6
                    @Override // ee
                    public final void r(he heVar3, int i2) {
                        byte b3 = c4;
                        sf6 sf6Var2 = sf6Var;
                        switch (b3) {
                            case 0:
                                sf6Var2.E.J1(6, true, new Bundle(), true);
                                break;
                            default:
                                sf6Var2.E.O1(sf6Var2.r, sf6Var2.s, sf6Var2.w);
                                break;
                        }
                    }
                });
                Dialog showDialog = mh6Var.showDialog(heVar2);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 24:
                ag6 ag6Var = (ag6) obj;
                mh6 mh6Var2 = ag6Var.H;
                if (mh6Var2.W.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(mh6Var2.getParentActivity());
                    String M05 = jb6.M0(2131745832, "ResetMyAccountWarning");
                    he heVar3 = alertDialog$Builder3.a;
                    heVar3.S = M05;
                    heVar3.U = jb6.M0(2131745830, "ResetMyAccountWarningText");
                    alertDialog$Builder3.j(jb6.M0(2131745831, "ResetMyAccountWarningReset"), new wx4((Object) ag6Var, (byte) 29));
                    alertDialog$Builder3.g(jb6.M0(2131752542, "Cancel"), null);
                    mh6Var2.showDialog(heVar3);
                    break;
                }
                break;
            case 25:
                cg6 cg6Var = (cg6) obj;
                nm7.e().a(new xc0(cg6Var, b2), nm7.g5);
                Context context = cg6Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str2 = e21.h;
                ite.f(str2);
                hashSet.add(GoogleSignInOptions.x);
                if (hashSet.contains(GoogleSignInOptions.F)) {
                    Scope scope = GoogleSignInOptions.E;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.y);
                ua4 a = ble.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str2, null, hashMap, null));
                a.k().addOnCompleteListener(new nv4(cg6Var, a, (byte) 21));
                break;
            case 26:
                ij6 ij6Var = (ij6) obj;
                ij6Var.M.a(ij6Var, true);
                break;
            case 27:
                final xj6 xj6Var = (xj6) obj;
                ak6 ak6Var = xj6Var.L;
                if (xj6Var.n != null) {
                    View view2 = ak6Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        bu5 G = bu5.G((ViewGroup) view2, null, xj6Var);
                        if (xj6Var.n.revoked) {
                            String M06 = jb6.M0(2131751535, null);
                            final Object[] objArr4 = objArr2 == true ? 1 : 0;
                            G.b(R.drawable.msg_delete, M06, new Runnable() { // from class: uj6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final byte b3 = 1;
                                    switch (objArr4) {
                                        case 0:
                                            final xj6 xj6Var2 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = jb6.M0(2131751471, null);
                                            alertDialog$Builder4.a.U = jb6.M0(2131751470, null);
                                            alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee() { // from class: vj6
                                                @Override // ee
                                                public final void r(he heVar4, int i2) {
                                                    byte b4 = b3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                                                    xj6 xj6Var3 = xj6Var2;
                                                    switch (b4) {
                                                        case 0:
                                                            xj6Var3.L.j0(tL_chatInviteExported2);
                                                            break;
                                                        default:
                                                            xj6Var3.L.e0(tL_chatInviteExported2);
                                                            break;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            xj6 xj6Var3 = xj6Var;
                                            try {
                                                if (xj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xj6Var3.n.link));
                                                    c41.j(xj6Var3.L).j();
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            xj6 xj6Var4 = xj6Var;
                                            ak6 ak6Var2 = xj6Var4.L;
                                            try {
                                                if (xj6Var4.n.link != null) {
                                                    Context context2 = xj6Var4.getContext();
                                                    String str3 = xj6Var4.n.link;
                                                    ak6Var2.showDialog(new wj6(xj6Var4, context2, str3, str3, ak6Var2.getResourceProvider()));
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            xj6 xj6Var5 = xj6Var;
                                            ak6 ak6Var3 = xj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xj6Var5.n;
                                            s56 s56Var2 = new s56(1, ak6Var3.n);
                                            s56Var2.T = ak6Var3.t0;
                                            s56Var2.d0(tL_chatInviteExported2);
                                            ak6Var3.presentFragment(s56Var2);
                                            break;
                                        default:
                                            final xj6 xj6Var6 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(xj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = jb6.M0(2131745759, null);
                                            alertDialog$Builder5.a.S = jb6.M0(2131745756, null);
                                            final byte b4 = 0;
                                            alertDialog$Builder5.j(jb6.M0(2131745757, null), new ee() { // from class: vj6
                                                @Override // ee
                                                public final void r(he heVar4, int i2) {
                                                    byte b42 = b4;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    xj6 xj6Var32 = xj6Var6;
                                                    switch (b42) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            String M07 = jb6.M0(2131751699, null);
                            final char c5 = c3 == true ? 1 : 0;
                            G.b(R.drawable.msg_copy, M07, new Runnable() { // from class: uj6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final byte b3 = 1;
                                    switch (c5) {
                                        case 0:
                                            final xj6 xj6Var2 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = jb6.M0(2131751471, null);
                                            alertDialog$Builder4.a.U = jb6.M0(2131751470, null);
                                            alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee() { // from class: vj6
                                                @Override // ee
                                                public final void r(he heVar4, int i2) {
                                                    byte b42 = b3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    xj6 xj6Var32 = xj6Var2;
                                                    switch (b42) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            xj6 xj6Var3 = xj6Var;
                                            try {
                                                if (xj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xj6Var3.n.link));
                                                    c41.j(xj6Var3.L).j();
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            xj6 xj6Var4 = xj6Var;
                                            ak6 ak6Var2 = xj6Var4.L;
                                            try {
                                                if (xj6Var4.n.link != null) {
                                                    Context context2 = xj6Var4.getContext();
                                                    String str3 = xj6Var4.n.link;
                                                    ak6Var2.showDialog(new wj6(xj6Var4, context2, str3, str3, ak6Var2.getResourceProvider()));
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            xj6 xj6Var5 = xj6Var;
                                            ak6 ak6Var3 = xj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xj6Var5.n;
                                            s56 s56Var2 = new s56(1, ak6Var3.n);
                                            s56Var2.T = ak6Var3.t0;
                                            s56Var2.d0(tL_chatInviteExported2);
                                            ak6Var3.presentFragment(s56Var2);
                                            break;
                                        default:
                                            final xj6 xj6Var6 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(xj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = jb6.M0(2131745759, null);
                                            alertDialog$Builder5.a.S = jb6.M0(2131745756, null);
                                            final byte b4 = 0;
                                            alertDialog$Builder5.j(jb6.M0(2131745757, null), new ee() { // from class: vj6
                                                @Override // ee
                                                public final void r(he heVar4, int i2) {
                                                    byte b42 = b4;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    xj6 xj6Var32 = xj6Var6;
                                                    switch (b42) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, false);
                            G.b(R.drawable.msg_share, jb6.M0(2131745192, null), new Runnable() { // from class: uj6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final byte b3 = 1;
                                    switch (b2) {
                                        case 0:
                                            final xj6 xj6Var2 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = jb6.M0(2131751471, null);
                                            alertDialog$Builder4.a.U = jb6.M0(2131751470, null);
                                            alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee() { // from class: vj6
                                                @Override // ee
                                                public final void r(he heVar4, int i2) {
                                                    byte b42 = b3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    xj6 xj6Var32 = xj6Var2;
                                                    switch (b42) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            xj6 xj6Var3 = xj6Var;
                                            try {
                                                if (xj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xj6Var3.n.link));
                                                    c41.j(xj6Var3.L).j();
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            xj6 xj6Var4 = xj6Var;
                                            ak6 ak6Var2 = xj6Var4.L;
                                            try {
                                                if (xj6Var4.n.link != null) {
                                                    Context context2 = xj6Var4.getContext();
                                                    String str3 = xj6Var4.n.link;
                                                    ak6Var2.showDialog(new wj6(xj6Var4, context2, str3, str3, ak6Var2.getResourceProvider()));
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            xj6 xj6Var5 = xj6Var;
                                            ak6 ak6Var3 = xj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xj6Var5.n;
                                            s56 s56Var2 = new s56(1, ak6Var3.n);
                                            s56Var2.T = ak6Var3.t0;
                                            s56Var2.d0(tL_chatInviteExported2);
                                            ak6Var3.presentFragment(s56Var2);
                                            break;
                                        default:
                                            final xj6 xj6Var6 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(xj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = jb6.M0(2131745759, null);
                                            alertDialog$Builder5.a.S = jb6.M0(2131745756, null);
                                            final byte b4 = 0;
                                            alertDialog$Builder5.j(jb6.M0(2131745757, null), new ee() { // from class: vj6
                                                @Override // ee
                                                public final void r(he heVar4, int i2) {
                                                    byte b42 = b4;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    xj6 xj6Var32 = xj6Var6;
                                                    switch (b42) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, false);
                            final byte b3 = 3;
                            G.k(R.drawable.msg_edit, jb6.M0(2131751214, null), new Runnable() { // from class: uj6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final byte b32 = 1;
                                    switch (b3) {
                                        case 0:
                                            final xj6 xj6Var2 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = jb6.M0(2131751471, null);
                                            alertDialog$Builder4.a.U = jb6.M0(2131751470, null);
                                            alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee() { // from class: vj6
                                                @Override // ee
                                                public final void r(he heVar4, int i2) {
                                                    byte b42 = b32;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    xj6 xj6Var32 = xj6Var2;
                                                    switch (b42) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            xj6 xj6Var3 = xj6Var;
                                            try {
                                                if (xj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xj6Var3.n.link));
                                                    c41.j(xj6Var3.L).j();
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            xj6 xj6Var4 = xj6Var;
                                            ak6 ak6Var2 = xj6Var4.L;
                                            try {
                                                if (xj6Var4.n.link != null) {
                                                    Context context2 = xj6Var4.getContext();
                                                    String str3 = xj6Var4.n.link;
                                                    ak6Var2.showDialog(new wj6(xj6Var4, context2, str3, str3, ak6Var2.getResourceProvider()));
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            xj6 xj6Var5 = xj6Var;
                                            ak6 ak6Var3 = xj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xj6Var5.n;
                                            s56 s56Var2 = new s56(1, ak6Var3.n);
                                            s56Var2.T = ak6Var3.t0;
                                            s56Var2.d0(tL_chatInviteExported2);
                                            ak6Var3.presentFragment(s56Var2);
                                            break;
                                        default:
                                            final xj6 xj6Var6 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(xj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = jb6.M0(2131745759, null);
                                            alertDialog$Builder5.a.S = jb6.M0(2131745756, null);
                                            final byte b4 = 0;
                                            alertDialog$Builder5.j(jb6.M0(2131745757, null), new ee() { // from class: vj6
                                                @Override // ee
                                                public final void r(he heVar4, int i2) {
                                                    byte b42 = b4;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    xj6 xj6Var32 = xj6Var6;
                                                    switch (b42) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, !xj6Var.n.permanent && ak6Var.q0);
                            final byte b4 = 4;
                            G.l(R.drawable.msg_delete, new Runnable() { // from class: uj6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final byte b32 = 1;
                                    switch (b4) {
                                        case 0:
                                            final xj6 xj6Var2 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xj6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xj6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = jb6.M0(2131751471, null);
                                            alertDialog$Builder4.a.U = jb6.M0(2131751470, null);
                                            alertDialog$Builder4.j(jb6.M0(2131751535, null), new ee() { // from class: vj6
                                                @Override // ee
                                                public final void r(he heVar4, int i2) {
                                                    byte b42 = b32;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    xj6 xj6Var32 = xj6Var2;
                                                    switch (b42) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            xj6 xj6Var3 = xj6Var;
                                            try {
                                                if (xj6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xj6Var3.n.link));
                                                    c41.j(xj6Var3.L).j();
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                fc4.g(e, true);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            xj6 xj6Var4 = xj6Var;
                                            ak6 ak6Var2 = xj6Var4.L;
                                            try {
                                                if (xj6Var4.n.link != null) {
                                                    Context context2 = xj6Var4.getContext();
                                                    String str3 = xj6Var4.n.link;
                                                    ak6Var2.showDialog(new wj6(xj6Var4, context2, str3, str3, ak6Var2.getResourceProvider()));
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                fc4.g(e2, true);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            xj6 xj6Var5 = xj6Var;
                                            ak6 ak6Var3 = xj6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xj6Var5.n;
                                            s56 s56Var2 = new s56(1, ak6Var3.n);
                                            s56Var2.T = ak6Var3.t0;
                                            s56Var2.d0(tL_chatInviteExported2);
                                            ak6Var3.presentFragment(s56Var2);
                                            break;
                                        default:
                                            final xj6 xj6Var6 = xj6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xj6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(xj6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = jb6.M0(2131745759, null);
                                            alertDialog$Builder5.a.S = jb6.M0(2131745756, null);
                                            final byte b42 = 0;
                                            alertDialog$Builder5.j(jb6.M0(2131745757, null), new ee() { // from class: vj6
                                                @Override // ee
                                                public final void r(he heVar4, int i2) {
                                                    byte b422 = b42;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    xj6 xj6Var32 = xj6Var6;
                                                    switch (b422) {
                                                        case 0:
                                                            xj6Var32.L.j0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            xj6Var32.L.e0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            wi8.y(null, 2131752542, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, jb6.M0(2131745756, null), ak6Var.q0, true);
                        }
                        G.X(ak6Var.b.V0(xj6Var, false));
                        G.a0();
                        break;
                    }
                }
                break;
            case 28:
                ((ku6) obj).dismiss();
                break;
            default:
                n57 n57Var = (n57) obj;
                n57.b(n57Var.getContext(), n57Var.a, n57Var.n, false, n57Var.y, new pg6(n57Var, (byte) 20), n57Var.c);
                break;
        }
    }
}
