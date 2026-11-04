package ai;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.u10;
import org.telegram.ui.Components.xs;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class v3 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v3(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.a = i3;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i3, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                u3 u3Var = (u3) this.b;
                if (i3 != 6) {
                    return false;
                }
                String obj = u3Var.getText().toString();
                if (obj.length() <= 0 || obj.length() > 12) {
                    org.telegram.messenger.g0.F3(u3Var);
                } else {
                    ((u10) this.c).a(obj);
                    org.telegram.ui.ActionBar.s1 s1Var = ((org.telegram.ui.ActionBar.s1[]) this.d)[0];
                    if (s1Var != null) {
                        s1Var.dismiss();
                    }
                    View view = (View) this.e;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                if (i3 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.c).confirm(((xs) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.s1) this.e).dismiss();
                }
                return true;
        }
    }
}
