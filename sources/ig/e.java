package ig;

import android.content.Context;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public class e extends d {
    public static final /* synthetic */ int s = 0;
    public int r;

    public e(Context context, f6 f6Var) {
        super(context, f6Var);
        this.d.setTypeface(AndroidUtilities.bold());
    }

    @Override // ig.d
    public boolean b() {
        return !(this instanceof f);
    }

    @Override // ig.d
    public void d() {
        this.c.setLayoutParams(b6.d(40, 40.0f, (LocaleController.isRTL ? 5 : 3) | 16, 57.0f, 0.0f, 57.0f, 0.0f));
        boolean z4 = LocaleController.isRTL;
        this.d.setLayoutParams(b6.d(-1, -2.0f, (z4 ? 5 : 3) | 16, z4 ? 20.0f : 109.0f, 0.0f, z4 ? 109.0f : 20.0f, 0.0f));
        boolean z10 = LocaleController.isRTL;
        this.e.setLayoutParams(b6.d(-1, -2.0f, (z10 ? 5 : 3) | 16, z10 ? 20.0f : 109.0f, 0.0f, z10 ? 109.0f : 20.0f, 0.0f));
        this.f.setLayoutParams(b6.d(22, 22.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 15.0f, 0.0f));
    }

    public int getSelectedType() {
        return this.r;
    }
}
