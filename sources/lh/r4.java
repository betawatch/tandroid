package lh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.rr;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class r4 extends rr {
    public final /* synthetic */ s4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4(s4 s4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = s4Var;
    }

    @Override // org.telegram.ui.Components.rr
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        s4 s4Var = this.c;
        c5 c5Var = s4Var.x;
        b5 b5Var = c5Var.A;
        boolean z10 = b5Var != null && b5Var.f;
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z10 ? R.drawable.menu_views_reposts : c5Var.K.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, LocaleController.getString(z10 ? R.string.SortByReposts : R.string.SortByReactions), false, c5Var.s);
        if (!c5Var.K.a) {
            c3.setAlpha(0.5f);
        }
        final int i10 = 0;
        c3.setOnClickListener(new View.OnClickListener(this) { // from class: lh.q4
            public final /* synthetic */ r4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        c5 c5Var2 = this.b.c.x;
                        o4 o4Var = c5Var2.K;
                        if (!o4Var.a) {
                            o4 o4Var2 = c5Var2.I;
                            if (o4Var2 != null) {
                                o4Var.a = true;
                                o4Var2.a = true;
                            } else {
                                o4Var.a = true;
                            }
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            c5Var2.J.accept(c5Var2);
                        }
                        r4 r4Var = c5Var2.f;
                        if (r4Var != null) {
                            r4Var.a();
                            break;
                        }
                        break;
                    default:
                        c5 c5Var3 = this.b.c.x;
                        o4 o4Var3 = c5Var3.K;
                        if (o4Var3.a) {
                            o4 o4Var4 = c5Var3.I;
                            if (o4Var4 != null) {
                                o4Var3.a = false;
                                o4Var4.a = false;
                            } else {
                                o4Var3.a = false;
                            }
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            c5Var3.J.accept(c5Var3);
                        }
                        r4 r4Var2 = c5Var3.f;
                        if (r4Var2 != null) {
                            r4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c6 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !c5Var.K.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, c5Var.s);
        if (c5Var.K.a) {
            c6.setAlpha(0.5f);
        }
        final int i11 = 1;
        c6.setOnClickListener(new View.OnClickListener(this) { // from class: lh.q4
            public final /* synthetic */ r4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        c5 c5Var2 = this.b.c.x;
                        o4 o4Var = c5Var2.K;
                        if (!o4Var.a) {
                            o4 o4Var2 = c5Var2.I;
                            if (o4Var2 != null) {
                                o4Var.a = true;
                                o4Var2.a = true;
                            } else {
                                o4Var.a = true;
                            }
                            c5Var2.h(true);
                            c5.b(c5Var2);
                            c5Var2.J.accept(c5Var2);
                        }
                        r4 r4Var = c5Var2.f;
                        if (r4Var != null) {
                            r4Var.a();
                            break;
                        }
                        break;
                    default:
                        c5 c5Var3 = this.b.c.x;
                        o4 o4Var3 = c5Var3.K;
                        if (o4Var3.a) {
                            o4 o4Var4 = c5Var3.I;
                            if (o4Var4 != null) {
                                o4Var3.a = false;
                                o4Var4.a = false;
                            } else {
                                o4Var3.a = false;
                            }
                            c5Var3.h(true);
                            c5.b(c5Var3);
                            c5Var3.J.accept(c5Var3);
                        }
                        r4 r4Var2 = c5Var3.f;
                        if (r4Var2 != null) {
                            r4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View l1Var = new org.telegram.ui.ActionBar.l1(s4Var.getContext(), org.telegram.ui.ActionBar.g6.H8, c5Var.s);
        l1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(l1Var, i7.f6.n(-1, 8));
        String string = LocaleController.getString(z10 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        b bVar = c5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, i7.f6.n(-1, -2));
    }

    @Override // org.telegram.ui.Components.rr
    public final void c() {
    }
}
