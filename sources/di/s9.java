package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.q10;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class s9 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ q10 c;
    public final /* synthetic */ hi.d d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ org.telegram.ui.ActionBar.x2[] f;

    public /* synthetic */ s9(boolean[] zArr, q10 q10Var, hi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.b = zArr;
        this.c = q10Var;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f = x2VarArr;
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
                    this.c.a(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new v9(editTextBoldCursor, this.f, 2));
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.c.a(0L, new ga(zArr2, this.e, this.f, 0));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ s9(boolean[] zArr, q10 q10Var, EditTextBoldCursor editTextBoldCursor, hi.d dVar, org.telegram.ui.ActionBar.x2[] x2VarArr) {
        this.b = zArr;
        this.c = q10Var;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f = x2VarArr;
    }
}
