package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.f11;
import org.telegram.ui.Components.pn0;
import org.telegram.ui.yt;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z4 implements pn0 {
    public final /* synthetic */ yt a;

    public z4(yt ytVar) {
        this.a = ytVar;
    }

    @Override // org.telegram.ui.Components.pn0
    public final void P(float f10, boolean z10) {
        float c10;
        int i10;
        if (f10 <= 0.25f) {
            c10 = s3.c.c(f10, 0.25f, 536576.0f, 512000);
        } else {
            float f11 = f10 - 0.25f;
            if (f11 < 0.25f) {
                c10 = s3.c.c(f11, 0.25f, 9437184.0f, 1048576);
            } else {
                float f12 = f11 - 0.25f;
                c10 = f12 <= 0.25f ? s3.c.c(f12, 0.25f, 9.437184E7f, 10485760) : s3.c.c(f12 - 0.25f, 0.25f, FileLoader.DEFAULT_MAX_FILE_SIZE - 104857600, 104857600);
            }
        }
        int i11 = (int) c10;
        yt ytVar = this.a;
        long j10 = i11;
        ytVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        ytVar.d = j10;
        p8[] p8VarArr = ytVar.h;
        AnimatorSet[] animatorSetArr = ytVar.n;
        int i12 = ytVar.e;
        i10 = ytVar.r.videosRow;
        if (i12 == i10) {
            ytVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            boolean z11 = i11 > 2097152;
            if (z11 != p8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                p8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new f11(ytVar, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.pn0
    public final /* synthetic */ int a0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.pn0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        yt ytVar = this.a;
        sb2.append((Object) ytVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) ytVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.pn0
    public final void r() {
    }
}
