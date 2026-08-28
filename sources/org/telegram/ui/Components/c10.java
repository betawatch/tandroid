package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c10 extends w7 {
    public final /* synthetic */ Context A;
    public final /* synthetic */ FragmentContextView B;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c10(FragmentContextView fragmentContextView, Context context, Context context2, int i9) {
        super(context);
        this.y = i9;
        this.B = fragmentContextView;
        this.A = context2;
    }

    @Override // org.telegram.ui.Components.w7
    public final TextView a() {
        switch (this.y) {
            case 0:
                TextView textView = new TextView(this.A);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                FragmentContextView fragmentContextView = this.B;
                int i9 = fragmentContextView.P;
                if (i9 == 0 || i9 == 2) {
                    textView.setGravity(19);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextSize(1, 15.0f);
                } else if (i9 == 4) {
                    textView.setGravity(51);
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.t7, fragmentContextView.l0));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 15.0f);
                } else if (i9 == 1 || i9 == 3) {
                    textView.setGravity(19);
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A7, fragmentContextView.l0));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 14.0f);
                }
                return textView;
            default:
                TextView textView2 = new TextView(this.A);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(3);
                textView2.setTextSize(1, 13.0f);
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.x7, this.B.l0));
                return textView2;
        }
    }
}
