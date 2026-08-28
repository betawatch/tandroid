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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q50 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q50(Object obj, int i9) {
        this.a = i9;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0291  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        int b10;
        org.telegram.ui.Components.ux0 ux0Var;
        int i9 = 19;
        final int i10 = 4;
        int i11 = 27;
        final int i12 = 3;
        final int i13 = 2;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.dp dpVar = (org.telegram.ui.Components.dp) this.b;
                dpVar.a(!dpVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", dpVar.a.q).apply();
                break;
            case 1:
                ((v50) this.b).b.T0(19);
                break;
            case 2:
                k60 k60Var = ((i60) this.b).E;
                k60Var.T = null;
                k60Var.V.b();
                k60Var.h.b();
                k60Var.j0();
                k60Var.q0();
                break;
            case 3:
                z60.Z(((x60) this.b).d, null);
                break;
            case 4:
                q70.U((q70) this.b);
                break;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) this.b;
                ArrayList arrayList = launchActivity.A0;
                launchActivity.D0 = null;
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
                final je0 je0Var = (je0) this.b;
                fg0 fg0Var = je0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fg0Var.getParentActivity());
                alertDialog$Builder.a.N = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.P = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ie0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i15) {
                        switch (i14) {
                            case 0:
                                je0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                je0 je0Var2 = je0Var;
                                fg0.m0(je0Var2.y, je0Var2.r, je0Var2.s, je0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c10 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ie0
                    @Override // org.telegram.ui.ActionBar.b2
                    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i15) {
                        switch (c10) {
                            case 0:
                                je0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                je0 je0Var2 = je0Var;
                                fg0.m0(je0Var2.y, je0Var2.r, je0Var2.s, je0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = fg0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                re0 re0Var = (re0) this.b;
                fg0 fg0Var2 = re0Var.A;
                if (fg0Var2.R.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(fg0Var2.getParentActivity());
                    alertDialog$Builder2.a.N = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.P = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new wt(re0Var, i9));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    fg0Var2.showDialog(alertDialog$Builder2.a);
                    break;
                }
                break;
            case 8:
                ue0 ue0Var = (ue0) this.b;
                NotificationCenter.getGlobalInstance().addObserver(new te0(ue0Var), NotificationCenter.onActivityResultReceived);
                Context context = ue0Var.getContext();
                HashSet hashSet = new HashSet();
                HashMap hashMap = new HashMap();
                String str = BuildVars.GOOGLE_AUTH_CLIENT_ID;
                x5.l.f(str);
                hashSet.add(GoogleSignInOptions.w);
                if (hashSet.contains(GoogleSignInOptions.A)) {
                    Scope scope = GoogleSignInOptions.y;
                    if (hashSet.contains(scope)) {
                        hashSet.remove(scope);
                    }
                }
                hashSet.add(GoogleSignInOptions.x);
                com.google.android.gms.internal.clearcut.v0 a2 = f7.s8.a(context, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                a2.g().addOnCompleteListener(new yr(i11, ue0Var, a2));
                break;
            case 9:
                final eh0 eh0Var = (eh0) this.b;
                hh0 hh0Var = eh0Var.G;
                if (eh0Var.n != null) {
                    View view2 = hh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.x60 F = org.telegram.ui.Components.x60.F((ViewGroup) view2, null, eh0Var);
                        if (eh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.bh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final eh0 eh0Var2 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = eh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(eh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            eh0Var2.G.d0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            eh0Var2.G.a0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            j3.r0.v(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            eh0 eh0Var3 = eh0Var;
                                            try {
                                                if (eh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", eh0Var3.n.link));
                                                    org.telegram.ui.Components.oc.j(eh0Var3.G).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 2:
                                            eh0 eh0Var4 = eh0Var;
                                            hh0 hh0Var2 = eh0Var4.G;
                                            try {
                                                if (eh0Var4.n.link != null) {
                                                    Context context2 = eh0Var4.getContext();
                                                    String str2 = eh0Var4.n.link;
                                                    hh0Var2.showDialog(new dh0(eh0Var4, context2, str2, str2, hh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                                return;
                                            }
                                        case 3:
                                            eh0 eh0Var5 = eh0Var;
                                            hh0 hh0Var3 = eh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = eh0Var5.n;
                                            bb0 bb0Var = new bb0(1, hh0Var3.n);
                                            bb0Var.P = hh0Var3.o0;
                                            bb0Var.X(tL_chatInviteExported2);
                                            hh0Var3.presentFragment(bb0Var);
                                            break;
                                        default:
                                            final eh0 eh0Var6 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = eh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            eh0Var6.G.d0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            eh0Var6.G.a0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            j3.r0.v(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i15 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c11 = 1 == true ? 1 : 0;
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.bh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c11) {
                                        case 0:
                                            final eh0 eh0Var2 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = eh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(eh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            eh0Var2.G.d0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            eh0Var2.G.a0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            j3.r0.v(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            eh0 eh0Var3 = eh0Var;
                                            try {
                                                if (eh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", eh0Var3.n.link));
                                                    org.telegram.ui.Components.oc.j(eh0Var3.G).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 2:
                                            eh0 eh0Var4 = eh0Var;
                                            hh0 hh0Var2 = eh0Var4.G;
                                            try {
                                                if (eh0Var4.n.link != null) {
                                                    Context context2 = eh0Var4.getContext();
                                                    String str2 = eh0Var4.n.link;
                                                    hh0Var2.showDialog(new dh0(eh0Var4, context2, str2, str2, hh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                                return;
                                            }
                                        case 3:
                                            eh0 eh0Var5 = eh0Var;
                                            hh0 hh0Var3 = eh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = eh0Var5.n;
                                            bb0 bb0Var = new bb0(1, hh0Var3.n);
                                            bb0Var.P = hh0Var3.o0;
                                            bb0Var.X(tL_chatInviteExported2);
                                            hh0Var3.presentFragment(bb0Var);
                                            break;
                                        default:
                                            final eh0 eh0Var6 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = eh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            eh0Var6.G.d0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            eh0Var6.G.a0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            j3.r0.v(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.bh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final eh0 eh0Var2 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = eh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(eh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            eh0Var2.G.d0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            eh0Var2.G.a0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            j3.r0.v(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            eh0 eh0Var3 = eh0Var;
                                            try {
                                                if (eh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", eh0Var3.n.link));
                                                    org.telegram.ui.Components.oc.j(eh0Var3.G).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 2:
                                            eh0 eh0Var4 = eh0Var;
                                            hh0 hh0Var2 = eh0Var4.G;
                                            try {
                                                if (eh0Var4.n.link != null) {
                                                    Context context2 = eh0Var4.getContext();
                                                    String str2 = eh0Var4.n.link;
                                                    hh0Var2.showDialog(new dh0(eh0Var4, context2, str2, str2, hh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                                return;
                                            }
                                        case 3:
                                            eh0 eh0Var5 = eh0Var;
                                            hh0 hh0Var3 = eh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = eh0Var5.n;
                                            bb0 bb0Var = new bb0(1, hh0Var3.n);
                                            bb0Var.P = hh0Var3.o0;
                                            bb0Var.X(tL_chatInviteExported2);
                                            hh0Var3.presentFragment(bb0Var);
                                            break;
                                        default:
                                            final eh0 eh0Var6 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = eh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            eh0Var6.G.d0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            eh0Var6.G.a0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            j3.r0.v(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.bh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final eh0 eh0Var2 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = eh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(eh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            eh0Var2.G.d0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            eh0Var2.G.a0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            j3.r0.v(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            eh0 eh0Var3 = eh0Var;
                                            try {
                                                if (eh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", eh0Var3.n.link));
                                                    org.telegram.ui.Components.oc.j(eh0Var3.G).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 2:
                                            eh0 eh0Var4 = eh0Var;
                                            hh0 hh0Var2 = eh0Var4.G;
                                            try {
                                                if (eh0Var4.n.link != null) {
                                                    Context context2 = eh0Var4.getContext();
                                                    String str2 = eh0Var4.n.link;
                                                    hh0Var2.showDialog(new dh0(eh0Var4, context2, str2, str2, hh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                                return;
                                            }
                                        case 3:
                                            eh0 eh0Var5 = eh0Var;
                                            hh0 hh0Var3 = eh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = eh0Var5.n;
                                            bb0 bb0Var = new bb0(1, hh0Var3.n);
                                            bb0Var.P = hh0Var3.o0;
                                            bb0Var.X(tL_chatInviteExported2);
                                            hh0Var3.presentFragment(bb0Var);
                                            break;
                                        default:
                                            final eh0 eh0Var6 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = eh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            eh0Var6.G.d0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            eh0Var6.G.a0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            j3.r0.v(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !eh0Var.n.permanent && hh0Var.l0);
                            F.m(hh0Var.l0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.bh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i10) {
                                        case 0:
                                            final eh0 eh0Var2 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = eh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(eh0Var2.G.getParentActivity());
                                            alertDialog$Builder3.a.N = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.P = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            eh0Var2.G.d0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            eh0Var2.G.a0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            j3.r0.v(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            eh0 eh0Var3 = eh0Var;
                                            try {
                                                if (eh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", eh0Var3.n.link));
                                                    org.telegram.ui.Components.oc.j(eh0Var3.G).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e10) {
                                                FileLog.e(e10);
                                                return;
                                            }
                                        case 2:
                                            eh0 eh0Var4 = eh0Var;
                                            hh0 hh0Var2 = eh0Var4.G;
                                            try {
                                                if (eh0Var4.n.link != null) {
                                                    Context context2 = eh0Var4.getContext();
                                                    String str2 = eh0Var4.n.link;
                                                    hh0Var2.showDialog(new dh0(eh0Var4, context2, str2, str2, hh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e11) {
                                                FileLog.e(e11);
                                                return;
                                            }
                                        case 3:
                                            eh0 eh0Var5 = eh0Var;
                                            hh0 hh0Var3 = eh0Var5.G;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = eh0Var5.n;
                                            bb0 bb0Var = new bb0(1, hh0Var3.n);
                                            bb0Var.P = hh0Var3.o0;
                                            bb0Var.X(tL_chatInviteExported2);
                                            hh0Var3.presentFragment(bb0Var);
                                            break;
                                        default:
                                            final eh0 eh0Var6 = eh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = eh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(eh0Var6.G.getParentActivity());
                                            alertDialog$Builder4.a.P = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.N = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.b2() { // from class: org.telegram.ui.ch0
                                                @Override // org.telegram.ui.ActionBar.b2
                                                public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            eh0Var6.G.d0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            eh0Var6.G.a0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            j3.r0.v(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(hh0Var.b.V0(eh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                ti0 ti0Var = (ti0) this.b;
                long j10 = ti0Var.b;
                if (!ti0Var.n.isStory()) {
                    if (ti0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) ti0Var.getParentLayout().getFragmentStack().get(ti0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((o2Var instanceof qn) && ((qn) o2Var).e.id == j10) {
                            ti0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle g10 = e2.c.g(j10, "chat_id");
                    g10.putInt("message_id", ti0Var.c);
                    g10.putBoolean("need_remove_previous_same_chat_activity", false);
                    ti0Var.presentFragment(new qn(g10));
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Cells.t8) this.b).setChecked(!r1.e.h);
                break;
            case 12:
                Context context2 = (Context) this.b;
                Pattern pattern = org.telegram.ui.Components.y4.a;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2);
                alertDialog$Builder3.a.N = LocaleController.getString(R.string.ForgotPasscode);
                alertDialog$Builder3.a.P = LocaleController.getString(R.string.ForgotPasscodeInfo);
                alertDialog$Builder3.k(LocaleController.getString(R.string.Close), null);
                alertDialog$Builder3.a.show();
                break;
            case 13:
                PasscodeActivity passcodeActivity = (PasscodeActivity) this.b;
                int i16 = passcodeActivity.x;
                if (i16 != 1) {
                    if (i16 == 2) {
                        passcodeActivity.f0();
                        break;
                    }
                } else if (passcodeActivity.A != 0) {
                    passcodeActivity.f0();
                    break;
                } else {
                    passcodeActivity.g0();
                    break;
                }
                break;
            case 14:
                bl0 bl0Var = (bl0) this.b;
                if (!bl0Var.a.getAnimatedDrawable().h0) {
                    bl0Var.a.getAnimatedDrawable().L(0, false, false);
                    bl0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Y(view);
                break;
            case 16:
                sm0 sm0Var = (sm0) this.b;
                if (!sm0Var.F) {
                    int i17 = sm0Var.I;
                    if ((i17 != 4 || sm0Var.H != 2) && i17 != 0) {
                        sm0Var.t();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + sm0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + sm0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + sm0Var.G);
                            sm0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.y4.u0(sm0Var.M, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                ((uo0) this.b).f0.v0();
                break;
            case 18:
                ip0 ip0Var = (ip0) this.b;
                qn qnVar = ip0Var.B;
                if (qnVar != null && qnVar.c()) {
                    org.telegram.ui.Components.y4.L(ip0Var.getParentActivity(), qnVar.a(), new ap0(ip0Var, i14));
                    break;
                } else {
                    ip0Var.U(ip0Var.b, ip0Var.c, true, 0);
                    ip0Var.finishFragment();
                    break;
                }
                break;
            case 19:
                zp0 zp0Var = (zp0) this.b;
                qn qnVar2 = zp0Var.Q;
                if (qnVar2 != null && qnVar2.c()) {
                    org.telegram.ui.Components.y4.L(zp0Var.getParentActivity(), qnVar2.a(), new mp0(zp0Var, i14));
                    break;
                } else {
                    zp0Var.d0(0, true);
                    break;
                }
                break;
            case 20:
                mt0 mt0Var = (mt0) this.b;
                if (mt0Var != null) {
                    mt0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 21:
                ut0 ut0Var = (ut0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = ut0Var.d;
                int indexOf = photoViewer.c7.indexOf(tag);
                if (indexOf < 0) {
                    int Q = photoViewer.d.Q(tag);
                    if (Q >= 0) {
                        photoViewer.l1.u(Q);
                        if (Q == 0) {
                            photoViewer.l1.m(0);
                        }
                        photoViewer.A3();
                        break;
                    }
                } else {
                    int k10 = photoViewer.d.k(indexOf, photoViewer.n1());
                    boolean x10 = photoViewer.d.x(indexOf);
                    if (indexOf == photoViewer.L4) {
                        photoViewer.J0.b(x10, true);
                    }
                    if (k10 >= 0) {
                        photoViewer.l1.u(k10);
                        if (k10 == 0) {
                            photoViewer.l1.m(0);
                        }
                    }
                    photoViewer.A3();
                    break;
                }
                break;
            case 22:
                xu0 xu0Var = (xu0) this.b;
                boolean[] zArr = xu0Var.w;
                CharSequence[] charSequenceArr = xu0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.c6 c6Var = (org.telegram.ui.Cells.c6) view.getParent();
                    f2.q1 G = xu0Var.c.G(c6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - xu0Var.j0;
                        if (xu0Var.E && i18 < xu0Var.x) {
                            int i19 = -xu0Var.K;
                            xu0Var.K = i19;
                            AndroidUtilities.shakeViewSpring(c6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            xu0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = xu0Var.y - 1;
                            xu0Var.y = i21;
                            if (xu0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = xu0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                xu0Var.r = iArr;
                            }
                            if (xu0Var.y == charSequenceArr.length - 1) {
                                xu0Var.b.o((xu0Var.j0 + charSequenceArr.length) - 1);
                            }
                            f2.q1 K = xu0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = c6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.c6) {
                                    ((org.telegram.ui.Cells.c6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    xu0Var.h0();
                                    xu0Var.q0();
                                    ux0Var = xu0Var.M;
                                    if (ux0Var != null) {
                                        ux0Var.f();
                                        xu0Var.M.setDelegate(null);
                                    }
                                    xu0Var.b.m(xu0Var.l0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                xu0Var.j0(true);
                            } else if (xu0Var.x0) {
                                xu0Var.j0(true);
                            }
                            textView.clearFocus();
                            xu0Var.h0();
                            xu0Var.q0();
                            ux0Var = xu0Var.M;
                            if (ux0Var != null) {
                            }
                            xu0Var.b.m(xu0Var.l0);
                        }
                    }
                }
                break;
            case 23:
                ((iv0) this.b).c(true);
                break;
            case 24:
                ((iv0) ((bg.x) this.b).c).c(true);
                break;
            case 25:
                PrivacyControlActivity privacyControlActivity = ((uw0) this.b).d;
                privacyControlActivity.showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) privacyControlActivity, 27, false));
                break;
            case 26:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                int intValue = ((Integer) z1Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.V;
                boolean z10 = !zArr2[intValue];
                zArr2[intValue] = z10;
                z1Var.c(z10, true);
                break;
            case 27:
                c11 c11Var = (c11) this.b;
                ProxyListActivity proxyListActivity = c11Var.s;
                SharedConfig.ProxyInfo proxyInfo = c11Var.d;
                k11 k11Var = new k11(null);
                k11Var.e = new org.telegram.ui.Cells.z6[3];
                k11Var.f = new org.telegram.ui.Cells.b9[2];
                k11Var.s = new org.telegram.ui.Cells.j6[2];
                k11Var.v = -1;
                k11Var.w = -1;
                k11Var.A = 1.0f;
                k11Var.B = new float[2];
                k11Var.C = true;
                k11Var.I = new d11(k11Var);
                k11Var.G = proxyInfo;
                proxyListActivity.presentFragment(k11Var);
                break;
            case 28:
                y11 y11Var = (y11) this.b;
                ValueAnimator valueAnimator = y11Var.J;
                if (valueAnimator == null) {
                    boolean z11 = !y11Var.I;
                    z11 z11Var = y11Var.d;
                    w11 w11Var = y11Var.B;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) z11Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) y11Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    w11Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    w11Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    w11Var.getLocationInWindow(iArr2);
                    float f10 = iArr2[0];
                    float f11 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    y11Var.K = new kh.eb(y11Var, z11Var.getParentActivity(), z11, canvas, (w11Var.getMeasuredWidth() / 2.0f) + f10, (w11Var.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f10, f11, 2);
                    y11Var.L = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    y11Var.J = ofFloat;
                    ofFloat.addUpdateListener(new v01(y11Var, i12));
                    y11Var.J.addListener(new bc0(y11Var, 22));
                    y11Var.J.setDuration(400L);
                    y11Var.J.setInterpolator(org.telegram.ui.Components.xs.e);
                    y11Var.J.start();
                    frameLayout2.addView(y11Var.K, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a50(15, y11Var, z11));
                    break;
                }
                break;
            default:
                x21 x21Var = (x21) this.b;
                kh.d dVar = x21Var.s;
                if (dVar.S && !dVar.J) {
                    dVar.setLoading(true);
                    y21.G(x21Var.v, ((TextView) x21Var.h.c).getText(), x21Var.d.option, x21Var.n.getText().toString());
                    break;
                }
                break;
        }
    }
}
