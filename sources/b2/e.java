package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.q;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
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
