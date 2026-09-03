package kh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class x4 extends h51 {
    public static final /* synthetic */ int a = 0;

    static {
        h51.setup(new x4());
    }

    @Override // org.telegram.ui.Components.h51
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        y4 y4Var = (y4) view;
        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) i51Var.G;
        int i10 = i51Var.z;
        String str = (String) i51Var.l;
        boolean z10 = i51Var.e;
        f6 f6Var = y4Var.C;
        jj0 jj0Var = y4Var.c;
        w4 w4Var = y4Var.K;
        if (w4Var == null || y4Var.J != stargiftattributepattern.document.id) {
            y4Var.J = stargiftattributepattern.document.id;
            if (w4Var != null) {
                w4Var.o(jj0Var);
            }
            w4 w4Var2 = new w4(3, y4Var.I, stargiftattributepattern.document);
            y4Var.K = w4Var2;
            w4Var2.setColorFilter(new PorterDuffColorFilter(j6.v0(j6.E8, f6Var), PorterDuff.Mode.SRC_IN));
        }
        if (jj0Var.isAttachedToWindow()) {
            y4Var.K.a(jj0Var);
        }
        CharSequence charSequence = stargiftattributepattern.name;
        if (!TextUtils.isEmpty(str)) {
            charSequence = AndroidUtilities.highlightText(charSequence, str, f6Var);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequence = spannableStringBuilder;
        }
        y4Var.g(charSequence, 0, y4Var.K);
        y4Var.setChecked(z10);
    }

    @Override // org.telegram.ui.Components.h51
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, f6 f6Var) {
        return new y4(context, i10, f6Var);
    }
}
