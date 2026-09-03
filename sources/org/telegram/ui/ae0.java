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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ae0 extends org.telegram.ui.Components.vv0 {
    public boolean B;
    public GoogleSignInAccount C;
    public int D;
    public int E;
    public String F;
    public String G;
    public String H;
    public String I;
    public String J;
    public boolean K;
    public int L;
    public final boolean M;
    public final zd0 N;
    public boolean O;
    public final td0 P;
    public final td0 Q;
    public final td0 R;
    public boolean S;
    public final /* synthetic */ pg0 T;
    public final xd0 a;
    public final TextView b;
    public final ih.s c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final gg.q n;
    public final gg.q r;
    public final TextView s;
    public final org.telegram.ui.Components.m90 v;
    public final org.telegram.ui.Components.jj0 w;
    public boolean x;
    public Bundle y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ae0(pg0 pg0Var, Context context, boolean z4) {
        super(context);
        int i10;
        this.T = pg0Var;
        this.P = new td0(this, 4);
        this.Q = new td0(this, 6);
        this.R = new td0(this, 7);
        this.M = z4;
        final int i11 = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.jj0 jj0Var = new org.telegram.ui.Components.jj0(context);
        this.w = jj0Var;
        int i12 = 3;
        if (!z4 || pg0Var.C == 3) {
            jj0Var.f(R.raw.email_check_inbox, 120, 120, null);
        } else {
            jj0Var.f(R.raw.email_setup_heart, 120, 120, null);
        }
        final int i13 = 0;
        jj0Var.setAutoRepeat(false);
        frameLayout.addView(jj0Var, k7.b6.e(120, 120, 1));
        if (!AndroidUtilities.isSmallScreen()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x <= point.y || AndroidUtilities.isTablet()) {
                i10 = 0;
                frameLayout.setVisibility(i10);
                addView(frameLayout, k7.b6.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                ai.o(18.0f, 1, textView);
                textView.setText(LocaleController.getString(pg0Var.C != 3 ? R.string.CheckYourNewEmail : z4 ? R.string.VerificationCode : R.string.CheckYourEmail));
                textView.setGravity(17);
                textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(textView, k7.b6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                ih.s sVar = new ih.s(context, null, false);
                this.c = sVar;
                sVar.setTextSize(1, 14.0f);
                sVar.setGravity(17);
                sVar.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                addView(sVar, k7.b6.t(-2, -2, 1, 24, 8, 24, 0));
                xd0 xd0Var = new xd0(this, context, 0);
                this.a = xd0Var;
                addView(xd0Var, k7.b6.t(-2, 42, 1, 0, !z4 ? 48 : 32, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setGravity(17);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                final int i14 = 2;
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(org.telegram.messenger.beta.R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.lz(i14), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
                textView2.setText(spannableStringBuilder);
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wd0
                    public final /* synthetic */ ae0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15;
                        switch (i13) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                ae0 ae0Var = this.b;
                                globalInstance.addObserver(new yd0(ae0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = ae0Var.getContext();
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
                                a8.e a2 = k7.y.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new ss(23, ae0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                ae0 ae0Var2 = this.b;
                                TextView textView3 = ae0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    ae0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ae0Var2.I;
                                    tL_auth_resendCode.phone_code_hash = ae0Var2.J;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ae0Var2.F);
                                    bundle.putString("ephone", ae0Var2.G);
                                    bundle.putString("phoneFormated", ae0Var2.I);
                                    i15 = ((org.telegram.ui.ActionBar.p2) ae0Var2.T).currentAccount;
                                    ConnectionsManager.getInstance(i15).sendRequest(tL_auth_resendCode, new da(ae0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout2, pg0Var.C == 3 && !z4, 1.0f, false);
                gg.q qVar = new gg.q(context, 27);
                this.n = qVar;
                qVar.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
                qVar.setGravity(17);
                qVar.setTextSize(1, 14.0f);
                qVar.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                qVar.setMaxLines(2);
                qVar.setOnClickListener(new ib0(i12, this, context));
                frameLayout2.addView(qVar);
                gg.q qVar2 = new gg.q(context, 28);
                this.r = qVar2;
                qVar2.setGravity(17);
                qVar2.setTextSize(1, 14.0f);
                qVar2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                qVar2.setMaxLines(3);
                qVar2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wd0
                    public final /* synthetic */ ae0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15;
                        switch (i11) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                ae0 ae0Var = this.b;
                                globalInstance.addObserver(new yd0(ae0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = ae0Var.getContext();
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
                                a8.e a2 = k7.y.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new ss(23, ae0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                ae0 ae0Var2 = this.b;
                                TextView textView3 = ae0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    ae0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ae0Var2.I;
                                    tL_auth_resendCode.phone_code_hash = ae0Var2.J;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ae0Var2.F);
                                    bundle.putString("ephone", ae0Var2.G);
                                    bundle.putString("phoneFormated", ae0Var2.I);
                                    i15 = ((org.telegram.ui.ActionBar.p2) ae0Var2.T).currentAccount;
                                    ConnectionsManager.getInstance(i15).sendRequest(tL_auth_resendCode, new da(ae0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                qVar2.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
                qVar2.setVisibility(8);
                frameLayout2.addView(qVar2);
                TextView textView3 = new TextView(context);
                this.f = textView3;
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                textView3.setMaxLines(2);
                textView3.setText(LocaleController.getString(R.string.ResendCode));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wd0
                    public final /* synthetic */ ae0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i15;
                        switch (i14) {
                            case 0:
                                NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                                ae0 ae0Var = this.b;
                                globalInstance.addObserver(new yd0(ae0Var), NotificationCenter.onActivityResultReceived);
                                Context context2 = ae0Var.getContext();
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
                                a8.e a2 = k7.y.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a2.g().addOnCompleteListener(new ss(23, ae0Var, a2));
                                break;
                            case 1:
                                this.b.p();
                                break;
                            default:
                                ae0 ae0Var2 = this.b;
                                TextView textView32 = ae0Var2.f;
                                if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                                    ae0Var2.q(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ae0Var2.I;
                                    tL_auth_resendCode.phone_code_hash = ae0Var2.J;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ae0Var2.F);
                                    bundle.putString("ephone", ae0Var2.G);
                                    bundle.putString("phoneFormated", ae0Var2.I);
                                    i15 = ((org.telegram.ui.ActionBar.p2) ae0Var2.T).currentAccount;
                                    ConnectionsManager.getInstance(i15).sendRequest(tL_auth_resendCode, new da(ae0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                AndroidUtilities.updateViewVisibilityAnimated(textView3, false, 1.0f, false);
                org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(context);
                this.v = m90Var;
                n7.qa.V(m90Var);
                zd0 zd0Var = new zd0(context, i13);
                this.N = zd0Var;
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.ft.e;
                loadAnimation.setInterpolator(mrVar);
                zd0Var.setInAnimation(loadAnimation);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                loadAnimation2.setInterpolator(mrVar);
                zd0Var.setOutAnimation(loadAnimation2);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.e = frameLayout3;
                frameLayout3.addView(textView3, k7.b6.e(-2, -2, 17));
                zd0Var.addView(frameLayout3);
                TextView textView4 = new TextView(context);
                this.s = textView4;
                textView4.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
                textView4.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                zd0Var.addView(textView4);
                FrameLayout frameLayout4 = new FrameLayout(context);
                if (z4) {
                    frameLayout4.addView(zd0Var, k7.b6.e(-1, -2, 48));
                    frameLayout4.addView(frameLayout2, k7.b6.e(-1, -2, 48));
                    frameLayout4.addView(m90Var, k7.b6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                    frameLayout4.addView(textView2, k7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                } else {
                    frameLayout4.addView(zd0Var, k7.b6.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                addView(frameLayout4, k7.b6.l(1.0f, -1, 0));
            }
        }
        i10 = 8;
        frameLayout.setVisibility(i10);
        addView(frameLayout, k7.b6.e(-1, -2, 1));
        TextView textView5 = new TextView(context);
        this.b = textView5;
        ai.o(18.0f, 1, textView5);
        textView5.setText(LocaleController.getString(pg0Var.C != 3 ? R.string.CheckYourNewEmail : z4 ? R.string.VerificationCode : R.string.CheckYourEmail));
        textView5.setGravity(17);
        textView5.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView5, k7.b6.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        ih.s sVar2 = new ih.s(context, null, false);
        this.c = sVar2;
        sVar2.setTextSize(1, 14.0f);
        sVar2.setGravity(17);
        sVar2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(sVar2, k7.b6.t(-2, -2, 1, 24, 8, 24, 0));
        xd0 xd0Var2 = new xd0(this, context, 0);
        this.a = xd0Var2;
        addView(xd0Var2, k7.b6.t(-2, 42, 1, 0, !z4 ? 48 : 32, 0, 0));
        TextView textView22 = new TextView(context);
        this.d = textView22;
        textView22.setGravity(17);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView22.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        final int i142 = 2;
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(org.telegram.messenger.beta.R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.lz(i142), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.SignInWithGoogle));
        textView22.setText(spannableStringBuilder2);
        textView22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wd0
            public final /* synthetic */ ae0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15;
                switch (i13) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        ae0 ae0Var = this.b;
                        globalInstance.addObserver(new yd0(ae0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = ae0Var.getContext();
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
                        a8.e a2 = k7.y.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new ss(23, ae0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        ae0 ae0Var2 = this.b;
                        TextView textView32 = ae0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            ae0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ae0Var2.I;
                            tL_auth_resendCode.phone_code_hash = ae0Var2.J;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ae0Var2.F);
                            bundle.putString("ephone", ae0Var2.G);
                            bundle.putString("phoneFormated", ae0Var2.I);
                            i15 = ((org.telegram.ui.ActionBar.p2) ae0Var2.T).currentAccount;
                            ConnectionsManager.getInstance(i15).sendRequest(tL_auth_resendCode, new da(ae0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.h = frameLayout22;
        AndroidUtilities.updateViewVisibilityAnimated(frameLayout22, pg0Var.C == 3 && !z4, 1.0f, false);
        gg.q qVar3 = new gg.q(context, 27);
        this.n = qVar3;
        qVar3.setText(LocaleController.getString(R.string.LoginCantAccessThisEmail));
        qVar3.setGravity(17);
        qVar3.setTextSize(1, 14.0f);
        qVar3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        qVar3.setMaxLines(2);
        qVar3.setOnClickListener(new ib0(i12, this, context));
        frameLayout22.addView(qVar3);
        gg.q qVar22 = new gg.q(context, 28);
        this.r = qVar22;
        qVar22.setGravity(17);
        qVar22.setTextSize(1, 14.0f);
        qVar22.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        qVar22.setMaxLines(3);
        qVar22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wd0
            public final /* synthetic */ ae0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15;
                switch (i11) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        ae0 ae0Var = this.b;
                        globalInstance.addObserver(new yd0(ae0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = ae0Var.getContext();
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
                        a8.e a2 = k7.y.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new ss(23, ae0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        ae0 ae0Var2 = this.b;
                        TextView textView32 = ae0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            ae0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ae0Var2.I;
                            tL_auth_resendCode.phone_code_hash = ae0Var2.J;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ae0Var2.F);
                            bundle.putString("ephone", ae0Var2.G);
                            bundle.putString("phoneFormated", ae0Var2.I);
                            i15 = ((org.telegram.ui.ActionBar.p2) ae0Var2.T).currentAccount;
                            ConnectionsManager.getInstance(i15).sendRequest(tL_auth_resendCode, new da(ae0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        qVar22.setPadding(0, AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f));
        qVar22.setVisibility(8);
        frameLayout22.addView(qVar22);
        TextView textView32 = new TextView(context);
        this.f = textView32;
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView32.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        textView32.setMaxLines(2);
        textView32.setText(LocaleController.getString(R.string.ResendCode));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.wd0
            public final /* synthetic */ ae0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i15;
                switch (i142) {
                    case 0:
                        NotificationCenter globalInstance = NotificationCenter.getGlobalInstance();
                        ae0 ae0Var = this.b;
                        globalInstance.addObserver(new yd0(ae0Var), NotificationCenter.onActivityResultReceived);
                        Context context2 = ae0Var.getContext();
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
                        a8.e a2 = k7.y.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a2.g().addOnCompleteListener(new ss(23, ae0Var, a2));
                        break;
                    case 1:
                        this.b.p();
                        break;
                    default:
                        ae0 ae0Var2 = this.b;
                        TextView textView322 = ae0Var2.f;
                        if (textView322.getVisibility() == 0 && textView322.getAlpha() == 1.0f) {
                            ae0Var2.q(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ae0Var2.I;
                            tL_auth_resendCode.phone_code_hash = ae0Var2.J;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ae0Var2.F);
                            bundle.putString("ephone", ae0Var2.G);
                            bundle.putString("phoneFormated", ae0Var2.I);
                            i15 = ((org.telegram.ui.ActionBar.p2) ae0Var2.T).currentAccount;
                            ConnectionsManager.getInstance(i15).sendRequest(tL_auth_resendCode, new da(ae0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        AndroidUtilities.updateViewVisibilityAnimated(textView32, false, 1.0f, false);
        org.telegram.ui.Components.m90 m90Var2 = new org.telegram.ui.Components.m90(context);
        this.v = m90Var2;
        n7.qa.V(m90Var2);
        zd0 zd0Var2 = new zd0(context, i13);
        this.N = zd0Var2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
        org.telegram.ui.Components.mr mrVar2 = org.telegram.ui.Components.ft.e;
        loadAnimation3.setInterpolator(mrVar2);
        zd0Var2.setInAnimation(loadAnimation3);
        Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        loadAnimation22.setInterpolator(mrVar2);
        zd0Var2.setOutAnimation(loadAnimation22);
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.e = frameLayout32;
        frameLayout32.addView(textView32, k7.b6.e(-2, -2, 17));
        zd0Var2.addView(frameLayout32);
        TextView textView42 = new TextView(context);
        this.s = textView42;
        textView42.setText(LocaleController.getString("WrongCode", R.string.WrongCode));
        textView42.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        textView42.setTextSize(1, 15.0f);
        textView42.setGravity(49);
        textView42.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
        zd0Var2.addView(textView42);
        FrameLayout frameLayout42 = new FrameLayout(context);
        if (z4) {
        }
        addView(frameLayout42, k7.b6.l(1.0f, -1, 0));
    }

    @Override // org.telegram.ui.Components.vv0
    public final void g() {
        if (this.E != 0) {
            AndroidUtilities.cancelRunOnUIThread(this.R);
        }
    }

    @Override // org.telegram.ui.Components.vv0
    public String getHeaderName() {
        return LocaleController.getString(R.string.VerificationCode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.vv0
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i10;
        if (this.B) {
            return;
        }
        AndroidUtilities.cancelRunOnUIThread(this.Q);
        xd0 xd0Var = this.a;
        xd0Var.e = true;
        ds[] dsVarArr = xd0Var.f;
        if (dsVarArr != null) {
            for (ds dsVar : dsVarArr) {
                dsVar.j(0.0f);
            }
        }
        String code = xd0Var.getCode();
        int length = code.length();
        pg0 pg0Var = this.T;
        if (length == 0 && this.C == null) {
            if (pg0Var.getParentActivity() == null) {
                return;
            }
            try {
                xd0Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (ds dsVar2 : xd0Var.f) {
                dsVar2.i(1.0f);
            }
            xd0Var.f[0].requestFocus();
            AndroidUtilities.shakeViewSpring(xd0Var, new td0(this, 1));
            return;
        }
        this.B = true;
        pg0Var.n1(0, true);
        if (pg0Var.C == 3) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode.code = code;
            verifyemail.verification = tL_emailVerificationCode;
            tL_auth_signIn = verifyemail;
        } else if (this.K) {
            TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup.phone_number = this.I;
            tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.J;
            verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode2.code = code;
            verifyemail2.verification = tL_emailVerificationCode2;
            tL_auth_signIn = verifyemail2;
        } else {
            TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
            tL_auth_signIn2.phone_number = this.I;
            tL_auth_signIn2.phone_code_hash = this.J;
            if (this.C != null) {
                TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                tL_emailVerificationGoogle.token = this.C.c;
                tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
            } else {
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode3.code = code;
                tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
            }
            tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
            tL_auth_signIn = tL_auth_signIn2;
        }
        xd0Var.e = true;
        ds[] dsVarArr2 = xd0Var.f;
        if (dsVarArr2 != null) {
            for (ds dsVar3 : dsVarArr2) {
                dsVar3.j(0.0f);
            }
        }
        i10 = ((org.telegram.ui.ActionBar.p2) pg0Var).currentAccount;
        ConnectionsManager.getInstance(i10).sendRequest(tL_auth_signIn, new qd0(this, code, 0), 10);
    }

    @Override // org.telegram.ui.Components.vv0
    public final void j() {
        if (this.x) {
            this.x = false;
        } else {
            AndroidUtilities.runOnUIThread(new td0(this, 8), pg0.q0);
        }
    }

    @Override // org.telegram.ui.Components.vv0
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

    @Override // org.telegram.ui.Components.vv0
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

    @Override // org.telegram.ui.Components.vv0
    public final void m(Bundle bundle, boolean z4) {
        if (bundle == null) {
            return;
        }
        this.y = bundle;
        this.I = bundle.getString("phoneFormated");
        this.J = this.y.getString("phoneHash");
        this.F = this.y.getString("phone");
        this.G = this.y.getString("ephone");
        this.K = this.y.getBoolean("setup");
        this.L = this.y.getInt("length");
        this.H = this.y.getString("email");
        this.D = this.y.getInt("resetAvailablePeriod");
        this.E = this.y.getInt("resetPendingDate");
        pg0 pg0Var = this.T;
        int i10 = pg0Var.C;
        int i11 = 8;
        FrameLayout frameLayout = this.h;
        ih.s sVar = this.c;
        if (i10 == 3) {
            sVar.setText(LocaleController.formatString(R.string.CheckYourNewEmailSubtitle, this.H));
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
        } else if (this.M) {
            sVar.setText(LocaleController.formatString(R.string.VerificationCodeSubtitle, this.H));
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, false, 1.0f, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(frameLayout, true, 1.0f, false);
            this.n.setVisibility(this.E == 0 ? 0 : 8);
            this.r.setVisibility(this.E != 0 ? 0 : 8);
            if (this.E != 0) {
                r();
            }
        }
        int i12 = this.L;
        xd0 xd0Var = this.a;
        xd0Var.b(i12, 1);
        for (ds dsVar : xd0Var.f) {
            dsVar.setShowSoftInputOnFocusCompat(AndroidUtilities.isAccessibilityTouchExplorationEnabled());
            dsVar.addTextChangedListener(new p0(this, 7));
            dsVar.setOnFocusChangeListener(new sd(this, 2));
        }
        xd0Var.setText("");
        if (!this.K && pg0Var.C != 3) {
            String string = this.y.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                org.telegram.ui.Components.s01 s01Var = new org.telegram.ui.Components.s01();
                s01Var.a |= 256;
                s01Var.b = indexOf;
                int i13 = lastIndexOf + 1;
                s01Var.c = i13;
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.t01(s01Var, 0), indexOf, i13, 0);
            }
            sVar.setText(AndroidUtilities.formatSpannable(LocaleController.getString(R.string.CheckYourEmailSubtitle), spannableStringBuilder));
        }
        if (bundle.getBoolean("googleSignInAllowed") && PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices()) {
            i11 = 0;
        }
        this.v.setVisibility(i11);
        this.d.setVisibility(i11);
        pg0.T0(pg0Var, xd0Var.f[0]);
        xd0Var.requestFocus();
        if (!z4 && bundle.containsKey("nextType")) {
            AndroidUtilities.runOnUIThread(this.Q, bundle.getInt("timeout"));
        }
        if (this.E != 0) {
            AndroidUtilities.runOnUIThread(this.R, 1000L);
        }
    }

    @Override // org.telegram.ui.Components.vv0
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
        if (this.C != null) {
            runnable.run();
            return;
        }
        int i10 = 0;
        while (true) {
            xd0 xd0Var = this.a;
            if (i10 >= xd0Var.f.length) {
                xd0Var.postDelayed(new w10(28, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                xd0Var.postDelayed(new org.telegram.ui.Components.dw(this, i10, 15), i10 * 75);
                i10++;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.P);
        removeCallbacks(this.Q);
    }

    public final void p() {
        if (this.S) {
            return;
        }
        this.S = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.F);
        bundle.putString("ephone", this.G);
        bundle.putString("phoneFormated", this.I);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.I;
        tL_auth_resetLoginEmail.phone_code_hash = this.J;
        this.T.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new rd0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    public final void q(boolean z4) {
        AndroidUtilities.updateViewVisibilityAnimated(this.f, z4);
        AndroidUtilities.updateViewVisibilityAnimated(this.h, (z4 || this.T.C == 3 || this.M) ? false : true);
        org.telegram.ui.Components.m90 m90Var = this.v;
        if (m90Var.getVisibility() != 8) {
            m90Var.setLayoutParams(k7.b6.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z4 ? 8.0f : 16.0f));
            m90Var.requestLayout();
        }
    }

    public final void r() {
        String formatString;
        int currentTimeMillis = (int) (this.E - (System.currentTimeMillis() / 1000));
        int i10 = this.E;
        int i11 = 0;
        gg.q qVar = this.r;
        if (i10 <= 0 || currentTimeMillis <= 0) {
            qVar.setVisibility(0);
            qVar.setText(LocaleController.getString(R.string.LoginEmailResetPleaseWait));
            AndroidUtilities.runOnUIThread(new td0(this, i11), 1000L);
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
            StringBuilder sb = new StringBuilder();
            sb.append(i15 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i15)) : "");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "%02d:", Integer.valueOf(i17)));
            sb.append(String.format(locale, "%02d", Integer.valueOf(i18)));
            formatString = LocaleController.formatString(R.string.LoginEmailResetInSinglePattern, sb.toString());
        }
        String formatString2 = LocaleController.formatString(i12, formatString);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(formatString2);
        int indexOf = formatString2.indexOf(42);
        int lastIndexOf = formatString2.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
            valueOf.setSpan(new ForegroundColorSpan(this.T.getThemedColor(org.telegram.ui.ActionBar.j6.q6)), indexOf, lastIndexOf - 1, 33);
        }
        qVar.setText(valueOf);
        AndroidUtilities.runOnUIThread(this.R, 1000L);
    }
}
