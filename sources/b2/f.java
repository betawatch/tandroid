package b2;

import android.media.VolumeProvider;
import androidx.emoji2.text.p;
import org.telegram.ui.ky0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class f extends VolumeProvider {
    public final /* synthetic */ p a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p pVar, int i7, int i10, int i11) {
        super(i7, i10, i11);
        this.a = pVar;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i7) {
        p pVar = this.a;
        ((s4.e) ((ky0) pVar.f).d).a.post(new s4.c(pVar, i7, 1));
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i7) {
        p pVar = this.a;
        ((s4.e) ((ky0) pVar.f).d).a.post(new s4.c(pVar, i7, 0));
    }
}
