package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.h31;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.ut;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g5 implements kp0 {
    public final /* synthetic */ ut a;

    public g5(ut utVar) {
        this.a = utVar;
    }

    @Override // org.telegram.ui.Components.kp0
    public final void U(float f7, boolean z10) {
        float c10;
        int i10;
        if (f7 <= 0.25f) {
            c10 = a1.g.c(f7, 0.25f, 536576.0f, 512000);
        } else {
            float f10 = f7 - 0.25f;
            if (f10 < 0.25f) {
                c10 = a1.g.c(f10, 0.25f, 9437184.0f, 1048576);
            } else {
                float f11 = f10 - 0.25f;
                c10 = f11 <= 0.25f ? a1.g.c(f11, 0.25f, 9.437184E7f, 10485760) : a1.g.c(f11 - 0.25f, 0.25f, FileLoader.DEFAULT_MAX_FILE_SIZE - 104857600, 104857600);
            }
        }
        int i11 = (int) c10;
        ut utVar = this.a;
        long j10 = i11;
        utVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        utVar.d = j10;
        a9[] a9VarArr = utVar.h;
        AnimatorSet[] animatorSetArr = utVar.n;
        int i12 = utVar.e;
        i10 = utVar.r.videosRow;
        if (i12 == i10) {
            utVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            boolean z11 = i11 > 2097152;
            if (z11 != a9VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                a9VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new h31(utVar, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.kp0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        ut utVar = this.a;
        sb2.append((Object) utVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) utVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.kp0
    public final /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.kp0
    public final void y() {
    }
}
