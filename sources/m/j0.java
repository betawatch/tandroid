package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
    public final void c(int i9) {
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
    public final void j(int i9) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.p0
    public final void l(int i9) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.p0
    public final void m(int i9, int i10) {
        if (this.b == null) {
            return;
        }
        q0 q0Var = this.d;
        n2.w wVar = new n2.w(q0Var.getPopupContext());
        g.c cVar = (g.c) wVar.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            cVar.d = charSequence;
        }
        k0 k0Var = this.b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        cVar.i = k0Var;
        cVar.j = this;
        cVar.m = selectedItemPosition;
        cVar.l = true;
        g.f d = wVar.d();
        this.a = d;
        AlertController$RecycleListView alertController$RecycleListView = d.f.e;
        h0.d(alertController$RecycleListView, i9);
        h0.c(alertController$RecycleListView, i10);
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
    public final void onClick(DialogInterface dialogInterface, int i9) {
        q0 q0Var = this.d;
        q0Var.setSelection(i9);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i9, this.b.getItemId(i9));
        }
        dismiss();
    }
}
