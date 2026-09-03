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
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.ql0;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ja extends ql0 {
    public final Context c;
    public final /* synthetic */ ka d;

    public ja(ka kaVar, Context context) {
        this.d = kaVar;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ql0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        ka kaVar = this.d;
        int size = kaVar.a3.size() + kaVar.b3.size();
        kaVar.d3 = size;
        return size;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        org.telegram.ui.ActionBar.i6 i6Var;
        TLRPC.TL_theme tL_theme;
        ThemesHorizontalListCell$InnerThemeView themesHorizontalListCell$InnerThemeView = (ThemesHorizontalListCell$InnerThemeView) l1Var.a;
        ka kaVar = this.d;
        ArrayList arrayList = kaVar.b3;
        if (i10 < arrayList.size()) {
            i11 = i10;
        } else {
            ArrayList arrayList2 = kaVar.a3;
            int size = i10 - arrayList.size();
            arrayList = arrayList2;
            i11 = size;
        }
        org.telegram.ui.ActionBar.i6 i6Var2 = (org.telegram.ui.ActionBar.i6) arrayList.get(i11);
        boolean z4 = i10 == h() - 1;
        boolean z10 = i10 == 0;
        HashMap hashMap = themesHorizontalListCell$InnerThemeView.U.W2;
        themesHorizontalListCell$InnerThemeView.b = i6Var2;
        themesHorizontalListCell$InnerThemeView.s = z10;
        themesHorizontalListCell$InnerThemeView.r = z4;
        themesHorizontalListCell$InnerThemeView.C = i6Var2.V;
        RadioButton radioButton = themesHorizontalListCell$InnerThemeView.a;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) radioButton.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(themesHorizontalListCell$InnerThemeView.s ? 49.0f : 27.0f);
        radioButton.setLayoutParams(layoutParams);
        themesHorizontalListCell$InnerThemeView.v = 0.0f;
        org.telegram.ui.ActionBar.i6 i6Var3 = themesHorizontalListCell$InnerThemeView.b;
        if (i6Var3.b != null && !i6Var3.Q) {
            i6Var3.N = org.telegram.ui.ActionBar.j6.C0(org.telegram.ui.ActionBar.j6.ra);
            themesHorizontalListCell$InnerThemeView.b.O = org.telegram.ui.ActionBar.j6.C0(org.telegram.ui.ActionBar.j6.Aa);
            boolean exists = new File(themesHorizontalListCell$InnerThemeView.b.b).exists();
            if ((!exists || !themesHorizontalListCell$InnerThemeView.c() || !exists) && (tL_theme = (i6Var = themesHorizontalListCell$InnerThemeView.b).C) != null) {
                if (tL_theme.document != null) {
                    i6Var.R = false;
                    themesHorizontalListCell$InnerThemeView.v = 1.0f;
                    Drawable mutate = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.msg_theme).mutate();
                    themesHorizontalListCell$InnerThemeView.Q = mutate;
                    int w02 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false);
                    themesHorizontalListCell$InnerThemeView.R = w02;
                    org.telegram.ui.ActionBar.j6.w1(w02, mutate);
                    if (!exists) {
                        String attachFileName = FileLoader.getAttachFileName(themesHorizontalListCell$InnerThemeView.b.C.document);
                        if (!hashMap.containsKey(attachFileName)) {
                            hashMap.put(attachFileName, themesHorizontalListCell$InnerThemeView.b);
                            FileLoader fileLoader = FileLoader.getInstance(themesHorizontalListCell$InnerThemeView.b.B);
                            TLRPC.TL_theme tL_theme2 = themesHorizontalListCell$InnerThemeView.b.C;
                            fileLoader.loadFile(tL_theme2.document, tL_theme2, 1, 1);
                        }
                    }
                } else {
                    Drawable mutate2 = themesHorizontalListCell$InnerThemeView.getResources().getDrawable(R.drawable.preview_custom).mutate();
                    themesHorizontalListCell$InnerThemeView.Q = mutate2;
                    int w03 = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.E6, false);
                    themesHorizontalListCell$InnerThemeView.R = w03;
                    org.telegram.ui.ActionBar.j6.w1(w03, mutate2);
                }
            }
        }
        themesHorizontalListCell$InnerThemeView.a();
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new dl0(new ThemesHorizontalListCell$InnerThemeView(this.d, this.c));
    }
}
