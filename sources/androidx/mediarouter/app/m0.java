package androidx.mediarouter.app;

import android.widget.SeekBar;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class m0 implements SeekBar.OnSeekBarChangeListener {
    public final /* synthetic */ n0 a;

    public m0(n0 n0Var) {
        this.a = n0Var;
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onProgressChanged(SeekBar seekBar, int i7, boolean z10) {
        if (z10) {
            s4.v vVar = (s4.v) seekBar.getTag();
            e0 e0Var = (e0) this.a.M.get(vVar.c);
            if (e0Var != null) {
                e0Var.u(i7 == 0);
            }
            vVar.j(i7);
        }
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStartTrackingTouch(SeekBar seekBar) {
        n0 n0Var = this.a;
        if (n0Var.N != null) {
            n0Var.I.removeMessages(2);
        }
        n0Var.N = (s4.v) seekBar.getTag();
    }

    @Override // android.widget.SeekBar.OnSeekBarChangeListener
    public final void onStopTrackingTouch(SeekBar seekBar) {
        this.a.I.sendEmptyMessageDelayed(2, 500L);
    }
}
