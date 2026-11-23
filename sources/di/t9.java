package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.r10;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t9 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ r10 c;
    public final /* synthetic */ hi.e d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ org.telegram.ui.ActionBar.w2[] f;

    public /* synthetic */ t9(boolean[] zArr, r10 r10Var, hi.e eVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.b = zArr;
        this.c = r10Var;
        this.d = eVar;
        this.e = editTextBoldCursor;
        this.f = w2VarArr;
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
                    this.c.a(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new w9(editTextBoldCursor, this.f, 2));
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.c.a(0L, new a8(zArr2, this.e, this.f, 1));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ t9(boolean[] zArr, r10 r10Var, EditTextBoldCursor editTextBoldCursor, hi.e eVar, org.telegram.ui.ActionBar.w2[] w2VarArr) {
        this.b = zArr;
        this.c = r10Var;
        this.e = editTextBoldCursor;
        this.d = eVar;
        this.f = w2VarArr;
    }
}
