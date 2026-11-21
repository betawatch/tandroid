package bi;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import c8.va;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.r80;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class s3 extends ka {
    public static final /* synthetic */ int x2 = 0;
    public final org.telegram.ui.Wallet.u0 W1;
    public final TextView X1;
    public final m80 Y1;
    public final ey0 Z1;
    public final m80 a2;
    public final TextView b2;
    public final hi.e c2;
    public final hi.e d2;
    public org.telegram.ui.Wallet.p0 e2;
    public Runnable f2;
    public long g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public boolean l2;
    public final o3 m2;
    public int n2;
    public ai.n o2;
    public final o3 p2;
    public int q2;
    public Runnable r2;
    public x10 s2;
    public ai.c1 t2;
    public x10 u2;
    public final ImageView v2;
    public final FrameLayout w2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String, org.telegram.ui.ActionBar.h6] */
    /* JADX WARN: Type inference failed for: r14v3 */
    public s3(int i7, Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        int i10;
        final ?? r13;
        ?? r14;
        Object obj;
        boolean z10;
        final int i11 = 0;
        this.m2 = new o3(this, 0);
        this.p2 = new o3(this, 2);
        this.q2 = 2131749614;
        this.a = i7;
        this.W1 = org.telegram.ui.Wallet.u0.D(i7);
        O();
        this.T1.setLayoutParams(new v4.q0(-1, -2));
        this.v1 = 0.1f;
        float f10 = this.u0 / org.telegram.messenger.g0.p;
        FrameLayout frameLayout = new FrameLayout(context);
        this.T1.addView(frameLayout, ma.o(-1, -2));
        ImageView imageView = new ImageView(context);
        this.v2 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.m6, h6Var, PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.i6, h6Var), 1, -1));
        imageView.setContentDescription(gd.N0(2131752029, null));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: bi.q3
            public final /* synthetic */ s3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        s3 s3Var = this.b;
                        if (!s3Var.h2) {
                            s3Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        s3 s3Var2 = this.b;
                        if (!s3Var2.h2 && !s3Var2.l2 && s3Var2.e2 != null) {
                            if (s3Var2.f2 == null) {
                                s3Var2.g1();
                                break;
                            } else {
                                s3Var2.l2 = true;
                                s3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(s3Var2.m2, 5000L);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        imageView.setVisibility(8);
        frameLayout.addView(imageView, ma.d(40, 40.0f, 51, f10 + 8.0f, 8.0f, 0.0f, 0.0f));
        if (starGift != null) {
            r3 r3Var = new r3(i7, context, h6Var);
            if (di.y8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class) != null) {
                obj = null;
                z10 = true;
            } else {
                obj = null;
                z10 = false;
            }
            r14 = obj;
            r13 = 1;
            i10 = 8;
            r3Var.h(starGift, false, false, false, z10, false);
            r3Var.setImageSize(org.telegram.messenger.g0.L(90.0f));
            r3Var.K.setVisibility(8);
            frameLayout.addView(r3Var, ma.d(120, 120.0f, 49, 0.0f, 20.0f, 0.0f, 12.0f));
        } else {
            i10 = 8;
            r13 = 1;
            r14 = 0;
        }
        int i12 = org.telegram.ui.ActionBar.m6.G6;
        TextView b10 = va.b(context, 20.0f, i12, r13, r14);
        this.X1 = b10;
        b10.setGravity(17);
        this.T1.addView(b10, ma.t(-1, -2, 17, 32, starGift == null ? 20 : 0, 32, 0));
        m80 m80Var = new m80(context, h6Var);
        this.Y1 = m80Var;
        m80Var.setTextSize(r13, 15.0f);
        m80Var.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(m80Var, i12, h6Var);
        org.telegram.ui.ActionBar.t6.G(m80Var, org.telegram.ui.ActionBar.m6.J6, h6Var);
        this.T1.addView(m80Var, ma.t(-1, -2, 17, 32, 8, 32, 0));
        ey0 ey0Var = new ey0(context, h6Var);
        this.Z1 = ey0Var;
        float f11 = f10 + 14.0f;
        this.T1.addView(ey0Var, ma.s(-1, -2, 7, f11, 18.0f, f11, 0.0f));
        m80 m80Var2 = new m80(context, h6Var);
        this.a2 = m80Var2;
        m80Var2.setTextSize(r13, 15.0f);
        m80Var2.setGravity(17);
        org.telegram.ui.ActionBar.t6.U(m80Var2, i12, h6Var);
        m80Var2.setVisibility(i10);
        this.T1.addView(m80Var2, ma.t(-1, -2, 17, 32, 16, 32, 0));
        TextView b11 = va.b(context, 14.0f, org.telegram.ui.ActionBar.m6.y6, false, r14);
        this.b2 = b11;
        b11.setGravity(17);
        this.T1.addView(b11, ma.t(-1, -2, 17, 32, 14, 32, 12));
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.h5, frameLayout2, h6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        hi.e eVar = new hi.e(context, h6Var, false);
        this.c2 = eVar;
        eVar.f();
        eVar.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.r1(0.07f, org.telegram.ui.ActionBar.m6.w0(i12, h6Var))));
        eVar.setTextColorKey(i12);
        eVar.i(gd.N0(2131752577, r14), false, r13);
        eVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.q3
            public final /* synthetic */ s3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (r13) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        s3 s3Var = this.b;
                        if (!s3Var.h2) {
                            s3Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        s3 s3Var2 = this.b;
                        if (!s3Var2.h2 && !s3Var2.l2 && s3Var2.e2 != null) {
                            if (s3Var2.f2 == null) {
                                s3Var2.g1();
                                break;
                            } else {
                                s3Var2.l2 = true;
                                s3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(s3Var2.m2, 5000L);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout.addView(eVar, ma.m(1.0f, 0, 48, 0, 6, 0));
        hi.e eVar2 = new hi.e(context, h6Var, r13);
        this.d2 = eVar2;
        eVar2.f();
        eVar2.i(gd.N0(2131751805, r14), false, r13);
        final int i13 = 2;
        eVar2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.q3
            public final /* synthetic */ s3 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        this.b.dismiss();
                        break;
                    case 1:
                        s3 s3Var = this.b;
                        if (!s3Var.h2) {
                            s3Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        s3 s3Var2 = this.b;
                        if (!s3Var2.h2 && !s3Var2.l2 && s3Var2.e2 != null) {
                            if (s3Var2.f2 == null) {
                                s3Var2.g1();
                                break;
                            } else {
                                s3Var2.l2 = true;
                                s3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(s3Var2.m2, 5000L);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout.addView(eVar2, ma.m(1.0f, 0, 48, 6, 0, 0));
        float f12 = f10 + 16.0f;
        frameLayout2.addView(linearLayout, ma.d(-1, 48.0f, ks.E1, f12, 8.0f, f12, 16.0f));
        this.b.addView(frameLayout2, ma.e(-1, -2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.u0, 0, org.telegram.messenger.g0.L(6.0f) + this.u0, 0);
        this.b.addView(frameLayout3, ma.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
        ek0 ek0Var = this.o1;
        ek0Var.setPadding(ek0Var.getPaddingLeft(), this.o1.getPaddingTop(), this.o1.getPaddingRight(), org.telegram.messenger.g0.L(72.0f) + this.o1.getPaddingBottom());
    }

    public static boolean e1(Context context, int i7, org.telegram.ui.ActionBar.h6 h6Var, long j3, int i10) {
        int i11 = 1;
        if (org.telegram.ui.Wallet.u0.D(i7).A() >= j3) {
            return true;
        }
        String a02 = gd.a0(null, null, i10, org.telegram.ui.Wallet.u0.s(j3, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = gd.N0(2131742821, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = a02;
        alertDialog$Builder.h(gd.N0(2131742819, null), null);
        alertDialog$Builder.k(gd.N0(2131742726, null), new ai.t1(context, i7, h6Var, i11));
        alertDialog$Builder.p();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.c2
    public final void dismiss() {
        if (this.i2 && !this.j2) {
            this.j2 = true;
            this.i2 = false;
            Runnable runnable = this.r2;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.l2 = false;
        org.telegram.messenger.g0.r(this.m2);
        org.telegram.messenger.g0.r(this.p2);
        Runnable runnable2 = this.f2;
        if (runnable2 != null) {
            runnable2.run();
            this.f2 = null;
        }
        super.dismiss();
    }

    public final void f1() {
        if (this.h2 || this.j2) {
            return;
        }
        if (this.n2 <= 0 || ConnectionsManager.getInstance(this.a).getCurrentTime() < this.n2) {
            h1();
            return;
        }
        dismiss();
        ai.n nVar = this.o2;
        if (nVar != null) {
            nVar.run();
        }
    }

    public final void g1() {
        if (this.h2 || this.e2 == null) {
            return;
        }
        if (this.n2 > 0 && ConnectionsManager.getInstance(this.a).getCurrentTime() >= this.n2) {
            f1();
            return;
        }
        org.telegram.ui.Wallet.p0 p0Var = this.e2.f;
        org.telegram.ui.Wallet.u0 u0Var = this.W1;
        long j3 = (p0Var == null || !u0Var.M()) ? this.e2.b + this.g2 : this.e2.f.b;
        final int i7 = 1;
        final int i10 = 0;
        if (u0Var.A() >= j3) {
            this.h2 = true;
            this.d2.setLoading(true);
            u0Var.o0(this.e2, new x10(this) { // from class: bi.p3
                public final /* synthetic */ s3 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
                public final void a(Object obj) {
                    switch (i7) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            s3 s3Var = this.b;
                            if (s3Var.i2) {
                                if (!bool.booleanValue()) {
                                    s3Var.i2 = false;
                                    s3Var.h2 = false;
                                    s3Var.d2.setLoading(false);
                                    x10 x10Var = s3Var.u2;
                                    if (x10Var != null) {
                                        x10Var.a("WALLET_SEND_FAILED");
                                        break;
                                    }
                                } else {
                                    if (!s3Var.j2) {
                                        s3Var.j2 = true;
                                        s3Var.i2 = false;
                                        s3Var.h2 = false;
                                        s3Var.dismiss();
                                        Runnable runnable = s3Var.r2;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                    }
                                    if (!s3Var.k2) {
                                        s3Var.k2 = true;
                                        ai.c1 c1Var = s3Var.t2;
                                        if (c1Var != null) {
                                            c1Var.run();
                                        }
                                    }
                                }
                            }
                            x10 x10Var2 = s3Var.s2;
                            if (x10Var2 != null) {
                                x10Var2.a(bool);
                                break;
                            }
                            break;
                        default:
                            String str = (String) obj;
                            s3 s3Var2 = this.b;
                            if (str == null) {
                                s3Var2.i2 = true;
                                break;
                            } else {
                                s3Var2.h2 = false;
                                s3Var2.d2.setLoading(false);
                                if (s3Var2.u2 != null && !org.telegram.ui.Wallet.u0.L(str)) {
                                    s3Var2.u2.a(str);
                                    break;
                                }
                            }
                            break;
                    }
                }
            }, new x10(this) { // from class: bi.p3
                public final /* synthetic */ s3 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            s3 s3Var = this.b;
                            if (s3Var.i2) {
                                if (!bool.booleanValue()) {
                                    s3Var.i2 = false;
                                    s3Var.h2 = false;
                                    s3Var.d2.setLoading(false);
                                    x10 x10Var = s3Var.u2;
                                    if (x10Var != null) {
                                        x10Var.a("WALLET_SEND_FAILED");
                                        break;
                                    }
                                } else {
                                    if (!s3Var.j2) {
                                        s3Var.j2 = true;
                                        s3Var.i2 = false;
                                        s3Var.h2 = false;
                                        s3Var.dismiss();
                                        Runnable runnable = s3Var.r2;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                    }
                                    if (!s3Var.k2) {
                                        s3Var.k2 = true;
                                        ai.c1 c1Var = s3Var.t2;
                                        if (c1Var != null) {
                                            c1Var.run();
                                        }
                                    }
                                }
                            }
                            x10 x10Var2 = s3Var.s2;
                            if (x10Var2 != null) {
                                x10Var2.a(bool);
                                break;
                            }
                            break;
                        default:
                            String str = (String) obj;
                            s3 s3Var2 = this.b;
                            if (str == null) {
                                s3Var2.i2 = true;
                                break;
                            } else {
                                s3Var2.h2 = false;
                                s3Var2.d2.setLoading(false);
                                if (s3Var2.u2 != null && !org.telegram.ui.Wallet.u0.L(str)) {
                                    s3Var2.u2.a(str);
                                    break;
                                }
                            }
                            break;
                    }
                }
            }, new o3(this, 1));
            return;
        }
        Context context = getContext();
        int i11 = this.a;
        org.telegram.ui.ActionBar.h6 h6Var = this.J0;
        String a02 = gd.a0(null, null, this.q2, org.telegram.ui.Wallet.u0.s(j3, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, h6Var);
        String N0 = gd.N0(2131742821, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.a;
        t1Var.S = N0;
        t1Var.U = a02;
        alertDialog$Builder.h(gd.N0(2131742819, null), null);
        alertDialog$Builder.k(gd.N0(2131742726, null), new ai.t1(context, i11, h6Var, i7));
        alertDialog$Builder.p();
    }

    public final void h1() {
        o3 o3Var = this.p2;
        org.telegram.messenger.g0.r(o3Var);
        int i7 = this.n2;
        if (i7 <= 0) {
            return;
        }
        org.telegram.messenger.g0.h3(o3Var, Math.max(0L, (i7 - ConnectionsManager.getInstance(this.a).getCurrentTime()) * 1000));
    }

    public final void i1(Runnable runnable, x10 x10Var, x10 x10Var2) {
        this.r2 = runnable;
        this.s2 = x10Var;
        this.u2 = x10Var2;
    }

    public final void j1(org.telegram.ui.Wallet.p0 p0Var) {
        this.e2 = p0Var;
        Runnable runnable = this.f2;
        if (runnable != null) {
            runnable.run();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
        int L = org.telegram.messenger.g0.L(140.0f);
        TextView textView = this.b2;
        spannableStringBuilder.setSpan(new r80(L, textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        this.g2 = 0L;
        this.f2 = this.W1.l(p0Var, new b(this, 7));
    }

    @Override // org.telegram.ui.ActionBar.w2, org.telegram.ui.ActionBar.c2
    public final lc k() {
        return new lc(this.w2, this.J0);
    }

    public final void k1(CharSequence charSequence, String str) {
        this.X1.setText(str);
        setTitle(str);
        m80 m80Var = this.Y1;
        m80Var.setText(charSequence);
        m80Var.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }
}
