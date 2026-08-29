package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.p11;
import org.telegram.ui.Components.zn0;
import org.telegram.ui.wt;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class a5 implements zn0 {
    public final /* synthetic */ wt a;

    public a5(wt wtVar) {
        this.a = wtVar;
    }

    @Override // org.telegram.ui.Components.zn0
    public final void W(float f9, boolean z10) {
        float c3;
        int i10;
        if (f9 <= 0.25f) {
            c3 = u3.c.c(f9, 0.25f, 536576.0f, 512000);
        } else {
            float f10 = f9 - 0.25f;
            if (f10 < 0.25f) {
                c3 = u3.c.c(f10, 0.25f, 9437184.0f, 1048576);
            } else {
                float f11 = f10 - 0.25f;
                c3 = f11 <= 0.25f ? u3.c.c(f11, 0.25f, 9.437184E7f, 10485760) : u3.c.c(f11 - 0.25f, 0.25f, FileLoader.DEFAULT_MAX_FILE_SIZE - 104857600, 104857600);
            }
        }
        int i11 = (int) c3;
        wt wtVar = this.a;
        long j10 = i11;
        wtVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        wtVar.d = j10;
        q8[] q8VarArr = wtVar.h;
        AnimatorSet[] animatorSetArr = wtVar.n;
        int i12 = wtVar.e;
        i10 = wtVar.r.videosRow;
        if (i12 == i10) {
            wtVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            boolean z11 = i11 > 2097152;
            if (z11 != q8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                q8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new p11(wtVar, 22));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.zn0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        wt wtVar = this.a;
        sb2.append((Object) wtVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) wtVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.zn0
    public final /* synthetic */ int k0() {
        return 0;
    }

    @Override // org.telegram.ui.Components.zn0
    public final void v() {
    }
}
