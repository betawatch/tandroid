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

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class r20 extends LinearLayout {
    public final fi.d a;
    public final fi.d b;
    public final fi.d c;
    public final long d;

    public r20(Context context, int i10) {
        super(context);
        TLRPC.TL_emojiList a2 = i9.a(i10);
        setOrientation(1);
        y9 y9Var = new y9(context);
        y9Var.setImageDrawable(new xj0(R.raw.utyan_gallery, AndroidUtilities.dp(110.0f), AndroidUtilities.dp(110.0f)));
        if (!AndroidUtilities.isTablet()) {
            addView(y9Var, gb1.u(110, 110, 49));
        }
        TextView g7 = org.telegram.messenger.t.g(context, 1, 20.0f);
        org.telegram.ui.ActionBar.f7.V(g7, org.telegram.ui.ActionBar.y6.G6, null);
        g7.setGravity(1);
        g7.setText(LocaleController.getString(R.string.GalleryAccessAllowAccess));
        g7.setTypeface(AndroidUtilities.bold());
        addView(g7, gb1.x(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.c7, null);
        textView.setGravity(1);
        textView.setText(LocaleController.getString(UserConfig.getInstance(i10).isPremium() ? R.string.GalleryAccessAllowAccessTextPremium : R.string.GalleryAccessAllowAccessTextNonPremium));
        textView.setMaxWidth(AndroidUtilities.dp(260.0f));
        textView.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        addView(textView, gb1.x(-2, -2, 49, 0, 0, 0, 14));
        fi.d dVar = new fi.d(context, null, true);
        this.a = dVar;
        dVar.f();
        dVar.i(LocaleController.getString(R.string.GalleryAccessAllowAccessButton), false, true);
        addView(dVar, gb1.u(-2, 44, 49));
        fi.d dVar2 = new fi.d(context, null, false);
        this.b = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new zq(R.drawable.outline_attach_camera_24, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) LocaleController.getString(R.string.GalleryAccessAllowAccessOpenCamera));
        dVar2.i(spannableStringBuilder, false, true);
        addView(dVar2, gb1.x(-2, 44, 49, 0, 8, 0, 0));
        fi.d dVar3 = new fi.d(context, null, false);
        this.c = dVar3;
        dVar3.f();
        dVar3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a2.document_id;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d = 0L;
        } else {
            long longValue = a2.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new c6(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        }
        spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.UseEmoji));
        dVar3.i(spannableStringBuilder2, false, true);
        addView(dVar3, gb1.x(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(44.0f), TLObject.FLAG_30);
        fi.d dVar = this.a;
        dVar.setUseWrapContent(true);
        fi.d dVar2 = this.b;
        dVar2.setUseWrapContent(true);
        fi.d dVar3 = this.c;
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
