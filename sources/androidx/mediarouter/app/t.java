package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
