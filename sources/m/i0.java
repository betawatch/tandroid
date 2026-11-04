package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
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
    public final void c(int i3) {
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
    public final void k(int i3) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.o0
    public final void l(int i3) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.o0
    public final void m(int i3, int i10) {
        if (this.b == null) {
            return;
        }
        p0 p0Var = this.d;
        e5.u uVar = new e5.u(p0Var.getPopupContext());
        g.b bVar = (g.b) uVar.c;
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
        g.f e10 = uVar.e();
        this.a = e10;
        AlertController$RecycleListView alertController$RecycleListView = e10.f.e;
        g0.d(alertController$RecycleListView, i3);
        g0.c(alertController$RecycleListView, i10);
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
    public final void onClick(DialogInterface dialogInterface, int i3) {
        p0 p0Var = this.d;
        p0Var.setSelection(i3);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i3, this.b.getItemId(i3));
        }
        dismiss();
    }
}
