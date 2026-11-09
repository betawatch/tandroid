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

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class i40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i40(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e4  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.pw0 pw0Var;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        int i7 = 21;
        final int i10 = 4;
        final int i11 = 3;
        final int i12 = 2;
        com.google.android.gms.internal.clearcut.z0 z0Var = null;
        switch (this.a) {
            case 0:
                ((j40) this.b).b.a1(19);
                return;
            case 1:
                y40 y40Var = ((w40) this.b).I;
                y40Var.X = null;
                y40Var.Z.b();
                y40Var.h.b();
                y40Var.p0();
                y40Var.w0();
                return;
            case 2:
                o50.f0(((m50) this.b).d, null);
                return;
            case 3:
                b60.a0((b60) this.b);
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.C0;
                launchActivity.F0 = null;
                launchActivity.t0(new LanguageSelectActivity());
                while (r10 < arrayList.size()) {
                    if (((Dialog) arrayList.get(r10)).isShowing()) {
                        ((Dialog) arrayList.get(r10)).dismiss();
                    }
                    r10++;
                }
                arrayList.clear();
                return;
            case 5:
                j90 j90Var = (j90) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(j90Var.getParentActivity());
                alertDialog$Builder.a.T = org.telegram.messenger.id.M0(2131746026, null);
                alertDialog$Builder.a.R = org.telegram.messenger.id.M0(2131746023, null);
                alertDialog$Builder.k(org.telegram.messenger.id.M0(2131746024, null), new z80(j90Var, 1 == true ? 1 : 0));
                alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                j90Var.showDialog(alertDialog$Builder.a);
                return;
            case 6:
                final jc0 jc0Var = (jc0) this.b;
                ee0 ee0Var = jc0Var.D;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ee0Var.getParentActivity());
                alertDialog$Builder2.a.R = org.telegram.messenger.id.M0(2131746071, "RestorePasswordNoEmailTitle");
                alertDialog$Builder2.a.T = org.telegram.messenger.id.M0(2131746075, "RestoreEmailTroubleText");
                alertDialog$Builder2.k(org.telegram.messenger.id.M0(2131747831, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ic0
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i13) {
                        switch (r2) {
                            case 0:
                                jc0Var.D.M1(6, true, new Bundle(), true);
                                break;
                            default:
                                jc0 jc0Var2 = jc0Var;
                                ee0.t0(jc0Var2.D, jc0Var2.r, jc0Var2.s, jc0Var2.w);
                                break;
                        }
                    }
                });
                String M0 = org.telegram.messenger.id.M0(2131746117, null);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder2.h(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ic0
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i13) {
                        switch (c10) {
                            case 0:
                                jc0Var.D.M1(6, true, new Bundle(), true);
                                break;
                            default:
                                jc0 jc0Var2 = jc0Var;
                                ee0.t0(jc0Var2.D, jc0Var2.r, jc0Var2.s, jc0Var2.w);
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
                sc0 sc0Var = (sc0) this.b;
                ee0 ee0Var2 = sc0Var.G;
                if (ee0Var2.V.getTag() != null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ee0Var2.getParentActivity());
                alertDialog$Builder3.a.R = org.telegram.messenger.id.M0(2131746099, "ResetMyAccountWarning");
                alertDialog$Builder3.a.T = org.telegram.messenger.id.M0(2131746097, "ResetMyAccountWarningText");
                alertDialog$Builder3.k(org.telegram.messenger.id.M0(2131746098, "ResetMyAccountWarningReset"), new yr(sc0Var, i7));
                alertDialog$Builder3.h(org.telegram.messenger.id.M0(2131752589, "Cancel"), null);
                ee0Var2.showDialog(alertDialog$Builder3.a);
                return;
            case 8:
                uc0 uc0Var = (uc0) this.b;
                org.telegram.messenger.qs.e().b(new x4(uc0Var, i12), org.telegram.messenger.qs.c5);
                Context context = uc0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = org.telegram.messenger.r2.h;
                q6.m.e(str);
                hashSet.add(GoogleSignInOptions.x);
                if (hashSet.contains(GoogleSignInOptions.E)) {
                    Scope scope = GoogleSignInOptions.D;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.y);
                b9.j0 a10 = a8.u7.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a10.g().addOnCompleteListener(new ru(i7, uc0Var, a10));
                return;
            case 9:
                ((rd0) this.b).a();
                return;
            case 10:
                final bf0 bf0Var = (bf0) this.b;
                ef0 ef0Var = bf0Var.K;
                if (bf0Var.n == null) {
                    return;
                }
                View view2 = ef0Var.fragmentView;
                if (view2 instanceof ViewGroup) {
                    org.telegram.ui.Components.l60 F = org.telegram.ui.Components.l60.F((ViewGroup) view2, null, bf0Var);
                    if (bf0Var.n.revoked) {
                        F.c(R.drawable.msg_delete, org.telegram.messenger.id.M0(2131751598, null), new Runnable() { // from class: org.telegram.ui.ye0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (r2) {
                                    case 0:
                                        final bf0 bf0Var2 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = bf0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bf0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131751534, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.id.M0(2131751533, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i14) {
                                                switch (i13) {
                                                    case 0:
                                                        bf0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        bf0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        bf0 bf0Var3 = bf0Var;
                                        try {
                                            if (bf0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bf0Var3.n.link));
                                                org.telegram.ui.Components.hc.j(bf0Var3.K).j();
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
                                        ef0 ef0Var2 = bf0Var4.K;
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
                                        ef0 ef0Var3 = bf0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bf0Var5.n;
                                        j90 j90Var2 = new j90(1, ef0Var3.n);
                                        j90Var2.S = ef0Var3.s0;
                                        j90Var2.d0(tL_chatInviteExported2);
                                        ef0Var3.presentFragment(j90Var2);
                                        break;
                                    default:
                                        final bf0 bf0Var6 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bf0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(bf0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.id.M0(2131746026, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.id.M0(2131746023, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.id.M0(2131746024, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        bf0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        bf0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, true);
                    } else {
                        String M02 = org.telegram.messenger.id.M0(2131751762, null);
                        final char c11 = 1 == true ? 1 : 0;
                        F.c(R.drawable.msg_copy, M02, new Runnable() { // from class: org.telegram.ui.ye0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (c11) {
                                    case 0:
                                        final bf0 bf0Var2 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = bf0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bf0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131751534, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.id.M0(2131751533, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        bf0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        bf0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        bf0 bf0Var3 = bf0Var;
                                        try {
                                            if (bf0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bf0Var3.n.link));
                                                org.telegram.ui.Components.hc.j(bf0Var3.K).j();
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
                                        ef0 ef0Var2 = bf0Var4.K;
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
                                        ef0 ef0Var3 = bf0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bf0Var5.n;
                                        j90 j90Var2 = new j90(1, ef0Var3.n);
                                        j90Var2.S = ef0Var3.s0;
                                        j90Var2.d0(tL_chatInviteExported2);
                                        ef0Var3.presentFragment(j90Var2);
                                        break;
                                    default:
                                        final bf0 bf0Var6 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bf0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(bf0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.id.M0(2131746026, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.id.M0(2131746023, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.id.M0(2131746024, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        bf0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        bf0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.c(R.drawable.msg_share, org.telegram.messenger.id.M0(2131745458, null), new Runnable() { // from class: org.telegram.ui.ye0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i12) {
                                    case 0:
                                        final bf0 bf0Var2 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = bf0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bf0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131751534, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.id.M0(2131751533, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        bf0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        bf0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        bf0 bf0Var3 = bf0Var;
                                        try {
                                            if (bf0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bf0Var3.n.link));
                                                org.telegram.ui.Components.hc.j(bf0Var3.K).j();
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
                                        ef0 ef0Var2 = bf0Var4.K;
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
                                        ef0 ef0Var3 = bf0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bf0Var5.n;
                                        j90 j90Var2 = new j90(1, ef0Var3.n);
                                        j90Var2.S = ef0Var3.s0;
                                        j90Var2.d0(tL_chatInviteExported2);
                                        ef0Var3.presentFragment(j90Var2);
                                        break;
                                    default:
                                        final bf0 bf0Var6 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bf0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(bf0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.id.M0(2131746026, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.id.M0(2131746023, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.id.M0(2131746024, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        bf0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        bf0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.l(R.drawable.msg_edit, org.telegram.messenger.id.M0(2131751277, null), new Runnable() { // from class: org.telegram.ui.ye0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i11) {
                                    case 0:
                                        final bf0 bf0Var2 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = bf0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bf0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131751534, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.id.M0(2131751533, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        bf0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        bf0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        bf0 bf0Var3 = bf0Var;
                                        try {
                                            if (bf0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bf0Var3.n.link));
                                                org.telegram.ui.Components.hc.j(bf0Var3.K).j();
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
                                        ef0 ef0Var2 = bf0Var4.K;
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
                                        ef0 ef0Var3 = bf0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bf0Var5.n;
                                        j90 j90Var2 = new j90(1, ef0Var3.n);
                                        j90Var2.S = ef0Var3.s0;
                                        j90Var2.d0(tL_chatInviteExported2);
                                        ef0Var3.presentFragment(j90Var2);
                                        break;
                                    default:
                                        final bf0 bf0Var6 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bf0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(bf0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.id.M0(2131746026, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.id.M0(2131746023, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.id.M0(2131746024, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        bf0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        bf0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, !bf0Var.n.permanent && ef0Var.p0);
                        F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.ye0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i10) {
                                    case 0:
                                        final bf0 bf0Var2 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = bf0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(bf0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131751534, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.id.M0(2131751533, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131751598, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        bf0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        bf0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        bf0 bf0Var3 = bf0Var;
                                        try {
                                            if (bf0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", bf0Var3.n.link));
                                                org.telegram.ui.Components.hc.j(bf0Var3.K).j();
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
                                        ef0 ef0Var2 = bf0Var4.K;
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
                                        ef0 ef0Var3 = bf0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = bf0Var5.n;
                                        j90 j90Var2 = new j90(1, ef0Var3.n);
                                        j90Var2.S = ef0Var3.s0;
                                        j90Var2.d0(tL_chatInviteExported2);
                                        ef0Var3.presentFragment(j90Var2);
                                        break;
                                    default:
                                        final bf0 bf0Var6 = bf0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = bf0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(bf0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.id.M0(2131746026, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.id.M0(2131746023, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.id.M0(2131746024, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.ze0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        bf0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        bf0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, org.telegram.messenger.id.M0(2131746023, null), ef0Var.p0, true);
                    }
                    F.W(ef0Var.b.U0(bf0Var, false));
                    F.Z();
                    return;
                }
                return;
            case 11:
                lg0 lg0Var = (lg0) this.b;
                long j3 = lg0Var.b;
                if (lg0Var.n.x4()) {
                    return;
                }
                if (lg0Var.getParentLayout().getFragmentStack().size() > 1) {
                    org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) lg0Var.getParentLayout().getFragmentStack().get(lg0Var.getParentLayout().getFragmentStack().size() - 2);
                    if ((f2Var instanceof cn) && ((cn) f2Var).e.id == j3) {
                        lg0Var.finishFragment();
                        return;
                    }
                }
                Bundle j10 = a8.p0.j(j3, "chat_id");
                j10.putInt("message_id", lg0Var.c);
                j10.putBoolean("need_remove_previous_same_chat_activity", false);
                lg0Var.presentFragment(new cn(j10));
                return;
            case 12:
                ((org.telegram.ui.Cells.r8) this.b).setChecked(!r1.e.h);
                return;
            case 13:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.v4.a;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                alertDialog$Builder4.a.R = org.telegram.messenger.id.M0(2131750593, null);
                alertDialog$Builder4.a.T = org.telegram.messenger.id.M0(2131750592, null);
                alertDialog$Builder4.k(org.telegram.messenger.id.M0(2131752041, null), null);
                alertDialog$Builder4.a.show();
                return;
            case 14:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i13 = passcodeActivity.y;
                if (i13 != 1) {
                    if (i13 == 2) {
                        passcodeActivity.u0();
                        return;
                    }
                    return;
                } else if (passcodeActivity.E == 0) {
                    passcodeActivity.v0();
                    return;
                } else {
                    passcodeActivity.u0();
                    return;
                }
            case 15:
                li0 li0Var = (li0) this.b;
                if (li0Var.a.getAnimatedDrawable().k0) {
                    return;
                }
                li0Var.a.getAnimatedDrawable().N(0, false, false);
                li0Var.a.d();
                return;
            case 16:
                ((PasskeysActivity) this.b).e0(view);
                return;
            case 17:
                zj0 zj0Var = (zj0) this.b;
                if (zj0Var.J) {
                    return;
                }
                int i14 = zj0Var.M;
                if ((i14 != 4 || zj0Var.L != 2) && i14 != 0) {
                    zj0Var.s();
                    return;
                }
                try {
                    PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                    intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + zj0Var.a);
                    intent.putExtra("android.intent.extra.TEXT", "Phone: " + zj0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + zj0Var.K);
                    zj0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    org.telegram.ui.Components.v4.r0(zj0Var.Q, null, org.telegram.messenger.id.M0(2131748199, null), null);
                    return;
                }
            case 18:
                om0 om0Var = (om0) this.b;
                cn cnVar = om0Var.F;
                if (cnVar != null && cnVar.c()) {
                    org.telegram.ui.Components.v4.I(om0Var.getParentActivity(), cnVar.a(), new km0(om0Var, r10));
                    return;
                } else {
                    om0Var.a0(om0Var.b, om0Var.c, true, 0);
                    om0Var.finishFragment();
                    return;
                }
            case 19:
                zm0 zm0Var = (zm0) this.b;
                cn cnVar2 = zm0Var.U;
                if (cnVar2 == null || !cnVar2.c()) {
                    zm0Var.j0(0, true);
                    return;
                } else {
                    org.telegram.ui.Components.v4.I(zm0Var.getParentActivity(), cnVar2.a(), new sm0(zm0Var, r10));
                    return;
                }
            case 20:
                kq0 kq0Var = (kq0) this.b;
                if (kq0Var != null) {
                    kq0Var.z(0, org.telegram.messenger.g0.L(64.0f), false);
                    return;
                }
                return;
            case 21:
                l4 l4Var = (l4) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = (PhotoViewer) l4Var.e;
                int indexOf = photoViewer.f7.indexOf(tag);
                if (indexOf < 0) {
                    int R = photoViewer.d.R(tag);
                    if (R >= 0) {
                        photoViewer.p1.s(R);
                        if (R == 0) {
                            photoViewer.p1.g(0);
                        }
                        photoViewer.y3();
                        return;
                    }
                    return;
                }
                int k10 = photoViewer.d.k(indexOf, photoViewer.j1());
                boolean x10 = photoViewer.d.x(indexOf);
                if (indexOf == photoViewer.O4) {
                    photoViewer.N0.b(x10, true);
                }
                if (k10 >= 0) {
                    photoViewer.p1.s(k10);
                    if (k10 == 0) {
                        photoViewer.p1.g(0);
                    }
                }
                photoViewer.y3();
                return;
            case 22:
                rr0 rr0Var = (rr0) this.b;
                boolean[] zArr = rr0Var.x;
                CharSequence[] charSequenceArr = rr0Var.w;
                if (view.getTag() != null) {
                    return;
                }
                view.setTag(1);
                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view.getParent();
                v4.d1 G = rr0Var.c.G(a6Var);
                if (G == null || (b10 = G.b()) == -1) {
                    return;
                }
                int i15 = b10 - rr0Var.n0;
                if (rr0Var.I && i15 < rr0Var.y) {
                    int i16 = -rr0Var.O;
                    rr0Var.O = i16;
                    org.telegram.messenger.g0.G3(i16, a6Var, null);
                    org.telegram.messenger.p2.D.a();
                    return;
                }
                rr0Var.b.s(b10);
                int i17 = i15 + 1;
                System.arraycopy(charSequenceArr, i17, charSequenceArr, i15, (charSequenceArr.length - 1) - i15);
                System.arraycopy(zArr, i17, zArr, i15, (zArr.length - 1) - i15);
                charSequenceArr[charSequenceArr.length - 1] = null;
                zArr[zArr.length - 1] = false;
                int i18 = rr0Var.D - 1;
                rr0Var.D = i18;
                if (rr0Var.r != null) {
                    int[] iArr = new int[i18];
                    while (r10 < i18) {
                        iArr[r10] = rr0Var.r[r10 >= i15 ? r10 + 1 : r10];
                        r10++;
                    }
                    rr0Var.r = iArr;
                }
                if (rr0Var.D == charSequenceArr.length - 1) {
                    rr0Var.b.i((rr0Var.n0 + charSequenceArr.length) - 1);
                }
                v4.d1 K = rr0Var.c.K(b10 - 1);
                EditTextBoldCursor textView = a6Var.getTextView();
                if (K != null) {
                    View view3 = K.a;
                    if (view3 instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view3).getTextView().requestFocus();
                        textView.clearFocus();
                        rr0Var.n0();
                        rr0Var.w0();
                        pw0Var = rr0Var.Q;
                        if (pw0Var != null) {
                            pw0Var.f();
                            rr0Var.Q.setDelegate(null);
                        }
                        rr0Var.b.g(rr0Var.p0);
                        return;
                    }
                }
                if (textView.isFocused()) {
                    org.telegram.messenger.g0.v1(textView);
                    rr0Var.p0(true);
                } else if (rr0Var.B0) {
                    rr0Var.p0(true);
                }
                textView.clearFocus();
                rr0Var.n0();
                rr0Var.w0();
                pw0Var = rr0Var.Q;
                if (pw0Var != null) {
                }
                rr0Var.b.g(rr0Var.p0);
                return;
            case 23:
                ((bs0) this.b).c(true);
                return;
            case 24:
                ((bs0) ((bi.g5) this.b).c).c(true);
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                ys0 ys0Var = (ys0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                ys0 ys0Var2 = premiumPreviewFragment.f;
                if (ys0Var2 != null && (tL_premiumSubscriptionOption = ys0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
                    String str3 = org.telegram.messenger.r1.i().f;
                    r10 = (TextUtils.isEmpty(str3) && TextUtils.isEmpty(null)) ? 0 : 1;
                    boolean isEmpty = TextUtils.isEmpty(null);
                    if (r10 != 0 && !isEmpty) {
                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                    }
                    if (r10 == 0 && isEmpty) {
                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                    }
                    z0Var = new com.google.android.gms.internal.clearcut.z0(2);
                    z0Var.c = str3;
                    z0Var.b = 5;
                }
                PremiumPreviewFragment.p0(premiumPreviewFragment, ys0Var, "settings", z0Var);
                return;
            case 26:
                PrivacyControlActivity privacyControlActivity = ((lt0) this.b).d;
                privacyControlActivity.showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) privacyControlActivity, 27, false));
                return;
            case 27:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                int intValue = ((Integer) c2Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.Z;
                boolean z9 = !zArr2[intValue];
                zArr2[intValue] = z9;
                c2Var.c(z9, true);
                return;
            case 28:
                rx0 rx0Var = (rx0) this.b;
                ProxyListActivity proxyListActivity = rx0Var.s;
                org.telegram.messenger.hz hzVar = rx0Var.d;
                yx0 yx0Var = new yx0(null);
                yx0Var.e = new org.telegram.ui.Cells.y6[3];
                yx0Var.f = new org.telegram.ui.Cells.z8[2];
                yx0Var.s = new org.telegram.ui.Cells.i6[3];
                yx0Var.D = 1.0f;
                yx0Var.E = new float[2];
                yx0Var.F = true;
                yx0Var.L = new sx0(yx0Var);
                yx0Var.J = hzVar;
                proxyListActivity.presentFragment(yx0Var);
                return;
            default:
                qy0 qy0Var = (qy0) this.b;
                fi.d dVar = qy0Var.s;
                if (!dVar.c0 || dVar.Q) {
                    return;
                }
                dVar.setLoading(true);
                ry0.I0(qy0Var.w, ((TextView) qy0Var.h.c).getText(), qy0Var.d.option, qy0Var.n.getText().toString());
                return;
        }
    }
}
