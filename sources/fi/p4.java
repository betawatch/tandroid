package fi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes4.dex */
public final class p4 extends k.a {
    public final /* synthetic */ q4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(q4 q4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = q4Var;
    }

    @Override // k.a
    public final void l(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        final int i7 = 1;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        q4 q4Var = this.c;
        a5 a5Var = q4Var.y;
        z4 z4Var = a5Var.F;
        final int i10 = 0;
        boolean z10 = z4Var != null && z4Var.f;
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : a5Var.P.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, gd.M0(z10 ? 2131745094 : 2131745095, null), false, a5Var.s);
        if (!a5Var.P.a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: fi.o4
            public final /* synthetic */ p4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        a5 a5Var2 = this.b.c.y;
                        m4 m4Var = a5Var2.P;
                        if (!m4Var.a) {
                            m4 m4Var2 = a5Var2.N;
                            if (m4Var2 != null) {
                                m4Var.a = true;
                                m4Var2.a = true;
                            } else {
                                m4Var.a = true;
                            }
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            a5Var2.O.a(a5Var2);
                        }
                        p4 p4Var = a5Var2.f;
                        if (p4Var != null) {
                            p4Var.a();
                            break;
                        }
                        break;
                    default:
                        a5 a5Var3 = this.b.c.y;
                        m4 m4Var3 = a5Var3.P;
                        if (m4Var3.a) {
                            m4 m4Var4 = a5Var3.N;
                            if (m4Var4 != null) {
                                m4Var3.a = false;
                                m4Var4.a = false;
                            } else {
                                m4Var3.a = false;
                            }
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            a5Var3.O.a(a5Var3);
                        }
                        p4 p4Var2 = a5Var3.f;
                        if (p4Var2 != null) {
                            p4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !a5Var.P.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, gd.M0(2131745093, null), false, a5Var.s);
        if (a5Var.P.a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: fi.o4
            public final /* synthetic */ p4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        a5 a5Var2 = this.b.c.y;
                        m4 m4Var = a5Var2.P;
                        if (!m4Var.a) {
                            m4 m4Var2 = a5Var2.N;
                            if (m4Var2 != null) {
                                m4Var.a = true;
                                m4Var2.a = true;
                            } else {
                                m4Var.a = true;
                            }
                            a5Var2.h(true);
                            a5.b(a5Var2);
                            a5Var2.O.a(a5Var2);
                        }
                        p4 p4Var = a5Var2.f;
                        if (p4Var != null) {
                            p4Var.a();
                            break;
                        }
                        break;
                    default:
                        a5 a5Var3 = this.b.c.y;
                        m4 m4Var3 = a5Var3.P;
                        if (m4Var3.a) {
                            m4 m4Var4 = a5Var3.N;
                            if (m4Var4 != null) {
                                m4Var3.a = false;
                                m4Var4.a = false;
                            } else {
                                m4Var3.a = false;
                            }
                            a5Var3.h(true);
                            a5.b(a5Var3);
                            a5Var3.O.a(a5Var3);
                        }
                        p4 p4Var2 = a5Var3.f;
                        if (p4Var2 != null) {
                            p4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View e1Var = new org.telegram.ui.ActionBar.e1(org.telegram.ui.ActionBar.n6.H8, q4Var.getContext(), a5Var.s);
        e1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(e1Var, ma.o(-1, 8));
        String M0 = gd.M0(z10 ? 2131744267 : 2131744210, null);
        b bVar = a5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.j5, bVar);
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setText(M0);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, ma.o(-1, -2));
    }

    @Override // k.a
    public final void m() {
    }
}
