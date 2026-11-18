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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p80;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class o3 extends ka {
    public static final /* synthetic */ int x2 = 0;
    public final org.telegram.ui.Wallet.u0 W1;
    public final TextView X1;
    public final k80 Y1;
    public final cy0 Z1;
    public final k80 a2;
    public final TextView b2;
    public final hi.d c2;
    public final hi.d d2;
    public org.telegram.ui.Wallet.p0 e2;
    public Runnable f2;
    public long g2;
    public boolean h2;
    public boolean i2;
    public boolean j2;
    public boolean k2;
    public boolean l2;
    public final k3 m2;
    public int n2;
    public ai.o o2;
    public final k3 p2;
    public int q2;
    public Runnable r2;
    public x10 s2;
    public ai.a1 t2;
    public x10 u2;
    public final ImageView v2;
    public final FrameLayout w2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String, org.telegram.ui.ActionBar.i6] */
    /* JADX WARN: Type inference failed for: r14v3 */
    public o3(int i7, Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        int i10;
        final ?? r13;
        ?? r14;
        Object obj;
        boolean z10;
        final int i11 = 0;
        this.m2 = new k3(this, 0);
        this.p2 = new k3(this, 2);
        this.q2 = 2131749615;
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
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.m6, i6Var, PorterDuff.Mode.SRC_IN);
        imageView.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.i6, i6Var), 1, -1));
        imageView.setContentDescription(gd.M0(2131752030, null));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: bi.m3
            public final /* synthetic */ o3 b;

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
                        o3 o3Var = this.b;
                        if (!o3Var.h2) {
                            o3Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        o3 o3Var2 = this.b;
                        if (!o3Var2.h2 && !o3Var2.l2 && o3Var2.e2 != null) {
                            if (o3Var2.f2 == null) {
                                o3Var2.g1();
                                break;
                            } else {
                                o3Var2.l2 = true;
                                o3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(o3Var2.m2, 5000L);
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
            n3 n3Var = new n3(i7, context, i6Var);
            if (di.x8.l(starGift.attributes, TL_stars.starGiftAttributeBackdrop.class) != null) {
                obj = null;
                z10 = true;
            } else {
                obj = null;
                z10 = false;
            }
            r14 = obj;
            r13 = 1;
            i10 = 8;
            n3Var.h(starGift, false, false, false, z10, false);
            n3Var.setImageSize(org.telegram.messenger.g0.L(90.0f));
            n3Var.K.setVisibility(8);
            frameLayout.addView(n3Var, ma.d(120, 120.0f, 49, 0.0f, 20.0f, 0.0f, 12.0f));
        } else {
            i10 = 8;
            r13 = 1;
            r14 = 0;
        }
        int i12 = org.telegram.ui.ActionBar.n6.G6;
        TextView b10 = va.b(context, 20.0f, i12, r13, r14);
        this.X1 = b10;
        b10.setGravity(17);
        this.T1.addView(b10, ma.t(-1, -2, 17, 32, starGift == null ? 20 : 0, 32, 0));
        k80 k80Var = new k80(context, i6Var);
        this.Y1 = k80Var;
        k80Var.setTextSize(r13, 15.0f);
        k80Var.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(k80Var, i12, i6Var);
        org.telegram.ui.ActionBar.u6.G(k80Var, org.telegram.ui.ActionBar.n6.J6, i6Var);
        this.T1.addView(k80Var, ma.t(-1, -2, 17, 32, 8, 32, 0));
        cy0 cy0Var = new cy0(context, i6Var);
        this.Z1 = cy0Var;
        float f11 = f10 + 14.0f;
        this.T1.addView(cy0Var, ma.s(-1, -2, 7, f11, 18.0f, f11, 0.0f));
        k80 k80Var2 = new k80(context, i6Var);
        this.a2 = k80Var2;
        k80Var2.setTextSize(r13, 15.0f);
        k80Var2.setGravity(17);
        org.telegram.ui.ActionBar.u6.U(k80Var2, i12, i6Var);
        k80Var2.setVisibility(i10);
        this.T1.addView(k80Var2, ma.t(-1, -2, 17, 32, 16, 32, 0));
        TextView b11 = va.b(context, 14.0f, org.telegram.ui.ActionBar.n6.y6, false, r14);
        this.b2 = b11;
        b11.setGravity(17);
        this.T1.addView(b11, ma.t(-1, -2, 17, 32, 14, 32, 12));
        FrameLayout frameLayout2 = new FrameLayout(context);
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.h5, frameLayout2, i6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        hi.d dVar = new hi.d(context, i6Var, false);
        this.c2 = dVar;
        dVar.f();
        dVar.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.n6.r1(0.07f, org.telegram.ui.ActionBar.n6.w0(i12, i6Var))));
        dVar.setTextColorKey(i12);
        dVar.i(gd.M0(2131752578, r14), false, r13);
        dVar.setOnClickListener(new View.OnClickListener(this) { // from class: bi.m3
            public final /* synthetic */ o3 b;

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
                        o3 o3Var = this.b;
                        if (!o3Var.h2) {
                            o3Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        o3 o3Var2 = this.b;
                        if (!o3Var2.h2 && !o3Var2.l2 && o3Var2.e2 != null) {
                            if (o3Var2.f2 == null) {
                                o3Var2.g1();
                                break;
                            } else {
                                o3Var2.l2 = true;
                                o3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(o3Var2.m2, 5000L);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout.addView(dVar, ma.m(1.0f, 0, 48, 0, 6, 0));
        hi.d dVar2 = new hi.d(context, i6Var, r13);
        this.d2 = dVar2;
        dVar2.f();
        dVar2.i(gd.M0(2131751806, r14), false, r13);
        final int i13 = 2;
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: bi.m3
            public final /* synthetic */ o3 b;

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
                        o3 o3Var = this.b;
                        if (!o3Var.h2) {
                            o3Var.dismiss();
                            break;
                        }
                        break;
                    default:
                        o3 o3Var2 = this.b;
                        if (!o3Var2.h2 && !o3Var2.l2 && o3Var2.e2 != null) {
                            if (o3Var2.f2 == null) {
                                o3Var2.g1();
                                break;
                            } else {
                                o3Var2.l2 = true;
                                o3Var2.d2.setLoading(true);
                                org.telegram.messenger.g0.h3(o3Var2.m2, 5000L);
                                break;
                            }
                        }
                        break;
                }
            }
        });
        linearLayout.addView(dVar2, ma.m(1.0f, 0, 48, 6, 0, 0));
        float f12 = f10 + 16.0f;
        frameLayout2.addView(linearLayout, ma.d(-1, 48.0f, ks.E1, f12, 8.0f, f12, 16.0f));
        this.b.addView(frameLayout2, ma.e(-1, -2, 87));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.w2 = frameLayout3;
        frameLayout3.setPadding(org.telegram.messenger.g0.L(6.0f) + this.u0, 0, org.telegram.messenger.g0.L(6.0f) + this.u0, 0);
        this.b.addView(frameLayout3, ma.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 72.0f));
        ck0 ck0Var = this.o1;
        ck0Var.setPadding(ck0Var.getPaddingLeft(), this.o1.getPaddingTop(), this.o1.getPaddingRight(), org.telegram.messenger.g0.L(72.0f) + this.o1.getPaddingBottom());
    }

    public static boolean e1(Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var, long j3, int i10) {
        int i11 = 1;
        if (org.telegram.ui.Wallet.u0.D(i7).A() >= j3) {
            return true;
        }
        String a02 = gd.a0(null, null, i10, org.telegram.ui.Wallet.u0.s(j3, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = gd.M0(2131742827, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = a02;
        alertDialog$Builder.h(gd.M0(2131742825, null), null);
        alertDialog$Builder.k(gd.M0(2131742732, null), new ai.r1(context, i7, i6Var, i11));
        alertDialog$Builder.p();
        return false;
    }

    @Override // org.telegram.ui.ActionBar.x2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.d2
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
        ai.o oVar = this.o2;
        if (oVar != null) {
            oVar.run();
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
            u0Var.o0(this.e2, new x10(this) { // from class: bi.l3
                public final /* synthetic */ o3 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
                public final void a(Object obj) {
                    switch (i7) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            o3 o3Var = this.b;
                            if (o3Var.i2) {
                                if (!bool.booleanValue()) {
                                    o3Var.i2 = false;
                                    o3Var.h2 = false;
                                    o3Var.d2.setLoading(false);
                                    x10 x10Var = o3Var.u2;
                                    if (x10Var != null) {
                                        x10Var.a("WALLET_SEND_FAILED");
                                        break;
                                    }
                                } else {
                                    if (!o3Var.j2) {
                                        o3Var.j2 = true;
                                        o3Var.i2 = false;
                                        o3Var.h2 = false;
                                        o3Var.dismiss();
                                        Runnable runnable = o3Var.r2;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                    }
                                    if (!o3Var.k2) {
                                        o3Var.k2 = true;
                                        ai.a1 a1Var = o3Var.t2;
                                        if (a1Var != null) {
                                            a1Var.run();
                                        }
                                    }
                                }
                            }
                            x10 x10Var2 = o3Var.s2;
                            if (x10Var2 != null) {
                                x10Var2.a(bool);
                                break;
                            }
                            break;
                        default:
                            String str = (String) obj;
                            o3 o3Var2 = this.b;
                            if (str == null) {
                                o3Var2.i2 = true;
                                break;
                            } else {
                                o3Var2.h2 = false;
                                o3Var2.d2.setLoading(false);
                                if (o3Var2.u2 != null && !org.telegram.ui.Wallet.u0.L(str)) {
                                    o3Var2.u2.a(str);
                                    break;
                                }
                            }
                            break;
                    }
                }
            }, new x10(this) { // from class: bi.l3
                public final /* synthetic */ o3 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.x10
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            Boolean bool = (Boolean) obj;
                            o3 o3Var = this.b;
                            if (o3Var.i2) {
                                if (!bool.booleanValue()) {
                                    o3Var.i2 = false;
                                    o3Var.h2 = false;
                                    o3Var.d2.setLoading(false);
                                    x10 x10Var = o3Var.u2;
                                    if (x10Var != null) {
                                        x10Var.a("WALLET_SEND_FAILED");
                                        break;
                                    }
                                } else {
                                    if (!o3Var.j2) {
                                        o3Var.j2 = true;
                                        o3Var.i2 = false;
                                        o3Var.h2 = false;
                                        o3Var.dismiss();
                                        Runnable runnable = o3Var.r2;
                                        if (runnable != null) {
                                            runnable.run();
                                        }
                                    }
                                    if (!o3Var.k2) {
                                        o3Var.k2 = true;
                                        ai.a1 a1Var = o3Var.t2;
                                        if (a1Var != null) {
                                            a1Var.run();
                                        }
                                    }
                                }
                            }
                            x10 x10Var2 = o3Var.s2;
                            if (x10Var2 != null) {
                                x10Var2.a(bool);
                                break;
                            }
                            break;
                        default:
                            String str = (String) obj;
                            o3 o3Var2 = this.b;
                            if (str == null) {
                                o3Var2.i2 = true;
                                break;
                            } else {
                                o3Var2.h2 = false;
                                o3Var2.d2.setLoading(false);
                                if (o3Var2.u2 != null && !org.telegram.ui.Wallet.u0.L(str)) {
                                    o3Var2.u2.a(str);
                                    break;
                                }
                            }
                            break;
                    }
                }
            }, new k3(this, 1));
            return;
        }
        Context context = getContext();
        int i11 = this.a;
        org.telegram.ui.ActionBar.i6 i6Var = this.J0;
        String a02 = gd.a0(null, null, this.q2, org.telegram.ui.Wallet.u0.s(j3, false));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, context, i6Var);
        String M0 = gd.M0(2131742827, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.a;
        u1Var.S = M0;
        u1Var.U = a02;
        alertDialog$Builder.h(gd.M0(2131742825, null), null);
        alertDialog$Builder.k(gd.M0(2131742732, null), new ai.r1(context, i11, i6Var, i7));
        alertDialog$Builder.p();
    }

    public final void h1() {
        k3 k3Var = this.p2;
        org.telegram.messenger.g0.r(k3Var);
        int i7 = this.n2;
        if (i7 <= 0) {
            return;
        }
        org.telegram.messenger.g0.h3(k3Var, Math.max(0L, (i7 - ConnectionsManager.getInstance(this.a).getCurrentTime()) * 1000));
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
        spannableStringBuilder.setSpan(new p80(L, textView), 0, spannableStringBuilder.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setVisibility(0);
        this.g2 = 0L;
        this.f2 = this.W1.l(p0Var, new b(this, 7));
    }

    @Override // org.telegram.ui.ActionBar.x2, org.telegram.ui.ActionBar.d2
    public final lc k() {
        return new lc(this.w2, this.J0);
    }

    public final void k1(CharSequence charSequence, String str) {
        this.X1.setText(str);
        setTitle(str);
        k80 k80Var = this.Y1;
        k80Var.setText(charSequence);
        k80Var.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }
}
