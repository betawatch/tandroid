package ai;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ns;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class y6 extends ns {
    public final /* synthetic */ z6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y6(z6 z6Var, Context context, d dVar) {
        super(context, dVar, false);
        this.c = z6Var;
    }

    @Override // org.telegram.ui.Components.ns
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        z6 z6Var = this.c;
        l7 l7Var = z6Var.x;
        k7 k7Var = l7Var.E;
        boolean z10 = k7Var != null && k7Var.f;
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : l7Var.O.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, LocaleController.getString(z10 ? R.string.SortByReposts : R.string.SortByReactions), false, l7Var.s);
        if (!l7Var.O.a) {
            c10.setAlpha(0.5f);
        }
        final int i10 = 0;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: ai.x6
            public final /* synthetic */ y6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        l7 l7Var2 = this.b.c.x;
                        v6 v6Var = l7Var2.O;
                        if (!v6Var.a) {
                            v6 v6Var2 = l7Var2.M;
                            if (v6Var2 != null) {
                                v6Var.a = true;
                                v6Var2.a = true;
                            } else {
                                v6Var.a = true;
                            }
                            l7Var2.h(true);
                            l7.b(l7Var2);
                            l7Var2.N.run(l7Var2);
                        }
                        y6 y6Var = l7Var2.f;
                        if (y6Var != null) {
                            y6Var.a();
                            break;
                        }
                        break;
                    default:
                        l7 l7Var3 = this.b.c.x;
                        v6 v6Var3 = l7Var3.O;
                        if (v6Var3.a) {
                            v6 v6Var4 = l7Var3.M;
                            if (v6Var4 != null) {
                                v6Var3.a = false;
                                v6Var4.a = false;
                            } else {
                                v6Var3.a = false;
                            }
                            l7Var3.h(true);
                            l7.b(l7Var3);
                            l7Var3.N.run(l7Var3);
                        }
                        y6 y6Var2 = l7Var3.f;
                        if (y6Var2 != null) {
                            y6Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !l7Var.O.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, l7Var.s);
        if (l7Var.O.a) {
            c11.setAlpha(0.5f);
        }
        final int i11 = 1;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: ai.x6
            public final /* synthetic */ y6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        l7 l7Var2 = this.b.c.x;
                        v6 v6Var = l7Var2.O;
                        if (!v6Var.a) {
                            v6 v6Var2 = l7Var2.M;
                            if (v6Var2 != null) {
                                v6Var.a = true;
                                v6Var2.a = true;
                            } else {
                                v6Var.a = true;
                            }
                            l7Var2.h(true);
                            l7.b(l7Var2);
                            l7Var2.N.run(l7Var2);
                        }
                        y6 y6Var = l7Var2.f;
                        if (y6Var != null) {
                            y6Var.a();
                            break;
                        }
                        break;
                    default:
                        l7 l7Var3 = this.b.c.x;
                        v6 v6Var3 = l7Var3.O;
                        if (v6Var3.a) {
                            v6 v6Var4 = l7Var3.M;
                            if (v6Var4 != null) {
                                v6Var3.a = false;
                                v6Var4.a = false;
                            } else {
                                v6Var3.a = false;
                            }
                            l7Var3.h(true);
                            l7.b(l7Var3);
                            l7Var3.N.run(l7Var3);
                        }
                        y6 y6Var2 = l7Var3.f;
                        if (y6Var2 != null) {
                            y6Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View k1Var = new org.telegram.ui.ActionBar.k1(z6Var.getContext(), org.telegram.ui.ActionBar.i6.H8, l7Var.s);
        k1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.x5.n(-1, 8));
        String string = LocaleController.getString(z10 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        d dVar = l7Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.j5, dVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.x5.n(-1, -2));
    }

    @Override // org.telegram.ui.Components.ns
    public final void c() {
    }
}
