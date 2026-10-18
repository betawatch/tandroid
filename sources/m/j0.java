package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public final class j0 implements p0, DialogInterface.OnClickListener {
    public g.f a;
    public k0 b;
    public CharSequence c;
    public final /* synthetic */ q0 d;

    public j0(q0 q0Var) {
        this.d = q0Var;
    }

    @Override // m.p0
    public final boolean a() {
        g.f fVar = this.a;
        if (fVar != null) {
            return fVar.isShowing();
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
        g.f fVar = this.a;
        if (fVar != null) {
            fVar.dismiss();
            this.a = null;
        }
    }

    @Override // m.p0
    public final Drawable h() {
        return null;
    }

    @Override // m.p0
    public final void i(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // m.p0
    public final void j(Drawable drawable) {
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
        c5.b0 b0Var = new c5.b0(q0Var.getPopupContext());
        g.b bVar = (g.b) b0Var.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        k0 k0Var = this.b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        bVar.i = k0Var;
        bVar.j = this;
        bVar.m = selectedItemPosition;
        bVar.l = true;
        g.f g10 = b0Var.g();
        this.a = g10;
        AlertController$RecycleListView alertController$RecycleListView = g10.f.e;
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
