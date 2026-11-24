// default package

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.LanguageSelectActivity;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class b95 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b95(Object obj, byte b) {
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
                f65 f65Var = (f65) obj;
                f65Var.E0(f65Var.q1);
                f65Var.dismiss();
                break;
            case 1:
                wf2 wf2Var = (wf2) obj;
                CheckBoxBase checkBoxBase = wf2Var.a;
                wf2Var.a(!checkBoxBase.q, true);
                na7.c1().edit().putBoolean("callmiconstart", checkBoxBase.q).apply();
                break;
            case 2:
                y95 y95Var = (y95) obj;
                y95Var.d(y95Var);
                break;
            case 3:
                ((aa5) obj).b.Z0(19);
                break;
            case 4:
                qa5 qa5Var = ((oa5) obj).J;
                qa5Var.Y = null;
                qa5Var.a0.b();
                qa5Var.h.b();
                qa5Var.l0();
                qa5Var.v0();
                break;
            case 5:
                ((kb5) obj).d.h0(null);
                break;
            case 6:
                ((wb5) obj).dismiss();
                break;
            case 7:
                tc5 tc5Var = (tc5) obj;
                tc5Var.Z(!tc5Var.E, true);
                qa7 qa7Var = tc5Var.r;
                boolean z = tc5Var.E;
                ValueAnimator valueAnimator = qa7Var.f;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(qa7Var.e, z ? 1.0f : 0.0f);
                qa7Var.f = ofFloat;
                ofFloat.addUpdateListener(new ae0(qa7Var, (byte) 9));
                qa7Var.f.addListener(new id4((byte) 15, qa7Var, z));
                qa7Var.f.setDuration(320L);
                qa7Var.f.setInterpolator(s33.h);
                qa7Var.f.start();
                break;
            case 8:
                ((bn5) obj).dismiss();
                break;
            case 9:
                ((gq5) obj).e0();
                break;
            case 10:
                ((kr5) obj).performClick();
                break;
            case 11:
                xt5 xt5Var = (xt5) obj;
                xt5Var.y1 = na7.q1(xt5Var.a).h1(k27.B1(xt5Var.w1));
                xt5Var.z1 = true;
                xt5Var.dismiss();
                break;
            case 12:
                zt5 zt5Var = (zt5) obj;
                zt5Var.l1 = true;
                zt5Var.dismiss();
                break;
            case 13:
                ((fu5) obj).dismiss();
                break;
            case 14:
                ((j45) obj).run();
                break;
            case 15:
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
            case 16:
                ((l46) obj).performClick();
                break;
            case 17:
                s36 s36Var = (s36) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(s36Var.getParentActivity());
                String M0 = k96.M0(2131745833, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.U = M0;
                hdVar.S = k96.M0(2131745830, null);
                alertDialog$Builder.j(k96.M0(2131745831, null), new i36(s36Var, c == true ? 1 : 0));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                s36Var.showDialog(hdVar);
                break;
            case 18:
                ((l18) obj).p(!r12.g0, true);
                break;
            case 19:
                ((ra6) obj).J();
                break;
            case 20:
                final td6 td6Var = (td6) obj;
                mf6 mf6Var = td6Var.E;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(mf6Var.getParentActivity());
                String M02 = k96.M0(2131745878, "RestorePasswordNoEmailTitle");
                hd hdVar2 = alertDialog$Builder2.a;
                hdVar2.S = M02;
                hdVar2.U = k96.M0(2131745882, "RestoreEmailTroubleText");
                String M03 = k96.M0(2131747638, null);
                final Object[] objArr3 = objArr == true ? 1 : 0;
                alertDialog$Builder2.j(M03, new ed() { // from class: sd6
                    @Override // ed
                    public final void u(hd hdVar3, int i2) {
                        byte b3 = objArr3;
                        td6 td6Var2 = td6Var;
                        switch (b3) {
                            case 0:
                                td6Var2.E.I1(6, true, new Bundle(), true);
                                break;
                            default:
                                td6Var2.E.N1(td6Var2.r, td6Var2.s, td6Var2.w);
                                break;
                        }
                    }
                });
                String M04 = k96.M0(2131745924, null);
                final char c4 = c2 == true ? 1 : 0;
                alertDialog$Builder2.g(M04, new ed() { // from class: sd6
                    @Override // ed
                    public final void u(hd hdVar3, int i2) {
                        byte b3 = c4;
                        td6 td6Var2 = td6Var;
                        switch (b3) {
                            case 0:
                                td6Var2.E.I1(6, true, new Bundle(), true);
                                break;
                            default:
                                td6Var2.E.N1(td6Var2.r, td6Var2.s, td6Var2.w);
                                break;
                        }
                    }
                });
                Dialog showDialog = mf6Var.showDialog(hdVar2);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 21:
                be6 be6Var = (be6) obj;
                mf6 mf6Var2 = be6Var.H;
                if (mf6Var2.W.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(mf6Var2.getParentActivity());
                    String M05 = k96.M0(2131745906, "ResetMyAccountWarning");
                    hd hdVar3 = alertDialog$Builder3.a;
                    hdVar3.S = M05;
                    hdVar3.U = k96.M0(2131745904, "ResetMyAccountWarningText");
                    alertDialog$Builder3.j(k96.M0(2131745905, "ResetMyAccountWarningReset"), new ry4((Object) be6Var, (byte) 26));
                    alertDialog$Builder3.g(k96.M0(2131752577, "Cancel"), null);
                    mf6Var2.showDialog(hdVar3);
                    break;
                }
                break;
            case 22:
                de6 de6Var = (de6) obj;
                kk7.e().a(new xb0(de6Var, b2), kk7.e5);
                Context context = de6Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str2 = w01.h;
                fre.f(str2);
                hashSet.add(GoogleSignInOptions.x);
                if (hashSet.contains(GoogleSignInOptions.F)) {
                    Scope scope = GoogleSignInOptions.E;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.y);
                u84 a = aje.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str2, null, hashMap, null));
                a.k().addOnCompleteListener(new h45(de6Var, a, (byte) 20));
                break;
            case 23:
                gh6 gh6Var = (gh6) obj;
                gh6Var.M.a(gh6Var, true);
                break;
            case 24:
                final vh6 vh6Var = (vh6) obj;
                yh6 yh6Var = vh6Var.L;
                if (vh6Var.n != null) {
                    View view2 = yh6Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        cs5 G = cs5.G((ViewGroup) view2, null, vh6Var);
                        if (vh6Var.n.revoked) {
                            String M06 = k96.M0(2131751586, null);
                            final Object[] objArr4 = objArr2 == true ? 1 : 0;
                            G.b(R.drawable.msg_delete, M06, new Runnable() { // from class: sh6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final byte b3 = 1;
                                    switch (objArr4) {
                                        case 0:
                                            final vh6 vh6Var2 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = k96.M0(2131751522, null);
                                            alertDialog$Builder4.a.U = k96.M0(2131751521, null);
                                            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed() { // from class: th6
                                                @Override // ed
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b4 = b3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported2 = tL_chatInviteExported;
                                                    vh6 vh6Var3 = vh6Var2;
                                                    switch (b4) {
                                                        case 0:
                                                            vh6Var3.L.i0(tL_chatInviteExported2);
                                                            break;
                                                        default:
                                                            vh6Var3.L.d0(tL_chatInviteExported2);
                                                            break;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            vh6 vh6Var3 = vh6Var;
                                            try {
                                                if (vh6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh6Var3.n.link));
                                                    u21.j(vh6Var3.L).j();
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            vh6 vh6Var4 = vh6Var;
                                            yh6 yh6Var2 = vh6Var4.L;
                                            try {
                                                if (vh6Var4.n.link != null) {
                                                    Context context2 = vh6Var4.getContext();
                                                    String str3 = vh6Var4.n.link;
                                                    yh6Var2.showDialog(new uh6(vh6Var4, context2, str3, str3, yh6Var2.getResourceProvider()));
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                fa4.g(e2, true);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            vh6 vh6Var5 = vh6Var;
                                            yh6 yh6Var3 = vh6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh6Var5.n;
                                            s36 s36Var2 = new s36(1, yh6Var3.n);
                                            s36Var2.T = yh6Var3.t0;
                                            s36Var2.c0(tL_chatInviteExported2);
                                            yh6Var3.presentFragment(s36Var2);
                                            break;
                                        default:
                                            final vh6 vh6Var6 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(vh6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = k96.M0(2131745833, null);
                                            alertDialog$Builder5.a.S = k96.M0(2131745830, null);
                                            final byte b4 = 0;
                                            alertDialog$Builder5.j(k96.M0(2131745831, null), new ed() { // from class: th6
                                                @Override // ed
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b42 = b4;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    vh6 vh6Var32 = vh6Var6;
                                                    switch (b42) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            String M07 = k96.M0(2131751750, null);
                            final char c5 = c3 == true ? 1 : 0;
                            G.b(R.drawable.msg_copy, M07, new Runnable() { // from class: sh6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final byte b3 = 1;
                                    switch (c5) {
                                        case 0:
                                            final vh6 vh6Var2 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = k96.M0(2131751522, null);
                                            alertDialog$Builder4.a.U = k96.M0(2131751521, null);
                                            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed() { // from class: th6
                                                @Override // ed
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b42 = b3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    vh6 vh6Var32 = vh6Var2;
                                                    switch (b42) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            vh6 vh6Var3 = vh6Var;
                                            try {
                                                if (vh6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh6Var3.n.link));
                                                    u21.j(vh6Var3.L).j();
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            vh6 vh6Var4 = vh6Var;
                                            yh6 yh6Var2 = vh6Var4.L;
                                            try {
                                                if (vh6Var4.n.link != null) {
                                                    Context context2 = vh6Var4.getContext();
                                                    String str3 = vh6Var4.n.link;
                                                    yh6Var2.showDialog(new uh6(vh6Var4, context2, str3, str3, yh6Var2.getResourceProvider()));
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                fa4.g(e2, true);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            vh6 vh6Var5 = vh6Var;
                                            yh6 yh6Var3 = vh6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh6Var5.n;
                                            s36 s36Var2 = new s36(1, yh6Var3.n);
                                            s36Var2.T = yh6Var3.t0;
                                            s36Var2.c0(tL_chatInviteExported2);
                                            yh6Var3.presentFragment(s36Var2);
                                            break;
                                        default:
                                            final vh6 vh6Var6 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(vh6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = k96.M0(2131745833, null);
                                            alertDialog$Builder5.a.S = k96.M0(2131745830, null);
                                            final byte b4 = 0;
                                            alertDialog$Builder5.j(k96.M0(2131745831, null), new ed() { // from class: th6
                                                @Override // ed
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b42 = b4;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    vh6 vh6Var32 = vh6Var6;
                                                    switch (b42) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, false);
                            G.b(R.drawable.msg_share, k96.M0(2131745266, null), new Runnable() { // from class: sh6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final byte b3 = 1;
                                    switch (b2) {
                                        case 0:
                                            final vh6 vh6Var2 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = k96.M0(2131751522, null);
                                            alertDialog$Builder4.a.U = k96.M0(2131751521, null);
                                            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed() { // from class: th6
                                                @Override // ed
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b42 = b3;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    vh6 vh6Var32 = vh6Var2;
                                                    switch (b42) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            vh6 vh6Var3 = vh6Var;
                                            try {
                                                if (vh6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh6Var3.n.link));
                                                    u21.j(vh6Var3.L).j();
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            vh6 vh6Var4 = vh6Var;
                                            yh6 yh6Var2 = vh6Var4.L;
                                            try {
                                                if (vh6Var4.n.link != null) {
                                                    Context context2 = vh6Var4.getContext();
                                                    String str3 = vh6Var4.n.link;
                                                    yh6Var2.showDialog(new uh6(vh6Var4, context2, str3, str3, yh6Var2.getResourceProvider()));
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                fa4.g(e2, true);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            vh6 vh6Var5 = vh6Var;
                                            yh6 yh6Var3 = vh6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh6Var5.n;
                                            s36 s36Var2 = new s36(1, yh6Var3.n);
                                            s36Var2.T = yh6Var3.t0;
                                            s36Var2.c0(tL_chatInviteExported2);
                                            yh6Var3.presentFragment(s36Var2);
                                            break;
                                        default:
                                            final vh6 vh6Var6 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(vh6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = k96.M0(2131745833, null);
                                            alertDialog$Builder5.a.S = k96.M0(2131745830, null);
                                            final byte b4 = 0;
                                            alertDialog$Builder5.j(k96.M0(2131745831, null), new ed() { // from class: th6
                                                @Override // ed
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b42 = b4;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    vh6 vh6Var32 = vh6Var6;
                                                    switch (b42) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, false);
                            final byte b3 = 3;
                            G.k(R.drawable.msg_edit, k96.M0(2131751265, null), new Runnable() { // from class: sh6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final byte b32 = 1;
                                    switch (b3) {
                                        case 0:
                                            final vh6 vh6Var2 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = k96.M0(2131751522, null);
                                            alertDialog$Builder4.a.U = k96.M0(2131751521, null);
                                            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed() { // from class: th6
                                                @Override // ed
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b42 = b32;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    vh6 vh6Var32 = vh6Var2;
                                                    switch (b42) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            vh6 vh6Var3 = vh6Var;
                                            try {
                                                if (vh6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh6Var3.n.link));
                                                    u21.j(vh6Var3.L).j();
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            vh6 vh6Var4 = vh6Var;
                                            yh6 yh6Var2 = vh6Var4.L;
                                            try {
                                                if (vh6Var4.n.link != null) {
                                                    Context context2 = vh6Var4.getContext();
                                                    String str3 = vh6Var4.n.link;
                                                    yh6Var2.showDialog(new uh6(vh6Var4, context2, str3, str3, yh6Var2.getResourceProvider()));
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                fa4.g(e2, true);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            vh6 vh6Var5 = vh6Var;
                                            yh6 yh6Var3 = vh6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh6Var5.n;
                                            s36 s36Var2 = new s36(1, yh6Var3.n);
                                            s36Var2.T = yh6Var3.t0;
                                            s36Var2.c0(tL_chatInviteExported2);
                                            yh6Var3.presentFragment(s36Var2);
                                            break;
                                        default:
                                            final vh6 vh6Var6 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(vh6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = k96.M0(2131745833, null);
                                            alertDialog$Builder5.a.S = k96.M0(2131745830, null);
                                            final byte b4 = 0;
                                            alertDialog$Builder5.j(k96.M0(2131745831, null), new ed() { // from class: th6
                                                @Override // ed
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b42 = b4;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    vh6 vh6Var32 = vh6Var6;
                                                    switch (b42) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, !vh6Var.n.permanent && yh6Var.q0);
                            final byte b4 = 4;
                            G.l(R.drawable.msg_delete, new Runnable() { // from class: sh6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final byte b32 = 1;
                                    switch (b4) {
                                        case 0:
                                            final vh6 vh6Var2 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh6Var2.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh6Var2.L.getParentActivity());
                                            alertDialog$Builder4.a.S = k96.M0(2131751522, null);
                                            alertDialog$Builder4.a.U = k96.M0(2131751521, null);
                                            alertDialog$Builder4.j(k96.M0(2131751586, null), new ed() { // from class: th6
                                                @Override // ed
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b42 = b32;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported;
                                                    vh6 vh6Var32 = vh6Var2;
                                                    switch (b42) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder4, null);
                                            break;
                                        case 1:
                                            vh6 vh6Var3 = vh6Var;
                                            try {
                                                if (vh6Var3.n.link != null) {
                                                    ((ClipboardManager) a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh6Var3.n.link));
                                                    u21.j(vh6Var3.L).j();
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                fa4.g(e, true);
                                                return;
                                            }
                                            break;
                                        case 2:
                                            vh6 vh6Var4 = vh6Var;
                                            yh6 yh6Var2 = vh6Var4.L;
                                            try {
                                                if (vh6Var4.n.link != null) {
                                                    Context context2 = vh6Var4.getContext();
                                                    String str3 = vh6Var4.n.link;
                                                    yh6Var2.showDialog(new uh6(vh6Var4, context2, str3, str3, yh6Var2.getResourceProvider()));
                                                    break;
                                                }
                                            } catch (Exception e2) {
                                                fa4.g(e2, true);
                                                return;
                                            }
                                            break;
                                        case 3:
                                            vh6 vh6Var5 = vh6Var;
                                            yh6 yh6Var3 = vh6Var5.L;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh6Var5.n;
                                            s36 s36Var2 = new s36(1, yh6Var3.n);
                                            s36Var2.T = yh6Var3.t0;
                                            s36Var2.c0(tL_chatInviteExported2);
                                            yh6Var3.presentFragment(s36Var2);
                                            break;
                                        default:
                                            final vh6 vh6Var6 = vh6Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh6Var6.n;
                                            AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(vh6Var6.L.getParentActivity());
                                            alertDialog$Builder5.a.U = k96.M0(2131745833, null);
                                            alertDialog$Builder5.a.S = k96.M0(2131745830, null);
                                            final byte b42 = 0;
                                            alertDialog$Builder5.j(k96.M0(2131745831, null), new ed() { // from class: th6
                                                @Override // ed
                                                public final void u(hd hdVar4, int i2) {
                                                    byte b422 = b42;
                                                    TLRPC.TL_chatInviteExported tL_chatInviteExported22 = tL_chatInviteExported3;
                                                    vh6 vh6Var32 = vh6Var6;
                                                    switch (b422) {
                                                        case 0:
                                                            vh6Var32.L.i0(tL_chatInviteExported22);
                                                            break;
                                                        default:
                                                            vh6Var32.L.d0(tL_chatInviteExported22);
                                                            break;
                                                    }
                                                }
                                            });
                                            ug8.y(null, 2131752577, alertDialog$Builder5, null);
                                            break;
                                    }
                                }
                            }, k96.M0(2131745830, null), yh6Var.q0, true);
                        }
                        G.X(yh6Var.b.V0(vh6Var, false));
                        G.a0();
                        break;
                    }
                }
                break;
            case 25:
                ((js6) obj).dismiss();
                break;
            case 26:
                n37 n37Var = (n37) obj;
                n37.b(n37Var.getContext(), n37Var.a, n37Var.n, false, n37Var.y, new vl6(n37Var, (byte) 13), n37Var.c);
                break;
            case 27:
                s47 s47Var = (s47) obj;
                long j = s47Var.b;
                if (!s47Var.n.w4()) {
                    if (s47Var.getParentLayout().getFragmentStack().size() > 1) {
                        d dVar = (d) s47Var.getParentLayout().getFragmentStack().get(s47Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((dVar instanceof mu1) && ((mu1) dVar).e.id == j) {
                            s47Var.finishFragment();
                            break;
                        }
                    }
                    Bundle k = ls6.k(j, "chat_id");
                    k.putInt("message_id", s47Var.c);
                    k.putBoolean("need_remove_previous_same_chat_activity", false);
                    s47Var.presentFragment(new mu1(k));
                    break;
                }
                break;
            case 28:
                ((t47) obj).dismiss();
                break;
            default:
                ((ahb) obj).setChecked(!r12.e.h);
                break;
        }
    }
}
