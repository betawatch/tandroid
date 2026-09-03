package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
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
            c2.b0 b0Var = (c2.b0) seekBar.getTag();
            int i11 = v.C0;
            b0Var.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        v vVar = this.b;
        if (vVar.Z != null) {
            vVar.X.removeCallbacks(this.a);
        }
        vVar.Z = (c2.b0) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.X.postDelayed(this.a, 500L);
    }
}
