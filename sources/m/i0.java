package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.g a;
    public j0 b;
    public CharSequence c;
    public final /* synthetic */ p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override // m.o0
    public final boolean a() {
        g.g gVar = this.a;
        if (gVar != null) {
            return gVar.isShowing();
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
        g.g gVar = this.a;
        if (gVar != null) {
            gVar.dismiss();
            this.a = null;
        }
    }

    @Override // m.o0
    public final CharSequence e() {
        return this.c;
    }

    @Override // m.o0
    public final Drawable h() {
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
        c5.b0 b0Var = new c5.b0(p0Var.getPopupContext());
        g.c cVar = (g.c) b0Var.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            cVar.d = charSequence;
        }
        j0 j0Var = this.b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        cVar.i = j0Var;
        cVar.j = this;
        cVar.m = selectedItemPosition;
        cVar.l = true;
        g.g e7 = b0Var.e();
        this.a = e7;
        AlertController$RecycleListView alertController$RecycleListView = e7.f.e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.a.show();
    }

    @Override // m.o0
    public final int n() {
        return 0;
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

    @Override // m.o0
    public final void p(ListAdapter listAdapter) {
        this.b = (j0) listAdapter;
    }
}
