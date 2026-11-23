package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class e extends VolumeProvider {
    public final /* synthetic */ q a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(q qVar, int i7, int i10, int i11, String str) {
        super(i7, i10, i11, str);
        this.a = qVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i7) {
        q qVar = this.a;
        ((s4.e) ((md0) qVar.f).d).a.post(new s4.c(qVar, i7, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i7) {
        q qVar = this.a;
        ((s4.e) ((md0) qVar.f).d).a.post(new s4.c(qVar, i7, 0));
    }
}
