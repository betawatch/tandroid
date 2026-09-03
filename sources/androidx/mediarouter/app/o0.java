package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class o0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ p0 a;

    public o0(p0 p0Var) {
        this.a = p0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i10, boolean z4) {
        if (z4) {
            c2.a0 a0Var = (c2.a0) seekBar.getTag();
            h0 h0Var = (h0) this.a.I.get(a0Var.c);
            if (h0Var != null) {
                h0Var.u(i10 == 0);
            }
            a0Var.j(i10);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        p0 p0Var = this.a;
        if (p0Var.J != null) {
            p0Var.E.removeMessages(2);
        }
        p0Var.J = (c2.a0) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.E.sendEmptyMessageDelayed(2, 500L);
    }
}
