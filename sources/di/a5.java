package di;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a5 extends k.a {
    public final /* synthetic */ b5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(b5 b5Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = b5Var;
    }

    @Override // k.a
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        final int i7 = 1;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        b5 b5Var = this.c;
        l5 l5Var = b5Var.y;
        k5 k5Var = l5Var.E;
        final int i10 = 0;
        boolean z9 = k5Var != null && k5Var.f;
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z9 ? R.drawable.menu_views_reposts : l5Var.O.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, id.M0(z9 ? 2131745289 : 2131745290, null), false, l5Var.s);
        if (!l5Var.O.a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: di.z4
            public final /* synthetic */ a5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        l5 l5Var2 = this.b.c.y;
                        x4 x4Var = l5Var2.O;
                        if (!x4Var.a) {
                            x4 x4Var2 = l5Var2.M;
                            if (x4Var2 != null) {
                                x4Var.a = true;
                                x4Var2.a = true;
                            } else {
                                x4Var.a = true;
                            }
                            l5Var2.h(true);
                            l5.b(l5Var2);
                            l5Var2.N.a(l5Var2);
                        }
                        a5 a5Var = l5Var2.f;
                        if (a5Var != null) {
                            a5Var.a();
                            break;
                        }
                        break;
                    default:
                        l5 l5Var3 = this.b.c.y;
                        x4 x4Var3 = l5Var3.O;
                        if (x4Var3.a) {
                            x4 x4Var4 = l5Var3.M;
                            if (x4Var4 != null) {
                                x4Var3.a = false;
                                x4Var4.a = false;
                            } else {
                                x4Var3.a = false;
                            }
                            l5Var3.h(true);
                            l5.b(l5Var3);
                            l5Var3.N.a(l5Var3);
                        }
                        a5 a5Var2 = l5Var3.f;
                        if (a5Var2 != null) {
                            a5Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !l5Var.O.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, id.M0(2131745288, null), false, l5Var.s);
        if (l5Var.O.a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: di.z4
            public final /* synthetic */ a5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        l5 l5Var2 = this.b.c.y;
                        x4 x4Var = l5Var2.O;
                        if (!x4Var.a) {
                            x4 x4Var2 = l5Var2.M;
                            if (x4Var2 != null) {
                                x4Var.a = true;
                                x4Var2.a = true;
                            } else {
                                x4Var.a = true;
                            }
                            l5Var2.h(true);
                            l5.b(l5Var2);
                            l5Var2.N.a(l5Var2);
                        }
                        a5 a5Var = l5Var2.f;
                        if (a5Var != null) {
                            a5Var.a();
                            break;
                        }
                        break;
                    default:
                        l5 l5Var3 = this.b.c.y;
                        x4 x4Var3 = l5Var3.O;
                        if (x4Var3.a) {
                            x4 x4Var4 = l5Var3.M;
                            if (x4Var4 != null) {
                                x4Var3.a = false;
                                x4Var4.a = false;
                            } else {
                                x4Var3.a = false;
                            }
                            l5Var3.h(true);
                            l5.b(l5Var3);
                            l5Var3.N.a(l5Var3);
                        }
                        a5 a5Var2 = l5Var3.f;
                        if (a5Var2 != null) {
                            a5Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.m6.H8, b5Var.getContext(), l5Var.s);
        d1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ha.o(-1, 8));
        String M0 = id.M0(z9 ? 2131744502 : 2131744445, null);
        b bVar = l5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.j5, bVar);
        textView.setPadding(org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(8.0f));
        textView.setText(M0);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(org.telegram.messenger.g0.L(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, ha.o(-1, -2));
    }

    @Override // k.a
    public final void k() {
    }
}
