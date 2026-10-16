package ji;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.l80;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final /* synthetic */ class z5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ i6 b;

    public /* synthetic */ z5(i6 i6Var, int i10) {
        this.a = i10;
        this.b = i6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set set;
        switch (this.a) {
            case 0:
                i6 i6Var = this.b;
                a aVar = i6Var.x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) i6Var.e.b).f(-1, z10, true);
                    f6 f6Var = i6Var.y;
                    if (f6Var != null) {
                        a aVar2 = i6Var.x;
                        boolean z11 = aVar2.f;
                        x3 x3Var = ((f3) f6Var).a;
                        aVar2.f = z11;
                        h2 h2Var = x3Var.H3;
                        if (h2Var != null) {
                            h2Var.d();
                            x3Var.H3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                i6 i6Var2 = this.b;
                f6 f6Var2 = i6Var2.y;
                if (f6Var2 != null) {
                    a aVar3 = i6Var2.x;
                    x3 x3Var2 = ((f3) f6Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (set = li.k.a.x) != null) {
                        ArrayList arrayList = new ArrayList(set);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        l80 R = x3Var2.f3.R(view);
                        R.W(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.d6, x3Var2.e3)));
                        R.Z = true;
                        R.X = AndroidUtilities.dp(350.0f);
                        R.i(new o2(x3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            R.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        R.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            R.i(new hg.t(x3Var2, aVar3, str, 18), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        R.Z();
                        break;
                    }
                }
                break;
        }
    }
}
