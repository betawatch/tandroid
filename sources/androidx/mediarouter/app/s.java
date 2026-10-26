package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class s implements SeekBar.OnSeekBarChangeListener {
    public final a5.d a = new a5.d(this, 11);
    public final /* synthetic */ u b;

    public s(u uVar) {
        this.b = uVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            p4.v vVar = (p4.v) seekBar.getTag();
            int i11 = u.F0;
            vVar.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        u uVar = this.b;
        if (uVar.c0 != null) {
            uVar.a0.removeCallbacks(this.a);
        }
        uVar.c0 = (p4.v) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.a0.postDelayed(this.a, 500L);
    }
}
