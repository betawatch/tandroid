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

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j40(Object obj, int i7) {
        this.a = i7;
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
        org.telegram.ui.Components.yw0 yw0Var;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        final int i7 = 4;
        final int i10 = 3;
        final int i11 = 2;
        com.google.android.gms.internal.clearcut.y0 y0Var = null;
        switch (this.a) {
            case 0:
                ((k40) this.b).b.a1(19);
                return;
            case 1:
                z40 z40Var = ((x40) this.b).J;
                z40Var.Y = null;
                z40Var.a0.b();
                z40Var.h.b();
                z40Var.p0();
                z40Var.w0();
                return;
            case 2:
                n50.f0(((l50) this.b).d, null);
                return;
            case 3:
                a60.a0((a60) this.b);
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.D0;
                launchActivity.G0 = null;
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
                k90 k90Var = (k90) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k90Var.getParentActivity());
                alertDialog$Builder.a.U = org.telegram.messenger.gd.M0(2131745831, null);
                alertDialog$Builder.a.S = org.telegram.messenger.gd.M0(2131745828, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.M0(2131745829, null), new a90(k90Var, 1 == true ? 1 : 0));
                alertDialog$Builder.h(org.telegram.messenger.gd.M0(2131752578, null), null);
                k90Var.showDialog(alertDialog$Builder.a);
                return;
            case 6:
                final hc0 hc0Var = (hc0) this.b;
                ee0 ee0Var = hc0Var.E;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ee0Var.getParentActivity());
                alertDialog$Builder2.a.S = org.telegram.messenger.gd.M0(2131745876, "RestorePasswordNoEmailTitle");
                alertDialog$Builder2.a.U = org.telegram.messenger.gd.M0(2131745880, "RestoreEmailTroubleText");
                alertDialog$Builder2.k(org.telegram.messenger.gd.M0(2131747638, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.gc0
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i12) {
                        switch (r2) {
                            case 0:
                                hc0Var.E.M1(6, true, new Bundle(), true);
                                break;
                            default:
                                hc0 hc0Var2 = hc0Var;
                                ee0.t0(hc0Var2.E, hc0Var2.r, hc0Var2.s, hc0Var2.w);
                                break;
                        }
                    }
                });
                String M0 = org.telegram.messenger.gd.M0(2131745922, null);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder2.h(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.gc0
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i12) {
                        switch (c10) {
                            case 0:
                                hc0Var.E.M1(6, true, new Bundle(), true);
                                break;
                            default:
                                hc0 hc0Var2 = hc0Var;
                                ee0.t0(hc0Var2.E, hc0Var2.r, hc0Var2.s, hc0Var2.w);
                                break;
                        }
                    }
                });
                Dialog showDialog = ee0Var.showDialog(alertDialog$Builder2.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            case 7:
                qc0 qc0Var = (qc0) this.b;
                ee0 ee0Var2 = qc0Var.H;
                if (ee0Var2.W.getTag() != null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ee0Var2.getParentActivity());
                alertDialog$Builder3.a.S = org.telegram.messenger.gd.M0(2131745904, "ResetMyAccountWarning");
                alertDialog$Builder3.a.U = org.telegram.messenger.gd.M0(2131745902, "ResetMyAccountWarningText");
                alertDialog$Builder3.k(org.telegram.messenger.gd.M0(2131745903, "ResetMyAccountWarningReset"), new zr(qc0Var, 21));
                alertDialog$Builder3.h(org.telegram.messenger.gd.M0(2131752578, "Cancel"), null);
                ee0Var2.showDialog(alertDialog$Builder3.a);
                return;
            case 8:
                sc0 sc0Var = (sc0) this.b;
                org.telegram.messenger.ks.e().b(new x4(sc0Var, i11), org.telegram.messenger.ks.f5);
                Context context = sc0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = org.telegram.messenger.s2.h;
                q6.m.f(str);
                hashSet.add(GoogleSignInOptions.x);
                if (hashSet.contains(GoogleSignInOptions.F)) {
                    Scope scope = GoogleSignInOptions.E;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.y);
                b9.k0 a10 = a8.v7.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a10.g().addOnCompleteListener(new at(24, sc0Var, a10));
                return;
            case 9:
                ((rd0) this.b).a();
                return;
            case 10:
                final df0 df0Var = (df0) this.b;
                gf0 gf0Var = df0Var.L;
                if (df0Var.n == null) {
                    return;
                }
                View view2 = gf0Var.fragmentView;
                if (view2 instanceof ViewGroup) {
                    org.telegram.ui.Components.y60 G = org.telegram.ui.Components.y60.G((ViewGroup) view2, null, df0Var);
                    if (df0Var.n.revoked) {
                        G.c(R.drawable.msg_delete, org.telegram.messenger.gd.M0(2131751587, null), new Runnable() { // from class: org.telegram.ui.af0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (r2) {
                                    case 0:
                                        final df0 df0Var2 = df0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = df0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(df0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.gd.M0(2131751523, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.gd.M0(2131751522, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131751587, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.bf0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i13) {
                                                switch (i12) {
                                                    case 0:
                                                        df0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        df0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752578, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        df0 df0Var3 = df0Var;
                                        try {
                                            if (df0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", df0Var3.n.link));
                                                org.telegram.ui.Components.lc.j(df0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        df0 df0Var4 = df0Var;
                                        gf0 gf0Var2 = df0Var4.L;
                                        try {
                                            if (df0Var4.n.link != null) {
                                                Context context2 = df0Var4.getContext();
                                                String str2 = df0Var4.n.link;
                                                gf0Var2.showDialog(new cf0(df0Var4, context2, str2, str2, gf0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        df0 df0Var5 = df0Var;
                                        gf0 gf0Var3 = df0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = df0Var5.n;
                                        k90 k90Var2 = new k90(1, gf0Var3.n);
                                        k90Var2.T = gf0Var3.t0;
                                        k90Var2.d0(tL_chatInviteExported2);
                                        gf0Var3.presentFragment(k90Var2);
                                        break;
                                    default:
                                        final df0 df0Var6 = df0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = df0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(df0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.gd.M0(2131745831, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.gd.M0(2131745828, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.gd.M0(2131745829, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.bf0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        df0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        df0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752578, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, true);
                    } else {
                        String M02 = org.telegram.messenger.gd.M0(2131751751, null);
                        final char c11 = 1 == true ? 1 : 0;
                        G.c(R.drawable.msg_copy, M02, new Runnable() { // from class: org.telegram.ui.af0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (c11) {
                                    case 0:
                                        final df0 df0Var2 = df0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = df0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(df0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.gd.M0(2131751523, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.gd.M0(2131751522, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131751587, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.bf0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        df0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        df0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752578, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        df0 df0Var3 = df0Var;
                                        try {
                                            if (df0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", df0Var3.n.link));
                                                org.telegram.ui.Components.lc.j(df0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        df0 df0Var4 = df0Var;
                                        gf0 gf0Var2 = df0Var4.L;
                                        try {
                                            if (df0Var4.n.link != null) {
                                                Context context2 = df0Var4.getContext();
                                                String str2 = df0Var4.n.link;
                                                gf0Var2.showDialog(new cf0(df0Var4, context2, str2, str2, gf0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        df0 df0Var5 = df0Var;
                                        gf0 gf0Var3 = df0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = df0Var5.n;
                                        k90 k90Var2 = new k90(1, gf0Var3.n);
                                        k90Var2.T = gf0Var3.t0;
                                        k90Var2.d0(tL_chatInviteExported2);
                                        gf0Var3.presentFragment(k90Var2);
                                        break;
                                    default:
                                        final df0 df0Var6 = df0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = df0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(df0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.gd.M0(2131745831, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.gd.M0(2131745828, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.gd.M0(2131745829, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.bf0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        df0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        df0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752578, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        G.c(R.drawable.msg_share, org.telegram.messenger.gd.M0(2131745263, null), new Runnable() { // from class: org.telegram.ui.af0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i11) {
                                    case 0:
                                        final df0 df0Var2 = df0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = df0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(df0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.gd.M0(2131751523, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.gd.M0(2131751522, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131751587, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.bf0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        df0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        df0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752578, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        df0 df0Var3 = df0Var;
                                        try {
                                            if (df0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", df0Var3.n.link));
                                                org.telegram.ui.Components.lc.j(df0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        df0 df0Var4 = df0Var;
                                        gf0 gf0Var2 = df0Var4.L;
                                        try {
                                            if (df0Var4.n.link != null) {
                                                Context context2 = df0Var4.getContext();
                                                String str2 = df0Var4.n.link;
                                                gf0Var2.showDialog(new cf0(df0Var4, context2, str2, str2, gf0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        df0 df0Var5 = df0Var;
                                        gf0 gf0Var3 = df0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = df0Var5.n;
                                        k90 k90Var2 = new k90(1, gf0Var3.n);
                                        k90Var2.T = gf0Var3.t0;
                                        k90Var2.d0(tL_chatInviteExported2);
                                        gf0Var3.presentFragment(k90Var2);
                                        break;
                                    default:
                                        final df0 df0Var6 = df0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = df0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(df0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.gd.M0(2131745831, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.gd.M0(2131745828, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.gd.M0(2131745829, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.bf0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        df0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        df0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752578, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        G.l(R.drawable.msg_edit, org.telegram.messenger.gd.M0(2131751266, null), new Runnable() { // from class: org.telegram.ui.af0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i10) {
                                    case 0:
                                        final df0 df0Var2 = df0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = df0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(df0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.gd.M0(2131751523, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.gd.M0(2131751522, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131751587, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.bf0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        df0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        df0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752578, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        df0 df0Var3 = df0Var;
                                        try {
                                            if (df0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", df0Var3.n.link));
                                                org.telegram.ui.Components.lc.j(df0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        df0 df0Var4 = df0Var;
                                        gf0 gf0Var2 = df0Var4.L;
                                        try {
                                            if (df0Var4.n.link != null) {
                                                Context context2 = df0Var4.getContext();
                                                String str2 = df0Var4.n.link;
                                                gf0Var2.showDialog(new cf0(df0Var4, context2, str2, str2, gf0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        df0 df0Var5 = df0Var;
                                        gf0 gf0Var3 = df0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = df0Var5.n;
                                        k90 k90Var2 = new k90(1, gf0Var3.n);
                                        k90Var2.T = gf0Var3.t0;
                                        k90Var2.d0(tL_chatInviteExported2);
                                        gf0Var3.presentFragment(k90Var2);
                                        break;
                                    default:
                                        final df0 df0Var6 = df0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = df0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(df0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.gd.M0(2131745831, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.gd.M0(2131745828, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.gd.M0(2131745829, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.bf0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        df0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        df0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752578, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, !df0Var.n.permanent && gf0Var.q0);
                        G.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.af0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i7) {
                                    case 0:
                                        final df0 df0Var2 = df0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = df0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(df0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.gd.M0(2131751523, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.gd.M0(2131751522, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131751587, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.bf0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        df0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        df0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752578, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        df0 df0Var3 = df0Var;
                                        try {
                                            if (df0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", df0Var3.n.link));
                                                org.telegram.ui.Components.lc.j(df0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        df0 df0Var4 = df0Var;
                                        gf0 gf0Var2 = df0Var4.L;
                                        try {
                                            if (df0Var4.n.link != null) {
                                                Context context2 = df0Var4.getContext();
                                                String str2 = df0Var4.n.link;
                                                gf0Var2.showDialog(new cf0(df0Var4, context2, str2, str2, gf0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        df0 df0Var5 = df0Var;
                                        gf0 gf0Var3 = df0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = df0Var5.n;
                                        k90 k90Var2 = new k90(1, gf0Var3.n);
                                        k90Var2.T = gf0Var3.t0;
                                        k90Var2.d0(tL_chatInviteExported2);
                                        gf0Var3.presentFragment(k90Var2);
                                        break;
                                    default:
                                        final df0 df0Var6 = df0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = df0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(df0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.gd.M0(2131745831, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.gd.M0(2131745828, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.gd.M0(2131745829, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.bf0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void h(org.telegram.ui.ActionBar.u1 u1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        df0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        df0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752578, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, org.telegram.messenger.gd.M0(2131745828, null), gf0Var.q0, true);
                    }
                    G.X(gf0Var.b.U0(df0Var, false));
                    G.a0();
                    return;
                }
                return;
            case 11:
                og0 og0Var = (og0) this.b;
                long j3 = og0Var.b;
                if (og0Var.n.x4()) {
                    return;
                }
                if (og0Var.getParentLayout().getFragmentStack().size() > 1) {
                    org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) og0Var.getParentLayout().getFragmentStack().get(og0Var.getParentLayout().getFragmentStack().size() - 2);
                    if ((h2Var instanceof bn) && ((bn) h2Var).e.id == j3) {
                        og0Var.finishFragment();
                        return;
                    }
                }
                Bundle j10 = a8.p0.j(j3, "chat_id");
                j10.putInt("message_id", og0Var.c);
                j10.putBoolean("need_remove_previous_same_chat_activity", false);
                og0Var.presentFragment(new bn(j10));
                return;
            case 12:
                ((org.telegram.ui.Cells.s8) this.b).setChecked(!r1.e.h);
                return;
            case 13:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.b5.a;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                alertDialog$Builder4.a.S = org.telegram.messenger.gd.M0(2131750577, null);
                alertDialog$Builder4.a.U = org.telegram.messenger.gd.M0(2131750576, null);
                alertDialog$Builder4.k(org.telegram.messenger.gd.M0(2131752030, null), null);
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
                oi0 oi0Var = (oi0) this.b;
                if (oi0Var.a.getAnimatedDrawable().l0) {
                    return;
                }
                oi0Var.a.getAnimatedDrawable().N(0, false, false);
                oi0Var.a.d();
                return;
            case 16:
                ((PasskeysActivity) this.b).e0(view);
                return;
            case 17:
                dk0 dk0Var = (dk0) this.b;
                if (dk0Var.K) {
                    return;
                }
                int i13 = dk0Var.N;
                if ((i13 != 4 || dk0Var.M != 2) && i13 != 0) {
                    dk0Var.s();
                    return;
                }
                try {
                    PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                    intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + dk0Var.a);
                    intent.putExtra("android.intent.extra.TEXT", "Phone: " + dk0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + dk0Var.L);
                    dk0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    org.telegram.ui.Components.b5.r0(dk0Var.R, null, org.telegram.messenger.gd.M0(2131748007, null), null);
                    return;
                }
            case 18:
                qm0 qm0Var = (qm0) this.b;
                bn bnVar = qm0Var.G;
                if (bnVar != null && bnVar.c()) {
                    org.telegram.ui.Components.b5.I(qm0Var.getParentActivity(), bnVar.a(), new mm0(qm0Var, r9));
                    return;
                } else {
                    qm0Var.a0(qm0Var.b, qm0Var.c, true, 0);
                    qm0Var.finishFragment();
                    return;
                }
            case 19:
                cn0 cn0Var = (cn0) this.b;
                bn bnVar2 = cn0Var.V;
                if (bnVar2 == null || !bnVar2.c()) {
                    cn0Var.j0(0, true);
                    return;
                } else {
                    org.telegram.ui.Components.b5.I(cn0Var.getParentActivity(), bnVar2.a(), new um0(cn0Var, r9));
                    return;
                }
            case 20:
                jq0 jq0Var = (jq0) this.b;
                if (jq0Var != null) {
                    jq0Var.z(0, org.telegram.messenger.g0.L(64.0f), false);
                    return;
                }
                return;
            case 21:
                l4 l4Var = (l4) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = (PhotoViewer) l4Var.e;
                int indexOf = photoViewer.g7.indexOf(tag);
                if (indexOf < 0) {
                    int R = photoViewer.d.R(tag);
                    if (R >= 0) {
                        photoViewer.q1.s(R);
                        if (R == 0) {
                            photoViewer.q1.g(0);
                        }
                        photoViewer.z3();
                        return;
                    }
                    return;
                }
                int k10 = photoViewer.d.k(indexOf, photoViewer.j1());
                boolean x10 = photoViewer.d.x(indexOf);
                if (indexOf == photoViewer.P4) {
                    photoViewer.O0.b(x10, true);
                }
                if (k10 >= 0) {
                    photoViewer.q1.s(k10);
                    if (k10 == 0) {
                        photoViewer.q1.g(0);
                    }
                }
                photoViewer.z3();
                return;
            case 22:
                pr0 pr0Var = (pr0) this.b;
                boolean[] zArr = pr0Var.x;
                CharSequence[] charSequenceArr = pr0Var.w;
                if (view.getTag() != null) {
                    return;
                }
                view.setTag(1);
                org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view.getParent();
                v4.f1 G2 = pr0Var.c.G(b6Var);
                if (G2 == null || (b10 = G2.b()) == -1) {
                    return;
                }
                int i14 = b10 - pr0Var.o0;
                if (pr0Var.J && i14 < pr0Var.y) {
                    int i15 = -pr0Var.P;
                    pr0Var.P = i15;
                    org.telegram.messenger.g0.E3(i15, b6Var, null);
                    org.telegram.messenger.q2.E.a();
                    return;
                }
                pr0Var.b.s(b10);
                int i16 = i14 + 1;
                System.arraycopy(charSequenceArr, i16, charSequenceArr, i14, (charSequenceArr.length - 1) - i14);
                System.arraycopy(zArr, i16, zArr, i14, (zArr.length - 1) - i14);
                charSequenceArr[charSequenceArr.length - 1] = null;
                zArr[zArr.length - 1] = false;
                int i17 = pr0Var.E - 1;
                pr0Var.E = i17;
                if (pr0Var.r != null) {
                    int[] iArr = new int[i17];
                    while (r9 < i17) {
                        iArr[r9] = pr0Var.r[r9 >= i14 ? r9 + 1 : r9];
                        r9++;
                    }
                    pr0Var.r = iArr;
                }
                if (pr0Var.E == charSequenceArr.length - 1) {
                    pr0Var.b.i((pr0Var.o0 + charSequenceArr.length) - 1);
                }
                v4.f1 K = pr0Var.c.K(b10 - 1);
                EditTextBoldCursor textView = b6Var.getTextView();
                if (K != null) {
                    View view3 = K.a;
                    if (view3 instanceof org.telegram.ui.Cells.b6) {
                        ((org.telegram.ui.Cells.b6) view3).getTextView().requestFocus();
                        textView.clearFocus();
                        pr0Var.n0();
                        pr0Var.w0();
                        yw0Var = pr0Var.R;
                        if (yw0Var != null) {
                            yw0Var.f();
                            pr0Var.R.setDelegate(null);
                        }
                        pr0Var.b.g(pr0Var.q0);
                        return;
                    }
                }
                if (textView.isFocused()) {
                    org.telegram.messenger.g0.v1(textView);
                    pr0Var.p0(true);
                } else if (pr0Var.C0) {
                    pr0Var.p0(true);
                }
                textView.clearFocus();
                pr0Var.n0();
                pr0Var.w0();
                yw0Var = pr0Var.R;
                if (yw0Var != null) {
                }
                pr0Var.b.g(pr0Var.q0);
                return;
            case 23:
                ((as0) this.b).c(true);
                return;
            case 24:
                ((as0) ((di.i4) this.b).c).c(true);
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                xs0 xs0Var = (xs0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                xs0 xs0Var2 = premiumPreviewFragment.f;
                if (xs0Var2 != null && (tL_premiumSubscriptionOption = xs0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
                    String str3 = org.telegram.messenger.r1.i().f;
                    r9 = (TextUtils.isEmpty(str3) && TextUtils.isEmpty(null)) ? 0 : 1;
                    boolean isEmpty = TextUtils.isEmpty(null);
                    if (r9 != 0 && !isEmpty) {
                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                    }
                    if (r9 == 0 && isEmpty) {
                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                    }
                    y0Var = new com.google.android.gms.internal.clearcut.y0(2);
                    y0Var.c = str3;
                    y0Var.b = 5;
                }
                PremiumPreviewFragment.p0(premiumPreviewFragment, xs0Var, "settings", y0Var);
                return;
            case 26:
                PrivacyControlActivity privacyControlActivity = ((kt0) this.b).d;
                privacyControlActivity.showDialog(new ug.z0((org.telegram.ui.ActionBar.h2) privacyControlActivity, 27, false));
                return;
            case 27:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.d2 d2Var = (org.telegram.ui.Cells.d2) view;
                int intValue = ((Integer) d2Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.a0;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                d2Var.c(z10, true);
                return;
            case 28:
                rx0 rx0Var = (rx0) this.b;
                ProxyListActivity proxyListActivity = rx0Var.s;
                org.telegram.messenger.az azVar = rx0Var.d;
                yx0 yx0Var = new yx0(null);
                yx0Var.e = new org.telegram.ui.Cells.z6[3];
                yx0Var.f = new org.telegram.ui.Cells.a9[2];
                yx0Var.s = new org.telegram.ui.Cells.j6[3];
                yx0Var.E = 1.0f;
                yx0Var.F = new float[2];
                yx0Var.G = true;
                yx0Var.M = new sx0(yx0Var);
                yx0Var.K = azVar;
                proxyListActivity.presentFragment(yx0Var);
                return;
            default:
                py0 py0Var = (py0) this.b;
                hi.d dVar = py0Var.s;
                if (!dVar.e0 || dVar.R) {
                    return;
                }
                dVar.setLoading(true);
                qy0.J0(py0Var.w, ((TextView) py0Var.h.c).getText(), py0Var.d.option, py0Var.n.getText().toString());
                return;
        }
    }
}
