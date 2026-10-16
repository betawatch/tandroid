package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class m0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ n0 a;

    public m0(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            p4.v vVar = (p4.v) seekBar.getTag();
            f0 f0Var = (f0) this.a.L.get(vVar.c);
            if (f0Var != null) {
                f0Var.u(i10 == 0);
            }
            vVar.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        n0 n0Var = this.a;
        if (n0Var.M != null) {
            n0Var.H.removeMessages(2);
        }
        n0Var.M = (p4.v) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.H.sendEmptyMessageDelayed(2, 500L);
    }
}
