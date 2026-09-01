package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x028b  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.ry0 ry0Var;
        int i10 = 19;
        final int i11 = 4;
        final int i12 = 3;
        final int i13 = 2;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) this.b;
                npVar.a(!npVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", npVar.a.q).apply();
                break;
            case 1:
                ((l60) this.b).b.T0(19);
                break;
            case 2:
                z60 z60Var = ((x60) this.b).F;
                z60Var.U = null;
                z60Var.W.b();
                z60Var.h.b();
                z60Var.k0();
                z60Var.r0();
                break;
            case 3:
                n70.a0(((l70) this.b).d, null);
                break;
            case 4:
                d80.V((d80) this.b);
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.B0;
                launchActivity.E0 = null;
                launchActivity.p0(new LanguageSelectActivity());
                while (i14 < arrayList.size()) {
                    if (((Dialog) arrayList.get(i14)).isShowing()) {
                        ((Dialog) arrayList.get(i14)).dismiss();
                    }
                    i14++;
                }
                arrayList.clear();
                break;
            case 6:
                final te0 te0Var = (te0) this.b;
                og0 og0Var = te0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(og0Var.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.Q = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.se0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i15) {
                        switch (i14) {
                            case 0:
                                te0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                te0 te0Var2 = te0Var;
                                og0.n0(te0Var2.y, te0Var2.r, te0Var2.s, te0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c3 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.se0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i15) {
                        switch (c3) {
                            case 0:
                                te0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                te0 te0Var2 = te0Var;
                                og0.n0(te0Var2.y, te0Var2.r, te0Var2.s, te0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = og0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                bf0 bf0Var = (bf0) this.b;
                og0 og0Var2 = bf0Var.B;
                if (og0Var2.S.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(og0Var2.getParentActivity());
                    alertDialog$Builder2.a.O = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.Q = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new gu(bf0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    og0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 8:
                ef0 ef0Var = (ef0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new df0(ef0Var), NotificationCenter.onActivityResultReceived);
                Context context = ef0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                b6.m.f(str);
                hashSet.add(GoogleSignInOptions.w);
                if (hashSet.contains(GoogleSignInOptions.B)) {
                    Scope scope = GoogleSignInOptions.y;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.x);
                a8.e a2 = k7.z.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new rs(26, ef0Var, a2));
                break;
            case 9:
                final nh0 nh0Var = (nh0) this.b;
                qh0 qh0Var = nh0Var.H;
                if (nh0Var.n != null) {
                    View view2 = qh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.q70 F = org.telegram.ui.Components.q70.F((ViewGroup) view2, null, nh0Var);
                        if (nh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.kh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final nh0 nh0Var2 = nh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = nh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(nh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.lh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            nh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            nh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            l.d.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            nh0 nh0Var3 = nh0Var;
                                            try {
                                                if (nh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", nh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(nh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 2:
                                            nh0 nh0Var4 = nh0Var;
                                            qh0 qh0Var2 = nh0Var4.H;
                                            try {
                                                if (nh0Var4.n.link != null) {
                                                    Context context2 = nh0Var4.getContext();
                                                    String str2 = nh0Var4.n.link;
                                                    qh0Var2.showDialog(new mh0(nh0Var4, context2, str2, str2, qh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            nh0 nh0Var5 = nh0Var;
                                            qh0 qh0Var3 = nh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = nh0Var5.n;
                                            ob0 ob0Var = new ob0(1, qh0Var3.n);
                                            ob0Var.Q = qh0Var3.p0;
                                            ob0Var.Y(tL_chatInviteExported2);
                                            qh0Var3.presentFragment(ob0Var);
                                            break;
                                        default:
                                            final nh0 nh0Var6 = nh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = nh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(nh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.lh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            nh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            nh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            l.d.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i15 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c10 = 1 == true ? 1 : 0;
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.kh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c10) {
                                        case 0:
                                            final nh0 nh0Var2 = nh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = nh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(nh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.lh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            nh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            nh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            l.d.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            nh0 nh0Var3 = nh0Var;
                                            try {
                                                if (nh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", nh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(nh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 2:
                                            nh0 nh0Var4 = nh0Var;
                                            qh0 qh0Var2 = nh0Var4.H;
                                            try {
                                                if (nh0Var4.n.link != null) {
                                                    Context context2 = nh0Var4.getContext();
                                                    String str2 = nh0Var4.n.link;
                                                    qh0Var2.showDialog(new mh0(nh0Var4, context2, str2, str2, qh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            nh0 nh0Var5 = nh0Var;
                                            qh0 qh0Var3 = nh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = nh0Var5.n;
                                            ob0 ob0Var = new ob0(1, qh0Var3.n);
                                            ob0Var.Q = qh0Var3.p0;
                                            ob0Var.Y(tL_chatInviteExported2);
                                            qh0Var3.presentFragment(ob0Var);
                                            break;
                                        default:
                                            final nh0 nh0Var6 = nh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = nh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(nh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.lh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            nh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            nh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            l.d.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.kh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final nh0 nh0Var2 = nh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = nh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(nh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.lh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            nh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            nh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            l.d.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            nh0 nh0Var3 = nh0Var;
                                            try {
                                                if (nh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", nh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(nh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 2:
                                            nh0 nh0Var4 = nh0Var;
                                            qh0 qh0Var2 = nh0Var4.H;
                                            try {
                                                if (nh0Var4.n.link != null) {
                                                    Context context2 = nh0Var4.getContext();
                                                    String str2 = nh0Var4.n.link;
                                                    qh0Var2.showDialog(new mh0(nh0Var4, context2, str2, str2, qh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            nh0 nh0Var5 = nh0Var;
                                            qh0 qh0Var3 = nh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = nh0Var5.n;
                                            ob0 ob0Var = new ob0(1, qh0Var3.n);
                                            ob0Var.Q = qh0Var3.p0;
                                            ob0Var.Y(tL_chatInviteExported2);
                                            qh0Var3.presentFragment(ob0Var);
                                            break;
                                        default:
                                            final nh0 nh0Var6 = nh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = nh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(nh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.lh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            nh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            nh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            l.d.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.kh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final nh0 nh0Var2 = nh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = nh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(nh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.lh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            nh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            nh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            l.d.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            nh0 nh0Var3 = nh0Var;
                                            try {
                                                if (nh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", nh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(nh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 2:
                                            nh0 nh0Var4 = nh0Var;
                                            qh0 qh0Var2 = nh0Var4.H;
                                            try {
                                                if (nh0Var4.n.link != null) {
                                                    Context context2 = nh0Var4.getContext();
                                                    String str2 = nh0Var4.n.link;
                                                    qh0Var2.showDialog(new mh0(nh0Var4, context2, str2, str2, qh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            nh0 nh0Var5 = nh0Var;
                                            qh0 qh0Var3 = nh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = nh0Var5.n;
                                            ob0 ob0Var = new ob0(1, qh0Var3.n);
                                            ob0Var.Q = qh0Var3.p0;
                                            ob0Var.Y(tL_chatInviteExported2);
                                            qh0Var3.presentFragment(ob0Var);
                                            break;
                                        default:
                                            final nh0 nh0Var6 = nh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = nh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(nh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.lh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            nh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            nh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            l.d.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !nh0Var.n.permanent && qh0Var.m0);
                            F.m(qh0Var.m0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.kh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final nh0 nh0Var2 = nh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = nh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(nh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.lh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            nh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            nh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            l.d.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            nh0 nh0Var3 = nh0Var;
                                            try {
                                                if (nh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", nh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(nh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 2:
                                            nh0 nh0Var4 = nh0Var;
                                            qh0 qh0Var2 = nh0Var4.H;
                                            try {
                                                if (nh0Var4.n.link != null) {
                                                    Context context2 = nh0Var4.getContext();
                                                    String str2 = nh0Var4.n.link;
                                                    qh0Var2.showDialog(new mh0(nh0Var4, context2, str2, str2, qh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            nh0 nh0Var5 = nh0Var;
                                            qh0 qh0Var3 = nh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = nh0Var5.n;
                                            ob0 ob0Var = new ob0(1, qh0Var3.n);
                                            ob0Var.Q = qh0Var3.p0;
                                            ob0Var.Y(tL_chatInviteExported2);
                                            qh0Var3.presentFragment(ob0Var);
                                            break;
                                        default:
                                            final nh0 nh0Var6 = nh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = nh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(nh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.lh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            nh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            nh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            l.d.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(qh0Var.b.V0(nh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                bj0 bj0Var = (bj0) this.b;
                long j10 = bj0Var.b;
                if (!bj0Var.n.isStory()) {
                    if (bj0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) bj0Var.getParentLayout().getFragmentStack().get(bj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((p2Var instanceof xn) && ((xn) p2Var).e.id == j10) {
                            bj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle g10 = l.d.g(j10, "chat_id");
                    g10.putInt("message_id", bj0Var.c);
                    g10.putBoolean("need_remove_previous_same_chat_activity", false);
                    bj0Var.presentFragment(new xn(g10));
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Cells.s8) this.b).setChecked(!r1.e.h);
                break;
            case 12:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.z4.a;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.O = LocaleController.getString(R.string.ForgotPasscode);
                alertDialog$Builder3.a.Q = LocaleController.getString(R.string.ForgotPasscodeInfo);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder3.a.show();
                break;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i16 = passcodeActivity.x;
                if (i16 != 1) {
                    if (i16 == 2) {
                        passcodeActivity.g0();
                        break;
                    }
                } else if (passcodeActivity.B != 0) {
                    passcodeActivity.g0();
                    break;
                } else {
                    passcodeActivity.h0();
                    break;
                }
                break;
            case 14:
                il0 il0Var = (il0) this.b;
                if (!il0Var.a.getAnimatedDrawable().i0) {
                    il0Var.a.getAnimatedDrawable().L(0, false, false);
                    il0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 16:
                bn0 bn0Var = (bn0) this.b;
                if (!bn0Var.G) {
                    int i17 = bn0Var.J;
                    if ((i17 != 4 || bn0Var.I != 2) && i17 != 0) {
                        bn0Var.t();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + bn0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + bn0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + bn0Var.H);
                            bn0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.z4.u0(bn0Var.N, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                ((dp0) this.b).g0.w0();
                break;
            case 18:
                rp0 rp0Var = (rp0) this.b;
                xn xnVar = rp0Var.C;
                if (xnVar != null && xnVar.c()) {
                    org.telegram.ui.Components.z4.L(rp0Var.getParentActivity(), xnVar.a(), new jp0(rp0Var, i14));
                    break;
                } else {
                    rp0Var.V(rp0Var.b, rp0Var.c, true, 0);
                    rp0Var.finishFragment();
                    break;
                }
            case 19:
                hq0 hq0Var = (hq0) this.b;
                xn xnVar2 = hq0Var.R;
                if (xnVar2 != null && xnVar2.c()) {
                    org.telegram.ui.Components.z4.L(hq0Var.getParentActivity(), xnVar2.a(), new vp0(hq0Var, i14));
                    break;
                } else {
                    hq0Var.e0(0, true);
                    break;
                }
            case 20:
                vt0 vt0Var = (vt0) this.b;
                if (vt0Var != null) {
                    vt0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 21:
                eu0 eu0Var = (eu0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = eu0Var.d;
                int indexOf = photoViewer.d7.indexOf(tag);
                if (indexOf < 0) {
                    int Q = photoViewer.d.Q(tag);
                    if (Q >= 0) {
                        photoViewer.m1.u(Q);
                        if (Q == 0) {
                            photoViewer.m1.m(0);
                        }
                        photoViewer.A3();
                        break;
                    }
                } else {
                    int k10 = photoViewer.d.k(indexOf, photoViewer.n1());
                    boolean x10 = photoViewer.d.x(indexOf);
                    if (indexOf == photoViewer.M4) {
                        photoViewer.K0.b(x10, true);
                    }
                    if (k10 >= 0) {
                        photoViewer.m1.u(k10);
                        if (k10 == 0) {
                            photoViewer.m1.m(0);
                        }
                    }
                    photoViewer.A3();
                    break;
                }
                break;
            case 22:
                hv0 hv0Var = (hv0) this.b;
                boolean[] zArr = hv0Var.w;
                CharSequence[] charSequenceArr = hv0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view.getParent();
                    f2.m1 G = hv0Var.c.G(c6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - hv0Var.k0;
                        if (hv0Var.F && i18 < hv0Var.x) {
                            int i19 = -hv0Var.L;
                            hv0Var.L = i19;
                            AndroidUtilities.shakeViewSpring(c6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            hv0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = hv0Var.y - 1;
                            hv0Var.y = i21;
                            if (hv0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = hv0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                hv0Var.r = iArr;
                            }
                            if (hv0Var.y == charSequenceArr.length - 1) {
                                hv0Var.b.o((hv0Var.k0 + charSequenceArr.length) - 1);
                            }
                            f2.m1 K = hv0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = c6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    hv0Var.i0();
                                    hv0Var.r0();
                                    ry0Var = hv0Var.N;
                                    if (ry0Var != null) {
                                        ry0Var.f();
                                        hv0Var.N.setDelegate(null);
                                    }
                                    hv0Var.b.m(hv0Var.m0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                hv0Var.k0(true);
                            } else if (hv0Var.y0) {
                                hv0Var.k0(true);
                            }
                            textView.clearFocus();
                            hv0Var.i0();
                            hv0Var.r0();
                            ry0Var = hv0Var.N;
                            if (ry0Var != null) {
                            }
                            hv0Var.b.m(hv0Var.m0);
                        }
                    }
                }
                break;
            case 23:
                ((tv0) this.b).c(true);
                break;
            case 24:
                ((tv0) ((hg.u) this.b).c).c(true);
                break;
            case 25:
                PrivacyControlActivity privacyControlActivity = ((gx0) this.b).d;
                privacyControlActivity.showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) privacyControlActivity, 27, false));
                break;
            case 26:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                int intValue = ((Integer) z1Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.W;
                boolean z4 = !zArr2[intValue];
                zArr2[intValue] = z4;
                z1Var.c(z4, true);
                break;
            case 27:
                r11 r11Var = (r11) this.b;
                ProxyListActivity proxyListActivity = r11Var.s;
                SharedConfig.ProxyInfo proxyInfo = r11Var.d;
                z11 z11Var = new z11(null);
                z11Var.e = new org.telegram.ui.Cells.z6[3];
                z11Var.f = new org.telegram.ui.Cells.a9[2];
                z11Var.s = new org.telegram.ui.Cells.j6[3];
                z11Var.y = 1.0f;
                z11Var.B = new float[2];
                z11Var.C = true;
                z11Var.I = new s11(z11Var);
                z11Var.G = proxyInfo;
                proxyListActivity.presentFragment(z11Var);
                break;
            case 28:
                n21 n21Var = (n21) this.b;
                ValueAnimator valueAnimator = n21Var.K;
                if (valueAnimator == null) {
                    boolean z10 = !n21Var.J;
                    o21 o21Var = n21Var.d;
                    l21 l21Var = n21Var.C;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) o21Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) n21Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    l21Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    l21Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    l21Var.getLocationInWindow(iArr2);
                    float f10 = iArr2[0];
                    float f11 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    n21Var.L = new org.telegram.ui.Components.wo(n21Var, o21Var.getParentActivity(), z10, canvas, (l21Var.getMeasuredWidth() / 2.0f) + f10, (l21Var.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f10, f11, 1);
                    n21Var.M = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    n21Var.K = ofFloat;
                    ofFloat.addUpdateListener(new j11(n21Var, i12));
                    n21Var.K.addListener(new ns0(n21Var, 15));
                    n21Var.K.setDuration(400L);
                    n21Var.K.setInterpolator(org.telegram.ui.Components.jt.e);
                    n21Var.K.start();
                    frameLayout2.addView(n21Var.L, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.rv0(8, n21Var, z10));
                    break;
                }
                break;
            default:
                l31 l31Var = (l31) this.b;
                qh.d dVar = l31Var.s;
                if (dVar.T && !dVar.K) {
                    dVar.setLoading(true);
                    m31.G(l31Var.v, ((TextView) l31Var.h.c).getText(), l31Var.d.option, l31Var.n.getText().toString());
                    break;
                }
                break;
        }
    }
}
