package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class m0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ n0 a;

    public m0(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z9) {
        if (z9) {
            s4.v vVar = (s4.v) seekBar.getTag();
            e0 e0Var = (e0) this.a.L.get(vVar.c);
            if (e0Var != null) {
                e0Var.u(i7 == 0);
            }
            vVar.j(i7);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        n0 n0Var = this.a;
        if (n0Var.M != null) {
            n0Var.H.removeMessages(2);
        }
        n0Var.M = (s4.v) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.H.sendEmptyMessageDelayed(2, 500L);
    }
}
