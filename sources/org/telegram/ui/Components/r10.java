package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class r10 extends e8 {
    public final /* synthetic */ Context E;
    public final /* synthetic */ FragmentContextView F;
    public final /* synthetic */ int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r10(FragmentContextView fragmentContextView, Context context, Context context2, int i10) {
        super(context);
        this.y = i10;
        this.F = fragmentContextView;
        this.E = context2;
    }

    @Override // org.telegram.ui.Components.e8
    public final TextView a() {
        switch (this.y) {
            case 0:
                TextView textView = new TextView(this.E);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                FragmentContextView fragmentContextView = this.F;
                int i10 = fragmentContextView.T;
                if (i10 == 0 || i10 == 2) {
                    textView.setGravity(19);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextSize(1, 15.0f);
                } else if (i10 == 4) {
                    textView.setGravity(51);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.t7, fragmentContextView.p0));
                    textView.setTypeface(AndroidUtilities.bold());
                    textView.setTextSize(1, 15.0f);
                } else if (i10 == 1 || i10 == 3) {
                    textView.setGravity(19);
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A7, fragmentContextView.p0));
                    textView.setTypeface(AndroidUtilities.bold());
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
                textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.x7, this.F.p0));
                return textView2;
        }
    }
}
