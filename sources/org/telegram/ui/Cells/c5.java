package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.fp0;
import org.telegram.ui.Components.v61;
import org.telegram.ui.lu;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class c5 implements fp0 {
    public final /* synthetic */ lu a;

    public c5(lu luVar) {
        this.a = luVar;
    }

    @Override // org.telegram.ui.Components.fp0
    public final void X(float f7, boolean z10) {
        float d;
        int i10;
        if (f7 <= 0.25f) {
            d = a1.g.d(f7, 0.25f, 536576.0f, 512000);
        } else {
            float f10 = f7 - 0.25f;
            if (f10 < 0.25f) {
                d = a1.g.d(f10, 0.25f, 9437184.0f, 1048576);
            } else {
                float f11 = f10 - 0.25f;
                d = f11 <= 0.25f ? a1.g.d(f11, 0.25f, 9.437184E7f, 10485760) : a1.g.d(f11 - 0.25f, 0.25f, FileLoader.DEFAULT_MAX_FILE_SIZE - 104857600, 104857600);
            }
        }
        int i11 = (int) d;
        lu luVar = this.a;
        long j10 = i11;
        luVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        luVar.d = j10;
        w8[] w8VarArr = luVar.h;
        AnimatorSet[] animatorSetArr = luVar.n;
        int i12 = luVar.e;
        i10 = luVar.r.videosRow;
        if (i12 == i10) {
            luVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            boolean z11 = i11 > 2097152;
            if (z11 != w8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                w8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new v61(luVar, 18));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.fp0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        lu luVar = this.a;
        sb2.append((Object) luVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) luVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.fp0
    public final /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.fp0
    public final void z() {
    }
}
