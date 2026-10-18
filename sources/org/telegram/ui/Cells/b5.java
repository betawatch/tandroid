package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bp0;
import org.telegram.ui.Components.n31;
import org.telegram.ui.vt;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class b5 implements bp0 {
    public final /* synthetic */ vt a;

    public b5(vt vtVar) {
        this.a = vtVar;
    }

    @Override // org.telegram.ui.Components.bp0
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
        vt vtVar = this.a;
        long j10 = i11;
        vtVar.b.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j10)));
        vtVar.d = j10;
        v8[] v8VarArr = vtVar.h;
        AnimatorSet[] animatorSetArr = vtVar.n;
        int i12 = vtVar.e;
        i10 = vtVar.r.videosRow;
        if (i12 == i10) {
            vtVar.f.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j10)));
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
                animatorSetArr[0].addListener(new n31(vtVar, 20));
                animatorSetArr[0].setDuration(150L);
                animatorSetArr[0].start();
            }
        }
    }

    @Override // org.telegram.ui.Components.bp0
    public final /* synthetic */ int Y() {
        return 0;
    }

    @Override // org.telegram.ui.Components.bp0
    public final CharSequence getContentDescription() {
        StringBuilder sb2 = new StringBuilder();
        vt vtVar = this.a;
        sb2.append((Object) vtVar.a.getText());
        sb2.append(" ");
        sb2.append((Object) vtVar.b.getText());
        return sb2.toString();
    }

    @Override // org.telegram.ui.Components.bp0
    public final void v() {
    }
}
