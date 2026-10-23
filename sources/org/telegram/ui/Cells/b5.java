package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cp0;
import org.telegram.ui.Components.p31;
import org.telegram.ui.tt;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class b5 implements cp0 {
    public final /* synthetic */ tt a;

    public b5(tt ttVar) {
        this.a = ttVar;
    }

    @Override // org.telegram.ui.Components.cp0
    public final void L(float f7, boolean z10) {
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
        tt ttVar = this.a;
        long j10 = i11;
        ttVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        ttVar.d = j10;
        v8[] v8VarArr = ttVar.h;
        AnimatorSet[] animatorSetArr = ttVar.n;
        int i12 = ttVar.e;
        i10 = ttVar.r.videosRow;
        if (i12 == i10) {
            ttVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
            boolean z11 = i11 > 2097152;
            if (z11 != v8VarArr[0].isEnabled()) {
                ArrayList arrayList = new ArrayList();
                v8VarArr[0].e(arrayList, z11);
                AnimatorSet animatorSet = animatorSetArr[0];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[0] = null;
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSetArr[0] = animatorSet2;
                animatorSet2.playTogether(arrayList);
                animatorSetArr[0].addListener(new p31(ttVar, 20));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.cp0
    public final /* synthetic */ int Y() {
        return 0;
    }

    @Override // org.telegram.ui.Components.cp0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        tt ttVar = this.a;
        sb2.append((Object) ttVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) ttVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.cp0
    public final void v() {
    }
}
