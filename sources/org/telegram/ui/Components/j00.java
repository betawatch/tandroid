package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j00 extends w7 {
    public final /* synthetic */ int D;
    public final /* synthetic */ Context E;
    public final /* synthetic */ FragmentContextView F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j00(FragmentContextView fragmentContextView, Context context, Context context2, int i7) {
        super(context);
        this.D = i7;
        this.F = fragmentContextView;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.w7
    public final TextView a() {
        switch (this.D) {
            case 0:
                TextView textView = new TextView(this.E);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                FragmentContextView fragmentContextView = this.F;
                int i7 = fragmentContextView.U;
                if (i7 == 0 || i7 == 2) {
                    textView.setGravity(19);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextSize(1, 15.0f);
                } else if (i7 == 4) {
                    textView.setGravity(51);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.t7, fragmentContextView.q0);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setTextSize(1, 15.0f);
                } else if (i7 == 1 || i7 == 3) {
                    textView.setGravity(19);
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.A7, fragmentContextView.q0);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setTextSize(1, 14.0f);
                }
                return textView;
            default:
                TextView textView2 = new TextView(this.E);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(3);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.x7, this.F.q0);
                return textView2;
        }
    }
}
