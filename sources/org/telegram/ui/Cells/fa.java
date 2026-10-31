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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.sk0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class fa extends sk0 {
    public final Context c;
    public final /* synthetic */ ga d;

    public fa(ga gaVar, Context context) {
        this.d = gaVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sk0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.g0
    public final int b() {
        ga gaVar = this.d;
        int size = gaVar.k3.size() + gaVar.l3.size();
        gaVar.n3 = size;
        return size;
    }

    @Override // s4.g0
    public final void t(s4.c1 c1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.s6 s6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) c1Var.a;
        ga gaVar = this.d;
        ArrayList arrayList = gaVar.l3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = gaVar.k3;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.s6 s6Var2 = (org.telegram.ui.ActionBar.s6) arrayList.get(i11);
        boolean z10 = i10 == b() - 1;
        boolean z11 = i10 == 0;
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.a0.g3;
        themesHorizontalListCell$InnerThemeView.b = s6Var2;
        themesHorizontalListCell$InnerThemeView.s = z11;
        themesHorizontalListCell$InnerThemeView.r = z10;
        themesHorizontalListCell$InnerThemeView.F = s6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams.leftMargin = org.telegram.messenger.i0.L(themesHorizontalListCell$InnerThemeView.s ? 49.0f : 27.0f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.w = 0.0f;
        org.telegram.ui.ActionBar.s6 s6Var3 = themesHorizontalListCell$InnerThemeView.b;
        if (s6Var3.b != null && !s6Var3.T) {
            s6Var3.Q = org.telegram.ui.ActionBar.t6.F0(org.telegram.ui.ActionBar.t6.ra);
            themesHorizontalListCell$InnerThemeView.b.R = org.telegram.ui.ActionBar.t6.F0(org.telegram.ui.ActionBar.t6.ob);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (s6Var = themesHorizontalListCell$InnerThemeView.b).F) != null) {
                if (tL_theme.document != null) {
                    s6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x02;
                    org.telegram.ui.ActionBar.t6.C1(x02, mutate);
                    if (!exists) {
                        String r10 = org.telegram.messenger.b8.r(null, themesHorizontalListCell$InnerThemeView.b.F.document);
                        if (!hashMap.containsKey(r10)) {
                            hashMap.put(r10, themesHorizontalListCell$InnerThemeView.b);
                            org.telegram.messenger.b8 G = org.telegram.messenger.b8.G(themesHorizontalListCell$InnerThemeView.b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.b.F;
                            G.X(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate2;
                    int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x03;
                    org.telegram.ui.ActionBar.t6.C1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override // s4.g0
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new ck0(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
