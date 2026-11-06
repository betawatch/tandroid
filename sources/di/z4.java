package di;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import c8.ha;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class z4 extends k.a {
    public final /* synthetic */ a5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(a5 a5Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = a5Var;
    }

    @Override // k.a
    public final void j(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        final int i7 = 1;
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        a5 a5Var = this.c;
        k5 k5Var = a5Var.y;
        j5 j5Var = k5Var.E;
        final int i10 = 0;
        boolean z9 = j5Var != null && j5Var.f;
        org.telegram.ui.ActionBar.z0 c10 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z9 ? R.drawable.menu_views_reposts : k5Var.O.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, hd.M0(z9 ? 2131745290 : 2131745291, null), false, k5Var.s);
        if (!k5Var.O.a) {
            c10.setAlpha(0.5f);
        }
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: di.y4
            public final /* synthetic */ z4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k5 k5Var2 = this.b.c.y;
                        w4 w4Var = k5Var2.O;
                        if (!w4Var.a) {
                            w4 w4Var2 = k5Var2.M;
                            if (w4Var2 != null) {
                                w4Var.a = true;
                                w4Var2.a = true;
                            } else {
                                w4Var.a = true;
                            }
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            k5Var2.N.a(k5Var2);
                        }
                        z4 z4Var = k5Var2.f;
                        if (z4Var != null) {
                            z4Var.a();
                            break;
                        }
                        break;
                    default:
                        k5 k5Var3 = this.b.c.y;
                        w4 w4Var3 = k5Var3.O;
                        if (w4Var3.a) {
                            w4 w4Var4 = k5Var3.M;
                            if (w4Var4 != null) {
                                w4Var3.a = false;
                                w4Var4.a = false;
                            } else {
                                w4Var3.a = false;
                            }
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            k5Var3.N.a(k5Var3);
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
        org.telegram.ui.ActionBar.z0 c11 = org.telegram.ui.ActionBar.r0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !k5Var.O.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, hd.M0(2131745289, null), false, k5Var.s);
        if (k5Var.O.a) {
            c11.setAlpha(0.5f);
        }
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: di.y4
            public final /* synthetic */ z4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        k5 k5Var2 = this.b.c.y;
                        w4 w4Var = k5Var2.O;
                        if (!w4Var.a) {
                            w4 w4Var2 = k5Var2.M;
                            if (w4Var2 != null) {
                                w4Var.a = true;
                                w4Var2.a = true;
                            } else {
                                w4Var.a = true;
                            }
                            k5Var2.h(true);
                            k5.b(k5Var2);
                            k5Var2.N.a(k5Var2);
                        }
                        z4 z4Var = k5Var2.f;
                        if (z4Var != null) {
                            z4Var.a();
                            break;
                        }
                        break;
                    default:
                        k5 k5Var3 = this.b.c.y;
                        w4 w4Var3 = k5Var3.O;
                        if (w4Var3.a) {
                            w4 w4Var4 = k5Var3.M;
                            if (w4Var4 != null) {
                                w4Var3.a = false;
                                w4Var4.a = false;
                            } else {
                                w4Var3.a = false;
                            }
                            k5Var3.h(true);
                            k5.b(k5Var3);
                            k5Var3.N.a(k5Var3);
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
        View d1Var = new org.telegram.ui.ActionBar.d1(org.telegram.ui.ActionBar.k6.H8, a5Var.getContext(), k5Var.s);
        d1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(d1Var, ha.o(-1, 8));
        String M0 = hd.M0(z9 ? 2131744503 : 2131744446, null);
        b bVar = k5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.j5, bVar);
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
