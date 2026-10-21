package ci;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.hs;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes4.dex */
public final class i5 extends hs {
    public final /* synthetic */ j5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5(j5 j5Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = j5Var;
    }

    @Override // org.telegram.ui.Components.hs
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.f(0.18f, -16777216, -1));
        j5 j5Var = this.c;
        u5 u5Var = j5Var.x;
        t5 t5Var = u5Var.E;
        boolean z10 = t5Var != null && t5Var.f;
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : u5Var.O.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, LocaleController.getString(z10 ? R.string.SortByReposts : R.string.SortByReactions), false, u5Var.s);
        if (!u5Var.O.a) {
            c10.setAlpha(0.5f);
        }
        final int i10 = 0;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: ci.h5
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        u5 u5Var2 = this.b.c.x;
                        f5 f5Var = u5Var2.O;
                        if (!f5Var.a) {
                            f5 f5Var2 = u5Var2.M;
                            if (f5Var2 != null) {
                                f5Var.a = true;
                                f5Var2.a = true;
                            } else {
                                f5Var.a = true;
                            }
                            u5Var2.h(true);
                            u5.b(u5Var2);
                            u5Var2.N.run(u5Var2);
                        }
                        i5 i5Var = u5Var2.f;
                        if (i5Var != null) {
                            i5Var.a();
                            break;
                        }
                        break;
                    default:
                        u5 u5Var3 = this.b.c.x;
                        f5 f5Var3 = u5Var3.O;
                        if (f5Var3.a) {
                            f5 f5Var4 = u5Var3.M;
                            if (f5Var4 != null) {
                                f5Var3.a = false;
                                f5Var4.a = false;
                            } else {
                                f5Var3.a = false;
                            }
                            u5Var3.h(true);
                            u5.b(u5Var3);
                            u5Var3.N.run(u5Var3);
                        }
                        i5 i5Var2 = u5Var3.f;
                        if (i5Var2 != null) {
                            i5Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !u5Var.O.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, u5Var.s);
        if (u5Var.O.a) {
            c11.setAlpha(0.5f);
        }
        final int i11 = 1;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: ci.h5
            public final /* synthetic */ i5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        u5 u5Var2 = this.b.c.x;
                        f5 f5Var = u5Var2.O;
                        if (!f5Var.a) {
                            f5 f5Var2 = u5Var2.M;
                            if (f5Var2 != null) {
                                f5Var.a = true;
                                f5Var2.a = true;
                            } else {
                                f5Var.a = true;
                            }
                            u5Var2.h(true);
                            u5.b(u5Var2);
                            u5Var2.N.run(u5Var2);
                        }
                        i5 i5Var = u5Var2.f;
                        if (i5Var != null) {
                            i5Var.a();
                            break;
                        }
                        break;
                    default:
                        u5 u5Var3 = this.b.c.x;
                        f5 f5Var3 = u5Var3.O;
                        if (f5Var3.a) {
                            f5 f5Var4 = u5Var3.M;
                            if (f5Var4 != null) {
                                f5Var3.a = false;
                                f5Var4.a = false;
                            } else {
                                f5Var3.a = false;
                            }
                            u5Var3.h(true);
                            u5.b(u5Var3);
                            u5Var3.N.run(u5Var3);
                        }
                        i5 i5Var2 = u5Var3.f;
                        if (i5Var2 != null) {
                            i5Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View j1Var = new org.telegram.ui.ActionBar.j1(j5Var.getContext(), org.telegram.ui.ActionBar.h6.H8, u5Var.s);
        j1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
        String string = LocaleController.getString(z10 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        b bVar = u5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.j5, bVar));
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
