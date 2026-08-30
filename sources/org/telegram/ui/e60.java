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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class e60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e60(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026f  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.qy0 qy0Var;
        int i10 = 19;
        final int i11 = 4;
        final int i12 = 3;
        final int i13 = 2;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.lp lpVar = (org.telegram.ui.Components.lp) this.b;
                lpVar.a(!lpVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", lpVar.a.q).apply();
                break;
            case 1:
                ((k60) this.b).b.T0(19);
                break;
            case 2:
                y60 y60Var = ((w60) this.b).F;
                y60Var.U = null;
                y60Var.W.b();
                y60Var.h.b();
                y60Var.k0();
                y60Var.r0();
                break;
            case 3:
                m70.a0(((k70) this.b).d, null);
                break;
            case 4:
                c80.V((c80) this.b);
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
                final se0 se0Var = (se0) this.b;
                ng0 ng0Var = se0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ng0Var.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.Q = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.re0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i15) {
                        switch (i14) {
                            case 0:
                                se0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                se0 se0Var2 = se0Var;
                                ng0.n0(se0Var2.y, se0Var2.r, se0Var2.s, se0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c3 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.re0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i15) {
                        switch (c3) {
                            case 0:
                                se0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                se0 se0Var2 = se0Var;
                                ng0.n0(se0Var2.y, se0Var2.r, se0Var2.s, se0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = ng0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                af0 af0Var = (af0) this.b;
                ng0 ng0Var2 = af0Var.B;
                if (ng0Var2.S.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(ng0Var2.getParentActivity());
                    alertDialog$Builder2.a.O = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.Q = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new fu(af0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    ng0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 8:
                df0 df0Var = (df0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new cf0(df0Var), NotificationCenter.onActivityResultReceived);
                Context context = df0Var.getContext();
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
                a8.e a2 = k7.y.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new qs(26, df0Var, a2));
                break;
            case 9:
                final mh0 mh0Var = (mh0) this.b;
                ph0 ph0Var = mh0Var.H;
                if (mh0Var.n != null) {
                    View view2 = ph0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.o70 F = org.telegram.ui.Components.o70.F((ViewGroup) view2, null, mh0Var);
                        if (mh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.jh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final mh0 mh0Var2 = mh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = mh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(mh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.kh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            mh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            mh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            kh.a2.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            mh0 mh0Var3 = mh0Var;
                                            try {
                                                if (mh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(mh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            mh0 mh0Var4 = mh0Var;
                                            ph0 ph0Var2 = mh0Var4.H;
                                            try {
                                                if (mh0Var4.n.link != null) {
                                                    Context context2 = mh0Var4.getContext();
                                                    String str2 = mh0Var4.n.link;
                                                    ph0Var2.showDialog(new lh0(mh0Var4, context2, str2, str2, ph0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 3:
                                            mh0 mh0Var5 = mh0Var;
                                            ph0 ph0Var3 = mh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = mh0Var5.n;
                                            nb0 nb0Var = new nb0(1, ph0Var3.n);
                                            nb0Var.Q = ph0Var3.p0;
                                            nb0Var.Y(tL_chatInviteExported2);
                                            ph0Var3.presentFragment(nb0Var);
                                            break;
                                        default:
                                            final mh0 mh0Var6 = mh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = mh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(mh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.kh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            mh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            mh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            kh.a2.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i15 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c10 = 1 == true ? 1 : 0;
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.jh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c10) {
                                        case 0:
                                            final mh0 mh0Var2 = mh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = mh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(mh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.kh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            mh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            mh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            kh.a2.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            mh0 mh0Var3 = mh0Var;
                                            try {
                                                if (mh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(mh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            mh0 mh0Var4 = mh0Var;
                                            ph0 ph0Var2 = mh0Var4.H;
                                            try {
                                                if (mh0Var4.n.link != null) {
                                                    Context context2 = mh0Var4.getContext();
                                                    String str2 = mh0Var4.n.link;
                                                    ph0Var2.showDialog(new lh0(mh0Var4, context2, str2, str2, ph0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 3:
                                            mh0 mh0Var5 = mh0Var;
                                            ph0 ph0Var3 = mh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = mh0Var5.n;
                                            nb0 nb0Var = new nb0(1, ph0Var3.n);
                                            nb0Var.Q = ph0Var3.p0;
                                            nb0Var.Y(tL_chatInviteExported2);
                                            ph0Var3.presentFragment(nb0Var);
                                            break;
                                        default:
                                            final mh0 mh0Var6 = mh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = mh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(mh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.kh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            mh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            mh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            kh.a2.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.jh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final mh0 mh0Var2 = mh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = mh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(mh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.kh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            mh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            mh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            kh.a2.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            mh0 mh0Var3 = mh0Var;
                                            try {
                                                if (mh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(mh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            mh0 mh0Var4 = mh0Var;
                                            ph0 ph0Var2 = mh0Var4.H;
                                            try {
                                                if (mh0Var4.n.link != null) {
                                                    Context context2 = mh0Var4.getContext();
                                                    String str2 = mh0Var4.n.link;
                                                    ph0Var2.showDialog(new lh0(mh0Var4, context2, str2, str2, ph0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 3:
                                            mh0 mh0Var5 = mh0Var;
                                            ph0 ph0Var3 = mh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = mh0Var5.n;
                                            nb0 nb0Var = new nb0(1, ph0Var3.n);
                                            nb0Var.Q = ph0Var3.p0;
                                            nb0Var.Y(tL_chatInviteExported2);
                                            ph0Var3.presentFragment(nb0Var);
                                            break;
                                        default:
                                            final mh0 mh0Var6 = mh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = mh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(mh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.kh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            mh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            mh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            kh.a2.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.jh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final mh0 mh0Var2 = mh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = mh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(mh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.kh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            mh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            mh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            kh.a2.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            mh0 mh0Var3 = mh0Var;
                                            try {
                                                if (mh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(mh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            mh0 mh0Var4 = mh0Var;
                                            ph0 ph0Var2 = mh0Var4.H;
                                            try {
                                                if (mh0Var4.n.link != null) {
                                                    Context context2 = mh0Var4.getContext();
                                                    String str2 = mh0Var4.n.link;
                                                    ph0Var2.showDialog(new lh0(mh0Var4, context2, str2, str2, ph0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 3:
                                            mh0 mh0Var5 = mh0Var;
                                            ph0 ph0Var3 = mh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = mh0Var5.n;
                                            nb0 nb0Var = new nb0(1, ph0Var3.n);
                                            nb0Var.Q = ph0Var3.p0;
                                            nb0Var.Y(tL_chatInviteExported2);
                                            ph0Var3.presentFragment(nb0Var);
                                            break;
                                        default:
                                            final mh0 mh0Var6 = mh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = mh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(mh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.kh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            mh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            mh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            kh.a2.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !mh0Var.n.permanent && ph0Var.m0);
                            F.m(ph0Var.m0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.jh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final mh0 mh0Var2 = mh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = mh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(mh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.kh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            mh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            mh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            kh.a2.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            mh0 mh0Var3 = mh0Var;
                                            try {
                                                if (mh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", mh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(mh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            mh0 mh0Var4 = mh0Var;
                                            ph0 ph0Var2 = mh0Var4.H;
                                            try {
                                                if (mh0Var4.n.link != null) {
                                                    Context context2 = mh0Var4.getContext();
                                                    String str2 = mh0Var4.n.link;
                                                    ph0Var2.showDialog(new lh0(mh0Var4, context2, str2, str2, ph0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 3:
                                            mh0 mh0Var5 = mh0Var;
                                            ph0 ph0Var3 = mh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = mh0Var5.n;
                                            nb0 nb0Var = new nb0(1, ph0Var3.n);
                                            nb0Var.Q = ph0Var3.p0;
                                            nb0Var.Y(tL_chatInviteExported2);
                                            ph0Var3.presentFragment(nb0Var);
                                            break;
                                        default:
                                            final mh0 mh0Var6 = mh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = mh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(mh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.kh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            mh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            mh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            kh.a2.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(ph0Var.b.V0(mh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                aj0 aj0Var = (aj0) this.b;
                long j10 = aj0Var.b;
                if (!aj0Var.n.isStory()) {
                    if (aj0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) aj0Var.getParentLayout().getFragmentStack().get(aj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((p2Var instanceof xn) && ((xn) p2Var).e.id == j10) {
                            aj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle g10 = kh.a2.g(j10, "chat_id");
                    g10.putInt("message_id", aj0Var.c);
                    g10.putBoolean("need_remove_previous_same_chat_activity", false);
                    aj0Var.presentFragment(new xn(g10));
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
                gl0 gl0Var = (gl0) this.b;
                if (!gl0Var.a.getAnimatedDrawable().i0) {
                    gl0Var.a.getAnimatedDrawable().L(0, false, false);
                    gl0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 16:
                zm0 zm0Var = (zm0) this.b;
                if (!zm0Var.G) {
                    int i17 = zm0Var.J;
                    if ((i17 != 4 || zm0Var.I != 2) && i17 != 0) {
                        zm0Var.t();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + zm0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + zm0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + zm0Var.H);
                            zm0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.z4.u0(zm0Var.N, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                ((bp0) this.b).g0.w0();
                break;
            case 18:
                pp0 pp0Var = (pp0) this.b;
                xn xnVar = pp0Var.C;
                if (xnVar != null && xnVar.c()) {
                    org.telegram.ui.Components.z4.L(pp0Var.getParentActivity(), xnVar.a(), new hp0(pp0Var, i14));
                    break;
                } else {
                    pp0Var.V(pp0Var.b, pp0Var.c, true, 0);
                    pp0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                fq0 fq0Var = (fq0) this.b;
                xn xnVar2 = fq0Var.R;
                if (xnVar2 != null && xnVar2.c()) {
                    org.telegram.ui.Components.z4.L(fq0Var.getParentActivity(), xnVar2.a(), new tp0(fq0Var, i14));
                    break;
                } else {
                    fq0Var.e0(0, true);
                    break;
                }
                break;
            case 20:
                tt0 tt0Var = (tt0) this.b;
                if (tt0Var != null) {
                    tt0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 21:
                cu0 cu0Var = (cu0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = cu0Var.d;
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
                fv0 fv0Var = (fv0) this.b;
                boolean[] zArr = fv0Var.w;
                CharSequence[] charSequenceArr = fv0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view.getParent();
                    f2.l1 G = fv0Var.c.G(c6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - fv0Var.k0;
                        if (fv0Var.F && i18 < fv0Var.x) {
                            int i19 = -fv0Var.L;
                            fv0Var.L = i19;
                            AndroidUtilities.shakeViewSpring(c6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            fv0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = fv0Var.y - 1;
                            fv0Var.y = i21;
                            if (fv0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = fv0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                fv0Var.r = iArr;
                            }
                            if (fv0Var.y == charSequenceArr.length - 1) {
                                fv0Var.b.o((fv0Var.k0 + charSequenceArr.length) - 1);
                            }
                            f2.l1 K = fv0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = c6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    fv0Var.i0();
                                    fv0Var.r0();
                                    qy0Var = fv0Var.N;
                                    if (qy0Var != null) {
                                        qy0Var.f();
                                        fv0Var.N.setDelegate(null);
                                    }
                                    fv0Var.b.m(fv0Var.m0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                fv0Var.k0(true);
                            } else if (fv0Var.y0) {
                                fv0Var.k0(true);
                            }
                            textView.clearFocus();
                            fv0Var.i0();
                            fv0Var.r0();
                            qy0Var = fv0Var.N;
                            if (qy0Var != null) {
                            }
                            fv0Var.b.m(fv0Var.m0);
                        }
                    }
                }
                break;
            case 23:
                ((rv0) this.b).c(true);
                break;
            case 24:
                ((rv0) ((gg.u) this.b).c).c(true);
                break;
            case 25:
                PrivacyControlActivity privacyControlActivity = ((ex0) this.b).d;
                privacyControlActivity.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) privacyControlActivity, 27, false));
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
                o11 o11Var = (o11) this.b;
                o11Var.s.presentFragment(new w11(o11Var.d));
                break;
            case 28:
                l21 l21Var = (l21) this.b;
                ValueAnimator valueAnimator = l21Var.K;
                if (valueAnimator == null) {
                    boolean z10 = !l21Var.J;
                    m21 m21Var = l21Var.d;
                    j21 j21Var = l21Var.C;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) m21Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) l21Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    j21Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    j21Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    j21Var.getLocationInWindow(iArr2);
                    float f10 = iArr2[0];
                    float f11 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    l21Var.L = new org.telegram.ui.Components.uo(l21Var, m21Var.getParentActivity(), z10, canvas, (j21Var.getMeasuredWidth() / 2.0f) + f10, (j21Var.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f10, f11, 1);
                    l21Var.M = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    l21Var.K = ofFloat;
                    ofFloat.addUpdateListener(new h11(l21Var, i12));
                    l21Var.K.addListener(new ls0(l21Var, 15));
                    l21Var.K.setDuration(400L);
                    l21Var.K.setInterpolator(org.telegram.ui.Components.gt.e);
                    l21Var.K.start();
                    frameLayout2.addView(l21Var.L, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kv0(9, l21Var, z10));
                    break;
                }
                break;
            default:
                j31 j31Var = (j31) this.b;
                ph.d dVar = j31Var.s;
                if (dVar.T && !dVar.K) {
                    dVar.setLoading(true);
                    k31.G(j31Var.v, ((TextView) j31Var.h.c).getText(), j31Var.d.option, j31Var.n.getText().toString());
                    break;
                }
                break;
        }
    }
}
