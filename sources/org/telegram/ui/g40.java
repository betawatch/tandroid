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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class g40 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g40(Object obj, int i7) {
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
        org.telegram.ui.Components.rw0 rw0Var;
        TLRPC.TL_premiumSubscriptionOption tL_premiumSubscriptionOption;
        final int i7 = 4;
        final int i10 = 3;
        final int i11 = 2;
        com.google.android.gms.internal.clearcut.y0 y0Var = null;
        switch (this.a) {
            case 0:
                ((h40) this.b).b.a1(19);
                return;
            case 1:
                w40 w40Var = ((u40) this.b).J;
                w40Var.Y = null;
                w40Var.a0.b();
                w40Var.h.b();
                w40Var.p0();
                w40Var.w0();
                return;
            case 2:
                l50.f0(((j50) this.b).d, null);
                return;
            case 3:
                y50.a0((y50) this.b);
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
                i90 i90Var = (i90) this.b;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i90Var.getParentActivity());
                alertDialog$Builder.a.U = org.telegram.messenger.hd.M0(2131746026, null);
                alertDialog$Builder.a.S = org.telegram.messenger.hd.M0(2131746023, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131746024, null), new x80(i90Var, 1 == true ? 1 : 0));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                i90Var.showDialog(alertDialog$Builder.a);
                return;
            case 6:
                final gc0 gc0Var = (gc0) this.b;
                ce0 ce0Var = gc0Var.E;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ce0Var.getParentActivity());
                alertDialog$Builder2.a.S = org.telegram.messenger.hd.M0(2131746071, "RestorePasswordNoEmailTitle");
                alertDialog$Builder2.a.U = org.telegram.messenger.hd.M0(2131746075, "RestoreEmailTroubleText");
                alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131747831, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.fc0
                    @Override // org.telegram.ui.ActionBar.q1
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i12) {
                        switch (r2) {
                            case 0:
                                gc0Var.E.M1(6, true, new Bundle(), true);
                                break;
                            default:
                                gc0 gc0Var2 = gc0Var;
                                ce0.t0(gc0Var2.E, gc0Var2.r, gc0Var2.s, gc0Var2.w);
                                break;
                        }
                    }
                });
                String M0 = org.telegram.messenger.hd.M0(2131746117, null);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder2.h(M0, new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.fc0
                    @Override // org.telegram.ui.ActionBar.q1
                    public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i12) {
                        switch (c10) {
                            case 0:
                                gc0Var.E.M1(6, true, new Bundle(), true);
                                break;
                            default:
                                gc0 gc0Var2 = gc0Var;
                                ce0.t0(gc0Var2.E, gc0Var2.r, gc0Var2.s, gc0Var2.w);
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
                pc0 pc0Var = (pc0) this.b;
                ce0 ce0Var2 = pc0Var.H;
                if (ce0Var2.W.getTag() != null) {
                    return;
                }
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ce0Var2.getParentActivity());
                alertDialog$Builder3.a.S = org.telegram.messenger.hd.M0(2131746099, "ResetMyAccountWarning");
                alertDialog$Builder3.a.U = org.telegram.messenger.hd.M0(2131746097, "ResetMyAccountWarningText");
                alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131746098, "ResetMyAccountWarningReset"), new zr(pc0Var, 21));
                alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, "Cancel"), null);
                ce0Var2.showDialog(alertDialog$Builder3.a);
                return;
            case 8:
                rc0 rc0Var = (rc0) this.b;
                org.telegram.messenger.ns.e().b(new x4(rc0Var, i11), org.telegram.messenger.ns.c5);
                Context context = rc0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = org.telegram.messenger.r2.h;
                q6.m.e(str);
                hashSet.add(GoogleSignInOptions.x);
                if (hashSet.contains(GoogleSignInOptions.F)) {
                    Scope scope = GoogleSignInOptions.E;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.y);
                b9.k0 a10 = a8.v7.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a10.g().addOnCompleteListener(new tr(25, rc0Var, a10));
                return;
            case 9:
                ((pd0) this.b).a();
                return;
            case 10:
                final ze0 ze0Var = (ze0) this.b;
                cf0 cf0Var = ze0Var.L;
                if (ze0Var.n == null) {
                    return;
                }
                View view2 = cf0Var.fragmentView;
                if (view2 instanceof ViewGroup) {
                    org.telegram.ui.Components.m60 F = org.telegram.ui.Components.m60.F((ViewGroup) view2, null, ze0Var);
                    if (ze0Var.n.revoked) {
                        F.c(R.drawable.msg_delete, org.telegram.messenger.hd.M0(2131751598, null), new Runnable() { // from class: org.telegram.ui.we0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (r2) {
                                    case 0:
                                        final ze0 ze0Var2 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ze0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ze0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.hd.M0(2131751534, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.hd.M0(2131751533, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i13) {
                                                switch (i12) {
                                                    case 0:
                                                        ze0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ze0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.x(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ze0 ze0Var3 = ze0Var;
                                        try {
                                            if (ze0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ze0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(ze0Var3.L).j();
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
                                        cf0 cf0Var2 = ze0Var4.L;
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
                                        cf0 cf0Var3 = ze0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ze0Var5.n;
                                        i90 i90Var2 = new i90(1, cf0Var3.n);
                                        i90Var2.T = cf0Var3.t0;
                                        i90Var2.d0(tL_chatInviteExported2);
                                        cf0Var3.presentFragment(i90Var2);
                                        break;
                                    default:
                                        final ze0 ze0Var6 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ze0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ze0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.hd.M0(2131746026, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.hd.M0(2131746023, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131746024, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        ze0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ze0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.x(null, 2131752589, alertDialog$Builder5, null);
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
                                final int i12 = 1;
                                switch (c11) {
                                    case 0:
                                        final ze0 ze0Var2 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ze0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ze0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.hd.M0(2131751534, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.hd.M0(2131751533, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        ze0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ze0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.x(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ze0 ze0Var3 = ze0Var;
                                        try {
                                            if (ze0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ze0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(ze0Var3.L).j();
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
                                        cf0 cf0Var2 = ze0Var4.L;
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
                                        cf0 cf0Var3 = ze0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ze0Var5.n;
                                        i90 i90Var2 = new i90(1, cf0Var3.n);
                                        i90Var2.T = cf0Var3.t0;
                                        i90Var2.d0(tL_chatInviteExported2);
                                        cf0Var3.presentFragment(i90Var2);
                                        break;
                                    default:
                                        final ze0 ze0Var6 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ze0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ze0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.hd.M0(2131746026, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.hd.M0(2131746023, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131746024, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        ze0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ze0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.x(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.c(R.drawable.msg_share, org.telegram.messenger.hd.M0(2131745458, null), new Runnable() { // from class: org.telegram.ui.we0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i11) {
                                    case 0:
                                        final ze0 ze0Var2 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ze0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ze0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.hd.M0(2131751534, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.hd.M0(2131751533, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        ze0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ze0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.x(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ze0 ze0Var3 = ze0Var;
                                        try {
                                            if (ze0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ze0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(ze0Var3.L).j();
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
                                        cf0 cf0Var2 = ze0Var4.L;
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
                                        cf0 cf0Var3 = ze0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ze0Var5.n;
                                        i90 i90Var2 = new i90(1, cf0Var3.n);
                                        i90Var2.T = cf0Var3.t0;
                                        i90Var2.d0(tL_chatInviteExported2);
                                        cf0Var3.presentFragment(i90Var2);
                                        break;
                                    default:
                                        final ze0 ze0Var6 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ze0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ze0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.hd.M0(2131746026, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.hd.M0(2131746023, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131746024, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        ze0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ze0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.x(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, false);
                        F.l(R.drawable.msg_edit, org.telegram.messenger.hd.M0(2131751277, null), new Runnable() { // from class: org.telegram.ui.we0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i10) {
                                    case 0:
                                        final ze0 ze0Var2 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ze0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ze0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.hd.M0(2131751534, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.hd.M0(2131751533, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        ze0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ze0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.x(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ze0 ze0Var3 = ze0Var;
                                        try {
                                            if (ze0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ze0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(ze0Var3.L).j();
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
                                        cf0 cf0Var2 = ze0Var4.L;
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
                                        cf0 cf0Var3 = ze0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ze0Var5.n;
                                        i90 i90Var2 = new i90(1, cf0Var3.n);
                                        i90Var2.T = cf0Var3.t0;
                                        i90Var2.d0(tL_chatInviteExported2);
                                        cf0Var3.presentFragment(i90Var2);
                                        break;
                                    default:
                                        final ze0 ze0Var6 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ze0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ze0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.hd.M0(2131746026, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.hd.M0(2131746023, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131746024, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        ze0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ze0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.x(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, !ze0Var.n.permanent && cf0Var.q0);
                        F.m(R.drawable.msg_delete, new Runnable() { // from class: org.telegram.ui.we0
                            @Override // java.lang.Runnable
                            public final void run() {
                                final int i12 = 1;
                                switch (i7) {
                                    case 0:
                                        final ze0 ze0Var2 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported = ze0Var2.n;
                                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ze0Var2.L.getParentActivity());
                                        alertDialog$Builder4.a.S = org.telegram.messenger.hd.M0(2131751534, null);
                                        alertDialog$Builder4.a.U = org.telegram.messenger.hd.M0(2131751533, null);
                                        alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i12) {
                                                    case 0:
                                                        ze0Var2.L.k0(tL_chatInviteExported);
                                                        break;
                                                    default:
                                                        ze0Var2.L.h0(tL_chatInviteExported);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.x(null, 2131752589, alertDialog$Builder4, null);
                                        break;
                                    case 1:
                                        ze0 ze0Var3 = ze0Var;
                                        try {
                                            if (ze0Var3.n.link != null) {
                                                ((ClipboardManager) org.telegram.messenger.t0.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ze0Var3.n.link));
                                                org.telegram.ui.Components.cc.j(ze0Var3.L).j();
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
                                        cf0 cf0Var2 = ze0Var4.L;
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
                                        cf0 cf0Var3 = ze0Var5.L;
                                        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ze0Var5.n;
                                        i90 i90Var2 = new i90(1, cf0Var3.n);
                                        i90Var2.T = cf0Var3.t0;
                                        i90Var2.d0(tL_chatInviteExported2);
                                        cf0Var3.presentFragment(i90Var2);
                                        break;
                                    default:
                                        final ze0 ze0Var6 = ze0Var;
                                        final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ze0Var6.n;
                                        AlertDialog$Builder alertDialog$Builder5 = new AlertDialog$Builder(ze0Var6.L.getParentActivity());
                                        alertDialog$Builder5.a.U = org.telegram.messenger.hd.M0(2131746026, null);
                                        alertDialog$Builder5.a.S = org.telegram.messenger.hd.M0(2131746023, null);
                                        final int i13 = 0;
                                        alertDialog$Builder5.k(org.telegram.messenger.hd.M0(2131746024, null), new org.telegram.ui.ActionBar.q1() { // from class: org.telegram.ui.xe0
                                            @Override // org.telegram.ui.ActionBar.q1
                                            public final void h(org.telegram.ui.ActionBar.t1 t1Var, int i132) {
                                                switch (i13) {
                                                    case 0:
                                                        ze0Var6.L.k0(tL_chatInviteExported3);
                                                        break;
                                                    default:
                                                        ze0Var6.L.h0(tL_chatInviteExported3);
                                                        break;
                                                }
                                            }
                                        });
                                        i5.c.x(null, 2131752589, alertDialog$Builder5, null);
                                        break;
                                }
                            }
                        }, org.telegram.messenger.hd.M0(2131746023, null), cf0Var.q0, true);
                    }
                    F.W(cf0Var.b.U0(ze0Var, false));
                    F.Z();
                    return;
                }
                return;
            case 11:
                jg0 jg0Var = (jg0) this.b;
                long j3 = jg0Var.b;
                if (jg0Var.n.x4()) {
                    return;
                }
                if (jg0Var.getParentLayout().getFragmentStack().size() > 1) {
                    org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) jg0Var.getParentLayout().getFragmentStack().get(jg0Var.getParentLayout().getFragmentStack().size() - 2);
                    if ((e2Var instanceof an) && ((an) e2Var).e.id == j3) {
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
                ((org.telegram.ui.Cells.q8) this.b).setChecked(!r1.e.h);
                return;
            case 13:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.t4.a;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(context2);
                alertDialog$Builder4.a.S = org.telegram.messenger.hd.M0(2131750593, null);
                alertDialog$Builder4.a.U = org.telegram.messenger.hd.M0(2131750592, null);
                alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131752041, null), null);
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
                li0 li0Var = (li0) this.b;
                if (li0Var.a.getAnimatedDrawable().l0) {
                    return;
                }
                li0Var.a.getAnimatedDrawable().N(0, false, false);
                li0Var.a.d();
                return;
            case 16:
                ((PasskeysActivity) this.b).e0(view);
                return;
            case 17:
                ak0 ak0Var = (ak0) this.b;
                if (ak0Var.K) {
                    return;
                }
                int i13 = ak0Var.N;
                if ((i13 != 4 || ak0Var.M != 2) && i13 != 0) {
                    ak0Var.s();
                    return;
                }
                try {
                    PackageInfo packageInfo = org.telegram.messenger.t0.b.getPackageManager().getPackageInfo(org.telegram.messenger.t0.b.getPackageName(), 0);
                    Locale locale = Locale.US;
                    String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                    Intent intent = new Intent("android.intent.action.SENDTO");
                    intent.setData(Uri.parse("mailto:"));
                    intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                    intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + ak0Var.a);
                    intent.putExtra("android.intent.extra.TEXT", "Phone: " + ak0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + ak0Var.L);
                    ak0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                    return;
                } catch (Exception unused) {
                    org.telegram.ui.Components.t4.r0(ak0Var.R, null, org.telegram.messenger.hd.M0(2131748199, null), null);
                    return;
                }
            case 18:
                om0 om0Var = (om0) this.b;
                an anVar = om0Var.G;
                if (anVar != null && anVar.c()) {
                    org.telegram.ui.Components.t4.I(om0Var.getParentActivity(), anVar.a(), new km0(om0Var, r9));
                    return;
                } else {
                    om0Var.a0(om0Var.b, om0Var.c, true, 0);
                    om0Var.finishFragment();
                    return;
                }
            case 19:
                zm0 zm0Var = (zm0) this.b;
                an anVar2 = zm0Var.V;
                if (anVar2 == null || !anVar2.c()) {
                    zm0Var.j0(0, true);
                    return;
                } else {
                    org.telegram.ui.Components.t4.I(zm0Var.getParentActivity(), anVar2.a(), new sm0(zm0Var, r9));
                    return;
                }
            case 20:
                hq0 hq0Var = (hq0) this.b;
                if (hq0Var != null) {
                    hq0Var.z(0, org.telegram.messenger.g0.L(64.0f), false);
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
                nr0 nr0Var = (nr0) this.b;
                boolean[] zArr = nr0Var.x;
                CharSequence[] charSequenceArr = nr0Var.w;
                if (view.getTag() != null) {
                    return;
                }
                view.setTag(1);
                org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) view.getParent();
                v4.e1 G = nr0Var.c.G(z5Var);
                if (G == null || (b10 = G.b()) == -1) {
                    return;
                }
                int i14 = b10 - nr0Var.o0;
                if (nr0Var.J && i14 < nr0Var.y) {
                    int i15 = -nr0Var.P;
                    nr0Var.P = i15;
                    org.telegram.messenger.g0.F3(i15, z5Var, null);
                    org.telegram.messenger.p2.E.a();
                    return;
                }
                nr0Var.b.s(b10);
                int i16 = i14 + 1;
                System.arraycopy(charSequenceArr, i16, charSequenceArr, i14, (charSequenceArr.length - 1) - i14);
                System.arraycopy(zArr, i16, zArr, i14, (zArr.length - 1) - i14);
                charSequenceArr[charSequenceArr.length - 1] = null;
                zArr[zArr.length - 1] = false;
                int i17 = nr0Var.E - 1;
                nr0Var.E = i17;
                if (nr0Var.r != null) {
                    int[] iArr = new int[i17];
                    while (r9 < i17) {
                        iArr[r9] = nr0Var.r[r9 >= i14 ? r9 + 1 : r9];
                        r9++;
                    }
                    nr0Var.r = iArr;
                }
                if (nr0Var.E == charSequenceArr.length - 1) {
                    nr0Var.b.i((nr0Var.o0 + charSequenceArr.length) - 1);
                }
                v4.e1 K = nr0Var.c.K(b10 - 1);
                EditTextBoldCursor textView = z5Var.getTextView();
                if (K != null) {
                    View view3 = K.a;
                    if (view3 instanceof org.telegram.ui.Cells.z5) {
                        ((org.telegram.ui.Cells.z5) view3).getTextView().requestFocus();
                        textView.clearFocus();
                        nr0Var.n0();
                        nr0Var.w0();
                        rw0Var = nr0Var.R;
                        if (rw0Var != null) {
                            rw0Var.f();
                            nr0Var.R.setDelegate(null);
                        }
                        nr0Var.b.g(nr0Var.q0);
                        return;
                    }
                }
                if (textView.isFocused()) {
                    org.telegram.messenger.g0.v1(textView);
                    nr0Var.p0(true);
                } else if (nr0Var.C0) {
                    nr0Var.p0(true);
                }
                textView.clearFocus();
                nr0Var.n0();
                nr0Var.w0();
                rw0Var = nr0Var.R;
                if (rw0Var != null) {
                }
                nr0Var.b.g(nr0Var.q0);
                return;
            case 23:
                ((xr0) this.b).c(true);
                return;
            case 24:
                ((xr0) ((di.f4) this.b).c).c(true);
                return;
            case 25:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.b;
                ts0 ts0Var = (ts0) premiumPreviewFragment.d.get(premiumPreviewFragment.e);
                ts0 ts0Var2 = premiumPreviewFragment.f;
                if (ts0Var2 != null && (tL_premiumSubscriptionOption = ts0Var2.a) != null && tL_premiumSubscriptionOption.transaction != null) {
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
                PremiumPreviewFragment.p0(premiumPreviewFragment, ts0Var, "settings", y0Var);
                return;
            case 26:
                PrivacyControlActivity privacyControlActivity = ((ht0) this.b).d;
                privacyControlActivity.showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) privacyControlActivity, 27, false));
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
                mx0 mx0Var = (mx0) this.b;
                ProxyListActivity proxyListActivity = mx0Var.s;
                org.telegram.messenger.fz fzVar = mx0Var.d;
                tx0 tx0Var = new tx0(null);
                tx0Var.e = new org.telegram.ui.Cells.x6[3];
                tx0Var.f = new org.telegram.ui.Cells.y8[2];
                tx0Var.s = new org.telegram.ui.Cells.h6[3];
                tx0Var.E = 1.0f;
                tx0Var.F = new float[2];
                tx0Var.G = true;
                tx0Var.M = new nx0(tx0Var);
                tx0Var.K = fzVar;
                proxyListActivity.presentFragment(tx0Var);
                return;
            default:
                ly0 ly0Var = (ly0) this.b;
                hi.d dVar = ly0Var.s;
                if (!dVar.d0 || dVar.R) {
                    return;
                }
                dVar.setLoading(true);
                my0.I0(ly0Var.w, ((TextView) ly0Var.h.c).getText(), ly0Var.d.option, ly0Var.n.getText().toString());
                return;
        }
    }
}
