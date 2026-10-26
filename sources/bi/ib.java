package bi;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final /* synthetic */ class ib implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Utilities.Callback2 c;
    public final /* synthetic */ fi.d d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ org.telegram.ui.ActionBar.k3[] f;

    public /* synthetic */ ib(boolean[] zArr, Utilities.Callback2 callback2, fi.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.k3[] k3VarArr) {
        this.b = zArr;
        this.c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f = k3VarArr;
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
                    this.c.run(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new jb(editTextBoldCursor, this.f, 2));
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.c.run(0L, new a3.l0(zArr2, this.e, this.f, 19));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ ib(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, fi.d dVar, org.telegram.ui.ActionBar.k3[] k3VarArr) {
        this.b = zArr;
        this.c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f = k3VarArr;
    }
}
