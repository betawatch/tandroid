package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class g20 extends LinearLayout {
    public final di.d a;
    public final di.d b;
    public final di.d c;
    public final long d;

    public g20(Context context, int i10) {
        super(context);
        TLRPC.TL_emojiList a2 = h9.a(i10);
        setOrientation(1);
        x9 x9Var = new x9(context);
        x9Var.setImageDrawable(new xi0(R.raw.utyan_gallery, AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f)));
        if (!AndroidUtilities.isTablet()) {
            addView(x9Var, w7.x5.q(110, 110, 49));
        }
        TextView g10 = org.telegram.messenger.w1.g(context, 1, 20.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.G6, null, false, g10, 1);
        g10.setText(LocaleController.getString(R.string.GalleryAccessAllowAccess));
        g10.setTypeface(AndroidUtilities.bold());
        addView(g10, w7.x5.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        com.google.android.gms.internal.vision.e2.p(org.telegram.ui.ActionBar.j6.c7, null, false, textView, 1);
        textView.setText(LocaleController.getString(UserConfig.getInstance(i10).isPremium() ? R.string.GalleryAccessAllowAccessTextPremium : R.string.GalleryAccessAllowAccessTextNonPremium));
        textView.setMaxWidth(AndroidUtilities.dp(260.0f));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, w7.x5.t(-2, -2, 49, 0, 0, 0, 14));
        di.d dVar = new di.d(context, null, true);
        this.a = dVar;
        dVar.e();
        dVar.g(LocaleController.getString(R.string.GalleryAccessAllowAccessButton), false, true);
        addView(dVar, w7.x5.q(-2, 44, 49));
        di.d dVar2 = new di.d(context, null, false);
        this.b = dVar2;
        dVar2.e();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new nq(R.drawable.outline_attach_camera_24, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessOpenCamera));
        dVar2.g(spannableStringBuilder, false, true);
        addView(dVar2, w7.x5.t(-2, 44, 49, 0, 8, 0, 0));
        di.d dVar3 = new di.d(context, null, false);
        this.c = dVar3;
        dVar3.e();
        dVar3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a2.document_id;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d = 0L;
        } else {
            long longValue = a2.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new z5(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        }
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.UseEmoji));
        dVar3.g(spannableStringBuilder2, false, true);
        addView(dVar3, w7.x5.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30);
        di.d dVar = this.a;
        dVar.setUseWrapContent(true);
        di.d dVar2 = this.b;
        dVar2.setUseWrapContent(true);
        di.d dVar3 = this.c;
        dVar3.setUseWrapContent(true);
        dVar.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar2.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar3.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar.setUseWrapContent(false);
        dVar2.setUseWrapContent(false);
        dVar3.setUseWrapContent(false);
        int max = Math.max(Math.max(dVar.getMeasuredWidth(), dVar2.getMeasuredWidth()), dVar3.getMeasuredWidth());
        dVar.getLayoutParams().width = AndroidUtilities.dp(80.0f) + max;
        dVar2.getLayoutParams().width = AndroidUtilities.dp(80.0f) + max;
        dVar3.getLayoutParams().width = AndroidUtilities.dp(80.0f) + max;
        super.onMeasure(i10, i11);
    }

    public void setUseAnEmojiVisible(boolean z10) {
        this.c.setVisibility(z10 ? 0 : 8);
    }
}
