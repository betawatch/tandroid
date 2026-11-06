package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
    public final void c(int i7) {
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
    public final void j(int i7) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // m.p0
    public final void k(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // m.p0
    public final void l(int i7, int i10) {
        if (this.b == null) {
            return;
        }
        q0 q0Var = this.d;
        f5.u uVar = new f5.u(q0Var.getPopupContext());
        g.b bVar = (g.b) uVar.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            bVar.f = charSequence;
        }
        k0 k0Var = this.b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        bVar.l = k0Var;
        bVar.m = this;
        bVar.b = selectedItemPosition;
        bVar.a = true;
        g.f e10 = uVar.e();
        this.a = e10;
        AlertController$RecycleListView alertController$RecycleListView = e10.f.e;
        h0.d(alertController$RecycleListView, i7);
        h0.c(alertController$RecycleListView, i10);
        this.a.show();
    }

    @Override // m.p0
    public final int m() {
        return 0;
    }

    @Override // m.p0
    public final void n(ListAdapter listAdapter) {
        this.b = (k0) listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        q0 q0Var = this.d;
        q0Var.setSelection(i7);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i7, this.b.getItemId(i7));
        }
        dismiss();
    }
}
