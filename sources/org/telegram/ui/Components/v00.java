package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final class v00 extends a8 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Context F;
    public final /* synthetic */ FragmentContextView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v00(FragmentContextView fragmentContextView, Context context, Context context2, int i7) {
        super(context);
        this.E = i7;
        this.G = fragmentContextView;
        this.F = context2;
    }

    @Override // org.telegram.ui.Components.a8
    public final TextView a() {
        switch (this.E) {
            case 0:
                TextView textView = new TextView(this.F);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                FragmentContextView fragmentContextView = this.G;
                int i7 = fragmentContextView.V;
                if (i7 == 0 || i7 == 2) {
                    textView.setGravity(19);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextSize(1, 15.0f);
                } else if (i7 == 4) {
                    textView.setGravity(51);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.t7, fragmentContextView.r0);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setTextSize(1, 15.0f);
                } else if (i7 == 1 || i7 == 3) {
                    textView.setGravity(19);
                    org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.A7, fragmentContextView.r0);
                    textView.setTypeface(org.telegram.messenger.g0.o());
                    textView.setTextSize(1, 14.0f);
                }
                return textView;
            default:
                TextView textView2 = new TextView(this.F);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(3);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.t6.U(textView2, org.telegram.ui.ActionBar.m6.x7, this.G.r0);
                return textView2;
        }
    }
}
