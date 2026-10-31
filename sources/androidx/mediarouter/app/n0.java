package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class n0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ o0 a;

    public n0(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            p4.w wVar = (p4.w) seekBar.getTag();
            f0 f0Var = (f0) this.a.L.get(wVar.c);
            if (f0Var != null) {
                f0Var.u(i10 == 0);
            }
            wVar.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        o0 o0Var = this.a;
        if (o0Var.M != null) {
            o0Var.H.removeMessages(2);
        }
        o0Var.M = (p4.w) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.H.sendEmptyMessageDelayed(2, 500L);
    }
}
