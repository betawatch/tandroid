package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.eu;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class c5 implements jo0 {
    public final /* synthetic */ eu a;

    public c5(eu euVar) {
        this.a = euVar;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void Y(float f10, boolean z4) {
        float c3;
        int i10;
        if (f10 <= 0.25f) {
            c3 = vh.v2.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c3 = vh.v2.c(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                c3 = f12 <= 0.25f ? vh.v2.c(f12, 0.25f, 9.437184E7f, 10485760) : vh.v2.c(f12 - 0.25f, 0.25f, FileLoader.DEFAULT_MAX_FILE_SIZE - 104857600, 104857600);
            }
        }
        int i11 = (int) c3;
        eu euVar = this.a;
        long j10 = i11;
        euVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        euVar.d = j10;
        s8[] s8VarArr = euVar.h;
        AnimatorSet[] animatorSetArr = euVar.n;
        int i12 = euVar.e;
        i10 = euVar.r.videosRow;
        if (i12 == i10) {
            euVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            boolean z10 = i11 > 2097152;
            if (z10 != s8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                s8VarArr[0].e(arrayList, z10);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new f91(euVar, 13));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.jo0
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        eu euVar = this.a;
        sb.append((Object) euVar.a.getText());
        sb.append(" ");
        sb.append((Object) euVar.b.getText());
        return sb.toString();
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ int j0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void B() {
    }
}
