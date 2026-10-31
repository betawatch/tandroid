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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class f50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f50(Object obj, int i10) {
        this.a = i10;
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
        org.telegram.ui.Components.sx0 sx0Var;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        final int i10 = 4;
        final int i11 = 3;
        final int i12 = 2;
        ba.a aVar = null;
        switch (this.a) {
            case 0:
                ((g50) this.b).b.Z0(19);
                return;
            case 1:
                v50 v50Var = ((t50) this.b).I;
                v50Var.X = null;
                v50Var.Z.b();
                v50Var.h.b();
                v50Var.o0();
                v50Var.v0();
                return;
            case 2:
                k60.e0(((i60) this.b).d, null);
                return;
            case 3:
                y60.Z((y60) this.b);
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.E0;
                launchActivity.H0 = null;
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
                ma0 ma0Var = (ma0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ma0Var.getParentActivity());
                alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131746043, null);
                alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(2131746040, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746041, null), new ca0(ma0Var, 1 == true ? 1 : 0));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                ma0Var.showDialog(alertDialog$Builder.a);
                return;
            case 6:
                final od0 od0Var = (od0) this.b;
                hf0 hf0Var = od0Var.D;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(hf0Var.getParentActivity());
                alertDialog$Builder2.a.R = org.telegram.messenger.cd.L0(2131746088, "RestorePasswordNoEmailTitle");
                alertDialog$Builder2.a.T = org.telegram.messenger.cd.L0(2131746092, "RestoreEmailTroubleText");
                alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131747847, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.nd0
                    @Override // org.telegram.ui.ActionBar.u1
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i13) {
                        switch (r2) {
                            case 0:
                                od0Var.D.C1(6, true, new Bundle(), true);
                                break;
                            default:
                                od0 od0Var2 = od0Var;
                                hf0.r0(od0Var2.D, od0Var2.r, od0Var2.s, od0Var2.w);
                                break;
                        }
                    }
                });
                String L0 = org.telegram.messenger.cd.L0(2131746134, null);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder2.h(L0, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.nd0
                    @Override // org.telegram.ui.ActionBar.u1
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i13) {
                        switch (c10) {
                            case 0:
                                od0Var.D.C1(6, true, new Bundle(), true);
                                break;
                            default:
                                od0 od0Var2 = od0Var;
                                hf0.r0(od0Var2.D, od0Var2.r, od0Var2.s, od0Var2.w);
                                break;
                        }
                    }
                });
                Dialog showDialog = hf0Var.showDialog(alertDialog$Builder2.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            case 7:
                xd0 xd0Var = (xd0) this.b;
                hf0 hf0Var2 = xd0Var.G;
                if (hf0Var2.V.getTag() != null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(hf0Var2.getParentActivity());
                alertDialog$Builder3.a.R = org.telegram.messenger.cd.L0(2131746116, "ResetMyAccountWarning");
                alertDialog$Builder3.a.T = org.telegram.messenger.cd.L0(2131746114, "ResetMyAccountWarningText");
                alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131746115, "ResetMyAccountWarningReset"), new tt(xd0Var, 20));
                alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                hf0Var2.showDialog(alertDialog$Builder3.a);
                return;
            case 8:
                zd0 zd0Var = (zd0) this.b;
                org.telegram.messenger.zs.e().b(new w4(zd0Var, i12), org.telegram.messenger.zs.c5);
                Context context = zd0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = org.telegram.messenger.v2.h;
                n6.l.e(str);
                hashSet.add(GoogleSignInOptions.x);
                if (hashSet.contains(GoogleSignInOptions.E)) {
                    Scope scope = GoogleSignInOptions.D;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.y);
                com.google.android.gms.internal.clearcut.v0 a2 = w7.n9.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new rv(22, zd0Var, a2));
                return;
            case 9:
                ((we0) this.b).a();
                return;
            case 10:
                final hg0 hg0Var = (hg0) this.b;
                kg0 kg0Var = hg0Var.K;
                if (hg0Var.n == null) {
                    return;
                }
                View view2 = kg0Var.fragmentView;
                if (view2 instanceof ViewGroup) {
                    org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F((ViewGroup) view2, null, hg0Var);
                    if (hg0Var.n.revoked) {
                        F.c(R.drawable.msg_delete, org.telegram.messenger.cd.L0(2131751599, null), new Runnable() { // from class: org.telegram.ui.eg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (r2) {
                                    case 0:
                                        final hg0 hg0Var2 = hg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = hg0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hg0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.cd.L0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.fg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i14) {
                                                switch (i13) {
                                                    case 0:
                                                        hg0Var2.K.j0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        hg0Var2.K.g0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        hg0 hg0Var3 = hg0Var;
                                        try {
                                            if (hg0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hg0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(hg0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                            return;
                                        }
                                    case 2:
                                        hg0 hg0Var4 = hg0Var;
                                        kg0 kg0Var2 = hg0Var4.K;
                                        try {
                                            if (hg0Var4.n.link != null) {
                                                Context context2 = hg0Var4.getContext();
                                                String str2 = hg0Var4.n.link;
                                                kg0Var2.showDialog(new gg0(hg0Var4, context2, str2, str2, kg0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                            return;
                                        }
                                    case 3:
                                        hg0 hg0Var5 = hg0Var;
                                        kg0 kg0Var3 = hg0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hg0Var5.n;
                                        ma0 ma0Var2 = new ma0(1, kg0Var3.n);
                                        ma0Var2.S = kg0Var3.s0;
                                        ma0Var2.c0(tL_chatInviteExported2);
                                        kg0Var3.presentFragment(ma0Var2);
                                        break;
                                    default:
                                        final hg0 hg0Var6 = hg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hg0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(hg0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.cd.L0(2131746043, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.cd.L0(2131746040, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.cd.L0(2131746041, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.fg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        hg0Var6.K.j0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        hg0Var6.K.g0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, true);
                    } else {
                        String L02 = org.telegram.messenger.cd.L0(2131751762, null);
                        final char c11 = 1 == true ? 1 : 0;
                        F.c(R.drawable.msg_copy, L02, new Runnable() { // from class: org.telegram.ui.eg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (c11) {
                                    case 0:
                                        final hg0 hg0Var2 = hg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = hg0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hg0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.cd.L0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.fg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        hg0Var2.K.j0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        hg0Var2.K.g0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        hg0 hg0Var3 = hg0Var;
                                        try {
                                            if (hg0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hg0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(hg0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                            return;
                                        }
                                    case 2:
                                        hg0 hg0Var4 = hg0Var;
                                        kg0 kg0Var2 = hg0Var4.K;
                                        try {
                                            if (hg0Var4.n.link != null) {
                                                Context context2 = hg0Var4.getContext();
                                                String str2 = hg0Var4.n.link;
                                                kg0Var2.showDialog(new gg0(hg0Var4, context2, str2, str2, kg0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                            return;
                                        }
                                    case 3:
                                        hg0 hg0Var5 = hg0Var;
                                        kg0 kg0Var3 = hg0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hg0Var5.n;
                                        ma0 ma0Var2 = new ma0(1, kg0Var3.n);
                                        ma0Var2.S = kg0Var3.s0;
                                        ma0Var2.c0(tL_chatInviteExported2);
                                        kg0Var3.presentFragment(ma0Var2);
                                        break;
                                    default:
                                        final hg0 hg0Var6 = hg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hg0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(hg0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.cd.L0(2131746043, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.cd.L0(2131746040, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.cd.L0(2131746041, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.fg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        hg0Var6.K.j0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        hg0Var6.K.g0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.c(R.drawable.msg_share, org.telegram.messenger.cd.L0(2131745476, null), new Runnable() { // from class: org.telegram.ui.eg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i12) {
                                    case 0:
                                        final hg0 hg0Var2 = hg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = hg0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hg0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.cd.L0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.fg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        hg0Var2.K.j0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        hg0Var2.K.g0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        hg0 hg0Var3 = hg0Var;
                                        try {
                                            if (hg0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hg0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(hg0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                            return;
                                        }
                                    case 2:
                                        hg0 hg0Var4 = hg0Var;
                                        kg0 kg0Var2 = hg0Var4.K;
                                        try {
                                            if (hg0Var4.n.link != null) {
                                                Context context2 = hg0Var4.getContext();
                                                String str2 = hg0Var4.n.link;
                                                kg0Var2.showDialog(new gg0(hg0Var4, context2, str2, str2, kg0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                            return;
                                        }
                                    case 3:
                                        hg0 hg0Var5 = hg0Var;
                                        kg0 kg0Var3 = hg0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hg0Var5.n;
                                        ma0 ma0Var2 = new ma0(1, kg0Var3.n);
                                        ma0Var2.S = kg0Var3.s0;
                                        ma0Var2.c0(tL_chatInviteExported2);
                                        kg0Var3.presentFragment(ma0Var2);
                                        break;
                                    default:
                                        final hg0 hg0Var6 = hg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hg0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(hg0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.cd.L0(2131746043, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.cd.L0(2131746040, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.cd.L0(2131746041, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.fg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        hg0Var6.K.j0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        hg0Var6.K.g0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.l(R.drawable.msg_edit, org.telegram.messenger.cd.L0(2131751278, null), new Runnable() { // from class: org.telegram.ui.eg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i11) {
                                    case 0:
                                        final hg0 hg0Var2 = hg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = hg0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hg0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.cd.L0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.fg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        hg0Var2.K.j0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        hg0Var2.K.g0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        hg0 hg0Var3 = hg0Var;
                                        try {
                                            if (hg0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hg0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(hg0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                            return;
                                        }
                                    case 2:
                                        hg0 hg0Var4 = hg0Var;
                                        kg0 kg0Var2 = hg0Var4.K;
                                        try {
                                            if (hg0Var4.n.link != null) {
                                                Context context2 = hg0Var4.getContext();
                                                String str2 = hg0Var4.n.link;
                                                kg0Var2.showDialog(new gg0(hg0Var4, context2, str2, str2, kg0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                            return;
                                        }
                                    case 3:
                                        hg0 hg0Var5 = hg0Var;
                                        kg0 kg0Var3 = hg0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hg0Var5.n;
                                        ma0 ma0Var2 = new ma0(1, kg0Var3.n);
                                        ma0Var2.S = kg0Var3.s0;
                                        ma0Var2.c0(tL_chatInviteExported2);
                                        kg0Var3.presentFragment(ma0Var2);
                                        break;
                                    default:
                                        final hg0 hg0Var6 = hg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hg0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(hg0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.cd.L0(2131746043, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.cd.L0(2131746040, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.cd.L0(2131746041, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.fg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        hg0Var6.K.j0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        hg0Var6.K.g0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, !hg0Var.n.permanent && kg0Var.p0);
                        F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.eg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i10) {
                                    case 0:
                                        final hg0 hg0Var2 = hg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = hg0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(hg0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.cd.L0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.fg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        hg0Var2.K.j0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        hg0Var2.K.g0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        hg0 hg0Var3 = hg0Var;
                                        try {
                                            if (hg0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", hg0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(hg0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                            return;
                                        }
                                    case 2:
                                        hg0 hg0Var4 = hg0Var;
                                        kg0 kg0Var2 = hg0Var4.K;
                                        try {
                                            if (hg0Var4.n.link != null) {
                                                Context context2 = hg0Var4.getContext();
                                                String str2 = hg0Var4.n.link;
                                                kg0Var2.showDialog(new gg0(hg0Var4, context2, str2, str2, kg0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                            return;
                                        }
                                    case 3:
                                        hg0 hg0Var5 = hg0Var;
                                        kg0 kg0Var3 = hg0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = hg0Var5.n;
                                        ma0 ma0Var2 = new ma0(1, kg0Var3.n);
                                        ma0Var2.S = kg0Var3.s0;
                                        ma0Var2.c0(tL_chatInviteExported2);
                                        kg0Var3.presentFragment(ma0Var2);
                                        break;
                                    default:
                                        final hg0 hg0Var6 = hg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = hg0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(hg0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.cd.L0(2131746043, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.cd.L0(2131746040, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.cd.L0(2131746041, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.fg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        hg0Var6.K.j0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        hg0Var6.K.g0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, org.telegram.messenger.cd.L0(2131746040, null), kg0Var.p0, true);
                    }
                    F.W(kg0Var.b.U0(hg0Var, false));
                    F.Z();
                    return;
                }
                return;
            case 11:
                sh0 sh0Var = (sh0) this.b;
                long j10 = sh0Var.b;
                if (sh0Var.n.x4()) {
                    return;
                }
                if (sh0Var.getParentLayout().getFragmentStack().size() > 1) {
                    org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) sh0Var.getParentLayout().getFragmentStack().get(sh0Var.getParentLayout().getFragmentStack().size() - 2);
                    if ((k2Var instanceof un) && ((un) k2Var).e.id == j10) {
                        sh0Var.finishFragment();
                        return;
                    }
                }
                Bundle k10 = org.telegram.ui.Cells.f1.k(j10, "chat_id");
                k10.putInt("message_id", sh0Var.c);
                k10.putBoolean("need_remove_previous_same_chat_activity", false);
                sh0Var.presentFragment(new un(k10));
                return;
            case 12:
                ((org.telegram.ui.Cells.t8) this.b).setChecked(!r1.e.h);
                return;
            case 13:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.s4.a;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                alertDialog$Builder4.a.R = org.telegram.messenger.cd.L0(2131750594, null);
                alertDialog$Builder4.a.T = org.telegram.messenger.cd.L0(2131750593, null);
                alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131752041, null), null);
                alertDialog$Builder4.a.show();
                return;
            case 14:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i13 = passcodeActivity.y;
                if (i13 != 1) {
                    if (i13 == 2) {
                        passcodeActivity.t0();
                        return;
                    }
                    return;
                } else if (passcodeActivity.E == 0) {
                    passcodeActivity.u0();
                    return;
                } else {
                    passcodeActivity.t0();
                    return;
                }
            case 15:
                rj0 rj0Var = (rj0) this.b;
                if (rj0Var.a.getAnimatedDrawable().k0) {
                    return;
                }
                rj0Var.a.getAnimatedDrawable().N(0, false, false);
                rj0Var.a.d();
                return;
            case 16:
                ((PasskeysActivity) this.b).d0(view);
                return;
            case 17:
                hl0 hl0Var = (hl0) this.b;
                if (hl0Var.J) {
                    return;
                }
                int i14 = hl0Var.M;
                if ((i14 != 4 || hl0Var.L != 2) && i14 != 0) {
                    hl0Var.s();
                    return;
                }
                try {
                    PackageInfo packageInfo = org.telegram.messenger.w0.b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                    intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + hl0Var.a);
                    intent.putExtra("android.intent.extra.TEXT", "Phone: " + hl0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + hl0Var.K);
                    hl0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    org.telegram.ui.Components.s4.t0(hl0Var.Q, null, org.telegram.messenger.cd.L0(2131748216, null), null);
                    return;
                }
            case 18:
                yn0 yn0Var = (yn0) this.b;
                un unVar = yn0Var.F;
                if (unVar != null && unVar.c()) {
                    org.telegram.ui.Components.s4.K(yn0Var.getParentActivity(), unVar.a(), new un0(yn0Var, r9));
                    return;
                } else {
                    yn0Var.Z(yn0Var.b, yn0Var.c, true, 0);
                    yn0Var.finishFragment();
                    return;
                }
            case 19:
                lo0 lo0Var = (lo0) this.b;
                un unVar2 = lo0Var.U;
                if (unVar2 == null || !unVar2.c()) {
                    lo0Var.i0(0, true);
                    return;
                } else {
                    org.telegram.ui.Components.s4.K(lo0Var.getParentActivity(), unVar2.a(), new co0(lo0Var, r9));
                    return;
                }
            case 20:
                tr0 tr0Var = (tr0) this.b;
                if (tr0Var != null) {
                    tr0Var.z(0, org.telegram.messenger.i0.L(64.0f), false);
                    return;
                }
                return;
            case 21:
                fg.j jVar = (fg.j) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = (PhotoViewer) jVar.e;
                int indexOf = photoViewer.g7.indexOf(tag);
                if (indexOf < 0) {
                    int R = photoViewer.d.R(tag);
                    if (R >= 0) {
                        photoViewer.p1.s(R);
                        if (R == 0) {
                            photoViewer.p1.g(0);
                        }
                        photoViewer.D3();
                        return;
                    }
                    return;
                }
                int k11 = photoViewer.d.k(indexOf, photoViewer.p1());
                boolean x10 = photoViewer.d.x(indexOf);
                if (indexOf == photoViewer.P4) {
                    photoViewer.N0.b(x10, true);
                }
                if (k11 >= 0) {
                    photoViewer.p1.s(k11);
                    if (k11 == 0) {
                        photoViewer.p1.g(0);
                    }
                }
                photoViewer.D3();
                return;
            case 22:
                at0 at0Var = (at0) this.b;
                boolean[] zArr = at0Var.x;
                CharSequence[] charSequenceArr = at0Var.w;
                if (view.getTag() != null) {
                    return;
                }
                view.setTag(1);
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view.getParent();
                s4.c1 G = at0Var.c.G(e6Var);
                if (G == null || (b10 = G.b()) == -1) {
                    return;
                }
                int i15 = b10 - at0Var.n0;
                if (at0Var.I && i15 < at0Var.y) {
                    int i16 = -at0Var.O;
                    at0Var.O = i16;
                    org.telegram.messenger.i0.F3(i16, e6Var, null);
                    org.telegram.messenger.t2.D.a();
                    return;
                }
                at0Var.b.s(b10);
                int i17 = i15 + 1;
                System.arraycopy(charSequenceArr, i17, charSequenceArr, i15, (charSequenceArr.length - 1) - i15);
                System.arraycopy(zArr, i17, zArr, i15, (zArr.length - 1) - i15);
                charSequenceArr[charSequenceArr.length - 1] = null;
                zArr[zArr.length - 1] = false;
                int i18 = at0Var.D - 1;
                at0Var.D = i18;
                if (at0Var.r != null) {
                    int[] iArr = new int[i18];
                    while (r9 < i18) {
                        iArr[r9] = at0Var.r[r9 >= i15 ? r9 + 1 : r9];
                        r9++;
                    }
                    at0Var.r = iArr;
                }
                if (at0Var.D == charSequenceArr.length - 1) {
                    at0Var.b.i((at0Var.n0 + charSequenceArr.length) - 1);
                }
                s4.c1 K = at0Var.c.K(b10 - 1);
                EditTextBoldCursor textView = e6Var.getTextView();
                if (K != null) {
                    View view3 = K.a;
                    if (view3 instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view3).getTextView().requestFocus();
                        textView.clearFocus();
                        at0Var.m0();
                        at0Var.v0();
                        sx0Var = at0Var.Q;
                        if (sx0Var != null) {
                            sx0Var.f();
                            at0Var.Q.setDelegate(null);
                        }
                        at0Var.b.g(at0Var.p0);
                        return;
                    }
                }
                if (textView.isFocused()) {
                    org.telegram.messenger.i0.v1(textView);
                    at0Var.o0(true);
                } else if (at0Var.B0) {
                    at0Var.o0(true);
                }
                textView.clearFocus();
                at0Var.m0();
                at0Var.v0();
                sx0Var = at0Var.Q;
                if (sx0Var != null) {
                }
                at0Var.b.g(at0Var.p0);
                return;
            case 23:
                ((kt0) this.b).c(true);
                return;
            case 24:
                ((kt0) ((mg.s) this.b).c).c(true);
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                fu0 fu0Var = (fu0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                fu0 fu0Var2 = premiumPreviewFragment.f;
                if (fu0Var2 != null && (tL_premiumSubscriptionOption = fu0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
                    String str3 = org.telegram.messenger.u1.i().f;
                    r9 = (TextUtils.isEmpty(str3) && TextUtils.isEmpty(null)) ? 0 : 1;
                    boolean isEmpty = TextUtils.isEmpty(null);
                    if (r9 != 0 && !isEmpty) {
                        throw new IllegalArgumentException("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
                    }
                    if (r9 == 0 && isEmpty) {
                        throw new IllegalArgumentException("Old SKU purchase information(token/id) or original external transaction id must be provided.");
                    }
                    aVar = new ba.a(1);
                    aVar.b = str3;
                    aVar.c = 5;
                }
                PremiumPreviewFragment.o0(premiumPreviewFragment, fu0Var, "settings", aVar);
                return;
            case 26:
                PrivacyControlActivity privacyControlActivity = ((su0) this.b).d;
                privacyControlActivity.showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) privacyControlActivity, 27, false));
                return;
            case 27:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) view;
                int intValue = ((Integer) c2Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.Z;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                c2Var.c(z10, true);
                return;
            case 28:
                cz0 cz0Var = (cz0) this.b;
                ProxyListActivity proxyListActivity = cz0Var.s;
                org.telegram.messenger.sz szVar = cz0Var.d;
                jz0 jz0Var = new jz0(null);
                jz0Var.e = new org.telegram.ui.Cells.c7[3];
                jz0Var.f = new org.telegram.ui.Cells.b9[2];
                jz0Var.s = new org.telegram.ui.Cells.m6[3];
                jz0Var.D = 1.0f;
                jz0Var.E = new float[2];
                jz0Var.F = true;
                jz0Var.L = new dz0(jz0Var);
                jz0Var.J = szVar;
                proxyListActivity.presentFragment(jz0Var);
                return;
            default:
                b01 b01Var = (b01) this.b;
                vh.d dVar = b01Var.s;
                if (!dVar.c0 || dVar.Q) {
                    return;
                }
                dVar.setLoading(true);
                c01.I0(b01Var.w, ((TextView) b01Var.h.c).getText(), b01Var.d.option, b01Var.n.getText().toString());
                return;
        }
    }
}
