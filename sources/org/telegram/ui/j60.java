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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final /* synthetic */ class j60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j60(Object obj, int i10) {
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
        org.telegram.ui.Components.jz0 jz0Var;
        int i10 = 20;
        final int i11 = 4;
        final int i12 = 3;
        final int i13 = 2;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.qp qpVar = (org.telegram.ui.Components.qp) this.b;
                qpVar.a(!qpVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", qpVar.a.q).apply();
                break;
            case 1:
                ((o60) this.b).b.T0(19);
                break;
            case 2:
                d70 d70Var = ((b70) this.b).I;
                d70Var.X = null;
                d70Var.Z.b();
                d70Var.h.b();
                d70Var.k0();
                d70Var.r0();
                break;
            case 3:
                s70.Z(((q70) this.b).d, null);
                break;
            case 4:
                k80.T((k80) this.b);
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
                final ye0 ye0Var = (ye0) this.b;
                ug0 ug0Var = ye0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ug0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.xe0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        switch (i14) {
                            case 0:
                                ye0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ye0 ye0Var2 = ye0Var;
                                ug0.n0(ye0Var2.y, ye0Var2.r, ye0Var2.s, ye0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.xe0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i15) {
                        switch (c10) {
                            case 0:
                                ye0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ye0 ye0Var2 = ye0Var;
                                ug0.n0(ye0Var2.y, ye0Var2.r, ye0Var2.s, ye0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = ug0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                gf0 gf0Var = (gf0) this.b;
                ug0 ug0Var2 = gf0Var.E;
                if (ug0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ug0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new bu(gf0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    ug0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 8:
                jf0 jf0Var = (jf0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new if0(jf0Var), NotificationCenter.onActivityResultReceived);
                Context context = jf0Var.getContext();
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
                com.google.android.gms.internal.clearcut.v0 a2 = w7.h9.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new pw(i10, jf0Var, a2));
                break;
            case 9:
                final th0 th0Var = (th0) this.b;
                wh0 wh0Var = th0Var.K;
                if (th0Var.n != null) {
                    View view2 = wh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.b80 F = org.telegram.ui.Components.b80.F((ViewGroup) view2, null, th0Var);
                        if (th0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.qh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final th0 th0Var2 = th0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = th0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(th0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.rh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            th0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            th0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            th0 th0Var3 = th0Var;
                                            try {
                                                if (th0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", th0Var3.n.link));
                                                    org.telegram.ui.Components.yc.j(th0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 2:
                                            th0 th0Var4 = th0Var;
                                            wh0 wh0Var2 = th0Var4.K;
                                            try {
                                                if (th0Var4.n.link != null) {
                                                    Context context2 = th0Var4.getContext();
                                                    String str2 = th0Var4.n.link;
                                                    wh0Var2.showDialog(new sh0(th0Var4, context2, str2, str2, wh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            th0 th0Var5 = th0Var;
                                            wh0 wh0Var3 = th0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = th0Var5.n;
                                            vb0 vb0Var = new vb0(1, wh0Var3.n);
                                            vb0Var.T = wh0Var3.s0;
                                            vb0Var.X(tL_chatInviteExported2);
                                            wh0Var3.presentFragment(vb0Var);
                                            break;
                                        default:
                                            final th0 th0Var6 = th0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = th0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(th0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.rh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            th0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            th0Var6.K.b0(tL_chatInviteExported3);
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
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.qh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final th0 th0Var2 = th0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = th0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(th0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.rh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            th0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            th0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            th0 th0Var3 = th0Var;
                                            try {
                                                if (th0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", th0Var3.n.link));
                                                    org.telegram.ui.Components.yc.j(th0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 2:
                                            th0 th0Var4 = th0Var;
                                            wh0 wh0Var2 = th0Var4.K;
                                            try {
                                                if (th0Var4.n.link != null) {
                                                    Context context2 = th0Var4.getContext();
                                                    String str2 = th0Var4.n.link;
                                                    wh0Var2.showDialog(new sh0(th0Var4, context2, str2, str2, wh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            th0 th0Var5 = th0Var;
                                            wh0 wh0Var3 = th0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = th0Var5.n;
                                            vb0 vb0Var = new vb0(1, wh0Var3.n);
                                            vb0Var.T = wh0Var3.s0;
                                            vb0Var.X(tL_chatInviteExported2);
                                            wh0Var3.presentFragment(vb0Var);
                                            break;
                                        default:
                                            final th0 th0Var6 = th0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = th0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(th0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.rh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            th0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            th0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.qh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final th0 th0Var2 = th0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = th0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(th0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.rh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            th0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            th0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            th0 th0Var3 = th0Var;
                                            try {
                                                if (th0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", th0Var3.n.link));
                                                    org.telegram.ui.Components.yc.j(th0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 2:
                                            th0 th0Var4 = th0Var;
                                            wh0 wh0Var2 = th0Var4.K;
                                            try {
                                                if (th0Var4.n.link != null) {
                                                    Context context2 = th0Var4.getContext();
                                                    String str2 = th0Var4.n.link;
                                                    wh0Var2.showDialog(new sh0(th0Var4, context2, str2, str2, wh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            th0 th0Var5 = th0Var;
                                            wh0 wh0Var3 = th0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = th0Var5.n;
                                            vb0 vb0Var = new vb0(1, wh0Var3.n);
                                            vb0Var.T = wh0Var3.s0;
                                            vb0Var.X(tL_chatInviteExported2);
                                            wh0Var3.presentFragment(vb0Var);
                                            break;
                                        default:
                                            final th0 th0Var6 = th0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = th0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(th0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.rh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            th0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            th0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.qh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final th0 th0Var2 = th0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = th0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(th0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.rh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            th0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            th0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            th0 th0Var3 = th0Var;
                                            try {
                                                if (th0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", th0Var3.n.link));
                                                    org.telegram.ui.Components.yc.j(th0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 2:
                                            th0 th0Var4 = th0Var;
                                            wh0 wh0Var2 = th0Var4.K;
                                            try {
                                                if (th0Var4.n.link != null) {
                                                    Context context2 = th0Var4.getContext();
                                                    String str2 = th0Var4.n.link;
                                                    wh0Var2.showDialog(new sh0(th0Var4, context2, str2, str2, wh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            th0 th0Var5 = th0Var;
                                            wh0 wh0Var3 = th0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = th0Var5.n;
                                            vb0 vb0Var = new vb0(1, wh0Var3.n);
                                            vb0Var.T = wh0Var3.s0;
                                            vb0Var.X(tL_chatInviteExported2);
                                            wh0Var3.presentFragment(vb0Var);
                                            break;
                                        default:
                                            final th0 th0Var6 = th0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = th0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(th0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.rh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            th0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            th0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !th0Var.n.permanent && wh0Var.p0);
                            F.m(wh0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.qh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final th0 th0Var2 = th0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = th0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(th0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.rh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            th0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            th0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            th0 th0Var3 = th0Var;
                                            try {
                                                if (th0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", th0Var3.n.link));
                                                    org.telegram.ui.Components.yc.j(th0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 2:
                                            th0 th0Var4 = th0Var;
                                            wh0 wh0Var2 = th0Var4.K;
                                            try {
                                                if (th0Var4.n.link != null) {
                                                    Context context2 = th0Var4.getContext();
                                                    String str2 = th0Var4.n.link;
                                                    wh0Var2.showDialog(new sh0(th0Var4, context2, str2, str2, wh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            th0 th0Var5 = th0Var;
                                            wh0 wh0Var3 = th0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = th0Var5.n;
                                            vb0 vb0Var = new vb0(1, wh0Var3.n);
                                            vb0Var.T = wh0Var3.s0;
                                            vb0Var.X(tL_chatInviteExported2);
                                            wh0Var3.presentFragment(vb0Var);
                                            break;
                                        default:
                                            final th0 th0Var6 = th0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = th0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(th0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.rh0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            th0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            th0Var6.K.b0(tL_chatInviteExported3);
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
                        F.W(wh0Var.b.V0(th0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                hj0 hj0Var = (hj0) this.b;
                long j3 = hj0Var.b;
                if (!hj0Var.n.isStory()) {
                    if (hj0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) hj0Var.getParentLayout().getFragmentStack().get(hj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((n2Var instanceof yn) && ((yn) n2Var).e.id == j3) {
                            hj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle f7 = sa.e.f(j3, "chat_id");
                    f7.putInt("message_id", hj0Var.c);
                    f7.putBoolean("need_remove_previous_same_chat_activity", false);
                    hj0Var.presentFragment(new yn(f7));
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Cells.w8) this.b).setChecked(!r1.e.h);
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
                        passcodeActivity.m0();
                        break;
                    }
                } else if (passcodeActivity.E != 0) {
                    passcodeActivity.m0();
                    break;
                } else {
                    passcodeActivity.n0();
                    break;
                }
                break;
            case 14:
                pl0 pl0Var = (pl0) this.b;
                if (!pl0Var.a.getAnimatedDrawable().k0) {
                    pl0Var.a.getAnimatedDrawable().N(0, false, false);
                    pl0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Y(view);
                break;
            case 16:
                gn0 gn0Var = (gn0) this.b;
                if (!gn0Var.J) {
                    int i17 = gn0Var.M;
                    if ((i17 != 4 || gn0Var.L != 2) && i17 != 0) {
                        gn0Var.u();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + gn0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + gn0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + gn0Var.K);
                            gn0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.e5.u0(gn0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                fq0 fq0Var = (fq0) this.b;
                yn ynVar = fq0Var.F;
                if (ynVar != null && ynVar.c()) {
                    org.telegram.ui.Components.e5.L(fq0Var.getParentActivity(), ynVar.a(), new xp0(fq0Var, i14));
                    break;
                } else {
                    fq0Var.T(fq0Var.b, fq0Var.c, true, 0);
                    fq0Var.finishFragment();
                    break;
                }
            case 18:
                wq0 wq0Var = (wq0) this.b;
                yn ynVar2 = wq0Var.U;
                if (ynVar2 != null && ynVar2.c()) {
                    org.telegram.ui.Components.e5.L(wq0Var.getParentActivity(), ynVar2.a(), new jq0(wq0Var, i14));
                    break;
                } else {
                    wq0Var.e0(0, true);
                    break;
                }
            case 19:
                ju0 ju0Var = (ju0) this.b;
                if (ju0Var != null) {
                    ju0Var.z(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 20:
                ru0 ru0Var = (ru0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = ru0Var.d;
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
                uv0 uv0Var = (uv0) this.b;
                boolean[] zArr = uv0Var.w;
                CharSequence[] charSequenceArr = uv0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view.getParent();
                    s4.c1 G = uv0Var.c.G(d6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - uv0Var.n0;
                        if (uv0Var.I && i18 < uv0Var.x) {
                            int i19 = -uv0Var.O;
                            uv0Var.O = i19;
                            AndroidUtilities.shakeViewSpring(d6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            uv0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = uv0Var.y - 1;
                            uv0Var.y = i21;
                            if (uv0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = uv0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                uv0Var.r = iArr;
                            }
                            if (uv0Var.y == charSequenceArr.length - 1) {
                                uv0Var.b.o((uv0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.c1 K = uv0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = d6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    uv0Var.i0();
                                    uv0Var.r0();
                                    jz0Var = uv0Var.Q;
                                    if (jz0Var != null) {
                                        jz0Var.f();
                                        uv0Var.Q.setDelegate(null);
                                    }
                                    uv0Var.b.m(uv0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                uv0Var.k0(true);
                            } else if (uv0Var.B0) {
                                uv0Var.k0(true);
                            }
                            textView.clearFocus();
                            uv0Var.i0();
                            uv0Var.r0();
                            jz0Var = uv0Var.Q;
                            if (jz0Var != null) {
                            }
                            uv0Var.b.m(uv0Var.p0);
                        }
                    }
                }
                break;
            case 22:
                ((gw0) this.b).c(true);
                break;
            case 23:
                ((gw0) ((cw0) this.b).c).c(true);
                break;
            case 24:
                PrivacyControlActivity privacyControlActivity = ((sx0) this.b).d;
                privacyControlActivity.showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) privacyControlActivity, 27, false));
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
                y11 y11Var = (y11) this.b;
                ProxyListActivity proxyListActivity = y11Var.s;
                SharedConfig.ProxyInfo proxyInfo = y11Var.d;
                h21 h21Var = new h21(null);
                h21Var.e = new org.telegram.ui.Cells.b7[3];
                h21Var.f = new org.telegram.ui.Cells.e9[2];
                h21Var.s = new org.telegram.ui.Cells.k6[3];
                h21Var.y = 1.0f;
                h21Var.E = new float[2];
                h21Var.F = true;
                h21Var.L = new z11(h21Var);
                h21Var.J = proxyInfo;
                proxyListActivity.presentFragment(h21Var);
                break;
            case 27:
                x21 x21Var = (x21) this.b;
                ValueAnimator valueAnimator = x21Var.N;
                if (valueAnimator == null) {
                    boolean z11 = !x21Var.M;
                    y21 y21Var = x21Var.d;
                    v21 v21Var = x21Var.F;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) y21Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) x21Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    v21Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    v21Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    v21Var.getLocationInWindow(iArr2);
                    float f10 = iArr2[0];
                    float f11 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    x21Var.O = new ci.sb(x21Var, y21Var.getParentActivity(), z11, canvas, (v21Var.getMeasuredWidth() / 2.0f) + f10, (v21Var.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f10, f11, 2);
                    x21Var.P = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    x21Var.N = ofFloat;
                    ofFloat.addUpdateListener(new b21(x21Var, i13));
                    x21Var.N.addListener(new ap0(x21Var, 17));
                    x21Var.N.setDuration(400L);
                    x21Var.N.setInterpolator(org.telegram.ui.Components.nt.e);
                    x21Var.N.start();
                    frameLayout2.addView(x21Var.O, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fs0(11, x21Var, z11));
                    break;
                }
                break;
            case 28:
                s31 s31Var = (s31) this.b;
                ci.d dVar = s31Var.s;
                if (dVar.W && !dVar.N) {
                    dVar.setLoading(true);
                    t31.F(s31Var.v, ((TextView) s31Var.h.d).getText(), s31Var.d.option, s31Var.n.getText().toString());
                    break;
                }
                break;
            default:
                q31 q31Var = (q31) ((u5) this.b).e;
                if (q31Var != null) {
                    q31Var.run();
                    break;
                }
                break;
        }
    }
}
