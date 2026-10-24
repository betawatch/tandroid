package ci;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes4.dex */
public final class h5 extends hs {
    public final /* synthetic */ i5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(i5 i5Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = i5Var;
    }

    @Override // org.telegram.ui.Components.hs
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        i5 i5Var = this.c;
        t5 t5Var = i5Var.x;
        s5 s5Var = t5Var.E;
        boolean z10 = s5Var != null && s5Var.f;
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : t5Var.O.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, LocaleController.getString(z10 ? R.string.SortByReposts : R.string.SortByReactions), false, t5Var.s);
        if (!t5Var.O.a) {
            c10.setAlpha(0.5f);
        }
        final int i10 = 0;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: ci.g5
            public final /* synthetic */ h5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        t5 t5Var2 = this.b.c.x;
                        e5 e5Var = t5Var2.O;
                        if (!e5Var.a) {
                            e5 e5Var2 = t5Var2.M;
                            if (e5Var2 != null) {
                                e5Var.a = true;
                                e5Var2.a = true;
                            } else {
                                e5Var.a = true;
                            }
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            t5Var2.N.run(t5Var2);
                        }
                        h5 h5Var = t5Var2.f;
                        if (h5Var != null) {
                            h5Var.a();
                            break;
                        }
                        break;
                    default:
                        t5 t5Var3 = this.b.c.x;
                        e5 e5Var3 = t5Var3.O;
                        if (e5Var3.a) {
                            e5 e5Var4 = t5Var3.M;
                            if (e5Var4 != null) {
                                e5Var3.a = false;
                                e5Var4.a = false;
                            } else {
                                e5Var3.a = false;
                            }
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            t5Var3.N.run(t5Var3);
                        }
                        h5 h5Var2 = t5Var3.f;
                        if (h5Var2 != null) {
                            h5Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !t5Var.O.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, t5Var.s);
        if (t5Var.O.a) {
            c11.setAlpha(0.5f);
        }
        final int i11 = 1;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: ci.g5
            public final /* synthetic */ h5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        t5 t5Var2 = this.b.c.x;
                        e5 e5Var = t5Var2.O;
                        if (!e5Var.a) {
                            e5 e5Var2 = t5Var2.M;
                            if (e5Var2 != null) {
                                e5Var.a = true;
                                e5Var2.a = true;
                            } else {
                                e5Var.a = true;
                            }
                            t5Var2.h(true);
                            t5.b(t5Var2);
                            t5Var2.N.run(t5Var2);
                        }
                        h5 h5Var = t5Var2.f;
                        if (h5Var != null) {
                            h5Var.a();
                            break;
                        }
                        break;
                    default:
                        t5 t5Var3 = this.b.c.x;
                        e5 e5Var3 = t5Var3.O;
                        if (e5Var3.a) {
                            e5 e5Var4 = t5Var3.M;
                            if (e5Var4 != null) {
                                e5Var3.a = false;
                                e5Var4.a = false;
                            } else {
                                e5Var3.a = false;
                            }
                            t5Var3.h(true);
                            t5.b(t5Var3);
                            t5Var3.N.run(t5Var3);
                        }
                        h5 h5Var2 = t5Var3.f;
                        if (h5Var2 != null) {
                            h5Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View j1Var = new org.telegram.ui.ActionBar.j1(i5Var.getContext(), org.telegram.ui.ActionBar.k6.H8, t5Var.s);
        j1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
        String string = LocaleController.getString(z10 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        b bVar = t5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.j5, bVar);
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.z5.n(-1, -2));
    }

    @Override // org.telegram.ui.Components.hs
    public final void c() {
    }
}
