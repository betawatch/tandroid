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
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class m60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a1  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.oz0 oz0Var;
        final int i10 = 4;
        int i11 = 19;
        final int i12 = 3;
        final int i13 = 2;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                ((n60) this.b).b.T0(19);
                break;
            case 1:
                c70 c70Var = ((a70) this.b).I;
                c70Var.X = null;
                c70Var.Z.b();
                c70Var.h.b();
                c70Var.k0();
                c70Var.r0();
                break;
            case 2:
                s70.a0(((q70) this.b).d, null);
                break;
            case 3:
                l80.V((l80) this.b);
                break;
            case 4:
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
            case 5:
                final ze0 ze0Var = (ze0) this.b;
                wg0 wg0Var = ze0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.ye0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        switch (i14) {
                            case 0:
                                ze0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ze0 ze0Var2 = ze0Var;
                                wg0.n0(ze0Var2.y, ze0Var2.r, ze0Var2.s, ze0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.ye0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        switch (c10) {
                            case 0:
                                ze0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ze0 ze0Var2 = ze0Var;
                                wg0.n0(ze0Var2.y, ze0Var2.r, ze0Var2.s, ze0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = wg0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 6:
                hf0 hf0Var = (hf0) this.b;
                wg0 wg0Var2 = hf0Var.E;
                if (wg0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new gu(hf0Var, i11));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    wg0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 7:
                kf0 kf0Var = (kf0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new jf0(kf0Var), NotificationCenter.onActivityResultReceived);
                Context context = kf0Var.getContext();
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
                com.google.android.gms.internal.clearcut.u0 a2 = w7.d9.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new rw(i11, kf0Var, a2));
                break;
            case 8:
                final wh0 wh0Var = (wh0) this.b;
                zh0 zh0Var = wh0Var.K;
                if (wh0Var.n != null) {
                    View view2 = zh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.p80 F = org.telegram.ui.Components.p80.F((ViewGroup) view2, null, wh0Var);
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
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
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
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            wh0 wh0Var3 = wh0Var;
                                            try {
                                                if (wh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wh0Var3.n.link));
                                                    org.telegram.ui.Components.ad.j(wh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
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
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            wh0 wh0Var5 = wh0Var;
                                            zh0 zh0Var3 = wh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = wh0Var5.n;
                                            vb0 vb0Var = new vb0(1, zh0Var3.n);
                                            vb0Var.T = zh0Var3.s0;
                                            vb0Var.Y(tL_chatInviteExported2);
                                            zh0Var3.presentFragment(vb0Var);
                                            break;
                                        default:
                                            final wh0 wh0Var6 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = wh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
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
                                            hg.c.p(R.string.Cancel, alertDialog$Builder4, null);
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
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
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
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            wh0 wh0Var3 = wh0Var;
                                            try {
                                                if (wh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wh0Var3.n.link));
                                                    org.telegram.ui.Components.ad.j(wh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
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
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            wh0 wh0Var5 = wh0Var;
                                            zh0 zh0Var3 = wh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = wh0Var5.n;
                                            vb0 vb0Var = new vb0(1, zh0Var3.n);
                                            vb0Var.T = zh0Var3.s0;
                                            vb0Var.Y(tL_chatInviteExported2);
                                            zh0Var3.presentFragment(vb0Var);
                                            break;
                                        default:
                                            final wh0 wh0Var6 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = wh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
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
                                            hg.c.p(R.string.Cancel, alertDialog$Builder4, null);
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
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
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
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            wh0 wh0Var3 = wh0Var;
                                            try {
                                                if (wh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wh0Var3.n.link));
                                                    org.telegram.ui.Components.ad.j(wh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
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
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            wh0 wh0Var5 = wh0Var;
                                            zh0 zh0Var3 = wh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = wh0Var5.n;
                                            vb0 vb0Var = new vb0(1, zh0Var3.n);
                                            vb0Var.T = zh0Var3.s0;
                                            vb0Var.Y(tL_chatInviteExported2);
                                            zh0Var3.presentFragment(vb0Var);
                                            break;
                                        default:
                                            final wh0 wh0Var6 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = wh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
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
                                            hg.c.p(R.string.Cancel, alertDialog$Builder4, null);
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
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
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
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            wh0 wh0Var3 = wh0Var;
                                            try {
                                                if (wh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wh0Var3.n.link));
                                                    org.telegram.ui.Components.ad.j(wh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
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
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            wh0 wh0Var5 = wh0Var;
                                            zh0 zh0Var3 = wh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = wh0Var5.n;
                                            vb0 vb0Var = new vb0(1, zh0Var3.n);
                                            vb0Var.T = zh0Var3.s0;
                                            vb0Var.Y(tL_chatInviteExported2);
                                            zh0Var3.presentFragment(vb0Var);
                                            break;
                                        default:
                                            final wh0 wh0Var6 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = wh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
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
                                            hg.c.p(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !wh0Var.n.permanent && zh0Var.p0);
                            F.m(zh0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.th0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            final wh0 wh0Var2 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = wh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(wh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
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
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            wh0 wh0Var3 = wh0Var;
                                            try {
                                                if (wh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", wh0Var3.n.link));
                                                    org.telegram.ui.Components.ad.j(wh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
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
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            wh0 wh0Var5 = wh0Var;
                                            zh0 zh0Var3 = wh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = wh0Var5.n;
                                            vb0 vb0Var = new vb0(1, zh0Var3.n);
                                            vb0Var.T = zh0Var3.s0;
                                            vb0Var.Y(tL_chatInviteExported2);
                                            zh0Var3.presentFragment(vb0Var);
                                            break;
                                        default:
                                            final wh0 wh0Var6 = wh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = wh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(wh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.uh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
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
                                            hg.c.p(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(zh0Var.b.V0(wh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 9:
                lj0 lj0Var = (lj0) this.b;
                long j3 = lj0Var.b;
                if (!lj0Var.n.isStory()) {
                    if (lj0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) lj0Var.getParentLayout().getFragmentStack().get(lj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((n2Var instanceof zn) && ((zn) n2Var).e.id == j3) {
                            lj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle f7 = sc.v.f(j3, "chat_id");
                    f7.putInt("message_id", lj0Var.c);
                    f7.putBoolean("need_remove_previous_same_chat_activity", false);
                    lj0Var.presentFragment(new zn(f7));
                    break;
                }
                break;
            case 10:
                ((org.telegram.ui.Cells.w8) this.b).setChecked(!r1.e.h);
                break;
            case 11:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.g5.a;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.R = LocaleController.getString(R.string.ForgotPasscode);
                alertDialog$Builder3.a.T = LocaleController.getString(R.string.ForgotPasscodeInfo);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder3.a.show();
                break;
            case 12:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i16 = passcodeActivity.x;
                if (i16 != 1) {
                    if (i16 == 2) {
                        passcodeActivity.j0();
                        break;
                    }
                } else if (passcodeActivity.E != 0) {
                    passcodeActivity.j0();
                    break;
                } else {
                    passcodeActivity.k0();
                    break;
                }
                break;
            case 13:
                tl0 tl0Var = (tl0) this.b;
                if (!tl0Var.a.getAnimatedDrawable().k0) {
                    tl0Var.a.getAnimatedDrawable().N(0, false, false);
                    tl0Var.a.d();
                    break;
                }
                break;
            case 14:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 15:
                jn0 jn0Var = (jn0) this.b;
                if (!jn0Var.J) {
                    int i17 = jn0Var.M;
                    if ((i17 != 4 || jn0Var.L != 2) && i17 != 0) {
                        jn0Var.t();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + jn0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + jn0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + jn0Var.K);
                            jn0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.g5.t0(jn0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 16:
                kq0 kq0Var = (kq0) this.b;
                zn znVar = kq0Var.F;
                if (znVar != null && znVar.c()) {
                    org.telegram.ui.Components.g5.K(kq0Var.getParentActivity(), znVar.a(), new bq0(kq0Var, i14));
                    break;
                } else {
                    kq0Var.V(kq0Var.b, kq0Var.c, true, 0);
                    kq0Var.finishFragment();
                    break;
                }
                break;
            case 17:
                br0 br0Var = (br0) this.b;
                zn znVar2 = br0Var.U;
                if (znVar2 != null && znVar2.c()) {
                    org.telegram.ui.Components.g5.K(br0Var.getParentActivity(), znVar2.a(), new oq0(br0Var, i14));
                    break;
                } else {
                    br0Var.e0(0, true);
                    break;
                }
                break;
            case 18:
                pu0 pu0Var = (pu0) this.b;
                if (pu0Var != null) {
                    pu0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 19:
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
            case 20:
                aw0 aw0Var = (aw0) this.b;
                boolean[] zArr = aw0Var.w;
                CharSequence[] charSequenceArr = aw0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view.getParent();
                    s4.d1 G = aw0Var.c.G(d6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - aw0Var.n0;
                        if (aw0Var.I && i18 < aw0Var.x) {
                            int i19 = -aw0Var.O;
                            aw0Var.O = i19;
                            AndroidUtilities.shakeViewSpring(d6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            aw0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = aw0Var.y - 1;
                            aw0Var.y = i21;
                            if (aw0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = aw0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                aw0Var.r = iArr;
                            }
                            if (aw0Var.y == charSequenceArr.length - 1) {
                                aw0Var.b.o((aw0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.d1 K = aw0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = d6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    aw0Var.i0();
                                    aw0Var.r0();
                                    oz0Var = aw0Var.Q;
                                    if (oz0Var != null) {
                                        oz0Var.f();
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
                            oz0Var = aw0Var.Q;
                            if (oz0Var != null) {
                            }
                            aw0Var.b.m(aw0Var.p0);
                        }
                    }
                }
                break;
            case 21:
                ((mw0) this.b).c(true);
                break;
            case 22:
                ((mw0) ((iw0) this.b).c).c(true);
                break;
            case 23:
                PrivacyControlActivity privacyControlActivity = ((yx0) this.b).d;
                privacyControlActivity.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) privacyControlActivity, 27, false));
                break;
            case 24:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                int intValue = ((Integer) a2Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.Z;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                a2Var.c(z10, true);
                break;
            case 25:
                f21 f21Var = (f21) this.b;
                ProxyListActivity proxyListActivity = f21Var.s;
                SharedConfig.ProxyInfo proxyInfo = f21Var.d;
                n21 n21Var = new n21(null);
                n21Var.e = new org.telegram.ui.Cells.b7[3];
                n21Var.f = new org.telegram.ui.Cells.e9[2];
                n21Var.s = new org.telegram.ui.Cells.k6[3];
                n21Var.y = 1.0f;
                n21Var.E = new float[2];
                n21Var.F = true;
                n21Var.L = new g21(n21Var);
                n21Var.J = proxyInfo;
                proxyListActivity.presentFragment(n21Var);
                break;
            case 26:
                d31 d31Var = (d31) this.b;
                ValueAnimator valueAnimator = d31Var.N;
                if (valueAnimator == null) {
                    boolean z11 = !d31Var.M;
                    e31 e31Var = d31Var.d;
                    b31 b31Var = d31Var.F;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) e31Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) d31Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    b31Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    b31Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    b31Var.getLocationInWindow(iArr2);
                    float f10 = iArr2[0];
                    float f11 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    d31Var.O = new ci.tb(d31Var, e31Var.getParentActivity(), z11, canvas, (b31Var.getMeasuredWidth() / 2.0f) + f10, (b31Var.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f10, f11, 2);
                    d31Var.P = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    d31Var.N = ofFloat;
                    ofFloat.addUpdateListener(new y11(d31Var, i12));
                    d31Var.N.addListener(new ep0(d31Var, 17));
                    d31Var.N.setDuration(400L);
                    d31Var.N.setInterpolator(org.telegram.ui.Components.au.e);
                    d31Var.N.start();
                    frameLayout2.addView(d31Var.O, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.ds0(12, d31Var, z11));
                    break;
                }
                break;
            case 27:
                b41 b41Var = (b41) this.b;
                ci.d dVar = b41Var.s;
                if (dVar.W && !dVar.N) {
                    dVar.setLoading(true);
                    c41.I(b41Var.v, ((TextView) b41Var.h.d).getText(), b41Var.d.option, b41Var.n.getText().toString());
                    break;
                }
                break;
            case 28:
                z31 z31Var = (z31) ((t5) this.b).e;
                if (z31Var != null) {
                    z31Var.run();
                    break;
                }
                break;
            default:
                ((h41) this.b).dismiss();
                break;
        }
    }
}
