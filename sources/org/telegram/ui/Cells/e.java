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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class e extends q59 {
    public final Context c;
    public final /* synthetic */ f d;

    public e(f fVar, Context context) {
        this.d = fVar;
        this.c = context;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return false;
    }

    @Override // y59
    public final int b() {
        f fVar = this.d;
        int size = fVar.l3.size() + fVar.m3.size();
        fVar.o3 = size;
        return size;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        int i2;
        bmb bmbVar;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) u69Var.a;
        f fVar = this.d;
        ArrayList arrayList = fVar.m3;
        if (i < arrayList.size()) {
            i2 = i;
        } else {
            ArrayList arrayList2 = fVar.l3;
            int size = i - arrayList.size();
            arrayList = arrayList2;
            i2 = size;
        }
        bmb bmbVar2 = (bmb) arrayList.get(i2);
        boolean z = i == b() - 1;
        boolean z2 = i == 0;
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.b0.h3;
        themesHorizontalListCell$InnerThemeView.b = bmbVar2;
        themesHorizontalListCell$InnerThemeView.s = z2;
        themesHorizontalListCell$InnerThemeView.r = z;
        themesHorizontalListCell$InnerThemeView.G = bmbVar2.Z;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams.leftMargin = gm.L(themesHorizontalListCell$InnerThemeView.s ? 49.0f : 27.0f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.w = 0.0f;
        bmb bmbVar3 = themesHorizontalListCell$InnerThemeView.b;
        if (bmbVar3.b != null && !bmbVar3.U) {
            bmbVar3.R = cmb.D0(cmb.qa);
            themesHorizontalListCell$InnerThemeView.b.S = cmb.D0(cmb.qb);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (bmbVar = themesHorizontalListCell$InnerThemeView.b).G) != null) {
                if (tL_theme.document != null) {
                    bmbVar.V = false;
                    themesHorizontalListCell$InnerThemeView.w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate;
                    int w0 = cmb.w0(null, cmb.D6, false);
                    themesHorizontalListCell$InnerThemeView.V = w0;
                    cmb.A1(w0, mutate);
                    if (!exists) {
                        String r = bc4.r(null, themesHorizontalListCell$InnerThemeView.b.G.document);
                        if (!hashMap.containsKey(r)) {
                            hashMap.put(r, themesHorizontalListCell$InnerThemeView.b);
                            bc4 G = bc4.G(themesHorizontalListCell$InnerThemeView.b.F);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.b.G;
                            G.X(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate2;
                    int w02 = cmb.w0(null, cmb.D6, false);
                    themesHorizontalListCell$InnerThemeView.V = w02;
                    cmb.A1(w02, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        return new b59(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
