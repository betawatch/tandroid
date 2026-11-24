// default package

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class jp2 extends np2 {
    public final /* synthetic */ byte h;
    public final /* synthetic */ pp2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jp2(pp2 pp2Var, Context context, byte b) {
        super(pp2Var, context);
        this.h = b;
        byte b2 = 2;
        byte b3 = 3;
        byte b4 = 5;
        final byte b5 = 0;
        switch (b) {
            case 1:
                this.n = pp2Var;
                super(pp2Var, context);
                q7c q7cVar = new q7c(context, pp2Var.a, 0, false, new dp2(pp2Var, b4), new ep2(pp2Var, b4), null, pp2Var.J0);
                this.d = q7cVar;
                q7cVar.r1();
                q7c q7cVar2 = this.d;
                q7cVar2.g3.r = false;
                q7cVar2.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, gm.L(60.0f) + gm.n);
                this.d.j(new ip2(this, b2));
                this.c.addView(this.d, 0, qoe.c(-1.0f, -1));
                a aVar = new a(context, pp2Var.J0);
                this.a = aVar;
                aVar.setOccupyStatusBar(false);
                a aVar2 = this.a;
                int i = cmb.F6;
                anb.l(aVar2, 5, i, pp2Var.J0);
                anb.l(this.a, 3, cmb.y8, pp2Var.J0);
                this.a.setBackButtonImage(R.drawable.ic_ab_back);
                anb.l(this.a, 1, cmb.x8, pp2Var.J0);
                this.a.setTitle(jb6.M0(2131751823, null));
                this.a.getTitleTextView().setTranslationX(-gm.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new fh2(this, (byte) 6));
                this.c.addView(this.a, qoe.e(-1, 56, 48));
                LinearLayout i2 = hg9.i(context, 0);
                i2.setPadding(gm.L(7.0f), 0, gm.L(7.0f), gm.L(12.0f));
                b61 b61Var = new b61(pp2Var.J0, context, true);
                b61Var.e();
                int i3 = cmb.c6;
                b61Var.setColor(on2.f(0.125f, cmb.v0(i3, pp2Var.J0), cmb.v0(i, pp2Var.J0)));
                b61Var.setText(jb6.M0(2131751837, null));
                b61Var.f();
                if (b61Var.getBackground() != null) {
                    Drawable background = b61Var.getBackground();
                    ylb ylbVar = pp2Var.J0;
                    b61Var.setBackground(background);
                    vmb o = anb.o(b61Var, true);
                    o.d = background;
                    o.e = null;
                    o.f = null;
                    if (background != null) {
                        umb umbVar = new umb();
                        o.e = umbVar;
                        umbVar.c(i3, i, 3, 0.125f, ylbVar);
                        umbVar.g = anb.t(background);
                    }
                }
                b61Var.setOnClickListener(new View.OnClickListener(this) { // from class: op2
                    public final /* synthetic */ jp2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b6 = b5;
                        jp2 jp2Var = this.b;
                        switch (b6) {
                            case 0:
                                jp2Var.n.G1.f(false, true);
                                break;
                            default:
                                jp2Var.n.G1.f(true, true);
                                break;
                        }
                    }
                });
                i2.addView(b61Var, qoe.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                final byte b6 = 1;
                b61 b61Var2 = new b61(pp2Var.J0, context, true);
                b61Var2.setText(jb6.M0(2131751839, null));
                b61Var2.f();
                b61Var2.setOnClickListener(new View.OnClickListener(this) { // from class: op2
                    public final /* synthetic */ jp2 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b62 = b6;
                        jp2 jp2Var = this.b;
                        switch (b62) {
                            case 0:
                                jp2Var.n.G1.f(false, true);
                                break;
                            default:
                                jp2Var.n.G1.f(true, true);
                                break;
                        }
                    }
                });
                i2.addView(b61Var2, qoe.q(0, 48, 1.0f, 0, 4, 0, 4, 0));
                this.c.addView(i2, qoe.f(-2.0f, -1, 80, 0, 0, 0, gm.n));
                a();
                break;
            default:
                this.n = pp2Var;
                gm.B2(this.b);
                q7c q7cVar3 = new q7c(context, pp2Var.a, 0, false, new dp2(pp2Var, b3), new ep2(pp2Var, b2), null, pp2Var.J0);
                this.d = q7cVar3;
                q7cVar3.r1();
                q7c q7cVar4 = this.d;
                q7cVar4.g3.r = false;
                q7cVar4.setClipToPadding(false);
                this.d.setPadding(0, 0, 0, gm.L(60.0f) + gm.n);
                this.c.addView(pp2Var.A1, qoe.g());
                this.c.addView(this.d, 0, qoe.c(-1.0f, -1));
                this.c.addView(pp2Var.C1, qoe.g());
                a aVar3 = new a(context, pp2Var.J0);
                this.a = aVar3;
                aVar3.setOccupyStatusBar(false);
                anb.l(this.a, 5, cmb.F6, pp2Var.J0);
                anb.l(this.a, 3, cmb.y8, pp2Var.J0);
                a aVar4 = this.a;
                boolean z = pp2Var.H1;
                aVar4.setBackButtonImage(z ? R.drawable.ic_ab_close : R.drawable.ic_ab_back);
                anb.l(this.a, 1, cmb.x8, pp2Var.J0);
                this.a.setTitle(jb6.M0(2131751925, null));
                this.a.getTitleTextView().setTranslationX(-gm.L(18.0f));
                this.a.setActionBarMenuOnItemClick(new fh2(this, (byte) 4));
                this.c.addView(this.a, qoe.e(-1, 56, 48));
                this.c.addView(pp2Var.y1, qoe.d(-1, 40.0f, 48, 11.0f, 0.0f, 11.0f, 0.0f));
                r6 t = this.a.t();
                t.setGlassMode(true);
                t.setTranslationX(-gm.L(7.0f));
                t.a(3, R.drawable.outline_header_search);
                b61 b61Var3 = new b61(pp2Var.J0, getContext(), true);
                pp2Var.s1 = b61Var3;
                b61Var3.f();
                pp2Var.s1.setText(jb6.M0(2131747564, null));
                pp2Var.s1.setOnClickListener(new k81(this, (byte) 20));
                if (z) {
                    pp2Var.s1.setVisibility(8);
                }
                this.c.addView(pp2Var.s1, qoe.f(48.0f, -1, 80, gm.L(12.0f), 0, gm.L(12.0f), gm.L(12.0f) + gm.n));
                a();
                break;
        }
    }

    @Override // np2
    public final float b() {
        switch (this.h) {
            case 0:
                return aie.a(this.n.m1.e) * super.b();
            default:
                return super.b();
        }
    }

    @Override // np2
    public final void c() {
        switch (this.h) {
            case 0:
                super.c();
                this.n.y1.setTranslationY(Math.max(gm.L(8.0f) + gm.m, b() + gm.L(4.0f)));
                break;
            default:
                super.c();
                break;
        }
    }
}
