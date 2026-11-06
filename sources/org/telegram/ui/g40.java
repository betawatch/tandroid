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

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g40(Object obj, int i7) {
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
        org.telegram.ui.Components.ow0 ow0Var;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        int i7 = 21;
        final int i10 = 4;
        final int i11 = 3;
        final int i12 = 2;
        com.google.android.gms.internal.clearcut.z0 z0Var = null;
        switch (this.a) {
            case 0:
                ((h40) this.b).b.a1(19);
                return;
            case 1:
                w40 w40Var = ((u40) this.b).I;
                w40Var.X = null;
                w40Var.Z.b();
                w40Var.h.b();
                w40Var.p0();
                w40Var.w0();
                return;
            case 2:
                m50.f0(((k50) this.b).d, null);
                return;
            case 3:
                z50.a0((z50) this.b);
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
                h90 h90Var = (h90) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h90Var.getParentActivity());
                alertDialog$Builder.a.T = org.telegram.messenger.hd.M0(2131746027, null);
                alertDialog$Builder.a.R = org.telegram.messenger.hd.M0(2131746024, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746025, null), new x80(h90Var, 1 == true ? 1 : 0));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                h90Var.showDialog(alertDialog$Builder.a);
                return;
            case 6:
                final hc0 hc0Var = (hc0) this.b;
                ce0 ce0Var = hc0Var.D;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ce0Var.getParentActivity());
                alertDialog$Builder2.a.R = org.telegram.messenger.hd.M0(2131746072, "RestorePasswordNoEmailTitle");
                alertDialog$Builder2.a.T = org.telegram.messenger.hd.M0(2131746076, "RestoreEmailTroubleText");
                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747830, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.gc0
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i13) {
                        switch (r2) {
                            case 0:
                                hc0Var.D.M1(6, true, new Bundle(), true);
                                break;
                            default:
                                hc0 hc0Var2 = hc0Var;
                                ce0.t0(hc0Var2.D, hc0Var2.r, hc0Var2.s, hc0Var2.w);
                                break;
                        }
                    }
                });
                String M0 = org.telegram.messenger.hd.M0(2131746118, null);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder2.h(M0, new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.gc0
                    @Override // org.telegram.ui.ActionBar.r1
                    public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i13) {
                        switch (c10) {
                            case 0:
                                hc0Var.D.M1(6, true, new Bundle(), true);
                                break;
                            default:
                                hc0 hc0Var2 = hc0Var;
                                ce0.t0(hc0Var2.D, hc0Var2.r, hc0Var2.s, hc0Var2.w);
                                break;
                        }
                    }
                });
                Dialog showDialog = ce0Var.showDialog(alertDialog$Builder2.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    return;
                }
                return;
            case 7:
                qc0 qc0Var = (qc0) this.b;
                ce0 ce0Var2 = qc0Var.G;
                if (ce0Var2.V.getTag() != null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ce0Var2.getParentActivity());
                alertDialog$Builder3.a.R = org.telegram.messenger.hd.M0(2131746100, "ResetMyAccountWarning");
                alertDialog$Builder3.a.T = org.telegram.messenger.hd.M0(2131746098, "ResetMyAccountWarningText");
                alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131746099, "ResetMyAccountWarningReset"), new wr(qc0Var, i7));
                alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                ce0Var2.showDialog(alertDialog$Builder3.a);
                return;
            case 8:
                sc0 sc0Var = (sc0) this.b;
                org.telegram.messenger.qs.e().b(new x4(sc0Var, i12), org.telegram.messenger.qs.c5);
                Context context = sc0Var.getContext();
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
                a10.g().addOnCompleteListener(new pu(i7, sc0Var, a10));
                return;
            case 9:
                ((pd0) this.b).a();
                return;
            case 10:
                final ze0 ze0Var = (ze0) this.b;
                cf0 cf0Var = ze0Var.K;
                if (ze0Var.n == null) {
                    return;
                }
                View view2 = cf0Var.fragmentView;
                if (view2 instanceof ViewGroup) {
                    org.telegram.ui.Components.k60 F = org.telegram.ui.Components.k60.F((ViewGroup) view2, null, ze0Var);
                    if (ze0Var.n.revoked) {
                        F.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751599, null), new Runnable() { // from class: org.telegram.ui.we0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (r2) {
                                    case 0:
                                        final ze0 ze0Var2 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ze0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ze0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.hd.M0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.hd.M0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751599, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i14) {
                                                switch (i13) {
                                                    case 0:
                                                        ze0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ze0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ze0 ze0Var3 = ze0Var;
                                        try {
                                            if (ze0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ze0Var3.n.link));
                                                org.telegram.ui.Components.hc.j(ze0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        ze0 ze0Var4 = ze0Var;
                                        cf0 cf0Var2 = ze0Var4.K;
                                        try {
                                            if (ze0Var4.n.link != null) {
                                                Context context2 = ze0Var4.getContext();
                                                String str2 = ze0Var4.n.link;
                                                cf0Var2.showDialog(new ye0(ze0Var4, context2, str2, str2, cf0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        ze0 ze0Var5 = ze0Var;
                                        cf0 cf0Var3 = ze0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ze0Var5.n;
                                        h90 h90Var2 = new h90(1, cf0Var3.n);
                                        h90Var2.S = cf0Var3.s0;
                                        h90Var2.d0(tL_chatInviteExported2);
                                        cf0Var3.presentFragment(h90Var2);
                                        break;
                                    default:
                                        final ze0 ze0Var6 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ze0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ze0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.hd.M0(2131746027, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.hd.M0(2131746024, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131746025, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        ze0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ze0Var6.K.h0(tL_chatInviteExported3);
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
                        String M02 = org.telegram.messenger.hd.M0(2131751762, null);
                        final char c11 = 1 == true ? 1 : 0;
                        F.c(R.drawable.msg_copy, M02, new Runnable() { // from class: org.telegram.ui.we0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (c11) {
                                    case 0:
                                        final ze0 ze0Var2 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ze0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ze0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.hd.M0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.hd.M0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751599, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        ze0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ze0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ze0 ze0Var3 = ze0Var;
                                        try {
                                            if (ze0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ze0Var3.n.link));
                                                org.telegram.ui.Components.hc.j(ze0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        ze0 ze0Var4 = ze0Var;
                                        cf0 cf0Var2 = ze0Var4.K;
                                        try {
                                            if (ze0Var4.n.link != null) {
                                                Context context2 = ze0Var4.getContext();
                                                String str2 = ze0Var4.n.link;
                                                cf0Var2.showDialog(new ye0(ze0Var4, context2, str2, str2, cf0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        ze0 ze0Var5 = ze0Var;
                                        cf0 cf0Var3 = ze0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ze0Var5.n;
                                        h90 h90Var2 = new h90(1, cf0Var3.n);
                                        h90Var2.S = cf0Var3.s0;
                                        h90Var2.d0(tL_chatInviteExported2);
                                        cf0Var3.presentFragment(h90Var2);
                                        break;
                                    default:
                                        final ze0 ze0Var6 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ze0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ze0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.hd.M0(2131746027, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.hd.M0(2131746024, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131746025, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        ze0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ze0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.c(R.drawable.msg_share, org.telegram.messenger.hd.M0(2131745459, null), new Runnable() { // from class: org.telegram.ui.we0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i12) {
                                    case 0:
                                        final ze0 ze0Var2 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ze0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ze0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.hd.M0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.hd.M0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751599, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        ze0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ze0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ze0 ze0Var3 = ze0Var;
                                        try {
                                            if (ze0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ze0Var3.n.link));
                                                org.telegram.ui.Components.hc.j(ze0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        ze0 ze0Var4 = ze0Var;
                                        cf0 cf0Var2 = ze0Var4.K;
                                        try {
                                            if (ze0Var4.n.link != null) {
                                                Context context2 = ze0Var4.getContext();
                                                String str2 = ze0Var4.n.link;
                                                cf0Var2.showDialog(new ye0(ze0Var4, context2, str2, str2, cf0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        ze0 ze0Var5 = ze0Var;
                                        cf0 cf0Var3 = ze0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ze0Var5.n;
                                        h90 h90Var2 = new h90(1, cf0Var3.n);
                                        h90Var2.S = cf0Var3.s0;
                                        h90Var2.d0(tL_chatInviteExported2);
                                        cf0Var3.presentFragment(h90Var2);
                                        break;
                                    default:
                                        final ze0 ze0Var6 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ze0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ze0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.hd.M0(2131746027, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.hd.M0(2131746024, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131746025, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        ze0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ze0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.l(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751278, null), new Runnable() { // from class: org.telegram.ui.we0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i11) {
                                    case 0:
                                        final ze0 ze0Var2 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ze0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ze0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.hd.M0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.hd.M0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751599, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        ze0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ze0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ze0 ze0Var3 = ze0Var;
                                        try {
                                            if (ze0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ze0Var3.n.link));
                                                org.telegram.ui.Components.hc.j(ze0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        ze0 ze0Var4 = ze0Var;
                                        cf0 cf0Var2 = ze0Var4.K;
                                        try {
                                            if (ze0Var4.n.link != null) {
                                                Context context2 = ze0Var4.getContext();
                                                String str2 = ze0Var4.n.link;
                                                cf0Var2.showDialog(new ye0(ze0Var4, context2, str2, str2, cf0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        ze0 ze0Var5 = ze0Var;
                                        cf0 cf0Var3 = ze0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ze0Var5.n;
                                        h90 h90Var2 = new h90(1, cf0Var3.n);
                                        h90Var2.S = cf0Var3.s0;
                                        h90Var2.d0(tL_chatInviteExported2);
                                        cf0Var3.presentFragment(h90Var2);
                                        break;
                                    default:
                                        final ze0 ze0Var6 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ze0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ze0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.hd.M0(2131746027, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.hd.M0(2131746024, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131746025, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        ze0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ze0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, !ze0Var.n.permanent && cf0Var.p0);
                        F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.we0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i13 = 1;
                                switch (i10) {
                                    case 0:
                                        final ze0 ze0Var2 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ze0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ze0Var2.K.getParentActivity());
                                        alertDialog$Builder4.a.R = org.telegram.messenger.hd.M0(2131751535, null);
                                        alertDialog$Builder4.a.T = org.telegram.messenger.hd.M0(2131751534, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751599, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i13) {
                                                    case 0:
                                                        ze0Var2.K.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ze0Var2.K.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ze0 ze0Var3 = ze0Var;
                                        try {
                                            if (ze0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ze0Var3.n.link));
                                                org.telegram.ui.Components.hc.j(ze0Var3.K).j();
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    case 2:
                                        ze0 ze0Var4 = ze0Var;
                                        cf0 cf0Var2 = ze0Var4.K;
                                        try {
                                            if (ze0Var4.n.link != null) {
                                                Context context2 = ze0Var4.getContext();
                                                String str2 = ze0Var4.n.link;
                                                cf0Var2.showDialog(new ye0(ze0Var4, context2, str2, str2, cf0Var2.getResourceProvider()));
                                                break;
                                            } else {
                                                break;
                                            }
                                        } catch (Exception e11) {
                                            org.telegram.messenger.a8.g(e11, true);
                                            return;
                                        }
                                    case 3:
                                        ze0 ze0Var5 = ze0Var;
                                        cf0 cf0Var3 = ze0Var5.K;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ze0Var5.n;
                                        h90 h90Var2 = new h90(1, cf0Var3.n);
                                        h90Var2.S = cf0Var3.s0;
                                        h90Var2.d0(tL_chatInviteExported2);
                                        cf0Var3.presentFragment(h90Var2);
                                        break;
                                    default:
                                        final ze0 ze0Var6 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ze0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ze0Var6.K.getParentActivity());
                                        alertDialog$Builder5.a.T = org.telegram.messenger.hd.M0(2131746027, null);
                                        alertDialog$Builder5.a.R = org.telegram.messenger.hd.M0(2131746024, null);
                                        final int i14 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131746025, null), new org.telegram.ui.ActionBar.r1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.r1
                                            public final void g(org.telegram.ui.ActionBar.u1 u1Var, int i142) {
                                                switch (i14) {
                                                    case 0:
                                                        ze0Var6.K.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ze0Var6.K.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        jg.g.w(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, org.telegram.messenger.hd.M0(2131746024, null), cf0Var.p0, true);
                    }
                    F.W(cf0Var.b.U0(ze0Var, false));
                    F.Z();
                    return;
                }
                return;
            case 11:
                jg0 jg0Var = (jg0) this.b;
                long j3 = jg0Var.b;
                if (jg0Var.n.y4()) {
                    return;
                }
                if (jg0Var.getParentLayout().getFragmentStack().size() > 1) {
                    org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) jg0Var.getParentLayout().getFragmentStack().get(jg0Var.getParentLayout().getFragmentStack().size() - 2);
                    if ((f2Var instanceof an) && ((an) f2Var).e.id == j3) {
                        jg0Var.finishFragment();
                        return;
                    }
                }
                Bundle j10 = a8.p0.j(j3, "chat_id");
                j10.putInt("message_id", jg0Var.c);
                j10.putBoolean("need_remove_previous_same_chat_activity", false);
                jg0Var.presentFragment(new an(j10));
                return;
            case 12:
                ((org.telegram.ui.Cells.r8) this.b).setChecked(!r1.e.h);
                return;
            case 13:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.v4.a;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                alertDialog$Builder4.a.R = org.telegram.messenger.hd.M0(2131750594, null);
                alertDialog$Builder4.a.T = org.telegram.messenger.hd.M0(2131750593, null);
                alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131752041, null), null);
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
                ji0 ji0Var = (ji0) this.b;
                if (ji0Var.a.getAnimatedDrawable().k0) {
                    return;
                }
                ji0Var.a.getAnimatedDrawable().N(0, false, false);
                ji0Var.a.d();
                return;
            case 16:
                ((PasskeysActivity) this.b).e0(view);
                return;
            case 17:
                xj0 xj0Var = (xj0) this.b;
                if (xj0Var.J) {
                    return;
                }
                int i14 = xj0Var.M;
                if ((i14 != 4 || xj0Var.L != 2) && i14 != 0) {
                    xj0Var.s();
                    return;
                }
                try {
                    PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                    intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + xj0Var.a);
                    intent.putExtra("android.intent.extra.TEXT", "Phone: " + xj0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + xj0Var.K);
                    xj0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    org.telegram.ui.Components.v4.r0(xj0Var.Q, null, org.telegram.messenger.hd.M0(2131748198, null), null);
                    return;
                }
            case 18:
                mm0 mm0Var = (mm0) this.b;
                an anVar = mm0Var.F;
                if (anVar != null && anVar.c()) {
                    org.telegram.ui.Components.v4.I(mm0Var.getParentActivity(), anVar.a(), new im0(mm0Var, r10));
                    return;
                } else {
                    mm0Var.a0(mm0Var.b, mm0Var.c, true, 0);
                    mm0Var.finishFragment();
                    return;
                }
            case 19:
                xm0 xm0Var = (xm0) this.b;
                an anVar2 = xm0Var.U;
                if (anVar2 == null || !anVar2.c()) {
                    xm0Var.j0(0, true);
                    return;
                } else {
                    org.telegram.ui.Components.v4.I(xm0Var.getParentActivity(), anVar2.a(), new qm0(xm0Var, r10));
                    return;
                }
            case 20:
                iq0 iq0Var = (iq0) this.b;
                if (iq0Var != null) {
                    iq0Var.z(0, org.telegram.messenger.g0.L(64.0f), false);
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
                pr0 pr0Var = (pr0) this.b;
                boolean[] zArr = pr0Var.x;
                CharSequence[] charSequenceArr = pr0Var.w;
                if (view.getTag() != null) {
                    return;
                }
                view.setTag(1);
                org.telegram.ui.Cells.a6 a6Var = (org.telegram.ui.Cells.a6) view.getParent();
                v4.d1 G = pr0Var.c.G(a6Var);
                if (G == null || (b10 = G.b()) == -1) {
                    return;
                }
                int i15 = b10 - pr0Var.n0;
                if (pr0Var.I && i15 < pr0Var.y) {
                    int i16 = -pr0Var.O;
                    pr0Var.O = i16;
                    org.telegram.messenger.g0.G3(i16, a6Var, null);
                    org.telegram.messenger.p2.D.a();
                    return;
                }
                pr0Var.b.s(b10);
                int i17 = i15 + 1;
                System.arraycopy(charSequenceArr, i17, charSequenceArr, i15, (charSequenceArr.length - 1) - i15);
                System.arraycopy(zArr, i17, zArr, i15, (zArr.length - 1) - i15);
                charSequenceArr[charSequenceArr.length - 1] = null;
                zArr[zArr.length - 1] = false;
                int i18 = pr0Var.D - 1;
                pr0Var.D = i18;
                if (pr0Var.r != null) {
                    int[] iArr = new int[i18];
                    while (r10 < i18) {
                        iArr[r10] = pr0Var.r[r10 >= i15 ? r10 + 1 : r10];
                        r10++;
                    }
                    pr0Var.r = iArr;
                }
                if (pr0Var.D == charSequenceArr.length - 1) {
                    pr0Var.b.i((pr0Var.n0 + charSequenceArr.length) - 1);
                }
                v4.d1 K = pr0Var.c.K(b10 - 1);
                EditTextBoldCursor textView = a6Var.getTextView();
                if (K != null) {
                    View view3 = K.a;
                    if (view3 instanceof org.telegram.ui.Cells.a6) {
                        ((org.telegram.ui.Cells.a6) view3).getTextView().requestFocus();
                        textView.clearFocus();
                        pr0Var.n0();
                        pr0Var.w0();
                        ow0Var = pr0Var.Q;
                        if (ow0Var != null) {
                            ow0Var.f();
                            pr0Var.Q.setDelegate(null);
                        }
                        pr0Var.b.g(pr0Var.p0);
                        return;
                    }
                }
                if (textView.isFocused()) {
                    org.telegram.messenger.g0.v1(textView);
                    pr0Var.p0(true);
                } else if (pr0Var.B0) {
                    pr0Var.p0(true);
                }
                textView.clearFocus();
                pr0Var.n0();
                pr0Var.w0();
                ow0Var = pr0Var.Q;
                if (ow0Var != null) {
                }
                pr0Var.b.g(pr0Var.p0);
                return;
            case 23:
                ((zr0) this.b).c(true);
                return;
            case 24:
                ((zr0) ((bi.g5) this.b).c).c(true);
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                ws0 ws0Var = (ws0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                ws0 ws0Var2 = premiumPreviewFragment.f;
                if (ws0Var2 != null && (tL_premiumSubscriptionOption = ws0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                PremiumPreviewFragment.p0(premiumPreviewFragment, ws0Var, "settings", z0Var);
                return;
            case 26:
                PrivacyControlActivity privacyControlActivity = ((jt0) this.b).d;
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
                nx0 nx0Var = (nx0) this.b;
                ProxyListActivity proxyListActivity = nx0Var.s;
                org.telegram.messenger.hz hzVar = nx0Var.d;
                ux0 ux0Var = new ux0(null);
                ux0Var.e = new org.telegram.ui.Cells.y6[3];
                ux0Var.f = new org.telegram.ui.Cells.z8[2];
                ux0Var.s = new org.telegram.ui.Cells.i6[3];
                ux0Var.D = 1.0f;
                ux0Var.E = new float[2];
                ux0Var.F = true;
                ux0Var.L = new ox0(ux0Var);
                ux0Var.J = hzVar;
                proxyListActivity.presentFragment(ux0Var);
                return;
            default:
                ny0 ny0Var = (ny0) this.b;
                fi.d dVar = ny0Var.s;
                if (!dVar.c0 || dVar.Q) {
                    return;
                }
                dVar.setLoading(true);
                oy0.I0(ny0Var.w, ((TextView) ny0Var.h.c).getText(), ny0Var.d.option, ny0Var.n.getText().toString());
                return;
        }
    }
}
