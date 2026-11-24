// default package

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class cn9 implements TextView.OnEditorActionListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hd b;

    public /* synthetic */ cn9(hd hdVar, byte b) {
        this.a = b;
        this.b = hdVar;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        byte b = this.a;
        hd hdVar = this.b;
        switch (b) {
            case 0:
                gl.t1(textView);
                View c = hdVar.c(-1);
                if (c != null) {
                    c.callOnClick();
                }
                return false;
            default:
                if (i != 6) {
                    return false;
                }
                hdVar.c(-1).callOnClick();
                return true;
        }
    }
}
