package ii;

import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.y70;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final /* synthetic */ class u5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ e6 b;

    public /* synthetic */ u5(e6 e6Var, int i10) {
        this.a = i10;
        this.b = e6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.a) {
            case 0:
                e6 e6Var = this.b;
                a aVar = e6Var.x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) e6Var.e.b).f(-1, z10, true);
                    b6 b6Var = e6Var.y;
                    if (b6Var != null) {
                        a aVar2 = e6Var.x;
                        boolean z11 = aVar2.f;
                        x3 x3Var = ((f3) b6Var).a;
                        aVar2.f = z11;
                        i2 i2Var = x3Var.J3;
                        if (i2Var != null) {
                            i2Var.d();
                            x3Var.J3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                e6 e6Var2 = this.b;
                b6 b6Var2 = e6Var2.y;
                if (b6Var2 != null) {
                    a aVar3 = e6Var2.x;
                    x3 x3Var2 = ((f3) b6Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        y70 F = x3Var2.h3.F(view);
                        F.W(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.d6, x3Var2.g3)));
                        F.Z = true;
                        F.X = AndroidUtilities.dp(350.0f);
                        F.i(new p2(x3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            F.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        F.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            F.i(new gg.t(x3Var2, aVar3, str, 17), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        F.Z();
                        break;
                    }
                }
                break;
        }
    }
}
