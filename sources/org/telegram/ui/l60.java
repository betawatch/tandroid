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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class l60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x02b7  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.my0 my0Var;
        final int i10 = 4;
        int i11 = 19;
        final int i12 = 3;
        final int i13 = 2;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.mp mpVar = (org.telegram.ui.Components.mp) this.b;
                mpVar.a(!mpVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", mpVar.a.q).apply();
                break;
            case 1:
                ((q60) this.b).b.T0(19);
                break;
            case 2:
                f70 f70Var = ((d70) this.b).I;
                f70Var.X = null;
                f70Var.Z.b();
                f70Var.h.b();
                f70Var.k0();
                f70Var.r0();
                break;
            case 3:
                u70.a0(((s70) this.b).d, null);
                break;
            case 4:
                l80.V((l80) this.b);
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.E0;
                launchActivity.H0 = null;
                launchActivity.p0(new LanguageSelectActivity());
                for (int i14 = 0; i14 < arrayList.size(); i14++) {
                    if (((Dialog) arrayList.get(i14)).isShowing()) {
                        ((Dialog) arrayList.get(i14)).dismiss();
                    }
                }
                arrayList.clear();
                break;
            case 6:
                final af0 af0Var = (af0) this.b;
                wg0 wg0Var = af0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wg0Var.getParentActivity());
                alertDialog$Builder.a.R = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.T = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                final int i15 = 0;
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.ze0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i16) {
                        switch (i15) {
                            case 0:
                                af0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                af0 af0Var2 = af0Var;
                                wg0.n0(af0Var2.y, af0Var2.r, af0Var2.s, af0Var2.v);
                                break;
                        }
                    }
                });
                final int i16 = 1;
                alertDialog$Builder.h(LocaleController.getString(R.string.ResetAccount), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.ze0
                    @Override // org.telegram.ui.ActionBar.a2
                    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i162) {
                        switch (i16) {
                            case 0:
                                af0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                af0 af0Var2 = af0Var;
                                wg0.n0(af0Var2.y, af0Var2.r, af0Var2.s, af0Var2.v);
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
            case 7:
                if0 if0Var = (if0) this.b;
                wg0 wg0Var2 = if0Var.E;
                if (wg0Var2.V.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(wg0Var2.getParentActivity());
                    alertDialog$Builder2.a.R = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.T = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new iu(if0Var, i11));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    wg0Var2.showDialog(alertDialog$Builder2.a);
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
                com.google.android.gms.internal.clearcut.u0 a2 = w7.d9.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new z10(18, lf0Var, a2));
                break;
            case 9:
                final vh0 vh0Var = (vh0) this.b;
                yh0 yh0Var = vh0Var.K;
                if (vh0Var.n != null) {
                    View view2 = yh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.n70 F = org.telegram.ui.Components.n70.F((ViewGroup) view2, null, vh0Var);
                        if (vh0Var.n.revoked) {
                            final int i17 = 0;
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.sh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i17) {
                                        case 0:
                                            final vh0 vh0Var2 = vh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(vh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i18 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.th0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i19) {
                                                    switch (i18) {
                                                        case 0:
                                                            vh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            vh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.g.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            vh0 vh0Var3 = vh0Var;
                                            try {
                                                if (vh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh0Var3.n.link));
                                                    org.telegram.ui.Components.yc.j(vh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 2:
                                            vh0 vh0Var4 = vh0Var;
                                            yh0 yh0Var2 = vh0Var4.K;
                                            try {
                                                if (vh0Var4.n.link != null) {
                                                    Context context2 = vh0Var4.getContext();
                                                    String str2 = vh0Var4.n.link;
                                                    yh0Var2.showDialog(new uh0(vh0Var4, context2, str2, str2, yh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            vh0 vh0Var5 = vh0Var;
                                            yh0 yh0Var3 = vh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh0Var5.n;
                                            xb0 xb0Var = new xb0(1, yh0Var3.n);
                                            xb0Var.T = yh0Var3.s0;
                                            xb0Var.Y(tL_chatInviteExported2);
                                            yh0Var3.presentFragment(xb0Var);
                                            break;
                                        default:
                                            final vh0 vh0Var6 = vh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i19 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.th0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i192) {
                                                    switch (i19) {
                                                        case 0:
                                                            vh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            vh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.g.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            final int i18 = 1;
                            F.c(R.drawable.msg_copy, LocaleController.getString(R.string.CopyLink), new Runnable() { // from class: org.telegram.ui.sh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i18) {
                                        case 0:
                                            final vh0 vh0Var2 = vh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(vh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i182 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.th0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i192) {
                                                    switch (i182) {
                                                        case 0:
                                                            vh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            vh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.g.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            vh0 vh0Var3 = vh0Var;
                                            try {
                                                if (vh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh0Var3.n.link));
                                                    org.telegram.ui.Components.yc.j(vh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 2:
                                            vh0 vh0Var4 = vh0Var;
                                            yh0 yh0Var2 = vh0Var4.K;
                                            try {
                                                if (vh0Var4.n.link != null) {
                                                    Context context2 = vh0Var4.getContext();
                                                    String str2 = vh0Var4.n.link;
                                                    yh0Var2.showDialog(new uh0(vh0Var4, context2, str2, str2, yh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            vh0 vh0Var5 = vh0Var;
                                            yh0 yh0Var3 = vh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh0Var5.n;
                                            xb0 xb0Var = new xb0(1, yh0Var3.n);
                                            xb0Var.T = yh0Var3.s0;
                                            xb0Var.Y(tL_chatInviteExported2);
                                            yh0Var3.presentFragment(xb0Var);
                                            break;
                                        default:
                                            final vh0 vh0Var6 = vh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i19 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.th0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i192) {
                                                    switch (i19) {
                                                        case 0:
                                                            vh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            vh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.g.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.sh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final vh0 vh0Var2 = vh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(vh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i182 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.th0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i192) {
                                                    switch (i182) {
                                                        case 0:
                                                            vh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            vh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.g.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            vh0 vh0Var3 = vh0Var;
                                            try {
                                                if (vh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh0Var3.n.link));
                                                    org.telegram.ui.Components.yc.j(vh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 2:
                                            vh0 vh0Var4 = vh0Var;
                                            yh0 yh0Var2 = vh0Var4.K;
                                            try {
                                                if (vh0Var4.n.link != null) {
                                                    Context context2 = vh0Var4.getContext();
                                                    String str2 = vh0Var4.n.link;
                                                    yh0Var2.showDialog(new uh0(vh0Var4, context2, str2, str2, yh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            vh0 vh0Var5 = vh0Var;
                                            yh0 yh0Var3 = vh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh0Var5.n;
                                            xb0 xb0Var = new xb0(1, yh0Var3.n);
                                            xb0Var.T = yh0Var3.s0;
                                            xb0Var.Y(tL_chatInviteExported2);
                                            yh0Var3.presentFragment(xb0Var);
                                            break;
                                        default:
                                            final vh0 vh0Var6 = vh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i19 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.th0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i192) {
                                                    switch (i19) {
                                                        case 0:
                                                            vh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            vh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.g.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.sh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final vh0 vh0Var2 = vh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(vh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i182 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.th0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i192) {
                                                    switch (i182) {
                                                        case 0:
                                                            vh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            vh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.g.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            vh0 vh0Var3 = vh0Var;
                                            try {
                                                if (vh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh0Var3.n.link));
                                                    org.telegram.ui.Components.yc.j(vh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 2:
                                            vh0 vh0Var4 = vh0Var;
                                            yh0 yh0Var2 = vh0Var4.K;
                                            try {
                                                if (vh0Var4.n.link != null) {
                                                    Context context2 = vh0Var4.getContext();
                                                    String str2 = vh0Var4.n.link;
                                                    yh0Var2.showDialog(new uh0(vh0Var4, context2, str2, str2, yh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            vh0 vh0Var5 = vh0Var;
                                            yh0 yh0Var3 = vh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh0Var5.n;
                                            xb0 xb0Var = new xb0(1, yh0Var3.n);
                                            xb0Var.T = yh0Var3.s0;
                                            xb0Var.Y(tL_chatInviteExported2);
                                            yh0Var3.presentFragment(xb0Var);
                                            break;
                                        default:
                                            final vh0 vh0Var6 = vh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i19 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.th0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i192) {
                                                    switch (i19) {
                                                        case 0:
                                                            vh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            vh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.g.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !vh0Var.n.permanent && yh0Var.p0);
                            F.m(yh0Var.p0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.sh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            final vh0 vh0Var2 = vh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = vh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(vh0Var2.K.getParentActivity());
                                            alertDialog$Builder3.a.R = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.T = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i182 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.th0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i192) {
                                                    switch (i182) {
                                                        case 0:
                                                            vh0Var2.K.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            vh0Var2.K.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.g.r(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            vh0 vh0Var3 = vh0Var;
                                            try {
                                                if (vh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", vh0Var3.n.link));
                                                    org.telegram.ui.Components.yc.j(vh0Var3.K).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e7) {
                                                FileLog.e(e7);
                                                return;
                                            }
                                        case 2:
                                            vh0 vh0Var4 = vh0Var;
                                            yh0 yh0Var2 = vh0Var4.K;
                                            try {
                                                if (vh0Var4.n.link != null) {
                                                    Context context2 = vh0Var4.getContext();
                                                    String str2 = vh0Var4.n.link;
                                                    yh0Var2.showDialog(new uh0(vh0Var4, context2, str2, str2, yh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 3:
                                            vh0 vh0Var5 = vh0Var;
                                            yh0 yh0Var3 = vh0Var5.K;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = vh0Var5.n;
                                            xb0 xb0Var = new xb0(1, yh0Var3.n);
                                            xb0Var.T = yh0Var3.s0;
                                            xb0Var.Y(tL_chatInviteExported2);
                                            yh0Var3.presentFragment(xb0Var);
                                            break;
                                        default:
                                            final vh0 vh0Var6 = vh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = vh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(vh0Var6.K.getParentActivity());
                                            alertDialog$Builder4.a.T = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.R = LocaleController.getString(R.string.RevokeLink);
                                            final int i19 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.a2() { // from class: org.telegram.ui.th0
                                                @Override // org.telegram.ui.ActionBar.a2
                                                public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i192) {
                                                    switch (i19) {
                                                        case 0:
                                                            vh0Var6.K.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            vh0Var6.K.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            i2.g.r(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(yh0Var.b.U0(vh0Var, false));
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
                        org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) lj0Var.getParentLayout().getFragmentStack().get(lj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((n2Var instanceof co) && ((co) n2Var).e.id == j3) {
                            lj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle e7 = w.f.e(j3, "chat_id");
                    e7.putInt("message_id", lj0Var.c);
                    e7.putBoolean("need_remove_previous_same_chat_activity", false);
                    lj0Var.presentFragment(new co(e7));
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
                int i19 = passcodeActivity.x;
                if (i19 == 1) {
                    if (passcodeActivity.E == 0) {
                        passcodeActivity.h0();
                        break;
                    } else {
                        passcodeActivity.g0();
                        break;
                    }
                } else if (i19 == 2) {
                    passcodeActivity.g0();
                    break;
                }
                break;
            case 14:
                tl0 tl0Var = (tl0) this.b;
                if (!tl0Var.a.getAnimatedDrawable().l0) {
                    tl0Var.a.getAnimatedDrawable().L(0, false, false);
                    tl0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 16:
                ln0 ln0Var = (ln0) this.b;
                if (!ln0Var.J) {
                    int i20 = ln0Var.M;
                    if ((i20 != 4 || ln0Var.L != 2) && i20 != 0) {
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
                            org.telegram.ui.Components.e5.u0(ln0Var.Q, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                kq0 kq0Var = (kq0) this.b;
                co coVar = kq0Var.F;
                if (coVar == null || !coVar.c()) {
                    kq0Var.V(kq0Var.b, kq0Var.c, true, 0);
                    kq0Var.finishFragment();
                    break;
                } else {
                    org.telegram.ui.Components.e5.L(kq0Var.getParentActivity(), coVar.a(), new cq0(kq0Var, 0));
                    break;
                }
                break;
            case 18:
                br0 br0Var = (br0) this.b;
                co coVar2 = br0Var.U;
                if (coVar2 == null || !coVar2.c()) {
                    br0Var.e0(0, true);
                    break;
                } else {
                    org.telegram.ui.Components.e5.L(br0Var.getParentActivity(), coVar2.a(), new oq0(br0Var, 0));
                    break;
                }
            case 19:
                nu0 nu0Var = (nu0) this.b;
                if (nu0Var != null) {
                    nu0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 20:
                vu0 vu0Var = (vu0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = vu0Var.d;
                int indexOf = photoViewer.g7.indexOf(tag);
                if (indexOf >= 0) {
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
                } else {
                    int Q = photoViewer.d.Q(tag);
                    if (Q >= 0) {
                        photoViewer.p1.u(Q);
                        if (Q == 0) {
                            photoViewer.p1.m(0);
                        }
                        photoViewer.A3();
                        break;
                    }
                }
                break;
            case 21:
                zv0 zv0Var = (zv0) this.b;
                boolean[] zArr = zv0Var.w;
                CharSequence[] charSequenceArr = zv0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view.getParent();
                    s4.c1 G = zv0Var.c.G(c6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i21 = b10 - zv0Var.n0;
                        if (zv0Var.I && i21 < zv0Var.x) {
                            int i22 = -zv0Var.O;
                            zv0Var.O = i22;
                            AndroidUtilities.shakeViewSpring(c6Var, i22);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            zv0Var.b.u(b10);
                            int i23 = i21 + 1;
                            System.arraycopy(charSequenceArr, i23, charSequenceArr, i21, (charSequenceArr.length - 1) - i21);
                            System.arraycopy(zArr, i23, zArr, i21, (zArr.length - 1) - i21);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i24 = zv0Var.y - 1;
                            zv0Var.y = i24;
                            if (zv0Var.r != null) {
                                int[] iArr = new int[i24];
                                int i25 = 0;
                                while (i25 < i24) {
                                    iArr[i25] = zv0Var.r[i25 >= i21 ? i25 + 1 : i25];
                                    i25++;
                                }
                                zv0Var.r = iArr;
                            }
                            if (zv0Var.y == charSequenceArr.length - 1) {
                                zv0Var.b.o((zv0Var.n0 + charSequenceArr.length) - 1);
                            }
                            s4.c1 K = zv0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = c6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    zv0Var.i0();
                                    zv0Var.r0();
                                    my0Var = zv0Var.Q;
                                    if (my0Var != null) {
                                        my0Var.f();
                                        zv0Var.Q.setDelegate(null);
                                    }
                                    zv0Var.b.m(zv0Var.p0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                zv0Var.k0(true);
                            } else if (zv0Var.B0) {
                                zv0Var.k0(true);
                            }
                            textView.clearFocus();
                            zv0Var.i0();
                            zv0Var.r0();
                            my0Var = zv0Var.Q;
                            if (my0Var != null) {
                            }
                            zv0Var.b.m(zv0Var.p0);
                        }
                    }
                }
                break;
            case 22:
                ((lw0) this.b).c(true);
                break;
            case 23:
                ((lw0) ((hw0) this.b).c).c(true);
                break;
            case 24:
                PrivacyControlActivity privacyControlActivity = ((zx0) this.b).d;
                privacyControlActivity.showDialog(new sg.a1((org.telegram.ui.ActionBar.n2) privacyControlActivity, 27, false));
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
                i21 i21Var = (i21) this.b;
                ProxyListActivity proxyListActivity = i21Var.s;
                SharedConfig.ProxyInfo proxyInfo = i21Var.d;
                q21 q21Var = new q21(null);
                q21Var.e = new org.telegram.ui.Cells.a7[3];
                q21Var.f = new org.telegram.ui.Cells.e9[2];
                q21Var.s = new org.telegram.ui.Cells.j6[3];
                q21Var.y = 1.0f;
                q21Var.E = new float[2];
                q21Var.F = true;
                q21Var.L = new j21(q21Var);
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
                    f31Var.O = new di.xb(f31Var, g31Var.getParentActivity(), z11, canvas, (d31Var.getMeasuredWidth() / 2.0f) + f7, (d31Var.getMeasuredHeight() / 2.0f) + f10, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f7, f10, 2);
                    f31Var.P = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    f31Var.N = ofFloat;
                    ofFloat.addUpdateListener(new b21(f31Var, i12));
                    f31Var.N.addListener(new gk0(f31Var, i11));
                    f31Var.N.setDuration(400L);
                    f31Var.N.setInterpolator(org.telegram.ui.Components.jt.e);
                    f31Var.N.start();
                    frameLayout2.addView(f31Var.O, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.mr0(11, f31Var, z11));
                    break;
                }
                break;
            case 28:
                d41 d41Var = (d41) this.b;
                di.d dVar = d41Var.s;
                if (dVar.W && !dVar.N) {
                    dVar.setLoading(true);
                    e41.H(d41Var.v, ((TextView) d41Var.h.d).getText(), d41Var.d.option, d41Var.n.getText().toString());
                    break;
                }
                break;
            default:
                b41 b41Var = (b41) ((t5) this.b).e;
                if (b41Var != null) {
                    b41Var.run();
                    break;
                }
                break;
        }
    }
}
