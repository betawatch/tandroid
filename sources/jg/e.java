package jg;

import android.content.Context;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public class e extends d {
    public static final /* synthetic */ int s = 0;
    public int r;

    public e(Context context, g6 g6Var) {
        super(context, g6Var);
        this.d.setTypeface(AndroidUtilities.bold());
    }

    @Override // jg.d
    public boolean b() {
        return !(this instanceof f);
    }

    @Override // jg.d
    public void d() {
        this.c.setLayoutParams(c6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z4 = LocaleController.isRTL;
        this.d.setLayoutParams(c6.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 20.0f : 109.0f, 0.0f, z4 ? 109.0f : 20.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        this.e.setLayoutParams(c6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 109.0f, 0.0f, z10 ? 109.0f : 20.0f, 0.0f));
        this.f.setLayoutParams(c6.d(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.r;
    }
}
