package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.eo0;
import org.telegram.ui.Components.u81;
import org.telegram.ui.du;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class c5 implements eo0 {
    public final /* synthetic */ du a;

    public c5(du duVar) {
        this.a = duVar;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void X(float f7, boolean z10) {
        float e;
        int i10;
        if (f7 <= 0.25f) {
            e = a4.a.e(f7, 0.25f, 536576.0f, 512000);
        } else {
            float f10 = f7 - 0.25f;
            if (f10 < 0.25f) {
                e = a4.a.e(f10, 0.25f, 9437184.0f, 1048576);
            } else {
                float f11 = f10 - 0.25f;
                e = f11 <= 0.25f ? a4.a.e(f11, 0.25f, 9.437184E7f, 10485760) : a4.a.e(f11 - 0.25f, 0.25f, FileLoader.DEFAULT_MAX_FILE_SIZE - 104857600, 104857600);
            }
        }
        int i11 = (int) e;
        du duVar = this.a;
        long j3 = i11;
        duVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j3)));
        duVar.d = j3;
        x8[] x8VarArr = duVar.h;
        AnimatorSet[] animatorSetArr = duVar.n;
        int i12 = duVar.e;
        i10 = duVar.r.videosRow;
        if (i12 == i10) {
            duVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j3)));
            boolean z11 = i11 > 2097152;
            if (z11 != x8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                x8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new u81(duVar, 14));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.eo0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        du duVar = this.a;
        sb2.append((Object) duVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) duVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.eo0
    public final /* synthetic */ int m0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.eo0
    public final void B() {
    }
}
