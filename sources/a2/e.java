package a2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends VolumeProvider {
    public final /* synthetic */ q a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, int i3, int i10, int i11, String str) {
        super(i3, i10, i11, str);
        this.a = qVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i3) {
        q qVar = this.a;
        ((r4.e) ((p7.d) qVar.f).c).a.post(new r4.c(qVar, i3, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i3) {
        q qVar = this.a;
        ((r4.e) ((p7.d) qVar.f).c).a.post(new r4.c(qVar, i3, 0));
    }
}
