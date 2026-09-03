package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.fu;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class c5 implements jo0 {
    public final /* synthetic */ fu a;

    public c5(fu fuVar) {
        this.a = fuVar;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void X(float f10, boolean z4) {
        float c3;
        int i10;
        if (f10 <= 0.25f) {
            c3 = w.c.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c3 = w.c.c(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                c3 = f12 <= 0.25f ? w.c.c(f12, 0.25f, 9.437184E7f, 10485760) : w.c.c(f12 - 0.25f, 0.25f, FileLoader.DEFAULT_MAX_FILE_SIZE - 104857600, 104857600);
            }
        }
        int i11 = (int) c3;
        fu fuVar = this.a;
        long j10 = i11;
        fuVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        fuVar.d = j10;
        s8[] s8VarArr = fuVar.h;
        AnimatorSet[] animatorSetArr = fuVar.n;
        int i12 = fuVar.e;
        i10 = fuVar.r.videosRow;
        if (i12 == i10) {
            fuVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
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
                animatorSetArr[0].addListener(new f91(fuVar, 13));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.jo0
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        fu fuVar = this.a;
        sb.append((Object) fuVar.a.getText());
        sb.append(" ");
        sb.append((Object) fuVar.b.getText());
        return sb.toString();
    }

    @Override // org.telegram.ui.Components.jo0
    public final /* synthetic */ int m0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.jo0
    public final void A() {
    }
}
