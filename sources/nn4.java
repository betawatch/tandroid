// default package

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.ui.Components.FragmentContextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class nn4 extends c20 {
    public final /* synthetic */ byte E;
    public final /* synthetic */ Context F;
    public final /* synthetic */ FragmentContextView G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn4(FragmentContextView fragmentContextView, Context context, Context context2, byte b) {
        super(context);
        this.E = b;
        this.G = fragmentContextView;
        this.F = context2;
    }

    @Override // c20
    public final TextView a() {
        byte b = this.E;
        FragmentContextView fragmentContextView = this.G;
        Context context = this.F;
        switch (b) {
            case 0:
                TextView textView = new TextView(context);
                textView.setMaxLines(1);
                textView.setLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setTextSize(1, 15.0f);
                textView.setGravity(19);
                wjb wjbVar = fragmentContextView.q0;
                int i = fragmentContextView.U;
                if (i == 0 || i == 2) {
                    textView.setGravity(19);
                    textView.setTypeface(Typeface.DEFAULT);
                    textView.setTextSize(1, 15.0f);
                } else if (i == 4) {
                    textView.setGravity(51);
                    zkb.X(textView, bkb.s7, wjbVar);
                    textView.setTypeface(gl.o());
                    textView.setTextSize(1, 15.0f);
                } else if (i == 1 || i == 3) {
                    textView.setGravity(19);
                    zkb.X(textView, bkb.z7, wjbVar);
                    textView.setTypeface(gl.o());
                    textView.setTextSize(1, 14.0f);
                }
                return textView;
            default:
                TextView textView2 = new TextView(context);
                textView2.setMaxLines(1);
                textView2.setLines(1);
                textView2.setSingleLine(true);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setGravity(3);
                textView2.setTextSize(1, 13.0f);
                zkb.X(textView2, bkb.w7, fragmentContextView.q0);
                return textView2;
        }
    }
}
