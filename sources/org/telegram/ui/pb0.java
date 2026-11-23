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

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class pb0 extends org.telegram.ui.Components.iu0 {
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
    public final ob0 R;
    public boolean S;
    public final ib0 T;
    public final ib0 U;
    public final ib0 V;
    public boolean W;
    public final mb0 a;
    public final /* synthetic */ de0 a0;
    public final TextView b;
    public final xh.l c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final nb0 n;
    public final nb0 r;
    public final TextView s;
    public final org.telegram.ui.Components.t80 w;
    public final org.telegram.ui.Components.rh0 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pb0(de0 de0Var, Context context, boolean z10) {
        super(context);
        int i7;
        this.a0 = de0Var;
        this.T = new ib0(this, 4);
        this.U = new ib0(this, 6);
        this.V = new ib0(this, 7);
        this.Q = z10;
        final int i10 = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.rh0 rh0Var = new org.telegram.ui.Components.rh0(context);
        this.x = rh0Var;
        if (!z10 || de0Var.G == 3) {
            rh0Var.f(R.raw.email_check_inbox, 120, 120, null);
        } else {
            rh0Var.f(R.raw.email_setup_heart, 120, 120, null);
        }
        final int i11 = 0;
        rh0Var.setAutoRepeat(false);
        frameLayout.addView(rh0Var, c8.ma.e(120, 120, 1));
        if (!org.telegram.messenger.g0.O1()) {
            Point point = org.telegram.messenger.g0.q;
            if (point.x <= point.y || org.telegram.messenger.g0.Q1()) {
                i7 = 0;
                frameLayout.setVisibility(i7);
                addView(frameLayout, c8.ma.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                i5.c.x(textView, 1, 18.0f);
                textView.setText(org.telegram.messenger.hd.N0(de0Var.G != 3 ? 2131752131 : z10 ? 2131743374 : 2131752133, null));
                textView.setGravity(17);
                textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(textView, c8.ma.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                xh.l lVar = new xh.l(context, null, false);
                this.c = lVar;
                lVar.setTextSize(1, 14.0f);
                lVar.setGravity(17);
                lVar.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                addView(lVar, c8.ma.t(-2, -2, 1, 24, 8, 24, 0));
                mb0 mb0Var = new mb0(0, context, this);
                this.a = mb0Var;
                addView(mb0Var, c8.ma.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
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
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.uy(i12), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.hd.N0(2131745125, null));
                textView2.setText(spannableStringBuilder);
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lb0
                    public final /* synthetic */ pb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i11) {
                            case 0:
                                org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
                                pb0 pb0Var = this.b;
                                e10.b(new x4(pb0Var, 1), org.telegram.messenger.ls.f5);
                                Context context2 = pb0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.s2.h;
                                q6.m.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                b9.k0 a10 = a8.v7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a10.g().addOnCompleteListener(new at(21, pb0Var, a10));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                pb0 pb0Var2 = this.b;
                                TextView textView3 = pb0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    pb0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = pb0Var2.M;
                                    tL_auth_resendCode.phone_code_hash = pb0Var2.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", pb0Var2.J);
                                    bundle.putString("ephone", pb0Var2.K);
                                    bundle.putString("phoneFormated", pb0Var2.M);
                                    i13 = ((org.telegram.ui.ActionBar.g2) pb0Var2.a0).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(pb0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                org.telegram.messenger.g0.X3(frameLayout2, de0Var.G == 3 && !z10, 1.0f, true, false);
                nb0 nb0Var = new nb0(context, i11);
                this.n = nb0Var;
                nb0Var.setText(org.telegram.messenger.hd.N0(2131748544, null));
                nb0Var.setGravity(17);
                nb0Var.setTextSize(1, 14.0f);
                nb0Var.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                nb0Var.setMaxLines(2);
                nb0Var.setOnClickListener(new org.telegram.ui.Components.q31(26, this, context));
                frameLayout2.addView(nb0Var);
                nb0 nb0Var2 = new nb0(context, i10);
                this.r = nb0Var2;
                nb0Var2.setGravity(17);
                nb0Var2.setTextSize(1, 14.0f);
                nb0Var2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                nb0Var2.setMaxLines(3);
                nb0Var2.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lb0
                    public final /* synthetic */ pb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i10) {
                            case 0:
                                org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
                                pb0 pb0Var = this.b;
                                e10.b(new x4(pb0Var, 1), org.telegram.messenger.ls.f5);
                                Context context2 = pb0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.s2.h;
                                q6.m.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                b9.k0 a10 = a8.v7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a10.g().addOnCompleteListener(new at(21, pb0Var, a10));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                pb0 pb0Var2 = this.b;
                                TextView textView3 = pb0Var2.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    pb0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = pb0Var2.M;
                                    tL_auth_resendCode.phone_code_hash = pb0Var2.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", pb0Var2.J);
                                    bundle.putString("ephone", pb0Var2.K);
                                    bundle.putString("phoneFormated", pb0Var2.M);
                                    i13 = ((org.telegram.ui.ActionBar.g2) pb0Var2.a0).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(pb0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                nb0Var2.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
                nb0Var2.setVisibility(8);
                frameLayout2.addView(nb0Var2);
                TextView textView3 = new TextView(context);
                this.f = textView3;
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                textView3.setMaxLines(2);
                textView3.setText(org.telegram.messenger.hd.N0(2131745925, null));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lb0
                    public final /* synthetic */ pb0 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i13;
                        switch (i12) {
                            case 0:
                                org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
                                pb0 pb0Var = this.b;
                                e10.b(new x4(pb0Var, 1), org.telegram.messenger.ls.f5);
                                Context context2 = pb0Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = org.telegram.messenger.s2.h;
                                q6.m.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                b9.k0 a10 = a8.v7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a10.g().addOnCompleteListener(new at(21, pb0Var, a10));
                                break;
                            case 1:
                                this.b.o();
                                break;
                            default:
                                pb0 pb0Var2 = this.b;
                                TextView textView32 = pb0Var2.f;
                                if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                                    pb0Var2.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = pb0Var2.M;
                                    tL_auth_resendCode.phone_code_hash = pb0Var2.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", pb0Var2.J);
                                    bundle.putString("ephone", pb0Var2.K);
                                    bundle.putString("phoneFormated", pb0Var2.M);
                                    i13 = ((org.telegram.ui.ActionBar.g2) pb0Var2.a0).currentAccount;
                                    ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(pb0Var2, bundle, tL_auth_resendCode, 20), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                org.telegram.messenger.g0.X3(textView3, false, 1.0f, true, false);
                org.telegram.ui.Components.t80 t80Var = new org.telegram.ui.Components.t80(context);
                this.w = t80Var;
                h6.m.i(t80Var);
                ob0 ob0Var = new ob0(context, i11);
                this.R = ob0Var;
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                org.telegram.ui.Components.nr nrVar = org.telegram.ui.Components.zs.e;
                loadAnimation.setInterpolator(nrVar);
                ob0Var.setInAnimation(loadAnimation);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                loadAnimation2.setInterpolator(nrVar);
                ob0Var.setOutAnimation(loadAnimation2);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.e = frameLayout3;
                frameLayout3.addView(textView3, c8.ma.e(-2, -2, 17));
                ob0Var.addView(frameLayout3);
                TextView textView4 = new TextView(context);
                this.s = textView4;
                textView4.setText(org.telegram.messenger.hd.N0(2131742595, "WrongCode"));
                textView4.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                ob0Var.addView(textView4);
                FrameLayout frameLayout4 = new FrameLayout(context);
                if (z10) {
                    frameLayout4.addView(ob0Var, c8.ma.e(-1, -2, 48));
                    frameLayout4.addView(frameLayout2, c8.ma.e(-1, -2, 48));
                    frameLayout4.addView(t80Var, c8.ma.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                    frameLayout4.addView(textView2, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                } else {
                    frameLayout4.addView(ob0Var, c8.ma.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                addView(frameLayout4, c8.ma.l(1.0f, -1, 0));
            }
        }
        i7 = 8;
        frameLayout.setVisibility(i7);
        addView(frameLayout, c8.ma.e(-1, -2, 1));
        TextView textView5 = new TextView(context);
        this.b = textView5;
        i5.c.x(textView5, 1, 18.0f);
        textView5.setText(org.telegram.messenger.hd.N0(de0Var.G != 3 ? 2131752131 : z10 ? 2131743374 : 2131752133, null));
        textView5.setGravity(17);
        textView5.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView5, c8.ma.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        xh.l lVar2 = new xh.l(context, null, false);
        this.c = lVar2;
        lVar2.setTextSize(1, 14.0f);
        lVar2.setGravity(17);
        lVar2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(lVar2, c8.ma.t(-2, -2, 1, 24, 8, 24, 0));
        mb0 mb0Var2 = new mb0(0, context, this);
        this.a = mb0Var2;
        addView(mb0Var2, c8.ma.t(-2, 42, 1, 0, !z10 ? 48 : 32, 0, 0));
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
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.uy(i122), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.hd.N0(2131745125, null));
        textView22.setText(spannableStringBuilder2);
        textView22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lb0
            public final /* synthetic */ pb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i11) {
                    case 0:
                        org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
                        pb0 pb0Var = this.b;
                        e10.b(new x4(pb0Var, 1), org.telegram.messenger.ls.f5);
                        Context context2 = pb0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.s2.h;
                        q6.m.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        b9.k0 a10 = a8.v7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a10.g().addOnCompleteListener(new at(21, pb0Var, a10));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        pb0 pb0Var2 = this.b;
                        TextView textView32 = pb0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            pb0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = pb0Var2.M;
                            tL_auth_resendCode.phone_code_hash = pb0Var2.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", pb0Var2.J);
                            bundle.putString("ephone", pb0Var2.K);
                            bundle.putString("phoneFormated", pb0Var2.M);
                            i13 = ((org.telegram.ui.ActionBar.g2) pb0Var2.a0).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(pb0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.h = frameLayout22;
        org.telegram.messenger.g0.X3(frameLayout22, de0Var.G == 3 && !z10, 1.0f, true, false);
        nb0 nb0Var3 = new nb0(context, i11);
        this.n = nb0Var3;
        nb0Var3.setText(org.telegram.messenger.hd.N0(2131748544, null));
        nb0Var3.setGravity(17);
        nb0Var3.setTextSize(1, 14.0f);
        nb0Var3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        nb0Var3.setMaxLines(2);
        nb0Var3.setOnClickListener(new org.telegram.ui.Components.q31(26, this, context));
        frameLayout22.addView(nb0Var3);
        nb0 nb0Var22 = new nb0(context, i10);
        this.r = nb0Var22;
        nb0Var22.setGravity(17);
        nb0Var22.setTextSize(1, 14.0f);
        nb0Var22.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        nb0Var22.setMaxLines(3);
        nb0Var22.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lb0
            public final /* synthetic */ pb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i10) {
                    case 0:
                        org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
                        pb0 pb0Var = this.b;
                        e10.b(new x4(pb0Var, 1), org.telegram.messenger.ls.f5);
                        Context context2 = pb0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.s2.h;
                        q6.m.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        b9.k0 a10 = a8.v7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a10.g().addOnCompleteListener(new at(21, pb0Var, a10));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        pb0 pb0Var2 = this.b;
                        TextView textView32 = pb0Var2.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            pb0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = pb0Var2.M;
                            tL_auth_resendCode.phone_code_hash = pb0Var2.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", pb0Var2.J);
                            bundle.putString("ephone", pb0Var2.K);
                            bundle.putString("phoneFormated", pb0Var2.M);
                            i13 = ((org.telegram.ui.ActionBar.g2) pb0Var2.a0).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(pb0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        nb0Var22.setPadding(0, org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f));
        nb0Var22.setVisibility(8);
        frameLayout22.addView(nb0Var22);
        TextView textView32 = new TextView(context);
        this.f = textView32;
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView32.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        textView32.setMaxLines(2);
        textView32.setText(org.telegram.messenger.hd.N0(2131745925, null));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: org.telegram.ui.lb0
            public final /* synthetic */ pb0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i13;
                switch (i122) {
                    case 0:
                        org.telegram.messenger.ls e10 = org.telegram.messenger.ls.e();
                        pb0 pb0Var = this.b;
                        e10.b(new x4(pb0Var, 1), org.telegram.messenger.ls.f5);
                        Context context2 = pb0Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = org.telegram.messenger.s2.h;
                        q6.m.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        b9.k0 a10 = a8.v7.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a10.g().addOnCompleteListener(new at(21, pb0Var, a10));
                        break;
                    case 1:
                        this.b.o();
                        break;
                    default:
                        pb0 pb0Var2 = this.b;
                        TextView textView322 = pb0Var2.f;
                        if (textView322.getVisibility() == 0 && textView322.getAlpha() == 1.0f) {
                            pb0Var2.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = pb0Var2.M;
                            tL_auth_resendCode.phone_code_hash = pb0Var2.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", pb0Var2.J);
                            bundle.putString("ephone", pb0Var2.K);
                            bundle.putString("phoneFormated", pb0Var2.M);
                            i13 = ((org.telegram.ui.ActionBar.g2) pb0Var2.a0).currentAccount;
                            ConnectionsManager.getInstance(i13).sendRequest(tL_auth_resendCode, new z9(pb0Var2, bundle, tL_auth_resendCode, 20), 10);
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.messenger.g0.X3(textView32, false, 1.0f, true, false);
        org.telegram.ui.Components.t80 t80Var2 = new org.telegram.ui.Components.t80(context);
        this.w = t80Var2;
        h6.m.i(t80Var2);
        ob0 ob0Var2 = new ob0(context, i11);
        this.R = ob0Var2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
        org.telegram.ui.Components.nr nrVar2 = org.telegram.ui.Components.zs.e;
        loadAnimation3.setInterpolator(nrVar2);
        ob0Var2.setInAnimation(loadAnimation3);
        Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        loadAnimation22.setInterpolator(nrVar2);
        ob0Var2.setOutAnimation(loadAnimation22);
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.e = frameLayout32;
        frameLayout32.addView(textView32, c8.ma.e(-2, -2, 17));
        ob0Var2.addView(frameLayout32);
        TextView textView42 = new TextView(context);
        this.s = textView42;
        textView42.setText(org.telegram.messenger.hd.N0(2131742595, "WrongCode"));
        textView42.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        textView42.setTextSize(1, 15.0f);
        textView42.setGravity(49);
        textView42.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
        ob0Var2.addView(textView42);
        FrameLayout frameLayout42 = new FrameLayout(context);
        if (z10) {
        }
        addView(frameLayout42, c8.ma.l(1.0f, -1, 0));
    }

    @Override // org.telegram.ui.Components.iu0
    public final void g() {
        if (this.I != 0) {
            org.telegram.messenger.g0.r(this.V);
        }
    }

    @Override // org.telegram.ui.Components.iu0
    public String getHeaderName() {
        return org.telegram.messenger.hd.N0(2131743374, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.Components.iu0
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i7;
        if (this.F) {
            return;
        }
        org.telegram.messenger.g0.r(this.U);
        mb0 mb0Var = this.a;
        mb0Var.e = true;
        er[] erVarArr = mb0Var.f;
        if (erVarArr != null) {
            for (er erVar : erVarArr) {
                erVar.B(0.0f);
            }
        }
        String code = mb0Var.getCode();
        int length = code.length();
        de0 de0Var = this.a0;
        if (length == 0 && this.G == null) {
            if (de0Var.getParentActivity() == null) {
                return;
            }
            try {
                mb0Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (er erVar2 : mb0Var.f) {
                erVar2.A(1.0f);
            }
            mb0Var.f[0].requestFocus();
            org.telegram.messenger.g0.E3(10.0f, mb0Var, new ib0(this, 1));
            return;
        }
        this.F = true;
        de0Var.F1(0, true);
        if (de0Var.G == 3) {
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
        mb0Var.e = true;
        er[] erVarArr2 = mb0Var.f;
        if (erVarArr2 != null) {
            for (er erVar3 : erVarArr2) {
                erVar3.B(0.0f);
            }
        }
        i7 = ((org.telegram.ui.ActionBar.g2) de0Var).currentAccount;
        ConnectionsManager.getInstance(i7).sendRequest(tL_auth_signIn, new fb0(this, code, 0), 10);
    }

    @Override // org.telegram.ui.Components.iu0
    public final void j() {
        if (this.y) {
            this.y = false;
        } else {
            org.telegram.messenger.g0.h3(new ib0(this, 8), de0.A0);
        }
    }

    @Override // org.telegram.ui.Components.iu0
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

    @Override // org.telegram.ui.Components.iu0
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

    @Override // org.telegram.ui.Components.iu0
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
        de0 de0Var = this.a0;
        int i7 = de0Var.G;
        int i10 = 8;
        FrameLayout frameLayout = this.h;
        xh.l lVar = this.c;
        if (i7 == 3) {
            lVar.setText(org.telegram.messenger.hd.a0(null, null, 2131752130, this.L));
            org.telegram.messenger.g0.X3(frameLayout, false, 1.0f, true, false);
        } else if (this.Q) {
            lVar.setText(org.telegram.messenger.hd.a0(null, null, 2131743373, this.L));
            org.telegram.messenger.g0.X3(frameLayout, false, 1.0f, true, false);
        } else {
            org.telegram.messenger.g0.X3(frameLayout, true, 1.0f, true, false);
            this.n.setVisibility(this.I == 0 ? 0 : 8);
            this.r.setVisibility(this.I != 0 ? 0 : 8);
            if (this.I != 0) {
                q();
            }
        }
        int i11 = this.P;
        mb0 mb0Var = this.a;
        mb0Var.b(i11, 1);
        for (er erVar : mb0Var.f) {
            erVar.setShowSoftInputOnFocusCompat(org.telegram.messenger.g0.C1());
            erVar.addTextChangedListener(new m0(this, 9));
            erVar.setOnFocusChangeListener(new ed(this, 2));
        }
        mb0Var.setText("");
        if (!this.O && de0Var.G != 3) {
            String string = this.E.getString("emailPattern");
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                org.telegram.ui.Components.fz0 fz0Var = new org.telegram.ui.Components.fz0();
                fz0Var.a |= 256;
                fz0Var.b = indexOf;
                int i12 = lastIndexOf + 1;
                fz0Var.c = i12;
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.gz0(fz0Var, 0), indexOf, i12, 0);
            }
            lVar.setText(org.telegram.messenger.g0.m0(org.telegram.messenger.hd.N0(2131752132, null), spannableStringBuilder));
        }
        if (bundle.getBoolean("googleSignInAllowed") && org.telegram.messenger.ot.b.hasServices()) {
            i10 = 0;
        }
        this.w.setVisibility(i10);
        this.d.setVisibility(i10);
        de0.b1(de0Var, mb0Var.f[0]);
        mb0Var.requestFocus();
        if (!z10 && bundle.containsKey("nextType")) {
            org.telegram.messenger.g0.h3(this.U, bundle.getInt("timeout"));
        }
        if (this.I != 0) {
            org.telegram.messenger.g0.h3(this.V, 1000L);
        }
    }

    public final void n(Runnable runnable) {
        if (this.G != null) {
            runnable.run();
            return;
        }
        int i7 = 0;
        while (true) {
            mb0 mb0Var = this.a;
            if (i7 >= mb0Var.f.length) {
                mb0Var.postDelayed(new h60(17, this, runnable), (r2.length * 75) + 400);
                return;
            } else {
                mb0Var.postDelayed(new ii(this, i7, 24), i7 * 75);
                i7++;
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
        this.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new gb0(this, bundle, tL_auth_resetLoginEmail, 0), 10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        removeCallbacks(this.U);
    }

    public final void p(boolean z10) {
        org.telegram.messenger.g0.V3(this.f, z10);
        org.telegram.messenger.g0.V3(this.h, (z10 || this.a0.G == 3 || this.Q) ? false : true);
        org.telegram.ui.Components.t80 t80Var = this.w;
        if (t80Var.getVisibility() != 8) {
            t80Var.setLayoutParams(c8.ma.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z10 ? 8.0f : 16.0f));
            t80Var.requestLayout();
        }
    }

    public final void q() {
        String a02;
        int currentTimeMillis = (int) (this.I - (System.currentTimeMillis() / 1000));
        int i7 = this.I;
        int i10 = 0;
        nb0 nb0Var = this.r;
        if (i7 <= 0 || currentTimeMillis <= 0) {
            nb0Var.setVisibility(0);
            nb0Var.setText(org.telegram.messenger.hd.N0(2131748538, null));
            org.telegram.messenger.g0.h3(new ib0(this, i10), 1000L);
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
            a02 = org.telegram.messenger.hd.a0(null, null, 2131748541, org.telegram.messenger.hd.G(i11, "Days", new Object[0]));
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i13 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i13)) : "");
            Locale locale = Locale.ROOT;
            sb2.append(String.format(locale, "%02d:", Integer.valueOf(i15)));
            sb2.append(String.format(locale, "%02d", Integer.valueOf(i16)));
            a02 = org.telegram.messenger.hd.a0(null, null, 2131748541, sb2.toString());
        }
        String a03 = org.telegram.messenger.hd.a0(null, null, 2131748540, a02);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a03);
        int indexOf = a03.indexOf(42);
        int lastIndexOf = a03.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
            valueOf.setSpan(new org.telegram.ui.Components.k00(org.telegram.ui.ActionBar.m6.q6, this.a0.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
        }
        nb0Var.setText(valueOf);
        org.telegram.messenger.g0.h3(this.V, 1000L);
    }

    @Override // org.telegram.ui.Components.iu0
    public final void updateColors() {
        this.b.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.G6, false));
        int i7 = org.telegram.ui.ActionBar.m6.D6;
        this.c.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        int i10 = org.telegram.ui.ActionBar.m6.q6;
        this.d.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.w.updateColors();
        this.f.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.n.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i10, false));
        this.r.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, i7, false));
        this.s.setTextColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q7, false));
        this.a.invalidate();
    }
}
