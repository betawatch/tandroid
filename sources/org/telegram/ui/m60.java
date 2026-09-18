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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0297  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.oy0 oy0Var;
        final int i10 = 4;
        final int i11 = 3;
        final int i12 = 2;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.np npVar = (org.telegram.ui.Components.np) this.b;
                npVar.a(!npVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", npVar.a.q).apply();
                break;
            case 1:
                ((r60) this.b).b.T0(19);
                break;
            case 2:
                g70 g70Var = ((e70) this.b).I;
                g70Var.X = null;
                g70Var.Z.b();
                g70Var.h.b();
                g70Var.k0();
                g70Var.r0();
                break;
            case 3:
                v70.a0(((t70) this.b).d, null);
                break;
            case 4:
                n80.V((n80) this.b);
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.E0;
                launchActivity.H0 = null;
                launchActivity.p0(new LanguageSelectActivity());
                while (i13 < arrayList.size()) {
                    if (((Dialog) arrayList.get(i13)).isShowing()) {
                        ((Dialog) arrayList.get(i13)).dismiss();
                    }
                    i13++;
                }
                arrayList.clear();
                break;
            case 6:
                final cf0 cf0Var = (cf0) this.b;
                yg0 yg0Var = cf0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(yg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.bf0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i14) {
                        switch (i13) {
                            case 0:
                                cf0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                cf0 cf0Var2 = cf0Var;
                                yg0.n0(cf0Var2.y, cf0Var2.r, cf0Var2.s, cf0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.bf0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i14) {
                        switch (c10) {
                            case 0:
                                cf0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                cf0 cf0Var2 = cf0Var;
                                yg0.n0(cf0Var2.y, cf0Var2.r, cf0Var2.s, cf0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = yg0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                kf0 kf0Var = (kf0) this.b;
                yg0 yg0Var2 = kf0Var.E;
                if (yg0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(yg0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new gu(kf0Var, 20));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    yg0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 8:
                nf0 nf0Var = (nf0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new mf0(nf0Var), NotificationCenter.onActivityResultReceived);
                Context context = nf0Var.getContext();
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
                a2.g().addOnCompleteListener(new f20(17, nf0Var, a2));
                break;
            case 9:
                final xh0 xh0Var = (xh0) this.b;
                ai0 ai0Var = xh0Var.K;
                if (xh0Var.n != null) {
                    View view2 = ai0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F((ViewGroup) view2, null, xh0Var);
                        if (xh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.uh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final xh0 xh0Var2 = xh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i14 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i15) {
                                                    switch (i14) {
                                                        case 0:
                                                            xh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            xh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.k0.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            xh0 xh0Var3 = xh0Var;
                                            try {
                                                if (xh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xh0Var3.n.link));
                                                    org.telegram.ui.Components.vc.j(xh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            xh0 xh0Var4 = xh0Var;
                                            ai0 ai0Var2 = xh0Var4.K;
                                            try {
                                                if (xh0Var4.n.link != null) {
                                                    Context context2 = xh0Var4.getContext();
                                                    String str2 = xh0Var4.n.link;
                                                    ai0Var2.showDialog(new wh0(xh0Var4, context2, str2, str2, ai0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            xh0 xh0Var5 = xh0Var;
                                            ai0 ai0Var3 = xh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xh0Var5.n;
                                            zb0 zb0Var = new zb0(1, ai0Var3.n);
                                            zb0Var.T = ai0Var3.s0;
                                            zb0Var.Y(tL_chatInviteExported2);
                                            ai0Var3.presentFragment(zb0Var);
                                            break;
                                        default:
                                            final xh0 xh0Var6 = xh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            xh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            xh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.k0.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i14 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            F.c(i14, string2, new Runnable() { // from class: org.telegram.ui.uh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final xh0 xh0Var2 = xh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            xh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            xh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.k0.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            xh0 xh0Var3 = xh0Var;
                                            try {
                                                if (xh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xh0Var3.n.link));
                                                    org.telegram.ui.Components.vc.j(xh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            xh0 xh0Var4 = xh0Var;
                                            ai0 ai0Var2 = xh0Var4.K;
                                            try {
                                                if (xh0Var4.n.link != null) {
                                                    Context context2 = xh0Var4.getContext();
                                                    String str2 = xh0Var4.n.link;
                                                    ai0Var2.showDialog(new wh0(xh0Var4, context2, str2, str2, ai0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            xh0 xh0Var5 = xh0Var;
                                            ai0 ai0Var3 = xh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xh0Var5.n;
                                            zb0 zb0Var = new zb0(1, ai0Var3.n);
                                            zb0Var.T = ai0Var3.s0;
                                            zb0Var.Y(tL_chatInviteExported2);
                                            ai0Var3.presentFragment(zb0Var);
                                            break;
                                        default:
                                            final xh0 xh0Var6 = xh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            xh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            xh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.k0.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.uh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final xh0 xh0Var2 = xh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            xh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            xh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.k0.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            xh0 xh0Var3 = xh0Var;
                                            try {
                                                if (xh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xh0Var3.n.link));
                                                    org.telegram.ui.Components.vc.j(xh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            xh0 xh0Var4 = xh0Var;
                                            ai0 ai0Var2 = xh0Var4.K;
                                            try {
                                                if (xh0Var4.n.link != null) {
                                                    Context context2 = xh0Var4.getContext();
                                                    String str2 = xh0Var4.n.link;
                                                    ai0Var2.showDialog(new wh0(xh0Var4, context2, str2, str2, ai0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            xh0 xh0Var5 = xh0Var;
                                            ai0 ai0Var3 = xh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xh0Var5.n;
                                            zb0 zb0Var = new zb0(1, ai0Var3.n);
                                            zb0Var.T = ai0Var3.s0;
                                            zb0Var.Y(tL_chatInviteExported2);
                                            ai0Var3.presentFragment(zb0Var);
                                            break;
                                        default:
                                            final xh0 xh0Var6 = xh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            xh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            xh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.k0.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.uh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final xh0 xh0Var2 = xh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            xh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            xh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.k0.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            xh0 xh0Var3 = xh0Var;
                                            try {
                                                if (xh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xh0Var3.n.link));
                                                    org.telegram.ui.Components.vc.j(xh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            xh0 xh0Var4 = xh0Var;
                                            ai0 ai0Var2 = xh0Var4.K;
                                            try {
                                                if (xh0Var4.n.link != null) {
                                                    Context context2 = xh0Var4.getContext();
                                                    String str2 = xh0Var4.n.link;
                                                    ai0Var2.showDialog(new wh0(xh0Var4, context2, str2, str2, ai0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            xh0 xh0Var5 = xh0Var;
                                            ai0 ai0Var3 = xh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xh0Var5.n;
                                            zb0 zb0Var = new zb0(1, ai0Var3.n);
                                            zb0Var.T = ai0Var3.s0;
                                            zb0Var.Y(tL_chatInviteExported2);
                                            ai0Var3.presentFragment(zb0Var);
                                            break;
                                        default:
                                            final xh0 xh0Var6 = xh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            xh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            xh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.k0.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !xh0Var.n.permanent && ai0Var.p0);
                            F.m(ai0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.uh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            final xh0 xh0Var2 = xh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = xh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(xh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i142 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                                    switch (i142) {
                                                        case 0:
                                                            xh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            xh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.k0.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            xh0 xh0Var3 = xh0Var;
                                            try {
                                                if (xh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xh0Var3.n.link));
                                                    org.telegram.ui.Components.vc.j(xh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            xh0 xh0Var4 = xh0Var;
                                            ai0 ai0Var2 = xh0Var4.K;
                                            try {
                                                if (xh0Var4.n.link != null) {
                                                    Context context2 = xh0Var4.getContext();
                                                    String str2 = xh0Var4.n.link;
                                                    ai0Var2.showDialog(new wh0(xh0Var4, context2, str2, str2, ai0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            xh0 xh0Var5 = xh0Var;
                                            ai0 ai0Var3 = xh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = xh0Var5.n;
                                            zb0 zb0Var = new zb0(1, ai0Var3.n);
                                            zb0Var.T = ai0Var3.s0;
                                            zb0Var.Y(tL_chatInviteExported2);
                                            ai0Var3.presentFragment(zb0Var);
                                            break;
                                        default:
                                            final xh0 xh0Var6 = xh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = xh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(xh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i15 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i152) {
                                                    switch (i15) {
                                                        case 0:
                                                            xh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            xh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.k0.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(ai0Var.b.W0(xh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                lj0 lj0Var = (lj0) this.b;
                long j3 = lj0Var.b;
                if (!lj0Var.n.isStory()) {
                    if (lj0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) lj0Var.getParentLayout().getFragmentStack().get(lj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((o2Var instanceof bo) && ((bo) o2Var).e.id == j3) {
                            lj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle e = w.f.e(j3, "chat_id");
                    e.putInt("message_id", lj0Var.c);
                    e.putBoolean("need_remove_previous_same_chat_activity", false);
                    lj0Var.presentFragment(new bo(e));
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Cells.w8) this.b).setChecked(!r1.e.h);
                break;
            case 12:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.c5.a;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.ForgotPasscode);
                alertDialog$Builder3.a.T = LocaleController.getString(R.string.ForgotPasscodeInfo);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder3.a.show();
                break;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i15 = passcodeActivity.x;
                if (i15 != 1) {
                    if (i15 == 2) {
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
                ul0 ul0Var = (ul0) this.b;
                if (!ul0Var.a.getAnimatedDrawable().k0) {
                    ul0Var.a.getAnimatedDrawable().N(0, false, false);
                    ul0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 16:
                mn0 mn0Var = (mn0) this.b;
                if (!mn0Var.J) {
                    int i16 = mn0Var.M;
                    if ((i16 != 4 || mn0Var.L != 2) && i16 != 0) {
                        mn0Var.u();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + mn0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + mn0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + mn0Var.K);
                            mn0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.c5.u0(mn0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                lq0 lq0Var = (lq0) this.b;
                bo boVar = lq0Var.F;
                if (boVar != null && boVar.c()) {
                    org.telegram.ui.Components.c5.L(lq0Var.getParentActivity(), boVar.a(), new dq0(lq0Var, i13));
                    break;
                } else {
                    lq0Var.V(lq0Var.b, lq0Var.c, true, 0);
                    lq0Var.finishFragment();
                    break;
                }
            case 18:
                cr0 cr0Var = (cr0) this.b;
                bo boVar2 = cr0Var.U;
                if (boVar2 != null && boVar2.c()) {
                    org.telegram.ui.Components.c5.L(cr0Var.getParentActivity(), boVar2.a(), new pq0(cr0Var, i13));
                    break;
                } else {
                    cr0Var.e0(0, true);
                    break;
                }
            case 19:
                qu0 qu0Var = (qu0) this.b;
                if (qu0Var != null) {
                    qu0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 20:
                yu0 yu0Var = (yu0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = yu0Var.d;
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
                cw0 cw0Var = (cw0) this.b;
                boolean[] zArr = cw0Var.w;
                CharSequence[] charSequenceArr = cw0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view.getParent();
                    s4.c1 H = cw0Var.c.H(c6Var);
                    if (H != null && (b10 = H.b()) != -1) {
                        int i17 = b10 - cw0Var.n0;
                        if (cw0Var.I && i17 < cw0Var.x) {
                            int i18 = -cw0Var.O;
                            cw0Var.O = i18;
                            AndroidUtilities.shakeViewSpring(c6Var, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            cw0Var.b.u(b10);
                            int i19 = i17 + 1;
                            System.arraycopy(charSequenceArr, i19, charSequenceArr, i17, (charSequenceArr.length - 1) - i17);
                            System.arraycopy(zArr, i19, zArr, i17, (zArr.length - 1) - i17);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i20 = cw0Var.y - 1;
                            cw0Var.y = i20;
                            if (cw0Var.r != null) {
                                int[] iArr = new int[i20];
                                while (i13 < i20) {
                                    iArr[i13] = cw0Var.r[i13 >= i17 ? i13 + 1 : i13];
                                    i13++;
                                }
                                cw0Var.r = iArr;
                            }
                            if (cw0Var.y == charSequenceArr.length - 1) {
                                cw0Var.b.o((cw0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.c1 L = cw0Var.c.L(b10 - 1);
                            EditTextBoldCursor textView = c6Var.getTextView();
                            if (L != null) {
                                View view3 = L.a;
                                if (view3 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    cw0Var.i0();
                                    cw0Var.r0();
                                    oy0Var = cw0Var.Q;
                                    if (oy0Var != null) {
                                        oy0Var.f();
                                        cw0Var.Q.setDelegate(null);
                                    }
                                    cw0Var.b.m(cw0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                cw0Var.k0(true);
                            } else if (cw0Var.B0) {
                                cw0Var.k0(true);
                            }
                            textView.clearFocus();
                            cw0Var.i0();
                            cw0Var.r0();
                            oy0Var = cw0Var.Q;
                            if (oy0Var != null) {
                            }
                            cw0Var.b.m(cw0Var.p0);
                        }
                    }
                }
                break;
            case 22:
                ((ow0) this.b).c(true);
                break;
            case 23:
                ((ow0) ((kw0) this.b).c).c(true);
                break;
            case 24:
                PrivacyControlActivity privacyControlActivity = ((ay0) this.b).d;
                privacyControlActivity.showDialog(new rg.x0((org.telegram.ui.ActionBar.o2) privacyControlActivity, 27, false));
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
                h21 h21Var = (h21) this.b;
                ProxyListActivity proxyListActivity = h21Var.s;
                SharedConfig.ProxyInfo proxyInfo = h21Var.d;
                q21 q21Var = new q21(null);
                q21Var.e = new org.telegram.ui.Cells.a7[3];
                q21Var.f = new org.telegram.ui.Cells.e9[2];
                q21Var.s = new org.telegram.ui.Cells.j6[3];
                q21Var.y = 1.0f;
                q21Var.E = new float[2];
                q21Var.F = true;
                q21Var.L = new i21(q21Var);
                q21Var.J = proxyInfo;
                proxyListActivity.presentFragment(q21Var);
                break;
            case 27:
                f31 f31Var = (f31) this.b;
                ValueAnimator valueAnimator = f31Var.N;
                if (valueAnimator == null) {
                    boolean z11 = !f31Var.M;
                    g31 g31Var = f31Var.d;
                    d31 d31Var = f31Var.F;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) g31Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) f31Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    d31Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    d31Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    d31Var.getLocationInWindow(iArr2);
                    float f7 = iArr2[0];
                    float f10 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    f31Var.O = new ci.wb(f31Var, g31Var.getParentActivity(), z11, canvas, (d31Var.getMeasuredWidth() / 2.0f) + f7, (d31Var.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 2);
                    f31Var.P = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    f31Var.N = ofFloat;
                    ofFloat.addUpdateListener(new k21(f31Var, i12));
                    f31Var.N.addListener(new er0(f31Var, 16));
                    f31Var.N.setDuration(400L);
                    f31Var.N.setInterpolator(org.telegram.ui.Components.kt.e);
                    f31Var.N.start();
                    frameLayout2.addView(f31Var.O, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.tr0(10, f31Var, z11));
                    break;
                }
                break;
            case 28:
                c41 c41Var = (c41) this.b;
                ci.d dVar = c41Var.s;
                if (dVar.W && !dVar.N) {
                    dVar.setLoading(true);
                    d41.H(c41Var.v, ((TextView) c41Var.h.d).getText(), c41Var.d.option, c41Var.n.getText().toString());
                    break;
                }
                break;
            default:
                a41 a41Var = (a41) ((t5) this.b).e;
                if (a41Var != null) {
                    a41Var.run();
                    break;
                }
                break;
        }
    }
}
