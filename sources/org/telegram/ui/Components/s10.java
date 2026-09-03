package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class s10 extends w7 {
    public final /* synthetic */ Context B;
    public final /* synthetic */ FragmentContextView C;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s10(FragmentContextView fragmentContextView, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.C = fragmentContextView;
        this.B = context2;
    }

    @Override // org.telegram.ui.Components.w7
    public final TextView a() {
        switch (this.y) {
            case 0:
                TextView textView = new TextView(this.B);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                FragmentContextView fragmentContextView = this.C;
                int i10 = fragmentContextView.Q;
                if (i10 == 0 || i10 == 2) {
                    textView.setGravity(19);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextSize(1, 15.0f);
                } else if (i10 == 4) {
                    textView.setGravity(51);
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.t7, fragmentContextView.m0));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 15.0f);
                } else if (i10 == 1 || i10 == 3) {
                    textView.setGravity(19);
                    textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.A7, fragmentContextView.m0));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 14.0f);
                }
                return textView;
            default:
                TextView textView2 = new TextView(this.B);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(3);
                textView2.setTextSize(1, 13.0f);
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.x7, this.C.m0));
                return textView2;
        }
    }
}
