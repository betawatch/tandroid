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
import org.telegram.ui.Components.ik0;
import org.telegram.ui.Components.vk0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class la extends vk0 {
    public final Context c;
    public final /* synthetic */ ma d;

    public la(ma maVar, Context context) {
        this.d = maVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override // f2.r0
    public final int h() {
        ma maVar = this.d;
        int size = maVar.Z2.size() + maVar.a3.size();
        maVar.c3 = size;
        return size;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        org.telegram.ui.ActionBar.e6 e6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) q1Var.a;
        ma maVar = this.d;
        ArrayList arrayList = maVar.a3;
        if (i9 < arrayList.size()) {
            i10 = i9;
        } else {
            ArrayList arrayList2 = maVar.Z2;
            int size = i9 - arrayList.size();
            arrayList = arrayList2;
            i10 = size;
        }
        org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) arrayList.get(i10);
        boolean z10 = i9 == h() - 1;
        boolean z11 = i9 == 0;
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.T.V2;
        themesHorizontalListCell$InnerThemeView.b = e6Var2;
        themesHorizontalListCell$InnerThemeView.s = z11;
        themesHorizontalListCell$InnerThemeView.r = z10;
        themesHorizontalListCell$InnerThemeView.B = e6Var2.U;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(themesHorizontalListCell$InnerThemeView.s ? 49.0f : 27.0f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.e6 e6Var3 = themesHorizontalListCell$InnerThemeView.b;
        if (e6Var3.b != null && !e6Var3.P) {
            e6Var3.M = org.telegram.ui.ActionBar.f6.C0(org.telegram.ui.ActionBar.f6.ra);
            themesHorizontalListCell$InnerThemeView.b.N = org.telegram.ui.ActionBar.f6.C0(org.telegram.ui.ActionBar.f6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (e6Var = themesHorizontalListCell$InnerThemeView.b).B) != null) {
                if (tL_theme.document != null) {
                    e6Var.Q = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.P = mutate;
                    int w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E6, false);
                    themesHorizontalListCell$InnerThemeView.Q = w02;
                    org.telegram.ui.ActionBar.f6.w1(w02, mutate);
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
                    int w03 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.E6, false);
                    themesHorizontalListCell$InnerThemeView.Q = w03;
                    org.telegram.ui.ActionBar.f6.w1(w03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new ik0(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
