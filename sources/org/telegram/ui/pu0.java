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

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class pu0 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public final /* synthetic */ PhotoViewer d;

    public pu0(Context context, PhotoViewer photoViewer) {
        this.d = photoViewer;
        this.c = context;
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override // s4.h0
    public final int h() {
        PhotoViewer photoViewer = this.d;
        uu0 uu0Var = photoViewer.d;
        if (uu0Var == null || uu0Var.c() == null) {
            return 0;
        }
        return photoViewer.d.c().size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.z5 z5Var = (org.telegram.ui.Cells.z5) c1Var.a;
        int dp = AndroidUtilities.dp(85.0f);
        int dp2 = i10 != 0 ? AndroidUtilities.dp(6.0f) : 0;
        z5Var.f = dp;
        org.telegram.ui.Components.op opVar = z5Var.c;
        org.telegram.ui.Components.w9 w9Var = z5Var.a;
        u5 u5Var = z5Var.e;
        z5Var.h = dp2;
        ((FrameLayout.LayoutParams) z5Var.b.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) w9Var.getLayoutParams()).rightMargin = dp2;
        ((FrameLayout.LayoutParams) u5Var.getLayoutParams()).rightMargin = dp2;
        w9Var.q(0, true);
        PhotoViewer photoViewer = this.d;
        Object obj = photoViewer.d.v().get(photoViewer.d.c().get(i10));
        if (!(obj instanceof MediaController.PhotoEntry)) {
            if (obj instanceof MediaController.SearchImage) {
                MediaController.SearchImage searchImage = (MediaController.SearchImage) obj;
                z5Var.setTag(searchImage);
                z5Var.setImage(searchImage);
                u5Var.setVisibility(4);
                opVar.a.f(-1, true, false);
                opVar.setVisibility(0);
                return;
            }
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
        z5Var.setTag(photoEntry);
        u5Var.setVisibility(4);
        String str = photoEntry.thumbPath;
        Context context = this.c;
        if (str != null) {
            w9Var.f(str, null, context.getResources().getDrawable(R.drawable.nophotos));
        } else if (photoEntry.path != null) {
            w9Var.p(photoEntry.orientation, photoEntry.invert, true);
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                w9Var.f("thumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            } else {
                u5Var.setVisibility(0);
                z5Var.d.setText(AndroidUtilities.formatShortDuration(photoEntry.duration));
                w9Var.f("vthumb://" + photoEntry.imageId + ":" + photoEntry.path, null, context.getResources().getDrawable(R.drawable.nophotos));
            }
        } else {
            w9Var.setImageResource(R.drawable.nophotos);
        }
        opVar.a.f(-1, true, false);
        opVar.setVisibility(0);
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        Context context = this.c;
        org.telegram.ui.Cells.z5 z5Var = new org.telegram.ui.Cells.z5(context);
        new Paint();
        z5Var.setWillNotDraw(false);
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        z5Var.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
        z5Var.addView(w9Var, w7.x5.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        z5Var.b = frameLayout;
        z5Var.addView(frameLayout, w7.x5.e(42, 42, 53));
        u5 u5Var = new u5(context);
        u5Var.c = new Path();
        u5Var.d = new float[8];
        u5Var.b = new RectF();
        u5Var.e = new Paint(1);
        z5Var.e = u5Var;
        u5Var.setWillNotDraw(false);
        u5Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        z5Var.addView(u5Var, w7.x5.e(-1, 16, 83));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_video);
        u5Var.addView(imageView, w7.x5.e(-2, -2, 19));
        TextView textView = new TextView(context);
        z5Var.d = textView;
        textView.setTextColor(-1);
        textView.setTextSize(1, 12.0f);
        textView.setImportantForAccessibility(2);
        u5Var.addView(textView, w7.x5.d(-2, -2.0f, 19, 18.0f, -0.7f, 0.0f, 0.0f));
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(context, 24, null);
        z5Var.c = opVar;
        opVar.setDrawBackgroundAsArc(11);
        opVar.b(org.telegram.ui.ActionBar.h6.W9, org.telegram.ui.ActionBar.h6.X9, org.telegram.ui.ActionBar.h6.V9);
        z5Var.addView(opVar, w7.x5.d(26, 26.0f, 51, 55.0f, 4.0f, 0.0f, 0.0f));
        opVar.setVisibility(0);
        z5Var.setFocusable(true);
        frameLayout.setOnClickListener(new h60(this, 20));
        return new org.telegram.ui.Components.wk0(z5Var);
    }
}
