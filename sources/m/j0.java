package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class j0 implements p0, DialogInterface.OnClickListener {
    public g.g a;
    public k0 b;
    public CharSequence c;
    public final /* synthetic */ q0 d;

    public j0(q0 q0Var) {
        this.d = q0Var;
    }

    @Override // m.p0
    public final boolean a() {
        g.g gVar = this.a;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    @Override // m.p0
    public final int b() {
        return 0;
    }

    @Override // m.p0
    public final void c(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.p0
    public final CharSequence d() {
        return this.c;
    }

    @Override // m.p0
    public final void dismiss() {
        g.g gVar = this.a;
        if (gVar != null) {
            gVar.dismiss();
            this.a = null;
        }
    }

    @Override // m.p0
    public final Drawable e() {
        return null;
    }

    @Override // m.p0
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // m.p0
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // m.p0
    public final void k(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.p0
    public final void l(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.p0
    public final void m(int i10, int i11) {
        if (this.b == null) {
            return;
        }
        q0 q0Var = this.d;
        n2.v vVar = new n2.v(q0Var.getPopupContext());
        g.d dVar = (g.d) vVar.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            dVar.d = charSequence;
        }
        k0 k0Var = this.b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        dVar.i = k0Var;
        dVar.j = this;
        dVar.m = selectedItemPosition;
        dVar.l = true;
        g.g d = vVar.d();
        this.a = d;
        AlertController$RecycleListView alertController$RecycleListView = d.f.e;
        h0.d(alertController$RecycleListView, i10);
        h0.c(alertController$RecycleListView, i11);
        this.a.show();
    }

    @Override // m.p0
    public final int n() {
        return 0;
    }

    @Override // m.p0
    public final void o(ListAdapter listAdapter) {
        this.b = (k0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        q0 q0Var = this.d;
        q0Var.setSelection(i10);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i10, this.b.getItemId(i10));
        }
        dismiss();
    }
}
