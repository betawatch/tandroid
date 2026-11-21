package fi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c8.ma;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.gd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes4.dex */
public final class q4 extends k.a {
    public final /* synthetic */ r4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(r4 r4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = r4Var;
    }

    @Override // k.a
    public final void l(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        final int i7 = 1;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        r4 r4Var = this.c;
        b5 b5Var = r4Var.y;
        a5 a5Var = b5Var.F;
        final int i10 = 0;
        boolean z10 = a5Var != null && a5Var.f;
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : b5Var.P.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, gd.N0(z10 ? 2131745093 : 2131745094, null), false, b5Var.s);
        if (!b5Var.P.a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: fi.p4
            public final /* synthetic */ q4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        b5 b5Var2 = this.b.c.y;
                        n4 n4Var = b5Var2.P;
                        if (!n4Var.a) {
                            n4 n4Var2 = b5Var2.N;
                            if (n4Var2 != null) {
                                n4Var.a = true;
                                n4Var2.a = true;
                            } else {
                                n4Var.a = true;
                            }
                            b5Var2.h(true);
                            b5.b(b5Var2);
                            b5Var2.O.a(b5Var2);
                        }
                        q4 q4Var = b5Var2.f;
                        if (q4Var != null) {
                            q4Var.a();
                            break;
                        }
                        break;
                    default:
                        b5 b5Var3 = this.b.c.y;
                        n4 n4Var3 = b5Var3.P;
                        if (n4Var3.a) {
                            n4 n4Var4 = b5Var3.N;
                            if (n4Var4 != null) {
                                n4Var3.a = false;
                                n4Var4.a = false;
                            } else {
                                n4Var3.a = false;
                            }
                            b5Var3.h(true);
                            b5.b(b5Var3);
                            b5Var3.O.a(b5Var3);
                        }
                        q4 q4Var2 = b5Var3.f;
                        if (q4Var2 != null) {
                            q4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c11 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !b5Var.P.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, gd.N0(2131745092, null), false, b5Var.s);
        if (b5Var.P.a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: fi.p4
            public final /* synthetic */ q4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        b5 b5Var2 = this.b.c.y;
                        n4 n4Var = b5Var2.P;
                        if (!n4Var.a) {
                            n4 n4Var2 = b5Var2.N;
                            if (n4Var2 != null) {
                                n4Var.a = true;
                                n4Var2.a = true;
                            } else {
                                n4Var.a = true;
                            }
                            b5Var2.h(true);
                            b5.b(b5Var2);
                            b5Var2.O.a(b5Var2);
                        }
                        q4 q4Var = b5Var2.f;
                        if (q4Var != null) {
                            q4Var.a();
                            break;
                        }
                        break;
                    default:
                        b5 b5Var3 = this.b.c.y;
                        n4 n4Var3 = b5Var3.P;
                        if (n4Var3.a) {
                            n4 n4Var4 = b5Var3.N;
                            if (n4Var4 != null) {
                                n4Var3.a = false;
                                n4Var4.a = false;
                            } else {
                                n4Var3.a = false;
                            }
                            b5Var3.h(true);
                            b5.b(b5Var3);
                            b5Var3.O.a(b5Var3);
                        }
                        q4 q4Var2 = b5Var3.f;
                        if (q4Var2 != null) {
                            q4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, r4Var.getContext(), b5Var.s);
        d1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ma.o(-1, 8));
        String N0 = gd.N0(z10 ? 2131744261 : 2131744204, null);
        b bVar = b5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, bVar);
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setText(N0);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, ma.o(-1, -2));
    }

    @Override // k.a
    public final void m() {
    }
}
