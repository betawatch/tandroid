package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class t implements SeekBar.OnSeekBarChangeListener {
    public final androidx.activity.i a = new androidx.activity.i(this, 7);
    public final /* synthetic */ v b;

    public t(v vVar) {
        this.b = vVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i9, boolean z10) {
        if (z10) {
            c2.a0 a0Var = (c2.a0) seekBar.getTag();
            int i10 = v.B0;
            a0Var.j(i9);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        v vVar = this.b;
        if (vVar.Y != null) {
            vVar.W.removeCallbacks(this.a);
        }
        vVar.Y = (c2.a0) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.W.postDelayed(this.a, 500L);
    }
}
