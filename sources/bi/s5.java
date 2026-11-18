package bi;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.JsPromptResult;
import android.widget.TextView;
import org.telegram.messenger.x10;
import org.telegram.ui.Components.mt;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s5 implements TextView.OnEditorActionListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s5(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.a = i7;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
        switch (this.a) {
            case 0:
                r5 r5Var = (r5) this.b;
                if (i7 != 6) {
                    return false;
                }
                String obj = r5Var.getText().toString();
                if (obj.length() <= 0 || obj.length() > 12) {
                    org.telegram.messenger.g0.D3(r5Var);
                } else {
                    ((x10) this.c).a(obj);
                    org.telegram.ui.ActionBar.u1 u1Var = ((org.telegram.ui.ActionBar.u1[]) this.d)[0];
                    if (u1Var != null) {
                        u1Var.dismiss();
                    }
                    View view = (View) this.e;
                    if (view != null) {
                        view.requestFocus();
                    }
                }
                return true;
            default:
                if (i7 != 6) {
                    return false;
                }
                boolean[] zArr = (boolean[]) this.b;
                if (!zArr[0]) {
                    zArr[0] = true;
                    ((JsPromptResult) this.c).confirm(((mt) this.d).getText().toString());
                    ((org.telegram.ui.ActionBar.u1) this.e).dismiss();
                }
                return true;
        }
    }
}
