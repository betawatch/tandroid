// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class dp9 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ he b;

    public /* synthetic */ dp9(he heVar, byte b) {
        this.a = b;
        this.b = heVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        he heVar = this.b;
        switch (b) {
            case 0:
                gm.t1(textView);
                View c = heVar.c(-1);
                if (c != null) {
                    c.callOnClick();
                }
                return false;
            default:
                if (i != 6) {
                    return false;
                }
                heVar.c(-1).callOnClick();
                return true;
        }
    }
}
