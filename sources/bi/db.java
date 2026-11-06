package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.v10;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ v10 c;
    public final /* synthetic */ fi.d d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ org.telegram.ui.ActionBar.v2[] f;

    public /* synthetic */ db(boolean[] zArr, v10 v10Var, fi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.v2[] v2VarArr) {
        this.b = zArr;
        this.c = v10Var;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f = v2VarArr;
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
                    this.c.a(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new gb(editTextBoldCursor, this.f, 2));
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.c.a(0L, new aa.s(zArr2, this.e, this.f, 20));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ db(boolean[] zArr, v10 v10Var, EditTextBoldCursor editTextBoldCursor, fi.d dVar, org.telegram.ui.ActionBar.v2[] v2VarArr) {
        this.b = zArr;
        this.c = v10Var;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f = v2VarArr;
    }
}
