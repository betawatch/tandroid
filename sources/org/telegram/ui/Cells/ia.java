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
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class ia extends il0 {
    public final Context c;
    public final /* synthetic */ ja d;

    public ia(ja jaVar, Context context) {
        this.d = jaVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        ja jaVar = this.d;
        int size = jaVar.Z2.size() + jaVar.a3.size();
        jaVar.c3 = size;
        return size;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.f6 f6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) n1Var.a;
        ja jaVar = this.d;
        ArrayList arrayList = jaVar.a3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = jaVar.Z2;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) arrayList.get(i11);
        boolean z10 = i10 == h() - 1;
        boolean z11 = i10 == 0;
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.T.V2;
        themesHorizontalListCell$InnerThemeView.b = f6Var2;
        themesHorizontalListCell$InnerThemeView.s = z11;
        themesHorizontalListCell$InnerThemeView.r = z10;
        themesHorizontalListCell$InnerThemeView.B = f6Var2.U;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(themesHorizontalListCell$InnerThemeView.s ? 49.0f : 27.0f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.f6 f6Var3 = themesHorizontalListCell$InnerThemeView.b;
        if (f6Var3.b != null && !f6Var3.P) {
            f6Var3.M = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.ra);
            themesHorizontalListCell$InnerThemeView.b.N = org.telegram.ui.ActionBar.g6.C0(org.telegram.ui.ActionBar.g6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (f6Var = themesHorizontalListCell$InnerThemeView.b).B) != null) {
                if (tL_theme.document != null) {
                    f6Var.Q = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.P = mutate;
                    int w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false);
                    themesHorizontalListCell$InnerThemeView.Q = w02;
                    org.telegram.ui.ActionBar.g6.w1(w02, mutate);
                    if (!exists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.b.B.document);
                        if (!hashMap.containsKey(attachFileName)) {
                            hashMap.put(attachFileName, themesHorizontalListCell$InnerThemeView.b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.b.A);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.b.B;
                            fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.P = mutate2;
                    int w03 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.E6, false);
                    themesHorizontalListCell$InnerThemeView.Q = w03;
                    org.telegram.ui.ActionBar.g6.w1(w03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new vk0(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
