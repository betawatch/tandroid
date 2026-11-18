package androidx.mediarouter.app;

import a8.sa;
import android.widget.SeekBar;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class r implements SeekBar.OnSeekBarChangeListener {
    public final sa a = new sa(this, 11);
    public final /* synthetic */ t b;

    public r(t tVar) {
        this.b = tVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z10) {
        if (z10) {
            s4.v vVar = (s4.v) seekBar.getTag();
            int i10 = t.G0;
            vVar.j(i7);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        t tVar = this.b;
        if (tVar.d0 != null) {
            tVar.b0.removeCallbacks(this.a);
        }
        tVar.d0 = (s4.v) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.b0.postDelayed(this.a, 500L);
    }
}
