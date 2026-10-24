package ai;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final /* synthetic */ class kb implements View.OnClickListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Utilities.Callback2 c;
    public final /* synthetic */ ei.d d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ org.telegram.ui.ActionBar.h3[] f;

    public /* synthetic */ kb(boolean[] zArr, Utilities.Callback2 callback2, ei.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.b = zArr;
        this.c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f = h3VarArr;
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
                    this.c.run(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new lb(editTextBoldCursor, this.f, 1));
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.c.run(0L, new a3.l0(zArr2, this.e, this.f, 15));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kb(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ei.d dVar, org.telegram.ui.ActionBar.h3[] h3VarArr) {
        this.b = zArr;
        this.c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f = h3VarArr;
    }
}
