package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.hu;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class b5 implements eo0 {
    public final /* synthetic */ hu a;

    public b5(hu huVar) {
        this.a = huVar;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void X(float f7, boolean z10) {
        float e7;
        int i10;
        if (f7 <= 0.25f) {
            e7 = a4.a.e(f7, 0.25f, 536576.0f, 512000);
        } else {
            float f10 = f7 - 0.25f;
            if (f10 < 0.25f) {
                e7 = a4.a.e(f10, 0.25f, 9437184.0f, 1048576);
            } else {
                float f11 = f10 - 0.25f;
                e7 = f11 <= 0.25f ? a4.a.e(f11, 0.25f, 9.437184E7f, 10485760) : a4.a.e(f11 - 0.25f, 0.25f, FileLoader.DEFAULT_MAX_FILE_SIZE - 104857600, 104857600);
            }
        }
        int i11 = (int) e7;
        hu huVar = this.a;
        long j3 = i11;
        huVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j3)));
        huVar.d = j3;
        w8[] w8VarArr = huVar.h;
        AnimatorSet[] animatorSetArr = huVar.n;
        int i12 = huVar.e;
        i10 = huVar.r.videosRow;
        if (i12 == i10) {
            huVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j3)));
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
                animatorSetArr[0].addListener(new k61(huVar, 17));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        hu huVar = this.a;
        sb2.append((Object) huVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) huVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.eo0
    public final /* synthetic */ int l0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void B() {
    }
}
