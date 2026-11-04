package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class n0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ o0 a;

    public n0(o0 o0Var) {
        this.a = o0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i3, boolean z10) {
        if (z10) {
            r4.w wVar = (r4.w) seekBar.getTag();
            f0 f0Var = (f0) this.a.M.get(wVar.c);
            if (f0Var != null) {
                f0Var.u(i3 == 0);
            }
            wVar.j(i3);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        o0 o0Var = this.a;
        if (o0Var.N != null) {
            o0Var.I.removeMessages(2);
        }
        o0Var.N = (r4.w) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.I.sendEmptyMessageDelayed(2, 500L);
    }
}
