package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class h10 extends LinearLayout {
    public final hi.d a;
    public final hi.d b;
    public final hi.d c;
    public final long d;

    public h10(Context context, int i7) {
        super(context);
        TLRPC.TL_emojiList a10 = a9.a(i7);
        setOrientation(1);
        q9 q9Var = new q9(context);
        q9Var.setImageDrawable(new mh0(R.raw.utyan_gallery, org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f)));
        if (!org.telegram.messenger.g0.Q1()) {
            addView(q9Var, c8.ma.r(org.telegram.messenger.ks.v1, org.telegram.messenger.ks.v1, 49));
        }
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.gd.M0(2131750467, null));
        textView.setTypeface(org.telegram.messenger.g0.o());
        addView(textView, c8.ma.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.u6.U(textView2, org.telegram.ui.ActionBar.n6.c7, null);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.gd.M0(org.telegram.messenger.j10.i(i7).q() ? 2131750462 : 2131750463, null));
        textView2.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
        textView2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView2, c8.ma.t(-2, -2, 49, 0, 0, 0, 14));
        hi.d dVar = new hi.d(context, null, true);
        this.a = dVar;
        dVar.f();
        dVar.i(org.telegram.messenger.gd.M0(2131750466, null), false, true);
        addView(dVar, c8.ma.r(-2, 44, 49));
        hi.d dVar2 = new hi.d(context, null, false);
        this.b = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new lq(R.drawable.outline_attach_camera_24, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.gd.M0(2131750464, null));
        dVar2.i(spannableStringBuilder, false, true);
        addView(dVar2, c8.ma.t(-2, 44, 49, 0, 8, 0, 0));
        hi.d dVar3 = new hi.d(context, null, false);
        this.c = dVar3;
        dVar3.f();
        dVar3.setVisibility(8);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder("c");
        ArrayList<Long> arrayList = a10.document_id;
        if (arrayList == null || arrayList.isEmpty()) {
            this.d = 0L;
        } else {
            long longValue = a10.document_id.get(0).longValue();
            this.d = longValue;
            spannableStringBuilder2.setSpan(new x5(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        }
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.gd.M0(2131743560, null));
        dVar3.i(spannableStringBuilder2, false, true);
        addView(dVar3, c8.ma.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30);
        hi.d dVar = this.a;
        dVar.setUseWrapContent(true);
        hi.d dVar2 = this.b;
        dVar2.setUseWrapContent(true);
        hi.d dVar3 = this.c;
        dVar3.setUseWrapContent(true);
        dVar.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar2.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar3.measure(makeMeasureSpec, makeMeasureSpec2);
        dVar.setUseWrapContent(false);
        dVar2.setUseWrapContent(false);
        dVar3.setUseWrapContent(false);
        int max = Math.max(Math.max(dVar.getMeasuredWidth(), dVar2.getMeasuredWidth()), dVar3.getMeasuredWidth());
        dVar.getLayoutParams().width = org.telegram.messenger.g0.L(80.0f) + max;
        dVar2.getLayoutParams().width = org.telegram.messenger.g0.L(80.0f) + max;
        dVar3.getLayoutParams().width = org.telegram.messenger.g0.L(80.0f) + max;
        super.onMeasure(i7, i10);
    }

    public void setUseAnEmojiVisible(boolean z10) {
        this.c.setVisibility(z10 ? 0 : 8);
    }
}
