package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.io0;
import org.telegram.ui.gu;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class b5 implements io0 {
    public final /* synthetic */ gu a;

    public b5(gu guVar) {
        this.a = guVar;
    }

    @Override // org.telegram.ui.Components.io0
    public final void Y(float f10, boolean z4) {
        float c3;
        int i10;
        if (f10 <= 0.25f) {
            c3 = vh.w2.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c3 = vh.w2.c(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                c3 = f12 <= 0.25f ? vh.w2.c(f12, 0.25f, 9.437184E7f, 10485760) : vh.w2.c(f12 - 0.25f, 0.25f, FileLoader.DEFAULT_MAX_FILE_SIZE - 104857600, 104857600);
            }
        }
        int i11 = (int) c3;
        gu guVar = this.a;
        long j10 = i11;
        guVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        guVar.d = j10;
        r8[] r8VarArr = guVar.h;
        AnimatorSet[] animatorSetArr = guVar.n;
        int i12 = guVar.e;
        i10 = guVar.r.videosRow;
        if (i12 == i10) {
            guVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            boolean z10 = i11 > 2097152;
            if (z10 != r8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                r8VarArr[0].e(arrayList, z10);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new f91(guVar, 13));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.io0
    public final CharSequence getContentDescription() {
        StringBuilder sb = new StringBuilder();
        gu guVar = this.a;
        sb.append((Object) guVar.a.getText());
        sb.append(" ");
        sb.append((Object) guVar.b.getText());
        return sb.toString();
    }

    @Override // org.telegram.ui.Components.io0
    public final /* synthetic */ int j0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.io0
    public final void B() {
    }
}
