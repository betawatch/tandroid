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

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class cv0 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public final /* synthetic */ PhotoViewer d;

    public cv0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        PhotoViewer photoViewer = this.d;
        hv0 hv0Var = photoViewer.d;
        if (hv0Var == null || hv0Var.c() == null) {
            return 0;
        }
        return photoViewer.d.c().size();
    }

    @Override // s4.g0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) b1Var.a;
        int dp = AndroidUtilities.dp(85.0f);
        int dp2 = i10 != 0 ? AndroidUtilities.dp(6.0f) : 0;
        z5Var.f = dp;
        org.telegram.ui.Components.aq aqVar = z5Var.c;
        org.telegram.ui.Components.z9 z9Var = z5Var.a;
        x5 x5Var = z5Var.e;
        z5Var.h = dp2;
        ((FrameLayout.LayoutParams) z5Var.b.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) z9Var.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) x5Var.getLayoutParams()).rightMargin = dp2;
        z9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (!(obj instanceof MediaController.PhotoEntry)) {
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                z5Var.setTag(searchImage);
                z5Var.setImage(searchImage);
                x5Var.setVisibility(4);
                aqVar.a.f(-1, true, false);
                aqVar.setVisibility(0);
                return;
            }
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
        z5Var.setTag(photoEntry);
        x5Var.setVisibility(4);
        String str = photoEntry.thumbPath;
        Context context = this.c;
        if (str != null) {
            z9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (photoEntry.path != null) {
            z9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                z9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                x5Var.setVisibility(0);
                z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                z9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            z9Var.setImageResource(R.drawable.nophotos);
        }
        aqVar.a.f(-1, true, false);
        aqVar.setVisibility(0);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context);
        new Paint();
        z5Var.setWillNotDraw(false);
        org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
        z5Var.a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        z5Var.addView(z9Var, w7.z5.d(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        z5Var.b = frameLayout;
        z5Var.addView(frameLayout, w7.z5.e(42, 42, 53));
        x5 x5Var = new x5(context);
        x5Var.c = new Path();
        x5Var.d = new float[8];
        x5Var.b = new RectF();
        x5Var.e = new Paint(1);
        z5Var.e = x5Var;
        x5Var.setWillNotDraw(false);
        x5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        z5Var.addView(x5Var, w7.z5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        x5Var.addView(imageView, w7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        z5Var.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        x5Var.addView(textView, w7.z5.a(-2.0f, 18.0f, -0.7f, 0.0f, 0.0f, -2, 19));
        org.telegram.ui.Components.aq aqVar = new org.telegram.ui.Components.aq(context, 24, null);
        z5Var.c = aqVar;
        aqVar.setDrawBackgroundAsArc(11);
        aqVar.b(org.telegram.ui.ActionBar.g6.W9, org.telegram.ui.ActionBar.g6.X9, org.telegram.ui.ActionBar.g6.V9);
        z5Var.addView(aqVar, w7.z5.a(26.0f, 55.0f, 4.0f, 0.0f, 0.0f, 26, 51));
        aqVar.setVisibility(0);
        z5Var.setFocusable(true);
        frameLayout.setOnClickListener(new t60(this, 19));
        return new org.telegram.ui.Components.wl0(z5Var);
    }
}
