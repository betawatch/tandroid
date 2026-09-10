package hi;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
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
import org.telegram.ui.Components.w70;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class w5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ g6 b;

    public /* synthetic */ w5(g6 g6Var, int i10) {
        this.a = i10;
        this.b = g6Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Set<String> languages;
        switch (this.a) {
            case 0:
                g6 g6Var = this.b;
                a aVar = g6Var.x;
                if (aVar != null && aVar.e) {
                    boolean z10 = !aVar.f;
                    aVar.f = z10;
                    ((CheckBoxBase) g6Var.e.b).f(-1, z10, true);
                    d6 d6Var = g6Var.y;
                    if (d6Var != null) {
                        a aVar2 = g6Var.x;
                        boolean z11 = aVar2.f;
                        z3 z3Var = ((h3) d6Var).a;
                        aVar2.f = z11;
                        k2 k2Var = z3Var.J3;
                        if (k2Var != null) {
                            k2Var.d();
                            z3Var.J3.h();
                            break;
                        }
                    }
                }
                break;
            default:
                g6 g6Var2 = this.b;
                d6 d6Var2 = g6Var2.y;
                if (d6Var2 != null) {
                    a aVar3 = g6Var2.x;
                    z3 z3Var2 = ((h3) d6Var2).a;
                    if (aVar3 != null && (aVar3.b instanceof TL_iv.pageBlockPreformatted) && (languages = CodeHighlighting.getLanguages()) != null) {
                        ArrayList arrayList = new ArrayList(languages);
                        Collections.sort(arrayList);
                        TL_iv.pageBlockPreformatted pageblockpreformatted = (TL_iv.pageBlockPreformatted) aVar3.b;
                        w70 a02 = z3Var2.h3.a0(view);
                        a02.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(3.0f), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.d6, z3Var2.g3)));
                        a02.Z = true;
                        a02.X = AndroidUtilities.dp(350.0f);
                        a02.i(new r2(z3Var2, aVar3, 25), LocaleController.getString(R.string.ArticleNone), TextUtils.isEmpty(pageblockpreformatted.language));
                        if (!TextUtils.isEmpty(pageblockpreformatted.language)) {
                            a02.i(null, MessageObject.TextLayoutBlock.capitalizeLanguage(pageblockpreformatted.language), true);
                        }
                        a02.k();
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            String str = (String) obj;
                            a02.i(new gg.a0((ViewGroup) z3Var2, (Object) aVar3, str, 7), MessageObject.TextLayoutBlock.capitalizeLanguage(str), TextUtils.equals(str, pageblockpreformatted.language));
                        }
                        a02.Z();
                        break;
                    }
                }
                break;
        }
    }
}
