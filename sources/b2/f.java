package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class f extends VolumeProvider {
    public final /* synthetic */ q a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(q qVar, int i7, int i10, int i11) {
        super(i7, i10, i11);
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
