package fi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c8.ja;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class r4 extends k.a {
    public final /* synthetic */ s4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(s4 s4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = s4Var;
    }

    @Override // k.a
    public final void k(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        final int i7 = 1;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        s4 s4Var = this.c;
        c5 c5Var = s4Var.y;
        b5 b5Var = c5Var.F;
        final int i10 = 0;
        boolean z10 = b5Var != null && b5Var.f;
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : c5Var.P.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, hd.M0(z10 ? 2131745289 : 2131745290, null), false, c5Var.s);
        if (!c5Var.P.a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: fi.q4
            public final /* synthetic */ r4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        c5 c5Var2 = this.b.c.y;
                        o4 o4Var = c5Var2.P;
                        if (!o4Var.a) {
                            o4 o4Var2 = c5Var2.N;
                            if (o4Var2 != null) {
                                o4Var.a = true;
                                o4Var2.a = true;
                            } else {
                                o4Var.a = true;
                            }
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            c5Var2.O.a(c5Var2);
                        }
                        r4 r4Var = c5Var2.f;
                        if (r4Var != null) {
                            r4Var.a();
                            break;
                        }
                        break;
                    default:
                        c5 c5Var3 = this.b.c.y;
                        o4 o4Var3 = c5Var3.P;
                        if (o4Var3.a) {
                            o4 o4Var4 = c5Var3.N;
                            if (o4Var4 != null) {
                                o4Var3.a = false;
                                o4Var4.a = false;
                            } else {
                                o4Var3.a = false;
                            }
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            c5Var3.O.a(c5Var3);
                        }
                        r4 r4Var2 = c5Var3.f;
                        if (r4Var2 != null) {
                            r4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !c5Var.P.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, hd.M0(2131745288, null), false, c5Var.s);
        if (c5Var.P.a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: fi.q4
            public final /* synthetic */ r4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        c5 c5Var2 = this.b.c.y;
                        o4 o4Var = c5Var2.P;
                        if (!o4Var.a) {
                            o4 o4Var2 = c5Var2.N;
                            if (o4Var2 != null) {
                                o4Var.a = true;
                                o4Var2.a = true;
                            } else {
                                o4Var.a = true;
                            }
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            c5Var2.O.a(c5Var2);
                        }
                        r4 r4Var = c5Var2.f;
                        if (r4Var != null) {
                            r4Var.a();
                            break;
                        }
                        break;
                    default:
                        c5 c5Var3 = this.b.c.y;
                        o4 o4Var3 = c5Var3.P;
                        if (o4Var3.a) {
                            o4 o4Var4 = c5Var3.N;
                            if (o4Var4 != null) {
                                o4Var3.a = false;
                                o4Var4.a = false;
                            } else {
                                o4Var3.a = false;
                            }
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            c5Var3.O.a(c5Var3);
                        }
                        r4 r4Var2 = c5Var3.f;
                        if (r4Var2 != null) {
                            r4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.j6.H8, s4Var.getContext(), c5Var.s);
        d1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ja.o(-1, 8));
        String M0 = hd.M0(z10 ? 2131744502 : 2131744445, null);
        b bVar = c5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.j5, bVar);
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setText(M0);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, ja.o(-1, -2));
    }

    @Override // k.a
    public final void l() {
    }
}
