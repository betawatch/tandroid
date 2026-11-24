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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class e extends n39 {
    public final Context c;
    public final /* synthetic */ f d;

    public e(f fVar, Context context) {
        this.d = fVar;
        this.c = context;
    }

    @Override // n39
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override // w39
    public final int b() {
        f fVar = this.d;
        int size = fVar.l3.size() + fVar.m3.size();
        fVar.o3 = size;
        return size;
    }

    @Override // w39
    public final void t(s49 s49Var, int i) {
        int i2;
        akb akbVar;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) s49Var.a;
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
        akb akbVar2 = (akb) arrayList.get(i2);
        boolean z = i == b() - 1;
        boolean z2 = i == 0;
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.b0.h3;
        themesHorizontalListCell$InnerThemeView.b = akbVar2;
        themesHorizontalListCell$InnerThemeView.s = z2;
        themesHorizontalListCell$InnerThemeView.r = z;
        themesHorizontalListCell$InnerThemeView.G = akbVar2.Z;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams.leftMargin = gl.L(themesHorizontalListCell$InnerThemeView.s ? 49.0f : 27.0f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.w = 0.0f;
        akb akbVar3 = themesHorizontalListCell$InnerThemeView.b;
        if (akbVar3.b != null && !akbVar3.U) {
            akbVar3.R = bkb.D0(bkb.qa);
            themesHorizontalListCell$InnerThemeView.b.S = bkb.D0(bkb.qb);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (akbVar = themesHorizontalListCell$InnerThemeView.b).G) != null) {
                if (tL_theme.document != null) {
                    akbVar.V = false;
                    themesHorizontalListCell$InnerThemeView.w = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate;
                    int w0 = bkb.w0(null, bkb.D6, false);
                    themesHorizontalListCell$InnerThemeView.V = w0;
                    bkb.A1(w0, mutate);
                    if (!exists) {
                        String r = ba4.r(null, themesHorizontalListCell$InnerThemeView.b.G.document);
                        if (!hashMap.containsKey(r)) {
                            hashMap.put(r, themesHorizontalListCell$InnerThemeView.b);
                            ba4 G = ba4.G(themesHorizontalListCell$InnerThemeView.b.F);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.b.G;
                            G.X(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.U = mutate2;
                    int w02 = bkb.w0(null, bkb.D6, false);
                    themesHorizontalListCell$InnerThemeView.V = w02;
                    bkb.A1(w02, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override // w39
    public final s49 x(ViewGroup viewGroup, int i) {
        return new y29(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
