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

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class cu0 extends org.telegram.ui.Components.im0 {
    public final Context c;
    public final /* synthetic */ PhotoViewer d;

    public cu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.im0
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override // s4.g0
    public final int h() {
        PhotoViewer photoViewer = this.d;
        hu0 hu0Var = photoViewer.d;
        if (hu0Var == null || hu0Var.c() == null) {
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
        org.telegram.ui.Cells.y5 y5Var = (org.telegram.ui.Cells.y5) b1Var.a;
        int dp = AndroidUtilities.dp(85.0f);
        int dp2 = i10 != 0 ? AndroidUtilities.dp(6.0f) : 0;
        y5Var.f = dp;
        org.telegram.ui.Components.xp xpVar = y5Var.c;
        org.telegram.ui.Components.w9 w9Var = y5Var.a;
        ai.o5 o5Var = y5Var.e;
        y5Var.h = dp2;
        ((FrameLayout.LayoutParams) y5Var.b.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) w9Var.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) o5Var.getLayoutParams()).rightMargin = dp2;
        w9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (!(obj instanceof MediaController.PhotoEntry)) {
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                y5Var.setTag(searchImage);
                y5Var.setImage(searchImage);
                o5Var.setVisibility(4);
                xpVar.a.f(-1, true, false);
                xpVar.setVisibility(0);
                return;
            }
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
        y5Var.setTag(photoEntry);
        o5Var.setVisibility(4);
        String str = photoEntry.thumbPath;
        Context context = this.c;
        if (str != null) {
            w9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (photoEntry.path != null) {
            w9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                w9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                o5Var.setVisibility(0);
                y5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                w9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            w9Var.setImageResource(R.drawable.nophotos);
        }
        xpVar.a.f(-1, true, false);
        xpVar.setVisibility(0);
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.y5 y5Var = new org.telegram.ui.Cells.y5(context);
        new Paint();
        y5Var.setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        y5Var.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        y5Var.addView(w9Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        y5Var.b = frameLayout;
        y5Var.addView(frameLayout, w7.z5.e(42, 42, 53));
        ai.o5 o5Var = new ai.o5(context);
        o5Var.d = new Path();
        o5Var.e = new float[8];
        o5Var.b = new RectF();
        o5Var.c = new Paint(1);
        y5Var.e = o5Var;
        o5Var.setWillNotDraw(false);
        o5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        y5Var.addView(o5Var, w7.z5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        o5Var.addView(imageView, w7.z5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        y5Var.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        o5Var.addView(textView, w7.z5.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(context, 24, null);
        y5Var.c = xpVar;
        xpVar.setDrawBackgroundAsArc(11);
        xpVar.b(org.telegram.ui.ActionBar.h6.W9, org.telegram.ui.ActionBar.h6.X9, org.telegram.ui.ActionBar.h6.V9);
        y5Var.addView(xpVar, w7.z5.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        xpVar.setVisibility(0);
        y5Var.setFocusable(true);
        frameLayout.setOnClickListener(new s50(this, 20));
        return new org.telegram.ui.Components.tl0(y5Var);
    }
}
