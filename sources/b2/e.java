package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
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
