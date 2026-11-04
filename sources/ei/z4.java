package ei;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z4 extends k.a {
    public final /* synthetic */ a5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(a5 a5Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = a5Var;
    }

    @Override // k.a
    public final void k(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        final int i3 = 1;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        a5 a5Var = this.c;
        k5 k5Var = a5Var.y;
        j5 j5Var = k5Var.F;
        final int i10 = 0;
        boolean z10 = j5Var != null && j5Var.f;
        org.telegram.ui.ActionBar.y0 c2 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : k5Var.P.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, bd.M0(z10 ? 2131745299 : 2131745300, null), false, k5Var.s);
        if (!k5Var.P.a) {
            c2.setAlpha(0.5f);
        }
        c2.setOnClickListener(new View.OnClickListener(this) { // from class: ei.y4
            public final /* synthetic */ z4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k5 k5Var2 = this.b.c.y;
                        w4 w4Var = k5Var2.P;
                        if (!w4Var.a) {
                            w4 w4Var2 = k5Var2.N;
                            if (w4Var2 != null) {
                                w4Var.a = true;
                                w4Var2.a = true;
                            } else {
                                w4Var.a = true;
                            }
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            k5Var2.O.a(k5Var2);
                        }
                        z4 z4Var = k5Var2.f;
                        if (z4Var != null) {
                            z4Var.a();
                            break;
                        }
                        break;
                    default:
                        k5 k5Var3 = this.b.c.y;
                        w4 w4Var3 = k5Var3.P;
                        if (w4Var3.a) {
                            w4 w4Var4 = k5Var3.N;
                            if (w4Var4 != null) {
                                w4Var3.a = false;
                                w4Var4.a = false;
                            } else {
                                w4Var3.a = false;
                            }
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            k5Var3.O.a(k5Var3);
                        }
                        z4 z4Var2 = k5Var3.f;
                        if (z4Var2 != null) {
                            z4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.y0 c10 = org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !k5Var.P.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, bd.M0(2131745298, null), false, k5Var.s);
        if (k5Var.P.a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: ei.y4
            public final /* synthetic */ z4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        k5 k5Var2 = this.b.c.y;
                        w4 w4Var = k5Var2.P;
                        if (!w4Var.a) {
                            w4 w4Var2 = k5Var2.N;
                            if (w4Var2 != null) {
                                w4Var.a = true;
                                w4Var2.a = true;
                            } else {
                                w4Var.a = true;
                            }
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            k5Var2.O.a(k5Var2);
                        }
                        z4 z4Var = k5Var2.f;
                        if (z4Var != null) {
                            z4Var.a();
                            break;
                        }
                        break;
                    default:
                        k5 k5Var3 = this.b.c.y;
                        w4 w4Var3 = k5Var3.P;
                        if (w4Var3.a) {
                            w4 w4Var4 = k5Var3.N;
                            if (w4Var4 != null) {
                                w4Var3.a = false;
                                w4Var4.a = false;
                            } else {
                                w4Var3.a = false;
                            }
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            k5Var3.O.a(k5Var3);
                        }
                        z4 z4Var2 = k5Var3.f;
                        if (z4Var2 != null) {
                            z4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View c1Var = new org.telegram.ui.ActionBar.c1(org.telegram.ui.ActionBar.k6.H8, a5Var.getContext(), k5Var.s);
        c1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(c1Var, mf.o(-1, 8));
        String M0 = bd.M0(z10 ? 2131744512 : 2131744455, null);
        b bVar = k5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, bVar);
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setText(M0);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, mf.o(-1, -2));
    }

    @Override // k.a
    public final void l() {
    }
}
