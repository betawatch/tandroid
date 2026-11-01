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

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e50(Object obj, int i10) {
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
        org.telegram.ui.Components.tx0 tx0Var;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        final int i10 = 4;
        final int i11 = 3;
        final int i12 = 2;
        ba.a aVar = null;
        switch (this.a) {
            case 0:
                ((f50) this.b).b.a1(19);
                return;
            case 1:
                u50 u50Var = ((s50) this.b).I;
                u50Var.X = null;
                u50Var.Z.b();
                u50Var.h.b();
                u50Var.p0();
                u50Var.w0();
                return;
            case 2:
                j60.f0(((h60) this.b).d, null);
                return;
            case 3:
                x60.a0((x60) this.b);
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
                la0 la0Var = (la0) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(la0Var.getParentActivity());
                alertDialog$Builder.a.T = org.telegram.messenger.dd.L0(2131746043, null);
                alertDialog$Builder.a.R = org.telegram.messenger.dd.L0(2131746040, null);
                alertDialog$Builder.k(org.telegram.messenger.dd.L0(2131746041, null), new ba0(la0Var, 1 == true ? 1 : 0));
                alertDialog$Builder.h(org.telegram.messenger.dd.L0(2131752589, null), null);
                la0Var.showDialog(alertDialog$Builder.a);
                return;
            case 6:
                final nd0 nd0Var = (nd0) this.b;
                gf0 gf0Var = nd0Var.D;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(gf0Var.getParentActivity());
                alertDialog$Builder2.a.R = org.telegram.messenger.dd.L0(2131746088, "RestorePasswordNoEmailTitle");
                alertDialog$Builder2.a.T = org.telegram.messenger.dd.L0(2131746092, "RestoreEmailTroubleText");
                alertDialog$Builder2.k(org.telegram.messenger.dd.L0(2131747847, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.md0
                    @Override // org.telegram.ui.ActionBar.u1
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i13) {
                        switch (r2) {
                            case 0:
                                nd0Var.D.D1(6, true, new Bundle(), true);
                                break;
                            default:
                                nd0 nd0Var2 = nd0Var;
                                gf0.s0(nd0Var2.D, nd0Var2.r, nd0Var2.s, nd0Var2.w);
                                break;
                        }
                    }
                });
                String L0 = org.telegram.messenger.dd.L0(2131746134, null);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder2.h(L0, new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.md0
                    @Override // org.telegram.ui.ActionBar.u1
                    public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i13) {
                        switch (c10) {
                            case 0:
                                nd0Var.D.D1(6, true, new Bundle(), true);
                                break;
                            default:
                                nd0 nd0Var2 = nd0Var;
                                gf0.s0(nd0Var2.D, nd0Var2.r, nd0Var2.s, nd0Var2.w);
                                break;
                        }
                    }
                });
                Dialog showDialog = gf0Var.showDialog(alertDialog$Builder2.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            case 7:
                wd0 wd0Var = (wd0) this.b;
                gf0 gf0Var2 = wd0Var.G;
                if (gf0Var2.V.getTag() != null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(gf0Var2.getParentActivity());
                alertDialog$Builder3.a.R = org.telegram.messenger.dd.L0(2131746116, "ResetMyAccountWarning");
                alertDialog$Builder3.a.T = org.telegram.messenger.dd.L0(2131746114, "ResetMyAccountWarningText");
                alertDialog$Builder3.k(org.telegram.messenger.dd.L0(2131746115, "ResetMyAccountWarningReset"), new st(wd0Var, 20));
                alertDialog$Builder3.h(org.telegram.messenger.dd.L0(2131752589, "Cancel"), null);
                gf0Var2.showDialog(alertDialog$Builder3.a);
                return;
            case 8:
                yd0 yd0Var = (yd0) this.b;
                org.telegram.messenger.at.e().b(new w4(yd0Var, i12), org.telegram.messenger.at.c5);
                Context context = yd0Var.getContext();
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
                a2.g().addOnCompleteListener(new qv(22, yd0Var, a2));
                return;
            case 9:
                ((ve0) this.b).a();
                return;
            case 10:
                final fg0 fg0Var = (fg0) this.b;
                ig0 ig0Var = fg0Var.K;
                if (fg0Var.n == null) {
                    return;
                }
                View view2 = ig0Var.fragmentView;
                if (view2 instanceof ViewGroup) {
                    org.telegram.ui.Components.z60 F = org.telegram.ui.Components.z60.F((ViewGroup) view2, null, fg0Var);
                    if (fg0Var.n.revoked) {
                        F.c(R.drawable.msg_delete, org.telegram.messenger.dd.L0(2131751599, null), new Runnable() { // from class: org.telegram.ui.cg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (r2) {
                                    case 0:
                                        final fg0 fg0Var2 = fg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = fg0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fg0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.dd.L0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.dd.L0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.dg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i14) {
                                                switch (i13) {
                                                    case 0:
                                                        fg0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        fg0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        fg0 fg0Var3 = fg0Var;
                                        try {
                                            if (fg0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fg0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(fg0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                            return;
                                        }
                                    case 2:
                                        fg0 fg0Var4 = fg0Var;
                                        ig0 ig0Var2 = fg0Var4.K;
                                        try {
                                            if (fg0Var4.n.link != null) {
                                                Context context2 = fg0Var4.getContext();
                                                String str2 = fg0Var4.n.link;
                                                ig0Var2.showDialog(new eg0(fg0Var4, context2, str2, str2, ig0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                            return;
                                        }
                                    case 3:
                                        fg0 fg0Var5 = fg0Var;
                                        ig0 ig0Var3 = fg0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fg0Var5.n;
                                        la0 la0Var2 = new la0(1, ig0Var3.n);
                                        la0Var2.S = ig0Var3.s0;
                                        la0Var2.d0(tL_chatInviteExported2);
                                        ig0Var3.presentFragment(la0Var2);
                                        break;
                                    default:
                                        final fg0 fg0Var6 = fg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = fg0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(fg0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.dd.L0(2131746043, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.dd.L0(2131746040, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.dd.L0(2131746041, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.dg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        fg0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        fg0Var6.K.h0(tL_chatInviteExported3);
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
                        String L02 = org.telegram.messenger.dd.L0(2131751762, null);
                        final char c11 = 1 == true ? 1 : 0;
                        F.c(R.drawable.msg_copy, L02, new Runnable() { // from class: org.telegram.ui.cg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (c11) {
                                    case 0:
                                        final fg0 fg0Var2 = fg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = fg0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fg0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.dd.L0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.dd.L0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.dg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        fg0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        fg0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        fg0 fg0Var3 = fg0Var;
                                        try {
                                            if (fg0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fg0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(fg0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                            return;
                                        }
                                    case 2:
                                        fg0 fg0Var4 = fg0Var;
                                        ig0 ig0Var2 = fg0Var4.K;
                                        try {
                                            if (fg0Var4.n.link != null) {
                                                Context context2 = fg0Var4.getContext();
                                                String str2 = fg0Var4.n.link;
                                                ig0Var2.showDialog(new eg0(fg0Var4, context2, str2, str2, ig0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                            return;
                                        }
                                    case 3:
                                        fg0 fg0Var5 = fg0Var;
                                        ig0 ig0Var3 = fg0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fg0Var5.n;
                                        la0 la0Var2 = new la0(1, ig0Var3.n);
                                        la0Var2.S = ig0Var3.s0;
                                        la0Var2.d0(tL_chatInviteExported2);
                                        ig0Var3.presentFragment(la0Var2);
                                        break;
                                    default:
                                        final fg0 fg0Var6 = fg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = fg0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(fg0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.dd.L0(2131746043, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.dd.L0(2131746040, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.dd.L0(2131746041, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.dg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        fg0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        fg0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.c(R.drawable.msg_share, org.telegram.messenger.dd.L0(2131745476, null), new Runnable() { // from class: org.telegram.ui.cg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i12) {
                                    case 0:
                                        final fg0 fg0Var2 = fg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = fg0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fg0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.dd.L0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.dd.L0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.dg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        fg0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        fg0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        fg0 fg0Var3 = fg0Var;
                                        try {
                                            if (fg0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fg0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(fg0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                            return;
                                        }
                                    case 2:
                                        fg0 fg0Var4 = fg0Var;
                                        ig0 ig0Var2 = fg0Var4.K;
                                        try {
                                            if (fg0Var4.n.link != null) {
                                                Context context2 = fg0Var4.getContext();
                                                String str2 = fg0Var4.n.link;
                                                ig0Var2.showDialog(new eg0(fg0Var4, context2, str2, str2, ig0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                            return;
                                        }
                                    case 3:
                                        fg0 fg0Var5 = fg0Var;
                                        ig0 ig0Var3 = fg0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fg0Var5.n;
                                        la0 la0Var2 = new la0(1, ig0Var3.n);
                                        la0Var2.S = ig0Var3.s0;
                                        la0Var2.d0(tL_chatInviteExported2);
                                        ig0Var3.presentFragment(la0Var2);
                                        break;
                                    default:
                                        final fg0 fg0Var6 = fg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = fg0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(fg0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.dd.L0(2131746043, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.dd.L0(2131746040, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.dd.L0(2131746041, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.dg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        fg0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        fg0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.l(R.drawable.msg_edit, org.telegram.messenger.dd.L0(2131751278, null), new Runnable() { // from class: org.telegram.ui.cg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i11) {
                                    case 0:
                                        final fg0 fg0Var2 = fg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = fg0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fg0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.dd.L0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.dd.L0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.dg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        fg0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        fg0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        fg0 fg0Var3 = fg0Var;
                                        try {
                                            if (fg0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fg0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(fg0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                            return;
                                        }
                                    case 2:
                                        fg0 fg0Var4 = fg0Var;
                                        ig0 ig0Var2 = fg0Var4.K;
                                        try {
                                            if (fg0Var4.n.link != null) {
                                                Context context2 = fg0Var4.getContext();
                                                String str2 = fg0Var4.n.link;
                                                ig0Var2.showDialog(new eg0(fg0Var4, context2, str2, str2, ig0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                            return;
                                        }
                                    case 3:
                                        fg0 fg0Var5 = fg0Var;
                                        ig0 ig0Var3 = fg0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fg0Var5.n;
                                        la0 la0Var2 = new la0(1, ig0Var3.n);
                                        la0Var2.S = ig0Var3.s0;
                                        la0Var2.d0(tL_chatInviteExported2);
                                        ig0Var3.presentFragment(la0Var2);
                                        break;
                                    default:
                                        final fg0 fg0Var6 = fg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = fg0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(fg0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.dd.L0(2131746043, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.dd.L0(2131746040, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.dd.L0(2131746041, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.dg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        fg0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        fg0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, !fg0Var.n.permanent && ig0Var.p0);
                        F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.cg0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i10) {
                                    case 0:
                                        final fg0 fg0Var2 = fg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = fg0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(fg0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.dd.L0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.dd.L0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.dg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        fg0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        fg0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        fg0 fg0Var3 = fg0Var;
                                        try {
                                            if (fg0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.w0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", fg0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(fg0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                            return;
                                        }
                                    case 2:
                                        fg0 fg0Var4 = fg0Var;
                                        ig0 ig0Var2 = fg0Var4.K;
                                        try {
                                            if (fg0Var4.n.link != null) {
                                                Context context2 = fg0Var4.getContext();
                                                String str2 = fg0Var4.n.link;
                                                ig0Var2.showDialog(new eg0(fg0Var4, context2, str2, str2, ig0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e7) {
                                            org.telegram.messenger.f8.g(e7, true);
                                            return;
                                        }
                                    case 3:
                                        fg0 fg0Var5 = fg0Var;
                                        ig0 ig0Var3 = fg0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = fg0Var5.n;
                                        la0 la0Var2 = new la0(1, ig0Var3.n);
                                        la0Var2.S = ig0Var3.s0;
                                        la0Var2.d0(tL_chatInviteExported2);
                                        ig0Var3.presentFragment(la0Var2);
                                        break;
                                    default:
                                        final fg0 fg0Var6 = fg0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = fg0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(fg0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.dd.L0(2131746043, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.dd.L0(2131746040, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.dd.L0(2131746041, null), new org.telegram.ui.ActionBar.u1() { // from class: org.telegram.ui.dg0
                                            @Override // org.telegram.ui.ActionBar.u1
                                            public final void h(org.telegram.ui.ActionBar.x1 x1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        fg0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        fg0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i0.a.s(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, org.telegram.messenger.dd.L0(2131746040, null), ig0Var.p0, true);
                    }
                    F.W(ig0Var.b.U0(fg0Var, false));
                    F.Z();
                    return;
                }
                return;
            case 11:
                qh0 qh0Var = (qh0) this.b;
                long j10 = qh0Var.b;
                if (qh0Var.n.x4()) {
                    return;
                }
                if (qh0Var.getParentLayout().getFragmentStack().size() > 1) {
                    org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) qh0Var.getParentLayout().getFragmentStack().get(qh0Var.getParentLayout().getFragmentStack().size() - 2);
                    if ((k2Var instanceof un) && ((un) k2Var).e.id == j10) {
                        qh0Var.finishFragment();
                        return;
                    }
                }
                Bundle k10 = org.telegram.ui.Cells.f1.k(j10, "chat_id");
                k10.putInt("message_id", qh0Var.c);
                k10.putBoolean("need_remove_previous_same_chat_activity", false);
                qh0Var.presentFragment(new un(k10));
                return;
            case 12:
                ((org.telegram.ui.Cells.t8) this.b).setChecked(!r1.e.h);
                return;
            case 13:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.s4.a;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                alertDialog$Builder4.a.R = org.telegram.messenger.dd.L0(2131750594, null);
                alertDialog$Builder4.a.T = org.telegram.messenger.dd.L0(2131750593, null);
                alertDialog$Builder4.k(org.telegram.messenger.dd.L0(2131752041, null), null);
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
                pj0 pj0Var = (pj0) this.b;
                if (pj0Var.a.getAnimatedDrawable().k0) {
                    return;
                }
                pj0Var.a.getAnimatedDrawable().N(0, false, false);
                pj0Var.a.d();
                return;
            case 16:
                ((PasskeysActivity) this.b).e0(view);
                return;
            case 17:
                fl0 fl0Var = (fl0) this.b;
                if (fl0Var.J) {
                    return;
                }
                int i14 = fl0Var.M;
                if ((i14 != 4 || fl0Var.L != 2) && i14 != 0) {
                    fl0Var.s();
                    return;
                }
                try {
                    PackageInfo packageInfo = org.telegram.messenger.w0.b.getPackageManager().getPackageInfo(org.telegram.messenger.w0.b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                    intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + fl0Var.a);
                    intent.putExtra("android.intent.extra.TEXT", "Phone: " + fl0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + fl0Var.K);
                    fl0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    org.telegram.ui.Components.s4.t0(fl0Var.Q, null, org.telegram.messenger.dd.L0(2131748216, null), null);
                    return;
                }
            case 18:
                wn0 wn0Var = (wn0) this.b;
                un unVar = wn0Var.F;
                if (unVar != null && unVar.c()) {
                    org.telegram.ui.Components.s4.K(wn0Var.getParentActivity(), unVar.a(), new sn0(wn0Var, r9));
                    return;
                } else {
                    wn0Var.a0(wn0Var.b, wn0Var.c, true, 0);
                    wn0Var.finishFragment();
                    return;
                }
            case 19:
                jo0 jo0Var = (jo0) this.b;
                un unVar2 = jo0Var.U;
                if (unVar2 == null || !unVar2.c()) {
                    jo0Var.j0(0, true);
                    return;
                } else {
                    org.telegram.ui.Components.s4.K(jo0Var.getParentActivity(), unVar2.a(), new ao0(jo0Var, r9));
                    return;
                }
            case 20:
                sr0 sr0Var = (sr0) this.b;
                if (sr0Var != null) {
                    sr0Var.z(0, org.telegram.messenger.i0.L(64.0f), false);
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
                zs0 zs0Var = (zs0) this.b;
                boolean[] zArr = zs0Var.x;
                CharSequence[] charSequenceArr = zs0Var.w;
                if (view.getTag() != null) {
                    return;
                }
                view.setTag(1);
                org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view.getParent();
                s4.c1 G = zs0Var.c.G(e6Var);
                if (G == null || (b10 = G.b()) == -1) {
                    return;
                }
                int i15 = b10 - zs0Var.n0;
                if (zs0Var.I && i15 < zs0Var.y) {
                    int i16 = -zs0Var.O;
                    zs0Var.O = i16;
                    org.telegram.messenger.i0.F3(i16, e6Var, null);
                    org.telegram.messenger.t2.D.a();
                    return;
                }
                zs0Var.b.s(b10);
                int i17 = i15 + 1;
                System.arraycopy(charSequenceArr, i17, charSequenceArr, i15, (charSequenceArr.length - 1) - i15);
                System.arraycopy(zArr, i17, zArr, i15, (zArr.length - 1) - i15);
                charSequenceArr[charSequenceArr.length - 1] = null;
                zArr[zArr.length - 1] = false;
                int i18 = zs0Var.D - 1;
                zs0Var.D = i18;
                if (zs0Var.r != null) {
                    int[] iArr = new int[i18];
                    while (r9 < i18) {
                        iArr[r9] = zs0Var.r[r9 >= i15 ? r9 + 1 : r9];
                        r9++;
                    }
                    zs0Var.r = iArr;
                }
                if (zs0Var.D == charSequenceArr.length - 1) {
                    zs0Var.b.i((zs0Var.n0 + charSequenceArr.length) - 1);
                }
                s4.c1 K = zs0Var.c.K(b10 - 1);
                EditTextBoldCursor textView = e6Var.getTextView();
                if (K != null) {
                    View view3 = K.a;
                    if (view3 instanceof org.telegram.ui.Cells.e6) {
                        ((org.telegram.ui.Cells.e6) view3).getTextView().requestFocus();
                        textView.clearFocus();
                        zs0Var.n0();
                        zs0Var.w0();
                        tx0Var = zs0Var.Q;
                        if (tx0Var != null) {
                            tx0Var.f();
                            zs0Var.Q.setDelegate(null);
                        }
                        zs0Var.b.g(zs0Var.p0);
                        return;
                    }
                }
                if (textView.isFocused()) {
                    org.telegram.messenger.i0.v1(textView);
                    zs0Var.p0(true);
                } else if (zs0Var.B0) {
                    zs0Var.p0(true);
                }
                textView.clearFocus();
                zs0Var.n0();
                zs0Var.w0();
                tx0Var = zs0Var.Q;
                if (tx0Var != null) {
                }
                zs0Var.b.g(zs0Var.p0);
                return;
            case 23:
                ((jt0) this.b).c(true);
                return;
            case 24:
                ((jt0) ((mg.s) this.b).c).c(true);
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                eu0 eu0Var = (eu0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                eu0 eu0Var2 = premiumPreviewFragment.f;
                if (eu0Var2 != null && (tL_premiumSubscriptionOption = eu0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                PremiumPreviewFragment.p0(premiumPreviewFragment, eu0Var, "settings", aVar);
                return;
            case 26:
                PrivacyControlActivity privacyControlActivity = ((ru0) this.b).d;
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
                bz0 bz0Var = (bz0) this.b;
                ProxyListActivity proxyListActivity = bz0Var.s;
                org.telegram.messenger.tz tzVar = bz0Var.d;
                iz0 iz0Var = new iz0(null);
                iz0Var.e = new org.telegram.ui.Cells.c7[3];
                iz0Var.f = new org.telegram.ui.Cells.b9[2];
                iz0Var.s = new org.telegram.ui.Cells.m6[3];
                iz0Var.D = 1.0f;
                iz0Var.E = new float[2];
                iz0Var.F = true;
                iz0Var.L = new cz0(iz0Var);
                iz0Var.J = tzVar;
                proxyListActivity.presentFragment(iz0Var);
                return;
            default:
                a01 a01Var = (a01) this.b;
                vh.d dVar = a01Var.s;
                if (!dVar.c0 || dVar.Q) {
                    return;
                }
                dVar.setLoading(true);
                b01.I0(a01Var.w, ((TextView) a01Var.h.c).getText(), a01Var.d.option, a01Var.n.getText().toString());
                return;
        }
    }
}
