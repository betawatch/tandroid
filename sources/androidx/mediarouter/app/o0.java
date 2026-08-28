package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class o0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ p0 a;

    public o0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i9, boolean z10) {
        if (z10) {
            c2.a0 a0Var = (c2.a0) seekBar.getTag();
            h0 h0Var = (h0) this.a.H.get(a0Var.c);
            if (h0Var != null) {
                h0Var.u(i9 == 0);
            }
            a0Var.j(i9);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        p0 p0Var = this.a;
        if (p0Var.I != null) {
            p0Var.D.removeMessages(2);
        }
        p0Var.I = (c2.a0) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.D.sendEmptyMessageDelayed(2, 500L);
    }
}
