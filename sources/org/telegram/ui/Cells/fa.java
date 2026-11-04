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
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.sj0;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class fa extends sj0 {
    public final Context c;
    public final /* synthetic */ ga d;

    public fa(ga gaVar, Context context) {
        this.d = gaVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override // u4.h0
    public final int b() {
        ga gaVar = this.d;
        int size = gaVar.l3.size() + gaVar.m3.size();
        gaVar.o3 = size;
        return size;
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        int i10;
        org.telegram.ui.ActionBar.j6 j6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) d1Var.a;
        ga gaVar = this.d;
        ArrayList arrayList = gaVar.m3;
        if (i3 < arrayList.size()) {
            i10 = i3;
        } else {
            ArrayList arrayList2 = gaVar.l3;
            int size = i3 - arrayList.size();
            arrayList = arrayList2;
            i10 = size;
        }
        org.telegram.ui.ActionBar.j6 j6Var2 = (org.telegram.ui.ActionBar.j6) arrayList.get(i10);
        boolean z10 = i3 == b() - 1;
        boolean z11 = i3 == 0;
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.b0.h3;
        themesHorizontalListCell$InnerThemeView.b = j6Var2;
        themesHorizontalListCell$InnerThemeView.s = z11;
        themesHorizontalListCell$InnerThemeView.r = z10;
        themesHorizontalListCell$InnerThemeView.G = j6Var2.Z;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams.leftMargin = org.telegram.messenger.g0.L(themesHorizontalListCell$InnerThemeView.s ? 49.0f : 27.0f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.w = 0.0f;
        org.telegram.ui.ActionBar.j6 j6Var3 = themesHorizontalListCell$InnerThemeView.b;
        if (j6Var3.b != null && !j6Var3.U) {
            j6Var3.R = org.telegram.ui.ActionBar.k6.F0(org.telegram.ui.ActionBar.k6.ra);
            themesHorizontalListCell$InnerThemeView.b.S = org.telegram.ui.ActionBar.k6.F0(org.telegram.ui.ActionBar.k6.ob);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (j6Var = themesHorizontalListCell$InnerThemeView.b).G) != null) {
                if (tL_theme.document != null) {
                    j6Var.V = false;
                    themesHorizontalListCell$InnerThemeView.w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate;
                    int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x02;
                    org.telegram.ui.ActionBar.k6.C1(x02, mutate);
                    if (!exists) {
                        String r5 = org.telegram.messenger.w7.r(null, themesHorizontalListCell$InnerThemeView.b.G.document);
                        if (!hashMap.containsKey(r5)) {
                            hashMap.put(r5, themesHorizontalListCell$InnerThemeView.b);
                            org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.b.F);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.b.G;
                            G.X(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate2;
                    int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x03;
                    org.telegram.ui.ActionBar.k6.C1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new bj0(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
