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

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class f60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f60(Object obj, int i10) {
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
        org.telegram.ui.Components.xy0 xy0Var;
        final int i10 = 4;
        int i11 = 19;
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
                ((k60) this.b).b.T0(19);
                break;
            case 2:
                z60 z60Var = ((x60) this.b).I;
                z60Var.X = null;
                z60Var.Z.b();
                z60Var.h.b();
                z60Var.k0();
                z60Var.r0();
                break;
            case 3:
                o70.a0(((m70) this.b).d, null);
                break;
            case 4:
                g80.V((g80) this.b);
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
                final ue0 ue0Var = (ue0) this.b;
                qg0 qg0Var = ue0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.te0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i15) {
                        switch (i14) {
                            case 0:
                                ue0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ue0 ue0Var2 = ue0Var;
                                qg0.n0(ue0Var2.y, ue0Var2.r, ue0Var2.s, ue0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.te0
                    @Override // org.telegram.ui.ActionBar.z1
                    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i15) {
                        switch (c10) {
                            case 0:
                                ue0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ue0 ue0Var2 = ue0Var;
                                qg0.n0(ue0Var2.y, ue0Var2.r, ue0Var2.s, ue0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = qg0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                cf0 cf0Var = (cf0) this.b;
                qg0 qg0Var2 = cf0Var.E;
                if (qg0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(qg0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new du(cf0Var, i11));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    qg0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 8:
                ff0 ff0Var = (ff0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new ef0(ff0Var), NotificationCenter.onActivityResultReceived);
                Context context = ff0Var.getContext();
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
                com.google.android.gms.internal.clearcut.v0 a2 = w7.e9.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new ow(i11, ff0Var, a2));
                break;
            case 9:
                final ph0 ph0Var = (ph0) this.b;
                sh0 sh0Var = ph0Var.K;
                if (ph0Var.n != null) {
                    View view2 = sh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.y70 F = org.telegram.ui.Components.y70.F((ViewGroup) view2, null, ph0Var);
                        if (ph0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.mh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final ph0 ph0Var2 = ph0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ph0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ph0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.nh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            ph0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ph0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            ph0 ph0Var3 = ph0Var;
                                            try {
                                                if (ph0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ph0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(ph0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ph0 ph0Var4 = ph0Var;
                                            sh0 sh0Var2 = ph0Var4.K;
                                            try {
                                                if (ph0Var4.n.link != null) {
                                                    Context context2 = ph0Var4.getContext();
                                                    String str2 = ph0Var4.n.link;
                                                    sh0Var2.showDialog(new oh0(ph0Var4, context2, str2, str2, sh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            ph0 ph0Var5 = ph0Var;
                                            sh0 sh0Var3 = ph0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ph0Var5.n;
                                            rb0 rb0Var = new rb0(1, sh0Var3.n);
                                            rb0Var.T = sh0Var3.s0;
                                            rb0Var.Y(tL_chatInviteExported2);
                                            sh0Var3.presentFragment(rb0Var);
                                            break;
                                        default:
                                            final ph0 ph0Var6 = ph0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ph0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ph0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.nh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            ph0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ph0Var6.K.b0(tL_chatInviteExported3);
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
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.mh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final ph0 ph0Var2 = ph0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ph0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ph0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.nh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            ph0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ph0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            ph0 ph0Var3 = ph0Var;
                                            try {
                                                if (ph0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ph0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(ph0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ph0 ph0Var4 = ph0Var;
                                            sh0 sh0Var2 = ph0Var4.K;
                                            try {
                                                if (ph0Var4.n.link != null) {
                                                    Context context2 = ph0Var4.getContext();
                                                    String str2 = ph0Var4.n.link;
                                                    sh0Var2.showDialog(new oh0(ph0Var4, context2, str2, str2, sh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            ph0 ph0Var5 = ph0Var;
                                            sh0 sh0Var3 = ph0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ph0Var5.n;
                                            rb0 rb0Var = new rb0(1, sh0Var3.n);
                                            rb0Var.T = sh0Var3.s0;
                                            rb0Var.Y(tL_chatInviteExported2);
                                            sh0Var3.presentFragment(rb0Var);
                                            break;
                                        default:
                                            final ph0 ph0Var6 = ph0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ph0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ph0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.nh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            ph0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ph0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.mh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final ph0 ph0Var2 = ph0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ph0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ph0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.nh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            ph0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ph0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            ph0 ph0Var3 = ph0Var;
                                            try {
                                                if (ph0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ph0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(ph0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ph0 ph0Var4 = ph0Var;
                                            sh0 sh0Var2 = ph0Var4.K;
                                            try {
                                                if (ph0Var4.n.link != null) {
                                                    Context context2 = ph0Var4.getContext();
                                                    String str2 = ph0Var4.n.link;
                                                    sh0Var2.showDialog(new oh0(ph0Var4, context2, str2, str2, sh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            ph0 ph0Var5 = ph0Var;
                                            sh0 sh0Var3 = ph0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ph0Var5.n;
                                            rb0 rb0Var = new rb0(1, sh0Var3.n);
                                            rb0Var.T = sh0Var3.s0;
                                            rb0Var.Y(tL_chatInviteExported2);
                                            sh0Var3.presentFragment(rb0Var);
                                            break;
                                        default:
                                            final ph0 ph0Var6 = ph0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ph0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ph0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.nh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            ph0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ph0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.mh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final ph0 ph0Var2 = ph0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ph0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ph0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.nh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            ph0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ph0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            ph0 ph0Var3 = ph0Var;
                                            try {
                                                if (ph0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ph0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(ph0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ph0 ph0Var4 = ph0Var;
                                            sh0 sh0Var2 = ph0Var4.K;
                                            try {
                                                if (ph0Var4.n.link != null) {
                                                    Context context2 = ph0Var4.getContext();
                                                    String str2 = ph0Var4.n.link;
                                                    sh0Var2.showDialog(new oh0(ph0Var4, context2, str2, str2, sh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            ph0 ph0Var5 = ph0Var;
                                            sh0 sh0Var3 = ph0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ph0Var5.n;
                                            rb0 rb0Var = new rb0(1, sh0Var3.n);
                                            rb0Var.T = sh0Var3.s0;
                                            rb0Var.Y(tL_chatInviteExported2);
                                            sh0Var3.presentFragment(rb0Var);
                                            break;
                                        default:
                                            final ph0 ph0Var6 = ph0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ph0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ph0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.nh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            ph0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ph0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !ph0Var.n.permanent && sh0Var.p0);
                            F.m(sh0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.mh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            final ph0 ph0Var2 = ph0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = ph0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(ph0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.nh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            ph0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            ph0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            hg.c.p(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            ph0 ph0Var3 = ph0Var;
                                            try {
                                                if (ph0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", ph0Var3.n.link));
                                                    org.telegram.ui.Components.xc.j(ph0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            ph0 ph0Var4 = ph0Var;
                                            sh0 sh0Var2 = ph0Var4.K;
                                            try {
                                                if (ph0Var4.n.link != null) {
                                                    Context context2 = ph0Var4.getContext();
                                                    String str2 = ph0Var4.n.link;
                                                    sh0Var2.showDialog(new oh0(ph0Var4, context2, str2, str2, sh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 3:
                                            ph0 ph0Var5 = ph0Var;
                                            sh0 sh0Var3 = ph0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = ph0Var5.n;
                                            rb0 rb0Var = new rb0(1, sh0Var3.n);
                                            rb0Var.T = sh0Var3.s0;
                                            rb0Var.Y(tL_chatInviteExported2);
                                            sh0Var3.presentFragment(rb0Var);
                                            break;
                                        default:
                                            final ph0 ph0Var6 = ph0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = ph0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(ph0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.z1() { // from class: org.telegram.ui.nh0
                                                @Override // org.telegram.ui.ActionBar.z1
                                                public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            ph0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            ph0Var6.K.b0(tL_chatInviteExported3);
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
                        F.W(sh0Var.b.V0(ph0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                dj0 dj0Var = (dj0) this.b;
                long j3 = dj0Var.b;
                if (!dj0Var.n.isStory()) {
                    if (dj0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) dj0Var.getParentLayout().getFragmentStack().get(dj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((m2Var instanceof wn) && ((wn) m2Var).e.id == j3) {
                            dj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle e = v7.j.e(j3, "chat_id");
                    e.putInt("message_id", dj0Var.c);
                    e.putBoolean("need_remove_previous_same_chat_activity", false);
                    dj0Var.presentFragment(new wn(e));
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
                kl0 kl0Var = (kl0) this.b;
                if (!kl0Var.a.getAnimatedDrawable().k0) {
                    kl0Var.a.getAnimatedDrawable().N(0, false, false);
                    kl0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 16:
                cn0 cn0Var = (cn0) this.b;
                if (!cn0Var.J) {
                    int i17 = cn0Var.M;
                    if ((i17 != 4 || cn0Var.L != 2) && i17 != 0) {
                        cn0Var.u();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + cn0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + cn0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + cn0Var.K);
                            cn0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.e5.u0(cn0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                cq0 cq0Var = (cq0) this.b;
                wn wnVar = cq0Var.F;
                if (wnVar != null && wnVar.c()) {
                    org.telegram.ui.Components.e5.L(cq0Var.getParentActivity(), wnVar.a(), new up0(cq0Var, i14));
                    break;
                } else {
                    cq0Var.V(cq0Var.b, cq0Var.c, true, 0);
                    cq0Var.finishFragment();
                    break;
                }
            case 18:
                tq0 tq0Var = (tq0) this.b;
                wn wnVar2 = tq0Var.U;
                if (wnVar2 != null && wnVar2.c()) {
                    org.telegram.ui.Components.e5.L(tq0Var.getParentActivity(), wnVar2.a(), new gq0(tq0Var, i14));
                    break;
                } else {
                    tq0Var.e0(0, true);
                    break;
                }
            case 19:
                gu0 gu0Var = (gu0) this.b;
                if (gu0Var != null) {
                    gu0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 20:
                ou0 ou0Var = (ou0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = ou0Var.d;
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
                rv0 rv0Var = (rv0) this.b;
                boolean[] zArr = rv0Var.w;
                CharSequence[] charSequenceArr = rv0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.d6 d6Var = (org.telegram.ui.Cells.d6) view.getParent();
                    s4.c1 G = rv0Var.c.G(d6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - rv0Var.n0;
                        if (rv0Var.I && i18 < rv0Var.x) {
                            int i19 = -rv0Var.O;
                            rv0Var.O = i19;
                            AndroidUtilities.shakeViewSpring(d6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            rv0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = rv0Var.y - 1;
                            rv0Var.y = i21;
                            if (rv0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = rv0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                rv0Var.r = iArr;
                            }
                            if (rv0Var.y == charSequenceArr.length - 1) {
                                rv0Var.b.o((rv0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.c1 K = rv0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = d6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.d6) {
                                    ((org.telegram.ui.Cells.d6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    rv0Var.i0();
                                    rv0Var.r0();
                                    xy0Var = rv0Var.Q;
                                    if (xy0Var != null) {
                                        xy0Var.f();
                                        rv0Var.Q.setDelegate(null);
                                    }
                                    rv0Var.b.m(rv0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                rv0Var.k0(true);
                            } else if (rv0Var.B0) {
                                rv0Var.k0(true);
                            }
                            textView.clearFocus();
                            rv0Var.i0();
                            rv0Var.r0();
                            xy0Var = rv0Var.Q;
                            if (xy0Var != null) {
                            }
                            rv0Var.b.m(rv0Var.p0);
                        }
                    }
                }
                break;
            case 22:
                ((dw0) this.b).c(true);
                break;
            case 23:
                ((dw0) ((zv0) this.b).c).c(true);
                break;
            case 24:
                PrivacyControlActivity privacyControlActivity = ((qx0) this.b).d;
                privacyControlActivity.showDialog(new rg.x0((org.telegram.ui.ActionBar.m2) privacyControlActivity, 27, false));
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
                x11 x11Var = (x11) this.b;
                ProxyListActivity proxyListActivity = x11Var.s;
                SharedConfig.ProxyInfo proxyInfo = x11Var.d;
                f21 f21Var = new f21(null);
                f21Var.e = new org.telegram.ui.Cells.b7[3];
                f21Var.f = new org.telegram.ui.Cells.e9[2];
                f21Var.s = new org.telegram.ui.Cells.k6[3];
                f21Var.y = 1.0f;
                f21Var.E = new float[2];
                f21Var.F = true;
                f21Var.L = new y11(f21Var);
                f21Var.J = proxyInfo;
                proxyListActivity.presentFragment(f21Var);
                break;
            case 27:
                v21 v21Var = (v21) this.b;
                ValueAnimator valueAnimator = v21Var.N;
                if (valueAnimator == null) {
                    boolean z11 = !v21Var.M;
                    w21 w21Var = v21Var.d;
                    t21 t21Var = v21Var.F;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) w21Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) v21Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    t21Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    t21Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    t21Var.getLocationInWindow(iArr2);
                    float f7 = iArr2[0];
                    float f10 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    v21Var.O = new ci.tb(v21Var, w21Var.getParentActivity(), z11, canvas, (t21Var.getMeasuredWidth() / 2.0f) + f7, (t21Var.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 2);
                    v21Var.P = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    v21Var.N = ofFloat;
                    ofFloat.addUpdateListener(new q11(v21Var, i12));
                    v21Var.N.addListener(new xo0(v21Var, 17));
                    v21Var.N.setDuration(400L);
                    v21Var.N.setInterpolator(org.telegram.ui.Components.lt.e);
                    v21Var.N.start();
                    frameLayout2.addView(v21Var.O, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.yr0(11, v21Var, z11));
                    break;
                }
                break;
            case 28:
                s31 s31Var = (s31) this.b;
                ci.d dVar = s31Var.s;
                if (dVar.W && !dVar.N) {
                    dVar.setLoading(true);
                    t31.H(s31Var.v, ((TextView) s31Var.h.d).getText(), s31Var.d.option, s31Var.n.getText().toString());
                    break;
                }
                break;
            default:
                q31 q31Var = (q31) ((t5) this.b).e;
                if (q31Var != null) {
                    q31Var.run();
                    break;
                }
                break;
        }
    }
}
