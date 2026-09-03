package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class o0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ p0 a;

    public o0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z4) {
        if (z4) {
            c2.b0 b0Var = (c2.b0) seekBar.getTag();
            h0 h0Var = (h0) this.a.I.get(b0Var.c);
            if (h0Var != null) {
                h0Var.u(i10 == 0);
            }
            b0Var.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        p0 p0Var = this.a;
        if (p0Var.J != null) {
            p0Var.E.removeMessages(2);
        }
        p0Var.J = (c2.b0) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.E.sendEmptyMessageDelayed(2, 500L);
    }
}
