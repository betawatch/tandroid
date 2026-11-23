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

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i40(Object obj, int i7) {
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
        org.telegram.ui.Components.zw0 zw0Var;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        final int i7 = 4;
        final int i10 = 3;
        final int i11 = 2;
        com.google.android.gms.internal.clearcut.y0 y0Var = null;
        switch (this.a) {
            case 0:
                ((j40) this.b).b.a1(19);
                return;
            case 1:
                y40 y40Var = ((w40) this.b).J;
                y40Var.Y = null;
                y40Var.a0.b();
                y40Var.h.b();
                y40Var.p0();
                y40Var.w0();
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
                j90 j90Var = (j90) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j90Var.getParentActivity());
                alertDialog$Builder.a.U = org.telegram.messenger.gd.N0(2131745830, null);
                alertDialog$Builder.a.S = org.telegram.messenger.gd.N0(2131745827, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131745828, null), new z80(j90Var, 1 == true ? 1 : 0));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                j90Var.showDialog(alertDialog$Builder.a);
                return;
            case 6:
                final gc0 gc0Var = (gc0) this.b;
                de0 de0Var = gc0Var.E;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(de0Var.getParentActivity());
                alertDialog$Builder2.a.S = org.telegram.messenger.gd.N0(2131745875, "RestorePasswordNoEmailTitle");
                alertDialog$Builder2.a.U = org.telegram.messenger.gd.N0(2131745879, "RestoreEmailTroubleText");
                alertDialog$Builder2.k(org.telegram.messenger.gd.N0(2131747637, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.fc0
                    @Override // org.telegram.ui.ActionBar.q1
                    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i12) {
                        switch (r2) {
                            case 0:
                                gc0Var.E.M1(6, true, new Bundle(), true);
                                break;
                            default:
                                gc0 gc0Var2 = gc0Var;
                                de0.t0(gc0Var2.E, gc0Var2.r, gc0Var2.s, gc0Var2.w);
                                break;
                        }
                    }
                });
                String N0 = org.telegram.messenger.gd.N0(2131745921, null);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder2.h(N0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.fc0
                    @Override // org.telegram.ui.ActionBar.q1
                    public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i12) {
                        switch (c10) {
                            case 0:
                                gc0Var.E.M1(6, true, new Bundle(), true);
                                break;
                            default:
                                gc0 gc0Var2 = gc0Var;
                                de0.t0(gc0Var2.E, gc0Var2.r, gc0Var2.s, gc0Var2.w);
                                break;
                        }
                    }
                });
                Dialog showDialog = de0Var.showDialog(alertDialog$Builder2.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            case 7:
                pc0 pc0Var = (pc0) this.b;
                de0 de0Var2 = pc0Var.H;
                if (de0Var2.W.getTag() != null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(de0Var2.getParentActivity());
                alertDialog$Builder3.a.S = org.telegram.messenger.gd.N0(2131745903, "ResetMyAccountWarning");
                alertDialog$Builder3.a.U = org.telegram.messenger.gd.N0(2131745901, "ResetMyAccountWarningText");
                alertDialog$Builder3.k(org.telegram.messenger.gd.N0(2131745902, "ResetMyAccountWarningReset"), new zr(pc0Var, 21));
                alertDialog$Builder3.h(org.telegram.messenger.gd.N0(2131752577, "Cancel"), null);
                de0Var2.showDialog(alertDialog$Builder3.a);
                return;
            case 8:
                rc0 rc0Var = (rc0) this.b;
                org.telegram.messenger.ks.e().b(new x4(rc0Var, i11), org.telegram.messenger.ks.f5);
                Context context = rc0Var.getContext();
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
                b9.j0 a10 = a8.w7.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a10.g().addOnCompleteListener(new zs(24, rc0Var, a10));
                return;
            case 9:
                ((pd0) this.b).a();
                return;
            case 10:
                final bf0 bf0Var = (bf0) this.b;
                ef0 ef0Var = bf0Var.L;
                if (bf0Var.n == null) {
                    return;
                }
                View view2 = ef0Var.fragmentView;
                if (view2 instanceof ViewGroup) {
                    org.telegram.ui.Components.x60 G = org.telegram.ui.Components.x60.G((ViewGroup) view2, null, bf0Var);
                    if (bf0Var.n.revoked) {
                        G.c(R.drawable.msg_delete, org.telegram.messenger.gd.N0(2131751586, null), new Runnable() { // from class: org.telegram.ui.ye0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (r2) {
                                    case 0:
                                        final bf0 bf0Var2 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = bf0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bf0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.gd.N0(2131751522, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.gd.N0(2131751521, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i13) {
                                                switch (i12) {
                                                    case 0:
                                                        bf0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        bf0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752577, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        bf0 bf0Var3 = bf0Var;
                                        try {
                                            if (bf0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bf0Var3.n.link));
                                                org.telegram.ui.Components.kc.j(bf0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        bf0 bf0Var4 = bf0Var;
                                        ef0 ef0Var2 = bf0Var4.L;
                                        try {
                                            if (bf0Var4.n.link != null) {
                                                Context context2 = bf0Var4.getContext();
                                                String str2 = bf0Var4.n.link;
                                                ef0Var2.showDialog(new af0(bf0Var4, context2, str2, str2, ef0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        bf0 bf0Var5 = bf0Var;
                                        ef0 ef0Var3 = bf0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bf0Var5.n;
                                        j90 j90Var2 = new j90(1, ef0Var3.n);
                                        j90Var2.T = ef0Var3.t0;
                                        j90Var2.d0(tL_chatInviteExported2);
                                        ef0Var3.presentFragment(j90Var2);
                                        break;
                                    default:
                                        final bf0 bf0Var6 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bf0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(bf0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.gd.N0(2131745830, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.gd.N0(2131745827, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.gd.N0(2131745828, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        bf0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        bf0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752577, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, true);
                    } else {
                        String N02 = org.telegram.messenger.gd.N0(2131751750, null);
                        final char c11 = 1 == true ? 1 : 0;
                        G.c(R.drawable.msg_copy, N02, new Runnable() { // from class: org.telegram.ui.ye0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (c11) {
                                    case 0:
                                        final bf0 bf0Var2 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = bf0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bf0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.gd.N0(2131751522, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.gd.N0(2131751521, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        bf0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        bf0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752577, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        bf0 bf0Var3 = bf0Var;
                                        try {
                                            if (bf0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bf0Var3.n.link));
                                                org.telegram.ui.Components.kc.j(bf0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        bf0 bf0Var4 = bf0Var;
                                        ef0 ef0Var2 = bf0Var4.L;
                                        try {
                                            if (bf0Var4.n.link != null) {
                                                Context context2 = bf0Var4.getContext();
                                                String str2 = bf0Var4.n.link;
                                                ef0Var2.showDialog(new af0(bf0Var4, context2, str2, str2, ef0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        bf0 bf0Var5 = bf0Var;
                                        ef0 ef0Var3 = bf0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bf0Var5.n;
                                        j90 j90Var2 = new j90(1, ef0Var3.n);
                                        j90Var2.T = ef0Var3.t0;
                                        j90Var2.d0(tL_chatInviteExported2);
                                        ef0Var3.presentFragment(j90Var2);
                                        break;
                                    default:
                                        final bf0 bf0Var6 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bf0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(bf0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.gd.N0(2131745830, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.gd.N0(2131745827, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.gd.N0(2131745828, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        bf0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        bf0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752577, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        G.c(R.drawable.msg_share, org.telegram.messenger.gd.N0(2131745262, null), new Runnable() { // from class: org.telegram.ui.ye0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i11) {
                                    case 0:
                                        final bf0 bf0Var2 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = bf0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bf0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.gd.N0(2131751522, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.gd.N0(2131751521, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        bf0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        bf0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752577, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        bf0 bf0Var3 = bf0Var;
                                        try {
                                            if (bf0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bf0Var3.n.link));
                                                org.telegram.ui.Components.kc.j(bf0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        bf0 bf0Var4 = bf0Var;
                                        ef0 ef0Var2 = bf0Var4.L;
                                        try {
                                            if (bf0Var4.n.link != null) {
                                                Context context2 = bf0Var4.getContext();
                                                String str2 = bf0Var4.n.link;
                                                ef0Var2.showDialog(new af0(bf0Var4, context2, str2, str2, ef0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        bf0 bf0Var5 = bf0Var;
                                        ef0 ef0Var3 = bf0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bf0Var5.n;
                                        j90 j90Var2 = new j90(1, ef0Var3.n);
                                        j90Var2.T = ef0Var3.t0;
                                        j90Var2.d0(tL_chatInviteExported2);
                                        ef0Var3.presentFragment(j90Var2);
                                        break;
                                    default:
                                        final bf0 bf0Var6 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bf0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(bf0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.gd.N0(2131745830, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.gd.N0(2131745827, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.gd.N0(2131745828, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        bf0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        bf0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752577, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        G.l(R.drawable.msg_edit, org.telegram.messenger.gd.N0(2131751265, null), new Runnable() { // from class: org.telegram.ui.ye0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i10) {
                                    case 0:
                                        final bf0 bf0Var2 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = bf0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bf0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.gd.N0(2131751522, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.gd.N0(2131751521, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        bf0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        bf0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752577, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        bf0 bf0Var3 = bf0Var;
                                        try {
                                            if (bf0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bf0Var3.n.link));
                                                org.telegram.ui.Components.kc.j(bf0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        bf0 bf0Var4 = bf0Var;
                                        ef0 ef0Var2 = bf0Var4.L;
                                        try {
                                            if (bf0Var4.n.link != null) {
                                                Context context2 = bf0Var4.getContext();
                                                String str2 = bf0Var4.n.link;
                                                ef0Var2.showDialog(new af0(bf0Var4, context2, str2, str2, ef0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        bf0 bf0Var5 = bf0Var;
                                        ef0 ef0Var3 = bf0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bf0Var5.n;
                                        j90 j90Var2 = new j90(1, ef0Var3.n);
                                        j90Var2.T = ef0Var3.t0;
                                        j90Var2.d0(tL_chatInviteExported2);
                                        ef0Var3.presentFragment(j90Var2);
                                        break;
                                    default:
                                        final bf0 bf0Var6 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bf0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(bf0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.gd.N0(2131745830, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.gd.N0(2131745827, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.gd.N0(2131745828, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        bf0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        bf0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752577, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, !bf0Var.n.permanent && ef0Var.q0);
                        G.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.ye0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i7) {
                                    case 0:
                                        final bf0 bf0Var2 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = bf0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bf0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.gd.N0(2131751522, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.gd.N0(2131751521, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131751586, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        bf0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        bf0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752577, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        bf0 bf0Var3 = bf0Var;
                                        try {
                                            if (bf0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bf0Var3.n.link));
                                                org.telegram.ui.Components.kc.j(bf0Var3.L).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        bf0 bf0Var4 = bf0Var;
                                        ef0 ef0Var2 = bf0Var4.L;
                                        try {
                                            if (bf0Var4.n.link != null) {
                                                Context context2 = bf0Var4.getContext();
                                                String str2 = bf0Var4.n.link;
                                                ef0Var2.showDialog(new af0(bf0Var4, context2, str2, str2, ef0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        bf0 bf0Var5 = bf0Var;
                                        ef0 ef0Var3 = bf0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bf0Var5.n;
                                        j90 j90Var2 = new j90(1, ef0Var3.n);
                                        j90Var2.T = ef0Var3.t0;
                                        j90Var2.d0(tL_chatInviteExported2);
                                        ef0Var3.presentFragment(j90Var2);
                                        break;
                                    default:
                                        final bf0 bf0Var6 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bf0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(bf0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.gd.N0(2131745830, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.gd.N0(2131745827, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.gd.N0(2131745828, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void i(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        bf0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        bf0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.y(null, 2131752577, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, org.telegram.messenger.gd.N0(2131745827, null), ef0Var.q0, true);
                    }
                    G.X(ef0Var.b.U0(bf0Var, false));
                    G.a0();
                    return;
                }
                return;
            case 11:
                mg0 mg0Var = (mg0) this.b;
                long j3 = mg0Var.b;
                if (mg0Var.n.x4()) {
                    return;
                }
                if (mg0Var.getParentLayout().getFragmentStack().size() > 1) {
                    org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) mg0Var.getParentLayout().getFragmentStack().get(mg0Var.getParentLayout().getFragmentStack().size() - 2);
                    if ((g2Var instanceof bn) && ((bn) g2Var).e.id == j3) {
                        mg0Var.finishFragment();
                        return;
                    }
                }
                Bundle j10 = a8.p0.j(j3, "chat_id");
                j10.putInt("message_id", mg0Var.c);
                j10.putBoolean("need_remove_previous_same_chat_activity", false);
                mg0Var.presentFragment(new bn(j10));
                return;
            case 12:
                ((org.telegram.ui.Cells.r8) this.b).setChecked(!r1.e.h);
                return;
            case 13:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.b5.a;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                alertDialog$Builder4.a.S = org.telegram.messenger.gd.N0(2131750576, null);
                alertDialog$Builder4.a.U = org.telegram.messenger.gd.N0(2131750575, null);
                alertDialog$Builder4.k(org.telegram.messenger.gd.N0(2131752029, null), null);
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
                mi0 mi0Var = (mi0) this.b;
                if (mi0Var.a.getAnimatedDrawable().l0) {
                    return;
                }
                mi0Var.a.getAnimatedDrawable().N(0, false, false);
                mi0Var.a.d();
                return;
            case 16:
                ((PasskeysActivity) this.b).e0(view);
                return;
            case 17:
                bk0 bk0Var = (bk0) this.b;
                if (bk0Var.K) {
                    return;
                }
                int i13 = bk0Var.N;
                if ((i13 != 4 || bk0Var.M != 2) && i13 != 0) {
                    bk0Var.s();
                    return;
                }
                try {
                    PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                    intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + bk0Var.a);
                    intent.putExtra("android.intent.extra.TEXT", "Phone: " + bk0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + bk0Var.L);
                    bk0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    org.telegram.ui.Components.b5.r0(bk0Var.R, null, org.telegram.messenger.gd.N0(2131748006, null), null);
                    return;
                }
            case 18:
                om0 om0Var = (om0) this.b;
                bn bnVar = om0Var.G;
                if (bnVar != null && bnVar.c()) {
                    org.telegram.ui.Components.b5.I(om0Var.getParentActivity(), bnVar.a(), new km0(om0Var, r9));
                    return;
                } else {
                    om0Var.a0(om0Var.b, om0Var.c, true, 0);
                    om0Var.finishFragment();
                    return;
                }
            case 19:
                an0 an0Var = (an0) this.b;
                bn bnVar2 = an0Var.V;
                if (bnVar2 == null || !bnVar2.c()) {
                    an0Var.j0(0, true);
                    return;
                } else {
                    org.telegram.ui.Components.b5.I(an0Var.getParentActivity(), bnVar2.a(), new sm0(an0Var, r9));
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
                        photoViewer.B3();
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
                photoViewer.B3();
                return;
            case 22:
                pr0 pr0Var = (pr0) this.b;
                boolean[] zArr = pr0Var.x;
                CharSequence[] charSequenceArr = pr0Var.w;
                if (view.getTag() != null) {
                    return;
                }
                view.setTag(1);
                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view.getParent();
                v4.f1 G2 = pr0Var.c.G(a6Var);
                if (G2 == null || (b10 = G2.b()) == -1) {
                    return;
                }
                int i14 = b10 - pr0Var.o0;
                if (pr0Var.J && i14 < pr0Var.y) {
                    int i15 = -pr0Var.P;
                    pr0Var.P = i15;
                    org.telegram.messenger.g0.E3(i15, a6Var, null);
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
                EditTextBoldCursor textView = a6Var.getTextView();
                if (K != null) {
                    View view3 = K.a;
                    if (view3 instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view3).getTextView().requestFocus();
                        textView.clearFocus();
                        pr0Var.n0();
                        pr0Var.w0();
                        zw0Var = pr0Var.R;
                        if (zw0Var != null) {
                            zw0Var.f();
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
                zw0Var = pr0Var.R;
                if (zw0Var != null) {
                }
                pr0Var.b.g(pr0Var.q0);
                return;
            case 23:
                ((zr0) this.b).c(true);
                return;
            case 24:
                ((zr0) ((di.i4) this.b).c).c(true);
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                ws0 ws0Var = (ws0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                ws0 ws0Var2 = premiumPreviewFragment.f;
                if (ws0Var2 != null && (tL_premiumSubscriptionOption = ws0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                PremiumPreviewFragment.p0(premiumPreviewFragment, ws0Var, "settings", y0Var);
                return;
            case 26:
                PrivacyControlActivity privacyControlActivity = ((jt0) this.b).d;
                privacyControlActivity.showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) privacyControlActivity, 27, false));
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
                px0 px0Var = (px0) this.b;
                ProxyListActivity proxyListActivity = px0Var.s;
                org.telegram.messenger.az azVar = px0Var.d;
                wx0 wx0Var = new wx0(null);
                wx0Var.e = new org.telegram.ui.Cells.y6[3];
                wx0Var.f = new org.telegram.ui.Cells.z8[2];
                wx0Var.s = new org.telegram.ui.Cells.i6[3];
                wx0Var.E = 1.0f;
                wx0Var.F = new float[2];
                wx0Var.G = true;
                wx0Var.M = new qx0(wx0Var);
                wx0Var.K = azVar;
                proxyListActivity.presentFragment(wx0Var);
                return;
            default:
                oy0 oy0Var = (oy0) this.b;
                hi.e eVar = oy0Var.s;
                if (!eVar.e0 || eVar.R) {
                    return;
                }
                eVar.setLoading(true);
                py0.J0(oy0Var.w, ((TextView) oy0Var.h.c).getText(), oy0Var.d.option, oy0Var.n.getText().toString());
                return;
        }
    }
}
