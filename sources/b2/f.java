package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        ((s4.e) ((ld0) qVar.f).d).a.post(new s4.c(qVar, i7, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i7) {
        q qVar = this.a;
        ((s4.e) ((ld0) qVar.f).d).a.post(new s4.c(qVar, i7, 0));
    }
}
