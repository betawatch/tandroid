package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class e extends VolumeProvider {
    public final /* synthetic */ p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p pVar, int i7, int i10, int i11, String str) {
        super(i7, i10, i11, str);
        this.a = pVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i7) {
        p pVar = this.a;
        ((s4.e) ((hy0) pVar.f).d).a.post(new s4.c(pVar, i7, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i7) {
        p pVar = this.a;
        ((s4.e) ((hy0) pVar.f).d).a.post(new s4.c(pVar, i7, 0));
    }
}
