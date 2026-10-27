package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wl0;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qa extends mm0 {
    public final Context c;
    public final /* synthetic */ ra d;

    public qa(ra raVar, Context context) {
        this.d = raVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        ra raVar = this.d;
        int size = raVar.l3.size() + raVar.m3.size();
        raVar.o3 = size;
        return size;
    }

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.x6 x6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) e1Var.a;
        ra raVar = this.d;
        ArrayList arrayList = raVar.m3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = raVar.l3;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.x6 x6Var2 = (org.telegram.ui.ActionBar.x6) arrayList.get(i11);
        boolean z10 = i10 == h() - 1;
        boolean z11 = i10 == 0;
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.a0.h3;
        themesHorizontalListCell$InnerThemeView.b = x6Var2;
        themesHorizontalListCell$InnerThemeView.s = z11;
        themesHorizontalListCell$InnerThemeView.r = z10;
        themesHorizontalListCell$InnerThemeView.F = x6Var2.Y;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(themesHorizontalListCell$InnerThemeView.s ? 49.0f : 27.0f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.x6 x6Var3 = themesHorizontalListCell$InnerThemeView.b;
        if (x6Var3.b != null && !x6Var3.T) {
            x6Var3.Q = org.telegram.ui.ActionBar.y6.E0(org.telegram.ui.ActionBar.y6.ra);
            themesHorizontalListCell$InnerThemeView.b.R = org.telegram.ui.ActionBar.y6.E0(org.telegram.ui.ActionBar.y6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (x6Var = themesHorizontalListCell$InnerThemeView.b).F) != null) {
                if (tL_theme.document != null) {
                    x6Var.U = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate;
                    int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x02;
                    org.telegram.ui.ActionBar.y6.z1(x02, mutate);
                    if (!exists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.b.F.document);
                        if (!hashMap.containsKey(attachFileName)) {
                            hashMap.put(attachFileName, themesHorizontalListCell$InnerThemeView.b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.b.E);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.b.F;
                            fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.T = mutate2;
                    int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E6, false);
                    themesHorizontalListCell$InnerThemeView.U = x03;
                    org.telegram.ui.ActionBar.y6.z1(x03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new wl0(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
