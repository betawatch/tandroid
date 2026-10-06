package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class n0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ o0 a;

    public n0(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            p4.v vVar = (p4.v) seekBar.getTag();
            g0 g0Var = (g0) this.a.L.get(vVar.c);
            if (g0Var != null) {
                g0Var.u(i10 == 0);
            }
            vVar.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        o0 o0Var = this.a;
        if (o0Var.M != null) {
            o0Var.H.removeMessages(2);
        }
        o0Var.M = (p4.v) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.H.sendEmptyMessageDelayed(2, 500L);
    }
}
