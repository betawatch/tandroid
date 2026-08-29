package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ m0 a;

    public l0(m0 m0Var) {
        this.a = m0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            c2.b0 b0Var = (c2.b0) seekBar.getTag();
            e0 e0Var = (e0) this.a.H.get(b0Var.c);
            if (e0Var != null) {
                e0Var.u(i10 == 0);
            }
            b0Var.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        m0 m0Var = this.a;
        if (m0Var.I != null) {
            m0Var.D.removeMessages(2);
        }
        m0Var.I = (c2.b0) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.D.sendEmptyMessageDelayed(2, 500L);
    }
}
