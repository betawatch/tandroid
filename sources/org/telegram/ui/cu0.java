package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class cu0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ PhotoViewer d;

    public cu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        return false;
    }

    @Override // f2.o0
    public final int h() {
        PhotoViewer photoViewer = this.d;
        hu0 hu0Var = photoViewer.d;
        if (hu0Var == null || hu0Var.c() == null) {
            return 0;
        }
        return photoViewer.d.c().size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) l1Var.a;
        int dp = AndroidUtilities.dp(85.0f);
        int dp2 = i10 != 0 ? AndroidUtilities.dp(6.0f) : 0;
        z5Var.f = dp;
        org.telegram.ui.Components.lp lpVar = z5Var.c;
        org.telegram.ui.Components.p9 p9Var = z5Var.a;
        dg.s1 s1Var = z5Var.e;
        z5Var.h = dp2;
        ((FrameLayout.LayoutParams) z5Var.b.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) p9Var.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) s1Var.getLayoutParams()).rightMargin = dp2;
        p9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (!(obj instanceof MediaController.PhotoEntry)) {
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                z5Var.setTag(searchImage);
                z5Var.setImage(searchImage);
                s1Var.setVisibility(4);
                lpVar.a.f(-1, true, false);
                lpVar.setVisibility(0);
                return;
            }
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
        z5Var.setTag(photoEntry);
        s1Var.setVisibility(4);
        String str = photoEntry.thumbPath;
        Context context = this.c;
        if (str != null) {
            p9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (photoEntry.path != null) {
            p9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                p9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                s1Var.setVisibility(0);
                z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                p9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            p9Var.setImageResource(R.drawable.nophotos);
        }
        lpVar.a.f(-1, true, false);
        lpVar.setVisibility(0);
    }

    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context);
        new Paint();
        z5Var.setWillNotDraw(false);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        z5Var.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        z5Var.addView(p9Var, k7.b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        z5Var.b = frameLayout;
        z5Var.addView(frameLayout, k7.b6.e(42, 42, 53));
        dg.s1 s1Var = new dg.s1(context);
        s1Var.d = new Path();
        s1Var.c = new float[8];
        s1Var.b = new RectF();
        s1Var.e = new Paint(1);
        z5Var.e = s1Var;
        s1Var.setWillNotDraw(false);
        s1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        z5Var.addView(s1Var, k7.b6.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        s1Var.addView(imageView, k7.b6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        z5Var.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        s1Var.addView(textView, k7.b6.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(context, 24, null);
        z5Var.c = lpVar;
        lpVar.setDrawBackgroundAsArc(11);
        lpVar.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        z5Var.addView(lpVar, k7.b6.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        lpVar.setVisibility(0);
        z5Var.setFocusable(true);
        frameLayout.setOnClickListener(new e60(this, 21));
        return new org.telegram.ui.Components.el0(z5Var);
    }
}
