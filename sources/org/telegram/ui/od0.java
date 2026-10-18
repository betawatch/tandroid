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

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class od0 extends org.telegram.ui.Components.ow0 {
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
    public final nd0 Q;
    public boolean R;
    public final gd0 S;
    public final gd0 T;
    public final gd0 U;
    public boolean V;
    public final /* synthetic */ fg0 W;
    public final kd0 a;
    public final TextView b;
    public final wh.n c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final ai.vd n;
    public final md0 r;
    public final TextView s;
    public final org.telegram.ui.Components.ea0 v;
    public final org.telegram.ui.Components.xj0 w;
    public boolean x;
    public Bundle y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public od0(fg0 fg0Var, Context context, boolean z10) {
        super(context);
        int i10;
        this.W = fg0Var;
        this.S = new gd0(this, 4);
        this.T = new gd0(this, 6);
        this.U = new gd0(this, 7);
        this.P = z10;
        final int i11 = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.xj0 xj0Var = new org.telegram.ui.Components.xj0(context);
        this.w = xj0Var;
        if (!z10 || fg0Var.F == 3) {
            xj0Var.f(R.raw.email_check_inbox, 120, 120, null);
        } else {
            xj0Var.f(R.raw.email_setup_heart, 120, 120, null);
        }
        final int i12 = 0;
        xj0Var.setAutoRepeat(false);
        frameLayout.addView(xj0Var, w7.z5.e(120, 120, 1));
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                frameLayout.setVisibility(i10);
                addView(frameLayout, w7.z5.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                com.google.android.gms.internal.play_billing.k3.m(18.0f, 1, textView);
                textView.setText(LocaleController.getString(fg0Var.F != 3 ? R.string.CheckYourNewEmail : z10 ? R.string.VerificationCode : R.string.CheckYourEmail));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView, w7.z5.a(-2.0f, 32.0f, 16.0f, 32.0f, 0.0f, -1, 1));
                wh.n nVar = new wh.n(context, null, false);
                this.c = nVar;
                nVar.setTextSize(1, 14.0f);
                nVar.setGravity(17);
                nVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(nVar, w7.z5.t(-2, -2, 1, 24, 8, 24, 0));
                kd0 kd0Var = new kd0(this, context, 0);
                this.a = kd0Var;
                addView(kd0Var, w7.z5.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.uz(i13), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
                textView2.setText(spannableStringBuilder);
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jd0
                    public final /* synthetic */ od0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        switch (i12) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                od0 od0Var = this.b;
                                globalInstance.addObserver(new ld0(od0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = od0Var.getContext();
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
                                com.google.android.gms.internal.clearcut.v0 a2 = w7.c9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new zu(20, od0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                od0 od0Var2 = this.b;
                                TextView textView3 = od0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    od0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = od0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = od0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", od0Var2.I);
                                    bundle.putString("ephone", od0Var2.J);
                                    bundle.putString("phoneFormated", od0Var2.L);
                                    i14 = ((org.telegram.ui.ActionBar.n2) od0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new ea(od0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, fg0Var.F == 3 && !z10, 1.0f, false);
                ai.vd vdVar = new ai.vd(context, 29);
                this.n = vdVar;
                vdVar.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
                vdVar.setGravity(17);
                vdVar.setTextSize(1, 14.0f);
                vdVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                vdVar.setMaxLines(2);
                vdVar.setOnClickListener(new org.telegram.ui.Components.g51(28, this, context));
                frameLayout2.addView(vdVar);
                md0 md0Var = new md0(context, i12);
                this.r = md0Var;
                md0Var.setGravity(17);
                md0Var.setTextSize(1, 14.0f);
                md0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                md0Var.setMaxLines(3);
                md0Var.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jd0
                    public final /* synthetic */ od0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        switch (i11) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                od0 od0Var = this.b;
                                globalInstance.addObserver(new ld0(od0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = od0Var.getContext();
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
                                com.google.android.gms.internal.clearcut.v0 a2 = w7.c9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new zu(20, od0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                od0 od0Var2 = this.b;
                                TextView textView3 = od0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    od0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = od0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = od0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", od0Var2.I);
                                    bundle.putString("ephone", od0Var2.J);
                                    bundle.putString("phoneFormated", od0Var2.L);
                                    i14 = ((org.telegram.ui.ActionBar.n2) od0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new ea(od0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                md0Var.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
                md0Var.setVisibility(8);
                frameLayout2.addView(md0Var);
                TextView textView3 = new TextView(context);
                this.f = textView3;
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                textView3.setMaxLines(2);
                textView3.setText(LocaleController.getString(R.string.ResendCode));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jd0
                    public final /* synthetic */ od0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i14;
                        switch (i13) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                od0 od0Var = this.b;
                                globalInstance.addObserver(new ld0(od0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = od0Var.getContext();
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
                                com.google.android.gms.internal.clearcut.v0 a2 = w7.c9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new zu(20, od0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                od0 od0Var2 = this.b;
                                TextView textView32 = od0Var2.f;
                                if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                                    od0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = od0Var2.L;
                                    tL_auth_resendCode.phone_code_hash = od0Var2.M;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", od0Var2.I);
                                    bundle.putString("ephone", od0Var2.J);
                                    bundle.putString("phoneFormated", od0Var2.L);
                                    i14 = ((org.telegram.ui.ActionBar.n2) od0Var2.W).currentAccount;
                                    ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new ea(od0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 1.0f, false);
                org.telegram.ui.Components.ea0 ea0Var = new org.telegram.ui.Components.ea0(context);
                this.v = ea0Var;
                m.g3.i(ea0Var);
                nd0 nd0Var = new nd0(context, i12);
                this.Q = nd0Var;
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.st.e;
                loadAnimation.setInterpolator(bsVar);
                nd0Var.setInAnimation(loadAnimation);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                loadAnimation2.setInterpolator(bsVar);
                nd0Var.setOutAnimation(loadAnimation2);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.e = frameLayout3;
                frameLayout3.addView(textView3, w7.z5.e(-2, -2, 17));
                nd0Var.addView(frameLayout3);
                TextView textView4 = new TextView(context);
                this.s = textView4;
                textView4.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
                textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                nd0Var.addView(textView4);
                FrameLayout frameLayout4 = new FrameLayout(context);
                if (z10) {
                    frameLayout4.addView(nd0Var, w7.z5.e(-1, -2, 48));
                    frameLayout4.addView(frameLayout2, w7.z5.e(-1, -2, 48));
                    frameLayout4.addView(ea0Var, w7.z5.a(16.0f, 0.0f, 0.0f, 0.0f, 16.0f, -1, 17));
                    frameLayout4.addView(textView2, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 16.0f, -1, 80));
                } else {
                    frameLayout4.addView(nd0Var, w7.z5.a(-2.0f, 0.0f, 0.0f, 0.0f, 32.0f, -1, 80));
                }
                addView(frameLayout4, w7.z5.l(1.0f, -1, 0));
            }
        }
        i10 = 8;
        frameLayout.setVisibility(i10);
        addView(frameLayout, w7.z5.e(-1, -2, 1));
        TextView textView5 = new TextView(context);
        this.b = textView5;
        com.google.android.gms.internal.play_billing.k3.m(18.0f, 1, textView5);
        textView5.setText(LocaleController.getString(fg0Var.F != 3 ? R.string.CheckYourNewEmail : z10 ? R.string.VerificationCode : R.string.CheckYourEmail));
        textView5.setGravity(17);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView5, w7.z5.a(-2.0f, 32.0f, 16.0f, 32.0f, 0.0f, -1, 1));
        wh.n nVar2 = new wh.n(context, null, false);
        this.c = nVar2;
        nVar2.setTextSize(1, 14.0f);
        nVar2.setGravity(17);
        nVar2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(nVar2, w7.z5.t(-2, -2, 1, 24, 8, 24, 0));
        kd0 kd0Var2 = new kd0(this, context, 0);
        this.a = kd0Var2;
        addView(kd0Var2, w7.z5.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
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
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.uz(i132), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
        textView22.setText(spannableStringBuilder2);
        textView22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jd0
            public final /* synthetic */ od0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14;
                switch (i12) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        od0 od0Var = this.b;
                        globalInstance.addObserver(new ld0(od0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = od0Var.getContext();
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
                        com.google.android.gms.internal.clearcut.v0 a2 = w7.c9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new zu(20, od0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        od0 od0Var2 = this.b;
                        TextView textView32 = od0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            od0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = od0Var2.L;
                            tL_auth_resendCode.phone_code_hash = od0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", od0Var2.I);
                            bundle.putString("ephone", od0Var2.J);
                            bundle.putString("phoneFormated", od0Var2.L);
                            i14 = ((org.telegram.ui.ActionBar.n2) od0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new ea(od0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.h = frameLayout22;
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout22, fg0Var.F == 3 && !z10, 1.0f, false);
        ai.vd vdVar2 = new ai.vd(context, 29);
        this.n = vdVar2;
        vdVar2.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
        vdVar2.setGravity(17);
        vdVar2.setTextSize(1, 14.0f);
        vdVar2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        vdVar2.setMaxLines(2);
        vdVar2.setOnClickListener(new org.telegram.ui.Components.g51(28, this, context));
        frameLayout22.addView(vdVar2);
        md0 md0Var2 = new md0(context, i12);
        this.r = md0Var2;
        md0Var2.setGravity(17);
        md0Var2.setTextSize(1, 14.0f);
        md0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        md0Var2.setMaxLines(3);
        md0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jd0
            public final /* synthetic */ od0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14;
                switch (i11) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        od0 od0Var = this.b;
                        globalInstance.addObserver(new ld0(od0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = od0Var.getContext();
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
                        com.google.android.gms.internal.clearcut.v0 a2 = w7.c9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new zu(20, od0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        od0 od0Var2 = this.b;
                        TextView textView32 = od0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            od0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = od0Var2.L;
                            tL_auth_resendCode.phone_code_hash = od0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", od0Var2.I);
                            bundle.putString("ephone", od0Var2.J);
                            bundle.putString("phoneFormated", od0Var2.L);
                            i14 = ((org.telegram.ui.ActionBar.n2) od0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new ea(od0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        md0Var2.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
        md0Var2.setVisibility(8);
        frameLayout22.addView(md0Var2);
        TextView textView32 = new TextView(context);
        this.f = textView32;
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView32.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        textView32.setMaxLines(2);
        textView32.setText(LocaleController.getString(R.string.ResendCode));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.jd0
            public final /* synthetic */ od0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i14;
                switch (i132) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        od0 od0Var = this.b;
                        globalInstance.addObserver(new ld0(od0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = od0Var.getContext();
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
                        com.google.android.gms.internal.clearcut.v0 a2 = w7.c9.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new zu(20, od0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        od0 od0Var2 = this.b;
                        TextView textView322 = od0Var2.f;
                        if (textView322.getVisibility() == 0 && textView322.getAlpha() == 1.0f) {
                            od0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = od0Var2.L;
                            tL_auth_resendCode.phone_code_hash = od0Var2.M;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", od0Var2.I);
                            bundle.putString("ephone", od0Var2.J);
                            bundle.putString("phoneFormated", od0Var2.L);
                            i14 = ((org.telegram.ui.ActionBar.n2) od0Var2.W).currentAccount;
                            ConnectionsManager.getInstance(i14).sendRequest(tL_auth_resendCode, new ea(od0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        AndroidUtilities.updateViewVisibilityAnimated(textView32, false, 1.0f, false);
        org.telegram.ui.Components.ea0 ea0Var2 = new org.telegram.ui.Components.ea0(context);
        this.v = ea0Var2;
        m.g3.i(ea0Var2);
        nd0 nd0Var2 = new nd0(context, i12);
        this.Q = nd0Var2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
        org.telegram.ui.Components.bs bsVar2 = org.telegram.ui.Components.st.e;
        loadAnimation3.setInterpolator(bsVar2);
        nd0Var2.setInAnimation(loadAnimation3);
        Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        loadAnimation22.setInterpolator(bsVar2);
        nd0Var2.setOutAnimation(loadAnimation22);
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.e = frameLayout32;
        frameLayout32.addView(textView32, w7.z5.e(-2, -2, 17));
        nd0Var2.addView(frameLayout32);
        TextView textView42 = new TextView(context);
        this.s = textView42;
        textView42.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
        textView42.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView42.setTextSize(1, 15.0f);
        textView42.setGravity(49);
        textView42.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        nd0Var2.addView(textView42);
        FrameLayout frameLayout42 = new FrameLayout(context);
        if (z10) {
        }
        addView(frameLayout42, w7.z5.l(1.0f, -1, 0));
    }

    @Override // org.telegram.ui.Components.ow0
    public final void g() {
        if (this.H != 0) {
            AndroidUtilities.cancelRunOnUIThread(this.U);
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public String getHeaderName() {
        return LocaleController.getString(R.string.VerificationCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.ow0
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i10;
        if (this.E) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.T);
        kd0 kd0Var = this.a;
        kd0Var.e = true;
        vr[] vrVarArr = kd0Var.f;
        if (vrVarArr != null) {
            for (vr vrVar : vrVarArr) {
                vrVar.j(0.0f);
            }
        }
        String code = kd0Var.getCode();
        int length = code.length();
        fg0 fg0Var = this.W;
        if (length == 0 && this.F == null) {
            if (fg0Var.getParentActivity() == null) {
                return;
            }
            try {
                kd0Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (vr vrVar2 : kd0Var.f) {
                vrVar2.i(1.0f);
            }
            kd0Var.f[0].requestFocus();
            AndroidUtilities.shakeViewSpring(kd0Var, new gd0(this, 1));
            return;
        }
        this.E = true;
        fg0Var.n1(0, true);
        if (fg0Var.F == 3) {
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
        kd0Var.e = true;
        vr[] vrVarArr2 = kd0Var.f;
        if (vrVarArr2 != null) {
            for (vr vrVar3 : vrVarArr2) {
                vrVar3.j(0.0f);
            }
        }
        i10 = ((org.telegram.ui.ActionBar.n2) fg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new dd0(this, code, 0), 10);
    }

    @Override // org.telegram.ui.Components.ow0
    public final void j() {
        if (this.x) {
            this.x = false;
        } else {
            AndroidUtilities.runOnUIThread(new gd0(this, 8), fg0.t0);
        }
    }

    @Override // org.telegram.ui.Components.ow0
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

    @Override // org.telegram.ui.Components.ow0
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

    @Override // org.telegram.ui.Components.ow0
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
        fg0 fg0Var = this.W;
        int i10 = fg0Var.F;
        int i11 = 8;
        FrameLayout frameLayout = this.h;
        wh.n nVar = this.c;
        if (i10 == 3) {
            nVar.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.K));
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
        } else if (this.P) {
            nVar.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.K));
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
        kd0 kd0Var = this.a;
        kd0Var.b(i12, 1);
        for (vr vrVar : kd0Var.f) {
            vrVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            vrVar.addTextChangedListener(new o0(this, 7));
            vrVar.setOnFocusChangeListener(new rd(this, 2));
        }
        kd0Var.setText("");
        if (!this.N && fg0Var.F != 3) {
            String string = this.y.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                org.telegram.ui.Components.l11 l11Var = new org.telegram.ui.Components.l11();
                l11Var.a |= 256;
                l11Var.b = indexOf;
                int i13 = lastIndexOf + 1;
                l11Var.c = i13;
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.m11(l11Var, 0), indexOf, i13, 0);
            }
            nVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
        }
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i11 = 0;
        }
        this.v.setVisibility(i11);
        this.d.setVisibility(i11);
        fg0.T0(fg0Var, kd0Var.f[0]);
        kd0Var.requestFocus();
        if (!z10 && bundle.containsKey("nextType")) {
            AndroidUtilities.runOnUIThread(this.T, bundle.getInt("timeout"));
        }
        if (this.H != 0) {
            AndroidUtilities.runOnUIThread(this.U, 1000L);
        }
    }

    @Override // org.telegram.ui.Components.ow0
    public final void n() {
        this.b.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G6, false));
        int i10 = org.telegram.ui.ActionBar.h6.D6;
        this.c.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        int i11 = org.telegram.ui.ActionBar.h6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.v.a();
        this.f.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i10, false));
        this.s.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q7, false));
        this.a.invalidate();
    }

    public final void o(Runnable runnable) {
        if (this.F != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            kd0 kd0Var = this.a;
            if (i10 >= kd0Var.f.length) {
                kd0Var.postDelayed(new b80(16, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                kd0Var.postDelayed(new org.telegram.ui.Components.e2(this, i10, 20), i10 * 75);
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
        this.W.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ed0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z10) {
        AndroidUtilities.updateViewVisibilityAnimated(this.f, z10);
        AndroidUtilities.updateViewVisibilityAnimated(this.h, (z10 || this.W.F == 3 || this.P) ? false : true);
        org.telegram.ui.Components.ea0 ea0Var = this.v;
        if (ea0Var.getVisibility() != 8) {
            ea0Var.setLayoutParams(w7.z5.a(16.0f, 0.0f, 0.0f, 0.0f, z10 ? 8.0f : 16.0f, -1, 17));
            ea0Var.requestLayout();
        }
    }

    public final void r() {
        String formatString;
        int currentTimeMillis = (int) (this.H - (System.currentTimeMillis() / 1000));
        int i10 = this.H;
        int i11 = 0;
        md0 md0Var = this.r;
        if (i10 <= 0 || currentTimeMillis <= 0) {
            md0Var.setVisibility(0);
            md0Var.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
            AndroidUtilities.runOnUIThread(new gd0(this, i11), 1000L);
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
            valueOf.setSpan(new ForegroundColorSpan(this.W.getThemedColor(org.telegram.ui.ActionBar.h6.q6)), indexOf, lastIndexOf - 1, 33);
        }
        md0Var.setText(valueOf);
        AndroidUtilities.runOnUIThread(this.U, 1000L);
    }
}
