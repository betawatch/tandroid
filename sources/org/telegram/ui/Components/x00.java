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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class x00 extends LinearLayout {
    public final fi.d a;
    public final fi.d b;
    public final fi.d c;
    public final long d;

    public x00(Context context, int i7) {
        super(context);
        TLRPC.TL_emojiList a10 = v8.a(i7);
        setOrientation(1);
        l9 l9Var = new l9(context);
        l9Var.setImageDrawable(new zg0(R.raw.utyan_gallery, org.telegram.messenger.g0.L(110.0f), org.telegram.messenger.g0.L(110.0f)));
        if (!org.telegram.messenger.g0.Q1()) {
            addView(l9Var, c8.ha.r(org.telegram.messenger.qs.v1, org.telegram.messenger.qs.v1, 49));
        }
        TextView g10 = org.telegram.messenger.k5.g(context, 1, 20.0f);
        org.telegram.ui.ActionBar.r6.V(g10, org.telegram.ui.ActionBar.k6.G6, null);
        g10.setGravity(1);
        g10.setText(org.telegram.messenger.id.M0(2131750484, null));
        g10.setTypeface(org.telegram.messenger.g0.o());
        addView(g10, c8.ha.t(-2, -2, 49, 0, 15, 0, 7));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.c7, null);
        textView.setGravity(1);
        textView.setText(org.telegram.messenger.id.M0(org.telegram.messenger.p10.i(i7).q() ? 2131750479 : 2131750480, null));
        textView.setMaxWidth(org.telegram.messenger.g0.L(260.0f));
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        addView(textView, c8.ha.t(-2, -2, 49, 0, 0, 0, 14));
        fi.d dVar = new fi.d(context, null, true);
        this.a = dVar;
        dVar.f();
        dVar.i(org.telegram.messenger.id.M0(2131750483, null), false, true);
        addView(dVar, c8.ha.r(-2, 44, 49));
        fi.d dVar2 = new fi.d(context, null, false);
        this.b = dVar2;
        dVar2.f();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("c");
        spannableStringBuilder.setSpan(new wp(R.drawable.outline_attach_camera_24, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) "  ").append((CharSequence) org.telegram.messenger.id.M0(2131750481, null));
        dVar2.i(spannableStringBuilder, false, true);
        addView(dVar2, c8.ha.t(-2, 44, 49, 0, 8, 0, 0));
        fi.d dVar3 = new fi.d(context, null, false);
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
            spannableStringBuilder2.setSpan(new r5(longValue, (Paint.FontMetricsInt) null), 0, 1, 33);
            spannableStringBuilder2.append((CharSequence) "  ");
        }
        spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131743800, null));
        dVar3.i(spannableStringBuilder2, false, true);
        addView(dVar3, c8.ha.t(-2, 44, 49, 0, 1, 0, 0));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), TLObject.FLAG_31);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(44.0f), TLObject.FLAG_30);
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
        dVar.getLayoutParams().width = org.telegram.messenger.g0.L(80.0f) + max;
        dVar2.getLayoutParams().width = org.telegram.messenger.g0.L(80.0f) + max;
        dVar3.getLayoutParams().width = org.telegram.messenger.g0.L(80.0f) + max;
        super.onMeasure(i7, i10);
    }

    public void setUseAnEmojiVisible(boolean z9) {
        this.c.setVisibility(z9 ? 0 : 8);
    }
}
