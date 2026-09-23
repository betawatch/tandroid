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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class h60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ h60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0299  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.my0 my0Var;
        int i10 = 19;
        final int i11 = 4;
        final int i12 = 3;
        final int i13 = 2;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.op opVar = (org.telegram.ui.Components.op) this.b;
                opVar.a(!opVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", opVar.a.q).apply();
                break;
            case 1:
                ((m60) this.b).b.T0(19);
                break;
            case 2:
                b70 b70Var = ((z60) this.b).I;
                b70Var.X = null;
                b70Var.Z.b();
                b70Var.h.b();
                b70Var.k0();
                b70Var.r0();
                break;
            case 3:
                q70.a0(((o70) this.b).d, null);
                break;
            case 4:
                i80.V((i80) this.b);
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.E0;
                launchActivity.H0 = null;
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
                final ve0 ve0Var = (ve0) this.b;
                rg0 rg0Var = ve0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.ue0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        switch (i14) {
                            case 0:
                                ve0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ve0 ve0Var2 = ve0Var;
                                rg0.n0(ve0Var2.y, ve0Var2.r, ve0Var2.s, ve0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.ue0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        switch (c10) {
                            case 0:
                                ve0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ve0 ve0Var2 = ve0Var;
                                rg0.n0(ve0Var2.y, ve0Var2.r, ve0Var2.s, ve0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = rg0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                df0 df0Var = (df0) this.b;
                rg0 rg0Var2 = df0Var.E;
                if (rg0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(rg0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new eu(df0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    rg0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 8:
                gf0 gf0Var = (gf0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new ff0(gf0Var), NotificationCenter.onActivityResultReceived);
                Context context = gf0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                n6.l.f(str);
                hashSet.add(GoogleSignInOptions.w);
                if (hashSet.contains(GoogleSignInOptions.E)) {
                    Scope scope = GoogleSignInOptions.y;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.x);
                com.google.android.gms.internal.clearcut.v0 a2 = w7.d9.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new w10(18, gf0Var, a2));
                break;
            case 9:
                final qh0 qh0Var = (qh0) this.b;
                th0 th0Var = qh0Var.K;
                if (qh0Var.n != null) {
                    View view2 = th0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.o70 F = org.telegram.ui.Components.o70.F((ViewGroup) view2, null, qh0Var);
                        if (qh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.nh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final qh0 qh0Var2 = qh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = qh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(qh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.oh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            qh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            qh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            qh0 qh0Var3 = qh0Var;
                                            try {
                                                if (qh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", qh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(qh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            qh0 qh0Var4 = qh0Var;
                                            th0 th0Var2 = qh0Var4.K;
                                            try {
                                                if (qh0Var4.n.link != null) {
                                                    Context context2 = qh0Var4.getContext();
                                                    String str2 = qh0Var4.n.link;
                                                    th0Var2.showDialog(new ph0(qh0Var4, context2, str2, str2, th0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            qh0 qh0Var5 = qh0Var;
                                            th0 th0Var3 = qh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = qh0Var5.n;
                                            sb0 sb0Var = new sb0(1, th0Var3.n);
                                            sb0Var.T = th0Var3.s0;
                                            sb0Var.Y(tL_chatInviteExported2);
                                            th0Var3.presentFragment(sb0Var);
                                            break;
                                        default:
                                            final qh0 qh0Var6 = qh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = qh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(qh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.oh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            qh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            qh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i15 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.nh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final qh0 qh0Var2 = qh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = qh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(qh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.oh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            qh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            qh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            qh0 qh0Var3 = qh0Var;
                                            try {
                                                if (qh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", qh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(qh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            qh0 qh0Var4 = qh0Var;
                                            th0 th0Var2 = qh0Var4.K;
                                            try {
                                                if (qh0Var4.n.link != null) {
                                                    Context context2 = qh0Var4.getContext();
                                                    String str2 = qh0Var4.n.link;
                                                    th0Var2.showDialog(new ph0(qh0Var4, context2, str2, str2, th0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            qh0 qh0Var5 = qh0Var;
                                            th0 th0Var3 = qh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = qh0Var5.n;
                                            sb0 sb0Var = new sb0(1, th0Var3.n);
                                            sb0Var.T = th0Var3.s0;
                                            sb0Var.Y(tL_chatInviteExported2);
                                            th0Var3.presentFragment(sb0Var);
                                            break;
                                        default:
                                            final qh0 qh0Var6 = qh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = qh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(qh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.oh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            qh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            qh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.nh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final qh0 qh0Var2 = qh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = qh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(qh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.oh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            qh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            qh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            qh0 qh0Var3 = qh0Var;
                                            try {
                                                if (qh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", qh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(qh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            qh0 qh0Var4 = qh0Var;
                                            th0 th0Var2 = qh0Var4.K;
                                            try {
                                                if (qh0Var4.n.link != null) {
                                                    Context context2 = qh0Var4.getContext();
                                                    String str2 = qh0Var4.n.link;
                                                    th0Var2.showDialog(new ph0(qh0Var4, context2, str2, str2, th0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            qh0 qh0Var5 = qh0Var;
                                            th0 th0Var3 = qh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = qh0Var5.n;
                                            sb0 sb0Var = new sb0(1, th0Var3.n);
                                            sb0Var.T = th0Var3.s0;
                                            sb0Var.Y(tL_chatInviteExported2);
                                            th0Var3.presentFragment(sb0Var);
                                            break;
                                        default:
                                            final qh0 qh0Var6 = qh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = qh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(qh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.oh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            qh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            qh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.nh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final qh0 qh0Var2 = qh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = qh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(qh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.oh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            qh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            qh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            qh0 qh0Var3 = qh0Var;
                                            try {
                                                if (qh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", qh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(qh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            qh0 qh0Var4 = qh0Var;
                                            th0 th0Var2 = qh0Var4.K;
                                            try {
                                                if (qh0Var4.n.link != null) {
                                                    Context context2 = qh0Var4.getContext();
                                                    String str2 = qh0Var4.n.link;
                                                    th0Var2.showDialog(new ph0(qh0Var4, context2, str2, str2, th0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            qh0 qh0Var5 = qh0Var;
                                            th0 th0Var3 = qh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = qh0Var5.n;
                                            sb0 sb0Var = new sb0(1, th0Var3.n);
                                            sb0Var.T = th0Var3.s0;
                                            sb0Var.Y(tL_chatInviteExported2);
                                            th0Var3.presentFragment(sb0Var);
                                            break;
                                        default:
                                            final qh0 qh0Var6 = qh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = qh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(qh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.oh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            qh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            qh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !qh0Var.n.permanent && th0Var.p0);
                            F.m(th0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.nh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final qh0 qh0Var2 = qh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = qh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(qh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.oh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            qh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            qh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            qh0 qh0Var3 = qh0Var;
                                            try {
                                                if (qh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", qh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(qh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            qh0 qh0Var4 = qh0Var;
                                            th0 th0Var2 = qh0Var4.K;
                                            try {
                                                if (qh0Var4.n.link != null) {
                                                    Context context2 = qh0Var4.getContext();
                                                    String str2 = qh0Var4.n.link;
                                                    th0Var2.showDialog(new ph0(qh0Var4, context2, str2, str2, th0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            qh0 qh0Var5 = qh0Var;
                                            th0 th0Var3 = qh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = qh0Var5.n;
                                            sb0 sb0Var = new sb0(1, th0Var3.n);
                                            sb0Var.T = th0Var3.s0;
                                            sb0Var.Y(tL_chatInviteExported2);
                                            th0Var3.presentFragment(sb0Var);
                                            break;
                                        default:
                                            final qh0 qh0Var6 = qh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = qh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(qh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.oh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            qh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            qh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(th0Var.b.V0(qh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                ej0 ej0Var = (ej0) this.b;
                long j3 = ej0Var.b;
                if (!ej0Var.n.isStory()) {
                    if (ej0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ej0Var.getParentLayout().getFragmentStack().get(ej0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((n2Var instanceof xn) && ((xn) n2Var).e.id == j3) {
                            ej0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle e = w.c.e(j3, "chat_id");
                    e.putInt("message_id", ej0Var.c);
                    e.putBoolean("need_remove_previous_same_chat_activity", false);
                    ej0Var.presentFragment(new xn(e));
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Cells.x8) this.b).setChecked(!r1.e.h);
                break;
            case 12:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.e5.a;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.ForgotPasscode);
                alertDialog$Builder3.a.T = LocaleController.getString(R.string.ForgotPasscodeInfo);
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
                } else if (passcodeActivity.E != 0) {
                    passcodeActivity.g0();
                    break;
                } else {
                    passcodeActivity.h0();
                    break;
                }
                break;
            case 14:
                ll0 ll0Var = (ll0) this.b;
                if (!ll0Var.a.getAnimatedDrawable().k0) {
                    ll0Var.a.getAnimatedDrawable().N(0, false, false);
                    ll0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 16:
                en0 en0Var = (en0) this.b;
                if (!en0Var.J) {
                    int i17 = en0Var.M;
                    if ((i17 != 4 || en0Var.L != 2) && i17 != 0) {
                        en0Var.u();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + en0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + en0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + en0Var.K);
                            en0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.e5.u0(en0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                dq0 dq0Var = (dq0) this.b;
                xn xnVar = dq0Var.F;
                if (xnVar != null && xnVar.c()) {
                    org.telegram.ui.Components.e5.L(dq0Var.getParentActivity(), xnVar.a(), new vp0(dq0Var, i14));
                    break;
                } else {
                    dq0Var.V(dq0Var.b, dq0Var.c, true, 0);
                    dq0Var.finishFragment();
                    break;
                }
            case 18:
                uq0 uq0Var = (uq0) this.b;
                xn xnVar2 = uq0Var.U;
                if (xnVar2 != null && xnVar2.c()) {
                    org.telegram.ui.Components.e5.L(uq0Var.getParentActivity(), xnVar2.a(), new hq0(uq0Var, i14));
                    break;
                } else {
                    uq0Var.e0(0, true);
                    break;
                }
            case 19:
                hu0 hu0Var = (hu0) this.b;
                if (hu0Var != null) {
                    hu0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 20:
                pu0 pu0Var = (pu0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = pu0Var.d;
                int indexOf = photoViewer.g7.indexOf(tag);
                if (indexOf < 0) {
                    int Q = photoViewer.d.Q(tag);
                    if (Q >= 0) {
                        photoViewer.p1.u(Q);
                        if (Q == 0) {
                            photoViewer.p1.m(0);
                        }
                        photoViewer.z3();
                        break;
                    }
                } else {
                    int k10 = photoViewer.d.k(indexOf, photoViewer.n1());
                    boolean x10 = photoViewer.d.x(indexOf);
                    if (indexOf == photoViewer.P4) {
                        photoViewer.N0.b(x10, true);
                    }
                    if (k10 >= 0) {
                        photoViewer.p1.u(k10);
                        if (k10 == 0) {
                            photoViewer.p1.m(0);
                        }
                    }
                    photoViewer.z3();
                    break;
                }
                break;
            case 21:
                tv0 tv0Var = (tv0) this.b;
                boolean[] zArr = tv0Var.w;
                CharSequence[] charSequenceArr = tv0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view.getParent();
                    s4.c1 G = tv0Var.c.G(d6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - tv0Var.n0;
                        if (tv0Var.I && i18 < tv0Var.x) {
                            int i19 = -tv0Var.O;
                            tv0Var.O = i19;
                            AndroidUtilities.shakeViewSpring(d6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            tv0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = tv0Var.y - 1;
                            tv0Var.y = i21;
                            if (tv0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = tv0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                tv0Var.r = iArr;
                            }
                            if (tv0Var.y == charSequenceArr.length - 1) {
                                tv0Var.b.o((tv0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.c1 K = tv0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = d6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    tv0Var.i0();
                                    tv0Var.r0();
                                    my0Var = tv0Var.Q;
                                    if (my0Var != null) {
                                        my0Var.f();
                                        tv0Var.Q.setDelegate(null);
                                    }
                                    tv0Var.b.m(tv0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                tv0Var.k0(true);
                            } else if (tv0Var.B0) {
                                tv0Var.k0(true);
                            }
                            textView.clearFocus();
                            tv0Var.i0();
                            tv0Var.r0();
                            my0Var = tv0Var.Q;
                            if (my0Var != null) {
                            }
                            tv0Var.b.m(tv0Var.p0);
                        }
                    }
                }
                break;
            case 22:
                ((fw0) this.b).c(true);
                break;
            case 23:
                ((fw0) ((bw0) this.b).c).c(true);
                break;
            case 24:
                PrivacyControlActivity privacyControlActivity = ((rx0) this.b).d;
                privacyControlActivity.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) privacyControlActivity, 27, false));
                break;
            case 25:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                int intValue = ((Integer) z1Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.Z;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                z1Var.c(z10, true);
                break;
            case 26:
                z11 z11Var = (z11) this.b;
                ProxyListActivity proxyListActivity = z11Var.s;
                SharedConfig.ProxyInfo proxyInfo = z11Var.d;
                h21 h21Var = new h21(null);
                h21Var.e = new org.telegram.ui.Cells.a7[3];
                h21Var.f = new org.telegram.ui.Cells.f9[2];
                h21Var.s = new org.telegram.ui.Cells.k6[3];
                h21Var.y = 1.0f;
                h21Var.E = new float[2];
                h21Var.F = true;
                h21Var.L = new a21(h21Var);
                h21Var.J = proxyInfo;
                proxyListActivity.presentFragment(h21Var);
                break;
            case 27:
                w21 w21Var = (w21) this.b;
                ValueAnimator valueAnimator = w21Var.N;
                if (valueAnimator == null) {
                    boolean z11 = !w21Var.M;
                    x21 x21Var = w21Var.d;
                    u21 u21Var = w21Var.F;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) x21Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) w21Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    u21Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    u21Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    u21Var.getLocationInWindow(iArr2);
                    float f7 = iArr2[0];
                    float f10 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    w21Var.O = new ci.tb(w21Var, x21Var.getParentActivity(), z11, canvas, (u21Var.getMeasuredWidth() / 2.0f) + f7, (u21Var.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 2);
                    w21Var.P = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    w21Var.N = ofFloat;
                    ofFloat.addUpdateListener(new s11(w21Var, i12));
                    w21Var.N.addListener(new wq0(w21Var, 16));
                    w21Var.N.setDuration(400L);
                    w21Var.N.setInterpolator(org.telegram.ui.Components.lt.e);
                    w21Var.N.start();
                    frameLayout2.addView(w21Var.O, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.sr0(10, w21Var, z11));
                    break;
                }
                break;
            case 28:
                t31 t31Var = (t31) this.b;
                ci.d dVar = t31Var.s;
                if (dVar.W && !dVar.N) {
                    dVar.setLoading(true);
                    u31.H(t31Var.v, ((TextView) t31Var.h.d).getText(), t31Var.d.option, t31Var.n.getText().toString());
                    break;
                }
                break;
            default:
                r31 r31Var = (r31) ((u5) this.b).e;
                if (r31Var != null) {
                    r31Var.run();
                    break;
                }
                break;
        }
    }
}
