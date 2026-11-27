// default package

import android.media.VolumeProvider;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class hoc extends VolumeProvider {
    public final /* synthetic */ oy3 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hoc(oy3 oy3Var, int i, int i2, int i3) {
        super(i, i2, i3);
        this.a = oy3Var;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        oy3 oy3Var = this.a;
        ((a05) ((pm3) oy3Var.f).d).a.post(new yz4(oy3Var, i, (byte) 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        oy3 oy3Var = this.a;
        ((a05) ((pm3) oy3Var.f).d).a.post(new yz4(oy3Var, i, (byte) 0));
    }
}
