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
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.mj0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class ha extends dk0 {
    public final Context c;
    public final /* synthetic */ ia d;

    public ha(ia iaVar, Context context) {
        this.d = iaVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.dk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        ia iaVar = this.d;
        int size = iaVar.l3.size() + iaVar.m3.size();
        iaVar.o3 = size;
        return size;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        org.telegram.ui.ActionBar.l6 l6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) f1Var.a;
        ia iaVar = this.d;
        ArrayList arrayList = iaVar.m3;
        if (i7 < arrayList.size()) {
            i10 = i7;
        } else {
            ArrayList arrayList2 = iaVar.l3;
            int size = i7 - arrayList.size();
            arrayList = arrayList2;
            i10 = size;
        }
        org.telegram.ui.ActionBar.l6 l6Var2 = (org.telegram.ui.ActionBar.l6) arrayList.get(i10);
        boolean z10 = i7 == b() - 1;
        boolean z11 = i7 == 0;
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.b0.h3;
        themesHorizontalListCell$InnerThemeView.b = l6Var2;
        themesHorizontalListCell$InnerThemeView.s = z11;
        themesHorizontalListCell$InnerThemeView.r = z10;
        themesHorizontalListCell$InnerThemeView.G = l6Var2.Z;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams.leftMargin = org.telegram.messenger.g0.L(themesHorizontalListCell$InnerThemeView.s ? 49.0f : 27.0f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.w = 0.0f;
        org.telegram.ui.ActionBar.l6 l6Var3 = themesHorizontalListCell$InnerThemeView.b;
        if (l6Var3.b != null && !l6Var3.U) {
            l6Var3.R = org.telegram.ui.ActionBar.m6.F0(org.telegram.ui.ActionBar.m6.ra);
            themesHorizontalListCell$InnerThemeView.b.S = org.telegram.ui.ActionBar.m6.F0(org.telegram.ui.ActionBar.m6.rb);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (l6Var = themesHorizontalListCell$InnerThemeView.b).G) != null) {
                if (tL_theme.document != null) {
                    l6Var.V = false;
                    themesHorizontalListCell$InnerThemeView.w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate;
                    int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x02;
                    org.telegram.ui.ActionBar.m6.C1(x02, mutate);
                    if (!exists) {
                        String r10 = org.telegram.messenger.w7.r(null, themesHorizontalListCell$InnerThemeView.b.G.document);
                        if (!hashMap.containsKey(r10)) {
                            hashMap.put(r10, themesHorizontalListCell$InnerThemeView.b);
                            org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(themesHorizontalListCell$InnerThemeView.b.F);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.b.G;
                            G.W(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate2;
                    int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.E6, false);
                    themesHorizontalListCell$InnerThemeView.V = x03;
                    org.telegram.ui.ActionBar.m6.C1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new mj0(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
