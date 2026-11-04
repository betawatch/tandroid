package ci;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.n10;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ n10 c;
    public final /* synthetic */ gi.d d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ org.telegram.ui.ActionBar.t2[] f;

    public /* synthetic */ aa(boolean[] zArr, n10 n10Var, gi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.t2[] t2VarArr) {
        this.b = zArr;
        this.c = n10Var;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f = t2VarArr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                boolean[] zArr = this.b;
                if (!zArr[0]) {
                    EditTextBoldCursor editTextBoldCursor = this.e;
                    String obj = editTextBoldCursor.getText().toString();
                    zArr[0] = true;
                    this.d.setLoading(true);
                    this.c.a(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new da(editTextBoldCursor, this.f, 2));
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.c.a(0L, new ai.k3(zArr2, this.e, this.f, 23));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ aa(boolean[] zArr, n10 n10Var, EditTextBoldCursor editTextBoldCursor, gi.d dVar, org.telegram.ui.ActionBar.t2[] t2VarArr) {
        this.b = zArr;
        this.c = n10Var;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f = t2VarArr;
    }
}
