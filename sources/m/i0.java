package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class i0 implements p0, DialogInterface.OnClickListener {
    public g.f a;
    public k0 b;
    public CharSequence c;
    public final /* synthetic */ q0 d;

    public i0(q0 q0Var) {
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
    public final void dismiss() {
        g.f fVar = this.a;
        if (fVar != null) {
            fVar.dismiss();
            this.a = null;
        }
    }

    @Override // m.p0
    public final CharSequence e() {
        return this.c;
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
        p2.w wVar = new p2.w(q0Var.getPopupContext());
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
        g.f f10 = wVar.f();
        this.a = f10;
        AlertController$RecycleListView alertController$RecycleListView = f10.f.e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.a.show();
    }

    @Override // m.p0
    public final int o() {
        return 0;
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

    @Override // m.p0
    public final void p(ListAdapter listAdapter) {
        this.b = (k0) listAdapter;
    }
}
