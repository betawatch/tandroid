package ai;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.yr;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class x6 extends yr {
    public final /* synthetic */ y6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x6(y6 y6Var, Context context, d dVar) {
        super(context, dVar, false);
        this.c = y6Var;
    }

    @Override // org.telegram.ui.Components.yr
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        y6 y6Var = this.c;
        k7 k7Var = y6Var.x;
        j7 j7Var = k7Var.E;
        boolean z10 = j7Var != null && j7Var.f;
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : k7Var.O.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, LocaleController.getString(z10 ? R.string.SortByReposts : R.string.SortByReactions), false, k7Var.s);
        if (!k7Var.O.a) {
            c10.setAlpha(0.5f);
        }
        final int i10 = 0;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: ai.w6
            public final /* synthetic */ x6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k7 k7Var2 = this.b.c.x;
                        u6 u6Var = k7Var2.O;
                        if (!u6Var.a) {
                            u6 u6Var2 = k7Var2.M;
                            if (u6Var2 != null) {
                                u6Var.a = true;
                                u6Var2.a = true;
                            } else {
                                u6Var.a = true;
                            }
                            k7Var2.h(true);
                            k7.b(k7Var2);
                            k7Var2.N.run(k7Var2);
                        }
                        x6 x6Var = k7Var2.f;
                        if (x6Var != null) {
                            x6Var.a();
                            break;
                        }
                        break;
                    default:
                        k7 k7Var3 = this.b.c.x;
                        u6 u6Var3 = k7Var3.O;
                        if (u6Var3.a) {
                            u6 u6Var4 = k7Var3.M;
                            if (u6Var4 != null) {
                                u6Var3.a = false;
                                u6Var4.a = false;
                            } else {
                                u6Var3.a = false;
                            }
                            k7Var3.h(true);
                            k7.b(k7Var3);
                            k7Var3.N.run(k7Var3);
                        }
                        x6 x6Var2 = k7Var3.f;
                        if (x6Var2 != null) {
                            x6Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !k7Var.O.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, k7Var.s);
        if (k7Var.O.a) {
            c11.setAlpha(0.5f);
        }
        final int i11 = 1;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: ai.w6
            public final /* synthetic */ x6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        k7 k7Var2 = this.b.c.x;
                        u6 u6Var = k7Var2.O;
                        if (!u6Var.a) {
                            u6 u6Var2 = k7Var2.M;
                            if (u6Var2 != null) {
                                u6Var.a = true;
                                u6Var2.a = true;
                            } else {
                                u6Var.a = true;
                            }
                            k7Var2.h(true);
                            k7.b(k7Var2);
                            k7Var2.N.run(k7Var2);
                        }
                        x6 x6Var = k7Var2.f;
                        if (x6Var != null) {
                            x6Var.a();
                            break;
                        }
                        break;
                    default:
                        k7 k7Var3 = this.b.c.x;
                        u6 u6Var3 = k7Var3.O;
                        if (u6Var3.a) {
                            u6 u6Var4 = k7Var3.M;
                            if (u6Var4 != null) {
                                u6Var3.a = false;
                                u6Var4.a = false;
                            } else {
                                u6Var3.a = false;
                            }
                            k7Var3.h(true);
                            k7.b(k7Var3);
                            k7Var3.N.run(k7Var3);
                        }
                        x6 x6Var2 = k7Var3.f;
                        if (x6Var2 != null) {
                            x6Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View k1Var = new org.telegram.ui.ActionBar.k1(y6Var.getContext(), org.telegram.ui.ActionBar.h6.H8, k7Var.s);
        k1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.x5.n(-1, 8));
        String string = LocaleController.getString(z10 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        d dVar = k7Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.j5, dVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.x5.n(-1, -2));
    }

    @Override // org.telegram.ui.Components.yr
    public final void c() {
    }
}
