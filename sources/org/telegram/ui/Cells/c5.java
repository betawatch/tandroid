package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.y11;
import org.telegram.ui.vt;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c5 implements on0 {
    public final /* synthetic */ vt a;

    public c5(vt vtVar) {
        this.a = vtVar;
    }

    @Override // org.telegram.ui.Components.on0
    public final void Q(float f10, boolean z10) {
        float b10;
        int i9;
        if (f10 <= 0.25f) {
            b10 = j2.b(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                b10 = j2.b(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                b10 = f12 <= 0.25f ? j2.b(f12, 0.25f, 9.437184E7f, 10485760) : j2.b(f12 - 0.25f, 0.25f, FileLoader.DEFAULT_MAX_FILE_SIZE - 104857600, 104857600);
            }
        }
        int i10 = (int) b10;
        vt vtVar = this.a;
        long j10 = i10;
        vtVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        vtVar.d = j10;
        t8[] t8VarArr = vtVar.h;
        AnimatorSet[] animatorSetArr = vtVar.n;
        int i11 = vtVar.e;
        i9 = vtVar.r.videosRow;
        if (i11 == i9) {
            vtVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            boolean z11 = i10 > 2097152;
            if (z11 != t8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                t8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new y11(vtVar, 20));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.on0
    public final /* synthetic */ int c0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.on0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        vt vtVar = this.a;
        sb2.append((Object) vtVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) vtVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.on0
    public final void n() {
    }
}
