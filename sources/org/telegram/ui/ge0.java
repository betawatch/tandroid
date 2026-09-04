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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ge0 extends org.telegram.ui.Components.tv0 {
    public boolean E;
    public GoogleSignInAccount F;
    public int G;
    public int H;
    public String I;
    public String J;
    public String K;
    public String L;
    public String M;
    public boolean N;
    public int O;
    public final boolean P;
    public final fe0 Q;
    public boolean R;
    public final zd0 S;
    public final zd0 T;
    public final zd0 U;
    public boolean V;
    public final /* synthetic */ wg0 W;
    public final de0 a;
    public final TextView b;
    public final wh.p c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final bi.c4 n;
    public final bi.c4 r;
    public final TextView s;
    public final org.telegram.ui.Components.k90 v;
    public final org.telegram.ui.Components.aj0 w;
    public boolean x;
    public Bundle y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ge0(wg0 wg0Var, Context context, boolean z10) {
        super(context);
        int i10;
        this.W = wg0Var;
        this.S = new zd0(this, 4);
        this.T = new zd0(this, 6);
        this.U = new zd0(this, 7);
        this.P = z10;
        final int i11 = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.aj0 aj0Var = new org.telegram.ui.Components.aj0(context);
        this.w = aj0Var;
        if (!z10 || wg0Var.F == 3) {
            aj0Var.f(R.raw.email_check_inbox, 120, 120, null);
        } else {
            aj0Var.f(R.raw.email_setup_heart, 120, 120, null);
        }
        final int i12 = 0;
        aj0Var.setAutoRepeat(false);
        frameLayout.addView(aj0Var, w7.x5.e(120, 120, 1));
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                frameLayout.setVisibility(i10);
                addView(frameLayout, w7.x5.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                com.google.android.gms.internal.vision.e2.m(18.0f, 1, textView);
                textView.setText(LocaleController.getString(wg0Var.F != 3 ? R.string.CheckYourNewEmail : z10 ? R.string.VerificationCode : R.string.CheckYourEmail));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView, w7.x5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                wh.p pVar = new wh.p(context, null, false);
                this.c = pVar;
                pVar.setTextSize(1, 14.0f);
                pVar.setGravity(17);
                pVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(pVar, w7.x5.t(-2, -2, 1, 24, 8, 24, 0));
                de0 de0Var = new de0(this, context, 0);
                this.a = de0Var;
                addView(de0Var, w7.x5.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setGravity(17);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                final int i13 = 2;
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(org.telegram.messenger.beta.R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(i13), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
                textView2.setText(spannableStringBuilder);
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ce0
                    public final /* synthetic */ ge0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        switch (i12) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                ge0 ge0Var = this.b;
                                globalInstance.addObserver(new ee0(ge0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = ge0Var.getContext();
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
                                com.google.android.gms.internal.clearcut.u0 a2 = w7.d9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new z10(15, ge0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                ge0 ge0Var2 = this.b;
                                TextView textView3 = ge0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    ge0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ge0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = ge0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ge0Var2.I);
                                    bundle.putString("ephone", ge0Var2.J);
                                    bundle.putString("phoneFormated", ge0Var2.L);
                                    i14 = ((org.telegram.ui.ActionBar.n2) ge0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(ge0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, wg0Var.F == 3 && !z10, 1.0f, false);
                bi.c4 c4Var = new bi.c4(context, 28);
                this.n = c4Var;
                c4Var.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
                c4Var.setGravity(17);
                c4Var.setTextSize(1, 14.0f);
                c4Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                c4Var.setMaxLines(2);
                c4Var.setOnClickListener(new tv(18, this, context));
                frameLayout2.addView(c4Var);
                bi.c4 c4Var2 = new bi.c4(context, 29);
                this.r = c4Var2;
                c4Var2.setGravity(17);
                c4Var2.setTextSize(1, 14.0f);
                c4Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                c4Var2.setMaxLines(3);
                c4Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ce0
                    public final /* synthetic */ ge0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        switch (i11) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                ge0 ge0Var = this.b;
                                globalInstance.addObserver(new ee0(ge0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = ge0Var.getContext();
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
                                com.google.android.gms.internal.clearcut.u0 a2 = w7.d9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new z10(15, ge0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                ge0 ge0Var2 = this.b;
                                TextView textView3 = ge0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    ge0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ge0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = ge0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ge0Var2.I);
                                    bundle.putString("ephone", ge0Var2.J);
                                    bundle.putString("phoneFormated", ge0Var2.L);
                                    i14 = ((org.telegram.ui.ActionBar.n2) ge0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(ge0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                c4Var2.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
                c4Var2.setVisibility(8);
                frameLayout2.addView(c4Var2);
                TextView textView3 = new TextView(context);
                this.f = textView3;
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                textView3.setMaxLines(2);
                textView3.setText(LocaleController.getString(R.string.ResendCode));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ce0
                    public final /* synthetic */ ge0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        switch (i13) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                ge0 ge0Var = this.b;
                                globalInstance.addObserver(new ee0(ge0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = ge0Var.getContext();
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
                                com.google.android.gms.internal.clearcut.u0 a2 = w7.d9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new z10(15, ge0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                ge0 ge0Var2 = this.b;
                                TextView textView32 = ge0Var2.f;
                                if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                                    ge0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ge0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = ge0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ge0Var2.I);
                                    bundle.putString("ephone", ge0Var2.J);
                                    bundle.putString("phoneFormated", ge0Var2.L);
                                    i14 = ((org.telegram.ui.ActionBar.n2) ge0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(ge0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 1.0f, false);
                org.telegram.ui.Components.k90 k90Var = new org.telegram.ui.Components.k90(context);
                this.v = k90Var;
                n7.z0.g(k90Var);
                fe0 fe0Var = new fe0(context, i12);
                this.Q = fe0Var;
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.jt.e;
                loadAnimation.setInterpolator(prVar);
                fe0Var.setInAnimation(loadAnimation);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                loadAnimation2.setInterpolator(prVar);
                fe0Var.setOutAnimation(loadAnimation2);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.e = frameLayout3;
                frameLayout3.addView(textView3, w7.x5.e(-2, -2, 17));
                fe0Var.addView(frameLayout3);
                TextView textView4 = new TextView(context);
                this.s = textView4;
                textView4.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
                textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                fe0Var.addView(textView4);
                FrameLayout frameLayout4 = new FrameLayout(context);
                if (z10) {
                    frameLayout4.addView(fe0Var, w7.x5.e(-1, -2, 48));
                    frameLayout4.addView(frameLayout2, w7.x5.e(-1, -2, 48));
                    frameLayout4.addView(k90Var, w7.x5.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                    frameLayout4.addView(textView2, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                } else {
                    frameLayout4.addView(fe0Var, w7.x5.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                addView(frameLayout4, w7.x5.l(1.0f, -1, 0));
            }
        }
        i10 = 8;
        frameLayout.setVisibility(i10);
        addView(frameLayout, w7.x5.e(-1, -2, 1));
        TextView textView5 = new TextView(context);
        this.b = textView5;
        com.google.android.gms.internal.vision.e2.m(18.0f, 1, textView5);
        textView5.setText(LocaleController.getString(wg0Var.F != 3 ? R.string.CheckYourNewEmail : z10 ? R.string.VerificationCode : R.string.CheckYourEmail));
        textView5.setGravity(17);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView5, w7.x5.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        wh.p pVar2 = new wh.p(context, null, false);
        this.c = pVar2;
        pVar2.setTextSize(1, 14.0f);
        pVar2.setGravity(17);
        pVar2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(pVar2, w7.x5.t(-2, -2, 1, 24, 8, 24, 0));
        de0 de0Var2 = new de0(this, context, 0);
        this.a = de0Var2;
        addView(de0Var2, w7.x5.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
        TextView textView22 = new TextView(context);
        this.d = textView22;
        textView22.setGravity(17);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView22.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        final int i132 = 2;
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(org.telegram.messenger.beta.R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.lz(i132), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
        textView22.setText(spannableStringBuilder2);
        textView22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ce0
            public final /* synthetic */ ge0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14;
                switch (i12) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        ge0 ge0Var = this.b;
                        globalInstance.addObserver(new ee0(ge0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = ge0Var.getContext();
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
                        com.google.android.gms.internal.clearcut.u0 a2 = w7.d9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new z10(15, ge0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        ge0 ge0Var2 = this.b;
                        TextView textView32 = ge0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            ge0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ge0Var2.L;
                            tL_auth_resendCode.phone_code_hash = ge0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ge0Var2.I);
                            bundle.putString("ephone", ge0Var2.J);
                            bundle.putString("phoneFormated", ge0Var2.L);
                            i14 = ((org.telegram.ui.ActionBar.n2) ge0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(ge0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.h = frameLayout22;
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout22, wg0Var.F == 3 && !z10, 1.0f, false);
        bi.c4 c4Var3 = new bi.c4(context, 28);
        this.n = c4Var3;
        c4Var3.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
        c4Var3.setGravity(17);
        c4Var3.setTextSize(1, 14.0f);
        c4Var3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        c4Var3.setMaxLines(2);
        c4Var3.setOnClickListener(new tv(18, this, context));
        frameLayout22.addView(c4Var3);
        bi.c4 c4Var22 = new bi.c4(context, 29);
        this.r = c4Var22;
        c4Var22.setGravity(17);
        c4Var22.setTextSize(1, 14.0f);
        c4Var22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        c4Var22.setMaxLines(3);
        c4Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ce0
            public final /* synthetic */ ge0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14;
                switch (i11) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        ge0 ge0Var = this.b;
                        globalInstance.addObserver(new ee0(ge0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = ge0Var.getContext();
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
                        com.google.android.gms.internal.clearcut.u0 a2 = w7.d9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new z10(15, ge0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        ge0 ge0Var2 = this.b;
                        TextView textView32 = ge0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            ge0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ge0Var2.L;
                            tL_auth_resendCode.phone_code_hash = ge0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ge0Var2.I);
                            bundle.putString("ephone", ge0Var2.J);
                            bundle.putString("phoneFormated", ge0Var2.L);
                            i14 = ((org.telegram.ui.ActionBar.n2) ge0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(ge0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        c4Var22.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
        c4Var22.setVisibility(8);
        frameLayout22.addView(c4Var22);
        TextView textView32 = new TextView(context);
        this.f = textView32;
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView32.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        textView32.setMaxLines(2);
        textView32.setText(LocaleController.getString(R.string.ResendCode));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.ce0
            public final /* synthetic */ ge0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14;
                switch (i132) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        ge0 ge0Var = this.b;
                        globalInstance.addObserver(new ee0(ge0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = ge0Var.getContext();
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
                        com.google.android.gms.internal.clearcut.u0 a2 = w7.d9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new z10(15, ge0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        ge0 ge0Var2 = this.b;
                        TextView textView322 = ge0Var2.f;
                        if (textView322.getVisibility() == 0 && textView322.getAlpha() == 1.0f) {
                            ge0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ge0Var2.L;
                            tL_auth_resendCode.phone_code_hash = ge0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ge0Var2.I);
                            bundle.putString("ephone", ge0Var2.J);
                            bundle.putString("phoneFormated", ge0Var2.L);
                            i14 = ((org.telegram.ui.ActionBar.n2) ge0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new aa(ge0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        AndroidUtilities.updateViewVisibilityAnimated(textView32, false, 1.0f, false);
        org.telegram.ui.Components.k90 k90Var2 = new org.telegram.ui.Components.k90(context);
        this.v = k90Var2;
        n7.z0.g(k90Var2);
        fe0 fe0Var2 = new fe0(context, i12);
        this.Q = fe0Var2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
        org.telegram.ui.Components.pr prVar2 = org.telegram.ui.Components.jt.e;
        loadAnimation3.setInterpolator(prVar2);
        fe0Var2.setInAnimation(loadAnimation3);
        Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        loadAnimation22.setInterpolator(prVar2);
        fe0Var2.setOutAnimation(loadAnimation22);
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.e = frameLayout32;
        frameLayout32.addView(textView32, w7.x5.e(-2, -2, 17));
        fe0Var2.addView(frameLayout32);
        TextView textView42 = new TextView(context);
        this.s = textView42;
        textView42.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
        textView42.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView42.setTextSize(1, 15.0f);
        textView42.setGravity(49);
        textView42.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        fe0Var2.addView(textView42);
        FrameLayout frameLayout42 = new FrameLayout(context);
        if (z10) {
        }
        addView(frameLayout42, w7.x5.l(1.0f, -1, 0));
    }

    @Override // org.telegram.ui.Components.tv0
    public final void g() {
        if (this.H != 0) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public String getHeaderName() {
        return LocaleController.getString(R.string.VerificationCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.tv0
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i10;
        if (this.E) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.T);
        de0 de0Var = this.a;
        de0Var.e = true;
        gs[] gsVarArr = de0Var.f;
        if (gsVarArr != null) {
            for (gs gsVar : gsVarArr) {
                gsVar.j(0.0f);
            }
        }
        String code = de0Var.getCode();
        int length = code.length();
        wg0 wg0Var = this.W;
        if (length == 0 && this.F == null) {
            if (wg0Var.getParentActivity() == null) {
                return;
            }
            try {
                de0Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (gs gsVar2 : de0Var.f) {
                gsVar2.i(1.0f);
            }
            de0Var.f[0].requestFocus();
            AndroidUtilities.shakeViewSpring(de0Var, new zd0(this, 1));
            return;
        }
        this.E = true;
        wg0Var.n1(0, true);
        if (wg0Var.F == 3) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode.code = code;
            verifyemail.verification = tL_emailVerificationCode;
            tL_auth_signIn = verifyemail;
        } else if (this.N) {
            TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup.phone_number = this.L;
            tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.M;
            verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode2.code = code;
            verifyemail2.verification = tL_emailVerificationCode2;
            tL_auth_signIn = verifyemail2;
        } else {
            TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
            tL_auth_signIn2.phone_number = this.L;
            tL_auth_signIn2.phone_code_hash = this.M;
            if (this.F != null) {
                TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                tL_emailVerificationGoogle.token = this.F.c;
                tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
            } else {
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode3.code = code;
                tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
            }
            tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
            tL_auth_signIn = tL_auth_signIn2;
        }
        de0Var.e = true;
        gs[] gsVarArr2 = de0Var.f;
        if (gsVarArr2 != null) {
            for (gs gsVar3 : gsVarArr2) {
                gsVar3.j(0.0f);
            }
        }
        i10 = ((org.telegram.ui.ActionBar.n2) wg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new wd0(this, code, 0), 10);
    }

    @Override // org.telegram.ui.Components.tv0
    public final void j() {
        if (this.x) {
            this.x = false;
        } else {
            AndroidUtilities.runOnUIThread(new zd0(this, 8), wg0.t0);
        }
    }

    @Override // org.telegram.ui.Components.tv0
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

    @Override // org.telegram.ui.Components.tv0
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

    @Override // org.telegram.ui.Components.tv0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.y = bundle;
        this.L = bundle.getString("phoneFormated");
        this.M = this.y.getString("phoneHash");
        this.I = this.y.getString("phone");
        this.J = this.y.getString("ephone");
        this.N = this.y.getBoolean("setup");
        this.O = this.y.getInt("length");
        this.K = this.y.getString("email");
        this.G = this.y.getInt("resetAvailablePeriod");
        this.H = this.y.getInt("resetPendingDate");
        wg0 wg0Var = this.W;
        int i10 = wg0Var.F;
        int i11 = 8;
        FrameLayout frameLayout = this.h;
        wh.p pVar = this.c;
        if (i10 == 3) {
            pVar.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.K));
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
        } else if (this.P) {
            pVar.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.K));
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
            this.n.setVisibility(this.H == 0 ? 0 : 8);
            this.r.setVisibility(this.H != 0 ? 0 : 8);
            if (this.H != 0) {
                r();
            }
        }
        int i12 = this.O;
        de0 de0Var = this.a;
        de0Var.b(i12, 1);
        for (gs gsVar : de0Var.f) {
            gsVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            gsVar.addTextChangedListener(new l0(this, 7));
            gsVar.setOnFocusChangeListener(new pd(this, 2));
        }
        de0Var.setText("");
        if (!this.N && wg0Var.F != 3) {
            String string = this.y.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01();
                n01Var.a |= 256;
                n01Var.b = indexOf;
                int i13 = lastIndexOf + 1;
                n01Var.c = i13;
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o01(n01Var, 0), indexOf, i13, 0);
            }
            pVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
        }
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i11 = 0;
        }
        this.v.setVisibility(i11);
        this.d.setVisibility(i11);
        wg0.T0(wg0Var, de0Var.f[0]);
        de0Var.requestFocus();
        if (!z10 && bundle.containsKey("nextType")) {
            AndroidUtilities.runOnUIThread(this.T, bundle.getInt("timeout"));
        }
        if (this.H != 0) {
            AndroidUtilities.runOnUIThread(this.U, 1000L);
        }
    }

    @Override // org.telegram.ui.Components.tv0
    public final void n() {
        this.b.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        int i10 = org.telegram.ui.ActionBar.j6.D6;
        this.c.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.j6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.v.a();
        this.f.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i10, false));
        this.s.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.q7, false));
        this.a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.F != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            de0 de0Var = this.a;
            if (i10 >= de0Var.f.length) {
                de0Var.postDelayed(new r80(17, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                de0Var.postDelayed(new org.telegram.ui.Components.m8(this, i10, 19), i10 * 75);
                i10++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.S);
        removeCallbacks(this.T);
    }

    public final void p() {
        if (this.V) {
            return;
        }
        this.V = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.I);
        bundle.putString("ephone", this.J);
        bundle.putString("phoneFormated", this.L);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.L;
        tL_auth_resetLoginEmail.phone_code_hash = this.M;
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new xd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z10) {
        AndroidUtilities.updateViewVisibilityAnimated(this.f, z10);
        AndroidUtilities.updateViewVisibilityAnimated(this.h, (z10 || this.W.F == 3 || this.P) ? false : true);
        org.telegram.ui.Components.k90 k90Var = this.v;
        if (k90Var.getVisibility() != 8) {
            k90Var.setLayoutParams(w7.x5.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z10 ? 8.0f : 16.0f));
            k90Var.requestLayout();
        }
    }

    public final void r() {
        String formatString;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i10 = this.H;
        int i11 = 0;
        bi.c4 c4Var = this.r;
        if (i10 <= 0 || currentTimeMillis <= 0) {
            c4Var.setVisibility(0);
            c4Var.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
            AndroidUtilities.runOnUIThread(new zd0(this, i11), 1000L);
            return;
        }
        int i12 = R.string.LoginEmailResetInTime;
        int i13 = currentTimeMillis / 86400;
        int i14 = currentTimeMillis % 86400;
        int i15 = i14 / 3600;
        int i16 = i14 % 3600;
        int i17 = i16 / 60;
        int i18 = i16 % 60;
        if (i15 >= 16) {
            i13++;
        }
        if (i13 != 0) {
            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, LocaleController.formatPluralString("Days", i13, new Object[0]));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i15 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i15)) : "");
            Locale locale = Locale.ROOT;
            sb2.append(String.format(locale, "%02d:", Integer.valueOf(i17)));
            sb2.append(String.format(locale, "%02d", Integer.valueOf(i18)));
            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb2.toString());
        }
        String formatString2 = LocaleController.formatString(i12, formatString);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatString2);
        int indexOf = formatString2.indexOf(42);
        int lastIndexOf = formatString2.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
            valueOf.setSpan(new ForegroundColorSpan(this.W.getThemedColor(org.telegram.ui.ActionBar.j6.q6)), indexOf, lastIndexOf - 1, 33);
        }
        c4Var.setText(valueOf);
        AndroidUtilities.runOnUIThread(this.U, 1000L);
    }
}
