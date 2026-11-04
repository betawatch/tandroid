package org.telegram.ui;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class b40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b40(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e2  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.ow0 ow0Var;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        final int i3 = 4;
        final int i10 = 3;
        final int i11 = 2;
        ad.b bVar = null;
        switch (this.a) {
            case 0:
                ((c40) this.b).b.a1(19);
                return;
            case 1:
                r40 r40Var = ((p40) this.b).J;
                r40Var.Y = null;
                r40Var.a0.b();
                r40Var.h.b();
                r40Var.p0();
                r40Var.w0();
                return;
            case 2:
                g50.f0(((e50) this.b).d, null);
                return;
            case 3:
                t50.a0((t50) this.b);
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.F0;
                launchActivity.I0 = null;
                launchActivity.t0(new LanguageSelectActivity());
                while (r9 < arrayList.size()) {
                    if (((Dialog) arrayList.get(r9)).isShowing()) {
                        ((Dialog) arrayList.get(r9)).dismiss();
                    }
                    r9++;
                }
                arrayList.clear();
                return;
            case 5:
                e90 e90Var = (e90) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(e90Var.getParentActivity());
                alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131746036, null);
                alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(2131746033, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746034, null), new u80(e90Var, 1 == true ? 1 : 0));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                e90Var.showDialog(alertDialog$Builder.a);
                return;
            case 6:
                final fc0 fc0Var = (fc0) this.b;
                xd0 xd0Var = fc0Var.E;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xd0Var.getParentActivity());
                alertDialog$Builder2.a.S = org.telegram.messenger.bd.M0(2131746081, "RestorePasswordNoEmailTitle");
                alertDialog$Builder2.a.U = org.telegram.messenger.bd.M0(2131746085, "RestoreEmailTroubleText");
                alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131747839, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.ec0
                    @Override // org.telegram.ui.ActionBar.p1
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i12) {
                        switch (r2) {
                            case 0:
                                fc0Var.E.D1(6, true, new Bundle(), true);
                                break;
                            default:
                                fc0 fc0Var2 = fc0Var;
                                xd0.s0(fc0Var2.E, fc0Var2.r, fc0Var2.s, fc0Var2.w);
                                break;
                        }
                    }
                });
                String M0 = org.telegram.messenger.bd.M0(2131746127, null);
                final char c2 = 1 == true ? 1 : 0;
                alertDialog$Builder2.h(M0, new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.ec0
                    @Override // org.telegram.ui.ActionBar.p1
                    public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i12) {
                        switch (c2) {
                            case 0:
                                fc0Var.E.D1(6, true, new Bundle(), true);
                                break;
                            default:
                                fc0 fc0Var2 = fc0Var;
                                xd0.s0(fc0Var2.E, fc0Var2.r, fc0Var2.s, fc0Var2.w);
                                break;
                        }
                    }
                });
                Dialog showDialog = xd0Var.showDialog(alertDialog$Builder2.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            case 7:
                oc0 oc0Var = (oc0) this.b;
                xd0 xd0Var2 = oc0Var.H;
                if (xd0Var2.W.getTag() != null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xd0Var2.getParentActivity());
                alertDialog$Builder3.a.S = org.telegram.messenger.bd.M0(2131746109, "ResetMyAccountWarning");
                alertDialog$Builder3.a.U = org.telegram.messenger.bd.M0(2131746107, "ResetMyAccountWarningText");
                alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131746108, "ResetMyAccountWarningReset"), new ur(oc0Var, 21));
                alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                xd0Var2.showDialog(alertDialog$Builder3.a);
                return;
            case 8:
                qc0 qc0Var = (qc0) this.b;
                org.telegram.messenger.hs.e().b(new z4(qc0Var, i11), org.telegram.messenger.hs.c5);
                Context context = qc0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = org.telegram.messenger.r2.h;
                p6.m.e(str);
                hashSet.add(GoogleSignInOptions.x);
                if (hashSet.contains(GoogleSignInOptions.F)) {
                    Scope scope = GoogleSignInOptions.E;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.y);
                a9.j0 a10 = b8.h1.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a10.g().addOnCompleteListener(new rb0(1 == true ? 1 : 0, qc0Var, a10));
                return;
            case 9:
                ((md0) this.b).a();
                return;
            case 10:
                final ue0 ue0Var = (ue0) this.b;
                xe0 xe0Var = ue0Var.L;
                if (ue0Var.n == null) {
                    return;
                }
                View view2 = xe0Var.fragmentView;
                if (view2 instanceof ViewGroup) {
                    org.telegram.ui.Components.f60 F = org.telegram.ui.Components.f60.F((ViewGroup) view2, null, ue0Var);
                    if (ue0Var.n.revoked) {
                        F.c(R.drawable.msg_delete, org.telegram.messenger.bd.M0(2131751599, null), new Runnable() { // from class: org.telegram.ui.re0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (r2) {
                                    case 0:
                                        final ue0 ue0Var2 = ue0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ue0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ue0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.bd.M0(2131751535, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.bd.M0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.se0
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i13) {
                                                switch (i12) {
                                                    case 0:
                                                        ue0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ue0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        k2.p1.v(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ue0 ue0Var3 = ue0Var;
                                        try {
                                            if (ue0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ue0Var3.n.link));
                                                org.telegram.ui.Components.fc.j(ue0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        ue0 ue0Var4 = ue0Var;
                                        xe0 xe0Var2 = ue0Var4.L;
                                        try {
                                            if (ue0Var4.n.link != null) {
                                                Context context2 = ue0Var4.getContext();
                                                String str2 = ue0Var4.n.link;
                                                xe0Var2.showDialog(new te0(ue0Var4, context2, str2, str2, xe0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        ue0 ue0Var5 = ue0Var;
                                        xe0 xe0Var3 = ue0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ue0Var5.n;
                                        e90 e90Var2 = new e90(1, xe0Var3.n);
                                        e90Var2.T = xe0Var3.t0;
                                        e90Var2.d0(tL_chatInviteExported2);
                                        xe0Var3.presentFragment(e90Var2);
                                        break;
                                    default:
                                        final ue0 ue0Var6 = ue0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ue0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ue0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.bd.M0(2131746036, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.bd.M0(2131746033, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.bd.M0(2131746034, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.se0
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        ue0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ue0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        k2.p1.v(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, true);
                    } else {
                        String M02 = org.telegram.messenger.bd.M0(2131751762, null);
                        final char c10 = 1 == true ? 1 : 0;
                        F.c(R.drawable.msg_copy, M02, new Runnable() { // from class: org.telegram.ui.re0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (c10) {
                                    case 0:
                                        final ue0 ue0Var2 = ue0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ue0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ue0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.bd.M0(2131751535, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.bd.M0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.se0
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        ue0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ue0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        k2.p1.v(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ue0 ue0Var3 = ue0Var;
                                        try {
                                            if (ue0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ue0Var3.n.link));
                                                org.telegram.ui.Components.fc.j(ue0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        ue0 ue0Var4 = ue0Var;
                                        xe0 xe0Var2 = ue0Var4.L;
                                        try {
                                            if (ue0Var4.n.link != null) {
                                                Context context2 = ue0Var4.getContext();
                                                String str2 = ue0Var4.n.link;
                                                xe0Var2.showDialog(new te0(ue0Var4, context2, str2, str2, xe0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        ue0 ue0Var5 = ue0Var;
                                        xe0 xe0Var3 = ue0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ue0Var5.n;
                                        e90 e90Var2 = new e90(1, xe0Var3.n);
                                        e90Var2.T = xe0Var3.t0;
                                        e90Var2.d0(tL_chatInviteExported2);
                                        xe0Var3.presentFragment(e90Var2);
                                        break;
                                    default:
                                        final ue0 ue0Var6 = ue0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ue0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ue0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.bd.M0(2131746036, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.bd.M0(2131746033, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.bd.M0(2131746034, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.se0
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        ue0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ue0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        k2.p1.v(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.c(R.drawable.msg_share, org.telegram.messenger.bd.M0(2131745468, null), new Runnable() { // from class: org.telegram.ui.re0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i11) {
                                    case 0:
                                        final ue0 ue0Var2 = ue0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ue0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ue0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.bd.M0(2131751535, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.bd.M0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.se0
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        ue0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ue0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        k2.p1.v(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ue0 ue0Var3 = ue0Var;
                                        try {
                                            if (ue0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ue0Var3.n.link));
                                                org.telegram.ui.Components.fc.j(ue0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        ue0 ue0Var4 = ue0Var;
                                        xe0 xe0Var2 = ue0Var4.L;
                                        try {
                                            if (ue0Var4.n.link != null) {
                                                Context context2 = ue0Var4.getContext();
                                                String str2 = ue0Var4.n.link;
                                                xe0Var2.showDialog(new te0(ue0Var4, context2, str2, str2, xe0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        ue0 ue0Var5 = ue0Var;
                                        xe0 xe0Var3 = ue0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ue0Var5.n;
                                        e90 e90Var2 = new e90(1, xe0Var3.n);
                                        e90Var2.T = xe0Var3.t0;
                                        e90Var2.d0(tL_chatInviteExported2);
                                        xe0Var3.presentFragment(e90Var2);
                                        break;
                                    default:
                                        final ue0 ue0Var6 = ue0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ue0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ue0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.bd.M0(2131746036, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.bd.M0(2131746033, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.bd.M0(2131746034, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.se0
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        ue0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ue0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        k2.p1.v(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.l(R.drawable.msg_edit, org.telegram.messenger.bd.M0(2131751278, null), new Runnable() { // from class: org.telegram.ui.re0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i10) {
                                    case 0:
                                        final ue0 ue0Var2 = ue0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ue0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ue0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.bd.M0(2131751535, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.bd.M0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.se0
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        ue0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ue0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        k2.p1.v(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ue0 ue0Var3 = ue0Var;
                                        try {
                                            if (ue0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ue0Var3.n.link));
                                                org.telegram.ui.Components.fc.j(ue0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        ue0 ue0Var4 = ue0Var;
                                        xe0 xe0Var2 = ue0Var4.L;
                                        try {
                                            if (ue0Var4.n.link != null) {
                                                Context context2 = ue0Var4.getContext();
                                                String str2 = ue0Var4.n.link;
                                                xe0Var2.showDialog(new te0(ue0Var4, context2, str2, str2, xe0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        ue0 ue0Var5 = ue0Var;
                                        xe0 xe0Var3 = ue0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ue0Var5.n;
                                        e90 e90Var2 = new e90(1, xe0Var3.n);
                                        e90Var2.T = xe0Var3.t0;
                                        e90Var2.d0(tL_chatInviteExported2);
                                        xe0Var3.presentFragment(e90Var2);
                                        break;
                                    default:
                                        final ue0 ue0Var6 = ue0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ue0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ue0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.bd.M0(2131746036, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.bd.M0(2131746033, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.bd.M0(2131746034, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.se0
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        ue0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ue0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        k2.p1.v(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, !ue0Var.n.permanent && xe0Var.q0);
                        F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.re0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i3) {
                                    case 0:
                                        final ue0 ue0Var2 = ue0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ue0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ue0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.bd.M0(2131751535, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.bd.M0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.se0
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        ue0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ue0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        k2.p1.v(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ue0 ue0Var3 = ue0Var;
                                        try {
                                            if (ue0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ue0Var3.n.link));
                                                org.telegram.ui.Components.fc.j(ue0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        ue0 ue0Var4 = ue0Var;
                                        xe0 xe0Var2 = ue0Var4.L;
                                        try {
                                            if (ue0Var4.n.link != null) {
                                                Context context2 = ue0Var4.getContext();
                                                String str2 = ue0Var4.n.link;
                                                xe0Var2.showDialog(new te0(ue0Var4, context2, str2, str2, xe0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        ue0 ue0Var5 = ue0Var;
                                        xe0 xe0Var3 = ue0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ue0Var5.n;
                                        e90 e90Var2 = new e90(1, xe0Var3.n);
                                        e90Var2.T = xe0Var3.t0;
                                        e90Var2.d0(tL_chatInviteExported2);
                                        xe0Var3.presentFragment(e90Var2);
                                        break;
                                    default:
                                        final ue0 ue0Var6 = ue0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ue0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ue0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.bd.M0(2131746036, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.bd.M0(2131746033, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.bd.M0(2131746034, null), new org.telegram.ui.ActionBar.p1() { // from class: org.telegram.ui.se0
                                            @Override // org.telegram.ui.ActionBar.p1
                                            public final void g(org.telegram.ui.ActionBar.s1 s1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        ue0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ue0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        k2.p1.v(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, org.telegram.messenger.bd.M0(2131746033, null), xe0Var.q0, true);
                    }
                    F.W(xe0Var.b.U0(ue0Var, false));
                    F.Z();
                    return;
                }
                return;
            case 11:
                dg0 dg0Var = (dg0) this.b;
                long j10 = dg0Var.b;
                if (dg0Var.n.y4()) {
                    return;
                }
                if (dg0Var.getParentLayout().getFragmentStack().size() > 1) {
                    org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) dg0Var.getParentLayout().getFragmentStack().get(dg0Var.getParentLayout().getFragmentStack().size() - 2);
                    if ((d2Var instanceof wm) && ((wm) d2Var).e.id == j10) {
                        dg0Var.finishFragment();
                        return;
                    }
                }
                Bundle j11 = a1.g.j(j10, "chat_id");
                j11.putInt("message_id", dg0Var.c);
                j11.putBoolean("need_remove_previous_same_chat_activity", false);
                dg0Var.presentFragment(new wm(j11));
                return;
            case 12:
                ((org.telegram.ui.Cells.q8) this.b).setChecked(!r1.e.h);
                return;
            case 13:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.t4.a;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                alertDialog$Builder4.a.S = org.telegram.messenger.bd.M0(2131750594, null);
                alertDialog$Builder4.a.U = org.telegram.messenger.bd.M0(2131750593, null);
                alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131752041, null), null);
                alertDialog$Builder4.a.show();
                return;
            case 14:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i12 = passcodeActivity.y;
                if (i12 != 1) {
                    if (i12 == 2) {
                        passcodeActivity.u0();
                        return;
                    }
                    return;
                } else if (passcodeActivity.F == 0) {
                    passcodeActivity.v0();
                    return;
                } else {
                    passcodeActivity.u0();
                    return;
                }
            case 15:
                hi0 hi0Var = (hi0) this.b;
                if (hi0Var.a.getAnimatedDrawable().l0) {
                    return;
                }
                hi0Var.a.getAnimatedDrawable().N(0, false, false);
                hi0Var.a.d();
                return;
            case 16:
                ((PasskeysActivity) this.b).e0(view);
                return;
            case 17:
                uj0 uj0Var = (uj0) this.b;
                if (uj0Var.K) {
                    return;
                }
                int i13 = uj0Var.N;
                if ((i13 != 4 || uj0Var.M != 2) && i13 != 0) {
                    uj0Var.s();
                    return;
                }
                try {
                    PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                    intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + uj0Var.a);
                    intent.putExtra("android.intent.extra.TEXT", "Phone: " + uj0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + uj0Var.L);
                    uj0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    org.telegram.ui.Components.t4.t0(uj0Var.R, null, org.telegram.messenger.bd.M0(2131748207, null), null);
                    return;
                }
            case 18:
                hm0 hm0Var = (hm0) this.b;
                wm wmVar = hm0Var.G;
                if (wmVar != null && wmVar.c()) {
                    org.telegram.ui.Components.t4.K(hm0Var.getParentActivity(), wmVar.a(), new dm0(hm0Var, r9));
                    return;
                } else {
                    hm0Var.a0(hm0Var.b, hm0Var.c, true, 0);
                    hm0Var.finishFragment();
                    return;
                }
            case 19:
                sm0 sm0Var = (sm0) this.b;
                wm wmVar2 = sm0Var.V;
                if (wmVar2 == null || !wmVar2.c()) {
                    sm0Var.j0(0, true);
                    return;
                } else {
                    org.telegram.ui.Components.t4.K(sm0Var.getParentActivity(), wmVar2.a(), new lm0(sm0Var, r9));
                    return;
                }
            case 20:
                zp0 zp0Var = (zp0) this.b;
                if (zp0Var != null) {
                    zp0Var.z(0, org.telegram.messenger.g0.L(64.0f), false);
                    return;
                }
                return;
            case 21:
                n4 n4Var = (n4) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = (PhotoViewer) n4Var.e;
                int indexOf = photoViewer.h7.indexOf(tag);
                if (indexOf < 0) {
                    int R = photoViewer.d.R(tag);
                    if (R >= 0) {
                        photoViewer.q1.s(R);
                        if (R == 0) {
                            photoViewer.q1.g(0);
                        }
                        photoViewer.D3();
                        return;
                    }
                    return;
                }
                int k10 = photoViewer.d.k(indexOf, photoViewer.p1());
                boolean x10 = photoViewer.d.x(indexOf);
                if (indexOf == photoViewer.Q4) {
                    photoViewer.O0.b(x10, true);
                }
                if (k10 >= 0) {
                    photoViewer.q1.s(k10);
                    if (k10 == 0) {
                        photoViewer.q1.g(0);
                    }
                }
                photoViewer.D3();
                return;
            case 22:
                fr0 fr0Var = (fr0) this.b;
                boolean[] zArr = fr0Var.x;
                CharSequence[] charSequenceArr = fr0Var.w;
                if (view.getTag() != null) {
                    return;
                }
                view.setTag(1);
                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view.getParent();
                u4.d1 G = fr0Var.c.G(z5Var);
                if (G == null || (b10 = G.b()) == -1) {
                    return;
                }
                int i14 = b10 - fr0Var.o0;
                if (fr0Var.J && i14 < fr0Var.y) {
                    int i15 = -fr0Var.P;
                    fr0Var.P = i15;
                    org.telegram.messenger.g0.G3(i15, z5Var, null);
                    org.telegram.messenger.p2.E.a();
                    return;
                }
                fr0Var.b.s(b10);
                int i16 = i14 + 1;
                System.arraycopy(charSequenceArr, i16, charSequenceArr, i14, (charSequenceArr.length - 1) - i14);
                System.arraycopy(zArr, i16, zArr, i14, (zArr.length - 1) - i14);
                charSequenceArr[charSequenceArr.length - 1] = null;
                zArr[zArr.length - 1] = false;
                int i17 = fr0Var.E - 1;
                fr0Var.E = i17;
                if (fr0Var.r != null) {
                    int[] iArr = new int[i17];
                    while (r9 < i17) {
                        iArr[r9] = fr0Var.r[r9 >= i14 ? r9 + 1 : r9];
                        r9++;
                    }
                    fr0Var.r = iArr;
                }
                if (fr0Var.E == charSequenceArr.length - 1) {
                    fr0Var.b.i((fr0Var.o0 + charSequenceArr.length) - 1);
                }
                u4.d1 K = fr0Var.c.K(b10 - 1);
                EditTextBoldCursor textView = z5Var.getTextView();
                if (K != null) {
                    View view3 = K.a;
                    if (view3 instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view3).getTextView().requestFocus();
                        textView.clearFocus();
                        fr0Var.n0();
                        fr0Var.w0();
                        ow0Var = fr0Var.R;
                        if (ow0Var != null) {
                            ow0Var.f();
                            fr0Var.R.setDelegate(null);
                        }
                        fr0Var.b.g(fr0Var.q0);
                        return;
                    }
                }
                if (textView.isFocused()) {
                    org.telegram.messenger.g0.v1(textView);
                    fr0Var.p0(true);
                } else if (fr0Var.C0) {
                    fr0Var.p0(true);
                }
                textView.clearFocus();
                fr0Var.n0();
                fr0Var.w0();
                ow0Var = fr0Var.R;
                if (ow0Var != null) {
                }
                fr0Var.b.g(fr0Var.q0);
                return;
            case 23:
                ((pr0) this.b).c(true);
                return;
            case 24:
                ((pr0) ((ci.o4) this.b).c).c(true);
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                ms0 ms0Var = (ms0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                ms0 ms0Var2 = premiumPreviewFragment.f;
                if (ms0Var2 != null && (tL_premiumSubscriptionOption = ms0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
                    String str3 = org.telegram.messenger.r1.i().f;
                    r9 = (TextUtils.isEmpty(str3) && TextUtils.isEmpty(null)) ? 0 : 1;
                    boolean isEmpty = TextUtils.isEmpty(null);
                    if (r9 != 0 && !isEmpty) {
                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                    }
                    if (r9 == 0 && isEmpty) {
                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                    }
                    bVar = new ad.b(2);
                    bVar.b = str3;
                    bVar.c = 5;
                }
                PremiumPreviewFragment.p0(premiumPreviewFragment, ms0Var, "settings", bVar);
                return;
            case 26:
                PrivacyControlActivity privacyControlActivity = ((at0) this.b).d;
                privacyControlActivity.showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) privacyControlActivity, 27, false));
                return;
            case 27:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                int intValue = ((Integer) c2Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.a0;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                c2Var.c(z10, true);
                return;
            case 28:
                fx0 fx0Var = (fx0) this.b;
                ProxyListActivity proxyListActivity = fx0Var.s;
                org.telegram.messenger.zy zyVar = fx0Var.d;
                mx0 mx0Var = new mx0(null);
                mx0Var.e = new org.telegram.ui.Cells.x6[3];
                mx0Var.f = new org.telegram.ui.Cells.y8[2];
                mx0Var.s = new org.telegram.ui.Cells.h6[3];
                mx0Var.E = 1.0f;
                mx0Var.F = new float[2];
                mx0Var.G = true;
                mx0Var.M = new gx0(mx0Var);
                mx0Var.K = zyVar;
                proxyListActivity.presentFragment(mx0Var);
                return;
            default:
                dy0 dy0Var = (dy0) this.b;
                gi.d dVar = dy0Var.s;
                if (!dVar.d0 || dVar.R) {
                    return;
                }
                dVar.setLoading(true);
                ey0.I0(dy0Var.w, ((TextView) dy0Var.h.c).getText(), dy0Var.d.option, dy0Var.n.getText().toString());
                return;
        }
    }
}
