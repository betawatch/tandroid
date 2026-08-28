package ih;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class v4 extends nr {
    public final /* synthetic */ w4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(w4 w4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = w4Var;
    }

    @Override // org.telegram.ui.Components.nr
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        w4 w4Var = this.c;
        g5 g5Var = w4Var.x;
        f5 f5Var = g5Var.A;
        boolean z10 = f5Var != null && f5Var.f;
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : g5Var.K.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, LocaleController.getString(z10 ? R.string.SortByReposts : R.string.SortByReactions), false, g5Var.s);
        if (!g5Var.K.a) {
            c10.setAlpha(0.5f);
        }
        final int i9 = 0;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: ih.u4
            public final /* synthetic */ v4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        g5 g5Var2 = this.b.c.x;
                        s4 s4Var = g5Var2.K;
                        if (!s4Var.a) {
                            s4 s4Var2 = g5Var2.I;
                            if (s4Var2 != null) {
                                s4Var.a = true;
                                s4Var2.a = true;
                            } else {
                                s4Var.a = true;
                            }
                            g5Var2.h(true);
                            g5.b(g5Var2);
                            g5Var2.J.accept(g5Var2);
                        }
                        v4 v4Var = g5Var2.f;
                        if (v4Var != null) {
                            v4Var.a();
                            break;
                        }
                        break;
                    default:
                        g5 g5Var3 = this.b.c.x;
                        s4 s4Var3 = g5Var3.K;
                        if (s4Var3.a) {
                            s4 s4Var4 = g5Var3.I;
                            if (s4Var4 != null) {
                                s4Var3.a = false;
                                s4Var4.a = false;
                            } else {
                                s4Var3.a = false;
                            }
                            g5Var3.h(true);
                            g5.b(g5Var3);
                            g5Var3.J.accept(g5Var3);
                        }
                        v4 v4Var2 = g5Var3.f;
                        if (v4Var2 != null) {
                            v4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c11 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !g5Var.K.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, g5Var.s);
        if (g5Var.K.a) {
            c11.setAlpha(0.5f);
        }
        final int i10 = 1;
        c11.setOnClickListener(new View.OnClickListener(this) { // from class: ih.u4
            public final /* synthetic */ v4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        g5 g5Var2 = this.b.c.x;
                        s4 s4Var = g5Var2.K;
                        if (!s4Var.a) {
                            s4 s4Var2 = g5Var2.I;
                            if (s4Var2 != null) {
                                s4Var.a = true;
                                s4Var2.a = true;
                            } else {
                                s4Var.a = true;
                            }
                            g5Var2.h(true);
                            g5.b(g5Var2);
                            g5Var2.J.accept(g5Var2);
                        }
                        v4 v4Var = g5Var2.f;
                        if (v4Var != null) {
                            v4Var.a();
                            break;
                        }
                        break;
                    default:
                        g5 g5Var3 = this.b.c.x;
                        s4 s4Var3 = g5Var3.K;
                        if (s4Var3.a) {
                            s4 s4Var4 = g5Var3.I;
                            if (s4Var4 != null) {
                                s4Var3.a = false;
                                s4Var4.a = false;
                            } else {
                                s4Var3.a = false;
                            }
                            g5Var3.h(true);
                            g5.b(g5Var3);
                            g5Var3.J.accept(g5Var3);
                        }
                        v4 v4Var2 = g5Var3.f;
                        if (v4Var2 != null) {
                            v4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View l1Var = new org.telegram.ui.ActionBar.l1(w4Var.getContext(), org.telegram.ui.ActionBar.f6.H8, g5Var.s);
        l1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, g7.e6.n(-1, 8));
        String string = LocaleController.getString(z10 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        b bVar = g5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, g7.e6.n(-1, -2));
    }

    @Override // org.telegram.ui.Components.nr
    public final void c() {
    }
}
