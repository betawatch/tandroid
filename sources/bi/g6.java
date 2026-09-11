package bi;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class g6 extends wr {
    public final /* synthetic */ h6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(h6 h6Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = h6Var;
    }

    @Override // org.telegram.ui.Components.wr
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        h6 h6Var = this.c;
        s6 s6Var = h6Var.x;
        r6 r6Var = s6Var.E;
        boolean z10 = r6Var != null && r6Var.f;
        org.telegram.ui.ActionBar.f1 c10 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : s6Var.O.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, LocaleController.getString(z10 ? R.string.SortByReposts : R.string.SortByReactions), false, s6Var.s);
        if (!s6Var.O.a) {
            c10.setAlpha(0.5f);
        }
        final int i10 = 0;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: bi.f6
            public final /* synthetic */ g6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        s6 s6Var2 = this.b.c.x;
                        d6 d6Var = s6Var2.O;
                        if (!d6Var.a) {
                            d6 d6Var2 = s6Var2.M;
                            if (d6Var2 != null) {
                                d6Var.a = true;
                                d6Var2.a = true;
                            } else {
                                d6Var.a = true;
                            }
                            s6Var2.h(true);
                            s6.b(s6Var2);
                            s6Var2.N.accept(s6Var2);
                        }
                        g6 g6Var = s6Var2.f;
                        if (g6Var != null) {
                            g6Var.a();
                            break;
                        }
                        break;
                    default:
                        s6 s6Var3 = this.b.c.x;
                        d6 d6Var3 = s6Var3.O;
                        if (d6Var3.a) {
                            d6 d6Var4 = s6Var3.M;
                            if (d6Var4 != null) {
                                d6Var3.a = false;
                                d6Var4.a = false;
                            } else {
                                d6Var3.a = false;
                            }
                            s6Var3.h(true);
                            s6.b(s6Var3);
                            s6Var3.N.accept(s6Var3);
                        }
                        g6 g6Var2 = s6Var3.f;
                        if (g6Var2 != null) {
                            g6Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.f1 c11 = org.telegram.ui.ActionBar.v0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !s6Var.O.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, s6Var.s);
        if (s6Var.O.a) {
            c11.setAlpha(0.5f);
        }
        final int i11 = 1;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: bi.f6
            public final /* synthetic */ g6 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        s6 s6Var2 = this.b.c.x;
                        d6 d6Var = s6Var2.O;
                        if (!d6Var.a) {
                            d6 d6Var2 = s6Var2.M;
                            if (d6Var2 != null) {
                                d6Var.a = true;
                                d6Var2.a = true;
                            } else {
                                d6Var.a = true;
                            }
                            s6Var2.h(true);
                            s6.b(s6Var2);
                            s6Var2.N.accept(s6Var2);
                        }
                        g6 g6Var = s6Var2.f;
                        if (g6Var != null) {
                            g6Var.a();
                            break;
                        }
                        break;
                    default:
                        s6 s6Var3 = this.b.c.x;
                        d6 d6Var3 = s6Var3.O;
                        if (d6Var3.a) {
                            d6 d6Var4 = s6Var3.M;
                            if (d6Var4 != null) {
                                d6Var3.a = false;
                                d6Var4.a = false;
                            } else {
                                d6Var3.a = false;
                            }
                            s6Var3.h(true);
                            s6.b(s6Var3);
                            s6Var3.N.accept(s6Var3);
                        }
                        g6 g6Var2 = s6Var3.f;
                        if (g6Var2 != null) {
                            g6Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View k1Var = new org.telegram.ui.ActionBar.k1(h6Var.getContext(), org.telegram.ui.ActionBar.j6.H8, s6Var.s);
        k1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(k1Var, w7.x5.n(-1, 8));
        String string = LocaleController.getString(z10 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        b bVar = s6Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, w7.x5.n(-1, -2));
    }

    @Override // org.telegram.ui.Components.wr
    public final void c() {
    }
}
