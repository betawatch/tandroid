package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class s implements SeekBar.OnSeekBarChangeListener {
    public final j a = new j(this, 1);
    public final /* synthetic */ u b;

    public s(u uVar) {
        this.b = uVar;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            c2.z zVar = (c2.z) seekBar.getTag();
            int i11 = u.B0;
            zVar.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        u uVar = this.b;
        if (uVar.Y != null) {
            uVar.W.removeCallbacks(this.a);
        }
        uVar.Y = (c2.z) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.b.W.postDelayed(this.a, 500L);
    }
}
