package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.jp0;
import org.telegram.ui.fu;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class c5 implements jp0 {
    public final /* synthetic */ fu a;

    public c5(fu fuVar) {
        this.a = fuVar;
    }

    @Override // org.telegram.ui.Components.jp0
    public final void X(float f7, boolean z10) {
        float e7;
        int i10;
        if (f7 <= 0.25f) {
            e7 = a1.g.e(f7, 0.25f, 536576.0f, 512000);
        } else {
            float f10 = f7 - 0.25f;
            if (f10 < 0.25f) {
                e7 = a1.g.e(f10, 0.25f, 9437184.0f, 1048576);
            } else {
                float f11 = f10 - 0.25f;
                e7 = f11 <= 0.25f ? a1.g.e(f11, 0.25f, 9.437184E7f, 10485760) : a1.g.e(f11 - 0.25f, 0.25f, FileLoader.DEFAULT_MAX_FILE_SIZE - 104857600, 104857600);
            }
        }
        int i11 = (int) e7;
        fu fuVar = this.a;
        long j3 = i11;
        fuVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j3)));
        fuVar.d = j3;
        w8[] w8VarArr = fuVar.h;
        AnimatorSet[] animatorSetArr = fuVar.n;
        int i12 = fuVar.e;
        i10 = fuVar.r.videosRow;
        if (i12 == i10) {
            fuVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j3)));
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
                animatorSetArr[0].addListener(new i91(fuVar, 15));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.jp0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        fu fuVar = this.a;
        sb2.append((Object) fuVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) fuVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.jp0
    public final /* synthetic */ int i0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.jp0
    public final void z() {
    }
}
