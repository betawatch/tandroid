package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class o0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ p0 a;

    public o0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
        if (z10) {
            c2.z zVar = (c2.z) seekBar.getTag();
            g0 g0Var = (g0) this.a.H.get(zVar.c);
            if (g0Var != null) {
                g0Var.u(i10 == 0);
            }
            zVar.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        p0 p0Var = this.a;
        if (p0Var.I != null) {
            p0Var.D.removeMessages(2);
        }
        p0Var.I = (c2.z) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.D.sendEmptyMessageDelayed(2, 500L);
    }
}
