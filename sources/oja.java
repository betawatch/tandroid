// default package

import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class oja implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rja b;

    public /* synthetic */ oja(rja rjaVar, byte b) {
        this.a = b;
        this.b = rjaVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        rja rjaVar = this.b;
        switch (b) {
            case 0:
                if (!rjaVar.H && rjaVar.G) {
                    rjaVar.o(true);
                    break;
                } else {
                    c6 c6Var = rjaVar.W;
                    if (c6Var != null) {
                        c6Var.b(-1);
                        break;
                    }
                }
                break;
            default:
                if (rjaVar.s.length() != 0) {
                    rjaVar.s.setText("");
                } else {
                    TextView textView = rjaVar.x;
                    if (textView != null && textView.getVisibility() == 0) {
                        rjaVar.n();
                    }
                }
                rjaVar.s.requestFocus();
                gm.E3(rjaVar.s);
                break;
        }
    }
}
