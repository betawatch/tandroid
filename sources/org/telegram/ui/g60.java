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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class g60 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g60(Object obj, int i10) {
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
        org.telegram.ui.Components.qy0 qy0Var;
        int i10 = 19;
        final int i11 = 4;
        final int i12 = 3;
        final int i13 = 2;
        final int i14 = 0;
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.kp kpVar = (org.telegram.ui.Components.kp) this.b;
                kpVar.a(!kpVar.a.q, true);
                MessagesController.getGlobalMainSettings().edit().putBoolean("callmiconstart", kpVar.a.q).apply();
                break;
            case 1:
                ((m60) this.b).b.T0(19);
                break;
            case 2:
                a70 a70Var = ((y60) this.b).F;
                a70Var.U = null;
                a70Var.W.b();
                a70Var.h.b();
                a70Var.k0();
                a70Var.r0();
                break;
            case 3:
                o70.a0(((m70) this.b).d, null);
                break;
            case 4:
                e80.V((e80) this.b);
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
                final ue0 ue0Var = (ue0) this.b;
                pg0 pg0Var = ue0Var.y;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(pg0Var.getParentActivity());
                alertDialog$Builder.a.O = LocaleController.getString("RestorePasswordNoEmailTitle", R.string.RestorePasswordNoEmailTitle);
                alertDialog$Builder.a.Q = LocaleController.getString("RestoreEmailTroubleText", R.string.RestoreEmailTroubleText);
                alertDialog$Builder.k(LocaleController.getString(R.string.OK), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.te0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i15) {
                        switch (i14) {
                            case 0:
                                ue0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ue0 ue0Var2 = ue0Var;
                                pg0.n0(ue0Var2.y, ue0Var2.r, ue0Var2.s, ue0Var2.v);
                                break;
                        }
                    }
                });
                String string = LocaleController.getString(R.string.ResetAccount);
                final char c3 = 1 == true ? 1 : 0;
                alertDialog$Builder.h(string, new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.te0
                    @Override // org.telegram.ui.ActionBar.c2
                    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i15) {
                        switch (c3) {
                            case 0:
                                ue0Var.y.u1(6, true, new Bundle(), true);
                                break;
                            default:
                                ue0 ue0Var2 = ue0Var;
                                pg0.n0(ue0Var2.y, ue0Var2.r, ue0Var2.s, ue0Var2.v);
                                break;
                        }
                    }
                });
                Dialog showDialog = pg0Var.showDialog(alertDialog$Builder.a);
                if (showDialog != null) {
                    showDialog.setCanceledOnTouchOutside(false);
                    showDialog.setCancelable(false);
                    break;
                }
                break;
            case 7:
                cf0 cf0Var = (cf0) this.b;
                pg0 pg0Var2 = cf0Var.B;
                if (pg0Var2.S.getTag() == null) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(pg0Var2.getParentActivity());
                    alertDialog$Builder2.a.O = LocaleController.getString("ResetMyAccountWarning", R.string.ResetMyAccountWarning);
                    alertDialog$Builder2.a.Q = LocaleController.getString("ResetMyAccountWarningText", R.string.ResetMyAccountWarningText);
                    alertDialog$Builder2.k(LocaleController.getString("ResetMyAccountWarningReset", R.string.ResetMyAccountWarningReset), new hu(cf0Var, i10));
                    alertDialog$Builder2.h(LocaleController.getString("Cancel", R.string.Cancel), null);
                    pg0Var2.showDialog(alertDialog$Builder2.a);
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
                a2.g().addOnCompleteListener(new ss(26, ff0Var, a2));
                break;
            case 9:
                final oh0 oh0Var = (oh0) this.b;
                rh0 rh0Var = oh0Var.H;
                if (oh0Var.n != null) {
                    View view2 = rh0Var.fragmentView;
                    if (view2 instanceof ViewGroup) {
                        org.telegram.ui.Components.p70 F = org.telegram.ui.Components.p70.F((ViewGroup) view2, null, oh0Var);
                        if (oh0Var.n.revoked) {
                            F.c(R.drawable.msg_delete, LocaleController.getString(R.string.Delete), new Runnable() { // from class: org.telegram.ui.lh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            final oh0 oh0Var2 = oh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = oh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(oh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i15 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.mh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i16) {
                                                    switch (i15) {
                                                        case 0:
                                                            oh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            oh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            kf.k0.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            oh0 oh0Var3 = oh0Var;
                                            try {
                                                if (oh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", oh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(oh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            oh0 oh0Var4 = oh0Var;
                                            rh0 rh0Var2 = oh0Var4.H;
                                            try {
                                                if (oh0Var4.n.link != null) {
                                                    Context context2 = oh0Var4.getContext();
                                                    String str2 = oh0Var4.n.link;
                                                    rh0Var2.showDialog(new nh0(oh0Var4, context2, str2, str2, rh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 3:
                                            oh0 oh0Var5 = oh0Var;
                                            rh0 rh0Var3 = oh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = oh0Var5.n;
                                            pb0 pb0Var = new pb0(1, rh0Var3.n);
                                            pb0Var.Q = rh0Var3.p0;
                                            pb0Var.Y(tL_chatInviteExported2);
                                            rh0Var3.presentFragment(pb0Var);
                                            break;
                                        default:
                                            final oh0 oh0Var6 = oh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = oh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(oh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.mh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            oh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            oh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            kf.k0.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, true);
                        } else {
                            int i15 = R.drawable.msg_copy;
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            final char c10 = 1 == true ? 1 : 0;
                            F.c(i15, string2, new Runnable() { // from class: org.telegram.ui.lh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (c10) {
                                        case 0:
                                            final oh0 oh0Var2 = oh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = oh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(oh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.mh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            oh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            oh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            kf.k0.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            oh0 oh0Var3 = oh0Var;
                                            try {
                                                if (oh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", oh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(oh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            oh0 oh0Var4 = oh0Var;
                                            rh0 rh0Var2 = oh0Var4.H;
                                            try {
                                                if (oh0Var4.n.link != null) {
                                                    Context context2 = oh0Var4.getContext();
                                                    String str2 = oh0Var4.n.link;
                                                    rh0Var2.showDialog(new nh0(oh0Var4, context2, str2, str2, rh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 3:
                                            oh0 oh0Var5 = oh0Var;
                                            rh0 rh0Var3 = oh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = oh0Var5.n;
                                            pb0 pb0Var = new pb0(1, rh0Var3.n);
                                            pb0Var.Q = rh0Var3.p0;
                                            pb0Var.Y(tL_chatInviteExported2);
                                            rh0Var3.presentFragment(pb0Var);
                                            break;
                                        default:
                                            final oh0 oh0Var6 = oh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = oh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(oh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.mh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            oh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            oh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            kf.k0.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.c(R.drawable.msg_share, LocaleController.getString(R.string.ShareLink), new Runnable() { // from class: org.telegram.ui.lh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            final oh0 oh0Var2 = oh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = oh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(oh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.mh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            oh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            oh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            kf.k0.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            oh0 oh0Var3 = oh0Var;
                                            try {
                                                if (oh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", oh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(oh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            oh0 oh0Var4 = oh0Var;
                                            rh0 rh0Var2 = oh0Var4.H;
                                            try {
                                                if (oh0Var4.n.link != null) {
                                                    Context context2 = oh0Var4.getContext();
                                                    String str2 = oh0Var4.n.link;
                                                    rh0Var2.showDialog(new nh0(oh0Var4, context2, str2, str2, rh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 3:
                                            oh0 oh0Var5 = oh0Var;
                                            rh0 rh0Var3 = oh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = oh0Var5.n;
                                            pb0 pb0Var = new pb0(1, rh0Var3.n);
                                            pb0Var.Q = rh0Var3.p0;
                                            pb0Var.Y(tL_chatInviteExported2);
                                            rh0Var3.presentFragment(pb0Var);
                                            break;
                                        default:
                                            final oh0 oh0Var6 = oh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = oh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(oh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.mh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            oh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            oh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            kf.k0.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, false);
                            F.l(R.drawable.msg_edit, LocaleController.getString(R.string.EditLink), new Runnable() { // from class: org.telegram.ui.lh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i12) {
                                        case 0:
                                            final oh0 oh0Var2 = oh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = oh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(oh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.mh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            oh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            oh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            kf.k0.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            oh0 oh0Var3 = oh0Var;
                                            try {
                                                if (oh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", oh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(oh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            oh0 oh0Var4 = oh0Var;
                                            rh0 rh0Var2 = oh0Var4.H;
                                            try {
                                                if (oh0Var4.n.link != null) {
                                                    Context context2 = oh0Var4.getContext();
                                                    String str2 = oh0Var4.n.link;
                                                    rh0Var2.showDialog(new nh0(oh0Var4, context2, str2, str2, rh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 3:
                                            oh0 oh0Var5 = oh0Var;
                                            rh0 rh0Var3 = oh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = oh0Var5.n;
                                            pb0 pb0Var = new pb0(1, rh0Var3.n);
                                            pb0Var.Q = rh0Var3.p0;
                                            pb0Var.Y(tL_chatInviteExported2);
                                            rh0Var3.presentFragment(pb0Var);
                                            break;
                                        default:
                                            final oh0 oh0Var6 = oh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = oh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(oh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.mh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            oh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            oh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            kf.k0.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            }, !oh0Var.n.permanent && rh0Var.m0);
                            F.m(rh0Var.m0, R.drawable.msg_delete, LocaleController.getString(R.string.RevokeLink), true, new Runnable() { // from class: org.telegram.ui.lh0
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i11) {
                                        case 0:
                                            final oh0 oh0Var2 = oh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported = oh0Var2.n;
                                            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(oh0Var2.H.getParentActivity());
                                            alertDialog$Builder3.a.O = LocaleController.getString(R.string.DeleteLink);
                                            alertDialog$Builder3.a.Q = LocaleController.getString(R.string.DeleteLinkHelp);
                                            final int i152 = 1;
                                            alertDialog$Builder3.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.mh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i152) {
                                                        case 0:
                                                            oh0Var2.H.e0(tL_chatInviteExported);
                                                            break;
                                                        default:
                                                            oh0Var2.H.b0(tL_chatInviteExported);
                                                            break;
                                                    }
                                                }
                                            });
                                            kf.k0.u(R.string.Cancel, alertDialog$Builder3, null);
                                            break;
                                        case 1:
                                            oh0 oh0Var3 = oh0Var;
                                            try {
                                                if (oh0Var3.n.link != null) {
                                                    ((ClipboardManager) ApplicationLoader.applicationContext.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", oh0Var3.n.link));
                                                    org.telegram.ui.Components.qc.j(oh0Var3.H).j();
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e) {
                                                FileLog.e(e);
                                                return;
                                            }
                                        case 2:
                                            oh0 oh0Var4 = oh0Var;
                                            rh0 rh0Var2 = oh0Var4.H;
                                            try {
                                                if (oh0Var4.n.link != null) {
                                                    Context context2 = oh0Var4.getContext();
                                                    String str2 = oh0Var4.n.link;
                                                    rh0Var2.showDialog(new nh0(oh0Var4, context2, str2, str2, rh0Var2.getResourceProvider()));
                                                    break;
                                                } else {
                                                    break;
                                                }
                                            } catch (Exception e6) {
                                                FileLog.e(e6);
                                                return;
                                            }
                                        case 3:
                                            oh0 oh0Var5 = oh0Var;
                                            rh0 rh0Var3 = oh0Var5.H;
                                            TLRPC.TL_chatInviteExported tL_chatInviteExported2 = oh0Var5.n;
                                            pb0 pb0Var = new pb0(1, rh0Var3.n);
                                            pb0Var.Q = rh0Var3.p0;
                                            pb0Var.Y(tL_chatInviteExported2);
                                            rh0Var3.presentFragment(pb0Var);
                                            break;
                                        default:
                                            final oh0 oh0Var6 = oh0Var;
                                            final TLRPC.TL_chatInviteExported tL_chatInviteExported3 = oh0Var6.n;
                                            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(oh0Var6.H.getParentActivity());
                                            alertDialog$Builder4.a.Q = LocaleController.getString(R.string.RevokeAlert);
                                            alertDialog$Builder4.a.O = LocaleController.getString(R.string.RevokeLink);
                                            final int i16 = 0;
                                            alertDialog$Builder4.k(LocaleController.getString(R.string.RevokeButton), new org.telegram.ui.ActionBar.c2() { // from class: org.telegram.ui.mh0
                                                @Override // org.telegram.ui.ActionBar.c2
                                                public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i162) {
                                                    switch (i16) {
                                                        case 0:
                                                            oh0Var6.H.e0(tL_chatInviteExported3);
                                                            break;
                                                        default:
                                                            oh0Var6.H.b0(tL_chatInviteExported3);
                                                            break;
                                                    }
                                                }
                                            });
                                            kf.k0.u(R.string.Cancel, alertDialog$Builder4, null);
                                            break;
                                    }
                                }
                            });
                        }
                        F.W(rh0Var.b.U0(oh0Var, false));
                        F.Z();
                        break;
                    }
                }
                break;
            case 10:
                cj0 cj0Var = (cj0) this.b;
                long j10 = cj0Var.b;
                if (!cj0Var.n.isStory()) {
                    if (cj0Var.getParentLayout().getFragmentStack().size() > 1) {
                        org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) cj0Var.getParentLayout().getFragmentStack().get(cj0Var.getParentLayout().getFragmentStack().size() - 2);
                        if ((p2Var instanceof zn) && ((zn) p2Var).e.id == j10) {
                            cj0Var.finishFragment();
                            break;
                        }
                    }
                    Bundle g10 = kf.k0.g(j10, "chat_id");
                    g10.putInt("message_id", cj0Var.c);
                    g10.putBoolean("need_remove_previous_same_chat_activity", false);
                    cj0Var.presentFragment(new zn(g10));
                    break;
                }
                break;
            case 11:
                ((org.telegram.ui.Cells.r8) this.b).setChecked(!r1.e.h);
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
                il0 il0Var = (il0) this.b;
                if (!il0Var.a.getAnimatedDrawable().i0) {
                    il0Var.a.getAnimatedDrawable().L(0, false, false);
                    il0Var.a.d();
                    break;
                }
                break;
            case 15:
                ((PasskeysActivity) this.b).Z(view);
                break;
            case 16:
                bn0 bn0Var = (bn0) this.b;
                if (!bn0Var.G) {
                    int i17 = bn0Var.J;
                    if ((i17 != 4 || bn0Var.I != 2) && i17 != 0) {
                        bn0Var.t();
                        break;
                    } else {
                        try {
                            PackageInfo packageInfo = ApplicationLoader.applicationContext.getPackageManager().getPackageInfo(ApplicationLoader.applicationContext.getPackageName(), 0);
                            Locale locale = Locale.US;
                            String str2 = packageInfo.versionName + " (" + packageInfo.versionCode + ")";
                            Intent intent = new Intent("android.intent.action.SENDTO");
                            intent.setData(Uri.parse("mailto:"));
                            intent.putExtra("android.intent.extra.EMAIL", new String[]{"sms@telegram.org"});
                            intent.putExtra("android.intent.extra.SUBJECT", "Android registration/login issue " + str2 + " " + bn0Var.a);
                            intent.putExtra("android.intent.extra.TEXT", "Phone: " + bn0Var.a + "\nApp version: " + str2 + "\nOS version: SDK " + Build.VERSION.SDK_INT + "\nDevice Name: " + Build.MANUFACTURER + Build.MODEL + "\nLocale: " + Locale.getDefault() + "\nError: " + bn0Var.H);
                            bn0Var.getContext().startActivity(Intent.createChooser(intent, "Send email..."));
                            break;
                        } catch (Exception unused) {
                            org.telegram.ui.Components.z4.u0(bn0Var.N, null, LocaleController.getString(R.string.NoMailInstalled), null);
                            return;
                        }
                    }
                }
                break;
            case 17:
                wp0 wp0Var = (wp0) this.b;
                zn znVar = wp0Var.C;
                if (znVar != null && znVar.c()) {
                    org.telegram.ui.Components.z4.L(wp0Var.getParentActivity(), znVar.a(), new op0(wp0Var, i14));
                    break;
                } else {
                    wp0Var.V(wp0Var.b, wp0Var.c, true, 0);
                    wp0Var.finishFragment();
                    break;
                }
            case 18:
                mq0 mq0Var = (mq0) this.b;
                zn znVar2 = mq0Var.R;
                if (znVar2 != null && znVar2.c()) {
                    org.telegram.ui.Components.z4.L(mq0Var.getParentActivity(), znVar2.a(), new aq0(mq0Var, i14));
                    break;
                } else {
                    mq0Var.e0(0, true);
                    break;
                }
            case 19:
                au0 au0Var = (au0) this.b;
                if (au0Var != null) {
                    au0Var.y(0, AndroidUtilities.dp(64.0f), false);
                    break;
                }
                break;
            case 20:
                ju0 ju0Var = (ju0) this.b;
                Object tag = ((View) view.getParent()).getTag();
                PhotoViewer photoViewer = ju0Var.d;
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
            case 21:
                mv0 mv0Var = (mv0) this.b;
                boolean[] zArr = mv0Var.w;
                CharSequence[] charSequenceArr = mv0Var.v;
                if (view.getTag() == null) {
                    view.setTag(1);
                    org.telegram.ui.Cells.b6 b6Var = (org.telegram.ui.Cells.b6) view.getParent();
                    f2.l1 G = mv0Var.c.G(b6Var);
                    if (G != null && (b10 = G.b()) != -1) {
                        int i18 = b10 - mv0Var.k0;
                        if (mv0Var.F && i18 < mv0Var.x) {
                            int i19 = -mv0Var.L;
                            mv0Var.L = i19;
                            AndroidUtilities.shakeViewSpring(b6Var, i19);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            break;
                        } else {
                            mv0Var.b.u(b10);
                            int i20 = i18 + 1;
                            System.arraycopy(charSequenceArr, i20, charSequenceArr, i18, (charSequenceArr.length - 1) - i18);
                            System.arraycopy(zArr, i20, zArr, i18, (zArr.length - 1) - i18);
                            charSequenceArr[charSequenceArr.length - 1] = null;
                            zArr[zArr.length - 1] = false;
                            int i21 = mv0Var.y - 1;
                            mv0Var.y = i21;
                            if (mv0Var.r != null) {
                                int[] iArr = new int[i21];
                                while (i14 < i21) {
                                    iArr[i14] = mv0Var.r[i14 >= i18 ? i14 + 1 : i14];
                                    i14++;
                                }
                                mv0Var.r = iArr;
                            }
                            if (mv0Var.y == charSequenceArr.length - 1) {
                                mv0Var.b.o((mv0Var.k0 + charSequenceArr.length) - 1);
                            }
                            f2.l1 K = mv0Var.c.K(b10 - 1);
                            EditTextBoldCursor textView = b6Var.getTextView();
                            if (K != null) {
                                View view3 = K.a;
                                if (view3 instanceof org.telegram.ui.Cells.b6) {
                                    ((org.telegram.ui.Cells.b6) view3).getTextView().requestFocus();
                                    textView.clearFocus();
                                    mv0Var.i0();
                                    mv0Var.r0();
                                    qy0Var = mv0Var.N;
                                    if (qy0Var != null) {
                                        qy0Var.f();
                                        mv0Var.N.setDelegate(null);
                                    }
                                    mv0Var.b.m(mv0Var.m0);
                                    break;
                                }
                            }
                            if (textView.isFocused()) {
                                AndroidUtilities.hideKeyboard(textView);
                                mv0Var.k0(true);
                            } else if (mv0Var.y0) {
                                mv0Var.k0(true);
                            }
                            textView.clearFocus();
                            mv0Var.i0();
                            mv0Var.r0();
                            qy0Var = mv0Var.N;
                            if (qy0Var != null) {
                            }
                            mv0Var.b.m(mv0Var.m0);
                        }
                    }
                }
                break;
            case 22:
                ((yv0) this.b).c(true);
                break;
            case 23:
                ((yv0) ((gg.u) this.b).c).c(true);
                break;
            case 24:
                PrivacyControlActivity privacyControlActivity = ((lx0) this.b).d;
                privacyControlActivity.showDialog(new eg.o1((org.telegram.ui.ActionBar.p2) privacyControlActivity, 27, false));
                break;
            case 25:
                PrivacySettingsActivity privacySettingsActivity = (PrivacySettingsActivity) this.b;
                privacySettingsActivity.getClass();
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                int intValue = ((Integer) y1Var.getTag()).intValue();
                boolean[] zArr2 = privacySettingsActivity.W;
                boolean z4 = !zArr2[intValue];
                zArr2[intValue] = z4;
                y1Var.c(z4, true);
                break;
            case 26:
                v11 v11Var = (v11) this.b;
                ProxyListActivity proxyListActivity = v11Var.s;
                SharedConfig.ProxyInfo proxyInfo = v11Var.d;
                d21 d21Var = new d21(null);
                d21Var.e = new org.telegram.ui.Cells.y6[3];
                d21Var.f = new org.telegram.ui.Cells.z8[2];
                d21Var.s = new org.telegram.ui.Cells.i6[3];
                d21Var.y = 1.0f;
                d21Var.B = new float[2];
                d21Var.C = true;
                d21Var.I = new w11(d21Var);
                d21Var.G = proxyInfo;
                proxyListActivity.presentFragment(d21Var);
                break;
            case 27:
                t21 t21Var = (t21) this.b;
                ValueAnimator valueAnimator = t21Var.K;
                if (valueAnimator == null) {
                    boolean z10 = !t21Var.J;
                    u21 u21Var = t21Var.d;
                    r21 r21Var = t21Var.C;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    FrameLayout frameLayout = (FrameLayout) u21Var.getParentActivity().getWindow().getDecorView();
                    FrameLayout frameLayout2 = (FrameLayout) t21Var.e.getDecorView();
                    Bitmap createBitmap = Bitmap.createBitmap(frameLayout2.getWidth(), frameLayout2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(createBitmap);
                    r21Var.setAlpha(0.0f);
                    frameLayout.draw(canvas);
                    frameLayout2.draw(canvas);
                    r21Var.setAlpha(1.0f);
                    Paint paint = new Paint(1);
                    paint.setColor(-16777216);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                    Paint paint2 = new Paint(1);
                    paint2.setFilterBitmap(true);
                    int[] iArr2 = new int[2];
                    r21Var.getLocationInWindow(iArr2);
                    float f10 = iArr2[0];
                    float f11 = iArr2[1];
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    paint2.setShader(new BitmapShader(createBitmap, tileMode, tileMode));
                    t21Var.L = new org.telegram.ui.Components.to(t21Var, u21Var.getParentActivity(), z10, canvas, (r21Var.getMeasuredWidth() / 2.0f) + f10, (r21Var.getMeasuredHeight() / 2.0f) + f11, Math.max(createBitmap.getHeight(), createBitmap.getWidth()) * 0.9f, paint, createBitmap, paint2, f10, f11, 1);
                    t21Var.M = 0.0f;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    t21Var.K = ofFloat;
                    ofFloat.addUpdateListener(new o11(t21Var, i12));
                    t21Var.K.addListener(new ss0(t21Var, 15));
                    t21Var.K.setDuration(400L);
                    t21Var.K.setInterpolator(org.telegram.ui.Components.ft.e);
                    t21Var.K.start();
                    frameLayout2.addView(t21Var.L, new ViewGroup.LayoutParams(-1, -1));
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.kv0(9, t21Var, z10));
                    break;
                }
                break;
            case 28:
                p31 p31Var = (p31) this.b;
                ph.d dVar = p31Var.s;
                if (dVar.T && !dVar.K) {
                    dVar.setLoading(true);
                    q31.G(p31Var.v, ((TextView) p31Var.h.c).getText(), p31Var.d.option, p31Var.n.getText().toString());
                    break;
                }
                break;
            default:
                n31 n31Var = (n31) ((dg.s1) this.b).e;
                if (n31Var != null) {
                    n31Var.run();
                    break;
                }
                break;
        }
    }
}
