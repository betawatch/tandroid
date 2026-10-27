package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class c00 extends FrameLayout {
    public final /* synthetic */ d00 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c00(d00 d00Var, Context context) {
        super(context);
        this.a = d00Var;
        ImageView imageView = new ImageView(context);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.msg_limit_links);
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(22.0f);
        int i10 = org.telegram.ui.ActionBar.y6.Oh;
        int i11 = 0;
        ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.x0(null, i10, false));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i10);
        imageView.setBackground(c02);
        org.telegram.ui.ActionBar.f7.k(imageView, c02, N, null, null);
        addView(imageView, org.telegram.ui.Components.kb1.h(54, 44.0f, 49, 0.0f, 22.0f, 0.0f, 0.0f));
        xh.n nVar = new xh.n(context);
        nVar.setTypeface(AndroidUtilities.bold());
        nVar.setTextSize(1, 20.0f);
        int i12 = org.telegram.ui.ActionBar.y6.j5;
        org.telegram.ui.ActionBar.f7.V(nVar, i12, null);
        nVar.setGravity(1);
        nVar.setText(d00Var.R(nVar));
        MessagesController.DialogFilter dialogFilter = d00Var.Y;
        if (dialogFilter != null && dialogFilter.title_noanimate) {
            i11 = 26;
        }
        nVar.s = i11;
        addView(nVar, org.telegram.ui.Components.kb1.h(-2, -2.0f, 49, 20.0f, 84.0f, 20.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setText(d00Var.Z.isEmpty() ? LocaleController.getString(R.string.FolderLinkShareSubtitleEmpty) : LocaleController.getString(R.string.FolderLinkShareSubtitle));
        textView.setLines(2);
        textView.setGravity(1);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, i12, null);
        addView(textView, org.telegram.ui.Components.kb1.h(-2, -2.0f, 49, 30.0f, 117.0f, 30.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.msg_close);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.C6, null, PorterDuff.Mode.MULTIPLY);
        imageView2.setOnClickListener(new a(this, 23));
        addView(imageView2, org.telegram.ui.Components.kb1.h(48, 48.0f, 53, 0.0f, -4.0f, 2.0f, 0.0f));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(171.0f), TLObject.FLAG_30));
    }
}
