package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class r implements SeekBar.OnSeekBarChangeListener {
    public final a3.o a = new a3.o(this, 8);
    public final /* synthetic */ t b;

    public r(t tVar) {
        this.b = tVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i3, boolean z10) {
        if (z10) {
            r4.w wVar = (r4.w) seekBar.getTag();
            int i10 = t.G0;
            wVar.j(i3);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        t tVar = this.b;
        if (tVar.d0 != null) {
            tVar.b0.removeCallbacks(this.a);
        }
        tVar.d0 = (r4.w) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.b0.postDelayed(this.a, 500L);
    }
}
