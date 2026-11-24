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
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class ad6 extends jja {
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
    public final zc6 R;
    public boolean S;
    public final uc6 T;
    public final uc6 U;
    public final uc6 V;
    public boolean W;
    public final yc6 a;
    public final /* synthetic */ mf6 a0;
    public final TextView b;
    public final wla c;
    public final TextView d;
    public final FrameLayout e;
    public final TextView f;
    public final FrameLayout h;
    public final wb n;
    public final wb r;
    public final TextView s;
    public final nf6 w;
    public final ry8 x;
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
    public ad6(mf6 mf6Var, Context context, boolean z) {
        super(context);
        int i;
        this.a0 = mf6Var;
        this.T = new uc6(this, (byte) 4);
        this.U = new uc6(this, (byte) 6);
        this.V = new uc6(this, (byte) 7);
        this.Q = z;
        final byte b = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        ry8 ry8Var = new ry8(context);
        this.x = ry8Var;
        if (!z || mf6Var.G == 3) {
            ry8Var.f(R.raw.email_check_inbox, 120, 120, null);
        } else {
            ry8Var.f(R.raw.email_setup_heart, 120, 120, null);
        }
        final byte b2 = 0;
        ry8Var.setAutoRepeat(false);
        frameLayout.addView(ry8Var, nme.e(120, 120, 1));
        if (!gl.M1()) {
            Point point = gl.q;
            if (point.x <= point.y || gl.O1()) {
                i = 0;
                frameLayout.setVisibility(i);
                addView(frameLayout, nme.e(-1, -2, 1));
                TextView textView = new TextView(context);
                this.b = textView;
                ir2.t(textView, 1, 18.0f);
                textView.setText(k96.M0(mf6Var.G != 3 ? 2131752131 : z ? 2131743380 : 2131752133, null));
                textView.setGravity(17);
                textView.setLineSpacing(gl.L(2.0f), 1.0f);
                addView(textView, nme.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
                wla wlaVar = new wla(null, context, false);
                this.c = wlaVar;
                wlaVar.setTextSize(1, 14.0f);
                wlaVar.setGravity(17);
                wlaVar.setLineSpacing(gl.L(2.0f), 1.0f);
                addView(wlaVar, nme.t(-2, -2, 1, 24, 8, 24, 0));
                yc6 yc6Var = new yc6((byte) 0, context, this);
                this.a = yc6Var;
                addView(yc6Var, nme.t(-2, 42, 1, 0, !z ? 48 : 32, 0, 0));
                TextView textView2 = new TextView(context);
                this.d = textView2;
                textView2.setGravity(17);
                textView2.setTextSize(1, 14.0f);
                textView2.setLineSpacing(gl.L(2.0f), 1.0f);
                textView2.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
                final byte b3 = 2;
                textView2.setMaxLines(2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
                Drawable drawable = context.getDrawable(R.drawable.googleg_standard_color_18);
                drawable.setBounds(0, gl.L(9.0f), gl.L(18.0f), gl.L(27.0f));
                spannableStringBuilder.setSpan(new ImageSpan(drawable, 0), 0, 1, 33);
                spannableStringBuilder.setSpan(new lx2(b3), 1, 2, 33);
                spannableStringBuilder.append((CharSequence) k96.M0(2131745129, null));
                textView2.setText(spannableStringBuilder);
                textView2.setOnClickListener(new View.OnClickListener(this) { // from class: xc6
                    public final /* synthetic */ ad6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2;
                        byte b4 = b2;
                        ad6 ad6Var = this.b;
                        switch (b4) {
                            case 0:
                                kk7.e().a(new xb0(ad6Var, (byte) 1), kk7.e5);
                                Context context2 = ad6Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = w01.h;
                                fre.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                u84 a = aje.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a.k().addOnCompleteListener(new h45(ad6Var, a, (byte) 17));
                                break;
                            case 1:
                                ad6Var.o();
                                break;
                            default:
                                TextView textView3 = ad6Var.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    ad6Var.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ad6Var.M;
                                    tL_auth_resendCode.phone_code_hash = ad6Var.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ad6Var.J);
                                    bundle.putString("ephone", ad6Var.K);
                                    bundle.putString("phoneFormated", ad6Var.M);
                                    i2 = ((d) ad6Var.a0).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new k45(ad6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.h = frameLayout2;
                gl.T3(frameLayout2, mf6Var.G == 3 && !z, 1.0f, true, false);
                wb wbVar = new wb(context, (byte) 24);
                this.n = wbVar;
                wbVar.setText(k96.M0(2131748545, null));
                wbVar.setGravity(17);
                wbVar.setTextSize(1, 14.0f);
                wbVar.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
                wbVar.setMaxLines(2);
                wbVar.setOnClickListener(new v16(this, context, (byte) 4));
                frameLayout2.addView(wbVar);
                wb wbVar2 = new wb(context, (byte) 25);
                this.r = wbVar2;
                wbVar2.setGravity(17);
                wbVar2.setTextSize(1, 14.0f);
                wbVar2.setLineSpacing(gl.L(2.0f), 1.0f);
                wbVar2.setMaxLines(3);
                wbVar2.setOnClickListener(new View.OnClickListener(this) { // from class: xc6
                    public final /* synthetic */ ad6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2;
                        byte b4 = b;
                        ad6 ad6Var = this.b;
                        switch (b4) {
                            case 0:
                                kk7.e().a(new xb0(ad6Var, (byte) 1), kk7.e5);
                                Context context2 = ad6Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = w01.h;
                                fre.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                u84 a = aje.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a.k().addOnCompleteListener(new h45(ad6Var, a, (byte) 17));
                                break;
                            case 1:
                                ad6Var.o();
                                break;
                            default:
                                TextView textView3 = ad6Var.f;
                                if (textView3.getVisibility() == 0 && textView3.getAlpha() == 1.0f) {
                                    ad6Var.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ad6Var.M;
                                    tL_auth_resendCode.phone_code_hash = ad6Var.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ad6Var.J);
                                    bundle.putString("ephone", ad6Var.K);
                                    bundle.putString("phoneFormated", ad6Var.M);
                                    i2 = ((d) ad6Var.a0).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new k45(ad6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                wbVar2.setPadding(0, gl.L(16.0f), 0, gl.L(16.0f));
                wbVar2.setVisibility(8);
                frameLayout2.addView(wbVar2);
                TextView textView3 = new TextView(context);
                this.f = textView3;
                textView3.setGravity(17);
                textView3.setTextSize(1, 14.0f);
                textView3.setLineSpacing(gl.L(2.0f), 1.0f);
                textView3.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
                textView3.setMaxLines(2);
                textView3.setText(k96.M0(2131745928, null));
                textView3.setOnClickListener(new View.OnClickListener(this) { // from class: xc6
                    public final /* synthetic */ ad6 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        int i2;
                        byte b4 = b3;
                        ad6 ad6Var = this.b;
                        switch (b4) {
                            case 0:
                                kk7.e().a(new xb0(ad6Var, (byte) 1), kk7.e5);
                                Context context2 = ad6Var.getContext();
                                HashSet hashSet = new HashSet();
                                HashMap hashMap = new HashMap();
                                String str = w01.h;
                                fre.f(str);
                                hashSet.add(GoogleSignInOptions.x);
                                if (hashSet.contains(GoogleSignInOptions.F)) {
                                    Scope scope = GoogleSignInOptions.E;
                                    if (hashSet.contains(scope)) {
                                        hashSet.remove(scope);
                                    }
                                }
                                hashSet.add(GoogleSignInOptions.y);
                                u84 a = aje.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                                a.k().addOnCompleteListener(new h45(ad6Var, a, (byte) 17));
                                break;
                            case 1:
                                ad6Var.o();
                                break;
                            default:
                                TextView textView32 = ad6Var.f;
                                if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                                    ad6Var.p(false);
                                    TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                                    tL_auth_resendCode.phone_number = ad6Var.M;
                                    tL_auth_resendCode.phone_code_hash = ad6Var.N;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("phone", ad6Var.J);
                                    bundle.putString("ephone", ad6Var.K);
                                    bundle.putString("phoneFormated", ad6Var.M);
                                    i2 = ((d) ad6Var.a0).currentAccount;
                                    ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new k45(ad6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                                    break;
                                }
                                break;
                        }
                    }
                });
                gl.T3(textView3, false, 1.0f, true, false);
                nf6 nf6Var = new nf6(context);
                this.w = nf6Var;
                vk9.c(nf6Var);
                zc6 zc6Var = new zc6(context, b2);
                this.R = zc6Var;
                Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.text_in);
                s33 s33Var = ls3.e;
                loadAnimation.setInterpolator(s33Var);
                zc6Var.setInAnimation(loadAnimation);
                Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.text_out);
                loadAnimation2.setInterpolator(s33Var);
                zc6Var.setOutAnimation(loadAnimation2);
                FrameLayout frameLayout3 = new FrameLayout(context);
                this.e = frameLayout3;
                frameLayout3.addView(textView3, nme.e(-2, -2, 17));
                zc6Var.addView(frameLayout3);
                TextView textView4 = new TextView(context);
                this.s = textView4;
                textView4.setText(k96.M0(2131742598, "WrongCode"));
                textView4.setLineSpacing(gl.L(2.0f), 1.0f);
                textView4.setTextSize(1, 15.0f);
                textView4.setGravity(49);
                textView4.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
                zc6Var.addView(textView4);
                FrameLayout frameLayout4 = new FrameLayout(context);
                if (z) {
                    frameLayout4.addView(zc6Var, nme.e(-1, -2, 48));
                    frameLayout4.addView(frameLayout2, nme.e(-1, -2, 48));
                    frameLayout4.addView(nf6Var, nme.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, 16.0f));
                    frameLayout4.addView(textView2, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 16.0f));
                } else {
                    frameLayout4.addView(zc6Var, nme.d(-1, -2.0f, 80, 0.0f, 0.0f, 0.0f, 32.0f));
                }
                addView(frameLayout4, nme.l(1.0f, -1, 0));
            }
        }
        i = 8;
        frameLayout.setVisibility(i);
        addView(frameLayout, nme.e(-1, -2, 1));
        TextView textView5 = new TextView(context);
        this.b = textView5;
        ir2.t(textView5, 1, 18.0f);
        textView5.setText(k96.M0(mf6Var.G != 3 ? 2131752131 : z ? 2131743380 : 2131752133, null));
        textView5.setGravity(17);
        textView5.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(textView5, nme.d(-1, -2.0f, 1, 32.0f, 16.0f, 32.0f, 0.0f));
        wla wlaVar2 = new wla(null, context, false);
        this.c = wlaVar2;
        wlaVar2.setTextSize(1, 14.0f);
        wlaVar2.setGravity(17);
        wlaVar2.setLineSpacing(gl.L(2.0f), 1.0f);
        addView(wlaVar2, nme.t(-2, -2, 1, 24, 8, 24, 0));
        yc6 yc6Var2 = new yc6((byte) 0, context, this);
        this.a = yc6Var2;
        addView(yc6Var2, nme.t(-2, 42, 1, 0, !z ? 48 : 32, 0, 0));
        TextView textView22 = new TextView(context);
        this.d = textView22;
        textView22.setGravity(17);
        textView22.setTextSize(1, 14.0f);
        textView22.setLineSpacing(gl.L(2.0f), 1.0f);
        textView22.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        final byte b32 = 2;
        textView22.setMaxLines(2);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("d ");
        Drawable drawable2 = context.getDrawable(R.drawable.googleg_standard_color_18);
        drawable2.setBounds(0, gl.L(9.0f), gl.L(18.0f), gl.L(27.0f));
        spannableStringBuilder2.setSpan(new ImageSpan(drawable2, 0), 0, 1, 33);
        spannableStringBuilder2.setSpan(new lx2(b32), 1, 2, 33);
        spannableStringBuilder2.append((CharSequence) k96.M0(2131745129, null));
        textView22.setText(spannableStringBuilder2);
        textView22.setOnClickListener(new View.OnClickListener(this) { // from class: xc6
            public final /* synthetic */ ad6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                byte b4 = b2;
                ad6 ad6Var = this.b;
                switch (b4) {
                    case 0:
                        kk7.e().a(new xb0(ad6Var, (byte) 1), kk7.e5);
                        Context context2 = ad6Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = w01.h;
                        fre.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        u84 a = aje.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a.k().addOnCompleteListener(new h45(ad6Var, a, (byte) 17));
                        break;
                    case 1:
                        ad6Var.o();
                        break;
                    default:
                        TextView textView32 = ad6Var.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            ad6Var.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ad6Var.M;
                            tL_auth_resendCode.phone_code_hash = ad6Var.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ad6Var.J);
                            bundle.putString("ephone", ad6Var.K);
                            bundle.putString("phoneFormated", ad6Var.M);
                            i2 = ((d) ad6Var.a0).currentAccount;
                            ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new k45(ad6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                            break;
                        }
                        break;
                }
            }
        });
        FrameLayout frameLayout22 = new FrameLayout(context);
        this.h = frameLayout22;
        gl.T3(frameLayout22, mf6Var.G == 3 && !z, 1.0f, true, false);
        wb wbVar3 = new wb(context, (byte) 24);
        this.n = wbVar3;
        wbVar3.setText(k96.M0(2131748545, null));
        wbVar3.setGravity(17);
        wbVar3.setTextSize(1, 14.0f);
        wbVar3.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        wbVar3.setMaxLines(2);
        wbVar3.setOnClickListener(new v16(this, context, (byte) 4));
        frameLayout22.addView(wbVar3);
        wb wbVar22 = new wb(context, (byte) 25);
        this.r = wbVar22;
        wbVar22.setGravity(17);
        wbVar22.setTextSize(1, 14.0f);
        wbVar22.setLineSpacing(gl.L(2.0f), 1.0f);
        wbVar22.setMaxLines(3);
        wbVar22.setOnClickListener(new View.OnClickListener(this) { // from class: xc6
            public final /* synthetic */ ad6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                byte b4 = b;
                ad6 ad6Var = this.b;
                switch (b4) {
                    case 0:
                        kk7.e().a(new xb0(ad6Var, (byte) 1), kk7.e5);
                        Context context2 = ad6Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = w01.h;
                        fre.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        u84 a = aje.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a.k().addOnCompleteListener(new h45(ad6Var, a, (byte) 17));
                        break;
                    case 1:
                        ad6Var.o();
                        break;
                    default:
                        TextView textView32 = ad6Var.f;
                        if (textView32.getVisibility() == 0 && textView32.getAlpha() == 1.0f) {
                            ad6Var.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ad6Var.M;
                            tL_auth_resendCode.phone_code_hash = ad6Var.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ad6Var.J);
                            bundle.putString("ephone", ad6Var.K);
                            bundle.putString("phoneFormated", ad6Var.M);
                            i2 = ((d) ad6Var.a0).currentAccount;
                            ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new k45(ad6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                            break;
                        }
                        break;
                }
            }
        });
        wbVar22.setPadding(0, gl.L(16.0f), 0, gl.L(16.0f));
        wbVar22.setVisibility(8);
        frameLayout22.addView(wbVar22);
        TextView textView32 = new TextView(context);
        this.f = textView32;
        textView32.setGravity(17);
        textView32.setTextSize(1, 14.0f);
        textView32.setLineSpacing(gl.L(2.0f), 1.0f);
        textView32.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        textView32.setMaxLines(2);
        textView32.setText(k96.M0(2131745928, null));
        textView32.setOnClickListener(new View.OnClickListener(this) { // from class: xc6
            public final /* synthetic */ ad6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2;
                byte b4 = b32;
                ad6 ad6Var = this.b;
                switch (b4) {
                    case 0:
                        kk7.e().a(new xb0(ad6Var, (byte) 1), kk7.e5);
                        Context context2 = ad6Var.getContext();
                        HashSet hashSet = new HashSet();
                        HashMap hashMap = new HashMap();
                        String str = w01.h;
                        fre.f(str);
                        hashSet.add(GoogleSignInOptions.x);
                        if (hashSet.contains(GoogleSignInOptions.F)) {
                            Scope scope = GoogleSignInOptions.E;
                            if (hashSet.contains(scope)) {
                                hashSet.remove(scope);
                            }
                        }
                        hashSet.add(GoogleSignInOptions.y);
                        u84 a = aje.a(context2, new GoogleSignInOptions(3, new ArrayList(hashSet), null, true, false, false, str, null, hashMap, null));
                        a.k().addOnCompleteListener(new h45(ad6Var, a, (byte) 17));
                        break;
                    case 1:
                        ad6Var.o();
                        break;
                    default:
                        TextView textView322 = ad6Var.f;
                        if (textView322.getVisibility() == 0 && textView322.getAlpha() == 1.0f) {
                            ad6Var.p(false);
                            TLRPC.TL_auth_resendCode tL_auth_resendCode = new TLRPC.TL_auth_resendCode();
                            tL_auth_resendCode.phone_number = ad6Var.M;
                            tL_auth_resendCode.phone_code_hash = ad6Var.N;
                            Bundle bundle = new Bundle();
                            bundle.putString("phone", ad6Var.J);
                            bundle.putString("ephone", ad6Var.K);
                            bundle.putString("phoneFormated", ad6Var.M);
                            i2 = ((d) ad6Var.a0).currentAccount;
                            ConnectionsManager.getInstance(i2).sendRequest(tL_auth_resendCode, new k45(ad6Var, bundle, tL_auth_resendCode, (byte) 7), 10);
                            break;
                        }
                        break;
                }
            }
        });
        gl.T3(textView32, false, 1.0f, true, false);
        nf6 nf6Var2 = new nf6(context);
        this.w = nf6Var2;
        vk9.c(nf6Var2);
        zc6 zc6Var2 = new zc6(context, b2);
        this.R = zc6Var2;
        Animation loadAnimation3 = AnimationUtils.loadAnimation(context, R.anim.text_in);
        s33 s33Var2 = ls3.e;
        loadAnimation3.setInterpolator(s33Var2);
        zc6Var2.setInAnimation(loadAnimation3);
        Animation loadAnimation22 = AnimationUtils.loadAnimation(context, R.anim.text_out);
        loadAnimation22.setInterpolator(s33Var2);
        zc6Var2.setOutAnimation(loadAnimation22);
        FrameLayout frameLayout32 = new FrameLayout(context);
        this.e = frameLayout32;
        frameLayout32.addView(textView32, nme.e(-2, -2, 17));
        zc6Var2.addView(frameLayout32);
        TextView textView42 = new TextView(context);
        this.s = textView42;
        textView42.setText(k96.M0(2131742598, "WrongCode"));
        textView42.setLineSpacing(gl.L(2.0f), 1.0f);
        textView42.setTextSize(1, 15.0f);
        textView42.setGravity(49);
        textView42.setPadding(gl.L(16.0f), gl.L(16.0f), gl.L(16.0f), gl.L(16.0f));
        zc6Var2.addView(textView42);
        FrameLayout frameLayout42 = new FrameLayout(context);
        if (z) {
        }
        addView(frameLayout42, nme.l(1.0f, -1, 0));
    }

    @Override // jja
    public final void g() {
        if (this.I != 0) {
            gl.r(this.V);
        }
    }

    @Override // jja
    public String getHeaderName() {
        return k96.M0(2131743380, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // jja
    public final void h(String str) {
        TLRPC.TL_auth_signIn tL_auth_signIn;
        int i;
        if (this.F) {
            return;
        }
        gl.r(this.U);
        yc6 yc6Var = this.a;
        byte b = 1;
        yc6Var.e = true;
        sj2[] sj2VarArr = yc6Var.f;
        byte b2 = 0;
        if (sj2VarArr != null) {
            for (sj2 sj2Var : sj2VarArr) {
                sj2Var.B(0.0f);
            }
        }
        String code = yc6Var.getCode();
        int length = code.length();
        mf6 mf6Var = this.a0;
        if (length == 0 && this.G == null) {
            if (mf6Var.getParentActivity() == null) {
                return;
            }
            try {
                yc6Var.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
            for (sj2 sj2Var2 : yc6Var.f) {
                sj2Var2.A(1.0f);
            }
            yc6Var.f[0].requestFocus();
            gl.A3(10.0f, yc6Var, new uc6(this, b));
            return;
        }
        this.F = true;
        mf6Var.A1(0, true);
        if (mf6Var.G == 3) {
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
        yc6Var.e = true;
        sj2[] sj2VarArr2 = yc6Var.f;
        if (sj2VarArr2 != null) {
            for (sj2 sj2Var3 : sj2VarArr2) {
                sj2Var3.B(0.0f);
            }
        }
        i = ((d) mf6Var).currentAccount;
        ConnectionsManager.getInstance(i).sendRequest(tL_auth_signIn, new rc6(this, code, b2), 10);
    }

    @Override // jja
    public final void j() {
        if (this.y) {
            this.y = false;
        } else {
            gl.d3(new uc6(this, (byte) 8), mf6.A0);
        }
    }

    @Override // jja
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

    @Override // jja
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

    @Override // jja
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
            mf6 mf6Var = this.a0;
            byte b = mf6Var.G;
            int i = 8;
            FrameLayout frameLayout = this.h;
            wla wlaVar = this.c;
            if (b == 3) {
                wlaVar.setText(k96.a0(null, null, 2131752130, this.L));
                gl.T3(frameLayout, false, 1.0f, true, false);
            } else if (this.Q) {
                wlaVar.setText(k96.a0(null, null, 2131743379, this.L));
                gl.T3(frameLayout, false, 1.0f, true, false);
            } else {
                gl.T3(frameLayout, true, 1.0f, true, false);
                this.n.setVisibility(this.I == 0 ? 0 : 8);
                this.r.setVisibility(this.I != 0 ? 0 : 8);
                if (this.I != 0) {
                    q();
                }
            }
            int i2 = this.P;
            yc6 yc6Var = this.a;
            yc6Var.b(i2, 1);
            for (sj2 sj2Var : yc6Var.f) {
                sj2Var.setShowSoftInputOnFocusCompat(gl.A1());
                sj2Var.addTextChangedListener(new b7(this, (byte) 27));
                sj2Var.setOnFocusChangeListener(new ls0(this, (byte) 6));
            }
            yc6Var.setText("");
            if (!this.O && mf6Var.G != 3) {
                String string = this.E.getString("emailPattern");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                int indexOf = string.indexOf(42);
                int lastIndexOf = string.lastIndexOf(42);
                if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                    vib vibVar = new vib();
                    vibVar.a |= 256;
                    vibVar.b = indexOf;
                    int i3 = lastIndexOf + 1;
                    vibVar.c = i3;
                    spannableStringBuilder.setSpan(new wib(vibVar, 0), indexOf, i3, 0);
                }
                wlaVar.setText(gl.m0(k96.M0(2131752132, null), spannableStringBuilder));
            }
            if (bundle.getBoolean("googleSignInAllowed") && b.b.hasServices()) {
                i = 0;
            }
            this.w.setVisibility(i);
            this.d.setVisibility(i);
            mf6Var.L1(yc6Var.f[0]);
            yc6Var.requestFocus();
            if (!z && bundle.containsKey("nextType")) {
                gl.d3(this.U, bundle.getInt("timeout"));
            }
            if (this.I != 0) {
                gl.d3(this.V, 1000L);
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
            yc6 yc6Var = this.a;
            if (i >= yc6Var.f.length) {
                yc6Var.postDelayed(new kz5(this, runnable, (byte) 15), (r2.length * 75) + 400);
                return;
            } else {
                yc6Var.postDelayed(new sm3((Object) this, i, (byte) 17), i * 75);
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
        this.a0.getConnectionsManager().sendRequest(tL_auth_resetLoginEmail, new sc6(this, bundle, tL_auth_resetLoginEmail, (byte) 0), 10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.T);
        removeCallbacks(this.U);
    }

    public final void p(boolean z) {
        gl.R3(this.f, z);
        gl.R3(this.h, (z || this.a0.G == 3 || this.Q) ? false : true);
        nf6 nf6Var = this.w;
        if (nf6Var.getVisibility() != 8) {
            nf6Var.setLayoutParams(nme.d(-1, 16.0f, 17, 0.0f, 0.0f, 0.0f, z ? 8.0f : 16.0f));
            nf6Var.requestLayout();
        }
    }

    public final void q() {
        String a0;
        int currentTimeMillis = (int) (this.I - (System.currentTimeMillis() / 1000));
        int i = this.I;
        byte b = 0;
        wb wbVar = this.r;
        if (i <= 0 || currentTimeMillis <= 0) {
            wbVar.setVisibility(0);
            wbVar.setText(k96.M0(2131748539, null));
            gl.d3(new uc6(this, b), 1000L);
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
            a0 = k96.a0(null, null, 2131748542, k96.G(i2, "Days", new Object[0]));
        } else {
            StringBuilder sb = new StringBuilder(i4 != 0 ? String.format(Locale.ROOT, "%02d:", Integer.valueOf(i4)) : "");
            Locale locale = Locale.ROOT;
            sb.append(String.format(locale, "%02d:", Integer.valueOf(i6)));
            sb.append(String.format(locale, "%02d", Integer.valueOf(i7)));
            a0 = k96.a0(null, null, 2131748542, sb.toString());
        }
        String a02 = k96.a0(null, null, 2131748541, a0);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(a02);
        int indexOf = a02.indexOf(42);
        int lastIndexOf = a02.lastIndexOf(42);
        if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
            valueOf.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
            valueOf.replace(indexOf, indexOf + 1, (CharSequence) "");
            valueOf.setSpan(new cm4(bkb.p6, this.a0.getResourceProvider()), indexOf, lastIndexOf - 1, 33);
        }
        wbVar.setText(valueOf);
        gl.d3(this.V, 1000L);
    }

    @Override // jja
    public final void updateColors() {
        this.b.setTextColor(bkb.w0(null, bkb.F6, false));
        int i = bkb.C6;
        this.c.setTextColor(bkb.w0(null, i, false));
        int i2 = bkb.p6;
        this.d.setTextColor(bkb.w0(null, i2, false));
        this.w.updateColors();
        this.f.setTextColor(bkb.w0(null, i2, false));
        this.n.setTextColor(bkb.w0(null, i2, false));
        this.r.setTextColor(bkb.w0(null, i, false));
        this.s.setTextColor(bkb.w0(null, bkb.p7, false));
        this.a.invalidate();
    }
}
