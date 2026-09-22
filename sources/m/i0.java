package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
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
    public final CharSequence d() {
        return this.c;
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
    public final Drawable e() {
        return null;
    }

    @Override // m.o0
    public final void g(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // m.o0
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // m.o0
    public final void j(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.o0
    public final void k(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.o0
    public final void l(int i10, int i11) {
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
        g.g e = b0Var.e();
        this.a = e;
        AlertController$RecycleListView alertController$RecycleListView = e.f.e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.a.show();
    }

    @Override // m.o0
    public final int m() {
        return 0;
    }

    @Override // m.o0
    public final void n(ListAdapter listAdapter) {
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
