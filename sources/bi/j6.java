package bi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ks;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class j6 extends ks {
    public final /* synthetic */ k6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(k6 k6Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = k6Var;
    }

    @Override // org.telegram.ui.Components.ks
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        k6 k6Var = this.c;
        w6 w6Var = k6Var.x;
        v6 v6Var = w6Var.E;
        boolean z10 = v6Var != null && v6Var.f;
        org.telegram.ui.ActionBar.e1 c10 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : w6Var.O.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, LocaleController.getString(z10 ? R.string.SortByReposts : R.string.SortByReactions), false, w6Var.s);
        if (!w6Var.O.a) {
            c10.setAlpha(0.5f);
        }
        final int i10 = 0;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: bi.i6
            public final /* synthetic */ j6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        w6 w6Var2 = this.b.c.x;
                        g6 g6Var = w6Var2.O;
                        if (!g6Var.a) {
                            g6 g6Var2 = w6Var2.M;
                            if (g6Var2 != null) {
                                g6Var.a = true;
                                g6Var2.a = true;
                            } else {
                                g6Var.a = true;
                            }
                            w6Var2.h(true);
                            w6.b(w6Var2);
                            w6Var2.N.run(w6Var2);
                        }
                        j6 j6Var = w6Var2.f;
                        if (j6Var != null) {
                            j6Var.a();
                            break;
                        }
                        break;
                    default:
                        w6 w6Var3 = this.b.c.x;
                        g6 g6Var3 = w6Var3.O;
                        if (g6Var3.a) {
                            g6 g6Var4 = w6Var3.M;
                            if (g6Var4 != null) {
                                g6Var3.a = false;
                                g6Var4.a = false;
                            } else {
                                g6Var3.a = false;
                            }
                            w6Var3.h(true);
                            w6.b(w6Var3);
                            w6Var3.N.run(w6Var3);
                        }
                        j6 j6Var2 = w6Var3.f;
                        if (j6Var2 != null) {
                            j6Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.e1 c11 = org.telegram.ui.ActionBar.u0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !w6Var.O.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, w6Var.s);
        if (w6Var.O.a) {
            c11.setAlpha(0.5f);
        }
        final int i11 = 1;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: bi.i6
            public final /* synthetic */ j6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        w6 w6Var2 = this.b.c.x;
                        g6 g6Var = w6Var2.O;
                        if (!g6Var.a) {
                            g6 g6Var2 = w6Var2.M;
                            if (g6Var2 != null) {
                                g6Var.a = true;
                                g6Var2.a = true;
                            } else {
                                g6Var.a = true;
                            }
                            w6Var2.h(true);
                            w6.b(w6Var2);
                            w6Var2.N.run(w6Var2);
                        }
                        j6 j6Var = w6Var2.f;
                        if (j6Var != null) {
                            j6Var.a();
                            break;
                        }
                        break;
                    default:
                        w6 w6Var3 = this.b.c.x;
                        g6 g6Var3 = w6Var3.O;
                        if (g6Var3.a) {
                            g6 g6Var4 = w6Var3.M;
                            if (g6Var4 != null) {
                                g6Var3.a = false;
                                g6Var4.a = false;
                            } else {
                                g6Var3.a = false;
                            }
                            w6Var3.h(true);
                            w6.b(w6Var3);
                            w6Var3.N.run(w6Var3);
                        }
                        j6 j6Var2 = w6Var3.f;
                        if (j6Var2 != null) {
                            j6Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View j1Var = new org.telegram.ui.ActionBar.j1(k6Var.getContext(), org.telegram.ui.ActionBar.g6.H8, w6Var.s);
        j1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(j1Var, w7.z5.n(-1, 8));
        String string = LocaleController.getString(z10 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        b bVar = w6Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.z5.n(-1, -2));
    }

    @Override // org.telegram.ui.Components.ks
    public final void c() {
    }
}
