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

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final /* synthetic */ class k60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k60(Object obj, int i10) {
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
        org.telegram.ui.Components.yy0 yy0Var;
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
                ((p60) this.b).b.T0(19);
                break;
            case 2:
                e70 e70Var = ((c70) this.b).I;
                e70Var.X = null;
                e70Var.Z.b();
                e70Var.h.b();
                e70Var.k0();
                e70Var.r0();
                break;
            case 3:
                t70.a0(((r70) this.b).d, null);
                break;
            case 4:
                l80.V((l80) this.b);
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
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.bf0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i14) {
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
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.bf0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i14) {
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
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new fu(kf0Var, 20));
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
                com.google.android.gms.internal.clearcut.v0 a2 = w7.f9.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new z10(18, nf0Var, a2));
                break;
            case 9:
                final xh0 xh0Var = (xh0) this.b;
                ai0 ai0Var = xh0Var.K;
                if (xh0Var.n != null) {
                    View view2 = ai0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.v70 F = org.telegram.ui.Components.v70.F((ViewGroup) view2, null, xh0Var);
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
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
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
                                            hg.k0.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            xh0 xh0Var3 = xh0Var;
                                            try {
                                                if (xh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(xh0Var3.K).j();
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
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
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
                                            hg.k0.p(R.string.Cancel, alertDialog$Builder4, null);
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
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
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
                                            hg.k0.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            xh0 xh0Var3 = xh0Var;
                                            try {
                                                if (xh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(xh0Var3.K).j();
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
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
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
                                            hg.k0.p(R.string.Cancel, alertDialog$Builder4, null);
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
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
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
                                            hg.k0.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            xh0 xh0Var3 = xh0Var;
                                            try {
                                                if (xh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(xh0Var3.K).j();
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
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
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
                                            hg.k0.p(R.string.Cancel, alertDialog$Builder4, null);
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
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
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
                                            hg.k0.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            xh0 xh0Var3 = xh0Var;
                                            try {
                                                if (xh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(xh0Var3.K).j();
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
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
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
                                            hg.k0.p(R.string.Cancel, alertDialog$Builder4, null);
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
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
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
                                            hg.k0.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            xh0 xh0Var3 = xh0Var;
                                            try {
                                                if (xh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", xh0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(xh0Var3.K).j();
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
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.vh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i152) {
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
                                            hg.k0.p(R.string.Cancel, alertDialog$Builder4, null);
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
                mj0 mj0Var = (mj0) this.b;
                long j3 = mj0Var.b;
                if (!mj0Var.n.isStory()) {
                    if (mj0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) mj0Var.getParentLayout().getFragmentStack().get(mj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((n2Var instanceof zn) && ((zn) n2Var).e.id == j3) {
                            mj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle e = v7.j0.e(j3, "chat_id");
                    e.putInt("message_id", mj0Var.c);
                    e.putBoolean("need_remove_previous_same_chat_activity", false);
                    mj0Var.presentFragment(new zn(e));
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Cells.x8) this.b).setChecked(!r1.e.h);
                break;
            case 12:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.d5.a;
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
                ln0 ln0Var = (ln0) this.b;
                if (!ln0Var.J) {
                    int i16 = ln0Var.M;
                    if ((i16 != 4 || ln0Var.L != 2) && i16 != 0) {
                        ln0Var.u();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + ln0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + ln0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + ln0Var.K);
                            ln0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.d5.u0(ln0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                lq0 lq0Var = (lq0) this.b;
                zn znVar = lq0Var.F;
                if (znVar != null && znVar.c()) {
                    org.telegram.ui.Components.d5.L(lq0Var.getParentActivity(), znVar.a(), new dq0(lq0Var, i13));
                    break;
                } else {
                    lq0Var.V(lq0Var.b, lq0Var.c, true, 0);
                    lq0Var.finishFragment();
                    break;
                }
            case 18:
                cr0 cr0Var = (cr0) this.b;
                zn znVar2 = cr0Var.U;
                if (znVar2 != null && znVar2.c()) {
                    org.telegram.ui.Components.d5.L(cr0Var.getParentActivity(), znVar2.a(), new pq0(cr0Var, i13));
                    break;
                } else {
                    cr0Var.e0(0, true);
                    break;
                }
            case 19:
                ou0 ou0Var = (ou0) this.b;
                if (ou0Var != null) {
                    ou0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 20:
                wu0 wu0Var = (wu0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = wu0Var.d;
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
                aw0 aw0Var = (aw0) this.b;
                boolean[] zArr = aw0Var.w;
                CharSequence[] charSequenceArr = aw0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view.getParent();
                    s4.c1 H = aw0Var.c.H(e6Var);
                    if (H != null && (b10 = H.b()) != -1) {
                        int i17 = b10 - aw0Var.n0;
                        if (aw0Var.I && i17 < aw0Var.x) {
                            int i18 = -aw0Var.O;
                            aw0Var.O = i18;
                            AndroidUtilities.shakeViewSpring(e6Var, i18);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            aw0Var.b.u(b10);
                            int i19 = i17 + 1;
                            System.arraycopy(charSequenceArr, i19, charSequenceArr, i17, (charSequenceArr.length - 1) - i17);
                            System.arraycopy(zArr, i19, zArr, i17, (zArr.length - 1) - i17);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i20 = aw0Var.y - 1;
                            aw0Var.y = i20;
                            if (aw0Var.r != null) {
                                int[] iArr = new int[i20];
                                while (i13 < i20) {
                                    iArr[i13] = aw0Var.r[i13 >= i17 ? i13 + 1 : i13];
                                    i13++;
                                }
                                aw0Var.r = iArr;
                            }
                            if (aw0Var.y == charSequenceArr.length - 1) {
                                aw0Var.b.o((aw0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.c1 L = aw0Var.c.L(b10 - 1);
                            EditTextBoldCursor textView = e6Var.getTextView();
                            if (L != null) {
                                View view3 = L.a;
                                if (view3 instanceof org.telegram.ui.Cells.e6) {
                                    ((org.telegram.ui.Cells.e6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    aw0Var.i0();
                                    aw0Var.r0();
                                    yy0Var = aw0Var.Q;
                                    if (yy0Var != null) {
                                        yy0Var.f();
                                        aw0Var.Q.setDelegate(null);
                                    }
                                    aw0Var.b.m(aw0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                aw0Var.k0(true);
                            } else if (aw0Var.B0) {
                                aw0Var.k0(true);
                            }
                            textView.clearFocus();
                            aw0Var.i0();
                            aw0Var.r0();
                            yy0Var = aw0Var.Q;
                            if (yy0Var != null) {
                            }
                            aw0Var.b.m(aw0Var.p0);
                        }
                    }
                }
                break;
            case 22:
                ((mw0) this.b).c(true);
                break;
            case 23:
                ((mw0) ((iw0) this.b).c).c(true);
                break;
            case 24:
                PrivacyControlActivity privacyControlActivity = ((zx0) this.b).d;
                privacyControlActivity.showDialog(new rg.x0((org.telegram.ui.ActionBar.n2) privacyControlActivity, 27, false));
                break;
            case 25:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                int intValue = ((Integer) a2Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.Z;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                a2Var.c(z10, true);
                break;
            case 26:
                f21 f21Var = (f21) this.b;
                ProxyListActivity proxyListActivity = f21Var.s;
                SharedConfig.ProxyInfo proxyInfo = f21Var.d;
                o21 o21Var = new o21(null);
                o21Var.e = new org.telegram.ui.Cells.c7[3];
                o21Var.f = new org.telegram.ui.Cells.f9[2];
                o21Var.s = new org.telegram.ui.Cells.l6[3];
                o21Var.y = 1.0f;
                o21Var.E = new float[2];
                o21Var.F = true;
                o21Var.L = new g21(o21Var);
                o21Var.J = proxyInfo;
                proxyListActivity.presentFragment(o21Var);
                break;
            case 27:
                e31 e31Var = (e31) this.b;
                ValueAnimator valueAnimator = e31Var.N;
                if (valueAnimator == null) {
                    boolean z11 = !e31Var.M;
                    f31 f31Var = e31Var.d;
                    c31 c31Var = e31Var.F;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) f31Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) e31Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    c31Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    c31Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    c31Var.getLocationInWindow(iArr2);
                    float f7 = iArr2[0];
                    float f10 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    e31Var.O = new ci.wb(e31Var, f31Var.getParentActivity(), z11, canvas, (c31Var.getMeasuredWidth() / 2.0f) + f7, (c31Var.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 2);
                    e31Var.P = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    e31Var.N = ofFloat;
                    ofFloat.addUpdateListener(new i21(e31Var, i12));
                    e31Var.N.addListener(new gp0(e31Var, 17));
                    e31Var.N.setDuration(400L);
                    e31Var.N.setInterpolator(org.telegram.ui.Components.kt.e);
                    e31Var.N.start();
                    frameLayout2.addView(e31Var.O, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ds0(10, e31Var, z11));
                    break;
                }
                break;
            case 28:
                b41 b41Var = (b41) this.b;
                ci.d dVar = b41Var.s;
                if (dVar.W && !dVar.N) {
                    dVar.setLoading(true);
                    c41.H(b41Var.v, ((TextView) b41Var.h.d).getText(), b41Var.d.option, b41Var.n.getText().toString());
                    break;
                }
                break;
            default:
                z31 z31Var = (z31) ((t5) this.b).e;
                if (z31Var != null) {
                    z31Var.run();
                    break;
                }
                break;
        }
    }
}
