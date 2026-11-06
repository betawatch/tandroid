package androidx.mediarouter.app;

import a8.ra;
import android.widget.SeekBar;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class r implements SeekBar.OnSeekBarChangeListener {
    public final ra a = new ra(this, 9);
    public final /* synthetic */ t b;

    public r(t tVar) {
        this.b = tVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z9) {
        if (z9) {
            s4.v vVar = (s4.v) seekBar.getTag();
            int i10 = t.F0;
            vVar.j(i7);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        t tVar = this.b;
        if (tVar.c0 != null) {
            tVar.a0.removeCallbacks(this.a);
        }
        tVar.c0 = (s4.v) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.a0.postDelayed(this.a, 500L);
    }
}
