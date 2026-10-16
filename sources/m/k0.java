package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class k0 implements q0, DialogInterface.OnClickListener {
    public g.f a;
    public l0 b;
    public CharSequence c;
    public final /* synthetic */ r0 d;

    public k0(r0 r0Var) {
        this.d = r0Var;
    }

    @Override // m.q0
    public final boolean a() {
        g.f fVar = this.a;
        if (fVar != null) {
            return fVar.isShowing();
        }
        return false;
    }

    @Override // m.q0
    public final int b() {
        return 0;
    }

    @Override // m.q0
    public final void c(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // m.q0
    public final CharSequence d() {
        return this.c;
    }

    @Override // m.q0
    public final void dismiss() {
        g.f fVar = this.a;
        if (fVar != null) {
            fVar.dismiss();
            this.a = null;
        }
    }

    @Override // m.q0
    public final Drawable e() {
        return null;
    }

    @Override // m.q0
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // m.q0
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // m.q0
    public final void j(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.q0
    public final void k(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.q0
    public final void l(int i10, int i11) {
        if (this.b == null) {
            return;
        }
        r0 r0Var = this.d;
        c5.c0 c0Var = new c5.c0(r0Var.getPopupContext());
        g.b bVar = (g.b) c0Var.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        l0 l0Var = this.b;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        bVar.i = l0Var;
        bVar.j = this;
        bVar.m = selectedItemPosition;
        bVar.l = true;
        g.f d = c0Var.d();
        this.a = d;
        AlertController$RecycleListView alertController$RecycleListView = d.f.e;
        i0.d(alertController$RecycleListView, i10);
        i0.c(alertController$RecycleListView, i11);
        this.a.show();
    }

    @Override // m.q0
    public final int m() {
        return 0;
    }

    @Override // m.q0
    public final void n(ListAdapter listAdapter) {
        this.b = (l0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        r0 r0Var = this.d;
        r0Var.setSelection(i10);
        if (r0Var.getOnItemClickListener() != null) {
            r0Var.performItemClick(null, i10, this.b.getItemId(i10));
        }
        dismiss();
    }
}
