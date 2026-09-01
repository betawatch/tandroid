package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class t implements SeekBar.OnSeekBarChangeListener {
    public final androidx.activity.i a = new androidx.activity.i(this, 7);
    public final /* synthetic */ v b;

    public t(v vVar) {
        this.b = vVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z4) {
        if (z4) {
            c2.a0 a0Var = (c2.a0) seekBar.getTag();
            int i11 = v.C0;
            a0Var.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        v vVar = this.b;
        if (vVar.Z != null) {
            vVar.X.removeCallbacks(this.a);
        }
        vVar.Z = (c2.a0) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.X.postDelayed(this.a, 500L);
    }
}
