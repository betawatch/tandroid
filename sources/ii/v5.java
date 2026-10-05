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
import org.telegram.ui.Components.b80;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final /* synthetic */ class v5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ f6 b;

    public /* synthetic */ v5(f6 f6Var, int i10) {
        this.a = i10;
        this.b = f6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.a) {
            case 0:
                f6 f6Var = this.b;
                a aVar = f6Var.x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) f6Var.e.b).f(-1, z10, true);
                    c6 c6Var = f6Var.y;
                    if (c6Var != null) {
                        a aVar2 = f6Var.x;
                        boolean z11 = aVar2.f;
                        x3 x3Var = ((f3) c6Var).a;
                        aVar2.f = z11;
                        i2 i2Var = x3Var.Q3;
                        if (i2Var != null) {
                            i2Var.d();
                            x3Var.Q3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                f6 f6Var2 = this.b;
                c6 c6Var2 = f6Var2.y;
                if (c6Var2 != null) {
                    a aVar3 = f6Var2.x;
                    x3 x3Var2 = ((f3) c6Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        b80 f02 = x3Var2.o3.f0(view);
                        f02.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.d6, x3Var2.n3)));
                        f02.Z = true;
                        f02.X = AndroidUtilities.dp(350.0f);
                        f02.i(new p2(x3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            f02.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        f02.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            f02.i(new gg.t(x3Var2, aVar3, str, 17), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        f02.Z();
                        break;
                    }
                }
                break;
        }
    }
}
