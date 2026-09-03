package nh;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ur;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class s4 extends ur {
    public final /* synthetic */ t4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s4(t4 t4Var, Context context, b bVar) {
        super(context, bVar, false);
        this.c = t4Var;
    }

    @Override // org.telegram.ui.Components.ur
    public final void b(ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout) {
        actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(i0.a.d(0.18f, -16777216, -1));
        t4 t4Var = this.c;
        d5 d5Var = t4Var.x;
        c5 c5Var = d5Var.B;
        boolean z4 = c5Var != null && c5Var.f;
        org.telegram.ui.ActionBar.g1 c3 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, z4 ? R.drawable.menu_views_reposts : d5Var.L.a ? R.drawable.menu_views_reactions2 : R.drawable.menu_views_reactions, LocaleController.getString(z4 ? R.string.SortByReposts : R.string.SortByReactions), false, d5Var.s);
        if (!d5Var.L.a) {
            c3.setAlpha(0.5f);
        }
        final int i10 = 0;
        c3.setOnClickListener(new View.OnClickListener(this) { // from class: nh.r4
            public final /* synthetic */ s4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        d5 d5Var2 = this.b.c.x;
                        p4 p4Var = d5Var2.L;
                        if (!p4Var.a) {
                            p4 p4Var2 = d5Var2.J;
                            if (p4Var2 != null) {
                                p4Var.a = true;
                                p4Var2.a = true;
                            } else {
                                p4Var.a = true;
                            }
                            d5Var2.h(true);
                            d5.b(d5Var2);
                            d5Var2.K.accept(d5Var2);
                        }
                        s4 s4Var = d5Var2.f;
                        if (s4Var != null) {
                            s4Var.a();
                            break;
                        }
                        break;
                    default:
                        d5 d5Var3 = this.b.c.x;
                        p4 p4Var3 = d5Var3.L;
                        if (p4Var3.a) {
                            p4 p4Var4 = d5Var3.J;
                            if (p4Var4 != null) {
                                p4Var3.a = false;
                                p4Var4.a = false;
                            } else {
                                p4Var3.a = false;
                            }
                            d5Var3.h(true);
                            d5.b(d5Var3);
                            d5Var3.K.accept(d5Var3);
                        }
                        s4 s4Var2 = d5Var3.f;
                        if (s4Var2 != null) {
                            s4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.g1 c10 = org.telegram.ui.ActionBar.w0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, !d5Var.L.a ? R.drawable.menu_views_recent2 : R.drawable.menu_views_recent, LocaleController.getString(R.string.SortByTime), false, d5Var.s);
        if (d5Var.L.a) {
            c10.setAlpha(0.5f);
        }
        final int i11 = 1;
        c10.setOnClickListener(new View.OnClickListener(this) { // from class: nh.r4
            public final /* synthetic */ s4 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        d5 d5Var2 = this.b.c.x;
                        p4 p4Var = d5Var2.L;
                        if (!p4Var.a) {
                            p4 p4Var2 = d5Var2.J;
                            if (p4Var2 != null) {
                                p4Var.a = true;
                                p4Var2.a = true;
                            } else {
                                p4Var.a = true;
                            }
                            d5Var2.h(true);
                            d5.b(d5Var2);
                            d5Var2.K.accept(d5Var2);
                        }
                        s4 s4Var = d5Var2.f;
                        if (s4Var != null) {
                            s4Var.a();
                            break;
                        }
                        break;
                    default:
                        d5 d5Var3 = this.b.c.x;
                        p4 p4Var3 = d5Var3.L;
                        if (p4Var3.a) {
                            p4 p4Var4 = d5Var3.J;
                            if (p4Var4 != null) {
                                p4Var3.a = false;
                                p4Var4.a = false;
                            } else {
                                p4Var3.a = false;
                            }
                            d5Var3.h(true);
                            d5.b(d5Var3);
                            d5Var3.K.accept(d5Var3);
                        }
                        s4 s4Var2 = d5Var3.f;
                        if (s4Var2 != null) {
                            s4Var2.a();
                            break;
                        }
                        break;
                }
            }
        });
        View m1Var = new org.telegram.ui.ActionBar.m1(t4Var.getContext(), org.telegram.ui.ActionBar.j6.H8, d5Var.s);
        m1Var.setTag(R.id.fit_width_tag, 1);
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(m1Var, k7.b6.n(-1, 8));
        String string = LocaleController.getString(z4 ? R.string.StoryReactionsSortDescription : R.string.StoryViewsSortDescription);
        b bVar = d5Var.s;
        TextView textView = new TextView(actionBarPopupWindow$ActionBarPopupWindowLayout.getContext());
        textView.setTextSize(1, 13.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.j5, bVar));
        textView.setPadding(AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(8.0f));
        textView.setText(string);
        textView.setTag(R.id.fit_width_tag, 1);
        textView.setMaxWidth(AndroidUtilities.dp(200.0f));
        actionBarPopupWindow$ActionBarPopupWindowLayout.a(textView, k7.b6.n(-1, -2));
    }

    @Override // org.telegram.ui.Components.ur
    public final void c() {
    }
}
