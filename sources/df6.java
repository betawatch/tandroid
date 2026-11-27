// default package

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
import org.telegram.messenger.b;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class df6 extends cna {
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
    public final cf6 R;
    public boolean S;
    public final xe6 T;
    public final xe6 U;
    public final xe6 V;
    public boolean W;
    public final bf6 a;
    public final /* synthetic */ qh6 a0;
    public final TextView b;
    public final tpa c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final xb n;
    public final xb r;
    public final TextView s;
    public final rh6 w;
    public final e29 x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public df6(qh6 qh6Var, Context context, boolean z) {
        super(context);
        int i;
        this.a0 = qh6Var;
        this.T = new xe6(this, (byte) 4);
        this.U = new xe6(this, (byte) 6);
        this.V = new xe6(this, (byte) 7);
        this.Q = z;
        final byte b = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        e29 e29Var = new e29(context);
        this.x = e29Var;
        if (!z || qh6Var.G == 3) {
            e29Var.f(R.raw.email_check_inbox, jn7.E1, jn7.E1, null);
        } else {
            e29Var.f(R.raw.email_setup_heart, jn7.E1, jn7.E1, null);
        }
        final byte b2 = 0;
        e29Var.setAutoRepeat(false);
        frameLayout.addView(e29Var, tre.e(jn7.E1, jn7.E1, 1));
        if (!hl.M1()) {
            Point point = hl.q;
            if (point.x <= point.y || hl.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, tre.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                bs2.t(textView, 1, 18.0f);
                textView.setText(ob6.M0(qh6Var.G != 3 ? 2131752108 : z ? 2131743274 : 2131752110, null));
                textView.setGravity(17);
                textView.setLineSpacing(hl.L(2.0f), 1.0f);
                addView(textView, tre.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                tpa tpaVar = new tpa(null, context, false);
                this.c = tpaVar;
                tpaVar.setTextSize(1, 14.0f);
                tpaVar.setGravity(17);
                tpaVar.setLineSpacing(hl.L(2.0f), 1.0f);
                addView(tpaVar, tre.t(-2, -2, 1, 24, 8, 24, 0));
                bf6 bf6Var = new bf6((byte) 0, context, this);
                this.a = bf6Var;
                addView(bf6Var, tre.t(-2, 42, 1, 0, !z ? 48 : 32, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setGravity(17);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(hl.L(2.0f), 1.0f);
                textView2.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
                final byte b3 = 2;
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, hl.L(9.0f), hl.L(18.0f), hl.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new fy2(b3), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) ob6.M0(2131745049, null));
                textView2.setText(spannableStringBuilder);
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: af6
                    public final /* synthetic */ df6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2;
                        byte b4 = b2;
                        df6 df6Var = this.b;
                        switch (b4) {
                            case 0:
                                jn7.e().a(new zb0(df6Var, (byte) 1), jn7.f5);
                                Context context2 = df6Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = f11.h;
                                xve.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                qa4 a = sne.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a.k().addOnCompleteListener(new u34(df6Var, a, (byte) 22));
                                break;
                            case 1:
                                df6Var.o();
                                break;
                            default:
                                TextView textView3 = df6Var.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    df6Var.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = df6Var.M;
                                    tL_auth_resendCode.phone_code_hash = df6Var.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", df6Var.J);
                                    bundle.putString("ephone", df6Var.K);
                                    bundle.putString("phoneFormated", df6Var.M);
                                    i2 = ((e) df6Var.a0).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new m65(df6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                hl.T3(frameLayout2, qh6Var.G == 3 && !z, 1.0f, true, false);
                xb xbVar = new xb(context, (byte) 24);
                this.n = xbVar;
                xbVar.setText(ob6.M0(2131748491, null));
                xbVar.setGravity(17);
                xbVar.setTextSize(1, 14.0f);
                xbVar.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
                xbVar.setMaxLines(2);
                xbVar.setOnClickListener(new uv5(this, context, (byte) 7));
                frameLayout2.addView(xbVar);
                xb xbVar2 = new xb(context, (byte) 25);
                this.r = xbVar2;
                xbVar2.setGravity(17);
                xbVar2.setTextSize(1, 14.0f);
                xbVar2.setLineSpacing(hl.L(2.0f), 1.0f);
                xbVar2.setMaxLines(3);
                xbVar2.setOnClickListener(new View.OnClickListener(this) { // from class: af6
                    public final /* synthetic */ df6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2;
                        byte b4 = b;
                        df6 df6Var = this.b;
                        switch (b4) {
                            case 0:
                                jn7.e().a(new zb0(df6Var, (byte) 1), jn7.f5);
                                Context context2 = df6Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = f11.h;
                                xve.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                qa4 a = sne.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a.k().addOnCompleteListener(new u34(df6Var, a, (byte) 22));
                                break;
                            case 1:
                                df6Var.o();
                                break;
                            default:
                                TextView textView3 = df6Var.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    df6Var.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = df6Var.M;
                                    tL_auth_resendCode.phone_code_hash = df6Var.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", df6Var.J);
                                    bundle.putString("ephone", df6Var.K);
                                    bundle.putString("phoneFormated", df6Var.M);
                                    i2 = ((e) df6Var.a0).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new m65(df6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                xbVar2.setPadding(0, hl.L(16.0f), 0, hl.L(16.0f));
                xbVar2.setVisibility(8);
                frameLayout2.addView(xbVar2);
                TextView textView3 = new TextView(context);
                this.f = textView3;
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setLineSpacing(hl.L(2.0f), 1.0f);
                textView3.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
                textView3.setMaxLines(2);
                textView3.setText(ob6.M0(2131745848, null));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: af6
                    public final /* synthetic */ df6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2;
                        byte b4 = b3;
                        df6 df6Var = this.b;
                        switch (b4) {
                            case 0:
                                jn7.e().a(new zb0(df6Var, (byte) 1), jn7.f5);
                                Context context2 = df6Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = f11.h;
                                xve.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                qa4 a = sne.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a.k().addOnCompleteListener(new u34(df6Var, a, (byte) 22));
                                break;
                            case 1:
                                df6Var.o();
                                break;
                            default:
                                TextView textView32 = df6Var.f;
                                if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                                    df6Var.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = df6Var.M;
                                    tL_auth_resendCode.phone_code_hash = df6Var.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", df6Var.J);
                                    bundle.putString("ephone", df6Var.K);
                                    bundle.putString("phoneFormated", df6Var.M);
                                    i2 = ((e) df6Var.a0).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new m65(df6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                hl.T3(textView3, false, 1.0f, true, false);
                rh6 rh6Var = new rh6(context);
                this.w = rh6Var;
                ko9.e(rh6Var);
                cf6 cf6Var = new cf6(context, b2);
                this.R = cf6Var;
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                k43 k43Var = dt3.e;
                loadAnimation.setInterpolator(k43Var);
                cf6Var.setInAnimation(loadAnimation);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                loadAnimation2.setInterpolator(k43Var);
                cf6Var.setOutAnimation(loadAnimation2);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.e = frameLayout3;
                frameLayout3.addView(textView3, tre.e(-2, -2, 17));
                cf6Var.addView(frameLayout3);
                TextView textView4 = new TextView(context);
                this.s = textView4;
                textView4.setText(ob6.M0(2131742492, "WrongCode"));
                textView4.setLineSpacing(hl.L(2.0f), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
                cf6Var.addView(textView4);
                FrameLayout frameLayout4 = new FrameLayout(context);
                if (z) {
                    frameLayout4.addView(cf6Var, tre.e(-1, -2, 48));
                    frameLayout4.addView(frameLayout2, tre.e(-1, -2, 48));
                    frameLayout4.addView(rh6Var, tre.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                    frameLayout4.addView(textView2, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                } else {
                    frameLayout4.addView(cf6Var, tre.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                addView(frameLayout4, tre.l(1.0f, -1, 0));
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, tre.e(-1, -2, 1));
        TextView textView5 = new TextView(context);
        this.b = textView5;
        bs2.t(textView5, 1, 18.0f);
        textView5.setText(ob6.M0(qh6Var.G != 3 ? 2131752108 : z ? 2131743274 : 2131752110, null));
        textView5.setGravity(17);
        textView5.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(textView5, tre.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        tpa tpaVar2 = new tpa(null, context, false);
        this.c = tpaVar2;
        tpaVar2.setTextSize(1, 14.0f);
        tpaVar2.setGravity(17);
        tpaVar2.setLineSpacing(hl.L(2.0f), 1.0f);
        addView(tpaVar2, tre.t(-2, -2, 1, 24, 8, 24, 0));
        bf6 bf6Var2 = new bf6((byte) 0, context, this);
        this.a = bf6Var2;
        addView(bf6Var2, tre.t(-2, 42, 1, 0, !z ? 48 : 32, 0, 0));
        TextView textView22 = new TextView(context);
        this.d = textView22;
        textView22.setGravity(17);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(hl.L(2.0f), 1.0f);
        textView22.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        final byte b32 = 2;
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, hl.L(9.0f), hl.L(18.0f), hl.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new fy2(b32), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) ob6.M0(2131745049, null));
        textView22.setText(spannableStringBuilder2);
        textView22.setOnClickListener(new View.OnClickListener(this) { // from class: af6
            public final /* synthetic */ df6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                byte b4 = b2;
                df6 df6Var = this.b;
                switch (b4) {
                    case 0:
                        jn7.e().a(new zb0(df6Var, (byte) 1), jn7.f5);
                        Context context2 = df6Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = f11.h;
                        xve.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        qa4 a = sne.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a.k().addOnCompleteListener(new u34(df6Var, a, (byte) 22));
                        break;
                    case 1:
                        df6Var.o();
                        break;
                    default:
                        TextView textView32 = df6Var.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            df6Var.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = df6Var.M;
                            tL_auth_resendCode.phone_code_hash = df6Var.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", df6Var.J);
                            bundle.putString("ephone", df6Var.K);
                            bundle.putString("phoneFormated", df6Var.M);
                            i2 = ((e) df6Var.a0).currentAccount;
                            ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new m65(df6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.h = frameLayout22;
        hl.T3(frameLayout22, qh6Var.G == 3 && !z, 1.0f, true, false);
        xb xbVar3 = new xb(context, (byte) 24);
        this.n = xbVar3;
        xbVar3.setText(ob6.M0(2131748491, null));
        xbVar3.setGravity(17);
        xbVar3.setTextSize(1, 14.0f);
        xbVar3.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        xbVar3.setMaxLines(2);
        xbVar3.setOnClickListener(new uv5(this, context, (byte) 7));
        frameLayout22.addView(xbVar3);
        xb xbVar22 = new xb(context, (byte) 25);
        this.r = xbVar22;
        xbVar22.setGravity(17);
        xbVar22.setTextSize(1, 14.0f);
        xbVar22.setLineSpacing(hl.L(2.0f), 1.0f);
        xbVar22.setMaxLines(3);
        xbVar22.setOnClickListener(new View.OnClickListener(this) { // from class: af6
            public final /* synthetic */ df6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                byte b4 = b;
                df6 df6Var = this.b;
                switch (b4) {
                    case 0:
                        jn7.e().a(new zb0(df6Var, (byte) 1), jn7.f5);
                        Context context2 = df6Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = f11.h;
                        xve.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        qa4 a = sne.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a.k().addOnCompleteListener(new u34(df6Var, a, (byte) 22));
                        break;
                    case 1:
                        df6Var.o();
                        break;
                    default:
                        TextView textView32 = df6Var.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            df6Var.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = df6Var.M;
                            tL_auth_resendCode.phone_code_hash = df6Var.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", df6Var.J);
                            bundle.putString("ephone", df6Var.K);
                            bundle.putString("phoneFormated", df6Var.M);
                            i2 = ((e) df6Var.a0).currentAccount;
                            ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new m65(df6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                            break;
                        }
                        break;
                }
            }
        });
        xbVar22.setPadding(0, hl.L(16.0f), 0, hl.L(16.0f));
        xbVar22.setVisibility(8);
        frameLayout22.addView(xbVar22);
        TextView textView32 = new TextView(context);
        this.f = textView32;
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setLineSpacing(hl.L(2.0f), 1.0f);
        textView32.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        textView32.setMaxLines(2);
        textView32.setText(ob6.M0(2131745848, null));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: af6
            public final /* synthetic */ df6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                byte b4 = b32;
                df6 df6Var = this.b;
                switch (b4) {
                    case 0:
                        jn7.e().a(new zb0(df6Var, (byte) 1), jn7.f5);
                        Context context2 = df6Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = f11.h;
                        xve.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        qa4 a = sne.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a.k().addOnCompleteListener(new u34(df6Var, a, (byte) 22));
                        break;
                    case 1:
                        df6Var.o();
                        break;
                    default:
                        TextView textView322 = df6Var.f;
                        if (textView322.getVisibility() == 0 && textView322.getAlpha() == 1.0f) {
                            df6Var.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = df6Var.M;
                            tL_auth_resendCode.phone_code_hash = df6Var.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", df6Var.J);
                            bundle.putString("ephone", df6Var.K);
                            bundle.putString("phoneFormated", df6Var.M);
                            i2 = ((e) df6Var.a0).currentAccount;
                            ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new m65(df6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                            break;
                        }
                        break;
                }
            }
        });
        hl.T3(textView32, false, 1.0f, true, false);
        rh6 rh6Var2 = new rh6(context);
        this.w = rh6Var2;
        ko9.e(rh6Var2);
        cf6 cf6Var2 = new cf6(context, b2);
        this.R = cf6Var2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
        k43 k43Var2 = dt3.e;
        loadAnimation3.setInterpolator(k43Var2);
        cf6Var2.setInAnimation(loadAnimation3);
        Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        loadAnimation22.setInterpolator(k43Var2);
        cf6Var2.setOutAnimation(loadAnimation22);
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.e = frameLayout32;
        frameLayout32.addView(textView32, tre.e(-2, -2, 17));
        cf6Var2.addView(frameLayout32);
        TextView textView42 = new TextView(context);
        this.s = textView42;
        textView42.setText(ob6.M0(2131742492, "WrongCode"));
        textView42.setLineSpacing(hl.L(2.0f), 1.0f);
        textView42.setTextSize(1, 15.0f);
        textView42.setGravity(49);
        textView42.setPadding(hl.L(16.0f), hl.L(16.0f), hl.L(16.0f), hl.L(16.0f));
        cf6Var2.addView(textView42);
        FrameLayout frameLayout42 = new FrameLayout(context);
        if (z) {
        }
        addView(frameLayout42, tre.l(1.0f, -1, 0));
    }

    @Override // cna
    public final void g() {
        if (this.I != 0) {
            hl.r(this.V);
        }
    }

    @Override // cna
    public String getHeaderName() {
        return ob6.M0(2131743274, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // cna
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i;
        if (this.F) {
            return;
        }
        hl.r(this.U);
        bf6 bf6Var = this.a;
        byte b = 1;
        bf6Var.e = true;
        ok2[] ok2VarArr = bf6Var.f;
        byte b2 = 0;
        if (ok2VarArr != null) {
            for (ok2 ok2Var : ok2VarArr) {
                ok2Var.B(0.0f);
            }
        }
        String code = bf6Var.getCode();
        int length = code.length();
        qh6 qh6Var = this.a0;
        if (length == 0 && this.G == null) {
            if (qh6Var.getParentActivity() == null) {
                return;
            }
            try {
                bf6Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (ok2 ok2Var2 : bf6Var.f) {
                ok2Var2.A(1.0f);
            }
            bf6Var.f[0].requestFocus();
            hl.A3(10.0f, bf6Var, new xe6(this, b));
            return;
        }
        this.F = true;
        qh6Var.B1(0, true);
        if (qh6Var.G == 3) {
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
            tL_auth_signIn2.flags |= 2;
            tL_auth_signIn = tL_auth_signIn2;
        }
        bf6Var.e = true;
        ok2[] ok2VarArr2 = bf6Var.f;
        if (ok2VarArr2 != null) {
            for (ok2 ok2Var3 : ok2VarArr2) {
                ok2Var3.B(0.0f);
            }
        }
        i = ((e) qh6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_signIn, new ue6(this, code, b2), 10);
    }

    @Override // cna
    public final void j() {
        if (this.y) {
            this.y = false;
        } else {
            hl.d3(new xe6(this, (byte) 8), qh6.A0);
        }
    }

    @Override // cna
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

    @Override // cna
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

    @Override // cna
    public final void m(Bundle bundle, boolean z) {
        if (bundle != null) {
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
            qh6 qh6Var = this.a0;
            byte b = qh6Var.G;
            int i = 8;
            FrameLayout frameLayout = this.h;
            tpa tpaVar = this.c;
            if (b == 3) {
                tpaVar.setText(ob6.a0(null, null, 2131752107, this.L));
                hl.T3(frameLayout, false, 1.0f, true, false);
            } else if (this.Q) {
                tpaVar.setText(ob6.a0(null, null, 2131743273, this.L));
                hl.T3(frameLayout, false, 1.0f, true, false);
            } else {
                hl.T3(frameLayout, true, 1.0f, true, false);
                this.n.setVisibility(this.I == 0 ? 0 : 8);
                this.r.setVisibility(this.I != 0 ? 0 : 8);
                if (this.I != 0) {
                    q();
                }
            }
            int i2 = this.P;
            bf6 bf6Var = this.a;
            bf6Var.b(i2, 1);
            for (ok2 ok2Var : bf6Var.f) {
                ok2Var.setShowSoftInputOnFocusCompat(hl.A1());
                ok2Var.addTextChangedListener(new c7(this, (byte) 27));
                ok2Var.setOnFocusChangeListener(new ts0(this, (byte) 6));
            }
            bf6Var.setText("");
            if (!this.O && qh6Var.G != 3) {
                String string = this.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    rmb rmbVar = new rmb();
                    rmbVar.a |= 256;
                    rmbVar.b = indexOf;
                    int i3 = lastIndexOf + 1;
                    rmbVar.c = i3;
                    spannableStringBuilder.setSpan(new smb(rmbVar, 0), indexOf, i3, 0);
                }
                tpaVar.setText(hl.m0(ob6.M0(2131752109, null), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && b.b.hasServices()) {
                i = 0;
            }
            this.w.setVisibility(i);
            this.d.setVisibility(i);
            qh6Var.M1(bf6Var.f[0]);
            bf6Var.requestFocus();
            if (!z && bundle.containsKey("nextType")) {
                hl.d3(this.U, bundle.getInt("timeout"));
            }
            if (this.I != 0) {
                hl.d3(this.V, 1000L);
            }
        }
    }

    public final void n(Runnable runnable) {
        if (this.G != null) {
            runnable.run();
            return;
        }
        int i = 0;
        while (true) {
            bf6 bf6Var = this.a;
            if (i >= bf6Var.f.length) {
                bf6Var.postDelayed(new z56(this, runnable, (byte) 12), (r2.length * 75) + 400);
                return;
            } else {
                bf6Var.postDelayed(new hl3((Object) this, i, (byte) 19), i * 75);
                i++;
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
        this.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new ve6(this, bundle, tL_auth_resetLoginEmail, (byte) 0), 10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        removeCallbacks(this.U);
    }

    public final void p(boolean z) {
        hl.R3(this.f, z);
        hl.R3(this.h, (z || this.a0.G == 3 || this.Q) ? false : true);
        rh6 rh6Var = this.w;
        if (rh6Var.getVisibility() != 8) {
            rh6Var.setLayoutParams(tre.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z ? 8.0f : 16.0f));
            rh6Var.requestLayout();
        }
    }

    public final void q() {
        String a0;
        int currentTimeMillis = (int) (this.I - (System.currentTimeMillis() / 1000));
        int i = this.I;
        byte b = 0;
        xb xbVar = this.r;
        if (i <= 0 || currentTimeMillis <= 0) {
            xbVar.setVisibility(0);
            xbVar.setText(ob6.M0(2131748485, null));
            hl.d3(new xe6(this, b), 1000L);
            return;
        }
        int i2 = currentTimeMillis / 86400;
        int i3 = currentTimeMillis % 86400;
        int i4 = i3 / 3600;
        int i5 = i3 % 3600;
        int i6 = i5 / 60;
        int i7 = i5 % 60;
        if (i4 >= 16) {
            i2++;
        }
        if (i2 != 0) {
            a0 = ob6.a0(null, null, 2131748488, ob6.G(i2, "Days", new Object[0]));
        } else {
            StringBuilder sb = new StringBuilder(i4 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i4)) : "");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "%02d:", Integer.valueOf(i6)));
            sb.append(String.format(locale, "%02d", Integer.valueOf(i7)));
            a0 = ob6.a0(null, null, 2131748488, sb.toString());
        }
        String a02 = ob6.a0(null, null, 2131748487, a0);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a02);
        int indexOf = a02.indexOf(42);
        int lastIndexOf = a02.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
            valueOf.setSpan(new ho4(aob.q6, this.a0.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
        }
        xbVar.setText(valueOf);
        hl.d3(this.V, 1000L);
    }

    @Override // cna
    public final void updateColors() {
        this.b.setTextColor(aob.w0(null, aob.G6, false));
        int i = aob.D6;
        this.c.setTextColor(aob.w0(null, i, false));
        int i2 = aob.q6;
        this.d.setTextColor(aob.w0(null, i2, false));
        this.w.updateColors();
        this.f.setTextColor(aob.w0(null, i2, false));
        this.n.setTextColor(aob.w0(null, i2, false));
        this.r.setTextColor(aob.w0(null, i, false));
        this.s.setTextColor(aob.w0(null, aob.q7, false));
        this.a.invalidate();
    }
}
