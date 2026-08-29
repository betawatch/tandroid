package androidx.mediarouter.app;

import ag.q1;
import android.widget.SeekBar;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class q implements SeekBar.OnSeekBarChangeListener {
    public final q1 a = new q1(this, 8);
    public final /* synthetic */ s b;

    public q(s sVar) {
        this.b = sVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            c2.b0 b0Var = (c2.b0) seekBar.getTag();
            int i11 = s.B0;
            b0Var.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        s sVar = this.b;
        if (sVar.Y != null) {
            sVar.W.removeCallbacks(this.a);
        }
        sVar.Y = (c2.b0) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.W.postDelayed(this.a, 500L);
    }
}
