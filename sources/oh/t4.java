package oh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.xr;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class t4 extends xr {
    public final /* synthetic */ u4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(u4 u4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = u4Var;
    }

    @Override // org.telegram.ui.Components.xr
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        u4 u4Var = this.c;
        e5 e5Var = u4Var.x;
        d5 d5Var = e5Var.B;
        boolean z4 = d5Var != null && d5Var.f;
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z4 ? R.drawable.menu_views_reposts : e5Var.L.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, LocaleController.getString(z4 ? R.string.SortByReposts : R.string.SortByReactions), false, e5Var.s);
        if (!e5Var.L.a) {
            c3.setAlpha(0.5f);
        }
        final int i10 = 0;
        c3.setOnClickListener(new View.OnClickListener(this) { // from class: oh.s4
            public final /* synthetic */ t4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        e5 e5Var2 = this.b.c.x;
                        q4 q4Var = e5Var2.L;
                        if (!q4Var.a) {
                            q4 q4Var2 = e5Var2.J;
                            if (q4Var2 != null) {
                                q4Var.a = true;
                                q4Var2.a = true;
                            } else {
                                q4Var.a = true;
                            }
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            e5Var2.K.accept(e5Var2);
                        }
                        t4 t4Var = e5Var2.f;
                        if (t4Var != null) {
                            t4Var.a();
                            break;
                        }
                        break;
                    default:
                        e5 e5Var3 = this.b.c.x;
                        q4 q4Var3 = e5Var3.L;
                        if (q4Var3.a) {
                            q4 q4Var4 = e5Var3.J;
                            if (q4Var4 != null) {
                                q4Var3.a = false;
                                q4Var4.a = false;
                            } else {
                                q4Var3.a = false;
                            }
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            e5Var3.K.accept(e5Var3);
                        }
                        t4 t4Var2 = e5Var3.f;
                        if (t4Var2 != null) {
                            t4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !e5Var.L.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, e5Var.s);
        if (e5Var.L.a) {
            c10.setAlpha(0.5f);
        }
        final int i11 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: oh.s4
            public final /* synthetic */ t4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        e5 e5Var2 = this.b.c.x;
                        q4 q4Var = e5Var2.L;
                        if (!q4Var.a) {
                            q4 q4Var2 = e5Var2.J;
                            if (q4Var2 != null) {
                                q4Var.a = true;
                                q4Var2.a = true;
                            } else {
                                q4Var.a = true;
                            }
                            e5Var2.h(true);
                            e5.b(e5Var2);
                            e5Var2.K.accept(e5Var2);
                        }
                        t4 t4Var = e5Var2.f;
                        if (t4Var != null) {
                            t4Var.a();
                            break;
                        }
                        break;
                    default:
                        e5 e5Var3 = this.b.c.x;
                        q4 q4Var3 = e5Var3.L;
                        if (q4Var3.a) {
                            q4 q4Var4 = e5Var3.J;
                            if (q4Var4 != null) {
                                q4Var3.a = false;
                                q4Var4.a = false;
                            } else {
                                q4Var3.a = false;
                            }
                            e5Var3.h(true);
                            e5.b(e5Var3);
                            e5Var3.K.accept(e5Var3);
                        }
                        t4 t4Var2 = e5Var3.f;
                        if (t4Var2 != null) {
                            t4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View m1Var = new org.telegram.ui.ActionBar.m1(u4Var.getContext(), org.telegram.ui.ActionBar.k6.H8, e5Var.s);
        m1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var, k7.c6.n(-1, 8));
        String string = LocaleController.getString(z4 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        b bVar = e5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, k7.c6.n(-1, -2));
    }

    @Override // org.telegram.ui.Components.xr
    public final void c() {
    }
}
