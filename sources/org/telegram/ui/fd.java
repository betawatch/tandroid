package org.telegram.ui;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class fd extends FrameLayout {
    public final int a;
    public final org.telegram.ui.ActionBar.c6 b;
    public final ArrayList c;
    public final kc1 d;
    public final org.telegram.ui.Components.f10 e;
    public boolean f;
    public final dd h;
    public boolean n;
    public Utilities.Callback r;
    public String s;
    public TLRPC.WallPaper v;
    public final HashMap w;
    public final HashMap x;

    public fd(int i10, Activity activity, org.telegram.ui.ActionBar.c6 c6Var) {
        super(activity);
        this.c = new ArrayList();
        this.w = new HashMap();
        this.x = new HashMap();
        this.a = i10;
        this.b = c6Var;
        org.telegram.ui.Components.f10 f10Var = new org.telegram.ui.Components.f10(getContext(), c6Var);
        this.e = f10Var;
        f10Var.setViewType(14);
        f10Var.setVisibility(0);
        addView(f10Var, w7.a6.a(104.0f, 16.0f, 13.0f, 16.0f, 6.0f, -1, 8388611));
        kc1 kc1Var = new kc1(activity, 4, c6Var);
        this.d = kc1Var;
        kc1Var.setClipToPadding(false);
        kc1Var.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(6.0f));
        getContext();
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        kc1Var.setLayoutManager(b0Var);
        kc1Var.setAlpha(0.0f);
        dd ddVar = new dd(this, i10, c6Var);
        this.h = ddVar;
        kc1Var.setAdapter(ddVar);
        addView(kc1Var, w7.a6.d(130.0f, -1));
        kc1Var.setOnItemClickListener(new i(this, 3));
        ChatThemeController chatThemeController = ChatThemeController.getInstance(i10);
        chatThemeController.preloadAllWallpaperThumbs(true);
        chatThemeController.preloadAllWallpaperThumbs(false);
        chatThemeController.preloadAllWallpaperImages(true);
        chatThemeController.preloadAllWallpaperImages(false);
        chatThemeController.requestAllChatThemes(new ed(this, i10), true);
        if (this.n) {
            AndroidUtilities.updateViewVisibilityAnimated(f10Var, false, 1.0f, true, false);
        } else {
            AndroidUtilities.updateViewVisibilityAnimated(f10Var, true, 1.0f, true, false);
        }
    }

    public final void a(String str, boolean z10) {
        ArrayList arrayList;
        int R;
        this.s = str;
        int i10 = -1;
        int i11 = 0;
        while (true) {
            arrayList = this.c;
            boolean z11 = true;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.ui.Components.yp ypVar = (org.telegram.ui.Components.yp) arrayList.get(i11);
            if (!TextUtils.equals(this.s, ypVar.a()) && (!TextUtils.isEmpty(str) || !ypVar.a.a)) {
                z11 = false;
            }
            ypVar.d = z11;
            if (z11) {
                i10 = i11;
            }
            i11++;
        }
        kc1 kc1Var = this.d;
        if (i10 >= 0 && !z10 && (kc1Var.getLayoutManager() instanceof s4.b0)) {
            ((s4.b0) kc1Var.getLayoutManager()).h1(i10, (AndroidUtilities.displaySize.x - AndroidUtilities.dp(83.0f)) / 2);
        }
        for (int i12 = 0; i12 < kc1Var.getChildCount(); i12++) {
            View childAt = kc1Var.getChildAt(i12);
            if ((childAt instanceof org.telegram.ui.Components.v21) && (R = RecyclerView.R(childAt)) >= 0 && R < arrayList.size()) {
                ((org.telegram.ui.Components.v21) childAt).g(((org.telegram.ui.Components.yp) arrayList.get(R)).d, true);
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    public void setGalleryWallpaper(TLRPC.WallPaper wallPaper) {
        this.v = wallPaper;
        AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new bd(this, 1));
        if (this.v != null) {
            ArrayList arrayList = this.c;
            if ((arrayList.isEmpty() || ((org.telegram.ui.Components.yp) arrayList.get(0)).a.a) && this.f) {
                arrayList.add(0, new org.telegram.ui.Components.yp(org.telegram.ui.ActionBar.b4.a(this.a)));
                this.h.l();
            }
        }
    }

    public void setOnEmoticonSelected(Utilities.Callback<String> callback) {
        this.r = callback;
    }

    public void setWithRemovedStub(boolean z10) {
        this.f = z10;
    }
}
