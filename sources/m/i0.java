package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.f a;
    public j0 b;
    public CharSequence c;
    public final /* synthetic */ p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override // m.o0
    public final boolean a() {
        g.f fVar = this.a;
        if (fVar != null) {
            return fVar.isShowing();
        }
        return false;
    }

    @Override // m.o0
    public final int b() {
        return 0;
    }

    @Override // m.o0
    public final void c(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.o0
    public final void dismiss() {
        g.f fVar = this.a;
        if (fVar != null) {
            fVar.dismiss();
            this.a = null;
        }
    }

    @Override // m.o0
    public final CharSequence e() {
        return this.c;
    }

    @Override // m.o0
    public final Drawable g() {
        return null;
    }

    @Override // m.o0
    public final void i(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // m.o0
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // m.o0
    public final void k(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.o0
    public final void l(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.o0
    public final void m(int i10, int i11) {
        if (this.b == null) {
            return;
        }
        p0 p0Var = this.d;
        c5.x xVar = new c5.x(p0Var.getPopupContext());
        g.b bVar = (g.b) xVar.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            bVar.f = charSequence;
        }
        j0 j0Var = this.b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        bVar.l = j0Var;
        bVar.m = this;
        bVar.b = selectedItemPosition;
        bVar.a = true;
        g.f g10 = xVar.g();
        this.a = g10;
        AlertController$RecycleListView alertController$RecycleListView = g10.f.e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.a.show();
    }

    @Override // m.o0
    public final int n() {
        return 0;
    }

    @Override // m.o0
    public final void o(ListAdapter listAdapter) {
        this.b = (j0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        p0 p0Var = this.d;
        p0Var.setSelection(i10);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i10, this.b.getItemId(i10));
        }
        dismiss();
    }
}
