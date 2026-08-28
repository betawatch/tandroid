package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pd0 extends org.telegram.ui.Components.cv0 {
    public boolean A;
    public GoogleSignInAccount B;
    public int C;
    public int D;
    public String E;
    public String F;
    public String G;
    public String H;
    public String I;
    public boolean J;
    public int K;
    public final boolean L;
    public final od0 M;
    public boolean N;
    public final hd0 O;
    public final hd0 P;
    public final hd0 Q;
    public boolean R;
    public final /* synthetic */ fg0 S;
    public final ld0 a;
    public final TextView b;
    public final dh.u c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final bg.t n;
    public final nd0 r;
    public final TextView s;
    public final org.telegram.ui.Components.s80 v;
    public final org.telegram.ui.Components.pi0 w;
    public boolean x;
    public Bundle y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pd0(fg0 fg0Var, Context context, boolean z10) {
        super(context);
        int i9;
        this.S = fg0Var;
        this.O = new hd0(this, 4);
        this.P = new hd0(this, 6);
        this.Q = new hd0(this, 7);
        this.L = z10;
        final int i10 = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.pi0 pi0Var = new org.telegram.ui.Components.pi0(context);
        this.w = pi0Var;
        if (!z10 || fg0Var.B == 3) {
            pi0Var.f(R.raw.email_check_inbox, 120, 120, null);
        } else {
            pi0Var.f(R.raw.email_setup_heart, 120, 120, null);
        }
        final int i11 = 0;
        pi0Var.setAutoRepeat(false);
        frameLayout.addView(pi0Var, g7.e6.e(120, 120, 1));
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i9 = 0;
                frameLayout.setVisibility(i9);
                addView(frameLayout, g7.e6.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                j3.r0.u(18.0f, 1, textView);
                textView.setText(LocaleController.getString(fg0Var.B != 3 ? R.string.CheckYourNewEmail : z10 ? R.string.VerificationCode : R.string.CheckYourEmail));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView, g7.e6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                dh.u uVar = new dh.u(context, null, false);
                this.c = uVar;
                uVar.setTextSize(1, 14.0f);
                uVar.setGravity(17);
                uVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(uVar, g7.e6.t(-2, -2, 1, 24, 8, 24, 0));
                ld0 ld0Var = new ld0(this, context, 0);
                this.a = ld0Var;
                addView(ld0Var, g7.e6.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setGravity(17);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                final int i12 = 2;
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(org.telegram.messenger.beta.R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.xy(i12), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
                textView2.setText(spannableStringBuilder);
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
                    public final /* synthetic */ pd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i11) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                pd0 pd0Var = this.b;
                                globalInstance.addObserver(new md0(pd0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = pd0Var.getContext();
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
                                com.google.android.gms.internal.clearcut.v0 a2 = f7.s8.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new yr(24, pd0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                pd0 pd0Var2 = this.b;
                                TextView textView3 = pd0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    pd0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = pd0Var2.H;
                                    tL_auth_resendCode.phone_code_hash = pd0Var2.I;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", pd0Var2.E);
                                    bundle.putString("ephone", pd0Var2.F);
                                    bundle.putString("phoneFormated", pd0Var2.H);
                                    i13 = ((org.telegram.ui.ActionBar.o2) pd0Var2.S).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(pd0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, fg0Var.B == 3 && !z10, 1.0f, false);
                bg.t tVar = new bg.t(context, 29);
                this.n = tVar;
                tVar.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
                tVar.setGravity(17);
                tVar.setTextSize(1, 14.0f);
                tVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                tVar.setMaxLines(2);
                tVar.setOnClickListener(new v80(5, this, context));
                frameLayout2.addView(tVar);
                nd0 nd0Var = new nd0(context, 0);
                this.r = nd0Var;
                nd0Var.setGravity(17);
                nd0Var.setTextSize(1, 14.0f);
                nd0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                nd0Var.setMaxLines(3);
                nd0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
                    public final /* synthetic */ pd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i10) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                pd0 pd0Var = this.b;
                                globalInstance.addObserver(new md0(pd0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = pd0Var.getContext();
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
                                com.google.android.gms.internal.clearcut.v0 a2 = f7.s8.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new yr(24, pd0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                pd0 pd0Var2 = this.b;
                                TextView textView3 = pd0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    pd0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = pd0Var2.H;
                                    tL_auth_resendCode.phone_code_hash = pd0Var2.I;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", pd0Var2.E);
                                    bundle.putString("ephone", pd0Var2.F);
                                    bundle.putString("phoneFormated", pd0Var2.H);
                                    i13 = ((org.telegram.ui.ActionBar.o2) pd0Var2.S).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(pd0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                nd0Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
                nd0Var.setVisibility(8);
                frameLayout2.addView(nd0Var);
                TextView textView3 = new TextView(context);
                this.f = textView3;
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                textView3.setMaxLines(2);
                textView3.setText(LocaleController.getString(R.string.ResendCode));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
                    public final /* synthetic */ pd0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i12) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                pd0 pd0Var = this.b;
                                globalInstance.addObserver(new md0(pd0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = pd0Var.getContext();
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
                                com.google.android.gms.internal.clearcut.v0 a2 = f7.s8.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new yr(24, pd0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                pd0 pd0Var2 = this.b;
                                TextView textView32 = pd0Var2.f;
                                if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                                    pd0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = pd0Var2.H;
                                    tL_auth_resendCode.phone_code_hash = pd0Var2.I;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", pd0Var2.E);
                                    bundle.putString("ephone", pd0Var2.F);
                                    bundle.putString("phoneFormated", pd0Var2.H);
                                    i13 = ((org.telegram.ui.ActionBar.o2) pd0Var2.S).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(pd0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 1.0f, false);
                org.telegram.ui.Components.s80 s80Var = new org.telegram.ui.Components.s80(context);
                this.v = s80Var;
                org.telegram.ui.Cells.e3.s2(s80Var);
                od0 od0Var = new od0(context, i11);
                this.M = od0Var;
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.xs.e;
                loadAnimation.setInterpolator(grVar);
                od0Var.setInAnimation(loadAnimation);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                loadAnimation2.setInterpolator(grVar);
                od0Var.setOutAnimation(loadAnimation2);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.e = frameLayout3;
                frameLayout3.addView(textView3, g7.e6.e(-2, -2, 17));
                od0Var.addView(frameLayout3);
                TextView textView4 = new TextView(context);
                this.s = textView4;
                textView4.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
                textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                od0Var.addView(textView4);
                FrameLayout frameLayout4 = new FrameLayout(context);
                if (z10) {
                    frameLayout4.addView(od0Var, g7.e6.e(-1, -2, 48));
                    frameLayout4.addView(frameLayout2, g7.e6.e(-1, -2, 48));
                    frameLayout4.addView(s80Var, g7.e6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                    frameLayout4.addView(textView2, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                } else {
                    frameLayout4.addView(od0Var, g7.e6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                addView(frameLayout4, g7.e6.l(1.0f, -1, 0));
            }
        }
        i9 = 8;
        frameLayout.setVisibility(i9);
        addView(frameLayout, g7.e6.e(-1, -2, 1));
        TextView textView5 = new TextView(context);
        this.b = textView5;
        j3.r0.u(18.0f, 1, textView5);
        textView5.setText(LocaleController.getString(fg0Var.B != 3 ? R.string.CheckYourNewEmail : z10 ? R.string.VerificationCode : R.string.CheckYourEmail));
        textView5.setGravity(17);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView5, g7.e6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        dh.u uVar2 = new dh.u(context, null, false);
        this.c = uVar2;
        uVar2.setTextSize(1, 14.0f);
        uVar2.setGravity(17);
        uVar2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(uVar2, g7.e6.t(-2, -2, 1, 24, 8, 24, 0));
        ld0 ld0Var2 = new ld0(this, context, 0);
        this.a = ld0Var2;
        addView(ld0Var2, g7.e6.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
        TextView textView22 = new TextView(context);
        this.d = textView22;
        textView22.setGravity(17);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView22.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        final int i122 = 2;
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(org.telegram.messenger.beta.R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.xy(i122), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
        textView22.setText(spannableStringBuilder2);
        textView22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
            public final /* synthetic */ pd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i11) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        pd0 pd0Var = this.b;
                        globalInstance.addObserver(new md0(pd0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = pd0Var.getContext();
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
                        com.google.android.gms.internal.clearcut.v0 a2 = f7.s8.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new yr(24, pd0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        pd0 pd0Var2 = this.b;
                        TextView textView32 = pd0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            pd0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = pd0Var2.H;
                            tL_auth_resendCode.phone_code_hash = pd0Var2.I;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", pd0Var2.E);
                            bundle.putString("ephone", pd0Var2.F);
                            bundle.putString("phoneFormated", pd0Var2.H);
                            i13 = ((org.telegram.ui.ActionBar.o2) pd0Var2.S).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(pd0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.h = frameLayout22;
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout22, fg0Var.B == 3 && !z10, 1.0f, false);
        bg.t tVar2 = new bg.t(context, 29);
        this.n = tVar2;
        tVar2.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
        tVar2.setGravity(17);
        tVar2.setTextSize(1, 14.0f);
        tVar2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        tVar2.setMaxLines(2);
        tVar2.setOnClickListener(new v80(5, this, context));
        frameLayout22.addView(tVar2);
        nd0 nd0Var2 = new nd0(context, 0);
        this.r = nd0Var2;
        nd0Var2.setGravity(17);
        nd0Var2.setTextSize(1, 14.0f);
        nd0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        nd0Var2.setMaxLines(3);
        nd0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
            public final /* synthetic */ pd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i10) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        pd0 pd0Var = this.b;
                        globalInstance.addObserver(new md0(pd0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = pd0Var.getContext();
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
                        com.google.android.gms.internal.clearcut.v0 a2 = f7.s8.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new yr(24, pd0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        pd0 pd0Var2 = this.b;
                        TextView textView32 = pd0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            pd0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = pd0Var2.H;
                            tL_auth_resendCode.phone_code_hash = pd0Var2.I;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", pd0Var2.E);
                            bundle.putString("ephone", pd0Var2.F);
                            bundle.putString("phoneFormated", pd0Var2.H);
                            i13 = ((org.telegram.ui.ActionBar.o2) pd0Var2.S).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(pd0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        nd0Var2.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
        nd0Var2.setVisibility(8);
        frameLayout22.addView(nd0Var2);
        TextView textView32 = new TextView(context);
        this.f = textView32;
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView32.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        textView32.setMaxLines(2);
        textView32.setText(LocaleController.getString(R.string.ResendCode));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.kd0
            public final /* synthetic */ pd0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i122) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        pd0 pd0Var = this.b;
                        globalInstance.addObserver(new md0(pd0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = pd0Var.getContext();
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
                        com.google.android.gms.internal.clearcut.v0 a2 = f7.s8.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new yr(24, pd0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        pd0 pd0Var2 = this.b;
                        TextView textView322 = pd0Var2.f;
                        if (textView322.getVisibility() == 0 && textView322.getAlpha() == 1.0f) {
                            pd0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = pd0Var2.H;
                            tL_auth_resendCode.phone_code_hash = pd0Var2.I;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", pd0Var2.E);
                            bundle.putString("ephone", pd0Var2.F);
                            bundle.putString("phoneFormated", pd0Var2.H);
                            i13 = ((org.telegram.ui.ActionBar.o2) pd0Var2.S).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(pd0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        AndroidUtilities.updateViewVisibilityAnimated(textView32, false, 1.0f, false);
        org.telegram.ui.Components.s80 s80Var2 = new org.telegram.ui.Components.s80(context);
        this.v = s80Var2;
        org.telegram.ui.Cells.e3.s2(s80Var2);
        od0 od0Var2 = new od0(context, i11);
        this.M = od0Var2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
        org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.xs.e;
        loadAnimation3.setInterpolator(grVar2);
        od0Var2.setInAnimation(loadAnimation3);
        Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        loadAnimation22.setInterpolator(grVar2);
        od0Var2.setOutAnimation(loadAnimation22);
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.e = frameLayout32;
        frameLayout32.addView(textView32, g7.e6.e(-2, -2, 17));
        od0Var2.addView(frameLayout32);
        TextView textView42 = new TextView(context);
        this.s = textView42;
        textView42.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
        textView42.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView42.setTextSize(1, 15.0f);
        textView42.setGravity(49);
        textView42.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        od0Var2.addView(textView42);
        FrameLayout frameLayout42 = new FrameLayout(context);
        if (z10) {
        }
        addView(frameLayout42, g7.e6.l(1.0f, -1, 0));
    }

    @Override // org.telegram.ui.Components.cv0
    public final void g() {
        if (this.D != 0) {
            AndroidUtilities.cancelRunOnUIThread(this.Q);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public String getHeaderName() {
        return LocaleController.getString(R.string.VerificationCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.cv0
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i9;
        if (this.A) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.P);
        ld0 ld0Var = this.a;
        ld0Var.e = true;
        vr[] vrVarArr = ld0Var.f;
        if (vrVarArr != null) {
            for (vr vrVar : vrVarArr) {
                vrVar.j(0.0f);
            }
        }
        String code = ld0Var.getCode();
        int length = code.length();
        fg0 fg0Var = this.S;
        if (length == 0 && this.B == null) {
            if (fg0Var.getParentActivity() == null) {
                return;
            }
            try {
                ld0Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (vr vrVar2 : ld0Var.f) {
                vrVar2.i(1.0f);
            }
            ld0Var.f[0].requestFocus();
            AndroidUtilities.shakeViewSpring(ld0Var, new hd0(this, 1));
            return;
        }
        this.A = true;
        fg0Var.n1(0, true);
        if (fg0Var.B == 3) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode.code = code;
            verifyemail.verification = tL_emailVerificationCode;
            tL_auth_signIn = verifyemail;
        } else if (this.J) {
            TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup.phone_number = this.H;
            tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.I;
            verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode2.code = code;
            verifyemail2.verification = tL_emailVerificationCode2;
            tL_auth_signIn = verifyemail2;
        } else {
            TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
            tL_auth_signIn2.phone_number = this.H;
            tL_auth_signIn2.phone_code_hash = this.I;
            if (this.B != null) {
                TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                tL_emailVerificationGoogle.token = this.B.c;
                tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
            } else {
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode3.code = code;
                tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
            }
            tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
            tL_auth_signIn = tL_auth_signIn2;
        }
        ld0Var.e = true;
        vr[] vrVarArr2 = ld0Var.f;
        if (vrVarArr2 != null) {
            for (vr vrVar3 : vrVarArr2) {
                vrVar3.j(0.0f);
            }
        }
        i9 = ((org.telegram.ui.ActionBar.o2) fg0Var).currentAccount;
        ConnectionsManager.getInstance(i9).sendRequest(tL_auth_signIn, new ed0(this, code, 0), 10);
    }

    @Override // org.telegram.ui.Components.cv0
    public final void j() {
        if (this.x) {
            this.x = false;
        } else {
            AndroidUtilities.runOnUIThread(new hd0(this, 8), fg0.p0);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.y = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void l(Bundle bundle) {
        String code = this.a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.y;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.y = bundle;
        this.H = bundle.getString("phoneFormated");
        this.I = this.y.getString("phoneHash");
        this.E = this.y.getString("phone");
        this.F = this.y.getString("ephone");
        this.J = this.y.getBoolean("setup");
        this.K = this.y.getInt("length");
        this.G = this.y.getString("email");
        this.C = this.y.getInt("resetAvailablePeriod");
        this.D = this.y.getInt("resetPendingDate");
        fg0 fg0Var = this.S;
        int i9 = fg0Var.B;
        int i10 = 8;
        FrameLayout frameLayout = this.h;
        dh.u uVar = this.c;
        if (i9 == 3) {
            uVar.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.G));
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
        } else if (this.L) {
            uVar.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.G));
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
            this.n.setVisibility(this.D == 0 ? 0 : 8);
            this.r.setVisibility(this.D != 0 ? 0 : 8);
            if (this.D != 0) {
                r();
            }
        }
        int i11 = this.K;
        ld0 ld0Var = this.a;
        ld0Var.b(i11, 1);
        for (vr vrVar : ld0Var.f) {
            vrVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            vrVar.addTextChangedListener(new o0(this, 7));
            vrVar.setOnFocusChangeListener(new ld(this, 2));
        }
        ld0Var.setText("");
        if (!this.J && fg0Var.B != 3) {
            String string = this.y.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                org.telegram.ui.Components.vz0 vz0Var = new org.telegram.ui.Components.vz0();
                vz0Var.a |= 256;
                vz0Var.b = indexOf;
                int i12 = lastIndexOf + 1;
                vz0Var.c = i12;
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.wz0(vz0Var, 0), indexOf, i12, 0);
            }
            uVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
        }
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i10 = 0;
        }
        this.v.setVisibility(i10);
        this.d.setVisibility(i10);
        fg0.T0(fg0Var, ld0Var.f[0]);
        ld0Var.requestFocus();
        if (!z10 && bundle.containsKey("nextType")) {
            AndroidUtilities.runOnUIThread(this.P, bundle.getInt("timeout"));
        }
        if (this.D != 0) {
            AndroidUtilities.runOnUIThread(this.Q, 1000L);
        }
    }

    @Override // org.telegram.ui.Components.cv0
    public final void n() {
        this.b.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        int i9 = org.telegram.ui.ActionBar.f6.D6;
        this.c.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        int i10 = org.telegram.ui.ActionBar.f6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.v.a();
        this.f.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i10, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i9, false));
        this.s.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.q7, false));
        this.a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.B != null) {
            runnable.run();
            return;
        }
        int i9 = 0;
        while (true) {
            ld0 ld0Var = this.a;
            if (i9 >= ld0Var.f.length) {
                ld0Var.postDelayed(new x20(23, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                ld0Var.postDelayed(new org.telegram.ui.Components.qd(this, i9, 17), i9 * 75);
                i9++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.O);
        removeCallbacks(this.P);
    }

    public final void p() {
        if (this.R) {
            return;
        }
        this.R = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.E);
        bundle.putString("ephone", this.F);
        bundle.putString("phoneFormated", this.H);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.H;
        tL_auth_resetLoginEmail.phone_code_hash = this.I;
        this.S.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new fd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z10) {
        AndroidUtilities.updateViewVisibilityAnimated(this.f, z10);
        AndroidUtilities.updateViewVisibilityAnimated(this.h, (z10 || this.S.B == 3 || this.L) ? false : true);
        org.telegram.ui.Components.s80 s80Var = this.v;
        if (s80Var.getVisibility() != 8) {
            s80Var.setLayoutParams(g7.e6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z10 ? 8.0f : 16.0f));
            s80Var.requestLayout();
        }
    }

    public final void r() {
        String formatString;
        int currentTimeMillis = (int) (this.D - (System.currentTimeMillis() / 1000));
        int i9 = this.D;
        int i10 = 0;
        nd0 nd0Var = this.r;
        if (i9 <= 0 || currentTimeMillis <= 0) {
            nd0Var.setVisibility(0);
            nd0Var.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
            AndroidUtilities.runOnUIThread(new hd0(this, i10), 1000L);
            return;
        }
        int i11 = R.string.LoginEmailResetInTime;
        int i12 = currentTimeMillis / 86400;
        int i13 = currentTimeMillis % 86400;
        int i14 = i13 / 3600;
        int i15 = i13 % 3600;
        int i16 = i15 / 60;
        int i17 = i15 % 60;
        if (i14 >= 16) {
            i12++;
        }
        if (i12 != 0) {
            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i12, new Object[0]));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i14 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i14)) : "");
            Locale locale = Locale.ROOT;
            sb2.append(String.format(locale, "%02d:", Integer.valueOf(i16)));
            sb2.append(String.format(locale, "%02d", Integer.valueOf(i17)));
            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb2.toString());
        }
        String formatString2 = LocaleController.formatString(i11, formatString);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatString2);
        int indexOf = formatString2.indexOf(42);
        int lastIndexOf = formatString2.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
            valueOf.setSpan(new ForegroundColorSpan(this.S.getThemedColor(org.telegram.ui.ActionBar.f6.q6)), indexOf, lastIndexOf - 1, 33);
        }
        nd0Var.setText(valueOf);
        AndroidUtilities.runOnUIThread(this.Q, 1000L);
    }
}
