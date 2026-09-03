package lh;

import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class p8 implements View.OnClickListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ Utilities.Callback2 c;
    public final /* synthetic */ ph.d d;
    public final /* synthetic */ EditTextBoldCursor e;
    public final /* synthetic */ org.telegram.ui.ActionBar.g3[] f;

    public /* synthetic */ p8(boolean[] zArr, Utilities.Callback2 callback2, EditTextBoldCursor editTextBoldCursor, ph.d dVar, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.b = zArr;
        this.c = callback2;
        this.e = editTextBoldCursor;
        this.d = dVar;
        this.f = g3VarArr;
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
                    this.c.run(Long.valueOf(TextUtils.isEmpty(obj) ? 0L : Long.parseLong(obj)), new q8(editTextBoldCursor, this.f, 1));
                    break;
                }
                break;
            default:
                boolean[] zArr2 = this.b;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    this.d.setLoading(true);
                    this.c.run(0L, new p6(zArr2, this.e, this.f, 1));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ p8(boolean[] zArr, Utilities.Callback2 callback2, ph.d dVar, EditTextBoldCursor editTextBoldCursor, org.telegram.ui.ActionBar.g3[] g3VarArr) {
        this.b = zArr;
        this.c = callback2;
        this.d = dVar;
        this.e = editTextBoldCursor;
        this.f = g3VarArr;
    }
}
