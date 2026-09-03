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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class ju0 extends org.telegram.ui.Components.rl0 {
    public final Context c;
    public final /* synthetic */ PhotoViewer d;

    public ju0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override // f2.p0
    public final int h() {
        PhotoViewer photoViewer = this.d;
        ou0 ou0Var = photoViewer.d;
        if (ou0Var == null || ou0Var.c() == null) {
            return 0;
        }
        return photoViewer.d.c().size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return 0;
    }

    @Override // f2.p0
    public final void v(f2.m1 m1Var, int i10) {
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) m1Var.a;
        int dp = AndroidUtilities.dp(85.0f);
        int dp2 = i10 != 0 ? AndroidUtilities.dp(6.0f) : 0;
        z5Var.f = dp;
        org.telegram.ui.Components.np npVar = z5Var.c;
        org.telegram.ui.Components.p9 p9Var = z5Var.a;
        eg.q1 q1Var = z5Var.e;
        z5Var.h = dp2;
        ((FrameLayout.LayoutParams) z5Var.b.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) p9Var.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) q1Var.getLayoutParams()).rightMargin = dp2;
        p9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (!(obj instanceof MediaController.PhotoEntry)) {
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                z5Var.setTag(searchImage);
                z5Var.setImage(searchImage);
                q1Var.setVisibility(4);
                npVar.a.f(-1, true, false);
                npVar.setVisibility(0);
                return;
            }
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
        z5Var.setTag(photoEntry);
        q1Var.setVisibility(4);
        String str = photoEntry.thumbPath;
        Context context = this.c;
        if (str != null) {
            p9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (photoEntry.path != null) {
            p9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                p9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                q1Var.setVisibility(0);
                z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                p9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            p9Var.setImageResource(R.drawable.nophotos);
        }
        npVar.a.f(-1, true, false);
        npVar.setVisibility(0);
    }

    @Override // f2.p0
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context);
        new Paint();
        z5Var.setWillNotDraw(false);
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        z5Var.a = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        z5Var.addView(p9Var, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        z5Var.b = frameLayout;
        z5Var.addView(frameLayout, k7.c6.e(42, 42, 53));
        eg.q1 q1Var = new eg.q1(context);
        q1Var.d = new Path();
        q1Var.c = new float[8];
        q1Var.b = new RectF();
        q1Var.e = new Paint(1);
        z5Var.e = q1Var;
        q1Var.setWillNotDraw(false);
        q1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        z5Var.addView(q1Var, k7.c6.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        q1Var.addView(imageView, k7.c6.e(-2, -2, 19));
        TextView textView = new TextView(context);
        z5Var.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        q1Var.addView(textView, k7.c6.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(context, 24, null);
        z5Var.c = npVar;
        npVar.setDrawBackgroundAsArc(11);
        npVar.b(org.telegram.ui.ActionBar.k6.W9, org.telegram.ui.ActionBar.k6.X9, org.telegram.ui.ActionBar.k6.V9);
        z5Var.addView(npVar, k7.c6.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        npVar.setVisibility(0);
        z5Var.setFocusable(true);
        frameLayout.setOnClickListener(new f60(this, 20));
        return new org.telegram.ui.Components.el0(z5Var);
    }
}
