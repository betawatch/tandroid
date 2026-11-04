package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lb0 extends org.telegram.ui.Components.vt0 {
    public Bundle E;
    public boolean F;
    public GoogleSignInAccount G;
    public int H;
    public int I;
    public String J;
    public String K;
    public String L;
    public String M;
    public String N;
    public boolean O;
    public int P;
    public final boolean Q;
    public final kb0 R;
    public boolean S;
    public final db0 T;
    public final db0 U;
    public final db0 V;
    public boolean W;
    public final ib0 a;
    public final /* synthetic */ xd0 a0;
    public final TextView b;
    public final yh.l c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final jb0 n;
    public final jb0 r;
    public final TextView s;
    public final org.telegram.ui.Components.z70 w;
    public final org.telegram.ui.Components.fh0 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lb0(xd0 xd0Var, Context context, boolean z10) {
        super(context);
        int i3;
        this.a0 = xd0Var;
        this.T = new db0(this, 4);
        this.U = new db0(this, 6);
        this.V = new db0(this, 7);
        this.Q = z10;
        final int i10 = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.fh0 fh0Var = new org.telegram.ui.Components.fh0(context);
        this.x = fh0Var;
        if (!z10 || xd0Var.G == 3) {
            fh0Var.f(R.raw.email_check_inbox, 120, 120, null);
        } else {
            fh0Var.f(R.raw.email_setup_heart, 120, 120, null);
        }
        final int i11 = 0;
        fh0Var.setAutoRepeat(false);
        frameLayout.addView(fh0Var, b8.mf.e(120, 120, 1));
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i3 = 0;
                frameLayout.setVisibility(i3);
                addView(frameLayout, b8.mf.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                k2.p1.t(textView, 1, 18.0f);
                textView.setText(org.telegram.messenger.bd.M0(xd0Var.G != 3 ? 2131752143 : z10 ? 2131743629 : 2131752145, null));
                textView.setGravity(17);
                textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(textView, b8.mf.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                yh.l lVar = new yh.l(context, null, false);
                this.c = lVar;
                lVar.setTextSize(1, 14.0f);
                lVar.setGravity(17);
                lVar.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(lVar, b8.mf.t(-2, -2, 1, 24, 8, 24, 0));
                ib0 ib0Var = new ib0(0, context, this);
                this.a = ib0Var;
                addView(ib0Var, b8.mf.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setGravity(17);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView2.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                final int i12 = 2;
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.fy(i12), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131745331, null));
                textView2.setText(spannableStringBuilder);
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gb0
                    public final /* synthetic */ lb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i11) {
                            case 0:
                                org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
                                lb0 lb0Var = this.b;
                                e10.b(new z4(lb0Var, 1), org.telegram.messenger.hs.c5);
                                Context context2 = lb0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.r2.h;
                                p6.m.e(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                a9.j0 a10 = b8.h1.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a10.g().addOnCompleteListener(new org.telegram.ui.Components.i41(28, lb0Var, a10));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                lb0 lb0Var2 = this.b;
                                TextView textView3 = lb0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    lb0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = lb0Var2.M;
                                    tL_auth_resendCode.phone_code_hash = lb0Var2.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", lb0Var2.J);
                                    bundle.putString("ephone", lb0Var2.K);
                                    bundle.putString("phoneFormated", lb0Var2.M);
                                    i13 = ((org.telegram.ui.ActionBar.d2) lb0Var2.a0).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(lb0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                org.telegram.messenger.g0.Z3(frameLayout2, xd0Var.G == 3 && !z10, 1.0f, true, false);
                jb0 jb0Var = new jb0(context, i11);
                this.n = jb0Var;
                jb0Var.setText(org.telegram.messenger.bd.M0(2131748745, null));
                jb0Var.setGravity(17);
                jb0Var.setTextSize(1, 14.0f);
                jb0Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                jb0Var.setMaxLines(2);
                jb0Var.setOnClickListener(new hb0(i11, this, context));
                frameLayout2.addView(jb0Var);
                jb0 jb0Var2 = new jb0(context, i10);
                this.r = jb0Var2;
                jb0Var2.setGravity(17);
                jb0Var2.setTextSize(1, 14.0f);
                jb0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                jb0Var2.setMaxLines(3);
                jb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gb0
                    public final /* synthetic */ lb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i10) {
                            case 0:
                                org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
                                lb0 lb0Var = this.b;
                                e10.b(new z4(lb0Var, 1), org.telegram.messenger.hs.c5);
                                Context context2 = lb0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.r2.h;
                                p6.m.e(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                a9.j0 a10 = b8.h1.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a10.g().addOnCompleteListener(new org.telegram.ui.Components.i41(28, lb0Var, a10));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                lb0 lb0Var2 = this.b;
                                TextView textView3 = lb0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    lb0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = lb0Var2.M;
                                    tL_auth_resendCode.phone_code_hash = lb0Var2.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", lb0Var2.J);
                                    bundle.putString("ephone", lb0Var2.K);
                                    bundle.putString("phoneFormated", lb0Var2.M);
                                    i13 = ((org.telegram.ui.ActionBar.d2) lb0Var2.a0).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(lb0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                jb0Var2.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
                jb0Var2.setVisibility(8);
                frameLayout2.addView(jb0Var2);
                TextView textView3 = new TextView(context);
                this.f = textView3;
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                textView3.setMaxLines(2);
                textView3.setText(org.telegram.messenger.bd.M0(2131746131, null));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gb0
                    public final /* synthetic */ lb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i12) {
                            case 0:
                                org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
                                lb0 lb0Var = this.b;
                                e10.b(new z4(lb0Var, 1), org.telegram.messenger.hs.c5);
                                Context context2 = lb0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.r2.h;
                                p6.m.e(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                a9.j0 a10 = b8.h1.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a10.g().addOnCompleteListener(new org.telegram.ui.Components.i41(28, lb0Var, a10));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                lb0 lb0Var2 = this.b;
                                TextView textView32 = lb0Var2.f;
                                if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                                    lb0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = lb0Var2.M;
                                    tL_auth_resendCode.phone_code_hash = lb0Var2.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", lb0Var2.J);
                                    bundle.putString("ephone", lb0Var2.K);
                                    bundle.putString("phoneFormated", lb0Var2.M);
                                    i13 = ((org.telegram.ui.ActionBar.d2) lb0Var2.a0).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(lb0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                org.telegram.messenger.g0.Z3(textView3, false, 1.0f, true, false);
                org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(context);
                this.w = z70Var;
                k4.j.k(z70Var);
                kb0 kb0Var = new kb0(context, i11);
                this.R = kb0Var;
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.ks.e;
                loadAnimation.setInterpolator(xqVar);
                kb0Var.setInAnimation(loadAnimation);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                loadAnimation2.setInterpolator(xqVar);
                kb0Var.setOutAnimation(loadAnimation2);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.e = frameLayout3;
                frameLayout3.addView(textView3, b8.mf.e(-2, -2, 17));
                kb0Var.addView(frameLayout3);
                TextView textView4 = new TextView(context);
                this.s = textView4;
                textView4.setText(org.telegram.messenger.bd.M0(2131742871, "WrongCode"));
                textView4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                kb0Var.addView(textView4);
                FrameLayout frameLayout4 = new FrameLayout(context);
                if (z10) {
                    frameLayout4.addView(kb0Var, b8.mf.e(-1, -2, 48));
                    frameLayout4.addView(frameLayout2, b8.mf.e(-1, -2, 48));
                    frameLayout4.addView(z70Var, b8.mf.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                    frameLayout4.addView(textView2, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                } else {
                    frameLayout4.addView(kb0Var, b8.mf.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                addView(frameLayout4, b8.mf.l(1.0f, -1, 0));
            }
        }
        i3 = 8;
        frameLayout.setVisibility(i3);
        addView(frameLayout, b8.mf.e(-1, -2, 1));
        TextView textView5 = new TextView(context);
        this.b = textView5;
        k2.p1.t(textView5, 1, 18.0f);
        textView5.setText(org.telegram.messenger.bd.M0(xd0Var.G != 3 ? 2131752143 : z10 ? 2131743629 : 2131752145, null));
        textView5.setGravity(17);
        textView5.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView5, b8.mf.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        yh.l lVar2 = new yh.l(context, null, false);
        this.c = lVar2;
        lVar2.setTextSize(1, 14.0f);
        lVar2.setGravity(17);
        lVar2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(lVar2, b8.mf.t(-2, -2, 1, 24, 8, 24, 0));
        ib0 ib0Var2 = new ib0(0, context, this);
        this.a = ib0Var2;
        addView(ib0Var2, b8.mf.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
        TextView textView22 = new TextView(context);
        this.d = textView22;
        textView22.setGravity(17);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView22.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        final int i122 = 2;
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.fy(i122), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131745331, null));
        textView22.setText(spannableStringBuilder2);
        textView22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gb0
            public final /* synthetic */ lb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
                        lb0 lb0Var = this.b;
                        e10.b(new z4(lb0Var, 1), org.telegram.messenger.hs.c5);
                        Context context2 = lb0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.r2.h;
                        p6.m.e(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        a9.j0 a10 = b8.h1.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a10.g().addOnCompleteListener(new org.telegram.ui.Components.i41(28, lb0Var, a10));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        lb0 lb0Var2 = this.b;
                        TextView textView32 = lb0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            lb0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = lb0Var2.M;
                            tL_auth_resendCode.phone_code_hash = lb0Var2.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", lb0Var2.J);
                            bundle.putString("ephone", lb0Var2.K);
                            bundle.putString("phoneFormated", lb0Var2.M);
                            i13 = ((org.telegram.ui.ActionBar.d2) lb0Var2.a0).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(lb0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.h = frameLayout22;
        org.telegram.messenger.g0.Z3(frameLayout22, xd0Var.G == 3 && !z10, 1.0f, true, false);
        jb0 jb0Var3 = new jb0(context, i11);
        this.n = jb0Var3;
        jb0Var3.setText(org.telegram.messenger.bd.M0(2131748745, null));
        jb0Var3.setGravity(17);
        jb0Var3.setTextSize(1, 14.0f);
        jb0Var3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        jb0Var3.setMaxLines(2);
        jb0Var3.setOnClickListener(new hb0(i11, this, context));
        frameLayout22.addView(jb0Var3);
        jb0 jb0Var22 = new jb0(context, i10);
        this.r = jb0Var22;
        jb0Var22.setGravity(17);
        jb0Var22.setTextSize(1, 14.0f);
        jb0Var22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        jb0Var22.setMaxLines(3);
        jb0Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gb0
            public final /* synthetic */ lb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i10) {
                    case 0:
                        org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
                        lb0 lb0Var = this.b;
                        e10.b(new z4(lb0Var, 1), org.telegram.messenger.hs.c5);
                        Context context2 = lb0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.r2.h;
                        p6.m.e(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        a9.j0 a10 = b8.h1.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a10.g().addOnCompleteListener(new org.telegram.ui.Components.i41(28, lb0Var, a10));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        lb0 lb0Var2 = this.b;
                        TextView textView32 = lb0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            lb0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = lb0Var2.M;
                            tL_auth_resendCode.phone_code_hash = lb0Var2.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", lb0Var2.J);
                            bundle.putString("ephone", lb0Var2.K);
                            bundle.putString("phoneFormated", lb0Var2.M);
                            i13 = ((org.telegram.ui.ActionBar.d2) lb0Var2.a0).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(lb0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        jb0Var22.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
        jb0Var22.setVisibility(8);
        frameLayout22.addView(jb0Var22);
        TextView textView32 = new TextView(context);
        this.f = textView32;
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView32.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        textView32.setMaxLines(2);
        textView32.setText(org.telegram.messenger.bd.M0(2131746131, null));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.gb0
            public final /* synthetic */ lb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i122) {
                    case 0:
                        org.telegram.messenger.hs e10 = org.telegram.messenger.hs.e();
                        lb0 lb0Var = this.b;
                        e10.b(new z4(lb0Var, 1), org.telegram.messenger.hs.c5);
                        Context context2 = lb0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.r2.h;
                        p6.m.e(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        a9.j0 a10 = b8.h1.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a10.g().addOnCompleteListener(new org.telegram.ui.Components.i41(28, lb0Var, a10));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        lb0 lb0Var2 = this.b;
                        TextView textView322 = lb0Var2.f;
                        if (textView322.getVisibility() == 0 && textView322.getAlpha() == 1.0f) {
                            lb0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = lb0Var2.M;
                            tL_auth_resendCode.phone_code_hash = lb0Var2.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", lb0Var2.J);
                            bundle.putString("ephone", lb0Var2.K);
                            bundle.putString("phoneFormated", lb0Var2.M);
                            i13 = ((org.telegram.ui.ActionBar.d2) lb0Var2.a0).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new y9(lb0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.messenger.g0.Z3(textView32, false, 1.0f, true, false);
        org.telegram.ui.Components.z70 z70Var2 = new org.telegram.ui.Components.z70(context);
        this.w = z70Var2;
        k4.j.k(z70Var2);
        kb0 kb0Var2 = new kb0(context, i11);
        this.R = kb0Var2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
        org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.ks.e;
        loadAnimation3.setInterpolator(xqVar2);
        kb0Var2.setInAnimation(loadAnimation3);
        Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        loadAnimation22.setInterpolator(xqVar2);
        kb0Var2.setOutAnimation(loadAnimation22);
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.e = frameLayout32;
        frameLayout32.addView(textView32, b8.mf.e(-2, -2, 17));
        kb0Var2.addView(frameLayout32);
        TextView textView42 = new TextView(context);
        this.s = textView42;
        textView42.setText(org.telegram.messenger.bd.M0(2131742871, "WrongCode"));
        textView42.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView42.setTextSize(1, 15.0f);
        textView42.setGravity(49);
        textView42.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        kb0Var2.addView(textView42);
        FrameLayout frameLayout42 = new FrameLayout(context);
        if (z10) {
        }
        addView(frameLayout42, b8.mf.l(1.0f, -1, 0));
    }

    @Override // org.telegram.ui.Components.vt0
    public final void g() {
        if (this.I != 0) {
            org.telegram.messenger.g0.r(this.V);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public String getHeaderName() {
        return org.telegram.messenger.bd.M0(2131743629, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.vt0
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i3;
        if (this.F) {
            return;
        }
        org.telegram.messenger.g0.r(this.U);
        ib0 ib0Var = this.a;
        ib0Var.e = true;
        zq[] zqVarArr = ib0Var.f;
        if (zqVarArr != null) {
            for (zq zqVar : zqVarArr) {
                zqVar.A(0.0f);
            }
        }
        String code = ib0Var.getCode();
        int length = code.length();
        xd0 xd0Var = this.a0;
        if (length == 0 && this.G == null) {
            if (xd0Var.getParentActivity() == null) {
                return;
            }
            try {
                ib0Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (zq zqVar2 : ib0Var.f) {
                zqVar2.z(1.0f);
            }
            ib0Var.f[0].requestFocus();
            org.telegram.messenger.g0.G3(10.0f, ib0Var, new db0(this, 1));
            return;
        }
        this.F = true;
        xd0Var.w1(0, true);
        if (xd0Var.G == 3) {
            TL_account.verifyEmail verifyemail = new TL_account.verifyEmail();
            verifyemail.purpose = new TLRPC.TL_emailVerifyPurposeLoginChange();
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode.code = code;
            verifyemail.verification = tL_emailVerificationCode;
            tL_auth_signIn = verifyemail;
        } else if (this.O) {
            TL_account.verifyEmail verifyemail2 = new TL_account.verifyEmail();
            TLRPC.TL_emailVerifyPurposeLoginSetup tL_emailVerifyPurposeLoginSetup = new TLRPC.TL_emailVerifyPurposeLoginSetup();
            tL_emailVerifyPurposeLoginSetup.phone_number = this.M;
            tL_emailVerifyPurposeLoginSetup.phone_code_hash = this.N;
            verifyemail2.purpose = tL_emailVerifyPurposeLoginSetup;
            TLRPC.TL_emailVerificationCode tL_emailVerificationCode2 = new TLRPC.TL_emailVerificationCode();
            tL_emailVerificationCode2.code = code;
            verifyemail2.verification = tL_emailVerificationCode2;
            tL_auth_signIn = verifyemail2;
        } else {
            TLRPC.TL_auth_signIn tL_auth_signIn2 = new TLRPC.TL_auth_signIn();
            tL_auth_signIn2.phone_number = this.M;
            tL_auth_signIn2.phone_code_hash = this.N;
            if (this.G != null) {
                TLRPC.TL_emailVerificationGoogle tL_emailVerificationGoogle = new TLRPC.TL_emailVerificationGoogle();
                tL_emailVerificationGoogle.token = this.G.b;
                tL_auth_signIn2.email_verification = tL_emailVerificationGoogle;
            } else {
                TLRPC.TL_emailVerificationCode tL_emailVerificationCode3 = new TLRPC.TL_emailVerificationCode();
                tL_emailVerificationCode3.code = code;
                tL_auth_signIn2.email_verification = tL_emailVerificationCode3;
            }
            tL_auth_signIn2.flags = 2 | tL_auth_signIn2.flags;
            tL_auth_signIn = tL_auth_signIn2;
        }
        ib0Var.e = true;
        zq[] zqVarArr2 = ib0Var.f;
        if (zqVarArr2 != null) {
            for (zq zqVar3 : zqVarArr2) {
                zqVar3.A(0.0f);
            }
        }
        i3 = ((org.telegram.ui.ActionBar.d2) xd0Var).currentAccount;
        ConnectionsManager.getInstance(i3).sendRequest(tL_auth_signIn, new ab0(this, code, 0), 10);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void j() {
        if (this.y) {
            this.y = false;
        } else {
            org.telegram.messenger.g0.i3(new db0(this, 8), xd0.z0);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("emailcode_params");
        this.E = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("emailcode_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void l(Bundle bundle) {
        String code = this.a.getCode();
        if (code != null && code.length() != 0) {
            bundle.putString("emailcode_code", code);
        }
        Bundle bundle2 = this.E;
        if (bundle2 != null) {
            bundle.putBundle("emailcode_params", bundle2);
        }
    }

    @Override // org.telegram.ui.Components.vt0
    public final void m(Bundle bundle, boolean z10) {
        if (bundle == null) {
            return;
        }
        this.E = bundle;
        this.M = bundle.getString("phoneFormated");
        this.N = this.E.getString("phoneHash");
        this.J = this.E.getString("phone");
        this.K = this.E.getString("ephone");
        this.O = this.E.getBoolean("setup");
        this.P = this.E.getInt("length");
        this.L = this.E.getString("email");
        this.H = this.E.getInt("resetAvailablePeriod");
        this.I = this.E.getInt("resetPendingDate");
        xd0 xd0Var = this.a0;
        int i3 = xd0Var.G;
        int i10 = 8;
        FrameLayout frameLayout = this.h;
        yh.l lVar = this.c;
        if (i3 == 3) {
            lVar.setText(org.telegram.messenger.bd.a0(null, null, 2131752142, this.L));
            org.telegram.messenger.g0.Z3(frameLayout, false, 1.0f, true, false);
        } else if (this.Q) {
            lVar.setText(org.telegram.messenger.bd.a0(null, null, 2131743628, this.L));
            org.telegram.messenger.g0.Z3(frameLayout, false, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.Z3(frameLayout, true, 1.0f, true, false);
            this.n.setVisibility(this.I == 0 ? 0 : 8);
            this.r.setVisibility(this.I != 0 ? 0 : 8);
            if (this.I != 0) {
                q();
            }
        }
        int i11 = this.P;
        ib0 ib0Var = this.a;
        ib0Var.b(i11, 1);
        for (zq zqVar : ib0Var.f) {
            zqVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.g0.C1());
            zqVar.addTextChangedListener(new n0(this, 9));
            zqVar.setOnFocusChangeListener(new ed(this, 2));
        }
        ib0Var.setText("");
        if (!this.O && xd0Var.G != 3) {
            String string = this.E.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                org.telegram.ui.Components.ty0 ty0Var = new org.telegram.ui.Components.ty0();
                ty0Var.a |= 256;
                ty0Var.b = indexOf;
                int i12 = lastIndexOf + 1;
                ty0Var.c = i12;
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.uy0(ty0Var, 0), indexOf, i12, 0);
            }
            lVar.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.bd.M0(2131752144, null), spannableStringBuilder));
        }
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.lt.b.hasServices()) {
            i10 = 0;
        }
        this.w.setVisibility(i10);
        this.d.setVisibility(i10);
        xd0.a1(xd0Var, ib0Var.f[0]);
        ib0Var.requestFocus();
        if (!z10 && bundle.containsKey("nextType")) {
            org.telegram.messenger.g0.i3(this.U, bundle.getInt("timeout"));
        }
        if (this.I != 0) {
            org.telegram.messenger.g0.i3(this.V, 1000L);
        }
    }

    public final void n(Runnable runnable) {
        if (this.G != null) {
            runnable.run();
            return;
        }
        int i3 = 0;
        while (true) {
            ib0 ib0Var = this.a;
            if (i3 >= ib0Var.f.length) {
                ib0Var.postDelayed(new ly(29, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                ib0Var.postDelayed(new org.telegram.ui.Components.o2(this, i3, 18), i3 * 75);
                i3++;
            }
        }
    }

    public final void o() {
        if (this.W) {
            return;
        }
        this.W = true;
        Bundle bundle = new Bundle();
        bundle.putString("phone", this.J);
        bundle.putString("ephone", this.K);
        bundle.putString("phoneFormated", this.M);
        TLRPC.TL_auth_resetLoginEmail tL_auth_resetLoginEmail = new TLRPC.TL_auth_resetLoginEmail();
        tL_auth_resetLoginEmail.phone_number = this.M;
        tL_auth_resetLoginEmail.phone_code_hash = this.N;
        this.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new bb0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        removeCallbacks(this.U);
    }

    public final void p(boolean z10) {
        org.telegram.messenger.g0.X3(this.f, z10);
        org.telegram.messenger.g0.X3(this.h, (z10 || this.a0.G == 3 || this.Q) ? false : true);
        org.telegram.ui.Components.z70 z70Var = this.w;
        if (z70Var.getVisibility() != 8) {
            z70Var.setLayoutParams(b8.mf.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z10 ? 8.0f : 16.0f));
            z70Var.requestLayout();
        }
    }

    public final void q() {
        String a02;
        int currentTimeMillis = (int) (this.I - (System.currentTimeMillis() / 1000));
        int i3 = this.I;
        int i10 = 0;
        jb0 jb0Var = this.r;
        if (i3 <= 0 || currentTimeMillis <= 0) {
            jb0Var.setVisibility(0);
            jb0Var.setText(org.telegram.messenger.bd.M0(2131748739, null));
            org.telegram.messenger.g0.i3(new db0(this, i10), 1000L);
            return;
        }
        int i11 = currentTimeMillis / 86400;
        int i12 = currentTimeMillis % 86400;
        int i13 = i12 / 3600;
        int i14 = i12 % 3600;
        int i15 = i14 / 60;
        int i16 = i14 % 60;
        if (i13 >= 16) {
            i11++;
        }
        if (i11 != 0) {
            a02 = org.telegram.messenger.bd.a0(null, null, 2131748742, org.telegram.messenger.bd.G(i11, "Days", new Object[0]));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i13 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i13)) : "");
            Locale locale = Locale.ROOT;
            sb2.append(String.format(locale, "%02d:", Integer.valueOf(i15)));
            sb2.append(String.format(locale, "%02d", Integer.valueOf(i16)));
            a02 = org.telegram.messenger.bd.a0(null, null, 2131748742, sb2.toString());
        }
        String a03 = org.telegram.messenger.bd.a0(null, null, 2131748741, a02);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a03);
        int indexOf = a03.indexOf(42);
        int lastIndexOf = a03.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
            valueOf.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.q6, this.a0.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
        }
        jb0Var.setText(valueOf);
        org.telegram.messenger.g0.i3(this.V, 1000L);
    }

    @Override // org.telegram.ui.Components.vt0
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G6, false));
        int i3 = org.telegram.ui.ActionBar.k6.D6;
        this.c.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        int i10 = org.telegram.ui.ActionBar.k6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.w.updateColors();
        this.f.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i10, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, i3, false));
        this.s.setTextColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q7, false));
        this.a.invalidate();
    }
}
