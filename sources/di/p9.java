package di;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.s10;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class p9 implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ s10 c;
    public final /* synthetic */ hi.d d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ org.telegram.ui.ActionBar.u2[] f;

    public /* synthetic */ p9(boolean[] zArr, s10 s10Var, hi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.b = zArr;
        this.c = s10Var;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f = u2VarArr;
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
                    this.c.a(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new s9(editTextBoldCursor, this.f, 2));
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.c.a(0L, new aa.r(zArr2, this.e, this.f, 26));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p9(boolean[] zArr, s10 s10Var, EditTextBoldCursor editTextBoldCursor, hi.d dVar, org.telegram.ui.ActionBar.u2[] u2VarArr) {
        this.b = zArr;
        this.c = s10Var;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f = u2VarArr;
    }
}
