package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.xi0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class fa extends oj0 {
    public final Context c;
    public final /* synthetic */ ga d;

    public fa(ga gaVar, Context context) {
        this.d = gaVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        ga gaVar = this.d;
        int size = gaVar.k3.size() + gaVar.l3.size();
        gaVar.n3 = size;
        return size;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        org.telegram.ui.ActionBar.l6 l6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) d1Var.a;
        ga gaVar = this.d;
        ArrayList arrayList = gaVar.l3;
        if (i7 < arrayList.size()) {
            i10 = i7;
        } else {
            ArrayList arrayList2 = gaVar.k3;
            int size = i7 - arrayList.size();
            arrayList = arrayList2;
            i10 = size;
        }
        org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) arrayList.get(i10);
        boolean z9 = i7 == b() - 1;
        boolean z10 = i7 == 0;
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.a0.g3;
        themesHorizontalListCell$InnerThemeView.b = l6Var2;
        themesHorizontalListCell$InnerThemeView.s = z10;
        themesHorizontalListCell$InnerThemeView.r = z9;
        themesHorizontalListCell$InnerThemeView.F = l6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams.leftMargin = org.telegram.messenger.g0.L(themesHorizontalListCell$InnerThemeView.s ? 49.0f : 27.0f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.w = 0.0f;
        org.telegram.ui.ActionBar.l6 l6Var3 = themesHorizontalListCell$InnerThemeView.b;
        if (l6Var3.b != null && !l6Var3.T) {
            l6Var3.Q = org.telegram.ui.ActionBar.m6.F0(org.telegram.ui.ActionBar.m6.ra);
            themesHorizontalListCell$InnerThemeView.b.R = org.telegram.ui.ActionBar.m6.F0(org.telegram.ui.ActionBar.m6.ob);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (l6Var = themesHorizontalListCell$InnerThemeView.b).F) != null) {
                if (tL_theme.document != null) {
                    l6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x02;
                    org.telegram.ui.ActionBar.m6.C1(x02, mutate);
                    if (!exists) {
                        String r10 = org.telegram.messenger.w7.r(null, themesHorizontalListCell$InnerThemeView.b.F.document);
                        if (!hashMap.containsKey(r10)) {
                            hashMap.put(r10, themesHorizontalListCell$InnerThemeView.b);
                            org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.b.F;
                            G.W(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate2;
                    int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x03;
                    org.telegram.ui.ActionBar.m6.C1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new xi0(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
