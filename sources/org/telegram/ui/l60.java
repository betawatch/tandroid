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

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class l60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0298  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.zy0 zy0Var;
        int i10 = 19;
        final int i11 = 4;
        final int i12 = 3;
        final int i13 = 2;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.tp tpVar = (org.telegram.ui.Components.tp) this.b;
                tpVar.a(!tpVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", tpVar.a.q).apply();
                break;
            case 1:
                ((q60) this.b).b.T0(19);
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
                s70.a0(((q70) this.b).d, null);
                break;
            case 4:
                k80.V((k80) this.b);
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
                final af0 af0Var = (af0) this.b;
                xg0 xg0Var = af0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.ze0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i15) {
                        switch (i14) {
                            case 0:
                                af0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                af0 af0Var2 = af0Var;
                                xg0.n0(af0Var2.y, af0Var2.r, af0Var2.s, af0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.ze0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i15) {
                        switch (c10) {
                            case 0:
                                af0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                af0 af0Var2 = af0Var;
                                xg0.n0(af0Var2.y, af0Var2.r, af0Var2.s, af0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = xg0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                if0 if0Var = (if0) this.b;
                xg0 xg0Var2 = if0Var.E;
                if (xg0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(xg0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new iu(if0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    xg0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 8:
                lf0 lf0Var = (lf0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new kf0(lf0Var), NotificationCenter.onActivityResultReceived);
                Context context = lf0Var.getContext();
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
                a2.g().addOnCompleteListener(new l80(13, lf0Var, a2));
                break;
            case 9:
                final wh0 wh0Var = (wh0) this.b;
                zh0 zh0Var = wh0Var.K;
                if (wh0Var.n != null) {
                    View view2 = zh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.w70 F = org.telegram.ui.Components.w70.F((ViewGroup) view2, null, wh0Var);
                        if (wh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.th0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final wh0 wh0Var2 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = wh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(wh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            wh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            wh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hc.b.s(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            wh0 wh0Var3 = wh0Var;
                                            try {
                                                if (wh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wh0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(wh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            wh0 wh0Var4 = wh0Var;
                                            zh0 zh0Var2 = wh0Var4.K;
                                            try {
                                                if (wh0Var4.n.link != null) {
                                                    Context context2 = wh0Var4.getContext();
                                                    String str2 = wh0Var4.n.link;
                                                    zh0Var2.showDialog(new vh0(wh0Var4, context2, str2, str2, zh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            wh0 wh0Var5 = wh0Var;
                                            zh0 zh0Var3 = wh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = wh0Var5.n;
                                            xb0 xb0Var = new xb0(1, zh0Var3.n);
                                            xb0Var.T = zh0Var3.s0;
                                            xb0Var.Y(tL_chatInviteExported2);
                                            zh0Var3.presentFragment(xb0Var);
                                            break;
                                        default:
                                            final wh0 wh0Var6 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = wh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            wh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            wh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hc.b.s(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i15 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.th0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final wh0 wh0Var2 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = wh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(wh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            wh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            wh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hc.b.s(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            wh0 wh0Var3 = wh0Var;
                                            try {
                                                if (wh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wh0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(wh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            wh0 wh0Var4 = wh0Var;
                                            zh0 zh0Var2 = wh0Var4.K;
                                            try {
                                                if (wh0Var4.n.link != null) {
                                                    Context context2 = wh0Var4.getContext();
                                                    String str2 = wh0Var4.n.link;
                                                    zh0Var2.showDialog(new vh0(wh0Var4, context2, str2, str2, zh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            wh0 wh0Var5 = wh0Var;
                                            zh0 zh0Var3 = wh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = wh0Var5.n;
                                            xb0 xb0Var = new xb0(1, zh0Var3.n);
                                            xb0Var.T = zh0Var3.s0;
                                            xb0Var.Y(tL_chatInviteExported2);
                                            zh0Var3.presentFragment(xb0Var);
                                            break;
                                        default:
                                            final wh0 wh0Var6 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = wh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            wh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            wh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hc.b.s(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.th0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final wh0 wh0Var2 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = wh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(wh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            wh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            wh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hc.b.s(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            wh0 wh0Var3 = wh0Var;
                                            try {
                                                if (wh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wh0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(wh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            wh0 wh0Var4 = wh0Var;
                                            zh0 zh0Var2 = wh0Var4.K;
                                            try {
                                                if (wh0Var4.n.link != null) {
                                                    Context context2 = wh0Var4.getContext();
                                                    String str2 = wh0Var4.n.link;
                                                    zh0Var2.showDialog(new vh0(wh0Var4, context2, str2, str2, zh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            wh0 wh0Var5 = wh0Var;
                                            zh0 zh0Var3 = wh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = wh0Var5.n;
                                            xb0 xb0Var = new xb0(1, zh0Var3.n);
                                            xb0Var.T = zh0Var3.s0;
                                            xb0Var.Y(tL_chatInviteExported2);
                                            zh0Var3.presentFragment(xb0Var);
                                            break;
                                        default:
                                            final wh0 wh0Var6 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = wh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            wh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            wh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hc.b.s(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.th0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final wh0 wh0Var2 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = wh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(wh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            wh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            wh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hc.b.s(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            wh0 wh0Var3 = wh0Var;
                                            try {
                                                if (wh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wh0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(wh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            wh0 wh0Var4 = wh0Var;
                                            zh0 zh0Var2 = wh0Var4.K;
                                            try {
                                                if (wh0Var4.n.link != null) {
                                                    Context context2 = wh0Var4.getContext();
                                                    String str2 = wh0Var4.n.link;
                                                    zh0Var2.showDialog(new vh0(wh0Var4, context2, str2, str2, zh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            wh0 wh0Var5 = wh0Var;
                                            zh0 zh0Var3 = wh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = wh0Var5.n;
                                            xb0 xb0Var = new xb0(1, zh0Var3.n);
                                            xb0Var.T = zh0Var3.s0;
                                            xb0Var.Y(tL_chatInviteExported2);
                                            zh0Var3.presentFragment(xb0Var);
                                            break;
                                        default:
                                            final wh0 wh0Var6 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = wh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            wh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            wh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hc.b.s(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !wh0Var.n.permanent && zh0Var.p0);
                            F.m(zh0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.th0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final wh0 wh0Var2 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = wh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(wh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            wh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            wh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hc.b.s(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            wh0 wh0Var3 = wh0Var;
                                            try {
                                                if (wh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wh0Var3.n.link));
                                                    org.telegram.ui.Components.wc.j(wh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            wh0 wh0Var4 = wh0Var;
                                            zh0 zh0Var2 = wh0Var4.K;
                                            try {
                                                if (wh0Var4.n.link != null) {
                                                    Context context2 = wh0Var4.getContext();
                                                    String str2 = wh0Var4.n.link;
                                                    zh0Var2.showDialog(new vh0(wh0Var4, context2, str2, str2, zh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            wh0 wh0Var5 = wh0Var;
                                            zh0 zh0Var3 = wh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = wh0Var5.n;
                                            xb0 xb0Var = new xb0(1, zh0Var3.n);
                                            xb0Var.T = zh0Var3.s0;
                                            xb0Var.Y(tL_chatInviteExported2);
                                            zh0Var3.presentFragment(xb0Var);
                                            break;
                                        default:
                                            final wh0 wh0Var6 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = wh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            wh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            wh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hc.b.s(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(zh0Var.b.U0(wh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                kj0 kj0Var = (kj0) this.b;
                long j3 = kj0Var.b;
                if (!kj0Var.n.isStory()) {
                    if (kj0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) kj0Var.getParentLayout().getFragmentStack().get(kj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((p2Var instanceof eo) && ((eo) p2Var).e.id == j3) {
                            kj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle e = w.f.e(j3, "chat_id");
                    e.putInt("message_id", kj0Var.c);
                    e.putBoolean("need_remove_previous_same_chat_activity", false);
                    kj0Var.presentFragment(new eo(e));
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
                sl0 sl0Var = (sl0) this.b;
                if (!sl0Var.a.getAnimatedDrawable().l0) {
                    sl0Var.a.getAnimatedDrawable().N(0, false, false);
                    sl0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 16:
                kn0 kn0Var = (kn0) this.b;
                if (!kn0Var.J) {
                    int i17 = kn0Var.M;
                    if ((i17 != 4 || kn0Var.L != 2) && i17 != 0) {
                        kn0Var.u();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + kn0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + kn0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + kn0Var.K);
                            kn0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.d5.u0(kn0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                kq0 kq0Var = (kq0) this.b;
                eo eoVar = kq0Var.F;
                if (eoVar != null && eoVar.c()) {
                    org.telegram.ui.Components.d5.L(kq0Var.getParentActivity(), eoVar.a(), new cq0(kq0Var, i14));
                    break;
                } else {
                    kq0Var.V(kq0Var.b, kq0Var.c, true, 0);
                    kq0Var.finishFragment();
                    break;
                }
            case 18:
                br0 br0Var = (br0) this.b;
                eo eoVar2 = br0Var.U;
                if (eoVar2 != null && eoVar2.c()) {
                    org.telegram.ui.Components.d5.L(br0Var.getParentActivity(), eoVar2.a(), new oq0(br0Var, i14));
                    break;
                } else {
                    br0Var.e0(0, true);
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
                xu0 xu0Var = (xu0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = xu0Var.d;
                int indexOf = photoViewer.g7.indexOf(tag);
                if (indexOf < 0) {
                    int Q = photoViewer.d.Q(tag);
                    if (Q >= 0) {
                        photoViewer.p1.u(Q);
                        if (Q == 0) {
                            photoViewer.p1.m(0);
                        }
                        photoViewer.A3();
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
                    photoViewer.A3();
                    break;
                }
                break;
            case 21:
                bw0 bw0Var = (bw0) this.b;
                boolean[] zArr = bw0Var.w;
                CharSequence[] charSequenceArr = bw0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.e6 e6Var = (org.telegram.ui.Cells.e6) view.getParent();
                    s4.c1 G = bw0Var.c.G(e6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - bw0Var.n0;
                        if (bw0Var.I && i18 < bw0Var.x) {
                            int i19 = -bw0Var.O;
                            bw0Var.O = i19;
                            AndroidUtilities.shakeViewSpring(e6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            bw0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = bw0Var.y - 1;
                            bw0Var.y = i21;
                            if (bw0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = bw0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                bw0Var.r = iArr;
                            }
                            if (bw0Var.y == charSequenceArr.length - 1) {
                                bw0Var.b.o((bw0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.c1 K = bw0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = e6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.e6) {
                                    ((org.telegram.ui.Cells.e6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    bw0Var.i0();
                                    bw0Var.r0();
                                    zy0Var = bw0Var.Q;
                                    if (zy0Var != null) {
                                        zy0Var.f();
                                        bw0Var.Q.setDelegate(null);
                                    }
                                    bw0Var.b.m(bw0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                bw0Var.k0(true);
                            } else if (bw0Var.B0) {
                                bw0Var.k0(true);
                            }
                            textView.clearFocus();
                            bw0Var.i0();
                            bw0Var.r0();
                            zy0Var = bw0Var.Q;
                            if (zy0Var != null) {
                            }
                            bw0Var.b.m(bw0Var.p0);
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
                privacyControlActivity.showDialog(new qg.a1((org.telegram.ui.ActionBar.p2) privacyControlActivity, 27, false));
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
                m21 m21Var = (m21) this.b;
                ProxyListActivity proxyListActivity = m21Var.s;
                SharedConfig.ProxyInfo proxyInfo = m21Var.d;
                u21 u21Var = new u21(null);
                u21Var.e = new org.telegram.ui.Cells.c7[3];
                u21Var.f = new org.telegram.ui.Cells.f9[2];
                u21Var.s = new org.telegram.ui.Cells.l6[3];
                u21Var.y = 1.0f;
                u21Var.E = new float[2];
                u21Var.F = true;
                u21Var.L = new n21(u21Var);
                u21Var.J = proxyInfo;
                proxyListActivity.presentFragment(u21Var);
                break;
            case 27:
                j31 j31Var = (j31) this.b;
                ValueAnimator valueAnimator = j31Var.N;
                if (valueAnimator == null) {
                    boolean z11 = !j31Var.M;
                    k31 k31Var = j31Var.d;
                    h31 h31Var = j31Var.F;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) k31Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) j31Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    h31Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    h31Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    h31Var.getLocationInWindow(iArr2);
                    float f7 = iArr2[0];
                    float f10 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    j31Var.O = new bi.gd(j31Var, k31Var.getParentActivity(), z11, canvas, (h31Var.getMeasuredWidth() / 2.0f) + f7, (h31Var.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 2);
                    j31Var.P = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    j31Var.N = ofFloat;
                    ofFloat.addUpdateListener(new f21(j31Var, i12));
                    j31Var.N.addListener(new mv0(j31Var, 6));
                    j31Var.N.setDuration(400L);
                    j31Var.N.setInterpolator(org.telegram.ui.Components.pt.e);
                    j31Var.N.start();
                    frameLayout2.addView(j31Var.O, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.bs0(10, j31Var, z11));
                    break;
                }
                break;
            case 28:
                g41 g41Var = (g41) this.b;
                bi.d dVar = g41Var.s;
                if (dVar.W && !dVar.N) {
                    dVar.setLoading(true);
                    h41.H(g41Var.v, ((TextView) g41Var.h.d).getText(), g41Var.d.option, g41Var.n.getText().toString());
                    break;
                }
                break;
            default:
                e41 e41Var = (e41) ((u5) this.b).e;
                if (e41Var != null) {
                    e41Var.run();
                    break;
                }
                break;
        }
    }
}
